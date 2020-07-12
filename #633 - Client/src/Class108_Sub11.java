/* Class108_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub11 extends Class108 {
	static int anInt6142;
	static int anInt6143;
	static int anInt6144;
	static int anInt6145;
	static IncomingPacket aClass160_6146 = new IncomingPacket(61, -1);
	static int anInt6147;
	static int anInt6148;
	static int[] anIntArray6149 = new int[6];
	static Class40 aClass40_6150;
	static int anInt6151;
	static int anInt6152;

	static final void method2620(int i, int i_0_, long[] ls, int i_1_, int[] is) {
		try {
			if (i_0_ > i_1_) {
				int i_2_ = (i_1_ + i_0_) / 2;
				int i_3_ = i_1_;
				long l = ls[i_2_];
				ls[i_2_] = ls[i_0_];
				ls[i_0_] = l;
				int i_4_ = is[i_2_];
				is[i_2_] = is[i_0_];
				is[i_0_] = i_4_;
				int i_5_ = l == 9223372036854775807L ? 0 : 1;
				for (int i_6_ = i_1_; i_0_ > i_6_; i_6_++) {
					if ((ls[i_6_] ^ 0xffffffffffffffffL) > ((long) (i_5_ & i_6_)
							+ l ^ 0xffffffffffffffffL)) {
						long l_7_ = ls[i_6_];
						ls[i_6_] = ls[i_3_];
						ls[i_3_] = l_7_;
						int i_8_ = is[i_6_];
						is[i_6_] = is[i_3_];
						is[i_3_++] = i_8_;
					}
				}
				ls[i_0_] = ls[i_3_];
				ls[i_3_] = l;
				is[i_0_] = is[i_3_];
				is[i_3_] = i_4_;
				method2620(852, -1 + i_3_, ls, i_1_, is);
				method2620(852, i_0_, ls, i_3_ + 1, is);
			}
			if (i != 852)
				aClass40_6150 = null;
			anInt6144++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ft.I(" + i + ','
					+ i_0_ + ',' + (ls != null ? "{...}" : "null") + ',' + i_1_
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method2621(int i) {
		try {
			anInt6147++;
			if (i != -24897)
				aClass160_6146 = null;
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				return Class376_Sub1_Sub1.aClass22_8685.method192(i ^ ~0x6141);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.G(" + i + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt6143++;
			int i_9_ = -104 / ((70 - i) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.A(" + i + ')');
		}
	}

	public static void method2622(byte i) {
		try {
			aClass160_6146 = null;
			anIntArray6149 = null;
			if (i > -55)
				method2620(42, -87, null, 30, null);
			aClass40_6150 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.D(" + i + ')');
		}
	}

	final int method721(int i, int i_10_) {
		try {
			if (i_10_ <= 10)
				anIntArray6149 = null;
			anInt6152++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.F(" + i + ','
					+ i_10_ + ')');
		}
	}

	final int method2623(boolean bool) {
		try {
			if (bool != false)
				method725((byte) -45);
			anInt6148++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.B(" + bool + ')');
		}
	}

	static final byte[] method2624(float f, int i, int i_11_,
			Class328 class328, int i_12_, int i_13_, float f_14_, float f_15_,
			int i_16_, float f_17_, float f_18_) {
		try {
			anInt6142++;
			byte[] is = new byte[i * (i_12_ * i_11_)];
			Class376_Sub8.method3123(is, f_15_, i_11_, (byte) -52, i_12_, i,
					class328, f_17_, f_14_, i_16_, i_13_, f, f_18_);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ft.H(" + f + ',' + i
					+ ',' + i_11_ + ',' + (class328 != null ? "{...}" : "null")
					+ ',' + i_12_ + ',' + i_13_ + ',' + f_14_ + ',' + f_15_
					+ ',' + i_16_ + ',' + f_17_ + ',' + f_18_ + ')'));
		}
	}

	Class108_Sub11(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final void method728(int i, int i_19_) {
		do {
			try {
				anInt6145++;
				((Class108) this).anInt1459 = i_19_;
				if (i == 0)
					break;
				method2622((byte) -14);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ft.C(" + i + ','
						+ i_19_ + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		try {
			if (((Class108) this).anInt1459 != 1
					&& ((Class108) this).anInt1459 != 0)
				((Class108) this).anInt1459 = method725((byte) 10);
			if (bool != false)
				aClass40_6150 = null;
			anInt6151++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ft.E(" + bool + ')');
		}
	}

	Class108_Sub11(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}
}
