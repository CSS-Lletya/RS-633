/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Exception_Sub1 extends Exception {
	static int anInt9480;
	static int anInt9481;
	static int anInt9482;
	static int anInt9483;
	static int anInt9484;
	static int anInt9485;
	static IComponentDefinitions aClass192_9486 = null;

	static final void method3734(int i, int i_0_, int i_1_, byte i_2_,
			int i_3_, byte[] is) {
		try {
			anInt9482++;
			if (i_1_ < i_3_ && i_2_ >= 19) {
				i = -i_1_ + i_3_ >> 2;
				i_0_ += i_1_;
				while ((--i ^ 0xffffffff) <= -1) {
					is[i_0_++] = (byte) 1;
					is[i_0_++] = (byte) 1;
					is[i_0_++] = (byte) 1;
					is[i_0_++] = (byte) 1;
				}
				i = 0x3 & -i_1_ + i_3_;
				while (--i >= 0)
					is[i_0_++] = (byte) 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qw.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3735(byte i) {
		do {
			try {
				aClass192_9486 = null;
				if (i == 1)
					break;
				method3739(-58, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qw.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3736(byte i,
			Actor class376_sub7_sub5_sub5) {
		try {
			if (i != 1)
				method3735((byte) -97);
			if (class376_sub7_sub5_sub5 instanceof Npc) {
				Npc class376_sub7_sub5_sub5_sub2 = (Npc) class376_sub7_sub5_sub5;
				if (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501 != null)
					Class163_Sub2_Sub1
							.method3403(
									class376_sub7_sub5_sub5_sub2,
									((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).aByte7047) != (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047)),
									3415);
			} else if (class376_sub7_sub5_sub5 instanceof Player) {
				Player class376_sub7_sub5_sub5_sub1 = (Player) class376_sub7_sub5_sub5;
				Class11_Sub49
						.method3224(
								(((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 != ((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047),
								(byte) 122, class376_sub7_sub5_sub5_sub1);
			}
			anInt9485++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qw.E("
							+ i
							+ ','
							+ (class376_sub7_sub5_sub5 != null ? "{...}"
									: "null") + ')'));
		}
	}

	public Exception_Sub1() {
		/* empty */
	}

	static final void method3737(int i) {
		try {
			if (Class79.method542(-2)) {
				if (Class11_Sub2_Sub6.aStringArray8706 == null)
					Class186.method1214((byte) 112);
				Class11_Sub50_Sub2.aBool9085 = true;
				Class11_Sub26.anInt6294 = 0;
			}
			if (i != 12887)
				method3737(-77);
			anInt9481++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qw.F(" + i + ')');
		}
	}

	static final void method3738(int i) {
		do {
			try {
				Class190.anInt2446 = 0;
				anInt9483++;
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -2049; i_4_++) {
					Class70.cachedAppearances[i_4_] = null;
					Class206.movementTypes[i_4_] = (byte) 1;
					Class38.aClass362Array510[i_4_] = null;
				}
				if (i < -12)
					break;
				method3736((byte) -43, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qw.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3739(int i, Class11_Sub45_Sub14 class11_sub45_sub14) {
		do {
			try {
				anInt9484++;
				boolean bool = false;
				class11_sub45_sub14.method3187(100);
				if (i > -30)
					aClass192_9486 = null;
				for (Class11_Sub45_Sub14 class11_sub45_sub14_5_ = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method331((byte) -7)); class11_sub45_sub14_5_ != null; class11_sub45_sub14_5_ = ((Class11_Sub45_Sub14) Class161.aClass38_2097
						.method333(-123))) {
					if (Class140.method887(false,
							class11_sub45_sub14_5_.method3640((byte) 79),
							class11_sub45_sub14.method3640((byte) 79))) {
						Class133.method861(-100, class11_sub45_sub14_5_,
								class11_sub45_sub14);
						bool = true;
						break;
					}
				}
				if (bool)
					break;
				Class161.aClass38_2097.method330(class11_sub45_sub14, 21934);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("qw.A("
								+ i
								+ ','
								+ (class11_sub45_sub14 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}
}
