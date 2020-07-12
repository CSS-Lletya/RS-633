/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class236 {
	static int anInt3220;
	static int anInt3221 = 0;
	Class163_Sub3 aClass163_Sub3_3222;
	static int anInt3223;
	static Class33 aClass33_3224;

	abstract boolean method1500(byte i);

	static final void method1501(int i) {
		try {
			anInt3223++;
			if (i != 2)
				method1501(26);
			synchronized (Class207.aClass22_2795) {
				Class207.aClass22_2795.method190(i - 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mh.E(" + i + ')');
		}
	}

	abstract void method1502(int i);

	public static void method1503(int i) {
		do {
			try {
				aClass33_3224 = null;
				if (i >= 111)
					break;
				method1503(-35);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mh.G(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method1504(int i, int i_0_, Class321 class321);

	abstract void method1505(boolean bool, boolean bool_1_);

	abstract void method1506(int i, int i_2_, int i_3_);

	static final int method1507(int i, int i_4_) {
		try {
			anInt3220++;
			if (i_4_ != -11904)
				aClass33_3224 = null;
			int i_5_;
			if ((i ^ 0xffffffff) < -12001) {
				Class11_Sub2_Sub32_Sub1.method3881(i_4_ ^ 0x2e7f);
				i_5_ = 4;
			} else if ((i ^ 0xffffffff) < -5001) {
				Class11_Sub12_Sub2.method3556(1);
				i_5_ = 3;
			} else if (i <= 2000) {
				Class126.method828(i_4_ ^ ~0x2e0c, true);
				i_5_ = 1;
			} else {
				IComponentDefinitions.method1251(-65536);
				i_5_ = 2;
			}
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) != 2) {
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								2,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730));
				Class239.method1521(false, 0, 2);
			}
			Class186.method1212(i_4_ ^ ~0x618);
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mh.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	abstract void method1508(int i, boolean bool);

	Class236(Class163_Sub3 class163_sub3) {
		try {
			((Class236) this).aClass163_Sub3_3222 = class163_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mh.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
		}
	}
}
