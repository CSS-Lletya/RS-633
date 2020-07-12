/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;

import jagex3.jagmisc.jagmisc;

final class Class344 {
	int anInt4561;
	static int anInt4562;
	byte[] aByteArray4563;
	static int anInt4564 = -1;
	static int anInt4565;
	static int anInt4566;
	static int anInt4567;
	static int anInt4568;
	int anInt4569;
	static Class124 aClass124_4570 = new Class124(64);
	byte[] aByteArray4571;
	int anInt4572;
	int anInt4573;
	int anInt4574;
	static int[] anIntArray4575 = { 16, 32, 64, 128 };
	int anInt4576;
	int anInt4577;

	static final void method2082(int i) {
		try {
			for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
					.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
					.method578(-15361))) {
				if (Class135.method874(-1003,
						((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760))
					Class51.method428(true, class11_sub45_sub5);
			}
			if (i >= -57)
				aClass124_4570 = null;
			anInt4565++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vf.E(" + i + ')');
		}
	}

	static final void method2083(int i, String string) {
		try {
			anInt4568++;
			if (i != -1)
				aClass124_4570 = null;
			if (string != null) {
				if (((Class94_Sub1.anInt5228 ^ 0xffffffff) <= -201 && !Class240.aBool3259)
						|| (Class94_Sub1.anInt5228 ^ 0xffffffff) <= -201) {
					Class11_Sub2_Sub28.method3715(true, 4,
							(Class26.aClass26_286.method217((byte) 118,
									(Class11_Sub45_Sub1_Sub2.anInt9884))));
					String string_0_ = (Class26.aClass26_287.method217(
							(byte) 120, Class11_Sub45_Sub1_Sub2.anInt9884));
					if (string_0_ != null)
						Class11_Sub2_Sub28.method3715(true, 4, string_0_);
				} else {
					String string_1_ = Class282.method1742(i + 1, string);
					if (string_1_ != null) {
						for (int i_2_ = 0; Class94_Sub1.anInt5228 > i_2_; i_2_++) {
							String string_3_ = Class282.method1742(0,
									(Class109.aStringArray1476[i_2_]));
							if (string_3_ != null
									&& string_3_.equals(string_1_)) {
								Class11_Sub2_Sub28
										.method3715(
												true,
												4,
												string
														+ (Class26.aClass26_314
																.method217(
																		(byte) 84,
																		(Class11_Sub45_Sub1_Sub2.anInt9884))));
								return;
							}
							if (Class137.aStringArray1882[i_2_] != null) {
								String string_4_ = Class282.method1742(
										i ^ 0xffffffff,
										(Class137.aStringArray1882[i_2_]));
								if (string_4_ != null
										&& string_4_.equals(string_1_)) {
									Class11_Sub2_Sub28
											.method3715(
													true,
													4,
													string
															+ (Class26.aClass26_314
																	.method217(
																			(byte) 124,
																			(Class11_Sub45_Sub1_Sub2.anInt9884))));
									return;
								}
							}
						}
						for (int i_5_ = 0; ((Class231.anInt3168 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++) {
							String string_6_ = Class282
									.method1742(
											0,
											(Class11_Sub2_Sub16.aStringArray9034[i_5_]));
							if (string_6_ != null
									&& string_6_.equals(string_1_)) {
								Class11_Sub2_Sub28
										.method3715(
												true,
												4,
												((Class26.aClass26_319
														.method217(
																(byte) 121,
																Class11_Sub45_Sub1_Sub2.anInt9884))
														+ string + (Class26.aClass26_320
														.method217(
																(byte) 115,
																(Class11_Sub45_Sub1_Sub2.anInt9884)))));
								return;
							}
							if (Class345.aStringArray4584[i_5_] != null) {
								String string_7_ = Class282.method1742(
										i ^ 0xffffffff,
										(Class345.aStringArray4584[i_5_]));
								if (string_7_ != null
										&& string_7_.equals(string_1_)) {
									Class11_Sub2_Sub28
											.method3715(
													true,
													4,
													((Class26.aClass26_319
															.method217(
																	(byte) 88,
																	Class11_Sub45_Sub1_Sub2.anInt9884))
															+ string + (Class26.aClass26_320
															.method217(
																	(byte) 95,
																	(Class11_Sub45_Sub1_Sub2.anInt9884)))));
									return;
								}
							}
						}
						if (Class282
								.method1742(
										0,
										(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400))
								.equals(string_1_))
							Class11_Sub2_Sub28
									.method3715(
											true,
											4,
											(Class26.aClass26_317
													.method217(
															(byte) 92,
															Class11_Sub45_Sub1_Sub2.anInt9884)));
						else {
							Class203.anInt2721++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class305.aClass370_4097),
											(byte) 122);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(Class98.method660(string, 0), i
											+ -1528071455);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27, string);
							Class79.method541(class11_sub10, -20);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vf.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2084(String string, boolean bool, boolean bool_8_,
			int i) {
		do {
			try {
				anInt4562++;
				try {
					if (string.equalsIgnoreCase("commands")
							|| string.equalsIgnoreCase("help")) {
						Class314.method1912("commands - This command",
								(byte) -98);
						Class314.method1912("cls - Clear console", (byte) -88);
						Class314.method1912(
								"displayfps - Toggle FPS and other information",
								(byte) 54);
						Class314.method1912(
								"renderer - Print graphics renderer information",
								(byte) 110);
						Class314.method1912(
								"heap - Print java memory information",
								(byte) -103);
						break;
					}
					if (string.equalsIgnoreCase("cls")) {
						Class11_Sub2_Sub39.anInt9807 = 0;
						Class11_Sub36.anInt7080 = 0;
						break;
					}
					if (string.equalsIgnoreCase("displayfps")) {
						Class107.aBool1454 = !Class107.aBool1454;
						if (Class107.aBool1454)
							Class314.method1912("FPS on", (byte) -103);
						else {
							Class314.method1912("FPS off", (byte) -86);
							break;
						}
						break;
					}
					if (i >= -113)
						method2082(83);
					if (string.equals("renderer")) {
						Class100 class100 = Class321_Sub2.aClass163_6648
								.method1055();
						Class314.method1912("Vendor: "
								+ (((Class100) class100).anInt1332), (byte) -96);
						Class314.method1912("Name: "
								+ (((Class100) class100).aString1323),
								(byte) 33);
						Class314.method1912("Version: "
								+ ((Class100) class100).anInt1325, (byte) -101);
						Class314.method1912("Device: "
								+ (((Class100) class100).aString1331),
								(byte) -100);
						Class314.method1912(
								("Driver Version: " + (((Class100) class100).aLong1330)),
								(byte) 33);
						break;
					}
					if (string.equals("heap")) {
						Class314.method1912(
								("Heap: " + Class177.anInt2245 + "MB"),
								(byte) 34);
						break;
					}
				} catch (Exception exception) {
					Class314.method1912((Class26.aClass26_278.method217(
							(byte) 88, Class11_Sub45_Sub1_Sub2.anInt9884)),
							(byte) 43);
					break;
				}
				if ((Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711)
						|| Class256_Sub2.anInt7713 >= 2) {
					if (string.equalsIgnoreCase("errortest"))
						throw new RuntimeException();
					if (string.equals("nativememerror"))
						throw new OutOfMemoryError("native(MPR");
					try {
						if (string.equalsIgnoreCase("printfps")) {
							Class314.method1912("FPS: "
									+ (Class11_Sub2_Sub11.anInt8855), (byte) 11);
							break;
						}
						if (string.equalsIgnoreCase("occlude")) {
							Class108_Sub10.aBool6130 = !Class108_Sub10.aBool6130;
							if (Class108_Sub10.aBool6130)
								Class314.method1912("Occlsion now on!",
										(byte) -104);
							else {
								Class314.method1912("Occlsion now off!",
										(byte) -128);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("fpson")) {
							Class107.aBool1454 = true;
							Class314.method1912("fps debug enabled", (byte) 38);
							break;
						}
						if (string.equalsIgnoreCase("fpsoff")) {
							Class107.aBool1454 = false;
							Class314.method1912("fps debug disabled",
									(byte) -88);
							break;
						}
						if (string.equals("systemmem")) {
							try {
								Class314.method1912(
										("System memory: "
												+ (jagmisc
														.getAvailablePhysicalMemory() / 1048576L)
												+ "/"
												+ (((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656) + "Mb"),
										(byte) -114);
							} catch (Throwable throwable) {
								/* empty */
							}
							break;
						}
						if (string.equalsIgnoreCase("cleartext")) {
							Class163_Sub2.aClass131_7378.method850(-76);
							Class314.method1912("Text coords cleared",
									(byte) -115);
							break;
						}
						if (string.equalsIgnoreCase("gc")) {
							Class11_Sub39.method2927(false);
							for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -11; i_9_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_10_ = (int) ((runtime.totalMemory() - runtime
									.freeMemory()) / 1024L);
							Class314.method1912("mem=" + i_10_ + "k", (byte) 6);
							break;
						}
						if (string.equalsIgnoreCase("compact")) {
							Class11_Sub39.method2927(false);
							for (int i_11_ = 0; i_11_ < 10; i_11_++)
								System.gc();
							Runtime runtime = Runtime.getRuntime();
							int i_12_ = (int) ((runtime.totalMemory() + -runtime
									.freeMemory()) / 1024L);
							Class314.method1912(("Memory before cleanup="
									+ i_12_ + "k"), (byte) -95);
							Class31.method258(false);
							Class11_Sub39.method2927(false);
							for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -11; i_13_++)
								System.gc();
							i_12_ = (int) ((runtime.totalMemory() + -runtime
									.freeMemory()) / 1024L);
							Class314.method1912(("Memory after cleanup="
									+ i_12_ + "k"), (byte) 49);
							break;
						}
						if (string.equalsIgnoreCase("unloadnatives")) {
							Class314.method1912(
									(!Class11_Sub21.method2560((byte) -72) ? "Library unloading failed!"
											: "Libraries unloaded"),
									(byte) -100);
							break;
						}
						if (string.equalsIgnoreCase("clientdrop")) {
							Class314.method1912("Dropped client connection",
									(byte) -128);
							if (Class285.anInt3846 == 10)
								Class287.method1777((byte) 93);
							else {
								if (Class285.anInt3846 == 11)
									Class38.aBool505 = true;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("rotateconnectmethods")) {
							Class275.aClass46_3705.method409(98);
							Class314.method1912("Rotated connection methods",
									(byte) 65);
							break;
						}
						if (string.equalsIgnoreCase("clientjs5drop")) {
							Class52.aClass187_810.method1223((byte) -65);
							Class314.method1912("Dropped client js5 net queue",
									(byte) 95);
							break;
						}
						if (string.equalsIgnoreCase("serverjs5drop")) {
							Class52.aClass187_810.method1215(false);
							Class314.method1912("Dropped server js5 net queue",
									(byte) 27);
							break;
						}
						if (string.equalsIgnoreCase("breakcon")) {
							Class108_Sub21.aClass341_7304.method2064(-96);
							Class108_Sub2.aClass217_5081.method1400((byte) 125);
							Class52.aClass187_810.method1220((byte) -103);
							Class314.method1912(
									"Breaking new connections for 5 seconds",
									(byte) -91);
							break;
						}
						if (string.equalsIgnoreCase("rebuild")) {
							Class114.method758(3);
							Class11_Sub45_Sub16_Sub2.method3928(16598);
							Class314.method1912("Rebuilding map", (byte) 48);
							break;
						}
						if (string.equalsIgnoreCase("rebuildprofile")) {
							Class167.aLong2151 = Class137
									.method878((byte) -110);
							Class196.aBool2664 = true;
							Class114.method758(3);
							Class11_Sub45_Sub16_Sub2.method3928(16598);
							Class314.method1912(
									"Rebuilding map (with profiling)",
									(byte) 43);
							break;
						}
						if (string.equalsIgnoreCase("wm1")) {
							Class113.method756(3, false, 1, -1, -1);
							if (Class187.method1227((byte) 54) != 1)
								Class314.method1912("wm1 failed", (byte) -97);
							else {
								Class314.method1912("wm1 succeeded", (byte) 99);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm2")) {
							Class113.method756(3, false, 2, -1, -1);
							if (Class187.method1227((byte) 54) == 2)
								Class314.method1912("wm2 succeeded", (byte) 90);
							else {
								Class314.method1912("wm2 failed", (byte) -109);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("wm3")) {
							Class113.method756(3, false, 3, 1024, 768);
							if ((Class187.method1227((byte) 54) ^ 0xffffffff) == -4)
								Class314.method1912("wm3 succeeded", (byte) 8);
							else {
								Class314.method1912("wm3 failed", (byte) 72);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk0")) {
							Class239.method1521(false, 0, 0);
							if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
									.method3181(false) ^ 0xffffffff) == -1) {
								Class314.method1912("Entered tk0", (byte) 70);
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												0,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
							} else {
								Class314.method1912("Failed to enter tk0",
										(byte) 14);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk1")) {
							Class239.method1521(false, 0, 1);
							if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
									.method3181(false) != 1)
								Class314.method1912("Failed to enter tk1",
										(byte) -98);
							else {
								Class314.method1912("Entered tk1", (byte) -89);
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												1,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk2")) {
							Class239.method1521(false, 0, 2);
							if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
									.method3181(false) != 2)
								Class314.method1912("Failed to enter tk2",
										(byte) -88);
							else {
								Class314.method1912("Entered tk2", (byte) -99);
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												2,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk3")) {
							Class239.method1521(false, 0, 3);
							if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
									.method3181(false) != 3)
								Class314.method1912("Failed to enter tk3",
										(byte) -102);
							else {
								Class314.method1912("Entered tk3", (byte) -127);
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												3,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tk5")) {
							Class239.method1521(false, 0, 5);
							if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
									.method3181(false) != 5)
								Class314.method1912("Failed to enter tk5",
										(byte) 119);
							else {
								Class314.method1912("Entered tk5", (byte) 127);
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												5,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
								break;
							}
							break;
						}
						if (string.startsWith("setba")) {
							if ((string.length() ^ 0xffffffff) > -7)
								Class314.method1912("Invalid buildarea value",
										(byte) -107);
							else {
								int i_14_ = Class173.method1139(
										string.substring(6), -23213);
								if ((i_14_ ^ 0xffffffff) > -1
										|| (Class212.method1362(2,
												Class177.anInt2245) < i_14_))
									Class314.method1912(
											"Invalid buildarea value",
											(byte) -85);
								else {
									Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
											.method2460(
													249682952,
													i_14_,
													(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub29_5689));
									Class186.method1212(10343);
									Class236_Sub1.aBool6093 = false;
									Class314.method1912(
											("maxbuildarea=" + ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub29_5689
													.method3230(false)),
											(byte) 96);
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("rect_debug")) {
							if (string.length() < 10)
								Class314.method1912("Invalid rect_debug value",
										(byte) 65);
							else {
								Class11_Sub2_Sub31.anInt9640 = Class173
										.method1139(
												string.substring(10).trim(),
												-23213);
								Class314.method1912(
										("rect_debug=" + (Class11_Sub2_Sub31.anInt9640)),
										(byte) 111);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("qa_op_test")) {
							Class11_Sub2_Sub14.aBool9010 = true;
							Class314.method1912(
									("qa_op_test=" + (Class11_Sub2_Sub14.aBool9010)),
									(byte) 37);
							break;
						}
						if (string.equalsIgnoreCase("clipcomponents")) {
							Class11_Sub52.aBool8051 = !Class11_Sub52.aBool8051;
							Class314.method1912(
									("clipcomponents=" + Class11_Sub52.aBool8051),
									(byte) -123);
							break;
						}
						if (string.startsWith("bloom")) {
							boolean bool_15_ = Class321_Sub2.aClass163_6648
									.method1086();
							if (!Class137.method875(-86, !bool_15_))
								Class314.method1912("Failed to enable bloom",
										(byte) 85);
							else {
								if (bool_15_)
									Class314.method1912("Bloom disabled",
											(byte) -94);
								else {
									Class314.method1912("Bloom enabled",
											(byte) 72);
									break;
								}
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("tween")) {
							if (!Class11_Sub2_Sub11.aBool8858) {
								Class11_Sub2_Sub11.aBool8858 = true;
								Class314.method1912("Forced tweening ENABLED!",
										(byte) 12);
							} else {
								Class11_Sub2_Sub11.aBool8858 = false;
								Class314.method1912(
										"Forced tweening disabled.", (byte) 11);
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("shiftclick")) {
							if (Class11_Sub45_Sub3.aBool8529) {
								Class314.method1912("Shift-click disabled.",
										(byte) -90);
								Class11_Sub45_Sub3.aBool8529 = false;
							} else {
								Class314.method1912("Shift-click ENABLED!",
										(byte) 110);
								Class11_Sub45_Sub3.aBool8529 = true;
								break;
							}
							break;
						}
						if (string.equalsIgnoreCase("getcgcoord")) {
							Class314.method1912(
									("x:"
											+ ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045) >> 9)
											+ " z:" + ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031) >> 9)),
									(byte) 11);
							break;
						}
						if (string.equalsIgnoreCase("getheight")) {
							Class314.method1912(
									("Height: " + (Class315.aClass12Array4179[(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)]
											.method131(
													(byte) -1,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031) >> 9,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045) >> 9))),
									(byte) 125);
							break;
						}
						if (string.equalsIgnoreCase("resetminimap")) {
							Class108_Sub7.aClass146_5636.method939((byte) 87);
							Class108_Sub7.aClass146_5636.method911(-105);
							Class47.aClass29_741.method246(2060105417);
							Class168.aClass280_2160.method1723((byte) -86);
							Class11_Sub45_Sub16_Sub2.method3928(16598);
							Class314.method1912("Minimap reset", (byte) -125);
							break;
						}
						if (string.startsWith("mc")) {
							if (!Class321_Sub2.aClass163_6648.method1049())
								Class314.method1912(
										"Current toolkit doesn't support multiple cores",
										(byte) -84);
							else {
								int i_16_ = Integer.parseInt(string
										.substring(3));
								if ((i_16_ ^ 0xffffffff) > -2)
									i_16_ = 1;
								else if (i_16_ > 4)
									i_16_ = 4;
								Class291.anInt3932 = i_16_;
								Class114.method758(3);
								Class314.method1912(
										("Render cores now: " + Class291.anInt3932),
										(byte) -103);
								break;
							}
							break;
						}
						if (string.startsWith("cachespace")) {
							Class314.method1912(("I(s): "
									+ Class11_Sub5.aClass22_5238.method191(40)
									+ "/" + Class11_Sub5.aClass22_5238
									.method193(0)), (byte) 81);
							Class314.method1912(
									("I(m): "
											+ Class376_Sub7_Sub2_Sub1.aClass22_10204
													.method191(-103) + "/" + Class376_Sub7_Sub2_Sub1.aClass22_10204
											.method193(0)), (byte) -103);
							Class314.method1912(
									("O(s): "
											+ ((Class223) Packet.aClass223_8723).aClass122_3067
													.method792((byte) 121)
											+ "/" + ((Class223) Packet.aClass223_8723).aClass122_3067
											.method791(0)), (byte) -111);
							break;
						}
						if (string.equalsIgnoreCase("getcamerapos")) {
							Class314.method1912(
									("Pos: "
											+ (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)
											+ ","
											+ (((Class11_Sub45_Sub11.anInt9157 >> 9) - -Class194.anInt2641) >> 6)
											+ ","
											+ (Class118.anInt1605
													+ (Class303.anInt4088 >> 9) >> 6)
											+ ","
											+ (0x3f & (Class11_Sub45_Sub11.anInt9157 >> 9)
													+ Class194.anInt2641)
											+ ","
											+ (Class118.anInt1605
													+ (Class303.anInt4088 >> 9) & 0x3f)
											+ " Height: " + ((Class318
											.method1931(
													75,
													Class303.anInt4088,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047),
													Class11_Sub45_Sub11.anInt9157)) - Class218.anInt3007)),
									(byte) -125);
							Class314.method1912(
									("Look: "
											+ (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)
											+ ","
											+ (Class194.anInt2641
													+ Class17.anInt146 >> 6)
											+ ","
											+ (Class118.anInt1605
													+ Class316.anInt4189 >> 6)
											+ ","
											+ (Class17.anInt146
													+ Class194.anInt2641 & 0x3f)
											+ ","
											+ (Class316.anInt4189
													+ Class118.anInt1605 & 0x3f)
											+ " Height: " + ((Class318
											.method1931(
													87,
													Class316.anInt4189,
													(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047),
													Class17.anInt146)) - Class253_Sub2.anInt6534)),
									(byte) -82);
							break;
						}
						if (string.equals("renderprofile")
								|| string.equals("rp")) {
							Class4.aBool27 = !Class4.aBool27;
							Class321_Sub2.aClass163_6648
									.method1053(Class4.aBool27);
							Class116.method763((byte) -100);
							Class314.method1912(
									("showprofiling=" + Class4.aBool27),
									(byte) 106);
							break;
						}
						if (string.startsWith("performancetest")) {
							int i_17_ = -1;
							int i_18_ = 1000;
							if ((string.length() ^ 0xffffffff) < -16) {
								String[] strings = Class121.method788(11027,
										' ', string);
								try {
									if (strings.length > 1)
										i_18_ = Integer.parseInt(strings[1]);
								} catch (Throwable throwable) {
									/* empty */
								}
								try {
									if (strings.length > 2)
										i_17_ = Integer.parseInt(strings[2]);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							if ((i_17_ ^ 0xffffffff) != 0)
								Class314.method1912(("Performance: " + Class224
										.method1437(i_18_, i_17_, (byte) 83)),
										(byte) 84);
							else {
								Class314.method1912(
										("Java toolkit: " + Class224
												.method1437(i_18_, 0, (byte) 83)),
										(byte) -97);
								Class314.method1912(
										("SSE toolkit:  " + Class224
												.method1437(i_18_, 2, (byte) 83)),
										(byte) 79);
								Class314.method1912(
										("D3D toolkit:  " + Class224
												.method1437(i_18_, 3, (byte) 83)),
										(byte) -86);
								Class314.method1912(
										("GL toolkit:   " + Class224
												.method1437(i_18_, 1, (byte) 83)),
										(byte) -114);
								Class314.method1912(
										("GLX toolkit:  " + Class224
												.method1437(i_18_, 5, (byte) 83)),
										(byte) 32);
								break;
							}
							break;
						}
						if (string.equals("nonpcs")) {
							Class1.aBool1 = !Class1.aBool1;
							Class314.method1912("nonpcs=" + Class1.aBool1,
									(byte) -110);
							break;
						}
						if (string.equals("autoworld")) {
							Class349.method2100((byte) 117);
							Class314.method1912("auto world selected",
									(byte) -125);
							break;
						}
						if (string.startsWith("switchworld")) {
							int i_19_ = Integer.parseInt(string.substring(12));
							Class175.method1144((byte) 49,
									(((Class195_Sub1) Class128.method836(-125,
											i_19_)).aString6154), i_19_);
							Class314.method1912("switched", (byte) -120);
							break;
						}
						if (string.equals("getworld")) {
							Class314.method1912(
									("w: " + (((Class46) Class275.aClass46_3705).anInt730)),
									(byte) -97);
							break;
						}
						if (string.startsWith("pc")) {
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class216.aClass370_2980),
											(byte) -73);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(0, -1528071456);
							int i_20_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
							int i_21_ = string.indexOf(" ", 4);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27,
											string.substring(3, i_21_));
							Class376_Sub7_Sub5_Sub2
									.method3904(
											string.substring(i_21_),
											false,
											(((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397));
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.method2530(
											(-i_20_ + (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position)),
											(byte) 113);
							Class79.method541(class11_sub10, -72);
							break;
						}
						if (string.equals("savevarcs")) {
							Class11_Sub2_Sub28.method3716(false);
							Class314.method1912("perm varcs saved", (byte) 84);
							break;
						}
						if (string.equals("scramblevarcs")) {
							for (int i_22_ = 0; (i_22_ < Class11_Sub2_Sub20.anIntArray9148.length); i_22_++) {
								if (Class299.aBoolArray4037[i_22_]) {
									Class11_Sub2_Sub20.anIntArray9148[i_22_] = (int) (99999.0 * Math
											.random());
									if (Math.random() > 0.5)
										Class11_Sub2_Sub20.anIntArray9148[i_22_] *= -1;
								}
							}
							Class11_Sub2_Sub28.method3716(false);
							Class314.method1912("perm varcs scrambled",
									(byte) -123);
							break;
						}
						if (string.equals("showcolmap")) {
							Class63.aBool923 = true;
							Class11_Sub45_Sub16_Sub2.method3928(16598);
							Class314.method1912("colmap is shown", (byte) -91);
							break;
						}
						if (string.equals("hidecolmap")) {
							Class63.aBool923 = false;
							Class11_Sub45_Sub16_Sub2.method3928(16598);
							Class314.method1912("colmap is hidden", (byte) -116);
							break;
						}
						if (string.equals("resetcache")) {
							Class11_Sub2_Sub2.method3337((byte) -73);
							Class314.method1912("Caches reset", (byte) -116);
							break;
						}
						if (string.equals("profilecpu")) {
							Class314.method1912(
									String.valueOf(Stream.method2542(120))
											+ "ms", (byte) -89);
							break;
						}
						if (string.startsWith("getclientvarpbit")) {
							int i_23_ = Integer.parseInt(string.substring(17));
							Class314.method1912(
									"varpbit="
											+ Class11_Sub26.aClass97_6296
													.method51(i_23_, 26951),
									(byte) -106);
							break;
						}
						if (string.startsWith("getclientvarp")) {
							int i_24_ = Integer.parseInt(string.substring(14));
							Class314.method1912(
									("varp=" + Class11_Sub26.aClass97_6296
											.method50(-1, i_24_)), (byte) -103);
							break;
						}
						if (string.startsWith("directlogin")) {
							String[] strings = Class121.method788(11027, ' ',
									string.substring(12));
							if ((strings.length ^ 0xffffffff) <= -3) {
								int i_25_ = (strings.length <= 2 ? 0 : Integer
										.parseInt(strings[2]));
								Class9.method112(15341, strings[0], strings[1],
										i_25_);
								break;
							}
						}
						if (string.startsWith("csprofileclear")) {
							Class86.method609();
							break;
						}
						if (string.startsWith("csprofileoutputc")) {
							Class86.method611(100, false);
							break;
						}
						if (string.startsWith("csprofileoutputt")) {
							Class86.method611(10, true);
							break;
						}
						if (string.startsWith("texsize")) {
							int i_26_ = Integer.parseInt(string.substring(8));
							Class321_Sub2.aClass163_6648.method1028(i_26_);
							break;
						}
						if (string.equals("soundstreamcount")) {
							Class314.method1912(
									("Active streams: " + Class233.aClass11_Sub6_Sub1_3185
											.method3458()), (byte) 18);
							break;
						}
						if (string.equals("autosetup")) {
							Class206.method1324((byte) -76);
							Class314.method1912(
									("Complete. Toolkit now: " + ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
											.method3181(false)), (byte) 55);
							break;
						}
						if (string.equals("errormessage")) {
							Class314.method1912(Class11_Sub2_Sub23.aclient9263
									.method3985(true), (byte) 68);
							break;
						}
						if (string.equals("heapdump")) {
							if (Class341.aString4512.startsWith("win"))
								Class367.method2171((byte) -58, new File(
										"C:\\Temp\\heap.dump"), false);
							else
								Class367.method2171((byte) -44, new File(
										"/tmp/heap.dump"), false);
							Class314.method1912("Done", (byte) -100);
							break;
						}
						if (string.equals("os")) {
							Class314.method1912(
									("Name: " + Class341.aString4512),
									(byte) -120);
							Class314.method1912(
									("Arch: " + Class341.aString4521),
									(byte) -88);
							Class314.method1912("Ver: " + Class341.aString4506,
									(byte) -82);
							break;
						}
						if (string.startsWith("w2debug")) {
							int i_27_ = Integer
									.parseInt(string.substring(8, 9));
							NPCDefinitions.anInt2949 = i_27_;
							Class114.method758(3);
							Class314.method1912("Toggled!", (byte) -103);
							break;
						}
						if (string.startsWith("ortho ")) {
							int i_28_ = string.indexOf(' ');
							if (i_28_ < 0)
								Class314.method1912("Syntax: ortho <n>",
										(byte) -111);
							else {
								int i_29_ = (Class173.method1139(
										string.substring(1 + i_28_), -23213));
								Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
										.method2460(
												249682952,
												i_29_,
												(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub17_5731));
								Class186.method1212(10343);
								Class236_Sub1.aBool6093 = false;
								Class89.method621(-1);
								if (((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub17_5731
										.method2734(false) != i_29_)
									Class314.method1912(
											"Failed to change ortho mode",
											(byte) -115);
								else {
									Class314.method1912(
											"Successfully changed ortho mode",
											(byte) -89);
									break;
								}
								break;
							}
							break;
						}
						if (string.startsWith("orthozoom ")) {
							if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub17_5731
									.method2734(false) ^ 0xffffffff) == -1)
								Class314.method1912(
										"enable ortho mode first (use 'ortho <n>')",
										(byte) -116);
							else {
								int i_30_ = (Class173.method1139(string
										.substring(string.indexOf(' ') + 1),
										-23213));
								Class117.anInt1595 = i_30_;
								Class314.method1912(
										("orthozoom=" + Class117.anInt1595),
										(byte) -126);
								break;
							}
							break;
						}
						if (string.startsWith("orthotilesize ")) {
							int i_31_ = (Class173.method1139(
									string.substring(1 + string.indexOf(' ')),
									-23213));
							Class134.anInt1854 = Player.anInt10425 = i_31_;
							Class314.method1912("ortho tile size=" + i_31_,
									(byte) -90);
							Class89.method621(-1);
							break;
						}
						if (string.equals("orthocamlock")) {
							OutputStream_Sub1.aBool5850 = !OutputStream_Sub1.aBool5850;
							Class314.method1912(
									("ortho camera lock is " + (OutputStream_Sub1.aBool5850 ? "on"
											: "off")), (byte) 56);
							break;
						}
						if (string.startsWith("setoutput ")) {
							File file = new File(string.substring(10));
							if (file.exists()) {
								file = new File(string.substring(10) + "."
										+ Class137.method878((byte) -73)
										+ ".log");
								if (file.exists()) {
									Class314.method1912("file already exists!",
											(byte) -95);
									break;
								}
							}
							if (Class207.aFileOutputStream2789 != null) {
								Class207.aFileOutputStream2789.close();
								Class207.aFileOutputStream2789 = null;
							}
							try {
								Class207.aFileOutputStream2789 = new FileOutputStream(
										file);
							} catch (java.io.FileNotFoundException filenotfoundexception) {
								Class314.method1912(
										("Could not create " + file.getName()),
										(byte) -115);
							} catch (SecurityException securityexception) {
								Class314.method1912(
										("Cannot write to " + file.getName()),
										(byte) -92);
							}
							break;
						}
						if (string.equals("closeoutput")) {
							if (Class207.aFileOutputStream2789 != null)
								Class207.aFileOutputStream2789.close();
							Class207.aFileOutputStream2789 = null;
							break;
						}
						if (string.startsWith("runscript ")) {
							File file = new File(string.substring(10));
							if (!file.exists()) {
								Class314.method1912("No such file", (byte) -117);
								break;
							}
							byte[] is = Class11_Sub35_Sub1.method3567(file,
									26308);
							if (is == null) {
								Class314.method1912("Failed to read file",
										(byte) -106);
								break;
							}
							String[] strings = Class121
									.method788(
											11027,
											'\n',
											(Class308.method1885(
													"",
													(byte) 122,
													Class130.method844(-107, is),
													'\r')));
							Class163_Sub2.method2980(-13841, strings);
						}
						if (string.startsWith("zoom ")) {
							short i_32_ = (short) (Class173.method1139(
									string.substring(5), -23213));
							if (i_32_ > 0)
								Class108_Sub23.aShort7762 = i_32_;
							break;
						}
						if (Class285.anInt3846 == 10) {
							Class105.anInt1407++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class108_Sub26.aClass370_7830),
											(byte) 65);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(3 + string.length(), -1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(!bool ? 0 : 1, -1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(bool_8_ ? 1 : 0, -1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27, string);
							Class79.method541(class11_sub10, -36);
						}
						if (string.startsWith("fps ")
								&& (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711)) {
							Class321_Sub2.method2740(-110, Class173.method1139(
									string.substring(4), -23213));
							break;
						}
					} catch (Exception exception) {
						Class314.method1912((Class26.aClass26_278
								.method217((byte) 125,
										(Class11_Sub45_Sub1_Sub2.anInt9884))),
								(byte) -94);
						break;
					}
				}
				if ((Class285.anInt3846 ^ 0xffffffff) == -11)
					break;
				Class314.method1912(
						Class26.aClass26_279.method217((byte) 94,
								(Class11_Sub45_Sub1_Sub2.anInt9884)) + string,
						(byte) 98);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vf.F("
						+ (string != null ? "{...}" : "null") + ',' + bool
						+ ',' + bool_8_ + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static final void method2085(int i) {
		try {
			if (i != 22104)
				aClass124_4570 = null;
			Class11_Sub45_Sub1.method3348((byte) -95);
			anInt4566++;
			Class321_Sub3
					.method2852(
							(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub22_5711
									.method2962(false) ^ 0xffffffff) == -2,
							22050, 2, 86);
			Class254.aClass37_3498 = Class108_Sub14.method2659(22050,
					Class11_Sub45_Sub13.aCanvas9308, 0, (byte) -107,
					Class108_Sub21.aClass341_7304);
			Class11_Sub2_Sub3.method3339(true, (byte) -106,
					Class291.method1801(null, (byte) 9));
			Class343.aClass37_4540 = Class108_Sub14.method2659(2048,
					Class11_Sub45_Sub13.aCanvas9308, 1, (byte) 53,
					Class108_Sub21.aClass341_7304);
			Class343.aClass37_4540.method326(true,
					Class233.aClass11_Sub6_Sub1_3185);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vf.B(" + i + ')');
		}
	}

	static final int method2086(
			Actor class376_sub7_sub5_sub5, byte i) {
		try {
			anInt4567++;
			if ((((Actor) class376_sub7_sub5_sub5).anInt10320 ^ 0xffffffff) == -1)
				return 0;
			int i_33_ = 121 / ((i + 17) / 63);
			if (((Actor) class376_sub7_sub5_sub5).faceEntity != -1) {
				Actor class376_sub7_sub5_sub5_34_ = null;
				if ((((Actor) class376_sub7_sub5_sub5).faceEntity) < 32768) {
					Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
							.method1369(
									(byte) 26,
									(long) ((Actor) class376_sub7_sub5_sub5).faceEntity)));
					if (class11_sub25 != null)
						class376_sub7_sub5_sub5_34_ = (((Class11_Sub25) class11_sub25).aNpc_2373);
				} else if ((((Actor) class376_sub7_sub5_sub5).faceEntity ^ 0xffffffff) <= -32769)
					class376_sub7_sub5_sub5_34_ = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[-32768
							+ ((Actor) class376_sub7_sub5_sub5).faceEntity]);
				if (class376_sub7_sub5_sub5_34_ != null) {
					int i_35_ = (-(((Class376_Sub7) class376_sub7_sub5_sub5_34_).anInt7045) + (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045));
					int i_36_ = (-(((Class376_Sub7) class376_sub7_sub5_sub5_34_).anInt7031) + (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031));
					if (i_35_ != 0 || (i_36_ ^ 0xffffffff) != -1)
						class376_sub7_sub5_sub5
								.method3953(
										8192,
										(int) (Math.atan2((double) i_35_,
												(double) i_36_) * 2607.5945876176133) & 0x3fff);
				}
			}
			do {
				if (!(class376_sub7_sub5_sub5 instanceof Player)) {
					if (!(class376_sub7_sub5_sub5 instanceof Npc))
						break;
					Npc class376_sub7_sub5_sub5_sub2 = ((Npc) class376_sub7_sub5_sub5);
					if (((Npc) class376_sub7_sub5_sub5_sub2).anInt10507 == -1
							|| ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10375 ^ 0xffffffff) != -1 && (((Actor) class376_sub7_sub5_sub5_sub2).anInt10373 ^ 0xffffffff) >= -1))
						break;
					int i_37_ = (-((-Class194.anInt2641 + (((Npc) class376_sub7_sub5_sub5_sub2).anInt10507 - Class194.anInt2641)) * 256) + (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045));
					int i_38_ = ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031) + -((-Class118.anInt1605
							+ -Class118.anInt1605 + ((Npc) class376_sub7_sub5_sub5_sub2).anInt10505) * 256));
					if ((i_37_ ^ 0xffffffff) != -1 || i_38_ != 0)
						class376_sub7_sub5_sub5_sub2.method3953(8192,
								0x3fff & (int) (Math.atan2((double) i_37_,
										(double) i_38_) * 2607.5945876176133));
					((Npc) class376_sub7_sub5_sub5_sub2).anInt10507 = -1;
					if (!client.aBool10531)
						break;
				}
				Player class376_sub7_sub5_sub5_sub1 = (Player) class376_sub7_sub5_sub5;
				if ((((Player) class376_sub7_sub5_sub5_sub1).anInt10401 ^ 0xffffffff) != 0
						&& (((Actor) class376_sub7_sub5_sub5_sub1).anInt10375 == 0 || ((Actor) class376_sub7_sub5_sub5_sub1).anInt10373 > 0)) {
					class376_sub7_sub5_sub5_sub1.method3953(8192,
							((Player) class376_sub7_sub5_sub5_sub1).anInt10401);
					((Player) class376_sub7_sub5_sub5_sub1).anInt10401 = -1;
				}
			} while (false);
			return class376_sub7_sub5_sub5.method3959((byte) 39);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vf.C("
					+ (class376_sub7_sub5_sub5 != null ? "{...}" : "null")
					+ ',' + i + ')'));
		}
	}

	public static void method2087(int i) {
		try {
			if (i == 9) {
				anIntArray4575 = null;
				aClass124_4570 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vf.A(" + i + ')');
		}
	}

	public Class344() {
		/* empty */
	}
}
