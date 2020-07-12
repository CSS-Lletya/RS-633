/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class Class309 implements Runnable {
	private int anInt4130;
	static int anInt4131;
	static Class248[] aClass248Array4132;
	static int anInt4133;
	static int anInt4134;
	private IOException anIOException4135;
	static int anInt4136;
	private int anInt4137 = 0;
	static int anInt4138;
	private InputStream anInputStream4139;
	static int anInt4140;
	private byte[] aByteArray4141;
	static int anInt4142;
	private Thread aThread4143;
	static long aLong4144 = 0L;
	private int anInt4145;

	static final void method1887(boolean bool) {
		try {
			if (bool != false)
				method1892(-98, (byte) 121, -38);
			anInt4140++;
			if (Class207.aFileOutputStream2789 != null) {
				try {
					Class207.aFileOutputStream2789.close();
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			Class207.aFileOutputStream2789 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.F(" + bool + ')');
		}
	}

	final void method1888(boolean bool) {
		try {
			if (bool != true)
				method1887(true);
			synchronized (this) {
				if (anIOException4135 == null)
					anIOException4135 = new IOException("");
				this.notifyAll();
			}
			anInt4142++;
			try {
				aThread4143.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.D(" + bool + ')');
		}
	}

	public final void run() {
		try {
			anInt4131++;
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (anIOException4135 != null)
							return;
						if (anInt4130 != 0) {
							if (anInt4130 >= anInt4137)
								i = anInt4130 + (-anInt4137 - 1);
							else
								i = anInt4145 + -anInt4137;
						} else
							i = -1 + (-anInt4137 + anInt4145);
						if (i > 0)
							break;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				int i_0_;
				try {
					i_0_ = anInputStream4139.read(aByteArray4141, anInt4137, i);
					if ((i_0_ ^ 0xffffffff) == 0)
						throw new EOFException();
				} catch (IOException ioexception) {
					synchronized (this) {
						anIOException4135 = ioexception;
						break;
					}
				}
				synchronized (this) {
					anInt4137 = (anInt4137 - -i_0_) % anInt4145;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.run(" + ')');
		}
	}

	final boolean method1889(int i, byte i_1_) throws IOException {
		try {
			anInt4133++;
			if (i_1_ != 64)
				method1893(121);
			if ((i ^ 0xffffffff) >= -1 || anInt4145 <= i)
				throw new IOException();
			synchronized (this) {
				int i_2_;
				do {
					if ((anInt4137 ^ 0xffffffff) > (anInt4130 ^ 0xffffffff)) {
						i_2_ = anInt4137 + -anInt4130 + anInt4145;
						if (!client.aBool10531)
							break;
					}
					i_2_ = -anInt4130 + anInt4137;
				} while (false);
				if (i_2_ < i) {
					if (anIOException4135 != null)
						throw new IOException(anIOException4135.toString());
					return false;
				}
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.A(" + i + ','
					+ i_1_ + ')');
		}
	}

	final int method1890(int i, byte[] is, int i_3_, int i_4_)
			throws IOException {
		try {
			anInt4134++;
			if ((i ^ 0xffffffff) > -1 || i_4_ < 0 || i_4_ + i > is.length)
				throw new IOException();
			synchronized (this) {
				int i_5_;
				if ((anInt4130 ^ 0xffffffff) >= (anInt4137 ^ 0xffffffff))
					i_5_ = -anInt4130 + anInt4137;
				else
					i_5_ = -anInt4130 + (anInt4145 + anInt4137);
				if ((i_5_ ^ 0xffffffff) > (i ^ 0xffffffff))
					i = i_5_;
				if (i == 0 && anIOException4135 != null)
					throw new IOException(anIOException4135.toString());
				if (i_3_ != -19518)
					return 9;
				if ((anInt4130 + i ^ 0xffffffff) < (anInt4145 ^ 0xffffffff)) {
					int i_6_ = -anInt4130 + anInt4145;
					Class311.method1898(aByteArray4141, anInt4130, is, i_4_,
							i_6_);
					Class311.method1898(aByteArray4141, 0, is, i_4_ + i_6_,
							-i_6_ + i);
				} else
					Class311.method1898(aByteArray4141, anInt4130, is, i_4_, i);
				anInt4130 = (i + anInt4130) % anInt4145;
				this.notifyAll();
				return i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("sb.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method1891(byte i) {
		try {
			if (i != 48)
				method1888(true);
			anInt4136++;
			anInputStream4139 = new InputStream_Sub2();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.E(" + i + ')');
		}
	}

	static final boolean method1892(int i, byte i_7_, int i_8_) {
		try {
			anInt4138++;
			if (i_7_ > -120)
				return false;
			if (!(Class376_Sub7_Sub4.method3764(true, i, i_8_) | (0x60000 & i_8_ ^ 0xffffffff) != -1)
					&& !Class83.method572(24121, i, i_8_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sb.C(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	public static void method1893(int i) {
		try {
			if (i != 0)
				aClass248Array4132 = null;
			aClass248Array4132 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sb.G(" + i + ')');
		}
	}

	Class309(InputStream inputstream, int i) {
		anInt4130 = 0;
		try {
			anInputStream4139 = inputstream;
			anInt4145 = 1 + i;
			aByteArray4141 = new byte[anInt4145];
			aThread4143 = new Thread(this);
			aThread4143.setDaemon(true);
			aThread4143.start();
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("sb.<init>("
							+ (inputstream != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}
}
