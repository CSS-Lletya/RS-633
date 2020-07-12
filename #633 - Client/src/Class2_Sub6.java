/* Class2_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub6 extends Class2 {
	static int anInt5541;
	static int anInt5542;
	static int anInt5543;
	static int anInt5544;
	static int anInt5545;
	static IncomingPacket RUN_SCRIPT_IN_PACKET = new IncomingPacket(53, -2);
	private float aFloat5547 = 0.0F;
	static int anInt5548;
	static int anInt5549;
	static int anInt5550;
	static int anInt5551;
	private Class177 aClass177_5552;
	static int[] anIntArray5553 = new int[1];

	final void method70(Interface15 interface15, int i, int i_0_) {
		do {
			try {
				((Class2) this).aClass163_Sub2_13.method3094(interface15, -2);
				anInt5541++;
				if (i_0_ == 3)
					break;
				aClass177_5552 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("aq.I("
						+ (interface15 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_0_ + ')'));
			}
			break;
		} while (false);
	}

	final void method77(byte i) {
		do {
			try {
				anInt5551++;
				if (((Class2) this).aClass163_Sub2_13.method3083((byte) 123) == 0) {
					Class33_Sub2 class33_sub2 = ((Class2) this).aClass163_Sub2_13
							.method3087(false);
					((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
					Class33_Sub2 class33_sub2_1_ = ((Class2) this).aClass163_Sub2_13
							.method2975(122);
					class33_sub2_1_.method296(class33_sub2);
					class33_sub2_1_.method2753(0.125F, 0.125F, 16383, 1.0F);
					class33_sub2_1_.method2747(0.0F, aFloat5547, (byte) 86,
							0.0F);
					((Class2) this).aClass163_Sub2_13.method2989((byte) 95,
							Class39.aClass240_554);
					((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				}
				if (i == -122)
					break;
				aClass177_5552 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "aq.Q(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method67(byte i) {
		try {
			((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			int i_2_ = -84 % ((i + 26) / 56);
			anInt5545++;
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					Class188.aClass314_2424, Class188.aClass314_2424);
			((Class2) this).aClass163_Sub2_13.method3095((byte) -116,
					(Class11_Sub45_Sub12.aClass218_9187), 0);
			((Class2) this).aClass163_Sub2_13.method2993(
					Class11_Sub45_Sub12.aClass218_9187, 0, 256);
			((Class2) this).aClass163_Sub2_13.method3085(1, (byte) 70);
			((Class2) this).aClass163_Sub2_13.method3094(null, -2);
			((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			((Class2) this).aClass163_Sub2_13.method2993(
					Class11_Sub45_Sub12.aClass218_9187, 0, 256);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aq.E(" + i + ')');
		}
	}

	static final void method2413(int i, int i_3_, int i_4_, int i_5_) {
		try {
			i_5_ <<= i_3_;
			i <<= 3;
			anInt5548++;
			i_4_ <<= 3;
			if ((Class191.anInt2453 ^ 0xffffffff) == -3) {
				Class211.anInt2857 = i;
				Class171.anInt2193 = i_4_;
				Class266.anInt3616 = i_5_;
			}
			Class219_Sub1.aFloat7244 = (float) i_5_;
			Class2_Sub8.aFloat6868 = (float) i_4_;
			Class253_Sub2.method2708(73);
			Class313.aBool4153 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aq.A(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	final void method68(boolean bool, int i) {
		try {
			anInt5544++;
			((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					Class380.aClass314_4960, Class121.aClass314_1643);
			((Class2) this).aClass163_Sub2_13.method3089(false,
					(Class11_Sub45_Sub12.aClass218_9187), 0, true, false);
			((Class2) this).aClass163_Sub2_13.method2993(Class6.aClass218_42,
					0, 256);
			((Class2) this).aClass163_Sub2_13.method3085(0, (byte) 70);
			((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			((Class2) this).aClass163_Sub2_13.method3062(true, -16777216);
			((Class2) this).aClass163_Sub2_13.method2993(Class68.aClass218_962,
					0, 256);
			if (i < -64)
				method77((byte) -122);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aq.G(" + bool + ','
					+ i + ')');
		}
	}

	final void method78(int i, int i_6_, int i_7_) {
		try {
			((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			anInt5543++;
			if ((0x80 & i_7_) == 0) {
				if ((i & 0x1) != 1) {
					if (!((Class177) aClass177_5552).aBool2243)
						((Class2) this).aClass163_Sub2_13
								.method3094(
										(((Class177) aClass177_5552).anInterface7Array2240[0]),
										-2);
					else
						((Class2) this).aClass163_Sub2_13.method3094(
								((Class177) aClass177_5552).anInterface17_2247,
								-2);
				} else if (((Class177) aClass177_5552).aBool2243) {
					aFloat5547 = (float) ((((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInt7576) % 4000) / 4000.0F;
					((Class2) this).aClass163_Sub2_13.method3094(
							((Class177) aClass177_5552).anInterface17_2247, -2);
				} else {
					int i_8_ = 16 * (((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInt7576 % 4000) / 4000;
					((Class2) this).aClass163_Sub2_13
							.method3094(
									(((Class177) aClass177_5552).anInterface7Array2240[i_8_]),
									-2);
				}
			} else
				((Class2) this).aClass163_Sub2_13.method3094(null, -2);
			if (i_6_ < 91)
				method2414((byte) -29);
			((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aq.J(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	final boolean method75(int i) {
		try {
			if (i <= 19)
				method71(32, false);
			anInt5550++;
			return aClass177_5552.method1149(-30571);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aq.B(" + i + ')');
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				RUN_SCRIPT_IN_PACKET = null;
			anInt5542++;
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					Class188.aClass314_2424, Class121.aClass314_1643);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aq.M(" + i + ','
					+ bool + ')');
		}
	}

	public static void method2414(byte i) {
		do {
			try {
				RUN_SCRIPT_IN_PACKET = null;
				anIntArray5553 = null;
				if (i == 38)
					break;
				RUN_SCRIPT_IN_PACKET = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "aq.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class2_Sub6(Class163_Sub2 class163_sub2, Class177 class177) {
		super(class163_sub2);
		try {
			aClass177_5552 = class177;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aq.<init>("
					+ (class163_sub2 != null ? "{...}" : "null") + ','
					+ (class177 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2415(int i) {
		try {
			if (i == 0) {
				anInt5549++;
				Class111.aClass22_1515.method189((byte) -125);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aq.D(" + i + ')');
		}
	}
}
