/* Class11_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub26 extends Class11 {
	static int anInt6292;
	boolean aBool6293;
	static int anInt6294;
	static float[] aFloatArray6295;
	static Class97 aClass97_6296;
	int anInt6297;
	static int anInt6298;
	static int anInt6299;
	static int anInt6300;
	static int anInt6301 = 0;
	int anInt6302;
	static int anInt6303;
	boolean aBool6304;
	Class28_Sub1 aClass28_Sub1_6305;
	boolean aBool6306;
	boolean aBool6307;

	public static void method2668(byte i) {
		try {
			int i_0_ = 23 % ((6 - i) / 56);
			aClass97_6296 = null;
			aFloatArray6295 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hk.A(" + i + ')');
		}
	}

	static final void method2669(int i, String string, boolean bool, int i_1_,
			boolean bool_2_, boolean bool_3_, String string_4_) {
		try {
			anInt6300++;
			((Class146) Class47.aClass146_744).anInt1987 = 1;
			string_4_ = string_4_.toLowerCase();
			short[] is = new short[16];
			int i_5_ = -1;
			String string_6_ = null;
			if (i != -1) {
				Class283 class283 = Class187.aClass52_2388.method432(i,
						(byte) -85);
				if (class283 == null || class283.method1745(0) != bool)
					return;
				if (class283.method1745(0))
					string_6_ = ((Class283) class283).aString3833;
				else
					i_5_ = ((Class283) class283).anInt3827;
			}
			int i_7_ = 0;
			for (int i_8_ = 0; (i_8_ < ((Class223) Packet.aClass223_8723).anInt3062); i_8_++) {
				Class249 class249 = Packet.aClass223_8723.method1430(i_8_,
						false);
				if ((!bool_2_ || ((Class249) class249).aBool3397)
						&& (((Class249) class249).anInt3389 ^ 0xffffffff) == 0
						&& (((Class249) class249).anInt3407 ^ 0xffffffff) == 0
						&& (((Class249) class249).anInt3400 ^ 0xffffffff) == -1
						&& (((Class249) class249).aString3359.toLowerCase()
								.indexOf(string_4_) ^ 0xffffffff) != 0) {
					if ((i ^ 0xffffffff) != 0) {
						if (!bool) {
							if (class249.method1593(i_5_, i, 45) != i_1_)
								continue;
						} else if (!string.equals(class249.method1589(i,
								(byte) 46, string_6_)))
							continue;
					}
					if (i_7_ >= 250) {
						Class10.anInt81 = -1;
						Class177.aShortArray2249 = null;
						return;
					}
					if ((is.length ^ 0xffffffff) >= (i_7_ ^ 0xffffffff)) {
						short[] is_9_ = new short[2 * is.length];
						for (int i_10_ = 0; (i_7_ ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++)
							is_9_[i_10_] = is[i_10_];
						is = is_9_;
					}
					is[i_7_++] = (short) i_8_;
				}
			}
			Class177.aShortArray2249 = is;
			Class299.anInt4041 = 0;
			Class10.anInt81 = i_7_;
			if (bool_3_ == true) {
				String[] strings = new String[Class10.anInt81];
				for (int i_11_ = 0; Class10.anInt81 > i_11_; i_11_++)
					strings[i_11_] = (((Class249) Packet.aClass223_8723
							.method1430(is[i_11_], !bool_3_)).aString3359);
				Class352.method2108(strings, Class177.aShortArray2249,
						(byte) 91);
				Class47.aClass146_744.method911(-123);
				((Class146) Class47.aClass146_744).anInt1987 = 2;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hk.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ i_1_ + ',' + bool_2_ + ',' + bool_3_ + ','
					+ (string_4_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2670(int i, int i_12_, int i_13_, int i_14_,
			int i_15_, int i_16_, int i_17_, int i_18_, Class118 class118,
			int i_19_, Class150 class150, int i_20_) {
		try {
			Class58_Sub1_Sub2.anInt9490 = i_20_;
			Class135.aClass80_1867 = null;
			Class70.aClass118_986 = class118;
			Class199.anInt2688 = i_15_;
			Class376_Sub7_Sub2_Sub2.anInt10242 = i_12_;
			Class233.aClass80_3189 = null;
			anInt6292++;
			Class280.anInt3790 = i_18_;
			OutputStream_Sub1.anInt5846 = i_19_;
			if (i_13_ != -1870)
				method2670(-51, -78, 0, 36, 104, -8, 103, -69, null, -80, null,
						75);
			Class304.anInt4093 = i;
			Class91_Sub2.aClass150_7699 = class150;
			Class219_Sub1.anInt7240 = i_16_;
			Class11_Sub6_Sub5.anInt9606 = i_17_;
			Class108_Sub16.aClass80_6542 = null;
			Class376_Sub7_Sub1_Sub1.anInt10095 = i_14_;
			Class108.method722(402);
			Class91_Sub1.aBool6935 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("hk.B(" + i + ',' + i_12_ + ',' + i_13_ + ',' + i_14_
							+ ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
							+ i_18_ + ','
							+ (class118 != null ? "{...}" : "null") + ','
							+ i_19_ + ','
							+ (class150 != null ? "{...}" : "null") + ','
							+ i_20_ + ')'));
		}
	}

	static final boolean method2671(String string, byte i) {
		try {
			anInt6299++;
			if (string == null)
				return false;
			for (int i_21_ = 0; i_21_ < Class231.anInt3168; i_21_++) {
				if (string
						.equalsIgnoreCase(Class335_Sub3_Sub1.aStringArray9416[i_21_]))
					return true;
				if (string
						.equalsIgnoreCase(Class11_Sub2_Sub21.aStringArray9195[i_21_]))
					return true;
			}
			int i_22_ = -35 % ((i - 19) / 60);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hk.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class11_Sub26(int i, Class28_Sub1 class28_sub1, int i_23_, boolean bool) {
		try {
			((Class11_Sub26) this).aClass28_Sub1_6305 = class28_sub1;
			((Class11_Sub26) this).anInt6297 = i;
			((Class11_Sub26) this).anInt6302 = i_23_;
			((Class11_Sub26) this).aBool6306 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hk.<init>(" + i + ','
					+ (class28_sub1 != null ? "{...}" : "null") + ',' + i_23_
					+ ',' + bool + ')'));
		}
	}

	static {
		anInt6294 = 0;
		anInt6298 = 0;
		aFloatArray6295 = new float[4];
	}
}
