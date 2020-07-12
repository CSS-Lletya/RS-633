/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class47 {
	static int anInt734;
	private Class163_Sub2_Sub1 aClass163_Sub2_Sub1_735;
	int anInt736;
	static Class336 aClass336_737 = new Class336();
	static int anInt738;
	static int anInt739;
	static Class118 aClass118_740 = new Class118();
	static Class29 aClass29_741;
	static int anInt742 = 0;
	static Class253[] aClass253Array743;
	static Class146 aClass146_744;
	static Class195_Sub1[] aClass195_Sub1Array745;
	static Class146 aClass146_746;
	static boolean aBool747 = false;

	protected final void finalize() throws Throwable {
		try {
			aClass163_Sub2_Sub1_735.method3400(((Class47) this).anInt736,
					(byte) 123);
			anInt738++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wba.finalize(" + ')');
		}
	}

	static final void method410(int i, int i_0_, Class163 class163, int i_1_,
			int i_2_, int i_3_, int i_4_, int i_5_,
			Class11_Sub45_Sub14 class11_sub45_sub14, int i_6_, int i_7_,
			int i_8_) {
		do {
			try {
				if ((i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)
						&& (i_4_ ^ 0xffffffff) > (i_6_ + i_2_ ^ 0xffffffff)
						&& -13 + i_3_ < i_0_
						&& (3 + i_3_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff))
					i_1_ = i_8_;
				anInt734++;
				String string = Class217_Sub1.method2411((byte) -112,
						class11_sub45_sub14);
				Class98.aClass107_1308.method718(0, i_1_, i - 155, i_6_ + 3,
						Class46.aClass253Array722, string,
						(Class376_Sub7_Sub5_Sub4.anIntArray10126), i_3_);
				if (i == 255)
					break;
				aClass253Array743 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wba.A(" + i + ','
						+ i_0_ + ',' + (class163 != null ? "{...}" : "null")
						+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
						+ ',' + i_5_ + ','
						+ (class11_sub45_sub14 != null ? "{...}" : "null")
						+ ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method411(int i) {
		try {
			aClass336_737 = null;
			aClass195_Sub1Array745 = null;
			aClass146_744 = null;
			aClass118_740 = null;
			if (i == -5620) {
				aClass146_746 = null;
				aClass29_741 = null;
				aClass253Array743 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wba.B(" + i + ')');
		}
	}

	static final void method412(int i, int i_9_, int i_10_, Class163 class163,
			IComponentDefinitions class192, Class72 class72, int i_11_,
			int i_12_, int i_13_) {
		do {
			try {
				if (i_11_ != -13)
					method411(22);
				anInt739++;
				Class23 class23 = Class168.aClass280_2160.method1726(
						(byte) -71, i_9_);
				if (class23 == null
						|| !((Class23) class23).aBool210
						|| !class23.method196(Class11_Sub26.aClass97_6296,
								i_11_ ^ ~0xe))
					break;
				if (((Class23) class23).anIntArray242 != null) {
					int[] is = new int[((Class23) class23).anIntArray242.length];
					for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (is.length / 2 ^ 0xffffffff); i_14_++) {
						int i_15_;
						if ((Class191.anInt2453 ^ 0xffffffff) != -5)
							i_15_ = 0x3fff & ((int) Class2_Sub8.aFloat6868 + Class328.anInt4371);
						else
							i_15_ = 0x3fff & (int) Class2_Sub8.aFloat6868;
						int i_16_ = Class335.anIntArray4436[i_15_];
						int i_17_ = Class335.anIntArray4430[i_15_];
						if ((Class191.anInt2453 ^ 0xffffffff) != -5) {
							i_17_ = 256 * i_17_
									/ (Class11_Sub45_Sub1.anInt8493 + 256);
							i_16_ = (256 * i_16_ / (256 + Class11_Sub45_Sub1.anInt8493));
						}
						is[i_14_ * 2] = (((i_16_
								* (i_12_ + (((Class23) class23).anIntArray242[1 + 2 * i_14_]) * 4) + ((i_13_ + 4 * (((Class23) class23).anIntArray242[i_14_ * 2])) * i_17_)) >> 14)
								+ i - -(((IComponentDefinitions) class192).anInt2610 / 2));
						is[1 + 2 * i_14_] = (i_10_
								+ ((IComponentDefinitions) class192).anInt2546
								/ 2 + -((-(i_16_ * (4 * (((Class23) class23).anIntArray242[2 * i_14_]) + i_13_)) + i_17_
								* (i_12_ + 4 * (((Class23) class23).anIntArray242[1 + 2 * i_14_]))) >> 14));
					}
					Class294.method1818(class163, is,
							((Class23) class23).anInt231,
							((IComponentDefinitions) class192).anIntArray2596,
							((IComponentDefinitions) class192).anIntArray2529);
					if (((Class23) class23).anInt215 > 0) {
						for (int i_18_ = 0; is.length / 2 - 1 > i_18_; i_18_++) {
							int i_19_ = is[2 * i_18_];
							int i_20_ = is[2 * i_18_ + 1];
							int i_21_ = is[2 * i_18_ + 2];
							int i_22_ = is[3 + 2 * i_18_];
							if ((i_21_ ^ 0xffffffff) > (i_19_ ^ 0xffffffff)) {
								int i_23_ = i_19_;
								int i_24_ = i_20_;
								i_19_ = i_21_;
								i_20_ = i_22_;
								i_21_ = i_23_;
								i_22_ = i_24_;
							} else if ((i_19_ ^ 0xffffffff) == (i_21_ ^ 0xffffffff)
									&& ((i_22_ ^ 0xffffffff) > (i_20_ ^ 0xffffffff))) {
								int i_25_ = i_20_;
								i_20_ = i_22_;
								i_22_ = i_25_;
							}
							class163.method1058(
									i_19_,
									i_20_,
									i_21_,
									i_22_,
									(((Class23) class23).anIntArray220[((((Class23) class23).aByteArray198[i_18_]) & 0xff)]),
									1, class72, i, i_10_,
									((Class23) class23).anInt215,
									((Class23) class23).anInt222,
									((Class23) class23).anInt237);
						}
						int i_26_ = is[-2 + is.length];
						int i_27_ = is[is.length - 1];
						int i_28_ = is[0];
						int i_29_ = is[1];
						if (i_28_ < i_26_) {
							int i_30_ = i_26_;
							int i_31_ = i_27_;
							i_26_ = i_28_;
							i_27_ = i_29_;
							i_28_ = i_30_;
							i_29_ = i_31_;
						} else if ((i_28_ ^ 0xffffffff) == (i_26_ ^ 0xffffffff)
								&& (i_27_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff)) {
							int i_32_ = i_27_;
							i_27_ = i_29_;
							i_29_ = i_32_;
						}
						class163.method1058(
								i_26_,
								i_27_,
								i_28_,
								i_29_,
								(((Class23) class23).anIntArray220[0xff & (((Class23) class23).aByteArray198[-1
										+ (((Class23) class23).aByteArray198).length])]),
								1, class72, i, i_10_,
								((Class23) class23).anInt215,
								((Class23) class23).anInt222,
								((Class23) class23).anInt237);
					} else {
						for (int i_33_ = 0; is.length / 2 - 1 > i_33_; i_33_++)
							class163.method1011(
									is[i_33_ * 2],
									is[1 + i_33_ * 2],
									is[(1 + i_33_) * 2],
									is[1 + i_33_ * 2 + 2],
									(((Class23) class23).anIntArray220[0xff & (((Class23) class23).aByteArray198[i_33_])]),
									1, class72, i, i_10_);
						class163.method1011(
								is[is.length - 2],
								is[-1 + is.length],
								is[0],
								is[1],
								(((Class23) class23).anIntArray220[((((Class23) class23).aByteArray198[(((Class23) class23).aByteArray198).length - 1]) & 0xff)]),
								1, class72, i, i_10_);
					}
				}
				Class253 class253 = null;
				if ((((Class23) class23).anInt203 ^ 0xffffffff) != 0) {
					class253 = class23.method203(class163, (byte) -13, false);
					if (class253 != null)
						Class310.method1894(-122, i_10_, i_13_, class72,
								class253, i_12_, i, class192);
				}
				if (((Class23) class23).aString247 == null)
					break;
				int i_34_ = 0;
				if (class253 != null)
					i_34_ = class253.method1615();
				Class107 class107 = Class298.aClass107_4028;
				Class292 class292 = Class11_Sub45_Sub2.aClass292_8511;
				if ((((Class23) class23).anInt208 ^ 0xffffffff) == -2) {
					class292 = Class161.aClass292_2096;
					class107 = OutputStream_Sub2.aClass107_7949;
				}
				if (((Class23) class23).anInt208 == 2) {
					class107 = Class98.aClass107_1308;
					class292 = Class256_Sub1.aClass292_5320;
				}
				Class261.method1668(i_34_, class192,
						((Class23) class23).anInt246, i_13_, i_11_ ^ ~0x10c,
						((Class23) class23).aString247, class107, i_10_,
						class292, i, i_12_, class72);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wba.C(" + i + ','
						+ i_9_ + ',' + i_10_ + ','
						+ (class163 != null ? "{...}" : "null") + ','
						+ (class192 != null ? "{...}" : "null") + ','
						+ (class72 != null ? "{...}" : "null") + ',' + i_11_
						+ ',' + i_12_ + ',' + i_13_ + ')'));
			}
			break;
		} while (false);
	}

	Class47(Class163_Sub2_Sub1 class163_sub2_sub1, int i, int i_35_) {
		try {
			aClass163_Sub2_Sub1_735 = class163_sub2_sub1;
			((Class47) this).anInt736 = i_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wba.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_35_ + ')'));
		}
	}
}
