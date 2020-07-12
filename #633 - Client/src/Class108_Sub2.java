/* Class108_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub2 extends Class108 {
	static int anInt5071;
	static int anInt5072;
	static int anInt5073;
	static int anInt5074;
	static int anInt5075;
	static IncomingPacket aClass160_5076 = new IncomingPacket(109, 6);
	static int anInt5077;
	static Class298 aClass298_5078 = new Class298("", 16);
	static IncomingPacket aClass160_5079 = new IncomingPacket(84, 4);
	static OutgoingPacket aClass370_5080 = new OutgoingPacket(82, -1);
	static Class217 aClass217_5081;

	Class108_Sub2(int i, Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final void method726(boolean bool) {
		try {
			if (bool != false)
				method721(-36, 118);
			if ((((Class108) this).anInt1459 ^ 0xffffffff) != -2
					&& (((Class108) this).anInt1459 ^ 0xffffffff) != -1)
				((Class108) this).anInt1459 = method725((byte) 122);
			anInt5072++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.E(" + bool + ')');
		}
	}

	final int method2266(boolean bool) {
		try {
			if (bool != false)
				aClass298_5078 = null;
			anInt5071++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.B(" + bool + ')');
		}
	}

	final void method728(int i, int i_0_) {
		do {
			try {
				anInt5074++;
				((Class108) this).anInt1459 = i_0_;
				if (i == 0)
					break;
				method721(119, 110);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "b.C(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	public static void method2267(byte i) {
		try {
			aClass298_5078 = null;
			aClass217_5081 = null;
			aClass160_5076 = null;
			aClass370_5080 = null;
			if (i > 89)
				aClass160_5079 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.D(" + i + ')');
		}
	}

	static final boolean method2268(int i, byte i_1_) {
		try {
			anInt5075++;
			int i_2_ = -79 / ((71 - i_1_) / 55);
			if ((i ^ 0xffffffff) != -4 && i != 4 && (i ^ 0xffffffff) != -6
					&& i != 6)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.G(" + i + ',' + i_1_
					+ ')');
		}
	}

	final int method721(int i, int i_3_) {
		try {
			if (i_3_ < 10)
				aClass160_5079 = null;
			anInt5077++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.F(" + i + ',' + i_3_
					+ ')');
		}
	}

	final int method725(byte i) {
		try {
			anInt5073++;
			int i_4_ = -73 / ((70 - i) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "b.A(" + i + ')');
		}
	}

	Class108_Sub2(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}
}
