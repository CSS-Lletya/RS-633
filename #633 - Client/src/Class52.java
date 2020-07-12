/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class52 {
	static int anInt802 = 0;
	static int anInt803;
	static int anInt804;
	static int anInt805;
	static int anInt806;
	static IncomingPacket UPDATE_ITEMS_IN_PACKET = new IncomingPacket(38, -2);
	private Class22 aClass22_808 = new Class22(64);
	static int anInt809;
	static Class187 aClass187_810;
	private Class146 aClass146_811;
	static int anInt812 = 0;

	final Class283 method432(int i, byte i_0_) {
		try {
			anInt804++;
			Class283 class283;
			synchronized (aClass22_808) {
				class283 = (Class283) aClass22_808.method188((long) i,
						(byte) -82);
				if (i_0_ > -68)
					method435((byte) -40);
			}
			if (class283 != null)
				return class283;
			byte[] is;
			synchronized (aClass146_811) {
				is = aClass146_811.method930(i, (byte) 112, 11);
			}
			class283 = new Class283();
			if (is != null)
				class283.method1747(new Stream(is), -1);
			synchronized (aClass22_808) {
				aClass22_808.method184((byte) 126, class283, (long) i);
			}
			return class283;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fba.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method433(int i) {
		try {
			if (i != 0)
				aClass146_811 = null;
			synchronized (aClass22_808) {
				aClass22_808.method189((byte) 109);
			}
			anInt803++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fba.B(" + i + ')');
		}
	}

	public static void method434(int i) {
		try {
			if (i != 0)
				method437((byte) -26);
			aClass187_810 = null;
			UPDATE_ITEMS_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fba.F(" + i + ')');
		}
	}

	final void method435(byte i) {
		do {
			try {
				anInt809++;
				synchronized (aClass22_808) {
					aClass22_808.method190(0);
				}
				if (i < -48)
					break;
				method436(52, (byte) 69);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fba.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method436(int i, byte i_1_) {
		try {
			anInt806++;
			synchronized (aClass22_808) {
				aClass22_808.method182(i, (byte) -73);
				if (i_1_ < 24)
					method436(-43, (byte) -39);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fba.D(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method437(byte i) {
		try {
			anInt805++;
			if (i < 72)
				method437((byte) 89);
			Class243.aClass163_3308.method1080(Class337.aClass33_4457);
			Class243.aClass163_3308.DA(Class11_Sub10.anInt5398,
					Class376_Sub8.anInt7756, Class287.anInt3888,
					Class273.anInt3687);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fba.E(" + i + ')');
		}
	}

	Class52(Class66 class66, int i, Class146 class146) {
		do {
			try {
				aClass146_811 = class146;
				if (aClass146_811 == null)
					break;
				aClass146_811.method914(11, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fba.<init>("
						+ (class66 != null ? "{...}" : "null") + ',' + i + ','
						+ (class146 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
