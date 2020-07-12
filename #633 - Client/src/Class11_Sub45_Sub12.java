/* Class11_Sub45_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub12 extends Class11_Sub45 {
	private int[] anIntArray9175;
	private Class11_Sub2 aClass11_Sub2_9176;
	static int anInt9177;
	static int anInt9178;
	static Class341 aClass341_9179;
	private Class11_Sub2[] aClass11_Sub2Array9180;
	static int anInt9181;
	static int anInt9182;
	private int[] anIntArray9183;
	private Class11_Sub2 aClass11_Sub2_9184;
	static int anInt9185;
	static int anInt9186;
	static Class218 aClass218_9187;
	private Class11_Sub2 aClass11_Sub2_9188;
	static boolean aBool9189 = true;
	static Class40 aClass40_9190;
	static IncomingPacket aClass160_9191;

	final int[] method3587(int i, Interface1 interface1, double d, int i_0_,
			byte i_1_, Class146 class146, boolean bool) {
		try {
			Class256_Sub1.anInterface1_5321 = interface1;
			anInt9182++;
			Class339.aClass146_4481 = class146;
			for (int i_2_ = 0; i_2_ < aClass11_Sub2Array9180.length; i_2_++)
				aClass11_Sub2Array9180[i_2_].method2259(i, -1, i_0_);
			if (i_1_ != 68)
				method3587(-128, null, 0.7915966213617012, -31, (byte) -53,
						null, false);
			IncomingPacket.method990(-82, d);
			Class239_Sub2.method3189(-11775, i_0_, i);
			int[] is = new int[i * i_0_];
			int i_3_ = 0;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
				int[] is_5_;
				int[] is_6_;
				int[] is_7_;
				if (!((Class11_Sub2) aClass11_Sub2_9184).aBool5044) {
					int[][] is_8_ = aClass11_Sub2_9184.method2255(i_4_,
							i_1_ - 67);
					is_6_ = is_8_[1];
					is_5_ = is_8_[0];
					is_7_ = is_8_[2];
				} else {
					int[] is_9_ = aClass11_Sub2_9184.method2254(i_4_, true);
					is_5_ = is_9_;
					is_6_ = is_9_;
					is_7_ = is_9_;
				}
				int[] is_10_;
				if (!((Class11_Sub2) aClass11_Sub2_9176).aBool5044)
					is_10_ = aClass11_Sub2_9176.method2255(i_4_, 1)[0];
				else
					is_10_ = aClass11_Sub2_9176.method2254(i_4_, true);
				if (bool)
					i_3_ = i_4_;
				for (int i_11_ = i_0_ - 1; (i_11_ ^ 0xffffffff) <= -1; i_11_--) {
					int i_12_ = is_5_[i_11_] >> 4;
					if (i_12_ > 255)
						i_12_ = 255;
					if ((i_12_ ^ 0xffffffff) > -1)
						i_12_ = 0;
					int i_13_ = is_6_[i_11_] >> 4;
					if ((i_13_ ^ 0xffffffff) < -256)
						i_13_ = 255;
					if (i_13_ < 0)
						i_13_ = 0;
					int i_14_ = is_7_[i_11_] >> 4;
					if (i_14_ > 255)
						i_14_ = 255;
					if ((i_14_ ^ 0xffffffff) > -1)
						i_14_ = 0;
					i_12_ = Class272.anIntArray3675[i_12_];
					i_13_ = Class272.anIntArray3675[i_13_];
					i_14_ = Class272.anIntArray3675[i_14_];
					int i_15_;
					if (i_12_ != 0 || (i_13_ ^ 0xffffffff) != -1 || i_14_ != 0) {
						i_15_ = is_10_[i_11_] >> 4;
						if ((i_15_ ^ 0xffffffff) < -256)
							i_15_ = 255;
						if ((i_15_ ^ 0xffffffff) > -1)
							i_15_ = 0;
					} else
						i_15_ = 0;
					is[i_3_++] = (i_15_ << 24) - -(i_12_ << 16)
							- (-(i_13_ << 8) - i_14_);
					if (bool)
						i_3_ += -1 + i_0_;
				}
			}
			for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (aClass11_Sub2Array9180.length ^ 0xffffffff)); i_16_++)
				aClass11_Sub2Array9180[i_16_].method2257((byte) -115);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("oea.F(" + i + ','
							+ (interface1 != null ? "{...}" : "null") + ',' + d
							+ ',' + i_0_ + ',' + i_1_ + ','
							+ (class146 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	final int[] method3588(boolean bool, Class146 class146, int i, int i_17_,
			boolean bool_18_, int i_19_, double d, Interface1 interface1) {
		try {
			if (i != 255)
				return null;
			Class256_Sub1.anInterface1_5321 = interface1;
			anInt9177++;
			Class339.aClass146_4481 = class146;
			for (int i_20_ = 0; i_20_ < aClass11_Sub2Array9180.length; i_20_++)
				aClass11_Sub2Array9180[i_20_].method2259(i_17_, i ^ ~0xff,
						i_19_);
			IncomingPacket.method990(-110, d);
			Class239_Sub2.method3189(-11775, i_19_, i_17_);
			int[] is = new int[i_19_ * i_17_];
			int i_21_;
			int i_22_;
			int i_23_;
			if (!bool_18_) {
				i_22_ = 0;
				i_21_ = 1;
				i_23_ = i_19_;
			} else {
				i_21_ = -1;
				i_22_ = i_19_ - 1;
				i_23_ = -1;
			}
			int i_24_ = 0;
			for (int i_25_ = 0; i_25_ < i_17_; i_25_++) {
				if (bool)
					i_24_ = i_25_;
				int[] is_26_;
				int[] is_27_;
				int[] is_28_;
				if (((Class11_Sub2) aClass11_Sub2_9184).aBool5044) {
					int[] is_29_ = aClass11_Sub2_9184.method2254(i_25_, true);
					is_27_ = is_29_;
					is_28_ = is_29_;
					is_26_ = is_29_;
				} else {
					int[][] is_30_ = aClass11_Sub2_9184.method2255(i_25_, 1);
					is_26_ = is_30_[2];
					is_27_ = is_30_[1];
					is_28_ = is_30_[0];
				}
				for (int i_31_ = i_22_; (i_23_ ^ 0xffffffff) != (i_31_ ^ 0xffffffff); i_31_ += i_21_) {
					int i_32_ = is_28_[i_31_] >> 4;
					if ((i_32_ ^ 0xffffffff) < -256)
						i_32_ = 255;
					if (i_32_ < 0)
						i_32_ = 0;
					int i_33_ = is_27_[i_31_] >> 4;
					if (i_33_ > 255)
						i_33_ = 255;
					if ((i_33_ ^ 0xffffffff) > -1)
						i_33_ = 0;
					int i_34_ = is_26_[i_31_] >> 4;
					if ((i_34_ ^ 0xffffffff) < -256)
						i_34_ = 255;
					i_32_ = Class272.anIntArray3675[i_32_];
					i_33_ = Class272.anIntArray3675[i_33_];
					if (i_34_ < 0)
						i_34_ = 0;
					i_34_ = Class272.anIntArray3675[i_34_];
					int i_35_ = (i_33_ << 8) + (i_32_ << 16) - -i_34_;
					if ((i_35_ ^ 0xffffffff) != -1)
						i_35_ |= ~0xffffff;
					is[i_24_++] = i_35_;
					if (bool)
						i_24_ += -1 + i_19_;
				}
			}
			for (int i_36_ = 0; ((aClass11_Sub2Array9180.length ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++)
				aClass11_Sub2Array9180[i_36_].method2257((byte) 118);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oea.A(" + bool + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i + ','
					+ i_17_ + ',' + bool_18_ + ',' + i_19_ + ',' + d + ','
					+ (interface1 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3589(Class146 class146, Interface1 interface1, byte i) {
		try {
			anInt9181++;
			if (Class108_Sub21.anInt7301 >= 0) {
				for (int i_37_ = 0; ((anIntArray9175.length ^ 0xffffffff) < (i_37_ ^ 0xffffffff)); i_37_++) {
					if (!class146.method927((byte) -114,
							Class108_Sub21.anInt7301, anIntArray9175[i_37_]))
						return false;
				}
			} else {
				for (int i_38_ = 0; ((anIntArray9175.length ^ 0xffffffff) < (i_38_ ^ 0xffffffff)); i_38_++) {
					if (!class146.method918(anIntArray9175[i_38_], 127))
						return false;
				}
			}
			int i_39_ = 0;
			if (i != 87)
				return true;
			for (/**/; (i_39_ ^ 0xffffffff) > (anIntArray9183.length ^ 0xffffffff); i_39_++) {
				if (!interface1.method2(anIntArray9183[i_39_], -111))
					return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oea.D("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (interface1 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method3590(int i) {
		do {
			try {
				aClass40_9190 = null;
				aClass160_9191 = null;
				aClass341_9179 = null;
				aClass218_9187 = null;
				if (i == 7407)
					break;
				method3593((byte) 114, -89);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "oea.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final float[] method3591(boolean bool, int i, Interface1 interface1,
			Class146 class146, int i_40_, int i_41_) {
		try {
			if (i_40_ != 10028)
				method3590(-120);
			Class256_Sub1.anInterface1_5321 = interface1;
			anInt9186++;
			Class339.aClass146_4481 = class146;
			for (int i_42_ = 0; ((i_42_ ^ 0xffffffff) > (aClass11_Sub2Array9180.length ^ 0xffffffff)); i_42_++)
				aClass11_Sub2Array9180[i_42_].method2259(i, i_40_ - 10029,
						i_41_);
			Class239_Sub2.method3189(-11775, i_41_, i);
			float[] fs = new float[i_41_ * i * 4];
			int i_43_ = 0;
			for (int i_44_ = 0; i_44_ < i; i_44_++) {
				int[] is;
				int[] is_45_;
				int[] is_46_;
				if (!((Class11_Sub2) aClass11_Sub2_9184).aBool5044) {
					int[][] is_47_ = aClass11_Sub2_9184.method2255(i_44_,
							i_40_ ^ 0x272d);
					is_46_ = is_47_[0];
					is_45_ = is_47_[2];
					is = is_47_[1];
				} else {
					int[] is_48_ = aClass11_Sub2_9184.method2254(i_44_, true);
					is = is_48_;
					is_45_ = is_48_;
					is_46_ = is_48_;
				}
				int[] is_49_;
				if (((Class11_Sub2) aClass11_Sub2_9176).aBool5044)
					is_49_ = aClass11_Sub2_9176.method2254(i_44_, true);
				else
					is_49_ = aClass11_Sub2_9176.method2255(i_44_, 1)[0];
				if (bool)
					i_43_ = i_44_ << 2;
				int[] is_50_;
				if (!((Class11_Sub2) aClass11_Sub2_9188).aBool5044)
					is_50_ = aClass11_Sub2_9188.method2255(i_44_, 1)[0];
				else
					is_50_ = aClass11_Sub2_9188.method2254(i_44_, true);
				for (int i_51_ = i_41_ - 1; i_51_ >= 0; i_51_--) {
					float f = (float) is_49_[i_51_] / 4096.0F;
					if (!(f < 0.0F)) {
						if (f > 1.0F)
							f = 1.0F;
					} else
						f = 0.0F;
					float f_52_ = ((1.0F + (float) is_50_[i_51_] * 31.0F / 4096.0F) / 4096.0F);
					fs[i_43_++] = f_52_ * (float) is_46_[i_51_];
					fs[i_43_++] = (float) is[i_51_] * f_52_;
					fs[i_43_++] = f_52_ * (float) is_45_[i_51_];
					fs[i_43_++] = f;
					if (bool)
						i_43_ += -4 + (i_41_ << 2);
				}
			}
			for (int i_53_ = 0; ((aClass11_Sub2Array9180.length ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++)
				aClass11_Sub2Array9180[i_53_].method2257((byte) -43);
			return fs;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oea.G(" + bool + ','
					+ i + ',' + (interface1 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i_40_ + ','
					+ i_41_ + ')'));
		}
	}

	static final int method3592(int i, int i_54_, byte i_55_, int i_56_) {
		try {
			anInt9178++;
			int i_57_ = i_56_ / i_54_;
			int i_58_ = -1 + i_54_ & i_56_;
			int i_59_ = i / i_54_;
			int i_60_ = i & i_54_ - 1;
			int i_61_ = Class231.method1480(255, i_59_, i_57_);
			int i_62_ = Class231.method1480(255, i_59_, i_57_ + 1);
			int i_63_ = Class231.method1480(255, i_59_ + 1, i_57_);
			if (i_55_ != 93)
				return -127;
			int i_64_ = Class231.method1480(i_55_ ^ 0xa2, i_59_ + 1, 1 + i_57_);
			int i_65_ = Class237.method1514(i_58_, i_54_, (byte) 103, i_62_,
					i_61_);
			int i_66_ = Class237.method1514(i_58_, i_54_, (byte) 103, i_64_,
					i_63_);
			return Class237.method1514(i_60_, i_54_, (byte) 103, i_66_, i_65_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oea.B(" + i + ','
					+ i_54_ + ',' + i_55_ + ',' + i_56_ + ')'));
		}
	}

	static final void method3593(byte i, int i_67_) {
		try {
			anInt9185++;
			if ((i_67_ ^ 0xffffffff) > -1 || i_67_ > 2)
				i_67_ = 0;
			int i_68_ = 126 / ((i - 75) / 51);
			Class280.anInt3787 = i_67_;
			Class226.aClass376_Sub10Array3105 = (new Class376_Sub10[Class131.anIntArray1835[Class280.anInt3787] + 1]);
			Class1.anInt6 = 0;
			Class68.anInt976 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oea.C(" + i + ','
					+ i_67_ + ')');
		}
	}

	public Class11_Sub45_Sub12() {
		try {
			anIntArray9183 = new int[0];
			anIntArray9175 = new int[0];
			aClass11_Sub2_9188 = new Class11_Sub2_Sub22(0);
			((Class11_Sub2) aClass11_Sub2_9188).anInt5046 = 1;
			aClass11_Sub2_9184 = new Class11_Sub2_Sub22();
			((Class11_Sub2) aClass11_Sub2_9184).anInt5046 = 1;
			aClass11_Sub2_9176 = new Class11_Sub2_Sub22();
			((Class11_Sub2) aClass11_Sub2_9176).anInt5046 = 1;
			aClass11_Sub2Array9180 = new Class11_Sub2[] { aClass11_Sub2_9184,
					aClass11_Sub2_9176, aClass11_Sub2_9188 };
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oea.<init>(" + ')');
		}
	}

	Class11_Sub45_Sub12(Stream stream) {
		try {
			int i = stream.readUnsignedByte((byte) 35);
			int i_69_ = 0;
			int i_70_ = 0;
			aClass11_Sub2Array9180 = new Class11_Sub2[i];
			int[][] is = new int[i][];
			for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > (i ^ 0xffffffff); i_71_++) {
				Class11_Sub2 class11_sub2 = Class358.method2129(17956, stream);
				if ((class11_sub2.method2253(8347) ^ 0xffffffff) <= -1)
					i_69_++;
				if (class11_sub2.method2258(-1) >= 0)
					i_70_++;
				int i_72_ = (((Class11_Sub2) class11_sub2).aClass11_Sub2Array5037).length;
				is[i_71_] = new int[i_72_];
				for (int i_73_ = 0; i_73_ < i_72_; i_73_++)
					is[i_71_][i_73_] = stream.readUnsignedByte((byte) 35);
				aClass11_Sub2Array9180[i_71_] = class11_sub2;
			}
			anIntArray9175 = new int[i_69_];
			anIntArray9183 = new int[i_70_];
			i_69_ = 0;
			i_70_ = 0;
			for (int i_74_ = 0; i_74_ < i; i_74_++) {
				Class11_Sub2 class11_sub2 = aClass11_Sub2Array9180[i_74_];
				int i_75_ = (((Class11_Sub2) class11_sub2).aClass11_Sub2Array5037).length;
				for (int i_76_ = 0; i_75_ > i_76_; i_76_++)
					((Class11_Sub2) class11_sub2).aClass11_Sub2Array5037[i_76_] = aClass11_Sub2Array9180[is[i_74_][i_76_]];
				int i_77_ = class11_sub2.method2253(8347);
				int i_78_ = class11_sub2.method2258(-1);
				if ((i_77_ ^ 0xffffffff) < -1)
					anIntArray9175[i_69_++] = i_77_;
				if (i_78_ > 0)
					anIntArray9183[i_70_++] = i_78_;
				is[i_74_] = null;
			}
			aClass11_Sub2_9184 = aClass11_Sub2Array9180[stream
					.readUnsignedByte((byte) 35)];
			aClass11_Sub2_9176 = aClass11_Sub2Array9180[stream
					.readUnsignedByte((byte) 35)];
			Object object = null;
			aClass11_Sub2_9188 = aClass11_Sub2Array9180[stream
					.readUnsignedByte((byte) 35)];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oea.<init>("
					+ (stream != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass218_9187 = new Class218();
		aClass160_9191 = new IncomingPacket(105, -1);
	}
}
