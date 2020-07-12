/* Class11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub2 extends Class11 {
	static int anInt5036;
	Class11_Sub2[] aClass11_Sub2Array5037;
	Class291 aClass291_5038;
	static OutgoingPacket aClass370_5039 = new OutgoingPacket(69, -1);
	static int anInt5040;
	static int anInt5041;
	static int anInt5042;
	Class105 aClass105_5043;
	boolean aBool5044;
	static int anInt5045;
	int anInt5046;
	static int anInt5047;
	static int anInt5048;
	static int anInt5049;
	static OutgoingPacket aClass370_5050 = new OutgoingPacket(62, 6);
	static int anInt5051;
	static int anInt5052;
	static int anInt5053;
	static int anInt5054;
	static Stream aClass11_Sub20_5055;

	int method2253(int i) {
		try {
			if (i != 8347)
				method2258(-126);
			anInt5045++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.O(" + i + ')');
		}
	}

	int[] method2254(int i, boolean bool) {
		try {
			anInt5040++;
			if (bool != true)
				return null;
			throw new IllegalStateException(
					"This operation does not have a monochrome output");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.A(" + i + ','
					+ bool + ')');
		}
	}

	int[][] method2255(int i, int i_0_) {
		try {
			anInt5047++;
			if (i_0_ != 1)
				method2255(49, 33);
			throw new IllegalStateException(
					"This operation does not have a colour output");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.I(" + i + ','
					+ i_0_ + ')');
		}
	}

	void method2256(int i) {
		try {
			if (i != 7)
				((Class11_Sub2) this).aClass291_5038 = null;
			anInt5036++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.D(" + i + ')');
		}
	}

	void method2257(byte i) {
		try {
			int i_1_ = -93 % ((i - 52) / 49);
			do {
				if (((Class11_Sub2) this).aBool5044) {
					((Class11_Sub2) this).aClass105_5043.method694(-15341);
					((Class11_Sub2) this).aClass105_5043 = null;
					if (!client.aBool10531)
						break;
				}
				((Class11_Sub2) this).aClass291_5038.method1802(-12665);
				((Class11_Sub2) this).aClass291_5038 = null;
			} while (false);
			anInt5053++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.N(" + i + ')');
		}
	}

	int method2258(int i) {
		try {
			if (i != -1)
				method2262(91, 21, 67);
			anInt5048++;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.W(" + i + ')');
		}
	}

	void method2259(int i, int i_2_, int i_3_) {
		do {
			try {
				anInt5042++;
				int i_4_ = (((Class11_Sub2) this).anInt5046 != 255 ? ((Class11_Sub2) this).anInt5046
						: i);
				do {
					if (!((Class11_Sub2) this).aBool5044) {
						((Class11_Sub2) this).aClass291_5038 = new Class291(
								i_4_, i, i_3_);
						if (!client.aBool10531)
							break;
					}
					((Class11_Sub2) this).aClass105_5043 = new Class105(i_4_,
							i, i_3_);
				} while (false);
				if (i_2_ == -1)
					break;
				((Class11_Sub2) this).anInt5046 = -20;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("tga.AA(" + i
						+ ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2260(int i, int i_5_, int i_6_) {
		try {
			if (i != 4463)
				((Class11_Sub2) this).aClass11_Sub2Array5037 = null;
			anInt5051++;
			if (((Class11_Sub2) ((Class11_Sub2) this).aClass11_Sub2Array5037[i_5_]).aBool5044)
				return ((Class11_Sub2) this).aClass11_Sub2Array5037[i_5_]
						.method2254(i_6_, true);
			return (((Class11_Sub2) this).aClass11_Sub2Array5037[i_5_]
					.method2255(i_6_, 1)[0]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tga.BA(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method2261(int i) {
		do {
			try {
				aClass370_5050 = null;
				aClass370_5039 = null;
				aClass11_Sub20_5055 = null;
				if (i == 0)
					break;
				aClass370_5050 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "tga.EA(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[][] method2262(int i, int i_7_, int i_8_) {
		try {
			anInt5049++;
			int i_9_ = 116 % ((93 - i_7_) / 32);
			if (!((Class11_Sub2) (((Class11_Sub2) this).aClass11_Sub2Array5037[i_8_])).aBool5044)
				return ((Class11_Sub2) this).aClass11_Sub2Array5037[i_8_]
						.method2255(i, 1);
			int[] is = ((Class11_Sub2) this).aClass11_Sub2Array5037[i_8_]
					.method2254(i, true);
			int[][] is_10_ = new int[3][];
			is_10_[2] = is;
			is_10_[1] = is;
			is_10_[0] = is;
			return is_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tga.DA(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	void method2263(int i, Stream stream, int i_11_) {
		try {
			if (i == 3731)
				anInt5052++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tga.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	Class11_Sub2(int i, boolean bool) {
		try {
			((Class11_Sub2) this).aBool5044 = bool;
			((Class11_Sub2) this).aClass11_Sub2Array5037 = new Class11_Sub2[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tga.<init>(" + i + ','
					+ bool + ')');
		}
	}

	static final void method2264(int i, int i_12_, int i_13_, byte[] is,
			int i_14_, byte[] is_15_, int i_16_, int i_17_, int i_18_) {
		try {
			anInt5054++;
			if (i_18_ >= -47)
				method2261(20);
			int i_19_ = -(i_12_ >> 2);
			i_12_ = -(0x3 & i_12_);
			for (int i_20_ = -i_14_; (i_20_ ^ 0xffffffff) > -1; i_20_++) {
				for (int i_21_ = i_19_; (i_21_ ^ 0xffffffff) > -1; i_21_++) {
					is_15_[i_13_++] += is[i_16_++];
					is_15_[i_13_++] += is[i_16_++];
					is_15_[i_13_++] += is[i_16_++];
					is_15_[i_13_++] += is[i_16_++];
				}
				for (int i_22_ = i_12_; (i_22_ ^ 0xffffffff) > -1; i_22_++)
					is_15_[i_13_++] += is[i_16_++];
				i_16_ += i_17_;
				i_13_ += i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tga.CA(" + i + ','
					+ i_12_ + ',' + i_13_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_14_ + ','
					+ (is_15_ != null ? "{...}" : "null") + ',' + i_16_ + ','
					+ i_17_ + ',' + i_18_ + ')'));
		}
	}
}
