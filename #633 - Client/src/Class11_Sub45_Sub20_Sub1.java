/* Class11_Sub45_Sub20_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub20_Sub1 extends Class11_Sub45_Sub20 {
	static Class84 aClass84_9948 = new Class84();
	static int anInt9949;
	int anInt9950;
	static int anInt9951;
	static int anInt9952;
	Class243 aClass243_9953;
	static Class253[] aClass253Array9954;
	static int anInt9955;
	byte[] aByteArray9956;
	static int anInt9957;
	static int anInt9958;
	static Class131 aClass131_9959 = new Class131();
	static Class46 aClass46_9960;
	static int anInt9961 = 4;

	public static void method3891(int i) {
		try {
			aClass84_9948 = null;
			aClass46_9960 = null;
			if (i == 0) {
				aClass253Array9954 = null;
				aClass131_9959 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qda.G(" + i + ')');
		}
	}

	static final int method3892(byte i) {
		try {
			anInt9957++;
			if (i >= -104)
				return -100;
			return Class321_Sub2.aClass382_6641.method2240(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qda.A(" + i + ')');
		}
	}

	final int method3830(int i) {
		try {
			anInt9952++;
			if (i != 0)
				method3894(80, 6, null, null);
			if (((Class11_Sub45_Sub20) this).aBool9737)
				return 0;
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qda.E(" + i + ')');
		}
	}

	final byte[] method3833(byte i) {
		try {
			anInt9955++;
			if (((Class11_Sub45_Sub20) this).aBool9737)
				throw new RuntimeException();
			if (i != 68)
				anInt9961 = 19;
			return ((Class11_Sub45_Sub20_Sub1) this).aByteArray9956;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qda.C(" + i + ')');
		}
	}

	static final boolean method3893(int i, int i_0_, int i_1_) {
		try {
			if (i >= -116)
				aClass84_9948 = null;
			anInt9951++;
			if ((0x800 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qda.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method3894(int i, int i_2_, String string, String string_3_) {
		try {
			anInt9949++;
			if (i != -1)
				method3895(-46, -101, -7);
			int i_4_ = string.length();
			int i_5_ = string_3_.length();
			int i_6_ = 0;
			int i_7_ = 0;
			char c = '\0';
			char c_8_ = '\0';
			while_86_: do {
				char c_9_;
				char c_10_;
				for (;;) {
					if (-c + i_6_ >= i_4_ && i_7_ - c_8_ >= i_5_)
						break while_86_;
					if (-c + i_6_ >= i_4_)
						return -1;
					if ((i_7_ - c_8_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff))
						return 1;
					if (c != 0) {
						c_9_ = c;
						boolean bool = false;
					} else
						c_9_ = string.charAt(i_6_++);
					if (c_8_ == 0)
						c_10_ = string_3_.charAt(i_7_++);
					else {
						c_10_ = c_8_;
						boolean bool = false;
					}
					c = Class358.method2130(5, c_9_);
					c_8_ = Class358.method2130(5, c_10_);
					c_9_ = Class11_Sub35_Sub1.method3570(i_2_, i ^ 0x3f, c_9_);
					c_10_ = Class11_Sub35_Sub1.method3570(i_2_, -58, c_10_);
					if ((c_9_ ^ 0xffffffff) != (c_10_ ^ 0xffffffff)
							&& (Character.toUpperCase(c_9_) != Character
									.toUpperCase(c_10_))) {
						c_9_ = Character.toLowerCase(c_9_);
						c_10_ = Character.toLowerCase(c_10_);
						if (c_9_ != c_10_)
							break;
					}
				}
				return (Class376_Sub2.method2419(c_9_, i_2_, (byte) -115) - Class376_Sub2
						.method2419(c_10_, i_2_, (byte) -128));
			} while (false);
			int i_11_ = Math.min(i_4_, i_5_);
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				if (i_2_ == 2) {
					i_6_ = i_4_ - (1 - -i_12_);
					i_7_ = -1 + i_5_ - i_12_;
				} else
					i_6_ = i_7_ = i_12_;
				char c_13_ = string.charAt(i_6_);
				char c_14_ = string_3_.charAt(i_7_);
				if (c_13_ != c_14_
						&& (Character.toUpperCase(c_13_) != Character
								.toUpperCase(c_14_))) {
					c_13_ = Character.toLowerCase(c_13_);
					c_14_ = Character.toLowerCase(c_14_);
					if ((c_13_ ^ 0xffffffff) != (c_14_ ^ 0xffffffff))
						return (Class376_Sub2.method2419(c_13_, i_2_,
								(byte) -122) + -Class376_Sub2.method2419(c_14_,
								i_2_, (byte) -98));
				}
			}
			int i_15_ = i_4_ + -i_5_;
			if (i_15_ != 0)
				return i_15_;
			for (int i_16_ = 0; i_11_ > i_16_; i_16_++) {
				char c_17_ = string.charAt(i_16_);
				char c_18_ = string_3_.charAt(i_16_);
				if ((c_17_ ^ 0xffffffff) != (c_18_ ^ 0xffffffff))
					return (Class376_Sub2.method2419(c_17_, i_2_, (byte) -102) + -Class376_Sub2
							.method2419(c_18_, i_2_, (byte) -103));
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qda.B(" + i + ','
					+ i_2_ + ',' + (string != null ? "{...}" : "null") + ','
					+ (string_3_ != null ? "{...}" : "null") + ')'));
		}
	}

	public Class11_Sub45_Sub20_Sub1() {
		/* empty */
	}

	static final boolean method3895(int i, int i_19_, int i_20_) {
		try {
			if (i != 12869)
				aClass84_9948 = null;
			anInt9958++;
			if ((i_20_ & 0x20 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qda.F(" + i + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}
}
