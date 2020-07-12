/* Class11_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub35 extends Class11 {
	static byte[][] aByteArrayArray7006;
	static int anInt7007;
	Class163_Sub3 aClass163_Sub3_7008;
	static int anInt7009;
	static int anInt7010;
	static int anInt7011;
	boolean aBool7012;
	static int anInt7013;
	/* synthetic */static Class aClass7014;

	abstract void method2836(int i, int i_0_);

	abstract boolean method2837(int i);

	final boolean method2838(int i) {
		try {
			if (i != 2)
				((Class11_Sub35) this).aClass163_Sub3_7008 = null;
			anInt7009++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.M(" + i + ')');
		}
	}

	abstract boolean method2839(byte i);

	final boolean method2840(int i) {
		try {
			anInt7007++;
			if (i != -3)
				return true;
			return ((Class11_Sub35) this).aBool7012;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.P(" + i + ')');
		}
	}

	final int method2841(int i) {
		try {
			if (i != -4867)
				method2838(-63);
			anInt7013++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.S(" + i + ')');
		}
	}

	abstract void method2842(int i, int i_1_, int i_2_);

	abstract void method2843(int i);

	int method2844(byte i) {
		try {
			if (i != 48)
				return 45;
			anInt7011++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.D(" + i + ')');
		}
	}

	public static void method2845(int i) {
		try {
			aByteArrayArray7006 = null;
			int i_3_ = 22 / ((i + 58) / 53);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.O(" + i + ')');
		}
	}

	abstract void method2846(Class321_Sub3 class321_sub3,
			Class321_Sub3 class321_sub3_4_, int i, byte i_5_);

	static final void method2847(int i, int i_6_, boolean bool, int i_7_,
			int i_8_, int i_9_, int i_10_, int i_11_) {
		while_2_: do {
			do {
				try {
					if (bool != false)
						break;
					anInt7010++;
					if (i_10_ < 0
							|| (i_6_ ^ 0xffffffff) > -1
							|| ((Class300.anInt4051 - 1 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff))
							|| i_6_ >= -1 + Class108_Sub12.anInt6228)
						break while_2_;
					if (Class181.aClass364ArrayArrayArray2336 == null)
						break;
					if ((i ^ 0xffffffff) == -1) {
						Interface13 interface13 = ((Interface13) Class209
								.method1342(i_9_, i_10_, i_6_));
						Interface13 interface13_12_ = ((Interface13) Class297
								.method1846(i_9_, i_10_, i_6_));
						if (interface13 != null && (i_7_ ^ 0xffffffff) != -3) {
							if (!(interface13 instanceof Class376_Sub7_Sub3_Sub2))
								Player.method3976(i_8_, i_10_, i_11_, i_7_,
										i_6_, i,
										interface13.method42((byte) -17), 1,
										i_9_);
							else
								((Class376_Sub7_Sub3_Sub2) (Class376_Sub7_Sub3_Sub2) interface13).aClass50_10148
										.method420(i_11_, (byte) 79);
						}
						if (interface13_12_ != null) {
							if (interface13_12_ instanceof Class376_Sub7_Sub3_Sub2)
								((Class376_Sub7_Sub3_Sub2) (Class376_Sub7_Sub3_Sub2) interface13_12_).aClass50_10148
										.method420(i_11_, (byte) -121);
							else {
								Player.method3976(i_8_, i_10_, i_11_, i_7_,
										i_6_, i,
										interface13_12_.method42((byte) -17),
										1, i_9_);
								break;
							}
							break;
						}
					} else {
						if ((i ^ 0xffffffff) != -2) {
							if ((i ^ 0xffffffff) != -3) {
								if ((i ^ 0xffffffff) == -4) {
									Interface13 interface13 = ((Interface13) Class159
											.method988(i_9_, i_10_, i_6_));
									if (interface13 != null) {
										if (!(interface13 instanceof Class376_Sub7_Sub2_Sub2))
											Player.method3976(
													i_8_,
													i_10_,
													i_11_,
													i_7_,
													i_6_,
													i,
													interface13
															.method42((byte) -17),
													1, i_9_);
										else
											((Class376_Sub7_Sub2_Sub2) (Class376_Sub7_Sub2_Sub2) interface13).aClass50_10222
													.method420(i_11_,
															(byte) -114);
									}
								}
							} else {
								Interface13 interface13 = ((Interface13) (Class180
										.method1185(
												i_9_,
												i_10_,
												i_6_,
												(aClass7014 != null ? aClass7014
														: (aClass7014 = getClassByName("Interface13"))))));
								if (interface13 == null)
									break;
								if ((i_7_ ^ 0xffffffff) == -12)
									i_7_ = 10;
								if (!(interface13 instanceof Class376_Sub7_Sub5_Sub1))
									Player.method3976(i_8_, i_10_, i_11_, i_7_,
											i_6_, i,
											interface13.method42((byte) -17),
											1, i_9_);
								else
									((Class376_Sub7_Sub5_Sub1) (Class376_Sub7_Sub5_Sub1) interface13).aClass50_9915
											.method420(i_11_, (byte) 3);
							}
							break;
						}
						Interface13 interface13 = ((Interface13) Class108_Sub9
								.method2608(i_9_, i_10_, i_6_));
						if (interface13 == null)
							break while_2_;
						if (interface13 instanceof Class376_Sub7_Sub4_Sub2) {
							((Class376_Sub7_Sub4_Sub2) (Class376_Sub7_Sub4_Sub2) interface13).aClass50_10048
									.method420(i_11_, (byte) -126);
							break;
						}
						int i_13_ = interface13.method42((byte) -17);
						if (i_7_ == 4 || (i_7_ ^ 0xffffffff) == -6) {
							Player.method3976(i_8_, i_10_, i_11_, 4, i_6_, i,
									i_13_, 1, i_9_);
							break;
						}
						if ((i_7_ ^ 0xffffffff) == -7) {
							Player.method3976(i_8_ + 4, i_10_, i_11_, 4, i_6_,
									i, i_13_, 1, i_9_);
							break;
						}
						if (i_7_ != 7) {
							if ((i_7_ ^ 0xffffffff) == -9) {
								Player.method3976(i_8_ + 4, i_10_, i_11_, 4,
										i_6_, i, i_13_, 1, i_9_);
								Player.method3976(4 + (0x3 & 2 + i_8_), i_10_,
										i_11_, 4, i_6_, i, i_13_, 1, i_9_);
								break;
							}
						} else
							Player.method3976((i_8_ + 2 & 0x3) + 4, i_10_,
									i_11_, 4, i_6_, i, i_13_, 1, i_9_);
					}
				} catch (RuntimeException runtimeexception) {
					throw Class205.method1298(runtimeexception, ("ou.N(" + i
							+ ',' + i_6_ + ',' + bool + ',' + i_7_ + ',' + i_8_
							+ ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
				}
			} while (false);
			break;
		} while (false);
	}

	Class11_Sub35(Class163_Sub3 class163_sub3) {
		try {
			((Class11_Sub35) this).aClass163_Sub3_7008 = class163_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ou.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
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
