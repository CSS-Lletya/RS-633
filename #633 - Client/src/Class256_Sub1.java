/* Class256_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256_Sub1 extends Class256 {
	private int anInt5311;
	static int anInt5312;
	static int anInt5313;
	static int anInt5314;
	static int anInt5315;
	private int anInt5316;
	static int anInt5317;
	private int anInt5318;
	static Class84 aClass84_5319 = new Class84();
	static Class292 aClass292_5320;
	static Interface1 anInterface1_5321;
	static volatile boolean aBool5322 = true;
	static Class146 aClass146_5323;
	private int anInt5324;

	final void method1639(int i, int i_0_, int i_1_) {
		try {
			if (i_0_ == -12939)
				anInt5312++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2340(int i, int i_2_, int i_3_, int i_4_) {
		try {
			if (i_3_ != 16777215)
				aClass292_5320 = null;
			anInt5315++;
			Class104 class104 = Class109.aClass104ArrayArray1477[i_2_][i];
			Class170.method1118((class104 == null ? Class170.aClass104_2185
					: class104), false, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.D(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method2341(byte i) {
		do {
			try {
				anInterface1_5321 = null;
				aClass84_5319 = null;
				aClass292_5320 = null;
				aClass146_5323 = null;
				if (i >= 109)
					break;
				method2340(-99, -106, 5, 38);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "laa.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1637(boolean bool, int i, int i_5_) {
		try {
			if (bool == false) {
				anInt5317++;
				int i_6_ = anInt5311 * i_5_ >> 12;
				int i_7_ = i_5_ * anInt5318 >> 12;
				int i_8_ = anInt5324 * i >> 12;
				int i_9_ = anInt5316 * i >> 12;
				Class261.method1666(i_6_, i_7_, i_9_, 3,
						((Class256) this).anInt3510, i_8_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.C(" + bool + ','
					+ i + ',' + i_5_ + ')'));
		}
	}

	Class256_Sub1(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
			int i_15_) {
		super(i_13_, i_14_, i_15_);
		try {
			anInt5316 = i_12_;
			anInt5311 = i;
			anInt5318 = i_11_;
			anInt5324 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.<init>(" + i
					+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_
					+ ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	final void method1636(int i, int i_16_, int i_17_) {
		try {
			anInt5314++;
			int i_18_ = -84 / ((-7 - i_16_) / 42);
			int i_19_ = anInt5311 * i >> 12;
			int i_20_ = i * anInt5318 >> 12;
			int i_21_ = i_17_ * anInt5324 >> 12;
			int i_22_ = i_17_ * anInt5316 >> 12;
			Class376_Sub7_Sub1.method3442(((Class256) this).anInt3506, i_22_,
					i_20_, (byte) -93, i_19_, ((Class256) this).anInt3509,
					((Class256) this).anInt3510, i_21_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.E(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	static final void method2342(boolean bool, String string) {
		try {
			if (bool == true) {
				anInt5313++;
				System.exit(1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("laa.F(" + bool + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}
}
