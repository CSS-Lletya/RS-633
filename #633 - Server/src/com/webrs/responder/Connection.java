package com.webrs.responder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Connection {
	
	/**
	 * Capacity of read buffer.
	 */
	public static final int READ_BUFFER_CAPACITY = 10000;
	/**
	 * Capacity of write buffer.
	 */
	public static final int WRITE_BUFFER_CAPACITY = 10000;

	/**
	 * Contains io read thread.
	 */
	private Thread ioReadThread;
	/**
	 * Contains io write thread.
	 */
	private Thread ioWriteThread;
	/**
	 * Whether socket was connected.
	 */
	private volatile boolean connected;
	/**
	 * Contains socket.
	 */
	private Socket socket;
	/**
	 * Contains io read lock object.
	 */
	private Object ioReadLock;
	/**
	 * Contains io write lock object.
	 */
	private Object ioWriteLock;
	/**
	 * Contains read buffer.
	 */
	private byte[] readBuffer;
	/**
	 * Contains read buffer length.
	 */
	private int readBufferLength;
	/**
	 * Contains write buffer.
	 */
	private byte[] writeBuffer;
	/**
	 * Contains write buffer length.
	 */
	private int writeBufferLength;
	
	public Connection() {
		this.ioReadLock = new Object();
		this.ioWriteLock = new Object();
		this.readBuffer = new byte[READ_BUFFER_CAPACITY];
		this.writeBuffer = new byte[WRITE_BUFFER_CAPACITY];
	}
	
	public boolean isDead() {
		return (ioReadThread != null && !ioReadThread.isAlive()) || (ioWriteThread != null && !ioWriteThread.isAlive()); 
	}
	
	public boolean isConnected() {
		return socket != null && socket.isConnected() && !socket.isClosed() && connected;
	}
	
	public void connect(final Socket sock) {
		if (socket != null)
			throw new RuntimeException("Use disconnect() to close existing connection.");
		ioReadThread = new Thread("connectionioread-" + hashCode()) {
			@Override
			public void run() {
				try {
					socket = sock;
					connected = socket.isConnected();				
					
					byte[] personalBuffer = new byte[READ_BUFFER_CAPACITY];
					InputStream str = socket.getInputStream();
					while (true) {
						int space = 0;
						synchronized (ioReadLock) {
							space = readBuffer.length - readBufferLength;
						}
						
						if (space > 0) {
							int count = str.read(personalBuffer, 0, space);
							if (count == -1)
								throw new IOException("EOS");
							if (count > 0) {
								synchronized (ioReadLock) {
									System.arraycopy(personalBuffer, 0, readBuffer, readBufferLength, count);
									readBufferLength += count;
								}
							}
						}
						

						
						try {
							Thread.sleep(20);
						}
						catch (Throwable t) {
							if (t instanceof ThreadDeath)
								return;
						}
					}
				}
				catch (IOException e) {
					//System.err.println(e.getMessage());
				}
			}
		};
		ioReadThread.start();
		
		ioWriteThread = new Thread("connectioniowrite-" + hashCode()) {
			@Override
			public void run() {
				try {
					while (!connected) {
						try { Thread.sleep(20); }
						catch (InterruptedException e) { }
					}
					
					byte[] personalBuffer = new byte[WRITE_BUFFER_CAPACITY];
					OutputStream str = socket.getOutputStream();
					while (true) {
						int length = 0;
						synchronized (ioWriteLock) {
							length = writeBufferLength;
							for (int i = 0; i < writeBufferLength; i++)
								personalBuffer[i] = writeBuffer[i];
							writeBufferLength = 0;
						}
						
						if (length > 0) {
							str.write(personalBuffer, 0, length);
							str.flush();
						}
						
						
						try { Thread.sleep(20); }
						catch (InterruptedException e) { }
					}
				}
				catch (IOException e) {
				}
			}
		};
		ioWriteThread.start();
	}
	
	
	@SuppressWarnings("deprecation")
	public void disconnect() {
		try {
			if (ioReadThread != null) {
				ioReadThread.stop();
				ioReadThread = null;
			}
			if (ioWriteThread != null) {
				ioWriteThread.stop();
				ioWriteThread = null;
			}
			if (socket != null) {
				socket.close();
				socket = null;
			}
			synchronized (ioReadLock) {
				readBufferLength = 0;
			}
			synchronized (ioWriteLock) {
				writeBufferLength = 0;
			}
		}
		catch (Throwable t) {
		}
	}
	
	public int getBufferedAmount() {
		synchronized (ioReadLock) {
			return readBufferLength;
		}
	}
	
	public void discardBuffer() {
		synchronized (ioReadLock) {
			readBufferLength = 0;
		}
	}
	
	public int discardBuffer(int length) {
		synchronized (ioReadLock) {
			int count = Math.min(length, readBufferLength);
			for (int i = count, a = 0; i < readBufferLength; i++)
				readBuffer[a++] = readBuffer[i];
			readBufferLength -= count;
			return count;
		}
	}
	
	public int peek(byte[] b, int offset, int length) {
		synchronized (ioReadLock) {
			int count = Math.min(length, readBufferLength);
			for (int i = 0; i < count; i++)
				b[offset + i] = readBuffer[i];
			return count;
		}
	}
	
	public int read(byte[] b, int offset, int length) {
		synchronized (ioReadLock) {
			int count = Math.min(length, readBufferLength);
			for (int i = 0; i < count; i++)
				b[offset + i] = readBuffer[i];
			for (int i = count, a = 0; i < readBufferLength; i++)
				readBuffer[a++] = readBuffer[i];
			readBufferLength -= count;
			return count;
		}
	}
	
	@SuppressWarnings("deprecation")
	public void write(byte[] b, int offset, int length) {
		synchronized (ioWriteLock) {
			int capacity = writeBuffer.length - writeBufferLength;
			if (length > capacity) {
				ioWriteThread.stop(new IOException("Buffer overflow!"));
				return;
			}
			
			for (int i = 0; i < length; i++)
				writeBuffer[writeBufferLength++] = b[offset + i];
		}
	}
	
	public Socket getSocket() {
		return socket;
	}
}
