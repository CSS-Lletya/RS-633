/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245 {
	static int anInt3315;
	static int anInt3316;
	static int anInt3317;
	static float aFloat3318;
	static int anInt3319;

	static final void method1544(int i, int i_0_) {
		try {
			if (i == 2923) {
				anInt3315++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 5, i_0_);
				class11_sub45_sub15.method3660(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nd.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final boolean method1545(boolean bool) {
		try {
			anInt3317++;
			if (bool != false)
				method1545(true);
			Class4.aBool26 = true;
			Class199.anInt2692++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nd.A(" + bool + ')');
		}
	}

	static final String method1546(int i, int i_1_, int i_2_, byte[] is) {
		try {
			if (i_2_ != 240)
				method1545(true);
			anInt3316++;
			char[] cs = new char[i];
			int i_3_ = 0;
			int i_4_ = i_1_;
			int i_5_ = i_1_ + i;
			while (i_4_ < i_5_) {
				int i_6_ = is[i_4_++] & 0xff;
				int i_7_;
				if (i_6_ >= 128) {
					if (i_6_ < 192)
						i_7_ = 65533;
					else if ((i_6_ ^ 0xffffffff) <= -225) {
						if (i_6_ < 240) {
							if (1 + i_4_ < i_5_
									&& (is[i_4_] & 0xc0) == 128
									&& ((0xc0 & is[i_4_ + 1] ^ 0xffffffff) == -129)) {
								i_7_ = (is[i_4_++] << 6 & 0xfc0
										| (i_6_ & 0xf) << 12 | is[i_4_++] & 0x3f);
								if (i_7_ < 2048)
									i_7_ = 65533;
							} else
								i_7_ = 65533;
						} else if (i_6_ < 248) {
							if (i_4_ + 2 >= i_5_
									|| (0xc0 & is[i_4_] ^ 0xffffffff) != -129
									|| (0xc0 & is[1 + i_4_]) != 128
									|| (0xc0 & is[i_4_ + 2] ^ 0xffffffff) != -129)
								i_7_ = 65533;
							else {
								i_7_ = ((i_6_ & 0x7) << 18 | 0x3f000
										& is[i_4_++] << 12 | is[i_4_++] << 6
										& 0xfc0 | 0x3f & is[i_4_++]);
								if (i_7_ >= 65536 && i_7_ <= 1114111)
									i_7_ = 65533;
								else
									i_7_ = 65533;
							}
						} else
							i_7_ = 65533;
					} else if ((i_5_ ^ 0xffffffff) >= (i_4_ ^ 0xffffffff)
							|| (is[i_4_] & 0xc0 ^ 0xffffffff) != -129)
						i_7_ = 65533;
					else {
						i_7_ = 0x3f & is[i_4_++] | 0x7c0 & i_6_ << 6;
						if ((i_7_ ^ 0xffffffff) > -129)
							i_7_ = 65533;
					}
				} else if ((i_6_ ^ 0xffffffff) == -1)
					i_7_ = 65533;
				else
					i_7_ = i_6_;
				cs[i_3_++] = (char) i_7_;
			}
			return new String(cs, 0, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("nd.C(" + i + ',' + i_1_ + ',' + i_2_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1547(int i, int i_8_) {
		do {
			try {
				anInt3319++;
				Class11_Sub45_Sub1_Sub2.anInt9885 = 2;
				Class108_Sub23.anInt7766 = i_8_;
				long l = 0L;
				if (Class286.aString3874 != null) {
					Stream stream = new Stream(Class87.method615(
							(Class376_Sub7_Sub4.method3766(
									Class286.aString3874, false)), -71));
					l = stream.method2516(8919);
					Class309.aLong4144 = stream.method2516(8919);
				} else {
					Class340.method2051(35, false);
					break;
				}
				Class11_Sub2_Sub4.method3352(
						Class11_Sub49.method3223(l, -2787), true, 0, "");
				if (i > 125)
					break;
				method1545(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nd.B(" + i + ','
						+ i_8_ + ')');
			}
			break;
		} while (false);
	}
}
