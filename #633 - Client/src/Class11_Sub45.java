/* Class11_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class11_Sub45 extends Class11 {
	Class11_Sub45 aClass11_Sub45_7902;
	Class11_Sub45 aClass11_Sub45_7903;
	long aLong7904;
	static int anInt7905 = 0;
	static int anInt7906;
	static boolean[] aBoolArray7907 = new boolean[100];
	static int anInt7908;

	public Class11_Sub45() {
		/* empty */
	}

	public static void method3185(int i) {
		do {
			try {
				aBoolArray7907 = null;
				if (i == 0)
					break;
				method3188(null, -73, 11, -96, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "kha.AA(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method3186(byte i) {
		try {
			anInt7908++;
			if (((Class11_Sub45) this).aClass11_Sub45_7902 == null)
				return false;
			if (i != 64)
				return true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kha.W(" + i + ')');
		}
	}

	final void method3187(int i) {
		try {
			anInt7906++;
			if (((Class11_Sub45) this).aClass11_Sub45_7902 != null) {
				if (i != 100)
					aBoolArray7907 = null;
				((Class11_Sub45) ((Class11_Sub45) this).aClass11_Sub45_7902).aClass11_Sub45_7903 = ((Class11_Sub45) this).aClass11_Sub45_7903;
				((Class11_Sub45) ((Class11_Sub45) this).aClass11_Sub45_7903).aClass11_Sub45_7902 = ((Class11_Sub45) this).aClass11_Sub45_7902;
				((Class11_Sub45) this).aClass11_Sub45_7902 = null;
				((Class11_Sub45) this).aClass11_Sub45_7903 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kha.P(" + i + ')');
		}
	}

	static final boolean method3188(Class11_Sub45_Sub1 class11_sub45_sub1,
			int i, int i_0_, int i_1_, boolean[] bools) {
		boolean bool = false;
		if (Class315.aClass12Array4179 != Class234_Sub1_Sub1.aClass12Array9729) {
			int i_2_ = Class11_Sub2_Sub38.aClass12Array9796[i].method130(i_1_,
					i_0_, 109);
			int i_3_ = 0;
			for (/**/; i_3_ <= i; i_3_++) {
				Class12 class12 = Class11_Sub2_Sub38.aClass12Array9796[i_3_];
				if (class12 != null) {
					int i_4_ = i_2_ - class12.method130(i_1_, i_0_, 122);
					if (bools != null) {
						bools[i_3_] = class12.method128(class11_sub45_sub1,
								i_0_, i_4_, i_1_, 0, false);
						if (!bools[i_3_])
							continue;
					}
					class12.CA(class11_sub45_sub1, i_0_, i_4_, i_1_, 0, false);
					bool = true;
				}
			}
		}
		return bool;
	}
}
