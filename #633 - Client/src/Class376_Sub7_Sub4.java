/* Class376_Sub7_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class376_Sub7_Sub4 extends Class376_Sub7 {
	static Class253[] aClass253Array9535;
	short aShort9536;
	static Class79 aClass79_9537 = new Class79(12, 0, 1, 0);
	static int anInt9538;
	static int anInt9539;
	static int anInt9540;
	short aShort9541;
	static int anInt9542;
	static int anInt9543;
	static int anInt9544;
	static int anInt9545;
	static int anInt9546;
	static int anInt9547;

	final int method2859(Class11_Sub46[] class11_sub46s, int i) {
		try {
			anInt9538++;
			if (i != -1)
				method2862(97);
			return this
					.method2857(
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751),
							class11_sub46s,
							(byte) -53,
							(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.OA("
					+ (class11_sub46s != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	static final boolean method3763(Class347 class347, int i) {
		try {
			anInt9546++;
			if (i != 70)
				method3765((byte) -89);
			if (Class210.aClass347_2856 != class347
					&& class347 != Class11_Sub45_Sub3.aClass347_8530
					&& class347 != Class376_Sub7_Sub2_Sub2.aClass347_10223
					&& class347 != Class146.aClass347_1981)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.T("
					+ (class347 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method2865(int i) {
		try {
			anInt9540++;
			if (i >= -85)
				((Class376_Sub7_Sub4) this).aShort9541 = (short) 104;
			return Class95
					.method643(
							this.method2867(32767),
							57,
							(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751),
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751),
							((Class376_Sub7) this).aByte7039);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.JA(" + i + ')');
		}
	}

	final void method2872(int i) {
		try {
			anInt9547++;
			if (i == 26062)
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.L(" + i + ')');
		}
	}

	static final boolean method3764(boolean bool, int i, int i_0_) {
		try {
			if (bool != true)
				method3766(null, true);
			anInt9543++;
			if ((0x10 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sl.R(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	public static void method3765(byte i) {
		do {
			try {
				aClass79_9537 = null;
				aClass253Array9535 = null;
				if (i >= 64)
					break;
				method3763(null, 92);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sl.S(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method2862(int i) {
		try {
			if (i >= -103)
				method3763(null, 2);
			anInt9545++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.W(" + i + ')');
		}
	}

	Class376_Sub7_Sub4(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_) {
		try {
			((Class376_Sub7) this).anInt7045 = i;
			((Class376_Sub7_Sub4) this).aShort9536 = (short) i_5_;
			((Class376_Sub7) this).anInt7036 = i_1_;
			((Class376_Sub7_Sub4) this).aShort9541 = (short) i_6_;
			((Class376_Sub7) this).anInt7031 = i_2_;
			((Class376_Sub7) this).aByte7047 = (byte) i_3_;
			((Class376_Sub7) this).aByte7039 = (byte) i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sl.<init>(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + i_6_ + ')'));
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_7_,
			Class376_Sub7 class376_sub7, int i_8_, int i_9_) {
		try {
			anInt9542++;
			if (i_8_ != 22501)
				((Class376_Sub7_Sub4) this).aShort9541 = (short) 69;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sl.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_7_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final String method3766(String string, boolean bool) {
		try {
			anInt9544++;
			StringBuffer stringbuffer = new StringBuffer();
			if (bool != false)
				method3764(true, -54, -17);
			int i = string.length();
			for (int i_10_ = 0; (i ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				char c = string.charAt(i_10_);
				if ((c ^ 0xffffffff) != -38 || 2 + i_10_ >= i) {
					if (c == 43)
						stringbuffer.append(' ');
					else
						stringbuffer.append(c);
				} else {
					int i_11_ = string.charAt(1 + i_10_);
					boolean bool_12_ = false;
					int i_13_;
					if (i_11_ >= 48 && i_11_ <= 57)
						i_13_ = i_11_ - 48;
					else if (i_11_ >= 97 && i_11_ <= 102)
						i_13_ = 10 - (-i_11_ + 97);
					else if ((i_11_ ^ 0xffffffff) <= -66 && i_11_ <= 70)
						i_13_ = i_11_ + 10 - 65;
					else {
						stringbuffer.append('%');
						continue;
					}
					i_13_ *= 16;
					i_11_ = string.charAt(i_10_ + 2);
					if ((i_11_ ^ 0xffffffff) <= -49 && i_11_ <= 57)
						i_13_ += i_11_ - 48;
					else if (i_11_ >= 97 && i_11_ <= 102)
						i_13_ += i_11_ + 10 - 97;
					else {
						if ((i_11_ ^ 0xffffffff) > -66 || i_11_ > 70) {
							stringbuffer.append('%');
							continue;
						}
						i_13_ += 10 + i_11_ - 65;
					}
					i_10_ += 2;
					if ((i_13_ ^ 0xffffffff) != -1
							&& Class154.method968(-1, (byte) i_13_))
						stringbuffer.append(Class64.method486((byte) i_13_, 0));
				}
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.V("
					+ (string != null ? "{...}" : "null") + ',' + bool + ')');
		}
	}

	final boolean method2869(int i) {
		try {
			anInt9539++;
			if (i != -21499)
				return true;
			return (Class11_Sub2_Sub19.aBoolArrayArray9091[((((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751) - (Class11_Sub45_Sub7.anInt8807 + -Class94_Sub4.anInt7730))][((((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751)
					- Class15.anInt134 - -Class94_Sub4.anInt7730)]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sl.LA(" + i + ')');
		}
	}
}
