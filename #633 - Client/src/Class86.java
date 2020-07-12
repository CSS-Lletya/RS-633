/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;

final class Class86 {
	private static int[][] anIntArrayArray1173 = new int[5][5000];
	private static int anInt1174 = 0;
	private static int[] anIntArray1175;
	static int anInt1176;
	static int anInt1177;
	private static IComponentDefinitions aClass192_1178;
	static int anInt1179;
	private static Class196[] aClass196Array1180;
	private static String[] aStringArray1181;
	private static int anInt1182 = 0;
	private static Class7 aClass7_1183;
	static int anInt1184;
	private static String[] aStringArray1185;
	static int anInt1186;
	static int anInt1187;
	private static int[] anIntArray1188;
	static int anInt1189;
	static int anInt1190;
	static int anInt1191;
	static int anInt1192;
	private static IComponentDefinitions aClass192_1193;
	static int anInt1194;
	private static int[] anIntArray1195;
	private static Calendar aCalendar1196;
	private static int anInt1197;
	static Class22 aClass22_1198;
	private static int[] anIntArray1199;
	private static String[] aStringArray1200;
	private static int anInt1201;

	private static final int method599(char c) {
		if (Class12_Sub1.method2289(c, (byte) -85))
			return 1;
		return 0;
	}

	public static void method600() {
		anIntArray1175 = null;
		aStringArray1181 = null;
		anIntArray1188 = null;
		anIntArrayArray1173 = null;
		anIntArray1195 = null;
		aStringArray1185 = null;
		aClass196Array1180 = null;
		aClass192_1178 = null;
		aClass192_1193 = null;
		aClass7_1183 = null;
		aCalendar1196 = null;
		aStringArray1200 = null;
		anIntArray1199 = null;
		aClass22_1198 = null;
	}

	private static final void method601(int i) {
		IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
				(byte) -107, i);
		if (class192 != null) {
			int i_0_ = i >>> 16;
			IComponentDefinitions[] class192s = Canvas_Sub1.aClass192ArrayArray9228[i_0_];
			if (class192s == null) {
				IComponentDefinitions[] class192s_1_ = Class11_Sub45_Sub5.aClass192ArrayArray8772[i_0_];
				int i_2_ = class192s_1_.length;
				class192s = Canvas_Sub1.aClass192ArrayArray9228[i_0_] = new IComponentDefinitions[i_2_];
				Class311.method1901(class192s_1_, 0, class192s, 0,
						class192s_1_.length);
			}
			int i_3_;
			for (i_3_ = 0; i_3_ < class192s.length; i_3_++) {
				if (class192s[i_3_] == class192)
					break;
			}
			if (i_3_ < class192s.length) {
				Class311.method1901(class192s, 0, class192s, 1, i_3_);
				class192s[0] = class192;
			}
		}
	}

	private static final void executeScript(Class11_Sub48 class11_sub48, int i) {
		Object[] objects = ((Class11_Sub48) class11_sub48).parameters;
		int i_4_ = ((Integer) objects[0]).intValue();
		Class11_Sub45_Sub6 class11_sub45_sub6 = Class63.method479((byte) -88,
				i_4_);
		if (class11_sub45_sub6 != null) {
			anIntArray1175 = new int[((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8784];
			int i_5_ = 0;
			aStringArray1181 = (new String[((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8785]);
			int i_6_ = 0;
			for (int i_7_ = 1; i_7_ < objects.length; i_7_++) {
				if (objects[i_7_] instanceof Integer) {

					int i_8_ = ((Integer) objects[i_7_]).intValue();
					if (i_8_ == -2147483647)
						i_8_ = ((Class11_Sub48) class11_sub48).anInt7990;
					if (i_8_ == -2147483646)
						i_8_ = ((Class11_Sub48) class11_sub48).anInt8001;
					if (i_8_ == -2147483645)
						i_8_ = ((((Class11_Sub48) class11_sub48).aClass192_7999 != null) ? ((IComponentDefinitions) (((Class11_Sub48) class11_sub48).aClass192_7999)).anInt2471
								: -1);
					if (i_8_ == -2147483644)
						i_8_ = ((Class11_Sub48) class11_sub48).anInt7998;
					if (i_8_ == -2147483643)
						i_8_ = ((((Class11_Sub48) class11_sub48).aClass192_7999 != null) ? ((IComponentDefinitions) (((Class11_Sub48) class11_sub48).aClass192_7999)).anInt2459
								: -1);
					if (i_8_ == -2147483642)
						i_8_ = ((((Class11_Sub48) class11_sub48).aClass192_7991 != null) ? ((IComponentDefinitions) (((Class11_Sub48) class11_sub48).aClass192_7991)).anInt2471
								: -1);
					if (i_8_ == -2147483641)
						i_8_ = ((((Class11_Sub48) class11_sub48).aClass192_7991 != null) ? ((IComponentDefinitions) (((Class11_Sub48) class11_sub48).aClass192_7991)).anInt2459
								: -1);
					if (i_8_ == -2147483640)
						i_8_ = ((Class11_Sub48) class11_sub48).anInt8002;
					if (i_8_ == -2147483639)
						i_8_ = ((Class11_Sub48) class11_sub48).anInt7989;
					anIntArray1175[i_5_++] = i_8_;
				} else if (objects[i_7_] instanceof String) {
					String string = (String) objects[i_7_];
					if (string.equals("event_opbase"))
						string = ((Class11_Sub48) class11_sub48).aString7997;
					aStringArray1181[i_6_++] = string;
				}
			}
			anInt1201 = ((Class11_Sub48) class11_sub48).anInt7992;
			method612(class11_sub45_sub6, i);
		}
	}

	static final void parseIComponentScript(int i) {
		if (i != -1 && Class11_Sub16.method2449(114, i)) {
			IComponentDefinitions[] class192s = Class11_Sub45_Sub5.aClass192ArrayArray8772[i];
			for (int i_9_ = 0; i_9_ < class192s.length; i_9_++) {
				IComponentDefinitions class192 = class192s[i_9_];
				if (((IComponentDefinitions) class192).anObjectArray2627 != null) {
					Class11_Sub48 class11_sub48 = new Class11_Sub48();
					((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
					((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2627;
					executeScript(class11_sub48, 2000000);
				}
			}
		}
	}

	private static final String method604(int i) {
		long l = ((long) i + 11745L) * 86400000L;
		aCalendar1196.setTime(new Date(l));
		int i_10_ = aCalendar1196.get(5);
		int i_11_ = aCalendar1196.get(2);
		int i_12_ = aCalendar1196.get(1);
		return (String.valueOf(i_10_) + "-" + aStringArray1200[i_11_] + "-" + i_12_);
	}

	private static final void method605(int i, boolean bool) {
		if (i < 300) {
			if (i == 100) {
				anInt1197 -= 3;
				int i_13_ = anIntArray1195[anInt1197];
				int i_14_ = anIntArray1195[anInt1197 + 1];
				int i_15_ = anIntArray1195[anInt1197 + 2];
				if (i_14_ == 0)
					throw new RuntimeException();
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -125, i_13_);
				if (((IComponentDefinitions) class192).aClass192Array2524 == null)
					((IComponentDefinitions) class192).aClass192Array2524 = new IComponentDefinitions[i_15_ + 1];
				if (((IComponentDefinitions) class192).aClass192Array2524.length <= i_15_) {
					IComponentDefinitions[] class192s = new IComponentDefinitions[i_15_ + 1];
					for (int i_16_ = 0; (i_16_ < ((IComponentDefinitions) class192).aClass192Array2524.length); i_16_++)
						class192s[i_16_] = ((IComponentDefinitions) class192).aClass192Array2524[i_16_];
					((IComponentDefinitions) class192).aClass192Array2524 = class192s;
				}
				if (i_15_ > 0
						&& (((IComponentDefinitions) class192).aClass192Array2524[i_15_ - 1] == null))
					throw new RuntimeException("Gap at:" + (i_15_ - 1));
				IComponentDefinitions class192_17_ = new IComponentDefinitions();
				((IComponentDefinitions) class192_17_).anInt2531 = i_14_;
				((IComponentDefinitions) class192_17_).anInt2593 = ((IComponentDefinitions) class192_17_).anInt2471 = ((IComponentDefinitions) class192).anInt2471;
				((IComponentDefinitions) class192_17_).anInt2459 = i_15_;
				((IComponentDefinitions) class192).aClass192Array2524[i_15_] = class192_17_;
				if (bool)
					aClass192_1193 = class192_17_;
				else
					aClass192_1178 = class192_17_;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 101) {
				IComponentDefinitions class192 = bool ? aClass192_1193
						: aClass192_1178;
				if (((IComponentDefinitions) class192).anInt2459 == -1) {
					if (bool)
						throw new RuntimeException(
								"Tried to .cc_delete static .active-component!");
					throw new RuntimeException(
							"Tried to cc_delete static active-component!");
				}
				IComponentDefinitions class192_18_ = Class11_Sub2_Sub13
						.method3533((byte) -105,
								(((IComponentDefinitions) class192).anInt2471));
				((IComponentDefinitions) class192_18_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459] = null;
				Class232.method1484(class192_18_, 1);
				return;
			}
			if (i == 102) {
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -80, anIntArray1195[--anInt1197]);
				((IComponentDefinitions) class192).aClass192Array2524 = null;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 200) {
				anInt1197 -= 2;
				int i_19_ = anIntArray1195[anInt1197];
				int i_20_ = anIntArray1195[anInt1197 + 1];
				IComponentDefinitions class192 = Class146.method913(i_19_,
						(byte) -108, i_20_);
				if (class192 != null && i_20_ != -1) {
					anIntArray1195[anInt1197++] = 1;
					if (bool)
						aClass192_1193 = class192;
					else
						aClass192_1178 = class192;
				} else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 201) {
				int i_21_ = anIntArray1195[--anInt1197];
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -79, i_21_);
				if (class192 != null) {
					anIntArray1195[anInt1197++] = 1;
					if (bool)
						aClass192_1193 = class192;
					else
						aClass192_1178 = class192;
				} else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 202) {
				int i_22_ = anIntArray1195[--anInt1197];
				method607(i_22_);
				return;
			}
			if (i == 203) {
				int i_23_ = anIntArray1195[--anInt1197];
				method601(i_23_);
				return;
			}
		} else if (i < 500) {
			if (i == 403) {
				anInt1197 -= 2;
				int i_24_ = anIntArray1195[anInt1197];
				int i_25_ = anIntArray1195[anInt1197 + 1];
				if ((((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418) != null) {
					for (int i_26_ = 0; i_26_ < Class203.anIntArray2722.length; i_26_++) {
						if (Class203.anIntArray2722[i_26_] == i_24_) {
							((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418
									.method1650(Class2.aClass221_18, i_26_,
											104, i_25_);
							return;
						}
					}
					for (int i_27_ = 0; i_27_ < Class155.anIntArray2043.length; i_27_++) {
						if (Class155.anIntArray2043[i_27_] == i_24_) {
							((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418
									.method1650(Class2.aClass221_18, i_27_, 99,
											i_25_);
							break;
						}
					}
					return;
				}
				return;
			}
			if (i == 404) {
				anInt1197 -= 2;
				int i_28_ = anIntArray1195[anInt1197];
				int i_29_ = anIntArray1195[anInt1197 + 1];
				if ((((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418) != null) {
					((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418
							.method1651(-27417, i_28_, i_29_);
					return;
				}
				return;
			}
			if (i == 410) {
				boolean bool_30_ = anIntArray1195[--anInt1197] != 0;
				if ((((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418) != null) {
					((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418
							.method1652(bool_30_, (byte) 122);
					return;
				}
				return;
			}
			if (i == 411) {
				anInt1197 -= 2;
				int i_31_ = anIntArray1195[anInt1197];
				int i_32_ = anIntArray1195[anInt1197 + 1];
				if ((((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418) != null) {
					((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418
							.method1655(Packet.aClass223_8723, i_31_, i_32_, 0);
					return;
				}
				return;
			}
		} else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
			IComponentDefinitions class192;
			if (i >= 2000) {
				i -= 1000;
				class192 = Class11_Sub2_Sub13.method3533((byte) -92,
						anIntArray1195[--anInt1197]);
			} else
				class192 = bool ? aClass192_1193 : aClass192_1178;
			if (i == 1000) {
				anInt1197 -= 4;
				((IComponentDefinitions) class192).anInt2615 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2550 = anIntArray1195[anInt1197 + 1];
				int i_33_ = anIntArray1195[anInt1197 + 2];
				if (i_33_ < 0)
					i_33_ = 0;
				else if (i_33_ > 5)
					i_33_ = 5;
				int i_34_ = anIntArray1195[anInt1197 + 3];
				if (i_34_ < 0)
					i_34_ = 0;
				else if (i_34_ > 5)
					i_34_ = 5;
				((IComponentDefinitions) class192).aByte2473 = (byte) i_33_;
				((IComponentDefinitions) class192).aByte2617 = (byte) i_34_;
				Class232.method1484(class192, 1);
				Class11_Sub45_Sub14.method3637(false, class192);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class279.method1720(
							((IComponentDefinitions) class192).anInt2471,
							(byte) -34);
				return;
			}
			if (i == 1001) {
				anInt1197 -= 4;
				((IComponentDefinitions) class192).anInt2613 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2498 = anIntArray1195[anInt1197 + 1];
				((IComponentDefinitions) class192).anInt2616 = 0;
				((IComponentDefinitions) class192).anInt2580 = 0;
				int i_35_ = anIntArray1195[anInt1197 + 2];
				if (i_35_ < 0)
					i_35_ = 0;
				else if (i_35_ > 4)
					i_35_ = 4;
				int i_36_ = anIntArray1195[anInt1197 + 3];
				if (i_36_ < 0)
					i_36_ = 0;
				else if (i_36_ > 4)
					i_36_ = 4;
				((IComponentDefinitions) class192).aByte2465 = (byte) i_35_;
				((IComponentDefinitions) class192).aByte2521 = (byte) i_36_;
				Class232.method1484(class192, 1);
				Class11_Sub45_Sub14.method3637(false, class192);
				if (((IComponentDefinitions) class192).anInt2531 == 0)
					Class130.method843(false, true, class192);
				return;
			}
			if (i == 1003) {
				boolean bool_37_ = anIntArray1195[--anInt1197] == 1;
				if (((IComponentDefinitions) class192).aBool2535 != bool_37_) {
					((IComponentDefinitions) class192).aBool2535 = bool_37_;
					Class232.method1484(class192, 1);
				}
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub10.method2618((byte) -99,
							((IComponentDefinitions) class192).anInt2471);
				return;
			}
			if (i == 1004) {
				anInt1197 -= 2;
				((IComponentDefinitions) class192).anInt2602 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2497 = anIntArray1195[anInt1197 + 1];
				Class232.method1484(class192, 1);
				Class11_Sub45_Sub14.method3637(false, class192);
				if (((IComponentDefinitions) class192).anInt2531 == 0)
					Class130.method843(false, true, class192);
				return;
			}
			if (i == 1005) {
				((IComponentDefinitions) class192).aBool2494 = anIntArray1195[--anInt1197] == 1;
				return;
			}
		} else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
			IComponentDefinitions class192;
			if (i >= 2000) {
				i -= 1000;
				class192 = Class11_Sub2_Sub13.method3533((byte) -115,
						(anIntArray1195[--anInt1197]));
			} else
				class192 = bool ? aClass192_1193 : aClass192_1178;
			if (i == 1100) {
				anInt1197 -= 2;
				((IComponentDefinitions) class192).anInt2561 = anIntArray1195[anInt1197];
				if (((IComponentDefinitions) class192).anInt2561 > (((IComponentDefinitions) class192).anInt2522 - ((IComponentDefinitions) class192).anInt2610))
					((IComponentDefinitions) class192).anInt2561 = (((IComponentDefinitions) class192).anInt2522 - ((IComponentDefinitions) class192).anInt2610);
				if (((IComponentDefinitions) class192).anInt2561 < 0)
					((IComponentDefinitions) class192).anInt2561 = 0;
				((IComponentDefinitions) class192).anInt2588 = anIntArray1195[anInt1197 + 1];
				if (((IComponentDefinitions) class192).anInt2588 > (((IComponentDefinitions) class192).anInt2484 - ((IComponentDefinitions) class192).anInt2546))
					((IComponentDefinitions) class192).anInt2588 = (((IComponentDefinitions) class192).anInt2484 - ((IComponentDefinitions) class192).anInt2546);
				if (((IComponentDefinitions) class192).anInt2588 < 0)
					((IComponentDefinitions) class192).anInt2588 = 0;
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class172.method1129(
							((IComponentDefinitions) class192).anInt2471, 113);
				return;
			}
			if (i == 1101) {
				((IComponentDefinitions) class192).anInt2577 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class376_Sub7
							.method2875(
									((IComponentDefinitions) class192).anInt2471,
									19412);
				return;
			}
			if (i == 1102) {
				((IComponentDefinitions) class192).aBool2542 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1103) {
				((IComponentDefinitions) class192).anInt2585 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1104) {
				((IComponentDefinitions) class192).anInt2492 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1105) {
				int i_38_ = anIntArray1195[--anInt1197];
				if (((IComponentDefinitions) class192).anInt2544 != i_38_) {
					((IComponentDefinitions) class192).anInt2544 = i_38_;
					Class232.method1484(class192, 1);
				}
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class23.method206(14,
							((IComponentDefinitions) class192).anInt2471);
				return;
			}
			if (i == 1106) {
				((IComponentDefinitions) class192).anInt2587 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1107) {
				((IComponentDefinitions) class192).aBool2482 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1108) {
				((IComponentDefinitions) class192).anInt2597 = 1;
				((IComponentDefinitions) class192).anInt2512 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 45);
				return;
			}
			if (i == 1109) {
				anInt1197 -= 6;
				((IComponentDefinitions) class192).anInt2595 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2516 = anIntArray1195[anInt1197 + 1];
				((IComponentDefinitions) class192).anInt2496 = anIntArray1195[anInt1197 + 2];
				((IComponentDefinitions) class192).anInt2578 = anIntArray1195[anInt1197 + 3];
				((IComponentDefinitions) class192).anInt2526 = anIntArray1195[anInt1197 + 4];
				((IComponentDefinitions) class192).anInt2598 = anIntArray1195[anInt1197 + 5];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1) {
					Class240.method1526(-61,
							((IComponentDefinitions) class192).anInt2471);
					Class11_Sub2_Sub19.method3566(
							(((IComponentDefinitions) class192).anInt2471),
							(byte) -91);
				}
				return;
			}
			if (i == 1110) {
				int i_39_ = anIntArray1195[--anInt1197];
				if (((IComponentDefinitions) class192).anInt2491 != i_39_) {
					((IComponentDefinitions) class192).anInt2491 = i_39_;
					((IComponentDefinitions) class192).anInt2539 = 0;
					((IComponentDefinitions) class192).anInt2545 = 1;
					((IComponentDefinitions) class192).anInt2502 = 0;
					Class281 class281 = (((IComponentDefinitions) class192).anInt2491 == -1 ? null
							: (Class108_Sub23.aClass198_7760
									.method1284(
											((IComponentDefinitions) class192).anInt2491,
											(byte) 124)));
					if (class281 != null)
						Class318.method1936((byte) 127,
								((IComponentDefinitions) class192).anInt2539,
								class281);
					Class232.method1484(class192, 1);
				}
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class245.method1544(2923,
							((IComponentDefinitions) class192).anInt2471);
				return;
			}
			if (i == 1111) {
				((IComponentDefinitions) class192).aBool2565 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1112) {
				String string = aStringArray1185[--anInt1182];
				if (!string
						.equals(((IComponentDefinitions) class192).aString2481)) {
					((IComponentDefinitions) class192).aString2481 = string;
					Class232.method1484(class192, 1);
				}
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class267.method1685(
							((IComponentDefinitions) class192).anInt2471, 0);
				return;
			}
			if (i == 1113) {
				((IComponentDefinitions) class192).anInt2488 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class339.method2048(
							((IComponentDefinitions) class192).anInt2471, 16);
				return;
			}
			if (i == 1114) {
				anInt1197 -= 3;
				((IComponentDefinitions) class192).anInt2607 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2589 = anIntArray1195[anInt1197 + 1];
				((IComponentDefinitions) class192).anInt2476 = anIntArray1195[anInt1197 + 2];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1115) {
				((IComponentDefinitions) class192).aBool2509 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1116) {
				((IComponentDefinitions) class192).anInt2466 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1117) {
				((IComponentDefinitions) class192).anInt2554 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1118) {
				((IComponentDefinitions) class192).aBool2517 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1119) {
				((IComponentDefinitions) class192).aBool2538 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1120) {
				anInt1197 -= 2;
				((IComponentDefinitions) class192).anInt2522 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2484 = anIntArray1195[anInt1197 + 1];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2531 == 0)
					Class130.method843(false, true, class192);
				return;
			}
			if (i == 1122) {
				((IComponentDefinitions) class192).aBool2540 = anIntArray1195[--anInt1197] == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1123) {
				((IComponentDefinitions) class192).anInt2598 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class240.method1526(-123,
							((IComponentDefinitions) class192).anInt2471);
				return;
			}
			if (i == 1124) {
				int i_40_ = anIntArray1195[--anInt1197];
				((IComponentDefinitions) class192).aBool2505 = i_40_ == 1;
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1125) {
				anInt1197 -= 2;
				((IComponentDefinitions) class192).anInt2533 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2548 = anIntArray1195[anInt1197 + 1];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1126) {
				((IComponentDefinitions) class192).anInt2543 = anIntArray1195[--anInt1197];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1127) {
				anInt1197 -= 2;
				int i_41_ = anIntArray1195[anInt1197];
				int i_42_ = anIntArray1195[anInt1197 + 1];
				Class283 class283 = Class187.aClass52_2388.method432(i_41_,
						(byte) -99);
				if (i_42_ != ((Class283) class283).anInt3827)
					class192.method1249(i_41_, -109, i_42_);
				else {
					class192.method1243(1880231200, i_41_);
					return;
				}
				return;
			}
			if (i == 1128) {
				int i_43_ = anIntArray1195[--anInt1197];
				String string = aStringArray1185[--anInt1182];
				Class283 class283 = Class187.aClass52_2388.method432(i_43_,
						(byte) -70);
				if (!((Class283) class283).aString3833.equals(string))
					class192.method1259(i_43_, (byte) -98, string);
				else {
					class192.method1243(1880231200, i_43_);
					return;
				}
				return;
			}
			if (i == 1129 || i == 1130) {
				int i_44_ = anIntArray1195[--anInt1197];
				if ((((IComponentDefinitions) class192).anInt2531 == 5 || i != 1129)
						&& (((IComponentDefinitions) class192).anInt2531 == 4 || i != 1130)) {
					if (((IComponentDefinitions) class192).anInt2552 != i_44_) {
						((IComponentDefinitions) class192).anInt2552 = i_44_;
						Class232.method1484(class192, 1);
					}
					if (((IComponentDefinitions) class192).anInt2459 == -1)
						Class11_Sub52.method3242(
								(((IComponentDefinitions) class192).anInt2471),
								(byte) 102);
					return;
				}
				return;
			}
		} else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
			IComponentDefinitions class192;
			if (i >= 2000) {
				i -= 1000;
				class192 = Class11_Sub2_Sub13.method3533((byte) -94,
						anIntArray1195[--anInt1197]);
			} else
				class192 = bool ? aClass192_1193 : aClass192_1178;
			Class232.method1484(class192, 1);
			if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212
					|| i == 1213) {
				anInt1197 -= 2;
				int i_45_ = anIntArray1195[anInt1197];
				int i_46_ = anIntArray1195[anInt1197 + 1];
				if (((IComponentDefinitions) class192).anInt2459 == -1) {
					Class376_Sub7_Sub4_Sub2.method3915(
							((IComponentDefinitions) class192).anInt2471, 9);
					Class240.method1526(-117,
							((IComponentDefinitions) class192).anInt2471);
					Class11_Sub2_Sub19.method3566(
							(((IComponentDefinitions) class192).anInt2471),
							(byte) -91);
				}
				if (i_45_ == -1) {
					((IComponentDefinitions) class192).anInt2597 = 1;
					((IComponentDefinitions) class192).anInt2512 = -1;
					((IComponentDefinitions) class192).anInt2467 = -1;
				} else {
					((IComponentDefinitions) class192).anInt2467 = i_45_;
					((IComponentDefinitions) class192).anInt2572 = i_46_;
					if (i == 1208 || i == 1209)
						((IComponentDefinitions) class192).aBool2485 = true;
					else
						((IComponentDefinitions) class192).aBool2485 = false;
					Class249 class249 = Packet.aClass223_8723.method1430(i_45_,
							false);
					((IComponentDefinitions) class192).anInt2496 = ((Class249) class249).anInt3383;
					((IComponentDefinitions) class192).anInt2578 = ((Class249) class249).anInt3408;
					((IComponentDefinitions) class192).anInt2526 = ((Class249) class249).anInt3394;
					((IComponentDefinitions) class192).anInt2595 = ((Class249) class249).anInt3413;
					((IComponentDefinitions) class192).anInt2516 = ((Class249) class249).anInt3379;
					((IComponentDefinitions) class192).anInt2598 = ((Class249) class249).anInt3387;
					if (i == 1205 || i == 1209)
						((IComponentDefinitions) class192).anInt2474 = 0;
					else if (i == 1212 || i == 1213)
						((IComponentDefinitions) class192).anInt2474 = 1;
					else
						((IComponentDefinitions) class192).anInt2474 = 2;
					if (((IComponentDefinitions) class192).anInt2616 > 0)
						((IComponentDefinitions) class192).anInt2598 = (((IComponentDefinitions) class192).anInt2598 * 32 / ((IComponentDefinitions) class192).anInt2616);
					else {
						if (((IComponentDefinitions) class192).anInt2613 > 0)
							((IComponentDefinitions) class192).anInt2598 = (((IComponentDefinitions) class192).anInt2598 * 32 / ((IComponentDefinitions) class192).anInt2613);
						return;
					}
					return;
				}
				return;
			}
			if (i == 1201) {
				((IComponentDefinitions) class192).anInt2597 = 2;
				((IComponentDefinitions) class192).anInt2512 = anIntArray1195[--anInt1197];
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 120);
				return;
			}
			if (i == 1202) {
				((IComponentDefinitions) class192).anInt2597 = 3;
				((IComponentDefinitions) class192).anInt2512 = -1;
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 47);
				return;
			}
			if (i == 1203) {
				((IComponentDefinitions) class192).anInt2597 = 6;
				((IComponentDefinitions) class192).anInt2512 = anIntArray1195[--anInt1197];
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 95);
				return;
			}
			if (i == 1204) {
				((IComponentDefinitions) class192).anInt2597 = 5;
				((IComponentDefinitions) class192).anInt2512 = anIntArray1195[--anInt1197];
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 112);
				return;
			}
			if (i == 1206) {
				anInt1197 -= 4;
				((IComponentDefinitions) class192).anInt2603 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2458 = anIntArray1195[anInt1197 + 1];
				((IComponentDefinitions) class192).anInt2468 = anIntArray1195[anInt1197 + 2];
				((IComponentDefinitions) class192).anInt2460 = anIntArray1195[anInt1197 + 3];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1207) {
				anInt1197 -= 2;
				((IComponentDefinitions) class192).anInt2486 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2510 = anIntArray1195[anInt1197 + 1];
				Class232.method1484(class192, 1);
				return;
			}
			if (i == 1210) {
				anInt1197 -= 4;
				((IComponentDefinitions) class192).anInt2512 = anIntArray1195[anInt1197];
				((IComponentDefinitions) class192).anInt2562 = anIntArray1195[anInt1197 + 1];
				if (anIntArray1195[anInt1197 + 2] == 1)
					((IComponentDefinitions) class192).anInt2597 = 9;
				else
					((IComponentDefinitions) class192).anInt2597 = 8;
				if (anIntArray1195[anInt1197 + 3] == 1)
					((IComponentDefinitions) class192).aBool2485 = true;
				else
					((IComponentDefinitions) class192).aBool2485 = false;
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 109);
				return;
			}
			if (i == 1211) {
				((IComponentDefinitions) class192).anInt2597 = 5;
				((IComponentDefinitions) class192).anInt2512 = Class11_Sub44.anInt7791;
				((IComponentDefinitions) class192).anInt2562 = 0;
				if (((IComponentDefinitions) class192).anInt2459 == -1)
					Class108_Sub14.method2660(
							((IComponentDefinitions) class192).anInt2471,
							(byte) 105);
				return;
			}
		} else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
			IComponentDefinitions class192;
			if (i >= 2000) {
				i -= 1000;
				class192 = Class11_Sub2_Sub13.method3533((byte) -123,
						(anIntArray1195[--anInt1197]));
			} else
				class192 = bool ? aClass192_1193 : aClass192_1178;
			if (i == 1300) {
				int i_47_ = anIntArray1195[--anInt1197] - 1;
				if (i_47_ < 0 || i_47_ > 9)
					anInt1182--;
				else {
					class192.method1257(118, i_47_,
							aStringArray1185[--anInt1182]);
					return;
				}
				return;
			}
			if (i == 1301) {
				anInt1197 -= 2;
				int i_48_ = anIntArray1195[anInt1197];
				int i_49_ = anIntArray1195[anInt1197 + 1];
				if (i_48_ == -1 && i_49_ == -1)
					((IComponentDefinitions) class192).aClass192_2558 = null;
				else {
					((IComponentDefinitions) class192).aClass192_2558 = Class146
							.method913(i_48_, (byte) -121, i_49_);
					return;
				}
				return;
			}
			if (i == 1302) {
				int i_50_ = anIntArray1195[--anInt1197];
				if (i_50_ == Class204.anInt2754
						|| i_50_ == Class236_Sub4.anInt6720
						|| i_50_ == Class138.anInt1887) {
					((IComponentDefinitions) class192).anInt2557 = i_50_;
					return;
				}
				return;
			}
			if (i == 1303) {
				((IComponentDefinitions) class192).anInt2571 = anIntArray1195[--anInt1197];
				return;
			}
			if (i == 1304) {
				((IComponentDefinitions) class192).anInt2569 = anIntArray1195[--anInt1197];
				return;
			}
			if (i == 1305) {
				((IComponentDefinitions) class192).aString2506 = aStringArray1185[--anInt1182];
				return;
			}
			if (i == 1306) {
				((IComponentDefinitions) class192).aString2614 = aStringArray1185[--anInt1182];
				return;
			}
			if (i == 1307) {
				((IComponentDefinitions) class192).aStringArray2520 = null;
				return;
			}
			if (i == 1308) {
				((IComponentDefinitions) class192).anInt2519 = anIntArray1195[--anInt1197];
				((IComponentDefinitions) class192).anInt2507 = anIntArray1195[--anInt1197];
				return;
			}
			if (i == 1309) {
				int i_51_ = anIntArray1195[--anInt1197];
				int i_52_ = anIntArray1195[--anInt1197];
				if (i_52_ >= 1 && i_52_ <= 10)
					class192.method1253(i_52_ - 1, i_51_, (byte) -79);
				return;
			}
			if (i == 1310) {
				((IComponentDefinitions) class192).aString2504 = aStringArray1185[--anInt1182];
				return;
			}
			if (i == 1311) {
				((IComponentDefinitions) class192).anInt2622 = anIntArray1195[--anInt1197];
				return;
			}
			if (i == 1312 || i == 1313) {
				int i_53_;
				int i_54_;
				int i_55_;
				if (i == 1312) {
					anInt1197 -= 3;
					i_53_ = anIntArray1195[anInt1197] - 1;
					i_54_ = anIntArray1195[anInt1197 + 1];
					i_55_ = anIntArray1195[anInt1197 + 2];
					if (i_53_ < 0 || i_53_ > 9)
						throw new RuntimeException("IOR13121313");
				} else {
					anInt1197 -= 2;
					i_53_ = 10;
					i_54_ = anIntArray1195[anInt1197];
					i_55_ = anIntArray1195[anInt1197 + 1];
				}
				if (((IComponentDefinitions) class192).aByteArray2579 == null) {
					if (i_54_ != 0) {
						((IComponentDefinitions) class192).aByteArray2579 = new byte[11];
						((IComponentDefinitions) class192).aByteArray2594 = new byte[11];
						((IComponentDefinitions) class192).anIntArray2567 = new int[11];
					} else
						return;
				}
				((IComponentDefinitions) class192).aByteArray2579[i_53_] = (byte) i_54_;
				if (i_54_ != 0)
					((IComponentDefinitions) class192).aBool2581 = true;
				else {
					((IComponentDefinitions) class192).aBool2581 = false;
					for (int i_56_ = 0; i_56_ < ((IComponentDefinitions) class192).aByteArray2579.length; i_56_++) {
						if (((IComponentDefinitions) class192).aByteArray2579[i_56_] != 0) {
							((IComponentDefinitions) class192).aBool2581 = true;
							break;
						}
					}
				}
				((IComponentDefinitions) class192).aByteArray2594[i_53_] = (byte) i_55_;
				return;
			}
			if (i == 1314) {
				((IComponentDefinitions) class192).anInt2626 = anIntArray1195[--anInt1197];
				return;
			}
		} else {
			if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
				IComponentDefinitions class192;
				if (i >= 2000) {
					i -= 1000;
					class192 = Class11_Sub2_Sub13.method3533((byte) -101,
							(anIntArray1195[--anInt1197]));
				} else
					class192 = bool ? aClass192_1193 : aClass192_1178;
				if (i == 1499)
					class192.method1245((byte) -79);
				else {
					String string = aStringArray1185[--anInt1182];
					int[] is = null;
					if (string.length() > 0
							&& string.charAt(string.length() - 1) == 'Y') {
						int i_57_ = anIntArray1195[--anInt1197];
						if (i_57_ > 0) {
							is = new int[i_57_];
							while (i_57_-- > 0)
								is[i_57_] = anIntArray1195[--anInt1197];
						}
						string = string.substring(0, string.length() - 1);
					}
					Object[] objects = new Object[string.length() + 1];
					for (int i_58_ = objects.length - 1; i_58_ >= 1; i_58_--) {
						if (string.charAt(i_58_ - 1) == 's')
							objects[i_58_] = aStringArray1185[--anInt1182];
						else
							objects[i_58_] = new Integer(
									anIntArray1195[--anInt1197]);
					}
					int i_59_ = anIntArray1195[--anInt1197];
					if (i_59_ != -1)
						objects[0] = new Integer(i_59_);
					else
						objects = null;
					if (i == 1400)
						((IComponentDefinitions) class192).anObjectArray2475 = objects;
					else if (i == 1401)
						((IComponentDefinitions) class192).anObjectArray2609 = objects;
					else if (i == 1402)
						((IComponentDefinitions) class192).anObjectArray2612 = objects;
					else if (i == 1403)
						((IComponentDefinitions) class192).anObjectArray2564 = objects;
					else if (i == 1404)
						((IComponentDefinitions) class192).anObjectArray2461 = objects;
					else if (i == 1405)
						((IComponentDefinitions) class192).anObjectArray2508 = objects;
					else if (i == 1406)
						((IComponentDefinitions) class192).anObjectArray2527 = objects;
					else if (i == 1407) {
						((IComponentDefinitions) class192).anObjectArray2463 = objects;
						((IComponentDefinitions) class192).anIntArray2604 = is;
					} else if (i == 1408)
						((IComponentDefinitions) class192).anObjectArray2625 = objects;
					else if (i == 1409)
						((IComponentDefinitions) class192).anObjectArray2555 = objects;
					else if (i == 1410)
						((IComponentDefinitions) class192).anObjectArray2559 = objects;
					else if (i == 1411)
						((IComponentDefinitions) class192).anObjectArray2541 = objects;
					else if (i == 1412)
						((IComponentDefinitions) class192).anObjectArray2551 = objects;
					else if (i == 1414) {
						((IComponentDefinitions) class192).anObjectArray2630 = objects;
						((IComponentDefinitions) class192).anIntArray2523 = is;
					} else if (i == 1415) {
						((IComponentDefinitions) class192).anObjectArray2503 = objects;
						((IComponentDefinitions) class192).anIntArray2537 = is;
					} else if (i == 1416)
						((IComponentDefinitions) class192).anObjectArray2493 = objects;
					else if (i == 1417)
						((IComponentDefinitions) class192).anObjectArray2500 = objects;
					else if (i == 1418)
						((IComponentDefinitions) class192).anObjectArray2547 = objects;
					else if (i == 1419)
						((IComponentDefinitions) class192).anObjectArray2573 = objects;
					else if (i == 1420)
						((IComponentDefinitions) class192).anObjectArray2472 = objects;
					else if (i == 1421)
						((IComponentDefinitions) class192).anObjectArray2600 = objects;
					else if (i == 1422)
						((IComponentDefinitions) class192).anObjectArray2480 = objects;
					else if (i == 1423)
						((IComponentDefinitions) class192).anObjectArray2532 = objects;
					else if (i == 1424)
						((IComponentDefinitions) class192).anObjectArray2563 = objects;
					else if (i == 1425)
						((IComponentDefinitions) class192).anObjectArray2623 = objects;
					else if (i == 1426)
						((IComponentDefinitions) class192).anObjectArray2514 = objects;
					else if (i == 1427)
						((IComponentDefinitions) class192).anObjectArray2553 = objects;
					else if (i == 1428) {
						((IComponentDefinitions) class192).anObjectArray2515 = objects;
						((IComponentDefinitions) class192).anIntArray2501 = is;
					} else if (i == 1429) {
						((IComponentDefinitions) class192).anObjectArray2575 = objects;
						((IComponentDefinitions) class192).anIntArray2628 = is;
					} else if (i == 1430)
						((IComponentDefinitions) class192).anObjectArray2479 = objects;
					((IComponentDefinitions) class192).aBool2462 = true;
					return;
				}
				return;
			}
			if (i < 1600) {
				IComponentDefinitions class192 = bool ? aClass192_1193
						: aClass192_1178;
				if (i == 1500) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2469;
					return;
				}
				if (i == 1501) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2490;
					return;
				}
				if (i == 1502) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2610;
					return;
				}
				if (i == 1503) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2546;
					return;
				}
				if (i == 1504) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).aBool2535 ? 1
							: 0;
					return;
				}
				if (i == 1505) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2593;
					return;
				}
				if (i == 1506) {
					IComponentDefinitions class192_60_ = Class65.method489(
							class192, true);
					anIntArray1195[anInt1197++] = (class192_60_ == null ? -1
							: ((IComponentDefinitions) class192_60_).anInt2471);
					return;
				}
			} else if (i < 1700) {
				IComponentDefinitions class192 = bool ? aClass192_1193
						: aClass192_1178;
				if (i == 1600) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2561;
					return;
				}
				if (i == 1601) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2588;
					return;
				}
				if (i == 1602) {
					aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aString2481;
					return;
				}
				if (i == 1603) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2522;
					return;
				}
				if (i == 1604) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2484;
					return;
				}
				if (i == 1605) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2598;
					return;
				}
				if (i == 1606) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2496;
					return;
				}
				if (i == 1607) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2526;
					return;
				}
				if (i == 1608) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2578;
					return;
				}
				if (i == 1609) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2585;
					return;
				}
				if (i == 1610) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2595;
					return;
				}
				if (i == 1611) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2516;
					return;
				}
				if (i == 1612) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2544;
					return;
				}
				if (i == 1613) {
					int i_61_ = anIntArray1195[--anInt1197];
					Class283 class283 = Class187.aClass52_2388.method432(i_61_,
							(byte) -88);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = class192.method1256(
								i_61_, false,
								(((Class283) class283).aString3833));
					else {
						anIntArray1195[anInt1197++] = class192.method1242(
								(((Class283) class283).anInt3827), i_61_,
								(byte) 30);
						return;
					}
					return;
				}
				if (i == 1614) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2587;
					return;
				}
				if (i == 2614) {
					anIntArray1195[anInt1197++] = (((IComponentDefinitions) class192).anInt2597 == 1 ? ((IComponentDefinitions) class192).anInt2512
							: -1);
					return;
				}
			} else if (i < 1800) {
				IComponentDefinitions class192 = bool ? aClass192_1193
						: aClass192_1178;
				if (i == 1700) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2467;
					return;
				}
				if (i == 1701) {
					if (((IComponentDefinitions) class192).anInt2467 != -1)
						anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2572;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 1702) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2459;
					return;
				}
			} else if (i < 1900) {
				IComponentDefinitions class192 = bool ? aClass192_1193
						: aClass192_1178;
				if (i == 1800) {
					anIntArray1195[anInt1197++] = client.method4013(class192)
							.method2353(false);
					return;
				}
				if (i == 1801) {
					int i_62_ = anIntArray1195[--anInt1197];
					i_62_--;
					if (((IComponentDefinitions) class192).aStringArray2520 == null
							|| (i_62_ >= ((IComponentDefinitions) class192).aStringArray2520.length)
							|| (((IComponentDefinitions) class192).aStringArray2520[i_62_] == null))
						aStringArray1185[anInt1182++] = "";
					else {
						aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aStringArray2520[i_62_];
						return;
					}
					return;
				}
				if (i == 1802) {
					if (((IComponentDefinitions) class192).aString2506 == null)
						aStringArray1185[anInt1182++] = "";
					else {
						aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aString2506;
						return;
					}
					return;
				}
			} else if (i < 2000 || i >= 2900 && i < 3000) {
				IComponentDefinitions class192;
				if (i >= 2000) {
					class192 = Class11_Sub2_Sub13.method3533((byte) -85,
							(anIntArray1195[--anInt1197]));
					i -= 1000;
				} else
					class192 = bool ? aClass192_1193 : aClass192_1178;
				if (anInt1201 >= 10)
					throw new RuntimeException("C29xx-1");
				if (i == 1927) {
					if (((IComponentDefinitions) class192).anObjectArray2553 != null) {
						Class11_Sub48 class11_sub48 = new Class11_Sub48();
						((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
						((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2553;
						((Class11_Sub48) class11_sub48).anInt7992 = anInt1201 + 1;
						Class180.aClass84_2332.method589((byte) -13,
								class11_sub48);
						return;
					}
					return;
				}
			} else if (i < 2600) {
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -112, (anIntArray1195[--anInt1197]));
				if (i == 2500) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2469;
					return;
				}
				if (i == 2501) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2490;
					return;
				}
				if (i == 2502) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2610;
					return;
				}
				if (i == 2503) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2546;
					return;
				}
				if (i == 2504) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).aBool2535 ? 1
							: 0;
					return;
				}
				if (i == 2505) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2593;
					return;
				}
				if (i == 1506) {
					IComponentDefinitions class192_63_ = Class65.method489(
							class192, true);
					anIntArray1195[anInt1197++] = (class192_63_ == null ? -1
							: ((IComponentDefinitions) class192_63_).anInt2471);
					return;
				}
			} else if (i < 2700) {
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -84, anIntArray1195[--anInt1197]);
				if (i == 2600) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2561;
					return;
				}
				if (i == 2601) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2588;
					return;
				}
				if (i == 2602) {
					aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aString2481;
					return;
				}
				if (i == 2603) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2522;
					return;
				}
				if (i == 2604) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2484;
					return;
				}
				if (i == 2605) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2598;
					return;
				}
				if (i == 2606) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2496;
					return;
				}
				if (i == 2607) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2526;
					return;
				}
				if (i == 2608) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2578;
					return;
				}
				if (i == 2609) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2585;
					return;
				}
				if (i == 2610) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2595;
					return;
				}
				if (i == 2611) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2516;
					return;
				}
				if (i == 2612) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2544;
					return;
				}
				if (i == 2613) {
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2587;
					return;
				}
				if (i == 2614) {
					anIntArray1195[anInt1197++] = (((IComponentDefinitions) class192).anInt2597 == 1 ? ((IComponentDefinitions) class192).anInt2512
							: -1);
					return;
				}
			} else if (i < 2800) {
				if (i == 2700) {
					IComponentDefinitions class192 = Class11_Sub2_Sub13
							.method3533((byte) -117,
									(anIntArray1195[--anInt1197]));
					anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2467;
					return;
				}
				if (i == 2701) {
					IComponentDefinitions class192 = Class11_Sub2_Sub13
							.method3533((byte) -128,
									(anIntArray1195[--anInt1197]));
					if (((IComponentDefinitions) class192).anInt2467 != -1)
						anIntArray1195[anInt1197++] = ((IComponentDefinitions) class192).anInt2572;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 2702) {
					int i_64_ = anIntArray1195[--anInt1197];
					Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
							.method1369((byte) 26, (long) i_64_));
					if (class11_sub24 != null)
						anIntArray1195[anInt1197++] = 1;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 2703) {
					IComponentDefinitions class192 = Class11_Sub2_Sub13
							.method3533((byte) -78,
									(anIntArray1195[--anInt1197]));
					if (((IComponentDefinitions) class192).aClass192Array2524 == null)
						anIntArray1195[anInt1197++] = 0;
					else {
						int i_65_ = ((IComponentDefinitions) class192).aClass192Array2524.length;
						for (int i_66_ = 0; i_66_ < (((IComponentDefinitions) class192).aClass192Array2524).length; i_66_++) {
							if (((IComponentDefinitions) class192).aClass192Array2524[i_66_] == null) {
								i_65_ = i_66_;
								break;
							}
						}
						anIntArray1195[anInt1197++] = i_65_;
						return;
					}
					return;
				}
				if (i == 2704 || i == 2705) {
					anInt1197 -= 2;
					int i_67_ = anIntArray1195[anInt1197];
					int i_68_ = anIntArray1195[anInt1197 + 1];
					Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
							.method1369((byte) 26, (long) i_67_));
					if (class11_sub24 != null
							&& ((Class11_Sub24) class11_sub24).anInt6233 == i_68_)
						anIntArray1195[anInt1197++] = 1;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
			} else if (i < 2900) {
				IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
						(byte) -86, anIntArray1195[--anInt1197]);
				if (i == 2800) {
					anIntArray1195[anInt1197++] = client.method4013(class192)
							.method2353(false);
					return;
				}
				if (i == 2801) {
					int i_69_ = anIntArray1195[--anInt1197];
					i_69_--;
					if (((IComponentDefinitions) class192).aStringArray2520 == null
							|| (i_69_ >= ((IComponentDefinitions) class192).aStringArray2520.length)
							|| (((IComponentDefinitions) class192).aStringArray2520[i_69_] == null))
						aStringArray1185[anInt1182++] = "";
					else {
						aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aStringArray2520[i_69_];
						return;
					}
					return;
				}
				if (i == 2802) {
					if (((IComponentDefinitions) class192).aString2506 == null)
						aStringArray1185[anInt1182++] = "";
					else {
						aStringArray1185[anInt1182++] = ((IComponentDefinitions) class192).aString2506;
						return;
					}
					return;
				}
			} else if (i < 3200) {
				if (i == 3100) {
					String string = aStringArray1185[--anInt1182];
					Class233.method1490((byte) 83, string);
					return;
				}
				if (i == 3101) {
					anInt1197 -= 2;
					Class30.method256((Class11_Sub2_Sub8.myPlayer),
							anIntArray1195[anInt1197], (byte) 4,
							anIntArray1195[anInt1197 + 1]);
					return;
				}
				if (i == 3103) {
					Class11_Sub45_Sub1.method3345(true, -1);
					return;
				}
				if (i == 3104) {
					String string = aStringArray1185[--anInt1182];
					int i_70_ = 0;
					if (Class108_Sub16.method2712(string, -17633))
						i_70_ = Class173.method1139(string, -23213);
					anInt1177++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113, Class72.aClass370_1001,
							(byte) 116);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeInt(-49, i_70_);
					Class79.method541(class11_sub10, -16);
					return;
				}
				if (i == 3105) {
					String string = aStringArray1185[--anInt1182];
					anInt1179++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113,
							Class272.aClass370_3674, (byte) -51);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeByte(string.length() + 1, -1528071456);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeString((byte) 27, string);
					Class79.method541(class11_sub10, -58);
					return;
				}
				if (i == 3106) {
					String string = aStringArray1185[--anInt1182];
					anInt1190++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113,
							Class378.aClass370_4947, (byte) -85);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeByte(string.length() + 1, -1528071456);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeString((byte) 27, string);
					Class79.method541(class11_sub10, -78);
					return;
				}
				if (i == 3107) {
					int i_71_ = anIntArray1195[--anInt1197];
					String string = aStringArray1185[--anInt1182];
					Class11_Sub2_Sub16.method3549(i_71_, string, -98);
					return;
				}
				if (i == 3108) {
					anInt1197 -= 3;
					int i_72_ = anIntArray1195[anInt1197];
					int i_73_ = anIntArray1195[anInt1197 + 1];
					int i_74_ = anIntArray1195[anInt1197 + 2];
					IComponentDefinitions class192 = Class11_Sub2_Sub13
							.method3533((byte) -103, i_74_);
					Class78.method539(i_73_, i_72_, true, class192);
					return;
				}
				if (i == 3109) {
					anInt1197 -= 2;
					int i_75_ = anIntArray1195[anInt1197];
					int i_76_ = anIntArray1195[anInt1197 + 1];
					IComponentDefinitions class192 = bool ? aClass192_1193
							: aClass192_1178;
					Class78.method539(i_76_, i_75_, true, class192);
					return;
				}
				if (i == 3110) {
					int i_77_ = anIntArray1195[--anInt1197];
					anInt1176++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113,
							(Class236_Sub4.aClass370_6706), (byte) 53);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeShort(-119, i_77_);
					Class79.method541(class11_sub10, -112);
					return;
				}
				if (i == 3111) {
					anInt1197 -= 2;
					int i_78_ = anIntArray1195[anInt1197];
					int i_79_ = anIntArray1195[anInt1197 + 1];
					Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
							.method1369((byte) 26, (long) i_78_));
					if (class11_sub24 != null)
						NPCDefinitions
								.method1377(
										true,
										(((Class11_Sub24) class11_sub24).anInt6233) != i_79_,
										class11_sub24, -123);
					Class11_Sub3.method2287(i_78_, (byte) -125, 3, i_79_, true);
					return;
				}
				if (i == 3112) {
					anInt1197--;
					int i_80_ = anIntArray1195[anInt1197];
					Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
							.method1369((byte) 26, (long) i_80_));
					if (class11_sub24 != null
							&& ((Class11_Sub24) class11_sub24).anInt6236 == 3)
						NPCDefinitions.method1377(true, true, class11_sub24,
								-69);
					return;
				}
				if (i == 3113) {
					Class234.method1493(aStringArray1185[--anInt1182],
							(byte) -25);
					return;
				}
				if (i == 3114) {
					anInt1197 -= 2;
					int i_81_ = anIntArray1195[anInt1197];
					int i_82_ = anIntArray1195[anInt1197 + 1];
					String string = aStringArray1185[--anInt1182];
					Class300.method1852(-87, string, "", i_82_, "", "", i_81_);
					return;
				}
				if (i == 3115) {
					anInt1197 -= 11;
					Class118[] class118s = Class239.method1519(-11911);
					Class150[] class150s = Class171.method1124(25992);
					Class11_Sub26.method2670(anIntArray1195[anInt1197 + 8],
							anIntArray1195[anInt1197 + 10], -1870,
							anIntArray1195[anInt1197 + 2],
							anIntArray1195[anInt1197 + 3],
							anIntArray1195[anInt1197 + 5],
							anIntArray1195[anInt1197 + 9],
							anIntArray1195[anInt1197 + 6],
							(class118s[anIntArray1195[anInt1197]]),
							anIntArray1195[anInt1197 + 4],
							(class150s[anIntArray1195[anInt1197 + 1]]),
							anIntArray1195[anInt1197 + 7]);
					return;
				}
			} else if (i < 3300) {
				if (i == 3200) {
					anInt1197 -= 3;
					Class133.method860(256, 255, (byte) 115,
							anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
				if (i == 3201) {
					Class11_Sub6_Sub3.method3575(50, 107,
							anIntArray1195[--anInt1197], 255);
					return;
				}
				if (i == 3202) {
					anInt1197 -= 2;
					Class91_Sub3.method3328(anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197], 255, false);
					return;
				}
				if (i == 3203) {
					anInt1197 -= 4;
					Class133.method860(256, anIntArray1195[anInt1197 + 3],
							(byte) 85, anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
				if (i == 3204) {
					anInt1197 -= 3;
					Class11_Sub6_Sub3.method3575(anIntArray1195[anInt1197 + 2],
							120, anIntArray1195[anInt1197],
							(anIntArray1195[anInt1197 + 1]));
					return;
				}
				if (i == 3205) {
					anInt1197 -= 3;
					Class91_Sub3.method3328(anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197],
							anIntArray1195[anInt1197 + 2], false);
					return;
				}
				if (i == 3206) {
					anInt1197 -= 4;
					Class254.method1630(anIntArray1195[anInt1197], false,
							anIntArray1195[anInt1197 + 1], 256, 9400,
							anIntArray1195[anInt1197 + 3],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
				if (i == 3207) {
					anInt1197 -= 4;
					Class254.method1630(anIntArray1195[anInt1197], true,
							anIntArray1195[anInt1197 + 1], 256, 9400,
							anIntArray1195[anInt1197 + 3],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
				if (i == 3208) {
					anInt1197 -= 5;
					Class133.method860(anIntArray1195[anInt1197 + 4],
							anIntArray1195[anInt1197 + 3], (byte) 29,
							anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
				if (i == 3209) {
					anInt1197 -= 5;
					Class254.method1630(anIntArray1195[anInt1197], false,
							anIntArray1195[anInt1197 + 1],
							anIntArray1195[anInt1197 + 4], 9400,
							anIntArray1195[anInt1197 + 3],
							anIntArray1195[anInt1197 + 2]);
					return;
				}
			} else if (i < 3400) {
				if (i == 3300) {
					anIntArray1195[anInt1197++] = Class11_Sub25.anInt6279;
					return;
				}
				if (i == 3301) {
					anInt1197 -= 2;
					int i_83_ = anIntArray1195[anInt1197];
					int i_84_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class11_Sub2_Sub13
							.method3535((byte) 24, false, i_83_, i_84_);
					return;
				}
				if (i == 3302) {
					anInt1197 -= 2;
					int i_85_ = anIntArray1195[anInt1197];
					int i_86_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class73.method522(false,
							i_85_, -75, i_86_);
					return;
				}
				if (i == 3303) {
					anInt1197 -= 2;
					int i_87_ = anIntArray1195[anInt1197];
					int i_88_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class91_Sub3_Sub1.method3648(
							false, i_87_, i_88_, -122);
					return;
				}
				if (i == 3304) {
					int i_89_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub8) Class1.aClass197_4
							.method1278(i_89_, true)).anInt8816);
					return;
				}
				if (i == 3305) {
					int i_90_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class34.anIntArray459[i_90_];
					return;
				}
				if (i == 3306) {
					int i_91_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class236_Sub5.anIntArray6854[i_91_];
					return;
				}
				if (i == 3307) {
					int i_92_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class301.anIntArray4061[i_92_];
					return;
				}
				if (i == 3308) {
					int i_93_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047);
					int i_94_ = ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045 >> 9) + Class194.anInt2641);
					int i_95_ = ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 >> 9) + Class118.anInt1605);
					anIntArray1195[anInt1197++] = (i_93_ << 28) + (i_94_ << 14)
							+ i_95_;
					return;
				}
				if (i == 3309) {
					int i_96_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = i_96_ >> 14 & 0x3fff;
					return;
				}
				if (i == 3310) {
					int i_97_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = i_97_ >> 28;
					return;
				}
				if (i == 3311) {
					int i_98_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = i_98_ & 0x3fff;
					return;
				}
				if (i == 3312) {
					anIntArray1195[anInt1197++] = Class233.aBool3197 ? 1 : 0;
					return;
				}
				if (i == 3313) {
					anInt1197 -= 2;
					int i_99_ = anIntArray1195[anInt1197];
					int i_100_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class11_Sub2_Sub13
							.method3535((byte) 24, true, i_99_, i_100_);
					return;
				}
				if (i == 3314) {
					anInt1197 -= 2;
					int i_101_ = anIntArray1195[anInt1197];
					int i_102_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class73.method522(true,
							i_101_, -127, i_102_);
					return;
				}
				if (i == 3315) {
					anInt1197 -= 2;
					int i_103_ = anIntArray1195[anInt1197];
					int i_104_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class91_Sub3_Sub1.method3648(
							true, i_103_, i_104_, -77);
					return;
				}
				if (i == 3316) {
					if (Class256_Sub2.anInt7713 >= 2)
						anIntArray1195[anInt1197++] = Class256_Sub2.anInt7713;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3317) {
					anIntArray1195[anInt1197++] = Class334.anInt4423;
					return;
				}
				if (i == 3318) {
					anIntArray1195[anInt1197++] = ((Class46) Class275.aClass46_3705).anInt730;
					return;
				}
				if (i == 3321) {
					anIntArray1195[anInt1197++] = Class219_Sub1.RUN_ENERGY;
					return;
				}
				if (i == 3322) {
					anIntArray1195[anInt1197++] = Class11_Sub48.anInt8000;
					return;
				}
				if (i == 3323) {
					if (Class193.anInt2634 >= 5 && Class193.anInt2634 <= 9)
						anIntArray1195[anInt1197++] = 1;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3324) {
					if (Class193.anInt2634 >= 5 && Class193.anInt2634 <= 9)
						anIntArray1195[anInt1197++] = Class193.anInt2634;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3325) {
					anIntArray1195[anInt1197++] = Class240.aBool3259 ? 1 : 0;
					return;
				}
				if (i == 3326) {
					anIntArray1195[anInt1197++] = ((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389;
					return;
				}
				if (i == 3327) {
					anIntArray1195[anInt1197++] = ((((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418) != null && ((Class258) (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)).aBool3533) ? 1
							: 0;
					return;
				}
				if (i == 3329) {
					anIntArray1195[anInt1197++] = Class100.aBool1328 ? 1 : 0;
					return;
				}
				if (i == 3330) {
					int i_105_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class288.method1779(false,
							(byte) 99, i_105_);
					return;
				}
				if (i == 3331) {
					anInt1197 -= 2;
					int i_106_ = anIntArray1195[anInt1197];
					int i_107_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class285.method1758(i_107_,
							-2705, false, false, i_106_);
					return;
				}
				if (i == 3332) {
					anInt1197 -= 2;
					int i_108_ = anIntArray1195[anInt1197];
					int i_109_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = Class285.method1758(i_109_,
							-2705, false, true, i_108_);
					return;
				}
				if (i == 3333) {
					anIntArray1195[anInt1197++] = Class108_Sub23.anInt7766;
					return;
				}
				if (i == 3335) {
					anIntArray1195[anInt1197++] = Class11_Sub45_Sub1_Sub2.anInt9884;
					return;
				}
				if (i == 3336) {
					anInt1197 -= 4;
					int i_110_ = anIntArray1195[anInt1197];
					int i_111_ = anIntArray1195[anInt1197 + 1];
					int i_112_ = anIntArray1195[anInt1197 + 2];
					int i_113_ = anIntArray1195[anInt1197 + 3];
					i_110_ += i_111_ << 14;
					i_110_ += i_112_ << 28;
					i_110_ += i_113_;
					anIntArray1195[anInt1197++] = i_110_;
					return;
				}
				if (i == 3337) {
					anIntArray1195[anInt1197++] = Class53.anInt817;
					return;
				}
				if (i == 3338) {
					anIntArray1195[anInt1197++] = Stream.method2542(107);
					return;
				}
				if (i == 3339) {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				if (i == 3340) {
					anIntArray1195[anInt1197++] = Class11_Sub12_Sub4.aBool9452 ? 1
							: 0;
					return;
				}
				if (i == 3341) {
					anIntArray1195[anInt1197++] = Class91_Sub1.aBool6936 ? 1
							: 0;
					return;
				}
				if (i == 3342) {
					anIntArray1195[anInt1197++] = Class280.aClass225_3786
							.method1449(-89);
					return;
				}
				if (i == 3343) {
					anIntArray1195[anInt1197++] = Class280.aClass225_3786
							.method1448((byte) -63);
					return;
				}
				if (i == 3344) {
					aStringArray1185[anInt1182++] = Class191.method1241(122);
					return;
				}
				if (i == 3345) {
					aStringArray1185[anInt1182++] = Class236_Sub8
							.method2878(false);
					return;
				}
				if (i == 3346) {
					anIntArray1195[anInt1197++] = Class108_Sub18.method2805(76);
					return;
				}
				if (i == 3347) {
					anIntArray1195[anInt1197++] = Class274.anInt3694;
					return;
				}
				if (i == 3349) {
					anIntArray1195[anInt1197++] = ((Actor) (Class11_Sub2_Sub8.myPlayer)).aClass173_10278
							.method1140(-1) >> 3;
					return;
				}
			} else if (i < 3500) {
				if (i == 3400) {
					anInt1197 -= 2;
					int i_114_ = anIntArray1195[anInt1197];
					int i_115_ = anIntArray1195[anInt1197 + 1];
					Class20 class20 = Class11_Sub35_Sub1.aClass374_9125
							.method2201(i_114_, 109);
					aStringArray1185[anInt1182++] = class20.method172(-27058,
							i_115_);
					return;
				}
				if (i == 3408) {
					anInt1197 -= 4;
					int i_116_ = anIntArray1195[anInt1197];
					int i_117_ = anIntArray1195[anInt1197 + 1];
					int i_118_ = anIntArray1195[anInt1197 + 2];
					int i_119_ = anIntArray1195[anInt1197 + 3];
					Class20 class20 = Class11_Sub35_Sub1.aClass374_9125
							.method2201(i_118_, 108);
					if (((Class20) class20).aChar170 != i_116_
							|| ((Class20) class20).aChar166 != i_117_)
						throw new RuntimeException("C3408-1");
					if (i_117_ == 115)
						aStringArray1185[anInt1182++] = class20.method172(
								-27058, i_119_);
					else {
						anIntArray1195[anInt1197++] = class20.method175(90,
								i_119_);
						return;
					}
					return;
				}
				if (i == 3409) {
					anInt1197 -= 3;
					int i_120_ = anIntArray1195[anInt1197];
					int i_121_ = anIntArray1195[anInt1197 + 1];
					int i_122_ = anIntArray1195[anInt1197 + 2];
					if (i_121_ == -1)
						throw new RuntimeException("C3409-2");
					Class20 class20 = Class11_Sub35_Sub1.aClass374_9125
							.method2201(i_121_, 114);
					if (((Class20) class20).aChar166 != i_120_)
						throw new RuntimeException("C3409-1");
					anIntArray1195[anInt1197++] = class20.method167(i_122_,
							(byte) 98) ? 1 : 0;
					return;
				}
				if (i == 3410) {
					int i_123_ = anIntArray1195[--anInt1197];
					String string = aStringArray1185[--anInt1182];
					if (i_123_ == -1)
						throw new RuntimeException("C3410-2");
					Class20 class20 = Class11_Sub35_Sub1.aClass374_9125
							.method2201(i_123_, 94);
					if (((Class20) class20).aChar166 != 's')
						throw new RuntimeException("C3410-1");
					anIntArray1195[anInt1197++] = class20
							.method173(string, 118) ? 1 : 0;
					return;
				}
				if (i == 3411) {
					int i_124_ = anIntArray1195[--anInt1197];
					Class20 class20 = Class11_Sub35_Sub1.aClass374_9125
							.method2201(i_124_, 100);
					anIntArray1195[anInt1197++] = ((Class20) class20).aClass213_164
							.method1366(63);
					return;
				}
			} else if (i < 3700) {
				if (i == 3600) {
					if (Class12_Sub1.anInt5159 == 0)
						anIntArray1195[anInt1197++] = -2;
					else {
						if (Class12_Sub1.anInt5159 == 1)
							anIntArray1195[anInt1197++] = -1;
						else {
							anIntArray1195[anInt1197++] = Class94_Sub1.anInt5228;
							return;
						}
						return;
					}
					return;
				}
				if (i == 3601) {
					int i_125_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 == 2
							&& i_125_ < Class94_Sub1.anInt5228) {
						aStringArray1185[anInt1182++] = Class109.aStringArray1476[i_125_];
						if (Class137.aStringArray1882[i_125_] != null)
							aStringArray1185[anInt1182++] = Class137.aStringArray1882[i_125_];
						else
							aStringArray1185[anInt1182++] = "";
					} else {
						aStringArray1185[anInt1182++] = "";
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3602) {
					int i_126_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 == 2
							&& i_126_ < Class94_Sub1.anInt5228)
						anIntArray1195[anInt1197++] = Class326.anIntArray4337[i_126_];
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3603) {
					int i_127_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 == 2
							&& i_127_ < Class94_Sub1.anInt5228)
						anIntArray1195[anInt1197++] = Class101.anIntArray1351[i_127_];
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3604) {
					String string = aStringArray1185[--anInt1182];
					int i_128_ = anIntArray1195[--anInt1197];
					Stream.method2524(string, i_128_, (byte) 52);
					return;
				}
				if (i == 3605) {
					String string = aStringArray1185[--anInt1182];
					Class344.method2083(-1, string);
					return;
				}
				if (i == 3606) {
					String string = aStringArray1185[--anInt1182];
					Class360.method2141(string, (byte) -96);
					return;
				}
				if (i == 3607) {
					String string = aStringArray1185[--anInt1182];
					Class112.method749(false, string, (byte) -43);
					return;
				}
				if (i == 3608) {
					String string = aStringArray1185[--anInt1182];
					Class232.method1485(0, string);
					return;
				}
				if (i == 3609) {
					String string = aStringArray1185[--anInt1182];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray1195[anInt1197++] = Class16.method156(string, 0) ? 1
							: 0;
					return;
				}
				if (i == 3610) {
					int i_129_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 == 2
							&& i_129_ < Class94_Sub1.anInt5228)
						aStringArray1185[anInt1182++] = Class285.aStringArray3844[i_129_];
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3611) {
					if (Class7.aString44 != null)
						aStringArray1185[anInt1182++] = Class251_Sub2
								.method2382(false, Class7.aString44);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3612) {
					if (Class7.aString44 != null)
						anIntArray1195[anInt1197++] = Class1_Sub1.anInt7124;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3613) {
					int i_130_ = anIntArray1195[--anInt1197];
					if (Class7.aString44 != null
							&& i_130_ < Class1_Sub1.anInt7124)
						aStringArray1185[anInt1182++] = (((Class92) Class81.aClass92Array1096[i_130_]).aString1241);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3614) {
					int i_131_ = anIntArray1195[--anInt1197];
					if (Class7.aString44 != null
							&& i_131_ < Class1_Sub1.anInt7124)
						anIntArray1195[anInt1197++] = (((Class92) Class81.aClass92Array1096[i_131_]).anInt1239);
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3615) {
					int i_132_ = anIntArray1195[--anInt1197];
					if (Class7.aString44 != null
							&& i_132_ < Class1_Sub1.anInt7124)
						anIntArray1195[anInt1197++] = (((Class92) Class81.aClass92Array1096[i_132_]).aByte1240);
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3616) {
					anIntArray1195[anInt1197++] = Class234.aByte3207;
					return;
				}
				if (i == 3617) {
					String string = aStringArray1185[--anInt1182];
					Class11_Sub25.method2661(string, -59);
					return;
				}
				if (i == 3618) {
					anIntArray1195[anInt1197++] = Class11_Sub43.aByte7339;
					return;
				}
				if (i == 3619) {
					String string = aStringArray1185[--anInt1182];
					Class53.method442(string, 101);
					return;
				}
				if (i == 3620) {
					Class124.method815((byte) -79);
					return;
				}
				if (i == 3621) {
					if (Class12_Sub1.anInt5159 == 0)
						anIntArray1195[anInt1197++] = -1;
					else {
						anIntArray1195[anInt1197++] = Class231.anInt3168;
						return;
					}
					return;
				}
				if (i == 3622) {
					int i_133_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 != 0
							&& i_133_ < Class231.anInt3168) {
						aStringArray1185[anInt1182++] = Class11_Sub2_Sub16.aStringArray9034[i_133_];
						if (Class345.aStringArray4584[i_133_] != null)
							aStringArray1185[anInt1182++] = Class345.aStringArray4584[i_133_];
						else
							aStringArray1185[anInt1182++] = "";
					} else {
						aStringArray1185[anInt1182++] = "";
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3623) {
					String string = aStringArray1185[--anInt1182];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray1195[anInt1197++] = Class11_Sub26.method2671(
							string, (byte) 99) ? 1 : 0;
					return;
				}
				if (i == 3624) {
					int i_134_ = anIntArray1195[--anInt1197];
					if (Class81.aClass92Array1096 != null
							&& i_134_ < Class1_Sub1.anInt7124
							&& (((Class92) Class81.aClass92Array1096[i_134_]).aString1243
									.equalsIgnoreCase(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400)))
						anIntArray1195[anInt1197++] = 1;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3625) {
					if (Class11_Sub2_Sub25.aString9332 != null)
						aStringArray1185[anInt1182++] = Class11_Sub2_Sub25.aString9332;
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3626) {
					int i_135_ = anIntArray1195[--anInt1197];
					if (Class7.aString44 != null
							&& i_135_ < Class1_Sub1.anInt7124)
						aStringArray1185[anInt1182++] = (((Class92) Class81.aClass92Array1096[i_135_]).aString1245);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3627) {
					int i_136_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 == 2 && i_136_ >= 0
							&& i_136_ < Class94_Sub1.anInt5228)
						anIntArray1195[anInt1197++] = Class376_Sub8.aBoolArray7757[i_136_] ? 1
								: 0;
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 3628) {
					String string = aStringArray1185[--anInt1182];
					if (string.startsWith("<img=0>")
							|| string.startsWith("<img=1>"))
						string = string.substring(7);
					anIntArray1195[anInt1197++] = Class280.method1725(string,
							-125);
					return;
				}
				if (i == 3629) {
					anIntArray1195[anInt1197++] = Class372.anInt4875;
					return;
				}
				if (i == 3630) {
					String string = aStringArray1185[--anInt1182];
					Class112.method749(true, string, (byte) -43);
					return;
				}
				if (i == 3631) {
					int i_137_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class313.aBoolArray4159[i_137_] ? 1
							: 0;
					return;
				}
				if (i == 3632) {
					int i_138_ = anIntArray1195[--anInt1197];
					if (Class7.aString44 != null
							&& i_138_ < Class1_Sub1.anInt7124)
						aStringArray1185[anInt1182++] = (((Class92) Class81.aClass92Array1096[i_138_]).aString1243);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 3633) {
					int i_139_ = anIntArray1195[--anInt1197];
					if (Class12_Sub1.anInt5159 != 0
							&& i_139_ < Class231.anInt3168)
						aStringArray1185[anInt1182++] = Class335_Sub3_Sub1.aStringArray9416[i_139_];
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
			} else if (i < 4000) {
				if (i == 3903) {
					int i_140_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class254_Sub2.aClass111Array6987[i_140_]
							.method743(-81);
					return;
				}
				if (i == 3904) {
					int i_141_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class111) Class254_Sub2.aClass111Array6987[i_141_]).anInt1523;
					return;
				}
				if (i == 3905) {
					int i_142_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class111) Class254_Sub2.aClass111Array6987[i_142_]).anInt1520;
					return;
				}
				if (i == 3906) {
					int i_143_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class111) Class254_Sub2.aClass111Array6987[i_143_]).anInt1513;
					return;
				}
				if (i == 3907) {
					int i_144_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class111) Class254_Sub2.aClass111Array6987[i_144_]).anInt1518;
					return;
				}
				if (i == 3908) {
					int i_145_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class111) Class254_Sub2.aClass111Array6987[i_145_]).anInt1519;
					return;
				}
				if (i == 3910) {
					int i_146_ = anIntArray1195[--anInt1197];
					int i_147_ = Class254_Sub2.aClass111Array6987[i_146_]
							.method748(4095);
					anIntArray1195[anInt1197++] = i_147_ == 0 ? 1 : 0;
					return;
				}
				if (i == 3911) {
					int i_148_ = anIntArray1195[--anInt1197];
					int i_149_ = Class254_Sub2.aClass111Array6987[i_148_]
							.method748(4095);
					anIntArray1195[anInt1197++] = i_149_ == 2 ? 1 : 0;
					return;
				}
				if (i == 3912) {
					int i_150_ = anIntArray1195[--anInt1197];
					int i_151_ = Class254_Sub2.aClass111Array6987[i_150_]
							.method748(4095);
					anIntArray1195[anInt1197++] = i_151_ == 5 ? 1 : 0;
					return;
				}
				if (i == 3913) {
					int i_152_ = anIntArray1195[--anInt1197];
					int i_153_ = Class254_Sub2.aClass111Array6987[i_152_]
							.method748(4095);
					anIntArray1195[anInt1197++] = i_153_ == 1 ? 1 : 0;
					return;
				}
			} else if (i < 4100) {
				if (i == 4000) {
					anInt1197 -= 2;
					int i_154_ = anIntArray1195[anInt1197];
					int i_155_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_154_ + i_155_;
					return;
				}
				if (i == 4001) {
					anInt1197 -= 2;
					int i_156_ = anIntArray1195[anInt1197];
					int i_157_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_156_ - i_157_;
					return;
				}
				if (i == 4002) {
					anInt1197 -= 2;
					int i_158_ = anIntArray1195[anInt1197];
					int i_159_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_158_ * i_159_;
					return;
				}
				if (i == 4003) {
					anInt1197 -= 2;
					int i_160_ = anIntArray1195[anInt1197];
					int i_161_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_160_ / i_161_;
					return;
				}
				if (i == 4004) {
					int i_162_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (int) (Math.random() * (double) i_162_);
					return;
				}
				if (i == 4005) {
					int i_163_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (int) (Math.random() * (double) (i_163_ + 1));
					return;
				}
				if (i == 4006) {
					anInt1197 -= 5;
					int i_164_ = anIntArray1195[anInt1197];
					int i_165_ = anIntArray1195[anInt1197 + 1];
					int i_166_ = anIntArray1195[anInt1197 + 2];
					int i_167_ = anIntArray1195[anInt1197 + 3];
					int i_168_ = anIntArray1195[anInt1197 + 4];
					anIntArray1195[anInt1197++] = i_164_
							+ ((i_165_ - i_164_) * (i_168_ - i_166_) / (i_167_ - i_166_));
					return;
				}
				if (i == 4007) {
					anInt1197 -= 2;
					long l = (long) anIntArray1195[anInt1197];
					long l_169_ = (long) anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = (int) (l + l * l_169_ / 100L);
					return;
				}
				if (i == 4008) {
					anInt1197 -= 2;
					int i_170_ = anIntArray1195[anInt1197];
					int i_171_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_170_ | 1 << i_171_;
					return;
				}
				if (i == 4009) {
					anInt1197 -= 2;
					int i_172_ = anIntArray1195[anInt1197];
					int i_173_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_172_ & -1 - (1 << i_173_);
					return;
				}
				if (i == 4010) {
					anInt1197 -= 2;
					int i_174_ = anIntArray1195[anInt1197];
					int i_175_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = (i_174_ & 1 << i_175_) != 0 ? 1
							: 0;
					return;
				}
				if (i == 4011) {
					anInt1197 -= 2;
					int i_176_ = anIntArray1195[anInt1197];
					int i_177_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_176_ % i_177_;
					return;
				}
				if (i == 4012) {
					anInt1197 -= 2;
					int i_178_ = anIntArray1195[anInt1197];
					int i_179_ = anIntArray1195[anInt1197 + 1];
					if (i_178_ == 0)
						anIntArray1195[anInt1197++] = 0;
					else {
						anIntArray1195[anInt1197++] = (int) Math.pow(
								(double) i_178_, (double) i_179_);
						return;
					}
					return;
				}
				if (i == 4013) {
					anInt1197 -= 2;
					int i_180_ = anIntArray1195[anInt1197];
					int i_181_ = anIntArray1195[anInt1197 + 1];
					if (i_180_ == 0)
						anIntArray1195[anInt1197++] = 0;
					else {
						if (i_181_ == 0)
							anIntArray1195[anInt1197++] = 2147483647;
						else {
							anIntArray1195[anInt1197++] = (int) Math.pow(
									(double) i_180_, 1.0 / (double) i_181_);
							return;
						}
						return;
					}
					return;
				}
				if (i == 4014) {
					anInt1197 -= 2;
					int i_182_ = anIntArray1195[anInt1197];
					int i_183_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_182_ & i_183_;
					return;
				}
				if (i == 4015) {
					anInt1197 -= 2;
					int i_184_ = anIntArray1195[anInt1197];
					int i_185_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_184_ | i_185_;
					return;
				}
				if (i == 4016) {
					anInt1197 -= 2;
					int i_186_ = anIntArray1195[anInt1197];
					int i_187_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_186_ < i_187_ ? i_186_
							: i_187_;
					return;
				}
				if (i == 4017) {
					anInt1197 -= 2;
					int i_188_ = anIntArray1195[anInt1197];
					int i_189_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = i_188_ > i_189_ ? i_188_
							: i_189_;
					return;
				}
				if (i == 4018) {
					anInt1197 -= 3;
					long l = (long) anIntArray1195[anInt1197];
					long l_190_ = (long) anIntArray1195[anInt1197 + 1];
					long l_191_ = (long) anIntArray1195[anInt1197 + 2];
					anIntArray1195[anInt1197++] = (int) (l * l_191_ / l_190_);
					return;
				}
				if (i == 4019) {
					anInt1197 -= 2;
					int i_192_ = anIntArray1195[anInt1197];
					int i_193_ = anIntArray1195[anInt1197 + 1];
					if (i_192_ > 700 || i_193_ > 700)
						anIntArray1195[anInt1197++] = 256;
					double d = ((Math.random() * (double) (i_193_ + i_192_)
							- (double) i_192_ + 800.0) / 100.0);
					anIntArray1195[anInt1197++] = (int) (Math.pow(2.0, d) + 0.5);
					return;
				}
			} else if (i < 4200) {
				if (i == 4100) {
					String string = aStringArray1185[--anInt1182];
					int i_194_ = anIntArray1195[--anInt1197];
					aStringArray1185[anInt1182++] = string + i_194_;
					return;
				}
				if (i == 4101) {
					anInt1182 -= 2;
					String string = aStringArray1185[anInt1182];
					String string_195_ = aStringArray1185[anInt1182 + 1];
					aStringArray1185[anInt1182++] = string + string_195_;
					return;
				}
				if (i == 4102) {
					String string = aStringArray1185[--anInt1182];
					int i_196_ = anIntArray1195[--anInt1197];
					aStringArray1185[anInt1182++] = string
							+ Class216.method1386(-9165, i_196_, true);
					return;
				}
				if (i == 4103) {
					String string = aStringArray1185[--anInt1182];
					aStringArray1185[anInt1182++] = string.toLowerCase();
					return;
				}
				if (i == 4104) {
					aStringArray1185[anInt1182++] = method604(anIntArray1195[--anInt1197]);
					return;
				}
				if (i == 4105) {
					anInt1182 -= 2;
					String string = aStringArray1185[anInt1182];
					String string_197_ = aStringArray1185[anInt1182 + 1];
					if ((((Player) Class11_Sub2_Sub8.myPlayer).aClass258_10418) != null
							&& ((Class258) (((Player) (Class11_Sub2_Sub8.myPlayer)).aClass258_10418)).aBool3533)
						aStringArray1185[anInt1182++] = string_197_;
					else {
						aStringArray1185[anInt1182++] = string;
						return;
					}
					return;
				}
				if (i == 4106) {
					int i_198_ = anIntArray1195[--anInt1197];
					aStringArray1185[anInt1182++] = Integer.toString(i_198_);
					return;
				}
				if (i == 4107) {
					anInt1182 -= 2;
					anIntArray1195[anInt1197++] = (Class11_Sub45_Sub20_Sub1
							.method3894(-1, Class11_Sub45_Sub1_Sub2.anInt9884,
									aStringArray1185[anInt1182],
									aStringArray1185[anInt1182 + 1]));
					return;
				}
				if (i == 4108) {
					String string = aStringArray1185[--anInt1182];
					anInt1197 -= 2;
					int i_199_ = anIntArray1195[anInt1197];
					int i_200_ = anIntArray1195[anInt1197 + 1];
					Class292 class292 = Class193.method1264((byte) -70, 0,
							Class11_Sub18.aClass146_5781, i_200_);
					anIntArray1195[anInt1197++] = class292.method1813(
							(byte) -48, string,
							(Class376_Sub7_Sub1_Sub1.aClass253Array10081),
							i_199_);
					return;
				}
				if (i == 4109) {
					String string = aStringArray1185[--anInt1182];
					anInt1197 -= 2;
					int i_201_ = anIntArray1195[anInt1197];
					int i_202_ = anIntArray1195[anInt1197 + 1];
					Class292 class292 = Class193.method1264((byte) -74, 0,
							Class11_Sub18.aClass146_5781, i_202_);
					anIntArray1195[anInt1197++] = class292.method1811(174,
							i_201_, string,
							(Class376_Sub7_Sub1_Sub1.aClass253Array10081));
					return;
				}
				if (i == 4110) {
					anInt1182 -= 2;
					String string = aStringArray1185[anInt1182];
					String string_203_ = aStringArray1185[anInt1182 + 1];
					if (anIntArray1195[--anInt1197] == 1)
						aStringArray1185[anInt1182++] = string;
					else {
						aStringArray1185[anInt1182++] = string_203_;
						return;
					}
					return;
				}
				if (i == 4111) {
					String string = aStringArray1185[--anInt1182];
					aStringArray1185[anInt1182++] = IComponentDefinitions
							.method1260(string, 0);
					return;
				}
				if (i == 4112) {
					String string = aStringArray1185[--anInt1182];
					int i_204_ = anIntArray1195[--anInt1197];
					if (i_204_ == -1)
						throw new RuntimeException("null char");
					aStringArray1185[anInt1182++] = string + (char) i_204_;
					return;
				}
				if (i == 4113) {
					int i_205_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = method599((char) i_205_);
					return;
				}
				if (i == 4114) {
					int i_206_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class236_Sub6.method2823(
							(char) i_206_, -98) ? 1 : 0;
					return;
				}
				if (i == 4115) {
					int i_207_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (Class163_Sub2.method3029(
							(char) i_207_, (byte) -62) ? 1 : 0);
					return;
				}
				if (i == 4116) {
					int i_208_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Class140.method886(
							(char) i_208_, 1000) ? 1 : 0;
					return;
				}
				if (i == 4117) {
					String string = aStringArray1185[--anInt1182];
					if (string != null)
						anIntArray1195[anInt1197++] = string.length();
					else {
						anIntArray1195[anInt1197++] = 0;
						return;
					}
					return;
				}
				if (i == 4118) {
					String string = aStringArray1185[--anInt1182];
					anInt1197 -= 2;
					int i_209_ = anIntArray1195[anInt1197];
					int i_210_ = anIntArray1195[anInt1197 + 1];
					aStringArray1185[anInt1182++] = string.substring(i_209_,
							i_210_);
					return;
				}
				if (i == 4119) {
					String string = aStringArray1185[--anInt1182];
					StringBuffer stringbuffer = new StringBuffer(
							string.length());
					boolean bool_211_ = false;
					for (int i_212_ = 0; i_212_ < string.length(); i_212_++) {
						char c = string.charAt(i_212_);
						if (c == '<')
							bool_211_ = true;
						else if (c == '>')
							bool_211_ = false;
						else if (!bool_211_)
							stringbuffer.append(c);
					}
					aStringArray1185[anInt1182++] = stringbuffer.toString();
					return;
				}
				if (i == 4120) {
					String string = aStringArray1185[--anInt1182];
					anInt1197 -= 2;
					int i_213_ = anIntArray1195[anInt1197];
					int i_214_ = anIntArray1195[anInt1197 + 1];
					anIntArray1195[anInt1197++] = string
							.indexOf(i_213_, i_214_);
					return;
				}
				if (i == 4121) {
					anInt1182 -= 2;
					String string = aStringArray1185[anInt1182];
					String string_215_ = aStringArray1185[anInt1182 + 1];
					int i_216_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = string.indexOf(string_215_,
							i_216_);
					return;
				}
				if (i == 4122) {
					int i_217_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Character
							.toLowerCase((char) i_217_);
					return;
				}
				if (i == 4123) {
					int i_218_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = Character
							.toUpperCase((char) i_218_);
					return;
				}
				if (i == 4124) {
					boolean bool_219_ = anIntArray1195[--anInt1197] != 0;
					int i_220_ = anIntArray1195[--anInt1197];
					aStringArray1185[anInt1182++] = Class142
							.method897((byte) 91, bool_219_,
									Class11_Sub45_Sub1_Sub2.anInt9884,
									(long) i_220_, 0);
					return;
				}
				if (i == 4125) {
					String string = aStringArray1185[--anInt1182];
					int i_221_ = anIntArray1195[--anInt1197];
					Class292 class292 = Class193.method1264((byte) -89, 0,
							Class11_Sub18.aClass146_5781, i_221_);
					anIntArray1195[anInt1197++] = class292.method1804(
							(Class376_Sub7_Sub1_Sub1.aClass253Array10081), 13,
							string);
					return;
				}
			} else if (i < 4300) {
				if (i == 4200) {
					int i_222_ = anIntArray1195[--anInt1197];
					aStringArray1185[anInt1182++] = (((Class249) Packet.aClass223_8723
							.method1430(i_222_, false)).aString3359);
					return;
				}
				if (i == 4201) {
					anInt1197 -= 2;
					int i_223_ = anIntArray1195[anInt1197];
					int i_224_ = anIntArray1195[anInt1197 + 1];
					Class249 class249 = Packet.aClass223_8723.method1430(
							i_223_, false);
					if (i_224_ >= 1
							&& i_224_ <= 5
							&& (((Class249) class249).aStringArray3360[i_224_ - 1] != null))
						aStringArray1185[anInt1182++] = (((Class249) class249).aStringArray3360[i_224_ - 1]);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 4202) {
					anInt1197 -= 2;
					int i_225_ = anIntArray1195[anInt1197];
					int i_226_ = anIntArray1195[anInt1197 + 1];
					Class249 class249 = Packet.aClass223_8723.method1430(
							i_225_, false);
					if (i_226_ >= 1
							&& i_226_ <= 5
							&& (((Class249) class249).aStringArray3426[i_226_ - 1] != null))
						aStringArray1185[anInt1182++] = (((Class249) class249).aStringArray3426[i_226_ - 1]);
					else {
						aStringArray1185[anInt1182++] = "";
						return;
					}
					return;
				}
				if (i == 4203) {
					int i_227_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (((Class249) Packet.aClass223_8723
							.method1430(i_227_, false)).anInt3390);
					return;
				}
				if (i == 4204) {
					int i_228_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (((Class249) Packet.aClass223_8723
							.method1430(i_228_, false)).anInt3416) == 1 ? 1 : 0;
					return;
				}
				if (i == 4205) {
					int i_229_ = anIntArray1195[--anInt1197];
					Class249 class249 = Packet.aClass223_8723.method1430(
							i_229_, false);
					if (((Class249) class249).anInt3389 == -1
							&& ((Class249) class249).anInt3395 >= 0)
						anIntArray1195[anInt1197++] = ((Class249) class249).anInt3395;
					else {
						anIntArray1195[anInt1197++] = i_229_;
						return;
					}
					return;
				}
				if (i == 4206) {
					int i_230_ = anIntArray1195[--anInt1197];
					Class249 class249 = Packet.aClass223_8723.method1430(
							i_230_, false);
					if (((Class249) class249).anInt3389 >= 0
							&& ((Class249) class249).anInt3395 >= 0)
						anIntArray1195[anInt1197++] = ((Class249) class249).anInt3395;
					else {
						anIntArray1195[anInt1197++] = i_230_;
						return;
					}
					return;
				}
				if (i == 4207) {
					int i_231_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (((Class249) Packet.aClass223_8723
							.method1430(i_231_, false)).aBool3374) ? 1 : 0;
					return;
				}
				if (i == 4208) {
					anInt1197 -= 2;
					int i_232_ = anIntArray1195[anInt1197];
					int i_233_ = anIntArray1195[anInt1197 + 1];
					Class283 class283 = Class187.aClass52_2388.method432(
							i_233_, (byte) -124);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = (Packet.aClass223_8723
								.method1430(i_232_, false).method1589(i_233_,
								(byte) -90, ((Class283) class283).aString3833));
					else {
						anIntArray1195[anInt1197++] = (Packet.aClass223_8723
								.method1430(i_232_, false).method1593(
								((Class283) class283).anInt3827, i_233_, 83));
						return;
					}
					return;
				}
				if (i == 4209) {
					anInt1197 -= 2;
					int i_234_ = anIntArray1195[anInt1197];
					int i_235_ = anIntArray1195[anInt1197 + 1] - 1;
					Class249 class249 = Packet.aClass223_8723.method1430(
							i_234_, false);
					if (((Class249) class249).anInt3404 == i_235_)
						anIntArray1195[anInt1197++] = ((Class249) class249).anInt3434;
					else {
						if (((Class249) class249).anInt3377 == i_235_)
							anIntArray1195[anInt1197++] = ((Class249) class249).anInt3427;
						else {
							anIntArray1195[anInt1197++] = -1;
							return;
						}
						return;
					}
					return;
				}
				if (i == 4210) {
					String string = aStringArray1185[--anInt1182];
					int i_236_ = anIntArray1195[--anInt1197];
					Class225.method1442(17936, string, i_236_ == 1);
					anIntArray1195[anInt1197++] = Class10.anInt81;
					return;
				}
				if (i == 4211) {
					if (Class177.aShortArray2249 == null
							|| Class299.anInt4041 >= Class10.anInt81)
						anIntArray1195[anInt1197++] = -1;
					else {
						anIntArray1195[anInt1197++] = (Class177.aShortArray2249[Class299.anInt4041++] & 0xffff);
						return;
					}
					return;
				}
				if (i == 4212) {
					Class299.anInt4041 = 0;
					return;
				}
				if (i == 4213) {
					int i_237_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = (((Class249) Packet.aClass223_8723
							.method1430(i_237_, false)).anInt3380);
					return;
				}
				if (i == 4214) {
					String string = aStringArray1185[--anInt1182];
					anInt1197 -= 3;
					int i_238_ = anIntArray1195[anInt1197];
					int i_239_ = anIntArray1195[anInt1197 + 1];
					int i_240_ = anIntArray1195[anInt1197 + 2];
					Class108_Sub15.method2699(string, i_238_ == 1, -93, i_239_,
							i_240_);
					anIntArray1195[anInt1197++] = Class10.anInt81;
					return;
				}
				if (i == 4215) {
					anInt1182 -= 2;
					anInt1197 -= 2;
					String string = aStringArray1185[anInt1182];
					int i_241_ = anIntArray1195[anInt1197];
					int i_242_ = anIntArray1195[anInt1197 + 1];
					String string_243_ = aStringArray1185[anInt1182 + 1];
					Class163.method1030(string, i_242_, 7059, string_243_,
							i_241_ == 1);
					anIntArray1195[anInt1197++] = Class10.anInt81;
					return;
				}
			} else if (i < 4400) {
				if (i == 4300) {
					anInt1197 -= 2;
					int i_244_ = anIntArray1195[anInt1197];
					int i_245_ = anIntArray1195[anInt1197 + 1];
					Class283 class283 = Class187.aClass52_2388.method432(
							i_245_, (byte) -121);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = (Class11_Sub19.aClass318_5817
								.getNPCDefinitions(i_244_, false).method1374(
								41, i_245_, ((Class283) class283).aString3833));
					else {
						anIntArray1195[anInt1197++] = (Class11_Sub19.aClass318_5817
								.getNPCDefinitions(i_244_, false)
								.method1379(i_245_,
										((Class283) class283).anInt3827, -15359));
						return;
					}
					return;
				}
			} else if (i < 4500) {
				if (i == 4400) {
					anInt1197 -= 2;
					int i_246_ = anIntArray1195[anInt1197];
					int i_247_ = anIntArray1195[anInt1197 + 1];
					Class283 class283 = Class187.aClass52_2388.method432(
							i_247_, (byte) -123);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = (Class11_Sub4.aClass290_5237
								.method1793((byte) 125, i_246_).method372(
								((Class283) class283).aString3833, i_247_,
								(byte) 30));
					else {
						anIntArray1195[anInt1197++] = (Class11_Sub4.aClass290_5237
								.method1793((byte) 8, i_246_).method374(i_247_,
								75, ((Class283) class283).anInt3827));
						return;
					}
					return;
				}
			} else if (i < 4600) {
				if (i == 4500) {
					anInt1197 -= 2;
					int i_248_ = anIntArray1195[anInt1197];
					int i_249_ = anIntArray1195[anInt1197 + 1];
					Class283 class283 = Class187.aClass52_2388.method432(
							i_249_, (byte) -109);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = (Class11_Sub35_Sub1.aClass285_9126
								.method1762(false, i_248_).method3357(
								((Class283) class283).aString3833, 3, i_249_));
					else {
						anIntArray1195[anInt1197++] = (Class11_Sub35_Sub1.aClass285_9126
								.method1762(false, i_248_).method3356(
								((Class283) class283).anInt3827, i_249_, 6));
						return;
					}
					return;
				}
			} else if (i < 4700 && i == 4600) {
				int i_250_ = anIntArray1195[--anInt1197];
				Class39 class39 = Class108_Sub26.aClass127_7833.method829(
						i_250_, 64);
				if (((Class39) class39).anIntArray547 != null
						&& ((Class39) class39).anIntArray547.length > 0) {
					int i_251_ = 0;
					int i_252_ = ((Class39) class39).anIntArray544[0];
					for (int i_253_ = 1; i_253_ < ((Class39) class39).anIntArray547.length; i_253_++) {
						if (((Class39) class39).anIntArray544[i_253_] > i_252_) {
							i_251_ = i_253_;
							i_252_ = ((Class39) class39).anIntArray544[i_253_];
						}
					}
					anIntArray1195[anInt1197++] = ((Class39) class39).anIntArray547[i_251_];
				} else {
					anIntArray1195[anInt1197++] = ((Class39) class39).anInt528;
					return;
				}
				return;
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	static final void method606(Class298 class298, int i, int i_254_) {
		Class11_Sub45_Sub6 class11_sub45_sub6 = Class337.method2029(i_254_,
				-122, class298, i);
		if (class11_sub45_sub6 != null) {
			anIntArray1175 = new int[((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8784];
			aStringArray1181 = (new String[((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8785]);
			if ((((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 == Class11_Sub44.aClass298_7788)
					|| (((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 == Class58_Sub2.aClass298_7851)
					|| (((Class11_Sub45_Sub6) class11_sub45_sub6).aClass298_8777 == Class108_Sub2.aClass298_5078)) {
				int i_255_ = 0;
				int i_256_ = 0;
				if (Class333.aClass192_4417 != null) {
					i_255_ = ((IComponentDefinitions) Class333.aClass192_4417).anInt2469;
					i_256_ = ((IComponentDefinitions) Class333.aClass192_4417).anInt2490;
				}
				anIntArray1175[0] = Class280.aClass225_3786.method1449(-95)
						- i_255_;
				anIntArray1175[1] = Class280.aClass225_3786
						.method1448((byte) -63) - i_256_;
			}
			method612(class11_sub45_sub6, 200000);
		}
	}

	private static final void method607(int i) {
		IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
				(byte) -89, i);
		if (class192 != null) {
			int i_257_ = i >>> 16;
			IComponentDefinitions[] class192s = Canvas_Sub1.aClass192ArrayArray9228[i_257_];
			if (class192s == null) {
				IComponentDefinitions[] class192s_258_ = Class11_Sub45_Sub5.aClass192ArrayArray8772[i_257_];
				int i_259_ = class192s_258_.length;
				class192s = Canvas_Sub1.aClass192ArrayArray9228[i_257_] = new IComponentDefinitions[i_259_];
				Class311.method1901(class192s_258_, 0, class192s, 0,
						class192s_258_.length);
			}
			int i_260_;
			for (i_260_ = 0; i_260_ < class192s.length; i_260_++) {
				if (class192s[i_260_] == class192)
					break;
			}
			if (i_260_ < class192s.length) {
				Class311.method1901(class192s, i_260_ + 1, class192s, i_260_,
						class192s.length - i_260_ - 1);
				class192s[class192s.length - 1] = class192;
			}
		}
	}

	private static final void method608(String string, int i) {
		if (Class256_Sub2.anInt7713 != 0
				|| ((!Class11_Sub2_Sub29.aBool9474 || Class242.aBool3289) && !Class100.aBool1328)) {
			String string_261_ = string.toLowerCase();
			int i_262_ = 0;
			if (string_261_.startsWith(Class26.aClass26_323.method217(
					(byte) 87, 0))) {
				i_262_ = 0;
				string = string.substring(Class26.aClass26_323.method217(
						(byte) 97, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_324.method217(
					(byte) 103, 0))) {
				i_262_ = 1;
				string = string.substring(Class26.aClass26_324.method217(
						(byte) 109, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_325.method217(
					(byte) 104, 0))) {
				i_262_ = 2;
				string = string.substring(Class26.aClass26_325.method217(
						(byte) 102, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_326.method217(
					(byte) 98, 0))) {
				i_262_ = 3;
				string = string.substring(Class26.aClass26_326.method217(
						(byte) 99, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_327.method217(
					(byte) 86, 0))) {
				i_262_ = 4;
				string = string.substring(Class26.aClass26_327.method217(
						(byte) 120, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_328.method217(
					(byte) 116, 0))) {
				i_262_ = 5;
				string = string.substring(Class26.aClass26_328.method217(
						(byte) 113, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_329.method217(
					(byte) 121, 0))) {
				i_262_ = 6;
				string = string.substring(Class26.aClass26_329.method217(
						(byte) 123, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_330.method217(
					(byte) 120, 0))) {
				i_262_ = 7;
				string = string.substring(Class26.aClass26_330.method217(
						(byte) 98, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_331.method217(
					(byte) 120, 0))) {
				i_262_ = 8;
				string = string.substring(Class26.aClass26_331.method217(
						(byte) 105, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_332.method217(
					(byte) 123, 0))) {
				i_262_ = 9;
				string = string.substring(Class26.aClass26_332.method217(
						(byte) 115, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_333.method217(
					(byte) 105, 0))) {
				i_262_ = 10;
				string = string.substring(Class26.aClass26_333.method217(
						(byte) 98, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_334.method217(
					(byte) 118, 0))) {
				i_262_ = 11;
				string = string.substring(Class26.aClass26_334.method217(
						(byte) 108, 0).length());
			} else if (Class11_Sub45_Sub1_Sub2.anInt9884 != 0) {
				if (string_261_.startsWith(Class26.aClass26_323.method217(
						(byte) 97, (Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 0;
					string = string.substring(Class26.aClass26_323.method217(
							(byte) 95, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_324
						.method217((byte) 115,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 1;
					string = string.substring(Class26.aClass26_324.method217(
							(byte) 117, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_325
						.method217((byte) 93,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 2;
					string = string.substring(Class26.aClass26_325.method217(
							(byte) 97, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_326
						.method217((byte) 117,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 3;
					string = string.substring(Class26.aClass26_326.method217(
							(byte) 96, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_327
						.method217((byte) 86,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 4;
					string = string.substring(Class26.aClass26_327.method217(
							(byte) 94, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_328
						.method217((byte) 119,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 5;
					string = string.substring(Class26.aClass26_328.method217(
							(byte) 109, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_329
						.method217((byte) 84,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 6;
					string = string.substring(Class26.aClass26_329.method217(
							(byte) 125, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_330
						.method217((byte) 98,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 7;
					string = string.substring(Class26.aClass26_330.method217(
							(byte) 112, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_331
						.method217((byte) 106,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 8;
					string = string.substring(Class26.aClass26_331.method217(
							(byte) 95, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_332
						.method217((byte) 94,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 9;
					string = string.substring(Class26.aClass26_332.method217(
							(byte) 122, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_333
						.method217((byte) 100,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 10;
					string = string.substring(Class26.aClass26_333.method217(
							(byte) 113, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_334
						.method217((byte) 114,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_262_ = 11;
					string = string.substring(Class26.aClass26_334.method217(
							(byte) 120, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				}
			}
			string_261_ = string.toLowerCase();
			int i_263_ = 0;
			if (string_261_.startsWith(Class26.aClass26_335.method217(
					(byte) 94, 0))) {
				i_263_ = 1;
				string = string.substring(Class26.aClass26_335.method217(
						(byte) 99, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_336.method217(
					(byte) 123, 0))) {
				i_263_ = 2;
				string = string.substring(Class26.aClass26_336.method217(
						(byte) 124, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_337.method217(
					(byte) 116, 0))) {
				i_263_ = 3;
				string = string.substring(Class26.aClass26_337.method217(
						(byte) 113, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_338.method217(
					(byte) 86, 0))) {
				i_263_ = 4;
				string = string.substring(Class26.aClass26_338.method217(
						(byte) 96, 0).length());
			} else if (string_261_.startsWith(Class26.aClass26_339.method217(
					(byte) 109, 0))) {
				i_263_ = 5;
				string = string.substring(Class26.aClass26_339.method217(
						(byte) 124, 0).length());
			} else if (Class11_Sub45_Sub1_Sub2.anInt9884 != 0) {
				if (string_261_.startsWith(Class26.aClass26_335.method217(
						(byte) 90, (Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_263_ = 1;
					string = string.substring(Class26.aClass26_335.method217(
							(byte) 92, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_336
						.method217((byte) 124,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_263_ = 2;
					string = string.substring(Class26.aClass26_336.method217(
							(byte) 123, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_337
						.method217((byte) 93,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_263_ = 3;
					string = string.substring(Class26.aClass26_337.method217(
							(byte) 122, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_338
						.method217((byte) 84,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_263_ = 4;
					string = string.substring(Class26.aClass26_338.method217(
							(byte) 111, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				} else if (string_261_.startsWith(Class26.aClass26_339
						.method217((byte) 124,
								(Class11_Sub45_Sub1_Sub2.anInt9884)))) {
					i_263_ = 5;
					string = string.substring(Class26.aClass26_339.method217(
							(byte) 101, (Class11_Sub45_Sub1_Sub2.anInt9884))
							.length());
				}
			}
			anInt1191++;
			Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
					Class11_Sub3.aClass25_5113, Class71.aClass370_998,
					(byte) 52);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					0, -1528071456);
			int i_264_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					i_262_, -1528071456);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397.writeByte(
					i_263_, -1528071456);
			Class376_Sub7_Sub5_Sub2.method3904(string, false,
					(((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397));
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.method2530(
							((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position
									- i_264_, (byte) 108);
			Class79.method541(class11_sub10, -59);
		}
	}

	static final void method609() {
		/* empty */
	}

	static final void method610(Class11_Sub48 class11_sub48) {
		executeScript(class11_sub48, 200000);
	}

	static final void method611(int i, boolean bool) {
		/* empty */
	}

	private static final void method612(Class11_Sub45_Sub6 class11_sub45_sub6,
			int i) {
		anInt1197 = 0;
		anInt1182 = 0;
		int i_265_ = -1;
		int[] is = ((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8783;
		int[] is_266_ = ((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781;
		int i_267_ = -1;
		anInt1174 = 0;
		try {
			int i_268_ = 0;
			for (;;) {
				if (++i_268_ > i)
					throw new RuntimeException("slow");
				i_267_ = is[++i_265_];
				if (i_267_ < 100) {
					if (i_267_ == 0)
						anIntArray1195[anInt1197++] = is_266_[i_265_];
					else if (i_267_ == 1) {
						int i_269_ = is_266_[i_265_];
						anIntArray1195[anInt1197++] = (((Class97) Class11_Sub26.aClass97_6296).anIntArray1294[i_269_]);
					} else if (i_267_ == 2) {
						int i_270_ = is_266_[i_265_];
						Class11_Sub26.aClass97_6296.method657(i_270_,
								(anIntArray1195[--anInt1197]), (byte) -122);
					} else if (i_267_ == 3)
						aStringArray1185[anInt1182++] = (((Class11_Sub45_Sub6) class11_sub45_sub6).aStringArray8775[i_265_]);
					else if (i_267_ == 6)
						i_265_ += is_266_[i_265_];
					else if (i_267_ == 7) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] != anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 8) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] == anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 9) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] < anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 10) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] > anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 21) {
						if (anInt1174 == 0)
							return;
						Class196 class196 = aClass196Array1180[--anInt1174];
						class11_sub45_sub6 = ((Class196) class196).aClass11_Sub45_Sub6_2656;
						is = (((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8783);
						is_266_ = (((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781);
						i_265_ = ((Class196) class196).anInt2660;
						anIntArray1175 = ((Class196) class196).anIntArray2659;
						aStringArray1181 = ((Class196) class196).aStringArray2658;
					} else if (i_267_ == 25) {
						int i_271_ = is_266_[i_265_];
						anIntArray1195[anInt1197++] = Class11_Sub26.aClass97_6296
								.method51(i_271_, 26951);
					} else if (i_267_ == 27) {
						int i_272_ = is_266_[i_265_];
						Class11_Sub26.aClass97_6296.method653(i_272_,
								(anIntArray1195[--anInt1197]), (byte) -104);
					} else if (i_267_ == 31) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] <= anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 32) {
						anInt1197 -= 2;
						if (anIntArray1195[anInt1197] >= anIntArray1195[anInt1197 + 1])
							i_265_ += is_266_[i_265_];
					} else if (i_267_ == 33)
						anIntArray1195[anInt1197++] = anIntArray1175[is_266_[i_265_]];
					else if (i_267_ == 34)
						anIntArray1175[is_266_[i_265_]] = anIntArray1195[--anInt1197];
					else if (i_267_ == 35)
						aStringArray1185[anInt1182++] = aStringArray1181[is_266_[i_265_]];
					else if (i_267_ == 36)
						aStringArray1181[is_266_[i_265_]] = aStringArray1185[--anInt1182];
					else if (i_267_ == 37) {
						int i_273_ = is_266_[i_265_];
						anInt1182 -= i_273_;
						String string = Class55.method447(-106, i_273_,
								aStringArray1185, anInt1182);
						aStringArray1185[anInt1182++] = string;
					} else if (i_267_ == 38)
						anInt1197--;
					else if (i_267_ == 39)
						anInt1182--;
					else if (i_267_ == 40) {
						int i_274_ = is_266_[i_265_];
						Class11_Sub45_Sub6 class11_sub45_sub6_275_ = Class63
								.method479((byte) -96, i_274_);
						if (class11_sub45_sub6_275_ == null)
							throw new RuntimeException();
						int[] is_276_ = (new int[(((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8784)]);
						String[] strings = (new String[(((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8785)]);
						for (int i_277_ = 0; (i_277_ < (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8778)); i_277_++)
							is_276_[i_277_] = (anIntArray1195[anInt1197
									- (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8778)
									+ i_277_]);
						for (int i_278_ = 0; (i_278_ < (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8776)); i_278_++)
							strings[i_278_] = (aStringArray1185[anInt1182
									- (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8776)
									+ i_278_]);
						anInt1197 -= (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8778);
						anInt1182 -= (((Class11_Sub45_Sub6) class11_sub45_sub6_275_).anInt8776);
						Class196 class196 = new Class196();
						((Class196) class196).aClass11_Sub45_Sub6_2656 = class11_sub45_sub6;
						((Class196) class196).anInt2660 = i_265_;
						((Class196) class196).anIntArray2659 = anIntArray1175;
						((Class196) class196).aStringArray2658 = aStringArray1181;
						if (anInt1174 >= aClass196Array1180.length)
							throw new RuntimeException();
						aClass196Array1180[anInt1174++] = class196;
						class11_sub45_sub6 = class11_sub45_sub6_275_;
						is = (((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8783);
						is_266_ = (((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781);
						i_265_ = -1;
						anIntArray1175 = is_276_;
						aStringArray1181 = strings;
					} else if (i_267_ == 42)
						anIntArray1195[anInt1197++] = (Class11_Sub2_Sub20.anIntArray9148[is_266_[i_265_]]);
					else if (i_267_ == 43) {
						int i_279_ = is_266_[i_265_];
						Class11_Sub2_Sub20.anIntArray9148[i_279_] = anIntArray1195[--anInt1197];
						Class177.method1147((byte) 113, i_279_);
						Class217_Sub1.aBool5525 |= Class299.aBoolArray4037[i_279_];
					} else if (i_267_ == 44) {
						int i_280_ = is_266_[i_265_] >> 16;
						int i_281_ = is_266_[i_265_] & 0xffff;
						int i_282_ = anIntArray1195[--anInt1197];
						if (i_282_ < 0 || i_282_ > 5000)
							throw new RuntimeException();
						anIntArray1188[i_280_] = i_282_;
						int i_283_ = -1;
						if (i_281_ == 105)
							i_283_ = 0;
						for (int i_284_ = 0; i_284_ < i_282_; i_284_++)
							anIntArrayArray1173[i_280_][i_284_] = i_283_;
					} else if (i_267_ == 45) {
						int i_285_ = is_266_[i_265_];
						int i_286_ = anIntArray1195[--anInt1197];
						if (i_286_ < 0 || i_286_ >= anIntArray1188[i_285_])
							throw new RuntimeException();
						anIntArray1195[anInt1197++] = anIntArrayArray1173[i_285_][i_286_];
					} else if (i_267_ == 46) {
						int i_287_ = is_266_[i_265_];
						anInt1197 -= 2;
						int i_288_ = anIntArray1195[anInt1197];
						if (i_288_ < 0 || i_288_ >= anIntArray1188[i_287_])
							throw new RuntimeException();
						anIntArrayArray1173[i_287_][i_288_] = anIntArray1195[anInt1197 + 1];
					} else if (i_267_ == 47) {
						String string = Class138.aStringArray1888[is_266_[i_265_]];
						if (string == null)
							string = "null";
						aStringArray1185[anInt1182++] = string;
					} else if (i_267_ == 48) {
						int i_289_ = is_266_[i_265_];
						Class138.aStringArray1888[i_289_] = aStringArray1185[--anInt1182];
						Class11_Sub2_Sub33.method3811(-127, i_289_);
					} else if (i_267_ == 51) {
						Class213 class213 = (((Class11_Sub45_Sub6) class11_sub45_sub6).aClass213Array8779[is_266_[i_265_]]);
						Class11_Sub51 class11_sub51 = ((Class11_Sub51) class213
								.method1369((byte) 26,
										(long) (anIntArray1195[--anInt1197])));
						if (class11_sub51 != null)
							i_265_ += ((Class11_Sub51) class11_sub51).anInt8036;
					}
				} else {
					boolean bool;
					if (is_266_[i_265_] == 1)
						bool = true;
					else
						bool = false;
					if (i_267_ >= 100 && i_267_ < 5000)
						method605(i_267_, bool);
					else {
						if (i_267_ < 5000 || i_267_ >= 10000)
							break;
						method613(i_267_, bool);
					}
				}
			}
			throw new IllegalStateException("Command: " + i_267_);
		} catch (Exception exception) {
			if (((Class11_Sub45_Sub6) class11_sub45_sub6).aString8780 != null) {
				Class11_Sub2_Sub28
						.method3715(
								true,
								4,
								("Clientscript error in: " + (((Class11_Sub45_Sub6) class11_sub45_sub6).aString8780)));
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer
						.append("Clientscript error in: ")
						.append(((Class11_Sub45_Sub6) class11_sub45_sub6).aString8780)
						.append("\n");
				for (int i_290_ = anInt1174 - 1; i_290_ >= 0; i_290_--)
					stringbuffer
							.append("via: ")
							.append(((Class11_Sub45_Sub6) (((Class196) aClass196Array1180[i_290_]).aClass11_Sub45_Sub6_2656)).aString8780)
							.append("\n");
				stringbuffer.append("Op: ").append(i_267_).append("\n");
				String string = exception.getMessage();
				if (string != null && string.length() > 0)
					stringbuffer.append("Message: ").append(string)
							.append("\n");
				Class11_Sub12_Sub3.method3602((byte) -59,
						stringbuffer.toString(), exception);
				Class314.method1912(stringbuffer.toString(), (byte) -93);
			} else {
				StringBuffer stringbuffer = new StringBuffer(30);
				stringbuffer.append("CS2: ")
						.append(((Class11) class11_sub45_sub6).aLong91)
						.append(" ");
				for (int i_291_ = anInt1174 - 1; i_291_ >= 0; i_291_--)
					stringbuffer
							.append("v: ")
							.append(((Class11) (((Class196) aClass196Array1180[i_291_]).aClass11_Sub45_Sub6_2656)).aLong91)
							.append(" ");
				stringbuffer.append("op: ").append(i_267_);
				Class11_Sub12_Sub3.method3602((byte) -94,
						stringbuffer.toString(), exception);
			}
		}
	}

	private static final void method613(int i, boolean bool) {
		if (i < 5100) {
			if (i == 5000) {
				anIntArray1195[anInt1197++] = Class81.anInt1090;
				return;
			}
			if (i == 5001) {
				anInt1197 -= 3;
				Class81.anInt1090 = anIntArray1195[anInt1197];
				Class313.aClass153_4152 = Class89.method620(120,
						anIntArray1195[anInt1197 + 1]);
				if (Class313.aClass153_4152 == null)
					Class313.aClass153_4152 = Class65.aClass153_938;
				Class134.anInt1856 = anIntArray1195[anInt1197 + 2];
				anInt1184++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						(Class11_Sub45_Sub1_Sub1.aClass370_9837), (byte) 71);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(Class81.anInt1090, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(
								((Class153) Class313.aClass153_4152).anInt2021,
								-1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(Class134.anInt1856, -1528071456);
				Class79.method541(class11_sub10, -18);
				return;
			}
			if (i == 5002) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_292_ = aStringArray1185[anInt1182 + 1];
				anInt1197 -= 2;
				int i_293_ = anIntArray1195[anInt1197];
				int i_294_ = anIntArray1195[anInt1197 + 1];
				if (string_292_ == null)
					string_292_ = "";
				if (string_292_.length() > 80)
					string_292_ = string_292_.substring(0, 80);
				anInt1186++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						(Class11_Sub2_Sub5.aClass370_8557), (byte) 59);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte((Class98.method660(string, 0) + 2 + Class98
								.method660(string_292_, 0)), -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(i_293_ - 1, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(i_294_, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string_292_);
				Class79.method541(class11_sub10, -122);
				return;
			}
			if (i == 5003) {
				int i_295_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -101, i_295_);
				String string = "";
				if (class326 != null
						&& ((Class326) class326).aString4351 != null)
					string = ((Class326) class326).aString4351;
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5004) {
				int i_296_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -122, i_296_);
				int i_297_ = -1;
				if (class326 != null)
					i_297_ = ((Class326) class326).anInt4338;
				anIntArray1195[anInt1197++] = i_297_;
				return;
			}
			if (i == 5005) {
				if (Class313.aClass153_4152 == null)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = ((Class153) Class313.aClass153_4152).anInt2021;
					return;
				}
				return;
			}
			if (i == 5006) {
				int i_298_ = anIntArray1195[--anInt1197];
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						(Class11_Sub45_Sub17.aClass370_9505), (byte) -28);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(i_298_, -1528071456);
				Class79.method541(class11_sub10, -64);
				return;
			}
			if (i == 5008) {
				String string = aStringArray1185[--anInt1182];
				method608(string, i);
				return;
			}
			if (i == 5009) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_299_ = aStringArray1185[anInt1182 + 1];
				if (Class256_Sub2.anInt7713 != 0
						|| ((!Class11_Sub2_Sub29.aBool9474 || Class242.aBool3289) && !Class100.aBool1328)) {
					anInt1187++;
					Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
							Class11_Sub3.aClass25_5113,
							Class216.aClass370_2980, (byte) 63);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeByte(0, -1528071456);
					int i_300_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeString((byte) 27, string);
					Class376_Sub7_Sub5_Sub2
							.method3904(
									string_299_,
									false,
									(((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397));
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.method2530(
									(((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position - i_300_),
									(byte) 114);
					Class79.method541(class11_sub10, -55);
					return;
				}
				return;
			}
			if (i == 5010) {
				int i_301_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -74, i_301_);
				String string = "";
				if (class326 != null
						&& ((Class326) class326).aString4344 != null)
					string = ((Class326) class326).aString4344;
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5011) {
				int i_302_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -106, i_302_);
				String string = "";
				if (class326 != null
						&& ((Class326) class326).aString4350 != null)
					string = ((Class326) class326).aString4350;
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5012) {
				int i_303_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -101, i_303_);
				int i_304_ = -1;
				if (class326 != null)
					i_304_ = ((Class326) class326).anInt4346;
				anIntArray1195[anInt1197++] = i_304_;
				return;
			}
			if (i == 5015) {
				String string;
				if ((Class11_Sub2_Sub8.myPlayer != null)
						&& (((Player) Class11_Sub2_Sub8.myPlayer).aString10408) != null)
					string = Class11_Sub2_Sub8.myPlayer.method3981(-127, true);
				else
					string = "";
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5016) {
				anIntArray1195[anInt1197++] = Class134.anInt1856;
				return;
			}
			if (i == 5017) {
				anIntArray1195[anInt1197++] = Class303.method1868((byte) 33);
				return;
			}
			if (i == 5018) {
				int i_305_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -91, i_305_);
				int i_306_ = 0;
				if (class326 != null)
					i_306_ = ((Class326) class326).anInt4347;
				anIntArray1195[anInt1197++] = i_306_;
				return;
			}
			if (i == 5019) {
				int i_307_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -81, i_307_);
				String string = "";
				if (class326 != null
						&& ((Class326) class326).aString4336 != null)
					string = ((Class326) class326).aString4336;
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5020) {
				String string;
				if ((Class11_Sub2_Sub8.myPlayer != null)
						&& (((Player) Class11_Sub2_Sub8.myPlayer).aString10408) != null)
					string = Class11_Sub2_Sub8.myPlayer.method3970(true, false);
				else
					string = "";
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5023) {
				int i_308_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -71, i_308_);
				int i_309_ = -1;
				if (class326 != null)
					i_309_ = ((Class326) class326).anInt4345;
				anIntArray1195[anInt1197++] = i_309_;
				return;
			}
			if (i == 5024) {
				int i_310_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -105, i_310_);
				int i_311_ = -1;
				if (class326 != null)
					i_311_ = ((Class326) class326).anInt4341;
				anIntArray1195[anInt1197++] = i_311_;
				return;
			}
			if (i == 5025) {
				int i_312_ = anIntArray1195[--anInt1197];
				Class326 class326 = Class46.method408((byte) -73, i_312_);
				String string = "";
				if (class326 != null
						&& ((Class326) class326).aString4343 != null)
					string = ((Class326) class326).aString4343;
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5050) {
				int i_313_ = anIntArray1195[--anInt1197];
				aStringArray1185[anInt1182++] = (((Class11_Sub45_Sub21) Class321_Sub4.aClass361_8006
						.method2144(i_313_, (byte) 71)).aString9768);
				return;
			}
			if (i == 5051) {
				int i_314_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub21 class11_sub45_sub21 = Class321_Sub4.aClass361_8006
						.method2144(i_314_, (byte) 71);
				if (((Class11_Sub45_Sub21) class11_sub45_sub21).anIntArray9771 == null)
					anIntArray1195[anInt1197++] = 0;
				else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub21) class11_sub45_sub21).anIntArray9771).length;
					return;
				}
				return;
			}
			if (i == 5052) {
				anInt1197 -= 2;
				int i_315_ = anIntArray1195[anInt1197];
				int i_316_ = anIntArray1195[anInt1197 + 1];
				Class11_Sub45_Sub21 class11_sub45_sub21 = Class321_Sub4.aClass361_8006
						.method2144(i_315_, (byte) 71);
				int i_317_ = (((Class11_Sub45_Sub21) class11_sub45_sub21).anIntArray9771[i_316_]);
				anIntArray1195[anInt1197++] = i_317_;
				return;
			}
			if (i == 5053) {
				int i_318_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub21 class11_sub45_sub21 = Class321_Sub4.aClass361_8006
						.method2144(i_318_, (byte) 71);
				if (((Class11_Sub45_Sub21) class11_sub45_sub21).anIntArray9772 == null)
					anIntArray1195[anInt1197++] = 0;
				else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub21) class11_sub45_sub21).anIntArray9772).length;
					return;
				}
				return;
			}
			if (i == 5054) {
				anInt1197 -= 2;
				int i_319_ = anIntArray1195[anInt1197];
				int i_320_ = anIntArray1195[anInt1197 + 1];
				anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub21) Class321_Sub4.aClass361_8006
						.method2144(i_319_, (byte) 71)).anIntArray9772[i_320_]);
				return;
			}
			if (i == 5055) {
				int i_321_ = anIntArray1195[--anInt1197];
				aStringArray1185[anInt1182++] = Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_321_, false).method3626(16584);
				return;
			}
			if (i == 5056) {
				int i_322_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub13 class11_sub45_sub13 = Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_322_, false);
				if (((Class11_Sub45_Sub13) class11_sub45_sub13).anIntArray9299 == null)
					anIntArray1195[anInt1197++] = 0;
				else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub13) class11_sub45_sub13).anIntArray9299).length;
					return;
				}
				return;
			}
			if (i == 5057) {
				anInt1197 -= 2;
				int i_323_ = anIntArray1195[anInt1197];
				int i_324_ = anIntArray1195[anInt1197 + 1];
				anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub13) Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_323_, false)).anIntArray9299[i_324_]);
				return;
			}
			if (i == 5058) {
				aClass7_1183 = new Class7();
				((Class7) aClass7_1183).anInt43 = anIntArray1195[--anInt1197];
				((Class7) aClass7_1183).aClass11_Sub45_Sub13_46 = Class11_Sub2_Sub10.aClass352_8851
						.method2107(((Class7) aClass7_1183).anInt43, false);
				((Class7) aClass7_1183).anIntArray47 = new int[((Class7) aClass7_1183).aClass11_Sub45_Sub13_46
						.method3631(37)];
				return;
			}
			if (i == 5059) {
				anInt1189++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						Class11_Sub2.aClass370_5039, (byte) -54);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(0, -1528071456);
				int i_325_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(0, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-124, ((Class7) aClass7_1183).anInt43);
				((Class7) aClass7_1183).aClass11_Sub45_Sub13_46
						.method3629(
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397,
								(byte) -51,
								((Class7) aClass7_1183).anIntArray47);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.method2530(
								((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position
										- i_325_, (byte) 115);
				Class79.method541(class11_sub10, -10);
				return;
			}
			if (i == 5060) {
				String string = aStringArray1185[--anInt1182];
				anInt1192++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113, Class372.aClass370_4872,
						(byte) -30);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(0, -1528071456);
				int i_326_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-120, ((Class7) aClass7_1183).anInt43);
				((Class7) aClass7_1183).aClass11_Sub45_Sub13_46
						.method3629(
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397,
								(byte) -51,
								((Class7) aClass7_1183).anIntArray47);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.method2530(
								((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position
										- i_326_, (byte) 111);
				Class79.method541(class11_sub10, -124);
				return;
			}
			if (i == 5061) {
				anInt1189++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						Class11_Sub2.aClass370_5039, (byte) 95);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(0, -1528071456);
				int i_327_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(1, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-123, ((Class7) aClass7_1183).anInt43);
				((Class7) aClass7_1183).aClass11_Sub45_Sub13_46
						.method3629(
								((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397,
								(byte) -51,
								((Class7) aClass7_1183).anIntArray47);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.method2530(
								((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position
										- i_327_, (byte) 114);
				Class79.method541(class11_sub10, -45);
				return;
			}
			if (i == 5062) {
				anInt1197 -= 2;
				int i_328_ = anIntArray1195[anInt1197];
				int i_329_ = anIntArray1195[anInt1197 + 1];
				anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub21) Class321_Sub4.aClass361_8006
						.method2144(i_328_, (byte) 71)).aCharArray9780[i_329_]);
				return;
			}
			if (i == 5063) {
				anInt1197 -= 2;
				int i_330_ = anIntArray1195[anInt1197];
				int i_331_ = anIntArray1195[anInt1197 + 1];
				anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub21) Class321_Sub4.aClass361_8006
						.method2144(i_330_, (byte) 71)).aCharArray9763[i_331_]);
				return;
			}
			if (i == 5064) {
				anInt1197 -= 2;
				int i_332_ = anIntArray1195[anInt1197];
				int i_333_ = anIntArray1195[anInt1197 + 1];
				if (i_333_ == -1)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = Class321_Sub4.aClass361_8006
							.method2144(i_332_, (byte) 71).method3849(
									(byte) -43, (char) i_333_);
					return;
				}
				return;
			}
			if (i == 5065) {
				anInt1197 -= 2;
				int i_334_ = anIntArray1195[anInt1197];
				int i_335_ = anIntArray1195[anInt1197 + 1];
				if (i_335_ == -1)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = Class321_Sub4.aClass361_8006
							.method2144(i_334_, (byte) 71).method3846(
									(char) i_335_, 127);
					return;
				}
				return;
			}
			if (i == 5066) {
				int i_336_ = anIntArray1195[--anInt1197];
				anIntArray1195[anInt1197++] = Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_336_, false).method3631(127);
				return;
			}
			if (i == 5067) {
				anInt1197 -= 2;
				int i_337_ = anIntArray1195[anInt1197];
				int i_338_ = anIntArray1195[anInt1197 + 1];
				int i_339_ = (((Class79) Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_337_, false).method3625(-1, i_338_)).anInt1070);
				anIntArray1195[anInt1197++] = i_339_;
				return;
			}
			if (i == 5068) {
				anInt1197 -= 2;
				int i_340_ = anIntArray1195[anInt1197];
				int i_341_ = anIntArray1195[anInt1197 + 1];
				((Class7) aClass7_1183).anIntArray47[i_340_] = i_341_;
				return;
			}
			if (i == 5069) {
				anInt1197 -= 2;
				int i_342_ = anIntArray1195[anInt1197];
				int i_343_ = anIntArray1195[anInt1197 + 1];
				((Class7) aClass7_1183).anIntArray47[i_342_] = i_343_;
				return;
			}
			if (i == 5070) {
				anInt1197 -= 3;
				int i_344_ = anIntArray1195[anInt1197];
				int i_345_ = anIntArray1195[anInt1197 + 1];
				int i_346_ = anIntArray1195[anInt1197 + 2];
				Class11_Sub45_Sub13 class11_sub45_sub13 = Class11_Sub2_Sub10.aClass352_8851
						.method2107(i_344_, false);
				if ((((Class79) class11_sub45_sub13.method3625(-1, i_345_)).anInt1070) != 0)
					throw new RuntimeException("bad command");
				anIntArray1195[anInt1197++] = class11_sub45_sub13.method3627(
						-3, i_345_, i_346_);
				return;
			}
			if (i == 5071) {
				String string = aStringArray1185[--anInt1182];
				boolean bool_347_ = anIntArray1195[--anInt1197] == 1;
				Class131.method851(string, bool_347_, -70);
				anIntArray1195[anInt1197++] = Class10.anInt81;
				return;
			}
			if (i == 5072) {
				if (Class177.aShortArray2249 == null
						|| Class299.anInt4041 >= Class10.anInt81)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = (Class177.aShortArray2249[Class299.anInt4041++] & 0xffff);
					return;
				}
				return;
			}
			if (i == 5073) {
				Class299.anInt4041 = 0;
				return;
			}
		} else if (i < 5200) {
			if (i == 5100) {
				if (Class11_Sub2_Sub19.aClass1_9098.method60(0, 86))
					anIntArray1195[anInt1197++] = 1;
				else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5101) {
				if (Class11_Sub2_Sub19.aClass1_9098.method60(0, 82))
					anIntArray1195[anInt1197++] = 1;
				else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5102) {
				if (Class11_Sub2_Sub19.aClass1_9098.method60(0, 81))
					anIntArray1195[anInt1197++] = 1;
				else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
		} else if (i < 5300) {
			if (i == 5200) {
				Class33_Sub3.method2923(anIntArray1195[--anInt1197], -3311);
				return;
			}
			if (i == 5201) {
				anIntArray1195[anInt1197++] = Class11_Sub10
						.method2368((byte) -109);
				return;
			}
			if (i == 5205) {
				Class227.method1462(-1, -1, anIntArray1195[--anInt1197], 0,
						false);
				return;
			}
			if (i == 5206) {
				int i_348_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class32.method264(
						i_348_ >> 14 & 0x3fff, i_348_ & 0x3fff);
				if (class11_sub45_sub19 == null)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9714);
					return;
				}
				return;
			}
			if (i == 5207) {
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class32
						.method277(anIntArray1195[--anInt1197]);
				if (class11_sub45_sub19 == null
						|| (((Class11_Sub45_Sub19) class11_sub45_sub19).aString9705 == null))
					aStringArray1185[anInt1182++] = "";
				else {
					aStringArray1185[anInt1182++] = (((Class11_Sub45_Sub19) class11_sub45_sub19).aString9705);
					return;
				}
				return;
			}
			if (i == 5208) {
				anIntArray1195[anInt1197++] = Class91_Sub3_Sub1.anInt9343;
				anIntArray1195[anInt1197++] = Class320.anInt4259;
				return;
			}
			if (i == 5209) {
				anIntArray1195[anInt1197++] = Class14.anInt124
						+ Class32.anInt441;
				anIntArray1195[anInt1197++] = Class239_Sub2.anInt7912
						+ Class32.anInt451;
				return;
			}
			if (i == 5210) {
				int i_349_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class32
						.method277(i_349_);
				if (class11_sub45_sub19 == null) {
					anIntArray1195[anInt1197++] = 0;
					anIntArray1195[anInt1197++] = 0;
				} else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9695) >> 14 & 0x3fff;
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9695) & 0x3fff;
					return;
				}
				return;
			}
			if (i == 5211) {
				int i_350_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class32
						.method277(i_350_);
				if (class11_sub45_sub19 == null) {
					anIntArray1195[anInt1197++] = 0;
					anIntArray1195[anInt1197++] = 0;
				} else {
					anIntArray1195[anInt1197++] = ((((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9702) - (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9709));
					anIntArray1195[anInt1197++] = ((((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9713) - (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9700));
					return;
				}
				return;
			}
			if (i == 5212) {
				Class11_Sub21 class11_sub21 = Class172.method1128((byte) 118);
				if (class11_sub21 == null) {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = -1;
				} else {
					anIntArray1195[anInt1197++] = ((Class11_Sub21) class11_sub21).anInt5964;
					int i_351_ = (((Class11_Sub21) class11_sub21).anInt5968 << 28
							| (((Class11_Sub21) class11_sub21).anInt5970 + Class32.anInt441) << 14 | (((Class11_Sub21) class11_sub21).anInt5969 + Class32.anInt451));
					anIntArray1195[anInt1197++] = i_351_;
					return;
				}
				return;
			}
			if (i == 5213) {
				Class11_Sub21 class11_sub21 = Class153.method956(true);
				if (class11_sub21 == null) {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = -1;
				} else {
					anIntArray1195[anInt1197++] = ((Class11_Sub21) class11_sub21).anInt5964;
					int i_352_ = (((Class11_Sub21) class11_sub21).anInt5968 << 28
							| (((Class11_Sub21) class11_sub21).anInt5970 + Class32.anInt441) << 14 | (((Class11_Sub21) class11_sub21).anInt5969 + Class32.anInt451));
					anIntArray1195[anInt1197++] = i_352_;
					return;
				}
				return;
			}
			if (i == 5214) {
				int i_353_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class11_Sub45_Sub6
						.method3439(0);
				if (class11_sub45_sub19 != null) {
					boolean bool_354_ = class11_sub45_sub19.method3818(
							i_353_ >> 28 & 0x3, i_353_ & 0x3fff, (byte) 21,
							i_353_ >> 14 & 0x3fff, anIntArray1199);
					if (bool_354_)
						Class11_Sub2_Sub37.method3840(anIntArray1199[2], true,
								anIntArray1199[1]);
				}
				return;
			}
			if (i == 5215) {
				anInt1197 -= 2;
				int i_355_ = anIntArray1195[anInt1197];
				int i_356_ = anIntArray1195[anInt1197 + 1];
				Class38 class38 = Class32.method273(i_355_ >> 14 & 0x3fff,
						i_355_ & 0x3fff);
				boolean bool_357_ = false;
				for (Class11_Sub45_Sub19 class11_sub45_sub19 = (Class11_Sub45_Sub19) class38
						.method331((byte) -7); class11_sub45_sub19 != null; class11_sub45_sub19 = (Class11_Sub45_Sub19) class38
						.method333(-46)) {
					if (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9714 == i_356_) {
						bool_357_ = true;
						break;
					}
				}
				if (bool_357_)
					anIntArray1195[anInt1197++] = 1;
				else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5218) {
				int i_358_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class32
						.method277(i_358_);
				if (class11_sub45_sub19 == null)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = (((Class11_Sub45_Sub19) class11_sub45_sub19).anInt9704);
					return;
				}
				return;
			}
			if (i == 5220) {
				anIntArray1195[anInt1197++] = Class164.anInt2133 == 100 ? 1 : 0;
				return;
			}
			if (i == 5221) {
				int i_359_ = anIntArray1195[--anInt1197];
				Class11_Sub2_Sub37.method3840(i_359_ & 0x3fff, true,
						i_359_ >> 14 & 0x3fff);
				return;
			}
			if (i == 5222) {
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class11_Sub45_Sub6
						.method3439(0);
				if (class11_sub45_sub19 != null) {
					boolean bool_360_ = (class11_sub45_sub19.method3817(-128,
							anIntArray1199,
							Class14.anInt124 + Class32.anInt441,
							Class239_Sub2.anInt7912 + Class32.anInt451));
					if (bool_360_) {
						anIntArray1195[anInt1197++] = anIntArray1199[1];
						anIntArray1195[anInt1197++] = anIntArray1199[2];
					} else {
						anIntArray1195[anInt1197++] = -1;
						anIntArray1195[anInt1197++] = -1;
					}
				} else {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = -1;
					return;
				}
				return;
			}
			if (i == 5223) {
				anInt1197 -= 2;
				int i_361_ = anIntArray1195[anInt1197];
				int i_362_ = anIntArray1195[anInt1197 + 1];
				Class227.method1462(i_362_ & 0x3fff, i_362_ >> 14 & 0x3fff,
						i_361_, 0, false);
				return;
			}
			if (i == 5224) {
				int i_363_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class11_Sub45_Sub6
						.method3439(0);
				if (class11_sub45_sub19 != null) {
					boolean bool_364_ = class11_sub45_sub19.method3818(
							i_363_ >> 28 & 0x3, i_363_ & 0x3fff, (byte) 21,
							i_363_ >> 14 & 0x3fff, anIntArray1199);
					if (bool_364_) {
						anIntArray1195[anInt1197++] = anIntArray1199[1];
						anIntArray1195[anInt1197++] = anIntArray1199[2];
					} else {
						anIntArray1195[anInt1197++] = -1;
						anIntArray1195[anInt1197++] = -1;
					}
				} else {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = -1;
					return;
				}
				return;
			}
			if (i == 5225) {
				int i_365_ = anIntArray1195[--anInt1197];
				Class11_Sub45_Sub19 class11_sub45_sub19 = Class11_Sub45_Sub6
						.method3439(0);
				if (class11_sub45_sub19 != null) {
					boolean bool_366_ = class11_sub45_sub19.method3817(-114,
							anIntArray1199, i_365_ >> 14 & 0x3fff,
							i_365_ & 0x3fff);
					if (bool_366_) {
						anIntArray1195[anInt1197++] = anIntArray1199[1];
						anIntArray1195[anInt1197++] = anIntArray1199[2];
					} else {
						anIntArray1195[anInt1197++] = -1;
						anIntArray1195[anInt1197++] = -1;
					}
				} else {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = -1;
					return;
				}
				return;
			}
			if (i == 5226) {
				Class11_Sub51.method3235(29372, anIntArray1195[--anInt1197]);
				return;
			}
			if (i == 5227) {
				anInt1197 -= 2;
				int i_367_ = anIntArray1195[anInt1197];
				int i_368_ = anIntArray1195[anInt1197 + 1];
				Class227.method1462(i_368_ & 0x3fff, i_368_ >> 14 & 0x3fff,
						i_367_, 0, true);
				return;
			}
			if (i == 5228) {
				Class350.aBool4615 = anIntArray1195[--anInt1197] == 1;
				return;
			}
			if (i == 5229) {
				anIntArray1195[anInt1197++] = Class350.aBool4615 ? 1 : 0;
				return;
			}
			if (i == 5230) {
				int i_369_ = anIntArray1195[--anInt1197];
				Class9.method109(1, i_369_);
				return;
			}
			if (i == 5231) {
				anInt1197 -= 2;
				int i_370_ = anIntArray1195[anInt1197];
				boolean bool_371_ = anIntArray1195[anInt1197 + 1] == 1;
				if (Class161.aClass213_2098 != null) {
					Class11 class11 = Class161.aClass213_2098.method1369(
							(byte) 26, (long) i_370_);
					if (class11 != null && !bool_371_)
						class11.method122(-122);
					else if (class11 == null && bool_371_) {
						class11 = new Class11();
						Class161.aClass213_2098.method1368((long) i_370_,
								class11, (byte) -26);
					}
				}
				return;
			}
			if (i == 5232) {
				int i_372_ = anIntArray1195[--anInt1197];
				if (Class161.aClass213_2098 != null) {
					Class11 class11 = Class161.aClass213_2098.method1369(
							(byte) 26, (long) i_372_);
					anIntArray1195[anInt1197++] = class11 != null ? 1 : 0;
				} else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5233) {
				anInt1197 -= 2;
				int i_373_ = anIntArray1195[anInt1197];
				boolean bool_374_ = anIntArray1195[anInt1197 + 1] == 1;
				if (Class287.aClass213_3883 != null) {
					Class11 class11 = Class287.aClass213_3883.method1369(
							(byte) 26, (long) i_373_);
					if (class11 != null && !bool_374_)
						class11.method122(-73);
					else if (class11 == null && bool_374_) {
						class11 = new Class11();
						Class287.aClass213_3883.method1368((long) i_373_,
								class11, (byte) -26);
					}
				}
				return;
			}
			if (i == 5234) {
				int i_375_ = anIntArray1195[--anInt1197];
				if (Class287.aClass213_3883 != null) {
					Class11 class11 = Class287.aClass213_3883.method1369(
							(byte) 26, (long) i_375_);
					anIntArray1195[anInt1197++] = class11 != null ? 1 : 0;
				} else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5235) {
				anIntArray1195[anInt1197++] = (Class32.aClass11_Sub45_Sub19_418 != null ? ((Class11_Sub45_Sub19) Class32.aClass11_Sub45_Sub19_418).anInt9714
						: -1);
				return;
			}
			if (i == 5236) {
				anInt1197 -= 2;
				int i_376_ = anIntArray1195[anInt1197];
				int i_377_ = anIntArray1195[anInt1197 + 1];
				int i_378_ = i_377_ >> 14 & 0x3fff;
				int i_379_ = i_377_ & 0x3fff;
				int i_380_ = Class11_Sub23_Sub2.method3752(i_376_, i_379_,
						i_378_, 0);
				if (i_380_ < 0)
					anIntArray1195[anInt1197++] = -1;
				else {
					anIntArray1195[anInt1197++] = i_380_;
					return;
				}
				return;
			}
			if (i == 5237) {
				Class211.method1350((byte) 101);
				return;
			}
		} else if (i < 5400) {
			if (i == 5300) {
				anInt1197 -= 2;
				int i_381_ = anIntArray1195[anInt1197];
				int i_382_ = anIntArray1195[anInt1197 + 1];
				Class113.method756(3, false, 3, i_381_, i_382_);
				anIntArray1195[anInt1197++] = Class355.aFrame4658 != null ? 1
						: 0;
				return;
			}
			if (i == 5301) {
				if (Class355.aFrame4658 != null)
					Class113.method756(
							3,
							false,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
									.method2654(false), -1, -1);
				return;
			}
			if (i == 5302) {
				Class35[] class35s = Class56.method450(17710);
				anIntArray1195[anInt1197++] = class35s.length;
				return;
			}
			if (i == 5303) {
				int i_383_ = anIntArray1195[--anInt1197];
				Class35[] class35s = Class56.method450(17710);
				anIntArray1195[anInt1197++] = ((Class35) class35s[i_383_]).anInt464;
				anIntArray1195[anInt1197++] = ((Class35) class35s[i_383_]).anInt467;
				return;
			}
			if (i == 5305) {
				int i_384_ = Class103.anInt1381;
				int i_385_ = Class11_Sub51.anInt8032;
				int i_386_ = -1;
				Class35[] class35s = Class56.method450(17710);
				for (int i_387_ = 0; i_387_ < class35s.length; i_387_++) {
					Class35 class35 = class35s[i_387_];
					if (((Class35) class35).anInt464 == i_384_
							&& ((Class35) class35).anInt467 == i_385_) {
						i_386_ = i_387_;
						break;
					}
				}
				anIntArray1195[anInt1197++] = i_386_;
				return;
			}
			if (i == 5306) {
				anIntArray1195[anInt1197++] = Class187.method1227((byte) 54);
				return;
			}
			if (i == 5307) {
				int i_388_ = anIntArray1195[--anInt1197];
				if (i_388_ >= 1 && i_388_ <= 2) {
					Class113.method756(3, false, i_388_, -1, -1);
					return;
				}
				return;
			}
			if (i == 5308) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub13_5726
						.method2654(false);
				return;
			}
			if (i == 5309) {
				int i_389_ = anIntArray1195[--anInt1197];
				if (i_389_ >= 1 && i_389_ <= 2) {
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_389_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub13_5726));
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_389_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub13_5724));
					Class186.method1212(10343);
					return;
				}
				return;
			}
		} else if (i < 5500) {
			if (i == 5400) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_390_ = aStringArray1185[anInt1182 + 1];
				int i_391_ = anIntArray1195[--anInt1197];
				anInt1194++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113, Class91.aClass370_1237,
						(byte) 101);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(
								(Class98.method660(string, 0)
										+ Class98.method660(string_390_, 0) + 1),
								-1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string_390_);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(i_391_, -1528071456);
				Class79.method541(class11_sub10, -117);
				return;
			}
			if (i == 5401) {
				anInt1197 -= 2;
				Class114.aShortArray1566[anIntArray1195[anInt1197]] = (short) Class124
						.method814(false, (anIntArray1195[anInt1197 + 1]));
				Packet.aClass223_8723.method1427(false);
				Packet.aClass223_8723.method1428(false);
				Class11_Sub19.aClass318_5817.method1933(false);
				Class307.method1879(-101);
				return;
			}
			if (i == 5405) {
				anInt1197 -= 2;
				int i_392_ = anIntArray1195[anInt1197];
				int i_393_ = anIntArray1195[anInt1197 + 1];
				if (i_392_ >= 0 && i_392_ < 2)
					Class11_Sub39.anIntArrayArrayArray7210[i_392_] = new int[i_393_ << 1][4];
				return;
			}
			if (i == 5406) {
				anInt1197 -= 7;
				int i_394_ = anIntArray1195[anInt1197];
				int i_395_ = anIntArray1195[anInt1197 + 1] << 1;
				int i_396_ = anIntArray1195[anInt1197 + 2];
				int i_397_ = anIntArray1195[anInt1197 + 3];
				int i_398_ = anIntArray1195[anInt1197 + 4];
				int i_399_ = anIntArray1195[anInt1197 + 5];
				int i_400_ = anIntArray1195[anInt1197 + 6];
				if (i_394_ >= 0
						&& i_394_ < 2
						&& Class11_Sub39.anIntArrayArrayArray7210[i_394_] != null
						&& i_395_ >= 0
						&& i_395_ < (Class11_Sub39.anIntArrayArrayArray7210[i_394_]).length) {
					Class11_Sub39.anIntArrayArrayArray7210[i_394_][i_395_] = new int[] {
							(i_396_ >> 14 & 0x3fff) << 9, i_397_ << 2,
							(i_396_ & 0x3fff) << 9, i_400_ };
					Class11_Sub39.anIntArrayArrayArray7210[i_394_][i_395_ + 1] = new int[] {
							(i_398_ >> 14 & 0x3fff) << 9, i_399_ << 2,
							(i_398_ & 0x3fff) << 9 };
				}
				return;
			}
			if (i == 5407) {
				int i_401_ = ((Class11_Sub39.anIntArrayArrayArray7210[anIntArray1195[--anInt1197]]).length >> 1);
				anIntArray1195[anInt1197++] = i_401_;
				return;
			}
			if (i == 5411) {
				if (Class355.aFrame4658 != null)
					Class113.method756(
							3,
							false,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
									.method2654(false), -1, -1);
				if (Class376_Sub5.aFrame6918 != null) {
					Class11_Sub2_Sub28.method3716(false);
					System.exit(0);
				} else {
					String string = (Class11_Sub28.aString6558 != null ? Class11_Sub28.aString6558
							: Class256_Sub2.method3114(true));
					Class342.method2074(
							false,
							string,
							(byte) 121,
							Class108_Sub21.aClass341_7304,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
									.method3181(false) == 1);
					return;
				}
				return;
			}
			if (i == 5419) {
				String string = "";
				if (Class11_Sub2_Sub4.aClass368_8500 != null) {
					if (Class11_Sub2_Sub4.aClass368_8500.anObject4838 != null)
						string = (String) (Class11_Sub2_Sub4.aClass368_8500.anObject4838);
					else
						string = Class382.method2231(
								(Class11_Sub2_Sub4.aClass368_8500.anInt4841),
								1677133712);
				}
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5420) {
				anIntArray1195[anInt1197++] = (((Class341) Class108_Sub21.aClass341_7304).aBool4520 ? 0
						: 1);
				return;
			}
			if (i == 5421) {
				if (Class355.aFrame4658 != null)
					Class113.method756(
							3,
							false,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
									.method2654(false), -1, -1);
				String string = aStringArray1185[--anInt1182];
				boolean bool_402_ = anIntArray1195[--anInt1197] == 1;
				String string_403_ = Class256_Sub2.method3114(true) + string;
				Class342.method2074(
						bool_402_,
						string_403_,
						(byte) 127,
						Class108_Sub21.aClass341_7304,
						((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
								.method3181(false) == 1);
				return;
			}
			if (i == 5422) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_404_ = aStringArray1185[anInt1182 + 1];
				int i_405_ = anIntArray1195[--anInt1197];
				if (string.length() > 0) {
					if (Class339.aStringArray4486 == null)
						Class339.aStringArray4486 = new String[(Class345.anIntArray4581[(((Class66) Class198.aClass66_2679).anInt945)])];
					Class339.aStringArray4486[i_405_] = string;
				}
				if (string_404_.length() > 0) {
					if (Class73.aStringArray1013 == null)
						Class73.aStringArray1013 = new String[(Class345.anIntArray4581[(((Class66) Class198.aClass66_2679).anInt945)])];
					Class73.aStringArray1013[i_405_] = string_404_;
				}
				return;
			}
			if (i == 5423) {
				System.out.println(aStringArray1185[--anInt1182]);
				return;
			}
			if (i == 5424) {
				anInt1197 -= 11;
				Class42.anInt632 = anIntArray1195[anInt1197];
				Class366.anInt4813 = anIntArray1195[anInt1197 + 1];
				Class11_Sub2_Sub38.anInt9797 = anIntArray1195[anInt1197 + 2];
				Class94_Sub2.anInt5589 = anIntArray1195[anInt1197 + 3];
				Class321_Sub2.anInt6647 = anIntArray1195[anInt1197 + 4];
				Class49.anInt754 = anIntArray1195[anInt1197 + 5];
				Class246.anInt3321 = anIntArray1195[anInt1197 + 6];
				IncomingPacket.anInt2085 = anIntArray1195[anInt1197 + 7];
				Class350.anInt4616 = anIntArray1195[anInt1197 + 8];
				Class329.anInt4375 = anIntArray1195[anInt1197 + 9];
				Class127.anInt1721 = anIntArray1195[anInt1197 + 10];
				Class108_Sub7.aClass146_5636.method918(Class321_Sub2.anInt6647,
						-107);
				Class108_Sub7.aClass146_5636.method918(Class49.anInt754, 101);
				Class108_Sub7.aClass146_5636
						.method918(Class246.anInt3321, -104);
				Class108_Sub7.aClass146_5636.method918(
						IncomingPacket.anInt2085, 106);
				Class108_Sub7.aClass146_5636.method918(Class350.anInt4616, -69);
				Class11_Sub2_Sub36.aClass253_9752 = Class11_Sub45_Sub6.aClass253_8787 = Class78.aClass253_1061 = null;
				Class300.aClass253_4052 = Class11_Sub2_Sub22.aClass253_9203 = Class124.aClass253_1679 = null;
				Class7.aClass253_49 = Class108_Sub16.aClass253_6549 = null;
				Class254_Sub3.aBool8049 = true;
				return;
			}
			if (i == 5425) {
				Class14.method146((byte) -126);
				Class254_Sub3.aBool8049 = false;
				return;
			}
			if (i == 5426) {
				anInt1197 -= 2;
				Class11_Sub10.anInt5389 = anIntArray1195[anInt1197];
				Class11_Sub18.anInt5794 = anIntArray1195[anInt1197 + 1];
				return;
			}
			if (i == 5427) {
				anInt1197 -= 2;
				Class258.anInt3515 = anIntArray1195[anInt1197 + 1];
				return;
			}
			if (i == 5428) {
				anInt1197 -= 2;
				int i_406_ = anIntArray1195[anInt1197];
				int i_407_ = anIntArray1195[anInt1197 + 1];
				anIntArray1195[anInt1197++] = Class262.method1671(i_407_,
						i_406_, false) ? 1 : 0;
				return;
			}
			if (i == 5429) {
				Class344.method2084(aStringArray1185[--anInt1182], false,
						false, -119);
				return;
			}
			if (i == 5430) {
				try {
					Class36.method311("accountcreated", 117,
							Class108_Sub16.anApplet6538);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5431) {
				try {
					Class36.method311("accountcreatestarted", 96,
							Class108_Sub16.anApplet6538);
				} catch (Throwable throwable) {
					/* empty */
				}
				return;
			}
			if (i == 5432) {
				String string = "";
				if (Class108_Sub20.aClipboard7231 != null) {
					Transferable transferable = Class108_Sub20.aClipboard7231
							.getContents(null);
					if (transferable != null) {
						try {
							string = (String) (transferable
									.getTransferData(DataFlavor.stringFlavor));
							if (string == null)
								string = "";
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
				aStringArray1185[anInt1182++] = string;
				return;
			}
			if (i == 5433) {
				Class326.anInt4348 = anIntArray1195[--anInt1197];
				return;
			}
		} else if (i < 5600) {
			if (i == 5500) {
				anInt1197 -= 4;
				int i_408_ = anIntArray1195[anInt1197];
				int i_409_ = anIntArray1195[anInt1197 + 1];
				int i_410_ = anIntArray1195[anInt1197 + 2];
				int i_411_ = anIntArray1195[anInt1197 + 3];
				Class108_Sub6.method2433(i_411_, (byte) -69,
						((i_408_ >> 14 & 0x3fff) - Class194.anInt2641), false,
						((i_408_ & 0x3fff) - Class118.anInt1605), i_410_,
						i_409_ << 2);
				return;
			}
			if (i == 5501) {
				anInt1197 -= 4;
				int i_412_ = anIntArray1195[anInt1197];
				int i_413_ = anIntArray1195[anInt1197 + 1];
				int i_414_ = anIntArray1195[anInt1197 + 2];
				int i_415_ = anIntArray1195[anInt1197 + 3];
				Class316.method1918((i_412_ & 0x3fff) - Class118.anInt1605,
						i_414_, i_413_ << 2,
						((i_412_ >> 14 & 0x3fff) - Class194.anInt2641), i_415_,
						(byte) 108);
				return;
			}
			if (i == 5502) {
				anInt1197 -= 6;
				int i_416_ = anIntArray1195[anInt1197];
				if (i_416_ >= 2)
					throw new RuntimeException();
				Class71.anInt989 = i_416_;
				int i_417_ = anIntArray1195[anInt1197 + 1];
				if (i_417_ + 1 >= (Class11_Sub39.anIntArrayArrayArray7210[Class71.anInt989]).length >> 1)
					throw new RuntimeException();
				Class149.anInt1996 = i_417_;
				Class11_Sub26.anInt6298 = 0;
				Class251_Sub2.anInt5432 = anIntArray1195[anInt1197 + 2];
				Class335_Sub3_Sub1.anInt9415 = anIntArray1195[anInt1197 + 3];
				int i_418_ = anIntArray1195[anInt1197 + 4];
				if (i_418_ >= 2)
					throw new RuntimeException();
				Class344.anInt4564 = i_418_;
				int i_419_ = anIntArray1195[anInt1197 + 5];
				if (i_419_ + 1 >= (Class11_Sub39.anIntArrayArrayArray7210[Class344.anInt4564]).length >> 1)
					throw new RuntimeException();
				Class108_Sub16.anInt6550 = i_419_;
				Class191.anInt2453 = 3;
				Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
				return;
			}
			if (i == 5503) {
				Class11_Sub2_Sub36.method3839((byte) 103);
				return;
			}
			if (i == 5504) {
				anInt1197 -= 2;
				Class2_Sub6.method2413(0, 3, anIntArray1195[anInt1197 + 1],
						anIntArray1195[anInt1197]);
				return;
			}
			if (i == 5505) {
				anIntArray1195[anInt1197++] = (int) Class219_Sub1.aFloat7244 >> 3;
				return;
			}
			if (i == 5506) {
				anIntArray1195[anInt1197++] = (int) Class2_Sub8.aFloat6868 >> 3;
				return;
			}
			if (i == 5507) {
				Class265.method1678(false);
				return;
			}
			if (i == 5508) {
				Class51.method430((byte) 52);
				return;
			}
			if (i == 5509) {
				Class11_Sub12.method2383(-1);
				return;
			}
			if (i == 5510) {
				Class58.method463(110);
				return;
			}
			if (i == 5511) {
				int i_420_ = anIntArray1195[--anInt1197];
				int i_421_ = i_420_ >> 14 & 0x3fff;
				int i_422_ = i_420_ & 0x3fff;
				i_421_ -= Class194.anInt2641;
				if (i_421_ < 0)
					i_421_ = 0;
				else if (i_421_ >= Class300.anInt4051)
					i_421_ = Class300.anInt4051;
				i_422_ -= Class118.anInt1605;
				if (i_422_ < 0)
					i_422_ = 0;
				else if (i_422_ >= Class108_Sub12.anInt6228)
					i_422_ = Class108_Sub12.anInt6228;
				Class38.anInt508 = (i_421_ << 9) + 256;
				Class201.anInt2713 = (i_422_ << 9) + 256;
				Class191.anInt2453 = 4;
				Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
				return;
			}
			if (i == 5512) {
				Class359.method2134((byte) -83);
				return;
			}
			if (i == 5514) {
				Class117.anInt1595 = anIntArray1195[--anInt1197];
				return;
			}
			if (i == 5516) {
				anIntArray1195[anInt1197++] = Class117.anInt1595;
				return;
			}
			if (i == 5517) {
				int i_423_ = anIntArray1195[--anInt1197];
				if (i_423_ == -1) {
					int i_424_ = i_423_ >> 14 & 0x3fff;
					int i_425_ = i_423_ & 0x3fff;
					i_424_ -= Class194.anInt2641;
					if (i_424_ < 0)
						i_424_ = 0;
					else if (i_424_ >= Class300.anInt4051)
						i_424_ = Class300.anInt4051;
					i_425_ -= Class118.anInt1605;
					if (i_425_ < 0)
						i_425_ = 0;
					else if (i_425_ >= Class108_Sub12.anInt6228)
						i_425_ = Class108_Sub12.anInt6228;
					Canvas_Sub1.anInt9233 = (i_424_ << 9) + 256;
					Class170.anInt2186 = (i_425_ << 9) + 256;
				} else {
					Canvas_Sub1.anInt9233 = -1;
					Class170.anInt2186 = -1;
					return;
				}
				return;
			}
		} else if (i < 5700) {
			if (i == 5600) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_426_ = aStringArray1185[anInt1182 + 1];
				int i_427_ = anIntArray1195[--anInt1197];
				if (string.length() <= 320
						&& Class285.anInt3846 == 3
						&& (Class94_Sub1.loginStep == 0 && Class313.anInt4162 == 0)) {
					Class11_Sub30_Sub1.currentUsername = string;
					Class11_Sub45_Sub8.currentPassword = string_426_;
					Class108_Sub23.anInt7766 = i_427_;
					Class83.method575(false, 6);
					return;
				}
				return;
			}
			if (i == 5601) {
				Class193.method1263(0);
				return;
			}
			if (i == 5602) {
				if (Class94_Sub1.loginStep == 0) {
					Class11_Sub29.anInt6598 = -2;
					Class115.anInt1567 = -2;
				}
				return;
			}
			if (i == 5604) {
				anInt1182--;
				if (Class285.anInt3846 == 3
						&& (Class94_Sub1.loginStep == 0 && Class313.anInt4162 == 0)) {
					Class11_Sub2_Sub16.method3550(aStringArray1185[anInt1182],
							false);
					return;
				}
				return;
			}
			if (i == 5605) {
				anInt1182 -= 2;
				anInt1197 -= 2;
				if (Class285.anInt3846 == 3
						&& (Class94_Sub1.loginStep == 0 && Class313.anInt4162 == 0)) {
					Class212.method1359(aStringArray1185[anInt1182],
							aStringArray1185[anInt1182 + 1],
							anIntArray1195[anInt1197],
							anIntArray1195[anInt1197 + 1] == 1, 18703);
					return;
				}
				return;
			}
			if (i == 5606) {
				if (Class313.anInt4162 == 0)
					Class108_Sub6.anInt5632 = -2;
				return;
			}
			if (i == 5607) {
				anIntArray1195[anInt1197++] = Class115.anInt1567;
				return;
			}
			if (i == 5608) {
				anIntArray1195[anInt1197++] = Class330.anInt4383;
				return;
			}
			if (i == 5609) {
				anIntArray1195[anInt1197++] = Class108_Sub6.anInt5632;
				return;
			}
			if (i == 5611) {
				anIntArray1195[anInt1197++] = Class261.anInt3589;
				return;
			}
			if (i == 5612) {
				int i_428_ = anIntArray1195[--anInt1197];
				if (Class285.anInt3846 == 7
						&& (Class94_Sub1.loginStep == 0 && Class313.anInt4162 == 0)) {
					if (Class108_Sub2.aClass217_5081 != null) {
						Class108_Sub2.aClass217_5081.method1398(-2147483648);
						Class108_Sub2.aClass217_5081 = null;
					}
					Class108_Sub23.anInt7766 = i_428_;
					Class83.method575(false, 9);
					return;
				}
				return;
			}
			if (i == 5613) {
				anIntArray1195[anInt1197++] = Class115.anInt1567;
				return;
			}
			if (i == 5615) {
				anInt1182 -= 2;
				String string = aStringArray1185[anInt1182];
				String string_429_ = aStringArray1185[anInt1182 + 1];
				if (string.length() <= 320
						&& Class285.anInt3846 == 3
						&& (Class94_Sub1.loginStep == 0 && Class313.anInt4162 == 0)) {
					if (Class108_Sub2.aClass217_5081 != null) {
						Class108_Sub2.aClass217_5081.method1398(-2147483648);
						Class108_Sub2.aClass217_5081 = null;
					}
					Class11_Sub30_Sub1.currentUsername = string;
					Class11_Sub45_Sub8.currentPassword = string_429_;
					Class83.method575(false, 5);
					return;
				}
				return;
			}
			if (i == 5616) {
				InputStream_Sub2.method2814(false, -25626);
				return;
			}
			if (i == 5617) {
				anIntArray1195[anInt1197++] = Class11_Sub29.anInt6598;
				return;
			}
			if (i == 5618) {
				anInt1197--;
				return;
			}
			if (i == 5619) {
				anInt1197--;
				return;
			}
			if (i == 5620) {
				anIntArray1195[anInt1197++] = 0;
				return;
			}
			if (i == 5621) {
				anInt1182 -= 2;
				anInt1197 -= 2;
				return;
			}
			if (i == 5622)
				return;
			if (i == 5623) {
				if (Class286.aString3874 != null)
					anIntArray1195[anInt1197++] = 1;
				else {
					anIntArray1195[anInt1197++] = 0;
					return;
				}
				return;
			}
			if (i == 5624) {
				anIntArray1195[anInt1197++] = (int) (Class118.aLong1607 >> 32);
				anIntArray1195[anInt1197++] = (int) (Class118.aLong1607 & 0xffffL);
				return;
			}
			if (i == 5625) {
				anIntArray1195[anInt1197++] = Class239_Sub1.aBool7267 ? 1 : 0;
				return;
			}
			if (i == 5626) {
				Class239_Sub1.aBool7267 = true;
				Class253_Sub2.method2703((byte) -66);
				return;
			}
		} else if (i < 6100) {
			if (i == 6001) {
				int i_430_ = anIntArray1195[--anInt1197];
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								i_430_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub9_5685));
				Class114.method758(3);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6002) {
				boolean bool_431_ = anIntArray1195[--anInt1197] == 1;
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								bool_431_ ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5718));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								bool_431_ ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707));
				Class114.method758(3);
				Class11_Sub18.method2476(-121);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6003) {
				boolean bool_432_ = anIntArray1195[--anInt1197] == 1;
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								bool_432_ ? 2 : 1,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5682));
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								bool_432_ ? 2 : 1,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684));
				Class11_Sub18.method2476(-100);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6005) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703));
				Class114.method758(3);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6007) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6008) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6010) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6011) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717));
				Class114.method758(3);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6012) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723));
				Class108_Sub13.method2653((byte) -126);
				Class376_Sub1.method2276(16711680);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6014) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 2 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695));
				Class114.method758(3);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6015) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732));
				Class114.method758(3);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6016) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5728));
				Class239.method1521(
						false,
						0,
						((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
								.method3181(false));
				Class186.method1212(10343);
				return;
			}
			if (i == 6017) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub22_5711));
				Class344.method2085(22104);
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6018) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6019) {
				int i_433_ = anIntArray1195[--anInt1197];
				int i_434_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
						.method2462(false);
				if (i_433_ != i_434_) {
					if (Class2_Sub5.method2400((byte) 35, Class285.anInt3846)) {
						if (i_434_ == 0 && Class11_Sub12_Sub1.anInt8828 != -1) {
							Class91_Sub2.method3111(i_433_,
									Class11_Sub12_Sub1.anInt8828, 0, false,
									Class58_Sub2_Sub1.aClass146_9250, 0);
							Class295.method1829(-1);
							Class376_Sub7.aBool7049 = false;
						} else if (i_433_ == 0) {
							Class376_Sub7.method2858(126);
							Class376_Sub7.aBool7049 = false;
						} else
							Class206_Sub2.method2684(-1, i_433_);
					}
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_433_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722));
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
				}
				return;
			}
			if (i == 6020) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5725));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6021) {
				int i_435_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5682
						.method3144(false);
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 0 : i_435_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684));
				Class11_Sub18.method2476(-104);
				return;
			}
			if (i == 6023) {
				int i_436_ = anIntArray1195[--anInt1197];
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								i_436_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub4_5691));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6024) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712));
				Class186.method1212(10343);
				return;
			}
			if (i == 6025) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub29_5689));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6027) {
				int i_437_ = anIntArray1195[--anInt1197];
				if (i_437_ < 0 || i_437_ > 1)
					i_437_ = 0;
				Class137.method875(-93, i_437_ == 1);
				return;
			}
			if (i == 6028) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] != 0 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub2_5710));
				Class186.method1212(10343);
				return;
			}
			if (i == 6029) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686));
				Class186.method1212(10343);
				return;
			}
			if (i == 6030) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] != 0 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721));
				Class186.method1212(10343);
				Class114.method758(3);
				return;
			}
			if (i == 6031) {
				int i_438_ = anIntArray1195[--anInt1197];
				if (i_438_ < 0 || i_438_ > 5)
					i_438_ = 2;
				Class239.method1521(false, 0, i_438_);
				return;
			}
			if (i == 6032) {
				anInt1197 -= 2;
				int i_439_ = anIntArray1195[anInt1197];
				boolean bool_440_ = anIntArray1195[anInt1197 + 1] == 1;
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								i_439_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730));
				if (!bool_440_)
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub7_5683));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6033) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub1_5715));
				Class186.method1212(10343);
				return;
			}
			if (i == 6034) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : 0,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697));
				Class186.method1212(10343);
				Class108_Sub13.method2653((byte) -121);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6035) {
				int i_441_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5718
						.method3158(false);
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197] == 1 ? 1 : i_441_,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707));
				Class114.method758(3);
				Class11_Sub18.method2476(-124);
				return;
			}
			if (i == 6036) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727));
				Class186.method1212(10343);
				Class295.aBool3989 = true;
				return;
			}
			if (i == 6037) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								anIntArray1195[--anInt1197],
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5720));
				Class186.method1212(10343);
				Class236_Sub1.aBool6093 = false;
				return;
			}
			if (i == 6038) {
				int i_442_ = anIntArray1195[--anInt1197];
				int i_443_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5690
						.method2462(false);
				if (i_442_ != i_443_
						&& Class11_Sub12_Sub1.anInt8828 == Class235.anInt3219) {
					if (!Class2_Sub5.method2400((byte) 35, Class285.anInt3846)) {
						if (i_443_ == 0) {
							Class91_Sub2.method3111(i_442_,
									Class11_Sub12_Sub1.anInt8828, 0, false,
									Class58_Sub2_Sub1.aClass146_9250, 0);
							Class295.method1829(-1);
							Class376_Sub7.aBool7049 = false;
						} else if (i_442_ == 0) {
							Class376_Sub7.method2858(125);
							Class376_Sub7.aBool7049 = false;
						} else
							Class206_Sub2.method2684(-1, i_442_);
					}
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_442_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5690));
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
				}
				return;
			}
			if (i == 6039) {
				int i_444_ = anIntArray1195[--anInt1197];
				if (i_444_ > 255 || i_444_ < 0)
					i_444_ = 0;
				if (i_444_ != ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub14_5693
						.method2658(false)) {
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_444_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub14_5693));
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
				}
				return;
			}
			if (i == 6040) {
				int i_445_ = anIntArray1195[--anInt1197];
				if (i_445_ != ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
						.method2734(false)) {
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									i_445_,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731));
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					Class89.method621(-1);
				}
				return;
			}
		} else if (i < 6200) {
			if (i == 6101) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub9_5685
						.method2607(false);
				return;
			}
			if (i == 6102) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5718
						.method3158(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6103) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5682
						.method3144(false) == 2 ? 1 : 0;
				return;
			}
			if (i == 6105) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703
						.method2347(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6107) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686
						.method2809(false);
				return;
			}
			if (i == 6108) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687
						.method2935(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6110) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700
						.method2958(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6111) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
						.method3147(false);
				return;
			}
			if (i == 6112) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723
						.method2623(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6114) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695
						.method2373(false) == 2 ? 1 : 0;
				return;
			}
			if (i == 6115) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732
						.method2892(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6116) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5728
						.method2698(false);
				return;
			}
			if (i == 6117) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub22_5711
						.method2962(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6118) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702
						.method2462(false);
				return;
			}
			if (i == 6119) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
						.method2462(false);
				return;
			}
			if (i == 6120) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5725
						.method2462(false);
				return;
			}
			if (i == 6123) {
				anIntArray1195[anInt1197++] = Class302.method1859((byte) 81);
				return;
			}
			if (i == 6124) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712
						.method2698(false);
				return;
			}
			if (i == 6125) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub29_5689
						.method3230(false);
				return;
			}
			if (i == 6127) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699
						.method3126(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6128) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub2_5710
						.method2266(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6129) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686
						.method2809(false);
				return;
			}
			if (i == 6130) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721
						.method2710(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6131) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
						.method3181(false);
				return;
			}
			if (i == 6132) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730
						.method3181(false);
				return;
			}
			if (i == 6133) {
				anIntArray1195[anInt1197++] = (((Class341) Class108_Sub21.aClass341_7304).aBool4520 && !(((Class341) Class108_Sub21.aClass341_7304).aBool4502)) ? 1
						: 0;
				return;
			}
			if (i == 6135) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub1_5715
						.method2250(false);
				return;
			}
			if (i == 6136) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
						.method2429(false) == 1 ? 1 : 0;
				return;
			}
			if (i == 6138) {
				anIntArray1195[anInt1197++] = Class224
						.method1437(
								200,
								((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
										.method3181(false), (byte) 83);
				return;
			}
			if (i == 6139) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727
						.method2617(false);
				return;
			}
			if (i == 6142) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5720
						.method2462(false);
				return;
			}
			if (i == 6143) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5690
						.method2462(false);
				return;
			}
			if (i == 6144) {
				anIntArray1195[anInt1197++] = Class376_Sub7.aBool7050 ? 1 : 0;
				return;
			}
			if (i == 6145) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub14_5693
						.method2658(false);
				return;
			}
			if (i == 6146) {
				anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
						.method2734(false);
				return;
			}
			if (i == 6147) {
				anIntArray1195[anInt1197++] = (((((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656) < 512
						|| Class376_Sub7.aBool7050 || Class220.aBool3024) ? 1
						: 0);
				return;
			}
			if (i == 6148) {
				anIntArray1195[anInt1197++] = Class62.aBool904 ? 1 : 0;
				return;
			}
		} else if (i < 6300) {
			if (i == 6200) {
				anInt1197 -= 2;
				Class376_Sub7_Sub2_Sub1.aShort10202 = (short) anIntArray1195[anInt1197];
				if (Class376_Sub7_Sub2_Sub1.aShort10202 <= 0)
					Class376_Sub7_Sub2_Sub1.aShort10202 = (short) 256;
				Class11_Sub2_Sub14.aShort9014 = (short) anIntArray1195[anInt1197 + 1];
				if (Class11_Sub2_Sub14.aShort9014 <= 0)
					Class11_Sub2_Sub14.aShort9014 = (short) 205;
				return;
			}
			if (i == 6201) {
				anInt1197 -= 2;
				Class11_Sub6_Sub3.aShort9139 = (short) anIntArray1195[anInt1197];
				if (Class11_Sub6_Sub3.aShort9139 <= 0)
					Class11_Sub6_Sub3.aShort9139 = (short) 256;
				Class108_Sub23.aShort7762 = (short) anIntArray1195[anInt1197 + 1];
				if (Class108_Sub23.aShort7762 <= 0)
					Class108_Sub23.aShort7762 = (short) 320;
				return;
			}
			if (i == 6202) {
				anInt1197 -= 4;
				Class11_Sub49.aShort8017 = (short) anIntArray1195[anInt1197];
				if (Class11_Sub49.aShort8017 <= 0)
					Class11_Sub49.aShort8017 = (short) 1;
				Class254.aShort3497 = (short) anIntArray1195[anInt1197 + 1];
				if (Class254.aShort3497 <= 0)
					Class254.aShort3497 = (short) 32767;
				else if (Class254.aShort3497 < Class11_Sub49.aShort8017)
					Class254.aShort3497 = Class11_Sub49.aShort8017;
				Class51.aShort799 = (short) anIntArray1195[anInt1197 + 2];
				if (Class51.aShort799 <= 0)
					Class51.aShort799 = (short) 1;
				Class266.aShort3617 = (short) anIntArray1195[anInt1197 + 3];
				if (Class266.aShort3617 <= 0)
					Class266.aShort3617 = (short) 32767;
				else {
					if (Class266.aShort3617 < Class51.aShort799)
						Class266.aShort3617 = Class51.aShort799;
					return;
				}
				return;
			}
			if (i == 6203) {
				Class194.method1269(
						false,
						false,
						0,
						(((IComponentDefinitions) Class321_Sub4.aClass192_8010).anInt2546),
						(((IComponentDefinitions) Class321_Sub4.aClass192_8010).anInt2610),
						0);
				anIntArray1195[anInt1197++] = IComponentDefinitions.anInt2624;
				anIntArray1195[anInt1197++] = Class108_Sub16.anInt6545;
				return;
			}
			if (i == 6204) {
				anIntArray1195[anInt1197++] = Class11_Sub6_Sub3.aShort9139;
				anIntArray1195[anInt1197++] = Class108_Sub23.aShort7762;
				return;
			}
			if (i == 6205) {
				anIntArray1195[anInt1197++] = Class376_Sub7_Sub2_Sub1.aShort10202;
				anIntArray1195[anInt1197++] = Class11_Sub2_Sub14.aShort9014;
				return;
			}
		} else if (i < 6400) {
			if (i == 6300) {
				anIntArray1195[anInt1197++] = (int) (Class137
						.method878((byte) -95) / 60000L);
				return;
			}
			if (i == 6301) {
				anIntArray1195[anInt1197++] = ((int) (Class137
						.method878((byte) -42) / 86400000L) - 11745);
				return;
			}
			if (i == 6302) {
				anInt1197 -= 3;
				int i_446_ = anIntArray1195[anInt1197];
				int i_447_ = anIntArray1195[anInt1197 + 1];
				int i_448_ = anIntArray1195[anInt1197 + 2];
				aCalendar1196.clear();
				aCalendar1196.set(11, 12);
				aCalendar1196.set(i_448_, i_447_, i_446_);
				int i_449_ = ((int) (aCalendar1196.getTime().getTime() / 86400000L) - 11745);
				if (i_448_ < 1970)
					i_449_--;
				anIntArray1195[anInt1197++] = i_449_;
				return;
			}
			if (i == 6303) {
				aCalendar1196.clear();
				aCalendar1196.setTime(new Date(Class137.method878((byte) -39)));
				anIntArray1195[anInt1197++] = aCalendar1196.get(1);
				return;
			}
			if (i == 6304) {
				int i_450_ = anIntArray1195[--anInt1197];
				boolean bool_451_ = true;
				if (i_450_ < 0)
					bool_451_ = (i_450_ + 1) % 4 == 0;
				else if (i_450_ < 1582)
					bool_451_ = i_450_ % 4 == 0;
				else if (i_450_ % 4 != 0)
					bool_451_ = false;
				else if (i_450_ % 100 != 0)
					bool_451_ = true;
				else if (i_450_ % 400 != 0)
					bool_451_ = false;
				anIntArray1195[anInt1197++] = bool_451_ ? 1 : 0;
				return;
			}
		} else if (i < 6500) {
			if (i == 6405) {
				anIntArray1195[anInt1197++] = Class225.method1446(0) ? 1 : 0;
				return;
			}
			if (i == 6406) {
				anIntArray1195[anInt1197++] = Applet_Sub1.method3992(5) ? 1 : 0;
				return;
			}
		} else if (i < 6600) {
			if (i == 6500) {
				if (Class285.anInt3846 != 7 || Class94_Sub1.loginStep != 0
						|| Class313.anInt4162 != 0)
					anIntArray1195[anInt1197++] = 1;
				else {
					if (Class234_Sub1_Sub1.aBool9731)
						anIntArray1195[anInt1197++] = 0;
					else {
						if (Class359.aLong4685 > Class137.method878((byte) -82) - 1000L)
							anIntArray1195[anInt1197++] = 1;
						else {
							Class234_Sub1_Sub1.aBool9731 = true;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class326.aClass370_4342),
											(byte) -74);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeInt(-49, Class131.anInt1836);
							Class79.method541(class11_sub10, -53);
							anIntArray1195[anInt1197++] = 0;
							return;
						}
						return;
					}
					return;
				}
				return;
			}
			if (i == 6501) {
				Class195_Sub1 class195_sub1 = Class225.method1443(0);
				if (class195_sub1 != null) {
					anIntArray1195[anInt1197++] = ((Class195_Sub1) class195_sub1).anInt6159;
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2649;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6160;
					Class193 class193 = class195_sub1.method2626((byte) 111);
					anIntArray1195[anInt1197++] = ((Class193) class193).anInt2636;
					aStringArray1185[anInt1182++] = ((Class193) class193).aString2631;
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2650;
					anIntArray1195[anInt1197++] = ((Class195_Sub1) class195_sub1).anInt6156;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6154;
				} else {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					return;
				}
				return;
			}
			if (i == 6502) {
				Class195_Sub1 class195_sub1 = Class239.method1523(1554);
				if (class195_sub1 != null) {
					anIntArray1195[anInt1197++] = ((Class195_Sub1) class195_sub1).anInt6159;
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2649;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6160;
					Class193 class193 = class195_sub1.method2626((byte) 111);
					anIntArray1195[anInt1197++] = ((Class193) class193).anInt2636;
					aStringArray1185[anInt1182++] = ((Class193) class193).aString2631;
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2650;
					anIntArray1195[anInt1197++] = ((Class195_Sub1) class195_sub1).anInt6156;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6154;
				} else {
					anIntArray1195[anInt1197++] = -1;
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					return;
				}
				return;
			}
			if (i == 6503) {
				int i_452_ = anIntArray1195[--anInt1197];
				String string = aStringArray1185[--anInt1182];
				if (Class285.anInt3846 != 7 || Class94_Sub1.loginStep != 0
						|| Class313.anInt4162 != 0)
					anIntArray1195[anInt1197++] = 0;
				else {
					anIntArray1195[anInt1197++] = (Class175.method1144(
							(byte) 49, string, i_452_) ? 1 : 0);
					return;
				}
				return;
			}
			if (i == 6506) {
				int i_453_ = anIntArray1195[--anInt1197];
				Class195_Sub1 class195_sub1 = Class128.method836(46, i_453_);
				if (class195_sub1 != null) {
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2649;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6160;
					Class193 class193 = class195_sub1.method2626((byte) 111);
					anIntArray1195[anInt1197++] = ((Class193) class193).anInt2636;
					aStringArray1185[anInt1182++] = ((Class193) class193).aString2631;
					anIntArray1195[anInt1197++] = ((Class195) class195_sub1).anInt2650;
					anIntArray1195[anInt1197++] = ((Class195_Sub1) class195_sub1).anInt6156;
					aStringArray1185[anInt1182++] = ((Class195_Sub1) class195_sub1).aString6154;
				} else {
					anIntArray1195[anInt1197++] = -1;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					anIntArray1195[anInt1197++] = 0;
					anIntArray1195[anInt1197++] = 0;
					aStringArray1185[anInt1182++] = "";
					return;
				}
				return;
			}
			if (i == 6507) {
				anInt1197 -= 4;
				int i_454_ = anIntArray1195[anInt1197];
				boolean bool_455_ = anIntArray1195[anInt1197 + 1] == 1;
				int i_456_ = anIntArray1195[anInt1197 + 2];
				boolean bool_457_ = anIntArray1195[anInt1197 + 3] == 1;
				Class111.method745(i_456_, i_454_, (byte) 114, bool_455_,
						bool_457_);
				return;
			}
			if (i == 6508) {
				Class349.method2100((byte) 90);
				return;
			}
			if (i == 6509) {
				if (Class285.anInt3846 == 7) {
					Class358.aBool4670 = anIntArray1195[--anInt1197] == 1;
					return;
				}
				return;
			}
			if (i == 6510) {
				anIntArray1195[anInt1197++] = Class254_Sub3.anInt8047;
				return;
			}
		} else if (i >= 6700) {
			if (i < 6800 && Class331.aClass307_4403 == Class316.aClass307_4181) {
				if (i == 6700) {
					int i_458_ = Class75_Sub2.aClass213_7160.method1366(-95);
					if (Class365.anInt4797 != -1)
						i_458_++;
					anIntArray1195[anInt1197++] = i_458_;
					return;
				}
				if (i == 6701) {
					int i_459_ = anIntArray1195[--anInt1197];
					if (Class365.anInt4797 != -1) {
						if (i_459_ == 0) {
							anIntArray1195[anInt1197++] = Class365.anInt4797;
							return;
						}
						i_459_--;
					}
					Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
							.method1365(24490));
					while (i_459_-- > 0)
						class11_sub24 = (Class11_Sub24) Class75_Sub2.aClass213_7160
								.method1367((byte) 71);
					anIntArray1195[anInt1197++] = ((Class11_Sub24) class11_sub24).anInt6233;
					return;
				}
				if (i == 6702) {
					int i_460_ = anIntArray1195[--anInt1197];
					if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_460_] == null)
						aStringArray1185[anInt1182++] = "";
					else {
						String string = (((IComponentDefinitions) (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_460_][0])).aString2464);
						if (string == null)
							aStringArray1185[anInt1182++] = "";
						else {
							aStringArray1185[anInt1182++] = string.substring(0,
									string.indexOf(':'));
							return;
						}
						return;
					}
					return;
				}
				if (i == 6703) {
					int i_461_ = anIntArray1195[--anInt1197];
					if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_461_] == null)
						anIntArray1195[anInt1197++] = 0;
					else {
						anIntArray1195[anInt1197++] = (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_461_]).length;
						return;
					}
					return;
				}
				if (i == 6704) {
					anInt1197 -= 2;
					int i_462_ = anIntArray1195[anInt1197];
					int i_463_ = anIntArray1195[anInt1197 + 1];
					if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_462_] == null)
						aStringArray1185[anInt1182++] = "";
					else {
						String string = (((IComponentDefinitions) (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_462_][i_463_])).aString2464);
						if (string == null)
							aStringArray1185[anInt1182++] = "";
						else {
							aStringArray1185[anInt1182++] = string;
							return;
						}
						return;
					}
					return;
				}
				if (i == 6705) {
					anInt1197 -= 2;
					int i_464_ = anIntArray1195[anInt1197];
					int i_465_ = anIntArray1195[anInt1197 + 1];
					if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_464_] == null)
						anIntArray1195[anInt1197++] = 0;
					else {
						anIntArray1195[anInt1197++] = ((IComponentDefinitions) (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_464_][i_465_])).anInt2487;
						return;
					}
					return;
				}
				if (i == 6706)
					return;
				if (i == 6707) {
					anInt1197 -= 3;
					int i_466_ = anIntArray1195[anInt1197];
					int i_467_ = anIntArray1195[anInt1197 + 1];
					int i_468_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_466_ << 16 | i_467_, 1, i_468_, "",
							(byte) 126);
					return;
				}
				if (i == 6708) {
					anInt1197 -= 3;
					int i_469_ = anIntArray1195[anInt1197];
					int i_470_ = anIntArray1195[anInt1197 + 1];
					int i_471_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_469_ << 16 | i_470_, 2, i_471_, "",
							(byte) 122);
					return;
				}
				if (i == 6709) {
					anInt1197 -= 3;
					int i_472_ = anIntArray1195[anInt1197];
					int i_473_ = anIntArray1195[anInt1197 + 1];
					int i_474_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_472_ << 16 | i_473_, 3, i_474_, "",
							(byte) 122);
					return;
				}
				if (i == 6710) {
					anInt1197 -= 3;
					int i_475_ = anIntArray1195[anInt1197];
					int i_476_ = anIntArray1195[anInt1197 + 1];
					int i_477_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_475_ << 16 | i_476_, 4, i_477_, "",
							(byte) 118);
					return;
				}
				if (i == 6711) {
					anInt1197 -= 3;
					int i_478_ = anIntArray1195[anInt1197];
					int i_479_ = anIntArray1195[anInt1197 + 1];
					int i_480_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_478_ << 16 | i_479_, 5, i_480_, "",
							(byte) 122);
					return;
				}
				if (i == 6712) {
					anInt1197 -= 3;
					int i_481_ = anIntArray1195[anInt1197];
					int i_482_ = anIntArray1195[anInt1197 + 1];
					int i_483_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_481_ << 16 | i_482_, 6, i_483_, "",
							(byte) 120);
					return;
				}
				if (i == 6713) {
					anInt1197 -= 3;
					int i_484_ = anIntArray1195[anInt1197];
					int i_485_ = anIntArray1195[anInt1197 + 1];
					int i_486_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_484_ << 16 | i_485_, 7, i_486_, "",
							(byte) 123);
					return;
				}
				if (i == 6714) {
					anInt1197 -= 3;
					int i_487_ = anIntArray1195[anInt1197];
					int i_488_ = anIntArray1195[anInt1197 + 1];
					int i_489_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_487_ << 16 | i_488_, 8, i_489_, "",
							(byte) 119);
					return;
				}
				if (i == 6715) {
					anInt1197 -= 3;
					int i_490_ = anIntArray1195[anInt1197];
					int i_491_ = anIntArray1195[anInt1197 + 1];
					int i_492_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_490_ << 16 | i_491_, 9, i_492_, "",
							(byte) 125);
					return;
				}
				if (i == 6716) {
					anInt1197 -= 3;
					int i_493_ = anIntArray1195[anInt1197];
					int i_494_ = anIntArray1195[anInt1197 + 1];
					int i_495_ = anIntArray1195[anInt1197 + 2];
					Class15.method150(i_493_ << 16 | i_494_, 10, i_495_, "",
							(byte) 124);
					return;
				}
				if (i == 6717) {
					anInt1197 -= 3;
					int i_496_ = anIntArray1195[anInt1197];
					int i_497_ = anIntArray1195[anInt1197 + 1];
					int i_498_ = anIntArray1195[anInt1197 + 2];
					IComponentDefinitions class192 = Class146.method913(
							i_496_ << 16 | i_497_, (byte) -103, i_498_);
					Class11_Sub45_Sub5.method3436(-1);
					InterfaceSettings class11_sub9 = client
							.method4013(class192);
					Class180.method1184(class11_sub9.method2353(false),
							(((InterfaceSettings) class11_sub9).anInt5354),
							class192, true);
					return;
				}
			} else if (i < 6900) {
				if (i == 6800) {
					int i_499_ = anIntArray1195[--anInt1197];
					Class23 class23 = Class168.aClass280_2160.method1726(
							(byte) -78, i_499_);
					if (((Class23) class23).aString247 == null)
						aStringArray1185[anInt1182++] = "";
					else {
						aStringArray1185[anInt1182++] = ((Class23) class23).aString247;
						return;
					}
					return;
				}
				if (i == 6801) {
					int i_500_ = anIntArray1195[--anInt1197];
					Class23 class23 = Class168.aClass280_2160.method1726(
							(byte) -85, i_500_);
					anIntArray1195[anInt1197++] = ((Class23) class23).anInt203;
					return;
				}
				if (i == 6802) {
					int i_501_ = anIntArray1195[--anInt1197];
					Class23 class23 = Class168.aClass280_2160.method1726(
							(byte) -92, i_501_);
					anIntArray1195[anInt1197++] = ((Class23) class23).anInt208;
					return;
				}
				if (i == 6803) {
					int i_502_ = anIntArray1195[--anInt1197];
					Class23 class23 = Class168.aClass280_2160.method1726(
							(byte) -108, i_502_);
					anIntArray1195[anInt1197++] = ((Class23) class23).anInt207;
					return;
				}
				if (i == 6804) {
					anInt1197 -= 2;
					int i_503_ = anIntArray1195[anInt1197];
					int i_504_ = anIntArray1195[anInt1197 + 1];
					Class283 class283 = Class187.aClass52_2388.method432(
							i_504_, (byte) -120);
					if (class283.method1745(0))
						aStringArray1185[anInt1182++] = (Class168.aClass280_2160
								.method1726((byte) -103, i_503_).method201(
								(byte) -74, ((Class283) class283).aString3833,
								i_504_));
					else {
						anIntArray1195[anInt1197++] = (Class168.aClass280_2160
								.method1726((byte) -91, i_503_).method195(
								((Class283) class283).anInt3827, (byte) -128,
								i_504_));
						return;
					}
					return;
				}
			} else if (i < 7000) {
				if (i == 6900) {
					anIntArray1195[anInt1197++] = (Class11_Sub2_Sub29.aBool9474
							&& !Class242.aBool3289 ? 1 : 0);
					return;
				}
				if (i == 6901) {
					anIntArray1195[anInt1197++] = Class236_Sub5.anInt6855;
					return;
				}
				if (i == 6902) {
					anIntArray1195[anInt1197++] = Class98.anInt1309;
					return;
				}
				if (i == 6903) {
					anIntArray1195[anInt1197++] = Class11_Sub2_Sub36.anInt9755;
					return;
				}
				if (i == 6904) {
					anIntArray1195[anInt1197++] = Class11.anInt84;
					return;
				}
				if (i == 6905) {
					String string = "";
					if (Class11_Sub2_Sub4.aClass368_8500 != null) {
						if (Class11_Sub2_Sub4.aClass368_8500.anObject4838 != null)
							string = (String) (Class11_Sub2_Sub4.aClass368_8500.anObject4838);
						else
							string = Class382
									.method2231(
											(Class11_Sub2_Sub4.aClass368_8500.anInt4841),
											1677133712);
					}
					aStringArray1185[anInt1182++] = string;
					return;
				}
				if (i == 6906) {
					anIntArray1195[anInt1197++] = Class11_Sub6_Sub3.anInt9128;
					return;
				}
				if (i == 6907) {
					anIntArray1195[anInt1197++] = Class300.anInt4049;
					return;
				}
				if (i == 6908) {
					anIntArray1195[anInt1197++] = Class197.anInt2667;
					return;
				}
				if (i == 6909) {
					anIntArray1195[anInt1197++] = Class379.aBool4957 ? 1 : 0;
					return;
				}
				if (i == 6910) {
					anIntArray1195[anInt1197++] = Class108_Sub1.anInt5029;
					return;
				}
				if (i == 6911) {
					anIntArray1195[anInt1197++] = Class11_Sub2_Sub7.anInt8731;
					return;
				}
				if (i == 6912) {
					anIntArray1195[anInt1197++] = Class94_Sub2.anInt5588;
					return;
				}
			} else if (i < 7100) {
				if (i == 7000) {
					int i_505_ = Class206.method1324((byte) -76);
					anIntArray1195[anInt1197++] = Class11_Sub32.anInt6886 = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
							.method3181(false);
					anIntArray1195[anInt1197++] = i_505_;
					Class114.method758(3);
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7001) {
					Class11_Sub2_Sub32_Sub1.method3881(-1);
					Class114.method758(3);
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7002) {
					Class11_Sub12_Sub2.method3556(1);
					Class114.method758(3);
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7003) {
					IComponentDefinitions.method1251(-65536);
					Class114.method758(3);
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7004) {
					Class126.method828(87, true);
					Class114.method758(3);
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7005) {
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub7_5683));
					Class186.method1212(10343);
					Class236_Sub1.aBool6093 = false;
					return;
				}
				if (i == 7006) {
					if (Class11_Sub32.anInt6886 == 2)
						Class251_Sub2.aBool5433 = true;
					else {
						if (Class11_Sub32.anInt6886 == 1)
							Class11_Sub7.aBool5254 = true;
						else {
							if (Class11_Sub32.anInt6886 == 3)
								Class108_Sub29.aBool8023 = true;
							return;
						}
						return;
					}
					return;
				}
				if (i == 7007) {
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub7_5683
							.method2435(false);
					return;
				}
			} else if (i < 7200) {
				if (i == 7100) {
					anInt1197 -= 2;
					int i_506_ = anIntArray1195[anInt1197];
					int i_507_ = anIntArray1195[anInt1197 + 1];
					if (i_506_ != -1) {
						if (i_507_ > 255)
							i_507_ = 255;
						else if (i_507_ < 0)
							i_507_ = 0;
						Class128.method835(i_506_, false, i_507_, 4096);
					}
					return;
				}
				if (i == 7101) {
					int i_508_ = anIntArray1195[--anInt1197];
					if (i_508_ != -1)
						Class46.method404(i_508_, (byte) 108);
					return;
				}
				if (i == 7102) {
					int i_509_ = anIntArray1195[--anInt1197];
					if (i_509_ != -1)
						Class154.method966((byte) 50, i_509_);
					return;
				}
				if (i == 7103) {
					anIntArray1195[anInt1197++] = Class11_Sub2_Sub3.method3338(
							(byte) -64, "jagtheora") ? 1 : 0;
					return;
				}
			} else if (i < 7300) {
				if (i == 7201) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703
							.method2346((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7202) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700
							.method2957((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7203) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
							.method3150((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7204) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695
							.method2374((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7205) {
					anIntArray1195[anInt1197++] = ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712
							.method2700((byte) -53) && Class321_Sub2.aClass163_6648
							.method1067()) ? 1 : 0);
					return;
				}
				if (i == 7206) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub4_5691
							.method2366((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7207) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub29_5689
							.method3229((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7208) {
					anIntArray1195[anInt1197++] = ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699
							.method3127((byte) -53) && Class321_Sub2.aClass163_6648
							.method1003()) ? 1 : 0);
					return;
				}
				if (i == 7209) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721
							.method2709((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7210) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
							.method2430((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7211) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727
							.method2619((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7212) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732
							.method2894((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7213) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
							.method2735((byte) -53) ? 1 : 0);
					return;
				}
				if (i == 7214) {
					anIntArray1195[anInt1197++] = (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730
							.method3182((byte) -53) ? 1 : 0);
					return;
				}
			} else if (i < 7400) {
				if (i == 7301) {
					int i_510_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703
							.method721(i_510_, 82);
					return;
				}
				if (i == 7302) {
					int i_511_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700
							.method721(i_511_, 81);
					return;
				}
				if (i == 7303) {
					int i_512_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717
							.method721(i_512_, 76);
					return;
				}
				if (i == 7304) {
					int i_513_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695
							.method721(i_513_, 13);
					return;
				}
				if (i == 7305) {
					int i_514_ = anIntArray1195[--anInt1197];
					if (!Class321_Sub2.aClass163_6648.method1067())
						anIntArray1195[anInt1197++] = 3;
					else {
						anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712
								.method721(i_514_, 106);
						return;
					}
					return;
				}
				if (i == 7306) {
					int i_515_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub4_5691
							.method721(i_515_, 91);
					return;
				}
				if (i == 7307) {
					int i_516_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub29_5689
							.method721(i_516_, 21);
					return;
				}
				if (i == 7308) {
					int i_517_ = anIntArray1195[--anInt1197];
					if (!Class321_Sub2.aClass163_6648.method1003())
						anIntArray1195[anInt1197++] = 3;
					else {
						anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699
								.method721(i_517_, 85);
						return;
					}
					return;
				}
				if (i == 7309) {
					int i_518_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721
							.method721(i_518_, 85);
					return;
				}
				if (i == 7310) {
					int i_519_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
							.method721(i_519_, 125);
					return;
				}
				if (i == 7311) {
					int i_520_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727
							.method721(i_520_, 79);
					return;
				}
				if (i == 7312) {
					int i_521_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732
							.method721(i_521_, 58);
					return;
				}
				if (i == 7313) {
					int i_522_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
							.method721(i_522_, 67);
					return;
				}
				if (i == 7314) {
					int i_523_ = anIntArray1195[--anInt1197];
					anIntArray1195[anInt1197++] = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730
							.method721(i_523_, 78);
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(i));
	}

	static {
		aClass196Array1180 = new Class196[50];
		anIntArray1188 = new int[5];
		aStringArray1185 = new String[1000];
		anIntArray1195 = new int[1000];
		anInt1197 = 0;
		aCalendar1196 = Calendar.getInstance();
		anIntArray1199 = new int[3];
		aStringArray1200 = new String[] { "Jan", "Feb", "Mar", "Apr", "May",
				"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		aClass22_1198 = new Class22(4);
		anInt1201 = 0;
	}
}
