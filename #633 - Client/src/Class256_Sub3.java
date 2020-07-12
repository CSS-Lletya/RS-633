/* Class256_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256_Sub3 extends Class256 {
	private int anInt7950;
	static int anInt7951;
	private int anInt7952;
	static int anInt7953;
	static int anInt7954;
	static int anInt7955;
	static Class22 aClass22_7956 = new Class22(8);
	private int anInt7957;
	private int anInt7958;

	Class256_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_) {
		super(i_3_, i_4_, i_5_);
		try {
			anInt7950 = i;
			anInt7957 = i_2_;
			anInt7952 = i_0_;
			anInt7958 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gaa.<init>(" + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final void method3197(int i, int i_6_, int i_7_, int i_8_) {
		try {
			if (i != -5967)
				aClass22_7956 = null;
			Class11_Sub45_Sub17.aByteArrayArrayArray9509 = new byte[i_7_][i_6_][i_8_];
			anInt7951++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gaa.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method1637(boolean bool, int i, int i_9_) {
		try {
			anInt7954++;
			int i_10_ = anInt7950 * i_9_ >> 12;
			int i_11_ = anInt7958 * i_9_ >> 12;
			if (bool != false)
				method1637(true, -9, -65);
			int i_12_ = i * anInt7952 >> 12;
			int i_13_ = i * anInt7957 >> 12;
			Class342.method2075(i_10_, i_13_, i_12_, true,
					((Class256) this).anInt3510, i_11_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gaa.C(" + bool + ','
					+ i + ',' + i_9_ + ')'));
		}
	}

	final void method1639(int i, int i_14_, int i_15_) {
		try {
			anInt7953++;
			if (i_14_ != -12939)
				anInt7957 = -47;
			int i_16_ = i_15_ * anInt7950 >> 12;
			int i_17_ = anInt7958 * i_15_ >> 12;
			int i_18_ = i * anInt7952 >> 12;
			int i_19_ = anInt7957 * i >> 12;
			Class316.method1921(i_19_, i_16_, ((Class256) this).anInt3509,
					i_17_, 118, i_18_, ((Class256) this).anInt3506);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gaa.A(" + i + ','
					+ i_14_ + ',' + i_15_ + ')'));
		}
	}

	final void method1636(int i, int i_20_, int i_21_) {
		try {
			anInt7955++;
			int i_22_ = i * anInt7950 >> 12;
			int i_23_ = i * anInt7958 >> 12;
			int i_24_ = i_21_ * anInt7952 >> 12;
			int i_25_ = -76 % ((i_20_ + 7) / 42);
			int i_26_ = i_21_ * anInt7957 >> 12;
			Class31.method257(((Class256) this).anInt3510, (byte) 114, i_26_,
					i_23_, i_24_, ((Class256) this).anInt3509,
					((Class256) this).anInt3506, i_22_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gaa.E(" + i + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	public static void method3198(int i) {
		try {
			int i_27_ = 32 / ((i + 1) / 53);
			aClass22_7956 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gaa.D(" + i + ')');
		}
	}
}
