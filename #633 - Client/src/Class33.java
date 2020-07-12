/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class33 {
	static Class9 aClass9_454 = new Class9(9, 2);
	static int anInt455;
	static int anInt456;
	static int anInt457;

	public static void method285(boolean bool) {
		try {
			if (bool != true)
				method291(116);
			aClass9_454 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nga.OA(" + bool + ')');
		}
	}

	abstract void method286(int i);

	abstract void method287(int i, int i_0_, int i_1_, int[] is);

	abstract void method288(int i);

	abstract void method289();

	static final Class9[] method290(byte i) {
		try {
			if (i < 101)
				anInt456 = -14;
			anInt455++;
			return (new Class9[] { Class291.aClass9_3944,
					Class107.aClass9_1440, Class15.aClass9_131,
					Class70.aClass9_983, Class11_Sub49.aClass9_8019,
					Class265.aClass9_3610, Class117.aClass9_1594,
					Class209.aClass9_2843, Class11_Sub45_Sub2.aClass9_8504,
					aClass9_454 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nga.PA(" + i + ')');
		}
	}

	static final void method291(int i) {
		do {
			try {
				anInt457++;
				if ((Class141.anInt1915 ^ 0xffffffff) == -2
						|| (Class141.anInt1915 ^ 0xffffffff) == -4
						|| (Class141.anInt1915 != Class103.anInt1383 && (Class141.anInt1915 == 0 || Class103.anInt1383 == 0))) {
					Class108_Sub17.anInt6619 = 0;
					Class23.anInt249 = 0;
					Class11_Sub2_Sub25.aClass213_9322.method1364((byte) 69);
				}
				Class103.anInt1383 = Class141.anInt1915;
				if (i < -51)
					break;
				aClass9_454 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "nga.QA(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract Class33 method292();

	abstract void method293(int i);

	abstract void method294(int i, int i_2_, int i_3_, int[] is);

	abstract void method295(int i, int i_4_, int i_5_, int[] is);

	abstract void method296(Class33 class33_6_);

	abstract void method297(int i);

	abstract void method298(int i);

	abstract void method299(int i, int i_7_, int i_8_);

	abstract void method300(int i, int i_9_, int i_10_, int i_11_, int i_12_,
			int i_13_);

	abstract void method301(int i, int i_14_, int i_15_);

	abstract void method302(int[] is);

	abstract void method303(int i);

	public Class33() {
		/* empty */
	}
}
