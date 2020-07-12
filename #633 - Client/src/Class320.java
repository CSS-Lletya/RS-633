/* Class320 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class320 {
	private Class378 aClass378_4248;
	private Class84 aClass84_4249;
	static int anInt4250;
	static int anInt4251;
	private int anInt4252 = 1;
	private int anInt4253 = 0;
	private Class378 aClass378_4254;
	static int anInt4255;
	private boolean aBool4256;
	static int anInt4257;
	private int anInt4258 = 0;
	static int anInt4259;
	static int anInt4260;
	private Class378 aClass378_4261;
	static int anInt4262;
	static int anInt4263;
	private Class163_Sub3 aClass163_Sub3_4264;
	private int anInt4265 = 1;
	static int anInt4266;
	static int anInt4267;
	private Class11_Sub45_Sub4 aClass11_Sub45_Sub4_4268;
	private boolean aBool4269;
	private int anInt4270;
	private boolean aBool4271;
	private Class321_Sub3[] aClass321_Sub3Array4272;
	private int anInt4273;
	private boolean aBool4274;
	private Class321_Sub3 aClass321_Sub3_4275;
	private boolean aBool4276;
	private Class11_Sub45_Sub4 aClass11_Sub45_Sub4_4277;
	private boolean aBool4278;

	final boolean method1942(Class11_Sub35 class11_sub35, int i) {
		try {
			anInt4266++;
			if (aClass378_4248 != null) {
				if (class11_sub35.method2837(67)
						|| class11_sub35.method2839((byte) -22)) {
					aClass84_4249.method589((byte) -13, class11_sub35);
					method1948(0);
					if (method1950((byte) 57)) {
						if (anInt4252 != -1 && anInt4265 != -1)
							class11_sub35.method2842(anInt4252, anInt4265,
									i ^ 0x2cb1);
						((Class11_Sub35) class11_sub35).aBool7012 = true;
						return true;
					}
				}
				method1944(31218, class11_sub35);
			}
			if (i != 0)
				return false;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sw.G("
					+ (class11_sub35 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	final boolean method1943(int i) {
		try {
			anInt4251++;
			int i_0_ = 36 / ((-42 - i) / 62);
			if (aClass378_4248 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sw.I(" + i + ')');
		}
	}

	final void method1944(int i, Class11_Sub35 class11_sub35) {
		do {
			try {
				((Class11_Sub35) class11_sub35).aBool7012 = false;
				anInt4262++;
				class11_sub35.method2843(-16008);
				class11_sub35.method122(-76);
				method1948(0);
				if (i == 31218)
					break;
				method1943(-7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("sw.C(" + i + ','
						+ (class11_sub35 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method1945(int i) {
		try {
			aClass321_Sub3Array4272 = null;
			aClass321_Sub3_4275 = null;
			anInt4263++;
			aClass11_Sub45_Sub4_4268 = null;
			aClass378_4248 = aClass378_4261 = aClass378_4254 = null;
			aClass11_Sub45_Sub4_4277 = null;
			if (!aClass84_4249.method576((byte) 27)) {
				for (Class11 class11 = aClass84_4249.method584(-12261); class11 != ((Class84) aClass84_4249).aClass11_1149; class11 = ((Class11) class11).aClass11_88)
					((Class11_Sub35) class11).method2843(-16008);
			}
			anInt4252 = anInt4265 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sw.D(" + i + ')');
		}
	}

	static final boolean method1946(int i, int i_1_, byte i_2_) {
		try {
			anInt4257++;
			if (i_2_ != 68)
				return false;
			if (!Class180.method1178(i_2_ ^ 0x4c, i_1_, i)
					&& !Class108_Sub19.method2891(i, i_1_, -87))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sw.B(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method1947(boolean bool) {
		try {
			anInt4260++;
			if (aBool4256) {
				if (aClass378_4261 != null) {
					int i = 16384;
					aClass163_Sub3_4264.method3273(0, aClass378_4261);
					aClass163_Sub3_4264.method3320(aClass378_4254, 1);
					aClass378_4261.method2212(0, -1);
					aClass378_4254.method2214(0, 87);
					if (aBool4276)
						i |= 0x100;
					OpenGL.glBlitFramebufferEXT(0, 0, anInt4252, anInt4265, 0,
							0, anInt4252, anInt4265, i, 9728);
					aClass163_Sub3_4264.method3287(aClass378_4261, (byte) 2);
					aClass163_Sub3_4264.method3280(-30670, aClass378_4254);
				}
				aClass163_Sub3_4264.method3244(2);
				aClass163_Sub3_4264.method3283(1, 0);
				aClass163_Sub3_4264.method3260(1, (byte) 17);
				aClass163_Sub3_4264.la();
				int i = 0;
				int i_3_ = 1;
				Class11_Sub35 class11_sub35;
				for (Class11_Sub35 class11_sub35_4_ = (Class11_Sub35) aClass84_4249
						.method584(-12261); class11_sub35_4_ != null; class11_sub35_4_ = class11_sub35) {
					class11_sub35 = (Class11_Sub35) aClass84_4249
							.method578(-15361);
					int i_5_ = class11_sub35_4_.method2841(-4867);
					for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_++) {
						class11_sub35_4_.method2846(aClass321_Sub3Array4272[i],
								aClass321_Sub3_4275, i_6_, (byte) 112);
						if (class11_sub35 != null || i_5_ - 1 != i_6_) {
							aClass378_4254.method2214(i_3_, 59);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) anInt4265);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, anInt4265);
							OpenGL.glTexCoord2f((float) anInt4252, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(anInt4252, anInt4265);
							OpenGL.glTexCoord2f((float) anInt4252,
									(float) anInt4265);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(anInt4252, 0);
							OpenGL.glEnd();
						} else {
							aClass163_Sub3_4264.method3282(aClass378_4254,
									(byte) -127);
							aClass163_Sub3_4264.method3325(0, 0, 8448);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) anInt4265);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(anInt4253, anInt4258);
							OpenGL.glTexCoord2f(0.0F, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(anInt4253, anInt4265 + anInt4258);
							OpenGL.glTexCoord2f((float) anInt4252, 0.0F);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(anInt4253 + anInt4252, anInt4265
									+ anInt4258);
							OpenGL.glTexCoord2f((float) anInt4252,
									(float) anInt4265);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(anInt4252 + anInt4253, anInt4258);
							OpenGL.glEnd();
						}
						i_3_ = 0x1 & i_3_ + 1;
						i = i + 1 & 0x1;
						class11_sub35_4_.method2836(0, i_6_);
					}
				}
				aBool4256 = bool;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sw.A(" + bool + ')');
		}
	}

	private final void method1948(int i) {
		do {
			try {
				anInt4255++;
				boolean bool = false;
				int i_7_ = 0;
				int i_8_ = i;
				for (Class11_Sub35 class11_sub35 = (Class11_Sub35) aClass84_4249
						.method584(-12261); class11_sub35 != null; class11_sub35 = (Class11_Sub35) aClass84_4249
						.method578(-15361)) {
					int i_9_ = class11_sub35.method2844((byte) 48);
					if (i_9_ > i_7_)
						i_7_ = i_9_;
					i_8_ += class11_sub35.method2841(-4867);
					bool |= class11_sub35.method2838(i ^ 0x2);
				}
				int i_10_;
				if (i_7_ != 2) {
					if (i_7_ != 1)
						i_10_ = 6408;
					else
						i_10_ = 34842;
				} else
					i_10_ = 34836;
				if ((i_10_ ^ 0xffffffff) != (anInt4273 ^ 0xffffffff)) {
					aBool4274 = true;
					anInt4273 = i_10_;
				}
				int i_11_ = (anInt4270 ^ 0xffffffff) >= -3 ? anInt4270 : 2;
				int i_12_ = i_8_ <= 2 ? i_8_ : 2;
				if ((i_12_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff))
					aBool4269 = aBool4274 = true;
				anInt4270 = i_8_;
				if (!aBool4276 != bool)
					break;
				aBool4276 = bool;
				aBool4271 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sw.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1949(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		try {
			anInt4250++;
			if (aClass378_4248 == null || aClass84_4249.method576((byte) 27))
				return false;
			if (i_13_ != anInt4252 || i_14_ != anInt4265) {
				anInt4265 = i_14_;
				anInt4252 = i_13_;
				for (Class11 class11 = aClass84_4249.method584(-12261); class11 != ((Class84) aClass84_4249).aClass11_1149; class11 = ((Class11) class11).aClass11_88)
					((Class11_Sub35) class11).method2842(anInt4252, anInt4265,
							11441);
				aBool4271 = true;
				aBool4274 = true;
				aBool4269 = true;
			}
			if (method1950((byte) 57)) {
				anInt4258 = i;
				aBool4256 = true;
				anInt4253 = i_15_;
				aClass163_Sub3_4264.method3246((byte) -77, aClass378_4248);
				aClass378_4248.method2214(0, -87);
				aClass163_Sub3_4264
						.method3325(
								-anInt4253,
								(anInt4258 + anInt4265 + -(((Class163_Sub3) aClass163_Sub3_4264).anInt8141)),
								8448);
				return true;
			}
			if (i_16_ > -95)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sw.E(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	private final boolean method1950(byte i) {
		try {
			anInt4267++;
			if (aBool4271) {
				if (aClass11_Sub45_Sub4_4268 != null) {
					aClass11_Sub45_Sub4_4268.method3390((byte) 97);
					aClass11_Sub45_Sub4_4268 = null;
				}
				if (aClass321_Sub3_4275 != null) {
					aClass321_Sub3_4275.method1952(true);
					aClass321_Sub3_4275 = null;
				}
				if (aClass378_4261 != null)
					aClass11_Sub45_Sub4_4268 = new Class11_Sub45_Sub4(
							aClass163_Sub3_4264, 6402, anInt4252, anInt4265,
							(((Class163_Sub3) aClass163_Sub3_4264).anInt8265));
				if (aBool4276)
					aClass321_Sub3_4275 = new Class321_Sub3(
							aClass163_Sub3_4264, 34037, 6402, anInt4252,
							anInt4265);
				else if (aClass11_Sub45_Sub4_4268 == null)
					aClass11_Sub45_Sub4_4268 = new Class11_Sub45_Sub4(
							aClass163_Sub3_4264, 6402, anInt4252, anInt4265);
				aBool4271 = false;
				aBool4269 = true;
				aBool4278 = true;
			}
			if (aBool4274) {
				if (aClass11_Sub45_Sub4_4277 != null) {
					aClass11_Sub45_Sub4_4277.method3390((byte) 81);
					aClass11_Sub45_Sub4_4277 = null;
				}
				if (aClass321_Sub3Array4272[0] != null) {
					aClass321_Sub3Array4272[0].method1952(true);
					aClass321_Sub3Array4272[0] = null;
				}
				if (aClass321_Sub3Array4272[1] != null) {
					aClass321_Sub3Array4272[1].method1952(true);
					aClass321_Sub3Array4272[1] = null;
				}
				if (aClass378_4261 != null)
					aClass11_Sub45_Sub4_4277 = new Class11_Sub45_Sub4(
							aClass163_Sub3_4264, anInt4273, anInt4252,
							anInt4265,
							(((Class163_Sub3) aClass163_Sub3_4264).anInt8265));
				aClass321_Sub3Array4272[0] = new Class321_Sub3(
						aClass163_Sub3_4264, 34037, anInt4273, anInt4252,
						anInt4265);
				aClass321_Sub3Array4272[1] = (anInt4270 > 1 ? new Class321_Sub3(
						aClass163_Sub3_4264, 34037, anInt4273, anInt4252,
						anInt4265) : null);
				aBool4269 = true;
				aBool4274 = false;
				aBool4278 = true;
			}
			if (aBool4269) {
				if (aClass378_4261 == null) {
					aClass163_Sub3_4264.method3246((byte) -122, aClass378_4254);
					aClass378_4254.method2216(1, 0);
					aClass378_4254.method2216(1, 1);
					aClass378_4254.method2216(i ^ 0x38, 8);
					aClass378_4254.method2220(0, i ^ 0x39,
							aClass321_Sub3Array4272[0]);
					if ((anInt4270 ^ 0xffffffff) < -2)
						aClass378_4254.method2220(1, 0,
								aClass321_Sub3Array4272[1]);
					if (aBool4276)
						aClass378_4254.method2220(8, 0, aClass321_Sub3_4275);
					else
						aClass378_4254.method2217(8, 1,
								aClass11_Sub45_Sub4_4268);
					aClass163_Sub3_4264.method3282(aClass378_4254, (byte) -128);
				} else {
					aClass163_Sub3_4264.method3246((byte) -58, aClass378_4254);
					aClass378_4254.method2216(1, 0);
					aClass378_4254.method2216(i - 56, 1);
					aClass378_4254.method2216(1, 8);
					aClass378_4254.method2220(0, i - 57,
							aClass321_Sub3Array4272[0]);
					if (anInt4270 > 1)
						aClass378_4254.method2220(1, i ^ 0x39,
								aClass321_Sub3Array4272[1]);
					if (aBool4276)
						aClass378_4254.method2220(8, 0, aClass321_Sub3_4275);
					aClass163_Sub3_4264.method3282(aClass378_4254, (byte) -128);
					aClass163_Sub3_4264.method3246((byte) -81, aClass378_4261);
					aClass378_4261.method2216(i ^ 0x38, 0);
					aClass378_4261.method2216(i - 56, 8);
					aClass378_4261.method2217(0, 1, aClass11_Sub45_Sub4_4277);
					aClass378_4261.method2217(8, i - 56,
							aClass11_Sub45_Sub4_4268);
					aClass163_Sub3_4264.method3282(aClass378_4261, (byte) -128);
				}
				aBool4269 = false;
				aBool4278 = true;
			}
			if (aBool4278) {
				aClass163_Sub3_4264.method3246((byte) -125, aClass378_4248);
				aBool4278 = !aClass378_4248.method2210((byte) -116);
				aClass163_Sub3_4264.method3282(aClass378_4248, (byte) -127);
			}
			if (i != 57)
				method1950((byte) 65);
			if (aBool4278)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sw.F(" + i + ')');
		}
	}

	Class320(Class163_Sub3 class163_sub3) {
		aClass84_4249 = new Class84();
		anInt4270 = 0;
		aClass321_Sub3Array4272 = new Class321_Sub3[2];
		aBool4271 = true;
		aBool4269 = true;
		aBool4274 = true;
		anInt4273 = -1;
		aBool4276 = false;
		aBool4278 = true;
		do {
			try {
				aClass163_Sub3_4264 = class163_sub3;
				if (!((Class163_Sub3) aClass163_Sub3_4264).aBool8341
						|| !((Class163_Sub3) aClass163_Sub3_4264).aBool8389)
					break;
				aClass378_4248 = aClass378_4254 = new Class378(
						aClass163_Sub3_4264);
				if (((Class163_Sub3) aClass163_Sub3_4264).anInt8265 <= 1
						|| !((Class163_Sub3) aClass163_Sub3_4264).aBool8357
						|| !((Class163_Sub3) aClass163_Sub3_4264).aBool8392)
					break;
				aClass378_4248 = aClass378_4261 = new Class378(
						aClass163_Sub3_4264);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sw.<init>("
						+ (class163_sub3 != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}
}
