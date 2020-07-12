/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class112 {
	static int anInt1525;
	int anInt1526 = 0;
	static int anInt1527;
	static int anInt1528;
	static int anInt1529;
	int anInt1530 = 2048;
	int anInt1531;
	static IncomingPacket aClass160_1532 = new IncomingPacket(69, 28);
	static int anInt1533;
	int anInt1534 = 0;
	static int[] anIntArray1535;
	static volatile Object anObject1536 = null;
	static Class16 aClass16_1537 = new Class16();
	static int[] anIntArray1538;
	static IComponentDefinitions aClass192_1539;
	static int anInt1540;
	static OutgoingPacket aClass370_1541;
	static Applet_Sub1 anApplet_Sub1_1542 = null;
	static Class40 aClass40_1543;

	static final void method749(boolean bool, String string, byte i) {
		try {
			anInt1533++;
			if (string != null) {
				if ((Class231.anInt3168 ^ 0xffffffff) <= -101)
					Class11_Sub2_Sub28.method3715(true, 4,
							(Class26.aClass26_315.method217((byte) 124,
									(Class11_Sub45_Sub1_Sub2.anInt9884))));
				else {
					String string_0_ = Class282.method1742(0, string);
					if (string_0_ != null) {
						for (int i_1_ = 0; ((Class231.anInt3168 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
							String string_2_ = Class282
									.method1742(
											0,
											(Class11_Sub2_Sub16.aStringArray9034[i_1_]));
							if (string_2_ != null
									&& string_2_.equals(string_0_)) {
								Class11_Sub2_Sub28
										.method3715(
												true,
												4,
												string
														+ (Class26.aClass26_316
																.method217(
																		(byte) 107,
																		(Class11_Sub45_Sub1_Sub2.anInt9884))));
								return;
							}
							if (Class345.aStringArray4584[i_1_] != null) {
								String string_3_ = Class282.method1742(0,
										(Class345.aStringArray4584[i_1_]));
								if (string_3_ != null
										&& string_3_.equals(string_0_)) {
									Class11_Sub2_Sub28
											.method3715(
													true,
													4,
													string
															+ (Class26.aClass26_316
																	.method217(
																			(byte) 124,
																			(Class11_Sub45_Sub1_Sub2.anInt9884))));
									return;
								}
							}
						}
						for (int i_4_ = 0; Class94_Sub1.anInt5228 > i_4_; i_4_++) {
							String string_5_ = Class282.method1742(i + 43,
									(Class109.aStringArray1476[i_4_]));
							if (string_5_ != null
									&& string_5_.equals(string_0_)) {
								Class11_Sub2_Sub28
										.method3715(
												true,
												4,
												((Class26.aClass26_321
														.method217(
																(byte) 107,
																Class11_Sub45_Sub1_Sub2.anInt9884))
														+ string + (Class26.aClass26_322
														.method217(
																(byte) 118,
																(Class11_Sub45_Sub1_Sub2.anInt9884)))));
								return;
							}
							if (Class137.aStringArray1882[i_4_] != null) {
								String string_6_ = Class282.method1742(0,
										(Class137.aStringArray1882[i_4_]));
								if (string_6_ != null
										&& string_6_.equals(string_0_)) {
									Class11_Sub2_Sub28
											.method3715(
													true,
													4,
													((Class26.aClass26_321
															.method217(
																	(byte) 112,
																	Class11_Sub45_Sub1_Sub2.anInt9884))
															+ string + (Class26.aClass26_322
															.method217(
																	(byte) 90,
																	(Class11_Sub45_Sub1_Sub2.anInt9884)))));
									return;
								}
							}
						}
						if (i != -43)
							method752((byte) 47);
						if (Class282
								.method1742(
										0,
										(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400))
								.equals(string_0_))
							Class11_Sub2_Sub28
									.method3715(
											true,
											4,
											(Class26.aClass26_318
													.method217(
															(byte) 118,
															Class11_Sub45_Sub1_Sub2.anInt9884)));
						else {
							Class9.anInt70++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class189.aClass370_2434),
											(byte) -47);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(
											1 + Class98.method660(string, 0),
											-1528071456);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeString((byte) 27, string);
							((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
									.writeByte(bool ? 1 : 0, -1528071456);
							Class79.method541(class11_sub10, -104);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("di.F(" + bool + ','
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method750(int i) {
		try {
			anInt1528++;
			Class219.aClass213_3020.method1364((byte) 79);
			Class331.aClass38_4397.method334(3);
			if (i != 2)
				method751(-50);
			Class11_Sub2_Sub32.aClass38_9651.method334(3);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "di.E(" + i + ')');
		}
	}

	static final Class6 method751(int i) {
		try {
			anInt1527++;
			try {
				if (i != 0)
					method749(true, null, (byte) 28);
				return (Class6) Class.forName("Class6_Sub1").newInstance();
			} catch (Throwable throwable) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "di.C(" + i + ')');
		}
	}

	public static void method752(byte i) {
		try {
			aClass192_1539 = null;
			anIntArray1535 = null;
			if (i != 3)
				method750(-111);
			anIntArray1538 = null;
			aClass160_1532 = null;
			aClass16_1537 = null;
			aClass40_1543 = null;
			aClass370_1541 = null;
			anObject1536 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "di.B(" + i + ')');
		}
	}

	private final void method753(Stream stream, int i, int i_7_) {
		try {
			anInt1525++;
			if (i == -1) {
				if (i_7_ == 1)
					((Class112) this).anInt1534 = stream
							.readUnsignedByte((byte) 35);
				else if (i_7_ != 2) {
					if (i_7_ != 3) {
						if ((i_7_ ^ 0xffffffff) == -5)
							((Class112) this).anInt1526 = stream
									.method2508((byte) 62);
					} else
						((Class112) this).anInt1530 = stream
								.readUnsignedShort((byte) -65);
				} else
					((Class112) this).anInt1531 = stream
							.readUnsignedShort((byte) -65);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("di.A("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ')'));
		}
	}

	public Class112() {
		((Class112) this).anInt1531 = 2048;
	}

	final void method754(Stream stream, int i) {
		do {
			try {
				for (;;) {
					int i_8_ = stream.readUnsignedByte((byte) 35);
					if ((i_8_ ^ 0xffffffff) == -1)
						break;
					method753(stream, -1, i_8_);
				}
				anInt1529++;
				if (i == 0)
					break;
				method753(null, 1, -67);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("di.D("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass370_1541 = new OutgoingPacket(35, -1);
	}
}
