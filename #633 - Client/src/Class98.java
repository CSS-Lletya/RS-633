/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class98 {
	static int anInt1305;
	int anInt1306;
	static int anInt1307;
	static Class107 aClass107_1308;
	static int anInt1309;
	static int anInt1310;
	static int anInt1311;

	static final int method660(String string, int i) {
		try {
			if (i != 0)
				method661(null, true);
			anInt1307++;
			return string.length() + 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bda.F("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class98(int i) {
		try {
			((Class98) this).anInt1306 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "bda.<init>(" + i + ')');
		}
	}

	static final boolean method661(Class376_Sub7_Sub5 class376_sub7_sub5,
			boolean bool) {
		boolean bool_0_ = (Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729);
		int i = 0;
		short i_1_ = 0;
		byte i_2_ = 0;
		class376_sub7_sub5.method3797(true);
		if (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 < 0
				|| ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629 < 0
				|| (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624 >= Class138.anInt1886)
				|| (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620 >= Class82.anInt1133))
			return false;
		short i_3_ = 0;
		for (int i_4_ = ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626; i_4_ <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624; i_4_++) {
			for (int i_5_ = ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629; i_5_ <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620; i_5_++) {
				Class364 class364 = Class221.method1414(
						(((Class376_Sub7) class376_sub7_sub5).aByte7047), i_4_,
						i_5_);
				if (class364 != null) {
					Class140 class140 = Class6
							.method90(-78, class376_sub7_sub5);
					Class140 class140_6_ = ((Class364) class364).aClass140_4781;
					if (class140_6_ == null)
						((Class364) class364).aClass140_4781 = class140;
					else {
						for (/**/; ((Class140) class140_6_).aClass140_1895 != null; class140_6_ = ((Class140) class140_6_).aClass140_1895) {
							/* empty */
						}
						((Class140) class140_6_).aClass140_1895 = class140;
					}
					if (bool_0_
							&& (Class108_Sub26.anIntArrayArray7831[i_4_][i_5_] & ~0xffffff) != 0) {
						i = Class108_Sub26.anIntArrayArray7831[i_4_][i_5_];
						i_1_ = (Class11_Sub50_Sub2.aShortArrayArray9079[i_4_][i_5_]);
						i_2_ = Class11_Sub39.aByteArrayArray7200[i_4_][i_5_];
					}
					if (!bool
							&& (((Class364) class364).aClass376_Sub7_Sub2_4777 != null)
							&& (((Class376_Sub7_Sub2) ((Class364) class364).aClass376_Sub7_Sub2_4777).aShort9237) > i_3_)
						i_3_ = (((Class376_Sub7_Sub2) ((Class364) class364).aClass376_Sub7_Sub2_4777).aShort9237);
				}
			}
		}
		if (bool_0_ && (i & ~0xffffff) != 0) {
			for (int i_7_ = ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626; i_7_ <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624; i_7_++) {
				for (int i_8_ = (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629); (i_8_ <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620); i_8_++) {
					if ((Class108_Sub26.anIntArrayArray7831[i_7_][i_8_] & ~0xffffff) == 0) {
						Class108_Sub26.anIntArrayArray7831[i_7_][i_8_] = i;
						Class11_Sub50_Sub2.aShortArrayArray9079[i_7_][i_8_] = i_1_;
						Class11_Sub39.aByteArrayArray7200[i_7_][i_8_] = i_2_;
					}
				}
			}
		}
		if (bool)
			Class286.aClass376_Sub7_Sub5Array3869[Class174.anInt2226++] = class376_sub7_sub5;
		else {
			int i_9_ = ((Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729) ? 1
					: 0);
			if (class376_sub7_sub5.method2863(-113)) {
				if (class376_sub7_sub5.method2870(false)) {
					((Class376_Sub7) class376_sub7_sub5).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_9_];
					Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_9_] = class376_sub7_sub5;
				} else {
					((Class376_Sub7) class376_sub7_sub5).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_9_];
					Class382.aClass376_Sub7Array4971[i_9_] = class376_sub7_sub5;
					Class333.aBool4411 = true;
				}
			} else {
				((Class376_Sub7) class376_sub7_sub5).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_9_];
				Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_9_] = class376_sub7_sub5;
			}
		}
		if (bool)
			((Class376_Sub7) class376_sub7_sub5).anInt7036 -= i_3_;
		return true;
	}

	static final int method662(int i) {
		int i_10_ = -1;
		for (int i_11_ = 0; i_11_ < Class205.anInt2763 - 1; i_11_++) {
			if (i < (Class11_Sub45_Sub1_Sub2.anIntArray9878[i_11_] + Class2_Sub8.anIntArray6861[i_11_])) {
				i_10_ = i_11_;
				break;
			}
		}
		if (i_10_ == -1)
			i_10_ = Class205.anInt2763 - 1;
		return i_10_;
	}

	static final int method663(IComponentDefinitions class192, int i, int i_12_) {
		try {
			anInt1311++;
			if (!client.method4013(class192).method2348(-125, i_12_)
					&& ((IComponentDefinitions) class192).anObjectArray2555 == null)
				return -1;
			if (i != 19161)
				aClass107_1308 = null;
			if (((IComponentDefinitions) class192).anIntArray2530 == null
					|| ((((IComponentDefinitions) class192).anIntArray2530.length ^ 0xffffffff) >= (i_12_ ^ 0xffffffff)))
				return -1;
			return ((IComponentDefinitions) class192).anIntArray2530[i_12_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bda.A("
					+ (class192 != null ? "{...}" : "null") + ',' + i + ','
					+ i_12_ + ')'));
		}
	}

	public static void method664(byte i) {
		try {
			aClass107_1308 = null;
			int i_13_ = 41 % ((-1 - i) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bda.C(" + i + ')');
		}
	}

	static final void method665() {
		if (Class220_Sub1.aClass364ArrayArrayArray7155 != null) {
			for (int i = 0; i < Class220_Sub1.aClass364ArrayArrayArray7155.length; i++) {
				for (int i_14_ = 0; i_14_ < Class138.anInt1886; i_14_++) {
					for (int i_15_ = 0; i_15_ < Class82.anInt1133; i_15_++) {
						if ((Class220_Sub1.aClass364ArrayArrayArray7155[i][i_14_][i_15_]) != null)
							Class220_Sub1.aClass364ArrayArrayArray7155[i][i_14_][i_15_]
									.method2157((byte) 46);
						Class220_Sub1.aClass364ArrayArrayArray7155[i][i_14_][i_15_] = null;
					}
				}
			}
		}
		Class220_Sub1.aClass364ArrayArrayArray7155 = null;
		Class11_Sub2_Sub38.aClass12Array9796 = null;
		if (Class108_Sub6.aClass364ArrayArrayArray5627 != null) {
			for (int i = 0; i < Class108_Sub6.aClass364ArrayArrayArray5627.length; i++) {
				for (int i_16_ = 0; i_16_ < Class138.anInt1886; i_16_++) {
					for (int i_17_ = 0; i_17_ < Class82.anInt1133; i_17_++) {
						if ((Class108_Sub6.aClass364ArrayArrayArray5627[i][i_16_][i_17_]) != null)
							Class108_Sub6.aClass364ArrayArrayArray5627[i][i_16_][i_17_]
									.method2157((byte) 46);
						Class108_Sub6.aClass364ArrayArrayArray5627[i][i_16_][i_17_] = null;
					}
				}
			}
		}
		Class108_Sub6.aClass364ArrayArrayArray5627 = null;
		Class234_Sub1_Sub1.aClass12Array9729 = null;
		Class181.aClass364ArrayArrayArray2336 = null;
		Class315.aClass12Array4179 = null;
		Class11_Sub2_Sub19.aBoolArrayArray9091 = null;
		Class106.aBoolArrayArray1426 = null;
		Class68.anIntArray968 = null;
		Class11_Sub2_Sub25.aBoolArrayArrayArray9331 = null;
		Class108_Sub13.aBoolArrayArrayArray6263 = null;
		Class33_Sub3.method2920((byte) 96);
		if (Class286.aClass376_Sub7_Sub5Array3869 != null) {
			for (int i = 0; i < Class174.anInt2226; i++)
				Class286.aClass376_Sub7_Sub5Array3869[i] = null;
			Class174.anInt2226 = 0;
		}
		Class382.aClass376_Sub7Array4971 = null;
		Class11_Sub2_Sub25.aClass376_Sub7Array9326 = null;
		Class11_Sub45_Sub4.aClass376_Sub7Array8534 = null;
		if (Class11_Sub28.aClass376_Sub7Array6568 != null) {
			for (int i = 0; i < Class11_Sub28.aClass376_Sub7Array6568.length; i++)
				Class11_Sub28.aClass376_Sub7Array6568[i] = null;
			Class12.anInt96 = 0;
		}
		if (Class11_Sub2_Sub23.aClass376_Sub7Array9265 != null) {
			for (int i = 0; i < Class11_Sub2_Sub23.aClass376_Sub7Array9265.length; i++)
				Class11_Sub2_Sub23.aClass376_Sub7Array9265[i] = null;
			Class376_Sub7_Sub2_Sub1.anInt10206 = 0;
		}
		if (Class309.aClass248Array4132 != null) {
			for (int i = 0; i < Class11_Sub26.anInt6303; i++)
				Class309.aClass248Array4132[i] = null;
			for (int i = 0; i < Class155.anInt2044; i++) {
				for (int i_18_ = 0; i_18_ < Class138.anInt1886; i_18_++) {
					for (int i_19_ = 0; i_19_ < Class82.anInt1133; i_19_++)
						Class216.aLongArrayArrayArray2995[i][i_18_][i_19_] = 0L;
				}
			}
			Class11_Sub26.anInt6303 = 0;
		}
		Class144.method903(0);
		Class206.aClass103_2779 = Class206.aClass103_2780;
		Class206.aClass103_2779.method682(32);
		Class11_Sub39.aByteArrayArray7200 = null;
		Class108_Sub26.anIntArrayArray7831 = null;
		Class11_Sub50_Sub2.aShortArrayArray9079 = null;
		if (Packet.aClass13Array8724 != null) {
			Class11_Sub23_Sub2.method3751();
			Class87.aClass163_1210.method1024(1);
			Class87.aClass163_1210.method1050(0);
		}
		if (Class376_Sub1_Sub1.aClass322Array8690 != null)
			Class376_Sub1_Sub1.aClass322Array8690 = null;
		Class87.aClass163_1210 = null;
	}

	public final String toString() {
		try {
			anInt1310++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bda.toString(" + ')');
		}
	}
}
