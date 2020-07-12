/* Class11_Sub45_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub15 extends Class11_Sub45 {
	static int anInt9361;
	static int anInt9362;
	int anInt9363;
	static int anInt9364 = 0;
	static int anInt9365;
	String aString9366;
	int anInt9367;
	static int anInt9368;
	int anInt9369;
	static Class79 aClass79_9370;
	static int anInt9371;
	static int anInt9372;
	static int[][] anIntArrayArray9373 = { { 0, 2, 4, 6 },
			{ 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 },
			{ 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 },
			{ 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 },
			{ 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
	static int anInt9374;

	final int method3655(byte i) {
		try {
			if (i >= -90)
				method3661(73);
			anInt9362++;
			return (int) (0xffL & ((Class11) this).aLong91 >>> 32);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.F(" + i + ')');
		}
	}

	public static void method3656(byte i) {
		try {
			anIntArrayArray9373 = null;
			aClass79_9370 = null;
			int i_0_ = -3 / ((i - 29) / 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.C(" + i + ')');
		}
	}

	final int method3657(int i) {
		try {
			anInt9361++;
			if (i != 6)
				return 5;
			return (int) ((Class11) this).aLong91;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.D(" + i + ')');
		}
	}

	final long method3658(int i) {
		try {
			anInt9365++;
			if (i != 0)
				return -64L;
			return ((Class11_Sub45) this).aLong7904 & 0x7fffffffffffffffL;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.G(" + i + ')');
		}
	}

	static final void method3659(int i) {
		try {
			Class58_Sub2.method3152(0);
			anInt9371++;
			((Stream) Class3.packetStream).position = 0;
			Class37.anInt486 = 0;
			Class336.aClass160_4440 = null;
			Class47.anInt742 = 0;
			Class236_Sub9.incomingPacket = null;
			Class266.aClass160_3621 = null;
			Class334.anInt4423 = 0;
			Class340.aClass160_4489 = null;
			Class11_Sub41.method2940(0);
			Class11_Sub50.method3226(false);
			int i_1_ = -37 / ((20 - i) / 38);
			for (int i_2_ = 0; i_2_ < 2048; i_2_++)
				Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_2_] = null;
			Class11_Sub2_Sub8.myPlayer = null;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class108_Sub17.anInt6619 ^ 0xffffffff); i_3_++) {
				Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_3_]).aNpc_2373);
				if (class376_sub7_sub5_sub5_sub2 != null)
					((Actor) class376_sub7_sub5_sub5_sub2).faceEntity = -1;
			}
			Class114.method760(true);
			Class191.anInt2453 = 1;
			Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
			Class83.method575(false, 10);
			for (int i_4_ = 0; i_4_ < 100; i_4_++)
				Class11_Sub45.aBoolArray7907[i_4_] = true;
			Class336.method2021(-120);
			Class2.aLong20 = 0L;
			Class253_Sub2.aClass11_Sub31_6536 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.A(" + i + ')');
		}
	}

	final void method3660(int i) {
		try {
			anInt9372++;
			if (i == 0) {
				((Class11_Sub45) this).aLong7904 = (((Class11_Sub45) this).aLong7904
						& ~0x7fffffffffffffffL | Class137.method878((byte) -59) + 500L);
				Class331.aClass38_4397.method330(this, 21934);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.E(" + i + ')');
		}
	}

	Class11_Sub45_Sub15(int i, int i_5_) {
		try {
			((Class11) this).aLong91 = (long) i_5_ | (long) i << 32;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nu.<init>(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method3661(int i) {
		do {
			try {
				((Class11_Sub45) this).aLong7904 |= ~0x7fffffffffffffffL;
				anInt9368++;
				if ((method3658(i) ^ 0xffffffffffffffffL) != -1L)
					break;
				Class11_Sub2_Sub32.aClass38_9651.method330(this, 21934);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nu.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass79_9370 = new Class79(9, 0, 4, 1);
		anInt9374 = 0;
	}
}
