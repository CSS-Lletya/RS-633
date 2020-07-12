/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
	static int anInt388;
	private Class146 aClass146_389;
	static int anInt390;
	static int anInt391;
	static IncomingPacket aClass160_392 = new IncomingPacket(112, 6);
	static int anInt393;
	Class146 aClass146_394;
	static int anInt395;
	static int anInt396;
	static Class146 aClass146_397;
	static int anInt398;
	static int anInt399;
	private Class22 aClass22_400 = new Class22(64);
	Class22 aClass22_401 = new Class22(64);

	static final void method245(int i, int i_0_, Class42 class42, int i_1_,
			int i_2_) {
		try {
			if (i_2_ == 16131) {
				anInt391++;
				for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class332.aClass84_4407
						.method584(-12261)); class11_sub19 != null; class11_sub19 = (Class11_Sub19) Class332.aClass84_4407
						.method578(-15361)) {
					if (i == ((Class11_Sub19) class11_sub19).anInt5823
							&& (((Class11_Sub19) class11_sub19).anInt5828 == i_1_ << 9)
							&& (i_0_ << 9 == ((Class11_Sub19) class11_sub19).anInt5814)
							&& ((((Class42) class42).anInt693 ^ 0xffffffff) == (((Class42) (((Class11_Sub19) class11_sub19).aClass42_5840)).anInt693 ^ 0xffffffff))) {
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830) != null) {
							Class233.aClass11_Sub6_Sub1_3185
									.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
							((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
						}
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838) != null) {
							Class233.aClass11_Sub6_Sub1_3185
									.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838);
							((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5838 = null;
						}
						class11_sub19.method122(-87);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aia.A(" + i + ','
					+ i_0_ + ',' + (class42 != null ? "{...}" : "null") + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method246(int i) {
		try {
			anInt390++;
			synchronized (aClass22_400) {
				aClass22_400.method189((byte) -22);
				if (i != 2060105417)
					((Class29) this).aClass22_401 = null;
			}
			synchronized (((Class29) this).aClass22_401) {
				((Class29) this).aClass22_401.method189((byte) 76);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aia.H(" + i + ')');
		}
	}

	final Class152 method247(int i, int i_3_) {
		try {
			if (i != 9)
				aClass22_400 = null;
			anInt395++;
			Class152 class152;
			synchronized (aClass22_400) {
				class152 = (Class152) aClass22_400.method188((long) i_3_,
						(byte) 86);
			}
			if (class152 != null)
				return class152;
			byte[] is;
			synchronized (aClass146_389) {
				is = aClass146_389.method930(i_3_, (byte) 112, 34);
			}
			class152 = new Class152();
			((Class152) class152).aClass29_2015 = this;
			if (is != null)
				class152.method953(new Stream(is), i + 248098343);
			synchronized (aClass22_400) {
				aClass22_400.method184((byte) 124, class152, (long) i_3_);
			}
			return class152;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aia.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	public static void method248(byte i) {
		do {
			try {
				aClass160_392 = null;
				aClass146_397 = null;
				if (i >= 10)
					break;
				method253(36, -7);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "aia.I(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method249(int i, int i_4_) {
		if (Class11_Sub50_Sub2.aShortArrayArray9079 != null)
			return Class11_Sub50_Sub2.aShortArrayArray9079[i][i_4_] & 0xffff;
		return 0;
	}

	final void method250(int i, byte i_5_) {
		try {
			synchronized (aClass22_400) {
				aClass22_400.method182(i, (byte) -73);
			}
			if (i_5_ < -65) {
				anInt388++;
				synchronized (((Class29) this).aClass22_401) {
					((Class29) this).aClass22_401.method182(i, (byte) -73);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aia.E(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method251(int i, int i_6_, int i_7_) {
		try {
			if (i == 2060105417) {
				aClass22_400 = new Class22(i_6_);
				anInt399++;
				((Class29) this).aClass22_401 = new Class22(i_7_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aia.D(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	final void method252(int i) {
		try {
			synchronized (aClass22_400) {
				if (i >= -21)
					return;
				aClass22_400.method190(0);
			}
			anInt393++;
			synchronized (((Class29) this).aClass22_401) {
				((Class29) this).aClass22_401.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aia.C(" + i + ')');
		}
	}

	static final boolean method253(int i, int i_8_) {
		try {
			if (i_8_ < 72)
				aClass160_392 = null;
			anInt396++;
			if ((i ^ 0xffffffff) != -8 && i != 9)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aia.F(" + i + ','
					+ i_8_ + ')');
		}
	}

	Class29(Class66 class66, int i, Class146 class146, Class146 class146_9_) {
		try {
			((Class29) this).aClass146_394 = class146_9_;
			aClass146_389 = class146;
			aClass146_389.method914(34, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aia.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_9_ != null ? "{...}" : "null") + ')'));
		}
	}
}
