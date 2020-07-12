/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class87 {
	int anInt1202;
	static int anInt1203;
	int anInt1204;
	static int anInt1205;
	int anInt1206;
	int anInt1207;
	int anInt1208;
	int anInt1209;
	static Class163 aClass163_1210;
	int anInt1211;
	int anInt1212;
	static int anInt1213;
	int anInt1214;
	int anInt1215;
	int anInt1216;
	int anInt1217;

	static final void method614(int i, boolean bool) {
		do {
			try {
				Class11_Sub45_Sub1.anInt8492 = i;
				anInt1213++;
				synchronized (Class207.aClass22_2795) {
					Class207.aClass22_2795.method189((byte) -128);
				}
				if (bool == false)
					break;
				aClass163_1210 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uia.C(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	static final byte[] method615(String string, int i) {
		try {
			anInt1203++;
			int i_0_ = string.length();
			if ((i_0_ ^ 0xffffffff) == -1)
				return new byte[0];
			int i_1_ = 3 + i_0_ & ~0x3;
			int i_2_ = i_1_ / 4 * 3;
			if (i > -38)
				aClass163_1210 = null;
			if (-2 + i_1_ >= i_0_
					|| (Class85.method596((byte) -123, string.charAt(i_1_ - 2)) ^ 0xffffffff) == 0)
				i_2_ -= 2;
			else if (i_1_ - 1 >= i_0_
					|| Class85.method596((byte) -123, string.charAt(i_1_ - 1)) == -1)
				i_2_--;
			byte[] is = new byte[i_2_];
			Class327.method1984(0, 17363, string, is);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uia.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method616(byte i) {
		try {
			int i_3_ = -52 % ((-15 - i) / 50);
			aClass163_1210 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uia.D(" + i + ')');
		}
	}

	final boolean method617(int i, Class87 class87_4_) {
		try {
			anInt1205++;
			int i_5_ = 79 % ((56 - i) / 58);
			if (((((Class87) class87_4_).anInt1206 ^ 0xffffffff) == (((Class87) this).anInt1206 ^ 0xffffffff))
					&& (((Class87) this).anInt1208 == ((Class87) class87_4_).anInt1208)
					&& (((Class87) class87_4_).anInt1216 == ((Class87) this).anInt1216))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uia.A(" + i + ','
					+ (class87_4_ != null ? "{...}" : "null") + ')');
		}
	}

	public Class87() {
		/* empty */
	}
}
