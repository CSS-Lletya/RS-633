/* Class11_Sub2_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub18 extends Class11_Sub2 {
	static int anInt9052;
	static int anInt9053;
	private int anInt9054 = 585;
	static Class80[] aClass80Array9055;

	public static void method3553(int i) {
		do {
			try {
				aClass80Array9055 = null;
				if (i < -36)
					break;
				method3553(15);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ho.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub18() {
		super(0, true);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt9052++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_0_ = Class171.anIntArray2199[i];
				for (int i_1_ = 0; Class33_Sub2.anInt6696 > i_1_; i_1_++) {
					int i_2_ = Class208.anIntArray2808[i_1_];
					if (i_2_ > anInt9054
							&& (-anInt9054 + 4096 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)
							&& i_0_ > 2048 + -anInt9054
							&& (2048 + anInt9054 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)) {
						int i_3_ = -i_2_ + 2048;
						i_3_ = i_3_ < 0 ? -i_3_ : i_3_;
						i_3_ <<= 12;
						i_3_ /= -anInt9054 + 2048;
						is[i_1_] = 4096 + -i_3_;
					} else if (((2048 + -anInt9054 ^ 0xffffffff) > (i_2_ ^ 0xffffffff))
							&& 2048 - -anInt9054 > i_2_) {
						int i_4_ = i_0_ - 2048;
						i_4_ = (i_4_ ^ 0xffffffff) > -1 ? -i_4_ : i_4_;
						i_4_ -= anInt9054;
						i_4_ <<= 12;
						is[i_1_] = i_4_ / (-anInt9054 + 2048);
					} else if (i_0_ < anInt9054
							|| ((4096 + -anInt9054 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))) {
						int i_5_ = -2048 + i_2_;
						i_5_ = (i_5_ ^ 0xffffffff) <= -1 ? i_5_ : -i_5_;
						i_5_ -= anInt9054;
						i_5_ <<= 12;
						is[i_1_] = i_5_ / (2048 - anInt9054);
					} else if (i_2_ < anInt9054 || i_2_ > -anInt9054 + 4096) {
						int i_6_ = 2048 + -i_0_;
						i_6_ = i_6_ >= 0 ? i_6_ : -i_6_;
						i_6_ <<= 12;
						i_6_ /= 2048 - anInt9054;
						is[i_1_] = -i_6_ + 4096;
					} else
						is[i_1_] = 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ho.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_7_) {
		do {
			try {
				int i_8_ = i_7_;
				if ((i_8_ ^ 0xffffffff) == -1)
					anInt9054 = stream.readUnsignedShort((byte) -65);
				anInt9053++;
				if (i == 3731)
					break;
				method2263(44, null, -63);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ho.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_7_ + ')'));
			}
			break;
		} while (false);
	}
}
