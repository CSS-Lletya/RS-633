/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class299 {
	static Class85 aClass85_4031;
	Class321_Sub3[] aClass321_Sub3Array4032 = null;
	Class321_Sub2 aClass321_Sub2_4033 = null;
	boolean aBool4034;
	static Class66 aClass66_4035;
	Class321_Sub2 aClass321_Sub2_4036 = null;
	static boolean[] aBoolArray4037;
	static int[] anIntArray4038 = new int[4096];
	Class321_Sub3[] aClass321_Sub3Array4039;
	Class321_Sub2 aClass321_Sub2_4040 = null;
	static int anInt4041;

	Class299(Class163_Sub3 class163_sub3) {
		((Class299) this).aClass321_Sub3Array4039 = null;
		do {
			try {
				((Class299) this).aBool4034 = ((Class163_Sub3) class163_sub3).aBool8325;
				Class11_Sub21.method2561((byte) -82, class163_sub3);
				if (!((Class299) this).aBool4034) {
					((Class299) this).aClass321_Sub3Array4039 = new Class321_Sub3[16];
					for (int i = 0; i < 16; i++) {
						byte[] is = Class376_Sub1.method2272(
								Class41.anObject594, 128 * i * 256, 0, 32768);
						((Class299) this).aClass321_Sub3Array4039[i] = new Class321_Sub3(
								class163_sub3, 3553, 6410, 128, 128, true, is,
								6410, false);
					}
					((Class299) this).aClass321_Sub3Array4032 = new Class321_Sub3[16];
					for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
						byte[] is = Class376_Sub1.method2272(
								(Class236_Sub7.anObject6977), 256 * (i * 128),
								0, 32768);
						((Class299) this).aClass321_Sub3Array4032[i] = new Class321_Sub3(
								class163_sub3, 3553, 6410, 128, 128, true, is,
								6410, false);
					}
				} else {
					byte[] is = Class236_Sub9.method3122(2, false,
							Class41.anObject594);
					((Class299) this).aClass321_Sub2_4040 = new Class321_Sub2(
							class163_sub3, 6410, 128, 128, 16, is, 6410);
					is = Class236_Sub9.method3122(2, false,
							Class236_Sub7.anObject6977);
					((Class299) this).aClass321_Sub2_4036 = new Class321_Sub2(
							class163_sub3, 6410, 128, 128, 16, is, 6410);
					Class334 class334 = ((Class163_Sub3) class163_sub3).aClass334_8272;
					if (!class334.method2010(true))
						break;
					is = Class236_Sub9.method3122(2, false,
							Class273.anObject3685);
					((Class299) this).aClass321_Sub2_4033 = new Class321_Sub2(
							class163_sub3, 6408, 128, 128, 16);
					Class321_Sub2 class321_sub2 = new Class321_Sub2(
							class163_sub3, 6409, 128, 128, 16, is, 6409);
					if (!class334.method2011(2.0F, class321_sub2, 0,
							(((Class299) this).aClass321_Sub2_4033))) {
						((Class299) this).aClass321_Sub2_4033.method1952(true);
						((Class299) this).aClass321_Sub2_4033 = null;
					} else
						((Class299) this).aClass321_Sub2_4033.method1956(0);
					class321_sub2.method1952(true);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rc.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	public static void method1851(int i) {
		try {
			if (i != 16)
				aClass85_4031 = null;
			anIntArray4038 = null;
			aClass85_4031 = null;
			aBoolArray4037 = null;
			aClass66_4035 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rc.A(" + i + ')');
		}
	}

	static {
		aClass66_4035 = new Class66("game4", 3);
	}
}
