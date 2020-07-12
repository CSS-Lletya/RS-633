/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class227 {
	static int anInt3122;
	static int anInt3123;
	static int anInt3124;
	Class146 aClass146_3125;
	static int anInt3126;
	private Class146 aClass146_3127;
	private Class22 aClass22_3128 = new Class22(64);
	static int anInt3129;
	static int anInt3130;
	static IncomingPacket aClass160_3131 = new IncomingPacket(92, -2);
	Class22 aClass22_3132 = new Class22(60);
	static int[] anIntArray3133 = new int[13];
	static IncomingPacket aClass160_3134 = new IncomingPacket(28, 16);
	static int anInt3135 = 0;
	int anInt3136;
	static char[] aCharArray3137 = { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6',
			'7', '8', '9' };

	final void method1461(int i, int i_0_) {
		try {
			anInt3124++;
			synchronized (aClass22_3128) {
				aClass22_3128.method182(i_0_, (byte) -73);
				if (i < 121)
					method1463(24);
			}
			synchronized (((Class227) this).aClass22_3132) {
				((Class227) this).aClass22_3132.method182(i_0_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ls.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method1462(int i, int i_1_, int i_2_, int i_3_,
			boolean bool) {
		try {
			anInt3130++;
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
					.method3181(false) ^ 0xffffffff) == -1)
				Class236_Sub1.method2605((byte) 113, false);
			else {
				Class321.anInt4295 = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
						.method3181(false);
				Class239.method1521(true, i_3_, 0);
			}
			Class376_Sub7_Sub2_Sub2.aBool10226 = bool;
			if (i_3_ != 0)
				method1464((byte) -5);
			Class11_Sub28.anInt6575 = i_1_;
			Class108_Sub1.anInt5027 = i;
			Class32.method281(i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ls.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool + ')'));
		}
	}

	final void method1463(int i) {
		try {
			synchronized (aClass22_3128) {
				aClass22_3128.method190(0);
			}
			anInt3122++;
			if (i != 121)
				method1466((byte) 117);
			synchronized (((Class227) this).aClass22_3132) {
				((Class227) this).aClass22_3132.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ls.C(" + i + ')');
		}
	}

	public static void method1464(byte i) {
		do {
			try {
				aClass160_3134 = null;
				aCharArray3137 = null;
				anIntArray3133 = null;
				aClass160_3131 = null;
				if (i >= 108)
					break;
				method1464((byte) -78);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ls.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class224 method1465(int i, byte i_4_) {
		try {
			anInt3129++;
			Class224 class224;
			synchronized (aClass22_3128) {
				class224 = (Class224) aClass22_3128.method188((long) i,
						(byte) -63);
			}
			if (class224 != null)
				return class224;
			int i_5_ = -54 % ((i_4_ + 7) / 52);
			byte[] is;
			synchronized (aClass146_3127) {
				is = aClass146_3127.method930(
						Class11_Sub35_Sub1.method3569(-115, i), (byte) 112,
						Class11_Sub2_Sub2.method3332(i, (byte) -128));
			}
			class224 = new Class224();
			((Class224) class224).aClass227_3084 = this;
			((Class224) class224).anInt3091 = i;
			if (is != null)
				class224.method1432(87, new Stream(is));
			synchronized (aClass22_3128) {
				aClass22_3128.method184((byte) 127, class224, (long) i);
			}
			return class224;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ls.F(" + i + ','
					+ i_4_ + ')');
		}
	}

	final void method1466(byte i) {
		try {
			anInt3123++;
			synchronized (aClass22_3128) {
				if (i != 78)
					return;
				aClass22_3128.method189((byte) -128);
			}
			synchronized (((Class227) this).aClass22_3132) {
				((Class227) this).aClass22_3132.method189((byte) -31);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ls.E(" + i + ')');
		}
	}

	final void method1467(int i, byte i_6_) {
		try {
			((Class227) this).anInt3136 = i;
			if (i_6_ <= 102)
				method1466((byte) -10);
			anInt3126++;
			synchronized (((Class227) this).aClass22_3132) {
				((Class227) this).aClass22_3132.method189((byte) -128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ls.G(" + i + ','
					+ i_6_ + ')');
		}
	}

	Class227(Class66 class66, int i, Class146 class146, Class146 class146_7_) {
		try {
			aClass146_3127 = class146;
			((Class227) this).aClass146_3125 = class146_7_;
			int i_8_ = aClass146_3127.method928((byte) 20) - 1;
			aClass146_3127.method914(i_8_, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ls.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_7_ != null ? "{...}" : "null") + ')'));
		}
	}
}
