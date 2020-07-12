/* Class11_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

abstract class Class11_Sub46 extends Class11 {
	static int anInt7969;
	int anInt7970;
	static int anInt7971;
	static int anInt7972;
	float aFloat7973;
	int anInt7974;
	static int anInt7975;
	private int anInt7976;
	static BigInteger loginModulusRSA = (new BigInteger(
			"113936108878412835789161783853416560016782768509180808282272938775908500602418191899505497385652508213111369682953925143804409254941488925946653496879733372392766486773043079697715731681861313487249634133583720830388725199461616223203479888577328710259826756810447716575537141200187251284798307012938761310363"));
	static int anInt7978;
	static int anInt7979;
	static int anInt7980;
	private int anInt7981;
	static short[][] aShortArrayArray7982;
	int anInt7983;
	static int anInt7984;

	abstract void method3202(float f, int i);

	final int method3203(boolean bool) {
		try {
			anInt7978++;
			if (bool != false)
				return 60;
			return ((Class11_Sub46) this).anInt7983;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.E(" + bool + ')');
		}
	}

	final int method3204(boolean bool) {
		try {
			anInt7972++;
			if (bool != true)
				anInt7976 = -2;
			return ((Class11_Sub46) this).anInt7974;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.I(" + bool + ')');
		}
	}

	final int method3205(int i) {
		try {
			int i_0_ = 27 % ((i - 66) / 32);
			anInt7971++;
			return ((Class11_Sub46) this).anInt7970;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.H(" + i + ')');
		}
	}

	public static void method3206(int i) {
		do {
			try {
				loginModulusRSA = null;
				aShortArrayArray7982 = null;
				if (i < -101)
					break;
				method3206(-124);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wi.L(" + i + ')');
			}
			break;
		} while (false);
	}

	static final boolean method3207(int i, byte i_1_, int i_2_) {
		try {
			if (i_1_ != -94)
				method3206(-7);
			anInt7984++;
			if ((i & 0x10000 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wi.F(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int method3208(int i) {
		try {
			anInt7979++;
			if (i != -1)
				return 43;
			return anInt7981;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.J(" + i + ')');
		}
	}

	final int method3209(byte i) {
		try {
			anInt7969++;
			int i_3_ = -91 / ((36 - i) / 51);
			return anInt7976;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.K(" + i + ')');
		}
	}

	static final void method3210() {
		Class11_Sub3.method2285(1, Class155.anInt2044);
	}

	final float method3211(int i) {
		try {
			anInt7975++;
			if (i != -18277)
				((Class11_Sub46) this).aFloat7973 = 0.13262449F;
			return ((Class11_Sub46) this).aFloat7973;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wi.M(" + i + ')');
		}
	}

	abstract void method3212(int i, int i_4_, int i_5_, int i_6_);

	Class11_Sub46(int i, int i_7_, int i_8_, int i_9_, int i_10_, float f) {
		try {
			((Class11_Sub46) this).anInt7974 = i_8_;
			((Class11_Sub46) this).anInt7970 = i_7_;
			((Class11_Sub46) this).aFloat7973 = f;
			anInt7981 = i_9_;
			anInt7976 = i_10_;
			((Class11_Sub46) this).anInt7983 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("wi.<init>(" + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_
							+ ',' + i_10_ + ',' + f + ')'));
		}
	}
}
