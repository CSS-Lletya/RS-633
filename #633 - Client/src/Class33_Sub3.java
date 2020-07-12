/* Class33_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;
import java.io.File;

final class Class33_Sub3 extends Class33 {
	float aFloat7164;
	static int anInt7165;
	float aFloat7166;
	static int anInt7167;
	static int anInt7168;
	static int anInt7169;
	static int anInt7170;
	static int anInt7171;
	static int anInt7172;
	static int anInt7173;
	static int anInt7174;
	float aFloat7175;
	static int anInt7176;
	static int anInt7177;
	static int anInt7178;
	float aFloat7179;
	static int anInt7180;
	static int anInt7181;
	float aFloat7182;
	static int anInt7183;
	static int anInt7184;
	float aFloat7185;
	float aFloat7186;
	static int anInt7187;
	static int anInt7188;
	static int anInt7189;
	float aFloat7190;
	static int anInt7191;
	static int anInt7192;
	float aFloat7193;
	static int anInt7194;
	float aFloat7195;
	float aFloat7196;
	float aFloat7197;

	static final void method2919(byte i) {
		try {
			anInt7169++;
			synchronized (Class11_Sub2_Sub23.aclient9263) {
				if (Class355.aFrame4658 != null) {
					/* empty */
				} else {
					java.awt.Container container;
					if (Class376_Sub5.aFrame6918 != null)
						container = Class376_Sub5.aFrame6918;
					else if (Class108_Sub16.anApplet6538 != null)
						container = Class108_Sub16.anApplet6538;
					else
						container = Class112.anApplet_Sub1_1542;
					Class11_Sub45_Sub18.anInt9531 = container.getSize().width;
					Class231.anInt3160 = container.getSize().height;
					if (Class376_Sub5.aFrame6918 == container) {
						Insets insets = Class376_Sub5.aFrame6918.getInsets();
						Class231.anInt3160 -= insets.bottom + insets.top;
						Class11_Sub45_Sub18.anInt9531 -= insets.right
								+ insets.left;
					}
					if ((Class187.method1227((byte) 54) ^ 0xffffffff) == -2) {
						Class153.anInt2025 = Class279.anInt3772;
						Class11_Sub36.anInt7079 = Class233.anInt3186;
						Class198.anInt2687 = (-Class233.anInt3186 + Class11_Sub45_Sub18.anInt9531) / 2;
						Class124.anInt1677 = 0;
					} else
						Class108_Sub17.method2732((byte) -27);
					if (Class362.aClass347_4711 != Class11_Sub2_Sub24.aClass347_9284) {
						if (Class11_Sub36.anInt7079 < 1024
								&& (Class153.anInt2025 ^ 0xffffffff) > -769) {
							/* empty */
						}
					}
					Class11_Sub45_Sub13.aCanvas9308.setSize(
							Class11_Sub36.anInt7079, Class153.anInt2025);
					if (Class321_Sub2.aClass163_6648 != null) {
						if (!Class11_Sub2_Sub19.aBool9087)
							Class321_Sub2.aClass163_6648
									.method1013(
											Class11_Sub45_Sub13.aCanvas9308,
											Class11_Sub36.anInt7079,
											Class153.anInt2025);
						else
							Class355.method2123(-128,
									(Class11_Sub45_Sub13.aCanvas9308));
					}
					if (Class376_Sub5.aFrame6918 != container)
						Class11_Sub45_Sub13.aCanvas9308.setLocation(
								Class198.anInt2687, Class124.anInt1677);
					else {
						Insets insets = Class376_Sub5.aFrame6918.getInsets();
						Class11_Sub45_Sub13.aCanvas9308.setLocation(insets.left
								- -Class198.anInt2687, insets.top
								+ Class124.anInt1677);
					}
					if ((Class365.anInt4797 ^ 0xffffffff) != 0)
						Class321_Sub3_Sub1.method3614(true, -14543);
					if (i >= -122)
						anInt7172 = 48;
					Class324.method1974((byte) 42);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.I(" + i + ')');
		}
	}

	final void method300(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			anInt7180++;
			float f = Class103.aFloatArray1373[i_2_ & 0x3fff];
			float f_5_ = Class103.aFloatArray1370[0x3fff & i_2_];
			float f_6_ = Class103.aFloatArray1373[i_3_ & 0x3fff];
			float f_7_ = Class103.aFloatArray1370[i_3_ & 0x3fff];
			float f_8_ = Class103.aFloatArray1373[0x3fff & i_4_];
			float f_9_ = Class103.aFloatArray1370[i_4_ & 0x3fff];
			float f_10_ = f_8_ * f_5_;
			float f_11_ = f_9_ * f_5_;
			((Class33_Sub3) this).aFloat7186 = f_8_ * f;
			((Class33_Sub3) this).aFloat7185 = -f_5_;
			((Class33_Sub3) this).aFloat7164 = f_7_ * f_11_ + f_8_ * f_6_;
			((Class33_Sub3) this).aFloat7196 = f * f_7_;
			((Class33_Sub3) this).aFloat7195 = f * f_9_;
			((Class33_Sub3) this).aFloat7193 = -f_7_ * f_8_ + f_6_ * f_11_;
			((Class33_Sub3) this).aFloat7179 = -f_6_ * f_9_ + f_10_ * f_7_;
			((Class33_Sub3) this).aFloat7182 = f_6_ * f_10_ + f_9_ * f_7_;
			((Class33_Sub3) this).aFloat7166 = f_6_ * f;
			((Class33_Sub3) this).aFloat7175 = (-(((Class33_Sub3) this).aFloat7166 * (float) i_1_) + (((Class33_Sub3) this).aFloat7196
					* (float) -i - ((Class33_Sub3) this).aFloat7185
					* (float) i_0_));
			((Class33_Sub3) this).aFloat7190 = (-((float) i_0_ * ((Class33_Sub3) this).aFloat7186)
					+ ((Class33_Sub3) this).aFloat7179 * (float) -i - ((Class33_Sub3) this).aFloat7182
					* (float) i_1_);
			((Class33_Sub3) this).aFloat7197 = (((Class33_Sub3) this).aFloat7164
					* (float) -i
					- ((Class33_Sub3) this).aFloat7195
					* (float) i_0_ - ((Class33_Sub3) this).aFloat7193
					* (float) i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qu.S(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method299(int i, int i_12_, int i_13_) {
		try {
			((Class33_Sub3) this).aFloat7197 += (float) i;
			((Class33_Sub3) this).aFloat7175 += (float) i_13_;
			anInt7177++;
			((Class33_Sub3) this).aFloat7190 += (float) i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.V(" + i + ','
					+ i_12_ + ',' + i_13_ + ')'));
		}
	}

	static final void method2920(byte i) {
		try {
			if (Class242.aClass203Array3287 != null) {
				for (int i_14_ = 0; i_14_ < Class142.anInt1926; i_14_++)
					Class242.aClass203Array3287[i_14_] = null;
				Class242.aClass203Array3287 = null;
			}
			anInt7183++;
			if (Class11_Sub2_Sub28.aClass203Array9423 != null) {
				for (int i_15_ = 0; Class11_Sub30.anInt6612 > i_15_; i_15_++)
					Class11_Sub2_Sub28.aClass203Array9423[i_15_] = null;
				Class11_Sub2_Sub28.aClass203Array9423 = null;
			}
			if (Class58_Sub1_Sub1.aClass203Array9173 != null) {
				for (int i_16_ = 0; Class265.anInt3614 > i_16_; i_16_++)
					Class58_Sub1_Sub1.aClass203Array9173[i_16_] = null;
				Class58_Sub1_Sub1.aClass203Array9173 = null;
			}
			Class93.aClass203Array1248 = null;
			Class11_Sub2_Sub1.anIntArray8436 = null;
			Class321_Sub3.anIntArrayArrayArray7024 = null;
			int i_17_ = -98 / ((i + 57) / 61);
			Class2_Sub1.anInt5065 = Class6.anInt39 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.F(" + i + ')');
		}
	}

	static final boolean method2921(int i, Packet class11_sub20_sub1, int i_18_) {
		try {
			anInt7168++;
			int i_19_ = class11_sub20_sub1.readBits(2, (byte) 108);
			if ((i_19_ ^ 0xffffffff) == -1) {
				if ((class11_sub20_sub1.readBits(1, (byte) 108) ^ 0xffffffff) != -1)
					method2921(i, class11_sub20_sub1, 0);
				int i_20_ = class11_sub20_sub1.readBits(6, (byte) 108);
				int i_21_ = class11_sub20_sub1.readBits(6, (byte) 108);
				boolean bool = ((class11_sub20_sub1.readBits(1, (byte) 108) ^ 0xffffffff) == -2);
				if (bool)
					Class11_Sub45_Sub7.anIntArray8801[Class56.anInt841++] = i;
				if (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i] != null)
					throw new RuntimeException("hr:lr");
				Class362 class362 = Class38.aClass362Array510[i];
				Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i] = new Player());
				((Actor) class376_sub7_sub5_sub5_sub1).anInt10319 = i;
				if (Class70.cachedAppearances[i] != null)
					class376_sub7_sub5_sub5_sub1.readAppearance(
							Class70.cachedAppearances[i], 103);
				class376_sub7_sub5_sub5_sub1.method3961(true, 115,
						((Class362) class362).anInt4709);
				((Actor) class376_sub7_sub5_sub5_sub1).faceEntity = ((Class362) class362).anInt4708;
				int i_22_ = ((Class362) class362).anInt4706;
				int i_23_ = i_22_ >> 28;
				int i_24_ = i_22_ >> 14 & 0xff;
				int i_25_ = 0xff & i_22_;
				int i_26_ = -Class194.anInt2641 + i_20_ + (i_24_ << 6);
				int i_27_ = i_21_ + ((i_25_ << 6) - Class118.anInt1605);
				((Player) class376_sub7_sub5_sub5_sub1).aBool10420 = ((Class362) class362).aBool4712;
				((Actor) class376_sub7_sub5_sub5_sub1).aByteArray10372[0] = Class206.movementTypes[i];
				((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039 = (byte) i_23_;
				if (Class321_Sub3_Sub1.method3613((byte) -96, i_26_, i_27_))
					((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039++;
				class376_sub7_sub5_sub5_sub1.method3973(i_27_, (byte) -125,
						i_26_);
				((Player) class376_sub7_sub5_sub5_sub1).aBool10393 = false;
				Class38.aClass362Array510[i] = null;
				return true;
			}
			if (i_19_ == 1) {
				int i_28_ = class11_sub20_sub1.readBits(2, (byte) 108);
				int i_29_ = ((Class362) Class38.aClass362Array510[i]).anInt4706;
				((Class362) Class38.aClass362Array510[i]).anInt4706 = ((0x30000000 & (i_29_ >> 28)
						+ i_28_ << 28) + (i_29_ & 0xfffffff));
				return false;
			}
			if ((i_19_ ^ 0xffffffff) == -3) {
				int i_30_ = class11_sub20_sub1.readBits(5, (byte) 108);
				int i_31_ = i_30_ >> 3;
				int i_32_ = i_30_ & 0x7;
				int i_33_ = ((Class362) Class38.aClass362Array510[i]).anInt4706;
				int i_34_ = (i_33_ >> 28) + i_31_ & 0x3;
				int i_35_ = i_33_ >> 14 & 0xff;
				int i_36_ = 0xff & i_33_;
				if ((i_32_ ^ 0xffffffff) == -1) {
					i_36_--;
					i_35_--;
				}
				if ((i_32_ ^ 0xffffffff) == -2)
					i_36_--;
				if ((i_32_ ^ 0xffffffff) == -3) {
					i_36_--;
					i_35_++;
				}
				if (i_32_ == 3)
					i_35_--;
				if ((i_32_ ^ 0xffffffff) == -5)
					i_35_++;
				if ((i_32_ ^ 0xffffffff) == -6) {
					i_35_--;
					i_36_++;
				}
				if ((i_32_ ^ 0xffffffff) == -7)
					i_36_++;
				if ((i_32_ ^ 0xffffffff) == -8) {
					i_35_++;
					i_36_++;
				}
				((Class362) Class38.aClass362Array510[i]).anInt4706 = i_36_
						+ (i_35_ << 14) + (i_34_ << 28);
				return false;
			}
			int i_37_ = class11_sub20_sub1.readBits(18, (byte) 108);
			int i_38_ = i_37_ >> 16;
			int i_39_ = i_37_ >> 8 & 0xff;
			int i_40_ = i_37_ & 0xff;
			int i_41_ = ((Class362) Class38.aClass362Array510[i]).anInt4706;
			int i_42_ = i_38_ + (i_41_ >> 28) & 0x3;
			int i_43_ = 0xff & (i_41_ >> 14) - -i_39_;
			int i_44_ = i_40_ + i_41_ & 0xff;
			if (i_18_ != 0)
				return false;
			((Class362) Class38.aClass362Array510[i]).anInt4706 = i_44_
					+ ((i_42_ << 28) + (i_43_ << 14));
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.H(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ','
					+ i_18_ + ')'));
		}
	}

	final void method301(int i, int i_45_, int i_46_) {
		try {
			((Class33_Sub3) this).aFloat7179 = ((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) this).aFloat7195 = ((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) this).aFloat7193 = ((Class33_Sub3) this).aFloat7182 = 0.0F;
			((Class33_Sub3) this).aFloat7190 = (float) i_45_;
			((Class33_Sub3) this).aFloat7197 = (float) i;
			anInt7178++;
			((Class33_Sub3) this).aFloat7164 = ((Class33_Sub3) this).aFloat7186 = ((Class33_Sub3) this).aFloat7166 = 1.0F;
			((Class33_Sub3) this).aFloat7175 = (float) i_46_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.Q(" + i + ','
					+ i_45_ + ',' + i_46_ + ')'));
		}
	}

	final void method303(int i) {
		try {
			anInt7189++;
			float f = Class103.aFloatArray1373[0x3fff & i];
			float f_47_ = Class103.aFloatArray1370[i & 0x3fff];
			float f_48_ = ((Class33_Sub3) this).aFloat7179;
			float f_49_ = ((Class33_Sub3) this).aFloat7186;
			float f_50_ = ((Class33_Sub3) this).aFloat7182;
			float f_51_ = ((Class33_Sub3) this).aFloat7190;
			((Class33_Sub3) this).aFloat7179 = -(f_47_ * ((Class33_Sub3) this).aFloat7196)
					+ f * f_48_;
			((Class33_Sub3) this).aFloat7186 = f * f_49_ - f_47_
					* ((Class33_Sub3) this).aFloat7185;
			((Class33_Sub3) this).aFloat7196 = f_48_ * f_47_
					+ ((Class33_Sub3) this).aFloat7196 * f;
			((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) this).aFloat7185
					* f + f_47_ * f_49_;
			((Class33_Sub3) this).aFloat7182 = f_50_ * f - f_47_
					* ((Class33_Sub3) this).aFloat7166;
			((Class33_Sub3) this).aFloat7166 = f
					* ((Class33_Sub3) this).aFloat7166 + f_47_ * f_50_;
			((Class33_Sub3) this).aFloat7190 = -(f_47_ * ((Class33_Sub3) this).aFloat7175)
					+ f * f_51_;
			((Class33_Sub3) this).aFloat7175 = f
					* ((Class33_Sub3) this).aFloat7175 + f_47_ * f_51_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.D(" + i + ')');
		}
	}

	final void method286(int i) {
		try {
			anInt7191++;
			((Class33_Sub3) this).aFloat7164 = 1.0F;
			((Class33_Sub3) this).aFloat7186 = ((Class33_Sub3) this).aFloat7166 = Class103.aFloatArray1373[i & 0x3fff];
			((Class33_Sub3) this).aFloat7185 = Class103.aFloatArray1370[i & 0x3fff];
			((Class33_Sub3) this).aFloat7182 = -((Class33_Sub3) this).aFloat7185;
			((Class33_Sub3) this).aFloat7195 = ((Class33_Sub3) this).aFloat7193 = ((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) this).aFloat7179 = ((Class33_Sub3) this).aFloat7190 = ((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) this).aFloat7175 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.GA(" + i + ')');
		}
	}

	final void method293(int i) {
		try {
			anInt7188++;
			float f = Class103.aFloatArray1373[i & 0x3fff];
			float f_52_ = Class103.aFloatArray1370[0x3fff & i];
			float f_53_ = ((Class33_Sub3) this).aFloat7164;
			float f_54_ = ((Class33_Sub3) this).aFloat7195;
			float f_55_ = ((Class33_Sub3) this).aFloat7193;
			((Class33_Sub3) this).aFloat7164 = f_52_
					* ((Class33_Sub3) this).aFloat7196 + f * f_53_;
			float f_56_ = ((Class33_Sub3) this).aFloat7197;
			((Class33_Sub3) this).aFloat7195 = f * f_54_ + f_52_
					* ((Class33_Sub3) this).aFloat7185;
			((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) this).aFloat7196
					* f - f_53_ * f_52_;
			((Class33_Sub3) this).aFloat7185 = f
					* ((Class33_Sub3) this).aFloat7185 - f_52_ * f_54_;
			((Class33_Sub3) this).aFloat7193 = f_55_ * f + f_52_
					* ((Class33_Sub3) this).aFloat7166;
			((Class33_Sub3) this).aFloat7166 = f
					* ((Class33_Sub3) this).aFloat7166 - f_52_ * f_55_;
			((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) this).aFloat7175
					* f_52_ + f_56_ * f;
			((Class33_Sub3) this).aFloat7175 = -(f_56_ * f_52_)
					+ ((Class33_Sub3) this).aFloat7175 * f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.W(" + i + ')');
		}
	}

	static final void method2922(File file, String string, byte i) {
		try {
			if (i >= -43)
				method2920((byte) 117);
			Class19.aHashtable150.put(string, file);
			anInt7165++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.B("
					+ (file != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final void method296(Class33 class33) {
		try {
			anInt7192++;
			Class33_Sub3 class33_sub3_57_ = (Class33_Sub3) class33;
			((Class33_Sub3) this).aFloat7179 = ((Class33_Sub3) class33_sub3_57_).aFloat7179;
			((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) class33_sub3_57_).aFloat7196;
			((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) class33_sub3_57_).aFloat7197;
			((Class33_Sub3) this).aFloat7186 = ((Class33_Sub3) class33_sub3_57_).aFloat7186;
			((Class33_Sub3) this).aFloat7164 = ((Class33_Sub3) class33_sub3_57_).aFloat7164;
			((Class33_Sub3) this).aFloat7195 = ((Class33_Sub3) class33_sub3_57_).aFloat7195;
			((Class33_Sub3) this).aFloat7190 = ((Class33_Sub3) class33_sub3_57_).aFloat7190;
			((Class33_Sub3) this).aFloat7175 = ((Class33_Sub3) class33_sub3_57_).aFloat7175;
			((Class33_Sub3) this).aFloat7193 = ((Class33_Sub3) class33_sub3_57_).aFloat7193;
			((Class33_Sub3) this).aFloat7182 = ((Class33_Sub3) class33_sub3_57_).aFloat7182;
			((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) class33_sub3_57_).aFloat7185;
			((Class33_Sub3) this).aFloat7166 = ((Class33_Sub3) class33_sub3_57_).aFloat7166;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.C("
					+ (class33 != null ? "{...}" : "null") + ')');
		}
	}

	final void method287(int i, int i_58_, int i_59_, int[] is) {
		try {
			anInt7176++;
			i_58_ -= ((Class33_Sub3) this).aFloat7190;
			i -= ((Class33_Sub3) this).aFloat7197;
			i_59_ -= ((Class33_Sub3) this).aFloat7175;
			is[2] = (int) ((float) i * ((Class33_Sub3) this).aFloat7193
					+ (float) i_58_ * ((Class33_Sub3) this).aFloat7182 + (float) i_59_
					* ((Class33_Sub3) this).aFloat7166);
			is[1] = (int) (((Class33_Sub3) this).aFloat7186 * (float) i_58_
					+ ((Class33_Sub3) this).aFloat7195 * (float) i + (float) i_59_
					* ((Class33_Sub3) this).aFloat7185);
			is[0] = (int) ((float) i_59_ * ((Class33_Sub3) this).aFloat7196 + (((Class33_Sub3) this).aFloat7179
					* (float) i_58_ + ((Class33_Sub3) this).aFloat7164
					* (float) i));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.G(" + i + ','
					+ i_58_ + ',' + i_59_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method302(int[] is) {
		try {
			anInt7174++;
			float f = (float) is[0] - ((Class33_Sub3) this).aFloat7197;
			float f_60_ = (float) is[1] - ((Class33_Sub3) this).aFloat7190;
			float f_61_ = (float) is[2] - ((Class33_Sub3) this).aFloat7175;
			is[1] = (int) (f_61_ * ((Class33_Sub3) this).aFloat7185 + (f_60_
					* ((Class33_Sub3) this).aFloat7186 + ((Class33_Sub3) this).aFloat7195
					* f));
			is[0] = (int) (((Class33_Sub3) this).aFloat7196 * f_61_ + (((Class33_Sub3) this).aFloat7179
					* f_60_ + ((Class33_Sub3) this).aFloat7164 * f));
			is[2] = (int) (((Class33_Sub3) this).aFloat7182 * f_60_ + f
					* ((Class33_Sub3) this).aFloat7193 + ((Class33_Sub3) this).aFloat7166
					* f_61_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.R("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final void method288(int i) {
		try {
			((Class33_Sub3) this).aFloat7166 = 1.0F;
			anInt7167++;
			((Class33_Sub3) this).aFloat7164 = ((Class33_Sub3) this).aFloat7186 = Class103.aFloatArray1373[i & 0x3fff];
			((Class33_Sub3) this).aFloat7179 = Class103.aFloatArray1370[i & 0x3fff];
			((Class33_Sub3) this).aFloat7193 = ((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) this).aFloat7182 = ((Class33_Sub3) this).aFloat7190 = ((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) this).aFloat7175 = 0.0F;
			((Class33_Sub3) this).aFloat7195 = -((Class33_Sub3) this).aFloat7179;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.A(" + i + ')');
		}
	}

	static final void method2923(int i, int i_62_) {
		try {
			if (i_62_ != -3311)
				anInt7172 = 81;
			anInt7184++;
			Class11_Sub12.anInt5446 = -1;
			if ((i ^ 0xffffffff) == -38)
				Class32.aFloat429 = 3.0F;
			else if ((i ^ 0xffffffff) != -51) {
				if ((i ^ 0xffffffff) != -76) {
					if ((i ^ 0xffffffff) == -101)
						Class32.aFloat429 = 8.0F;
					else if ((i ^ 0xffffffff) == -201)
						Class32.aFloat429 = 16.0F;
				} else
					Class32.aFloat429 = 6.0F;
			} else
				Class32.aFloat429 = 4.0F;
			Class11_Sub12.anInt5446 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.E(" + i + ','
					+ i_62_ + ')');
		}
	}

	final void method295(int i, int i_63_, int i_64_, int[] is) {
		try {
			anInt7171++;
			is[0] = (int) (((Class33_Sub3) this).aFloat7193
					* (float) i_64_
					+ (((Class33_Sub3) this).aFloat7164 * (float) i + ((Class33_Sub3) this).aFloat7195
							* (float) i_63_) + ((Class33_Sub3) this).aFloat7197);
			is[1] = (int) (((Class33_Sub3) this).aFloat7186 * (float) i_63_
					+ ((Class33_Sub3) this).aFloat7179 * (float) i
					+ (float) i_64_ * ((Class33_Sub3) this).aFloat7182 + ((Class33_Sub3) this).aFloat7190);
			is[2] = (int) ((float) i_64_
					* ((Class33_Sub3) this).aFloat7166
					+ ((float) i * ((Class33_Sub3) this).aFloat7196 + (float) i_63_
							* ((Class33_Sub3) this).aFloat7185) + ((Class33_Sub3) this).aFloat7175);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.BA(" + i + ','
					+ i_63_ + ',' + i_64_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method298(int i) {
		try {
			anInt7187++;
			((Class33_Sub3) this).aFloat7186 = 1.0F;
			((Class33_Sub3) this).aFloat7164 = ((Class33_Sub3) this).aFloat7166 = Class103.aFloatArray1373[i & 0x3fff];
			((Class33_Sub3) this).aFloat7193 = Class103.aFloatArray1370[i & 0x3fff];
			((Class33_Sub3) this).aFloat7196 = -((Class33_Sub3) this).aFloat7193;
			((Class33_Sub3) this).aFloat7195 = ((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) this).aFloat7179 = ((Class33_Sub3) this).aFloat7182 = ((Class33_Sub3) this).aFloat7190 = ((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) this).aFloat7175 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.L(" + i + ')');
		}
	}

	final void method294(int i, int i_65_, int i_66_, int[] is) {
		try {
			is[1] = (int) (((Class33_Sub3) this).aFloat7182 * (float) i_66_ + (((Class33_Sub3) this).aFloat7186
					* (float) i_65_ + (float) i
					* ((Class33_Sub3) this).aFloat7179));
			anInt7173++;
			is[0] = (int) (((Class33_Sub3) this).aFloat7164 * (float) i
					+ (float) i_65_ * ((Class33_Sub3) this).aFloat7195 + (float) i_66_
					* ((Class33_Sub3) this).aFloat7193);
			is[2] = (int) ((float) i_66_ * ((Class33_Sub3) this).aFloat7166 + ((float) i_65_
					* ((Class33_Sub3) this).aFloat7185 + (float) i
					* ((Class33_Sub3) this).aFloat7196));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qu.DA(" + i + ','
					+ i_65_ + ',' + i_66_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final void method297(int i) {
		try {
			anInt7194++;
			float f = Class103.aFloatArray1373[i & 0x3fff];
			float f_67_ = Class103.aFloatArray1370[0x3fff & i];
			float f_68_ = ((Class33_Sub3) this).aFloat7164;
			float f_69_ = ((Class33_Sub3) this).aFloat7195;
			float f_70_ = ((Class33_Sub3) this).aFloat7193;
			((Class33_Sub3) this).aFloat7164 = f * f_68_
					- ((Class33_Sub3) this).aFloat7179 * f_67_;
			float f_71_ = ((Class33_Sub3) this).aFloat7197;
			((Class33_Sub3) this).aFloat7195 = f * f_69_ - f_67_
					* ((Class33_Sub3) this).aFloat7186;
			((Class33_Sub3) this).aFloat7179 = f_67_ * f_68_ + f
					* ((Class33_Sub3) this).aFloat7179;
			((Class33_Sub3) this).aFloat7193 = f * f_70_
					- ((Class33_Sub3) this).aFloat7182 * f_67_;
			((Class33_Sub3) this).aFloat7186 = f
					* ((Class33_Sub3) this).aFloat7186 + f_69_ * f_67_;
			((Class33_Sub3) this).aFloat7197 = -(((Class33_Sub3) this).aFloat7190 * f_67_)
					+ f_71_ * f;
			((Class33_Sub3) this).aFloat7182 = ((Class33_Sub3) this).aFloat7182
					* f + f_67_ * f_70_;
			((Class33_Sub3) this).aFloat7190 = f
					* ((Class33_Sub3) this).aFloat7190 + f_71_ * f_67_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.EA(" + i + ')');
		}
	}

	final Class33 method292() {
		try {
			anInt7181++;
			Class33_Sub3 class33_sub3_72_ = new Class33_Sub3();
			((Class33_Sub3) class33_sub3_72_).aFloat7166 = ((Class33_Sub3) this).aFloat7166;
			((Class33_Sub3) class33_sub3_72_).aFloat7185 = ((Class33_Sub3) this).aFloat7185;
			((Class33_Sub3) class33_sub3_72_).aFloat7196 = ((Class33_Sub3) this).aFloat7196;
			((Class33_Sub3) class33_sub3_72_).aFloat7197 = ((Class33_Sub3) this).aFloat7197;
			((Class33_Sub3) class33_sub3_72_).aFloat7186 = ((Class33_Sub3) this).aFloat7186;
			((Class33_Sub3) class33_sub3_72_).aFloat7190 = ((Class33_Sub3) this).aFloat7190;
			((Class33_Sub3) class33_sub3_72_).aFloat7193 = ((Class33_Sub3) this).aFloat7193;
			((Class33_Sub3) class33_sub3_72_).aFloat7179 = ((Class33_Sub3) this).aFloat7179;
			((Class33_Sub3) class33_sub3_72_).aFloat7175 = ((Class33_Sub3) this).aFloat7175;
			((Class33_Sub3) class33_sub3_72_).aFloat7195 = ((Class33_Sub3) this).aFloat7195;
			((Class33_Sub3) class33_sub3_72_).aFloat7164 = ((Class33_Sub3) this).aFloat7164;
			((Class33_Sub3) class33_sub3_72_).aFloat7182 = ((Class33_Sub3) this).aFloat7182;
			return class33_sub3_72_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.O(" + ')');
		}
	}

	final void method289() {
		try {
			((Class33_Sub3) this).aFloat7164 = ((Class33_Sub3) this).aFloat7186 = ((Class33_Sub3) this).aFloat7166 = 1.0F;
			anInt7170++;
			((Class33_Sub3) this).aFloat7179 = ((Class33_Sub3) this).aFloat7196 = ((Class33_Sub3) this).aFloat7195 = ((Class33_Sub3) this).aFloat7185 = ((Class33_Sub3) this).aFloat7193 = ((Class33_Sub3) this).aFloat7182 = ((Class33_Sub3) this).aFloat7197 = ((Class33_Sub3) this).aFloat7190 = ((Class33_Sub3) this).aFloat7175 = 0.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.U(" + ')');
		}
	}

	public Class33_Sub3() {
		try {
			method289();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qu.<init>(" + ')');
		}
	}
}
