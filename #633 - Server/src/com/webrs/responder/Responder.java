package com.webrs.responder;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Responder {
    
    /**
     * Contains socket.
     */
    private static ServerSocket socket;
    /**
     * Whether we shutted down yet.
     */
    private static boolean shutdown;
    
    /**
     * Contains acceptor thread.
     */
    private static Thread acceptor;
    /**
     * Contains processor thread.
     */
    private static Thread processor;
    /**
     * Contains clients.
     */
    private static List<Client> clients;
    

    /**
     * Start's up web responder.
     */
    public static void init() throws Throwable {
	clients = new ArrayList<Client>();
	socket = new ServerSocket();
	socket.bind(new InetSocketAddress("0.0.0.0", 43599));
	
	acceptor = new Thread("web_acceptor") {
	    @Override
	    public void run() {
		try {
		    while (!shutdown) {
			Socket s = socket.accept();
			if (s == null)
			    break;
    		    	Connection connection = new Connection();
    		    	connection.connect(s);
    		    	
    		    	synchronized (clients) {
    		    	    clients.add(new Client(connection));
    		    	}
		    }
		}
		catch (Throwable t) {  
		}
	    }
	};
	
	processor = new Thread() {
	    @Override
	    public void run() {
		final List<Client> local = new ArrayList<Client>();
		
		try {
		    while (!shutdown) {
    		    	synchronized (clients) {
    		    	    local.clear();
    		    	    local.addAll(clients);
    		    	}
    		    	
    		    	for (Client client : local) {
    		    	    client.process();	
    		    	    if (!client.isAlive()) {
    		    		synchronized (clients) {
    		    		    clients.remove(client);
    		    		}
    		    	    }
    		    	}
    		    	
    		    	try {
    		    	    Thread.sleep(20);
    		    	}
    		    	catch (Throwable t) {
    		    	}
		    }
		}
		catch (Throwable t) { 
		}
	    }
	};
	
	acceptor.setPriority(Thread.MIN_PRIORITY);
	processor.setPriority(Thread.MIN_PRIORITY);
	
	acceptor.start();
	processor.start();
	

    }
    
    
    /**
     * Shut's down web responder.
     */
    public static void shutdown() {
	shutdown = true;
	try {
	    socket.close();
	}
	catch (Throwable t) {
	}
	
	for (;;) {
	    try {
		acceptor.join();
		break;
	    }
	    catch (Throwable t) { 
	    }
	}
	
	for (;;) {
	    try {
		processor.join();
		break;
	    }
	    catch (Throwable t) { 
	    }
	}
	
    }

}
