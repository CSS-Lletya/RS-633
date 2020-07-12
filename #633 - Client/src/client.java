/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;

public final class client extends Applet_Sub1 {
	static OutgoingPacket aClass370_10513 = new OutgoingPacket(47, 3);
	static int anInt10514;
	static int anInt10515;
	static int anInt10516;
	static int anInt10517;
	static int anInt10518;
	static int anInt10519;
	static int anInt10520;
	static int anInt10521;
	static int anInt10522;
	static int anInt10523;
	static int anInt10524;
	static int anInt10525;
	static int anInt10526;
	static int anInt10527;
	static int anInt10528;
	static int anInt10529;
	/* synthetic */static Class aClass10530;
	public static boolean aBool10531;

	public static int gameZoom = 600;

	static final boolean method4010(IComponentDefinitions class192) {
		if (Class11_Sub2_Sub14.aBool9010) {
			if (((InterfaceSettings) method4013(class192)).anInt5349 != 0)
				return false;
			if (((IComponentDefinitions) class192).anInt2531 == 0)
				return false;
		}
		return ((IComponentDefinitions) class192).aBool2535;
	}

	static final void method4011() {
		for (int i = 0; i < Class300.anInt4051; i++) {
			int[] is = Class11_Sub2_Sub30.anIntArrayArray9617[i];
			for (int i_0_ = 0; i_0_ < Class108_Sub12.anInt6228; i_0_++)
				is[i_0_] = 0;
		}
	}

	static final void handleGameZoom(int rotation) {
			if (rotation > 0) {
				if (client.gameZoom >= 1500) 
					return;
				client.gameZoom = client.gameZoom + 50;
			}
			else {
				if (client.gameZoom <= 100)
					return;
				client.gameZoom = client.gameZoom - 50;
			}
	}

	static final void method4012(int i) {
		int i_1_ = Class190.anInt2446;
		int[] is = Class6.anIntArray40;
		int i_2_ = Class1.aBool1 ? i_1_ : i_1_ + Class23.anInt249;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			Actor class376_sub7_sub5_sub5;
			if (i_3_ < i_1_)
				class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_3_]]);
			else
				class376_sub7_sub5_sub5 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
						.method1369(
								(byte) 26,
								(long) Class11_Sub52.anIntArray8054[i_3_ - i_1_]))).aNpc_2373);
			if (((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047 == i) {
				((Actor) class376_sub7_sub5_sub5).anInt10277 = 0;
				if ((((Actor) class376_sub7_sub5_sub5).anInt10346) < 0)
					((Actor) class376_sub7_sub5_sub5).aBool10331 = false;
				else {
					int i_4_ = class376_sub7_sub5_sub5.method3968((byte) 127);
					if ((i_4_ & 0x1) == 0) {
						if (((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) & 0x1ff) != 0
								|| ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) & 0x1ff) != 0) {
							((Actor) class376_sub7_sub5_sub5).aBool10331 = false;
							continue;
						}
					} else if (((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) & 0x1ff) != 256
							|| ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) & 0x1ff) != 256) {
						((Actor) class376_sub7_sub5_sub5).aBool10331 = false;
						continue;
					}
					if (i_4_ == 1) {
						int i_5_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) >> 9);
						int i_6_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) >> 9);
						if (((Actor) class376_sub7_sub5_sub5).anInt10346 != (Class11_Sub2_Sub30.anIntArrayArray9617[i_5_][i_6_])) {
							((Actor) class376_sub7_sub5_sub5).aBool10331 = true;
							continue;
						}
						if (Class108_Sub4.anIntArrayArray5386[i_5_][i_6_] > 1) {
							Class108_Sub4.anIntArrayArray5386[i_5_][i_6_]--;
							((Actor) class376_sub7_sub5_sub5).aBool10331 = true;
							continue;
						}
					} else {
						int i_7_ = (i_4_ - 1) * 256 + 252;
						int i_8_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045)
								- i_7_ >> 9);
						int i_9_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031)
								- i_7_ >> 9);
						int i_10_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045)
								+ i_7_ >> 9);
						int i_11_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031)
								+ i_7_ >> 9);
						if (!Class72_Sub2
								.method2799(
										i_9_,
										i_11_,
										i_8_,
										((Actor) class376_sub7_sub5_sub5).anInt10346,
										i_10_, 89)) {
							for (int i_12_ = i_8_; i_12_ <= i_10_; i_12_++) {
								for (int i_13_ = i_9_; i_13_ <= i_11_; i_13_++) {
									if (((Actor) class376_sub7_sub5_sub5).anInt10346 == (Class11_Sub2_Sub30.anIntArrayArray9617[i_12_][i_13_]))
										Class108_Sub4.anIntArrayArray5386[i_12_][i_13_]--;
								}
							}
							((Actor) class376_sub7_sub5_sub5).aBool10331 = true;
							continue;
						}
					}
					((Actor) class376_sub7_sub5_sub5).aBool10331 = false;
					((Class376_Sub7) class376_sub7_sub5_sub5).anInt7036 = Class318
							.method1931(
									110,
									(((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031),
									(((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047),
									(((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045));
					Class98.method661(class376_sub7_sub5_sub5, true);
				}
			}
		}
	}

	static final InterfaceSettings method4013(IComponentDefinitions class192) {
		InterfaceSettings class11_sub9 = ((InterfaceSettings) (Class376_Sub7_Sub2_Sub1.aClass213_10180
				.method1369(
						(byte) 26,
						(((long) ((IComponentDefinitions) class192).anInt2471 << 32) + (long) ((IComponentDefinitions) class192).anInt2459))));
		if (class11_sub9 != null)
			return class11_sub9;
		return ((IComponentDefinitions) class192).aClass11_Sub9_2586;
	}

	final synchronized void method4000(int i) {
		try {
			anInt10516++;
			if (Class108_Sub16.anApplet6538 != null
					&& Class11_Sub45_Sub13.aCanvas9308 == null
					&& !((Class341) Class108_Sub21.aClass341_7304).aBool4502) {
				try {
					Class var_class = Class108_Sub16.anApplet6538.getClass();
					Field field = var_class.getDeclaredField("canvas");
					Class11_Sub45_Sub13.aCanvas9308 = (Canvas) field
							.get(Class108_Sub16.anApplet6538);
					field.set(Class108_Sub16.anApplet6538, null);
					if (Class11_Sub45_Sub13.aCanvas9308 != null)
						return;
				} catch (Exception exception) {
					/* empty */
				}
			}
			super.method4000(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.M(" + i + ')');
		}
	}

	static final void method4014(IComponentDefinitions[] class192s, int i,
			int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_,
			int i_20_, int i_21_, int i_22_, int i_23_) {
		for (int i_24_ = 0; i_24_ < class192s.length; i_24_++) {
			IComponentDefinitions class192 = class192s[i_24_];
			if (class192 != null
					&& ((IComponentDefinitions) class192).anInt2593 == i) {
				int i_25_ = ((IComponentDefinitions) class192).anInt2469
						+ i_18_;
				int i_26_ = ((IComponentDefinitions) class192).anInt2490
						+ i_19_;
				int i_27_;
				int i_28_;
				int i_29_;
				int i_30_;
				if (((IComponentDefinitions) class192).anInt2531 == 2) {
					i_27_ = i_14_;
					i_28_ = i_15_;
					i_29_ = i_16_;
					i_30_ = i_17_;
				} else {
					int i_31_ = i_25_
							+ ((IComponentDefinitions) class192).anInt2610;
					int i_32_ = i_26_
							+ ((IComponentDefinitions) class192).anInt2546;
					if (((IComponentDefinitions) class192).anInt2531 == 9) {
						i_31_++;
						i_32_++;
					}
					i_27_ = i_25_ > i_14_ ? i_25_ : i_14_;
					i_28_ = i_26_ > i_15_ ? i_26_ : i_15_;
					i_29_ = i_31_ < i_16_ ? i_31_ : i_16_;
					i_30_ = i_32_ < i_17_ ? i_32_ : i_17_;
				}
				if (((IComponentDefinitions) class192).anInt2531 != 0
						&& !((IComponentDefinitions) class192).aBool2462
						&& ((InterfaceSettings) method4013(class192)).anInt5349 == 0
						&& class192 != Exception_Sub1.aClass192_9486
						&& ((IComponentDefinitions) class192).anInt2536 != Class119.anInt1619
						&& (((IComponentDefinitions) class192).anInt2536 != Class376_Sub7_Sub1_Sub1.anInt10096)) {
					if (i_27_ < i_29_ && i_28_ < i_30_)
						Class376_Sub7_Sub1.method3443(63, class192);
				} else if (!method4010(class192)) {
					int i_33_ = 0;
					int i_34_ = 0;
					if (Class11_Sub2_Sub19.aBool9087) {
						i_33_ = Class54.method443(5467);
						i_34_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -119);
					}
					if (class192 == Class11_Sub2_Sub32_Sub1.aClass192_9889
							&& Class280.method1729((byte) 127,
									(Class11_Sub2_Sub32_Sub1.aClass192_9889)) != null) {
						Class11_Sub2_Sub34.aBool9690 = true;
						Class246.anInt3330 = i_25_;
						Class365.anInt4800 = i_26_;
					}
					if (((IComponentDefinitions) class192).aBool2581
							|| i_27_ < i_29_ && i_28_ < i_30_) {
						if (((IComponentDefinitions) class192).aBool2494
								&& i_22_ >= i_27_ && i_23_ >= i_28_
								&& i_22_ < i_29_ && i_23_ < i_30_) {
							for (Class11_Sub48 class11_sub48 = (Class11_Sub48) Class180.aClass84_2332
									.method584(-12261); class11_sub48 != null; class11_sub48 = ((Class11_Sub48) Class180.aClass84_2332
									.method578(-15361))) {
								if (class11_sub48.aBool8004) {
									class11_sub48.method122(-73);
									((IComponentDefinitions) (class11_sub48.aClass192_7999)).aBool2618 = false;
								}
							}
							if (Exception_Sub1.anInt9480 == 0) {
								Class11_Sub2_Sub32_Sub1.aClass192_9889 = null;
								Exception_Sub1.aClass192_9486 = null;
							}
							Class254_Sub1.anInt5519 = 0;
							Class225.aBool3100 = false;
							Class235.aBool3218 = false;
							if (!Class306.aBool4114)
								Class2_Sub5.method2406(-2);
						}
						boolean bool;
						if ((Class280.aClass225_3786.method1449(-97) + i_33_ >= i_27_)
								&& (Class280.aClass225_3786
										.method1448((byte) -63) + i_34_) >= i_28_
								&& (Class280.aClass225_3786.method1449(-79)
										+ i_33_ < i_29_)
								&& (Class280.aClass225_3786
										.method1448((byte) -63) + i_34_) < i_30_)
							bool = true;
						else
							bool = false;
						if (!Class204.aBool2739 && bool) {
							if (((IComponentDefinitions) class192).anInt2626 >= 0)
								Class325.anInt4329 = ((IComponentDefinitions) class192).anInt2626;
							else if (((IComponentDefinitions) class192).aBool2494)
								Class325.anInt4329 = -1;
						}
						if (!Class306.aBool4114 && i_22_ >= i_27_
								&& i_23_ >= i_28_ && i_22_ < i_29_
								&& i_23_ < i_30_)
							Class11_Sub2_Sub32_Sub1.method3879(i_23_ - i_26_,
									(byte) 114, i_22_ - i_25_, class192);
						boolean bool_35_ = false;
						if (Class280.aClass225_3786.method1444(0) && bool)
							bool_35_ = true;
						boolean bool_36_ = false;
						Class11_Sub23 class11_sub23 = ((Class11_Sub23) Class108_Sub13.aClass84_6264
								.method584(-12261));
						if (class11_sub23 != null
								&& class11_sub23.method2570(0) == 0
								&& (class11_sub23.method2568((byte) -101)
										+ i_33_ >= i_27_)
								&& class11_sub23.method2569(-125) + i_34_ >= i_28_
								&& (class11_sub23.method2568((byte) -94)
										+ i_33_ < i_29_)
								&& class11_sub23.method2569(-116) + i_34_ < i_30_)
							bool_36_ = true;
						if (((IComponentDefinitions) class192).aByteArray2579 != null
								&& !Class337.method2023(false)) {
							for (int i_37_ = 0; i_37_ < (((IComponentDefinitions) class192).aByteArray2579).length; i_37_++) {
								if (!Class11_Sub2_Sub19.aClass1_9098
										.method60(
												0,
												(((IComponentDefinitions) class192).aByteArray2579[i_37_]))) {
									if (((IComponentDefinitions) class192).anIntArray2511 != null)
										((IComponentDefinitions) class192).anIntArray2511[i_37_] = 0;
								} else if ((((IComponentDefinitions) class192).anIntArray2511) == null
										|| (Class11_Sub25.anInt6279 >= (((IComponentDefinitions) class192).anIntArray2511[i_37_]))) {
									byte i_38_ = (((IComponentDefinitions) class192).aByteArray2594[i_37_]);
									if (i_38_ == 0
											|| (((i_38_ & 0x8) == 0 || (!Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 86)
													&& !Class11_Sub2_Sub19.aClass1_9098
															.method60(0, 82) && !Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 81)))
													&& ((i_38_ & 0x2) == 0 || Class11_Sub2_Sub19.aClass1_9098
															.method60(0, 86))
													&& ((i_38_ & 0x1) == 0 || Class11_Sub2_Sub19.aClass1_9098
															.method60(0, 82)) && ((i_38_ & 0x4) == 0 || Class11_Sub2_Sub19.aClass1_9098
													.method60(0, 81)))) {
										if (i_37_ < 10)
											Class15.method150(
													(((IComponentDefinitions) class192).anInt2471),
													i_37_ + 1, -1, "",
													(byte) 124);
										else if (i_37_ == 10) {
											Class11_Sub45_Sub5.method3436(-1);
											InterfaceSettings class11_sub9 = method4013(class192);
											Class180.method1184(
													class11_sub9
															.method2353(false),
													(((InterfaceSettings) class11_sub9).anInt5354),
													class192, true);
											Class374.aString4890 = (Class11_Sub45_Sub3
													.method3384(class192,
															-10402));
											if (Class374.aString4890 == null)
												Class374.aString4890 = "Null";
											Class250.aString3444 = ((((IComponentDefinitions) class192).aString2506) + "<col=ffffff>");
										}
										int i_39_ = (((IComponentDefinitions) class192).anIntArray2567[i_37_]);
										if ((((IComponentDefinitions) class192).anIntArray2511) == null)
											((IComponentDefinitions) class192).anIntArray2511 = (new int[(((IComponentDefinitions) class192).aByteArray2579).length]);
										if (i_39_ != 0)
											((IComponentDefinitions) class192).anIntArray2511[i_37_] = (Class11_Sub25.anInt6279 + i_39_);
										else
											((IComponentDefinitions) class192).anIntArray2511[i_37_] = 2147483647;
									}
								}
							}
						}
						if (bool_36_)
							Class78.method539(
									(i_34_ + class11_sub23.method2569(-126) - i_26_),
									(i_33_
											+ class11_sub23
													.method2568((byte) 58) - i_25_),
									true, class192);
						if (Class11_Sub2_Sub32_Sub1.aClass192_9889 != null
								&& (Class11_Sub2_Sub32_Sub1.aClass192_9889 != class192)
								&& bool
								&& method4013(class192).method2354(9162)) {
							Class42.aClass192_692 = class192;

						}
						if (class192 == Exception_Sub1.aClass192_9486) {
							Class376_Sub6.aBool6950 = true;
							IOException_Sub1.anInt9969 = i_25_;
							Class73.anInt1007 = i_26_;
						}
						if (((IComponentDefinitions) class192).aBool2462
								|| ((IComponentDefinitions) class192).anInt2536 != 0) {
							if (bool
									&& Class154.anInt2032 != 0
									&& (((IComponentDefinitions) class192).anObjectArray2500 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aBool8004 = true;
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.anInt8001 = Class154.anInt2032;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2500;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);

							}
							if (Class11_Sub2_Sub32_Sub1.aClass192_9889 != null
									|| Class306.aBool4114
									|| ((((IComponentDefinitions) class192).anInt2536 != Class181.anInt2335) && Class254_Sub1.anInt5519 > 0)) {
								bool_36_ = false;
								bool_35_ = false;
								bool = false;

							}
							if (((IComponentDefinitions) class192).anInt2536 != 0) {
								if ((((IComponentDefinitions) class192).anInt2536 == Class78.anInt1056)
										|| (((IComponentDefinitions) class192).anInt2536 == Class11_Sub7.anInt5251)) {
									Class321_Sub4.aClass192_8010 = class192;

									if (Class108_Sub18.aClass141_6924 != null)
										Class108_Sub18.aClass141_6924
												.method890(
														((IComponentDefinitions) class192).anInt2546,
														12162,
														Class321_Sub2.aClass163_6648);
									if (((IComponentDefinitions) class192).anInt2536 == Class78.anInt1056) {

										if (!Class306.aBool4114
												&& i_22_ >= i_27_
												&& i_23_ >= i_28_
												&& i_22_ < i_29_
												&& i_23_ < i_30_) {

											Class11_Sub45_Sub5
													.method3435(
															116,
															i_20_,
															Class321_Sub2.aClass163_6648,
															i_21_);
											for (Class376_Sub3 class376_sub3 = ((Class376_Sub3) (Class333.aClass131_4412
													.method847(-31182))); class376_sub3 != null; class376_sub3 = ((Class376_Sub3) Class333.aClass131_4412
													.method856(87))) {
												if (i_22_ >= (((Class376_Sub3) class376_sub3).anInt6115)
														&& (i_22_ < (((Class376_Sub3) class376_sub3).anInt6119))
														&& (i_23_ >= (((Class376_Sub3) class376_sub3).anInt6113))
														&& (i_23_ < (((Class376_Sub3) class376_sub3).anInt6121))) {
													Class2_Sub5.method2406(-2);
													Exception_Sub1
															.method3736(
																	(byte) 1,
																	(((Class376_Sub3) class376_sub3).aClass376_Sub7_Sub5_Sub5_6112));
												}
											}
										}
										continue;
									}
								}
								if (((IComponentDefinitions) class192).anInt2536 == Class119.anInt1619) {
									if ((class192.method1254((byte) 121,
											(Class321_Sub2.aClass163_6648)) != null)
											&& (Class2_Sub1.anInt5068 == 0 || Class2_Sub1.anInt5068 == 3)
											&& !Class306.aBool4114
											&& i_22_ >= i_27_
											&& i_23_ >= i_28_
											&& i_22_ < i_29_ && i_23_ < i_30_) {

										int i_40_ = i_22_ - i_25_;
										int i_41_ = i_23_ - i_26_;
										int i_42_ = (((IComponentDefinitions) class192).anIntArray2596[i_41_]);
										if (i_40_ >= i_42_
												&& (i_40_ <= (i_42_ + (((IComponentDefinitions) class192).anIntArray2529[i_41_])))) {
											i_40_ -= (((IComponentDefinitions) class192).anInt2610) / 2;
											i_41_ -= (((IComponentDefinitions) class192).anInt2546) / 2;
											int i_43_;
											if (Class191.anInt2453 == 4)
												i_43_ = ((int) (Class2_Sub8.aFloat6868) & 0x3fff);
											else
												i_43_ = (((int) (Class2_Sub8.aFloat6868) + Class328.anInt4371) & 0x3fff);
											int i_44_ = (Class335.anIntArray4436[i_43_]);
											int i_45_ = (Class335.anIntArray4430[i_43_]);
											if (Class191.anInt2453 != 4) {
												i_44_ = (i_44_ * ((Class11_Sub45_Sub1.anInt8493) + 256)) >> 8;
												i_45_ = (i_45_ * ((Class11_Sub45_Sub1.anInt8493) + 256)) >> 8;
											}
											int i_46_ = ((i_41_ * i_44_ + i_40_
													* i_45_) >> 14);
											int i_47_ = ((i_41_ * i_45_ - i_40_
													* i_44_) >> 14);
											int i_48_;
											int i_49_;
											if (Class191.anInt2453 == 4) {
												i_48_ = (Class38.anInt508 >> 9)
														+ (i_46_ >> 2);
												i_49_ = (Class201.anInt2713 >> 9)
														- (i_47_ >> 2);
											} else {
												int i_50_ = ((Class11_Sub2_Sub8.myPlayer
														.method3968((byte) 127)) - 1) * 256;
												i_48_ = ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045)
														- i_50_ >> 9)
														+ (i_46_ >> 2);
												i_49_ = ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031)
														- i_50_ >> 9)
														- (i_47_ >> 2);
											}
											if (Class204.aBool2739
													&& ((Class322.anInt4312 & 0x40) != 0)) {

												IComponentDefinitions class192_51_ = (Class146
														.method913(
																Class163.anInt2113,
																(byte) 33,
																Class120.anInt1631));
												if (class192_51_ != null)
													Class108_Sub22
															.method2963(
																	false,
																	i_49_,
																	(((IComponentDefinitions) class192).anInt2467),
																	Class374.aString4890,
																	true,
																	(Class11_Sub2_Sub15.anInt9021),
																	true,
																	5,
																	(long) (((((IComponentDefinitions) class192).anInt2459) << 32) | (((IComponentDefinitions) class192).anInt2471)),
																	1L, " ->",
																	i_48_, 0);
												else
													Class11_Sub45_Sub5
															.method3436(-1);
											} else {
												if (Class198.aClass66_2679 == ISAAC.aClass66_263)
													Class108_Sub22
															.method2963(
																	false,
																	i_49_,
																	-1,
																	(Class26.aClass26_303
																			.method217(
																					(byte) 124,
																					(Class11_Sub45_Sub1_Sub2.anInt9884))),
																	true, -1,
																	true, 11,
																	0L, 1L, "",
																	i_48_, 0);

												Class108_Sub22.method2963(
														false, i_49_, -1,
														Class170.aString2181,
														true,
														Class240.anInt3263,
														true, 21, 0L, 1L, "",
														i_48_, 0);
											}
										}
									}
									continue;
								}
								if (((IComponentDefinitions) class192).anInt2536 == Class181.anInt2335) {
									Class333.aClass192_4417 = class192;

									if (bool) {
										Class225.aBool3100 = true;

									}
									if (bool_36_) {
										int i_52_ = (int) ((double) (i_33_
												+ (class11_sub23
														.method2568((byte) -84))
												- i_25_ - ((((IComponentDefinitions) class192).anInt2610) / 2)) * 2.0 / (double) (Class32.aFloat428));
										int i_53_ = (int) -((double) (i_34_
												+ (class11_sub23
														.method2569(-127))
												- i_26_ - ((((IComponentDefinitions) class192).anInt2546) / 2)) * 2.0 / (double) (Class32.aFloat428));
										int i_54_ = (Class14.anInt124 + i_52_ + Class32.anInt441);
										int i_55_ = (Class239_Sub2.anInt7912
												+ i_53_ + Class32.anInt451);
										Class11_Sub45_Sub19 class11_sub45_sub19 = Class11_Sub45_Sub6
												.method3439(0);
										if (class11_sub45_sub19 != null) {
											int[] is = new int[3];
											class11_sub45_sub19.method3817(
													-127, is, i_54_, i_55_);
											if (is != null) {
												if (Class11_Sub2_Sub19.aClass1_9098
														.method60(0, 82)
														&& (Class256_Sub2.anInt7713 > 0)) {
													Class200.method1288(is[2],
															-124, is[1], is[0]);
													continue;
												}
												Class235.aBool3218 = true;
												Class337.anInt4450 = is[0];
												RuntimeException_Sub1.anInt9964 = is[1];
												Class11_Sub46.anInt7980 = is[2];
											}
											Class254_Sub1.anInt5519 = 1;
											Class293.aBool3969 = false;
											Class15.anInt133 = Class280.aClass225_3786
													.method1449(-105);
											Class11_Sub45_Sub16.anInt9391 = Class280.aClass225_3786
													.method1448((byte) -63);

										}
									} else if (bool_35_
											&& (Class254_Sub1.anInt5519 > 0)) {

										if (Class254_Sub1.anInt5519 == 1
												&& ((Class15.anInt133 != Class280.aClass225_3786
														.method1449(-99)) || ((Class11_Sub45_Sub16.anInt9391) != (Class280.aClass225_3786
														.method1448((byte) -63))))) {
											Class183.anInt2368 = Class14.anInt124;
											Class375.anInt4901 = Class239_Sub2.anInt7912;
											Class254_Sub1.anInt5519 = 2;
										}
										if (Class254_Sub1.anInt5519 == 2) {
											Class293.aBool3969 = true;
											Class11_Sub6_Sub2
													.method3507(
															(Class183.anInt2368 + (int) ((double) ((Class15.anInt133) - (Class280.aClass225_3786
																	.method1449(-124))) * 2.0 / (double) (Class32.aFloat429))),
															-70);
											Class91.method623(
													(Class375.anInt4901 - (int) ((double) ((Class11_Sub45_Sub16.anInt9391) - (Class280.aClass225_3786
															.method1448((byte) -63))) * 2.0 / (double) (Class32.aFloat429))),
													-1);
										}
									} else {
										if (Class254_Sub1.anInt5519 > 0
												&& !Class293.aBool3969) {
											if (((Class11_Sub2_Sub23.anInt9269 == 1) || Class2_Sub5
													.method2401(1002))
													&& Class52.anInt802 > 2)
												Class11_Sub2_Sub20
														.method3577(
																true,
																Class15.anInt133,
																(Class11_Sub45_Sub16.anInt9391));
											else if (Class63
													.method483((byte) 127))
												Class11_Sub2_Sub20
														.method3577(
																true,
																Class15.anInt133,
																(Class11_Sub45_Sub16.anInt9391));
										}
										Class254_Sub1.anInt5519 = 0;
									}
									continue;
								}
								if (((IComponentDefinitions) class192).anInt2536 == Class331.anInt4395) {

									if (bool_35_)
										Class254_Sub2
												.method2827(
														((IComponentDefinitions) class192).anInt2610,
														((IComponentDefinitions) class192).anInt2546,
														(i_33_
																+ Class280.aClass225_3786
																		.method1449(-109) - i_25_),
														false,
														(i_34_
																+ Class280.aClass225_3786
																		.method1448((byte) -63) - i_26_));
									continue;
								}
								if (((IComponentDefinitions) class192).anInt2536 == Class376_Sub7_Sub1_Sub1.anInt10096) {
									Class376_Sub7_Sub5_Sub1.method3884(
											class192, i_26_, -109, i_25_);
									continue;
								}
							}
							if (!((IComponentDefinitions) class192).aBool2601
									&& bool_36_) {
								((IComponentDefinitions) class192).aBool2601 = true;
								if (((IComponentDefinitions) class192).anObjectArray2475 != null) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aBool8004 = true;
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.anInt7990 = (i_33_
											+ class11_sub23
													.method2568((byte) 76) - i_25_);
									class11_sub48.anInt8001 = (i_34_
											+ class11_sub23.method2569(-122) - i_26_);
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2475);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);

								}
							}
							if (((IComponentDefinitions) class192).aBool2601
									&& bool_35_
									&& (((IComponentDefinitions) class192).anObjectArray2541 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();

								class11_sub48.aBool8004 = true;
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.anInt7990 = i_33_
										+ Class280.aClass225_3786
												.method1449(-104) - i_25_;
								class11_sub48.anInt8001 = (i_34_
										+ Class280.aClass225_3786
												.method1448((byte) -63) - i_26_);
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2541;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if (((IComponentDefinitions) class192).aBool2601
									&& !bool_35_) {

								((IComponentDefinitions) class192).aBool2601 = false;
								if (((IComponentDefinitions) class192).anObjectArray2612 != null) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aBool8004 = true;
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.anInt7990 = i_33_
											+ Class280.aClass225_3786
													.method1449(-79) - i_25_;
									class11_sub48.anInt8001 = (i_34_
											+ Class280.aClass225_3786
													.method1448((byte) -63) - i_26_);
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2612);
									Class2_Sub10.aClass84_7920.method589(
											(byte) -13, class11_sub48);
								}
							}
							if (bool_35_
									&& (((IComponentDefinitions) class192).anObjectArray2609 != null)) {

								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aBool8004 = true;
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.anInt7990 = i_33_
										+ Class280.aClass225_3786
												.method1449(-91) - i_25_;
								class11_sub48.anInt8001 = (i_34_
										+ Class280.aClass225_3786
												.method1448((byte) -63) - i_26_);
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2609;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if (!((IComponentDefinitions) class192).aBool2618
									&& bool) {

								((IComponentDefinitions) class192).aBool2618 = true;
								if (((IComponentDefinitions) class192).anObjectArray2564 != null) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aBool8004 = true;
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.anInt7990 = (i_33_
											+ Class280.aClass225_3786
													.method1449(-120) - i_25_);
									class11_sub48.anInt8001 = (i_34_
											+ Class280.aClass225_3786
													.method1448((byte) -63) - i_26_);
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2564);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								}
							}
							if (((IComponentDefinitions) class192).aBool2618
									&& bool
									&& (((IComponentDefinitions) class192).anObjectArray2551 != null)) {

								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aBool8004 = true;
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.anInt7990 = i_33_
										+ Class280.aClass225_3786
												.method1449(-73) - i_25_;
								class11_sub48.anInt8001 = (i_34_
										+ Class280.aClass225_3786
												.method1448((byte) -63) - i_26_);
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2551;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if (((IComponentDefinitions) class192).aBool2618
									&& !bool) {

								((IComponentDefinitions) class192).aBool2618 = false;
								if (((IComponentDefinitions) class192).anObjectArray2461 != null) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aBool8004 = true;
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.anInt7990 = (i_33_
											+ Class280.aClass225_3786
													.method1449(-116) - i_25_);
									class11_sub48.anInt8001 = (i_34_
											+ Class280.aClass225_3786
													.method1448((byte) -63) - i_26_);
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2461);
									Class2_Sub10.aClass84_7920.method589(
											(byte) -13, class11_sub48);
								}
							}
							if (((IComponentDefinitions) class192).anObjectArray2625 != null) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2625;
								Class11_Sub43.aClass84_7327.method589(
										(byte) -13, class11_sub48);
							}
							if (((IComponentDefinitions) class192).anObjectArray2515 != null
									&& (Class11_Sub45_Sub15.anInt9374 > ((IComponentDefinitions) class192).anInt2599)) {
								if ((((IComponentDefinitions) class192).anIntArray2501 == null)
										|| ((Class11_Sub45_Sub15.anInt9374 - ((IComponentDefinitions) class192).anInt2599) > 32)) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2515);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								} else {
									while_80_: for (int i_56_ = ((IComponentDefinitions) class192).anInt2599; i_56_ < Class11_Sub45_Sub15.anInt9374; i_56_++) {
										int i_57_ = (Class11_Sub7.anIntArray5260[i_56_ & 0x1f]);
										for (int i_58_ = 0; i_58_ < (((IComponentDefinitions) class192).anIntArray2501).length; i_58_++) {
											if ((((IComponentDefinitions) class192).anIntArray2501[i_58_]) == i_57_) {
												Class11_Sub48 class11_sub48 = new Class11_Sub48();
												class11_sub48.aClass192_7999 = class192;
												class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2515);
												Class180.aClass84_2332
														.method589((byte) -13,
																class11_sub48);
												break while_80_;
											}
										}
									}
								}
								((IComponentDefinitions) class192).anInt2599 = Class11_Sub45_Sub15.anInt9374;
							}
							if (((IComponentDefinitions) class192).anObjectArray2575 != null
									&& (Class11_Sub10.anInt5390 > ((IComponentDefinitions) class192).anInt2629)) {
								if ((((IComponentDefinitions) class192).anIntArray2628 == null)
										|| ((Class11_Sub10.anInt5390 - ((IComponentDefinitions) class192).anInt2629) > 32)) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2575);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								} else {
									while_81_: for (int i_59_ = ((IComponentDefinitions) class192).anInt2629; i_59_ < Class11_Sub10.anInt5390; i_59_++) {
										int i_60_ = (Class11_Sub45_Sub16.anIntArray9393[i_59_ & 0x1f]);
										for (int i_61_ = 0; i_61_ < (((IComponentDefinitions) class192).anIntArray2628).length; i_61_++) {
											if ((((IComponentDefinitions) class192).anIntArray2628[i_61_]) == i_60_) {
												Class11_Sub48 class11_sub48 = new Class11_Sub48();
												class11_sub48.aClass192_7999 = class192;
												class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2575);
												Class180.aClass84_2332
														.method589((byte) -13,
																class11_sub48);
												break while_81_;
											}
										}
									}
								}
								((IComponentDefinitions) class192).anInt2629 = Class11_Sub10.anInt5390;
							}
							if (((IComponentDefinitions) class192).anObjectArray2463 != null
									&& (Class167.anInt2154 > ((IComponentDefinitions) class192).anInt2478)) {
								if ((((IComponentDefinitions) class192).anIntArray2604 == null)
										|| ((Class167.anInt2154 - ((IComponentDefinitions) class192).anInt2478) > 32)) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2463);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								} else {
									while_82_: for (int i_62_ = ((IComponentDefinitions) class192).anInt2478; i_62_ < Class167.anInt2154; i_62_++) {
										int i_63_ = (Class11_Sub45_Sub2.anIntArray8510[i_62_ & 0x1f]);
										for (int i_64_ = 0; i_64_ < (((IComponentDefinitions) class192).anIntArray2604).length; i_64_++) {
											if ((((IComponentDefinitions) class192).anIntArray2604[i_64_]) == i_63_) {
												Class11_Sub48 class11_sub48 = new Class11_Sub48();
												class11_sub48.aClass192_7999 = class192;
												class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2463);
												Class180.aClass84_2332
														.method589((byte) -13,
																class11_sub48);
												break while_82_;
											}
										}
									}
								}
								((IComponentDefinitions) class192).anInt2478 = Class167.anInt2154;
							}
							if (((IComponentDefinitions) class192).anObjectArray2630 != null
									&& (Class77.anInt1045 > ((IComponentDefinitions) class192).anInt2584)) {
								if ((((IComponentDefinitions) class192).anIntArray2523 == null)
										|| ((Class77.anInt1045 - ((IComponentDefinitions) class192).anInt2584) > 32)) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2630);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								} else {
									while_83_: for (int i_65_ = ((IComponentDefinitions) class192).anInt2584; i_65_ < Class77.anInt1045; i_65_++) {
										int i_66_ = (Class310.anIntArray4147[i_65_ & 0x1f]);
										for (int i_67_ = 0; i_67_ < (((IComponentDefinitions) class192).anIntArray2523).length; i_67_++) {
											if ((((IComponentDefinitions) class192).anIntArray2523[i_67_]) == i_66_) {
												Class11_Sub48 class11_sub48 = new Class11_Sub48();
												class11_sub48.aClass192_7999 = class192;
												class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2630);
												Class180.aClass84_2332
														.method589((byte) -13,
																class11_sub48);
												break while_83_;
											}
										}
									}
								}
								((IComponentDefinitions) class192).anInt2584 = Class77.anInt1045;
							}
							if (((IComponentDefinitions) class192).anObjectArray2503 != null
									&& (Class11_Sub45_Sub13.anInt9305 > ((IComponentDefinitions) class192).anInt2570)) {
								if ((((IComponentDefinitions) class192).anIntArray2537 == null)
										|| ((Class11_Sub45_Sub13.anInt9305 - ((IComponentDefinitions) class192).anInt2570) > 32)) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2503);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								} else {
									while_84_: for (int i_68_ = ((IComponentDefinitions) class192).anInt2570; i_68_ < Class11_Sub45_Sub13.anInt9305; i_68_++) {
										int i_69_ = (Class44.anIntArray709[i_68_ & 0x1f]);
										for (int i_70_ = 0; i_70_ < (((IComponentDefinitions) class192).anIntArray2537).length; i_70_++) {
											if ((((IComponentDefinitions) class192).anIntArray2537[i_70_]) == i_69_) {
												Class11_Sub48 class11_sub48 = new Class11_Sub48();
												class11_sub48.aClass192_7999 = class192;
												class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2503);
												Class180.aClass84_2332
														.method589((byte) -13,
																class11_sub48);
												break while_84_;
											}
										}
									}
								}
								((IComponentDefinitions) class192).anInt2570 = Class11_Sub45_Sub13.anInt9305;
							}
							if ((Class11_Sub2_Sub7.anInt8729 > ((IComponentDefinitions) class192).anInt2489)
									&& (((IComponentDefinitions) class192).anObjectArray2547 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2547;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if ((Class315.anInt4170 > ((IComponentDefinitions) class192).anInt2489)
									&& (((IComponentDefinitions) class192).anObjectArray2472 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2472;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if ((Class232.anInt3174 > ((IComponentDefinitions) class192).anInt2489)
									&& (((IComponentDefinitions) class192).anObjectArray2600 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2600;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if ((Class267.anInt3628 > ((IComponentDefinitions) class192).anInt2489)
									&& (((IComponentDefinitions) class192).anObjectArray2623 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2623;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							if ((Class219.anInt3019 > ((IComponentDefinitions) class192).anInt2489)
									&& (((IComponentDefinitions) class192).anObjectArray2480 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2480;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
							((IComponentDefinitions) class192).anInt2489 = Class219_Sub1.anInt7238;
							if (((IComponentDefinitions) class192).anObjectArray2573 != null) {
								for (int i_71_ = 0; i_71_ < Class11_Sub26.anInt6301; i_71_++) {
									Class11_Sub48 class11_sub48 = new Class11_Sub48();
									class11_sub48.aClass192_7999 = class192;
									class11_sub48.anInt8002 = Class289.anInterface25Array3900[i_71_]
											.method30(125);
									class11_sub48.anInt7989 = Class289.anInterface25Array3900[i_71_]
											.method56(4152);
									class11_sub48.parameters = (((IComponentDefinitions) class192).anObjectArray2573);
									Class180.aClass84_2332.method589(
											(byte) -13, class11_sub48);
								}
							}
							if (Class11_Sub2_Sub19.aBool9097
									&& (((IComponentDefinitions) class192).anObjectArray2514 != null)) {
								Class11_Sub48 class11_sub48 = new Class11_Sub48();
								class11_sub48.aClass192_7999 = class192;
								class11_sub48.parameters = ((IComponentDefinitions) class192).anObjectArray2514;
								Class180.aClass84_2332.method589((byte) -13,
										class11_sub48);
							}
						}
						if (((IComponentDefinitions) class192).anInt2531 == 5
								&& ((IComponentDefinitions) class192).anInt2603 != -1)
							class192.method1246(-121, Class233.aClass379_3181,
									Class179.aClass154_2279)
									.method890(
											((IComponentDefinitions) class192).anInt2546,
											12162, Class321_Sub2.aClass163_6648);
						Class376_Sub7_Sub1.method3443(73, class192);
						if (((IComponentDefinitions) class192).anInt2531 == 0) {
							method4014(
									class192s,
									((IComponentDefinitions) class192).anInt2471,
									i_27_,
									i_28_,
									i_29_,
									i_30_,
									i_25_
											- ((IComponentDefinitions) class192).anInt2561,
									i_26_
											- ((IComponentDefinitions) class192).anInt2588,
									i_20_, i_21_, i_22_, i_23_);
							if (((IComponentDefinitions) class192).aClass192Array2524 != null)
								method4014(
										((IComponentDefinitions) class192).aClass192Array2524,
										((IComponentDefinitions) class192).anInt2471,
										i_27_,
										i_28_,
										i_29_,
										i_30_,
										i_25_
												- ((IComponentDefinitions) class192).anInt2561,
										i_26_
												- ((IComponentDefinitions) class192).anInt2588,
										i_20_, i_21_, i_22_, i_23_);
							Class11_Sub24 class11_sub24 = ((Class11_Sub24) (Class75_Sub2.aClass213_7160
									.method1369(
											(byte) 26,
											(long) ((IComponentDefinitions) class192).anInt2471)));
							if (class11_sub24 != null) {
								if ((Class198.aClass66_2679 == Class142.aClass66_1925)
										&& (((Class11_Sub24) class11_sub24).anInt6236) == 0
										&& !Class306.aBool4114
										&& bool
										&& !Class11_Sub2_Sub14.aBool9010)
									Class2_Sub5.method2406(-2);
								Class2_Sub5
										.method2402(
												i_27_,
												i_28_,
												i_30_,
												i_26_,
												i_21_,
												-1,
												i_23_,
												i_25_,
												i_22_,
												i_29_,
												(((Class11_Sub24) class11_sub24).anInt6233),
												i_20_);
							}
						}
					}
				}
			}
		}
	}

	static final IComponentDefinitions method4015(IComponentDefinitions class192) {
		int i = method4013(class192).method2350(-1);
		if (i == 0)
			return null;
		for (int i_72_ = 0; i_72_ < i; i_72_++) {
			class192 = Class11_Sub2_Sub13.method3533((byte) -109,
					(((IComponentDefinitions) class192).anInt2593));
			if (class192 == null)
				return null;
		}
		return class192;
	}

	static final void method4016(int i) {
		int i_73_ = Class190.anInt2446;
		int[] is = Class6.anIntArray40;
		for (int i_74_ = 0; i_74_ < i_73_ + Class23.anInt249; i_74_++) {
			Actor class376_sub7_sub5_sub5;
			if (i_74_ < i_73_)
				class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_74_]]);
			else
				class376_sub7_sub5_sub5 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26,
								(long) Class11_Sub52.anIntArray8054[i_74_
										- i_73_]))).aNpc_2373);
			if (((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047 == i
					&& (((Actor) class376_sub7_sub5_sub5).anInt10346) >= 0) {
				int i_75_ = class376_sub7_sub5_sub5.method3968((byte) 127);
				if ((i_75_ & 0x1) == 0) {
					if ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 & 0x1ff) != 0
							|| (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 & 0x1ff) != 0)
						continue;
				} else if ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 & 0x1ff) != 256
						|| ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) & 0x1ff) != 256)
					continue;
				if (i_75_ == 1) {
					int i_76_ = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 >> 9);
					int i_77_ = (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 >> 9);
					if ((((Actor) class376_sub7_sub5_sub5).anInt10346) > (Class11_Sub2_Sub30.anIntArrayArray9617[i_76_][i_77_])) {
						Class11_Sub2_Sub30.anIntArrayArray9617[i_76_][i_77_] = ((Actor) class376_sub7_sub5_sub5).anInt10346;
						Class108_Sub4.anIntArrayArray5386[i_76_][i_77_] = 1;
					} else if (((Actor) class376_sub7_sub5_sub5).anInt10346 == (Class11_Sub2_Sub30.anIntArrayArray9617[i_76_][i_77_]))
						Class108_Sub4.anIntArrayArray5386[i_76_][i_77_]++;
				} else {
					int i_78_ = (i_75_ - 1) * 256 + 60;
					int i_79_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 - i_78_) >> 9);
					int i_80_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 - i_78_) >> 9);
					int i_81_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 + i_78_) >> 9);
					int i_82_ = ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 + i_78_) >> 9);
					for (int i_83_ = i_79_; i_83_ <= i_81_; i_83_++) {
						for (int i_84_ = i_80_; i_84_ <= i_82_; i_84_++) {
							if (((Actor) class376_sub7_sub5_sub5).anInt10346 > (Class11_Sub2_Sub30.anIntArrayArray9617[i_83_][i_84_])) {
								Class11_Sub2_Sub30.anIntArrayArray9617[i_83_][i_84_] = ((Actor) class376_sub7_sub5_sub5).anInt10346;
								Class108_Sub4.anIntArrayArray5386[i_83_][i_84_] = 1;
							} else if (((Actor) class376_sub7_sub5_sub5).anInt10346 == (Class11_Sub2_Sub30.anIntArrayArray9617[i_83_][i_84_]))
								Class108_Sub4.anIntArrayArray5386[i_83_][i_84_]++;
						}
					}
				}
			}
		}
	}

	final void method4001(byte i) {
		try {
			if (Class217_Sub1.aBool5525)
				Class11_Sub2_Sub28.method3716(false);
			anInt10514++;
			Class304.method1870(-19310);
			if (Class321_Sub2.aClass163_6648 != null)
				Class321_Sub2.aClass163_6648.method1072(1);
			if (Class355.aFrame4658 != null) {
				Class118.method773(Class108_Sub21.aClass341_7304, (byte) -104,
						Class355.aFrame4658);
				Class355.aFrame4658 = null;
			}
			if (Class108_Sub2.aClass217_5081 != null) {
				Class108_Sub2.aClass217_5081.method1398(i ^ ~0x7fffff98);
				Class108_Sub2.aClass217_5081 = null;
			}
			Class11_Sub45_Sub1.method3348((byte) -95);
			Class52.aClass187_810.method1223((byte) -65);
			Class89.aClass82_1221.method569(i - 106);
			if (Class95.aClass164_1277 != null) {
				Class95.aClass164_1277.method1088((byte) 76);
				Class95.aClass164_1277 = null;
			}
			try {
				Class77.aClass182_1046.method1197(true);
				if (i != 103)
					method4026();
				for (int i_85_ = 0; i_85_ < 37; i_85_++)
					Class206_Sub2.aClass182Array6440[i_85_].method1197(true);
				Class256.aClass182_3508.method1197(true);
				Class11_Sub30_Sub1.aClass182_8980.method1197(true);
				Class309.method1887(false);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.I(" + i + ')');
		}
	}

	public final void init() {
		try {
			anInt10527++;
			if (this.method3991(false)) {
				Class181.aClass46_2337 = new Class46();
				((Class46) Class181.aClass46_2337).anInt730 = Integer
						.parseInt(this.getParameter("worldid"));
				Class108_Sub23.aClass46_7759 = new Class46();
				((Class46) Class108_Sub23.aClass46_7759).anInt730 = Integer
						.parseInt(this.getParameter("lobbyid"));
				((Class46) Class108_Sub23.aClass46_7759).aString733 = this
						.getParameter("lobbyaddress");
				Class2_Sub8.aClass46_6867 = new Class46();
				((Class46) Class2_Sub8.aClass46_6867).anInt730 = Integer
						.parseInt(this.getParameter("demoid"));
				((Class46) Class2_Sub8.aClass46_6867).aString733 = this
						.getParameter("demoaddress");
				Class11_Sub2_Sub24.aClass347_9284 = (Class165.method1096(
						(byte) -9,
						Integer.parseInt(this.getParameter("modewhere"))));
				if (Class11_Sub30_Sub1.aClass347_8979 != Class11_Sub2_Sub24.aClass347_9284) {
					if (!Class376_Sub7_Sub4.method3763(
							Class11_Sub2_Sub24.aClass347_9284, 70)
							&& (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711))
						Class11_Sub2_Sub24.aClass347_9284 = Class362.aClass347_4711;
				} else
					Class11_Sub2_Sub24.aClass347_9284 = Class376_Sub7_Sub2_Sub2.aClass347_10223;
				Class331.aClass307_4403 = (Class372.method2195(26496,
						Integer.parseInt(this.getParameter("modewhat"))));
				if (Class331.aClass307_4403 != Class316.aClass307_4181
						&& Class331.aClass307_4403 != Class376_Sub7.aClass307_7038
						&& Class350.aClass307_4608 != Class331.aClass307_4403)
					Class331.aClass307_4403 = Class350.aClass307_4608;
				try {
					Class11_Sub45_Sub1_Sub2.anInt9884 = Integer.parseInt(this
							.getParameter("lang"));
				} catch (Exception exception) {
					Class11_Sub45_Sub1_Sub2.anInt9884 = 0;
				}
				String string = this.getParameter("objecttag");
				if (string == null || !string.equals("1"))
					Class376_Sub5.aBool6919 = false;
				else
					Class376_Sub5.aBool6919 = true;
				String string_86_ = this.getParameter("js");
				if (string_86_ == null || !string_86_.equals("1"))
					Class11_Sub52.aBool8053 = false;
				else
					Class11_Sub52.aBool8053 = true;
				String string_87_ = this.getParameter("advert");
				if (string_87_ == null || !string_87_.equals("1"))
					Class58_Sub1.aBool7291 = false;
				else
					Class58_Sub1.aBool7291 = true;
				String string_88_ = this.getParameter("game");
				if (string_88_ != null) {
					if (!string_88_.equals("0")) {
						if (string_88_.equals("1"))
							Class198.aClass66_2679 = ISAAC.aClass66_263;
						else if (!string_88_.equals("2")) {
							if (string_88_.equals("3"))
								Class198.aClass66_2679 = Class299.aClass66_4035;
						} else
							Class198.aClass66_2679 = Class144.aClass66_1934;
					} else
						Class198.aClass66_2679 = Class142.aClass66_1925;
				}
				try {
					Class53.anInt817 = Integer.parseInt(this
							.getParameter("affid"));
				} catch (Exception exception) {
					Class53.anInt817 = 0;
				}
				Class11_Sub28.aString6558 = this.getParameter("quiturl");
				Class11_Sub2_Sub5.aString8552 = this.getParameter("settings");
				if (Class11_Sub2_Sub5.aString8552 == null)
					Class11_Sub2_Sub5.aString8552 = "";
				Class239_Sub1.aBool7267 = "1"
						.equals(this.getParameter("under"));
				String string_89_ = this.getParameter("country");
				if (string_89_ != null) {
					try {
						Class372.anInt4875 = Integer.parseInt(string_89_);
					} catch (Exception exception) {
						Class372.anInt4875 = 0;
					}
				}
				Class33_Sub1.anInt6178 = Integer.parseInt(this
						.getParameter("colourid"));
				if (Class33_Sub1.anInt6178 < 0
						|| (Class281.aColorArray3806.length <= Class33_Sub1.anInt6178))
					Class33_Sub1.anInt6178 = 0;
				if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1)
					Class240.aBool3259 = Class51.aBool795 = true;
				String string_90_ = this.getParameter("frombilling");
				if (string_90_ != null && string_90_.equals("true"))
					Class91_Sub1.aBool6936 = true;
				Class286.aString3874 = this.getParameter("sskey");
				if (Class286.aString3874 != null
						&& Class286.aString3874.length() < 2)
					Class286.aString3874 = null;
				String string_91_ = this.getParameter("force64mb");
				if (string_91_ != null && string_91_.equals("true"))
					Class147.aBool1992 = true;
				String string_92_ = this.getParameter("worldflags");
				if (string_92_ != null) {
					try {
						Class254_Sub3.anInt8047 = Integer.parseInt(string_92_);
					} catch (Exception exception) {
						/* empty */
					}
				}
				String string_93_ = this.getParameter("userFlow");
				if (string_93_ != null) {
					try {
						Class118.aLong1607 = Long.parseLong(string_93_);
					} catch (NumberFormatException numberformatexception) {
						/* empty */
					}
				}
				Class11_Sub2_Sub1.aString8438 = this
						.getParameter("additionalInfo");
				if (Class11_Sub2_Sub1.aString8438 != null
						&& ((Class11_Sub2_Sub1.aString8438.length() ^ 0xffffffff) < -51))
					Class11_Sub2_Sub1.aString8438 = null;
				Class11_Sub2_Sub23.aclient9263 = this;
				if (Class198.aClass66_2679 != Class142.aClass66_1925) {
					if (Class198.aClass66_2679 == ISAAC.aClass66_263) {
						Class233.anInt3186 = 640;
						Class279.anInt3772 = 480;
					}
				} else {
					Class279.anInt3772 = 503;
					Class233.anInt3186 = 765;
				}
				this.method4002(Class233.anInt3186, 37,
						Class331.aClass307_4403.method1883(58) + 32,
						Class279.anInt3772,
						((Class66) Class198.aClass66_2679).aString944, -127,
						633);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.init(" + ')');
		}
	}

	public static void method4017(int i) {
		do {
			try {
				aClass370_10513 = null;
				if (i > 116)
					break;
				aClass370_10513 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "client.Q(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	final String method3985(boolean bool) {
		try {
			anInt10522++;
			String string = null;
			try {
				string = ("[1)" + Class194.anInt2641 + "," + Class118.anInt1605
						+ "," + Class300.anInt4051 + ","
						+ Class108_Sub12.anInt6228 + "|");
				if (Class11_Sub2_Sub8.myPlayer != null)
					string += ("2)"
							+ Class376_Sub7_Sub2.anInt9242
							+ ","
							+ (Class194.anInt2641 + (((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]))
							+ ","
							+ ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) + Class118.anInt1605) + "|");
				string = (string
						+ "3)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
								.method3181(!bool)
						+ "|4)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712
								.method2698(!bool) + "|5)"
						+ Class187.method1227((byte) 54) + "|6)"
						+ Class11_Sub36.anInt7079 + "," + Class153.anInt2025 + "|");
				string += "7)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723
								.method2623(false) + "|";
				string = string
						+ "8)"
						+ ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub26_5717
								.method3147(!bool) + "|";
				string = string
						+ "9)"
						+ ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub5_5695
								.method2373(!bool) + "|";
				string += "10)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697
								.method2429(false) + "|";
				string += "11)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699
								.method3126(false) + "|";
				string += "12)"
						+ ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
								.method3158(false) + "|";
				string += "13)" + Class177.anInt2245 + "|";
				string += "14)" + Class285.anInt3846;
				if (bool != true)
					aClass370_10513 = null;
				if (Class205.aClass11_Sub16_2755 != null)
					string += "|15)"
							+ ((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656;
				try {
					if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
							.method3181(false) ^ 0xffffffff) == -3) {
						Class var_class = Class
								.forName("java.lang.ClassLoader");
						Field field = var_class
								.getDeclaredField("nativeLibraries");
						Class var_class_94_ = (Class
								.forName("java.lang.reflect.AccessibleObject"));
						Method method = var_class_94_
								.getDeclaredMethod("setAccessible",
										(new Class[] { Boolean.TYPE }));
						method.invoke(field, new Object[] { Boolean.TRUE });
						Vector vector = ((Vector) field
								.get((aClass10530 != null ? aClass10530
										: (aClass10530 = getClassByName("client")))
										.getClassLoader()));
						for (int i = 0; vector.size() > i; i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_95_ = object.getClass()
										.getDeclaredField("name");
								method.invoke(field_95_,
										new Object[] { Boolean.TRUE });
								try {
									String string_96_ = (String) field_95_
											.get(object);
									if (string_96_ != null
											&& (string_96_.indexOf("sw3d.dll") ^ 0xffffffff) != 0) {
										Field field_97_ = object.getClass()
												.getDeclaredField("handle");
										method.invoke(field_97_,
												(new Object[] { Boolean.TRUE }));
										string += ("|16)" + Long
												.toHexString(field_97_
														.getLong(object)));
										method.invoke(
												field_97_,
												(new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_95_,
										new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
				string += "]";
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.F(" + bool
					+ ')');
		}
	}

	private final void method4018(byte i) {
		try {
			if ((Class285.anInt3846 ^ 0xffffffff) == -8
					&& (Class94_Sub1.loginStep ^ 0xffffffff) == -1) {
				if (Class334.anInt4423 > 1) {
					Class334.anInt4423--;
					Class219.anInt3019 = Class219_Sub1.anInt7238;
				}
				if (!Class306.aBool4114)
					Class2_Sub5.method2406(i + 69);
				for (int i_98_ = 0; i_98_ < 100; i_98_++) {
					if (!Class11_Sub2_Sub34.method3812(i ^ 0x74))
						break;
				}
			}
			anInt10521++;
			Class104.anInt1398++;
			Class330.method1996(-1, -1, null, 0);
			if (i != -71)
				aClass370_10513 = null;
			Class376_Sub7_Sub5_Sub1.method3884(null, -1, -104, -1);
			Class34.method306(i ^ ~0x5f);
			Class219_Sub1.anInt7238++;
			for (int i_99_ = 0; ((Class108_Sub17.anInt6619 ^ 0xffffffff) < (i_99_ ^ 0xffffffff)); i_99_++) {
				Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_99_]).aNpc_2373);
				if (class376_sub7_sub5_sub5_sub2 != null) {
					byte i_100_ = (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aByte2926);
					if ((0x1 & i_100_) != 0) {
						int i_101_ = class376_sub7_sub5_sub5_sub2
								.method3968((byte) 127);
						if ((0x2 & i_100_) != 0
								&& ((Actor) class376_sub7_sub5_sub5_sub2).anInt10375 == 0
								&& Math.random() * 1000.0 < 10.0) {
							int i_102_ = (int) Math.round(-5.0 + 10.0
									* Math.random());
							int i_103_ = (int) Math.round(-5.0 + 10.0
									* Math.random());
							if ((i_102_ ^ 0xffffffff) != -1 || i_103_ != 0) {
								int i_104_ = i_102_
										+ (((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]);
								if ((i_104_ ^ 0xffffffff) <= -1) {
									if (i_104_ > Class300.anInt4051
											+ (-i_101_ - 1))
										i_104_ = -1
												+ (Class300.anInt4051 + -i_101_);
								} else
									i_104_ = 0;
								int i_105_ = ((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]) + i_103_);
								if ((i_105_ ^ 0xffffffff) > -1)
									i_105_ = 0;
								else if ((-1
										+ (-i_101_ + Class108_Sub12.anInt6228) ^ 0xffffffff) > (i_105_ ^ 0xffffffff))
									i_105_ = (-1 + Class108_Sub12.anInt6228 + -i_101_);
								int i_106_ = (Class11_Sub45_Sub11
										.method3581(
												i_101_,
												(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[0]),
												(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[0]),
												0,
												-29375,
												i_101_,
												i_101_,
												i_105_,
												i_104_,
												Class212.anIntArray2881,
												0,
												Class295.anIntArray3981,
												(Class235.aClass338Array3217[(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).aByte7047)]),
												-1, true));
								if ((i_106_ ^ 0xffffffff) < -1) {
									if (i_106_ > 9)
										i_106_ = 9;
									for (int i_107_ = 0; ((i_106_ ^ 0xffffffff) < (i_107_ ^ 0xffffffff)); i_107_++) {
										((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10370[i_107_] = (Class295.anIntArray3981[-1
												+ (-i_107_ + i_106_)]);
										((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10376[i_107_] = (Class212.anIntArray2881[-1
												+ -i_107_ + i_106_]);
										((Actor) class376_sub7_sub5_sub5_sub2).aByteArray10372[i_107_] = (byte) 1;
									}
									((Actor) class376_sub7_sub5_sub5_sub2).anInt10375 = i_106_;
								}
							}
						}
						Class376_Sub7_Sub2_Sub1.method3934(true, (byte) 60,
								class376_sub7_sub5_sub5_sub2);
						int i_108_ = Class344.method2086(
								class376_sub7_sub5_sub5_sub2, (byte) -125);
						Class120.method783(class376_sub7_sub5_sub5_sub2,
								(byte) 49);
						Class327.method1985(Class85.anInt1171, i_108_, 1,
								Class67.anInt950, class376_sub7_sub5_sub5_sub2);
						Class251_Sub2.method2379(Class67.anInt950,
								class376_sub7_sub5_sub5_sub2, -1);
						Class270.method1695(false, class376_sub7_sub5_sub5_sub2);
					}
				}
			}
			if ((Class94_Sub1.loginStep ^ 0xffffffff) == -1
					&& (Class313.anInt4162 ^ 0xffffffff) == -1) {
				if (Class191.anInt2453 == 2)
					Class319.method1937(-256);
				else
					Class298.method1849((byte) 126);
				if ((Class11_Sub45_Sub11.anInt9157 >> 9 ^ 0xffffffff) > -15
						|| (Class11_Sub45_Sub11.anInt9157 >> 9 >= Class300.anInt4051 - 14)
						|| Class303.anInt4088 >> 9 < 14
						|| (Class303.anInt4088 >> 9 >= -14
								+ Class108_Sub12.anInt6228))
					Class234_Sub1_Sub1.method3825(8);
			}
			for (;;) {
				Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class11_Sub43.aClass84_7327
						.method581((byte) -16));
				if (class11_sub48 == null)
					break;
				IComponentDefinitions class192 = class11_sub48.aClass192_7999;
				if ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= -1) {
					IComponentDefinitions class192_109_ = Class11_Sub2_Sub13
							.method3533(
									(byte) -106,
									(((IComponentDefinitions) class192).anInt2593));
					if (class192_109_ == null
							|| (((IComponentDefinitions) class192_109_).aClass192Array2524 == null)
							|| (((IComponentDefinitions) class192).anInt2459 >= (((IComponentDefinitions) class192_109_).aClass192Array2524).length)
							|| (((IComponentDefinitions) class192_109_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]) != class192)
						continue;
				}

				Class86.method610(class11_sub48);
				
			}
			for (;;) {
				Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class2_Sub10.aClass84_7920
						.method581((byte) -16));
				if (class11_sub48 == null)
					break;
				IComponentDefinitions class192 = class11_sub48.aClass192_7999;
				if ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= -1) {
					IComponentDefinitions class192_110_ = Class11_Sub2_Sub13
							.method3533(
									(byte) -101,
									(((IComponentDefinitions) class192).anInt2593));
					if (class192_110_ == null
							|| (((IComponentDefinitions) class192_110_).aClass192Array2524 == null)
							|| ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= ((((IComponentDefinitions) class192_110_).aClass192Array2524).length ^ 0xffffffff))
							|| class192 != (((IComponentDefinitions) class192_110_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]))
						continue;
				}
				
				Class86.method610(class11_sub48);
			}
			for (;;) {
				Class11_Sub48 class11_sub48 = ((Class11_Sub48) Class180.aClass84_2332
						.method581((byte) -16));
				if (class11_sub48 == null)
					break;
				IComponentDefinitions class192 = class11_sub48.aClass192_7999;
				if (((IComponentDefinitions) class192).anInt2459 >= 0) {
					IComponentDefinitions class192_111_ = Class11_Sub2_Sub13
							.method3533(
									(byte) -96,
									(((IComponentDefinitions) class192).anInt2593));
					if (class192_111_ == null
							|| (((IComponentDefinitions) class192_111_).aClass192Array2524 == null)
							|| ((((IComponentDefinitions) class192).anInt2459 ^ 0xffffffff) <= ((((IComponentDefinitions) class192_111_).aClass192Array2524).length ^ 0xffffffff))
							|| (((IComponentDefinitions) class192_111_).aClass192Array2524[((IComponentDefinitions) class192).anInt2459]) != class192)
						continue;
				}
				Class86.method610(class11_sub48);
			}
			if (Class11_Sub2_Sub32_Sub1.aClass192_9889 != null)
				Class280.method1730(31167);
			if (Class11_Sub25.anInt6279 % 1500 == 0)
				Class239_Sub2.method3190(i ^ 0x3c);
			if ((Class285.anInt3846 ^ 0xffffffff) == -8
					&& Class94_Sub1.loginStep == 0)
				Class204.method1294(-30726);
			Class34.method305(i ^ ~0x34);
			if (Class217_Sub1.aBool5525
					&& ((Class137.method878((byte) -54) + -60000L ^ 0xffffffffffffffffL) < (Class347.aLong4598 ^ 0xffffffffffffffffL)))
				Class11_Sub2_Sub28.method3716(false);
			for (Class376_Sub1_Sub2 class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
					.method847(-31182)); class376_sub1_sub2 != null; class376_sub1_sub2 = ((Class376_Sub1_Sub2) Class2_Sub1.aClass131_5063
					.method856(i + 170))) {
				if (Class137.method878((byte) -69) / 1000L + -5L > (long) (((Class376_Sub1_Sub2) class376_sub1_sub2).anInt9742)) {
					if (((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743 > 0)
						Class300.method1852(
								-119,
								(((Class376_Sub1_Sub2) class376_sub1_sub2).aString9744 + (Class26.aClass26_295
										.method217(
												(byte) 106,
												(Class11_Sub45_Sub1_Sub2.anInt9884)))),
								"", 0, "", "", 5);
					if (((Class376_Sub1_Sub2) class376_sub1_sub2).aShort9743 == 0)
						Class300.method1852(
								-98,
								(((Class376_Sub1_Sub2) class376_sub1_sub2).aString9744 + (Class26.aClass26_296
										.method217(
												(byte) 91,
												(Class11_Sub45_Sub1_Sub2.anInt9884)))),
								"", 0, "", "", 5);
					class376_sub1_sub2.method2207((byte) -109);
				}
			}
			if (Class285.anInt3846 == 7
					&& (Class94_Sub1.loginStep ^ 0xffffffff) == -1) {
				if (Class108_Sub2.aClass217_5081 == null)
					InputStream_Sub2.method2814(false, -25626);
				else {
					Class70.anInt984++;
					if (Class70.anInt984 > 50) {
						Class11_Sub45_Sub1_Sub2.anInt9876++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class234_Sub1.aClass370_5644), (byte) -43);
						Class79.method541(class11_sub10, i - 30);
					}
					try {
						Class234_Sub2_Sub2.method3540((byte) 102);
					} catch (java.io.IOException ioexception) {
						InputStream_Sub2.method2814(false, i - 25555);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.T(" + i + ')');
		}
	}

	private final void method4019(int i, int i_112_) {
		try {
			Class199.anInt2701 = 0;
			Class230.aClass126_3154 = null;
			((Class187) Class52.aClass187_810).anInt2405++;
			anInt10518++;
			((Class187) Class52.aClass187_810).anInt2407 = i;
			int i_113_ = -12 % ((i_112_ + 41) / 58);
			Class198.aClass368_2675 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.V(" + i + ','
					+ i_112_ + ')');
		}
	}

	final void method3997(int i) {
		try {
			int i_114_ = 98 / ((-56 - i) / 52);
			anInt10520++;
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) ^ 0xffffffff) != -3)
				method4024((byte) 89);
			else {
				try {
					method4024((byte) 103);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class11_Sub12_Sub3
							.method3602((byte) -51, (throwable.getMessage()
									+ " (Recovered) " + method3985(true)),
									throwable);
					Class220.aBool3024 = true;
					Class239.method1521(false, 0, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.B(" + i + ')');
		}
	}

	final void method3989(byte i) {
		try {
			anInt10526++;
			method4017(123);
			Class59.method466(false);
			Class15.method149(true);
			Class11_Sub45_Sub15.method3656((byte) -16);
			Class26.method220(-83);
			Class1.method61(-111);
			Class238.method1517(8);
			Class351.method2106(24);
			Class259.method1661(29400);
			Class147.method944(-1608275071);
			Class286.method1766(-3053);
			Class11_Sub45.method3185(0);
			Class38.method336((byte) -121);
			Applet_Sub1.method4003((byte) -49);
			Class264.method1676((byte) 125);
			Class307.method1884(-25086);
			Class347.method2095(-12320);
			Class66.method493((byte) -31);
			Class33.method285(true);
			Class163.method1015((byte) 103);
			Class11_Sub16.method2445((byte) -22);
			Class275.method1709(112);
			Class84.method577(2);
			Class126.method822(-109);
			Class187.method1228(-105);
			Class19_Sub1.method2468((byte) -106);
			Class146.method915((byte) 12);
			Class182.method1191((byte) -121);
			Class243.method1535(-28916);
			Class22.method183(27927);
			Class127.method832(true);
			Class96.method649(true);
			Class374.method2202(true);
			Class302.method1858(-118);
			Class353.method2115(true);
			Class221.method1410(-93);
			Class85.method594((byte) -12);
			Class290.method1794(false);
			Class280.method1727((byte) -32);
			Class29.method248((byte) 18);
			Class223.method1425(155);
			Class52.method434(0);
			Class273.method1700(-128);
			Class198.method1283(24);
			Class379.method2224(7);
			Class154.method971((byte) -99);
			Class227.method1464((byte) 120);
			Class285.method1761(22311);
			Class306.method1876((byte) 96);
			Class369.method2179(-1);
			Class171.method1122(15);
			Class361.method2145(2);
			Class352.method2109(1);
			Class11_Sub25.method2663(0);
			ISAAC.method216(false);
			Packet.method3419((byte) 83);
			IncomingPacket.method991(-123);
			Class164.method1092(-123);
			Class11_Sub31.method2766(9413);
			Class338.method2037(-3570);
			Class286_Sub1.method2906(17518);
			Class11_Sub45_Sub19.method3821((byte) -98);
			Class342.method2076((byte) 111);
			Class141.method892(-1);
			Class131.method857(0);
			IComponentDefinitions.method1250(58);
			Class35.method308(-1);
			Player.method3980((byte) -113);
			Class153.method957(false);
			Class111.method744(-1);
			Stream.method2518((byte) -118);
			Class11_Sub10.method2369(83);
			Class364.method2158(-110);
			Class83.method574(2);
			Class11_Sub15.method2423(103);
			Class11_Sub24.method2645((byte) -38);
			Class11_Sub45_Sub9.method3484(-10550);
			Class55.method448((byte) 44);
			Class376.method2206((byte) -13);
			Class270.method1696(-120);
			Class376_Sub1.method2278((byte) 119);
			Class137.method877((byte) 83);
			Class308.method1886(-6958);
			Class316.method1919((byte) -112);
			Class195_Sub1.method2628(-3759);
			Class159.method987(110);
			Class46.method401((byte) 14);
			Class24.method208((byte) -121);
			RuntimeException_Sub1.method3897(0);
			Class357.method2128(false);
			Class11_Sub45_Sub20_Sub1.method3891(0);
			Class11_Sub45_Sub20_Sub2.method3942(4);
			Class295.method1831(30000);
			Class288.method1780((byte) 102);
			Class258.method1649((byte) 68);
			Class281.method1735((byte) -74);
			Class208.method1340(-20435);
			Class206.method1316(120);
			Class155.method973(12);
			Class234.method1496(true);
			Class323.method1973(14006);
			Class360.method2142(-15443);
			Class42.method379(-36);
			Class179.method1165(true);
			Class189.method1232(96);
			Class12.method129(5871);
			Class249.method1583(107);
			Class107.method711(15578);
			Class106.method699(-114);
			Class108_Sub23.method3125((byte) -126);
			Class108_Sub20.method2934(12165);
			Class108_Sub19.method2893(0);
			Class108_Sub16.method2711(false);
			Class108_Sub18.method2806((byte) 96);
			Class108_Sub11.method2622((byte) -123);
			Class108_Sub26.method3148(-1);
			Class108_Sub4.method2364(35);
			Class108_Sub10.method2614((byte) 125);
			Class108_Sub21.method2955(9564);
			Class108_Sub6.method2432(true);
			Class108_Sub27.method3159((byte) -64);
			Class108_Sub5.method2375(12275);
			Class108_Sub13.method2651(false);
			Class108_Sub2.method2267((byte) 106);
			Class108_Sub7.method2434(-122);
			Class108_Sub1.method2252(-129);
			Class108_Sub14.method2657(-94);
			Class108_Sub8.method2464(true);
			Class108.method724(116);
			Class49.method416(109);
			Class100.method667((byte) 121);
			Exception_Sub1.method3735((byte) 1);
			Class72.method517(107);
			Class11_Sub50.method3227(-1);
			Class11_Sub46.method3206(-122);
			Class355.method2124((byte) -73);
			Class376_Sub7.method2861(-17340);
			Class37.method324((byte) -62);
			Class165.method1094(4);
			Class86.method600();
			Class298.method1850(-1);
			Class11_Sub12_Sub3.method3599(true);
			Class28.method229(-2);
			Class28_Sub1.method2727(-438808511);
			Class11_Sub12_Sub4.method3723(-1);
			Class11_Sub6_Sub5.method3786(-28855);
			Class176.method1146(256);
			Class339.method2050(0);
			Class235.method1498(0);
			Class209.method1343(4);
			Class250.method1597(0);
			Class135.method873(false);
			Class115.method761(3198);
			Class78.method536(-1141);
			Class380.method2228(99);
			Class265.method1682((byte) -67);
			Class48.method413((byte) -63);
			Class346.method2090(115);
			Class161.method995((byte) -104);
			Class32.method282();
			Class382.method2233((byte) -65);
			Class30.method254((byte) -105);
			Class365.method2160(-1);
			Class175.method1145((byte) -99);
			Class138.method881((byte) 5);
			Class44.method394((byte) -116);
			Class118.method770((byte) -68);
			Class150.method949(2);
			Class205.method1297((byte) -117);
			Class329.method1994(16491);
			Class103.method684(-67);
			Class376_Sub5.method2801(-46);
			Class212.method1361(false);
			Class173.method1132(-20169);
			Class376_Sub10.method3165();
			Class39.method338(-102);
			Class229.method1475(127);
			Class130.method845(true);
			Class191.method1240(16711680);
			Class19.method164(126);
			Class181.method1186(123);
			Class313.method1909(30328);
			Class336.method2020((byte) 62);
			Class11_Sub21.method2562(128);
			Class23.method204(false);
			Class40.method361();
			Class289.method1783(87);
			Class117.method769((byte) 124);
			Class196.method1277((byte) -93);
			Class7.method91(false);
			Class11_Sub48.method3218(false);
			Class11_Sub45_Sub6.method3440(94);
			Class128.method834((byte) -64);
			Class11_Sub45_Sub20.method3831(64);
			Class248.method1570(16);
			Class376_Sub7_Sub1.method3446(123);
			Class376_Sub7_Sub3.method3619(-118);
			Class376_Sub7_Sub4.method3765((byte) 123);
			Class140.method885((byte) 46);
			Class11_Sub45_Sub1.method3347((byte) -76);
			Class5.method85((byte) 126);
			Class178.method1158();
			Class110.method740(true);
			Class261.method1667(-1);
			Class210.method1346(114);
			Class11_Sub29.method2722((byte) -27);
			Class74.method523();
			Class11_Sub37.method2887(19);
			Class312.method1903((byte) 103);
			Class11_Sub19.method2483(256);
			Class11_Sub13.method2396();
			Class89.method619(109);
			Class362.method2148(-10869);
			Class11_Sub52.method3241(127);
			Class233.method1487(-29278);
			Class327.method1983(-119);
			Class207.method1334(-31693);
			Class102.method681(78);
			Class71.method510((byte) -122);
			Class101.method676(true);
			Class45.method399(true);
			Class112.method752((byte) 3);
			Class11_Sub45_Sub2.method3355(105);
			Class129.method838(255);
			Class343.method2077((byte) 103);
			Class279.method1721((byte) -91);
			Class124.method809(8);
			Class194.method1271(-3778);
			Class133.method859(-32084);
			Class170.method1117(255);
			Class326.method1979(60);
			Class297.method1848(false);
			Class230.method1476(-32);
			Class77.method528(3);
			Class180.method1182(0);
			Class65.method492(0);
			Class376_Sub3.method2611(-49);
			Class376_Sub7_Sub5_Sub2.method3902((byte) 111);
			Class376_Sub8.method3124(-41);
			Class332.method2001(-27527);
			Class301.method1857(127);
			Class11_Sub45_Sub13.method3635(true);
			Class79.method540(-103);
			Class372.method2194((byte) -109);
			Class120.method785(false);
			Class3.method80((byte) 30);
			Class376_Sub7_Sub1_Sub1.method3920(-99);
			Class50.method418(0);
			Class376_Sub7_Sub4_Sub2.method3914(true);
			Class376_Sub7_Sub5_Sub1.method3885(-28097);
			Class376_Sub7_Sub2_Sub2.method3945(-115);
			Class244.method1541(-18169);
			Class1_Sub1.method2897(true);
			Class10.method117(1);
			Class303.method1867((byte) -86);
			Class254_Sub2_Sub1.method3742((byte) -104);
			Class204.method1296(32);
			Class254_Sub2.method2829(114);
			Class272.method1699(-119);
			Class57_Sub1.method2487((byte) 72);
			Class254_Sub3.method3240(14);
			Class113.method755((byte) 122);
			Class190.method1233(false);
			Class188.method1231(8720);
			Class11_Sub45_Sub12.method3590(7407);
			Class11_Sub45_Sub8.method3456((byte) 111);
			Class268.method1692((byte) 86);
			Class11_Sub45_Sub21.method3847((byte) 108);
			Class11_Sub12.method2386(true);
			Class203.method1293(-18226);
			Canvas_Sub1.method3609((byte) -128);
			Class41.method367(2);
			Class333.method2009(4067);
			IOException_Sub1.method3898(true);
			Class93.method629(true);
			Class51.method431(-118);
			Class359.method2137(512);
			Class61.method468((byte) 17);
			Class284.method1757();
			Class11_Sub45_Sub9_Sub2.method3952((byte) -121);
			Class62.method476((byte) -123);
			Class31.method260((byte) 111);
			Class11_Sub45_Sub16.method3705(-127);
			Class217_Sub1.method2412((byte) -114);
			Class376_Sub7_Sub2_Sub1.method3937(-1);
			Class376_Sub7_Sub5_Sub4.method3923(118);
			Class376_Sub7_Sub3_Sub1.method3873(-106);
			Class255.method1634((byte) -90);
			Class376_Sub7_Sub4_Sub1.method3890(true);
			Class11_Sub32.method2791((byte) 124);
			Class11_Sub51.method3233(17511);
			Class11_Sub3.method2286((byte) 102);
			Class195.method1274(-125);
			Class193.method1267(-74);
			Class114.method759(8);
			Class246.method1549(-1);
			Class11_Sub18.method2478(4);
			Class247.method1562();
			Class11_Sub43.method2966(-2);
			Class317.method1926();
			Class169.method1106();
			Class344.method2087(9);
			Class37_Sub2.method3192();
			Class267.method1686(3);
			Class11_Sub12_Sub1.method3467(-1);
			Class211.method1354(-90);
			Class11_Sub2.method2261(0);
			Class76.method525(48);
			Class4.method83(58);
			Class287.method1778((byte) -92);
			Class121.method786(117);
			Class220.method1407((byte) 74);
			Class220_Sub1.method2915(58);
			Class335_Sub1.method2693((byte) 82);
			Class335.method2015((byte) -123);
			Class254.method1631((byte) 36);
			Class335_Sub3.method3140(11);
			Class63.method482(30);
			Class335_Sub3_Sub1.method3712(-119);
			Class237.method1513(79);
			Class70.method509(true);
			Class142.method898(false);
			Class294.method1820();
			Class81.method564((byte) 57);
			Class151.method951((byte) 87);
			Class53.method439(1844);
			Class11_Sub45_Sub11.method3579(-4220);
			Class376_Sub1_Sub1.method3411(false);
			Class376_Sub2.method2421(-7050);
			Class228.method1470(0);
			Class376_Sub6.method2819((byte) 121);
			Class310.method1895(2);
			Class58.method464(true);
			Class291.method1795(100);
			Class105.method695(-109);
			Class11_Sub45_Sub16_Sub2.method3929((byte) 109);
			Class6.method86(72);
			Class123.method804((byte) -56);
			Class11_Sub2_Sub22.method3597(false);
			Class11_Sub2_Sub32.method3804(120);
			Class11_Sub2_Sub26.method3653((byte) -122);
			Class11_Sub49.method3222((byte) -22);
			Class11_Sub30.method2729(-123);
			Class340.method2052(-7045);
			Class363.method2151(false);
			Class163_Sub3.method3318(-68);
			Class73.method521(-21052);
			Class305.method1875((byte) -122);
			Class11_Sub35_Sub1.method3571(1);
			Class109.method733(64);
			Class33_Sub1.method2630(6);
			Class334.method2012(1);
			Class253_Sub2.method2702(1278894712);
			Class378.method2219(109);
			Class321.method1953(-22076);
			Class321_Sub3.method2853(14701);
			Class234_Sub2.method2567(0);
			Class321_Sub3_Sub1.method3615(-118);
			Class206_Sub3.method2774(0);
			Class350.method2102(20816);
			Class11_Sub20_Sub2.method3746(1);
			Class163_Sub2.method2982(0);
			Class27.method228(-105);
			Class366.method2166((byte) -117);
			Class177.method1150(86);
			Class16.method154(11677);
			Class240.method1525(true);
			Class314.method1911((byte) 124);
			Class2.method79(111);
			Class234_Sub1.method2438(39);
			Class282.method1740(true);
			Class68.method497(13);
			Class219.method1406((byte) -73);
			Class206_Sub2.method2689((byte) -96);
			Class98.method664((byte) 76);
			Class218.method1402(true);
			Class315.method1913(119);
			Class183.method1199(true);
			Class163_Sub2_Sub1.method3402((byte) 86);
			Class251_Sub2.method2380(30386);
			Class371.method2192();
			Class11_Sub2_Sub23.method3617(0);
			Class11_Sub2_Sub30.method3793(-128);
			Class11_Sub2_Sub35.method3836(4096);
			Class11_Sub2_Sub38.method3851((byte) -14);
			Class11_Sub2_Sub17.method3552((byte) -97);
			Class11_Sub2_Sub25.method3644(4);
			Class11_Sub2_Sub6.method3412(-4096);
			Class11_Sub2_Sub24.method3622(-111);
			Class11_Sub2_Sub18.method3553(-124);
			Class11_Sub2_Sub15.method3547(true);
			Class11_Sub2_Sub4.method3350(1);
			Class11_Sub2_Sub3.method3343((byte) 18);
			Class11_Sub2_Sub32_Sub1.method3880(-75);
			Class11_Sub2_Sub16.method3548(-7286);
			Class11_Sub2_Sub5.method3396(true);
			Class11_Sub2_Sub10.method3476((byte) 35);
			Class11_Sub2_Sub34.method3813((byte) -128);
			Class11_Sub2_Sub21.method3595((byte) -88);
			Class11_Sub2_Sub36.method3838((byte) 81);
			Class11_Sub2_Sub28.method3717((byte) -106);
			Class11_Sub2_Sub20.method3578(2535);
			Class11_Sub2_Sub12.method3480(0);
			Class11_Sub2_Sub8.method3431(0);
			Class11_Sub2_Sub2.method3334((byte) 32);
			Class11_Sub2_Sub14.method3543((byte) 127);
			Class11_Sub2_Sub9.method3470((byte) 124);
			Class11_Sub2_Sub31.method3802(-17189);
			Class11_Sub2_Sub1.method3329(true);
			Class11_Sub2_Sub19.method3565(1);
			int i_115_ = 81 % ((-71 - i) / 36);
			Class11_Sub2_Sub27.method3707(-47);
			Class11_Sub2_Sub29.method3732(-1);
			Class232.method1486(-1);
			Class11_Sub40.method2932();
			Class377.method2209((byte) 123);
			Class325.method1977(0);
			Class216.method1393(40);
			Class11_Sub30_Sub1.method3527(-117);
			Class166.method1100((byte) -120);
			Class367.method2173(0);
			Class321_Sub2.method2743(-1);
			Class11_Sub45_Sub4.method3388((byte) 53);
			Class11_Sub35.method2845(-126);
			Class236.method1503(117);
			Class299.method1851(16);
			Class236_Sub8.method2883(93);
			Class11_Sub45_Sub1_Sub2.method3876(230);
			Class11_Sub50_Sub1.method3472(-122);
			Class72_Sub3.method2960(false);
			Class337.method2025(false);
			Class11_Sub7.method2326((byte) 53);
			Class277.method1713(-22339);
			Class234_Sub2_Sub1.method3331((byte) 64);
			Class234_Sub2_Sub2.method3538(-65534);
			Class239_Sub1.method2942(34);
			Class75_Sub2.method2918(0);
			Class236_Sub7.method2825((byte) 52);
			Class321_Sub4.method3220((byte) 70);
			Class236_Sub5.method2784(true);
			Class236_Sub6.method2824(-128);
			Class236_Sub4.method2767((byte) -85);
			Class236_Sub9.method3121((byte) -122);
			Class236_Sub1.method2606(-28581);
			Class95.method644(36);
			Class88.method618(0);
			Class139.method883(96);
			Class34.method307(421);
			Class11_Sub50_Sub2.method3562((byte) -86);
			Class331.method2000((byte) -116);
			Class168.method1104((byte) -111);
			Class11_Sub45_Sub1_Sub1.method3869(-1);
			Class64.method484(0);
			Class328_Sub1.method2666((byte) 56);
			Class12_Sub1.method2290(123);
			Class11_Sub44.method3138(-1);
			Class226.method1456((byte) -122);
			Class234_Sub1_Sub1.method3826(-6804);
			Class11_Sub46_Sub1.method3469(118);
			Class2_Sub8.method2786((byte) 93);
			Class2_Sub6.method2414((byte) 38);
			Class2_Sub10.method3191(90);
			Class2_Sub9.method2946((byte) -82);
			Class58_Sub2.method3155(-26913);
			Class58_Sub1.method2953(true);
			Class186.method1211(2);
			Class94_Sub1.method2309(94);
			Class94_Sub3.method2798(-119);
			Class94_Sub4.method3116((byte) 105);
			Class2_Sub5.method2404((byte) -104);
			Class47.method411(-5620);
			Class2_Sub1.method2265((byte) 81);
			Class2_Sub3.method2356(5);
			Class300.method1853(0);
			Class251_Sub1.method2377((byte) 56);
			Class219_Sub1.method2939(-12529);
			Class91_Sub3.method3326(-76);
			Class91.method625((byte) -26);
			Class91_Sub3_Sub1.method3647(false);
			Class91_Sub2.method3110(1388);
			Class91_Sub1_Sub1.method3532(-31681);
			Class91_Sub1.method2811((byte) -74);
			Class11_Sub11.method2372((byte) 25);
			Class11_Sub28.method2718(-3625);
			Class278.method1716((byte) 28);
			Class11_Sub39.method2925(-4);
			Class274.method1707((byte) -114);
			Class11_Sub45_Sub17.method3747(-42);
			Class11_Sub45_Sub10.method3525(true);
			Class11_Sub26.method2668((byte) -108);
			Class143.method900((byte) 74);
			InputStream_Sub1.method2664(false);
			OutputStream_Sub2.method3196(false);
			Class14.method145(-15784);
			Class54.method444(-110);
			Class11_Sub45_Sub3.method3383((byte) -75);
			Class11_Sub33.method2797((byte) 108);
			Class11_Sub22.method2563((byte) 109);
			Class11_Sub45_Sub14.method3642((byte) 75);
			Class11_Sub45_Sub5.method3434(true);
			Class11_Sub8.method2339(-112);
			Class309.method1893(0);
			Class242.method1527((byte) 100);
			OutputStream_Sub1.method2485(96);
			InputStream_Sub2.method2816(-113);
			Class87.method616((byte) -113);
			Class11_Sub5.method2311(-122);
			Class11_Sub4.method2310(31356);
			Class11_Sub45_Sub7.method3449((byte) 108);
			Class271.method1697(8);
			Class58_Sub2_Sub2.method3858(8);
			Class58_Sub1_Sub1.method3585(-15522);
			Class144.method904(-5949);
			Class373.method2196((byte) -53);
			Class266.method1684(0);
			Class356.method2127((byte) 75);
			Class345.method2088(-103);
			Class256.method1638(123);
			Class256_Sub3.method3198(-77);
			Class256_Sub1.method2341((byte) 120);
			Class58_Sub2_Sub1.method3611((byte) -114);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.K(" + i + ')');
		}
	}

	private final void method4020(int i) {
		do {
			try {
				anInt10528++;
				if (Class197.anInt2666 < ((Class187) Class52.aClass187_810).anInt2405) {
					Class275.aClass46_3705.method409(83);
					Class61.anInt902 = 5 * (-1 + (((Class187) Class52.aClass187_810).anInt2405)) * 50;
					if ((Class61.anInt902 ^ 0xffffffff) < -3001)
						Class61.anInt902 = 3000;
					if (((Class187) Class52.aClass187_810).anInt2405 >= 2
							&& ((Class187) Class52.aClass187_810).anInt2407 == 6) {
						this.method3988("js5connect_outofdate", -104);
						Class285.anInt3846 = 14;
						break;
					}
					if ((((Class187) Class52.aClass187_810).anInt2405 ^ 0xffffffff) <= -5
							&& (((Class187) Class52.aClass187_810).anInt2407 ^ 0xffffffff) == 0) {
						this.method3988("js5crc", -114);
						Class285.anInt3846 = 14;
						break;
					}
					if (((Class187) Class52.aClass187_810).anInt2405 >= 4
							&& Class93.method627(-97, Class285.anInt3846)) {
						if (((Class187) Class52.aClass187_810).anInt2407 != 7
								&& (((Class187) Class52.aClass187_810).anInt2407 != 9)) {
							if ((((Class187) Class52.aClass187_810).anInt2407 ^ 0xffffffff) < -1) {
								if (Class325.aString4327 == null)
									this.method3988("js5connect", -101);
								else
									this.method3988(
											("js5proxy_" + Class325.aString4327
													.trim()), i - 1108);
							} else
								this.method3988("js5io", -115);
						} else
							this.method3988("js5connect_full", -118);
						Class285.anInt3846 = 14;
						break;
					}
				}
				Class197.anInt2666 = ((Class187) Class52.aClass187_810).anInt2405;
				if ((Class61.anInt902 ^ 0xffffffff) < -1)
					Class61.anInt902--;
				else {
					try {
						if ((Class199.anInt2701 ^ 0xffffffff) == -1) {
							Class198.aClass368_2675 = (Class275.aClass46_3705
									.method406(Class108_Sub21.aClass341_7304,
											(byte) -95));
							Class199.anInt2701++;
						}
						if (Class199.anInt2701 == 1) {
							if (Class198.aClass368_2675.anInt4837 == 2) {
								if (Class198.aClass368_2675.anObject4838 != null)
									Class325.aString4327 = (String) (Class198.aClass368_2675.anObject4838);
								method4019(1000, 82);
								break;
							}
							if (Class198.aClass368_2675.anInt4837 == 1)
								Class199.anInt2701++;
						}
						if (i != 1001)
							anInt10529 = 119;
						if (Class199.anInt2701 == 2) {
							Class230.aClass126_3154 = new Class126(
									(Socket) (Class198.aClass368_2675.anObject4838),
									Class108_Sub21.aClass341_7304, 25000);
							Stream stream = new Stream(5);
							stream.writeByte(
									(((Class289) Class11_Sub37.aClass289_7091).opcode),
									-1528071456);
							stream.writeInt(-49, 633);
							Class230.aClass126_3154.method823(5, 0,
									((Stream) stream).buffer, (byte) 121);
							Class199.anInt2701++;
							Class304.aLong4092 = Class137.method878((byte) -47);
						}
						if ((Class199.anInt2701 ^ 0xffffffff) == -4) {
							if (Class93.method627(-101, Class285.anInt3846)
									|| (Class230.aClass126_3154.method820(-108) > 0)) {
								int i_116_ = Class230.aClass126_3154
										.method818(50);
								if (i_116_ != 0) {
									method4019(i_116_, -124);
									break;
								}
								Class199.anInt2701++;
							} else if (((-Class304.aLong4092 + Class137
									.method878((byte) -83)) ^ 0xffffffffffffffffL) < -30001L) {
								method4019(1001, 117);
								break;
							}
						}
						if ((Class199.anInt2701 ^ 0xffffffff) != -5)
							break;
						boolean bool = (Class93.method627(-98,
								Class285.anInt3846)
								|| Class108_Sub2.method2268(Class285.anInt3846,
										(byte) 126) || Class221.method1416(
								Class285.anInt3846, -8714));
						Class259[] class259s = Class259.method1656(false);
						Stream stream = new Stream(4 * class259s.length);
						Class230.aClass126_3154.method824(
								((Stream) stream).buffer.length,
								((Stream) stream).buffer, -120, 0);
						for (int i_117_ = 0; i_117_ < class259s.length; i_117_++)
							class259s[i_117_].method1658(
									stream.readInt(i - 897), true);
						Class52.aClass187_810.method1221(
								(Class230.aClass126_3154), !bool, i - 26905);
						Class198.aClass368_2675 = null;
						Class199.anInt2701 = 0;
						Class230.aClass126_3154 = null;
					} catch (java.io.IOException ioexception) {
						method4019(1002, -103);
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				runtimeexception.printStackTrace();
				throw Class205.method1298(runtimeexception, "client.R(" + i
						+ ')');
			}
		} while (false);
	}

	final void method3995(int i) {
		try {
			if (Class147.aBool1992)
				Class177.anInt2245 = 64;
			anInt10523++;
			Frame frame = new Frame("Jagex");
			frame.pack();
			frame.dispose();
			Class33_Sub3.method2919((byte) -125);
			Class89.aClass82_1221 = new Class82(Class108_Sub21.aClass341_7304);
			Class52.aClass187_810 = new Class187();
			Class11_Sub51.method3232(19035, new int[] { 20, 260 }, new int[] {
					1000, 100 });
			if (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711)
				Class91_Sub3_Sub1.aByteArrayArray9337 = new byte[50][];
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847 = Class282
					.method1741(-115);
			if (Class362.aClass347_4711 == Class11_Sub2_Sub24.aClass347_9284)
				((Class46) Class181.aClass46_2337).aString733 = this
						.getCodeBase().getHost();
			else if (Class376_Sub7_Sub4.method3763(
					Class11_Sub2_Sub24.aClass347_9284, 70)) {
				((Class46) Class181.aClass46_2337).aString733 = this
						.getCodeBase().getHost();
				((Class46) Class181.aClass46_2337).anInt720 = 40000 - -((Class46) Class181.aClass46_2337).anInt730;
				((Class46) Class108_Sub23.aClass46_7759).anInt720 = (((Class46) Class108_Sub23.aClass46_7759).anInt730 + 40000);
				((Class46) Class2_Sub8.aClass46_6867).anInt720 = 40000 - -((Class46) Class2_Sub8.aClass46_6867).anInt730;
				((Class46) Class181.aClass46_2337).anInt726 = ((Class46) Class181.aClass46_2337).anInt730 + 50000;
				((Class46) Class108_Sub23.aClass46_7759).anInt726 = (((Class46) Class108_Sub23.aClass46_7759).anInt730 + 50000);
				((Class46) Class2_Sub8.aClass46_6867).anInt726 = ((Class46) Class2_Sub8.aClass46_6867).anInt730 + 50000;
			} else if (Class11_Sub30_Sub1.aClass347_8979 == Class11_Sub2_Sub24.aClass347_9284) {
				((Class46) Class181.aClass46_2337).aString733 = "127.0.0.1";
				((Class46) Class108_Sub23.aClass46_7759).aString733 = "127.0.0.1";
				((Class46) Class2_Sub8.aClass46_6867).aString733 = "127.0.0.1";
				((Class46) Class181.aClass46_2337).anInt720 = ((Class46) Class181.aClass46_2337).anInt730 + 40000;
				((Class46) Class108_Sub23.aClass46_7759).anInt720 = (40000 + ((Class46) Class108_Sub23.aClass46_7759).anInt730);
				((Class46) Class181.aClass46_2337).anInt726 = 50000 - -((Class46) Class181.aClass46_2337).anInt730;
				((Class46) Class2_Sub8.aClass46_6867).anInt720 = 40000 - -((Class46) Class2_Sub8.aClass46_6867).anInt730;
				((Class46) Class108_Sub23.aClass46_7759).anInt726 = (50000 + ((Class46) Class108_Sub23.aClass46_7759).anInt730);
				((Class46) Class2_Sub8.aClass46_6867).anInt726 = 50000 - -((Class46) Class2_Sub8.aClass46_6867).anInt730;
			}
			if (ISAAC.aClass66_263 != Class198.aClass66_2679) {
				if (Class198.aClass66_2679 != Class299.aClass66_4035) {
					Class34.aShortArrayArrayArray463 = Class234.aShortArrayArrayArray3209;
					Class11_Sub46.aShortArrayArray7982 = Class54.aShortArrayArray818;
				} else {
					Class11_Sub46.aShortArrayArray7982 = Class240.aShortArrayArray3258;
					Class34.aShortArrayArrayArray463 = Class287.aShortArrayArrayArray3891;
				}
			} else {
				Class253_Sub1.anInt5855 = 0;
				Class11_Sub46.aShortArrayArray7982 = Class204.aShortArrayArray2750;
				Class106.anInt1434 = 16777215;
				Class11_Sub45_Sub3.aBool8529 = true;
				Class34.aShortArrayArrayArray463 = Class103.aShortArrayArrayArray1382;
			}
			if (Class198.aClass66_2679 == Class142.aClass66_1925)
				Class108_Sub28.aBool7901 = false;
			Class114.aShortArray1566 = Class266.aShortArray3620 = Class176.aShortArray2237 = Class11_Sub28.aShortArray6587 = new short[256];
			Class275.aClass46_3705 = Class181.aClass46_2337;
			if (i != 0)
				method4023(-54);
			try {
				Class108_Sub20.aClipboard7231 = Class11_Sub2_Sub23.aclient9263
						.getToolkit().getSystemClipboard();
			} catch (Exception exception) {
				/* empty */
			}
			Class11_Sub2_Sub19.aClass1_9098 = Class292.method1807(
					Class11_Sub45_Sub13.aCanvas9308, 13764);
			Class280.aClass225_3786 = Class327.method1982(-2451, true,
					Class11_Sub45_Sub13.aCanvas9308);
			try {
				if (((Class341) Class108_Sub21.aClass341_7304).aClass119_4518 != null) {
					Class77.aClass182_1046 = new Class182(
							(((Class341) Class108_Sub21.aClass341_7304).aClass119_4518),
							5200, 0);
					for (int i_118_ = 0; (i_118_ ^ 0xffffffff) > -38; i_118_++)
						Class206_Sub2.aClass182Array6440[i_118_] = new Class182(
								(((Class341) Class108_Sub21.aClass341_7304).aClass119Array4510[i_118_]),
								6000, 0);
					Class256.aClass182_3508 = new Class182(
							(((Class341) Class108_Sub21.aClass341_7304).aClass119_4511),
							6000, 0);
					Class4.aClass243_24 = new Class243(255,
							Class77.aClass182_1046, Class256.aClass182_3508,
							500000);
					Class11_Sub30_Sub1.aClass182_8980 = new Class182(
							(((Class341) Class108_Sub21.aClass341_7304).aClass119_4527),
							24, 0);
					((Class341) Class108_Sub21.aClass341_7304).aClass119_4527 = null;
					((Class341) Class108_Sub21.aClass341_7304).aClass119_4511 = null;
					((Class341) Class108_Sub21.aClass341_7304).aClass119Array4510 = null;
					((Class341) Class108_Sub21.aClass341_7304).aClass119_4518 = null;
				}
			} catch (java.io.IOException ioexception) {
				Class256.aClass182_3508 = null;
				Class11_Sub30_Sub1.aClass182_8980 = null;
				Class4.aClass243_24 = null;
				Class77.aClass182_1046 = null;
			}
			if (Class362.aClass347_4711 != Class11_Sub2_Sub24.aClass347_9284)
				Class107.aBool1454 = true;
			RuntimeException_Sub1.aString9965 = Class26.aClass26_288.method217(
					(byte) 113, (Class11_Sub45_Sub1_Sub2.anInt9884));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.J(" + i + ')');
		}
	}

	private final void method4021(byte i) {
		try {
			anInt10519++;
			if ((Class285.anInt3846 ^ 0xffffffff) != -15) {
				if (i <= 19)
					method4001((byte) -81);
				Class11_Sub25.anInt6279++;
				if ((Class11_Sub25.anInt6279 % 1000 ^ 0xffffffff) == -2) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class205.anInt2758 = (600 * gregoriancalendar.get(11)
							- -(gregoriancalendar.get(12) * 10) + gregoriancalendar
							.get(13) / 6);
					Class254.aRandom3482.setSeed((long) Class205.anInt2758);
				}
				if (Class11_Sub25.anInt6279 % 50 == 0) {
					Class266.anInt3623 = Class108_Sub3.anInt5328;
					Class108_Sub3.anInt5328 = 0;
					Class228.anInt3147 = Class236_Sub8.anInt7064;
					Class236_Sub8.anInt7064 = 0;
				}
				method4023(119);
				if (Class321_Sub4.aClass231_8007 != null)
					Class321_Sub4.aClass231_8007.method1482((byte) 64);
				Class349.method2099(false);
				Stream.method2510(-14392);
				Class11_Sub2_Sub19.aClass1_9098.method65((byte) -30);
				Class280.aClass225_3786.method1439(0);
				if (Class321_Sub2.aClass163_6648 != null)
					Class321_Sub2.aClass163_6648.method1021((int) Class137
							.method878((byte) -45));
				Class41.method368(90);
				Class304.anInt4091 = 0;
				Class11_Sub26.anInt6301 = 0;

				for (Interface25 interface25 = Class11_Sub2_Sub19.aClass1_9098
						.method63((byte) 98); interface25 != null; interface25 = Class11_Sub2_Sub19.aClass1_9098
						.method63((byte) 90)) {
					int i_119_ = interface25.method57(-31285);
					if (i_119_ != 2 && (i_119_ ^ 0xffffffff) != -4) {
						if ((i_119_ ^ 0xffffffff) == -1
								&& (Class304.anInt4091 ^ 0xffffffff) > -76) {
							Class316.anInterface25Array4188[Class304.anInt4091] = interface25;
							Class304.anInt4091++;
						}
					} else {
						int i_120_ = interface25.method56(4152);
						if (!Class79.method542(-2)
								|| ((i_120_ ^ 0xffffffff) != -97
										&& i_120_ != 167 && (i_120_ ^ 0xffffffff) != -179)) {
							if (Class11_Sub26.anInt6301 < 128) {
								Class289.anInterface25Array3900[(Class11_Sub26.anInt6301)] = interface25;
								Class11_Sub26.anInt6301++;
							}
						} else if (!Class337.method2023(false))
							Exception_Sub1.method3737(12887);
						else
							Class297.method1847(-12560);
					}
				}
				Class154.anInt2032 = 0;
				for (Class11_Sub23 class11_sub23 = Class280.aClass225_3786
						.method1445(-3); class11_sub23 != null; class11_sub23 = Class280.aClass225_3786
						.method1445(-3)) {

					int i_121_ = class11_sub23.method2570(0);
					if ((i_121_ ^ 0xffffffff) != 0) {
						if (i_121_ == 6) {
							Class154.anInt2032 += class11_sub23.method2571(-5);
							// gameZoom
						} else if (Class105.method696((byte) 118, i_121_)) {
							Class108_Sub13.aClass84_6264.method589((byte) -13,
									class11_sub23);
							if ((Class108_Sub13.aClass84_6264.method583(100) ^ 0xffffffff) < -11)
								Class108_Sub13.aClass84_6264
										.method581((byte) -16);
						}
					} else
						Class11_Sub45_Sub6.aClass84_8782.method589((byte) -13,
								class11_sub23);
				}
				if (Class337.method2023(false))
					Class11_Sub45_Sub20.method3834(99);
				if (Class93.method627(-98, Class285.anInt3846)) {
					Class363.method2154((byte) 125);
					Class250.method1595((byte) 85);
				} else if (Class11_Sub49.method3225(Class285.anInt3846,
						(byte) -94))
					Class228.method1468(-52);
				if (Class108_Sub2.method2268(Class285.anInt3846, (byte) 126)
						&& !Class11_Sub49.method3225(Class285.anInt3846,
								(byte) -99)) {
					method4018((byte) -71);
					Class6.method89((byte) -21);
					Class71.processLogin((byte) 126);
				} else if (!Class221.method1416(Class285.anInt3846, -8714)
						|| Class11_Sub49.method3225(Class285.anInt3846,
								(byte) -85)) {
					if ((Class285.anInt3846 ^ 0xffffffff) == -13)
						Class71.processLogin((byte) 126);
					else if (Class2_Sub5.method2400((byte) 35,
							Class285.anInt3846)
							&& !Class11_Sub49.method3225(Class285.anInt3846,
									(byte) -88))
						Class58.method462(false);
					else if (Class285.anInt3846 == 13) {
						Class71.processLogin((byte) 123);
						if (Class115.anInt1567 != -3
								&& (Class115.anInt1567 ^ 0xffffffff) != -3
								&& (Class115.anInt1567 ^ 0xffffffff) != -16)
							InputStream_Sub2.method2814(false, -25626);
					}
				} else {
					method4018((byte) -71);
					Class71.processLogin((byte) 117);
				}
				Class376_Sub7_Sub2_Sub2.method3944(
						Class321_Sub2.aClass163_6648, 18975);
				Class108_Sub13.aClass84_6264.method581((byte) -16);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.N(" + i + ')');
		}
	}

	static final void method4022() {
		Class261.anInt3588 = 0;
		for (int i = 0; i < Class23.anInt249; i++) {
			Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
					.method1369((byte) 26,
							(long) Class11_Sub52.anIntArray8054[i]))).aNpc_2373);
			if ((((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)
					&& class376_sub7_sub5_sub5_sub2.method3955((byte) 72) != -1) {
				int i_122_ = ((class376_sub7_sub5_sub5_sub2
						.method3968((byte) 127) - 1) * 256 + 252);
				int i_123_ = (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 - i_122_) >> 9;
				int i_124_ = (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 - i_122_) >> 9;
				Actor class376_sub7_sub5_sub5 = (Class376_Sub1_Sub1
						.method3409(
								4,
								i_124_,
								(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).aByte7047),
								i_123_));
				if (class376_sub7_sub5_sub5 != null) {
					int i_125_ = (((Actor) class376_sub7_sub5_sub5).anInt10319);
					if (class376_sub7_sub5_sub5 instanceof Npc)
						i_125_ += 2048;
					if ((((Actor) class376_sub7_sub5_sub5).anInt10277) == 0
							&& (class376_sub7_sub5_sub5.method3955((byte) 72) != -1)) {
						Class11_Sub46_Sub1.anIntArray8834[Class261.anInt3588] = i_125_;
						Class234_Sub2_Sub1.anIntArray8448[Class261.anInt3588] = i_125_;
						Class261.anInt3588++;
						((Actor) class376_sub7_sub5_sub5).anInt10277++;
					}
					Class11_Sub46_Sub1.anIntArray8834[Class261.anInt3588] = i_125_;
					Class234_Sub2_Sub1.anIntArray8448[Class261.anInt3588] = ((Actor) class376_sub7_sub5_sub5_sub2).anInt10319 + 2048;
					Class261.anInt3588++;
					((Actor) class376_sub7_sub5_sub5).anInt10277++;
				}
			}
		}
		Class217.method1394(true, Class11_Sub46_Sub1.anIntArray8834, 0,
				Class234_Sub2_Sub1.anIntArray8448, Class261.anInt3588 - 1);
	}

	public static final void main(String[] strings) {
		try {
			try {
				if (strings.length != 6)
					Class256_Sub1.method2342(true, "Argument count");
				Class181.aClass46_2337 = new Class46();
				((Class46) Class181.aClass46_2337).anInt730 = Integer
						.parseInt(strings[0]);
				Class108_Sub23.aClass46_7759 = new Class46();
				((Class46) Class108_Sub23.aClass46_7759).anInt730 = Integer
						.parseInt(strings[1]);
				Class2_Sub8.aClass46_6867 = new Class46();
				((Class46) Class2_Sub8.aClass46_6867).anInt730 = Integer
						.parseInt(strings[2]);
				Class11_Sub2_Sub24.aClass347_9284 = Class11_Sub30_Sub1.aClass347_8979;
				if (strings[3].equals("live"))
					Class331.aClass307_4403 = Class350.aClass307_4608;
				else if (strings[3].equals("rc"))
					Class331.aClass307_4403 = Class376_Sub7.aClass307_7038;
				else if (strings[3].equals("wip"))
					Class331.aClass307_4403 = Class316.aClass307_4181;
				else
					Class256_Sub1.method2342(true, "modewhat");
				Class11_Sub45_Sub1_Sub2.anInt9884 = Class108_Sub23.method3128(
						strings[4], 1);
				if (Class11_Sub45_Sub1_Sub2.anInt9884 == -1) {
					if (!strings[4].equals("english")) {
						if (!strings[4].equals("german"))
							Class256_Sub1.method2342(true, "language");
						else
							Class11_Sub45_Sub1_Sub2.anInt9884 = 1;
					} else
						Class11_Sub45_Sub1_Sub2.anInt9884 = 0;
				}
				Class376_Sub5.aBool6919 = false;
				Class11_Sub52.aBool8053 = false;
				if (strings[5].equals("game0"))
					Class198.aClass66_2679 = Class142.aClass66_1925;
				else if (!strings[5].equals("game1")) {
					if (!strings[5].equals("game2")) {
						if (!strings[5].equals("game3"))
							Class256_Sub1.method2342(true, "game");
						else
							Class198.aClass66_2679 = Class299.aClass66_4035;
					} else
						Class198.aClass66_2679 = Class144.aClass66_1934;
				} else
					Class198.aClass66_2679 = ISAAC.aClass66_263;
				Class118.aLong1607 = 0L;
				Class240.aBool3259 = Class51.aBool795 = true;
				Class286.aString3874 = null;
				Class254_Sub3.anInt8047 = 0;
				Class372.anInt4875 = 0;
				Class53.anInt817 = 0;
				Class33_Sub1.anInt6178 = ((Class66) Class198.aClass66_2679).anInt945;
				Class11_Sub2_Sub5.aString8552 = "";
				Class11_Sub2_Sub1.aString8438 = null;
				Class147.aBool1992 = false;
				Class91_Sub1.aBool6936 = false;
				client var_client = new client();
				Class11_Sub2_Sub23.aclient9263 = var_client;
				var_client
						.writeInt(633, 0, 768,
								((Class66) Class198.aClass66_2679).aString944,
								false,
								Class331.aClass307_4403.method1883(-107) + 32,
								1024, 37);
				Class376_Sub5.aFrame6918.setLocation(40, 40);
			} catch (Exception exception) {
				Class11_Sub12_Sub3.method3602((byte) -115, null, exception);
			}
			anInt10515++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("client.main("
					+ (strings != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3987(boolean bool) {
		try {
			anInt10517++;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(bool) != 2)
				method4021((byte) 70);
			else {
				try {
					method4021((byte) 72);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class11_Sub12_Sub3
							.method3602((byte) -59, (throwable.getMessage()
									+ " (Recovered) " + method3985(!bool)),
									throwable);
					Class220.aBool3024 = true;
					Class239.method1521(false, 0, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "client.A(" + bool
					+ ')');
		}
	}

	private final void method4023(int i) {
		do {
			try {
				anInt10524++;
				if (i <= 91)
					aClass370_10513 = null;
				boolean bool = Class52.aClass187_810.method1216(-125);
				if (bool)
					break;
				method4020(1001);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "client.C(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	private final void method4024(byte i) {
		do {
			try {
				anInt10525++;
				if ((Class285.anInt3846 ^ 0xffffffff) != -15) {
					long l = (Class108_Sub14.method2656((byte) 84) / 1000000L - Class236_Sub9.aLong7733);
					Class236_Sub9.aLong7733 = Class108_Sub14
							.method2656((byte) 84) / 1000000L;
					if (i < 74)
						method4013(null);
					boolean bool = Class236_Sub2.method2641(-22595);
					if (bool && Class376_Sub7.aBool7049
							&& Class254.aClass37_3498 != null)
						Class254.aClass37_3498.method316(12107);
					if (Class323.method1972(Class285.anInt3846, (byte) 121)) {
						if (Class11_Sub12_Sub1.aLong8825 != 0L
								&& ((Class11_Sub12_Sub1.aLong8825 ^ 0xffffffffffffffffL) > (Class137
										.method878((byte) -117) ^ 0xffffffffffffffffL)))
							Class113.method756(3, false,
									Class187.method1227((byte) 54),
									Class362.anInt4718, Class2_Sub1.anInt5064);
						else if (!Class321_Sub2.aClass163_6648.method1069()
								&& Class332.aBool4409)
							Class11_Sub37.method2886((byte) -28);
					}
					if (Class355.aFrame4658 == null) {
						java.awt.Container container;
						if (Class376_Sub5.aFrame6918 == null) {
							if (Class108_Sub16.anApplet6538 != null)
								container = Class108_Sub16.anApplet6538;
							else
								container = Class112.anApplet_Sub1_1542;
						} else
							container = Class376_Sub5.aFrame6918;
						int i_126_ = container.getSize().width;
						int i_127_ = container.getSize().height;
						if (Class376_Sub5.aFrame6918 == container) {
							Insets insets = Class376_Sub5.aFrame6918
									.getInsets();
							i_127_ -= insets.bottom + insets.top;
							i_126_ -= insets.right + insets.left;
						}
						if (i_126_ != Class11_Sub45_Sub18.anInt9531
								|| ((Class231.anInt3160 ^ 0xffffffff) != (i_127_ ^ 0xffffffff))
								|| Class295.aBool3989) {
							if (Class321_Sub2.aClass163_6648 != null
									&& !Class321_Sub2.aClass163_6648
											.method1047()) {
								Class11_Sub45_Sub18.anInt9531 = i_126_;
								Class231.anInt3160 = i_127_;
							} else
								Class33_Sub3.method2919((byte) -126);
							Class11_Sub12_Sub1.aLong8825 = Class137
									.method878((byte) -86) + 500L;
							Class295.aBool3989 = false;
						}
					}
					if (Class355.aFrame4658 != null
							&& !Class11_Sub12_Sub4.aBool9452
							&& Class323.method1972(Class285.anInt3846,
									(byte) -26))
						Class113.method756(
								3,
								false,
								((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
										.method2654(false), -1, -1);
					boolean bool_128_ = false;
					if (Class108_Sub21.aBool7302) {
						bool_128_ = true;
						Class108_Sub21.aBool7302 = false;
					}
					if (bool_128_)
						Class324.method1974((byte) 47);
					if ((Class321_Sub2.aClass163_6648 != null && Class321_Sub2.aClass163_6648
							.method1069())
							|| Class187.method1227((byte) 54) != 1)
						Class307.method1879(-101);
					if (Class93.method627(-119, Class285.anInt3846))
						Class11_Sub29.method2723(bool_128_, -110);
					else if (Class113.method757(Class285.anInt3846, -6))
						Class11_Sub2_Sub25.method3645(-84);
					else if (!Class29.method253(Class285.anInt3846, 109)) {
						if (!Class11_Sub49.method3225(Class285.anInt3846,
								(byte) -94)) {
							if (Class285.anInt3846 != 10) {
								if (Class285.anInt3846 == 13)
									Class11_Sub2_Sub8
											.method3433(
													Class161.aClass292_2096,
													((Class26.aClass26_290
															.method217(
																	(byte) 103,
																	Class11_Sub45_Sub1_Sub2.anInt9884))
															+ "<br>" + (Class26.aClass26_291
															.method217(
																	(byte) 109,
																	(Class11_Sub45_Sub1_Sub2.anInt9884)))),
													false,
													106,
													OutputStream_Sub2.aClass107_7949,
													Class321_Sub2.aClass163_6648);
							} else
								Class207.method1338(l, (byte) 87);
						} else if (Class253_Sub1.anInt5868 == 1) {
							if (Class373.anInt4883 < Class335.anInt4439)
								Class373.anInt4883 = Class335.anInt4439;
							int i_129_ = ((-Class335.anInt4439 + Class373.anInt4883) * 50 / Class373.anInt4883);
							Class11_Sub2_Sub8.method3433(
									Class161.aClass292_2096,
									((Class26.aClass26_288.method217((byte) 93,
											Class11_Sub45_Sub1_Sub2.anInt9884))
											+ "<br>(" + i_129_ + "%)"), true,
									116, OutputStream_Sub2.aClass107_7949,
									Class321_Sub2.aClass163_6648);
						} else if (Class253_Sub1.anInt5868 == 2) {
							if ((Class249.anInt3442 ^ 0xffffffff) > (Class7.anInt45 ^ 0xffffffff))
								Class249.anInt3442 = Class7.anInt45;
							int i_130_ = ((50 * (Class249.anInt3442 - Class7.anInt45) / Class249.anInt3442) + 50);
							Class11_Sub2_Sub8.method3433(
									Class161.aClass292_2096,
									((Class26.aClass26_288.method217(
											(byte) 120,
											Class11_Sub45_Sub1_Sub2.anInt9884))
											+ "<br>(" + i_130_ + "%)"), true,
									-101, OutputStream_Sub2.aClass107_7949,
									Class321_Sub2.aClass163_6648);
						} else
							Class11_Sub2_Sub8
									.method3433(
											Class161.aClass292_2096,
											(Class26.aClass26_288
													.method217(
															(byte) 100,
															Class11_Sub45_Sub1_Sub2.anInt9884)),
											true, 106,
											OutputStream_Sub2.aClass107_7949,
											Class321_Sub2.aClass163_6648);
					} else
						Class11_Sub2_Sub25.method3645(-86);
					if ((Class11_Sub2_Sub31.anInt9640 ^ 0xffffffff) == -4) {
						for (int i_131_ = 0; ((Class11_Sub2_Sub6.anInt8702 ^ 0xffffffff) < (i_131_ ^ 0xffffffff)); i_131_++) {
							Rectangle rectangle = Class93.aRectangleArray1249[i_131_];
							if (Class363.aBoolArray4732[i_131_])
								Class321_Sub2.aClass163_6648.method1018(
										rectangle.y, -65281, rectangle.height,
										rectangle.width, 124, rectangle.x);
							else if (Class254.aBoolArray3493[i_131_])
								Class321_Sub2.aClass163_6648.method1018(
										rectangle.y, -65536, rectangle.height,
										rectangle.width, 97, rectangle.x);
							else
								Class321_Sub2.aClass163_6648.method1018(
										rectangle.y, -16711936,
										rectangle.height, rectangle.width, 101,
										rectangle.x);
						}
					}
					if (Class337.method2023(false))
						Class207.method1336(1599052696,
								Class321_Sub2.aClass163_6648);
					if (!((Class341) Class108_Sub21.aClass341_7304).aBool4502
							|| !Class323.method1972(Class285.anInt3846,
									(byte) 115)
							|| Class11_Sub2_Sub31.anInt9640 != 0
							|| Class187.method1227((byte) 54) != 1 || bool_128_) {
						if (!Class93.method627(-128, Class285.anInt3846)) {
							for (int i_132_ = 0; Class11_Sub2_Sub6.anInt8702 > i_132_; i_132_++)
								Class254.aBoolArray3493[i_132_] = false;
							try {
								if (Class11_Sub2_Sub19.aBool9087)
									Class204.method1295((byte) 102);
								else
									Class321_Sub2.aClass163_6648.method1056(0);
							} catch (Exception_Sub1 exception_sub1) {
								Class11_Sub12_Sub3
										.method3602(
												(byte) -90,
												(exception_sub1.getMessage()
														+ " (Recovered) " + method3985(true)),
												exception_sub1);
								Class239.method1521(false, 0, 0);
							}
						}
					} else {
						int i_133_ = 0;
						for (int i_134_ = 0; i_134_ < Class11_Sub2_Sub6.anInt8702; i_134_++) {
							if (Class254.aBoolArray3493[i_134_]) {
								Class254.aBoolArray3493[i_134_] = false;
								Class11_Sub45_Sub13.aRectangleArray9307[i_133_++] = Class93.aRectangleArray1249[i_134_];
							}
						}
						try {
							if (!Class11_Sub2_Sub19.aBool9087)
								Class321_Sub2.aClass163_6648
										.method1012(
												Class11_Sub45_Sub13.aRectangleArray9307,
												14629, i_133_);
							else
								Class11_Sub2_Sub7
										.method3428(
												Class11_Sub45_Sub13.aRectangleArray9307,
												i_133_, (byte) -66);
						} catch (Exception_Sub1 exception_sub1) {
							/* empty */
						}
					}
					Class236_Sub4.method2769(-43);
					int i_135_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub1_5715
							.method2250(false);
					if (i_135_ != 0) {
						if (i_135_ != 1) {
							if (i_135_ != 2) {
								if (i_135_ == 3)
									Class11_Sub51.method3236(2L, 0);
							} else
								Class11_Sub51.method3236(5L, 0);
						} else
							Class11_Sub51.method3236(10L, 0);
					} else
						Class11_Sub51.method3236(15L, 0);
					if (Class47.aBool747)
						Class4.method82(-81);
					if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub12_5708
							.method2642(false) ^ 0xffffffff) != -2
							|| (Class285.anInt3846 ^ 0xffffffff) != -4
							|| (Class365.anInt4797 ^ 0xffffffff) == 0)
						break;
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub12_5708));
					Class186.method1212(10343);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "client.U(" + i
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method4025() {
		int i = Class190.anInt2446;
		int[] is = Class6.anIntArray40;
		int i_136_ = Class1.aBool1 ? i : i + Class23.anInt249;
		for (int i_137_ = 0; i_137_ < i_136_; i_137_++) {
			Actor class376_sub7_sub5_sub5;
			if (i_137_ < i)
				class376_sub7_sub5_sub5 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_137_]]);
			else
				class376_sub7_sub5_sub5 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26,
								(long) Class11_Sub52.anIntArray8054[i_137_ - i]))).aNpc_2373);
			if (((Actor) class376_sub7_sub5_sub5).anInt10346 >= 0) {
				int i_138_ = class376_sub7_sub5_sub5.method3968((byte) 127);
				if ((i_138_ & 0x1) == 0) {
					if ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 & 0x1ff) == 0
							&& (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 & 0x1ff) == 0)
						continue;
				} else if ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 & 0x1ff) == 256
						&& ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) & 0x1ff) == 256)
					continue;
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7036 = (Class318
						.method1931(
								109,
								((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031,
								((Class376_Sub7) class376_sub7_sub5_sub5).aByte7047,
								((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045));
				Class98.method661(class376_sub7_sub5_sub5, true);
			}
		}
	}

	static final void method4026() {
		int i = Class190.anInt2446;
		int[] is = Class6.anIntArray40;
		int i_139_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686
				.method2809(false);
		boolean bool = i_139_ == 1 && i > 200 || i_139_ == 0 && i > 50;
		for (int i_140_ = 0; i_140_ < i; i_140_++) {
			Player class376_sub7_sub5_sub5_sub1 = Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_140_]];
			if (!class376_sub7_sub5_sub5_sub1.method3975(92160000))
				((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 = -1;
			else if (((Player) class376_sub7_sub5_sub5_sub1).aBool10382)
				((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 = -1;
			else {
				class376_sub7_sub5_sub5_sub1.method3797(true);
				if ((((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub1).aShort9626) < 0
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub1).aShort9629) < 0
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub1).aShort9624) >= Class300.anInt4051
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub1).aShort9620) >= Class108_Sub12.anInt6228)
					((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 = -1;
				else {
					((Player) class376_sub7_sub5_sub5_sub1).aBool10381 = (((Actor) class376_sub7_sub5_sub5_sub1).aBool10329 ? bool
							: false);
					if (class376_sub7_sub5_sub5_sub1 == (Class11_Sub2_Sub8.myPlayer))
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 = 2147483647;
					else {
						int i_141_ = 0;
						if (!((Actor) class376_sub7_sub5_sub5_sub1).aBool10331)
							i_141_++;
						if (((Actor) class376_sub7_sub5_sub5_sub1).anInt10355 > Class11_Sub25.anInt6279)
							i_141_ += 2;
						i_141_ += 5 - class376_sub7_sub5_sub5_sub1
								.method3968((byte) 127) << 2;
						if (((Player) class376_sub7_sub5_sub5_sub1).aBool10420)
							i_141_ += 512;
						else {
							if (Class373.anInt4881 == 0)
								i_141_ += 32;
							else
								i_141_ += 128;
							i_141_ += 256;
						}
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 = i_141_ + 1;
					}
				}
			}
		}
		for (int i_142_ = 0; i_142_ < Class23.anInt249; i_142_++) {
			Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) (Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
					.method1369((byte) 26,
							(long) Class11_Sub52.anIntArray8054[i_142_]))).aNpc_2373);
			if (!class376_sub7_sub5_sub5_sub2.method4007(92160000)
					|| !((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501
							.method1383(0, Class11_Sub26.aClass97_6296))
				((Actor) class376_sub7_sub5_sub5_sub2).anInt10346 = -1;
			else {
				class376_sub7_sub5_sub5_sub2.method3797(true);
				if ((((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub2).aShort9626) < 0
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub2).aShort9629) < 0
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub2).aShort9624) >= Class300.anInt4051
						|| (((Class376_Sub7_Sub5) class376_sub7_sub5_sub5_sub2).aShort9620) >= Class108_Sub12.anInt6228)
					((Actor) class376_sub7_sub5_sub5_sub2).anInt10346 = -1;
				else {
					int i_143_ = 0;
					if (!((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)
						i_143_++;
					if (((Actor) class376_sub7_sub5_sub5_sub2).anInt10355 > Class11_Sub25.anInt6279)
						i_143_ += 2;
					i_143_ += 5 - class376_sub7_sub5_sub5_sub2
							.method3968((byte) 127) << 2;
					if (Class373.anInt4881 == 0) {
						if (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aBool2909)
							i_143_ += 64;
						else
							i_143_ += 128;
					} else if (Class373.anInt4881 == 1) {
						if (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aBool2909)
							i_143_ += 32;
						else
							i_143_ += 64;
					}
					if (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aBool2946)
						i_143_ += 1024;
					else if (!((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aBool2954)
						i_143_ += 256;
					((Actor) class376_sub7_sub5_sub5_sub2).anInt10346 = i_143_ + 1;
				}
			}
		}
		for (int i_144_ = 0; i_144_ < IncomingPacket.aClass275Array2082.length; i_144_++) {
			Class275 class275 = IncomingPacket.aClass275Array2082[i_144_];
			if (class275 != null) {
				if (((Class275) class275).anInt3697 == 1) {
					Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
							.method1369((byte) 26,
									(long) ((Class275) class275).anInt3707)));
					if (class11_sub25 != null) {
						Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
						if (((Actor) class376_sub7_sub5_sub5_sub2).anInt10346 >= 0)
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10346 += 2048;
					}
				} else if (((Class275) class275).anInt3697 == 10) {
					Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[((Class275) class275).anInt3707]);
					if (class376_sub7_sub5_sub5_sub1 != null
							&& (class376_sub7_sub5_sub5_sub1 != (Class11_Sub2_Sub8.myPlayer))
							&& ((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 >= 0)
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10346 += 2048;
				}
			}
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
