/* Class11_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub8 extends Class11 implements Interface25 {
	int anInt5295;
	static int anInt5296;
	char aChar5297;
	static int anInt5298;
	static int anInt5299;
	long aLong5300;
	int anInt5301;
	static IncomingPacket aClass160_5302 = new IncomingPacket(45, 4);
	static int anInt5303;
	static int anInt5304;
	static int anInt5305;
	int anInt5306;
	static Class83 aClass83_5307;
	static int anInt5308 = -1;
	static long[] aLongArray5309;
	static Class146 aClass146_5310;

	public final long method55(int i) {
		try {
			anInt5305++;
			if (i != 32678)
				return -17L;
			return ((Class11_Sub8) this).aLong5300;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.E(" + i + ')');
		}
	}

	static final boolean method2338(int i, int i_0_, int i_1_) {
		try {
			anInt5304++;
			if (i > -103)
				aLongArray5309 = null;
			if ((i_1_ & 0x400) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pia.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final int method58(int i) {
		try {
			anInt5296++;
			if (i != 2674)
				method56(81);
			return ((Class11_Sub8) this).anInt5301;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.F(" + i + ')');
		}
	}

	public final int method57(int i) {
		try {
			anInt5298++;
			if (i != -31285)
				return 114;
			return ((Class11_Sub8) this).anInt5306;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.D(" + i + ')');
		}
	}

	public final char method56(int i) {
		try {
			if (i != 4152)
				return '\uffef';
			anInt5299++;
			return ((Class11_Sub8) this).aChar5297;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.A(" + i + ')');
		}
	}

	public static void method2339(int i) {
		try {
			aClass146_5310 = null;
			aClass160_5302 = null;
			int i_2_ = -85 / ((-24 - i) / 35);
			aClass83_5307 = null;
			aLongArray5309 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.C(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt5303++;
			if (i < 106)
				aClass83_5307 = null;
			return ((Class11_Sub8) this).anInt5295;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pia.B(" + i + ')');
		}
	}

	static {
		aClass83_5307 = new Class83(8, 7);
	}
}
