/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static int anInt504;
	static boolean aBool505;
	static int anInt506;
	static int anInt507;
	static int anInt508;
	static boolean aBool509 = true;
	static Class362[] aClass362Array510 = new Class362[2048];
	static Class146 aClass146_511;
	static int[] anIntArray512;
	static int anInt513;
	static OutgoingPacket aClass370_514;
	Class11_Sub45 aClass11_Sub45_515 = new Class11_Sub45();
	static int anInt516;
	static int anInt517;
	static int anInt518;
	static int anInt519;
	private Class11_Sub45 aClass11_Sub45_520;

	final Class11_Sub45 method328(int i) {
		try {
			if (i != 0)
				method331((byte) -52);
			anInt504++;
			Class11_Sub45 class11_sub45 = (((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7903);
			if (class11_sub45 == ((Class38) this).aClass11_Sub45_515)
				return null;
			class11_sub45.method3187(100);
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.E(" + i + ')');
		}
	}

	static final void method329(int i) {
		try {
			Class11_Sub31.aClass163_6702
					.L(Class346.anInt4588,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732
									.method2892(false) ^ 0xffffffff) == -2 ? 256 + Class119.anInt1617 << 2
									: -1, 0);
			if (i != 27920)
				method335(-76, -118, (byte) 110);
			anInt519++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.G(" + i + ')');
		}
	}

	final void method330(Class11_Sub45 class11_sub45, int i) {
		try {
			anInt518++;
			if (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 != null)
				class11_sub45.method3187(100);
			if (i == 21934) {
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7903 = ((Class38) this).aClass11_Sub45_515;
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 = (((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7902);
				((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902)).aClass11_Sub45_7903 = class11_sub45;
				((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7903)).aClass11_Sub45_7902 = class11_sub45;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.C("
					+ (class11_sub45 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	final Class11_Sub45 method331(byte i) {
		try {
			anInt517++;
			if (i != -7)
				method328(-91);
			Class11_Sub45 class11_sub45 = (((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7903);
			if (class11_sub45 == ((Class38) this).aClass11_Sub45_515) {
				aClass11_Sub45_520 = null;
				return null;
			}
			aClass11_Sub45_520 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903;
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.F(" + i + ')');
		}
	}

	final int method332(byte i) {
		try {
			anInt507++;
			if (i >= -79)
				method334(10);
			int i_0_ = 0;
			Class11_Sub45 class11_sub45 = (((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7903);
			while (class11_sub45 != ((Class38) this).aClass11_Sub45_515) {
				class11_sub45 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903;
				i_0_++;
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.D(" + i + ')');
		}
	}

	final Class11_Sub45 method333(int i) {
		try {
			if (i > -38)
				anInt508 = -110;
			anInt506++;
			Class11_Sub45 class11_sub45 = aClass11_Sub45_520;
			if (class11_sub45 == ((Class38) this).aClass11_Sub45_515) {
				aClass11_Sub45_520 = null;
				return null;
			}
			aClass11_Sub45_520 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903;
			return class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.B(" + i + ')');
		}
	}

	final void method334(int i) {
		do {
			try {
				anInt513++;
				for (;;) {
					Class11_Sub45 class11_sub45 = (((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7903);
					if (((Class38) this).aClass11_Sub45_515 == class11_sub45)
						break;
					class11_sub45.method3187(100);
				}
				aClass11_Sub45_520 = null;
				if (i == 3)
					break;
				method328(23);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lga.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method335(int i, int i_1_, byte i_2_) {
		try {
			anInt516++;
			int i_3_ = -26 / ((i_2_ + 5) / 39);
			if ((0x22 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lga.I(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	public static void method336(byte i) {
		try {
			aClass362Array510 = null;
			anIntArray512 = null;
			aClass146_511 = null;
			aClass370_514 = null;
			int i_4_ = -33 % ((i + 48) / 59);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.A(" + i + ')');
		}
	}

	public Class38() {
		try {
			((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7902 = ((Class38) this).aClass11_Sub45_515;
			((Class11_Sub45) ((Class38) this).aClass11_Sub45_515).aClass11_Sub45_7903 = ((Class38) this).aClass11_Sub45_515;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lga.<init>(" + ')');
		}
	}

	static {
		aBool505 = false;
		anInt508 = 0;
		anIntArray512 = new int[] { 1, 0, -1, 0 };
		aClass370_514 = new OutgoingPacket(76, 3);
	}
}
