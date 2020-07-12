/* Class11_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub10 extends Class11 {
	static int anInt5389;
	static int anInt5390 = 0;
	static int anInt5391;
	int anInt5392;
	static int anInt5393;
	OutgoingPacket aClass370_5394;
	int anInt5395;
	static Class146 aClass146_5396;
	Packet aClass11_Sub20_Sub1_5397;
	static int anInt5398;

	final void method2367(int i) {
		do {
			try {
				anInt5391++;
				if ((Class340.aClass11_Sub10Array4499.length ^ 0xffffffff) < (Class240.anInt3257 ^ 0xffffffff)) {
					Class340.aClass11_Sub10Array4499[Class240.anInt3257++] = this;
					if (i <= -101)
						break;
					((Class11_Sub10) this).anInt5395 = -13;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hha.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method2368(byte i) {
		try {
			anInt5393++;
			if ((double) Class32.aFloat429 == 3.0)
				return 37;
			if (i > -61)
				return -123;
			if ((double) Class32.aFloat429 == 4.0)
				return 50;
			if ((double) Class32.aFloat429 == 6.0)
				return 75;
			if ((double) Class32.aFloat429 == 8.0)
				return 100;
			return 200;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hha.C(" + i + ')');
		}
	}

	public static void method2369(int i) {
		try {
			if (i <= 30)
				anInt5398 = 12;
			aClass146_5396 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hha.B(" + i + ')');
		}
	}

	static {
		anInt5389 = -1;
	}
}
