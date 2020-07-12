/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class NPCDefinitions {
	Class318 aClass318_2901;
	private byte aByte2902;
	static int anInt2903;
	int anInt2904;
	static int anInt2905;
	static int anInt2906 = 0;
	static int anInt2907;
	int anInt2908;
	boolean aBool2909;
	int anInt2910;
	String[] aStringArray2911;
	private short[] aShortArray2912;
	private short[] aShortArray2913;
	private byte aByte2914;
	boolean aBool2915;
	int anInt2916;
	private short[] aShortArray2917;
	String aString2918;
	private int[] anIntArray2919;
	private int anInt2920;
	int anInt2921;
	int anInt2922;
	int anInt2923;
	int anInt2924;
	int[] anIntArray2925;
	byte aByte2926 = 0;
	int anInt2927;
	static int anInt2928;
	private int anInt2929;
	short aShort2930;
	byte aByte2931;
	int anInt2932;
	int anInt2933;
	int anInt2934;
	int anInt2935;
	boolean aBool2936;
	int anInt2937;
	int anInt2938;
	int anInt2939;
	private int anInt2940;
	int anInt2941;
	private int[][] anIntArrayArray2942;
	byte aByte2943;
	private byte aByte2944;
	short aShort2945;
	boolean aBool2946;
	boolean aBool2947;
	private Class213 aClass213_2948;
	static int anInt2949 = 0;
	int[] anIntArray2950;
	byte aByte2951;
	int anInt2952;
	int anInt2953;
	boolean aBool2954;
	static int anInt2955;
	private int anInt2956;
	static int anInt2957;
	static int anInt2958;
	int anInt2959;
	byte aByte2960;
	int anInt2961;
	private int anInt2962;
	static int anInt2963;
	int anInt2964;
	int anInt2965;
	static int anInt2966;
	private short[] aShortArray2967;
	int anInt2968;
	boolean aBool2969;
	boolean aBool2970;
	private byte[] aByteArray2971;
	static int anInt2972;
	private int[] anIntArray2973;
	static int anInt2974;
	int anInt2975;
	int anInt2976;
	static int anInt2977;
	private byte aByte2978;
	private int anInt2979;

	final String method1374(int i, int i_0_, String string) {
		try {
			anInt2905++;
			if (aClass213_2948 == null)
				return string;
			if (i != 41)
				return null;
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) aClass213_2948
					.method1369((byte) 26, (long) i_0_));
			if (class11_sub3 == null)
				return string;
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.D(" + i + ','
					+ i_0_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	final NPCDefinitions method1375(byte i, Interface20 interface20) {
		try {
			anInt2974++;
			int i_1_ = -1;
			if ((anInt2962 ^ 0xffffffff) == 0) {
				if (anInt2920 != -1)
					i_1_ = interface20.method50(-1, anInt2920);
			} else
				i_1_ = interface20.method51(anInt2962, 26951);
			if (i != 29)
				method1382(-45, null, 64, null, null, null, 21, 75, (byte) 90);
			if ((i_1_ ^ 0xffffffff) > -1
					|| ((-1 + ((NPCDefinitions) this).anIntArray2950.length ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))
					|| ((((NPCDefinitions) this).anIntArray2950[i_1_] ^ 0xffffffff) == 0)) {
				int i_2_ = (((NPCDefinitions) this).anIntArray2950[((NPCDefinitions) this).anIntArray2950.length - 1]);
				if ((i_2_ ^ 0xffffffff) != 0)
					return ((NPCDefinitions) this).aClass318_2901.getNPCDefinitions(i_2_,
							false);
				return null;
			}
			return (((NPCDefinitions) this).aClass318_2901.getNPCDefinitions(
					((NPCDefinitions) this).anIntArray2950[i_1_], false));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "km.C(" + i + ','
					+ (interface20 != null ? "{...}" : "null") + ')');
		}
	}

	final boolean method1376(int i) {
		try {
			anInt2977++;
			if (((NPCDefinitions) this).anIntArray2950 == null) {
				if ((((NPCDefinitions) this).anInt2938 ^ 0xffffffff) == 0
						&& ((NPCDefinitions) this).anInt2937 == -1
						&& (((NPCDefinitions) this).anInt2965 ^ 0xffffffff) == 0)
					return false;
				return true;
			}
			for (int i_3_ = 0; i_3_ < ((NPCDefinitions) this).anIntArray2950.length; i_3_++) {
				if (((NPCDefinitions) this).anIntArray2950[i_3_] != -1) {
					NPCDefinitions class215_4_ = (((NPCDefinitions) this).aClass318_2901
							.getNPCDefinitions(((NPCDefinitions) this).anIntArray2950[i_3_],
									false));
					if (((NPCDefinitions) class215_4_).anInt2938 != -1
							|| ((((NPCDefinitions) class215_4_).anInt2937 ^ 0xffffffff) != 0)
							|| ((NPCDefinitions) class215_4_).anInt2965 != -1)
						return true;
				}
			}
			if (i <= 79)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "km.K(" + i + ')');
		}
	}

	static final void method1377(boolean bool, boolean bool_5_,
			Class11_Sub24 class11_sub24, int i) {
		try {
			anInt2955++;
			int i_6_ = ((Class11_Sub24) class11_sub24).anInt6233;
			int i_7_ = (int) ((Class11) class11_sub24).aLong91;
			class11_sub24.method122(-36);
			if (bool_5_)
				Class11_Sub45_Sub19.method3822(0, i_6_);
			if (i < -28) {
				Class2_Sub9.method2944(-125, i_6_);
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -126, i_7_);
				if (class192 != null)
					Class232.method1484(class192, 1);
				Class344.method2082(-75);
				if (!bool && Class365.anInt4797 != -1)
					Class11_Sub12_Sub1.method3466(1, -82, Class365.anInt4797);
				Class313 class313 = new Class313(Class75_Sub2.aClass213_7160);
				for (Class11_Sub24 class11_sub24_8_ = (Class11_Sub24) class313
						.method1907(0); class11_sub24_8_ != null; class11_sub24_8_ = (Class11_Sub24) class313
						.method1905((byte) -83)) {
					if (!class11_sub24_8_.method124(0)) {
						class11_sub24_8_ = (Class11_Sub24) class313
								.method1907(0);
						if (class11_sub24_8_ == null)
							break;
					}
					if (((Class11_Sub24) class11_sub24_8_).anInt6236 == 3) {
						int i_9_ = (int) ((Class11) class11_sub24_8_).aLong91;
						if (i_6_ == i_9_ >>> 16)
							method1377(bool, true, class11_sub24_8_, -54);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("km.A(" + bool + ',' + bool_5_ + ','
							+ (class11_sub24 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method1378(Stream stream, int i) {
		try {
			anInt2907++;
			if (i > 100) {
				for (;;) {
					int i_10_ = stream.readUnsignedByte((byte) 35);
					if ((i_10_ ^ 0xffffffff) == -1)
						break;
					method1384(stream, 114, i_10_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "km.B("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1379(int i, int i_11_, int i_12_) {
		try {
			anInt2957++;
			if (aClass213_2948 == null)
				return i_11_;
			if (i_12_ != -15359)
				method1374(-27, -105, null);
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) aClass213_2948
					.method1369((byte) 26, (long) i));
			if (class11_sub51 == null)
				return i_11_;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.J(" + i + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	final void method1380(int i) {
		do {
			try {
				if (anIntArray2919 == null)
					anIntArray2919 = new int[0];
				int i_13_ = 0 % ((i - 20) / 54);
				anInt2928++;
				if (((NPCDefinitions) this).aByte2960 != -1)
					break;
				if (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass66_4219 == Class142.aClass66_1925)
					((NPCDefinitions) this).aByte2960 = (byte) 1;
				else
					((NPCDefinitions) this).aByte2960 = (byte) 0;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "km.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class206 method1381(int i, Class198 class198, int i_14_,
			Interface20 interface20, int i_15_, int i_16_,
			Class208[] class208s, Class163 class163, int i_17_, int i_18_,
			Class281 class281, boolean bool, int i_19_, Class281 class281_20_,
			Class127 class127, int[] is, int i_21_) {
		try {
			anInt2972++;
			if (((NPCDefinitions) this).anIntArray2950 != null) {
				NPCDefinitions class215_22_ = method1375((byte) 29, interface20);
				if (class215_22_ == null)
					return null;
				return class215_22_.method1381(i, class198, i_14_, interface20,
						i_15_, i_16_, class208s, class163, i_17_, i_18_,
						class281, true, i_19_, class281_20_, class127, is,
						i_21_);
			}
			int i_23_ = i_19_;
			if ((anInt2940 ^ 0xffffffff) != -129)
				i_23_ |= 0x2;
			if ((anInt2979 ^ 0xffffffff) != -129)
				i_23_ |= 0x5;
			boolean bool_24_ = class281 != null || class281_20_ != null;
			boolean bool_25_ = false;
			boolean bool_26_ = false;
			boolean bool_27_ = false;
			boolean bool_28_ = false;
			int i_29_ = class208s != null ? class208s.length : 0;
			for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (i_29_ ^ 0xffffffff); i_30_++) {
				Class79.aClass11_Sub45_Sub18Array1068[i_30_] = null;
				if (class208s[i_30_] != null) {
					Class281 class281_31_ = class198.method1284(
							(((Class208) class208s[i_30_]).anInt2807),
							(byte) 104);
					if (((Class281) class281_31_).anIntArray3794 != null) {
						Class11_Sub2_Sub12.aClass281Array8874[i_30_] = class281_31_;
						bool_24_ = true;
						int i_32_ = ((Class208) class208s[i_30_]).anInt2805;
						int i_33_ = ((Class208) class208s[i_30_]).anInt2803;
						int i_34_ = ((Class281) class281_31_).anIntArray3794[i_32_];
						Class79.aClass11_Sub45_Sub18Array1068[i_30_] = class198
								.method1280(-119, i_34_ >>> 16);
						i_34_ &= 0xffff;
						Class254_Sub3.anIntArray8043[i_30_] = i_34_;
						if (Class79.aClass11_Sub45_Sub18Array1068[i_30_] != null) {
							bool_26_ |= Class79.aClass11_Sub45_Sub18Array1068[i_30_]
									.method3760(false, i_34_);
							bool_25_ |= Class79.aClass11_Sub45_Sub18Array1068[i_30_]
									.method3759(125, i_34_);
							bool_28_ |= Class79.aClass11_Sub45_Sub18Array1068[i_30_]
									.method3755(i_34_, 1);
							bool_27_ |= ((Class281) class281_31_).aBool3820;
						}
						if ((((Class281) class281_31_).aBool3798 || Class11_Sub2_Sub11.aBool8858)
								&& (i_33_ ^ 0xffffffff) != 0
								&& ((i_33_ ^ 0xffffffff) > ((((Class281) class281_31_).anIntArray3794).length ^ 0xffffffff))) {
							Class65.anIntArray939[i_30_] = (((Class281) class281_31_).anIntArray3817[i_32_]);
							Class234_Sub1.anIntArray5645[i_30_] = ((Class208) class208s[i_30_]).anInt2810;
							int i_35_ = (((Class281) class281_31_).anIntArray3794[i_33_]);
							Class61.aClass11_Sub45_Sub18Array901[i_30_] = class198
									.method1280(-127, i_35_ >>> 16);
							i_35_ &= 0xffff;
							Class333.anIntArray4415[i_30_] = i_35_;
							if (Class61.aClass11_Sub45_Sub18Array901[i_30_] != null) {
								bool_26_ |= Class61.aClass11_Sub45_Sub18Array901[i_30_]
										.method3760(false, i_35_);
								bool_25_ |= Class61.aClass11_Sub45_Sub18Array901[i_30_]
										.method3759(123, i_35_);
								bool_28_ |= Class61.aClass11_Sub45_Sub18Array901[i_30_]
										.method3755(i_35_, 1);
							}
						} else {
							Class65.anIntArray939[i_30_] = 0;
							Class234_Sub1.anIntArray5645[i_30_] = 0;
							Class61.aClass11_Sub45_Sub18Array901[i_30_] = null;
							Class333.anIntArray4415[i_30_] = -1;
						}
					}
				}
			}
			int i_36_ = -1;
			int i_37_ = -1;
			int i_38_ = 0;
			Class11_Sub45_Sub18 class11_sub45_sub18 = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_39_ = null;
			int i_40_ = -1;
			int i_41_ = -1;
			int i_42_ = 0;
			Class11_Sub45_Sub18 class11_sub45_sub18_43_ = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_44_ = null;
			if (bool_24_) {
				if (class281 != null) {
					i_36_ = ((Class281) class281).anIntArray3794[i_21_];
					int i_45_ = i_36_ >>> 16;
					class11_sub45_sub18 = class198.method1280(-122, i_45_);
					i_36_ &= 0xffff;
					if (class11_sub45_sub18 != null) {
						bool_26_ |= class11_sub45_sub18
								.method3760(false, i_36_);
						bool_25_ |= class11_sub45_sub18.method3759(113, i_36_);
						bool_28_ |= class11_sub45_sub18.method3755(i_36_, 1);
						bool_27_ |= ((Class281) class281).aBool3820;
					}
					if ((((Class281) class281).aBool3798 || Class11_Sub2_Sub11.aBool8858)
							&& i_16_ != -1
							&& (((Class281) class281).anIntArray3794.length ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
						i_37_ = ((Class281) class281).anIntArray3794[i_16_];
						i_38_ = ((Class281) class281).anIntArray3817[i_21_];
						int i_46_ = i_37_ >>> 16;
						i_37_ &= 0xffff;
						if (i_45_ != i_46_)
							class11_sub45_sub18_39_ = class198.method1280(-107,
									i_46_);
						else
							class11_sub45_sub18_39_ = class11_sub45_sub18;
						if (class11_sub45_sub18_39_ != null) {
							bool_26_ = bool_26_
									| class11_sub45_sub18_39_.method3760(!bool,
											i_37_);
							bool_25_ |= class11_sub45_sub18_39_.method3759(115,
									i_37_);
							bool_28_ |= class11_sub45_sub18_39_.method3755(
									i_37_, 1);
						}
					}
				}
				i_23_ |= 0x20;
				if (class281_20_ != null) {
					i_40_ = ((Class281) class281_20_).anIntArray3794[i_14_];
					int i_47_ = i_40_ >>> 16;
					class11_sub45_sub18_43_ = class198.method1280(122, i_47_);
					i_40_ &= 0xffff;
					if (class11_sub45_sub18_43_ != null) {
						bool_26_ = bool_26_
								| class11_sub45_sub18_43_.method3760(!bool,
										i_40_);
						bool_25_ |= class11_sub45_sub18_43_.method3759(120,
								i_40_);
						bool_28_ |= class11_sub45_sub18_43_
								.method3755(i_40_, 1);
						bool_27_ |= ((Class281) class281_20_).aBool3820;
					}
					if ((((Class281) class281_20_).aBool3798 || Class11_Sub2_Sub11.aBool8858)
							&& (i_15_ ^ 0xffffffff) != 0
							&& (((Class281) class281_20_).anIntArray3794.length ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
						i_41_ = ((Class281) class281_20_).anIntArray3794[i_15_];
						i_42_ = ((Class281) class281_20_).anIntArray3817[i_14_];
						int i_48_ = i_41_ >>> 16;
						i_41_ &= 0xffff;
						if (i_48_ == i_47_)
							class11_sub45_sub18_44_ = class11_sub45_sub18_43_;
						else
							class11_sub45_sub18_44_ = class198.method1280(24,
									i_48_);
						if (class11_sub45_sub18_44_ != null) {
							bool_26_ |= class11_sub45_sub18_44_.method3760(
									false, i_41_);
							bool_25_ |= class11_sub45_sub18_44_.method3759(119,
									i_41_);
							bool_28_ |= class11_sub45_sub18_44_.method3755(
									i_41_, 1);
						}
					}
				}
				if (bool_26_)
					i_23_ |= 0x80;
				if (bool_25_)
					i_23_ |= 0x100;
				if (bool_27_)
					i_23_ |= 0x200;
				if (bool_28_)
					i_23_ |= 0x400;
			}
			long l = (long) (((Class163) class163).anInt2103 << 16 | ((NPCDefinitions) this).anInt2904);
			Class206 class206;
			synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4234) {
				class206 = (Class206) ((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4234
						.method188(l, (byte) 82);
			}
			Class39 class39 = null;
			if (((NPCDefinitions) this).anInt2921 != -1)
				class39 = class127.method829(((NPCDefinitions) this).anInt2921, 64);
			if (class206 == null || (class206.ua() & i_23_) != i_23_) {
				if (class206 != null)
					i_23_ |= class206.ua();
				int i_49_ = i_23_;
				boolean bool_50_ = false;
				synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222) {
					for (int i_51_ = 0; ((i_51_ ^ 0xffffffff) > (anIntArray2919.length ^ 0xffffffff)); i_51_++) {
						if (anIntArray2919[i_51_] != -1
								&& !(((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222
										.method927((byte) -105,
												anIntArray2919[i_51_], 0)))
							bool_50_ = true;
					}
				}
				if (bool_50_)
					return null;
				Class179[] class179s = new Class179[anIntArray2919.length];
				for (int i_52_ = 0; ((anIntArray2919.length ^ 0xffffffff) < (i_52_ ^ 0xffffffff)); i_52_++) {
					if (anIntArray2919[i_52_] != -1) {
						synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222) {
							class179s[i_52_] = Class11_Sub16
									.method2443(
											0,
											(((Class318) (((NPCDefinitions) this).aClass318_2901)).aClass146_4222),
											(anIntArray2919[i_52_]), 0);
						}
						if (class179s[i_52_] != null) {
							if ((((Class179) class179s[i_52_]).anInt2277 ^ 0xffffffff) > -14)
								class179s[i_52_].method1166(2, true);
							if (anIntArrayArray2942 != null
									&& anIntArrayArray2942[i_52_] != null)
								class179s[i_52_].method1163(
										anIntArrayArray2942[i_52_][1],
										(byte) 76,
										anIntArrayArray2942[i_52_][2],
										anIntArrayArray2942[i_52_][0]);
						}
					}
				}
				if (class39 != null
						&& ((Class39) class39).anIntArrayArray564 != null) {
					for (int i_53_ = 0; i_53_ < ((Class39) class39).anIntArrayArray564.length; i_53_++) {
						if ((class179s.length ^ 0xffffffff) < (i_53_ ^ 0xffffffff)
								&& class179s[i_53_] != null) {
							int i_54_ = 0;
							int i_55_ = 0;
							int i_56_ = 0;
							int i_57_ = 0;
							int i_58_ = 0;
							int i_59_ = 0;
							if (((Class39) class39).anIntArrayArray564[i_53_] != null) {
								i_55_ = (((Class39) class39).anIntArrayArray564[i_53_][1]);
								i_59_ = (((Class39) class39).anIntArrayArray564[i_53_][5]) << 3;
								i_56_ = (((Class39) class39).anIntArrayArray564[i_53_][2]);
								i_54_ = (((Class39) class39).anIntArrayArray564[i_53_][0]);
								i_57_ = (((Class39) class39).anIntArrayArray564[i_53_][3]) << 3;
								i_58_ = (((Class39) class39).anIntArrayArray564[i_53_][4]) << 3;
							}
							if ((i_57_ ^ 0xffffffff) != -1
									|| (i_58_ ^ 0xffffffff) != -1 || i_59_ != 0)
								class179s[i_53_].method1172(i_57_, i_59_, 0,
										i_58_);
							if ((i_54_ ^ 0xffffffff) != -1 || i_55_ != 0
									|| (i_56_ ^ 0xffffffff) != -1)
								class179s[i_53_].method1163(i_55_, (byte) 105,
										i_56_, i_54_);
						}
					}
				}
				Class179 class179;
				if (class179s.length == 1)
					class179 = class179s[0];
				else
					class179 = new Class179(class179s, class179s.length);
				if (aShortArray2913 != null)
					i_49_ |= 0x4000;
				if (aShortArray2967 != null)
					i_49_ |= 0x8000;
				if ((aByte2944 ^ 0xffffffff) != -1)
					i_49_ |= 0x80000;
				class206 = class163
						.method1020(
								class179,
								i_49_,
								(((Class318) ((NPCDefinitions) this).aClass318_2901).anInt4236),
								anInt2929 + 64, anInt2956 + 850);
				if (aShortArray2913 != null) {
					for (int i_60_ = 0; ((i_60_ ^ 0xffffffff) > (aShortArray2913.length ^ 0xffffffff)); i_60_++) {
						if (aByteArray2971 == null
								|| (i_60_ ^ 0xffffffff) <= (aByteArray2971.length ^ 0xffffffff))
							class206.ia(aShortArray2913[i_60_],
									aShortArray2917[i_60_]);
						else
							class206.ia(
									aShortArray2913[i_60_],
									(Class176.aShortArray2237[0xff & aByteArray2971[i_60_]]));
					}
				}
				if (aShortArray2967 != null) {
					for (int i_61_ = 0; i_61_ < aShortArray2967.length; i_61_++)
						class206.aa(aShortArray2967[i_61_],
								aShortArray2912[i_61_]);
				}
				if (aByte2944 != 0)
					class206.method1323(aByte2978, aByte2902, aByte2914,
							aByte2944 & 0xff);
				class206.s(i_23_);
				synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4234) {
					((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4234
							.method184(
									(byte) 127,
									class206,
									(long) (((Class163) class163).anInt2103 << 16 | ((NPCDefinitions) this).anInt2904));
				}
			}
			Class206 class206_62_ = class206.method1313((byte) 4, i_23_, bool);
			boolean bool_63_ = false;
			if (is != null) {
				for (int i_64_ = 0; i_64_ < 12; i_64_++) {
					if (is[i_64_] != -1)
						bool_63_ = true;
				}
			}
			if (!bool_24_ && !bool_63_)
				return class206_62_;
			Class33[] class33s = null;
			if (class39 != null)
				class33s = class39.method341(class163, -59);
			if (bool_63_ && class33s != null) {
				for (int i_65_ = 0; i_65_ < 12; i_65_++) {
					if (class33s[i_65_] != null)
						class206_62_.method1302(class33s[i_65_], 1 << i_65_,
								true);
				}
			}
			int i_66_ = 0;
			int i_67_ = 1;
			while (i_66_ < i_29_) {
				if (Class79.aClass11_Sub45_Sub18Array1068[i_66_] != null)
					class206_62_
							.method1327(
									Class333.anIntArray4415[i_66_],
									((Class281) (Class11_Sub2_Sub12.aClass281Array8874[i_66_])).aBool3820,
									Class254_Sub3.anIntArray8043[i_66_],
									i_67_,
									(byte) -95,
									Class79.aClass11_Sub45_Sub18Array1068[i_66_],
									0,
									Class65.anIntArray939[i_66_],
									-1 + Class234_Sub1.anIntArray5645[i_66_],
									Class61.aClass11_Sub45_Sub18Array901[i_66_],
									null);
				i_66_++;
				i_67_ <<= 1;
			}
			if (bool_63_) {
				for (int i_68_ = 0; (i_68_ ^ 0xffffffff) > -13; i_68_++) {
					if ((is[i_68_] ^ 0xffffffff) != 0) {
						int i_69_ = -i_17_ + is[i_68_];
						i_69_ &= 0x3fff;
						Class33 class33 = class163.method1041();
						class33.method298(i_69_);
						class206_62_.method1302(class33, 1 << i_68_, false);
					}
				}
			}
			if (bool_63_ && class33s != null) {
				for (int i_70_ = 0; (i_70_ ^ 0xffffffff) > -13; i_70_++) {
					if (class33s[i_70_] != null)
						class206_62_.method1302(class33s[i_70_], 1 << i_70_,
								false);
				}
			}
			if (class11_sub45_sub18 != null && class11_sub45_sub18_43_ != null)
				class206_62_
						.method1314(
								-1 + i_18_,
								i - 1,
								i_37_,
								i_40_,
								i_42_,
								((Class281) class281).aBoolArray3814,
								class11_sub45_sub18_39_,
								-115,
								i_38_,
								i_36_,
								class11_sub45_sub18_43_,
								i_41_,
								(((Class281) class281_20_).aBool3820 | ((Class281) class281).aBool3820),
								class11_sub45_sub18, class11_sub45_sub18_44_);
			else if (class11_sub45_sub18 == null) {
				if (class11_sub45_sub18_43_ != null)
					class206_62_.method1304(class11_sub45_sub18_43_,
							-1 + i_18_, i_40_, i_41_,
							(((Class281) class281_20_).aBool3820), 0, i_42_,
							class11_sub45_sub18_44_, 1000);
			} else
				class206_62_.method1304(class11_sub45_sub18, i - 1, i_36_,
						i_37_, ((Class281) class281).aBool3820, 0, i_38_,
						class11_sub45_sub18_39_, 1000);
			for (int i_71_ = 0; i_29_ > i_71_; i_71_++) {
				Class79.aClass11_Sub45_Sub18Array1068[i_71_] = null;
				Class61.aClass11_Sub45_Sub18Array901[i_71_] = null;
				Class11_Sub2_Sub12.aClass281Array8874[i_71_] = null;
			}
			if (anInt2979 != 128 || (anInt2940 ^ 0xffffffff) != -129)
				class206_62_.O(anInt2979, anInt2940, anInt2979);
			class206_62_.s(i_19_);
			return class206_62_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.L(" + i + ','
					+ (class198 != null ? "{...}" : "null") + ',' + i_14_ + ','
					+ (interface20 != null ? "{...}" : "null") + ',' + i_15_
					+ ',' + i_16_ + ','
					+ (class208s != null ? "{...}" : "null") + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_17_ + ','
					+ i_18_ + ',' + (class281 != null ? "{...}" : "null") + ','
					+ bool + ',' + i_19_ + ','
					+ (class281_20_ != null ? "{...}" : "null") + ','
					+ (class127 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i_21_ + ')'));
		}
	}

	final Class206 method1382(int i, Class281 class281, int i_72_,
			Class163 class163, Interface20 interface20, Class198 class198,
			int i_73_, int i_74_, byte i_75_) {
		try {
			anInt2903++;
			if (((NPCDefinitions) this).anIntArray2950 != null) {
				NPCDefinitions class215_76_ = method1375((byte) 29, interface20);
				if (class215_76_ == null)
					return null;
				return class215_76_.method1382(i, class281, i_72_, class163,
						interface20, class198, i_73_, i_74_, (byte) 85);
			}
			if (anIntArray2973 == null)
				return null;
			int i_77_ = i;
			if (class281 != null && (i_74_ ^ 0xffffffff) != 0)
				i_77_ |= class281.method1738(i_72_, 1024, true, i_74_);
			Class206 class206;
			synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4235) {
				class206 = ((Class206) (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4235
						.method188(
								(long) (((NPCDefinitions) this).anInt2904 | ((Class163) class163).anInt2103 << 16),
								(byte) -122)));
			}
			if (class206 == null
					|| (class206.ua() & i_77_ ^ 0xffffffff) != (i_77_ ^ 0xffffffff)) {
				if (class206 != null)
					i_77_ |= class206.ua();
				int i_78_ = i_77_;
				boolean bool = false;
				synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222) {
					for (int i_79_ = 0; i_79_ < anIntArray2973.length; i_79_++) {
						if (!((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222
								.method927((byte) -67, anIntArray2973[i_79_], 0))
							bool = true;
					}
				}
				if (bool)
					return null;
				Class179[] class179s = new Class179[anIntArray2973.length];
				synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass146_4222) {
					for (int i_80_ = 0; anIntArray2973.length > i_80_; i_80_++)
						class179s[i_80_] = Class11_Sub16
								.method2443(
										0,
										(((Class318) (((NPCDefinitions) this).aClass318_2901)).aClass146_4222),
										anIntArray2973[i_80_], 0);
				}
				for (int i_81_ = 0; i_81_ < anIntArray2973.length; i_81_++) {
					if (class179s[i_81_] != null
							&& (((Class179) class179s[i_81_]).anInt2277 ^ 0xffffffff) > -14)
						class179s[i_81_].method1166(2, true);
				}
				Class179 class179;
				if ((class179s.length ^ 0xffffffff) == -2)
					class179 = class179s[0];
				else
					class179 = new Class179(class179s, class179s.length);
				if (aShortArray2913 != null)
					i_78_ |= 0x4000;
				if (aShortArray2967 != null)
					i_78_ |= 0x8000;
				if (aByte2944 != 0)
					i_78_ |= 0x80000;
				class206 = class163
						.method1020(
								class179,
								i_78_,
								(((Class318) (((NPCDefinitions) this).aClass318_2901)).anInt4236),
								64, 768);
				if (aShortArray2913 != null) {
					for (int i_82_ = 0; ((aShortArray2913.length ^ 0xffffffff) < (i_82_ ^ 0xffffffff)); i_82_++) {
						if (aByteArray2971 == null
								|| ((aByteArray2971.length ^ 0xffffffff) >= (i_82_ ^ 0xffffffff)))
							class206.ia(aShortArray2913[i_82_],
									aShortArray2917[i_82_]);
						else
							class206.ia(
									aShortArray2913[i_82_],
									(Class176.aShortArray2237[aByteArray2971[i_82_] & 0xff]));
					}
				}
				if (aShortArray2967 != null) {
					for (int i_83_ = 0; i_83_ < aShortArray2967.length; i_83_++)
						class206.aa(aShortArray2967[i_83_],
								aShortArray2912[i_83_]);
				}
				if (aByte2944 != 0)
					class206.method1323(aByte2978, aByte2902, aByte2914,
							aByte2944 & 0xff);
				class206.s(i_77_);
				synchronized (((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4235) {
					((Class318) ((NPCDefinitions) this).aClass318_2901).aClass22_4235
							.method184(
									(byte) 127,
									class206,
									(long) (((Class163) class163).anInt2103 << 16 | ((NPCDefinitions) this).anInt2904));
				}
			}
			int i_84_ = -54 / ((i_75_ - 29) / 51);
			if (class281 != null && (i_74_ ^ 0xffffffff) != 0)
				class206 = class281.method1734(-1, class206, i_72_, i_77_,
						i_73_, i_74_);
			class206.s(i);
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.E(" + i + ','
					+ (class281 != null ? "{...}" : "null") + ',' + i_72_ + ','
					+ (class163 != null ? "{...}" : "null") + ','
					+ (interface20 != null ? "{...}" : "null") + ','
					+ (class198 != null ? "{...}" : "null") + ',' + i_73_ + ','
					+ i_74_ + ',' + i_75_ + ')'));
		}
	}

	final boolean method1383(int i, Interface20 interface20) {
		try {
			anInt2966++;
			if (((NPCDefinitions) this).anIntArray2950 == null)
				return true;
			if (i != 0)
				method1379(-33, -119, 99);
			int i_85_ = -1;
			if (anInt2962 != -1)
				i_85_ = interface20.method51(anInt2962, 26951);
			else if ((anInt2920 ^ 0xffffffff) != 0)
				i_85_ = interface20.method50(-1, anInt2920);
			if ((i_85_ ^ 0xffffffff) > -1
					|| -1 + ((NPCDefinitions) this).anIntArray2950.length <= i_85_
					|| ((((NPCDefinitions) this).anIntArray2950[i_85_] ^ 0xffffffff) == 0)) {
				int i_86_ = (((NPCDefinitions) this).anIntArray2950[-1
						+ ((NPCDefinitions) this).anIntArray2950.length]);
				if ((i_86_ ^ 0xffffffff) == 0)
					return false;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "km.F(" + i + ','
					+ (interface20 != null ? "{...}" : "null") + ')');
		}
	}

	private final void method1384(Stream stream, int i, int i_87_) {
		try {
			if (i < 62)
				((NPCDefinitions) this).aBool2909 = true;
			if ((i_87_ ^ 0xffffffff) == -2) {
				int i_88_ = stream.readUnsignedByte((byte) 35);
				anIntArray2919 = new int[i_88_];
				for (int i_89_ = 0; i_88_ > i_89_; i_89_++) {
					anIntArray2919[i_89_] = stream
							.readUnsignedShort((byte) -65);
					if (anIntArray2919[i_89_] == 65535)
						anIntArray2919[i_89_] = -1;
				}
			} else if (i_87_ == 2)
				((NPCDefinitions) this).aString2918 = stream.readString(-1);
			else if (i_87_ != 12) {
				if (i_87_ < 30 || (i_87_ ^ 0xffffffff) <= -36) {
					if ((i_87_ ^ 0xffffffff) == -41) {
						int i_90_ = stream.readUnsignedByte((byte) 35);
						aShortArray2917 = new short[i_90_];
						aShortArray2913 = new short[i_90_];
						for (int i_91_ = 0; (i_91_ ^ 0xffffffff) > (i_90_ ^ 0xffffffff); i_91_++) {
							aShortArray2913[i_91_] = (short) stream
									.readUnsignedShort((byte) -65);
							aShortArray2917[i_91_] = (short) stream
									.readUnsignedShort((byte) -65);
						}
					} else if (i_87_ == 41) {
						int i_92_ = stream.readUnsignedByte((byte) 35);
						aShortArray2912 = new short[i_92_];
						aShortArray2967 = new short[i_92_];
						for (int i_93_ = 0; (i_92_ ^ 0xffffffff) < (i_93_ ^ 0xffffffff); i_93_++) {
							aShortArray2967[i_93_] = (short) stream
									.readUnsignedShort((byte) -65);
							aShortArray2912[i_93_] = (short) stream
									.readUnsignedShort((byte) -65);
						}
					} else if ((i_87_ ^ 0xffffffff) != -43) {
						if (i_87_ == 60) {
							int i_94_ = stream.readUnsignedByte((byte) 35);
							anIntArray2973 = new int[i_94_];
							for (int i_95_ = 0; (i_94_ ^ 0xffffffff) < (i_95_ ^ 0xffffffff); i_95_++)
								anIntArray2973[i_95_] = stream
										.readUnsignedShort((byte) -65);
						} else if (i_87_ != 93) {
							if ((i_87_ ^ 0xffffffff) == -96)
								((NPCDefinitions) this).anInt2910 = stream
										.readUnsignedShort((byte) -65);
							else if ((i_87_ ^ 0xffffffff) == -98)
								anInt2979 = stream
										.readUnsignedShort((byte) -65);
							else if ((i_87_ ^ 0xffffffff) == -99)
								anInt2940 = stream
										.readUnsignedShort((byte) -65);
							else if ((i_87_ ^ 0xffffffff) == -100)
								((NPCDefinitions) this).aBool2946 = true;
							else if (i_87_ != 100) {
								if (i_87_ != 101) {
									if ((i_87_ ^ 0xffffffff) != -103) {
										if ((i_87_ ^ 0xffffffff) != -104) {
											if (i_87_ != 106
													&& ((i_87_ ^ 0xffffffff) != -119)) {
												if ((i_87_ ^ 0xffffffff) == -108)
													((NPCDefinitions) this).aBool2970 = false;
												else if (i_87_ == 109)
													((NPCDefinitions) this).aBool2969 = false;
												else if (i_87_ == 111)
													((NPCDefinitions) this).aBool2947 = false;
												else if (i_87_ != 113) {
													if (i_87_ == 114) {
														((NPCDefinitions) this).aByte2951 = (stream
																.readByte(1854307120));
														((NPCDefinitions) this).aByte2931 = (stream
																.readByte(1854307120));
													} else if ((i_87_ ^ 0xffffffff) == -120)
														((NPCDefinitions) this).aByte2926 = (stream
																.readByte(1854307120));
													else if ((i_87_ ^ 0xffffffff) != -122) {
														if ((i_87_ ^ 0xffffffff) != -123) {
															if ((i_87_ ^ 0xffffffff) != -124) {
																if (i_87_ != 125) {
																	if ((i_87_ ^ 0xffffffff) == -128)
																		((NPCDefinitions) this).anInt2921 = stream
																				.readUnsignedShort((byte) -65);
																	else if ((i_87_ ^ 0xffffffff) == -129)
																		stream.readUnsignedByte((byte) 35);
																	else if (i_87_ == 134) {
																		((NPCDefinitions) this).anInt2938 = stream
																				.readUnsignedShort((byte) -65);
																		if (((NPCDefinitions) this).anInt2938 == 65535)
																			((NPCDefinitions) this).anInt2938 = -1;
																		((NPCDefinitions) this).anInt2953 = stream
																				.readUnsignedShort((byte) -65);
																		if ((((NPCDefinitions) this).anInt2953 ^ 0xffffffff) == -65536)
																			((NPCDefinitions) this).anInt2953 = -1;
																		((NPCDefinitions) this).anInt2937 = stream
																				.readUnsignedShort((byte) -65);
																		if ((((NPCDefinitions) this).anInt2937 ^ 0xffffffff) == -65536)
																			((NPCDefinitions) this).anInt2937 = -1;
																		((NPCDefinitions) this).anInt2965 = stream
																				.readUnsignedShort((byte) -65);
																		if ((((NPCDefinitions) this).anInt2965 ^ 0xffffffff) == -65536)
																			((NPCDefinitions) this).anInt2965 = -1;
																		((NPCDefinitions) this).anInt2923 = stream
																				.readUnsignedByte((byte) 35);
																	} else if ((i_87_ ^ 0xffffffff) != -136) {
																		if (i_87_ == 136) {
																			((NPCDefinitions) this).anInt2941 = stream
																					.readUnsignedByte((byte) 35);
																			((NPCDefinitions) this).anInt2939 = stream
																					.readUnsignedShort((byte) -65);
																		} else if ((i_87_ ^ 0xffffffff) != -138) {
																			if ((i_87_ ^ 0xffffffff) != -139) {
																				if (i_87_ != 139) {
																					if (i_87_ != 140) {
																						if ((i_87_ ^ 0xffffffff) == -142)
																							((NPCDefinitions) this).aBool2909 = true;
																						else if ((i_87_ ^ 0xffffffff) != -143) {
																							if (i_87_ == 143)
																								((NPCDefinitions) this).aBool2954 = true;
																							else if (i_87_ >= 150
																									&& (i_87_ ^ 0xffffffff) > -156) {
																								((NPCDefinitions) this).aStringArray2911[-150
																										+ i_87_] = stream
																										.readString(-1);
																								if (!((Class318) ((NPCDefinitions) this).aClass318_2901).aBool4215)
																									((NPCDefinitions) this).aStringArray2911[-150
																											+ i_87_] = null;
																							} else if ((i_87_ ^ 0xffffffff) != -156) {
																								if ((i_87_ ^ 0xffffffff) == -159)
																									((NPCDefinitions) this).aByte2960 = (byte) 1;
																								else if (i_87_ == 159)
																									((NPCDefinitions) this).aByte2960 = (byte) 0;
																								else if ((i_87_ ^ 0xffffffff) == -161) {
																									int i_96_ = stream
																											.readUnsignedByte((byte) 35);
																									((NPCDefinitions) this).anIntArray2925 = new int[i_96_];
																									for (int i_97_ = 0; (i_96_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++)
																										((NPCDefinitions) this).anIntArray2925[i_97_] = stream
																												.readUnsignedShort((byte) -65);
																								} else if ((i_87_ ^ 0xffffffff) == -163)
																									((NPCDefinitions) this).aBool2936 = true;
																								else if ((i_87_ ^ 0xffffffff) == -164)
																									((NPCDefinitions) this).anInt2908 = stream
																											.readUnsignedByte((byte) 35);
																								else if (i_87_ != 164) {
																									if (i_87_ != 165) {
																										if ((i_87_ ^ 0xffffffff) == -250) {
																											int i_98_ = stream
																													.readUnsignedByte((byte) 35);
																											if (aClass213_2948 == null) {
																												int i_99_ = Class11_Sub2_Sub33
																														.method3808(
																																110,
																																i_98_);
																												aClass213_2948 = new Class213(
																														i_99_);
																											}
																											for (int i_100_ = 0; i_100_ < i_98_; i_100_++) {
																												boolean bool = (stream
																														.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
																												int i_101_ = stream
																														.method2558(false);
																												Class11 class11;
																												if (bool)
																													class11 = new Class11_Sub3(
																															stream.readString(-1));
																												else
																													class11 = new Class11_Sub51(
																															stream.readInt(119));
																												aClass213_2948
																														.method1368(
																																(long) i_101_,
																																class11,
																																(byte) -26);
																											}
																										}
																									} else
																										((NPCDefinitions) this).anInt2924 = stream
																												.readUnsignedByte((byte) 35);
																								} else {
																									((NPCDefinitions) this).anInt2927 = stream
																											.readUnsignedShort((byte) -65);
																									((NPCDefinitions) this).anInt2935 = stream
																											.readUnsignedShort((byte) -65);
																								}
																							} else {
																								aByte2978 = stream
																										.readByte(1854307120);
																								aByte2902 = stream
																										.readByte(1854307120);
																								aByte2914 = stream
																										.readByte(1854307120);
																								aByte2944 = stream
																										.readByte(1854307120);
																							}
																						} else
																							((NPCDefinitions) this).anInt2964 = stream
																									.readUnsignedShort((byte) -65);
																					} else
																						((NPCDefinitions) this).anInt2934 = stream
																								.readUnsignedByte((byte) 35);
																				} else
																					((NPCDefinitions) this).anInt2933 = stream
																							.readUnsignedShort((byte) -65);
																			} else
																				((NPCDefinitions) this).anInt2968 = stream
																						.readUnsignedShort((byte) -65);
																		} else
																			((NPCDefinitions) this).anInt2961 = stream
																					.readUnsignedShort((byte) -65);
																	} else {
																		((NPCDefinitions) this).anInt2952 = stream
																				.readUnsignedByte((byte) 35);
																		((NPCDefinitions) this).anInt2916 = stream
																				.readUnsignedShort((byte) -65);
																	}
																} else
																	((NPCDefinitions) this).aByte2943 = (stream
																			.readByte(1854307120));
															} else
																((NPCDefinitions) this).anInt2922 = (stream
																		.readUnsignedShort((byte) -65));
														} else
															((NPCDefinitions) this).anInt2976 = (stream
																	.readUnsignedShort((byte) -65));
													} else {
														anIntArrayArray2942 = (new int[anIntArray2919.length][]);
														int i_102_ = (stream
																.readUnsignedByte((byte) 35));
														for (int i_103_ = 0; i_102_ > i_103_; i_103_++) {
															int i_104_ = (stream
																	.readUnsignedByte((byte) 35));
															int[] is = (anIntArrayArray2942[i_104_] = (new int[3]));
															is[0] = (stream
																	.readByte(1854307120));
															is[1] = (stream
																	.readByte(1854307120));
															is[2] = (stream
																	.readByte(1854307120));
														}
													}
												} else {
													((NPCDefinitions) this).aShort2930 = (short) (stream
															.readUnsignedShort((byte) -65));
													((NPCDefinitions) this).aShort2945 = (short) (stream
															.readUnsignedShort((byte) -65));
												}
											} else {
												anInt2962 = (stream
														.readUnsignedShort((byte) -65));
												if (anInt2962 == 65535)
													anInt2962 = -1;
												anInt2920 = (stream
														.readUnsignedShort((byte) -65));
												if (anInt2920 == 65535)
													anInt2920 = -1;
												int i_105_ = -1;
												if ((i_87_ ^ 0xffffffff) == -119) {
													i_105_ = (stream
															.readUnsignedShort((byte) -65));
													if (i_105_ == 65535)
														i_105_ = -1;
												}
												int i_106_ = (stream
														.readUnsignedByte((byte) 35));
												((NPCDefinitions) this).anIntArray2950 = new int[i_106_ + 2];
												for (int i_107_ = 0; i_107_ <= i_106_; i_107_++) {
													((NPCDefinitions) this).anIntArray2950[i_107_] = (stream
															.readUnsignedShort((byte) -65));
													if (((((NPCDefinitions) this).anIntArray2950[i_107_]) ^ 0xffffffff) == -65536)
														((NPCDefinitions) this).anIntArray2950[i_107_] = -1;
												}
												((NPCDefinitions) this).anIntArray2950[1 + i_106_] = i_105_;
											}
										} else
											((NPCDefinitions) this).anInt2959 = stream
													.readUnsignedShort((byte) -65);
									} else
										((NPCDefinitions) this).anInt2932 = stream
												.readUnsignedShort((byte) -65);
								} else
									anInt2956 = 5 * stream.readByte(1854307120);
							} else
								anInt2929 = stream.readByte(1854307120);
						} else
							((NPCDefinitions) this).aBool2915 = false;
					} else {
						int i_108_ = stream.readUnsignedByte((byte) 35);
						aByteArray2971 = new byte[i_108_];
						for (int i_109_ = 0; (i_108_ ^ 0xffffffff) < (i_109_ ^ 0xffffffff); i_109_++)
							aByteArray2971[i_109_] = stream
									.readByte(1854307120);
					}
				} else
					((NPCDefinitions) this).aStringArray2911[i_87_ - 30] = stream
							.readString(-1);
			} else
				((NPCDefinitions) this).anInt2975 = stream
						.readUnsignedByte((byte) 35);
			anInt2958++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.G("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_87_ + ')'));
		}
	}

	static final Class163 method1385(Class146 class146, Interface1 interface1,
			int i, Canvas canvas, int i_110_, byte i_111_) {
		try {
			anInt2963++;
			int i_112_ = 0;
			if (i_111_ >= -21)
				method1377(false, true, null, -114);
			int i_113_ = 0;
			if (canvas != null) {
				Dimension dimension = canvas.getSize();
				i_113_ = dimension.height;
				i_112_ = dimension.width;
			}
			return Class163.method1082(-1346, class146, i_112_, canvas, i,
					i_110_, interface1, i_113_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("km.I("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (interface1 != null ? "{...}" : "null") + ',' + i + ','
					+ (canvas != null ? "{...}" : "null") + ',' + i_110_ + ','
					+ i_111_ + ')'));
		}
	}

	public NPCDefinitions() {
		anInt2920 = -1;
		((NPCDefinitions) this).aString2918 = "null";
		((NPCDefinitions) this).aStringArray2911 = new String[5];
		((NPCDefinitions) this).aByte2931 = (byte) -16;
		((NPCDefinitions) this).anInt2939 = -1;
		((NPCDefinitions) this).anInt2922 = -1;
		((NPCDefinitions) this).anInt2910 = -1;
		((NPCDefinitions) this).anInt2941 = -1;
		anInt2929 = 0;
		((NPCDefinitions) this).aBool2947 = true;
		((NPCDefinitions) this).aBool2915 = true;
		((NPCDefinitions) this).aByte2943 = (byte) 4;
		((NPCDefinitions) this).aBool2909 = false;
		((NPCDefinitions) this).anInt2934 = 255;
		((NPCDefinitions) this).anInt2937 = -1;
		((NPCDefinitions) this).aBool2946 = false;
		((NPCDefinitions) this).anInt2921 = -1;
		((NPCDefinitions) this).aByte2951 = (byte) -96;
		((NPCDefinitions) this).anInt2933 = -1;
		((NPCDefinitions) this).anInt2927 = 256;
		((NPCDefinitions) this).anInt2935 = 256;
		((NPCDefinitions) this).anInt2938 = -1;
		aByte2944 = (byte) 0;
		((NPCDefinitions) this).aShort2930 = (short) 0;
		((NPCDefinitions) this).anInt2959 = 32;
		anInt2940 = 128;
		((NPCDefinitions) this).anInt2953 = -1;
		anInt2956 = 0;
		((NPCDefinitions) this).anInt2923 = 0;
		((NPCDefinitions) this).anInt2964 = -1;
		((NPCDefinitions) this).anInt2968 = -1;
		((NPCDefinitions) this).anInt2924 = 0;
		((NPCDefinitions) this).anInt2961 = -1;
		((NPCDefinitions) this).aByte2960 = (byte) -1;
		((NPCDefinitions) this).anInt2952 = -1;
		((NPCDefinitions) this).anInt2908 = -1;
		anInt2962 = -1;
		((NPCDefinitions) this).aBool2970 = true;
		((NPCDefinitions) this).anInt2932 = -1;
		((NPCDefinitions) this).aBool2969 = true;
		((NPCDefinitions) this).anInt2975 = 1;
		((NPCDefinitions) this).anInt2916 = -1;
		((NPCDefinitions) this).anInt2965 = -1;
		((NPCDefinitions) this).aShort2945 = (short) 0;
		((NPCDefinitions) this).anInt2976 = -1;
		((NPCDefinitions) this).aBool2954 = false;
		anInt2979 = 128;
	}
}
