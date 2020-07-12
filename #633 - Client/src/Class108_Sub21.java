/* Class108_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub21 extends Class108 {
	static int anInt7300;
	static int anInt7301 = -1;
	static volatile boolean aBool7302 = true;
	static int anInt7303;
	static Class341 aClass341_7304;
	static IncomingPacket aClass160_7305 = new IncomingPacket(11, 3);
	static int anInt7306;
	static int anInt7307;
	static int anInt7308;
	static int anInt7309;
	static int anInt7310;
	static int anInt7311;

	public static void method2955(int i) {
		do {
			try {
				aClass341_7304 = null;
				aClass160_7305 = null;
				if (i == 9564)
					break;
				method2956(true, (byte) -79);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sa.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		do {
			try {
				if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
					((Class108) this).anInt1459 = 0;
				if (bool == false) {
					anInt7308++;
					if (((Class108) this).anInt1459 == 1
							|| ((Class108) this).anInt1459 == 0)
						break;
					((Class108) this).anInt1459 = method725((byte) 126);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sa.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_0_) {
		try {
			anInt7309++;
			if (i_0_ <= 10)
				method728(-65, 119);
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sa.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2956(boolean bool, byte i) {
		try {
			if (bool) {
				if ((Class365.anInt4797 ^ 0xffffffff) != 0)
					Class11_Sub45_Sub19.method3822(i ^ ~0x7f,
							Class365.anInt4797);
				for (Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1365(24490)); class11_sub24 != null; class11_sub24 = (Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1367((byte) 71)) {
					if (!class11_sub24.method124(0)) {
						class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
								.method1365(24490));
						if (class11_sub24 == null)
							break;
					}
					NPCDefinitions.method1377(false, true, class11_sub24, -66);
				}
				Class365.anInt4797 = -1;
				Class75_Sub2.aClass213_7160 = new Class213(8);
				InputStream_Sub2.method2817(30695);
				Class365.anInt4797 = Class2_Sub3.anInt5366;
				Class321_Sub3_Sub1.method3614(false, -14543);
				Class307.method1879(i ^ 0x1b);
				Class86.parseIComponentScript(Class365.anInt4797);
			}
			anInt7306++;
			Class11_Sub30_Sub1.currentUsername = Class11_Sub45_Sub8.currentPassword = "";
			Class11_Sub2_Sub17.aBool9046 = false;
			Class84.method585(i + 231);
			Class325.anInt4329 = -1;
			Class32_Sub1.method2441(Class11_Sub10.anInt5389, (byte) -71);
			Class11_Sub2_Sub8.myPlayer = new Player();
			((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045 = 512 * Class300.anInt4051 / 2;
			((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7031 = 512 * Class108_Sub12.anInt6228 / 2;
			((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10370[0] = Class300.anInt4051 / 2;
			((Actor) Class11_Sub2_Sub8.myPlayer).anIntArray10376[0] = Class108_Sub12.anInt6228 / 2;
			Class11_Sub45_Sub11.anInt9157 = Class303.anInt4088 = 0;
			if (Class191.anInt2453 != 2)
				Class298.method1849((byte) 120);
			else {
				Class303.anInt4088 = Class270.anInt3650 << 9;
				Class11_Sub45_Sub11.anInt9157 = Class251_Sub1.anInt5417 << 9;
			}
			if (i != -128)
				method2955(20);
			Class376_Sub1.method2276(16711680);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sa.H(" + bool + ','
					+ i + ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt7307++;
			int i_1_ = 15 / ((i - 70) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sa.A(" + i + ')');
		}
	}

	final boolean method2957(byte i) {
		try {
			anInt7310++;
			if (((Class108) this).aClass11_Sub17_1458.method2456(-18373))
				return false;
			if (i != -53)
				method2958(true);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sa.D(" + i + ')');
		}
	}

	Class108_Sub21(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final int method2958(boolean bool) {
		try {
			if (bool != false)
				method726(true);
			anInt7303++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sa.B(" + bool + ')');
		}
	}

	Class108_Sub21(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final void method728(int i, int i_2_) {
		do {
			try {
				anInt7300++;
				((Class108) this).anInt1459 = i_2_;
				if (i == 0)
					break;
				method2956(false, (byte) 122);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sa.C(" + i + ','
						+ i_2_ + ')');
			}
			break;
		} while (false);
	}
}
