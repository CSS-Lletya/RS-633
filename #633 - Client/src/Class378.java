/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class378 implements Interface24 {
	static int anInt4919;
	static int anInt4920;
	static IncomingPacket aClass160_4921 = new IncomingPacket(43, 4);
	private int anInt4922;
	static int anInt4923;
	private int anInt4924 = 0;
	static int anInt4925;
	private int anInt4926;
	static int anInt4927;
	private Class163_Sub3 aClass163_Sub3_4928;
	static int anInt4929;
	static int anInt4930;
	private int anInt4931;
	static int anInt4932;
	private int anInt4933 = -1;
	private Interface18[] anInterface18Array4934 = new Interface18[9];
	static int anInt4935 = 0;
	static int anInt4936;
	static int anInt4937;
	static int anInt4938;
	static int anInt4939;
	static int anInt4940;
	static int[] anIntArray4941 = new int[128];
	static int anInt4942;
	static int anInt4943;
	static int anInt4944;
	static int anInt4945;
	private int anInt4946;
	static OutgoingPacket aClass370_4947;

	final boolean method2210(byte i) {
		try {
			anInt4927++;
			if (i != -116)
				anInt4924 = 115;
			int i_0_ = OpenGL.glCheckFramebufferStatusEXT(anInt4933);
			if ((i_0_ ^ 0xffffffff) != -36054)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.N(" + i + ')');
		}
	}

	private final int method2211(int i) {
		try {
			anInt4932++;
			if ((anInt4924 & 0x4) != 0)
				return 36160;
			if (i != 36160)
				return -78;
			if ((anInt4924 & 0x2) != 0)
				return 36009;
			if ((anInt4924 & 0x1 ^ 0xffffffff) != -1)
				return 36008;
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.A(" + i + ')');
		}
	}

	public final void method8(int i) {
		try {
			anInt4920++;
			OpenGL.glBindFramebufferEXT(36008, 0);
			if (i == 30226) {
				anInt4924 &= ~0x1;
				anInt4933 = method2211(36160);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.C(" + i + ')');
		}
	}

	public final void method37(boolean bool) {
		do {
			try {
				OpenGL.glBindFramebufferEXT(36008, anInt4946);
				anInt4938++;
				anInt4924 |= 0x1;
				anInt4933 = method2211(36160);
				if (bool == true)
					break;
				method37(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gia.J(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public final void method39(int i) {
		try {
			anInt4944++;
			OpenGL.glBindFramebufferEXT(36160, anInt4946);
			anInt4924 |= 0x4;
			if (i != -23783)
				method2215(101, 37, 47, null);
			anInt4933 = method2211(i ^ ~0xd1a6);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.Q(" + i + ')');
		}
	}

	public final void method52(byte i) {
		try {
			anInt4925++;
			if (i == 30) {
				OpenGL.glBindFramebufferEXT(36009, 0);
				anInt4924 &= ~0x2;
				anInt4933 = method2211(i ^ 0x8d5e);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.O(" + i + ')');
		}
	}

	final void method2212(int i, int i_1_) {
		try {
			anInt4942++;
			if (anInt4933 == i_1_)
				throw new RuntimeException();
			OpenGL.glReadBuffer(Class51.anIntArray793[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.I(" + i + ','
					+ i_1_ + ')');
		}
	}

	public final void method53(int i) {
		do {
			try {
				anInt4930++;
				OpenGL.glBindFramebufferEXT(36009, anInt4946);
				anInt4924 |= 0x2;
				anInt4933 = method2211(36160);
				if (i == -6521)
					break;
				method2211(-87);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gia.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void method54(boolean bool) {
		try {
			anInt4937++;
			OpenGL.glBindFramebufferEXT(36160, 0);
			if (bool != true)
				anIntArray4941 = null;
			anInt4924 &= ~0x4;
			anInt4933 = method2211(36160);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.F(" + bool + ')');
		}
	}

	private final void method2213(int i, int i_2_, int i_3_, int i_4_,
			Class321_Sub1 class321_sub1) {
		try {
			anInt4919++;
			if (anInt4933 == -1)
				throw new RuntimeException();
			int i_5_ = 1 << i_2_;
			if (((i_5_ ^ 0xffffffff) & anInt4931 ^ 0xffffffff) != -1) {
				if (((Class321_Sub1) class321_sub1).anInt6630 != anInt4926
						|| anInt4922 != ((Class321_Sub1) class321_sub1).anInt6630)
					throw new RuntimeException();
			} else {
				anInt4922 = ((Class321_Sub1) class321_sub1).anInt6630;
				anInt4926 = ((Class321_Sub1) class321_sub1).anInt6630;
			}
			class321_sub1.method2739(Class51.anIntArray793[i_2_], i, false,
					i_4_, anInt4933);
			anInterface18Array4934[i_2_] = class321_sub1;
			anInt4931 |= i_5_;
			int i_6_ = -50 / ((i_3_ + 39) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gia.M(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ (class321_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt4929++;
			aClass163_Sub3_4928.method3313(0, anInt4946);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.finalize(" + ')');
		}
	}

	final void method2214(int i, int i_7_) {
		try {
			int i_8_ = -97 % ((i_7_ + 17) / 42);
			anInt4945++;
			if ((anInt4933 ^ 0xffffffff) == 0)
				throw new RuntimeException();
			OpenGL.glDrawBuffer(Class51.anIntArray793[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.P(" + i + ','
					+ i_7_ + ')');
		}
	}

	final void method2215(int i, int i_9_, int i_10_,
			Class321_Sub1 class321_sub1) {
		try {
			if (i == 19658) {
				method2213(i_10_, i_9_, i - 19739, 0, class321_sub1);
				anInt4939++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gia.E(" + i + ','
					+ i_9_ + ',' + i_10_ + ','
					+ (class321_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2216(int i, int i_11_) {
		try {
			anInt4943++;
			if (anInterface18Array4934[i_11_] != null)
				anInterface18Array4934[i_11_].method8(i ^ ~0x5b);
			anInt4931 &= i << i_11_ ^ 0xffffffff;
			anInterface18Array4934[i_11_] = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.B(" + i + ','
					+ i_11_ + ')');
		}
	}

	final void method2217(int i, int i_12_,
			Class11_Sub45_Sub4 class11_sub45_sub4) {
		try {
			anInt4940++;
			if (anInt4933 == -1)
				throw new RuntimeException();
			int i_13_ = i_12_ << i;
			if ((anInt4931 & (i_13_ ^ 0xffffffff)) != 0) {
				if (((anInt4926 ^ 0xffffffff) != (((Class11_Sub45_Sub4) class11_sub45_sub4).anInt8536 ^ 0xffffffff))
						|| (((Class11_Sub45_Sub4) class11_sub45_sub4).anInt8543 ^ 0xffffffff) != (anInt4922 ^ 0xffffffff))
					throw new RuntimeException();
			} else {
				anInt4922 = ((Class11_Sub45_Sub4) class11_sub45_sub4).anInt8543;
				anInt4926 = ((Class11_Sub45_Sub4) class11_sub45_sub4).anInt8536;
			}
			class11_sub45_sub4.method3387(anInt4933, (byte) 125,
					Class51.anIntArray793[i]);
			anInterface18Array4934[i] = class11_sub45_sub4;
			anInt4931 |= i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gia.D(" + i + ','
					+ i_12_ + ','
					+ (class11_sub45_sub4 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2218(int i, Class321_Sub3 class321_sub3,
			int i_14_, int i_15_) {
		try {
			anInt4936++;
			if ((anInt4933 ^ 0xffffffff) == 0)
				throw new RuntimeException();
			int i_16_ = i_15_ << i;
			if ((anInt4931 & (i_16_ ^ 0xffffffff) ^ 0xffffffff) != -1) {
				if (((Class321_Sub3) class321_sub3).anInt7016 != anInt4926
						|| ((Class321_Sub3) class321_sub3).anInt7022 != anInt4922)
					throw new RuntimeException();
			} else {
				anInt4922 = ((Class321_Sub3) class321_sub3).anInt7022;
				anInt4926 = ((Class321_Sub3) class321_sub3).anInt7016;
			}
			class321_sub3.method2849(Class51.anIntArray793[i], anInt4933, -1,
					i_14_);
			anInterface18Array4934[i] = class321_sub3;
			anInt4931 |= i_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gia.K(" + i + ','
					+ (class321_sub3 != null ? "{...}" : "null") + ',' + i_14_
					+ ',' + i_15_ + ')'));
		}
	}

	Class378(Class163_Sub3 class163_sub3) {
		try {
			if (!((Class163_Sub3) class163_sub3).aBool8341)
				throw new IllegalStateException("");
			aClass163_Sub3_4928 = class163_sub3;
			OpenGL.glGenFramebuffersEXT(1, Class365.anIntArray4790, 0);
			anInt4946 = Class365.anIntArray4790[0];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2219(int i) {
		try {
			aClass160_4921 = null;
			if (i > 100) {
				aClass370_4947 = null;
				anIntArray4941 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gia.H(" + i + ')');
		}
	}

	final void method2220(int i, int i_17_, Class321_Sub3 class321_sub3) {
		try {
			anInt4923++;
			method2218(i, class321_sub3, i_17_, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("gia.L("
									+ i
									+ ','
									+ i_17_
									+ ','
									+ (class321_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		for (int i = 0; i < anIntArray4941.length; i++)
			anIntArray4941[i] = -1;
		for (int i = 65; (i ^ 0xffffffff) >= -91; i++)
			anIntArray4941[i] = -65 + i;
		for (int i = 97; (i ^ 0xffffffff) >= -123; i++)
			anIntArray4941[i] = i - 71;
		for (int i = 48; i <= 57; i++)
			anIntArray4941[i] = 52 + i - 48;
		anIntArray4941[42] = anIntArray4941[43] = 62;
		anIntArray4941[45] = anIntArray4941[47] = 63;
		aClass370_4947 = new OutgoingPacket(65, -1);
	}
}
