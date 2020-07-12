/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class153 {
	static int anInt2019;
	static int anInt2020;
	int anInt2021;
	static int anInt2022;
	static int anInt2023;
	static int anInt2024;
	static int anInt2025;
	static Font aFont2026;
	static int anInt2027;
	static int anInt2028;

	static final Class11_Sub21 method956(boolean bool) {
		try {
			anInt2020++;
			if (Class32.aClass84_425 == null || Class47.aClass336_737 == null)
				return null;
			if (bool != true)
				anInt2025 = -26;
			for (Class11_Sub21 class11_sub21 = ((Class11_Sub21) Class47.aClass336_737
					.method2022(146800640)); class11_sub21 != null; class11_sub21 = (Class11_Sub21) Class47.aClass336_737
					.method2022(146800640)) {
				Class23 class23 = Class32.aClass280_420.method1726((byte) -112,
						(((Class11_Sub21) class11_sub21).anInt5964));
				if (class23 != null && ((Class23) class23).aBool206
						&& class23.method196(Class32.anInterface20_421, 2))
					return class11_sub21;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.G(" + bool + ')');
		}
	}

	public static void method957(boolean bool) {
		try {
			if (bool != false)
				anInt2025 = -2;
			aFont2026 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.E(" + bool + ')');
		}
	}

	Class153(int i) {
		try {
			((Class153) this).anInt2021 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.<init>(" + i + ')');
		}
	}

	static final void method958(String string, int i, int i_0_, boolean bool,
			String string_1_, int i_2_, String string_3_, String string_4_,
			String string_5_) {
		try {
			anInt2024++;
			Class326 class326 = Class1.aClass326Array3[99];
			for (int i_6_ = 99; i_6_ > 0; i_6_--)
				Class1.aClass326Array3[i_6_] = Class1.aClass326Array3[i_6_ - 1];
			if (class326 != null)
				class326.method1981(i_0_, i, string_4_, string_1_, string_3_,
						i_2_, string, (byte) -98, string_5_);
			else
				class326 = new Class326(i, i_0_, string_3_, string_5_,
						string_4_, string_1_, i_2_, string);
			Class1.aClass326Array3[0] = class326;
			Class11_Sub45_Sub2.anInt8512++;
			if (bool == true)
				Class11_Sub2_Sub7.anInt8729 = Class219_Sub1.anInt7238;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gg.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + bool + ','
					+ (string_1_ != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ (string_3_ != null ? "{...}" : "null") + ','
					+ (string_4_ != null ? "{...}" : "null") + ','
					+ (string_5_ != null ? "{...}" : "null") + ')'));
		}
	}

	public final String toString() {
		try {
			anInt2022++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.toString(" + ')');
		}
	}

	static final void method959(int i, byte i_7_) {
		try {
			anInt2028++;
			if (Class11_Sub16.method2449(127, i)) {
				if (i_7_ > -31)
					anInt2025 = -121;
				IComponentDefinitions[] class192s = Class11_Sub45_Sub5.aClass192ArrayArray8772[i];
				for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (class192s.length ^ 0xffffffff); i_8_++) {
					IComponentDefinitions class192 = class192s[i_8_];
					if (class192 != null) {
						((IComponentDefinitions) class192).anInt2502 = 0;
						((IComponentDefinitions) class192).anInt2545 = 1;
						((IComponentDefinitions) class192).anInt2539 = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.C(" + i + ','
					+ i_7_ + ')');
		}
	}

	static final void method960(int i, int i_9_, int i_10_, int i_11_,
			int i_12_, int i_13_) {
		try {
			anInt2019++;
			if (i_13_ < 11)
				method958(null, -49, -91, false, null, -54, null, null, null);
			int i_14_ = i_10_ + -i;
			int i_15_ = -i_9_ + i_12_;
			if (i_15_ != 0) {
				if (i_14_ == 0) {
					Class11_Sub45_Sub13.method3636(i_9_, i, (byte) 87, i_11_,
							i_12_);
					return;
				}
			} else {
				if ((i_14_ ^ 0xffffffff) != -1)
					Class170.method1116(i_9_, i_10_, i_11_, i, -8220);
				return;
			}
			if (i_14_ < 0)
				i_14_ = -i_14_;
			if ((i_15_ ^ 0xffffffff) > -1)
				i_15_ = -i_15_;
			boolean bool = i_15_ < i_14_;
			if (bool) {
				int i_16_ = i_9_;
				int i_17_ = i_12_;
				i_9_ = i;
				i = i_16_;
				i_12_ = i_10_;
				i_10_ = i_17_;
			}
			if ((i_12_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff)) {
				int i_18_ = i_9_;
				int i_19_ = i;
				i_9_ = i_12_;
				i_12_ = i_18_;
				i = i_10_;
				i_10_ = i_19_;
			}
			int i_20_ = i;
			int i_21_ = i_12_ - i_9_;
			int i_22_ = -i + i_10_;
			int i_23_ = -(i_21_ >> 1);
			int i_24_ = (i ^ 0xffffffff) <= (i_10_ ^ 0xffffffff) ? -1 : 1;
			if (i_22_ < 0)
				i_22_ = -i_22_;
			if (bool) {
				for (int i_25_ = i_9_; (i_25_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff); i_25_++) {
					i_23_ += i_22_;
					Class297.anIntArrayArray4026[i_25_][i_20_] = i_11_;
					if ((i_23_ ^ 0xffffffff) < -1) {
						i_23_ -= i_21_;
						i_20_ += i_24_;
					}
				}
			} else {
				for (int i_26_ = i_9_; (i_26_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff); i_26_++) {
					Class297.anIntArrayArray4026[i_20_][i_26_] = i_11_;
					i_23_ += i_22_;
					if ((i_23_ ^ 0xffffffff) < -1) {
						i_20_ += i_24_;
						i_23_ -= i_21_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gg.D(" + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ')'));
		}
	}

	static final Class347[] method961(byte i) {
		try {
			int i_27_ = 118 % ((82 - i) / 37);
			anInt2027++;
			return (new Class347[] { Class362.aClass347_4711,
					Class210.aClass347_2856, Class11_Sub45_Sub3.aClass347_8530,
					Class376_Sub7_Sub2_Sub2.aClass347_10223,
					Class11_Sub30_Sub1.aClass347_8979, Class146.aClass347_1981 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gg.A(" + i + ')');
		}
	}

	static final Class254_Sub2 method962(int i, Stream stream) {
		try {
			anInt2023++;
			Class254 class254 = Class262.method1670(stream, (byte) -83);
			int i_28_ = stream.readUnsignedShort((byte) -65);
			int i_29_ = stream.readUnsignedShort((byte) -65);
			int i_30_ = stream.readUnsignedShort((byte) -65);
			int i_31_ = stream.readUnsignedShort((byte) -65);
			int i_32_ = stream.readUnsignedShort((byte) -65);
			int i_33_ = stream.readUnsignedShort((byte) -65);
			int i_34_ = 66 / ((i + 29) / 62);
			return new Class254_Sub2(((Class254) class254).aClass118_3483,
					((Class254) class254).aClass150_3492,
					((Class254) class254).anInt3487,
					((Class254) class254).anInt3491,
					((Class254) class254).anInt3489,
					((Class254) class254).anInt3490,
					((Class254) class254).anInt3481,
					((Class254) class254).anInt3480,
					((Class254) class254).anInt3488, i_28_, i_29_, i_30_,
					i_31_, i_32_, i_33_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gg.F(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}
}
