/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class336 {
	static IncomingPacket aClass160_4440;
	private Class11 aClass11_4441;
	static int anInt4442;
	static int anInt4443;
	private Class84 aClass84_4444;
	static int anInt4445;
	static int anInt4446;
	static int anInt4447;
	static int anInt4448;

	static final void method2017(int i, byte i_0_, boolean bool, String string) {
		try {
			Class11_Sub12_Sub4.method3720(true);
			anInt4443++;
			if (i == 0) {
				Class321_Sub2.aClass163_6648 = NPCDefinitions
						.method1385(
								Class11_Sub31.aClass146_6703,
								Class24.anInterface1_252,
								((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub15_5728
										.method2698(false) * 2,
								Class11_Sub45_Sub13.aCanvas9308, 0, (byte) -115);
				if (string != null) {
					Class321_Sub2.aClass163_6648.GA(0);
					Class292 class292 = Class193.method1264((byte) -79, 0,
							Class11_Sub18.aClass146_5781, Class372.anInt4874);
					Class107 class107 = (Class321_Sub2.aClass163_6648
							.method1060(class292, Class80.method543(
									Class108_Sub7.aClass146_5636,
									Class372.anInt4874, 0), true));
					Class324.method1974((byte) 112);
					Class11_Sub2_Sub8.method3433(class292, string, true, 117,
							class107, Class321_Sub2.aClass163_6648);
				}
			} else {
				Class163 class163 = null;
				if (string != null) {
					class163 = NPCDefinitions.method1385(
							Class11_Sub31.aClass146_6703,
							Class24.anInterface1_252, 0,
							Class11_Sub45_Sub13.aCanvas9308, 0, (byte) -61);
					class163.GA(0);
					Class292 class292 = Class193.method1264((byte) -120, 0,
							Class11_Sub18.aClass146_5781, Class372.anInt4874);
					Class107 class107 = (class163.method1060(class292, Class80
							.method543(Class108_Sub7.aClass146_5636,
									Class372.anInt4874, 0), true));
					Class324.method1974((byte) 105);
					Class11_Sub2_Sub8.method3433(class292, string, true, 115,
							class107, class163);
				}
				try {
					Class321_Sub2.aClass163_6648 = NPCDefinitions
							.method1385(
									Class11_Sub31.aClass146_6703,
									Class24.anInterface1_252,
									((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub15_5728
											.method2698(false) * 2,
									Class11_Sub45_Sub13.aCanvas9308, i,
									(byte) -27);
					if (string != null) {
						class163.GA(0);
						Class292 class292 = Class193.method1264((byte) -87, 0,
								Class11_Sub18.aClass146_5781,
								Class372.anInt4874);
						Class107 class107 = (class163.method1060(class292,
								Class80.method543(Class108_Sub7.aClass146_5636,
										Class372.anInt4874, 0), true));
						Class324.method1974((byte) 87);
						Class11_Sub2_Sub8.method3433(class292, string, true,
								106, class107, class163);
					}
					if (Class321_Sub2.aClass163_6648.method1063()) {
						boolean bool_1_ = true;
						try {
							bool_1_ = (((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656 > 256);
						} catch (Throwable throwable) {
							/* empty */
						}
						Class11_Sub50 class11_sub50;
						if (bool_1_)
							class11_sub50 = Class321_Sub2.aClass163_6648
									.method1000(146800640);
						else
							class11_sub50 = Class321_Sub2.aClass163_6648
									.method1000(104857600);
						Class321_Sub2.aClass163_6648.method1061(class11_sub50);
					}
				} catch (Throwable throwable) {
					int i_2_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
							.method3181(false);
					if ((i_2_ ^ 0xffffffff) == -3)
						Class220.aBool3024 = true;
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696));
					method2017(i_2_, (byte) 116, bool, string);
					return;
				} finally {
					if (class163 != null) {
						try {
							class163.method1072(1);
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			}
			((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3184(false, !bool);
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							i,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696));
			InputStream_Sub2.method2815(0);
			Class321_Sub2.aClass163_6648.method1068(10000);
			Class321_Sub2.aClass163_6648.X(32);
			Class236.aClass33_3224 = Class321_Sub2.aClass163_6648.method1041();
			Class219.aClass33_3017 = Class321_Sub2.aClass163_6648.method1041();
			Class235.method1499(105);
			Class321_Sub2.aClass163_6648
					.method1002((((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub25_5719
							.method3146(false) ^ 0xffffffff) == -2);
			if (Class321_Sub2.aClass163_6648.method1003())
				Class137.method875(
						-115,
						(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub23_5699
								.method3126(false) == 1));
			Class180.method1181(Class108_Sub12.anInt6228 >> 3, -88,
					Class321_Sub2.aClass163_6648, Class300.anInt4051 >> 3);
			Class376_Sub1.method2276(16711680);
			Class72.aClass35Array1002 = null;
			Class295.aBool3989 = true;
			Class236_Sub1.aBool6093 = false;
			Class89.method621(-1);
			int i_3_ = -7 / ((43 - i_0_) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uj.C(" + i + ','
					+ i_0_ + ',' + bool + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final Class11 method2018(int i) {
		try {
			if (i != 11034)
				return null;
			anInt4448++;
			Class11 class11 = (((Class11) ((Class84) aClass84_4444).aClass11_1149).aClass11_88);
			if (class11 == ((Class84) aClass84_4444).aClass11_1149) {
				aClass11_4441 = null;
				return null;
			}
			aClass11_4441 = ((Class11) class11).aClass11_88;
			return class11;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uj.F(" + i + ')');
		}
	}

	final void method2019(Class84 class84, int i) {
		try {
			aClass84_4444 = class84;
			if (i != -1819659005)
				aClass84_4444 = null;
			anInt4446++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uj.A("
					+ (class84 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method2020(byte i) {
		do {
			try {
				aClass160_4440 = null;
				if (i == 62)
					break;
				method2017(21, (byte) 122, false, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uj.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2021(int i) {
		try {
			if (i > -98)
				method2017(-29, (byte) -119, false, null);
			Class11_Sub2_Sub29.anInt9477++;
			anInt4442++;
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class11_Sub2.aClass370_5050,
					(byte) 94);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					Class187.method1227((byte) 54), -1528071456);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShort(-122, Class11_Sub36.anInt7079);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeShort(-128, Class153.anInt2025);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeByte(
							((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5728
									.method2698(false), -1528071456);
			Class79.method541(class11_sub10, -75);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uj.B(" + i + ')');
		}
	}

	public Class336() {
		/* empty */
	}

	Class336(Class84 class84) {
		try {
			aClass84_4444 = class84;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uj.<init>("
					+ (class84 != null ? "{...}" : "null") + ')');
		}
	}

	final Class11 method2022(int i) {
		try {
			anInt4445++;
			Class11 class11 = aClass11_4441;
			if (((Class84) aClass84_4444).aClass11_1149 == class11) {
				aClass11_4441 = null;
				return null;
			}
			aClass11_4441 = ((Class11) class11).aClass11_88;
			if (i != 146800640)
				aClass160_4440 = null;
			return class11;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uj.D(" + i + ')');
		}
	}
}
