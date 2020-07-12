/* Class335_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class335_Sub3_Sub1 extends Class335_Sub3 {
	static int anInt9412;
	static int anInt9413;
	static int anInt9414;
	static int anInt9415 = 0;
	static String[] aStringArray9416 = new String[100];
	static Class146 aClass146_9417;
	/* synthetic */static Class aClass9418;

	static final boolean method3711(String string, boolean bool) {
		try {
			if (bool != true)
				return true;
			anInt9412++;
			return Class376_Sub7_Sub5
					.method3798(-128, (aClass9418 != null ? aClass9418
							: (aClass9418 = getClassByName("Class49"))), string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pe.M("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	public static void method3712(int i) {
		do {
			try {
				aStringArray9416 = null;
				aClass146_9417 = null;
				if (i <= -95)
					break;
				aStringArray9416 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pe.L(" + i + ')');
			}
			break;
		} while (false);
	}

	Class335_Sub3_Sub1(Class146 class146, Class146 class146_0_,
			Class254_Sub2_Sub1 class254_sub2_sub1) {
		super(class146, class146_0_, (Class254_Sub2) class254_sub2_sub1);
	}

	static final void method3713(int i, int i_1_) {
		do {
			try {
				anInt9414++;
				Class195_Sub1.aClass22_6153.method182(i, (byte) -73);
				if (i_1_ == 15700)
					break;
				anInt9415 = -125;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pe.N(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	final void method3142(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			anInt9413++;
			if (i_2_ == 11) {
				int i_6_ = ((Class335_Sub3) this).aClass253_7794.method1608();
				int i_7_ = (((Class254_Sub2_Sub1) (Class254_Sub2_Sub1) ((Class335) this).aClass254_4434).anInt9494
						* Class11_Sub45_Sub20_Sub1.method3892((byte) -117) / 10 % i_6_);
				((Class335_Sub3) this).aClass253_7794.method1618(-i_6_ + i_5_
						+ i_7_, i, i_4_ + i_6_ + -i_7_, i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pe.I(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
