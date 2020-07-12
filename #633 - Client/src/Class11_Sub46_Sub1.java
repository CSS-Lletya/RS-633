/* Class11_Sub46_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub46_Sub1 extends Class11_Sub46 {
	static int anInt8829;
	static int anInt8830;
	static int anInt8831;
	static IncomingPacket MUSIC_IN_PACKET = new IncomingPacket(62, 4);
	static Class146 aClass146_8833;
	static int[] anIntArray8834 = new int[500];

	final void method3202(float f, int i) {
		do {
			try {
				anInt8829++;
				((Class11_Sub46) this).aFloat7973 = f;
				if (i == 65536)
					break;
				anIntArray8834 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cr.D(" + f + ','
						+ i + ')');
			}
			break;
		} while (false);
	}

	final void method3212(int i, int i_0_, int i_1_, int i_2_) {
		try {
			((Class11_Sub46) this).anInt7970 = i_1_;
			((Class11_Sub46) this).anInt7974 = i_0_;
			if (i_2_ != 16)
				method3202(0.75609535F, 79);
			((Class11_Sub46) this).anInt7983 = i;
			anInt8831++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cr.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method3468(int i, int[] is, int i_3_,
			Player class376_sub7_sub5_sub5_sub1) {
		do {
			try {
				if ((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272) != null) {
					boolean bool = true;
					for (int i_4_ = 0; (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
						if ((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272[i_4_]) != is[i_4_]) {
							bool = false;
							break;
						}
					}
					if (bool
							&& ((Actor) class376_sub7_sub5_sub5_sub1).anInt10352 != -1) {
						Class281 class281 = (Class108_Sub23.aClass198_7760
								.method1284(
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10352,
										(byte) -125));
						int i_5_ = ((Class281) class281).anInt3816;
						if (i_5_ == 1) {
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10286 = i_3_;
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10326 = 0;
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10282 = 0;
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10305 = 0;
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10283 = 1;
							if (!((Actor) class376_sub7_sub5_sub5_sub1).aBool10331)
								Class268.method1690(
										-701644944,
										((Actor) class376_sub7_sub5_sub5_sub1).anInt10326,
										class376_sub7_sub5_sub5_sub1, class281);
						}
						if ((i_5_ ^ 0xffffffff) == -3)
							((Actor) class376_sub7_sub5_sub5_sub1).anInt10305 = 0;
					}
				}
				anInt8830++;
				boolean bool = true;
				for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_6_++) {
					if ((is[i_6_] ^ 0xffffffff) != 0)
						bool = false;
					if (((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272 == null
							|| ((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272[i_6_]) ^ 0xffffffff) == 0
							|| ((((Class281) Class108_Sub23.aClass198_7760
									.method1284(is[i_6_], (byte) -38)).anInt3792) >= ((Class281) (Class108_Sub23.aClass198_7760
									.method1284(
											(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272[i_6_]),
											(byte) -122))).anInt3792)) {
						((Actor) class376_sub7_sub5_sub5_sub1).anInt10286 = i_3_;
						((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272 = is;
						break;
					}
				}
				if (bool) {
					((Actor) class376_sub7_sub5_sub5_sub1).anInt10286 = i_3_;
					((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10272 = is;
				}
				if (i == -1)
					break;
				aClass146_8833 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cr.B("
						+ i
						+ ','
						+ (is != null ? "{...}" : "null")
						+ ','
						+ i_3_
						+ ','
						+ ((class376_sub7_sub5_sub5_sub1 != null) ? "{...}"
								: "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method3469(int i) {
		do {
			try {
				anIntArray8834 = null;
				MUSIC_IN_PACKET = null;
				aClass146_8833 = null;
				if (i >= 110)
					break;
				method3469(126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cr.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub46_Sub1(int i, int i_7_, int i_8_, int i_9_, int i_10_, float f) {
		super(i, i_7_, i_8_, i_9_, i_10_, f);
	}
}
