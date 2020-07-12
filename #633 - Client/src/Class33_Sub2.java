/* Class33_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33_Sub2 extends Class33 {
	static int anInt6649;
	static int anInt6650;
	float aFloat6651;
	static int anInt6652;
	float aFloat6653;
	static int anInt6654;
	float aFloat6655;
	static int anInt6656;
	static int anInt6657;
	static int anInt6658;
	static int anInt6659;
	static int anInt6660;
	float aFloat6661;
	static int anInt6662;
	static int anInt6663;
	static int anInt6664;
	static int anInt6665;
	float aFloat6666;
	static int anInt6667;
	static int anInt6668;
	static int anInt6669;
	static int anInt6670 = 0;
	static int anInt6671;
	static int anInt6672;
	static int anInt6673;
	static int anInt6674;
	static int anInt6675;
	float aFloat6676;
	static int anInt6677;
	float aFloat6678;
	float aFloat6679;
	static int anInt6680;
	static int anInt6681;
	float aFloat6682;
	static int anInt6683;
	static int anInt6684;
	static int anInt6685;
	static int anInt6686;
	static int anInt6687;
	static int anInt6688;
	static int anInt6689;
	static int anInt6690;
	float aFloat6691;
	static int anInt6692;
	float aFloat6693;
	static int anInt6694;
	static int anInt6695;
	static int anInt6696;
	float aFloat6697;
	static int anInt6698;
	static int anInt6699;

	final float method2744(boolean bool, float f, float f_0_, float f_1_) {
		try {
			anInt6660++;
			if (bool != true)
				return 0.031743657F;
			return (((Class33_Sub2) this).aFloat6697 + (f_0_
					* ((Class33_Sub2) this).aFloat6679 + (((Class33_Sub2) this).aFloat6666
					* f + f_1_ * ((Class33_Sub2) this).aFloat6655)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.KA(" + bool + ','
					+ f + ',' + f_0_ + ',' + f_1_ + ')'));
		}
	}

	final void method287(int i, int i_2_, int i_3_, int[] is) {
		try {
			i_3_ -= ((Class33_Sub2) this).aFloat6697;
			anInt6694++;
			i_2_ -= ((Class33_Sub2) this).aFloat6653;
			i -= ((Class33_Sub2) this).aFloat6693;
			is[2] = (int) ((float) i_3_ * ((Class33_Sub2) this).aFloat6679 + ((float) i_2_
					* ((Class33_Sub2) this).aFloat6691 + (float) i
					* ((Class33_Sub2) this).aFloat6676));
			is[0] = (int) ((float) i * ((Class33_Sub2) this).aFloat6651
					+ (float) i_2_ * ((Class33_Sub2) this).aFloat6678 + (float) i_3_
					* ((Class33_Sub2) this).aFloat6666);
			is[1] = (int) ((float) i_2_ * ((Class33_Sub2) this).aFloat6682
					+ (float) i * ((Class33_Sub2) this).aFloat6661 + (float) i_3_
					* ((Class33_Sub2) this).aFloat6655);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ofa.G(" + i + ',' + i_2_ + ',' + i_3_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2745(int i, Class33 class33) {
		try {
			anInt6684++;
			Class33_Sub2 class33_sub2_4_ = (Class33_Sub2) class33;
			float f = ((Class33_Sub2) this).aFloat6651;
			float f_5_ = ((Class33_Sub2) this).aFloat6678;
			if (i == 6) {
				float f_6_ = ((Class33_Sub2) this).aFloat6661;
				float f_7_ = ((Class33_Sub2) this).aFloat6682;
				float f_8_ = ((Class33_Sub2) this).aFloat6676;
				float f_9_ = ((Class33_Sub2) this).aFloat6691;
				float f_10_ = ((Class33_Sub2) this).aFloat6693;
				((Class33_Sub2) this).aFloat6651 = ((((Class33_Sub2) class33_sub2_4_).aFloat6676 * ((Class33_Sub2) this).aFloat6666) + (((Class33_Sub2) class33_sub2_4_).aFloat6661
						* f_5_ + f
						* ((Class33_Sub2) class33_sub2_4_).aFloat6651));
				((Class33_Sub2) this).aFloat6678 = ((((Class33_Sub2) class33_sub2_4_).aFloat6691 * ((Class33_Sub2) this).aFloat6666) + (f_5_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6682 + f
						* ((Class33_Sub2) class33_sub2_4_).aFloat6678));
				float f_11_ = ((Class33_Sub2) this).aFloat6653;
				((Class33_Sub2) this).aFloat6661 = ((((Class33_Sub2) class33_sub2_4_).aFloat6676 * ((Class33_Sub2) this).aFloat6655) + (f_7_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6661 + (((Class33_Sub2) class33_sub2_4_).aFloat6651 * f_6_)));
				((Class33_Sub2) this).aFloat6682 = (f_6_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6678 + f_7_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6682 + (((Class33_Sub2) class33_sub2_4_).aFloat6691 * ((Class33_Sub2) this).aFloat6655));
				((Class33_Sub2) this).aFloat6666 = ((((Class33_Sub2) this).aFloat6666 * ((Class33_Sub2) class33_sub2_4_).aFloat6679) + (((Class33_Sub2) class33_sub2_4_).aFloat6655
						* f_5_ + ((Class33_Sub2) class33_sub2_4_).aFloat6666
						* f));
				((Class33_Sub2) this).aFloat6655 = (((Class33_Sub2) class33_sub2_4_).aFloat6655
						* f_7_
						+ f_6_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6666 + (((Class33_Sub2) this).aFloat6655 * ((Class33_Sub2) class33_sub2_4_).aFloat6679));
				((Class33_Sub2) this).aFloat6691 = ((((Class33_Sub2) this).aFloat6679 * ((Class33_Sub2) class33_sub2_4_).aFloat6691) + (f_9_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6682 + (((Class33_Sub2) class33_sub2_4_).aFloat6678 * f_8_)));
				((Class33_Sub2) this).aFloat6676 = (((Class33_Sub2) class33_sub2_4_).aFloat6661
						* f_9_
						+ f_8_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6651 + (((Class33_Sub2) class33_sub2_4_).aFloat6676 * ((Class33_Sub2) this).aFloat6679));
				((Class33_Sub2) this).aFloat6679 = ((((Class33_Sub2) class33_sub2_4_).aFloat6679 * ((Class33_Sub2) this).aFloat6679) + (f_9_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6655 + (f_8_ * ((Class33_Sub2) class33_sub2_4_).aFloat6666)));
				((Class33_Sub2) this).aFloat6693 = (f_10_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6651
						+ ((Class33_Sub2) class33_sub2_4_).aFloat6661
						* f_11_
						+ (((Class33_Sub2) class33_sub2_4_).aFloat6676 * ((Class33_Sub2) this).aFloat6697) + ((Class33_Sub2) class33_sub2_4_).aFloat6693);
				((Class33_Sub2) this).aFloat6653 = (((Class33_Sub2) class33_sub2_4_).aFloat6653 + (f_11_
						* ((Class33_Sub2) class33_sub2_4_).aFloat6682
						+ ((Class33_Sub2) class33_sub2_4_).aFloat6678 * f_10_ + (((Class33_Sub2) class33_sub2_4_).aFloat6691 * ((Class33_Sub2) this).aFloat6697)));
				((Class33_Sub2) this).aFloat6697 = ((((Class33_Sub2) class33_sub2_4_).aFloat6679 * ((Class33_Sub2) this).aFloat6697)
						+ (((Class33_Sub2) class33_sub2_4_).aFloat6655 * f_11_ + (f_10_ * ((Class33_Sub2) class33_sub2_4_).aFloat6666)) + ((Class33_Sub2) class33_sub2_4_).aFloat6697);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.K(" + i + ','
					+ (class33 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2746(Class33 class33, Class33 class33_12_) {
		try {
			anInt6688++;
			Class33_Sub2 class33_sub2_13_ = (Class33_Sub2) class33;
			Class33_Sub2 class33_sub2_14_ = (Class33_Sub2) class33_12_;
			((Class33_Sub2) this).aFloat6651 = ((((Class33_Sub2) class33_sub2_14_).aFloat6666 * ((Class33_Sub2) class33_sub2_13_).aFloat6676) + ((((Class33_Sub2) class33_sub2_13_).aFloat6651 * ((Class33_Sub2) class33_sub2_14_).aFloat6651) + (((Class33_Sub2) class33_sub2_14_).aFloat6678 * ((Class33_Sub2) class33_sub2_13_).aFloat6661)));
			((Class33_Sub2) this).aFloat6678 = ((((Class33_Sub2) class33_sub2_14_).aFloat6678 * ((Class33_Sub2) class33_sub2_13_).aFloat6682)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6678 * ((Class33_Sub2) class33_sub2_14_).aFloat6651) + (((Class33_Sub2) class33_sub2_14_).aFloat6666 * ((Class33_Sub2) class33_sub2_13_).aFloat6691));
			((Class33_Sub2) this).aFloat6666 = ((((Class33_Sub2) class33_sub2_13_).aFloat6666 * ((Class33_Sub2) class33_sub2_14_).aFloat6651)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6655 * ((Class33_Sub2) class33_sub2_14_).aFloat6678) + (((Class33_Sub2) class33_sub2_14_).aFloat6666 * ((Class33_Sub2) class33_sub2_13_).aFloat6679));
			((Class33_Sub2) this).aFloat6661 = ((((Class33_Sub2) class33_sub2_14_).aFloat6682 * ((Class33_Sub2) class33_sub2_13_).aFloat6661)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6651 * ((Class33_Sub2) class33_sub2_14_).aFloat6661) + (((Class33_Sub2) class33_sub2_13_).aFloat6676 * ((Class33_Sub2) class33_sub2_14_).aFloat6655));
			((Class33_Sub2) this).aFloat6682 = ((((Class33_Sub2) class33_sub2_13_).aFloat6691 * ((Class33_Sub2) class33_sub2_14_).aFloat6655) + ((((Class33_Sub2) class33_sub2_14_).aFloat6682 * ((Class33_Sub2) class33_sub2_13_).aFloat6682) + (((Class33_Sub2) class33_sub2_13_).aFloat6678 * ((Class33_Sub2) class33_sub2_14_).aFloat6661)));
			((Class33_Sub2) this).aFloat6676 = ((((Class33_Sub2) class33_sub2_14_).aFloat6691 * ((Class33_Sub2) class33_sub2_13_).aFloat6661)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6651 * ((Class33_Sub2) class33_sub2_14_).aFloat6676) + (((Class33_Sub2) class33_sub2_14_).aFloat6679 * ((Class33_Sub2) class33_sub2_13_).aFloat6676));
			((Class33_Sub2) this).aFloat6655 = ((((Class33_Sub2) class33_sub2_13_).aFloat6679 * ((Class33_Sub2) class33_sub2_14_).aFloat6655) + ((((Class33_Sub2) class33_sub2_13_).aFloat6655 * ((Class33_Sub2) class33_sub2_14_).aFloat6682) + (((Class33_Sub2) class33_sub2_14_).aFloat6661 * ((Class33_Sub2) class33_sub2_13_).aFloat6666)));
			((Class33_Sub2) this).aFloat6691 = ((((Class33_Sub2) class33_sub2_13_).aFloat6678 * ((Class33_Sub2) class33_sub2_14_).aFloat6676)
					+ (((Class33_Sub2) class33_sub2_14_).aFloat6691 * ((Class33_Sub2) class33_sub2_13_).aFloat6682) + (((Class33_Sub2) class33_sub2_14_).aFloat6679 * ((Class33_Sub2) class33_sub2_13_).aFloat6691));
			((Class33_Sub2) this).aFloat6679 = ((((Class33_Sub2) class33_sub2_13_).aFloat6679 * ((Class33_Sub2) class33_sub2_14_).aFloat6679) + ((((Class33_Sub2) class33_sub2_13_).aFloat6666 * ((Class33_Sub2) class33_sub2_14_).aFloat6676) + (((Class33_Sub2) class33_sub2_13_).aFloat6655 * ((Class33_Sub2) class33_sub2_14_).aFloat6691)));
			((Class33_Sub2) this).aFloat6693 = (((Class33_Sub2) class33_sub2_13_).aFloat6693 + ((((Class33_Sub2) class33_sub2_14_).aFloat6693 * ((Class33_Sub2) class33_sub2_13_).aFloat6651)
					+ (((Class33_Sub2) class33_sub2_14_).aFloat6653 * ((Class33_Sub2) class33_sub2_13_).aFloat6661) + (((Class33_Sub2) class33_sub2_13_).aFloat6676 * ((Class33_Sub2) class33_sub2_14_).aFloat6697)));
			((Class33_Sub2) this).aFloat6653 = (((Class33_Sub2) class33_sub2_13_).aFloat6653 + ((((Class33_Sub2) class33_sub2_14_).aFloat6693 * ((Class33_Sub2) class33_sub2_13_).aFloat6678)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6682 * ((Class33_Sub2) class33_sub2_14_).aFloat6653) + (((Class33_Sub2) class33_sub2_14_).aFloat6697 * ((Class33_Sub2) class33_sub2_13_).aFloat6691)));
			((Class33_Sub2) this).aFloat6697 = (((Class33_Sub2) class33_sub2_13_).aFloat6697 + ((((Class33_Sub2) class33_sub2_14_).aFloat6693 * ((Class33_Sub2) class33_sub2_13_).aFloat6666)
					+ (((Class33_Sub2) class33_sub2_13_).aFloat6655 * ((Class33_Sub2) class33_sub2_14_).aFloat6653) + (((Class33_Sub2) class33_sub2_14_).aFloat6697 * ((Class33_Sub2) class33_sub2_13_).aFloat6679)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.M("
					+ (class33 != null ? "{...}" : "null") + ','
					+ (class33_12_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method298(int i) {
		try {
			anInt6656++;
			((Class33_Sub2) this).aFloat6682 = 1.0F;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) this).aFloat6679 = Class103.aFloatArray1373[0x3fff & i];
			((Class33_Sub2) this).aFloat6676 = Class103.aFloatArray1370[i & 0x3fff];
			((Class33_Sub2) this).aFloat6666 = -((Class33_Sub2) this).aFloat6676;
			((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6693 = ((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6697 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.L(" + i + ')');
		}
	}

	final void method297(int i) {
		try {
			anInt6650++;
			float f = Class103.aFloatArray1373[0x3fff & i];
			float f_15_ = Class103.aFloatArray1370[i & 0x3fff];
			float f_16_ = ((Class33_Sub2) this).aFloat6651;
			float f_17_ = ((Class33_Sub2) this).aFloat6661;
			float f_18_ = ((Class33_Sub2) this).aFloat6676;
			float f_19_ = ((Class33_Sub2) this).aFloat6693;
			((Class33_Sub2) this).aFloat6651 = f * f_16_ - f_15_
					* ((Class33_Sub2) this).aFloat6678;
			((Class33_Sub2) this).aFloat6661 = f_17_ * f
					- ((Class33_Sub2) this).aFloat6682 * f_15_;
			((Class33_Sub2) this).aFloat6678 = f_16_ * f_15_ + f
					* ((Class33_Sub2) this).aFloat6678;
			((Class33_Sub2) this).aFloat6682 = f_17_ * f_15_
					+ ((Class33_Sub2) this).aFloat6682 * f;
			((Class33_Sub2) this).aFloat6676 = -(((Class33_Sub2) this).aFloat6691 * f_15_)
					+ f_18_ * f;
			((Class33_Sub2) this).aFloat6691 = f_15_ * f_18_
					+ ((Class33_Sub2) this).aFloat6691 * f;
			((Class33_Sub2) this).aFloat6693 = f_19_ * f - f_15_
					* ((Class33_Sub2) this).aFloat6653;
			((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) this).aFloat6653
					* f + f_15_ * f_19_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.EA(" + i + ')');
		}
	}

	final void method288(int i) {
		try {
			anInt6695++;
			((Class33_Sub2) this).aFloat6679 = 1.0F;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) this).aFloat6682 = Class103.aFloatArray1373[0x3fff & i];
			((Class33_Sub2) this).aFloat6678 = Class103.aFloatArray1370[0x3fff & i];
			((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6693 = ((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6661 = -((Class33_Sub2) this).aFloat6678;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.A(" + i + ')');
		}
	}

	final void method2747(float f, float f_20_, byte i, float f_21_) {
		do {
			try {
				anInt6669++;
				((Class33_Sub2) this).aFloat6697 += f_20_;
				((Class33_Sub2) this).aFloat6653 += f_21_;
				((Class33_Sub2) this).aFloat6693 += f;
				if (i == 86)
					break;
				method295(-84, -36, -113, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ofa.IA(" + f
						+ ',' + f_20_ + ',' + i + ',' + f_21_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2748(byte i, float f, float f_22_, float f_23_, float[] fs) {
		try {
			if (i == 69) {
				fs[2] = (f_23_ * ((Class33_Sub2) this).aFloat6655 + f_22_
						* ((Class33_Sub2) this).aFloat6666 + f
						* ((Class33_Sub2) this).aFloat6679);
				anInt6652++;
				fs[1] = (f_22_ * ((Class33_Sub2) this).aFloat6678 + f_23_
						* ((Class33_Sub2) this).aFloat6682 + ((Class33_Sub2) this).aFloat6691
						* f);
				fs[0] = (f_23_ * ((Class33_Sub2) this).aFloat6661
						+ ((Class33_Sub2) this).aFloat6651 * f_22_ + f
						* ((Class33_Sub2) this).aFloat6676);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.B(" + i + ',' + f
					+ ',' + f_22_ + ',' + f_23_ + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2749(Class33 class33, int i) {
		try {
			anInt6663++;
			Class33_Sub2 class33_sub2_24_ = (Class33_Sub2) class33;
			((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) class33_sub2_24_).aFloat6678;
			if (i != -3603)
				((Class33_Sub2) this).aFloat6679 = -0.012301538F;
			((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) class33_sub2_24_).aFloat6666;
			((Class33_Sub2) this).aFloat6693 = 0.0F;
			((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) class33_sub2_24_).aFloat6661;
			((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) class33_sub2_24_).aFloat6691;
			((Class33_Sub2) this).aFloat6679 = ((Class33_Sub2) class33_sub2_24_).aFloat6679;
			((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) class33_sub2_24_).aFloat6655;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) class33_sub2_24_).aFloat6651;
			((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) class33_sub2_24_).aFloat6682;
			((Class33_Sub2) this).aFloat6653 = 0.0F;
			((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) class33_sub2_24_).aFloat6676;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.F("
					+ (class33 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method2750(float f, float f_25_, int i, float f_26_, byte i_27_,
			int i_28_, int i_29_) {
		try {
			do {
				if ((i ^ 0xffffffff) != -1) {
					float f_30_ = Class103.aFloatArray1373[0x3fff & i];
					float f_31_ = Class103.aFloatArray1370[0x3fff & i];
					((Class33_Sub2) this).aFloat6651 = (float) i_28_
							* (f_30_ * 2.0F);
					((Class33_Sub2) this).aFloat6697 = f_25_;
					((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6691 = 0.0F;
					((Class33_Sub2) this).aFloat6661 = -2.0F * f_31_
							* (float) i_29_;
					((Class33_Sub2) this).aFloat6653 = ((-(0.5F * f_30_) + f_31_
							* -0.5F)
							* (float) (i_29_ * 2) + f);
					((Class33_Sub2) this).aFloat6693 = ((float) (i_28_ * 2)
							* (f_31_ * 0.5F - f_30_ * 0.5F) + f_26_);
					((Class33_Sub2) this).aFloat6682 = (float) i_29_
							* (f_30_ * 2.0F);
					((Class33_Sub2) this).aFloat6678 = (float) i_28_
							* (f_31_ * 2.0F);
					((Class33_Sub2) this).aFloat6679 = 1.0F;
					if (!client.aBool10531)
						break;
				}
				((Class33_Sub2) this).aFloat6653 = (float) -i_29_ + f;
				((Class33_Sub2) this).aFloat6697 = f_25_;
				((Class33_Sub2) this).aFloat6651 = (float) (i_28_ * 2);
				((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6691 = 0.0F;
				((Class33_Sub2) this).aFloat6682 = (float) (2 * i_29_);
				((Class33_Sub2) this).aFloat6679 = 1.0F;
				((Class33_Sub2) this).aFloat6693 = (float) -i_28_ + f_26_;
			} while (false);
			if (i_27_ > 79)
				anInt6689++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.T(" + f + ','
					+ f_25_ + ',' + i + ',' + f_26_ + ',' + i_27_ + ',' + i_28_
					+ ',' + i_29_ + ')'));
		}
	}

	final float method2751(int i, float f, float f_32_, float f_33_) {
		try {
			anInt6673++;
			if (i != -4957)
				((Class33_Sub2) this).aFloat6678 = -0.034086864F;
			return (((Class33_Sub2) this).aFloat6693 + (f_33_
					* ((Class33_Sub2) this).aFloat6676 + (f
					* ((Class33_Sub2) this).aFloat6651 + ((Class33_Sub2) this).aFloat6661
					* f_32_)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.P(" + i + ',' + f
					+ ',' + f_32_ + ',' + f_33_ + ')'));
		}
	}

	final Class33 method292() {
		try {
			anInt6683++;
			Class33_Sub2 class33_sub2_34_ = new Class33_Sub2();
			((Class33_Sub2) class33_sub2_34_).aFloat6682 = ((Class33_Sub2) this).aFloat6682;
			((Class33_Sub2) class33_sub2_34_).aFloat6651 = ((Class33_Sub2) this).aFloat6651;
			((Class33_Sub2) class33_sub2_34_).aFloat6653 = ((Class33_Sub2) this).aFloat6653;
			((Class33_Sub2) class33_sub2_34_).aFloat6678 = ((Class33_Sub2) this).aFloat6678;
			((Class33_Sub2) class33_sub2_34_).aFloat6666 = ((Class33_Sub2) this).aFloat6666;
			((Class33_Sub2) class33_sub2_34_).aFloat6676 = ((Class33_Sub2) this).aFloat6676;
			((Class33_Sub2) class33_sub2_34_).aFloat6693 = ((Class33_Sub2) this).aFloat6693;
			((Class33_Sub2) class33_sub2_34_).aFloat6691 = ((Class33_Sub2) this).aFloat6691;
			((Class33_Sub2) class33_sub2_34_).aFloat6679 = ((Class33_Sub2) this).aFloat6679;
			((Class33_Sub2) class33_sub2_34_).aFloat6697 = ((Class33_Sub2) this).aFloat6697;
			((Class33_Sub2) class33_sub2_34_).aFloat6655 = ((Class33_Sub2) this).aFloat6655;
			((Class33_Sub2) class33_sub2_34_).aFloat6661 = ((Class33_Sub2) this).aFloat6661;
			return class33_sub2_34_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.O(" + ')');
		}
	}

	final void method303(int i) {
		try {
			anInt6658++;
			float f = Class103.aFloatArray1373[0x3fff & i];
			float f_35_ = Class103.aFloatArray1370[0x3fff & i];
			float f_36_ = ((Class33_Sub2) this).aFloat6678;
			float f_37_ = ((Class33_Sub2) this).aFloat6682;
			float f_38_ = ((Class33_Sub2) this).aFloat6691;
			float f_39_ = ((Class33_Sub2) this).aFloat6653;
			((Class33_Sub2) this).aFloat6678 = -(f_35_ * ((Class33_Sub2) this).aFloat6666)
					+ f_36_ * f;
			((Class33_Sub2) this).aFloat6666 = f_36_ * f_35_ + f
					* ((Class33_Sub2) this).aFloat6666;
			((Class33_Sub2) this).aFloat6682 = f * f_37_ - f_35_
					* ((Class33_Sub2) this).aFloat6655;
			((Class33_Sub2) this).aFloat6691 = f_38_ * f
					- ((Class33_Sub2) this).aFloat6679 * f_35_;
			((Class33_Sub2) this).aFloat6655 = f_35_ * f_37_
					+ ((Class33_Sub2) this).aFloat6655 * f;
			((Class33_Sub2) this).aFloat6679 = f
					* ((Class33_Sub2) this).aFloat6679 + f_35_ * f_38_;
			((Class33_Sub2) this).aFloat6653 = f * f_39_
					- ((Class33_Sub2) this).aFloat6697 * f_35_;
			((Class33_Sub2) this).aFloat6697 = ((Class33_Sub2) this).aFloat6697
					* f + f_39_ * f_35_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.D(" + i + ')');
		}
	}

	final float[] method2752(float[] fs, int i) {
		try {
			fs[5] = ((Class33_Sub2) this).aFloat6682;
			fs[15] = 1.0F;
			fs[0] = ((Class33_Sub2) this).aFloat6651;
			fs[8] = ((Class33_Sub2) this).aFloat6676;
			fs[11] = 0.0F;
			fs[12] = ((Class33_Sub2) this).aFloat6693;
			fs[10] = ((Class33_Sub2) this).aFloat6679;
			anInt6667++;
			fs[13] = ((Class33_Sub2) this).aFloat6653;
			fs[14] = ((Class33_Sub2) this).aFloat6697;
			fs[6] = ((Class33_Sub2) this).aFloat6655;
			fs[1] = ((Class33_Sub2) this).aFloat6678;
			fs[3] = 0.0F;
			fs[4] = ((Class33_Sub2) this).aFloat6661;
			int i_40_ = -1 % ((61 - i) / 45);
			fs[2] = ((Class33_Sub2) this).aFloat6666;
			fs[7] = 0.0F;
			fs[9] = ((Class33_Sub2) this).aFloat6691;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.MA("
					+ (fs != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method294(int i, int i_41_, int i_42_, int[] is) {
		try {
			is[1] = (int) ((float) i_42_ * ((Class33_Sub2) this).aFloat6691 + ((float) i_41_
					* ((Class33_Sub2) this).aFloat6682 + ((Class33_Sub2) this).aFloat6678
					* (float) i));
			is[2] = (int) ((float) i_42_ * ((Class33_Sub2) this).aFloat6679 + ((float) i
					* ((Class33_Sub2) this).aFloat6666 + (((Class33_Sub2) this).aFloat6655 * (float) i_41_)));
			is[0] = (int) (((Class33_Sub2) this).aFloat6661 * (float) i_41_
					+ (float) i * ((Class33_Sub2) this).aFloat6651 + ((Class33_Sub2) this).aFloat6676
					* (float) i_42_);
			anInt6654++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.DA(" + i + ','
					+ i_41_ + ',' + i_42_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method296(Class33 class33) {
		try {
			anInt6675++;
			Class33_Sub2 class33_sub2_43_ = (Class33_Sub2) class33;
			((Class33_Sub2) this).aFloat6697 = ((Class33_Sub2) class33_sub2_43_).aFloat6697;
			((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) class33_sub2_43_).aFloat6682;
			((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) class33_sub2_43_).aFloat6653;
			((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) class33_sub2_43_).aFloat6676;
			((Class33_Sub2) this).aFloat6679 = ((Class33_Sub2) class33_sub2_43_).aFloat6679;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) class33_sub2_43_).aFloat6651;
			((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) class33_sub2_43_).aFloat6655;
			((Class33_Sub2) this).aFloat6693 = ((Class33_Sub2) class33_sub2_43_).aFloat6693;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) class33_sub2_43_).aFloat6678;
			((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) class33_sub2_43_).aFloat6661;
			((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) class33_sub2_43_).aFloat6666;
			((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) class33_sub2_43_).aFloat6691;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.C("
					+ (class33 != null ? "{...}" : "null") + ')');
		}
	}

	final void method2753(float f, float f_44_, int i, float f_45_) {
		try {
			((Class33_Sub2) this).aFloat6676 *= f;
			((Class33_Sub2) this).aFloat6682 *= f_44_;
			((Class33_Sub2) this).aFloat6693 *= f;
			((Class33_Sub2) this).aFloat6697 *= f_45_;
			((Class33_Sub2) this).aFloat6666 *= f_45_;
			((Class33_Sub2) this).aFloat6653 *= f_44_;
			if (i == 16383) {
				((Class33_Sub2) this).aFloat6655 *= f_45_;
				((Class33_Sub2) this).aFloat6661 *= f;
				((Class33_Sub2) this).aFloat6678 *= f_44_;
				((Class33_Sub2) this).aFloat6679 *= f_45_;
				((Class33_Sub2) this).aFloat6651 *= f;
				((Class33_Sub2) this).aFloat6691 *= f_44_;
				anInt6687++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.HA(" + f + ','
					+ f_44_ + ',' + i + ',' + f_45_ + ')'));
		}
	}

	final void method2754(float f, float f_46_, byte i, float f_47_) {
		try {
			((Class33_Sub2) this).aFloat6697 = f_46_;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6691 = 0.0F;
			anInt6698++;
			((Class33_Sub2) this).aFloat6653 = f_47_;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) this).aFloat6679 = 1.0F;
			((Class33_Sub2) this).aFloat6693 = f;
			int i_48_ = -75 % ((-26 - i) / 41);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.E(" + f + ','
					+ f_46_ + ',' + i + ',' + f_47_ + ')'));
		}
	}

	final float method2755(float f, float f_49_, boolean bool, float f_50_) {
		try {
			anInt6681++;
			if (bool != true)
				((Class33_Sub2) this).aFloat6691 = 0.5190241F;
			return (((Class33_Sub2) this).aFloat6653 + (f
					* ((Class33_Sub2) this).aFloat6678 + f_49_
					* ((Class33_Sub2) this).aFloat6682 + ((Class33_Sub2) this).aFloat6691
					* f_50_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.JA(" + f + ','
					+ f_49_ + ',' + bool + ',' + f_50_ + ')'));
		}
	}

	final float[] method2756(int i, float[] fs) {
		try {
			fs[2] = 0.0F;
			fs[12] = 0.0F;
			fs[0] = ((Class33_Sub2) this).aFloat6651;
			fs[7] = 0.0F;
			fs[4] = ((Class33_Sub2) this).aFloat6661;
			fs[15] = 1.0F;
			fs[5] = ((Class33_Sub2) this).aFloat6682;
			fs[6] = 0.0F;
			fs[1] = ((Class33_Sub2) this).aFloat6678;
			fs[11] = 0.0F;
			fs[14] = 0.0F;
			fs[3] = 0.0F;
			fs[9] = ((Class33_Sub2) this).aFloat6653;
			if (i >= -61)
				((Class33_Sub2) this).aFloat6653 = -0.42910576F;
			fs[13] = 0.0F;
			anInt6680++;
			fs[8] = ((Class33_Sub2) this).aFloat6693;
			fs[10] = ((Class33_Sub2) this).aFloat6697;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.AA(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method293(int i) {
		try {
			anInt6686++;
			float f = Class103.aFloatArray1373[i & 0x3fff];
			float f_51_ = Class103.aFloatArray1370[i & 0x3fff];
			float f_52_ = ((Class33_Sub2) this).aFloat6651;
			float f_53_ = ((Class33_Sub2) this).aFloat6661;
			float f_54_ = ((Class33_Sub2) this).aFloat6676;
			((Class33_Sub2) this).aFloat6651 = f_52_ * f
					+ ((Class33_Sub2) this).aFloat6666 * f_51_;
			float f_55_ = ((Class33_Sub2) this).aFloat6693;
			((Class33_Sub2) this).aFloat6661 = f * f_53_
					+ ((Class33_Sub2) this).aFloat6655 * f_51_;
			((Class33_Sub2) this).aFloat6666 = -(f_52_ * f_51_)
					+ ((Class33_Sub2) this).aFloat6666 * f;
			((Class33_Sub2) this).aFloat6676 = f_51_
					* ((Class33_Sub2) this).aFloat6679 + f_54_ * f;
			((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6655
					* f - f_53_ * f_51_;
			((Class33_Sub2) this).aFloat6679 = -(f_54_ * f_51_) + f
					* ((Class33_Sub2) this).aFloat6679;
			((Class33_Sub2) this).aFloat6693 = f_51_
					* ((Class33_Sub2) this).aFloat6697 + f * f_55_;
			((Class33_Sub2) this).aFloat6697 = f
					* ((Class33_Sub2) this).aFloat6697 - f_55_ * f_51_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.W(" + i + ')');
		}
	}

	final void method289() {
		try {
			anInt6690++;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) this).aFloat6693 = ((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) this).aFloat6679 = 1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.U(" + ')');
		}
	}

	final void method2757(int i) {
		try {
			((Class33_Sub2) this).aFloat6682 = -((Class33_Sub2) this).aFloat6682;
			((Class33_Sub2) this).aFloat6678 = -((Class33_Sub2) this).aFloat6678;
			((Class33_Sub2) this).aFloat6691 = -((Class33_Sub2) this).aFloat6691;
			((Class33_Sub2) this).aFloat6666 = -((Class33_Sub2) this).aFloat6666;
			((Class33_Sub2) this).aFloat6679 = -((Class33_Sub2) this).aFloat6679;
			((Class33_Sub2) this).aFloat6655 = -((Class33_Sub2) this).aFloat6655;
			((Class33_Sub2) this).aFloat6697 = -((Class33_Sub2) this).aFloat6697;
			if (i < 27)
				method295(-74, -115, -2, null);
			anInt6671++;
			((Class33_Sub2) this).aFloat6653 = -((Class33_Sub2) this).aFloat6653;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.LA(" + i + ')');
		}
	}

	final void method299(int i, int i_56_, int i_57_) {
		try {
			((Class33_Sub2) this).aFloat6697 += (float) i_57_;
			anInt6692++;
			((Class33_Sub2) this).aFloat6693 += (float) i;
			((Class33_Sub2) this).aFloat6653 += (float) i_56_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.V(" + i + ','
					+ i_56_ + ',' + i_57_ + ')'));
		}
	}

	final float[] method2758(int i, float[] fs) {
		try {
			fs[12] = 0.0F;
			fs[13] = 0.0F;
			fs[2] = ((Class33_Sub2) this).aFloat6676;
			fs[0] = ((Class33_Sub2) this).aFloat6651;
			fs[4] = ((Class33_Sub2) this).aFloat6678;
			fs[5] = ((Class33_Sub2) this).aFloat6682;
			fs[10] = ((Class33_Sub2) this).aFloat6679;
			fs[11] = ((Class33_Sub2) this).aFloat6697;
			fs[3] = ((Class33_Sub2) this).aFloat6693;
			fs[15] = 1.0F;
			fs[8] = ((Class33_Sub2) this).aFloat6666;
			fs[14] = 0.0F;
			anInt6672++;
			fs[6] = ((Class33_Sub2) this).aFloat6691;
			fs[9] = ((Class33_Sub2) this).aFloat6655;
			fs[7] = ((Class33_Sub2) this).aFloat6653;
			int i_58_ = 38 / ((i + 21) / 42);
			fs[1] = ((Class33_Sub2) this).aFloat6661;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.J(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method286(int i) {
		try {
			anInt6659++;
			((Class33_Sub2) this).aFloat6651 = 1.0F;
			((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) this).aFloat6679 = Class103.aFloatArray1373[0x3fff & i];
			((Class33_Sub2) this).aFloat6655 = Class103.aFloatArray1370[0x3fff & i];
			((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6693 = ((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6653 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6691 = -((Class33_Sub2) this).aFloat6655;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.GA(" + i + ')');
		}
	}

	final void method2759(float f, int i, float f_59_, float f_60_) {
		try {
			((Class33_Sub2) this).aFloat6678 = 0.0F;
			((Class33_Sub2) this).aFloat6682 = f;
			((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6661 = 0.0F;
			((Class33_Sub2) this).aFloat6666 = 0.0F;
			((Class33_Sub2) this).aFloat6651 = f_59_;
			((Class33_Sub2) this).aFloat6655 = 0.0F;
			((Class33_Sub2) this).aFloat6691 = (float) i;
			((Class33_Sub2) this).aFloat6679 = f_60_;
			anInt6662++;
			((Class33_Sub2) this).aFloat6693 = 0.0F;
			((Class33_Sub2) this).aFloat6676 = 0.0F;
			((Class33_Sub2) this).aFloat6653 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.NA(" + f + ','
					+ i + ',' + f_59_ + ',' + f_60_ + ')'));
		}
	}

	final void method302(int[] is) {
		try {
			anInt6674++;
			float f = (float) is[0] - ((Class33_Sub2) this).aFloat6693;
			float f_61_ = -((Class33_Sub2) this).aFloat6653 + (float) is[1];
			float f_62_ = (float) is[2] - ((Class33_Sub2) this).aFloat6697;
			is[1] = (int) (f * ((Class33_Sub2) this).aFloat6661
					+ ((Class33_Sub2) this).aFloat6682 * f_61_ + ((Class33_Sub2) this).aFloat6655
					* f_62_);
			is[0] = (int) (f_62_ * ((Class33_Sub2) this).aFloat6666 + (f
					* ((Class33_Sub2) this).aFloat6651 + ((Class33_Sub2) this).aFloat6678
					* f_61_));
			is[2] = (int) (f_61_ * ((Class33_Sub2) this).aFloat6691 + f
					* ((Class33_Sub2) this).aFloat6676 + ((Class33_Sub2) this).aFloat6679
					* f_62_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.R("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method2760(boolean bool, float f, float f_63_, float f_64_,
			float f_65_, float f_66_, float f_67_, float f_68_, float f_69_,
			float f_70_) {
		try {
			if (bool != false)
				method2748((byte) 111, 1.0424649F, 0.0048279166F, -2.006061F,
						null);
			((Class33_Sub2) this).aFloat6655 = f;
			((Class33_Sub2) this).aFloat6676 = f_66_;
			((Class33_Sub2) this).aFloat6679 = f_65_;
			((Class33_Sub2) this).aFloat6682 = f_67_;
			((Class33_Sub2) this).aFloat6691 = f_63_;
			anInt6657++;
			((Class33_Sub2) this).aFloat6651 = f_69_;
			((Class33_Sub2) this).aFloat6693 = 0.0F;
			((Class33_Sub2) this).aFloat6653 = 0.0F;
			((Class33_Sub2) this).aFloat6666 = f_64_;
			((Class33_Sub2) this).aFloat6661 = f_70_;
			((Class33_Sub2) this).aFloat6697 = 0.0F;
			((Class33_Sub2) this).aFloat6678 = f_68_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ofa.CA(" + bool + ',' + f + ',' + f_63_ + ',' + f_64_
							+ ',' + f_65_ + ',' + f_66_ + ',' + f_67_ + ','
							+ f_68_ + ',' + f_69_ + ',' + f_70_ + ')'));
		}
	}

	final void method295(int i, int i_71_, int i_72_, int[] is) {
		try {
			anInt6668++;
			is[2] = (int) ((float) i * ((Class33_Sub2) this).aFloat6666
					+ (float) i_71_ * ((Class33_Sub2) this).aFloat6655
					+ ((Class33_Sub2) this).aFloat6679 * (float) i_72_ + ((Class33_Sub2) this).aFloat6697);
			is[1] = (int) (((Class33_Sub2) this).aFloat6682 * (float) i_71_
					+ (float) i * ((Class33_Sub2) this).aFloat6678
					+ (float) i_72_ * ((Class33_Sub2) this).aFloat6691 + ((Class33_Sub2) this).aFloat6653);
			is[0] = (int) ((float) i_72_
					* ((Class33_Sub2) this).aFloat6676
					+ ((float) i * ((Class33_Sub2) this).aFloat6651 + (float) i_71_
							* ((Class33_Sub2) this).aFloat6661) + ((Class33_Sub2) this).aFloat6693);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.BA(" + i + ','
					+ i_71_ + ',' + i_72_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2761(byte i, float[] fs) {
		try {
			anInt6699++;
			if (i < 6)
				((Class33_Sub2) this).aFloat6651 = -1.406823F;
			fs[4] = ((Class33_Sub2) this).aFloat6678;
			fs[1] = ((Class33_Sub2) this).aFloat6661;
			fs[6] = ((Class33_Sub2) this).aFloat6691;
			fs[3] = ((Class33_Sub2) this).aFloat6693;
			fs[2] = ((Class33_Sub2) this).aFloat6676;
			fs[0] = ((Class33_Sub2) this).aFloat6651;
			fs[7] = ((Class33_Sub2) this).aFloat6653;
			fs[5] = ((Class33_Sub2) this).aFloat6682;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.N(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2762(int i, Class33 class33) {
		try {
			anInt6677++;
			Class33_Sub2 class33_sub2_73_ = (Class33_Sub2) class33;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) class33_sub2_73_).aFloat6651;
			((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) class33_sub2_73_).aFloat6666;
			((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) class33_sub2_73_).aFloat6678;
			((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) class33_sub2_73_).aFloat6682;
			((Class33_Sub2) this).aFloat6691 = ((Class33_Sub2) class33_sub2_73_).aFloat6655;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) class33_sub2_73_).aFloat6661;
			if (i == 30188) {
				((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) class33_sub2_73_).aFloat6676;
				((Class33_Sub2) this).aFloat6693 = -((((Class33_Sub2) class33_sub2_73_).aFloat6693 * ((Class33_Sub2) this).aFloat6651)
						+ (((Class33_Sub2) this).aFloat6661 * ((Class33_Sub2) class33_sub2_73_).aFloat6653) + (((Class33_Sub2) class33_sub2_73_).aFloat6697 * ((Class33_Sub2) this).aFloat6676));
				((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) class33_sub2_73_).aFloat6691;
				((Class33_Sub2) this).aFloat6679 = ((Class33_Sub2) class33_sub2_73_).aFloat6679;
				((Class33_Sub2) this).aFloat6653 = -((((Class33_Sub2) class33_sub2_73_).aFloat6697 * ((Class33_Sub2) this).aFloat6691) + ((((Class33_Sub2) this).aFloat6678 * ((Class33_Sub2) class33_sub2_73_).aFloat6693) + (((Class33_Sub2) class33_sub2_73_).aFloat6653 * ((Class33_Sub2) this).aFloat6682)));
				((Class33_Sub2) this).aFloat6697 = -((((Class33_Sub2) this).aFloat6655 * ((Class33_Sub2) class33_sub2_73_).aFloat6653)
						+ (((Class33_Sub2) this).aFloat6666 * ((Class33_Sub2) class33_sub2_73_).aFloat6693) + (((Class33_Sub2) class33_sub2_73_).aFloat6697 * ((Class33_Sub2) this).aFloat6679));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.I(" + i + ','
					+ (class33 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method300(int i, int i_74_, int i_75_, int i_76_, int i_77_,
			int i_78_) {
		try {
			anInt6664++;
			float f = Class103.aFloatArray1373[i_76_ & 0x3fff];
			float f_79_ = Class103.aFloatArray1370[0x3fff & i_76_];
			float f_80_ = Class103.aFloatArray1373[0x3fff & i_77_];
			float f_81_ = Class103.aFloatArray1370[i_77_ & 0x3fff];
			float f_82_ = Class103.aFloatArray1373[0x3fff & i_78_];
			float f_83_ = Class103.aFloatArray1370[i_78_ & 0x3fff];
			float f_84_ = f_79_ * f_82_;
			float f_85_ = f_83_ * f_79_;
			((Class33_Sub2) this).aFloat6691 = f_80_ * f_84_ + f_83_ * f_81_;
			((Class33_Sub2) this).aFloat6655 = -f_79_;
			((Class33_Sub2) this).aFloat6666 = f * f_81_;
			((Class33_Sub2) this).aFloat6661 = f * f_83_;
			((Class33_Sub2) this).aFloat6676 = -f_81_ * f_82_ + f_80_ * f_85_;
			((Class33_Sub2) this).aFloat6682 = f * f_82_;
			((Class33_Sub2) this).aFloat6651 = f_81_ * f_85_ + f_80_ * f_82_;
			((Class33_Sub2) this).aFloat6679 = f * f_80_;
			((Class33_Sub2) this).aFloat6678 = -f_80_ * f_83_ + f_81_ * f_84_;
			((Class33_Sub2) this).aFloat6693 = ((float) -i
					* ((Class33_Sub2) this).aFloat6651 - (float) i_74_
					* ((Class33_Sub2) this).aFloat6661 - (float) i_75_
					* ((Class33_Sub2) this).aFloat6676);
			((Class33_Sub2) this).aFloat6697 = ((float) -i
					* ((Class33_Sub2) this).aFloat6666 - (float) i_74_
					* ((Class33_Sub2) this).aFloat6655 - (float) i_75_
					* ((Class33_Sub2) this).aFloat6679);
			((Class33_Sub2) this).aFloat6653 = (-((float) i_74_ * ((Class33_Sub2) this).aFloat6682)
					+ (float) -i * ((Class33_Sub2) this).aFloat6678 - (float) i_75_
					* ((Class33_Sub2) this).aFloat6691);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.S(" + i + ','
					+ i_74_ + ',' + i_75_ + ',' + i_76_ + ',' + i_77_ + ','
					+ i_78_ + ')'));
		}
	}

	final void method2763(float f, int i, float f_86_, float f_87_,
			float f_88_, float[] fs) {
		try {
			anInt6665++;
			fs[2] = (((Class33_Sub2) this).aFloat6655 * f_87_
					+ ((Class33_Sub2) this).aFloat6666 * f_88_ + ((Class33_Sub2) this).aFloat6679
					* f_86_);
			fs[i] = (f_86_ * ((Class33_Sub2) this).aFloat6676 + (((Class33_Sub2) this).aFloat6661
					* f_87_ + f_88_ * ((Class33_Sub2) this).aFloat6651));
			float f_89_;
			float f_90_;
			float f_91_;
			if (!(f_88_ > 0.00390625F) && !(f_88_ < -0.00390625F)) {
				if (!(f_87_ > 0.00390625F) && !(f_87_ < -0.00390625F)) {
					float f_92_ = -f / f_86_;
					f_89_ = (((Class33_Sub2) this).aFloat6679 * f_92_ + ((Class33_Sub2) this).aFloat6697);
					f_90_ = (((Class33_Sub2) this).aFloat6653 + ((Class33_Sub2) this).aFloat6691
							* f_92_);
					f_91_ = (((Class33_Sub2) this).aFloat6676 * f_92_ + ((Class33_Sub2) this).aFloat6693);
				} else {
					float f_93_ = -f / f_87_;
					f_91_ = (((Class33_Sub2) this).aFloat6693 + ((Class33_Sub2) this).aFloat6661
							* f_93_);
					f_89_ = (f_93_ * ((Class33_Sub2) this).aFloat6655 + ((Class33_Sub2) this).aFloat6697);
					f_90_ = (((Class33_Sub2) this).aFloat6653 + f_93_
							* ((Class33_Sub2) this).aFloat6682);
				}
			} else {
				float f_94_ = -f / f_88_;
				f_89_ = (((Class33_Sub2) this).aFloat6697 + f_94_
						* ((Class33_Sub2) this).aFloat6666);
				f_90_ = (f_94_ * ((Class33_Sub2) this).aFloat6678 + ((Class33_Sub2) this).aFloat6653);
				f_91_ = (((Class33_Sub2) this).aFloat6693 + ((Class33_Sub2) this).aFloat6651
						* f_94_);
			}
			fs[1] = (f_88_ * ((Class33_Sub2) this).aFloat6678
					+ ((Class33_Sub2) this).aFloat6682 * f_87_ + ((Class33_Sub2) this).aFloat6691
					* f_86_);
			fs[3] = -(fs[2] * f_89_ + (fs[0] * f_91_ + f_90_ * fs[1]));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.FA(" + f + ','
					+ i + ',' + f_86_ + ',' + f_87_ + ',' + f_88_ + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	final float[] method2764(int i, float[] fs) {
		try {
			fs[5] = ((Class33_Sub2) this).aFloat6682;
			fs[13] = 0.0F;
			fs[0] = ((Class33_Sub2) this).aFloat6651;
			if (i > -79)
				method2746(null, null);
			fs[9] = ((Class33_Sub2) this).aFloat6655;
			fs[11] = 0.0F;
			fs[12] = 0.0F;
			fs[2] = ((Class33_Sub2) this).aFloat6676;
			fs[4] = ((Class33_Sub2) this).aFloat6678;
			fs[14] = 0.0F;
			fs[3] = 0.0F;
			fs[8] = ((Class33_Sub2) this).aFloat6666;
			fs[10] = ((Class33_Sub2) this).aFloat6679;
			anInt6685++;
			fs[15] = 0.0F;
			fs[1] = ((Class33_Sub2) this).aFloat6661;
			fs[7] = 0.0F;
			fs[6] = ((Class33_Sub2) this).aFloat6691;
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.H(" + i + ','
					+ (fs != null ? "{...}" : "null") + ')'));
		}
	}

	public Class33_Sub2() {
		try {
			method289();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ofa.<init>(" + ')');
		}
	}

	final void method301(int i, int i_95_, int i_96_) {
		try {
			((Class33_Sub2) this).aFloat6697 = (float) i_96_;
			((Class33_Sub2) this).aFloat6651 = ((Class33_Sub2) this).aFloat6682 = ((Class33_Sub2) this).aFloat6679 = 1.0F;
			((Class33_Sub2) this).aFloat6678 = ((Class33_Sub2) this).aFloat6666 = ((Class33_Sub2) this).aFloat6661 = ((Class33_Sub2) this).aFloat6655 = ((Class33_Sub2) this).aFloat6676 = ((Class33_Sub2) this).aFloat6691 = 0.0F;
			((Class33_Sub2) this).aFloat6653 = (float) i_95_;
			anInt6649++;
			((Class33_Sub2) this).aFloat6693 = (float) i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ofa.Q(" + i + ','
					+ i_95_ + ',' + i_96_ + ')'));
		}
	}
}
