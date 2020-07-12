/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class91 {
	static int anInt1233;
	static long aLong1234;
	static OutgoingPacket aClass370_1235 = new OutgoingPacket(66, 15);
	static int anInt1236;
	static OutgoingPacket aClass370_1237 = new OutgoingPacket(73, -1);
	static double aDouble1238;

	static final void method623(int i, int i_0_) {
		try {
			anInt1236++;
			Class11_Sub12.anInt5446 = -1;
			Class239_Sub2.anInt7912 = i;
			Class11_Sub12.anInt5446 = i_0_;
			Class283.method1744((byte) 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bq.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method624(boolean bool) {
		try {
			if (bool != true)
				method625((byte) 17);
			Class204.anIntArray2744 = null;
			Class289.anIntArray3902 = null;
			Class12.anIntArray105 = null;
			Class100.anIntArray1329 = null;
			Class232.anIntArray3175 = null;
			anInt1233++;
			Class11_Sub46_Sub2.aBool9060 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bq.E(" + bool + ')');
		}
	}

	public static void method625(byte i) {
		do {
			try {
				aClass370_1237 = null;
				aClass370_1235 = null;
				if (i == -26)
					break;
				method624(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bq.F(" + i + ')');
			}
			break;
		} while (false);
	}
}
