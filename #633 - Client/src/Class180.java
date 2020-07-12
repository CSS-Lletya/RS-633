/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180 {
	static int anInt2324;
	static int anInt2325;
	static int anInt2326;
	static int anInt2327;
	static int anInt2328;
	static int anInt2329;
	static int anInt2330;
	static int anInt2331 = -50;
	static Class84 aClass84_2332 = new Class84();
	static Class65 aClass65_2333 = new Class65(8);

	static final boolean method1178(int i, int i_0_, int i_1_) {
		try {
			anInt2326++;
			if (i != 8)
				method1181(-58, -38, null, -70);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ig.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method1179(byte i) {
		try {
			anInt2324++;
			int i_2_ = Class190.anInt2446;
			int i_3_ = 6 / ((-74 - i) / 43);
			int[] is = Class6.anIntArray40;
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++) {
				Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[is[i_4_]]);
				if (class376_sub7_sub5_sub5_sub1 != null
						&& ((Actor) class376_sub7_sub5_sub5_sub1).anInt10285 > 0) {
					((Actor) class376_sub7_sub5_sub5_sub1).anInt10285--;
					if (((Actor) class376_sub7_sub5_sub5_sub1).anInt10285 == 0)
						((Actor) class376_sub7_sub5_sub5_sub1).aString10298 = null;
				}
			}
			for (int i_5_ = 0; Class23.anInt249 > i_5_; i_5_++) {
				long l = (long) Class11_Sub52.anIntArray8054[i_5_];
				Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26, l));
				if (class11_sub25 != null) {
					Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
					if ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10285 ^ 0xffffffff) < -1) {
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10285--;
						if (((Actor) class376_sub7_sub5_sub5_sub2).anInt10285 == 0)
							((Actor) class376_sub7_sub5_sub5_sub2).aString10298 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ig.H(" + i + ')');
		}
	}

	static final int method1180(Player class376_sub7_sub5_sub5_sub1, int i) {
		try {
			if (i != -23426)
				return 10;
			anInt2329++;
			int i_6_ = (((Player) class376_sub7_sub5_sub5_sub1).anInt10403);
			Class39 class39 = class376_sub7_sub5_sub5_sub1
					.method3960(i + 45242);
			if ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10291) == -1
					|| (((Actor) class376_sub7_sub5_sub5_sub1).aBool10329))
				i_6_ = ((Player) class376_sub7_sub5_sub5_sub1).anInt10428;
			else if (((((Actor) class376_sub7_sub5_sub5_sub1).anInt10291 ^ 0xffffffff) != (((Class39) class39).anInt525 ^ 0xffffffff))
					&& (((Class39) class39).anInt573 != ((Actor) class376_sub7_sub5_sub5_sub1).anInt10291)
					&& ((((Class39) class39).anInt555 ^ 0xffffffff) != (((Actor) class376_sub7_sub5_sub5_sub1).anInt10291 ^ 0xffffffff))
					&& ((((Class39) class39).anInt569 ^ 0xffffffff) != (((Actor) class376_sub7_sub5_sub5_sub1).anInt10291 ^ 0xffffffff))) {
				if ((((Actor) class376_sub7_sub5_sub5_sub1).anInt10291) == ((Class39) class39).anInt540
						|| (((Actor) class376_sub7_sub5_sub5_sub1).anInt10291 == ((Class39) class39).anInt568)
						|| (((Class39) class39).anInt546 == ((Actor) class376_sub7_sub5_sub5_sub1).anInt10291)
						|| (((Class39) class39).anInt551 == ((Actor) class376_sub7_sub5_sub5_sub1).anInt10291))
					i_6_ = ((Player) class376_sub7_sub5_sub5_sub1).anInt10392;
			} else
				i_6_ = ((Player) class376_sub7_sub5_sub5_sub1).anInt10410;
			return i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ig.A("
					+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}" : "null")
					+ ',' + i + ')'));
		}
	}

	static final void method1181(int i, int i_7_, Class163 class163, int i_8_) {
		try {
			Class11_Sub31.aClass163_6702 = class163;
			if (i_7_ < -87) {
				Class109.aClass104ArrayArray1477 = new Class104[i_8_][i];
				anInt2325++;
				if (Class249.anIntArray3440 != null)
					Class96.aClass234_1289 = Class273.method1706((byte) -102,
							Class249.anIntArray3440[2],
							Class249.anIntArray3440[3],
							Class249.anIntArray3440[4],
							Class249.anIntArray3440[5],
							Class249.anIntArray3440[0],
							Class249.anIntArray3440[1]);
				Class170.aClass104_2185 = new Class104();
				Class11_Sub2_Sub5.method3394(89);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ig.F(" + i + ','
					+ i_7_ + ',' + (class163 != null ? "{...}" : "null") + ','
					+ i_8_ + ')'));
		}
	}

	public static void method1182(int i) {
		try {
			if (i != 0)
				aClass84_2332 = null;
			aClass65_2333 = null;
			aClass84_2332 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ig.D(" + i + ')');
		}
	}

	static final Class79[] method1183(boolean bool) {
		try {
			if (bool != false)
				return null;
			anInt2330++;
			return (new Class79[] { Class163_Sub3.aClass79_8113,
					Class11_Sub39.aClass79_7216, Class379.aClass79_4948,
					Class57_Sub1.aClass79_5886, Class338.aClass79_4478,
					Class11_Sub2_Sub6.aClass79_8699, Class272.aClass79_3671,
					Class11_Sub45_Sub15.aClass79_9370,
					Applet_Sub1.aClass79_10471, Class217_Sub1.aClass79_5526,
					Class376_Sub7_Sub4.aClass79_9537,
					Class11_Sub20_Sub2.aClass79_9500, Class286.aClass79_3868,
					Class108_Sub5.aClass79_5403 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ig.E(" + bool + ')');
		}
	}

	static final void method1184(int i, int i_9_,
			IComponentDefinitions class192, boolean bool) {
		try {
			anInt2327++;
			if (class192 != null) {
				if (((IComponentDefinitions) class192).anObjectArray2493 != null) {
					Class11_Sub48 class11_sub48 = new Class11_Sub48();
					((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
					((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2493;
					Class86.method610(class11_sub48);
				}
				Class163.anInt2113 = ((IComponentDefinitions) class192).anInt2471;
				Class254_Sub3.anInt8048 = i_9_;
				Class120.anInt1631 = ((IComponentDefinitions) class192).anInt2459;
				Class11_Sub2_Sub15.anInt9021 = ((IComponentDefinitions) class192).anInt2507;
				Class11_Sub2_Sub22.anInt9206 = ((IComponentDefinitions) class192).anInt2467;
				Class204.aBool2739 = bool;
				Class322.anInt4312 = i;
				Class325.anInt4329 = ((IComponentDefinitions) class192).anInt2519;
				Class232.method1484(class192, 1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ig.B(" + i + ','
					+ i_9_ + ',' + (class192 != null ? "{...}" : "null") + ','
					+ bool + ')'));
		}
	}

	static final Class376_Sub7_Sub5 method1185(int i, int i_10_, int i_11_,
			Class var_class) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_10_][i_11_];
		if (class364 == null)
			return null;
		for (Class140 class140 = ((Class364) class364).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
			Class376_Sub7_Sub5 class376_sub7_sub5 = ((Class140) class140).aClass376_Sub7_Sub5_1896;
			if (var_class.isAssignableFrom(class376_sub7_sub5.getClass())
					&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 == i_10_)
					&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629 == i_11_))
				return class376_sub7_sub5;
		}
		return null;
	}
}
