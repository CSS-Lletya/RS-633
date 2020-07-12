/* Class237 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class237 {
	private String[] aStringArray3225;
	static int anInt3226;
	private boolean aBool3227 = false;
	private int anInt3228;
	private int anInt3229 = -1;
	static int anInt3230;
	static int anInt3231;
	static int anInt3232;
	static int anInt3233;
	static int anInt3234;
	static int anInt3235;
	static int anInt3236;
	static Class253 aClass253_3237;
	static Class83 aClass83_3238 = new Class83(10, 2);
	static int[] anIntArray3239 = new int[8];
	static String aString3240;

	public final String toString() {
		try {
			anInt3234++;
			StringBuffer stringbuffer = new StringBuffer();
			stringbuffer.append("[");
			for (int i = 0; (i ^ 0xffffffff) > (anInt3229 ^ 0xffffffff); i++) {
				if ((i ^ 0xffffffff) != -1)
					stringbuffer.append(", ");
				stringbuffer.append(aStringArray3225[i]);
			}
			stringbuffer.append("]");
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.toString(" + ')');
		}
	}

	final void method1509(String string, int i) {
		try {
			method1510(-16808, 1 + anInt3229, string);
			if (i <= -28)
				anInt3233++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method1510(int i, int i_0_, String string) {
		try {
			if ((anInt3229 ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
				anInt3229 = i_0_;
			if (i != -16808)
				anInt3228 = 15;
			anInt3226++;
			if ((aStringArray3225.length ^ 0xffffffff) >= (i_0_ ^ 0xffffffff))
				method1516(i_0_, -30686);
			aStringArray3225[i_0_] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mk.H(" + i + ','
					+ i_0_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final int method1511(int i, int i_1_) {
		try {
			anInt3235++;
			int i_2_ = aStringArray3225.length;
			while ((i_2_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
				if (!aBool3227)
					i_2_ += anInt3228;
				else if (i_2_ == 0)
					i_2_ = 1;
				else
					i_2_ *= anInt3228;
			}
			if (i != -26048)
				anInt3229 = -17;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.F(" + i + ','
					+ i_1_ + ')');
		}
	}

	final String[] method1512(int i) {
		try {
			anInt3231++;
			String[] strings = new String[i + anInt3229];
			Class311.method1901(aStringArray3225, 0, strings, 0, anInt3229 + 1);
			return strings;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.C(" + i + ')');
		}
	}

	public static void method1513(int i) {
		try {
			anIntArray3239 = null;
			if (i > 54) {
				aClass253_3237 = null;
				aString3240 = null;
				aClass83_3238 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.E(" + i + ')');
		}
	}

	static final int method1514(int i, int i_3_, byte i_4_, int i_5_, int i_6_) {
		try {
			if (i_4_ != 103)
				method1515(-16, 23, 47, -100, null, -47);
			anInt3236++;
			int i_7_ = 65536 - Class335.anIntArray4430[8192 * i / i_3_] >> 1;
			return (i_5_ * i_7_ >> 16) + ((65536 + -i_7_) * i_6_ >> 16);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mk.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method1515(int i, int i_8_, int i_9_, int i_10_,
			Class163 class163, int i_11_) {
		try {
			Class243.aClass163_3308 = class163;
			anInt3230++;
			Class321.aClass33_4280 = Class243.aClass163_3308.method1041();
			Class11_Sub2_Sub34.aClass33_9692 = Class243.aClass163_3308
					.method1041();
			Class337.aClass33_4457 = Class243.aClass163_3308.method1041();
			OutputStream_Sub1.anInt5845 = 0;
			Class264.anInt3604 = i_8_;
			Class163_Sub2_Sub1.anInt8637 = i_9_;
			Class175.anIntArray2231 = null;
			Class286.anInterface10Array3872 = null;
			Class138.method880(i_10_, i_11_ ^ 0xffffffff, i);
			Class11_Sub2_Sub39.anInt9813 = -1;
			Class11_Sub32.anInt6873 = -1;
			Class141.anInt1903 = i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("mk.G(" + i + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_11_ + ')'));
		}
	}

	private final void method1516(int i, int i_12_) {
		try {
			anInt3232++;
			String[] strings = new String[method1511(-26048, i)];
			if (i_12_ == -30686) {
				Class311.method1901(aStringArray3225, 0, strings, 0,
						aStringArray3225.length);
				aStringArray3225 = strings;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.A(" + i + ','
					+ i_12_ + ')');
		}
	}

	Class237(int i, boolean bool) {
		aStringArray3225 = new String[0];
		try {
			anInt3228 = i;
			aBool3227 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mk.<init>(" + i + ','
					+ bool + ')');
		}
	}
}
