/* Class2_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub10 extends Class2 {
	static Class84 aClass84_7920 = new Class84();
	static int anInt7921;
	static int anInt7922;
	static int anInt7923;
	static float aFloat7924;
	static Class11_Sub45_Sub5 aClass11_Sub45_Sub5_7925;
	static int anInt7926;
	static int anInt7927;
	static int anInt7928;
	private boolean aBool7929 = false;

	public static void method3191(int i) {
		do {
			try {
				aClass84_7920 = null;
				aClass11_Sub45_Sub5_7925 = null;
				if (i > 30)
					break;
				aClass84_7920 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vk.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class2_Sub10(Class163_Sub2 class163_sub2) {
		super(class163_sub2);
	}

	final boolean method75(int i) {
		try {
			anInt7926++;
			if (i < 19)
				aBool7929 = false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vk.B(" + i + ')');
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				aClass84_7920 = null;
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					Class188.aClass314_2424, Class121.aClass314_1643);
			anInt7927++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vk.M(" + i + ','
					+ bool + ')');
		}
	}

	final void method78(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ <= 91)
				method67((byte) -4);
			anInt7922++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vk.J(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method70(Interface15 interface15, int i, int i_2_) {
		try {
			anInt7923++;
			if (i_2_ == 3) {
				((Class2) this).aClass163_Sub2_13.method3094(interface15, -2);
				((Class2) this).aClass163_Sub2_13.method3037((byte) 107, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vk.I("
					+ (interface15 != null ? "{...}" : "null") + ',' + i + ','
					+ i_2_ + ')'));
		}
	}

	final void method67(byte i) {
		try {
			do {
				if (aBool7929) {
					((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
					((Class2) this).aClass163_Sub2_13.method2990(
							Class168.aClass174_2155, -1);
					((Class2) this).aClass163_Sub2_13.method3013(-30,
							Class188.aClass314_2424, Class188.aClass314_2424);
					((Class2) this).aClass163_Sub2_13.method3095((byte) -56,
							Class68.aClass218_962, 2);
					((Class2) this).aClass163_Sub2_13.method2993(
							Class11_Sub45_Sub12.aClass218_9187, 0, 256);
					((Class2) this).aClass163_Sub2_13.method3048((byte) -122);
					((Class2) this).aClass163_Sub2_13.method3094(null, -2);
					((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
					aBool7929 = false;
					if (!client.aBool10531)
						break;
				}
				((Class2) this).aClass163_Sub2_13.method2993(
						Class11_Sub45_Sub12.aClass218_9187, 0, 256);
			} while (false);
			anInt7928++;
			int i_3_ = -4 % ((-26 - i) / 56);
			((Class2) this).aClass163_Sub2_13.method3013(-30,
					Class188.aClass314_2424, Class188.aClass314_2424);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vk.E(" + i + ')');
		}
	}

	final void method68(boolean bool, int i) {
		try {
			if (i > -64)
				method3191(125);
			anInt7921++;
			Interface12 interface12 = ((Class2) this).aClass163_Sub2_13
					.method2972(31);
			if (interface12 == null || !bool)
				((Class2) this).aClass163_Sub2_13.method2993(
						Class345.aClass218_4579, 0, 256);
			else {
				((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3094(interface12, -2);
				((Class2) this).aClass163_Sub2_13.method2990(
						Class63.aClass174_921, -1);
				((Class2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2) this).aClass163_Sub2_13.method3013(-30,
						Class11_Sub2_Sub19.aClass314_9092,
						Class121.aClass314_1643);
				((Class2) this).aClass163_Sub2_13.method3089(false,
						Class6.aClass218_42, 2, true, false);
				((Class2) this).aClass163_Sub2_13.method2993(
						Class345.aClass218_4579, 0, 256);
				Class33_Sub2 class33_sub2 = ((Class2) this).aClass163_Sub2_13
						.method2975(127);
				class33_sub2.method2749(
						((Class2) this).aClass163_Sub2_13.method3047(0), -3603);
				((Class2) this).aClass163_Sub2_13.method2989((byte) 95,
						Class39.aClass240_554);
				((Class2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				aBool7929 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vk.G(" + bool + ','
					+ i + ')');
		}
	}
}
