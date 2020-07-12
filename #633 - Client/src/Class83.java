/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class83 {
	static String[][] aStringArrayArray1137 = { { "M1", "M2", "S1", "F" },
			{ "M1", "M2", "M3", "S1", "S2", "F" },
			{ "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };
	static int anInt1138;
	static int anInt1139;
	static IncomingPacket aClass160_1140 = new IncomingPacket(24, -1);
	static int anInt1141;
	static int anInt1142;

	public final String toString() {
		try {
			anInt1142++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bd.toString(" + ')');
		}
	}

	static final boolean method572(int i, int i_0_, int i_1_) {
		try {
			anInt1138++;
			if (i != 24121)
				method573(null, (byte) -9);
			return (Class376_Sub7_Sub4.method3764(true, i_0_, i_1_) & Class226
					.method1453(i ^ ~0x44b0, i_1_, i_0_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bd.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method573(Stream stream, byte i) {
		try {
			anInt1139++;
			byte[] is = new byte[24];
			if (Class11_Sub30_Sub1.aClass182_8980 != null) {
				try {
					Class11_Sub30_Sub1.aClass182_8980.method1192(0L, true);
					Class11_Sub30_Sub1.aClass182_8980.method1193((byte) 25, is);
					int i_2_;
					for (i_2_ = 0; (i_2_ ^ 0xffffffff) > -25; i_2_++) {
						if (is[i_2_] != 0)
							break;
					}
					if (i_2_ >= 24)
						throw new IOException();
				} catch (Exception exception) {
					for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -25; i_3_++)
						is[i_3_] = (byte) -1;
				}
			}
			if (i < 99)
				aClass160_1140 = null;
			stream.writeBytes(true, is, 24, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bd.A("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method574(int i) {
		try {
			aClass160_1140 = null;
			if (i != 2)
				method573(null, (byte) -44);
			aStringArrayArray1137 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bd.D(" + i + ')');
		}
	}

	Class83(int i, int i_4_) {
		/* empty */
	}

	static final void method575(boolean bool, int i) {
		try {
			anInt1141++;
			if (Class285.anInt3846 != i && bool == false) {
				if ((i ^ 0xffffffff) == -14) {
					if (Class286.aString3874 == null)
						Class9.method112(15341,
								Class11_Sub30_Sub1.currentUsername,
								Class11_Sub45_Sub8.currentPassword,
								Class108_Sub23.anInt7766);
					else
						Class245.method1547(126, Class108_Sub23.anInt7766);
				}
				if ((i ^ 0xffffffff) != -14
						&& Class321_Sub3.aClass217_7017 != null) {
					Class321_Sub3.aClass217_7017.method1398(-2147483648);
					Class321_Sub3.aClass217_7017 = null;
				}
				if (i == 3)
					Class108_Sub21.method2956(
							(Class2_Sub3.anInt5366 != Class365.anInt4797),
							(byte) -128);
				if ((i ^ 0xffffffff) == -8)
					Class219.method1405(-118,
							(Class108_Sub9.anInt6099 != Class365.anInt4797));
				if (i == 5) {
					if (Class286.aString3874 == null)
						Class255.method1635(Class11_Sub30_Sub1.currentUsername,
								125, Class11_Sub45_Sub8.currentPassword);
					else
						Class181.method1187(false);
				} else if ((i ^ 0xffffffff) != -7) {
					if (i != 9) {
						if ((i ^ 0xffffffff) == -13) {
							if (Class286.aString3874 != null)
								Class181.method1187(bool);
							else
								Class255.method1635(
										(Class11_Sub30_Sub1.currentUsername),
										114,
										(Class11_Sub45_Sub8.currentPassword));
						}
					} else if (Class286.aString3874 != null)
						Class245.method1547(126, Class108_Sub23.anInt7766);
					else
						Class9.method112(15341,
								Class11_Sub30_Sub1.currentUsername,
								Class11_Sub45_Sub8.currentPassword,
								Class108_Sub23.anInt7766);
				} else if (Class286.aString3874 != null)
					Class245.method1547(126, Class108_Sub23.anInt7766);
				else
					Class9.method112(15341, Class11_Sub30_Sub1.currentUsername,
							Class11_Sub45_Sub8.currentPassword,
							Class108_Sub23.anInt7766);
				if (Class11_Sub49.method3225(Class285.anInt3846, (byte) -117)) {
					((Class146) Class11_Sub2_Sub15.aClass146_9023).anInt1987 = 2;
					((Class146) Class108_Sub1.aClass146_5026).anInt1987 = 2;
					((Class146) Class308.aClass146_4128).anInt1987 = 2;
					((Class146) Class131.aClass146_1825).anInt1987 = 2;
					((Class146) Class47.aClass146_744).anInt1987 = 2;
					((Class146) Class217_Sub1.aClass146_5538).anInt1987 = 2;
					((Class146) Class256_Sub1.aClass146_5323).anInt1987 = 2;
				}
				if (Class11_Sub49.method3225(i, (byte) -113)) {
					Class7.anInt45 = 0;
					Class335.anInt4439 = 0;
					Class249.anInt3442 = 1;
					Class253_Sub1.anInt5868 = 0;
					Class373.anInt4883 = 1;
					Class236_Sub1.method2605((byte) 113, true);
					((Class146) Class11_Sub2_Sub15.aClass146_9023).anInt1987 = 1;
					((Class146) Class108_Sub1.aClass146_5026).anInt1987 = 1;
					((Class146) Class308.aClass146_4128).anInt1987 = 1;
					((Class146) Class131.aClass146_1825).anInt1987 = 1;
					((Class146) Class47.aClass146_744).anInt1987 = 1;
					((Class146) Class217_Sub1.aClass146_5538).anInt1987 = 1;
					((Class146) Class256_Sub1.aClass146_5323).anInt1987 = 1;
				}
				if ((i ^ 0xffffffff) == -12 || i == 3)
					Class239_Sub2.method3190(-126);
				boolean bool_5_ = (i == 2
						|| Class108_Sub2.method2268(i, (byte) -56) || Class221
						.method1416(i, -8714));
				boolean bool_6_ = ((Class285.anInt3846 ^ 0xffffffff) == -3
						|| Class108_Sub2.method2268(Class285.anInt3846,
								(byte) 126) || Class221.method1416(
						Class285.anInt3846, -8714));
				if (bool_5_ != bool_6_) {
					if (bool_5_) {
						Class11_Sub12_Sub1.anInt8828 = Class235.anInt3219;
						if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5690
								.method2462(false) == 0)
							Class11_Sub2_Sub8.method3430(2, 1);
						else {
							Class376_Sub7_Sub1
									.method3445(
											Class58_Sub2_Sub1.aClass146_9250,
											2,
											0,
											Class235.anInt3219,
											1,
											((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5690
													.method2462(false), false);
							Class295.method1829(-1);
						}
						Class52.aClass187_810.method1226((byte) 0, false);
					} else {
						Class11_Sub2_Sub8.method3430(2, 1);
						Class52.aClass187_810.method1226((byte) 0, true);
					}
				}
				if (Class11_Sub49.method3225(i, (byte) -122)
						|| (i ^ 0xffffffff) == -14)
					Class321_Sub2.aClass163_6648.method1043();
				Class285.anInt3846 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bd.C(" + bool + ','
					+ i + ')');
		}
	}
}
