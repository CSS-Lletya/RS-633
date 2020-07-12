/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class283 {
	int anInt3827;
	static int anInt3828;
	boolean aBool3829 = true;
	static int anInt3830;
	static int anInt3831;
	static int anInt3832;
	String aString3833;
	private char aChar3834;
	static int anInt3835 = 0;
	static int anInt3836;

	static final void method1744(byte i) {
		do {
			try {
				anInt3831++;
				if (Class14.anInt124 < 0) {
					Class14.anInt124 = 0;
					Class11_Sub12.anInt5446 = -1;
					Class127.anInt1720 = -1;
				}
				if (Class32.anInt432 < Class14.anInt124) {
					Class127.anInt1720 = -1;
					Class14.anInt124 = Class32.anInt432;
					Class11_Sub12.anInt5446 = -1;
				}
				if (i != 56)
					method1748(-65, null);
				if ((Class239_Sub2.anInt7912 ^ 0xffffffff) > -1) {
					Class11_Sub12.anInt5446 = -1;
					Class127.anInt1720 = -1;
					Class239_Sub2.anInt7912 = 0;
				}
				if (Class32.anInt447 >= Class239_Sub2.anInt7912)
					break;
				Class239_Sub2.anInt7912 = Class32.anInt447;
				Class127.anInt1720 = -1;
				Class11_Sub12.anInt5446 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kca.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1745(int i) {
		try {
			if (i != 0)
				((Class283) this).aBool3829 = true;
			anInt3832++;
			if ((aChar3834 ^ 0xffffffff) != -116)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kca.A(" + i + ')');
		}
	}

	private final void method1746(Stream stream, int i, int i_0_) {
		try {
			anInt3830++;
			if (i_0_ == -28055) {
				if (i == 1)
					aChar3834 = Class64.method486(stream.readByte(1854307120),
							0);
				else if (i == 2)
					((Class283) this).anInt3827 = stream.readInt(88);
				else if (i != 4) {
					if (i == 5)
						((Class283) this).aString3833 = stream.readString(-1);
				} else
					((Class283) this).aBool3829 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kca.B("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ')'));
		}
	}

	final void method1747(Stream stream, int i) {
		try {
			if (i == -1) {
				for (;;) {
					int i_1_ = stream.readUnsignedByte((byte) 35);
					if ((i_1_ ^ 0xffffffff) == -1)
						break;
					method1746(stream, i_1_, i ^ 0x6d96);
				}
				anInt3836++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kca.C("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final boolean method1748(int i, Class23 class23) {
		try {
			anInt3828++;
			if (i <= 29)
				return false;
			if (class23 == null)
				return false;
			if (!((Class23) class23).aBool238)
				return false;
			if (!class23.method196(Class32.anInterface20_421, 2))
				return false;
			if (Class287.aClass213_3883.method1369((byte) 26,
					(long) ((Class23) class23).anInt233) != null)
				return false;
			if (Class161.aClass213_2098.method1369((byte) 26,
					(long) ((Class23) class23).anInt207) != null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kca.D(" + i + ','
					+ (class23 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class283() {
		/* empty */
	}
}
