/* Class11_Sub45_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub19 extends Class11_Sub45 {
	static int anInt9694;
	int anInt9695;
	String aString9696;
	static int anInt9697;
	int anInt9698;
	boolean aBool9699;
	int anInt9700 = 12800;
	static int anInt9701;
	int anInt9702;
	static int anInt9703;
	int anInt9704 = -1;
	String aString9705;
	Class84 aClass84_9706;
	static Class146 aClass146_9707;
	static int anInt9708;
	int anInt9709;
	static int anInt9710;
	static boolean[] aBoolArray9711 = new boolean[5];
	static int anInt9712;
	int anInt9713;
	int anInt9714;
	static int anInt9715;

	final void method3814(int i) {
		try {
			anInt9694++;
			((Class11_Sub45_Sub19) this).anInt9700 = 12800;
			((Class11_Sub45_Sub19) this).anInt9709 = 12800;
			((Class11_Sub45_Sub19) this).anInt9702 = 0;
			((Class11_Sub45_Sub19) this).anInt9713 = i;
			for (Class11_Sub32 class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method584(-12261); class11_sub32 != null; class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method578(i ^ ~0x3c00)) {
				if ((((Class11_Sub45_Sub19) this).anInt9713 ^ 0xffffffff) > (((Class11_Sub32) class11_sub32).anInt6883 ^ 0xffffffff))
					((Class11_Sub45_Sub19) this).anInt9713 = ((Class11_Sub32) class11_sub32).anInt6883;
				if (((Class11_Sub45_Sub19) this).anInt9709 > ((Class11_Sub32) class11_sub32).anInt6875)
					((Class11_Sub45_Sub19) this).anInt9709 = ((Class11_Sub32) class11_sub32).anInt6875;
				if (((Class11_Sub45_Sub19) this).anInt9700 > ((Class11_Sub32) class11_sub32).anInt6888)
					((Class11_Sub45_Sub19) this).anInt9700 = ((Class11_Sub32) class11_sub32).anInt6888;
				if ((((Class11_Sub32) class11_sub32).anInt6885 ^ 0xffffffff) < (((Class11_Sub45_Sub19) this).anInt9702 ^ 0xffffffff))
					((Class11_Sub45_Sub19) this).anInt9702 = ((Class11_Sub32) class11_sub32).anInt6885;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vg.D(" + i + ')');
		}
	}

	static final int method3815(int i, int i_0_) {
		try {
			if (i != 0)
				return -94;
			anInt9710++;
			return i_0_ >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vg.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	final boolean method3816(int i, int[] is, int i_1_, byte i_2_) {
		try {
			anInt9708++;
			for (Class11_Sub32 class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method584(-12261); class11_sub32 != null; class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method578(-15361)) {
				if (class11_sub32.method2789(i_1_, i, 101)) {
					class11_sub32.method2790(i, i_1_, is, -9528);
					return true;
				}
			}
			if (i_2_ <= 40)
				((Class11_Sub45_Sub19) this).aString9705 = null;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("vg.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final boolean method3817(int i, int[] is, int i_3_, int i_4_) {
		try {
			anInt9697++;
			for (Class11_Sub32 class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method584(-12261); class11_sub32 != null; class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method578(-15361)) {
				if (class11_sub32.method2787(i_4_, i_3_, (byte) 90)) {
					class11_sub32.method2793(is, i_3_, 0, i_4_);
					return true;
				}
			}
			if (i > -76)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("vg.G(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final boolean method3818(int i, int i_5_, byte i_6_, int i_7_, int[] is) {
		try {
			anInt9715++;
			if (i_6_ != 21)
				aBoolArray9711 = null;
			for (Class11_Sub32 class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method584(-12261); class11_sub32 != null; class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method578(-15361)) {
				if (class11_sub32.method2792(i_5_, i_7_, i, (byte) -107)) {
					class11_sub32.method2790(i_5_, i_7_, is, i_6_ ^ ~0x2522);
					return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vg.I(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3819(int i, int i_8_, int i_9_) {
		try {
			anInt9703++;
			for (Class11_Sub32 class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method584(i_8_ ^ ~0x1de4); class11_sub32 != null; class11_sub32 = (Class11_Sub32) ((Class11_Sub45_Sub19) this).aClass84_9706
					.method578(-15361)) {
				if (class11_sub32.method2789(i, i_9_, 103))
					return true;
			}
			if (i_8_ != 12800)
				method3820(85, 37, false);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vg.H(" + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final boolean method3820(int i, int i_10_, boolean bool) {
		try {
			anInt9701++;
			if (bool != false)
				aClass146_9707 = null;
			if ((0x20 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vg.A(" + i + ','
					+ i_10_ + ',' + bool + ')'));
		}
	}

	public static void method3821(byte i) {
		try {
			aBoolArray9711 = null;
			int i_11_ = 57 / ((i - 45) / 42);
			aClass146_9707 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vg.C(" + i + ')');
		}
	}

	static final void method3822(int i, int i_12_) {
		try {
			anInt9712++;
			if (i_12_ != -1 && Class256.aBoolArray3505[i_12_]) {
				if (i != 0)
					method3820(-29, -62, true);
				Class47.aClass146_746.method910(-124, i_12_);
				Class11_Sub45_Sub5.aClass192ArrayArray8772[i_12_] = null;
				Canvas_Sub1.aClass192ArrayArray9228[i_12_] = null;
				Class256.aBoolArray3505[i_12_] = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vg.J(" + i + ','
					+ i_12_ + ')');
		}
	}

	static final void method3823(Class376_Sub7_Sub5 class376_sub7_sub5,
			boolean bool) {
		for (int i = ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626; i <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9624; i++) {
			for (int i_13_ = ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629; i_13_ <= ((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9620; i_13_++) {
				Class364 class364 = (Class181.aClass364ArrayArrayArray2336[((Class376_Sub7) class376_sub7_sub5).aByte7047][i][i_13_]);
				if (class364 != null) {
					Class140 class140 = ((Class364) class364).aClass140_4781;
					Class140 class140_14_ = null;
					for (/**/; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
						if (((Class140) class140).aClass376_Sub7_Sub5_1896 == class376_sub7_sub5) {
							if (class140_14_ != null)
								((Class140) class140_14_).aClass140_1895 = ((Class140) class140).aClass140_1895;
							else
								((Class364) class364).aClass140_4781 = ((Class140) class140).aClass140_1895;
							class140.method889(-501);
							break;
						}
						class140_14_ = class140;
					}
				}
			}
		}
		if (!bool)
			Class351.method2105(class376_sub7_sub5);
	}

	Class11_Sub45_Sub19(int i, String string, String string_15_, int i_16_,
			int i_17_, boolean bool, int i_18_, int i_19_) {
		((Class11_Sub45_Sub19) this).anInt9698 = -1;
		((Class11_Sub45_Sub19) this).aBool9699 = true;
		((Class11_Sub45_Sub19) this).anInt9702 = 0;
		((Class11_Sub45_Sub19) this).anInt9713 = 0;
		((Class11_Sub45_Sub19) this).anInt9709 = 12800;
		try {
			((Class11_Sub45_Sub19) this).anInt9704 = i_18_;
			((Class11_Sub45_Sub19) this).aBool9699 = bool;
			((Class11_Sub45_Sub19) this).anInt9698 = i_17_;
			((Class11_Sub45_Sub19) this).anInt9714 = i;
			((Class11_Sub45_Sub19) this).aString9705 = string_15_;
			((Class11_Sub45_Sub19) this).anInt9695 = i_16_;
			((Class11_Sub45_Sub19) this).aString9696 = string;
			if ((((Class11_Sub45_Sub19) this).anInt9704 ^ 0xffffffff) == -256)
				((Class11_Sub45_Sub19) this).anInt9704 = 0;
			((Class11_Sub45_Sub19) this).aClass84_9706 = new Class84();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("vg.<init>(" + i + ','
							+ (string != null ? "{...}" : "null") + ','
							+ (string_15_ != null ? "{...}" : "null") + ','
							+ i_16_ + ',' + i_17_ + ',' + bool + ',' + i_18_
							+ ',' + i_19_ + ')'));
		}
	}
}
