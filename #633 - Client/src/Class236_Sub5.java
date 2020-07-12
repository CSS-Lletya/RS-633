/* Class236_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub5 extends Class236 {
	static int anInt6843;
	static Class22 aClass22_6844;
	private Class337 aClass337_6845;
	private Class299 aClass299_6846;
	static int anInt6847;
	static boolean aBool6848 = true;
	static int anInt6849;
	static int anInt6850;
	static int anInt6851;
	static int anInt6852;
	static int anInt6853;
	static int[] anIntArray6854;
	static int anInt6855;

	final void method1506(int i, int i_0_, int i_1_) {
		try {
			anInt6853++;
			float f = -5.0E-4F * (float) ((i & 0x3) + 1);
			float f_2_ = 5.0E-4F * (float) (1 + ((i & 0x18) >> 3));
			float f_3_ = (i & 0x40 ^ 0xffffffff) == -1 ? 4.8828125E-4F
					: 9.765625E-4F;
			boolean bool = (0x80 & i) != 0;
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			if (bool) {
				Class120.aFloatArray1627[2] = 0.0F;
				Class120.aFloatArray1627[1] = 0.0F;
				Class120.aFloatArray1627[3] = 0.0F;
				Class120.aFloatArray1627[0] = f_3_;
			} else {
				Class120.aFloatArray1627[0] = 0.0F;
				Class120.aFloatArray1627[2] = f_3_;
				Class120.aFloatArray1627[1] = 0.0F;
				Class120.aFloatArray1627[3] = 0.0F;
			}
			OpenGL.glTexGenfv(8192, 9474, Class120.aFloatArray1627, 0);
			if (i_0_ > 72) {
				Class120.aFloatArray1627[3] = f
						* (float) (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273)
						% 1.0F;
				Class120.aFloatArray1627[0] = 0.0F;
				Class120.aFloatArray1627[2] = 0.0F;
				Class120.aFloatArray1627[1] = f_3_;
				OpenGL.glTexGenfv(8193, 9474, Class120.aFloatArray1627, 0);
				if (((Class299) aClass299_6846).aBool4034) {
					Class120.aFloatArray1627[3] = (f_2_
							* (float) (((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).anInt8273) % 1.0F);
					Class120.aFloatArray1627[2] = 0.0F;
					Class120.aFloatArray1627[1] = 0.0F;
					Class120.aFloatArray1627[0] = 0.0F;
					OpenGL.glTexGenfv(8194, 9473, Class120.aFloatArray1627, 0);
				} else {
					int i_4_ = (int) (f_2_
							* (float) (((Class163_Sub3) (((Class236) this).aClass163_Sub3_3222)).anInt8273) * 16.0F);
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									(((Class299) aClass299_6846).aClass321_Sub3Array4032[i_4_ % 16]),
									119);
				}
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ln.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1504(int i, int i_5_, Class321 class321) {
		try {
			((Class236) this).aClass163_Sub3_3222.method3295(class321, 53);
			anInt6850++;
			int i_6_ = 8 / ((52 - i_5_) / 62);
			((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("ln.I(" + i + ',' + i_5_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1505(boolean bool, boolean bool_7_) {
		do {
			try {
				anInt6847++;
				if (bool != true)
					method1504(-21, 5, null);
				aClass337_6845.method2026(-17, '\0');
				if (!((Class299) aClass299_6846).aBool4034)
					break;
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(
						((Class299) aClass299_6846).aClass321_Sub2_4036, 77);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ln.H(" + bool
						+ ',' + bool_7_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method2784(boolean bool) {
		do {
			try {
				anIntArray6854 = null;
				aClass22_6844 = null;
				if (bool == true)
					break;
				anInt6855 = 91;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ln.J(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method1502(int i) {
		do {
			try {
				aClass337_6845.method2026(-38, '\001');
				anInt6843++;
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 37);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				if (i > 74)
					break;
				method1506(76, -114, -16);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ln.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class236_Sub5(Class163_Sub3 class163_sub3, Class299 class299) {
		super(class163_sub3);
		try {
			aClass299_6846 = class299;
			aClass337_6845 = new Class337(class163_sub3, 2);
			aClass337_6845.method2028(0, 102);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			if (((Class299) aClass299_6846).aBool4034) {
				OpenGL.glTexGeni(8194, 9472, 9217);
				OpenGL.glEnable(3170);
			}
			OpenGL.glTexGeni(8192, 9472, 9216);
			OpenGL.glTexGeni(8193, 9472, 9216);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			aClass337_6845.method2027(-50135600);
			aClass337_6845.method2028(1, 119);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			if (((Class299) aClass299_6846).aBool4034)
				OpenGL.glDisable(3170);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			aClass337_6845.method2027(-50135600);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ln.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (class299 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method1500(byte i) {
		try {
			int i_8_ = 105 % ((i + 9) / 53);
			anInt6852++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ln.D(" + i + ')');
		}
	}

	static final void method2785(int[] is, int[] is_9_, int i,
			Npc class376_sub7_sub5_sub5_sub2,
			int[] is_10_) {
		try {
			anInt6851++;
			if (i != -1)
				method2785(null, null, 50, null, null);
			for (int i_11_ = 0; (is_10_.length ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
				int i_12_ = is_10_[i_11_];
				int i_13_ = is_9_[i_11_];
				int i_14_ = is[i_11_];
				for (int i_15_ = 0; ((i_13_ ^ 0xffffffff) != -1 && i_15_ < (((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342).length); i_15_++) {
					if ((0x1 & i_13_) != 0) {
						if (i_12_ != -1) {
							Class281 class281 = Class108_Sub23.aClass198_7760
									.method1284(i_12_, (byte) -64);
							int i_16_ = ((Class281) class281).anInt3816;
							Class208 class208 = (((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342[i_15_]);
							if (class208 != null) {
								if ((i_12_ ^ 0xffffffff) != (((Class208) class208).anInt2807 ^ 0xffffffff)) {
									if ((((Class281) class281).anInt3792 ^ 0xffffffff) <= (((Class281) (Class108_Sub23.aClass198_7760
											.method1284(
													((Class208) class208).anInt2807,
													(byte) -75))).anInt3792 ^ 0xffffffff))
										class208 = ((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342[i_15_] = null;
								} else if ((i_16_ ^ 0xffffffff) == -1)
									class208 = ((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342[i_15_] = null;
								else if (i_16_ == 1) {
									((Class208) class208).anInt2803 = 1;
									((Class208) class208).anInt2809 = i_14_;
									((Class208) class208).anInt2805 = 0;
									((Class208) class208).anInt2804 = 0;
									((Class208) class208).anInt2810 = 0;
									if (!((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)
										Class268.method1690(i + -701644943, 0,
												class376_sub7_sub5_sub5_sub2,
												class281);
								} else if ((i_16_ ^ 0xffffffff) == -3)
									((Class208) class208).anInt2804 = 0;
							}
							if (class208 == null) {
								class208 = ((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342[i_15_] = new Class208();
								((Class208) class208).anInt2804 = 0;
								((Class208) class208).anInt2809 = i_14_;
								((Class208) class208).anInt2803 = 1;
								((Class208) class208).anInt2810 = 0;
								((Class208) class208).anInt2807 = i_12_;
								((Class208) class208).anInt2805 = 0;
								if (!((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)
									Class268.method1690(-701644944, 0,
											class376_sub7_sub5_sub5_sub2,
											class281);
							}
						} else
							((Actor) class376_sub7_sub5_sub5_sub2).aClass208Array10342[i_15_] = null;
					}
					i_13_ >>>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ln.K("
					+ (is != null ? "{...}" : "null") + ','
					+ (is_9_ != null ? "{...}" : "null") + ',' + i + ','
					+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}" : "null")
					+ ',' + (is_10_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1508(int i, boolean bool) {
		do {
			try {
				anInt6849++;
				if (i == 17660)
					break;
				method1502(7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ln.A(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass22_6844 = new Class22(8);
		anIntArray6854 = new int[25];
		anInt6855 = 0;
	}
}
