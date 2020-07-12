/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class198 {
	private Class146 aClass146_2672;
	static int anInt2673;
	static int anInt2674;
	static Class368 aClass368_2675;
	static int anInt2676;
	static boolean aBool2677;
	private Class22 aClass22_2678 = new Class22(64);
	static Class66 aClass66_2679 = null;
	static int anInt2680;
	static int anInt2681;
	static int anInt2682;
	static IncomingPacket aClass160_2683;
	private Class22 aClass22_2684 = new Class22(100);
	static int[] anIntArray2685;
	static Class84 aClass84_2686;
	static int anInt2687;

	final Class11_Sub45_Sub18 method1280(int i, int i_0_) {
		try {
			anInt2674++;
			Class11_Sub45_Sub18 class11_sub45_sub18;
			synchronized (aClass22_2684) {
				class11_sub45_sub18 = ((Class11_Sub45_Sub18) aClass22_2684
						.method188((long) i_0_, (byte) -57));
				int i_1_ = -28 / ((i + 52) / 54);
				if (class11_sub45_sub18 == null) {
					class11_sub45_sub18 = new Class11_Sub45_Sub18(i_0_);
					aClass22_2684.method184((byte) 124, class11_sub45_sub18,
							(long) i_0_);
				}
				if (!class11_sub45_sub18.method3758(-31394))
					return null;
			}
			return class11_sub45_sub18;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1281(byte i, int i_2_) {
		try {
			int i_3_ = -6 / ((32 - i) / 38);
			anInt2680++;
			synchronized (aClass22_2678) {
				aClass22_2678.method182(i_2_, (byte) -73);
			}
			synchronized (aClass22_2684) {
				aClass22_2684.method182(i_2_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.E(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method1282(boolean bool) {
		try {
			synchronized (aClass22_2678) {
				if (bool != true)
					return;
				aClass22_2678.method189((byte) 90);
			}
			anInt2673++;
			synchronized (aClass22_2684) {
				aClass22_2684.method189((byte) 107);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.D(" + bool + ')');
		}
	}

	public static void method1283(int i) {
		try {
			aClass66_2679 = null;
			aClass368_2675 = null;
			int i_4_ = 90 / ((-30 - i) / 54);
			aClass160_2683 = null;
			anIntArray2685 = null;
			aClass84_2686 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.F(" + i + ')');
		}
	}

	final Class281 method1284(int i, byte i_5_) {
		try {
			anInt2676++;
			Class281 class281;
			synchronized (aClass22_2678) {
				class281 = (Class281) aClass22_2678.method188((long) i,
						(byte) -63);
			}
			if (class281 != null)
				return class281;
			byte[] is;
			synchronized (aClass146_2672) {
				is = aClass146_2672.method930(Class243.method1539(i, 6),
						(byte) 112, Class268.method1687(26922, i));
			}
			class281 = new Class281();
			((Class281) class281).aClass198_3805 = this;
			((Class281) class281).anInt3810 = i;
			if (is != null)
				class281.method1737(24718, new Stream(is));
			class281.method1739(-29274);
			synchronized (aClass22_2678) {
				int i_6_ = 107 / ((i_5_ - 29) / 57);
				aClass22_2678.method184((byte) 125, class281, (long) i);
			}
			return class281;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.B(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method1285(int i) {
		try {
			anInt2682++;
			synchronized (aClass22_2678) {
				aClass22_2678.method190(0);
			}
			int i_7_ = -55 % ((60 - i) / 40);
			synchronized (aClass22_2684) {
				aClass22_2684.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jk.A(" + i + ')');
		}
	}

	Class198(Class66 class66, int i, Class146 class146, Class146 class146_8_,
			Class146 class146_9_) {
		try {
			aClass146_2672 = class146;
			if (aClass146_2672 != null) {
				int i_10_ = aClass146_2672.method928((byte) 20) - 1;
				aClass146_2672.method914(i_10_, 0);
			}
			Class122.method794(class146_8_, class146_9_, (byte) 118, 2);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jk.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_8_ != null ? "{...}" : "null") + ','
					+ (class146_9_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aBool2677 = false;
		aClass160_2683 = new IncomingPacket(72, 17);
		anInt2687 = 0;
		aClass84_2686 = new Class84();
	}
}
