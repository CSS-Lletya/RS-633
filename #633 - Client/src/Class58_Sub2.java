/* Class58_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class58_Sub2 extends Class58 {
	private int anInt7834;
	private byte[] aByteArray7835;
	static int anInt7836;
	private int anInt7837;
	private int anInt7838;
	static int anInt7839;
	private int anInt7840;
	private int anInt7841;
	static int anInt7842;
	static int anInt7843;
	static int anInt7844;
	static int anInt7845;
	private int anInt7846;
	private int anInt7847;
	static int anInt7848;
	static int anInt7849;
	static int anInt7850;
	static Class298 aClass298_7851 = new Class298("", 17);
	private int anInt7852;
	static int anInt7853;

	void method3151(boolean bool, byte i, int i_0_) {
		try {
			if (bool == true) {
				aByteArray7835[i_0_] = i;
				anInt7844++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ub.C(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	Class58_Sub2(int i, int i_1_, int i_2_, int i_3_, int i_4_, float f,
			float f_5_, float f_6_) {
		super(i, i_1_, i_2_, i_3_, i_4_);
		try {
			anInt7840 = (int) (4096.0F * f_6_);
			anInt7852 = (int) (4096.0F * f_5_);
			anInt7847 = anInt7838 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ub.<init>(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + f
					+ ',' + f_5_ + ',' + f_6_ + ')'));
		}
	}

	static final void method3152(int i) {
		try {
			Class139.aClass84_1890.method586((byte) -19);
			anInt7848++;
			Class11_Sub43.anInt7337 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.G(" + i + ')');
		}
	}

	static final void method3153(int i, int i_7_, int i_8_, boolean bool,
			int i_9_, boolean bool_10_, int i_11_) {
		do {
			try {
				if (i_8_ != 28048)
					method3154(121, -11);
				anInt7843++;
				if ((i_9_ ^ 0xffffffff) >= (i_11_ ^ 0xffffffff))
					break;
				int i_12_ = (i_9_ + i_11_) / 2;
				int i_13_ = i_11_;
				Class195_Sub1 class195_sub1 = Class65.aClass195_Sub1Array940[i_12_];
				Class65.aClass195_Sub1Array940[i_12_] = Class65.aClass195_Sub1Array940[i_9_];
				Class65.aClass195_Sub1Array940[i_9_] = class195_sub1;
				for (int i_14_ = i_11_; (i_9_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
					if (Class11_Sub5.method2312(i_7_, bool_10_, 1, bool, i,
							class195_sub1,
							(Class65.aClass195_Sub1Array940[i_14_])) <= 0) {
						Class195_Sub1 class195_sub1_15_ = Class65.aClass195_Sub1Array940[i_14_];
						Class65.aClass195_Sub1Array940[i_14_] = Class65.aClass195_Sub1Array940[i_13_];
						Class65.aClass195_Sub1Array940[i_13_++] = class195_sub1_15_;
					}
				}
				Class65.aClass195_Sub1Array940[i_9_] = Class65.aClass195_Sub1Array940[i_13_];
				Class65.aClass195_Sub1Array940[i_13_] = class195_sub1;
				method3153(i, i_7_, i_8_, bool, -1 + i_13_, bool_10_, i_11_);
				method3153(i, i_7_, 28048, bool, i_9_, bool_10_, i_13_ + 1);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ub.H(" + i + ','
						+ i_7_ + ',' + i_8_ + ',' + bool + ',' + i_9_ + ','
						+ bool_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3154(int i, int i_16_) {
		try {
			Class11_Sub45_Sub16_Sub2.aClass22_10164
					.method182(i_16_, (byte) -73);
			if (i == 4096)
				anInt7842++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.D(" + i + ','
					+ i_16_ + ')');
		}
	}

	final void method454(byte i) {
		try {
			if (i != 58)
				method453(-9, 96, 70);
			anInt7841 >>= 4;
			anInt7847 = anInt7838;
			anInt7845++;
			do {
				if (anInt7841 < 0) {
					anInt7841 = 0;
					if (!client.aBool10531)
						break;
				}
				if ((anInt7841 ^ 0xffffffff) < -256)
					anInt7841 = 255;
			} while (false);
			method3151(true, (byte) anInt7841, anInt7837++);
			anInt7841 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.E(" + i + ')');
		}
	}

	public static void method3155(int i) {
		try {
			if (i != -26913)
				anInt7839 = 93;
			aClass298_7851 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.J(" + i + ')');
		}
	}

	static final String method3156(int i, Stream stream, int i_17_) {
		try {
			anInt7850++;
			if (i < 106)
				return null;
			try {
				int i_18_ = stream.readSmart(-91);
				if ((i_17_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff))
					i_18_ = i_17_;
				byte[] is = new byte[i_18_];
				((Stream) stream).position += Class314.aClass78_4169.method538(
						(((Stream) stream).buffer), 0,
						(((Stream) stream).position), is, i_18_, 0);
				String string = Class11_Sub45_Sub20_Sub2.method3941(is, 0, 63,
						i_18_);
				return string;
			} catch (Exception exception) {
				return "Cabbage";
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ub.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_17_ + ')'));
		}
	}

	final void method461(int i) {
		try {
			anInt7853++;
			if (i == 3) {
				anInt7841 = 0;
				anInt7837 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.I(" + i + ')');
		}
	}

	final void method453(int i, int i_19_, int i_20_) {
		try {
			if (i_20_ != -101)
				anInt7847 = 125;
			anInt7836++;
			if ((i ^ 0xffffffff) != -1) {
				anInt7846 = anInt7840 * anInt7834 >> 12;
				do {
					if ((anInt7846 ^ 0xffffffff) <= -1) {
						if (anInt7846 <= 4096)
							break;
						anInt7846 = 4096;
						if (!client.aBool10531)
							break;
					}
					anInt7846 = 0;
				} while (false);
				anInt7834 = anInt7852 - (i_19_ >= 0 ? i_19_ : -i_19_);
				anInt7834 = anInt7834 * anInt7834 >> 12;
				anInt7834 = anInt7834 * anInt7846 >> 12;
				anInt7841 += anInt7834 * anInt7847 >> 12;
				anInt7847 = anInt7838 * anInt7847 >> 12;
			} else {
				anInt7834 = -(i_19_ >= 0 ? i_19_ : -i_19_) + anInt7852;
				anInt7846 = 4096;
				anInt7834 = anInt7834 * anInt7834 >> 12;
				anInt7841 = anInt7834;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ub.A(" + i + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}

	static final void method3157(Class146 class146, byte i) {
		try {
			Class239_Sub1.aClass146_7269 = class146;
			if (i != 106)
				method3156(114, null, -11);
			anInt7849++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ub.F("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
