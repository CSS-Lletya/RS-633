/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class144 {
	static Class66 aClass66_1934 = new Class66("game3", 2);
	Interface3 anInterface3_1935;
	Interface3 anInterface3_1936;
	boolean aBool1937;
	static int anInt1938;
	static int anInt1939;
	static int anInt1940;
	boolean aBool1941;
	static int anInt1942;
	static Class259[] aClass259Array1943;
	static int anInt1944;

	final boolean method902(byte i) {
		try {
			anInt1942++;
			if (i > -23)
				return false;
			if (!((Class144) this).aBool1937 || ((Class144) this).aBool1941)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.B(" + i + ')');
		}
	}

	static final void method903(int i) {
		try {
			anInt1938++;
			synchronized (Class11_Sub2_Sub12.aClass131Array8873) {
				for (int i_0_ = i; ((Class11_Sub2_Sub12.aClass131Array8873.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					Class11_Sub2_Sub12.aClass131Array8873[i_0_] = new Class131();
					Class11_Sub37.anIntArray7090[i_0_] = 0;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.A(" + i + ')');
		}
	}

	public static void method904(int i) {
		try {
			aClass259Array1943 = null;
			if (i == -5949)
				aClass66_1934 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.E(" + i + ')');
		}
	}

	static final void method905(Class364[][][] class364s, int i) {
		try {
			anInt1940++;
			for (int i_1_ = i; (class364s.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				Class364[][] class364s_2_ = class364s[i_1_];
				for (int i_3_ = 0; class364s_2_.length > i_3_; i_3_++) {
					for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (class364s_2_[i_3_].length ^ 0xffffffff)); i_4_++) {
						Class364 class364 = class364s_2_[i_3_][i_4_];
						if (class364 != null) {
							if (((Class364) class364).aClass376_Sub7_Sub2_4777 instanceof Interface13)
								((Interface13) (((Class364) class364).aClass376_Sub7_Sub2_4777))
										.method43((byte) -62);
							if (((Class364) class364).aClass376_Sub7_Sub4_4778 instanceof Interface13)
								((Interface13) (((Class364) class364).aClass376_Sub7_Sub4_4778))
										.method43((byte) -62);
							if (((Class364) class364).aClass376_Sub7_Sub4_4789 instanceof Interface13)
								((Interface13) (((Class364) class364).aClass376_Sub7_Sub4_4789))
										.method43((byte) -62);
							if (((Class364) class364).aClass376_Sub7_Sub3_4780 instanceof Interface13)
								((Interface13) (((Class364) class364).aClass376_Sub7_Sub3_4780))
										.method43((byte) -62);
							if (((Class364) class364).aClass376_Sub7_Sub3_4776 instanceof Interface13)
								((Interface13) (((Class364) class364).aClass376_Sub7_Sub3_4776))
										.method43((byte) -62);
							for (Class140 class140 = ((Class364) class364).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
								Class376_Sub7_Sub5 class376_sub7_sub5 = (((Class140) class140).aClass376_Sub7_Sub5_1896);
								if (class376_sub7_sub5 instanceof Interface13)
									((Interface13) class376_sub7_sub5)
											.method43((byte) -62);
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.C("
					+ (class364s != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class144(boolean bool) {
		try {
			((Class144) this).aBool1941 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.<init>(" + bool
					+ ')');
		}
	}

	final void method906(int i) {
		try {
			if (i > -121)
				method905(null, -87);
			if (((Class144) this).anInterface3_1935 != null)
				((Class144) this).anInterface3_1935.method8(5342);
			anInt1939++;
			((Class144) this).aBool1937 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fk.D(" + i + ')');
		}
	}
}
