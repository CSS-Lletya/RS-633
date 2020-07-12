/* Class11_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub22 extends Class11 {
	static IncomingPacket aClass160_5971 = new IncomingPacket(30, -1);
	int anInt5972 = -2147483648;
	int anInt5973;
	int anInt5974 = 2147483647;
	int anInt5975;
	int anInt5976;
	int anInt5977 = 2147483647;
	int anInt5978 = 2147483647;
	int anInt5979;
	static int anInt5980;
	static int anInt5981;
	static int anInt5982 = 0;
	Class11_Sub21 aClass11_Sub21_5983;

	public static void method2563(byte i) {
		try {
			if (i <= 14)
				method2563((byte) 50);
			aClass160_5971 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "el.B(" + i + ')');
		}
	}

	final boolean method2564(byte i, int i_0_, int i_1_) {
		try {
			anInt5980++;
			if (((Class11_Sub22) this).anInt5978 <= i_1_
					&& ((((Class11_Sub22) this).anInt5973 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
					&& ((((Class11_Sub22) this).anInt5976 ^ 0xffffffff) >= (i_0_ ^ 0xffffffff))
					&& ((Class11_Sub22) this).anInt5975 >= i_0_)
				return true;
			if ((i_1_ ^ 0xffffffff) <= (((Class11_Sub22) this).anInt5977 ^ 0xffffffff)
					&& ((((Class11_Sub22) this).anInt5979 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff))
					&& ((Class11_Sub22) this).anInt5974 <= i_0_
					&& ((Class11_Sub22) this).anInt5972 >= i_0_)
				return true;
			if (i != 11)
				((Class11_Sub22) this).anInt5979 = -89;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("el.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class11_Sub22(Class11_Sub21 class11_sub21) {
		((Class11_Sub22) this).anInt5973 = -2147483648;
		((Class11_Sub22) this).anInt5975 = -2147483648;
		((Class11_Sub22) this).anInt5979 = -2147483648;
		((Class11_Sub22) this).anInt5976 = 2147483647;
		try {
			((Class11_Sub22) this).aClass11_Sub21_5983 = class11_sub21;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "el.<init>("
					+ (class11_sub21 != null ? "{...}" : "null") + ')');
		}
	}
}
