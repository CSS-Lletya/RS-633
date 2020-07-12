/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class Class242 implements Runnable {
	static int anInt3278;
	private int anInt3279 = 0;
	static int anInt3280;
	private byte[] aByteArray3281;
	static int[] anIntArray3282 = new int[13];
	private Thread aThread3283;
	private int anInt3284 = 0;
	static int anInt3285;
	static int anInt3286;
	static Class203[] aClass203Array3287;
	static int anInt3288;
	static boolean aBool3289 = false;
	static int[] anIntArray3290;
	private OutputStream anOutputStream3291;
	private int anInt3292;
	private IOException anIOException3293;

	public final void run() {
		try {
			anInt3280++;
			for (;;) {
				int i;
				synchronized (this) {
					for (;;) {
						if (anIOException3293 != null)
							return;
						if (anInt3284 < anInt3279)
							i = anInt3292 + -anInt3279 + anInt3284;
						else
							i = -anInt3279 + anInt3284;
						if ((i ^ 0xffffffff) < -1)
							break;
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					if (anInt3292 < anInt3279 - -i) {
						int i_0_ = -anInt3279 + anInt3292;
						anOutputStream3291.write(aByteArray3281, anInt3279,
								i_0_);
						anOutputStream3291.write(aByteArray3281, 0, -i_0_ + i);
					} else
						anOutputStream3291.write(aByteArray3281, anInt3279, i);
				} catch (IOException ioexception) {
					synchronized (this) {
						anIOException3293 = ioexception;
						break;
					}
				}
				synchronized (this) {
					anInt3279 = (i + anInt3279) % anInt3292;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mw.run(" + ')');
		}
	}

	public static void method1527(byte i) {
		try {
			if (i < 75)
				aBool3289 = false;
			aClass203Array3287 = null;
			anIntArray3282 = null;
			anIntArray3290 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mw.B(" + i + ')');
		}
	}

	final void method1528(int i) {
		try {
			if (i != 19602)
				method1528(-122);
			synchronized (this) {
				if (anIOException3293 == null)
					anIOException3293 = new IOException("");
				this.notifyAll();
			}
			anInt3278++;
			try {
				aThread3283.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mw.C(" + i + ')');
		}
	}

	final void method1529(int i) {
		try {
			if (i != -1)
				anOutputStream3291 = null;
			anOutputStream3291 = new OutputStream_Sub1();
			anInt3288++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mw.E(" + i + ')');
		}
	}

	static final boolean method1530(int i, int i_1_, int i_2_) {
		try {
			anInt3286++;
			if (i != -1)
				return false;
			if (!(Class332.method2003(i_2_, i_1_, false) | (0x800 & i_1_ ^ 0xffffffff) != -1)
					&& !Class46.method403(i_2_, i_1_, i ^ ~0x37))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mw.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method1531(int i, int i_3_, byte[] is, int i_4_)
			throws IOException {
		try {
			anInt3285++;
			if ((i_4_ ^ 0xffffffff) > i_3_ || (i ^ 0xffffffff) > -1
					|| is.length < i - -i_4_)
				throw new IOException();
			synchronized (this) {
				if (anIOException3293 != null)
					throw new IOException(anIOException3293.toString());
				int i_5_;
				if ((anInt3279 ^ 0xffffffff) < (anInt3284 ^ 0xffffffff))
					i_5_ = anInt3279 + (-anInt3284 - 1);
				else
					i_5_ = -1 + (anInt3292 + -anInt3284) + anInt3279;
				if ((i_4_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
					throw new IOException("");
				if (anInt3292 < anInt3284 + i_4_) {
					int i_6_ = -anInt3284 + anInt3292;
					Class311.method1898(is, i, aByteArray3281, anInt3284, i_6_);
					Class311.method1898(is, i_6_ + i, aByteArray3281, 0, i_4_
							+ -i_6_);
				} else
					Class311.method1898(is, i, aByteArray3281, anInt3284, i_4_);
				anInt3284 = (i_4_ + anInt3284) % anInt3292;
				this.notifyAll();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("mw.D(" + i + ',' + i_3_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_4_ + ')'));
		}
	}

	Class242(OutputStream outputstream, int i) {
		try {
			anOutputStream3291 = outputstream;
			anInt3292 = i + 1;
			aByteArray3281 = new byte[anInt3292];
			aThread3283 = new Thread(this);
			aThread3283.setDaemon(true);
			aThread3283.start();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("mw.<init>(" + (outputstream != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}
}
