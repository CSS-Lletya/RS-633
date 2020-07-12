/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class31 {
	static int anInt408;
	static int anInt409;
	static int anInt410;
	static IncomingPacket aClass160_411 = new IncomingPacket(114, -2);
	static OutgoingPacket aClass370_412 = new OutgoingPacket(80, 3);

	static final void method257(int i, byte i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_) {
		try {
			do {
				if (Class26.anInt340 > i_6_
						|| (i_2_ ^ 0xffffffff) < (Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff)
						|| (i_3_ ^ 0xffffffff) > (Class292.anInt3962 ^ 0xffffffff)
						|| Class351.anInt4618 < i_1_) {
					Class108.method723(i_3_, i_2_, i_4_, 8222, i, i_6_, i_5_,
							i_1_);
					if (!client.aBool10531)
						break;
				}
				Class53.method440(i_5_, i_3_, i_6_, i_1_, i, i_2_, i_4_, 18397);
			} while (false);
			if (i_0_ < 78)
				aClass370_412 = null;
			anInt408++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pha.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method258(boolean bool) {
		do {
			try {
				anInt410++;
				if (!Class118.aBool1602) {
					Class144.method905(
							(Class220_Sub1.aClass364ArrayArrayArray7155), 0);
					if (Class108_Sub6.aClass364ArrayArrayArray5627 != null)
						Class144.method905(
								(Class108_Sub6.aClass364ArrayArrayArray5627), 0);
					Class118.aBool1602 = true;
					if (bool == false)
						break;
					aClass160_411 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pha.A(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method259(byte i, Class11 class11, Class11 class11_7_) {
		try {
			if (i == -102) {
				if (((Class11) class11_7_).aClass11_90 != null)
					class11_7_.method122(-46);
				anInt409++;
				((Class11) class11_7_).aClass11_90 = ((Class11) class11).aClass11_90;
				((Class11) class11_7_).aClass11_88 = class11;
				((Class11) ((Class11) class11_7_).aClass11_90).aClass11_88 = class11_7_;
				((Class11) ((Class11) class11_7_).aClass11_88).aClass11_90 = class11_7_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pha.D(" + i + ','
					+ (class11 != null ? "{...}" : "null") + ','
					+ (class11_7_ != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method260(byte i) {
		try {
			int i_8_ = -116 % ((i - 49) / 62);
			aClass370_412 = null;
			aClass160_411 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pha.C(" + i + ')');
		}
	}
}
