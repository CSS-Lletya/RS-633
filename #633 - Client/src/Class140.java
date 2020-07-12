/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
	static int anInt1894;
	Class140 aClass140_1895;
	Class376_Sub7_Sub5 aClass376_Sub7_Sub5_1896;
	static int anInt1897 = 0;
	static int anInt1898;
	static IncomingPacket aClass160_1899 = new IncomingPacket(2, -1);
	static int anInt1900;

	public static void method885(byte i) {
		try {
			if (i == 46)
				aClass160_1899 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bga.C(" + i + ')');
		}
	}

	static final boolean method886(char c, int i) {
		try {
			anInt1900++;
			if (i != 1000)
				return true;
			if (c < 48 || (c ^ 0xffffffff) < -58)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bga.D(" + c + ',' + i
					+ ')');
		}
	}

	static final boolean method887(boolean bool, int i, int i_0_) {
		try {
			if (bool != false)
				anInt1897 = 64;
			anInt1898++;
			if ((i ^ 0xffffffff) <= -1001 && (i_0_ ^ 0xffffffff) > -1001)
				return true;
			if (i < 1000 && (i_0_ ^ 0xffffffff) > -1001) {
				if (Class12.method134(true, i))
					return false;
				if (Class12.method134(!bool, i_0_))
					return true;
				return false;
			}
			if (i >= 1000 && (i_0_ ^ 0xffffffff) <= -1001)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bga.A(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	static final int method888(int i, int i_1_) {
		if (Class11_Sub39.aByteArrayArray7200 != null)
			return Class11_Sub39.aByteArrayArray7200[i][i_1_] & 0xff;
		return 0;
	}

	final void method889(int i) {
		try {
			anInt1894++;
			if ((Class316.anInt4185 ^ 0xffffffff) > i) {
				((Class140) this).aClass376_Sub7_Sub5_1896 = null;
				((Class140) this).aClass140_1895 = Class108_Sub18.aClass140_6922;
				Class108_Sub18.aClass140_6922 = this;
				Class316.anInt4185++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bga.B(" + i + ')');
		}
	}
}
