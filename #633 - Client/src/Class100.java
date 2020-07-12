/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100 {
	String aString1323;
	static int anInt1324;
	int anInt1325;
	static int anInt1326;
	static int anInt1327;
	static boolean aBool1328 = false;
	static int[] anIntArray1329;
	long aLong1330;
	String aString1331;
	int anInt1332;

	static final void method666(Class163 class163, int i) {
		do {
			try {
				if (Class306.aBool4114)
					Class102.method677(class163, i ^ 0xff00fe);
				else
					Class291.method1796((byte) -110, class163);
				anInt1324++;
				if (i == -16711936)
					break;
				method667((byte) -123);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("cf.D(" + (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	public static void method667(byte i) {
		do {
			try {
				anIntArray1329 = null;
				if (i > 118)
					break;
				method666(null, 11);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cf.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method668(Class146 class146, Class146 class146_0_,
			Class146 class146_1_, Class146 class146_2_, int i) {
		try {
			if (i != -1)
				anIntArray1329 = null;
			Class254_Sub2_Sub1.aClass146_9493 = class146;
			anInt1327++;
			Class54.aClass146_827 = class146_1_;
			Class47.aClass146_746 = class146_2_;
			Class11_Sub45_Sub5.aClass192ArrayArray8772 = new IComponentDefinitions[Class47.aClass146_746
					.method928((byte) 20)][];
			Class256.aBoolArray3505 = new boolean[Class47.aClass146_746
					.method928((byte) 20)];
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("cf.C("
							+ (class146 != null ? "{...}" : "null") + ','
							+ (class146_0_ != null ? "{...}" : "null") + ','
							+ (class146_1_ != null ? "{...}" : "null") + ','
							+ (class146_2_ != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	static final int method669(int i, byte i_3_) {
		try {
			anInt1326++;
			int i_4_ = 78 / ((-22 - i_3_) / 63);
			if ((i ^ 0xffffffff) == -16711936)
				return -1;
			return Class124.method814(false, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cf.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	Class100(int i, String string, int i_5_, String string_6_, long l) {
		try {
			((Class100) this).aLong1330 = l;
			((Class100) this).aString1323 = string;
			((Class100) this).anInt1325 = i_5_;
			((Class100) this).aString1331 = string_6_;
			((Class100) this).anInt1332 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cf.<init>(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ (string_6_ != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}
}
