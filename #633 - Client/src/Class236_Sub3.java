/* Class236_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub3 extends Class236 {
	static int anInt6240;
	static int anInt6241;
	private Class337 aClass337_6242;
	private Class299 aClass299_6243;
	static int anInt6244;
	static int anInt6245;
	static int anInt6246;
	static int anInt6247;
	static int anInt6248;
	static int anInt6249;
	static int anInt6250;
	private Class321_Sub4 aClass321_Sub4_6251;
	static int anInt6252;
	static int anInt6253;
	static int anInt6254;

	static final int method2647(int i) {
		try {
			anInt6241++;
			if ((Class277.anInt3746 ^ 0xffffffff) == -1) {
				Class259.aClass259_3544.method1657(new Class76("jaclib"),
						(byte) 69);
				if (Class259.aClass259_3544.method1659(true).method30(6340) != 100)
					return 1;
				if (!((Class76) Class259.aClass259_3544.method1659(true))
						.method526((byte) 49))
					Class11_Sub2_Sub23.aclient9263.method3994(-12362);
				Class277.anInt3746 = 1;
			}
			if ((Class277.anInt3746 ^ 0xffffffff) == -2) {
				Class144.aClass259Array1943 = Class259.method1656(false);
				Class259.aClass259_3542.method1657(new Class222(
						Class11_Sub49.aClass146_8012), (byte) 127);
				Class259.aClass259_3545.method1657(new Class76("jaggl"),
						(byte) 60);
				Class259.aClass259_3546.method1657(new Class76("jagdx"),
						(byte) 29);
				Class259.aClass259_3547.method1657(new Class76("jagmisc"),
						(byte) 49);
				Class259.aClass259_3548.method1657(new Class76("sw3d"),
						(byte) 30);
				Class259.aClass259_3549.method1657(new Class76("hw3d"),
						(byte) 96);
				Class259.aClass259_3550.method1657(new Class76("jagtheora"),
						(byte) 98);
				Class259.aClass259_3551.method1657(new Class222(
						Class11_Sub31.aClass146_6703), (byte) 60);
				Class259.aClass259_3552.method1657(new Class222(
						Class11_Sub45_Sub19.aClass146_9707), (byte) 95);
				Class259.aClass259_3553.method1657(new Class222(
						Class11_Sub2_Sub15.aClass146_9023), (byte) 28);
				Class259.aClass259_3554.method1657(new Class222(
						Class308.aClass146_4128), (byte) 118);
				Class259.aClass259_3555.method1657(new Class222(
						Class108_Sub1.aClass146_5026), (byte) 33);
				Class259.aClass259_3556.method1657(new Class222(
						Class131.aClass146_1825), (byte) 122);
				Class259.aClass259_3557.method1657(new Class222(
						Class47.aClass146_744), (byte) 47);
				Class259.aClass259_3558.method1657(new Class222(
						Class217_Sub1.aClass146_5538), (byte) 59);
				Class259.aClass259_3559.method1657(new Class222(
						Class256_Sub1.aClass146_5323), (byte) 89);
				Class259.aClass259_3560.method1657(new Class222(
						Class287.aClass146_3887), (byte) 63);
				Class259.aClass259_3561.method1657(new Class222(
						Class234_Sub2.aClass146_5987), (byte) 71);
				Class259.aClass259_3562.method1657(new Class222(
						Class11_Sub45_Sub11.aClass146_9165), (byte) 39);
				Class259.aClass259_3563.method1657(new Class222(
						Class2.aClass146_15), (byte) 120);
				Class259.aClass259_3564.method1657(new Class222(
						Class216.aClass146_2987), (byte) 105);
				Class259.aClass259_3565.method1657(new Class4(
						Class194.aClass146_2640, "huffman"), (byte) 95);
				Class259.aClass259_3566.method1657(new Class222(
						Class282.aClass146_3824), (byte) 114);
				Class259.aClass259_3567.method1657(new Class222(
						Class335.aClass146_4433), (byte) 107);
				Class259.aClass259_3568.method1657(new Class222(
						Class11_Sub18.aClass146_5781), (byte) 110);
				Class259.aClass259_3569.method1657(new Class200(
						Class11_Sub2_Sub30.aClass146_9618, "details"),
						(byte) 117);
				for (int i_0_ = 0; Class144.aClass259Array1943.length > i_0_; i_0_++) {
					if (Class144.aClass259Array1943[i_0_].method1659(true) == null)
						throw new RuntimeException();
				}
				int i_1_ = 0;
				Class259[] class259s = Class144.aClass259Array1943;
				for (int i_2_ = 0; (class259s.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
					Class259 class259 = class259s[i_2_];
					int i_3_ = class259.method1660(0);
					int i_4_ = class259.method1659(true).method30(6340);
					i_1_ += i_3_ * i_4_ / 100;
				}
				Class277.anInt3746 = 2;
				Class259.anInt3570 = i_1_;
			}
			if (Class144.aClass259Array1943 == null)
				return 100;
			int i_5_ = 0;
			int i_6_ = 0;
			boolean bool = true;
			Class259[] class259s = Class144.aClass259Array1943;
			if (i > -86)
				return 58;
			for (int i_7_ = 0; i_7_ < class259s.length; i_7_++) {
				Class259 class259 = class259s[i_7_];
				int i_8_ = class259.method1660(0);
				int i_9_ = class259.method1659(true).method30(6340);
				if (i_9_ < 100)
					bool = false;
				i_5_ += i_8_;
				i_6_ += i_9_ * i_8_ / 100;
			}
			if (bool) {
				if (!((Class76) Class259.aClass259_3547.method1659(true))
						.method526((byte) -127))
					Class11_Sub2_Sub23.aclient9263.method3996(-1);
				if (!((Class76) Class259.aClass259_3550.method1659(true))
						.method526((byte) 57))
					Class254_Sub2.aBool6994 = Class11_Sub2_Sub23.aclient9263
							.method3984(0);
				Class144.aClass259Array1943 = null;
			}
			i_5_ -= Class259.anInt3570;
			i_6_ -= Class259.anInt3570;
			int i_10_ = i_5_ > 0 ? 100 * i_6_ / i_5_ : 100;
			if (!bool && (i_10_ ^ 0xffffffff) < -100)
				i_10_ = 99;
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.L(" + i + ')');
		}
	}

	final void method1505(boolean bool, boolean bool_11_) {
		try {
			if ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8323) > 0) {
				float f = -0.5F
						/ (float) (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8323);
				((Class236) this).aClass163_Sub3_3222.method3253(1, bool);
				Class363.aFloatArray4730[0] = 0.0F;
				Class363.aFloatArray4730[2] = f;
				Class363.aFloatArray4730[3] = 0.25F
						+ (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aFloat8412)
						* f;
				Class363.aFloatArray4730[1] = 0.0F;
				OpenGL.glPushMatrix();
				OpenGL.glLoadIdentity();
				OpenGL.glTexGenfv(8192, 9474, Class363.aFloatArray4730, 0);
				OpenGL.glPopMatrix();
				((Class236) this).aClass163_Sub3_3222
						.method3259(
								(float) ((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8323,
								-11757, 0.5F);
				((Class236) this).aClass163_Sub3_3222.method3295(
						aClass321_Sub4_6251, 102);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			}
			anInt6252++;
			aClass337_6242.method2026(-26, '\0');
			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			if (bool == true) {
				OpenGL.glScalef(0.25F, 0.25F, 1.0F);
				OpenGL.glMatrixMode(5888);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.H(" + bool + ','
					+ bool_11_ + ')');
		}
	}

	static final void method2648(int i) {
		try {
			anInt6247++;
			for (int i_12_ = i; i_12_ < Class11_Sub30.anInt6612; i_12_++)
				Class11_Sub2_Sub28.aClass203Array9423[i_12_] = null;
			Class11_Sub30.anInt6612 = 0;
			for (int i_13_ = 0; (Class155.anInt2044 ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_13_++) {
				for (int i_14_ = 0; Class138.anInt1886 > i_14_; i_14_++) {
					for (int i_15_ = 0; Class82.anInt1133 > i_15_; i_15_++) {
						Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i_13_][i_15_][i_14_]);
						if (class364 != null) {
							if (((Class364) class364).aShort4787 > 0)
								((Class364) class364).aShort4787 *= -1;
							if ((((Class364) class364).aShort4784 ^ 0xffffffff) < -1)
								((Class364) class364).aShort4784 *= -1;
						}
					}
				}
			}
			for (int i_16_ = 0; i_16_ < Class155.anInt2044; i_16_++) {
				for (int i_17_ = 0; Class138.anInt1886 > i_17_; i_17_++) {
					for (int i_18_ = 0; ((Class82.anInt1133 ^ 0xffffffff) < (i_18_ ^ 0xffffffff)); i_18_++) {
						Class364 class364 = (Class181.aClass364ArrayArrayArray2336[i_16_][i_18_][i_17_]);
						if (class364 != null) {
							boolean bool = ((Class181.aClass364ArrayArrayArray2336[0][i_18_][i_17_]) != null && (((Class364) (Class181.aClass364ArrayArrayArray2336[0][i_18_][i_17_])).aClass364_4783 != null));
							if ((((Class364) class364).aShort4784 ^ 0xffffffff) > -1) {
								int i_19_ = i_17_;
								int i_20_ = i_17_;
								int i_21_ = i_16_;
								int i_22_ = i_16_;
								Class364 class364_23_ = (Class181.aClass364ArrayArrayArray2336[i_16_][i_18_][i_19_ - 1]);
								int i_24_;
								for (i_24_ = (Class11_Sub2_Sub38.aClass12Array9796[i_16_]
										.method131((byte) -10, i_17_, i_18_)); (i_19_ > 0
										&& class364_23_ != null
										&& (((Class364) class364_23_).aShort4784 ^ 0xffffffff) > -1
										&& ((((Class364) class364_23_).aShort4784 ^ 0xffffffff) == (((Class364) class364).aShort4784 ^ 0xffffffff))
										&& ((((Class364) class364_23_).aShort4786 ^ 0xffffffff) == (((Class364) class364).aShort4786 ^ 0xffffffff)) && i_24_ == (Class11_Sub2_Sub38.aClass12Array9796[i_16_]
											.method131((byte) 124, i_19_ - 1,
													i_18_))); class364_23_ = (Class181.aClass364ArrayArrayArray2336[i_16_][i_18_][-1
										+ i_19_])) {
									if (i_19_ - 1 > 0
											&& i_24_ != (Class11_Sub2_Sub38.aClass12Array9796[i_16_]
													.method131((byte) 49, -2
															+ i_19_, i_18_)))
										break;
									i_19_--;
								}
								for (class364_23_ = (Class181.aClass364ArrayArrayArray2336[i_16_][i_18_][1 + i_20_]); (((Class82.anInt1133 ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
										&& class364_23_ != null
										&& (((Class364) class364_23_).aShort4784 ^ 0xffffffff) > -1
										&& (((Class364) class364_23_).aShort4784 == ((Class364) class364).aShort4784)
										&& (((Class364) class364_23_).aShort4786 == ((Class364) class364).aShort4786) && (((Class11_Sub2_Sub38.aClass12Array9796[i_16_]
										.method131((byte) 126, i_20_ + 1, i_18_)) ^ 0xffffffff) == (i_24_ ^ 0xffffffff))); class364_23_ = (Class181.aClass364ArrayArrayArray2336[i_16_][i_18_][1 + i_20_])) {
									if (Class82.anInt1133 > 1 + i_20_
											&& (((Class11_Sub2_Sub38.aClass12Array9796[i_16_]
													.method131((byte) -26,
															i_20_ + 2, i_18_)) ^ 0xffffffff) != (i_24_ ^ 0xffffffff)))
										break;
									i_20_++;
								}
								int i_25_ = 1 + (i_22_ + -i_21_);
								int i_26_ = Class11_Sub2_Sub38.aClass12Array9796[!bool ? i_21_
										: 1 + i_21_].method131((byte) 121,
										i_19_, i_18_);
								int i_27_ = (i_25_
										* ((Class364) class364).aShort4784 + i_26_);
								int i_28_ = (Class11_Sub2_Sub38.aClass12Array9796[!bool ? i_21_
										: 1 + i_21_].method131((byte) 122,
										1 + i_20_, i_18_));
								int i_29_ = i_28_ + i_25_
										* (((Class364) class364).aShort4784);
								int i_30_ = i_18_ << Class11_Sub2_Sub8.anInt8751;
								int i_31_ = i_19_ << Class11_Sub2_Sub8.anInt8751;
								int i_32_ = ((i_20_ << Class11_Sub2_Sub8.anInt8751) + Class376_Sub7_Sub3_Sub2.anInt10141);
								Class11_Sub2_Sub28.aClass203Array9423[Class11_Sub30.anInt6612++] = (new Class203(
										1,
										i_22_,
										(((Class364) class364).aShort4786 + i_30_),
										(i_30_ - -((Class364) class364).aShort4786),
										(i_30_ + ((Class364) class364).aShort4786),
										(i_30_ + ((Class364) class364).aShort4786),
										i_26_, i_28_, i_29_, i_27_, i_31_,
										i_32_, i_32_, i_31_));
								for (int i_33_ = i_21_; i_33_ <= i_22_; i_33_++) {
									for (int i_34_ = i_19_; i_20_ >= i_34_; i_34_++)
										((Class364) (Class181.aClass364ArrayArrayArray2336[i_33_][i_18_][i_34_])).aShort4784 *= -1;
								}
							}
							if ((((Class364) class364).aShort4787 ^ 0xffffffff) > -1) {
								int i_35_ = i_18_;
								int i_36_ = i_18_;
								int i_37_ = i_16_;
								int i_38_ = i_16_;
								Class364 class364_39_ = (Class181.aClass364ArrayArrayArray2336[i_16_][-1
										+ i_35_][i_17_]);
								int i_40_;
								for (i_40_ = (Class11_Sub2_Sub38.aClass12Array9796[i_16_]
										.method131((byte) 124, i_17_, i_18_)); ((i_35_ ^ 0xffffffff) < -1
										&& class364_39_ != null
										&& (((Class364) class364_39_).aShort4787 ^ 0xffffffff) > -1
										&& (((Class364) class364).aShort4787 == (((Class364) class364_39_).aShort4787))
										&& (((Class364) class364).aShort4788 == (((Class364) class364_39_).aShort4788)) && ((Class11_Sub2_Sub38.aClass12Array9796[i_16_]
											.method131((byte) 123, i_17_,
													i_35_ - 1)) == i_40_)); class364_39_ = (Class181.aClass364ArrayArrayArray2336[i_16_][-1
										+ i_35_][i_17_])) {
									if (-1 + i_35_ > 0
											&& i_40_ != (Class11_Sub2_Sub38.aClass12Array9796[i_16_]
													.method131((byte) -31,
															i_17_, i_35_ - 2)))
										break;
									i_35_--;
								}
								for (class364_39_ = (Class181.aClass364ArrayArrayArray2336[i_16_][i_36_ + 1][i_17_]); (Class138.anInt1886 > i_36_
										&& class364_39_ != null
										&& (((Class364) class364_39_).aShort4787 ^ 0xffffffff) > -1
										&& (((Class364) class364).aShort4787 == (((Class364) class364_39_).aShort4787))
										&& ((((Class364) class364_39_).aShort4788 ^ 0xffffffff) == (((Class364) class364).aShort4788 ^ 0xffffffff)) && ((Class11_Sub2_Sub38.aClass12Array9796[i_16_]
											.method131((byte) 124, i_17_,
													1 + i_36_)) == i_40_)); class364_39_ = (Class181.aClass364ArrayArrayArray2336[i_16_][1 + i_36_][i_17_])) {
									if (i_36_ + 1 < Class138.anInt1886
											&& ((i_40_ ^ 0xffffffff) != ((Class11_Sub2_Sub38.aClass12Array9796[i_16_]
													.method131((byte) 127,
															i_17_, i_36_ + 2)) ^ 0xffffffff)))
										break;
									i_36_++;
								}
								int i_41_ = 1 + i_38_ + -i_37_;
								int i_42_ = Class11_Sub2_Sub38.aClass12Array9796[!bool ? i_37_
										: i_37_ + 1].method131((byte) 123,
										i_17_, i_35_);
								int i_43_ = (i_41_
										* ((Class364) class364).aShort4787 + i_42_);
								int i_44_ = (Class11_Sub2_Sub38.aClass12Array9796[!bool ? i_37_
										: i_37_ + 1].method131((byte) -92,
										i_17_, i_36_ + 1));
								int i_45_ = i_44_
										- -(i_41_ * (((Class364) class364).aShort4787));
								int i_46_ = i_35_ << Class11_Sub2_Sub8.anInt8751;
								int i_47_ = ((i_36_ << Class11_Sub2_Sub8.anInt8751) - -Class376_Sub7_Sub3_Sub2.anInt10141);
								int i_48_ = i_17_ << Class11_Sub2_Sub8.anInt8751;
								Class11_Sub2_Sub28.aClass203Array9423[Class11_Sub30.anInt6612++] = (new Class203(
										2,
										i_38_,
										i_46_,
										i_47_,
										i_47_,
										i_46_,
										i_42_,
										i_44_,
										i_45_,
										i_43_,
										(i_48_ - -((Class364) class364).aShort4788),
										(i_48_ + ((Class364) class364).aShort4788),
										(((Class364) class364).aShort4788 + i_48_),
										i_48_
												- -(((Class364) class364).aShort4788)));
								for (int i_49_ = i_37_; ((i_38_ ^ 0xffffffff) <= (i_49_ ^ 0xffffffff)); i_49_++) {
									for (int i_50_ = i_35_; i_36_ >= i_50_; i_50_++)
										((Class364) (Class181.aClass364ArrayArrayArray2336[i_49_][i_50_][i_17_])).aShort4787 *= -1;
								}
							}
						}
					}
				}
			}
			Class57.aBool856 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.M(" + i + ')');
		}
	}

	final void method1504(int i, int i_51_, Class321 class321) {
		try {
			anInt6246++;
			int i_52_ = 36 % ((i_51_ - 52) / 62);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("gq.I(" + i + ',' + i_51_ + ','
							+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i != 17660)
				method2650(-101, (byte) 103, 29, 40, 98);
			anInt6249++;
			((Class236) this).aClass163_Sub3_3222.method3315(false, 260, 8448);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1506(int i, int i_53_, int i_54_) {
		try {
			anInt6254++;
			if (i_53_ >= 72) {
				if ((i & 0x1 ^ 0xffffffff) != -2) {
					if (((Class299) aClass299_6243).aBool4034) {
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										((Class299) aClass299_6243).aClass321_Sub2_4040,
										108);
						Class363.aFloatArray4730[0] = 0.0F;
						Class363.aFloatArray4730[1] = 0.0F;
						Class363.aFloatArray4730[2] = 0.0F;
						Class363.aFloatArray4730[3] = 0.0F;
						OpenGL.glTexGenfv(8194, 9473, Class363.aFloatArray4730,
								0);
					} else
						((Class236) this).aClass163_Sub3_3222
								.method3295(
										(((Class299) aClass299_6243).aClass321_Sub3Array4039[0]),
										75);
				} else if (!((Class299) aClass299_6243).aBool4034) {
					int i_55_ = (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273 % 4000 * 16 / 4000);
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									(((Class299) aClass299_6243).aClass321_Sub3Array4039[i_55_]),
									92);
				} else {
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									((Class299) aClass299_6243).aClass321_Sub2_4040,
									65);
					Class363.aFloatArray4730[0] = 0.0F;
					Class363.aFloatArray4730[1] = 0.0F;
					Class363.aFloatArray4730[2] = 0.0F;
					Class363.aFloatArray4730[3] = (float) ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273) % 4000) / 4000.0F;
					OpenGL.glTexGenfv(8194, 9473, Class363.aFloatArray4730, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gq.B(" + i + ','
					+ i_53_ + ',' + i_54_ + ')'));
		}
	}

	private final void method2649(int i) {
		try {
			anInt6245++;
			aClass337_6242 = new Class337(
					((Class236) this).aClass163_Sub3_3222, 2);
			aClass337_6242.method2028(0, 114);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			((Class236) this).aClass163_Sub3_3222.method3315(false, 7681, 260);
			((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0, 768,
					34168);
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glEnable(3168);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			OpenGL.glTexEnvf(8960, 34163, 2.0F);
			if (((Class299) aClass299_6243).aBool4034) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glTexGeni(8195, 9472, 9217);
				OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F,
						1.0F }, 0);
				OpenGL.glEnable(3170);
				OpenGL.glEnable(3171);
			}
			aClass337_6242.method2027(-50135600);
			if (i >= -26)
				aClass337_6242 = null;
			aClass337_6242.method2028(1, 79);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			((Class236) this).aClass163_Sub3_3222.method3315(false, 8448, 8448);
			((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0, 768,
					5890);
			OpenGL.glDisable(3168);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			OpenGL.glTexEnvf(8960, 34163, 1.0F);
			if (((Class299) aClass299_6243).aBool4034) {
				OpenGL.glDisable(3170);
				OpenGL.glDisable(3171);
			}
			aClass337_6242.method2027(-50135600);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.K(" + i + ')');
		}
	}

	static final void method2650(int i, byte i_56_, int i_57_, int i_58_,
			int i_59_) {
		try {
			if (i_56_ >= 31) {
				anInt6248++;
				int i_60_ = Class318.anInt4220;
				int i_61_ = Class11_Sub23.anInt5988;
				if (Class11_Sub2_Sub19.aBool9087) {
					i_60_ += Class54.method443(5467);
					i_61_ += Class376_Sub7_Sub4_Sub1.method3887((byte) -108);
				}
				if ((Class228.anInt3149 ^ 0xffffffff) == -2) {
					Class253 class253 = (Class376_Sub7_Sub4.aClass253Array9535[Class378.anInt4935 / 100]);
					class253.method1610(i_60_ - 8, i_61_ - 8);
					Class11.method123(class253.method1622() + i_61_ - 8, -8
							+ i_60_ + class253.method1608(), (byte) -71, -8
							+ i_60_, i_61_ - 8);
				}
				if (Class228.anInt3149 == 2) {
					Class253 class253 = (Class376_Sub7_Sub4.aClass253Array9535[4 - -(Class378.anInt4935 / 100)]);
					class253.method1610(-8 + i_60_, i_61_ - 8);
					Class11.method123(class253.method1622() + i_61_ - 8,
							class253.method1608() + (i_60_ - 8), (byte) -68,
							i_60_ - 8, -8 + i_61_);
				}
				Class59.method465((byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gq.J(" + i + ','
					+ i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ')'));
		}
	}

	final boolean method1500(byte i) {
		try {
			anInt6244++;
			int i_62_ = 115 / ((i + 9) / 53);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.D(" + i + ')');
		}
	}

	Class236_Sub3(Class163_Sub3 class163_sub3, Class299 class299) {
		super(class163_sub3);
		try {
			aClass299_6243 = class299;
			method2649(-41);
			aClass321_Sub4_6251 = new Class321_Sub4(
					((Class236) this).aClass163_Sub3_3222, 6406, 2, new byte[] {
							0, -1 }, 6406);
			aClass321_Sub4_6251.method3219(false, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gq.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (class299 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1502(int i) {
		try {
			aClass337_6242.method2026(-12, '\001');
			anInt6250++;
			if ((((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8323) > 0) {
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 47);
				((Class236) this).aClass163_Sub3_3222.method3259(0.0F, -11757,
						1.0F);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			}
			if (i >= 74) {
				((Class236) this).aClass163_Sub3_3222.method3315(false, 8448,
						8448);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gq.C(" + i + ')');
		}
	}
}
