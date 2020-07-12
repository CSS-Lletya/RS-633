/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class300 {
	static int anInt4042;
	long aLong4043;
	static IncomingPacket aClass160_4044 = new IncomingPacket(78, 11);
	private Class163_Sub2_Sub1 aClass163_Sub2_Sub1_4045;
	static int anInt4046;
	static int anInt4047;
	static Class40 aClass40_4048;
	static int anInt4049;
	static int anInt4050 = 0;
	static int anInt4051 = 104;
	static Class253 aClass253_4052;
	static int anInt4053;

	protected final void finalize() throws Throwable {
		try {
			anInt4047++;
			aClass163_Sub2_Sub1_4045.method3401(((Class300) this).aLong4043,
					(byte) -111);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rd.finalize(" + ')');
		}
	}

	Class300(Class163_Sub2_Sub1 class163_sub2_sub1, long l, Class274[] class274s) {
		try {
			aClass163_Sub2_Sub1_4045 = class163_sub2_sub1;
			((Class300) this).aLong4043 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rd.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + l
					+ ',' + (class274s != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1852(int i, String string, String string_0_,
			int i_1_, String string_2_, String string_3_, int i_4_) {
		do {
			try {
				anInt4053++;
				Class153.method958(string, i_4_, i_1_, true, null, -1,
						string_3_, string_2_, string_0_);
				if (i <= -69)
					break;
				method1853(-46);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("rd.A(" + i + ','
								+ (string != null ? "{...}" : "null") + ','
								+ (string_0_ != null ? "{...}" : "null") + ','
								+ i_1_ + ','
								+ (string_2_ != null ? "{...}" : "null") + ','
								+ (string_3_ != null ? "{...}" : "null") + ','
								+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1853(int i) {
		do {
			try {
				aClass160_4044 = null;
				aClass40_4048 = null;
				aClass253_4052 = null;
				if (i == 0)
					break;
				anInt4051 = 93;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rd.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1854(byte i, IComponentDefinitions[] class192s,
			int i_5_, int i_6_, boolean bool, int i_7_) {
		try {
			anInt4042++;
			if (i >= -83)
				aClass253_4052 = null;
			for (int i_8_ = 0; class192s.length > i_8_; i_8_++) {
				IComponentDefinitions class192 = class192s[i_8_];
				if (class192 != null
						&& ((IComponentDefinitions) class192).anInt2593 == i_6_) {
					Class376_Sub1.method2277(class192, i_5_, (byte) 126, i_7_,
							bool);
					Class57.method452(126, i_5_, class192, i_7_);
					if (((IComponentDefinitions) class192).anInt2561 > (((IComponentDefinitions) class192).anInt2522 + -((IComponentDefinitions) class192).anInt2610))
						((IComponentDefinitions) class192).anInt2561 = (((IComponentDefinitions) class192).anInt2522 + -((IComponentDefinitions) class192).anInt2610);
					if (((((IComponentDefinitions) class192).anInt2484 + -((IComponentDefinitions) class192).anInt2546) ^ 0xffffffff) > (((IComponentDefinitions) class192).anInt2588 ^ 0xffffffff))
						((IComponentDefinitions) class192).anInt2588 = (((IComponentDefinitions) class192).anInt2484 + -((IComponentDefinitions) class192).anInt2546);
					if (((IComponentDefinitions) class192).anInt2561 < 0)
						((IComponentDefinitions) class192).anInt2561 = 0;
					if ((((IComponentDefinitions) class192).anInt2588 ^ 0xffffffff) > -1)
						((IComponentDefinitions) class192).anInt2588 = 0;
					if ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -1)
						Class130.method843(bool, true, class192);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rd.B(" + i + ','
					+ (class192s != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ i_6_ + ',' + bool + ',' + i_7_ + ')'));
		}
	}
}
