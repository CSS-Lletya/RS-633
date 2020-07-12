/* Class236_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class236_Sub7 extends Class236 {
	static int anInt6970;
	static int anInt6971;
	static int anInt6972;
	static int anInt6973;
	static int anInt6974;
	static int anInt6975;
	static int anInt6976 = -1;
	static Object anObject6977;
	private boolean aBool6978 = false;
	private boolean aBool6979;
	static int anInt6980;
	private Class321_Sub1[] aClass321_Sub1Array6981;
	static int anInt6982;
	private Class337 aClass337_6983;

	final boolean method1500(byte i) {
		try {
			int i_0_ = -56 % ((-9 - i) / 53);
			anInt6970++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oh.D(" + i + ')');
		}
	}

	final void method1505(boolean bool, boolean bool_1_) {
		try {
			if (bool != true)
				method2826((byte) 83);
			do {
				if (aClass337_6983 == null || !bool_1_) {
					((Class236) this).aClass163_Sub3_3222.method3317(34168, 0,
							770, (byte) 75);
					if (!client.aBool10531)
						break;
				}
				if (!aBool6979) {
					((Class236) this).aClass163_Sub3_3222.method3253(2, true);
					((Class236) this).aClass163_Sub3_3222
							.method3295(
									(((Class163_Sub3) ((Class236) this).aClass163_Sub3_3222).aClass321_Sub3_8321),
									67);
					((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				}
				aClass337_6983.method2026(-96, '\0');
				aBool6978 = true;
			} while (false);
			anInt6982++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oh.H(" + bool + ','
					+ bool_1_ + ')');
		}
	}

	final void method1508(int i, boolean bool) {
		try {
			if (i == 17660) {
				((Class236) this).aClass163_Sub3_3222.method3315(false, 8448,
						7681);
				anInt6971++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oh.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1506(int i, int i_2_, int i_3_) {
		do {
			try {
				if (i_2_ < 72)
					method1505(true, true);
				anInt6972++;
				if (!aBool6978)
					break;
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(
						aClass321_Sub1Array6981[i - 1], 102);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("oh.B(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1504(int i, int i_4_, Class321 class321) {
		try {
			int i_5_ = -72 % ((i_4_ - 52) / 62);
			anInt6973++;
			((Class236) this).aClass163_Sub3_3222.method3295(class321, 81);
			((Class236) this).aClass163_Sub3_3222.method3260(i, (byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("oh.I(" + i + ',' + i_4_ + ','
									+ (class321 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1502(int i) {
		try {
			do {
				if (!aBool6978) {
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) -89);
					if (!client.aBool10531)
						break;
				}
				if (!aBool6979) {
					((Class236) this).aClass163_Sub3_3222.method3253(2, true);
					((Class236) this).aClass163_Sub3_3222.method3295(null, 97);
				}
				((Class236) this).aClass163_Sub3_3222.method3253(1, true);
				((Class236) this).aClass163_Sub3_3222.method3295(null, 44);
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				aClass337_6983.method2026(-35, '\001');
				aBool6978 = false;
			} while (false);
			anInt6980++;
			if (i <= 74)
				method1502(-69);
			((Class236) this).aClass163_Sub3_3222.method3315(false, 8448, 8448);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oh.C(" + i + ')');
		}
	}

	public static void method2825(byte i) {
		do {
			try {
				anObject6977 = null;
				if (i == 52)
					break;
				method2825((byte) -52);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "oh.K(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method2826(byte i) {
		try {
			anInt6974++;
			aClass337_6983 = new Class337(
					((Class236) this).aClass163_Sub3_3222, 2);
			aClass337_6983.method2028(0, 111);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			OpenGL.glTexGeni(8192, 9472, 34065);
			OpenGL.glTexGeni(8193, 9472, 34065);
			OpenGL.glTexGeni(8194, 9472, 34065);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			OpenGL.glMatrixMode(5888);
			if (aBool6979) {
				((Class236) this).aClass163_Sub3_3222.method3315(false, 260,
						7681);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0,
						770, 5890);
				((Class236) this).aClass163_Sub3_3222.method3317(34167, 0, 770,
						(byte) 71);
			} else {
				((Class236) this).aClass163_Sub3_3222.method3315(false, 7681,
						8448);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0,
						768, 34168);
				((Class236) this).aClass163_Sub3_3222.method3253(2, true);
				((Class236) this).aClass163_Sub3_3222.method3315(false, 260,
						7681);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 0,
						768, 34168);
				((Class236) this).aClass163_Sub3_3222.method3252((byte) 34, 1,
						770, 34168);
				((Class236) this).aClass163_Sub3_3222.method3317(34167, 0, 770,
						(byte) -106);
			}
			((Class236) this).aClass163_Sub3_3222.method3253(0, true);
			aClass337_6983.method2027(-50135600);
			aClass337_6983.method2028(1, 95);
			((Class236) this).aClass163_Sub3_3222.method3253(1, true);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			if (i > 104) {
				OpenGL.glMatrixMode(5888);
				if (!aBool6979) {
					((Class236) this).aClass163_Sub3_3222.method3315(false,
							8448, 8448);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 5890);
					((Class236) this).aClass163_Sub3_3222.method3253(2, true);
					((Class236) this).aClass163_Sub3_3222.method3315(false,
							8448, 8448);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 5890);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							1, 768, 34168);
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) 110);
				} else {
					((Class236) this).aClass163_Sub3_3222.method3315(false,
							8448, 8448);
					((Class236) this).aClass163_Sub3_3222.method3252((byte) 34,
							0, 768, 5890);
					((Class236) this).aClass163_Sub3_3222.method3317(5890, 0,
							770, (byte) -111);
				}
				((Class236) this).aClass163_Sub3_3222.method3253(0, true);
				aClass337_6983.method2027(-50135600);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oh.J(" + i + ')');
		}
	}

	Class236_Sub7(Class163_Sub3 class163_sub3) {
		super(class163_sub3);
		do {
			try {
				if (!((Class163_Sub3) class163_sub3).aBool8369)
					break;
				aBool6979 = ((Class163_Sub3) class163_sub3).anInt8344 < 3;
				int i = !aBool6979 ? 127 : 48;
				byte[][] is = new byte[6][4096];
				byte[][] is_6_ = new byte[6][4096];
				byte[][] is_7_ = new byte[6][4096];
				int i_8_ = 0;
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -65; i_9_++) {
					for (int i_10_ = 0; i_10_ < 64; i_10_++) {
						float f = -1.0F + (float) i_10_ * 2.0F / 64.0F;
						float f_11_ = 2.0F * (float) i_9_ / 64.0F - 1.0F;
						float f_12_ = (float) (1.0 / Math.sqrt((double) (f_11_
								* f_11_ + (f * f + 1.0F))));
						f_11_ *= f_12_;
						f *= f_12_;
						for (int i_13_ = 0; i_13_ < 6; i_13_++) {
							float f_14_;
							if ((i_13_ ^ 0xffffffff) == -1)
								f_14_ = -f;
							else if ((i_13_ ^ 0xffffffff) == -2)
								f_14_ = f;
							else if (i_13_ != 2) {
								if ((i_13_ ^ 0xffffffff) == -4)
									f_14_ = -f_11_;
								else if (i_13_ != 4)
									f_14_ = -f_12_;
								else
									f_14_ = f_12_;
							} else
								f_14_ = f_11_;
							int i_15_;
							int i_16_;
							int i_17_;
							if (f_14_ > 0.0F) {
								i_15_ = (int) (Math.pow((double) f_14_, 96.0) * (double) i);
								i_16_ = (int) ((double) i * Math.pow(
										(double) f_14_, 36.0));
								i_17_ = (int) ((double) i * Math.pow(
										(double) f_14_, 12.0));
							} else
								i_15_ = i_16_ = i_17_ = 0;
							is_6_[i_13_][i_8_] = (byte) i_15_;
							is_7_[i_13_][i_8_] = (byte) i_16_;
							is[i_13_][i_8_] = (byte) i_17_;
						}
						i_8_++;
					}
				}
				aClass321_Sub1Array6981 = new Class321_Sub1[3];
				aClass321_Sub1Array6981[0] = new Class321_Sub1(
						((Class236) this).aClass163_Sub3_3222, 6406, 64, false,
						is_6_, 6406);
				aClass321_Sub1Array6981[1] = new Class321_Sub1(
						((Class236) this).aClass163_Sub3_3222, 6406, 64, false,
						is_7_, 6406);
				aClass321_Sub1Array6981[2] = new Class321_Sub1(
						((Class236) this).aClass163_Sub3_3222, 6406, 64, false,
						is, 6406);
				method2826((byte) 113);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "oh.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
