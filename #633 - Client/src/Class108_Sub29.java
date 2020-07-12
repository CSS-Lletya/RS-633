/* Class108_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class108_Sub29 extends Class108 {
	static boolean aBool8023 = false;
	static int anInt8024;
	static int anInt8025;
	static int anInt8026;
	static int anInt8027;
	static int anInt8028;
	static int anInt8029;
	static int anInt8030;

	Class108_Sub29(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}

	final boolean method3229(byte i) {
		try {
			anInt8027++;
			int i_0_ = ((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83);
			if (i_0_ < 96)
				return false;
			if (i != -53)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.D(" + i + ')');
		}
	}

	final int method3230(boolean bool) {
		try {
			if (bool != false)
				return -2;
			anInt8025++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.B(" + bool + ')');
		}
	}

	static final void method3231(
			Npc class376_sub7_sub5_sub5_sub2, int i,
			int[] is, byte i_1_) {
		do {
			try {
				anInt8030++;
				if (i_1_ <= 77)
					aBool8023 = true;
				if ((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272) != null) {
					boolean bool = true;
					for (int i_2_ = 0; i_2_ < (((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272).length; i_2_++) {
						if ((is[i_2_] ^ 0xffffffff) != ((((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272[i_2_]) ^ 0xffffffff)) {
							bool = false;
							break;
						}
					}
					if (bool
							&& (((Actor) class376_sub7_sub5_sub5_sub2).anInt10352 ^ 0xffffffff) != 0) {
						Class281 class281 = (Class108_Sub23.aClass198_7760
								.method1284(
										((Actor) class376_sub7_sub5_sub5_sub2).anInt10352,
										(byte) -88));
						int i_3_ = ((Class281) class281).anInt3816;
						if (i_3_ == 1) {
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10283 = 1;
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10286 = i;
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10326 = 0;
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10282 = 0;
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10305 = 0;
							if (!((Actor) class376_sub7_sub5_sub5_sub2).aBool10331)
								Class268.method1690(
										-701644944,
										((Actor) class376_sub7_sub5_sub5_sub2).anInt10326,
										class376_sub7_sub5_sub5_sub2, class281);
						}
						if ((i_3_ ^ 0xffffffff) == -3)
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10305 = 0;
					}
				}
				boolean bool = true;
				for (int i_4_ = 0; is.length > i_4_; i_4_++) {
					if (is[i_4_] != -1)
						bool = false;
					if (((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272 == null
							|| (((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272[i_4_]) == -1
							|| ((((Class281) Class108_Sub23.aClass198_7760
									.method1284(is[i_4_], (byte) 127)).anInt3792) >= ((Class281) (Class108_Sub23.aClass198_7760
									.method1284(
											(((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272[i_4_]),
											(byte) 120))).anInt3792)) {
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10368 = ((Actor) class376_sub7_sub5_sub5_sub2).anInt10375;
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10286 = i;
						((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272 = is;
					}
				}
				if (!bool)
					break;
				((Actor) class376_sub7_sub5_sub5_sub2).anIntArray10272 = is;
				((Actor) class376_sub7_sub5_sub5_sub2).anInt10368 = (((Actor) class376_sub7_sub5_sub5_sub2).anInt10375);
				((Actor) class376_sub7_sub5_sub5_sub2).anInt10286 = i;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("iia.G("
						+ ((class376_sub7_sub5_sub5_sub2 != null) ? "{...}"
								: "null") + ',' + i + ','
						+ (is != null ? "{...}" : "null") + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final int method721(int i, int i_5_) {
		try {
			anInt8028++;
			int i_6_ = ((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83);
			if (i_5_ < 10)
				method3230(false);
			if (i_6_ < 96)
				return 3;
			if ((i ^ 0xffffffff) < -2 && (i_6_ ^ 0xffffffff) > -129)
				return 3;
			if ((i ^ 0xffffffff) < -4 && (i_6_ ^ 0xffffffff) > -193)
				return 3;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method726(boolean bool) {
		try {
			anInt8026++;
			int i = ((Class108) this).aClass11_Sub17_1458.method2458(true)
					.method702((byte) -83);
			if (i < 96)
				((Class108) this).anInt1459 = 0;
			if ((((Class108) this).anInt1459 ^ 0xffffffff) < -2 && i < 128)
				((Class108) this).anInt1459 = 1;
			if (bool != false)
				method3230(false);
			if (((Class108) this).anInt1459 > 2 && (i ^ 0xffffffff) > -193)
				((Class108) this).anInt1459 = 2;
			if ((((Class108) this).anInt1459 ^ 0xffffffff) > -1
					|| ((Class108) this).anInt1459 > 3)
				((Class108) this).anInt1459 = method725((byte) -10);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.E(" + bool + ')');
		}
	}

	final int method725(byte i) {
		try {
			int i_7_ = 15 / ((i - 70) / 51);
			anInt8029++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.A(" + i + ')');
		}
	}

	final void method728(int i, int i_8_) {
		try {
			if (i == 0) {
				((Class108) this).anInt1459 = i_8_;
				anInt8024++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iia.C(" + i + ','
					+ i_8_ + ')');
		}
	}

	Class108_Sub29(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}
}
