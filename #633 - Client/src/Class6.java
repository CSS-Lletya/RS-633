/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class6 {
	static IncomingPacket aClass160_36 = new IncomingPacket(12, -2);
	static int anInt37;
	static int anInt38;
	static int anInt39 = -1;
	static int[] anIntArray40 = new int[2048];
	static int anInt41;
	static Class218 aClass218_42 = new Class218();

	public static void method86(int i) {
		try {
			if (i > 23) {
				aClass160_36 = null;
				anIntArray40 = null;
				aClass218_42 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eia.D(" + i + ')');
		}
	}

	abstract Class11_Sub45_Sub16 method87(byte i,
			Class11_Sub45_Sub16 class11_sub45_sub16);

	static final int method88(boolean bool, int i) {
		try {
			anInt41++;
			if (i == 6407 || (i ^ 0xffffffff) == -34844 || i == 34837)
				return 6407;
			if (bool != true)
				method89((byte) 98);
			if (i == 6408 || i == 34842 || i == 34836)
				return 6408;
			if ((i ^ 0xffffffff) == -6407 || i == 34844)
				return 6406;
			if ((i ^ 0xffffffff) == -6410 || (i ^ 0xffffffff) == -34847)
				return 6409;
			if (i == 6410 || i == 34847)
				return 6410;
			if (i == 6402)
				return 6402;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eia.C(" + bool + ','
					+ i + ')');
		}
	}

	static final void method89(byte i) {
		try {
			anInt38++;
			if ((Class313.anInt4162 ^ 0xffffffff) != -1 && i == -21) {
				try {
					if (++Class207.anInt2800 > 2000) {
						if (Class108_Sub2.aClass217_5081 != null) {
							Class108_Sub2.aClass217_5081
									.method1398(-2147483648);
							Class108_Sub2.aClass217_5081 = null;
						}
						if (Class255.anInt3503 >= 2) {
							Class108_Sub6.anInt5632 = -5;
							Class313.anInt4162 = 0;
							return;
						}
						Class108_Sub23.aClass46_7759.method409(112);
						Class313.anInt4162 = 1;
						Class207.anInt2800 = 0;
						Class255.anInt3503++;
					}
					if (Class313.anInt4162 == 1) {
						Class108_Sub13.aClass368_6267 = (Class108_Sub23.aClass46_7759
								.method406(Class108_Sub21.aClass341_7304,
										(byte) -61));
						Class313.anInt4162 = 2;
					}
					if ((Class313.anInt4162 ^ 0xffffffff) == -3) {
						if ((Class108_Sub13.aClass368_6267.anInt4837 ^ 0xffffffff) == -3)
							throw new IOException();
						if (Class108_Sub13.aClass368_6267.anInt4837 != 1)
							return;
						Class108_Sub2.aClass217_5081 = Class338
								.method2034(
										7500,
										(Socket) (Class108_Sub13.aClass368_6267.anObject4838),
										62);
						Class108_Sub13.aClass368_6267 = null;
						Class234_Sub2_Sub2.method3540((byte) -11);
						Class313.anInt4162 = 4;
					}
					if (Class313.anInt4162 == 4) {
						if (Class108_Sub2.aClass217_5081.method1399((byte) 53,
								1)) {
							Class108_Sub2.aClass217_5081.method1396(-1,
									(((Stream) Class3.packetStream).buffer), 0,
									1);
							int i_0_ = (0xff & (((Stream) Class3.packetStream).buffer[0]));
							Class313.anInt4162 = 0;
							Class108_Sub6.anInt5632 = i_0_;
							Class108_Sub2.aClass217_5081
									.method1398(-2147483648);
							Class108_Sub2.aClass217_5081 = null;
						}
					}
				} catch (IOException ioexception) {
					if (Class108_Sub2.aClass217_5081 != null) {
						Class108_Sub2.aClass217_5081.method1398(-2147483648);
						Class108_Sub2.aClass217_5081 = null;
					}
					if (Class255.anInt3503 < 2) {
						Class108_Sub23.aClass46_7759.method409(-123);
						Class255.anInt3503++;
						Class313.anInt4162 = 1;
						Class207.anInt2800 = 0;
					} else {
						Class313.anInt4162 = 0;
						Class108_Sub6.anInt5632 = -4;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eia.E(" + i + ')');
		}
	}

	static final Class140 method90(int i, Class376_Sub7_Sub5 class376_sub7_sub5) {
		try {
			anInt37++;
			Class140 class140;
			if (Class108_Sub18.aClass140_6922 != null) {
				class140 = Class108_Sub18.aClass140_6922;
				Class108_Sub18.aClass140_6922 = (((Class140) Class108_Sub18.aClass140_6922).aClass140_1895);
				Class316.anInt4185--;
				((Class140) class140).aClass140_1895 = null;
			} else
				class140 = new Class140();
			if (i > -40)
				method86(-52);
			((Class140) class140).aClass376_Sub7_Sub5_1896 = class376_sub7_sub5;
			return class140;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eia.B(" + i + ','
					+ (class376_sub7_sub5 != null ? "{...}" : "null") + ')'));
		}
	}
}
