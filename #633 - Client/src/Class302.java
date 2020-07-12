/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class302 {
	static int anInt4063;
	static int anInt4064;
	static int anInt4065;
	static int anInt4066;
	private Class146 aClass146_4067;
	static int[] anIntArray4068 = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
			99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };
	static int anInt4069;
	private Class22 aClass22_4070 = new Class22(64);
	static int anInt4071;
	int anInt4072;
	static int anInt4073;
	int anInt4074 = 0;

	public static void method1858(int i) {
		try {
			anIntArray4068 = null;
			int i_0_ = 5 / ((72 - i) / 42);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.A(" + i + ')');
		}
	}

	static final int method1859(byte i) {
		try {
			anInt4073++;
			if (i != 81)
				return 96;
			return Class280.anInt3787;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.B(" + i + ')');
		}
	}

	static final void method1860(byte i) {
		try {
			anInt4065++;
			Class2_Sub1.anInt5068 = 0;
			Class321.anInt4284 = -1;
			Class220_Sub1.anInt7153 = -1;
			Class228.anInt3150 = -1;
			int i_1_ = -39 % ((i - 24) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.F(" + i + ')');
		}
	}

	final void method1861(int i) {
		do {
			try {
				synchronized (aClass22_4070) {
					aClass22_4070.method190(0);
				}
				anInt4071++;
				if (i == -14494)
					break;
				method1863(67, null, (byte) 50);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ri.H(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1862(byte i) {
		try {
			anInt4069++;
			synchronized (aClass22_4070) {
				aClass22_4070.method189((byte) 103);
				if (i > -62)
					aClass146_4067 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.C(" + i + ')');
		}
	}

	static final int method1863(int i, Random random, byte i_2_) {
		try {
			anInt4064++;
			if ((i ^ 0xffffffff) >= -1)
				throw new IllegalArgumentException();
			if (Class261.method1669(i, (byte) 125))
				return (int) ((long) i
						* ((long) random.nextInt() & 0xffffffffL) >> 32);
			int i_3_ = -(int) (4294967296L % (long) i) + -2147483648;
			if (i_2_ != -119)
				anIntArray4068 = null;
			int i_4_;
			do
				i_4_ = random.nextInt();
			while ((i_4_ ^ 0xffffffff) <= (i_3_ ^ 0xffffffff));
			return InputStream_Sub2.method2812(i_4_, i, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ri.D(" + i + ','
					+ (random != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	final void method1864(int i, int i_5_) {
		try {
			anInt4063++;
			synchronized (aClass22_4070) {
				aClass22_4070.method182(i, (byte) -73);
				if (i_5_ != 587437728)
					method1858(-108);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.G(" + i + ','
					+ i_5_ + ')');
		}
	}

	final Class233 method1865(int i, int i_6_) {
		try {
			anInt4066++;
			Class233 class233;
			synchronized (aClass22_4070) {
				class233 = (Class233) aClass22_4070.method188((long) i_6_,
						(byte) 111);
				if (i != 4)
					((Class302) this).anInt4074 = -28;
			}
			if (class233 != null)
				return class233;
			byte[] is;
			synchronized (aClass146_4067) {
				is = aClass146_4067.method930(i_6_, (byte) 112, 4);
			}
			class233 = new Class233();
			((Class233) class233).anInt3193 = i_6_;
			((Class233) class233).aClass302_3196 = this;
			if (is != null)
				class233.method1491(new Stream(is), i - 37);
			class233.method1488((byte) 121);
			synchronized (aClass22_4070) {
				aClass22_4070.method184((byte) 126, class233, (long) i_6_);
			}
			return class233;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ri.E(" + i + ','
					+ i_6_ + ')');
		}
	}

	Class302(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_4067 = class146;
			((Class302) this).anInt4072 = aClass146_4067.method914(4, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ri.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
