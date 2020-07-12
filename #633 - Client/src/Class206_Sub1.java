/* Class206_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class206_Sub1 extends Class206 {
	private int[] anIntArray5990;
	private Class206_Sub1 aClass206_Sub1_5991;
	private Class206_Sub1 aClass206_Sub1_5992;
	private short aShort5993;
	private int[] anIntArray5994;
	private Class145[] aClass145Array5995;
	private int anInt5996;
	private Class145[] aClass145Array5997;
	private boolean aBool5998 = false;
	private short aShort5999;
	private short[] aShortArray6000;
	private Class206_Sub1 aClass206_Sub1_6001;
	private short[] aShortArray6002;
	private int[] anIntArray6003;
	private Class261[] aClass261Array6004;
	private boolean aBool6005;
	private Class162[] aClass162Array6006;
	private static int anInt6007;
	private Class296 aClass296_6008;
	private short aShort6009;
	private int anInt6010;
	private boolean aBool6011;
	private byte[] aByteArray6012;
	private Class216[] aClass216Array6013;
	private int[] anIntArray6014;
	private boolean aBool6015;
	private short aShort6016;
	static int anInt6017;
	private Class206_Sub1 aClass206_Sub1_6018;
	private Class206_Sub1 aClass206_Sub1_6019;
	private boolean aBool6020 = false;
	static int anInt6021 = 4096;
	private byte[] aByteArray6022;
	private int[] anIntArray6023;
	private int[] anIntArray6024;
	private byte[] aByteArray6025;
	private int anInt6026;
	private short aShort6027;
	private Class325[] aClass325Array6028;
	private short[] aShortArray6029;
	private short aShort6030;
	private short[] aShortArray6031;
	private int[][] anIntArrayArray6032;
	private short[] aShortArray6033;
	private int anInt6034;
	private int anInt6035;
	private int[] anIntArray6036;
	private int[] anIntArray6037;
	private Class110[] aClass110Array6038;
	private int anInt6039;
	private short[] aShortArray6040;
	private boolean aBool6041;
	private int anInt6042;
	private int[] anIntArray6043;
	private int[] anIntArray6044;
	private float[][] aFloatArrayArray6045;
	private int anInt6046;
	private Class206_Sub1 aClass206_Sub1_6047;
	private int[] anIntArray6048;
	private float[][] aFloatArrayArray6049;
	private Class206_Sub1 aClass206_Sub1_6050;
	private short[] aShortArray6051;
	private int[] anIntArray6052;
	private int[] anIntArray6053;
	private Class33_Sub3 aClass33_Sub3_6054;
	private short[] aShortArray6055;
	private Class363 aClass363_6056;
	private int anInt6057;
	private int anInt6058;
	private int[][] anIntArrayArray6059;
	private boolean aBool6060;
	private short aShort6061;
	private Class206_Sub1 aClass206_Sub1_6062;
	private Class206_Sub1 aClass206_Sub1_6063;
	private int[] anIntArray6064;
	private int[] anIntArray6065;
	private int[] anIntArray6066;
	private Class206_Sub1 aClass206_Sub1_6067;
	private short aShort6068;
	private int[] anIntArray6069;
	private int[] anIntArray6070;
	private int[] anIntArray6071;
	private Class163_Sub1 aClass163_Sub1_6072;
	private int[] anIntArray6073;
	private Class363 aClass363_6074;
	private int[] anIntArray6075;
	private int anInt6076;
	private int[][] anIntArrayArray6077;
	private int[] anIntArray6078;
	private int[] anIntArray6079;

	private final boolean method2574(int i, int i_0_, Class33 class33,
			boolean bool, int i_1_, int i_2_) {
		aClass33_Sub3_6054 = (Class33_Sub3) class33;
		Class33_Sub3 class33_sub3 = ((Class163_Sub1) aClass163_Sub1_6072).aClass33_Sub3_5207;
		float f = (((Class33_Sub3) class33_sub3).aFloat7197 + ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
				+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7193 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175)));
		float f_3_ = (((Class33_Sub3) class33_sub3).aFloat7190 + ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
				+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7182 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175)));
		float f_4_ = (((Class33_Sub3) class33_sub3).aFloat7175 + ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
				+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175)));
		float f_5_ = ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
				+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7193 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7196));
		float f_6_ = ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
				+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7193 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7185));
		float f_7_ = ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
				+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7193 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7166));
		float f_8_ = ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
				+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7182 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7196));
		float f_9_ = ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
				+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7182 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7185));
		float f_10_ = ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
				+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7182 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7166));
		float f_11_ = ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
				+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7196));
		float f_12_ = ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
				+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7185));
		float f_13_ = ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
				+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7166));
		boolean bool_14_ = false;
		int i_15_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5181;
		int i_16_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5197;
		int i_17_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5215;
		int i_18_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5205;
		int i_19_ = 2147483647;
		int i_20_ = -2147483648;
		int i_21_ = 2147483647;
		int i_22_ = -2147483648;
		method2581(Thread.currentThread());
		if (!aBool6041)
			method2593();
		int i_23_ = aShort5993 - aShort6068 >> 1;
		int i_24_ = aShort6030 - aShort6009 >> 1;
		int i_25_ = aShort6061 - aShort6016 >> 1;
		int i_26_ = aShort6068 + i_23_;
		int i_27_ = aShort6009 + i_24_;
		int i_28_ = aShort6016 + i_25_;
		int i_29_ = i_26_ - (i_23_ << i_1_);
		int i_30_ = i_27_ - (i_24_ << i_1_);
		int i_31_ = i_28_ - (i_25_ << i_1_);
		int i_32_ = i_26_ + (i_23_ << i_1_);
		int i_33_ = i_27_ + (i_24_ << i_1_);
		int i_34_ = i_28_ + (i_25_ << i_1_);
		anIntArray6070[0] = i_29_;
		anIntArray6048[0] = i_30_;
		anIntArray6073[0] = i_31_;
		anIntArray6070[1] = i_32_;
		anIntArray6048[1] = i_30_;
		anIntArray6073[1] = i_31_;
		anIntArray6070[2] = i_29_;
		anIntArray6048[2] = i_33_;
		anIntArray6073[2] = i_31_;
		anIntArray6070[3] = i_32_;
		anIntArray6048[3] = i_33_;
		anIntArray6073[3] = i_31_;
		anIntArray6070[4] = i_29_;
		anIntArray6048[4] = i_30_;
		anIntArray6073[4] = i_34_;
		anIntArray6070[5] = i_32_;
		anIntArray6048[5] = i_30_;
		anIntArray6073[5] = i_34_;
		anIntArray6070[6] = i_29_;
		anIntArray6048[6] = i_33_;
		anIntArray6073[6] = i_34_;
		anIntArray6070[7] = i_32_;
		anIntArray6048[7] = i_33_;
		anIntArray6073[7] = i_34_;
		for (int i_35_ = 0; i_35_ < 8; i_35_++) {
			int i_36_ = anIntArray6070[i_35_];
			int i_37_ = anIntArray6048[i_35_];
			int i_38_ = anIntArray6073[i_35_];
			float f_39_ = f
					+ (f_5_ * (float) i_36_ + f_6_ * (float) i_37_ + f_7_
							* (float) i_38_);
			float f_40_ = f_3_
					+ (f_8_ * (float) i_36_ + f_9_ * (float) i_37_ + f_10_
							* (float) i_38_);
			float f_41_ = f_4_
					+ (f_11_ * (float) i_36_ + f_12_ * (float) i_37_ + f_13_
							* (float) i_38_);
			if (f_41_ >= (float) ((Class163_Sub1) aClass163_Sub1_6072).anInt5200) {
				if (i_2_ > 0)
					f_41_ = (float) i_2_;
				int i_42_ = i_15_ + (int) (f_39_ * (float) i_17_ / f_41_);
				int i_43_ = i_16_ + (int) (f_40_ * (float) i_18_ / f_41_);
				if (i_42_ < i_19_)
					i_19_ = i_42_;
				if (i_42_ > i_20_)
					i_20_ = i_42_;
				if (i_43_ < i_21_)
					i_21_ = i_43_;
				if (i_43_ > i_22_)
					i_22_ = i_43_;
				bool_14_ = true;
			}
		}
		if (bool_14_ && i > i_19_ && i < i_20_ && i_0_ > i_21_ && i_0_ < i_22_) {
			if (bool)
				return true;
			for (int i_44_ = 0; i_44_ < anInt6010; i_44_++) {
				int i_45_ = anIntArray6053[i_44_];
				int i_46_ = anIntArray6071[i_44_];
				int i_47_ = anIntArray6036[i_44_];
				float f_48_ = f
						+ (f_5_ * (float) i_45_ + f_6_ * (float) i_46_ + f_7_
								* (float) i_47_);
				float f_49_ = f_3_
						+ (f_8_ * (float) i_45_ + f_9_ * (float) i_46_ + f_10_
								* (float) i_47_);
				float f_50_ = f_4_
						+ (f_11_ * (float) i_45_ + f_12_ * (float) i_46_ + f_13_
								* (float) i_47_);
				if (f_50_ >= (float) (((Class163_Sub1) aClass163_Sub1_6072).anInt5200)) {
					if (i_2_ > 0)
						f_50_ = (float) i_2_;
					anIntArray6014[i_44_] = i_15_
							+ (int) (f_48_ * (float) i_17_ / f_50_);
					anIntArray6003[i_44_] = i_16_
							+ (int) (f_49_ * (float) i_18_ / f_50_);
				} else
					anIntArray6014[i_44_] = -999999;
			}
			for (int i_51_ = 0; i_51_ < anInt6034; i_51_++) {
				if (anIntArray6014[aShortArray6051[i_51_]] != -999999
						&& anIntArray6014[aShortArray6000[i_51_]] != -999999
						&& anIntArray6014[aShortArray6002[i_51_]] != -999999
						&& method2596(i, i_0_,
								anIntArray6003[aShortArray6051[i_51_]],
								anIntArray6003[aShortArray6000[i_51_]],
								anIntArray6003[aShortArray6002[i_51_]],
								anIntArray6014[aShortArray6051[i_51_]],
								anIntArray6014[aShortArray6000[i_51_]],
								anIntArray6014[aShortArray6002[i_51_]]))
					return true;
			}
		}
		return false;
	}

	final void FA(int i) {
		if ((anInt6035 & 0x6) != 6)
			throw new IllegalStateException();
		int i_52_ = Class335.anIntArray4436[i];
		int i_53_ = Class335.anIntArray4430[i];
		synchronized (this) {
			for (int i_54_ = 0; i_54_ < anInt6010; i_54_++) {
				int i_55_ = ((anIntArray6071[i_54_] * i_53_ - anIntArray6036[i_54_]
						* i_52_) >> 14);
				anIntArray6036[i_54_] = (anIntArray6071[i_54_] * i_52_ + anIntArray6036[i_54_]
						* i_53_) >> 14;
				anIntArray6071[i_54_] = i_55_;
			}
			method2597();
		}
	}

	private final boolean method2575(int i) {
		if (aByteArray6025 == null)
			return false;
		if (aByteArray6025[i] == 0)
			return false;
		return true;
	}

	private final void method2576(boolean bool, boolean bool_56_, int i,
			int i_57_) {
		if (aClass325Array6028 != null) {
			for (int i_58_ = 0; i_58_ < anInt6076; i_58_++) {
				Class325 class325 = aClass325Array6028[i_58_];
				anIntArray6037[((Class325) class325).anInt4333] = i_58_;
			}
		}
		if (aBool6060 || aClass325Array6028 != null) {
			if ((anInt6035 & 0x100) == 0 && aShortArray6029 != null) {
				for (int i_59_ = 0; i_59_ < anInt6034; i_59_++) {
					short i_60_ = aShortArray6029[i_59_];
					method2599(i_60_, bool, bool_56_);
				}
			} else {
				for (int i_61_ = 0; i_61_ < anInt6034; i_61_++) {
					if (!method2575(i_61_) && !method2598(i_61_))
						method2599(i_61_, bool, bool_56_);
				}
				if (aByteArray6022 == null) {
					for (int i_62_ = 0; i_62_ < anInt6034; i_62_++) {
						if (method2575(i_62_) || method2598(i_62_))
							method2599(i_62_, bool, bool_56_);
					}
				} else {
					for (int i_63_ = 0; i_63_ < 12; i_63_++) {
						for (int i_64_ = 0; i_64_ < anInt6034; i_64_++) {
							if (aByteArray6022[i_64_] == i_63_
									&& (method2575(i_64_) || method2598(i_64_)))
								method2599(i_64_, bool, bool_56_);
						}
					}
				}
			}
		} else {
			for (int i_65_ = 0; i_65_ < anInt6034; i_65_++)
				method2599(i_65_, bool, bool_56_);
		}
	}

	final boolean F() {
		return aBool6060;
	}

	private final void method2577() {
		for (int i = 0; i < anInt6034; i++) {
			short i_66_ = aShortArray6055 != null ? aShortArray6055[i]
					: (short) -1;
			if (i_66_ == -1) {
				int i_67_ = aShortArray6033[i] & 0xffff;
				int i_68_ = (i_67_ & 0x7f) * anInt6046 >> 7;
				short i_69_ = Class147.method942(0, i_67_ & ~0x7f | i_68_);
				if (anIntArray6069[i] == -1) {
					int i_70_ = anIntArray6065[i] & ~0x1ffff;
					anIntArray6065[i] = i_70_
							| Class2_Sub9.method2949(i_70_ >> 17, i_69_,
									(byte) -122);
				} else if (anIntArray6069[i] != -2) {
					int i_71_ = anIntArray6065[i] & ~0x1ffff;
					anIntArray6065[i] = i_71_
							| Class2_Sub9.method2949(i_71_ >> 17, i_69_,
									(byte) -103);
					i_71_ = anIntArray6066[i] & ~0x1ffff;
					anIntArray6066[i] = i_71_
							| Class2_Sub9.method2949(i_71_ >> 17, i_69_,
									(byte) -97);
					i_71_ = anIntArray6069[i] & ~0x1ffff;
					anIntArray6069[i] = i_71_
							| Class2_Sub9.method2949(i_71_ >> 17, i_69_,
									(byte) -86);
				}
			}
		}
		anInt6058 = 2;
	}

	final Class110[] method1307() {
		return aClass110Array6038;
	}

	private final Class206 method2578(Class206_Sub1 class206_sub1_72_,
			Class206_Sub1 class206_sub1_73_, int i, boolean bool,
			boolean bool_74_) {
		class206_sub1_72_.aBool6041 = aBool6041;
		if (aBool6041) {
			class206_sub1_72_.aShort5993 = aShort5993;
			class206_sub1_72_.aShort6030 = aShort6030;
			class206_sub1_72_.aShort6061 = aShort6061;
			class206_sub1_72_.aShort6068 = aShort6068;
			class206_sub1_72_.aShort6009 = aShort6009;
			class206_sub1_72_.aShort6016 = aShort6016;
			class206_sub1_72_.aShort6027 = aShort6027;
			class206_sub1_72_.aShort5999 = aShort5999;
		}
		class206_sub1_72_.anInt6046 = anInt6046;
		class206_sub1_72_.anInt6039 = anInt6039;
		class206_sub1_72_.anInt6010 = anInt6010;
		class206_sub1_72_.anInt6042 = anInt6042;
		class206_sub1_72_.anInt6034 = anInt6034;
		class206_sub1_72_.anInt6076 = anInt6076;
		if ((i & 0x100) != 0)
			class206_sub1_72_.aBool6060 = true;
		else
			class206_sub1_72_.aBool6060 = aBool6060;
		class206_sub1_72_.aBool6020 = aBool6020;
		boolean bool_75_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_76_ = bool_75_ || (i & 0x1) != 0;
		boolean bool_77_ = bool_75_ || (i & 0x2) != 0;
		boolean bool_78_ = bool_75_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_76_ || bool_77_ || bool_78_) {
			if (bool_76_) {
				if (class206_sub1_73_.anIntArray6053 == null
						|| class206_sub1_73_.anIntArray6053.length < anInt6010)
					class206_sub1_72_.anIntArray6053 = class206_sub1_73_.anIntArray6053 = new int[anInt6010];
				else
					class206_sub1_72_.anIntArray6053 = class206_sub1_73_.anIntArray6053;
				for (int i_79_ = 0; i_79_ < anInt6010; i_79_++)
					class206_sub1_72_.anIntArray6053[i_79_] = anIntArray6053[i_79_];
			} else
				class206_sub1_72_.anIntArray6053 = anIntArray6053;
			if (bool_77_) {
				if (class206_sub1_73_.anIntArray6071 == null
						|| class206_sub1_73_.anIntArray6071.length < anInt6010)
					class206_sub1_72_.anIntArray6071 = class206_sub1_73_.anIntArray6071 = new int[anInt6010];
				else
					class206_sub1_72_.anIntArray6071 = class206_sub1_73_.anIntArray6071;
				for (int i_80_ = 0; i_80_ < anInt6010; i_80_++)
					class206_sub1_72_.anIntArray6071[i_80_] = anIntArray6071[i_80_];
			} else
				class206_sub1_72_.anIntArray6071 = anIntArray6071;
			if (bool_78_) {
				if (class206_sub1_73_.anIntArray6036 == null
						|| class206_sub1_73_.anIntArray6036.length < anInt6010)
					class206_sub1_72_.anIntArray6036 = class206_sub1_73_.anIntArray6036 = new int[anInt6010];
				else
					class206_sub1_72_.anIntArray6036 = class206_sub1_73_.anIntArray6036;
				for (int i_81_ = 0; i_81_ < anInt6010; i_81_++)
					class206_sub1_72_.anIntArray6036[i_81_] = anIntArray6036[i_81_];
			} else
				class206_sub1_72_.anIntArray6036 = anIntArray6036;
		} else {
			class206_sub1_72_.anIntArray6053 = anIntArray6053;
			class206_sub1_72_.anIntArray6071 = anIntArray6071;
			class206_sub1_72_.anIntArray6036 = anIntArray6036;
		}
		if ((i & 0x84080) != 0) {
			if (class206_sub1_73_.aShortArray6033 == null
					|| class206_sub1_73_.aShortArray6033.length < anInt6034) {
				int i_82_ = anInt6034;
				class206_sub1_72_.aShortArray6033 = class206_sub1_73_.aShortArray6033 = new short[i_82_];
			} else
				class206_sub1_72_.aShortArray6033 = class206_sub1_73_.aShortArray6033;
			for (int i_83_ = 0; i_83_ < anInt6034; i_83_++)
				class206_sub1_72_.aShortArray6033[i_83_] = aShortArray6033[i_83_];
		} else
			class206_sub1_72_.aShortArray6033 = aShortArray6033;
		if ((i & 0x97018) != 0) {
			class206_sub1_72_.anInt6058 = 0;
			class206_sub1_72_.anIntArray6065 = class206_sub1_72_.anIntArray6066 = class206_sub1_72_.anIntArray6069 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_74_)
				method2580(false);
			if (anIntArray6065 != null) {
				if (class206_sub1_73_.anIntArray6065 == null
						|| class206_sub1_73_.anIntArray6065.length < anInt6034) {
					int i_84_ = anInt6034;
					class206_sub1_72_.anIntArray6065 = class206_sub1_73_.anIntArray6065 = new int[i_84_];
					class206_sub1_72_.anIntArray6066 = class206_sub1_73_.anIntArray6066 = new int[i_84_];
					class206_sub1_72_.anIntArray6069 = class206_sub1_73_.anIntArray6069 = new int[i_84_];
				} else {
					class206_sub1_72_.anIntArray6065 = class206_sub1_73_.anIntArray6065;
					class206_sub1_72_.anIntArray6066 = class206_sub1_73_.anIntArray6066;
					class206_sub1_72_.anIntArray6069 = class206_sub1_73_.anIntArray6069;
				}
				for (int i_85_ = 0; i_85_ < anInt6034; i_85_++) {
					class206_sub1_72_.anIntArray6065[i_85_] = anIntArray6065[i_85_];
					class206_sub1_72_.anIntArray6066[i_85_] = anIntArray6066[i_85_];
					class206_sub1_72_.anIntArray6069[i_85_] = anIntArray6069[i_85_];
				}
			}
			class206_sub1_72_.anInt6058 = anInt6058;
		} else {
			if (bool_74_)
				method2580(false);
			class206_sub1_72_.anIntArray6065 = anIntArray6065;
			class206_sub1_72_.anIntArray6066 = anIntArray6066;
			class206_sub1_72_.anIntArray6069 = anIntArray6069;
			class206_sub1_72_.anInt6058 = anInt6058;
		}
		if ((i & 0x100) != 0) {
			if (class206_sub1_73_.aByteArray6025 == null
					|| class206_sub1_73_.aByteArray6025.length < anInt6034) {
				int i_86_ = anInt6034;
				class206_sub1_72_.aByteArray6025 = class206_sub1_73_.aByteArray6025 = new byte[i_86_];
			} else
				class206_sub1_72_.aByteArray6025 = class206_sub1_73_.aByteArray6025;
			if (aByteArray6025 != null) {
				for (int i_87_ = 0; i_87_ < anInt6034; i_87_++)
					class206_sub1_72_.aByteArray6025[i_87_] = aByteArray6025[i_87_];
			} else {
				for (int i_88_ = 0; i_88_ < anInt6034; i_88_++)
					class206_sub1_72_.aByteArray6025[i_88_] = (byte) 0;
			}
		} else
			class206_sub1_72_.aByteArray6025 = aByteArray6025;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class206_sub1_73_.aClass145Array5997 == null
					|| class206_sub1_73_.aClass145Array5997.length < anInt6042) {
				int i_89_ = anInt6042;
				class206_sub1_72_.aClass145Array5997 = class206_sub1_73_.aClass145Array5997 = new Class145[i_89_];
			} else
				class206_sub1_72_.aClass145Array5997 = class206_sub1_73_.aClass145Array5997;
			if (aClass145Array5997 != null) {
				for (int i_90_ = 0; i_90_ < anInt6042; i_90_++)
					class206_sub1_72_.aClass145Array5997[i_90_] = new Class145(
							aClass145Array5997[i_90_]);
			} else
				class206_sub1_72_.aClass145Array5997 = null;
			if (aClass162Array6006 != null) {
				if (class206_sub1_73_.aClass162Array6006 == null
						|| (class206_sub1_73_.aClass162Array6006.length < anInt6034)) {
					int i_91_ = anInt6034;
					class206_sub1_72_.aClass162Array6006 = class206_sub1_73_.aClass162Array6006 = new Class162[i_91_];
				} else
					class206_sub1_72_.aClass162Array6006 = class206_sub1_73_.aClass162Array6006;
				for (int i_92_ = 0; i_92_ < anInt6034; i_92_++)
					class206_sub1_72_.aClass162Array6006[i_92_] = (aClass162Array6006[i_92_] != null ? new Class162(
							aClass162Array6006[i_92_]) : null);
			} else
				class206_sub1_72_.aClass162Array6006 = null;
		} else {
			if (bool_74_)
				method2579();
			class206_sub1_72_.aClass145Array5997 = aClass145Array5997;
			class206_sub1_72_.aClass162Array6006 = aClass162Array6006;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray6055 == null)
				class206_sub1_72_.aShortArray6055 = null;
			else {
				if (class206_sub1_73_.aShortArray6055 == null
						|| class206_sub1_73_.aShortArray6055.length < anInt6034) {
					int i_93_ = anInt6034;
					class206_sub1_72_.aShortArray6055 = class206_sub1_73_.aShortArray6055 = new short[i_93_];
				} else
					class206_sub1_72_.aShortArray6055 = class206_sub1_73_.aShortArray6055;
				for (int i_94_ = 0; i_94_ < anInt6034; i_94_++)
					class206_sub1_72_.aShortArray6055[i_94_] = aShortArray6055[i_94_];
			}
		} else
			class206_sub1_72_.aShortArray6055 = aShortArray6055;
		if ((i & 0x10000) != 0) {
			if (aByteArray6012 == null)
				class206_sub1_72_.aByteArray6012 = null;
			else {
				if (class206_sub1_73_.aByteArray6012 == null
						|| class206_sub1_73_.aByteArray6012.length < anInt6034) {
					int i_95_ = bool ? anInt6034 + 100 : anInt6034;
					class206_sub1_72_.aByteArray6012 = class206_sub1_73_.aByteArray6012 = new byte[i_95_];
				} else
					class206_sub1_72_.aByteArray6012 = class206_sub1_73_.aByteArray6012;
				for (int i_96_ = 0; i_96_ < anInt6034; i_96_++)
					class206_sub1_72_.aByteArray6012[i_96_] = aByteArray6012[i_96_];
			}
		} else
			class206_sub1_72_.aByteArray6012 = aByteArray6012;
		if ((i & 0xc580) != 0) {
			if (class206_sub1_73_.aClass216Array6013 == null
					|| class206_sub1_73_.aClass216Array6013.length < anInt6076) {
				int i_97_ = anInt6076;
				class206_sub1_72_.aClass216Array6013 = class206_sub1_73_.aClass216Array6013 = new Class216[i_97_];
				for (int i_98_ = 0; i_98_ < anInt6076; i_98_++)
					class206_sub1_72_.aClass216Array6013[i_98_] = aClass216Array6013[i_98_]
							.method1389(false);
			} else {
				class206_sub1_72_.aClass216Array6013 = class206_sub1_73_.aClass216Array6013;
				for (int i_99_ = 0; i_99_ < anInt6076; i_99_++)
					class206_sub1_72_.aClass216Array6013[i_99_].method1390(
							aClass216Array6013[i_99_], -1);
			}
		} else
			class206_sub1_72_.aClass216Array6013 = aClass216Array6013;
		if (aFloatArrayArray6049 != null && (i & 0x10) != 0) {
			if (class206_sub1_73_.aFloatArrayArray6049 == null
					|| class206_sub1_73_.aFloatArrayArray6049.length < anInt6034) {
				int i_100_ = bool ? anInt6034 + 100 : anInt6034;
				class206_sub1_72_.aFloatArrayArray6049 = class206_sub1_73_.aFloatArrayArray6049 = new float[i_100_][3];
			} else
				class206_sub1_72_.aFloatArrayArray6049 = class206_sub1_73_.aFloatArrayArray6049;
			for (int i_101_ = 0; i_101_ < anInt6034; i_101_++) {
				if (aFloatArrayArray6049[i_101_] != null) {
					class206_sub1_72_.aFloatArrayArray6049[i_101_][0] = aFloatArrayArray6049[i_101_][0];
					class206_sub1_72_.aFloatArrayArray6049[i_101_][1] = aFloatArrayArray6049[i_101_][1];
					class206_sub1_72_.aFloatArrayArray6049[i_101_][2] = aFloatArrayArray6049[i_101_][2];
				}
			}
			if (class206_sub1_73_.aFloatArrayArray6045 == null
					|| class206_sub1_73_.aFloatArrayArray6045.length < anInt6034) {
				int i_102_ = bool ? anInt6034 + 100 : anInt6034;
				class206_sub1_72_.aFloatArrayArray6045 = class206_sub1_73_.aFloatArrayArray6045 = new float[i_102_][3];
			} else
				class206_sub1_72_.aFloatArrayArray6045 = class206_sub1_73_.aFloatArrayArray6045;
			for (int i_103_ = 0; i_103_ < anInt6034; i_103_++) {
				if (aFloatArrayArray6045[i_103_] != null) {
					class206_sub1_72_.aFloatArrayArray6045[i_103_][0] = aFloatArrayArray6045[i_103_][0];
					class206_sub1_72_.aFloatArrayArray6045[i_103_][1] = aFloatArrayArray6045[i_103_][1];
					class206_sub1_72_.aFloatArrayArray6045[i_103_][2] = aFloatArrayArray6045[i_103_][2];
				}
			}
		} else {
			class206_sub1_72_.aFloatArrayArray6049 = aFloatArrayArray6049;
			class206_sub1_72_.aFloatArrayArray6045 = aFloatArrayArray6045;
		}
		class206_sub1_72_.anIntArrayArray6077 = anIntArrayArray6077;
		class206_sub1_72_.anIntArrayArray6059 = anIntArrayArray6059;
		class206_sub1_72_.anIntArrayArray6032 = anIntArrayArray6032;
		class206_sub1_72_.aShortArray6031 = aShortArray6031;
		class206_sub1_72_.aShortArray6040 = aShortArray6040;
		class206_sub1_72_.aByteArray6022 = aByteArray6022;
		class206_sub1_72_.aShortArray6051 = aShortArray6051;
		class206_sub1_72_.aShortArray6000 = aShortArray6000;
		class206_sub1_72_.aShortArray6002 = aShortArray6002;
		class206_sub1_72_.aClass110Array6038 = aClass110Array6038;
		class206_sub1_72_.aClass261Array6004 = aClass261Array6004;
		class206_sub1_72_.aClass325Array6028 = aClass325Array6028;
		class206_sub1_72_.aShortArray6029 = aShortArray6029;
		class206_sub1_72_.anInt6035 = i;
		return class206_sub1_72_;
	}

	final void aa(short i, short i_104_) {
		if (aShortArray6055 != null) {
			if (!aBool6020 && i_104_ >= 0) {
				Class188 class188 = ((Class163) aClass163_Sub1_6072).anInterface1_2118
						.method7((byte) 127, i_104_ & 0xffff);
				if (((Class188) class188).aByte2429 != 0
						|| ((Class188) class188).aByte2415 != 0)
					aBool6020 = true;
			}
			for (int i_105_ = 0; i_105_ < anInt6034; i_105_++) {
				if (aShortArray6055[i_105_] == i)
					aShortArray6055[i_105_] = i_104_;
			}
		}
	}

	final int fa() {
		if (!aBool6041)
			method2593();
		return aShort6009;
	}

	private final void method2579() {
		if (anInt6058 == 0 && aClass145Array5997 == null) {
			if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
				synchronized (this) {
					method2592();
				}
			} else
				method2592();
		}
	}

	final int ua() {
		return anInt6035;
	}

	private final void method2580(boolean bool) {
		if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
			synchronized (this) {
				method2586(bool);
			}
		} else
			method2586(bool);
	}

	private final void method2581(Thread thread) {
		Class363 class363 = aClass163_Sub1_6072.method2306(thread);
		aClass296_6008 = ((Class363) class363).aClass296_4767;
		if (class363 != aClass363_6056) {
			aClass363_6056 = class363;
			anIntArray6079 = ((Class363) aClass363_6056).anIntArray4749;
			anIntArray6043 = ((Class363) aClass363_6056).anIntArray4757;
			anIntArray6023 = ((Class363) aClass363_6056).anIntArray4769;
			anIntArray5990 = ((Class363) aClass363_6056).anIntArray4766;
			anIntArray6014 = ((Class363) aClass363_6056).anIntArray4745;
			anIntArray6003 = ((Class363) aClass363_6056).anIntArray4744;
			anIntArray6024 = ((Class363) aClass363_6056).anIntArray4763;
			anIntArray6070 = ((Class363) aClass363_6056).anIntArray4740;
			anIntArray6048 = ((Class363) aClass363_6056).anIntArray4765;
			anIntArray6073 = ((Class363) aClass363_6056).anIntArray4762;
			anIntArray6064 = ((Class363) aClass363_6056).anIntArray4755;
			anIntArray6052 = ((Class363) aClass363_6056).anIntArray4758;
			anIntArray6044 = ((Class363) aClass363_6056).anIntArray4761;
			anIntArray6078 = ((Class363) aClass363_6056).anIntArray4741;
			anIntArray6075 = ((Class363) aClass363_6056).anIntArray4752;
			anIntArray5994 = ((Class363) aClass363_6056).anIntArray4772;
			anIntArray6037 = ((Class363) aClass363_6056).anIntArray4754;
		}
	}

	private final void method2582() {
		synchronized (this) {
			for (int i = 0; i < anInt6010; i++) {
				anIntArray6053[i] = -anIntArray6053[i];
				anIntArray6036[i] = -anIntArray6036[i];
			}
			method2597();
		}
	}

	final void method1321(Class33 class33, Class376_Sub4 class376_sub4, int i) {
		method2602(class33, class376_sub4, -1, i);
	}

	final void wa() {
		if (aBool6015) {
			for (int i = 0; i < anInt6010; i++) {
				anIntArray6053[i] = anIntArray6053[i] + 7 >> 4;
				anIntArray6071[i] = anIntArray6071[i] + 7 >> 4;
				anIntArray6036[i] = anIntArray6036[i] + 7 >> 4;
			}
			aBool6015 = false;
		}
		if (aBool6005) {
			method2594();
			aBool6005 = false;
		}
		aBool6041 = false;
	}

	final void C(int i) {
		if ((anInt6035 & 0x1000) != 4096)
			throw new IllegalStateException();
		anInt6046 = i;
		anInt6058 = 0;
	}

	final int EA() {
		if (!aBool6041)
			method2593();
		return aShort6030;
	}

	final void I(int i, int[] is, int i_106_, int i_107_, int i_108_,
			boolean bool, int i_109_, int[] is_110_) {
		int i_111_ = is.length;
		if (i == 0) {
			i_106_ <<= 4;
			i_107_ <<= 4;
			i_108_ <<= 4;
			if (!aBool6015) {
				for (int i_112_ = 0; i_112_ < anInt6010; i_112_++) {
					anIntArray6053[i_112_] <<= 4;
					anIntArray6071[i_112_] <<= 4;
					anIntArray6036[i_112_] <<= 4;
				}
				aBool6015 = true;
			}
			int i_113_ = 0;
			anInt6057 = 0;
			anInt6026 = 0;
			anInt5996 = 0;
			for (int i_114_ = 0; i_114_ < i_111_; i_114_++) {
				int i_115_ = is[i_114_];
				if (i_115_ < anIntArrayArray6077.length) {
					int[] is_116_ = anIntArrayArray6077[i_115_];
					for (int i_117_ = 0; i_117_ < is_116_.length; i_117_++) {
						int i_118_ = is_116_[i_117_];
						if (aShortArray6031 == null
								|| (i_109_ & aShortArray6031[i_118_]) != 0) {
							anInt6057 += anIntArray6053[i_118_];
							anInt6026 += anIntArray6071[i_118_];
							anInt5996 += anIntArray6036[i_118_];
							i_113_++;
						}
					}
				}
			}
			if (i_113_ > 0) {
				anInt6057 = anInt6057 / i_113_ + i_106_;
				anInt6026 = anInt6026 / i_113_ + i_107_;
				anInt5996 = anInt5996 / i_113_ + i_108_;
				aBool5998 = true;
			} else {
				anInt6057 = i_106_;
				anInt6026 = i_107_;
				anInt5996 = i_108_;
			}
		} else if (i == 1) {
			if (is_110_ != null) {
				int i_119_ = ((is_110_[0] * i_106_ + is_110_[1] * i_107_
						+ is_110_[2] * i_108_ + 8192) >> 14);
				int i_120_ = ((is_110_[3] * i_106_ + is_110_[4] * i_107_
						+ is_110_[5] * i_108_ + 8192) >> 14);
				int i_121_ = ((is_110_[6] * i_106_ + is_110_[7] * i_107_
						+ is_110_[8] * i_108_ + 8192) >> 14);
				i_106_ = i_119_;
				i_107_ = i_120_;
				i_108_ = i_121_;
			}
			i_106_ <<= 4;
			i_107_ <<= 4;
			i_108_ <<= 4;
			if (!aBool6015) {
				for (int i_122_ = 0; i_122_ < anInt6010; i_122_++) {
					anIntArray6053[i_122_] <<= 4;
					anIntArray6071[i_122_] <<= 4;
					anIntArray6036[i_122_] <<= 4;
				}
				aBool6015 = true;
			}
			for (int i_123_ = 0; i_123_ < i_111_; i_123_++) {
				int i_124_ = is[i_123_];
				if (i_124_ < anIntArrayArray6077.length) {
					int[] is_125_ = anIntArrayArray6077[i_124_];
					for (int i_126_ = 0; i_126_ < is_125_.length; i_126_++) {
						int i_127_ = is_125_[i_126_];
						if (aShortArray6031 == null
								|| (i_109_ & aShortArray6031[i_127_]) != 0) {
							anIntArray6053[i_127_] += i_106_;
							anIntArray6071[i_127_] += i_107_;
							anIntArray6036[i_127_] += i_108_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_110_ != null) {
				if (!aBool6015) {
					for (int i_128_ = 0; i_128_ < anInt6010; i_128_++) {
						anIntArray6053[i_128_] <<= 4;
						anIntArray6071[i_128_] <<= 4;
						anIntArray6036[i_128_] <<= 4;
					}
					aBool6015 = true;
				}
				int i_129_ = is_110_[9] << 4;
				int i_130_ = is_110_[10] << 4;
				int i_131_ = is_110_[11] << 4;
				int i_132_ = is_110_[12] << 4;
				int i_133_ = is_110_[13] << 4;
				int i_134_ = is_110_[14] << 4;
				if (aBool5998) {
					int i_135_ = ((is_110_[0] * anInt6057 + is_110_[3]
							* anInt6026 + is_110_[6] * anInt5996 + 8192) >> 14);
					int i_136_ = ((is_110_[1] * anInt6057 + is_110_[4]
							* anInt6026 + is_110_[7] * anInt5996 + 8192) >> 14);
					int i_137_ = ((is_110_[2] * anInt6057 + is_110_[5]
							* anInt6026 + is_110_[8] * anInt5996 + 8192) >> 14);
					i_135_ += i_132_;
					i_136_ += i_133_;
					i_137_ += i_134_;
					anInt6057 = i_135_;
					anInt6026 = i_136_;
					anInt5996 = i_137_;
					aBool5998 = false;
				}
				int[] is_138_ = new int[9];
				int i_139_ = Class335.anIntArray4430[i_106_];
				int i_140_ = Class335.anIntArray4436[i_106_];
				int i_141_ = Class335.anIntArray4430[i_107_];
				int i_142_ = Class335.anIntArray4436[i_107_];
				int i_143_ = Class335.anIntArray4430[i_108_];
				int i_144_ = Class335.anIntArray4436[i_108_];
				int i_145_ = i_140_ * i_143_ + 8192 >> 14;
				int i_146_ = i_140_ * i_144_ + 8192 >> 14;
				is_138_[0] = i_141_ * i_143_ + i_142_ * i_146_ + 8192 >> 14;
				is_138_[1] = -i_141_ * i_144_ + i_142_ * i_145_ + 8192 >> 14;
				is_138_[2] = i_142_ * i_139_ + 8192 >> 14;
				is_138_[3] = i_139_ * i_144_ + 8192 >> 14;
				is_138_[4] = i_139_ * i_143_ + 8192 >> 14;
				is_138_[5] = -i_140_;
				is_138_[6] = -i_142_ * i_143_ + i_141_ * i_146_ + 8192 >> 14;
				is_138_[7] = i_142_ * i_144_ + i_141_ * i_145_ + 8192 >> 14;
				is_138_[8] = i_141_ * i_139_ + 8192 >> 14;
				int i_147_ = (is_138_[0] * -anInt6057 + is_138_[1] * -anInt6026
						+ is_138_[2] * -anInt5996 + 8192) >> 14;
				int i_148_ = (is_138_[3] * -anInt6057 + is_138_[4] * -anInt6026
						+ is_138_[5] * -anInt5996 + 8192) >> 14;
				int i_149_ = (is_138_[6] * -anInt6057 + is_138_[7] * -anInt6026
						+ is_138_[8] * -anInt5996 + 8192) >> 14;
				int i_150_ = i_147_ + anInt6057;
				int i_151_ = i_148_ + anInt6026;
				int i_152_ = i_149_ + anInt5996;
				int[] is_153_ = new int[9];
				for (int i_154_ = 0; i_154_ < 3; i_154_++) {
					for (int i_155_ = 0; i_155_ < 3; i_155_++) {
						int i_156_ = 0;
						for (int i_157_ = 0; i_157_ < 3; i_157_++)
							i_156_ += (is_138_[i_154_ * 3 + i_157_] * is_110_[i_155_
									* 3 + i_157_]);
						is_153_[i_154_ * 3 + i_155_] = i_156_ + 8192 >> 14;
					}
				}
				int i_158_ = ((is_138_[0] * i_132_ + is_138_[1] * i_133_
						+ is_138_[2] * i_134_ + 8192) >> 14);
				int i_159_ = ((is_138_[3] * i_132_ + is_138_[4] * i_133_
						+ is_138_[5] * i_134_ + 8192) >> 14);
				int i_160_ = ((is_138_[6] * i_132_ + is_138_[7] * i_133_
						+ is_138_[8] * i_134_ + 8192) >> 14);
				i_158_ += i_150_;
				i_159_ += i_151_;
				i_160_ += i_152_;
				int[] is_161_ = new int[9];
				for (int i_162_ = 0; i_162_ < 3; i_162_++) {
					for (int i_163_ = 0; i_163_ < 3; i_163_++) {
						int i_164_ = 0;
						for (int i_165_ = 0; i_165_ < 3; i_165_++)
							i_164_ += (is_110_[i_162_ * 3 + i_165_] * is_153_[i_163_
									+ i_165_ * 3]);
						is_161_[i_162_ * 3 + i_163_] = i_164_ + 8192 >> 14;
					}
				}
				int i_166_ = ((is_110_[0] * i_158_ + is_110_[1] * i_159_
						+ is_110_[2] * i_160_ + 8192) >> 14);
				int i_167_ = ((is_110_[3] * i_158_ + is_110_[4] * i_159_
						+ is_110_[5] * i_160_ + 8192) >> 14);
				int i_168_ = ((is_110_[6] * i_158_ + is_110_[7] * i_159_
						+ is_110_[8] * i_160_ + 8192) >> 14);
				i_166_ += i_129_;
				i_167_ += i_130_;
				i_168_ += i_131_;
				for (int i_169_ = 0; i_169_ < i_111_; i_169_++) {
					int i_170_ = is[i_169_];
					if (i_170_ < anIntArrayArray6077.length) {
						int[] is_171_ = anIntArrayArray6077[i_170_];
						for (int i_172_ = 0; i_172_ < is_171_.length; i_172_++) {
							int i_173_ = is_171_[i_172_];
							if (aShortArray6031 == null
									|| (i_109_ & aShortArray6031[i_173_]) != 0) {
								int i_174_ = ((is_161_[0]
										* anIntArray6053[i_173_] + is_161_[1]
										* anIntArray6071[i_173_] + is_161_[2]
										* anIntArray6036[i_173_] + 8192) >> 14);
								int i_175_ = ((is_161_[3]
										* anIntArray6053[i_173_] + is_161_[4]
										* anIntArray6071[i_173_] + is_161_[5]
										* anIntArray6036[i_173_] + 8192) >> 14);
								int i_176_ = ((is_161_[6]
										* anIntArray6053[i_173_] + is_161_[7]
										* anIntArray6071[i_173_] + is_161_[8]
										* anIntArray6036[i_173_] + 8192) >> 14);
								i_174_ += i_166_;
								i_175_ += i_167_;
								i_176_ += i_168_;
								anIntArray6053[i_173_] = i_174_;
								anIntArray6071[i_173_] = i_175_;
								anIntArray6036[i_173_] = i_176_;
							}
						}
					}
				}
			} else {
				for (int i_177_ = 0; i_177_ < i_111_; i_177_++) {
					int i_178_ = is[i_177_];
					if (i_178_ < anIntArrayArray6077.length) {
						int[] is_179_ = anIntArrayArray6077[i_178_];
						for (int i_180_ = 0; i_180_ < is_179_.length; i_180_++) {
							int i_181_ = is_179_[i_180_];
							if (aShortArray6031 == null
									|| (i_109_ & aShortArray6031[i_181_]) != 0) {
								anIntArray6053[i_181_] -= anInt6057;
								anIntArray6071[i_181_] -= anInt6026;
								anIntArray6036[i_181_] -= anInt5996;
								if (i_108_ != 0) {
									int i_182_ = Class335.anIntArray4436[i_108_];
									int i_183_ = Class335.anIntArray4430[i_108_];
									int i_184_ = ((anIntArray6071[i_181_]
											* i_182_ + anIntArray6053[i_181_]
											* i_183_ + 16383) >> 14);
									anIntArray6071[i_181_] = (anIntArray6071[i_181_]
											* i_183_
											- anIntArray6053[i_181_]
											* i_182_ + 16383) >> 14;
									anIntArray6053[i_181_] = i_184_;
								}
								if (i_106_ != 0) {
									int i_185_ = Class335.anIntArray4436[i_106_];
									int i_186_ = Class335.anIntArray4430[i_106_];
									int i_187_ = ((anIntArray6071[i_181_]
											* i_186_ - anIntArray6036[i_181_]
											* i_185_ + 16383) >> 14);
									anIntArray6036[i_181_] = (anIntArray6071[i_181_]
											* i_185_
											+ anIntArray6036[i_181_]
											* i_186_ + 16383) >> 14;
									anIntArray6071[i_181_] = i_187_;
								}
								if (i_107_ != 0) {
									int i_188_ = Class335.anIntArray4436[i_107_];
									int i_189_ = Class335.anIntArray4430[i_107_];
									int i_190_ = ((anIntArray6036[i_181_]
											* i_188_ + anIntArray6053[i_181_]
											* i_189_ + 16383) >> 14);
									anIntArray6036[i_181_] = (anIntArray6036[i_181_]
											* i_189_
											- anIntArray6053[i_181_]
											* i_188_ + 16383) >> 14;
									anIntArray6053[i_181_] = i_190_;
								}
								anIntArray6053[i_181_] += anInt6057;
								anIntArray6071[i_181_] += anInt6026;
								anIntArray6036[i_181_] += anInt5996;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_110_ != null) {
				if (!aBool6015) {
					for (int i_191_ = 0; i_191_ < anInt6010; i_191_++) {
						anIntArray6053[i_191_] <<= 4;
						anIntArray6071[i_191_] <<= 4;
						anIntArray6036[i_191_] <<= 4;
					}
					aBool6015 = true;
				}
				int i_192_ = is_110_[9] << 4;
				int i_193_ = is_110_[10] << 4;
				int i_194_ = is_110_[11] << 4;
				int i_195_ = is_110_[12] << 4;
				int i_196_ = is_110_[13] << 4;
				int i_197_ = is_110_[14] << 4;
				if (aBool5998) {
					int i_198_ = ((is_110_[0] * anInt6057 + is_110_[3]
							* anInt6026 + is_110_[6] * anInt5996 + 8192) >> 14);
					int i_199_ = ((is_110_[1] * anInt6057 + is_110_[4]
							* anInt6026 + is_110_[7] * anInt5996 + 8192) >> 14);
					int i_200_ = ((is_110_[2] * anInt6057 + is_110_[5]
							* anInt6026 + is_110_[8] * anInt5996 + 8192) >> 14);
					i_198_ += i_195_;
					i_199_ += i_196_;
					i_200_ += i_197_;
					anInt6057 = i_198_;
					anInt6026 = i_199_;
					anInt5996 = i_200_;
					aBool5998 = false;
				}
				int i_201_ = i_106_ << 15 >> 7;
				int i_202_ = i_107_ << 15 >> 7;
				int i_203_ = i_108_ << 15 >> 7;
				int i_204_ = i_201_ * -anInt6057 + 8192 >> 14;
				int i_205_ = i_202_ * -anInt6026 + 8192 >> 14;
				int i_206_ = i_203_ * -anInt5996 + 8192 >> 14;
				int i_207_ = i_204_ + anInt6057;
				int i_208_ = i_205_ + anInt6026;
				int i_209_ = i_206_ + anInt5996;
				int[] is_210_ = new int[9];
				is_210_[0] = i_201_ * is_110_[0] + 8192 >> 14;
				is_210_[1] = i_201_ * is_110_[3] + 8192 >> 14;
				is_210_[2] = i_201_ * is_110_[6] + 8192 >> 14;
				is_210_[3] = i_202_ * is_110_[1] + 8192 >> 14;
				is_210_[4] = i_202_ * is_110_[4] + 8192 >> 14;
				is_210_[5] = i_202_ * is_110_[7] + 8192 >> 14;
				is_210_[6] = i_203_ * is_110_[2] + 8192 >> 14;
				is_210_[7] = i_203_ * is_110_[5] + 8192 >> 14;
				is_210_[8] = i_203_ * is_110_[8] + 8192 >> 14;
				int i_211_ = i_201_ * i_195_ + 8192 >> 14;
				int i_212_ = i_202_ * i_196_ + 8192 >> 14;
				int i_213_ = i_203_ * i_197_ + 8192 >> 14;
				i_211_ += i_207_;
				i_212_ += i_208_;
				i_213_ += i_209_;
				int[] is_214_ = new int[9];
				for (int i_215_ = 0; i_215_ < 3; i_215_++) {
					for (int i_216_ = 0; i_216_ < 3; i_216_++) {
						int i_217_ = 0;
						for (int i_218_ = 0; i_218_ < 3; i_218_++)
							i_217_ += (is_110_[i_215_ * 3 + i_218_] * is_210_[i_216_
									+ i_218_ * 3]);
						is_214_[i_215_ * 3 + i_216_] = i_217_ + 8192 >> 14;
					}
				}
				int i_219_ = ((is_110_[0] * i_211_ + is_110_[1] * i_212_
						+ is_110_[2] * i_213_ + 8192) >> 14);
				int i_220_ = ((is_110_[3] * i_211_ + is_110_[4] * i_212_
						+ is_110_[5] * i_213_ + 8192) >> 14);
				int i_221_ = ((is_110_[6] * i_211_ + is_110_[7] * i_212_
						+ is_110_[8] * i_213_ + 8192) >> 14);
				i_219_ += i_192_;
				i_220_ += i_193_;
				i_221_ += i_194_;
				for (int i_222_ = 0; i_222_ < i_111_; i_222_++) {
					int i_223_ = is[i_222_];
					if (i_223_ < anIntArrayArray6077.length) {
						int[] is_224_ = anIntArrayArray6077[i_223_];
						for (int i_225_ = 0; i_225_ < is_224_.length; i_225_++) {
							int i_226_ = is_224_[i_225_];
							if (aShortArray6031 == null
									|| (i_109_ & aShortArray6031[i_226_]) != 0) {
								int i_227_ = ((is_214_[0]
										* anIntArray6053[i_226_] + is_214_[1]
										* anIntArray6071[i_226_] + is_214_[2]
										* anIntArray6036[i_226_] + 8192) >> 14);
								int i_228_ = ((is_214_[3]
										* anIntArray6053[i_226_] + is_214_[4]
										* anIntArray6071[i_226_] + is_214_[5]
										* anIntArray6036[i_226_] + 8192) >> 14);
								int i_229_ = ((is_214_[6]
										* anIntArray6053[i_226_] + is_214_[7]
										* anIntArray6071[i_226_] + is_214_[8]
										* anIntArray6036[i_226_] + 8192) >> 14);
								i_227_ += i_219_;
								i_228_ += i_220_;
								i_229_ += i_221_;
								anIntArray6053[i_226_] = i_227_;
								anIntArray6071[i_226_] = i_228_;
								anIntArray6036[i_226_] = i_229_;
							}
						}
					}
				}
			} else {
				for (int i_230_ = 0; i_230_ < i_111_; i_230_++) {
					int i_231_ = is[i_230_];
					if (i_231_ < anIntArrayArray6077.length) {
						int[] is_232_ = anIntArrayArray6077[i_231_];
						for (int i_233_ = 0; i_233_ < is_232_.length; i_233_++) {
							int i_234_ = is_232_[i_233_];
							if (aShortArray6031 == null
									|| (i_109_ & aShortArray6031[i_234_]) != 0) {
								anIntArray6053[i_234_] -= anInt6057;
								anIntArray6071[i_234_] -= anInt6026;
								anIntArray6036[i_234_] -= anInt5996;
								anIntArray6053[i_234_] = anIntArray6053[i_234_]
										* i_106_ / 128;
								anIntArray6071[i_234_] = anIntArray6071[i_234_]
										* i_107_ / 128;
								anIntArray6036[i_234_] = anIntArray6036[i_234_]
										* i_108_ / 128;
								anIntArray6053[i_234_] += anInt6057;
								anIntArray6071[i_234_] += anInt6026;
								anIntArray6036[i_234_] += anInt5996;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray6059 != null && aByteArray6025 != null) {
				for (int i_235_ = 0; i_235_ < i_111_; i_235_++) {
					int i_236_ = is[i_235_];
					if (i_236_ < anIntArrayArray6059.length) {
						int[] is_237_ = anIntArrayArray6059[i_236_];
						for (int i_238_ = 0; i_238_ < is_237_.length; i_238_++) {
							int i_239_ = is_237_[i_238_];
							if (aShortArray6040 == null
									|| (i_109_ & aShortArray6040[i_239_]) != 0) {
								int i_240_ = ((aByteArray6025[i_239_] & 0xff) + i_106_ * 8);
								if (i_240_ < 0)
									i_240_ = 0;
								else if (i_240_ > 255)
									i_240_ = 255;
								aByteArray6025[i_239_] = (byte) i_240_;
							}
						}
					}
				}
				if (aClass325Array6028 != null) {
					for (int i_241_ = 0; i_241_ < anInt6076; i_241_++) {
						Class325 class325 = aClass325Array6028[i_241_];
						Class216 class216 = aClass216Array6013[i_241_];
						((Class216) class216).anInt2998 = (((Class216) class216).anInt2998 & 0xffffff | 255 - ((aByteArray6025[((Class325) class325).anInt4333]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray6059 != null) {
				for (int i_242_ = 0; i_242_ < i_111_; i_242_++) {
					int i_243_ = is[i_242_];
					if (i_243_ < anIntArrayArray6059.length) {
						int[] is_244_ = anIntArrayArray6059[i_243_];
						for (int i_245_ = 0; i_245_ < is_244_.length; i_245_++) {
							int i_246_ = is_244_[i_245_];
							if (aShortArray6040 == null
									|| (i_109_ & aShortArray6040[i_246_]) != 0) {
								int i_247_ = aShortArray6033[i_246_] & 0xffff;
								int i_248_ = i_247_ >> 10 & 0x3f;
								int i_249_ = i_247_ >> 7 & 0x7;
								int i_250_ = i_247_ & 0x7f;
								i_248_ = i_248_ + i_106_ & 0x3f;
								i_249_ += i_107_;
								if (i_249_ < 0)
									i_249_ = 0;
								else if (i_249_ > 7)
									i_249_ = 7;
								i_250_ += i_108_;
								if (i_250_ < 0)
									i_250_ = 0;
								else if (i_250_ > 127)
									i_250_ = 127;
								aShortArray6033[i_246_] = (short) (i_248_ << 10
										| i_249_ << 7 | i_250_);
							}
						}
						aBool6005 = true;
					}
				}
				if (aClass325Array6028 != null) {
					for (int i_251_ = 0; i_251_ < anInt6076; i_251_++) {
						Class325 class325 = aClass325Array6028[i_251_];
						Class216 class216 = aClass216Array6013[i_251_];
						((Class216) class216).anInt2998 = (((Class216) class216).anInt2998
								& ~0xffffff | (Class219_Sub1.anIntArray7248[(Class147
								.method942(
										0,
										((aShortArray6033[(((Class325) class325).anInt4333)]) & 0xffff)) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray6032 != null) {
				for (int i_252_ = 0; i_252_ < i_111_; i_252_++) {
					int i_253_ = is[i_252_];
					if (i_253_ < anIntArrayArray6032.length) {
						int[] is_254_ = anIntArrayArray6032[i_253_];
						for (int i_255_ = 0; i_255_ < is_254_.length; i_255_++) {
							Class216 class216 = aClass216Array6013[is_254_[i_255_]];
							((Class216) class216).anInt2992 += i_106_;
							((Class216) class216).anInt2994 += i_107_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray6032 != null) {
				for (int i_256_ = 0; i_256_ < i_111_; i_256_++) {
					int i_257_ = is[i_256_];
					if (i_257_ < anIntArrayArray6032.length) {
						int[] is_258_ = anIntArrayArray6032[i_257_];
						for (int i_259_ = 0; i_259_ < is_258_.length; i_259_++) {
							Class216 class216 = aClass216Array6013[is_258_[i_259_]];
							((Class216) class216).anInt2988 = (((Class216) class216).anInt2988
									* i_106_ >> 7);
							((Class216) class216).anInt2999 = (((Class216) class216).anInt2999
									* i_107_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray6032 != null) {
				for (int i_260_ = 0; i_260_ < i_111_; i_260_++) {
					int i_261_ = is[i_260_];
					if (i_261_ < anIntArrayArray6032.length) {
						int[] is_262_ = anIntArrayArray6032[i_261_];
						for (int i_263_ = 0; i_263_ < is_262_.length; i_263_++) {
							Class216 class216 = aClass216Array6013[is_262_[i_263_]];
							((Class216) class216).anInt2990 = (((Class216) class216).anInt2990
									+ i_106_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	final int RA() {
		if (!aBool6041)
			method2593();
		return aShort5993;
	}

	final void ia(short i, short i_264_) {
		for (int i_265_ = 0; i_265_ < anInt6034; i_265_++) {
			if (aShortArray6033[i_265_] == i)
				aShortArray6033[i_265_] = i_264_;
		}
		if (aClass325Array6028 != null) {
			for (int i_266_ = 0; i_266_ < anInt6076; i_266_++) {
				Class325 class325 = aClass325Array6028[i_266_];
				Class216 class216 = aClass216Array6013[i_266_];
				((Class216) class216).anInt2998 = (((Class216) class216).anInt2998
						& ~0xffffff | ((Class219_Sub1.anIntArray7248[Class147
						.method942(
								0,
								(aShortArray6033[(((Class325) class325).anInt4333)])) & 0xffff]) & 0xffffff));
			}
		}
		if (anInt6058 == 2)
			anInt6058 = 1;
	}

	private final int method2583(int i, int i_267_) {
		i_267_ = i_267_ * (i & 0x7f) >> 7;
		if (i_267_ < 2)
			i_267_ = 2;
		else if (i_267_ > 126)
			i_267_ = 126;
		return (i & 0xff80) + i_267_;
	}

	final void k(int i) {
		if ((anInt6035 & 0xd) != 13)
			throw new IllegalStateException();
		if (aClass145Array5997 != null) {
			if (i == 4096)
				method2589();
			else if (i == 8192)
				method2584();
			else if (i == 12288)
				method2601();
			else {
				int i_268_ = Class335.anIntArray4436[i];
				int i_269_ = Class335.anIntArray4430[i];
				synchronized (this) {
					for (int i_270_ = 0; i_270_ < anInt6042; i_270_++) {
						int i_271_ = ((anIntArray6036[i_270_] * i_268_ + anIntArray6053[i_270_]
								* i_269_) >> 14);
						anIntArray6036[i_270_] = (anIntArray6036[i_270_]
								* i_269_ - anIntArray6053[i_270_] * i_268_) >> 14;
						anIntArray6053[i_270_] = i_271_;
						if (aClass145Array5997[i_270_] != null) {
							i_271_ = ((((Class145) aClass145Array5997[i_270_]).anInt1945)
									* i_268_ + (((Class145) aClass145Array5997[i_270_]).anInt1947)
									* i_269_) >> 14;
							((Class145) aClass145Array5997[i_270_]).anInt1945 = ((((Class145) aClass145Array5997[i_270_]).anInt1945)
									* i_269_ - (((Class145) aClass145Array5997[i_270_]).anInt1947)
									* i_268_) >> 14;
							((Class145) aClass145Array5997[i_270_]).anInt1947 = i_271_;
						}
					}
					if (aClass162Array6006 != null) {
						for (int i_272_ = 0; i_272_ < anInt6034; i_272_++) {
							if (aClass162Array6006[i_272_] != null) {
								int i_273_ = ((((Class162) aClass162Array6006[i_272_]).anInt2100)
										* i_268_ + (((Class162) (aClass162Array6006[i_272_])).anInt2101 * i_269_)) >> 14;
								((Class162) aClass162Array6006[i_272_]).anInt2100 = ((((Class162) aClass162Array6006[i_272_]).anInt2100)
										* i_269_ - (((Class162) (aClass162Array6006[i_272_])).anInt2101 * i_268_)) >> 14;
								((Class162) aClass162Array6006[i_272_]).anInt2101 = i_273_;
							}
						}
					}
					for (int i_274_ = anInt6042; i_274_ < anInt6010; i_274_++) {
						int i_275_ = ((anIntArray6036[i_274_] * i_268_ + anIntArray6053[i_274_]
								* i_269_) >> 14);
						anIntArray6036[i_274_] = (anIntArray6036[i_274_]
								* i_269_ - anIntArray6053[i_274_] * i_268_) >> 14;
						anIntArray6053[i_274_] = i_275_;
					}
					anInt6058 = 0;
					aBool6041 = false;
				}
			}
		} else
			a(i);
	}

	final Class206 method1313(byte i, int i_276_, boolean bool) {
		method2585(Thread.currentThread());
		Class206_Sub1 class206_sub1_277_;
		Class206_Sub1 class206_sub1_278_;
		if (i == 1) {
			class206_sub1_277_ = aClass206_Sub1_6047;
			class206_sub1_278_ = aClass206_Sub1_5992;
		} else if (i == 2) {
			class206_sub1_277_ = aClass206_Sub1_6018;
			class206_sub1_278_ = aClass206_Sub1_6067;
		} else if (i == 3) {
			class206_sub1_277_ = aClass206_Sub1_6062;
			class206_sub1_278_ = aClass206_Sub1_6019;
		} else if (i == 4) {
			class206_sub1_277_ = aClass206_Sub1_6050;
			class206_sub1_278_ = aClass206_Sub1_6001;
		} else if (i == 5) {
			class206_sub1_277_ = aClass206_Sub1_6063;
			class206_sub1_278_ = aClass206_Sub1_5991;
		} else
			class206_sub1_278_ = class206_sub1_277_ = new Class206_Sub1(
					aClass163_Sub1_6072);
		return method2578(class206_sub1_278_, class206_sub1_277_, i_276_,
				i != 0, bool);
	}

	private final void method2584() {
		synchronized (this) {
			for (int i = 0; i < anInt6042; i++) {
				anIntArray6053[i] = -anIntArray6053[i];
				anIntArray6036[i] = -anIntArray6036[i];
				if (aClass145Array5997[i] != null) {
					((Class145) aClass145Array5997[i]).anInt1947 = -((Class145) aClass145Array5997[i]).anInt1947;
					((Class145) aClass145Array5997[i]).anInt1945 = -((Class145) aClass145Array5997[i]).anInt1945;
				}
			}
			if (aClass162Array6006 != null) {
				for (int i = 0; i < anInt6034; i++) {
					if (aClass162Array6006[i] != null) {
						((Class162) aClass162Array6006[i]).anInt2101 = -((Class162) aClass162Array6006[i]).anInt2101;
						((Class162) aClass162Array6006[i]).anInt2100 = -((Class162) aClass162Array6006[i]).anInt2100;
					}
				}
			}
			for (int i = anInt6042; i < anInt6010; i++) {
				anIntArray6053[i] = -anIntArray6053[i];
				anIntArray6036[i] = -anIntArray6036[i];
			}
			anInt6058 = 0;
			aBool6041 = false;
		}
	}

	final void O(int i, int i_279_, int i_280_) {
		if (i != 128 && (anInt6035 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_279_ != 128 && (anInt6035 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_280_ != 128 && (anInt6035 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_281_ = 0; i_281_ < anInt6010; i_281_++) {
				anIntArray6053[i_281_] = anIntArray6053[i_281_] * i >> 7;
				anIntArray6071[i_281_] = anIntArray6071[i_281_] * i_279_ >> 7;
				anIntArray6036[i_281_] = anIntArray6036[i_281_] * i_280_ >> 7;
			}
			aBool6041 = false;
		}
	}

	final void method1323(int i, int i_282_, int i_283_, int i_284_) {
		if ((anInt6035 & 0x80000) != 524288)
			throw new IllegalStateException("FMT");
		for (int i_285_ = 0; i_285_ < anInt6034; i_285_++) {
			int i_286_ = aShortArray6033[i_285_] & 0xffff;
			int i_287_ = i_286_ >> 10 & 0x3f;
			int i_288_ = i_286_ >> 7 & 0x7;
			int i_289_ = i_286_ & 0x7f;
			if (i != -1)
				i_287_ += (i - i_287_) * i_284_ >> 7;
			if (i_282_ != -1)
				i_288_ += (i_282_ - i_288_) * i_284_ >> 7;
			if (i_283_ != -1)
				i_289_ += (i_283_ - i_289_) * i_284_ >> 7;
			aShortArray6033[i_285_] = (short) (i_287_ << 10 | i_288_ << 7 | i_289_);
		}
		if (aClass325Array6028 != null) {
			for (int i_290_ = 0; i_290_ < anInt6076; i_290_++) {
				Class325 class325 = aClass325Array6028[i_290_];
				Class216 class216 = aClass216Array6013[i_290_];
				((Class216) class216).anInt2998 = (((Class216) class216).anInt2998
						& ~0xffffff | ((Class219_Sub1.anIntArray7248[Class147
						.method942(
								0,
								(aShortArray6033[(((Class325) class325).anInt4333)]) & 0xffff)]) & 0xffffff));
			}
		}
		if (anInt6058 == 2)
			anInt6058 = 1;
	}

	private final void method2585(Thread thread) {
		Class363 class363 = aClass163_Sub1_6072.method2306(thread);
		if (class363 != aClass363_6074) {
			aClass363_6074 = class363;
			aClass206_Sub1_5992 = ((Class363) aClass363_6074).aClass206_Sub1_4746;
			aClass206_Sub1_6067 = ((Class363) aClass363_6074).aClass206_Sub1_4771;
			aClass206_Sub1_6019 = ((Class363) aClass363_6074).aClass206_Sub1_4739;
			aClass206_Sub1_6001 = ((Class363) aClass363_6074).aClass206_Sub1_4750;
			aClass206_Sub1_5991 = ((Class363) aClass363_6074).aClass206_Sub1_4760;
			aClass206_Sub1_6047 = ((Class363) aClass363_6074).aClass206_Sub1_4742;
			aClass206_Sub1_6018 = ((Class363) aClass363_6074).aClass206_Sub1_4756;
			aClass206_Sub1_6062 = ((Class363) aClass363_6074).aClass206_Sub1_4768;
			aClass206_Sub1_6050 = ((Class363) aClass363_6074).aClass206_Sub1_4737;
			aClass206_Sub1_6063 = ((Class363) aClass363_6074).aClass206_Sub1_4759;
		}
	}

	private final void method2586(boolean bool) {
		if (anInt6058 == 1)
			method2594();
		else if (anInt6058 == 2) {
			if ((anInt6035 & 0x97098) == 0 && aFloatArrayArray6049 == null)
				aShortArray6033 = null;
			if (bool)
				aByteArray6012 = null;
		} else {
			method2579();
			int i = ((Class163_Sub1) aClass163_Sub1_6072).anInt5210;
			int i_291_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5189;
			int i_292_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5180;
			int i_293_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5185 >> 8;
			int i_294_ = (((Class163_Sub1) aClass163_Sub1_6072).anInt5199 * 768 / anInt6039);
			int i_295_ = (((Class163_Sub1) aClass163_Sub1_6072).anInt5208 * 768 / anInt6039);
			if (anIntArray6065 == null) {
				anIntArray6065 = new int[anInt6034];
				anIntArray6066 = new int[anInt6034];
				anIntArray6069 = new int[anInt6034];
			}
			for (int i_296_ = 0; i_296_ < anInt6034; i_296_++) {
				byte i_297_;
				if (aByteArray6012 == null)
					i_297_ = (byte) 0;
				else
					i_297_ = aByteArray6012[i_296_];
				byte i_298_;
				if (aByteArray6025 == null)
					i_298_ = (byte) 0;
				else
					i_298_ = aByteArray6025[i_296_];
				short i_299_;
				if (aShortArray6055 == null)
					i_299_ = (short) -1;
				else
					i_299_ = aShortArray6055[i_296_];
				if (i_298_ == -2)
					i_297_ = (byte) 3;
				if (i_298_ == -1)
					i_297_ = (byte) 2;
				if (i_299_ == -1) {
					if (i_297_ == 0) {
						int i_300_ = aShortArray6033[i_296_] & 0xffff;
						int i_301_ = (i_300_ & 0x7f) * anInt6046 >> 7;
						short i_302_ = Class147.method942(0, i_300_ & ~0x7f
								| i_301_);
						Class145 class145;
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6051[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6051[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6051[i_296_]];
						int i_303_ = (((i * ((Class145) class145).anInt1947
								+ i_291_ * ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16);
						int i_304_ = i_303_ > 256 ? i_294_ : i_295_;
						int i_305_ = (i_293_ >> 1) + (i_304_ * i_303_ >> 17);
						anIntArray6065[i_296_] = (i_305_ << 17 | Class2_Sub9
								.method2949(i_305_, i_302_, (byte) -103));
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6000[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6000[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6000[i_296_]];
						i_303_ = ((i * ((Class145) class145).anInt1947 + i_291_
								* ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16;
						i_304_ = i_303_ > 256 ? i_294_ : i_295_;
						i_305_ = (i_293_ >> 1) + (i_304_ * i_303_ >> 17);
						anIntArray6066[i_296_] = (i_305_ << 17 | Class2_Sub9
								.method2949(i_305_, i_302_, (byte) -78));
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6002[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6002[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6002[i_296_]];
						i_303_ = ((i * ((Class145) class145).anInt1947 + i_291_
								* ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16;
						i_304_ = i_303_ > 256 ? i_294_ : i_295_;
						i_305_ = (i_293_ >> 1) + (i_304_ * i_303_ >> 17);
						anIntArray6069[i_296_] = (i_305_ << 17 | Class2_Sub9
								.method2949(i_305_, i_302_, (byte) -72));
					} else if (i_297_ == 1) {
						int i_306_ = aShortArray6033[i_296_] & 0xffff;
						int i_307_ = (i_306_ & 0x7f) * anInt6046 >> 7;
						short i_308_ = Class147.method942(0, i_306_ & ~0x7f
								| i_307_);
						Class162 class162 = aClass162Array6006[i_296_];
						int i_309_ = ((i * ((Class162) class162).anInt2101
								+ i_291_ * ((Class162) class162).anInt2102 + i_292_
								* ((Class162) class162).anInt2100) >> 16);
						int i_310_ = i_309_ > 256 ? i_294_ : i_295_;
						int i_311_ = (i_293_ >> 1) + (i_310_ * i_309_ >> 17);
						anIntArray6065[i_296_] = (i_311_ << 17 | Class2_Sub9
								.method2949(i_311_, i_308_, (byte) -80));
						anIntArray6069[i_296_] = -1;
					} else if (i_297_ == 3) {
						anIntArray6065[i_296_] = 128;
						anIntArray6069[i_296_] = -1;
					} else
						anIntArray6069[i_296_] = -2;
				} else {
					int i_312_ = aShortArray6033[i_296_] & 0xffff;
					if (i_297_ == 0) {
						Class145 class145;
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6051[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6051[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6051[i_296_]];
						int i_313_ = (((i * ((Class145) class145).anInt1947
								+ i_291_ * ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16);
						int i_314_ = i_313_ > 256 ? i_294_ : i_295_;
						int i_315_ = method2603((i_293_ >> 2)
								+ (i_314_ * i_313_ >> 18));
						anIntArray6065[i_296_] = i_315_ << 24
								| method2591(i_312_, i_299_, i_315_);
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6000[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6000[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6000[i_296_]];
						i_313_ = ((i * ((Class145) class145).anInt1947 + i_291_
								* ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16;
						i_314_ = i_313_ > 256 ? i_294_ : i_295_;
						i_315_ = method2603((i_293_ >> 2)
								+ (i_314_ * i_313_ >> 18));
						anIntArray6066[i_296_] = i_315_ << 24
								| method2591(i_312_, i_299_, i_315_);
						if (aClass145Array5995 != null
								&& (aClass145Array5995[aShortArray6002[i_296_]] != null))
							class145 = aClass145Array5995[aShortArray6002[i_296_]];
						else
							class145 = aClass145Array5997[aShortArray6002[i_296_]];
						i_313_ = ((i * ((Class145) class145).anInt1947 + i_291_
								* ((Class145) class145).anInt1946 + i_292_
								* ((Class145) class145).anInt1945) / ((Class145) class145).anInt1948) >> 16;
						i_314_ = i_313_ > 256 ? i_294_ : i_295_;
						i_315_ = method2603((i_293_ >> 2)
								+ (i_314_ * i_313_ >> 18));
						anIntArray6069[i_296_] = i_315_ << 24
								| method2591(i_312_, i_299_, i_315_);
					} else if (i_297_ == 1) {
						Class162 class162 = aClass162Array6006[i_296_];
						int i_316_ = ((i * ((Class162) class162).anInt2101
								+ i_291_ * ((Class162) class162).anInt2102 + i_292_
								* ((Class162) class162).anInt2100) >> 16);
						int i_317_ = i_316_ > 256 ? i_294_ : i_295_;
						int i_318_ = method2603((i_293_ >> 2)
								+ (i_317_ * i_316_ >> 18));
						anIntArray6065[i_296_] = i_318_ << 24
								| method2591(i_312_, i_299_, i_318_);
						anIntArray6069[i_296_] = -1;
					} else
						anIntArray6069[i_296_] = -2;
				}
			}
			aClass145Array5997 = null;
			aClass145Array5995 = null;
			aClass162Array6006 = null;
			if ((anInt6035 & 0x97098) == 0 && aFloatArrayArray6049 == null)
				aShortArray6033 = null;
			if (bool)
				aByteArray6012 = null;
			anInt6058 = 2;
		}
	}

	final void method1317() {
		if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
			synchronized (this) {
				((Class206) this).aBool2765 = false;
				this.notifyAll();
			}
		}
	}

	private final void method2587(int i) {
		short i_319_ = aShortArray6051[i];
		short i_320_ = aShortArray6000[i];
		short i_321_ = aShortArray6002[i];
		if (aShortArray6055 == null || aShortArray6055[i] == -1) {
			if (aByteArray6025 == null)
				((Class296) aClass296_6008).anInt3997 = 0;
			else
				((Class296) aClass296_6008).anInt3997 = aByteArray6025[i] & 0xff;
			if (anIntArray6069[i] == -1)
				aClass296_6008
						.method1834(
								(float) anIntArray6003[i_319_],
								(float) anIntArray6003[i_320_],
								(float) anIntArray6003[i_321_],
								(float) anIntArray6014[i_319_],
								(float) anIntArray6014[i_320_],
								(float) anIntArray6014[i_321_],
								(float) anIntArray6024[i_319_],
								(float) anIntArray6024[i_320_],
								(float) anIntArray6024[i_321_],
								(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]));
			else
				aClass296_6008.method1841((float) anIntArray6003[i_319_],
						(float) anIntArray6003[i_320_],
						(float) anIntArray6003[i_321_],
						(float) anIntArray6014[i_319_],
						(float) anIntArray6014[i_320_],
						(float) anIntArray6014[i_321_],
						(float) anIntArray6024[i_319_],
						(float) anIntArray6024[i_320_],
						(float) anIntArray6024[i_321_],
						(float) (anIntArray6065[i] & 0xffff),
						(float) (anIntArray6066[i] & 0xffff),
						(float) (anIntArray6069[i] & 0xffff));
		} else {
			int i_322_ = -16777216;
			if (aByteArray6025 != null)
				i_322_ = 255 - (aByteArray6025[i] & 0xff) << 24;
			if (anIntArray6069[i] == -1) {
				int i_323_ = i_322_ | anIntArray6065[i] & 0xffffff;
				aClass296_6008.method1845((float) anIntArray6003[i_319_],
						(float) anIntArray6003[i_320_],
						(float) anIntArray6003[i_321_],
						(float) anIntArray6014[i_319_],
						(float) anIntArray6014[i_320_],
						(float) anIntArray6014[i_321_],
						(float) anIntArray6024[i_319_],
						(float) anIntArray6024[i_320_],
						(float) anIntArray6024[i_321_],
						aFloatArrayArray6049[i][0], aFloatArrayArray6049[i][1],
						aFloatArrayArray6049[i][2], aFloatArrayArray6045[i][0],
						aFloatArrayArray6045[i][1], aFloatArrayArray6045[i][2],
						i_323_, i_323_, i_323_,
						(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
						aShortArray6055[i]);
			} else
				aClass296_6008.method1845((float) anIntArray6003[i_319_],
						(float) anIntArray6003[i_320_],
						(float) anIntArray6003[i_321_],
						(float) anIntArray6014[i_319_],
						(float) anIntArray6014[i_320_],
						(float) anIntArray6014[i_321_],
						(float) anIntArray6024[i_319_],
						(float) anIntArray6024[i_320_],
						(float) anIntArray6024[i_321_],
						aFloatArrayArray6049[i][0], aFloatArrayArray6049[i][1],
						aFloatArrayArray6049[i][2], aFloatArrayArray6045[i][0],
						aFloatArrayArray6045[i][1], aFloatArrayArray6045[i][2],
						i_322_ | anIntArray6065[i] & 0xffffff, i_322_
								| anIntArray6066[i] & 0xffffff, i_322_
								| anIntArray6069[i] & 0xffffff,
						((Class363) aClass363_6056).anInt4726, 0, 0, 0,
						aShortArray6055[i]);
		}
	}

	private final void method2588() {
		synchronized (this) {
			for (int i = 0; i < anInt6010; i++) {
				int i_324_ = anIntArray6053[i];
				anIntArray6053[i] = anIntArray6036[i];
				anIntArray6036[i] = -i_324_;
			}
			method2597();
		}
	}

	final void method1311(Class206 class206, int i, int i_325_, int i_326_,
			boolean bool) {
		Class206_Sub1 class206_sub1_327_ = (Class206_Sub1) class206;
		if ((anInt6035 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((class206_sub1_327_.anInt6035 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method2581(Thread.currentThread());
		method2593();
		method2579();
		class206_sub1_327_.method2593();
		class206_sub1_327_.method2579();
		anInt6007++;
		int i_328_ = 0;
		int[] is = class206_sub1_327_.anIntArray6053;
		int i_329_ = class206_sub1_327_.anInt6042;
		for (int i_330_ = 0; i_330_ < anInt6042; i_330_++) {
			Class145 class145 = aClass145Array5997[i_330_];
			if (((Class145) class145).anInt1948 != 0) {
				int i_331_ = anIntArray6071[i_330_] - i_325_;
				if (i_331_ >= class206_sub1_327_.aShort6009
						&& i_331_ <= class206_sub1_327_.aShort6030) {
					int i_332_ = anIntArray6053[i_330_] - i;
					if (i_332_ >= class206_sub1_327_.aShort6068
							&& i_332_ <= class206_sub1_327_.aShort5993) {
						int i_333_ = anIntArray6036[i_330_] - i_326_;
						if (i_333_ >= class206_sub1_327_.aShort6016
								&& i_333_ <= class206_sub1_327_.aShort6061) {
							for (int i_334_ = 0; i_334_ < i_329_; i_334_++) {
								Class145 class145_335_ = (class206_sub1_327_.aClass145Array5997[i_334_]);
								if (i_332_ == is[i_334_]
										&& i_333_ == (class206_sub1_327_.anIntArray6036[i_334_])
										&& i_331_ == (class206_sub1_327_.anIntArray6071[i_334_])
										&& (((Class145) class145_335_).anInt1948 != 0)) {
									if (aClass145Array5995 == null)
										aClass145Array5995 = new Class145[anInt6042];
									if (class206_sub1_327_.aClass145Array5995 == null)
										class206_sub1_327_.aClass145Array5995 = new Class145[i_329_];
									Class145 class145_336_ = aClass145Array5995[i_330_];
									if (class145_336_ == null)
										class145_336_ = aClass145Array5995[i_330_] = new Class145(
												class145);
									Class145 class145_337_ = (class206_sub1_327_.aClass145Array5995[i_334_]);
									if (class145_337_ == null)
										class145_337_ = class206_sub1_327_.aClass145Array5995[i_334_] = new Class145(
												class145_335_);
									((Class145) class145_336_).anInt1947 += (((Class145) class145_335_).anInt1947);
									((Class145) class145_336_).anInt1946 += (((Class145) class145_335_).anInt1946);
									((Class145) class145_336_).anInt1945 += (((Class145) class145_335_).anInt1945);
									((Class145) class145_336_).anInt1948 += (((Class145) class145_335_).anInt1948);
									((Class145) class145_337_).anInt1947 += ((Class145) class145).anInt1947;
									((Class145) class145_337_).anInt1946 += ((Class145) class145).anInt1946;
									((Class145) class145_337_).anInt1945 += ((Class145) class145).anInt1945;
									((Class145) class145_337_).anInt1948 += ((Class145) class145).anInt1948;
									i_328_++;
									anIntArray6075[i_330_] = anInt6007;
									anIntArray5994[i_334_] = anInt6007;
								}
							}
						}
					}
				}
			}
		}
		if (i_328_ >= 3 && bool) {
			for (int i_338_ = 0; i_338_ < anInt6034; i_338_++) {
				if (anIntArray6075[aShortArray6051[i_338_]] == anInt6007
						&& anIntArray6075[aShortArray6000[i_338_]] == anInt6007
						&& anIntArray6075[aShortArray6002[i_338_]] == anInt6007) {
					if (aByteArray6012 == null)
						aByteArray6012 = new byte[anInt6034];
					aByteArray6012[i_338_] = (byte) 2;
				}
			}
			for (int i_339_ = 0; i_339_ < class206_sub1_327_.anInt6034; i_339_++) {
				if ((anIntArray5994[class206_sub1_327_.aShortArray6051[i_339_]] == anInt6007)
						&& anIntArray5994[(class206_sub1_327_.aShortArray6000[i_339_])] == anInt6007
						&& anIntArray5994[(class206_sub1_327_.aShortArray6002[i_339_])] == anInt6007) {
					if (class206_sub1_327_.aByteArray6012 == null)
						class206_sub1_327_.aByteArray6012 = new byte[class206_sub1_327_.anInt6034];
					class206_sub1_327_.aByteArray6012[i_339_] = (byte) 2;
				}
			}
		}
	}

	private final void method2589() {
		synchronized (this) {
			for (int i = 0; i < anInt6042; i++) {
				int i_340_ = anIntArray6053[i];
				anIntArray6053[i] = anIntArray6036[i];
				anIntArray6036[i] = -i_340_;
				if (aClass145Array5997[i] != null) {
					i_340_ = ((Class145) aClass145Array5997[i]).anInt1947;
					((Class145) aClass145Array5997[i]).anInt1947 = ((Class145) aClass145Array5997[i]).anInt1945;
					((Class145) aClass145Array5997[i]).anInt1945 = -i_340_;
				}
			}
			if (aClass162Array6006 != null) {
				for (int i = 0; i < anInt6034; i++) {
					if (aClass162Array6006[i] != null) {
						int i_341_ = ((Class162) aClass162Array6006[i]).anInt2101;
						((Class162) aClass162Array6006[i]).anInt2101 = ((Class162) aClass162Array6006[i]).anInt2100;
						((Class162) aClass162Array6006[i]).anInt2100 = -i_341_;
					}
				}
			}
			for (int i = anInt6042; i < anInt6010; i++) {
				int i_342_ = anIntArray6053[i];
				anIntArray6053[i] = anIntArray6036[i];
				anIntArray6036[i] = -i_342_;
			}
			anInt6058 = 0;
			aBool6041 = false;
		}
	}

	final void LA(int i) {
		if ((anInt6035 & 0x2000) != 8192)
			throw new IllegalStateException();
		anInt6039 = i;
		anInt6058 = 0;
	}

	private final void method2590(int i) {
		if (!((Class363) aClass363_6056).aBool4728) {
			short i_343_ = aShortArray6051[i];
			short i_344_ = aShortArray6000[i];
			short i_345_ = aShortArray6002[i];
			int i_346_ = (anIntArray6024[i_343_] - ((Class363) aClass363_6056).anInt4724);
			if (i_346_ > 255)
				i_346_ = 255;
			else if (i_346_ < 0)
				i_346_ = 0;
			int i_347_ = (anIntArray6024[i_344_] - ((Class363) aClass363_6056).anInt4724);
			if (i_347_ > 255)
				i_347_ = 255;
			else if (i_347_ < 0)
				i_347_ = 0;
			int i_348_ = (anIntArray6024[i_345_] - ((Class363) aClass363_6056).anInt4724);
			if (i_348_ > 255)
				i_348_ = 255;
			else if (i_348_ < 0)
				i_348_ = 0;
			int i_349_ = i_346_ + i_347_ + i_348_;
			if (i_349_ != 765) {
				if (i_349_ == 0)
					method2587(i);
				else {
					if (aByteArray6025 == null)
						((Class296) aClass296_6008).anInt3997 = 0;
					else
						((Class296) aClass296_6008).anInt3997 = aByteArray6025[i] & 0xff;
					if (aShortArray6055 == null || aShortArray6055[i] == -1) {
						if (anIntArray6069[i] == -1)
							aClass296_6008
									.method1840(
											(float) anIntArray6003[i_343_],
											(float) anIntArray6003[i_344_],
											(float) anIntArray6003[i_345_],
											(float) anIntArray6014[i_343_],
											(float) anIntArray6014[i_344_],
											(float) anIntArray6014[i_345_],
											(float) anIntArray6024[i_343_],
											(float) anIntArray6024[i_344_],
											(float) anIntArray6024[i_345_],
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
															-125,
															(i_346_ << 24 | ((Class363) aClass363_6056).anInt4726))),
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
															-111,
															(i_347_ << 24 | ((Class363) aClass363_6056).anInt4726))),
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
															-108,
															i_348_ << 24
																	| (((Class363) aClass363_6056).anInt4726))));
						else
							aClass296_6008
									.method1840(
											(float) anIntArray6003[i_343_],
											(float) anIntArray6003[i_344_],
											(float) anIntArray6003[i_345_],
											(float) anIntArray6014[i_343_],
											(float) anIntArray6014[i_344_],
											(float) anIntArray6014[i_345_],
											(float) anIntArray6024[i_343_],
											(float) anIntArray6024[i_344_],
											(float) anIntArray6024[i_345_],
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
															-24,
															(i_346_ << 24 | ((Class363) aClass363_6056).anInt4726))),
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6066[i] & 0xffff]),
															127,
															(i_347_ << 24 | ((Class363) aClass363_6056).anInt4726))),
											(Class343
													.method2078(
															(Class219_Sub1.anIntArray7248[anIntArray6069[i] & 0xffff]),
															91,
															i_348_ << 24
																	| (((Class363) aClass363_6056).anInt4726))));
					} else {
						int i_350_ = -16777216;
						if (aByteArray6025 != null)
							i_350_ = 255 - (aByteArray6025[i] & 0xff) << 24;
						if (anIntArray6069[i] == -1) {
							int i_351_ = i_350_ | anIntArray6065[i] & 0xffffff;
							aClass296_6008.method1845(
									(float) anIntArray6003[i_343_],
									(float) anIntArray6003[i_344_],
									(float) anIntArray6003[i_345_],
									(float) anIntArray6014[i_343_],
									(float) anIntArray6014[i_344_],
									(float) anIntArray6014[i_345_],
									(float) anIntArray6024[i_343_],
									(float) anIntArray6024[i_344_],
									(float) anIntArray6024[i_345_],
									aFloatArrayArray6049[i][0],
									aFloatArrayArray6049[i][1],
									aFloatArrayArray6049[i][2],
									aFloatArrayArray6045[i][0],
									aFloatArrayArray6045[i][1],
									aFloatArrayArray6045[i][2], i_351_, i_351_,
									i_351_,
									((Class363) aClass363_6056).anInt4726,
									i_346_, i_347_, i_348_, aShortArray6055[i]);
						} else
							aClass296_6008.method1845(
									(float) anIntArray6003[i_343_],
									(float) anIntArray6003[i_344_],
									(float) anIntArray6003[i_345_],
									(float) anIntArray6014[i_343_],
									(float) anIntArray6014[i_344_],
									(float) anIntArray6014[i_345_],
									(float) anIntArray6024[i_343_],
									(float) anIntArray6024[i_344_],
									(float) anIntArray6024[i_345_],
									aFloatArrayArray6049[i][0],
									aFloatArrayArray6049[i][1],
									aFloatArrayArray6049[i][2],
									aFloatArrayArray6045[i][0],
									aFloatArrayArray6045[i][1],
									aFloatArrayArray6045[i][2], i_350_
											| anIntArray6065[i] & 0xffffff,
									i_350_ | anIntArray6066[i] & 0xffffff,
									i_350_ | anIntArray6069[i] & 0xffffff,
									((Class363) aClass363_6056).anInt4726,
									i_346_, i_347_, i_348_, aShortArray6055[i]);
					}
				}
			}
		} else {
			short i_352_ = aShortArray6051[i];
			short i_353_ = aShortArray6000[i];
			short i_354_ = aShortArray6002[i];
			int i_355_ = 0;
			int i_356_ = 0;
			int i_357_ = 0;
			if (anIntArray6079[i_352_] > ((Class363) aClass363_6056).anInt4735)
				i_355_ = 255;
			else if (anIntArray6079[i_352_] > ((Class363) aClass363_6056).anInt4720)
				i_355_ = ((((Class363) aClass363_6056).anInt4720 - anIntArray6079[i_352_]) * 255 / (((Class363) aClass363_6056).anInt4720 - ((Class363) aClass363_6056).anInt4735));
			if (anIntArray6079[i_353_] > ((Class363) aClass363_6056).anInt4735)
				i_356_ = 255;
			else if (anIntArray6079[i_353_] > ((Class363) aClass363_6056).anInt4720)
				i_356_ = ((((Class363) aClass363_6056).anInt4720 - anIntArray6079[i_353_]) * 255 / (((Class363) aClass363_6056).anInt4720 - ((Class363) aClass363_6056).anInt4735));
			if (anIntArray6079[i_354_] > ((Class363) aClass363_6056).anInt4735)
				i_357_ = 255;
			else if (anIntArray6079[i_354_] > ((Class363) aClass363_6056).anInt4720)
				i_357_ = ((((Class363) aClass363_6056).anInt4720 - anIntArray6079[i_354_]) * 255 / (((Class363) aClass363_6056).anInt4720 - ((Class363) aClass363_6056).anInt4735));
			if (aByteArray6025 == null)
				((Class296) aClass296_6008).anInt3997 = 0;
			else
				((Class296) aClass296_6008).anInt3997 = aByteArray6025[i] & 0xff;
			if (aShortArray6055 == null || aShortArray6055[i] == -1) {
				if (anIntArray6069[i] == -1)
					aClass296_6008
							.method1840(
									(float) anIntArray6003[i_352_],
									(float) anIntArray6003[i_353_],
									(float) anIntArray6003[i_354_],
									(float) anIntArray6014[i_352_],
									(float) anIntArray6014[i_353_],
									(float) anIntArray6014[i_354_],
									(float) anIntArray6024[i_352_],
									(float) anIntArray6024[i_353_],
									(float) anIntArray6024[i_354_],
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
											123,
											(i_355_ << 24 | (((Class363) aClass363_6056).anInt4726))),
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
											117,
											(i_356_ << 24 | (((Class363) aClass363_6056).anInt4726))),
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
											120,
											(i_357_ << 24 | (((Class363) aClass363_6056).anInt4726))));
				else
					aClass296_6008
							.method1840(
									(float) anIntArray6003[i_352_],
									(float) anIntArray6003[i_353_],
									(float) anIntArray6003[i_354_],
									(float) anIntArray6014[i_352_],
									(float) anIntArray6014[i_353_],
									(float) anIntArray6014[i_354_],
									(float) anIntArray6024[i_352_],
									(float) anIntArray6024[i_353_],
									(float) anIntArray6024[i_354_],
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]),
											-46,
											(i_355_ << 24 | (((Class363) aClass363_6056).anInt4726))),
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6066[i] & 0xffff]),
											-57,
											(i_356_ << 24 | (((Class363) aClass363_6056).anInt4726))),
									Class343.method2078(
											(Class219_Sub1.anIntArray7248[anIntArray6069[i] & 0xffff]),
											91,
											(i_357_ << 24 | (((Class363) aClass363_6056).anInt4726))));
			} else {
				int i_358_ = -16777216;
				if (aByteArray6025 != null)
					i_358_ = 255 - (aByteArray6025[i] & 0xff) << 24;
				if (anIntArray6069[i] == -1) {
					int i_359_ = i_358_ | anIntArray6065[i] & 0xffffff;
					aClass296_6008.method1845((float) anIntArray6003[i_352_],
							(float) anIntArray6003[i_353_],
							(float) anIntArray6003[i_354_],
							(float) anIntArray6014[i_352_],
							(float) anIntArray6014[i_353_],
							(float) anIntArray6014[i_354_],
							(float) anIntArray6024[i_352_],
							(float) anIntArray6024[i_353_],
							(float) anIntArray6024[i_354_],
							aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_359_, i_359_, i_359_,
							(((Class363) aClass363_6056).anInt4726), i_355_,
							i_356_, i_357_, aShortArray6055[i]);
				} else
					aClass296_6008.method1845((float) anIntArray6003[i_352_],
							(float) anIntArray6003[i_353_],
							(float) anIntArray6003[i_354_],
							(float) anIntArray6014[i_352_],
							(float) anIntArray6014[i_353_],
							(float) anIntArray6014[i_354_],
							(float) anIntArray6024[i_352_],
							(float) anIntArray6024[i_353_],
							(float) anIntArray6024[i_354_],
							aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_358_
									| anIntArray6065[i] & 0xffffff, i_358_
									| anIntArray6066[i] & 0xffffff, i_358_
									| anIntArray6069[i] & 0xffffff,
							((Class363) aClass363_6056).anInt4726, i_355_,
							i_356_, i_357_, aShortArray6055[i]);
			}
		}
	}

	final boolean method1328() {
		if (aShortArray6055 == null)
			return true;
		for (int i = 0; i < aShortArray6055.length; i++) {
			if (aShortArray6055[i] != -1
					&& !aClass163_Sub1_6072.method2305(aShortArray6055[i]))
				return false;
		}
		return true;
	}

	private final int method2591(int i, short i_360_, int i_361_) {
		int i_362_ = Class27.anIntArray359[method2583(i, i_361_)];
		Class188 class188 = ((Class163) aClass163_Sub1_6072).anInterface1_2118
				.method7((byte) 127, i_360_ & 0xffff);
		int i_363_ = ((Class188) class188).aByte2414 & 0xff;
		if (i_363_ != 0) {
			int i_364_ = 131586 * i_361_;
			if (i_363_ == 256)
				i_362_ = i_364_;
			else {
				int i_365_ = i_363_;
				int i_366_ = 256 - i_363_;
				i_362_ = ((((i_364_ & 0xff00ff) * i_365_ + (i_362_ & 0xff00ff)
						* i_366_) & ~0xff00ff) + (((i_364_ & 0xff00) * i_365_ + (i_362_ & 0xff00)
						* i_366_) & 0xff0000)) >> 8;
			}
		}
		int i_367_ = ((Class188) class188).aByte2418 & 0xff;
		if (i_367_ != 0) {
			i_367_ += 256;
			int i_368_ = ((i_362_ & 0xff0000) >> 16) * i_367_;
			if (i_368_ > 65535)
				i_368_ = 65535;
			int i_369_ = ((i_362_ & 0xff00) >> 8) * i_367_;
			if (i_369_ > 65535)
				i_369_ = 65535;
			int i_370_ = (i_362_ & 0xff) * i_367_;
			if (i_370_ > 65535)
				i_370_ = 65535;
			i_362_ = (i_368_ << 8 & 0xff0000) + (i_369_ & 0xff00)
					+ (i_370_ >> 8);
		}
		return i_362_;
	}

	private final void method2592() {
		aClass145Array5997 = new Class145[anInt6042];
		for (int i = 0; i < anInt6042; i++)
			aClass145Array5997[i] = new Class145();
		for (int i = 0; i < anInt6034; i++) {
			short i_371_ = aShortArray6051[i];
			short i_372_ = aShortArray6000[i];
			short i_373_ = aShortArray6002[i];
			int i_374_ = anIntArray6053[i_372_] - anIntArray6053[i_371_];
			int i_375_ = anIntArray6071[i_372_] - anIntArray6071[i_371_];
			int i_376_ = anIntArray6036[i_372_] - anIntArray6036[i_371_];
			int i_377_ = anIntArray6053[i_373_] - anIntArray6053[i_371_];
			int i_378_ = anIntArray6071[i_373_] - anIntArray6071[i_371_];
			int i_379_ = anIntArray6036[i_373_] - anIntArray6036[i_371_];
			int i_380_ = i_375_ * i_379_ - i_378_ * i_376_;
			int i_381_ = i_376_ * i_377_ - i_379_ * i_374_;
			int i_382_;
			for (i_382_ = i_374_ * i_378_ - i_377_ * i_375_; (i_380_ > 8192
					|| i_381_ > 8192 || i_382_ > 8192 || i_380_ < -8192
					|| i_381_ < -8192 || i_382_ < -8192); i_382_ >>= 1) {
				i_380_ >>= 1;
				i_381_ >>= 1;
			}
			int i_383_ = (int) Math.sqrt((double) (i_380_ * i_380_ + i_381_
					* i_381_ + i_382_ * i_382_));
			if (i_383_ <= 0)
				i_383_ = 1;
			i_380_ = i_380_ * 256 / i_383_;
			i_381_ = i_381_ * 256 / i_383_;
			i_382_ = i_382_ * 256 / i_383_;
			byte i_384_;
			if (aByteArray6012 == null)
				i_384_ = (byte) 0;
			else
				i_384_ = aByteArray6012[i];
			if (i_384_ == 0) {
				Class145 class145 = aClass145Array5997[i_371_];
				((Class145) class145).anInt1947 += i_380_;
				((Class145) class145).anInt1946 += i_381_;
				((Class145) class145).anInt1945 += i_382_;
				((Class145) class145).anInt1948++;
				class145 = aClass145Array5997[i_372_];
				((Class145) class145).anInt1947 += i_380_;
				((Class145) class145).anInt1946 += i_381_;
				((Class145) class145).anInt1945 += i_382_;
				((Class145) class145).anInt1948++;
				class145 = aClass145Array5997[i_373_];
				((Class145) class145).anInt1947 += i_380_;
				((Class145) class145).anInt1946 += i_381_;
				((Class145) class145).anInt1945 += i_382_;
				((Class145) class145).anInt1948++;
			} else if (i_384_ == 1) {
				if (aClass162Array6006 == null)
					aClass162Array6006 = new Class162[anInt6034];
				Class162 class162 = aClass162Array6006[i] = new Class162();
				((Class162) class162).anInt2101 = i_380_;
				((Class162) class162).anInt2102 = i_381_;
				((Class162) class162).anInt2100 = i_382_;
			}
		}
	}

	private final void method2593() {
		if (!aBool6041) {
			int i = 0;
			int i_385_ = 0;
			int i_386_ = 32767;
			int i_387_ = 32767;
			int i_388_ = 32767;
			int i_389_ = -32768;
			int i_390_ = -32768;
			int i_391_ = -32768;
			for (int i_392_ = 0; i_392_ < anInt6042; i_392_++) {
				int i_393_ = anIntArray6053[i_392_];
				int i_394_ = anIntArray6071[i_392_];
				int i_395_ = anIntArray6036[i_392_];
				if (i_393_ < i_386_)
					i_386_ = i_393_;
				if (i_393_ > i_389_)
					i_389_ = i_393_;
				if (i_394_ < i_387_)
					i_387_ = i_394_;
				if (i_394_ > i_390_)
					i_390_ = i_394_;
				if (i_395_ < i_388_)
					i_388_ = i_395_;
				if (i_395_ > i_391_)
					i_391_ = i_395_;
				int i_396_ = i_393_ * i_393_ + i_395_ * i_395_;
				if (i_396_ > i)
					i = i_396_;
				i_396_ += i_394_ * i_394_;
				if (i_396_ > i_385_)
					i_385_ = i_396_;
			}
			aShort6068 = (short) i_386_;
			aShort5993 = (short) i_389_;
			aShort6009 = (short) i_387_;
			aShort6030 = (short) i_390_;
			aShort6016 = (short) i_388_;
			aShort6061 = (short) i_391_;
			aShort6027 = (short) (int) (Math.sqrt((double) i) + 0.99);
			aShort5999 = (short) (int) (Math.sqrt((double) i_385_) + 0.99);
			aBool6041 = true;
		}
	}

	private final void method2594() {
		if (anInt6058 == 0)
			method2580(false);
		else if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
			synchronized (this) {
				method2577();
			}
		} else
			method2577();
	}

	final int V() {
		if (!aBool6041)
			method2593();
		return aShort6068;
	}

	final void method1318(Class33 class33) {
		Class33_Sub3 class33_sub3 = (Class33_Sub3) class33;
		if (aClass110Array6038 != null) {
			for (int i = 0; i < aClass110Array6038.length; i++) {
				Class110 class110 = aClass110Array6038[i];
				Class110 class110_397_ = class110;
				if (((Class110) class110).aClass110_1498 != null)
					class110_397_ = ((Class110) class110).aClass110_1498;
				((Class110) class110_397_).anInt1492 = (int) (((Class33_Sub3) class33_sub3).aFloat7197 + ((((Class33_Sub3) class33_sub3).aFloat7164 * (float) (anIntArray6053[((Class110) class110).anInt1506]))
						+ (((Class33_Sub3) class33_sub3).aFloat7195 * (float) (anIntArray6071[(((Class110) class110).anInt1506)])) + (((Class33_Sub3) class33_sub3).aFloat7193 * (float) (anIntArray6036[(((Class110) class110).anInt1506)]))));
				((Class110) class110_397_).anInt1499 = (int) (((Class33_Sub3) class33_sub3).aFloat7190 + ((((Class33_Sub3) class33_sub3).aFloat7179 * (float) (anIntArray6053[((Class110) class110).anInt1506]))
						+ (((Class33_Sub3) class33_sub3).aFloat7186 * (float) (anIntArray6071[(((Class110) class110).anInt1506)])) + (((Class33_Sub3) class33_sub3).aFloat7182 * (float) (anIntArray6036[(((Class110) class110).anInt1506)]))));
				((Class110) class110_397_).anInt1505 = (int) (((Class33_Sub3) class33_sub3).aFloat7175 + ((((Class33_Sub3) class33_sub3).aFloat7196 * (float) (anIntArray6053[((Class110) class110).anInt1506]))
						+ (((Class33_Sub3) class33_sub3).aFloat7185 * (float) (anIntArray6071[(((Class110) class110).anInt1506)])) + (((Class33_Sub3) class33_sub3).aFloat7166 * (float) (anIntArray6036[(((Class110) class110).anInt1506)]))));
				((Class110) class110_397_).anInt1504 = (int) (((Class33_Sub3) class33_sub3).aFloat7197 + ((((Class33_Sub3) class33_sub3).aFloat7164 * (float) (anIntArray6053[((Class110) class110).anInt1510]))
						+ (((Class33_Sub3) class33_sub3).aFloat7195 * (float) (anIntArray6071[(((Class110) class110).anInt1510)])) + (((Class33_Sub3) class33_sub3).aFloat7193 * (float) (anIntArray6036[(((Class110) class110).anInt1510)]))));
				((Class110) class110_397_).anInt1494 = (int) (((Class33_Sub3) class33_sub3).aFloat7190 + ((((Class33_Sub3) class33_sub3).aFloat7179 * (float) (anIntArray6053[((Class110) class110).anInt1510]))
						+ (((Class33_Sub3) class33_sub3).aFloat7186 * (float) (anIntArray6071[(((Class110) class110).anInt1510)])) + (((Class33_Sub3) class33_sub3).aFloat7182 * (float) (anIntArray6036[(((Class110) class110).anInt1510)]))));
				((Class110) class110_397_).anInt1493 = (int) (((Class33_Sub3) class33_sub3).aFloat7175 + ((((Class33_Sub3) class33_sub3).aFloat7196 * (float) (anIntArray6053[((Class110) class110).anInt1510]))
						+ (((Class33_Sub3) class33_sub3).aFloat7185 * (float) (anIntArray6071[(((Class110) class110).anInt1510)])) + (((Class33_Sub3) class33_sub3).aFloat7166 * (float) (anIntArray6036[(((Class110) class110).anInt1510)]))));
				((Class110) class110_397_).anInt1502 = (int) (((Class33_Sub3) class33_sub3).aFloat7197 + ((((Class33_Sub3) class33_sub3).aFloat7164 * (float) (anIntArray6053[((Class110) class110).anInt1497]))
						+ (((Class33_Sub3) class33_sub3).aFloat7195 * (float) (anIntArray6071[(((Class110) class110).anInt1497)])) + (((Class33_Sub3) class33_sub3).aFloat7193 * (float) (anIntArray6036[(((Class110) class110).anInt1497)]))));
				((Class110) class110_397_).anInt1509 = (int) (((Class33_Sub3) class33_sub3).aFloat7190 + ((((Class33_Sub3) class33_sub3).aFloat7179 * (float) (anIntArray6053[((Class110) class110).anInt1497]))
						+ (((Class33_Sub3) class33_sub3).aFloat7186 * (float) (anIntArray6071[(((Class110) class110).anInt1497)])) + (((Class33_Sub3) class33_sub3).aFloat7182 * (float) (anIntArray6036[(((Class110) class110).anInt1497)]))));
				((Class110) class110_397_).anInt1491 = (int) (((Class33_Sub3) class33_sub3).aFloat7175 + ((((Class33_Sub3) class33_sub3).aFloat7196 * (float) (anIntArray6053[((Class110) class110).anInt1497]))
						+ (((Class33_Sub3) class33_sub3).aFloat7185 * (float) (anIntArray6071[(((Class110) class110).anInt1497)])) + (((Class33_Sub3) class33_sub3).aFloat7166 * (float) (anIntArray6036[(((Class110) class110).anInt1497)]))));
			}
		}
		if (aClass261Array6004 != null) {
			for (int i = 0; i < aClass261Array6004.length; i++) {
				Class261 class261 = aClass261Array6004[i];
				Class261 class261_398_ = class261;
				if (((Class261) class261).aClass261_3591 != null)
					class261_398_ = ((Class261) class261).aClass261_3591;
				if (((Class261) class261).aClass33_3585 != null)
					((Class261) class261).aClass33_3585.method296(class33_sub3);
				else
					((Class261) class261).aClass33_3585 = class33_sub3
							.method292();
				((Class261) class261_398_).anInt3586 = (int) (((Class33_Sub3) class33_sub3).aFloat7197 + ((((Class33_Sub3) class33_sub3).aFloat7164 * (float) (anIntArray6053[((Class261) class261).anInt3577]))
						+ (((Class33_Sub3) class33_sub3).aFloat7195 * (float) (anIntArray6071[(((Class261) class261).anInt3577)])) + (((Class33_Sub3) class33_sub3).aFloat7193 * (float) (anIntArray6036[(((Class261) class261).anInt3577)]))));
				((Class261) class261_398_).anInt3590 = (int) (((Class33_Sub3) class33_sub3).aFloat7190 + ((((Class33_Sub3) class33_sub3).aFloat7179 * (float) (anIntArray6053[((Class261) class261).anInt3577]))
						+ (((Class33_Sub3) class33_sub3).aFloat7186 * (float) (anIntArray6071[(((Class261) class261).anInt3577)])) + (((Class33_Sub3) class33_sub3).aFloat7182 * (float) (anIntArray6036[(((Class261) class261).anInt3577)]))));
				((Class261) class261_398_).anInt3582 = (int) (((Class33_Sub3) class33_sub3).aFloat7175 + ((((Class33_Sub3) class33_sub3).aFloat7196 * (float) (anIntArray6053[((Class261) class261).anInt3577]))
						+ (((Class33_Sub3) class33_sub3).aFloat7185 * (float) (anIntArray6071[(((Class261) class261).anInt3577)])) + (((Class33_Sub3) class33_sub3).aFloat7166 * (float) (anIntArray6036[(((Class261) class261).anInt3577)]))));
			}
		}
	}

	private final void method2595() {
		synchronized (this) {
			for (int i = 0; i < anInt6010; i++) {
				int i_399_ = anIntArray6036[i];
				anIntArray6036[i] = anIntArray6053[i];
				anIntArray6053[i] = -i_399_;
			}
			method2597();
		}
	}

	final Class11_Sub45_Sub1 ba(Class11_Sub45_Sub1 class11_sub45_sub1) {
		return null;
	}

	final boolean r() {
		return aBool6020;
	}

	final int WA() {
		return anInt6046;
	}

	final void a(int i) {
		if ((anInt6035 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method2588();
		else if (i == 8192)
			method2582();
		else if (i == 12288)
			method2595();
		else {
			int i_400_ = Class335.anIntArray4436[i];
			int i_401_ = Class335.anIntArray4430[i];
			synchronized (this) {
				for (int i_402_ = 0; i_402_ < anInt6010; i_402_++) {
					int i_403_ = ((anIntArray6036[i_402_] * i_400_ + anIntArray6053[i_402_]
							* i_401_) >> 14);
					anIntArray6036[i_402_] = (anIntArray6036[i_402_] * i_401_ - anIntArray6053[i_402_]
							* i_400_) >> 14;
					anIntArray6053[i_402_] = i_403_;
				}
				method2597();
			}
		}
	}

	final boolean method1305(int i, int i_404_, Class33 class33, boolean bool,
			int i_405_, int i_406_) {
		return method2574(i, i_404_, class33, bool, i_405_, i_406_);
	}

	private final boolean method2596(int i, int i_407_, int i_408_, int i_409_,
			int i_410_, int i_411_, int i_412_, int i_413_) {
		if (i_407_ < i_408_ && i_407_ < i_409_ && i_407_ < i_410_)
			return false;
		if (i_407_ > i_408_ && i_407_ > i_409_ && i_407_ > i_410_)
			return false;
		if (i < i_411_ && i < i_412_ && i < i_413_)
			return false;
		if (i > i_411_ && i > i_412_ && i > i_413_)
			return false;
		return true;
	}

	final void VA(int i) {
		if ((anInt6035 & 0x3) != 3)
			throw new IllegalStateException();
		int i_414_ = Class335.anIntArray4436[i];
		int i_415_ = Class335.anIntArray4430[i];
		synchronized (this) {
			for (int i_416_ = 0; i_416_ < anInt6010; i_416_++) {
				int i_417_ = ((anIntArray6071[i_416_] * i_414_ + anIntArray6053[i_416_]
						* i_415_) >> 14);
				anIntArray6071[i_416_] = (anIntArray6071[i_416_] * i_415_ - anIntArray6053[i_416_]
						* i_414_) >> 14;
				anIntArray6053[i_416_] = i_417_;
			}
			method2597();
		}
	}

	private final void method2597() {
		aClass145Array5997 = null;
		aClass145Array5995 = null;
		aClass162Array6006 = null;
		aBool6041 = false;
	}

	private final boolean method2598(int i) {
		if (anIntArray6037 == null)
			return false;
		if (anIntArray6037[i] == -1)
			return false;
		return true;
	}

	final void method1302(Class33 class33, int i, boolean bool) {
		if (aShortArray6031 != null) {
			int[] is = new int[3];
			for (int i_418_ = 0; i_418_ < anInt6042; i_418_++) {
				if ((i & aShortArray6031[i_418_]) != 0) {
					if (bool)
						class33.method287(anIntArray6053[i_418_],
								anIntArray6071[i_418_], anIntArray6036[i_418_],
								is);
					else
						class33.method295(anIntArray6053[i_418_],
								anIntArray6071[i_418_], anIntArray6036[i_418_],
								is);
					anIntArray6053[i_418_] = is[0];
					anIntArray6071[i_418_] = is[1];
					anIntArray6036[i_418_] = is[2];
				}
			}
		}
	}

	private final void method2599(int i, boolean bool, boolean bool_419_) {
		if (anIntArray6069[i] != -2) {
			short i_420_ = aShortArray6051[i];
			short i_421_ = aShortArray6000[i];
			short i_422_ = aShortArray6002[i];
			int i_423_ = anIntArray6014[i_420_];
			int i_424_ = anIntArray6014[i_421_];
			int i_425_ = anIntArray6014[i_422_];
			if (bool && (i_423_ == -5000 || i_424_ == -5000 || i_425_ == -5000)) {
				int i_426_ = anIntArray6043[i_420_];
				int i_427_ = anIntArray6043[i_421_];
				int i_428_ = anIntArray6043[i_422_];
				int i_429_ = anIntArray6023[i_420_];
				int i_430_ = anIntArray6023[i_421_];
				int i_431_ = anIntArray6023[i_422_];
				int i_432_ = anIntArray5990[i_420_];
				int i_433_ = anIntArray5990[i_421_];
				int i_434_ = anIntArray5990[i_422_];
				i_426_ -= i_427_;
				i_428_ -= i_427_;
				i_429_ -= i_430_;
				i_431_ -= i_430_;
				i_432_ -= i_433_;
				i_434_ -= i_433_;
				int i_435_ = i_429_ * i_434_ - i_432_ * i_431_;
				int i_436_ = i_432_ * i_428_ - i_426_ * i_434_;
				int i_437_ = i_426_ * i_431_ - i_429_ * i_428_;
				if (i_427_ * i_435_ + i_430_ * i_436_ + i_433_ * i_437_ > 0)
					method2600(i);
			} else if (anIntArray6037[i] != -1
					|| ((i_423_ - i_424_)
							* (anIntArray6003[i_422_] - anIntArray6003[i_421_]) - ((anIntArray6003[i_420_] - anIntArray6003[i_421_]) * (i_425_ - i_424_))) > 0) {
				if (i_423_ < 0 || i_424_ < 0 || i_425_ < 0
						|| i_423_ > ((Class363) aClass363_6056).anInt4748
						|| i_424_ > ((Class363) aClass363_6056).anInt4748
						|| i_425_ > ((Class363) aClass363_6056).anInt4748)
					((Class296) aClass296_6008).aBool4001 = true;
				else
					((Class296) aClass296_6008).aBool4001 = false;
				if (bool_419_) {
					int i_438_ = anIntArray6037[i];
					if (i_438_ == -1
							|| !((Class325) aClass325Array6028[i_438_]).aBool4334)
						method2590(i);
				} else {
					int i_439_ = anIntArray6037[i];
					if (i_439_ != -1) {
						Class325 class325 = aClass325Array6028[i_439_];
						Class216 class216 = aClass216Array6013[i_439_];
						if (!((Class325) class325).aBool4334)
							method2587(i);
						aClass163_Sub1_6072.method2295(
								((Class216) class216).anInt2986,
								((Class216) class216).anInt2997,
								((Class216) class216).anInt2989,
								((Class216) class216).anInt2993,
								((Class216) class216).anInt2984,
								((Class216) class216).anInt2990,
								((Class325) class325).aShort4330 & 0xffff,
								((Class216) class216).anInt2998,
								((Class325) class325).aByte4328,
								((Class325) class325).aByte4326);
					} else
						method2587(i);
				}
			}
		}
	}

	final boolean NA() {
		if (anIntArrayArray6077 == null)
			return false;
		anInt6057 = 0;
		anInt6026 = 0;
		anInt5996 = 0;
		return true;
	}

	final void method1329(Class33 class33, Class376_Sub4 class376_sub4, int i,
			int i_440_) {
		method2602(class33, class376_sub4, i, i_440_);
	}

	final void method1320(int i, int[] is, int i_441_, int i_442_, int i_443_,
			int i_444_, boolean bool) {
		int i_445_ = is.length;
		if (i == 0) {
			i_441_ <<= 4;
			i_442_ <<= 4;
			i_443_ <<= 4;
			if (!aBool6015) {
				for (int i_446_ = 0; i_446_ < anInt6010; i_446_++) {
					anIntArray6053[i_446_] <<= 4;
					anIntArray6071[i_446_] <<= 4;
					anIntArray6036[i_446_] <<= 4;
				}
				aBool6015 = true;
			}
			int i_447_ = 0;
			anInt6057 = 0;
			anInt6026 = 0;
			anInt5996 = 0;
			for (int i_448_ = 0; i_448_ < i_445_; i_448_++) {
				int i_449_ = is[i_448_];
				if (i_449_ < anIntArrayArray6077.length) {
					int[] is_450_ = anIntArrayArray6077[i_449_];
					for (int i_451_ = 0; i_451_ < is_450_.length; i_451_++) {
						int i_452_ = is_450_[i_451_];
						anInt6057 += anIntArray6053[i_452_];
						anInt6026 += anIntArray6071[i_452_];
						anInt5996 += anIntArray6036[i_452_];
						i_447_++;
					}
				}
			}
			if (i_447_ > 0) {
				anInt6057 = anInt6057 / i_447_ + i_441_;
				anInt6026 = anInt6026 / i_447_ + i_442_;
				anInt5996 = anInt5996 / i_447_ + i_443_;
			} else {
				anInt6057 = i_441_;
				anInt6026 = i_442_;
				anInt5996 = i_443_;
			}
		} else if (i == 1) {
			i_441_ <<= 4;
			i_442_ <<= 4;
			i_443_ <<= 4;
			if (!aBool6015) {
				for (int i_453_ = 0; i_453_ < anInt6010; i_453_++) {
					anIntArray6053[i_453_] <<= 4;
					anIntArray6071[i_453_] <<= 4;
					anIntArray6036[i_453_] <<= 4;
				}
				aBool6015 = true;
			}
			for (int i_454_ = 0; i_454_ < i_445_; i_454_++) {
				int i_455_ = is[i_454_];
				if (i_455_ < anIntArrayArray6077.length) {
					int[] is_456_ = anIntArrayArray6077[i_455_];
					for (int i_457_ = 0; i_457_ < is_456_.length; i_457_++) {
						int i_458_ = is_456_[i_457_];
						anIntArray6053[i_458_] += i_441_;
						anIntArray6071[i_458_] += i_442_;
						anIntArray6036[i_458_] += i_443_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_459_ = 0; i_459_ < i_445_; i_459_++) {
				int i_460_ = is[i_459_];
				if (i_460_ < anIntArrayArray6077.length) {
					int[] is_461_ = anIntArrayArray6077[i_460_];
					if ((i_444_ & 0x1) == 0) {
						for (int i_462_ = 0; i_462_ < is_461_.length; i_462_++) {
							int i_463_ = is_461_[i_462_];
							anIntArray6053[i_463_] -= anInt6057;
							anIntArray6071[i_463_] -= anInt6026;
							anIntArray6036[i_463_] -= anInt5996;
							if (i_443_ != 0) {
								int i_464_ = Class335.anIntArray4436[i_443_];
								int i_465_ = Class335.anIntArray4430[i_443_];
								int i_466_ = (anIntArray6071[i_463_] * i_464_
										+ anIntArray6053[i_463_] * i_465_ + 16383) >> 14;
								anIntArray6071[i_463_] = (anIntArray6071[i_463_]
										* i_465_
										- anIntArray6053[i_463_]
										* i_464_ + 16383) >> 14;
								anIntArray6053[i_463_] = i_466_;
							}
							if (i_441_ != 0) {
								int i_467_ = Class335.anIntArray4436[i_441_];
								int i_468_ = Class335.anIntArray4430[i_441_];
								int i_469_ = (anIntArray6071[i_463_] * i_468_
										- anIntArray6036[i_463_] * i_467_ + 16383) >> 14;
								anIntArray6036[i_463_] = (anIntArray6071[i_463_]
										* i_467_
										+ anIntArray6036[i_463_]
										* i_468_ + 16383) >> 14;
								anIntArray6071[i_463_] = i_469_;
							}
							if (i_442_ != 0) {
								int i_470_ = Class335.anIntArray4436[i_442_];
								int i_471_ = Class335.anIntArray4430[i_442_];
								int i_472_ = (anIntArray6036[i_463_] * i_470_
										+ anIntArray6053[i_463_] * i_471_ + 16383) >> 14;
								anIntArray6036[i_463_] = (anIntArray6036[i_463_]
										* i_471_
										- anIntArray6053[i_463_]
										* i_470_ + 16383) >> 14;
								anIntArray6053[i_463_] = i_472_;
							}
							anIntArray6053[i_463_] += anInt6057;
							anIntArray6071[i_463_] += anInt6026;
							anIntArray6036[i_463_] += anInt5996;
						}
					} else {
						for (int i_473_ = 0; i_473_ < is_461_.length; i_473_++) {
							int i_474_ = is_461_[i_473_];
							anIntArray6053[i_474_] -= anInt6057;
							anIntArray6071[i_474_] -= anInt6026;
							anIntArray6036[i_474_] -= anInt5996;
							if (i_441_ != 0) {
								int i_475_ = Class335.anIntArray4436[i_441_];
								int i_476_ = Class335.anIntArray4430[i_441_];
								int i_477_ = (anIntArray6071[i_474_] * i_476_
										- anIntArray6036[i_474_] * i_475_ + 16383) >> 14;
								anIntArray6036[i_474_] = (anIntArray6071[i_474_]
										* i_475_
										+ anIntArray6036[i_474_]
										* i_476_ + 16383) >> 14;
								anIntArray6071[i_474_] = i_477_;
							}
							if (i_443_ != 0) {
								int i_478_ = Class335.anIntArray4436[i_443_];
								int i_479_ = Class335.anIntArray4430[i_443_];
								int i_480_ = (anIntArray6071[i_474_] * i_478_
										+ anIntArray6053[i_474_] * i_479_ + 16383) >> 14;
								anIntArray6071[i_474_] = (anIntArray6071[i_474_]
										* i_479_
										- anIntArray6053[i_474_]
										* i_478_ + 16383) >> 14;
								anIntArray6053[i_474_] = i_480_;
							}
							if (i_442_ != 0) {
								int i_481_ = Class335.anIntArray4436[i_442_];
								int i_482_ = Class335.anIntArray4430[i_442_];
								int i_483_ = (anIntArray6036[i_474_] * i_481_
										+ anIntArray6053[i_474_] * i_482_ + 16383) >> 14;
								anIntArray6036[i_474_] = (anIntArray6036[i_474_]
										* i_482_
										- anIntArray6053[i_474_]
										* i_481_ + 16383) >> 14;
								anIntArray6053[i_474_] = i_483_;
							}
							anIntArray6053[i_474_] += anInt6057;
							anIntArray6071[i_474_] += anInt6026;
							anIntArray6036[i_474_] += anInt5996;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_484_ = 0; i_484_ < i_445_; i_484_++) {
				int i_485_ = is[i_484_];
				if (i_485_ < anIntArrayArray6077.length) {
					int[] is_486_ = anIntArrayArray6077[i_485_];
					for (int i_487_ = 0; i_487_ < is_486_.length; i_487_++) {
						int i_488_ = is_486_[i_487_];
						anIntArray6053[i_488_] -= anInt6057;
						anIntArray6071[i_488_] -= anInt6026;
						anIntArray6036[i_488_] -= anInt5996;
						anIntArray6053[i_488_] = anIntArray6053[i_488_]
								* i_441_ / 128;
						anIntArray6071[i_488_] = anIntArray6071[i_488_]
								* i_442_ / 128;
						anIntArray6036[i_488_] = anIntArray6036[i_488_]
								* i_443_ / 128;
						anIntArray6053[i_488_] += anInt6057;
						anIntArray6071[i_488_] += anInt6026;
						anIntArray6036[i_488_] += anInt5996;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray6059 != null && aByteArray6025 != null) {
				for (int i_489_ = 0; i_489_ < i_445_; i_489_++) {
					int i_490_ = is[i_489_];
					if (i_490_ < anIntArrayArray6059.length) {
						int[] is_491_ = anIntArrayArray6059[i_490_];
						for (int i_492_ = 0; i_492_ < is_491_.length; i_492_++) {
							int i_493_ = is_491_[i_492_];
							int i_494_ = (aByteArray6025[i_493_] & 0xff)
									+ i_441_ * 8;
							if (i_494_ < 0)
								i_494_ = 0;
							else if (i_494_ > 255)
								i_494_ = 255;
							aByteArray6025[i_493_] = (byte) i_494_;
						}
					}
				}
				if (aClass325Array6028 != null) {
					for (int i_495_ = 0; i_495_ < anInt6076; i_495_++) {
						Class325 class325 = aClass325Array6028[i_495_];
						Class216 class216 = aClass216Array6013[i_495_];
						((Class216) class216).anInt2998 = (((Class216) class216).anInt2998 & 0xffffff | 255 - ((aByteArray6025[((Class325) class325).anInt4333]) & 0xff) << 24);
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray6059 != null) {
				for (int i_496_ = 0; i_496_ < i_445_; i_496_++) {
					int i_497_ = is[i_496_];
					if (i_497_ < anIntArrayArray6059.length) {
						int[] is_498_ = anIntArrayArray6059[i_497_];
						for (int i_499_ = 0; i_499_ < is_498_.length; i_499_++) {
							int i_500_ = is_498_[i_499_];
							int i_501_ = aShortArray6033[i_500_] & 0xffff;
							int i_502_ = i_501_ >> 10 & 0x3f;
							int i_503_ = i_501_ >> 7 & 0x7;
							int i_504_ = i_501_ & 0x7f;
							i_502_ = i_502_ + i_441_ & 0x3f;
							i_503_ += i_442_;
							if (i_503_ < 0)
								i_503_ = 0;
							else if (i_503_ > 7)
								i_503_ = 7;
							i_504_ += i_443_;
							if (i_504_ < 0)
								i_504_ = 0;
							else if (i_504_ > 127)
								i_504_ = 127;
							aShortArray6033[i_500_] = (short) (i_502_ << 10
									| i_503_ << 7 | i_504_);
						}
						aBool6005 = true;
					}
				}
				if (aClass325Array6028 != null) {
					for (int i_505_ = 0; i_505_ < anInt6076; i_505_++) {
						Class325 class325 = aClass325Array6028[i_505_];
						Class216 class216 = aClass216Array6013[i_505_];
						((Class216) class216).anInt2998 = (((Class216) class216).anInt2998
								& ~0xffffff | (Class219_Sub1.anIntArray7248[(Class147
								.method942(
										0,
										((aShortArray6033[(((Class325) class325).anInt4333)]) & 0xffff)) & 0xffff)]) & 0xffffff);
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray6032 != null) {
				for (int i_506_ = 0; i_506_ < i_445_; i_506_++) {
					int i_507_ = is[i_506_];
					if (i_507_ < anIntArrayArray6032.length) {
						int[] is_508_ = anIntArrayArray6032[i_507_];
						for (int i_509_ = 0; i_509_ < is_508_.length; i_509_++) {
							Class216 class216 = aClass216Array6013[is_508_[i_509_]];
							((Class216) class216).anInt2992 += i_441_;
							((Class216) class216).anInt2994 += i_442_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray6032 != null) {
				for (int i_510_ = 0; i_510_ < i_445_; i_510_++) {
					int i_511_ = is[i_510_];
					if (i_511_ < anIntArrayArray6032.length) {
						int[] is_512_ = anIntArrayArray6032[i_511_];
						for (int i_513_ = 0; i_513_ < is_512_.length; i_513_++) {
							Class216 class216 = aClass216Array6013[is_512_[i_513_]];
							((Class216) class216).anInt2988 = (((Class216) class216).anInt2988
									* i_441_ >> 7);
							((Class216) class216).anInt2999 = (((Class216) class216).anInt2999
									* i_442_ >> 7);
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray6032 != null) {
				for (int i_514_ = 0; i_514_ < i_445_; i_514_++) {
					int i_515_ = is[i_514_];
					if (i_515_ < anIntArrayArray6032.length) {
						int[] is_516_ = anIntArrayArray6032[i_515_];
						for (int i_517_ = 0; i_517_ < is_516_.length; i_517_++) {
							Class216 class216 = aClass216Array6013[is_516_[i_517_]];
							((Class216) class216).anInt2990 = (((Class216) class216).anInt2990
									+ i_441_ & 0x3fff);
						}
					}
				}
			}
		}
	}

	final int HA() {
		if (!aBool6041)
			method2593();
		return aShort6016;
	}

	final void method1306() {
		/* empty */
	}

	final boolean method1309(int i, int i_518_, Class33 class33, boolean bool,
			int i_519_) {
		return method2574(i, i_518_, class33, bool, i_519_, -1);
	}

	private final void method2600(int i) {
		int i_520_ = 0;
		int i_521_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5200;
		short i_522_ = aShortArray6051[i];
		short i_523_ = aShortArray6000[i];
		short i_524_ = aShortArray6002[i];
		int i_525_ = anIntArray5990[i_522_];
		int i_526_ = anIntArray5990[i_523_];
		int i_527_ = anIntArray5990[i_524_];
		if (aByteArray6025 == null)
			((Class296) aClass296_6008).anInt3997 = 0;
		else
			((Class296) aClass296_6008).anInt3997 = aByteArray6025[i] & 0xff;
		if (i_525_ >= i_521_) {
			anIntArray6064[i_520_] = anIntArray6014[i_522_];
			anIntArray6052[i_520_] = anIntArray6003[i_522_];
			anIntArray6044[i_520_] = anIntArray6024[i_522_];
			anIntArray6078[i_520_++] = anIntArray6065[i] & 0xffff;
		} else {
			int i_528_ = anIntArray6043[i_522_];
			int i_529_ = anIntArray6023[i_522_];
			int i_530_ = anIntArray6065[i] & 0xffff;
			if (i_527_ >= i_521_) {
				int i_531_ = (i_521_ - i_525_) * (65536 / (i_527_ - i_525_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_528_ + ((anIntArray6043[i_524_] - i_528_)
						* i_531_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_529_ + ((anIntArray6023[i_524_] - i_529_)
						* i_531_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_530_ + (((anIntArray6069[i] & 0xffff) - i_530_)
						* i_531_ >> 16));
			}
			if (i_526_ >= i_521_) {
				int i_532_ = (i_521_ - i_525_) * (65536 / (i_526_ - i_525_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_528_ + ((anIntArray6043[i_523_] - i_528_)
						* i_532_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_529_ + ((anIntArray6023[i_523_] - i_529_)
						* i_532_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_530_ + (((anIntArray6066[i] & 0xffff) - i_530_)
						* i_532_ >> 16));
			}
		}
		if (i_526_ >= i_521_) {
			anIntArray6064[i_520_] = anIntArray6014[i_523_];
			anIntArray6052[i_520_] = anIntArray6003[i_523_];
			anIntArray6044[i_520_] = anIntArray6024[i_523_];
			anIntArray6078[i_520_++] = anIntArray6066[i] & 0xffff;
		} else {
			int i_533_ = anIntArray6043[i_523_];
			int i_534_ = anIntArray6023[i_523_];
			int i_535_ = anIntArray6066[i] & 0xffff;
			if (i_525_ >= i_521_) {
				int i_536_ = (i_521_ - i_526_) * (65536 / (i_525_ - i_526_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_533_ + ((anIntArray6043[i_522_] - i_533_)
						* i_536_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_534_ + ((anIntArray6023[i_522_] - i_534_)
						* i_536_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_535_ + (((anIntArray6065[i] & 0xffff) - i_535_)
						* i_536_ >> 16));
			}
			if (i_527_ >= i_521_) {
				int i_537_ = (i_521_ - i_526_) * (65536 / (i_527_ - i_526_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_533_ + ((anIntArray6043[i_524_] - i_533_)
						* i_537_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_534_ + ((anIntArray6023[i_524_] - i_534_)
						* i_537_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_535_ + (((anIntArray6069[i] & 0xffff) - i_535_)
						* i_537_ >> 16));
			}
		}
		if (i_527_ >= i_521_) {
			anIntArray6064[i_520_] = anIntArray6014[i_524_];
			anIntArray6052[i_520_] = anIntArray6003[i_524_];
			anIntArray6044[i_520_] = anIntArray6024[i_524_];
			anIntArray6078[i_520_++] = anIntArray6069[i] & 0xffff;
		} else {
			int i_538_ = anIntArray6043[i_524_];
			int i_539_ = anIntArray6023[i_524_];
			int i_540_ = anIntArray6069[i] & 0xffff;
			if (i_526_ >= i_521_) {
				int i_541_ = (i_521_ - i_527_) * (65536 / (i_526_ - i_527_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_538_ + ((anIntArray6043[i_523_] - i_538_)
						* i_541_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_539_ + ((anIntArray6023[i_523_] - i_539_)
						* i_541_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_540_ + (((anIntArray6066[i] & 0xffff) - i_540_)
						* i_541_ >> 16));
			}
			if (i_525_ >= i_521_) {
				int i_542_ = (i_521_ - i_527_) * (65536 / (i_525_ - i_527_));
				anIntArray6064[i_520_] = (((Class363) aClass363_6056).anInt4770 + ((i_538_ + ((anIntArray6043[i_522_] - i_538_)
						* i_542_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5215 / i_521_));
				anIntArray6052[i_520_] = (((Class363) aClass363_6056).anInt4747 + ((i_539_ + ((anIntArray6023[i_522_] - i_539_)
						* i_542_ >> 16))
						* ((Class163_Sub1) aClass163_Sub1_6072).anInt5205 / i_521_));
				anIntArray6044[i_520_] = i_521_;
				anIntArray6078[i_520_++] = (i_540_ + (((anIntArray6065[i] & 0xffff) - i_540_)
						* i_542_ >> 16));
			}
		}
		int i_543_ = anIntArray6064[0];
		int i_544_ = anIntArray6064[1];
		int i_545_ = anIntArray6064[2];
		int i_546_ = anIntArray6052[0];
		int i_547_ = anIntArray6052[1];
		int i_548_ = anIntArray6052[2];
		i_525_ = anIntArray6044[0];
		i_526_ = anIntArray6044[1];
		i_527_ = anIntArray6044[2];
		((Class296) aClass296_6008).aBool4001 = false;
		if (i_520_ == 3) {
			if (i_543_ < 0 || i_544_ < 0 || i_545_ < 0
					|| i_543_ > ((Class363) aClass363_6056).anInt4748
					|| i_544_ > ((Class363) aClass363_6056).anInt4748
					|| i_545_ > ((Class363) aClass363_6056).anInt4748)
				((Class296) aClass296_6008).aBool4001 = true;
			if (aShortArray6055 == null || aShortArray6055[i] == -1) {
				if (anIntArray6069[i] == -1)
					aClass296_6008
							.method1834(
									(float) i_546_,
									(float) i_547_,
									(float) i_548_,
									(float) i_543_,
									(float) i_544_,
									(float) i_545_,
									(float) i_525_,
									(float) i_526_,
									(float) i_527_,
									(Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]));
				else
					aClass296_6008.method1841((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, (float) anIntArray6078[0],
							(float) anIntArray6078[1],
							(float) anIntArray6078[2]);
			} else {
				int i_549_ = -16777216;
				if (aByteArray6025 != null)
					i_549_ = 255 - (aByteArray6025[i] & 0xff) << 24;
				int i_550_ = i_549_ | anIntArray6065[i] & 0xffffff;
				if (anIntArray6069[i] == -1)
					aClass296_6008.method1845((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_550_, i_550_, i_550_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
				else
					aClass296_6008.method1845((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_550_, i_550_, i_550_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
			}
		}
		if (i_520_ == 4) {
			if (i_543_ < 0
					|| i_544_ < 0
					|| i_545_ < 0
					|| i_543_ > ((Class363) aClass363_6056).anInt4748
					|| i_544_ > ((Class363) aClass363_6056).anInt4748
					|| i_545_ > ((Class363) aClass363_6056).anInt4748
					|| anIntArray6064[3] < 0
					|| anIntArray6064[3] > ((Class363) aClass363_6056).anInt4748)
				((Class296) aClass296_6008).aBool4001 = true;
			if (aShortArray6055 == null || aShortArray6055[i] == -1) {
				if (anIntArray6069[i] == -1) {
					int i_551_ = (Class219_Sub1.anIntArray7248[anIntArray6065[i] & 0xffff]);
					aClass296_6008.method1834((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, i_551_);
					aClass296_6008.method1834((float) i_546_, (float) i_548_,
							(float) anIntArray6052[3], (float) i_543_,
							(float) i_545_, (float) anIntArray6064[3],
							(float) i_525_, (float) i_526_,
							(float) anIntArray6044[3], i_551_);
				} else {
					aClass296_6008.method1841((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, (float) anIntArray6078[0],
							(float) anIntArray6078[1],
							(float) anIntArray6078[2]);
					aClass296_6008.method1841((float) i_546_, (float) i_548_,
							(float) anIntArray6052[3], (float) i_543_,
							(float) i_545_, (float) anIntArray6064[3],
							(float) i_525_, (float) i_526_,
							(float) anIntArray6044[3],
							(float) anIntArray6078[0],
							(float) anIntArray6078[2],
							(float) anIntArray6078[3]);
				}
			} else {
				int i_552_ = -16777216;
				if (aByteArray6025 != null)
					i_552_ = 255 - (aByteArray6025[i] & 0xff) << 24;
				int i_553_ = i_552_ | anIntArray6065[i] & 0xffffff;
				if (anIntArray6069[i] == -1) {
					aClass296_6008.method1845((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_553_, i_553_, i_553_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
					aClass296_6008.method1845((float) i_546_, (float) i_548_,
							(float) anIntArray6052[3], (float) i_543_,
							(float) i_545_, (float) anIntArray6064[3],
							(float) i_525_, (float) i_527_,
							(float) anIntArray6044[3],
							aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_553_, i_553_, i_553_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
				} else {
					aClass296_6008.method1845((float) i_546_, (float) i_547_,
							(float) i_548_, (float) i_543_, (float) i_544_,
							(float) i_545_, (float) i_525_, (float) i_526_,
							(float) i_527_, aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_553_, i_553_, i_553_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
					aClass296_6008.method1845((float) i_546_, (float) i_548_,
							(float) anIntArray6052[3], (float) i_543_,
							(float) i_545_, (float) anIntArray6064[3],
							(float) i_525_, (float) i_527_,
							(float) anIntArray6044[3],
							aFloatArrayArray6049[i][0],
							aFloatArrayArray6049[i][1],
							aFloatArrayArray6049[i][2],
							aFloatArrayArray6045[i][0],
							aFloatArrayArray6045[i][1],
							aFloatArrayArray6045[i][2], i_553_, i_553_, i_553_,
							(((Class363) aClass363_6056).anInt4726), 0, 0, 0,
							aShortArray6055[i]);
				}
			}
		}
	}

	private final void method2601() {
		synchronized (this) {
			for (int i = 0; i < anInt6042; i++) {
				int i_554_ = anIntArray6036[i];
				anIntArray6036[i] = anIntArray6053[i];
				anIntArray6053[i] = -i_554_;
				if (aClass145Array5997[i] != null) {
					i_554_ = ((Class145) aClass145Array5997[i]).anInt1945;
					((Class145) aClass145Array5997[i]).anInt1945 = ((Class145) aClass145Array5997[i]).anInt1947;
					((Class145) aClass145Array5997[i]).anInt1947 = -i_554_;
				}
			}
			if (aClass162Array6006 != null) {
				for (int i = 0; i < anInt6034; i++) {
					if (aClass162Array6006[i] != null) {
						int i_555_ = ((Class162) aClass162Array6006[i]).anInt2100;
						((Class162) aClass162Array6006[i]).anInt2100 = ((Class162) aClass162Array6006[i]).anInt2101;
						((Class162) aClass162Array6006[i]).anInt2101 = -i_555_;
					}
				}
			}
			for (int i = anInt6042; i < anInt6010; i++) {
				int i_556_ = anIntArray6036[i];
				anIntArray6036[i] = anIntArray6053[i];
				anIntArray6053[i] = -i_556_;
			}
			anInt6058 = 0;
			aBool6041 = false;
		}
	}

	private final void method2602(Class33 class33, Class376_Sub4 class376_sub4,
			int i, int i_557_) {
		if (anInt6042 >= 1) {
			aClass33_Sub3_6054 = (Class33_Sub3) class33;
			Class33_Sub3 class33_sub3 = ((Class163_Sub1) aClass163_Sub1_6072).aClass33_Sub3_5207;
			if (!aBool6041)
				method2593();
			boolean bool = false;
			if (((Class33_Sub3) aClass33_Sub3_6054).aFloat7164 == 16384.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186 == 16384.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7196 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7185 == 0.0F
					&& ((Class33_Sub3) aClass33_Sub3_6054).aFloat7166 == 16384.0F)
				bool = true;
			float f = (((Class33_Sub3) class33_sub3).aFloat7175
					+ (((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
					+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175));
			float f_558_ = (bool ? ((Class33_Sub3) class33_sub3).aFloat7185
					: ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
							+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7166 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7185)));
			int i_559_ = (int) (f + (float) aShort6009 * f_558_);
			int i_560_ = (int) (f + (float) aShort6030 * f_558_);
			int i_561_;
			int i_562_;
			if (i_559_ > i_560_) {
				i_561_ = i_560_ - aShort6027;
				i_562_ = i_559_ + aShort6027;
			} else {
				i_561_ = i_559_ - aShort6027;
				i_562_ = i_560_ + aShort6027;
			}
			if (i_561_ < ((Class163_Sub1) aClass163_Sub1_6072).anInt5201
					&& i_562_ > ((Class163_Sub1) aClass163_Sub1_6072).anInt5200) {
				float f_563_ = (((Class33_Sub3) class33_sub3).aFloat7197
						+ (((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
						+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7193 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175));
				float f_564_ = (bool ? ((Class33_Sub3) class33_sub3).aFloat7195
						: ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
								+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7193 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7185))));
				int i_565_ = (int) (f_563_ + (float) aShort6009 * f_564_);
				int i_566_ = (int) (f_563_ + (float) aShort6030 * f_564_);
				int i_567_;
				int i_568_;
				if (i_565_ > i_566_) {
					i_567_ = ((i_566_ - aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5215);
					i_568_ = ((i_565_ + aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5215);
				} else {
					i_567_ = ((i_565_ - aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5215);
					i_568_ = ((i_566_ + aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5215);
				}
				if (i == -1) {
					if ((i_567_ / i_562_ >= ((Class163_Sub1) aClass163_Sub1_6072).anInt5203)
							|| i_568_ / i_562_ <= ((Class163_Sub1) aClass163_Sub1_6072).anInt5212)
						return;
				} else if ((i_567_ / i >= ((Class163_Sub1) aClass163_Sub1_6072).anInt5203)
						|| i_568_ / i <= ((Class163_Sub1) aClass163_Sub1_6072).anInt5212)
					return;
				float f_569_ = (((Class33_Sub3) class33_sub3).aFloat7190
						+ (((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7197)
						+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + (((Class33_Sub3) class33_sub3).aFloat7182 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7175));
				float f_570_ = (bool ? ((Class33_Sub3) class33_sub3).aFloat7186
						: ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7195)
								+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7186) + (((Class33_Sub3) class33_sub3).aFloat7182 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7185))));
				int i_571_ = (int) (f_569_ + (float) aShort6009 * f_570_);
				int i_572_ = (int) (f_569_ + (float) aShort6030 * f_570_);
				int i_573_;
				int i_574_;
				if (i_571_ > i_572_) {
					i_573_ = ((i_572_ - aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5205);
					i_574_ = ((i_571_ + aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5205);
				} else {
					i_573_ = ((i_571_ - aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5205);
					i_574_ = ((i_572_ + aShort6027) * ((Class163_Sub1) aClass163_Sub1_6072).anInt5205);
				}
				if (i == -1) {
					if ((i_573_ / i_562_ >= ((Class163_Sub1) aClass163_Sub1_6072).anInt5202)
							|| i_574_ / i_562_ <= ((Class163_Sub1) aClass163_Sub1_6072).anInt5179)
						return;
				} else if ((i_573_ / i >= ((Class163_Sub1) aClass163_Sub1_6072).anInt5202)
						|| i_574_ / i <= ((Class163_Sub1) aClass163_Sub1_6072).anInt5179)
					return;
				float f_575_;
				float f_576_;
				float f_577_;
				float f_578_;
				float f_579_;
				float f_580_;
				if (bool) {
					f_575_ = ((Class33_Sub3) class33_sub3).aFloat7164;
					f_576_ = ((Class33_Sub3) class33_sub3).aFloat7179;
					f_577_ = ((Class33_Sub3) class33_sub3).aFloat7196;
					f_578_ = ((Class33_Sub3) class33_sub3).aFloat7193;
					f_579_ = ((Class33_Sub3) class33_sub3).aFloat7182;
					f_580_ = ((Class33_Sub3) class33_sub3).aFloat7166;
				} else {
					f_575_ = ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
							+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7193 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7196)));
					f_576_ = ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
							+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7182 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7196)));
					f_577_ = ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7164)
							+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7179) + (((Class33_Sub3) class33_sub3).aFloat7166 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7196)));
					f_578_ = ((((Class33_Sub3) class33_sub3).aFloat7164 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
							+ (((Class33_Sub3) class33_sub3).aFloat7195 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7193 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7166)));
					f_579_ = ((((Class33_Sub3) class33_sub3).aFloat7179 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
							+ (((Class33_Sub3) class33_sub3).aFloat7186 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7182 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7166)));
					f_580_ = ((((Class33_Sub3) class33_sub3).aFloat7196 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7193)
							+ (((Class33_Sub3) class33_sub3).aFloat7185 * ((Class33_Sub3) aClass33_Sub3_6054).aFloat7182) + (((Class33_Sub3) class33_sub3).aFloat7166 * (((Class33_Sub3) aClass33_Sub3_6054).aFloat7166)));
				}
				if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
					synchronized (this) {
						while (aBool6011) {
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						aBool6011 = true;
					}
				}
				method2581(Thread.currentThread());
				if ((i_557_ & 0x2) != 0)
					aClass296_6008.method1839(true);
				else
					aClass296_6008.method1839(false);
				boolean bool_581_ = false;
				boolean bool_582_ = (i_561_ <= ((Class163_Sub1) aClass163_Sub1_6072).anInt5200);
				boolean bool_583_ = (bool_582_ || aClass110Array6038 != null || aClass261Array6004 != null);
				((Class363) aClass363_6056).anInt4748 = ((Class296) aClass296_6008).anInt3995;
				((Class363) aClass363_6056).anInt4770 = ((Class296) aClass296_6008).anInt3993;
				((Class363) aClass363_6056).anInt4747 = ((Class296) aClass296_6008).anInt4000;
				int i_584_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5215;
				int i_585_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5205;
				int i_586_ = ((Class163_Sub1) aClass163_Sub1_6072).anInt5200;
				if (i == -1) {
					for (int i_587_ = 0; i_587_ < anInt6010; i_587_++) {
						int i_588_ = anIntArray6053[i_587_];
						int i_589_ = anIntArray6071[i_587_];
						int i_590_ = anIntArray6036[i_587_];
						float f_591_ = (f_563_ + f_575_ * (float) i_588_
								+ f_564_ * (float) i_589_ + f_578_
								* (float) i_590_);
						float f_592_ = (f_569_ + f_576_ * (float) i_588_
								+ f_570_ * (float) i_589_ + f_579_
								* (float) i_590_);
						float f_593_ = (f + f_577_ * (float) i_588_ + f_558_
								* (float) i_589_ + f_580_ * (float) i_590_);
						anIntArray6024[i_587_] = (int) f_593_;
						if (f_593_ >= (float) i_586_) {
							anIntArray6014[i_587_] = (((Class363) aClass363_6056).anInt4770 + (int) (f_591_
									* (float) i_584_ / f_593_));
							anIntArray6003[i_587_] = (((Class363) aClass363_6056).anInt4747 + (int) (f_592_
									* (float) i_585_ / f_593_));
						} else {
							anIntArray6014[i_587_] = -5000;
							bool_581_ = true;
						}
						if (bool_583_) {
							anIntArray6043[i_587_] = (int) f_591_;
							anIntArray6023[i_587_] = (int) f_592_;
							anIntArray5990[i_587_] = (int) f_593_;
						}
						if (((Class363) aClass363_6056).aBool4728)
							anIntArray6079[i_587_] = (int) ((((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + ((((Class33_Sub3) aClass33_Sub3_6054).aFloat7179 * (float) i_588_)
									+ (((Class33_Sub3) aClass33_Sub3_6054).aFloat7186 * (float) i_589_) + (((Class33_Sub3) aClass33_Sub3_6054).aFloat7182 * (float) i_590_)));
					}
					if (aClass325Array6028 != null) {
						for (int i_594_ = 0; i_594_ < anInt6076; i_594_++) {
							Class325 class325 = aClass325Array6028[i_594_];
							Class216 class216 = aClass216Array6013[i_594_];
							short i_595_ = (aShortArray6051[((Class325) class325).anInt4333]);
							short i_596_ = (aShortArray6000[((Class325) class325).anInt4333]);
							short i_597_ = (aShortArray6002[((Class325) class325).anInt4333]);
							int i_598_ = ((anIntArray6053[i_595_]
									+ anIntArray6053[i_596_] + anIntArray6053[i_597_]) / 3);
							int i_599_ = ((anIntArray6071[i_595_]
									+ anIntArray6071[i_596_] + anIntArray6071[i_597_]) / 3);
							int i_600_ = ((anIntArray6036[i_595_]
									+ anIntArray6036[i_596_] + anIntArray6036[i_597_]) / 3);
							float f_601_ = ((float) ((Class216) class216).anInt2992 + (f_563_
									+ f_575_
									* (float) i_598_
									+ f_564_
									* (float) i_599_ + f_578_ * (float) i_600_));
							float f_602_ = ((float) ((Class216) class216).anInt2994 + (f_569_
									+ f_576_
									* (float) i_598_
									+ f_570_
									* (float) i_599_ + f_579_ * (float) i_600_));
							float f_603_ = (f + f_577_ * (float) i_598_
									+ f_558_ * (float) i_599_ + f_580_
									* (float) i_600_);
							if (f_603_ > (float) ((Class163_Sub1) aClass163_Sub1_6072).anInt5200) {
								((Class216) class216).anInt2986 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5181) + (int) (f_601_
										* (float) i_584_ / f_603_));
								((Class216) class216).anInt2997 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5197) + (int) (f_602_
										* (float) i_585_ / f_603_));
								((Class216) class216).anInt2989 = ((int) f_603_ - ((Class325) class325).anInt4335);
								((Class216) class216).anInt2993 = (int) ((float) ((((Class216) class216).anInt2988)
										* (((Class325) class325).aShort4332) * i_584_) / (f_603_ * 128.0F));
								((Class216) class216).anInt2984 = (int) ((float) ((((Class216) class216).anInt2999)
										* (((Class325) class325).aShort4325) * i_585_) / (f_603_ * 128.0F));
							} else
								((Class216) class216).anInt2993 = ((Class216) class216).anInt2984 = 0;
						}
					}
				} else {
					for (int i_604_ = 0; i_604_ < anInt6010; i_604_++) {
						int i_605_ = anIntArray6053[i_604_];
						int i_606_ = anIntArray6071[i_604_];
						int i_607_ = anIntArray6036[i_604_];
						float f_608_ = (f_563_ + f_575_ * (float) i_605_
								+ f_564_ * (float) i_606_ + f_578_
								* (float) i_607_);
						float f_609_ = (f_569_ + f_576_ * (float) i_605_
								+ f_570_ * (float) i_606_ + f_579_
								* (float) i_607_);
						float f_610_ = (f + f_577_ * (float) i_605_ + f_558_
								* (float) i_606_ + f_580_ * (float) i_607_);
						anIntArray6024[i_604_] = (int) f_610_;
						anIntArray6014[i_604_] = (((Class363) aClass363_6056).anInt4770 + (int) (f_608_
								* (float) i_584_ / (float) i));
						anIntArray6003[i_604_] = (((Class363) aClass363_6056).anInt4747 + (int) (f_609_
								* (float) i_585_ / (float) i));
						if (bool_583_) {
							anIntArray6043[i_604_] = (int) f_608_;
							anIntArray6023[i_604_] = (int) f_609_;
							anIntArray5990[i_604_] = i;
						}
						if (((Class363) aClass363_6056).aBool4728)
							anIntArray6079[i_604_] = (int) ((((Class33_Sub3) aClass33_Sub3_6054).aFloat7190) + ((((Class33_Sub3) aClass33_Sub3_6054).aFloat7179 * (float) i_605_)
									+ (((Class33_Sub3) aClass33_Sub3_6054).aFloat7186 * (float) i_606_) + (((Class33_Sub3) aClass33_Sub3_6054).aFloat7182 * (float) i_607_)));
					}
					if (aClass325Array6028 != null) {
						for (int i_611_ = 0; i_611_ < anInt6076; i_611_++) {
							Class325 class325 = aClass325Array6028[i_611_];
							Class216 class216 = aClass216Array6013[i_611_];
							short i_612_ = (aShortArray6051[((Class325) class325).anInt4333]);
							short i_613_ = (aShortArray6000[((Class325) class325).anInt4333]);
							short i_614_ = (aShortArray6002[((Class325) class325).anInt4333]);
							int i_615_ = ((anIntArray6053[i_612_]
									+ anIntArray6053[i_613_] + anIntArray6053[i_614_]) / 3);
							int i_616_ = ((anIntArray6071[i_612_]
									+ anIntArray6071[i_613_] + anIntArray6071[i_614_]) / 3);
							int i_617_ = ((anIntArray6036[i_612_]
									+ anIntArray6036[i_613_] + anIntArray6036[i_614_]) / 3);
							float f_618_ = (f_563_ + f_575_ * (float) i_615_
									+ f_564_ * (float) i_616_ + f_578_
									* (float) i_617_);
							float f_619_ = (f_569_ + f_576_ * (float) i_615_
									+ f_570_ * (float) i_616_ + f_579_
									* (float) i_617_);
							float f_620_ = (f + f_577_ * (float) i_615_
									+ f_558_ * (float) i_616_ + f_580_
									* (float) i_617_);
							((Class216) class216).anInt2986 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5181) + (int) (f_618_
									* (float) i_584_ / (float) i));
							((Class216) class216).anInt2997 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5197) + (int) (f_619_
									* (float) i_585_ / (float) i));
							((Class216) class216).anInt2989 = i
									- ((Class325) class325).anInt4335;
							((Class216) class216).anInt2993 = (((Class216) class216).anInt2988
									* ((Class325) class325).aShort4332 * i_584_ / (i << 7));
							((Class216) class216).anInt2984 = (((Class216) class216).anInt2999
									* ((Class325) class325).aShort4325 * i_585_ / (i << 7));
						}
					}
				}
				if (class376_sub4 != null) {
					boolean bool_621_ = false;
					boolean bool_622_ = true;
					int i_623_ = aShort6068 + aShort5993 >> 1;
					int i_624_ = aShort6016 + aShort6061 >> 1;
					int i_625_ = i_623_;
					short i_626_ = aShort6009;
					int i_627_ = i_624_;
					float f_628_ = (f_563_ + f_575_ * (float) i_625_ + f_564_
							* (float) i_626_ + f_578_ * (float) i_627_);
					float f_629_ = (f_569_ + f_576_ * (float) i_625_ + f_570_
							* (float) i_626_ + f_579_ * (float) i_627_);
					float f_630_ = (f + f_577_ * (float) i_625_ + f_558_
							* (float) i_626_ + f_580_ * (float) i_627_);
					if (f_630_ >= (float) i_586_) {
						int i_631_ = (int) f_630_;
						if (i != -1)
							i_631_ = i;
						((Class376_Sub4) class376_sub4).anInt6122 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5181 + (int) (f_628_
								* (float) i_584_ / (float) i_631_));
						((Class376_Sub4) class376_sub4).anInt6123 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5197 + (int) (f_629_
								* (float) i_585_ / (float) i_631_));
					} else
						bool_621_ = true;
					i_625_ = i_623_;
					i_626_ = aShort6030;
					i_627_ = i_624_;
					float f_632_ = (f_563_ + f_575_ * (float) i_625_ + f_564_
							* (float) i_626_ + f_578_ * (float) i_627_);
					float f_633_ = (f_569_ + f_576_ * (float) i_625_ + f_570_
							* (float) i_626_ + f_579_ * (float) i_627_);
					float f_634_ = (f + f_577_ * (float) i_625_ + f_558_
							* (float) i_626_ + f_580_ * (float) i_627_);
					if (f_634_ >= (float) i_586_) {
						int i_635_ = (int) f_634_;
						if (i != -1)
							i_635_ = i;
						((Class376_Sub4) class376_sub4).anInt6127 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5181 + (int) (f_632_
								* (float) i_584_ / (float) i_635_));
						((Class376_Sub4) class376_sub4).anInt6126 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5197 + (int) (f_633_
								* (float) i_585_ / (float) i_635_));
					} else
						bool_621_ = true;
					if (bool_621_) {
						if (f_630_ < (float) i_586_ && f_634_ < (float) i_586_)
							bool_622_ = false;
						else if (f_630_ < (float) i_586_) {
							float f_636_ = ((f_634_ - (float) ((Class163_Sub1) aClass163_Sub1_6072).anInt5200) / (f_634_ - f_630_));
							int i_637_ = (int) (f_632_ + (f_632_ - f_628_)
									* f_636_);
							int i_638_ = (int) (f_633_ + (f_633_ - f_629_)
									* f_636_);
							int i_639_ = i_586_;
							if (i != -1)
								i_639_ = i;
							((Class376_Sub4) class376_sub4).anInt6122 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5181)
									+ i_637_ * i_584_ / i_639_;
							((Class376_Sub4) class376_sub4).anInt6123 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5197)
									+ i_638_ * i_585_ / i_639_;
						} else if (f_634_ < (float) i_586_) {
							float f_640_ = ((f_630_ - (float) i_586_) / (f_630_ - f_634_));
							int i_641_ = (int) (f_628_ + (f_628_ - f_632_)
									* f_640_);
							int i_642_ = (int) (f_629_ + (f_629_ - f_633_)
									* f_640_);
							int i_643_ = i_586_;
							if (i != -1)
								i_643_ = i;
							((Class376_Sub4) class376_sub4).anInt6122 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5181)
									+ i_641_ * i_584_ / i_643_;
							((Class376_Sub4) class376_sub4).anInt6123 = (((Class163_Sub1) aClass163_Sub1_6072).anInt5197)
									+ i_642_ * i_585_ / i_643_;
						}
					}
					if (bool_622_) {
						if (f_630_ > f_634_) {
							int i_644_ = (int) f_630_;
							if (i != -1)
								i_644_ = i;
							((Class376_Sub4) class376_sub4).anInt6125 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5181)
									+ (int) ((f_628_ + (float) aShort6027)
											* (float) i_584_ / (float) i_644_) - (((Class376_Sub4) class376_sub4).anInt6122));
						} else {
							int i_645_ = (int) f_634_;
							if (i != -1)
								i_645_ = i;
							((Class376_Sub4) class376_sub4).anInt6125 = ((((Class163_Sub1) aClass163_Sub1_6072).anInt5181)
									+ (int) ((f_632_ + (float) aShort6027)
											* (float) i_584_ / (float) i_645_) - (((Class376_Sub4) class376_sub4).anInt6127));
						}
						((Class376_Sub4) class376_sub4).aBool6124 = true;
					}
				}
				method2580(true);
				((Class296) aClass296_6008).aBool4003 = (i_557_ & 0x1) == 0;
				((Class296) aClass296_6008).aBool3992 = false;
				try {
					method2576(
							bool_581_,
							((((Class363) aClass363_6056).aBool4723 && (i_562_ > ((Class363) aClass363_6056).anInt4724)) || ((Class363) aClass363_6056).aBool4728),
							i_561_, i_562_ - i_561_);
				} catch (Exception exception) {
					/* empty */
				}
				if (aClass325Array6028 != null) {
					for (int i_646_ = 0; i_646_ < anInt6034; i_646_++)
						anIntArray6037[i_646_] = -1;
				}
				aClass296_6008 = null;
				if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
					synchronized (this) {
						aBool6011 = false;
						this.notifyAll();
					}
				}
			}
		}
	}

	final void H(int i, int i_647_, int i_648_) {
		if (i != 0 && (anInt6035 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_647_ != 0 && (anInt6035 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_648_ != 0 && (anInt6035 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_649_ = 0; i_649_ < anInt6010; i_649_++) {
				anIntArray6053[i_649_] += i;
				anIntArray6071[i_649_] += i_647_;
				anIntArray6036[i_649_] += i_648_;
			}
		}
	}

	final int G() {
		if (!aBool6041)
			method2593();
		return aShort6061;
	}

	final void P(int i, int i_650_, int i_651_, int i_652_) {
		if (i == 0) {
			int i_653_ = 0;
			anInt6057 = 0;
			anInt6026 = 0;
			anInt5996 = 0;
			for (int i_654_ = 0; i_654_ < anInt6010; i_654_++) {
				anInt6057 += anIntArray6053[i_654_];
				anInt6026 += anIntArray6071[i_654_];
				anInt5996 += anIntArray6036[i_654_];
				i_653_++;
			}
			if (i_653_ > 0) {
				anInt6057 = anInt6057 / i_653_ + i_650_;
				anInt6026 = anInt6026 / i_653_ + i_651_;
				anInt5996 = anInt5996 / i_653_ + i_652_;
			} else {
				anInt6057 = i_650_;
				anInt6026 = i_651_;
				anInt5996 = i_652_;
			}
		} else if (i == 1) {
			for (int i_655_ = 0; i_655_ < anInt6010; i_655_++) {
				anIntArray6053[i_655_] += i_650_;
				anIntArray6071[i_655_] += i_651_;
				anIntArray6036[i_655_] += i_652_;
			}
		} else if (i == 2) {
			for (int i_656_ = 0; i_656_ < anInt6010; i_656_++) {
				anIntArray6053[i_656_] -= anInt6057;
				anIntArray6071[i_656_] -= anInt6026;
				anIntArray6036[i_656_] -= anInt5996;
				if (i_652_ != 0) {
					int i_657_ = Class335.anIntArray4436[i_652_];
					int i_658_ = Class335.anIntArray4430[i_652_];
					int i_659_ = ((anIntArray6071[i_656_] * i_657_
							+ anIntArray6053[i_656_] * i_658_ + 16383) >> 14);
					anIntArray6071[i_656_] = (anIntArray6071[i_656_] * i_658_
							- anIntArray6053[i_656_] * i_657_ + 16383) >> 14;
					anIntArray6053[i_656_] = i_659_;
				}
				if (i_650_ != 0) {
					int i_660_ = Class335.anIntArray4436[i_650_];
					int i_661_ = Class335.anIntArray4430[i_650_];
					int i_662_ = ((anIntArray6071[i_656_] * i_661_
							- anIntArray6036[i_656_] * i_660_ + 16383) >> 14);
					anIntArray6036[i_656_] = (anIntArray6071[i_656_] * i_660_
							+ anIntArray6036[i_656_] * i_661_ + 16383) >> 14;
					anIntArray6071[i_656_] = i_662_;
				}
				if (i_651_ != 0) {
					int i_663_ = Class335.anIntArray4436[i_651_];
					int i_664_ = Class335.anIntArray4430[i_651_];
					int i_665_ = ((anIntArray6036[i_656_] * i_663_
							+ anIntArray6053[i_656_] * i_664_ + 16383) >> 14);
					anIntArray6036[i_656_] = (anIntArray6036[i_656_] * i_664_
							- anIntArray6053[i_656_] * i_663_ + 16383) >> 14;
					anIntArray6053[i_656_] = i_665_;
				}
				anIntArray6053[i_656_] += anInt6057;
				anIntArray6071[i_656_] += anInt6026;
				anIntArray6036[i_656_] += anInt5996;
			}
		} else if (i == 3) {
			for (int i_666_ = 0; i_666_ < anInt6010; i_666_++) {
				anIntArray6053[i_666_] -= anInt6057;
				anIntArray6071[i_666_] -= anInt6026;
				anIntArray6036[i_666_] -= anInt5996;
				anIntArray6053[i_666_] = anIntArray6053[i_666_] * i_650_ / 128;
				anIntArray6071[i_666_] = anIntArray6071[i_666_] * i_651_ / 128;
				anIntArray6036[i_666_] = anIntArray6036[i_666_] * i_652_ / 128;
				anIntArray6053[i_666_] += anInt6057;
				anIntArray6071[i_666_] += anInt6026;
				anIntArray6036[i_666_] += anInt5996;
			}
		} else if (i == 5) {
			for (int i_667_ = 0; i_667_ < anInt6034; i_667_++) {
				int i_668_ = (aByteArray6025[i_667_] & 0xff) + i_650_ * 8;
				if (i_668_ < 0)
					i_668_ = 0;
				else if (i_668_ > 255)
					i_668_ = 255;
				aByteArray6025[i_667_] = (byte) i_668_;
			}
			if (aClass325Array6028 != null) {
				for (int i_669_ = 0; i_669_ < anInt6076; i_669_++) {
					Class325 class325 = aClass325Array6028[i_669_];
					Class216 class216 = aClass216Array6013[i_669_];
					((Class216) class216).anInt2998 = (((Class216) class216).anInt2998 & 0xffffff | 255 - ((aByteArray6025[((Class325) class325).anInt4333]) & 0xff) << 24);
				}
			}
		} else if (i == 7) {
			for (int i_670_ = 0; i_670_ < anInt6034; i_670_++) {
				int i_671_ = aShortArray6033[i_670_] & 0xffff;
				int i_672_ = i_671_ >> 10 & 0x3f;
				int i_673_ = i_671_ >> 7 & 0x7;
				int i_674_ = i_671_ & 0x7f;
				i_672_ = i_672_ + i_650_ & 0x3f;
				i_673_ += i_651_;
				if (i_673_ < 0)
					i_673_ = 0;
				else if (i_673_ > 7)
					i_673_ = 7;
				i_674_ += i_652_;
				if (i_674_ < 0)
					i_674_ = 0;
				else if (i_674_ > 127)
					i_674_ = 127;
				aShortArray6033[i_670_] = (short) (i_672_ << 10 | i_673_ << 7 | i_674_);
			}
			aBool6005 = true;
			if (aClass325Array6028 != null) {
				for (int i_675_ = 0; i_675_ < anInt6076; i_675_++) {
					Class325 class325 = aClass325Array6028[i_675_];
					Class216 class216 = aClass216Array6013[i_675_];
					((Class216) class216).anInt2998 = (((Class216) class216).anInt2998
							& ~0xffffff | ((Class219_Sub1.anIntArray7248[Class147
							.method942(
									0,
									((aShortArray6033[(((Class325) class325).anInt4333)]) & 0xffff)) & 0xffff]) & 0xffffff));
				}
			}
		} else if (i == 8) {
			for (int i_676_ = 0; i_676_ < anInt6076; i_676_++) {
				Class216 class216 = aClass216Array6013[i_676_];
				((Class216) class216).anInt2992 += i_650_;
				((Class216) class216).anInt2994 += i_651_;
			}
		} else if (i == 10) {
			for (int i_677_ = 0; i_677_ < anInt6076; i_677_++) {
				Class216 class216 = aClass216Array6013[i_677_];
				((Class216) class216).anInt2988 = ((Class216) class216).anInt2988
						* i_650_ >> 7;
				((Class216) class216).anInt2999 = ((Class216) class216).anInt2999
						* i_651_ >> 7;
			}
		} else if (i == 9) {
			for (int i_678_ = 0; i_678_ < anInt6076; i_678_++) {
				Class216 class216 = aClass216Array6013[i_678_];
				((Class216) class216).anInt2990 = ((Class216) class216).anInt2990
						+ i_650_ & 0x3fff;
			}
		}
	}

	private final int method2603(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	final int na() {
		if (!aBool6041)
			method2593();
		return aShort6027;
	}

	final int ma() {
		if (!aBool6041)
			method2593();
		return aShort5999;
	}

	final Class261[] method1325() {
		return aClass261Array6004;
	}

	final void p(int i, int i_679_, Class12 class12, Class12 class12_680_,
			int i_681_, int i_682_, int i_683_) {
		if (i == 3) {
			if ((anInt6035 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((anInt6035 & 0x2) != 2)
			throw new IllegalStateException();
		if (!aBool6041)
			method2593();
		int i_684_ = i_681_ + aShort6068;
		int i_685_ = i_681_ + aShort5993;
		int i_686_ = i_683_ + aShort6016;
		int i_687_ = i_683_ + aShort6061;
		if (i == 4
				|| (i_684_ >= 0
						&& ((i_685_ + ((Class12) class12).anInt93 >> ((Class12) class12).anInt97) < ((Class12) class12).anInt103)
						&& i_686_ >= 0 && ((i_687_
						+ ((Class12) class12).anInt93 >> ((Class12) class12).anInt97) < ((Class12) class12).anInt98))) {
			int[][] is = ((Class12) (Class12_Sub2) class12).anIntArrayArray100;
			int[][] is_688_ = null;
			if (class12_680_ != null)
				is_688_ = (((Class12) (Class12_Sub2) class12_680_).anIntArrayArray100);
			if (i == 4 || i == 5) {
				if (class12_680_ == null
						|| (i_684_ < 0
								|| ((i_685_ + ((Class12) class12_680_).anInt93 >> ((Class12) class12_680_).anInt97) >= ((Class12) class12_680_).anInt103)
								|| i_686_ < 0 || ((i_687_
								+ ((Class12) class12_680_).anInt93 >> ((Class12) class12_680_).anInt97) >= ((Class12) class12_680_).anInt98)))
					return;
			} else {
				i_684_ >>= ((Class12) class12).anInt97;
				i_685_ = (i_685_ + (((Class12) class12).anInt93 - 1) >> ((Class12) class12).anInt97);
				i_686_ >>= ((Class12) class12).anInt97;
				i_687_ = (i_687_ + (((Class12) class12).anInt93 - 1) >> ((Class12) class12).anInt97);
				if (is[i_684_][i_686_] == i_682_
						&& is[i_685_][i_686_] == i_682_
						&& is[i_684_][i_687_] == i_682_
						&& is[i_685_][i_687_] == i_682_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_689_ = ((Class12) class12).anInt93 - 1;
					for (int i_690_ = 0; i_690_ < anInt6042; i_690_++) {
						int i_691_ = anIntArray6053[i_690_] + i_681_;
						int i_692_ = anIntArray6036[i_690_] + i_683_;
						int i_693_ = i_691_ & i_689_;
						int i_694_ = i_692_ & i_689_;
						int i_695_ = i_691_ >> ((Class12) class12).anInt97;
						int i_696_ = i_692_ >> ((Class12) class12).anInt97;
						int i_697_ = (((is[i_695_][i_696_] * (((Class12) class12).anInt93 - i_693_)) + is[i_695_ + 1][i_696_]
								* i_693_) >> ((Class12) class12).anInt97);
						int i_698_ = (((is[i_695_][i_696_ + 1] * (((Class12) class12).anInt93 - i_693_)) + is[i_695_ + 1][i_696_ + 1]
								* i_693_) >> ((Class12) class12).anInt97);
						int i_699_ = (i_697_
								* (((Class12) class12).anInt93 - i_694_)
								+ i_698_ * i_694_ >> ((Class12) class12).anInt97);
						anIntArray6071[i_690_] = anIntArray6071[i_690_]
								+ i_699_ - i_682_;
					}
					for (int i_700_ = anInt6042; i_700_ < anInt6010; i_700_++) {
						int i_701_ = anIntArray6053[i_700_] + i_681_;
						int i_702_ = anIntArray6036[i_700_] + i_683_;
						int i_703_ = i_701_ & i_689_;
						int i_704_ = i_702_ & i_689_;
						int i_705_ = i_701_ >> ((Class12) class12).anInt97;
						int i_706_ = i_702_ >> ((Class12) class12).anInt97;
						if (i_705_ >= 0 && i_705_ < is.length - 1
								&& i_706_ >= 0 && i_706_ < is[0].length - 1) {
							int i_707_ = (((is[i_705_][i_706_] * (((Class12) class12).anInt93 - i_703_)) + is[i_705_ + 1][i_706_]
									* i_703_) >> ((Class12) class12).anInt97);
							int i_708_ = (((is[i_705_][i_706_ + 1] * (((Class12) class12).anInt93 - i_703_)) + is[i_705_ + 1][i_706_ + 1]
									* i_703_) >> ((Class12) class12).anInt97);
							int i_709_ = (i_707_
									* (((Class12) class12).anInt93 - i_704_)
									+ i_708_ * i_704_ >> ((Class12) class12).anInt97);
							anIntArray6071[i_700_] = anIntArray6071[i_700_]
									+ i_709_ - i_682_;
						}
					}
				} else if (i == 2) {
					int i_710_ = ((Class12) class12).anInt93 - 1;
					for (int i_711_ = 0; i_711_ < anInt6042; i_711_++) {
						int i_712_ = (anIntArray6071[i_711_] << 16)
								/ aShort6009;
						if (i_712_ < i_679_) {
							int i_713_ = anIntArray6053[i_711_] + i_681_;
							int i_714_ = anIntArray6036[i_711_] + i_683_;
							int i_715_ = i_713_ & i_710_;
							int i_716_ = i_714_ & i_710_;
							int i_717_ = i_713_ >> ((Class12) class12).anInt97;
							int i_718_ = i_714_ >> ((Class12) class12).anInt97;
							int i_719_ = (((is[i_717_][i_718_] * (((Class12) class12).anInt93 - i_715_)) + is[i_717_ + 1][i_718_]
									* i_715_) >> ((Class12) class12).anInt97);
							int i_720_ = (((is[i_717_][i_718_ + 1] * (((Class12) class12).anInt93 - i_715_)) + is[i_717_ + 1][i_718_ + 1]
									* i_715_) >> ((Class12) class12).anInt97);
							int i_721_ = (i_719_
									* (((Class12) class12).anInt93 - i_716_)
									+ i_720_ * i_716_ >> ((Class12) class12).anInt97);
							anIntArray6071[i_711_] = anIntArray6071[i_711_]
									+ ((i_721_ - i_682_) * (i_679_ - i_712_) / i_679_);
						} else
							anIntArray6071[i_711_] = anIntArray6071[i_711_];
					}
					for (int i_722_ = anInt6042; i_722_ < anInt6010; i_722_++) {
						int i_723_ = (anIntArray6071[i_722_] << 16)
								/ aShort6009;
						if (i_723_ < i_679_) {
							int i_724_ = anIntArray6053[i_722_] + i_681_;
							int i_725_ = anIntArray6036[i_722_] + i_683_;
							int i_726_ = i_724_ & i_710_;
							int i_727_ = i_725_ & i_710_;
							int i_728_ = i_724_ >> ((Class12) class12).anInt97;
							int i_729_ = i_725_ >> ((Class12) class12).anInt97;
							if (i_728_ >= 0
									&& i_728_ < ((Class12) class12).anInt103 - 1
									&& i_729_ >= 0
									&& i_729_ < ((Class12) class12).anInt98 - 1) {
								int i_730_ = (((is[i_728_][i_729_] * (((Class12) class12).anInt93 - i_726_)) + is[i_728_ + 1][i_729_]
										* i_726_) >> ((Class12) class12).anInt97);
								int i_731_ = (((is[i_728_][i_729_ + 1] * (((Class12) class12).anInt93 - i_726_)) + is[i_728_ + 1][i_729_ + 1]
										* i_726_) >> ((Class12) class12).anInt97);
								int i_732_ = (i_730_
										* (((Class12) class12).anInt93 - i_727_)
										+ i_731_ * i_727_ >> ((Class12) class12).anInt97);
								anIntArray6071[i_722_] = (anIntArray6071[i_722_] + ((i_732_ - i_682_)
										* (i_679_ - i_723_) / i_679_));
							}
						} else
							anIntArray6071[i_722_] = anIntArray6071[i_722_];
					}
				} else if (i == 3) {
					int i_733_ = (i_679_ & 0xff) * 4;
					int i_734_ = (i_679_ >> 8 & 0xff) * 4;
					int i_735_ = (i_679_ >> 16 & 0xff) << 6;
					int i_736_ = (i_679_ >> 24 & 0xff) << 6;
					if (i_681_ - (i_733_ >> 1) < 0
							|| ((i_681_ + (i_733_ >> 1) + ((Class12) class12).anInt93) >= (((Class12) class12).anInt103 << ((Class12) class12).anInt97))
							|| i_683_ - (i_734_ >> 1) < 0
							|| ((i_683_ + (i_734_ >> 1) + ((Class12) class12).anInt93) >= (((Class12) class12).anInt98 << ((Class12) class12).anInt97)))
						return;
					this.method1322(i_735_, class12, i_681_, i_734_, i_736_,
							-3, i_683_, i_733_, i_682_);
				} else if (i == 4) {
					int i_737_ = ((Class12) class12_680_).anInt93 - 1;
					int i_738_ = aShort6030 - aShort6009;
					for (int i_739_ = 0; i_739_ < anInt6042; i_739_++) {
						int i_740_ = anIntArray6053[i_739_] + i_681_;
						int i_741_ = anIntArray6036[i_739_] + i_683_;
						int i_742_ = i_740_ & i_737_;
						int i_743_ = i_741_ & i_737_;
						int i_744_ = i_740_ >> ((Class12) class12_680_).anInt97;
						int i_745_ = i_741_ >> ((Class12) class12_680_).anInt97;
						int i_746_ = (((is_688_[i_744_][i_745_] * (((Class12) class12_680_).anInt93 - i_742_)) + is_688_[i_744_ + 1][i_745_]
								* i_742_) >> ((Class12) class12_680_).anInt97);
						int i_747_ = (((is_688_[i_744_][i_745_ + 1] * (((Class12) class12_680_).anInt93 - i_742_)) + is_688_[i_744_ + 1][i_745_ + 1]
								* i_742_) >> ((Class12) class12_680_).anInt97);
						int i_748_ = (i_746_
								* (((Class12) class12_680_).anInt93 - i_743_)
								+ i_747_ * i_743_ >> ((Class12) class12_680_).anInt97);
						anIntArray6071[i_739_] = (anIntArray6071[i_739_]
								+ (i_748_ - i_682_) + i_738_);
					}
					for (int i_749_ = anInt6042; i_749_ < anInt6010; i_749_++) {
						int i_750_ = anIntArray6053[i_749_] + i_681_;
						int i_751_ = anIntArray6036[i_749_] + i_683_;
						int i_752_ = i_750_ & i_737_;
						int i_753_ = i_751_ & i_737_;
						int i_754_ = i_750_ >> ((Class12) class12_680_).anInt97;
						int i_755_ = i_751_ >> ((Class12) class12_680_).anInt97;
						if (i_754_ >= 0
								&& i_754_ < ((Class12) class12_680_).anInt103 - 1
								&& i_755_ >= 0
								&& i_755_ < ((Class12) class12_680_).anInt98 - 1) {
							int i_756_ = (((is_688_[i_754_][i_755_] * (((Class12) class12_680_).anInt93 - i_752_)) + is_688_[i_754_ + 1][i_755_]
									* i_752_) >> ((Class12) class12_680_).anInt97);
							int i_757_ = (((is_688_[i_754_][i_755_ + 1] * (((Class12) class12_680_).anInt93 - i_752_)) + is_688_[i_754_ + 1][i_755_ + 1]
									* i_752_) >> ((Class12) class12_680_).anInt97);
							int i_758_ = (i_756_
									* (((Class12) class12_680_).anInt93 - i_753_)
									+ i_757_ * i_753_ >> ((Class12) class12_680_).anInt97);
							anIntArray6071[i_749_] = (anIntArray6071[i_749_]
									+ (i_758_ - i_682_) + i_738_);
						}
					}
				} else if (i == 5) {
					int i_759_ = ((Class12) class12_680_).anInt93 - 1;
					int i_760_ = aShort6030 - aShort6009;
					for (int i_761_ = 0; i_761_ < anInt6042; i_761_++) {
						int i_762_ = anIntArray6053[i_761_] + i_681_;
						int i_763_ = anIntArray6036[i_761_] + i_683_;
						int i_764_ = i_762_ & i_759_;
						int i_765_ = i_763_ & i_759_;
						int i_766_ = i_762_ >> ((Class12) class12).anInt97;
						int i_767_ = i_763_ >> ((Class12) class12).anInt97;
						int i_768_ = (((is[i_766_][i_767_] * (((Class12) class12).anInt93 - i_764_)) + is[i_766_ + 1][i_767_]
								* i_764_) >> ((Class12) class12).anInt97);
						int i_769_ = (((is[i_766_][i_767_ + 1] * (((Class12) class12).anInt93 - i_764_)) + is[i_766_ + 1][i_767_ + 1]
								* i_764_) >> ((Class12) class12).anInt97);
						int i_770_ = (i_768_
								* (((Class12) class12).anInt93 - i_765_)
								+ i_769_ * i_765_ >> ((Class12) class12).anInt97);
						i_768_ = (((is_688_[i_766_][i_767_] * (((Class12) class12_680_).anInt93 - i_764_)) + is_688_[i_766_ + 1][i_767_]
								* i_764_) >> ((Class12) class12_680_).anInt97);
						i_769_ = (((is_688_[i_766_][i_767_ + 1] * (((Class12) class12_680_).anInt93 - i_764_)) + is_688_[i_766_ + 1][i_767_ + 1]
								* i_764_) >> ((Class12) class12_680_).anInt97);
						int i_771_ = (i_768_
								* (((Class12) class12_680_).anInt93 - i_765_)
								+ i_769_ * i_765_ >> ((Class12) class12_680_).anInt97);
						int i_772_ = i_770_ - i_771_ - i_679_;
						anIntArray6071[i_761_] = ((anIntArray6071[i_761_] << 8)
								/ i_760_ * i_772_ >> 8)
								- (i_682_ - i_770_);
					}
					for (int i_773_ = anInt6042; i_773_ < anInt6010; i_773_++) {
						int i_774_ = anIntArray6053[i_773_] + i_681_;
						int i_775_ = anIntArray6036[i_773_] + i_683_;
						int i_776_ = i_774_ & i_759_;
						int i_777_ = i_775_ & i_759_;
						int i_778_ = i_774_ >> ((Class12) class12).anInt97;
						int i_779_ = i_775_ >> ((Class12) class12).anInt97;
						if (i_778_ >= 0
								&& i_778_ < ((Class12) class12).anInt103 - 1
								&& i_778_ < ((Class12) class12_680_).anInt103 - 1
								&& i_779_ >= 0
								&& i_779_ < ((Class12) class12).anInt98 - 1
								&& i_779_ < ((Class12) class12_680_).anInt98 - 1) {
							int i_780_ = (((is[i_778_][i_779_] * (((Class12) class12).anInt93 - i_776_)) + is[i_778_ + 1][i_779_]
									* i_776_) >> ((Class12) class12).anInt97);
							int i_781_ = (((is[i_778_][i_779_ + 1] * (((Class12) class12).anInt93 - i_776_)) + is[i_778_ + 1][i_779_ + 1]
									* i_776_) >> ((Class12) class12).anInt97);
							int i_782_ = (i_780_
									* (((Class12) class12).anInt93 - i_777_)
									+ i_781_ * i_777_ >> ((Class12) class12).anInt97);
							i_780_ = (((is_688_[i_778_][i_779_] * (((Class12) class12_680_).anInt93 - i_776_)) + is_688_[i_778_ + 1][i_779_]
									* i_776_) >> ((Class12) class12_680_).anInt97);
							i_781_ = (((is_688_[i_778_][i_779_ + 1] * (((Class12) class12_680_).anInt93 - i_776_)) + is_688_[i_778_ + 1][i_779_ + 1]
									* i_776_) >> ((Class12) class12_680_).anInt97);
							int i_783_ = (i_780_
									* (((Class12) class12_680_).anInt93 - i_777_)
									+ i_781_ * i_777_ >> ((Class12) class12_680_).anInt97);
							int i_784_ = i_782_ - i_783_ - i_679_;
							anIntArray6071[i_773_] = (((anIntArray6071[i_773_] << 8)
									/ i_760_ * i_784_) >> 8)
									- (i_682_ - i_782_);
						}
					}
				}
				aBool6041 = false;
			}
		}
	}

	final void method1326() {
		if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
			synchronized (this) {
				while (((Class206) this).aBool2765) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				((Class206) this).aBool2765 = true;
			}
		}
	}

	final int da() {
		return anInt6039;
	}

	final void s(int i) {
		if (((Class163_Sub1) aClass163_Sub1_6072).anInt5194 > 1) {
			synchronized (this) {
				if ((anInt6035 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method2580(true);
				anInt6035 = i;
			}
		} else {
			if ((anInt6035 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method2580(true);
			anInt6035 = i;
		}
	}

	final void v() {
		if ((anInt6035 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < anInt6010; i++)
				anIntArray6036[i] = -anIntArray6036[i];
			if (aClass145Array5997 != null) {
				for (int i = 0; i < anInt6042; i++) {
					if (aClass145Array5997[i] != null)
						((Class145) aClass145Array5997[i]).anInt1945 = -((Class145) aClass145Array5997[i]).anInt1945;
				}
			}
			if (aClass145Array5995 != null) {
				for (int i = 0; i < anInt6042; i++) {
					if (aClass145Array5995[i] != null)
						((Class145) aClass145Array5995[i]).anInt1945 = -((Class145) aClass145Array5995[i]).anInt1945;
				}
			}
			if (aClass162Array6006 != null) {
				for (int i = 0; i < anInt6034; i++) {
					if (aClass162Array6006[i] != null)
						((Class162) aClass162Array6006[i]).anInt2100 = -((Class162) aClass162Array6006[i]).anInt2100;
				}
			}
			short[] is = aShortArray6051;
			aShortArray6051 = aShortArray6002;
			aShortArray6002 = is;
			if (aFloatArrayArray6049 != null) {
				for (int i = 0; i < anInt6034; i++) {
					if (aFloatArrayArray6049[i] != null) {
						float f = aFloatArrayArray6049[i][0];
						aFloatArrayArray6049[i][0] = aFloatArrayArray6049[i][2];
						aFloatArrayArray6049[i][2] = f;
					}
					if (aFloatArrayArray6045[i] != null) {
						float f = aFloatArrayArray6045[i][0];
						aFloatArrayArray6045[i][0] = aFloatArrayArray6045[i][2];
						aFloatArrayArray6045[i][2] = f;
					}
				}
			}
			aBool6041 = false;
			anInt6058 = 0;
		}
	}

	Class206_Sub1(Class163_Sub1 class163_sub1) {
		aBool6015 = false;
		anInt6034 = 0;
		aBool6011 = false;
		anInt6042 = 0;
		aBool6060 = false;
		anInt6058 = 0;
		aBool6041 = false;
		anInt6010 = 0;
		aClass163_Sub1_6072 = class163_sub1;
	}

	Class206_Sub1(Class163_Sub1 class163_sub1, Class179 class179, int i,
			int i_785_, int i_786_, int i_787_) {
		aBool6015 = false;
		anInt6034 = 0;
		aBool6011 = false;
		anInt6042 = 0;
		aBool6060 = false;
		anInt6058 = 0;
		aBool6041 = false;
		anInt6010 = 0;
		aClass163_Sub1_6072 = class163_sub1;
		anInt6035 = i;
		anInt6046 = i_785_;
		anInt6039 = i_786_;
		Interface1 interface1 = ((Class163) aClass163_Sub1_6072).anInterface1_2118;
		anInt6010 = ((Class179) class179).anInt2278;
		anInt6042 = ((Class179) class179).anInt2311;
		anIntArray6053 = ((Class179) class179).anIntArray2288;
		anIntArray6071 = ((Class179) class179).anIntArray2322;
		anIntArray6036 = ((Class179) class179).anIntArray2269;
		anInt6034 = ((Class179) class179).anInt2318;
		aShortArray6051 = ((Class179) class179).aShortArray2297;
		aShortArray6000 = ((Class179) class179).aShortArray2287;
		aShortArray6002 = ((Class179) class179).aShortArray2282;
		aByteArray6022 = ((Class179) class179).aByteArray2305;
		aShortArray6033 = ((Class179) class179).aShortArray2298;
		aByteArray6025 = ((Class179) class179).aByteArray2294;
		aShortArray6040 = ((Class179) class179).aShortArray2276;
		aByteArray6012 = ((Class179) class179).aByteArray2289;
		aClass110Array6038 = ((Class179) class179).aClass110Array2299;
		aClass261Array6004 = ((Class179) class179).aClass261Array2270;
		aShortArray6031 = ((Class179) class179).aShortArray2272;
		int[] is = new int[anInt6034];
		for (int i_788_ = 0; i_788_ < anInt6034; i_788_++)
			is[i_788_] = i_788_;
		long[] ls = new long[anInt6034];
		boolean bool = (anInt6035 & 0x100) != 0;
		for (int i_789_ = 0; i_789_ < anInt6034; i_789_++) {
			int i_790_ = is[i_789_];
			Class188 class188 = null;
			int i_791_ = 0;
			int i_792_ = 0;
			int i_793_ = 0;
			int i_794_ = 0;
			if (((Class179) class179).aClass210Array2292 != null) {
				boolean bool_795_ = false;
				for (int i_796_ = 0; i_796_ < ((Class179) class179).aClass210Array2292.length; i_796_++) {
					Class210 class210 = ((Class179) class179).aClass210Array2292[i_796_];
					if (i_790_ == ((Class210) class210).anInt2847) {
						Class268 class268 = (Class11_Sub45_Sub20_Sub2
								.method3940(0, ((Class210) class210).anInt2849));
						if (((Class268) class268).aBool3638)
							bool_795_ = true;
						if (((Class268) class268).anInt3631 != -1) {
							Class188 class188_797_ = interface1.method7(
									(byte) 127,
									(((Class268) class268).anInt3631));
							if (((Class188) class188_797_).anInt2425 == 2)
								aBool6060 = true;
						}
					}
				}
				if (bool_795_)
					ls[i_789_] = 9223372036854775807L;
			}
			int i_798_ = -1;
			if (((Class179) class179).aShortArray2306 != null) {
				i_798_ = ((Class179) class179).aShortArray2306[i_790_];
				if (i_798_ != -1) {
					class188 = interface1.method7((byte) 127, i_798_ & 0xffff);
					if ((i_787_ & 0x40) == 0
							|| !((Class188) class188).aBool2416) {
						i_793_ = ((Class188) class188).aByte2426;
						i_794_ = ((Class188) class188).aByte2417;
					} else
						i_798_ = -1;
				}
			}
			boolean bool_799_ = (aByteArray6025 != null
					&& aByteArray6025[i_790_] != 0 || (class188 != null && ((Class188) class188).anInt2425 == 2));
			if ((bool || bool_799_) && aByteArray6022 != null)
				i_791_ += aByteArray6022[i_790_] << 17;
			if (bool_799_)
				i_791_ += 65536;
			i_791_ += (i_793_ & 0xff) << 8;
			i_791_ += i_794_ & 0xff;
			i_792_ += (i_798_ & 0xffff) << 16;
			i_792_ += i_789_ & 0xffff;
			ls[i_789_] = ((long) i_791_ << 32) + (long) i_792_;
			aBool6060 |= bool_799_;
		}
		Class376_Sub7_Sub4_Sub2.method3913(is, (byte) -122, ls);
		if (((Class179) class179).aClass210Array2292 != null) {
			anInt6076 = ((Class179) class179).aClass210Array2292.length;
			aClass325Array6028 = new Class325[anInt6076];
			aClass216Array6013 = new Class216[anInt6076];
			for (int i_800_ = 0; i_800_ < ((Class179) class179).aClass210Array2292.length; i_800_++) {
				Class210 class210 = ((Class179) class179).aClass210Array2292[i_800_];
				Class268 class268 = Class11_Sub45_Sub20_Sub2.method3940(0,
						((Class210) class210).anInt2849);
				int i_801_ = ((Class219_Sub1.anIntArray7248[(((Class179) class179).aShortArray2298[((Class210) class210).anInt2847]) & 0xffff]) & 0xffffff);
				i_801_ = (i_801_ | 255 - (((Class179) class179).aByteArray2294 != null ? (((Class179) class179).aByteArray2294[((Class210) class210).anInt2847]) & 0xff
						: 0) << 24);
				aClass325Array6028[i_800_] = new Class325(
						((Class210) class210).anInt2847,
						(((Class179) class179).aShortArray2297[((Class210) class210).anInt2847]),
						(((Class179) class179).aShortArray2287[((Class210) class210).anInt2847]),
						(((Class179) class179).aShortArray2282[((Class210) class210).anInt2847]),
						((Class268) class268).anInt3634,
						((Class268) class268).anInt3629,
						((Class268) class268).anInt3631,
						((Class268) class268).anInt3642,
						((Class268) class268).anInt3641,
						((Class268) class268).aBool3638,
						((Class210) class210).anInt2855);
				aClass216Array6013[i_800_] = new Class216(i_801_);
			}
		}
		aFloatArrayArray6049 = new float[anInt6034][];
		aFloatArrayArray6045 = new float[anInt6034][];
		Class54 class54 = Class26.method219(anInt6034, is, class179, 24582);
		Class363 class363 = aClass163_Sub1_6072.method2306(Thread
				.currentThread());
		float[] fs = ((Class363) class363).aFloatArray4764;
		boolean bool_802_ = false;
		for (int i_803_ = 0; i_803_ < anInt6034; i_803_++) {
			int i_804_ = is[i_803_];
			int i_805_;
			if (((Class179) class179).aByteArray2323 == null)
				i_805_ = -1;
			else
				i_805_ = ((Class179) class179).aByteArray2323[i_804_];
			int i_806_ = (((Class179) class179).aShortArray2306 == null ? (int) -1
					: ((Class179) class179).aShortArray2306[i_804_]);
			if (i_806_ != -1 && (i_787_ & 0x40) != 0) {
				Class188 class188 = interface1.method7((byte) 127,
						i_806_ & 0xffff);
				if (((Class188) class188).aBool2416)
					i_806_ = -1;
			}
			if (i_806_ != -1) {
				bool_802_ = true;
				float[] fs_807_ = aFloatArrayArray6049[i_804_] = new float[3];
				float[] fs_808_ = aFloatArrayArray6045[i_804_] = new float[3];
				boolean bool_809_ = false;
				if (i_805_ == -1) {
					fs_807_[0] = 0.0F;
					fs_808_[0] = 1.0F;
					fs_807_[1] = 1.0F;
					fs_808_[1] = 1.0F;
					fs_807_[2] = 0.0F;
					fs_808_[2] = 0.0F;
				} else {
					i_805_ &= 0xff;
					byte i_810_ = ((Class179) class179).aByteArray2290[i_805_];
					if (i_810_ == 0) {
						short i_811_ = aShortArray6051[i_804_];
						short i_812_ = aShortArray6000[i_804_];
						short i_813_ = aShortArray6002[i_804_];
						short i_814_ = ((Class179) class179).aShortArray2275[i_805_];
						short i_815_ = ((Class179) class179).aShortArray2273[i_805_];
						short i_816_ = ((Class179) class179).aShortArray2303[i_805_];
						float f = (float) anIntArray6053[i_814_];
						float f_817_ = (float) anIntArray6071[i_814_];
						float f_818_ = (float) anIntArray6036[i_814_];
						float f_819_ = (float) anIntArray6053[i_815_] - f;
						float f_820_ = (float) anIntArray6071[i_815_] - f_817_;
						float f_821_ = (float) anIntArray6036[i_815_] - f_818_;
						float f_822_ = (float) anIntArray6053[i_816_] - f;
						float f_823_ = (float) anIntArray6071[i_816_] - f_817_;
						float f_824_ = (float) anIntArray6036[i_816_] - f_818_;
						float f_825_ = (float) anIntArray6053[i_811_] - f;
						float f_826_ = (float) anIntArray6071[i_811_] - f_817_;
						float f_827_ = (float) anIntArray6036[i_811_] - f_818_;
						float f_828_ = (float) anIntArray6053[i_812_] - f;
						float f_829_ = (float) anIntArray6071[i_812_] - f_817_;
						float f_830_ = (float) anIntArray6036[i_812_] - f_818_;
						float f_831_ = (float) anIntArray6053[i_813_] - f;
						float f_832_ = (float) anIntArray6071[i_813_] - f_817_;
						float f_833_ = (float) anIntArray6036[i_813_] - f_818_;
						float f_834_ = f_820_ * f_824_ - f_821_ * f_823_;
						float f_835_ = f_821_ * f_822_ - f_819_ * f_824_;
						float f_836_ = f_819_ * f_823_ - f_820_ * f_822_;
						float f_837_ = f_823_ * f_836_ - f_824_ * f_835_;
						float f_838_ = f_824_ * f_834_ - f_822_ * f_836_;
						float f_839_ = f_822_ * f_835_ - f_823_ * f_834_;
						float f_840_ = 1.0F / (f_837_ * f_819_ + f_838_
								* f_820_ + f_839_ * f_821_);
						fs_807_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_
								* f_827_)
								* f_840_;
						fs_807_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_
								* f_830_)
								* f_840_;
						fs_807_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_
								* f_833_)
								* f_840_;
						f_837_ = f_820_ * f_836_ - f_821_ * f_835_;
						f_838_ = f_821_ * f_834_ - f_819_ * f_836_;
						f_839_ = f_819_ * f_835_ - f_820_ * f_834_;
						f_840_ = 1.0F / (f_837_ * f_822_ + f_838_ * f_823_ + f_839_
								* f_824_);
						fs_808_[0] = (f_837_ * f_825_ + f_838_ * f_826_ + f_839_
								* f_827_)
								* f_840_;
						fs_808_[1] = (f_837_ * f_828_ + f_838_ * f_829_ + f_839_
								* f_830_)
								* f_840_;
						fs_808_[2] = (f_837_ * f_831_ + f_838_ * f_832_ + f_839_
								* f_833_)
								* f_840_;
					} else {
						short i_841_ = aShortArray6051[i_804_];
						short i_842_ = aShortArray6000[i_804_];
						short i_843_ = aShortArray6002[i_804_];
						int i_844_ = ((Class54) class54).anIntArray820[i_805_];
						int i_845_ = ((Class54) class54).anIntArray826[i_805_];
						int i_846_ = ((Class54) class54).anIntArray828[i_805_];
						float[] fs_847_ = ((Class54) class54).aFloatArrayArray822[i_805_];
						byte i_848_ = ((Class179) class179).aByteArray2284[i_805_];
						float f = ((float) (((Class179) class179).anIntArray2312[i_805_]) / 256.0F);
						if (i_810_ == 1) {
							float f_849_ = ((float) (((Class179) class179).anIntArray2315[i_805_]) / 1024.0F);
							Class11_Sub45_Sub2.method3353((byte) -25, i_844_,
									f, i_845_, fs_847_, anIntArray6036[i_841_],
									anIntArray6053[i_841_], i_848_, fs, i_846_,
									anIntArray6071[i_841_], f_849_);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Class11_Sub45_Sub2.method3353((byte) -25, i_844_,
									f, i_845_, fs_847_, anIntArray6036[i_842_],
									anIntArray6053[i_842_], i_848_, fs, i_846_,
									anIntArray6071[i_842_], f_849_);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Class11_Sub45_Sub2.method3353((byte) -25, i_844_,
									f, i_845_, fs_847_, anIntArray6036[i_843_],
									anIntArray6053[i_843_], i_848_, fs, i_846_,
									anIntArray6071[i_843_], f_849_);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
							float f_850_ = f_849_ / 2.0F;
							if ((i_848_ & 0x1) == 0) {
								if (fs_807_[1] - fs_807_[0] > f_850_)
									fs_807_[1] -= f_849_;
								else if (fs_807_[0] - fs_807_[1] > f_850_)
									fs_807_[1] += f_849_;
								if (fs_807_[2] - fs_807_[0] > f_850_)
									fs_807_[2] -= f_849_;
								else if (fs_807_[0] - fs_807_[2] > f_850_)
									fs_807_[2] += f_849_;
							} else {
								if (fs_808_[1] - fs_808_[0] > f_850_)
									fs_808_[1] -= f_849_;
								else if (fs_808_[0] - fs_808_[1] > f_850_)
									fs_808_[1] += f_849_;
								if (fs_808_[2] - fs_808_[0] > f_850_)
									fs_808_[2] -= f_849_;
								else if (fs_808_[0] - fs_808_[2] > f_850_)
									fs_808_[2] += f_849_;
							}
						} else if (i_810_ == 2) {
							float f_851_ = ((float) (((Class179) class179).anIntArray2296[i_805_]) / 256.0F);
							float f_852_ = ((float) (((Class179) class179).anIntArray2313[i_805_]) / 256.0F);
							int i_853_ = (anIntArray6053[i_842_] - anIntArray6053[i_841_]);
							int i_854_ = (anIntArray6071[i_842_] - anIntArray6071[i_841_]);
							int i_855_ = (anIntArray6036[i_842_] - anIntArray6036[i_841_]);
							int i_856_ = (anIntArray6053[i_843_] - anIntArray6053[i_841_]);
							int i_857_ = (anIntArray6071[i_843_] - anIntArray6071[i_841_]);
							int i_858_ = (anIntArray6036[i_843_] - anIntArray6036[i_841_]);
							int i_859_ = i_854_ * i_858_ - i_857_ * i_855_;
							int i_860_ = i_855_ * i_856_ - i_858_ * i_853_;
							int i_861_ = i_853_ * i_857_ - i_856_ * i_854_;
							float f_862_ = 64.0F / (float) (((Class179) class179).anIntArray2280[i_805_]);
							float f_863_ = 64.0F / (float) (((Class179) class179).anIntArray2301[i_805_]);
							float f_864_ = 64.0F / (float) (((Class179) class179).anIntArray2315[i_805_]);
							float f_865_ = (((float) i_859_ * fs_847_[0]
									+ (float) i_860_ * fs_847_[1] + (float) i_861_
									* fs_847_[2]) / f_862_);
							float f_866_ = (((float) i_859_ * fs_847_[3]
									+ (float) i_860_ * fs_847_[4] + (float) i_861_
									* fs_847_[5]) / f_863_);
							float f_867_ = (((float) i_859_ * fs_847_[6]
									+ (float) i_860_ * fs_847_[7] + (float) i_861_
									* fs_847_[8]) / f_864_);
							int i_868_ = Class11_Sub20_Sub2.method3745(f_866_,
									f_865_, f_867_, (byte) 54);
							Class376_Sub6.method2820(i_868_, 76,
									anIntArray6071[i_841_], i_846_, i_848_,
									anIntArray6053[i_841_], fs,
									anIntArray6036[i_841_], f_852_, f_851_,
									fs_847_, i_844_, f, i_845_);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Class376_Sub6.method2820(i_868_, 93,
									anIntArray6071[i_842_], i_846_, i_848_,
									anIntArray6053[i_842_], fs,
									anIntArray6036[i_842_], f_852_, f_851_,
									fs_847_, i_844_, f, i_845_);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Class376_Sub6.method2820(i_868_, 92,
									anIntArray6071[i_843_], i_846_, i_848_,
									anIntArray6053[i_843_], fs,
									anIntArray6036[i_843_], f_852_, f_851_,
									fs_847_, i_844_, f, i_845_);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
						} else if (i_810_ == 3) {
							Canvas_Sub1.method3605(i_846_,
									anIntArray6053[i_841_],
									anIntArray6071[i_841_], fs_847_, i_844_,
									i_845_, i_848_, f, 7, fs,
									anIntArray6036[i_841_]);
							fs_807_[0] = fs[0];
							fs_808_[0] = fs[1];
							Canvas_Sub1.method3605(i_846_,
									anIntArray6053[i_842_],
									anIntArray6071[i_842_], fs_847_, i_844_,
									i_845_, i_848_, f, 7, fs,
									anIntArray6036[i_842_]);
							fs_807_[1] = fs[0];
							fs_808_[1] = fs[1];
							Canvas_Sub1.method3605(i_846_,
									anIntArray6053[i_843_],
									anIntArray6071[i_843_], fs_847_, i_844_,
									i_845_, i_848_, f, 7, fs,
									anIntArray6036[i_843_]);
							fs_807_[2] = fs[0];
							fs_808_[2] = fs[1];
							if ((i_848_ & 0x1) == 0) {
								if (fs_807_[1] - fs_807_[0] > 0.5F)
									fs_807_[1]--;
								else if (fs_807_[0] - fs_807_[1] > 0.5F)
									fs_807_[1]++;
								if (fs_807_[2] - fs_807_[0] > 0.5F)
									fs_807_[2]--;
								else if (fs_807_[0] - fs_807_[2] > 0.5F)
									fs_807_[2]++;
							} else {
								if (fs_808_[1] - fs_808_[0] > 0.5F)
									fs_808_[1]--;
								else if (fs_808_[0] - fs_808_[1] > 0.5F)
									fs_808_[1]++;
								if (fs_808_[2] - fs_808_[0] > 0.5F)
									fs_808_[2]--;
								else if (fs_808_[0] - fs_808_[2] > 0.5F)
									fs_808_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_802_)
			aFloatArrayArray6049 = aFloatArrayArray6045 = null;
		if (((Class179) class179).anIntArray2317 != null
				&& (anInt6035 & 0x20) != 0)
			anIntArrayArray6077 = class179.method1168(-6395, true);
		if (((Class179) class179).anIntArray2293 != null
				&& (anInt6035 & 0x180) != 0)
			anIntArrayArray6059 = class179.method1162((byte) -94);
		if (((Class179) class179).aClass210Array2292 != null
				&& (anInt6035 & 0x400) != 0)
			anIntArrayArray6032 = class179.method1175(-95);
		if (((Class179) class179).aShortArray2306 != null) {
			aShortArray6055 = new short[anInt6034];
			boolean bool_869_ = false;
			for (int i_870_ = 0; i_870_ < anInt6034; i_870_++) {
				short i_871_ = ((Class179) class179).aShortArray2306[i_870_];
				if (i_871_ != -1) {
					Class188 class188 = ((Class163) aClass163_Sub1_6072).anInterface1_2118
							.method7((byte) 127, i_871_);
					if ((i_787_ & 0x40) == 0
							|| !((Class188) class188).aBool2416) {
						aShortArray6055[i_870_] = i_871_;
						bool_869_ = true;
						if (((Class188) class188).anInt2425 == 2)
							aBool6060 = true;
						if (((Class188) class188).aByte2429 != 0
								|| ((Class188) class188).aByte2415 != 0)
							aBool6020 = true;
					} else
						aShortArray6055[i_870_] = (short) -1;
				} else
					aShortArray6055[i_870_] = (short) -1;
			}
			if (!bool_869_)
				aShortArray6055 = null;
		} else
			aShortArray6055 = null;
		if (aBool6060 || aClass325Array6028 != null) {
			aShortArray6029 = new short[anInt6034];
			for (int i_872_ = 0; i_872_ < anInt6034; i_872_++)
				aShortArray6029[i_872_] = (short) is[i_872_];
		}
	}

	static {
		anInt6007 = 0;
		anInt6017 = 4096;
	}
}
