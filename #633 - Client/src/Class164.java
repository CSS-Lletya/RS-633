/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

final class Class164 implements Runnable {
	static int anInt2121;
	static int anInt2122;
	static int anInt2123;
	static int anInt2124;
	private Class84 aClass84_2125 = new Class84();
	private Thread aThread2126;
	static int anInt2127;
	static OutgoingPacket aClass370_2128 = new OutgoingPacket(37, 7);
	static int anInt2129;
	static int anInt2130;
	private static char[] aCharArray2131 = new char[64];
	static float aFloat2132;
	static int anInt2133;

	private final void method1087(byte i, Class11 class11) {
		do {
			try {
				synchronized (aClass84_2125) {
					aClass84_2125.method589((byte) -13, class11);
					aClass84_2125.notify();
				}
				anInt2129++;
				if (i <= -38)
					break;
				aClass84_2125 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hb.E(" + i + ','
						+ (class11 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1088(byte i) {
		try {
			anInt2127++;
			if (aThread2126 != null) {
				method1087((byte) -116, new Class11());
				if (i > 28) {
					try {
						aThread2126.join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					aThread2126 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.C(" + i + ')');
		}
	}

	static final void method1089(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		try {
			anInt2130++;
			if (i_2_ == 63) {
				int i_5_ = Class244.method1540(i_3_, Class292.anInt3962, false,
						Class351.anInt4618);
				int i_6_ = Class244.method1540(i_4_, Class292.anInt3962, false,
						Class351.anInt4618);
				int i_7_ = Class244.method1540(i_1_, Class26.anInt340, false,
						Class11_Sub45_Sub1_Sub2.anInt9880);
				int i_8_ = Class244.method1540(i_0_, Class26.anInt340, false,
						Class11_Sub45_Sub1_Sub2.anInt9880);
				for (int i_9_ = i_5_; i_6_ >= i_9_; i_9_++)
					Class11_Sub2_Sub32_Sub1.method3883(i_7_,
							(Class297.anIntArrayArray4026[i_9_]), (byte) 49, i,
							i_8_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("hb.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public final void run() {
		try {
			anInt2122++;
			for (;;) {
				Class11_Sub31 class11_sub31;
				synchronized (aClass84_2125) {
					Class11 class11;
					for (class11 = aClass84_2125.method581((byte) -16); class11 == null; class11 = aClass84_2125
							.method581((byte) -16)) {
						try {
							aClass84_2125.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					if (!(class11 instanceof Class11_Sub31))
						break;
					class11_sub31 = (Class11_Sub31) class11;
				}
				int i;
				try {
					byte[] is = InetAddress.getByName(
							((Class11_Sub31) class11_sub31).aString6701)
							.getAddress();
					i = jagmisc.ping(is[0], is[1], is[2], is[3], 1000L);
				} catch (Throwable throwable) {
					i = 1000;
				}
				((Class11_Sub31) class11_sub31).anInt6700 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.run(" + ')');
		}
	}

	static final void method1090(int i) {
		try {
			if (i == 52) {
				for (int i_10_ = 0; Class23.anInt249 > i_10_; i_10_++) {
					int i_11_ = Class11_Sub52.anIntArray8054[i_10_];
					Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26, (long) i_11_));
					if (class11_sub25 != null) {
						Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
						Class119.method778(
								-18081,
								class376_sub7_sub5_sub5_sub2,
								((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975);
					}
				}
				anInt2124++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.F(" + i + ')');
		}
	}

	static final String method1091(Class11_Sub45_Sub5 class11_sub45_sub5, int i) {
		try {
			if (i > -117)
				return null;
			anInt2123++;
			if (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8764 == null
					|| ((Class11_Sub45_Sub5) class11_sub45_sub5).aString8764
							.length() == 0) {
				if ((((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767 != null)
						&& (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767
								.length() ^ 0xffffffff) < -1)
					return ((((Class11_Sub45_Sub5) class11_sub45_sub5).aString8756)
							+ (Class26.aClass26_308.method217((byte) 86,
									Class11_Sub45_Sub1_Sub2.anInt9884)) + (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767));
				return ((Class11_Sub45_Sub5) class11_sub45_sub5).aString8756;
			}
			if (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767 == null
					|| (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767
							.length() ^ 0xffffffff) >= -1)
				return (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8756
						+ (Class26.aClass26_308.method217((byte) 88,
								Class11_Sub45_Sub1_Sub2.anInt9884)) + (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8764));
			return (((Class11_Sub45_Sub5) class11_sub45_sub5).aString8756
					+ Class26.aClass26_308.method217((byte) 123,
							(Class11_Sub45_Sub1_Sub2.anInt9884))
					+ ((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767
					+ Class26.aClass26_308.method217((byte) 95,
							(Class11_Sub45_Sub1_Sub2.anInt9884)) + ((Class11_Sub45_Sub5) class11_sub45_sub5).aString8764);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.D("
					+ (class11_sub45_sub5 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	public static void method1092(int i) {
		try {
			aCharArray2131 = null;
			if (i <= -119)
				aClass370_2128 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.G(" + i + ')');
		}
	}

	final Class11_Sub31 method1093(String string, byte i) {
		try {
			anInt2121++;
			if (aThread2126 == null)
				throw new IllegalStateException("");
			if (string == null)
				throw new IllegalArgumentException("");
			Class11_Sub31 class11_sub31 = new Class11_Sub31(string);
			if (i != 54)
				run();
			method1087((byte) -70, class11_sub31);
			return class11_sub31;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.A("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class164() {
		try {
			aThread2126 = new Thread(this);
			aThread2126.setDaemon(true);
			aThread2126.start();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hb.<init>(" + ')');
		}
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -27; i++)
			aCharArray2131[i] = (char) (65 + i);
		for (int i = 26; i < 52; i++)
			aCharArray2131[i] = (char) (97 + i - 26);
		for (int i = 52; i < 62; i++)
			aCharArray2131[i] = (char) (-52 + (i + 48));
		aCharArray2131[62] = '+';
		aCharArray2131[63] = '/';
		anInt2133 = 0;
	}
}
