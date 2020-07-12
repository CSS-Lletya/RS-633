/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223 {
	static int anInt3049;
	static int anInt3050;
	static int anInt3051;
	private boolean aBool3052;
	static int anInt3053;
	Class146 aClass146_3054;
	static int anInt3055;
	static int anInt3056;
	static int anInt3057;
	private Class146 aClass146_3058;
	static int anInt3059;
	static int anInt3060;
	private Class22 aClass22_3061 = new Class22(64);
	int anInt3062;
	static int anInt3063;
	int anInt3064;
	Class22 aClass22_3065 = new Class22(50);
	static int[] anIntArray3066 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	Class122 aClass122_3067 = new Class122(250);
	private Class14 aClass14_3068 = new Class14();
	private String[] aStringArray3069;
	private String[] aStringArray3070;
	int anInt3071;
	private Class52 aClass52_3072;

	final Class253 method1420(Class163 class163, int i, int i_0_, int i_1_,
			Class258 class258, byte i_2_, int i_3_, int i_4_) {
		try {
			((Class14) aClass14_3068).anInt126 = i_4_;
			((Class14) aClass14_3068).anInt115 = i_3_;
			((Class14) aClass14_3068).anInt118 = i_0_;
			((Class14) aClass14_3068).aBool117 = class258 != null;
			if (i_2_ != -100)
				aStringArray3070 = null;
			((Class14) aClass14_3068).anInt127 = i;
			((Class14) aClass14_3068).anInt122 = i_1_;
			((Class14) aClass14_3068).anInt128 = ((Class163) class163).anInt2103;
			anInt3053++;
			return ((Class253) ((Class223) this).aClass122_3067.method797(0,
					aClass14_3068));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lj.A("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class258 != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method1421(boolean bool, int i) {
		try {
			anInt3050++;
			if (bool == !aBool3052) {
				aBool3052 = bool;
				if (i == 255)
					method1423(137);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.C(" + bool + ','
					+ i + ')');
		}
	}

	final void method1422(int i, byte i_5_) {
		try {
			synchronized (aClass22_3061) {
				aClass22_3061.method182(i, (byte) -73);
			}
			anInt3051++;
			synchronized (((Class223) this).aClass22_3065) {
				((Class223) this).aClass22_3065.method182(i, (byte) -73);
			}
			synchronized (((Class223) this).aClass122_3067) {
				if (i_5_ != 39)
					method1430(-106, true);
				((Class223) this).aClass122_3067.method798(i_5_ ^ ~0x5b, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.K(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method1423(int i) {
		try {
			anInt3055++;
			synchronized (aClass22_3061) {
				aClass22_3061.method189((byte) 114);
			}
			if (i == 137) {
				synchronized (((Class223) this).aClass22_3065) {
					((Class223) this).aClass22_3065.method189((byte) 123);
				}
				synchronized (((Class223) this).aClass122_3067) {
					((Class223) this).aClass122_3067.method796(false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.G(" + i + ')');
		}
	}

	final void method1424(int i) {
		try {
			synchronized (aClass22_3061) {
				aClass22_3061.method190(i ^ i);
			}
			anInt3060++;
			synchronized (((Class223) this).aClass22_3065) {
				((Class223) this).aClass22_3065.method190(i - 10);
			}
			synchronized (((Class223) this).aClass122_3067) {
				((Class223) this).aClass122_3067.method793(i ^ 0xb);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.D(" + i + ')');
		}
	}

	public static void method1425(int i) {
		do {
			try {
				anIntArray3066 = null;
				if (i == 155)
					break;
				method1425(80);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lj.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class253 method1426(int i, int i_6_, boolean bool, int i_7_,
			Class163 class163, Class107 class107, Class258 class258, int i_8_,
			int i_9_, boolean bool_10_, Class163 class163_11_, boolean bool_12_) {
		try {
			anInt3049++;
			Class253 class253 = method1420(class163, i_7_, i_9_, i, class258,
					(byte) -100, i_6_, i_8_);
			if (class253 != null)
				return class253;
			Class249 class249 = method1430(i_8_, bool);
			if ((i_6_ ^ 0xffffffff) < -2
					&& ((Class249) class249).anIntArray3429 != null) {
				int i_13_ = -1;
				for (int i_14_ = 0; i_14_ < 10; i_14_++) {
					if (((i_6_ ^ 0xffffffff) <= (((Class249) class249).anIntArray3361[i_14_] ^ 0xffffffff))
							&& (((Class249) class249).anIntArray3361[i_14_] ^ 0xffffffff) != -1)
						i_13_ = ((Class249) class249).anIntArray3429[i_14_];
				}
				if ((i_13_ ^ 0xffffffff) != 0)
					class249 = method1430(i_13_, false);
			}
			int[] is = class249.method1586(bool_12_, class163, i_9_, -1,
					class258, i, class163_11_, i_6_, class107, i_7_);
			if (is == null)
				return null;
			Class253 class253_15_;
			if (!bool_10_)
				class253_15_ = class163.method1040(36, 32, is, -1, 36, 0);
			else
				class253_15_ = class163_11_.method1040(36, 32, is, -1, 36, 0);
			if (!bool_10_) {
				Class14 class14 = new Class14();
				((Class14) class14).anInt128 = ((Class163) class163).anInt2103;
				((Class14) class14).aBool117 = class258 != null;
				((Class14) class14).anInt115 = i_6_;
				((Class14) class14).anInt122 = i;
				((Class14) class14).anInt127 = i_7_;
				((Class14) class14).anInt126 = i_8_;
				((Class14) class14).anInt118 = i_9_;
				((Class223) this).aClass122_3067.method802(class253_15_,
						(byte) -126, class14);
			}
			return class253_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lj.J(" + i + ','
					+ i_6_ + ',' + bool + ',' + i_7_ + ','
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class107 != null ? "{...}" : "null") + ','
					+ (class258 != null ? "{...}" : "null") + ',' + i_8_ + ','
					+ i_9_ + ',' + bool_10_ + ','
					+ (class163_11_ != null ? "{...}" : "null") + ','
					+ bool_12_ + ')'));
		}
	}

	final void method1427(boolean bool) {
		do {
			try {
				anInt3057++;
				synchronized (((Class223) this).aClass22_3065) {
					((Class223) this).aClass22_3065.method189((byte) -127);
				}
				if (bool == false)
					break;
				((Class223) this).anInt3064 = 121;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lj.H(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method1428(boolean bool) {
		try {
			anInt3056++;
			synchronized (((Class223) this).aClass122_3067) {
				((Class223) this).aClass122_3067.method796(bool);
				if (bool != false)
					((Class223) this).aClass146_3054 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.I(" + bool + ')');
		}
	}

	final void method1429(byte i, int i_16_) {
		do {
			try {
				anInt3059++;
				((Class223) this).anInt3071 = i_16_;
				synchronized (((Class223) this).aClass22_3065) {
					((Class223) this).aClass22_3065.method189((byte) 94);
				}
				if (i < -8)
					break;
				method1423(69);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lj.F(" + i + ','
						+ i_16_ + ')');
			}
			break;
		} while (false);
	}

	final Class249 method1430(int i, boolean bool) {
		try {
			anInt3063++;
			if (bool != false)
				return null;
			Class249 class249;
			synchronized (aClass22_3061) {
				class249 = (Class249) aClass22_3061.method188((long) i,
						(byte) 83);
			}
			if (class249 != null)
				return class249;
			byte[] is;
			synchronized (aClass146_3058) {
				is = aClass146_3058.method930(Class231.method1478(i, -118),
						(byte) 112, Class48.method415(i, (byte) 127));
			}
			class249 = new Class249();
			((Class249) class249).aClass223_3388 = this;
			((Class249) class249).anInt3362 = i;
			((Class249) class249).aStringArray3360 = (new String[] {
					null,
					null,
					Class26.aClass26_283.method217((byte) 122,
							((Class223) this).anInt3064), null, null });
			((Class249) class249).aStringArray3426 = (new String[] {
					null,
					null,
					null,
					null,
					Class26.aClass26_284.method217((byte) 125,
							(((Class223) this).anInt3064)) });
			if (is != null)
				class249.method1581(new Stream(is), false);
			class249.method1580(118);
			if (((Class249) class249).anInt3389 != -1)
				class249.method1594(
						method1430(((Class249) class249).anInt3395, bool),
						method1430(((Class249) class249).anInt3389, false), 1);
			if ((((Class249) class249).anInt3407 ^ 0xffffffff) != 0)
				class249.method1578(
						method1430(((Class249) class249).anInt3407, false),
						(byte) 78,
						method1430(((Class249) class249).anInt3402, false));
			if (!aBool3052 && ((Class249) class249).aBool3374) {
				((Class249) class249).aString3359 = Class26.aClass26_281
						.method217((byte) 104, ((Class223) this).anInt3064);
				((Class249) class249).aStringArray3426 = aStringArray3070;
				((Class249) class249).anIntArray3368 = null;
				((Class249) class249).aBool3397 = false;
				((Class249) class249).anInt3424 = 0;
				((Class249) class249).aStringArray3360 = aStringArray3069;
				if (((Class249) class249).aClass213_3398 != null) {
					boolean bool_17_ = false;
					for (Class11 class11 = ((Class249) class249).aClass213_3398
							.method1365(24490); class11 != null; class11 = ((Class249) class249).aClass213_3398
							.method1367((byte) 71)) {
						Class283 class283 = aClass52_3072.method432(
								(int) ((Class11) class11).aLong91, (byte) -128);
						if (!((Class283) class283).aBool3829)
							bool_17_ = true;
						else
							class11.method122(-83);
					}
					if (!bool_17_)
						((Class249) class249).aClass213_3398 = null;
				}
			}
			synchronized (aClass22_3061) {
				aClass22_3061.method184((byte) 126, class249, (long) i);
			}
			return class249;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lj.E(" + i + ','
					+ bool + ')');
		}
	}

	Class223(Class66 class66, int i, boolean bool, Class52 class52,
			Class146 class146, Class146 class146_18_) {
		try {
			aClass146_3058 = class146;
			aBool3052 = bool;
			((Class223) this).anInt3064 = i;
			((Class223) this).aClass146_3054 = class146_18_;
			aClass52_3072 = class52;
			do {
				if (aClass146_3058 == null) {
					((Class223) this).anInt3062 = 0;
					if (!client.aBool10531)
						break;
				}
				int i_19_ = aClass146_3058.method928((byte) 20) - 1;
				((Class223) this).anInt3062 = i_19_ * 256
						- -aClass146_3058.method914(i_19_, 0);
			} while (false);
			aStringArray3069 = (new String[] {
					null,
					null,
					Class26.aClass26_283.method217((byte) 100,
							((Class223) this).anInt3064), null, null });
			aStringArray3070 = (new String[] {
					null,
					null,
					null,
					null,
					Class26.aClass26_284.method217((byte) 118,
							(((Class223) this).anInt3064)) });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lj.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ',' + (class52 != null ? "{...}" : "null") + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_18_ != null ? "{...}" : "null") + ')'));
		}
	}
}
