/* Class91_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class91_Sub3 extends Class91 {
	static int anInt8423;
	static int anInt8424;
	static IncomingPacket aClass160_8425 = new IncomingPacket(94, 8);

	public static void method3326(int i) {
		do {
			try {
				aClass160_8425 = null;
				if (i < -57)
					break;
				method3327(28, 90, -46, 49);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vga.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3327(int i, int i_0_, int i_1_, int i_2_) {
		do {
			try {
				anInt8423++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 9, i);
				class11_sub45_sub15.method3661(0);
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i_1_;
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_0_;
				if (i_2_ == -4847)
					break;
				aClass160_8425 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vga.C(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3328(int i, int i_3_, int i_4_, boolean bool) {
		do {
			try {
				i_4_ = i_4_
						* ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5722
								.method2462(bool) >> 8;
				anInt8424++;
				if ((i_4_ ^ 0xffffffff) == -1 || i_3_ == -1)
					break;
				if (!Class376_Sub7.aBool7049
						&& Class11_Sub12_Sub1.anInt8828 != -1
						&& Class11_Sub12_Sub4.method3722(-21552)
						&& !Class365.method2164(true)) {
					Class11_Sub29.aClass11_Sub6_Sub2_6591 = Class273
							.method1704(92);
					Class11_Sub6_Sub2 class11_sub6_sub2 = Class291.method1801(
							(Class11_Sub29.aClass11_Sub6_Sub2_6591), (byte) 9);
					Class11_Sub2_Sub3.method3339(true, (byte) -114,
							class11_sub6_sub2);
				}
				Class91_Sub2.method3111(i_4_, i_3_, 0, false,
						Class150.aClass146_2002, 0);
				Class11_Sub2_Sub33.method3805(0, -1, 255);
				Class376_Sub7.aBool7049 = true;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vga.B(" + i + ','
						+ i_3_ + ',' + i_4_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}
}
