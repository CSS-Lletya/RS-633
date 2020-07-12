/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3 {
	static Packet packetStream = new Packet(7500);
	static int anInt22;
	static IncomingPacket aClass160_23 = new IncomingPacket(89, -1);

	public static void method80(byte i) {
		try {
			packetStream = null;
			int i_0_ = 8 / ((i + 41) / 37);
			aClass160_23 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eha.A(" + i + ')');
		}
	}

	static final void method81(boolean bool, int i, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_) {
		try {
			anInt22++;
			Class376_Sub8 class376_sub8 = ((Class376_Sub8) Class163_Sub2.aClass131_7378
					.method847(-31182));
			if (bool != false)
				method80((byte) 50);
			for (/**/; class376_sub8 != null; class376_sub8 = (Class376_Sub8) Class163_Sub2.aClass131_7378
					.method856(67)) {
				if ((Class11_Sub25.anInt6279 ^ 0xffffffff) <= (((Class376_Sub8) class376_sub8).anInt7752 ^ 0xffffffff))
					class376_sub8.method2207((byte) -123);
				else {
					Class303.method1866(
							256 + (((Class376_Sub8) class376_sub8).anInt7753 << 9),
							((Class376_Sub8) class376_sub8).anInt7751 * 2,
							((Class376_Sub8) class376_sub8).anInt7755,
							(byte) -60,
							i,
							i_2_ >> 1,
							i_1_ >> 1,
							i_5_,
							((((Class376_Sub8) class376_sub8).anInt7750 << 9) + 256));
					Class98.aClass107_1308
							.method709(
									i_3_ - -Class12.anIntArray104[1],
									Class12.anIntArray104[0] + i_4_,
									0,
									false,
									~0xffffff
											| ((Class376_Sub8) class376_sub8).anInt7748,
									((Class376_Sub8) class376_sub8).aString7754);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eha.B(" + bool + ','
					+ i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}
}
