/* Class108_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

final class Class108_Sub7 extends Class108 {
	static boolean aBool5634 = false;
	static int anInt5635;
	static Class146 aClass146_5636;
	static int anInt5637;
	static int anInt5638;
	static int anInt5639;
	static int anInt5640;
	static int anInt5641;
	static int anInt5642;

	final int method725(byte i) {
		try {
			int i_0_ = 91 % ((i - 70) / 51);
			anInt5637++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bk.A(" + i + ')');
		}
	}

	public static void method2434(int i) {
		try {
			if (i > -107)
				aBool5634 = false;
			aClass146_5636 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bk.H(" + i + ')');
		}
	}

	final int method2435(boolean bool) {
		try {
			if (bool != false)
				method728(83, 40);
			anInt5638++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bk.B(" + bool + ')');
		}
	}

	static final Class163 method2436(int i, Interface1 interface1, int i_1_,
			byte i_2_, Canvas canvas) {
		try {
			if (i_2_ <= 73)
				method2437(82, null);
			anInt5635++;
			return new Class163_Sub1(canvas, interface1, i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("bk.G(" + i + ','
							+ (interface1 != null ? "{...}" : "null") + ','
							+ i_1_ + ',' + i_2_ + ','
							+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	final void method728(int i, int i_3_) {
		try {
			((Class108) this).anInt1459 = i_3_;
			if (i != 0)
				aBool5634 = false;
			anInt5639++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bk.C(" + i + ','
					+ i_3_ + ')');
		}
	}

	Class108_Sub7(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	static final Class204 method2437(int i, Stream stream) {
		try {
			if (i != -1)
				return null;
			anInt5640++;
			int i_4_ = stream.readUnsignedShort((byte) -65);
			return new Class204(i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bk.D(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method721(int i, int i_5_) {
		try {
			anInt5642++;
			if (i_5_ <= 10)
				aClass146_5636 = null;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bk.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	Class108_Sub7(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt5641++;
				if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
						|| ((Class108) this).anInt1459 > 4)
					((Class108) this).anInt1459 = method725((byte) 123);
				if (bool == false)
					break;
				aClass146_5636 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bk.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
