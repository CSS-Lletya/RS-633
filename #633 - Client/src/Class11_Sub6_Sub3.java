/* Class11_Sub6_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub6_Sub3 extends Class11_Sub6 {
	Class84 aClass84_9127 = new Class84();
	static int anInt9128;
	static int anInt9129;
	static int anInt9130;
	static int anInt9131;
	private Class11_Sub6_Sub2 aClass11_Sub6_Sub2_9132;
	static int anInt9133;
	static int anInt9134;
	static int anInt9135;
	static int anInt9136;
	static int anInt9137;
	Class11_Sub6_Sub1 aClass11_Sub6_Sub1_9138 = new Class11_Sub6_Sub1();
	static short aShort9139 = 256;
	static int anInt9140;
	static int anInt9141;

	static final int method3572(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ != -1)
				return 46;
			anInt9136++;
			if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
				int i_2_ = i;
				i = i_1_;
				i_1_ = i_2_;
			}
			int i_3_;
			for (/**/; (i_1_ ^ 0xffffffff) != -1; i_1_ = i_3_) {
				i_3_ = i % i_1_;
				i = i_1_;
			}
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iw.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final Class11_Sub6 method2319() {
		try {
			anInt9130++;
			Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
					.method584(-12261));
			if (class11_sub18 == null)
				return null;
			if (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 != null)
				return ((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780;
			return method2316();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iw.M(" + ')');
		}
	}

	private final void method3573(int i, Class11_Sub18 class11_sub18, int i_4_) {
		try {
			anInt9135++;
			if ((0x4 & (((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8924[((Class11_Sub18) class11_sub18).anInt5803]) ^ 0xffffffff) != -1
					&& ((Class11_Sub18) class11_sub18).anInt5798 < 0) {
				int i_5_ = ((((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8903[((Class11_Sub18) class11_sub18).anInt5803]) / Class119.anInt1610);
				int i_6_ = ((-((Class11_Sub18) class11_sub18).anInt5783 + (1048575 + i_5_)) / i_5_);
				((Class11_Sub18) class11_sub18).anInt5783 = 0xfffff & (((Class11_Sub18) class11_sub18).anInt5783 - -(i_5_ * i_4_));
				if ((i_6_ ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)) {
					do {
						if (((((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8928[((Class11_Sub18) class11_sub18).anInt5803]) ^ 0xffffffff) != -1) {
							((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
									.method3674(
											(((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799),
											((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
													.method3680(),
											0,
											((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
													.method3699()));
							aClass11_Sub6_Sub2_9132
									.method3502(
											false,
											class11_sub18,
											((((Class11_Sub43) (((Class11_Sub18) class11_sub18).aClass11_Sub43_5791)).aShortArray7335[((Class11_Sub18) class11_sub18).anInt5789]) < 0));
							if (!client.aBool10531)
								break;
						}
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
								.method3674(
										(((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799),
										((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
												.method3680(),
										((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
												.method3694(),
										((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
												.method3699()));
					} while (false);
					if ((((Class11_Sub43) ((Class11_Sub18) class11_sub18).aClass11_Sub43_5791).aShortArray7335[((Class11_Sub18) class11_sub18).anInt5789]) < 0)
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
								.method3668(-1);
					i_4_ = ((Class11_Sub18) class11_sub18).anInt5783 / i_5_;
				}
			}
			if (i >= 7)
				((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
						.method2315(i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("iw.E(" + i + ','
							+ (class11_sub18 != null ? "{...}" : "null") + ','
							+ i_4_ + ')'));
		}
	}

	private final void method3574(int i, int[] is, int i_7_, int i_8_,
			Class11_Sub18 class11_sub18, int i_9_) {
		try {
			anInt9133++;
			if (i > -108)
				((Class11_Sub6_Sub3) this).aClass11_Sub6_Sub1_9138 = null;
			if ((0x4 & (((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8924[((Class11_Sub18) class11_sub18).anInt5803]) ^ 0xffffffff) != -1
					&& ((Class11_Sub18) class11_sub18).anInt5798 < 0) {
				int i_10_ = ((((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8903[((Class11_Sub18) class11_sub18).anInt5803]) / Class119.anInt1610);
				for (;;) {
					int i_11_ = ((i_10_ + (1048575 + -((Class11_Sub18) class11_sub18).anInt5783)) / i_10_);
					if ((i_7_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff))
						break;
					((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
							.method2318(is, i_8_, i_11_);
					((Class11_Sub18) class11_sub18).anInt5783 += -1048576
							+ i_10_ * i_11_;
					i_7_ -= i_11_;
					i_8_ += i_11_;
					int i_12_ = Class119.anInt1610 / 100;
					int i_13_ = 262144 / i_10_;
					if (i_12_ > i_13_)
						i_12_ = i_13_;
					Class11_Sub6_Sub4 class11_sub6_sub4 = (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780);
					if ((((Class11_Sub6_Sub2) aClass11_Sub6_Sub2_9132).anIntArray8928[((Class11_Sub18) class11_sub18).anInt5803]) == 0)
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
								.method3674(
										(((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799),
										class11_sub6_sub4.method3680(),
										class11_sub6_sub4.method3694(),
										class11_sub6_sub4.method3699()));
					else {
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 = (Class11_Sub6_Sub4
								.method3674(
										(((Class11_Sub18) class11_sub18).aClass11_Sub14_Sub1_5799),
										class11_sub6_sub4.method3680(), 0,
										class11_sub6_sub4.method3699()));
						aClass11_Sub6_Sub2_9132
								.method3502(
										false,
										class11_sub18,
										(((Class11_Sub43) (((Class11_Sub18) class11_sub18).aClass11_Sub43_5791)).aShortArray7335[(((Class11_Sub18) class11_sub18).anInt5789)]) < 0);
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
								.method3681(i_12_,
										class11_sub6_sub4.method3694());
					}
					if (((((Class11_Sub43) ((Class11_Sub18) class11_sub18).aClass11_Sub43_5791).aShortArray7335[((Class11_Sub18) class11_sub18).anInt5789]) ^ 0xffffffff) > -1)
						((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780
								.method3668(-1);
					class11_sub6_sub4.method3673(i_12_);
					class11_sub6_sub4.method2318(is, i_8_, i_9_ + -i_8_);
					if (class11_sub6_sub4.method3663())
						((Class11_Sub6_Sub3) this).aClass11_Sub6_Sub1_9138
								.method3459(class11_sub6_sub4);
				}
				((Class11_Sub18) class11_sub18).anInt5783 += i_10_ * i_7_;
			}
			((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780.method2318(
					is, i_8_, i_7_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iw.B(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_7_ + ',' + i_8_
					+ ',' + (class11_sub18 != null ? "{...}" : "null") + ','
					+ i_9_ + ')'));
		}
	}

	static final void method3575(int i, int i_14_, int i_15_, int i_16_) {
		try {
			i_16_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
					.method2462(false) * i_16_ >> 8;
			if (i_14_ < 100)
				method3572(-122, 26, 120);
			anInt9131++;
			if (i_15_ != -1 || Class376_Sub7.aBool7049) {
				if ((i_15_ ^ 0xffffffff) != 0
						&& (((Class11_Sub12_Sub1.anInt8828 ^ 0xffffffff) != (i_15_ ^ 0xffffffff)) || !Class11_Sub12_Sub4
								.method3722(-21552)) && i_16_ != 0
						&& !Class376_Sub7.aBool7049) {
					Class154.method963(i_15_, -99, i_16_,
							Class58_Sub2_Sub1.aClass146_9250, i, 0, false);
					Class295.method1829(-1);
				}
			} else
				Class376_Sub7.method2858(125);
			if (i_15_ != Class11_Sub12_Sub1.anInt8828)
				Class11_Sub29.aClass11_Sub6_Sub2_6591 = null;
			Class11_Sub12_Sub1.anInt8828 = i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iw.C(" + i + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	final Class11_Sub6 method2316() {
		try {
			anInt9140++;
			Class11_Sub18 class11_sub18;
			do {
				class11_sub18 = (Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
						.method578(-15361);
				if (class11_sub18 == null)
					return null;
			} while (((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780 == null);
			return ((Class11_Sub18) class11_sub18).aClass11_Sub6_Sub4_5780;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iw.I(" + ')');
		}
	}

	final void method2318(int[] is, int i, int i_17_) {
		try {
			anInt9129++;
			((Class11_Sub6_Sub3) this).aClass11_Sub6_Sub1_9138.method2318(is,
					i, i_17_);
			Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
					.method584(-12261));
			while_255_: for (/**/; class11_sub18 != null; class11_sub18 = (Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
					.method578(-15361)) {
				if (!aClass11_Sub6_Sub2_9132.method3505((byte) 98,
						class11_sub18)) {
					int i_18_ = i_17_;
					int i_19_ = i;
					while ((i_18_ ^ 0xffffffff) < (((Class11_Sub18) class11_sub18).anInt5802 ^ 0xffffffff)) {
						method3574(-123, is,
								((Class11_Sub18) class11_sub18).anInt5802,
								i_19_, class11_sub18, i_18_ + i_19_);
						i_19_ += ((Class11_Sub18) class11_sub18).anInt5802;
						i_18_ -= ((Class11_Sub18) class11_sub18).anInt5802;
						if (aClass11_Sub6_Sub2_9132.method3503(128, i_19_, is,
								i_18_, class11_sub18))
							continue while_255_;
					}
					method3574(-117, is, i_18_, i_19_, class11_sub18, i_18_
							+ i_19_);
					((Class11_Sub18) class11_sub18).anInt5802 -= i_18_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("iw.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_17_ + ')'));
		}
	}

	final int method2314() {
		try {
			anInt9134++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iw.J(" + ')');
		}
	}

	final void method2315(int i) {
		try {
			anInt9137++;
			((Class11_Sub6_Sub3) this).aClass11_Sub6_Sub1_9138.method2315(i);
			Class11_Sub18 class11_sub18 = ((Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
					.method584(-12261));
			while_257_: for (/**/; class11_sub18 != null; class11_sub18 = (Class11_Sub18) ((Class11_Sub6_Sub3) this).aClass84_9127
					.method578(-15361)) {
				if (!aClass11_Sub6_Sub2_9132.method3505((byte) 98,
						class11_sub18)) {
					int i_20_ = i;
					while ((i_20_ ^ 0xffffffff) < (((Class11_Sub18) class11_sub18).anInt5802 ^ 0xffffffff)) {
						method3573(82, class11_sub18,
								((Class11_Sub18) class11_sub18).anInt5802);
						i_20_ -= ((Class11_Sub18) class11_sub18).anInt5802;
						if (aClass11_Sub6_Sub2_9132.method3503(128, 0, null,
								i_20_, class11_sub18))
							continue while_257_;
					}
					method3573(101, class11_sub18, i_20_);
					((Class11_Sub18) class11_sub18).anInt5802 -= i_20_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iw.D(" + i + ')');
		}
	}

	Class11_Sub6_Sub3(Class11_Sub6_Sub2 class11_sub6_sub2) {
		try {
			aClass11_Sub6_Sub2_9132 = class11_sub6_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iw.<init>("
					+ (class11_sub6_sub2 != null ? "{...}" : "null") + ')');
		}
	}
}
