/* Class11_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub49 extends Class11 {
	static Class146 aClass146_8012;
	static int anInt8013;
	static int anInt8014;
	static int anInt8015;
	String aString8016;
	static short aShort8017 = 1;
	static int anInt8018;
	static Class9 aClass9_8019 = new Class9(4, 1);

	static final void method3221(boolean bool, int i) {
		try {
			anInt8018++;
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				Class376_Sub1_Sub1.aClass22_8685.method182(i, (byte) -73);
			}
			synchronized (Class186.aClass22_2379) {
				Class186.aClass22_2379.method182(i, (byte) -73);
			}
			if (bool != true)
				aClass146_8012 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iga.E(" + bool + ','
					+ i + ')');
		}
	}

	public static void method3222(byte i) {
		try {
			if (i != -22)
				aClass9_8019 = null;
			aClass146_8012 = null;
			aClass9_8019 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iga.C(" + i + ')');
		}
	}

	static final String method3223(long l, int i) {
		try {
			anInt8015++;
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if ((l % 37L ^ 0xffffffffffffffffL) == -1L)
				return null;
			int i_0_ = 0;
			long l_1_ = l;
			if (i != -2787)
				return null;
			while ((l_1_ ^ 0xffffffffffffffffL) != -1L) {
				l_1_ /= 37L;
				i_0_++;
			}
			StringBuffer stringbuffer = new StringBuffer(i_0_);
			while (l != 0L) {
				long l_2_ = l;
				l /= 37L;
				stringbuffer
						.append(Class227.aCharArray3137[(int) (-(l * 37L) + l_2_)]);
			}
			return stringbuffer.reverse().toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iga.B(" + l + ',' + i
					+ ')');
		}
	}

	static final void method3224(boolean bool, byte i,
			Player class376_sub7_sub5_sub5_sub1) {
		do {
			try {
				anInt8013++;
				if (Class52.anInt802 < 400) {
					if (class376_sub7_sub5_sub5_sub1 == (Class11_Sub2_Sub8.myPlayer)) {
						if (Class204.aBool2739
								&& (Class322.anInt4312 & 0x10) != 0) {
							Class108_Sub22
									.method2963(
											false,
											0,
											-1,
											Class374.aString4890,
											false,
											Class11_Sub2_Sub15.anInt9021,
											true,
											19,
											(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
											0L,
											(Class250.aString3444
													+ " -> <col=ffffff>" + (Class26.aClass26_313
													.method217(
															(byte) 102,
															Class11_Sub45_Sub1_Sub2.anInt9884))),
											0, 0);
							Class331.anInt4394++;
						}
					} else {
						if (i <= 106)
							method3223(94L, 86);
						String string;
						if (((Player) class376_sub7_sub5_sub5_sub1).anInt10385 != 0) {
							if ((((Player) class376_sub7_sub5_sub5_sub1).anInt10385 ^ 0xffffffff) == 0)
								string = class376_sub7_sub5_sub5_sub1
										.method3981(-91, true);
							else
								string = (class376_sub7_sub5_sub5_sub1
										.method3981(-65, true)
										+ " ("
										+ (Class26.aClass26_305
												.method217(
														(byte) 119,
														Class11_Sub45_Sub1_Sub2.anInt9884))
										+ (((Player) class376_sub7_sub5_sub5_sub1).anInt10385) + ")");
						} else {
							boolean bool_3_ = true;
							if (((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10409) ^ 0xffffffff) != 0
									&& (((Player) class376_sub7_sub5_sub5_sub1).anInt10409 != -1)) {
								int i_4_ = ((((((Player) class376_sub7_sub5_sub5_sub1).anInt10389) ^ 0xffffffff) > ((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389) ^ 0xffffffff)) ? (((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389)
										: (((Player) class376_sub7_sub5_sub5_sub1).anInt10389));
								int i_5_ = ((((((Player) class376_sub7_sub5_sub5_sub1).anInt10409) ^ 0xffffffff) < ((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10409) ^ 0xffffffff)) ? (((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10409)
										: (((Player) class376_sub7_sub5_sub5_sub1).anInt10409));
								int i_6_ = 10 * i_4_ / 100 + (5 + i_5_);
								int i_7_ = (-(((Player) class376_sub7_sub5_sub5_sub1).anInt10389) + (((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389));
								if ((i_7_ ^ 0xffffffff) > -1)
									i_7_ = -i_7_;
								if ((i_7_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
									bool_3_ = false;
							}
							String string_8_ = ((ISAAC.aClass66_263 != Class198.aClass66_2679) ? (Class26.aClass26_304
									.method217((byte) 106,
											Class11_Sub45_Sub1_Sub2.anInt9884))
									: (Class26.aClass26_306.method217(
											(byte) 93,
											Class11_Sub45_Sub1_Sub2.anInt9884)));
							if (((Player) class376_sub7_sub5_sub5_sub1).anInt10389 < ((Player) class376_sub7_sub5_sub5_sub1).anInt10417)
								string = (class376_sub7_sub5_sub5_sub1
										.method3981(-105, true)
										+ (!bool_3_ ? "<col=ffffff>"
												: (Class11_Sub39
														.method2929(
																-29507,
																(((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389),
																(((Player) class376_sub7_sub5_sub5_sub1).anInt10389))))
										+ " ("
										+ string_8_
										+ (((Player) class376_sub7_sub5_sub5_sub1).anInt10389)
										+ "+"
										+ ((((Player) class376_sub7_sub5_sub5_sub1).anInt10417) + -(((Player) class376_sub7_sub5_sub5_sub1).anInt10389)) + ")");
							else
								string = (class376_sub7_sub5_sub5_sub1
										.method3981(-42, true)
										+ (bool_3_ ? (Class11_Sub39
												.method2929(
														-29507,
														(((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389),
														(((Player) class376_sub7_sub5_sub5_sub1).anInt10389)))
												: "<col=ffffff>")
										+ " ("
										+ string_8_
										+ (((Player) class376_sub7_sub5_sub5_sub1).anInt10389) + ")");
						}
						if (Class204.aBool2739 && !bool
								&& (0x8 & Class322.anInt4312) != 0) {
							Class108_Sub22
									.method2963(
											false,
											0,
											-1,
											Class374.aString4890,
											false,
											Class11_Sub2_Sub15.anInt9021,
											true,
											2,
											(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
											(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
											(Class250.aString3444
													+ " -> <col=ffffff>" + string),
											0, 0);
							Class290.anInt3918++;
						}
						if (bool)
							Class108_Sub22
									.method2963(
											true,
											0,
											0,
											"<col=cccccc>" + string,
											false,
											-1,
											false,
											-1,
											(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
											0L, "", 0, 0);
						else {
							for (int i_9_ = 7; (i_9_ ^ 0xffffffff) <= -1; i_9_--) {
								if (Class11_Sub16.aStringArray5675[i_9_] != null) {
									short i_10_ = 0;
									if ((Class198.aClass66_2679 != Class142.aClass66_1925)
											|| !(Class11_Sub16.aStringArray5675[i_9_]
													.equalsIgnoreCase(Class26.aClass26_299
															.method217(
																	(byte) 118,
																	(Class11_Sub45_Sub1_Sub2.anInt9884))))) {
										if (Class290.aBoolArray3911[i_9_])
											i_10_ = (short) 2000;
									} else {
										if ((((Player) class376_sub7_sub5_sub5_sub1).anInt10389) > (((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10389))
											i_10_ = (short) 2000;
										if ((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10422) != 0
												&& ((((Player) class376_sub7_sub5_sub5_sub1).anInt10422) ^ 0xffffffff) != -1) {
											if ((((Player) (Class11_Sub2_Sub8.myPlayer)).anInt10422) == (((Player) class376_sub7_sub5_sub5_sub1).anInt10422))
												i_10_ = (short) 2000;
											else
												i_10_ = (short) 0;
										}
									}
									short i_11_ = (short) (i_10_ + (Class10.aShortArray74[i_9_]));
									int i_12_ = ((Class2_Sub5.anIntArray5509[i_9_] == -1) ? Class11_Sub18.anInt5794
											: Class2_Sub5.anIntArray5509[i_9_]);
									Class108_Sub22
											.method2963(
													false,
													0,
													-1,
													Class11_Sub16.aStringArray5675[i_9_],
													false,
													i_12_,
													true,
													i_11_,
													(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
													(long) (((Actor) class376_sub7_sub5_sub5_sub1).anInt10319),
													"<col=ffffff>" + string, 0,
													0);
									Class11_Sub2_Sub21.anInt9193++;
								}
							}
						}
						if (bool)
							break;
						for (Class11_Sub45_Sub5 class11_sub45_sub5 = (Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
								.method584(-12261); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
								.method578(-15361))) {
							if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) == 21) {
								((Class11_Sub45_Sub5) class11_sub45_sub5).aString8764 = "<col=ffffff>"
										+ string;
								break;
							}
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("iga.A("
						+ bool
						+ ','
						+ i
						+ ','
						+ ((class376_sub7_sub5_sub5_sub1 != null) ? "{...}"
								: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method3225(int i, byte i_13_) {
		try {
			if (i_13_ > -84)
				method3225(-91, (byte) -99);
			anInt8014++;
			if (i != 4 && (i ^ 0xffffffff) != -9 && i != 11)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iga.D(" + i + ','
					+ i_13_ + ')');
		}
	}

	public Class11_Sub49() {
		/* empty */
	}

	Class11_Sub49(String string, int i) {
		try {
			((Class11_Sub49) this).aString8016 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iga.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
