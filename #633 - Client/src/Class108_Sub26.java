/* Class108_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub26 extends Class108 {
	static int anInt7822;
	static int anInt7823;
	static int anInt7824;
	static OutgoingPacket aClass370_7825 = new OutgoingPacket(71, 2);
	static int anInt7826;
	static int anInt7827;
	static int anInt7828;
	static int anInt7829;
	static OutgoingPacket aClass370_7830 = new OutgoingPacket(28, -1);
	static int[][] anIntArrayArray7831;
	static int anInt7832;
	static Class127 aClass127_7833;

	final int method3147(boolean bool) {
		try {
			if (bool != false)
				method3150((byte) 61);
			anInt7822++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.B(" + bool + ')');
		}
	}

	public static void method3148(int i) {
		try {
			aClass370_7830 = null;
			anIntArrayArray7831 = null;
			aClass127_7833 = null;
			if (i != -1)
				aClass370_7830 = null;
			aClass370_7825 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.G(" + i + ')');
		}
	}

	static final void method3149(float f, int i, float f_0_, int i_1_,
			int i_2_, float f_3_, float f_4_, byte[] is, int i_5_, int i_6_,
			int i_7_, float f_8_, byte i_9_, Class328 class328) {
		try {
			anInt7832++;
			int i_10_ = i_5_ * i_6_;
			float[] fs = new float[i_10_];
			for (int i_11_ = 0; (i_1_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
				class328.method1991(i_7_, fs, 0, i_2_, 66, f / (float) i_5_,
						127.0F * f_8_, f_3_ / (float) i_6_,
						f_0_ / (float) i_7_, i_5_, i_6_);
				int i_12_ = i;
				f_0_ *= 2.0F;
				f_3_ *= 2.0F;
				f *= 2.0F;
				f_8_ *= f_4_;
				for (int i_13_ = 0; i_10_ > i_13_; i_13_++) {
					is[i_12_] += fs[i_13_];
					i_12_++;
				}
			}
			int i_14_ = i;
			if (i_9_ != -119)
				method3148(6);
			for (int i_15_ = 0; i_10_ > i_15_; i_15_++) {
				is[i_14_] = (byte) (127 + is[i_14_]);
				i_14_++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tw.H(" + f + ',' + i
					+ ',' + f_0_ + ',' + i_1_ + ',' + i_2_ + ',' + f_3_ + ','
					+ f_4_ + ',' + (is != null ? "{...}" : "null") + ',' + i_5_
					+ ',' + i_6_ + ',' + i_7_ + ',' + f_8_ + ',' + i_9_ + ','
					+ (class328 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method728(int i, int i_16_) {
		do {
			try {
				anInt7828++;
				((Class108) this).anInt1459 = i_16_;
				if (i == 0)
					break;
				aClass127_7833 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tw.C(" + i + ','
						+ i_16_ + ')');
			}
			break;
		} while (false);
	}

	Class108_Sub26(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	Class108_Sub26(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method721(int i, int i_17_) {
		try {
			anInt7823++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			if ((((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub6_5697
					.method2429(false) ^ 0xffffffff) == -1)
				return 3;
			if (i_17_ <= 10)
				return -60;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.F(" + i + ','
					+ i_17_ + ')');
		}
	}

	final void method726(boolean bool) {
		try {
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				((Class108) this).anInt1459 = 0;
			anInt7826++;
			if ((((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub6_5697
					.method2429(bool) ^ 0xffffffff) == -1)
				((Class108) this).anInt1459 = 0;
			if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
					|| ((Class108) this).anInt1459 > 2)
				((Class108) this).anInt1459 = method725((byte) -104);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.E(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			int i_18_ = 22 % ((70 - i) / 51);
			anInt7829++;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.A(" + i + ')');
		}
	}

	final boolean method3150(byte i) {
		try {
			anInt7827++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(i - 18320))
				return false;
			if (i != -53)
				return true;
			if (((Class11_Sub17) ((Class108) this).aClass11_Sub17_1458).aClass108_Sub6_5697
					.method2429(false) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tw.D(" + i + ')');
		}
	}
}
