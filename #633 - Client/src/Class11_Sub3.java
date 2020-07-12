/* Class11_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

final class Class11_Sub3 extends Class11 {
	static int anInt5109;
	String aString5110;
	static int anInt5111;
	static int anInt5112;
	static ISAAC aClass25_5113;
	static Hashtable aHashtable5114 = new Hashtable();
	static boolean[][] aBoolArrayArray5115 = { new boolean[4],
			{ false, true, true, false }, { true, false, true, false },
			{ true, false, true, false }, { false, false, true, false },
			{ false, false, true, false }, { true, false, true, false },
			{ true, false, false, true }, { true, false, false, true },
			{ true, true, false, false }, new boolean[4],
			{ false, true, false, true }, new boolean[4] };

	static final boolean method2284(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, boolean bool, int i_4_, int i_5_, int i_6_) {
		try {
			anInt5111++;
			if (bool != true)
				method2284(-103, 98, -127, -63, -76, false, 96, 109, 44);
			if (i_0_ + i <= i_5_
					|| (i_0_ ^ 0xffffffff) <= (i_4_ + i_5_ ^ 0xffffffff))
				return false;
			if (i_2_ >= i_3_ + i_6_
					|| (i_6_ ^ 0xffffffff) <= (i_2_ + i_1_ ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("q.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method2285(int i, int i_7_) {
		Class11_Sub45_Sub1 class11_sub45_sub1 = null;
		for (int i_8_ = i; i_8_ < i_7_; i_8_++) {
			Class12 class12 = Class11_Sub2_Sub38.aClass12Array9796[i_8_];
			if (class12 != null) {
				for (int i_9_ = 0; i_9_ < Class82.anInt1133; i_9_++) {
					for (int i_10_ = 0; i_10_ < Class138.anInt1886; i_10_++) {
						class11_sub45_sub1 = class12.fa(i_10_, i_9_,
								class11_sub45_sub1);
						if (class11_sub45_sub1 != null) {
							int i_11_ = i_10_ << Class11_Sub2_Sub8.anInt8751;
							int i_12_ = i_9_ << Class11_Sub2_Sub8.anInt8751;
							for (int i_13_ = i_8_ - 1; i_13_ >= 0; i_13_--) {
								Class12 class12_14_ = (Class11_Sub2_Sub38.aClass12Array9796[i_13_]);
								if (class12_14_ != null) {
									int i_15_ = (class12.method131((byte) -13,
											i_9_, i_10_) - class12_14_
											.method131((byte) 126, i_9_, i_10_));
									int i_16_ = (class12.method131((byte) 9,
											i_9_, i_10_ + 1) - class12_14_
											.method131((byte) 124, i_9_,
													i_10_ + 1));
									int i_17_ = (class12.method131((byte) 122,
											i_9_ + 1, i_10_ + 1) - class12_14_
											.method131((byte) 42, i_9_ + 1,
													i_10_ + 1));
									int i_18_ = (class12.method131((byte) -118,
											i_9_ + 1, i_10_) - class12_14_
											.method131((byte) -20, i_9_ + 1,
													i_10_));
									class12_14_
											.CA(class11_sub45_sub1,
													i_11_,
													(i_15_ + i_16_ + i_17_ + i_18_) / 4,
													i_12_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method2286(byte i) {
		do {
			try {
				aClass25_5113 = null;
				aBoolArrayArray5115 = null;
				aHashtable5114 = null;
				if (i > 89)
					break;
				method2284(-28, -34, 26, 120, -123, false, 114, 41, 77);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "q.D(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub3() {
		/* empty */
	}

	static final Class11_Sub24 method2287(int i, byte i_19_, int i_20_,
			int i_21_, boolean bool) {
		try {
			anInt5112++;
			Class11_Sub24 class11_sub24 = new Class11_Sub24();
			((Class11_Sub24) class11_sub24).anInt6233 = i_21_;
			((Class11_Sub24) class11_sub24).anInt6236 = i_20_;
			Class75_Sub2.aClass213_7160.method1368((long) i, class11_sub24,
					(byte) -26);
			Class153.method959(i_21_, (byte) -87);
			IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
					(byte) -103, i);
			if (class192 != null)
				Class232.method1484(class192, 1);
			if (Class72.aClass192_1004 != null) {
				Class232.method1484(Class72.aClass192_1004, 1);
				Class72.aClass192_1004 = null;
			}
			Class344.method2082(-65);
			if (i_19_ >= -104)
				method2287(-114, (byte) -52, -47, -97, false);
			if (class192 != null)
				Class130.method843(!bool, true, class192);
			if (!bool)
				Class86.parseIComponentScript(i_21_);
			if (!bool && Class365.anInt4797 != -1)
				Class11_Sub12_Sub1.method3466(1, -93, Class365.anInt4797);
			return class11_sub24;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("q.C(" + i + ','
					+ i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + bool + ')'));
		}
	}

	Class11_Sub3(String string) {
		try {
			((Class11_Sub3) this).aString5110 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "q.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}
}
