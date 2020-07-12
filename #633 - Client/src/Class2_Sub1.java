/* Class2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class2_Sub1 extends Class2 {
	static int anInt5056;
	static int anInt5057;
	static int anInt5058;
	static int anInt5059;
	private Class177 aClass177_5060;
	static int anInt5061;
	private Class163_Sub2_Sub1 aClass163_Sub2_Sub1_5062;
	static Class131 aClass131_5063 = new Class131();
	static int anInt5064 = -1;
	static int anInt5065;
	private Class47 aClass47_5066;
	static int anInt5067;
	static int anInt5068 = 0;
	static boolean aBool5069;

	final void method67(byte i) {
		try {
			((Class2) this).aClass163_Sub2_13.method3095((byte) -47,
					Class11_Sub45_Sub12.aClass218_9187, 0);
			anInt5057++;
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			int i_0_ = -36 / ((i + 26) / 56);
			OpenGL.glDisable(34336);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rca.E(" + i + ')');
		}
	}

	final void method68(boolean bool, int i) {
		do {
			try {
				OpenGL.glBindProgramARB(34336,
						((Class47) aClass47_5066).anInt736);
				anInt5059++;
				OpenGL.glEnable(34336);
				((Class2) this).aClass163_Sub2_13.method3095((byte) -120,
						Class6.aClass218_42, 0);
				if (i < -64)
					break;
				aClass47_5066 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rca.G(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	final void method78(int i, int i_1_, int i_2_) {
		do {
			try {
				anInt5056++;
				do {
					if (((Class177) aClass177_5060).aBool2243) {
						float f = (float) ((((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInt7576) % 4000) / 4000.0F;
						((Class2) this).aClass163_Sub2_13.method3094(
								((Class177) aClass177_5060).anInterface17_2247,
								-2);
						OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F,
								0.0F, 1.0F);
						if (!client.aBool10531)
							break;
					}
					int i_3_ = 16 * (((Class163_Sub2) ((Class2) this).aClass163_Sub2_13).anInt7576 % 4000) / 4000;
					((Class2) this).aClass163_Sub2_13
							.method3094(
									(((Class177) aClass177_5060).anInterface7Array2240[i_3_]),
									-2);
					OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F,
							0.0F, 1.0F);
				} while (false);
				if (i_1_ > 91)
					break;
				method70(null, -15, -90);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rca.J(" + i + ','
						+ i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	final void method70(Interface15 interface15, int i, int i_4_) {
		do {
			try {
				anInt5067++;
				if (i_4_ == 3)
					break;
				anInt5068 = -89;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rca.I("
						+ (interface15 != null ? "{...}" : "null") + ',' + i
						+ ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2265(byte i) {
		do {
			try {
				aClass131_5063 = null;
				if (i > 22)
					break;
				anInt5065 = 73;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rca.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method75(int i) {
		try {
			anInt5058++;
			if (i <= 19)
				method68(false, -105);
			if (aClass47_5066 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rca.B(" + i + ')');
		}
	}

	Class2_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, Class146 class146,
			Class177 class177) {
		super(class163_sub2_sub1);
		try {
			aClass163_Sub2_Sub1_5062 = class163_sub2_sub1;
			aClass177_5060 = class177;
			if (class146 == null
					|| !aClass177_5060.method1149(-30571)
					|| !((Class163_Sub2_Sub1) aClass163_Sub2_Sub1_5062).aBool8673)
				aClass47_5066 = null;
			else
				aClass47_5066 = (Class293.method1817(
						class146.method932("gl", "transparent_water", 0),
						aClass163_Sub2_Sub1_5062, (byte) -113, 34336));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rca.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class177 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				method78(7, -33, 24);
			((Class2) this).aClass163_Sub2_13.method3013(i ^ ~0x1573,
					(Class121.aClass314_1643), (Class380.aClass314_4960));
			anInt5061++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rca.M(" + i + ','
					+ bool + ')');
		}
	}

	static {
		anInt5065 = -1;
		aBool5069 = false;
	}
}
