/* Class268 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class268 {
	int anInt3629 = 64;
	static int anInt3630;
	int anInt3631;
	static int anInt3632;
	static int anInt3633;
	int anInt3634 = 64;
	static Class253[] aClass253Array3635;
	static int anInt3636;
	boolean aBool3637;
	boolean aBool3638;
	static Class368 aClass368_3639;
	static int anInt3640;
	int anInt3641;
	int anInt3642;

	static final int method1687(int i, int i_0_) {
		try {
			anInt3636++;
			if (i != 26922)
				return -90;
			return i_0_ >>> 7;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ow.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1688(Stream stream, int i, byte i_1_) {
		try {
			for (;;) {
				int i_2_ = stream.readUnsignedByte((byte) 35);
				if ((i_2_ ^ 0xffffffff) == -1)
					break;
				method1689(i_2_, stream, i, (byte) 0);
			}
			int i_3_ = -18 % ((i_1_ - 49) / 52);
			anInt3630++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ow.B("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_1_ + ')'));
		}
	}

	private final void method1689(int i, Stream stream, int i_4_, byte i_5_) {
		try {
			if ((i ^ 0xffffffff) != -2) {
				if ((i ^ 0xffffffff) == -3) {
					((Class268) this).anInt3634 = stream
							.readUnsignedShort((byte) -65) + 1;
					((Class268) this).anInt3629 = stream
							.readUnsignedShort((byte) -65) + 1;
				} else if ((i ^ 0xffffffff) != -4) {
					if ((i ^ 0xffffffff) != -5) {
						if (i == 5)
							((Class268) this).anInt3642 = stream
									.readUnsignedByte((byte) 35);
						else if ((i ^ 0xffffffff) != -7) {
							if (i == 7)
								((Class268) this).aBool3638 = true;
						} else
							((Class268) this).aBool3637 = true;
					} else
						((Class268) this).anInt3641 = stream
								.readUnsignedByte((byte) 35);
				} else
					stream.readByte(1854307120);
			} else {
				((Class268) this).anInt3631 = stream
						.readUnsignedShort((byte) -65);
				if ((((Class268) this).anInt3631 ^ 0xffffffff) == -65536)
					((Class268) this).anInt3631 = -1;
			}
			if (i_5_ == 0)
				anInt3633++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ow.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ')'));
		}
	}

	static final void method1690(int i, int i_6_, Class376_Sub7 class376_sub7,
			Class281 class281) {
		try {
			anInt3632++;
			if (Class376_Sub7_Sub3_Sub1.anInt9863 < 50
					&& (class281 != null
							&& ((Class281) class281).anIntArrayArray3813 != null
							&& (((Class281) class281).anIntArrayArray3813.length ^ 0xffffffff) < (i_6_ ^ 0xffffffff) && ((Class281) class281).anIntArrayArray3813[i_6_] != null)
					&& i == -701644944) {
				int i_7_ = ((Class281) class281).anIntArrayArray3813[i_6_][0];
				int i_8_ = i_7_ >> 8;
				int i_9_ = 0x7 & i_7_ >> 5;
				if (((Class281) class281).anIntArrayArray3813[i_6_].length > 1) {
					int i_10_ = (int) ((double) (((Class281) class281).anIntArrayArray3813[i_6_]).length * Math
							.random());
					if (i_10_ > 0)
						i_8_ = (((Class281) class281).anIntArrayArray3813[i_6_][i_10_]);
				}
				int i_11_ = 0x1f & i_7_;
				int i_12_ = 256;
				if (((Class281) class281).anIntArray3812 != null
						&& ((Class281) class281).anIntArray3793 != null)
					i_12_ = (((Class281) class281).anIntArray3812[i_6_] + (int) (Math
							.random() * (double) ((((Class281) class281).anIntArray3793[i_6_]) - (((Class281) class281).anIntArray3812[i_6_]))));
				int i_13_ = (((Class281) class281).anIntArray3819 != null ? ((Class281) class281).anIntArray3819[i_6_]
						: 255);
				if (i_11_ == 0) {
					if (Class11_Sub2_Sub8.myPlayer == class376_sub7) {
						if (!((Class281) class281).aBool3800)
							Class133.method860(i_12_, i_13_, (byte) 112, i_9_,
									i_8_, 0);
						else
							Class254.method1630(i_8_, false, i_9_, i_12_, i
									^ ~0x29d26437, i_13_, 0);
					}
				} else if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5725
						.method2462(false) ^ 0xffffffff) != -1) {
					int i_14_ = ((Class376_Sub7) class376_sub7).anInt7045 - 256 >> 9;
					int i_15_ = (-256
							+ ((Class376_Sub7) class376_sub7).anInt7031 >> 9);
					int i_16_ = (((Class11_Sub2_Sub8.myPlayer) == class376_sub7) ? 0
							: i_11_
									+ ((i_15_ << 8) + ((((Class376_Sub7) class376_sub7).aByte7047) << 24))
									- -(i_14_ << 16));
					Class343.aClass56Array4543[Class376_Sub7_Sub3_Sub1.anInt9863++] = new Class56(
							(!((Class281) class281).aBool3800 ? (byte) 1
									: (byte) 2), i_8_, i_9_, 0, i_13_, i_16_,
							i_12_, class376_sub7);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ow.E(" + i + ','
					+ i_6_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + (class281 != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method1691(boolean bool) {
		try {
			if (bool != false)
				aClass368_3639 = null;
			anInt3640++;
			if (Class11_Sub2_Sub32_Sub1.aClass192_9889 == null) {
				if (!Class306.aBool4114
						&& Class11_Sub19.aClass11_Sub45_Sub5_5815 != null)
					return (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).anInt8769);
				int i = Class280.aClass225_3786.method1449(-73);
				int i_17_ = Class280.aClass225_3786.method1448((byte) -63);
				if (!Class11_Sub2_Sub14.aBool9015) {
					if ((i ^ 0xffffffff) < (Class319.anInt4242 ^ 0xffffffff)
							&& i < Class205.anInt2757 + Class319.anInt4242) {
						int i_18_ = -1;
						for (int i_19_ = 0; ((Class52.anInt802 ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
							if (!Class254_Sub3.aBool8049) {
								int i_20_ = (Class144.anInt1944 + 31 - -((-1 + (Class52.anInt802 - i_19_)) * 16));
								if (-13 + i_20_ < i_17_
										&& (i_17_ ^ 0xffffffff) >= (3 + i_20_ ^ 0xffffffff))
									i_18_ = i_19_;
							} else {
								int i_21_ = 33 + (Class144.anInt1944 + (-1 + (Class52.anInt802 - i_19_)) * 16);
								if (-13 + i_21_ < i_17_
										&& ((i_21_ + 3 ^ 0xffffffff) <= (i_17_ ^ 0xffffffff)))
									i_18_ = i_19_;
							}
						}
						if (i_18_ != -1) {
							int i_22_ = 0;
							Class336 class336 = new Class336(
									Class94_Sub1.aClass84_5220);
							for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) class336
									.method2018(11034)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) class336
									.method2022(146800640))) {
								if (i_18_ == i_22_++)
									return (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8769);
							}
						}
					}
				} else if ((Class319.anInt4242 ^ 0xffffffff) <= (i ^ 0xffffffff)
						|| Class205.anInt2757 + Class319.anInt4242 <= i) {
					if (Class58.aClass11_Sub45_Sub14_873 != null
							&& i > Class66.anInt942
							&& ((i ^ 0xffffffff) > (Class66.anInt942
									- -Class11_Sub2_Sub36.anInt9753 ^ 0xffffffff))) {
						int i_23_ = -1;
						for (int i_24_ = 0; (i_24_ < ((Class11_Sub45_Sub14) Class58.aClass11_Sub45_Sub14_873).anInt9313); i_24_++) {
							if (!Class254_Sub3.aBool8049) {
								int i_25_ = (16 * i_24_ + (31 + Class11_Sub2_Sub25.anInt9328));
								if (i_17_ > -13 + i_25_ && i_25_ + 3 >= i_17_)
									i_23_ = i_24_;
							} else {
								int i_26_ = (i_24_ * 16 + (33 + Class11_Sub2_Sub25.anInt9328));
								if ((-13 + i_26_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)
										&& (i_17_ ^ 0xffffffff) >= (i_26_ + 3 ^ 0xffffffff))
									i_23_ = i_24_;
							}
						}
						if ((i_23_ ^ 0xffffffff) != 0) {
							int i_27_ = 0;
							Class228 class228 = new Class228(
									((Class11_Sub45_Sub14) (Class58.aClass11_Sub45_Sub14_873)).aClass38_9312);
							for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) class228
									.method1472(true)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) class228
									.method1471((byte) 106))) {
								if (i_23_ == i_27_++)
									return (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8769);
							}
						}
					}
				} else {
					int i_28_ = -1;
					for (int i_29_ = 0; ((Class307.anInt4123 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
						if (!Class254_Sub3.aBool8049) {
							int i_30_ = i_29_ * 16 + Class144.anInt1944 + 31;
							if (i_17_ > -13 + i_30_ && i_30_ + 3 >= i_17_)
								i_28_ = i_29_;
						} else {
							int i_31_ = 16 * i_29_ + 33 + Class144.anInt1944;
							if (i_31_ - 13 < i_17_
									&& (i_17_ ^ 0xffffffff) >= (3 + i_31_ ^ 0xffffffff))
								i_28_ = i_29_;
						}
					}
					if ((i_28_ ^ 0xffffffff) != 0) {
						int i_32_ = 0;
						Class228 class228 = new Class228(Class161.aClass38_2097);
						for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) class228
								.method1472(true)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) class228
								.method1471((byte) 106))) {
							if ((i_28_ ^ 0xffffffff) == (i_32_++ ^ 0xffffffff)) {
								if ((((Class11_Sub45_Sub14) class11_sub45_sub14).anInt9313 ^ 0xffffffff) == -2)
									return (((Class11_Sub45_Sub5) (Class11_Sub45_Sub5) (((Class11_Sub45) (((Class38) (((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312)).aClass11_Sub45_515)).aClass11_Sub45_7903)).anInt8769);
								return -1;
							}
						}
					}
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ow.F(" + bool + ')');
		}
	}

	public static void method1692(byte i) {
		do {
			try {
				aClass253Array3635 = null;
				aClass368_3639 = null;
				if (i > 67)
					break;
				method1691(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ow.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class268() {
		((Class268) this).anInt3631 = -1;
		((Class268) this).aBool3637 = false;
		((Class268) this).anInt3641 = 2;
		((Class268) this).aBool3638 = false;
		((Class268) this).anInt3642 = 1;
	}
}
