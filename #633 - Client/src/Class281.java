/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class281 {
	int anInt3791;
	int anInt3792 = 5;
	int[] anIntArray3793;
	int[] anIntArray3794;
	static int anInt3795;
	private int[] anIntArray3796;
	boolean aBool3797;
	boolean aBool3798 = false;
	static int anInt3799;
	boolean aBool3800;
	static int anInt3801;
	static int anInt3802;
	int anInt3803;
	static int anInt3804;
	Class198 aClass198_3805;
	static Color[] aColorArray3806 = { new Color(9179409), new Color(3289650),
			new Color(3289650), new Color(3289650) };
	int anInt3807;
	int anInt3808;
	int anInt3809;
	int anInt3810;
	static int anInt3811;
	int[] anIntArray3812;
	int[][] anIntArrayArray3813;
	boolean[] aBoolArray3814;
	int anInt3815;
	int anInt3816;
	int[] anIntArray3817;
	static int anInt3818;
	int[] anIntArray3819;
	boolean aBool3820;

	final Class206 method1732(byte i, int i_0_, int i_1_, int i_2_, int i_3_,
			Class206 class206, int i_4_, int i_5_) {
		try {
			anInt3811++;
			int i_6_ = ((Class281) this).anIntArray3817[i_2_];
			i_2_ = ((Class281) this).anIntArray3794[i_2_];
			Class11_Sub45_Sub18 class11_sub45_sub18 = ((Class281) this).aClass198_3805
					.method1280(41, i_2_ >> 16);
			i_2_ &= 0xffff;
			if (class11_sub45_sub18 == null)
				return class206.method1313(i, i_0_, true);
			if (i_1_ != 256)
				method1735((byte) 55);
			Class11_Sub45_Sub18 class11_sub45_sub18_7_ = null;
			if ((((Class281) this).aBool3798 || Class11_Sub2_Sub11.aBool8858)
					&& (i_5_ ^ 0xffffffff) != 0
					&& ((i_5_ ^ 0xffffffff) > (((Class281) this).anIntArray3794.length ^ 0xffffffff))) {
				i_5_ = ((Class281) this).anIntArray3794[i_5_];
				class11_sub45_sub18_7_ = ((Class281) this).aClass198_3805
						.method1280(-120, i_5_ >> 16);
				i_5_ &= 0xffff;
			}
			if (((Class281) this).aBool3820)
				i_0_ |= 0x200;
			if (class11_sub45_sub18.method3760(false, i_2_))
				i_0_ |= 0x80;
			if (class11_sub45_sub18.method3759(117, i_2_))
				i_0_ |= 0x100;
			if (class11_sub45_sub18.method3755(i_2_, 1))
				i_0_ |= 0x400;
			if (class11_sub45_sub18_7_ != null) {
				if (class11_sub45_sub18_7_.method3760(false, i_5_))
					i_0_ |= 0x80;
				if (class11_sub45_sub18_7_.method3759(i_1_ ^ 0x177, i_5_))
					i_0_ |= 0x100;
				if (class11_sub45_sub18_7_.method3755(i_5_, 1))
					i_0_ |= 0x400;
			}
			i_0_ |= 0x20;
			Class206 class206_8_ = class206.method1313(i, i_0_, true);
			class206_8_.method1304(class11_sub45_sub18, -1 + i_3_, i_2_, i_5_,
					((Class281) this).aBool3820, i_4_, i_6_,
					class11_sub45_sub18_7_, 1000);
			return class206_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mga.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
					+ (class206 != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ')'));
		}
	}

	static final boolean method1733(int i, int i_9_) {
		try {
			anInt3795++;
			if (i_9_ <= 87)
				return false;
			if ((i ^ 0xffffffff) != -3 && i != 3)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mga.H(" + i + ','
					+ i_9_ + ')');
		}
	}

	final Class206 method1734(int i, Class206 class206, int i_10_, int i_11_,
			int i_12_, int i_13_) {
		try {
			anInt3801++;
			int i_14_ = ((Class281) this).anIntArray3817[i_13_];
			int i_15_ = ((Class281) this).anIntArray3794[i_13_];
			Class11_Sub45_Sub18 class11_sub45_sub18 = ((Class281) this).aClass198_3805
					.method1280(53, i_15_ >> 16);
			i_15_ &= 0xffff;
			if (class11_sub45_sub18 == null)
				return class206.method1313((byte) 1, i_11_, true);
			Class11_Sub45_Sub18 class11_sub45_sub18_16_ = null;
			if ((((Class281) this).aBool3798 || Class11_Sub2_Sub11.aBool8858)
					&& i_10_ != -1
					&& ((Class281) this).anIntArray3794.length > i_10_) {
				i_10_ = ((Class281) this).anIntArray3794[i_10_];
				class11_sub45_sub18_16_ = ((Class281) this).aClass198_3805
						.method1280(110, i_10_ >> 16);
				i_10_ &= 0xffff;
			}
			Class11_Sub45_Sub18 class11_sub45_sub18_17_ = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_18_ = null;
			int i_19_ = 0;
			int i_20_ = 0;
			if (anIntArray3796 != null) {
				if (i_13_ < anIntArray3796.length) {
					i_19_ = anIntArray3796[i_13_];
					if ((i_19_ ^ 0xffffffff) != -65536) {
						class11_sub45_sub18_17_ = ((Class281) this).aClass198_3805
								.method1280(75, i_19_ >> 16);
						i_19_ &= 0xffff;
					}
				}
				if ((((Class281) this).aBool3798 || Class11_Sub2_Sub11.aBool8858)
						&& i_10_ != -1
						&& (anIntArray3796.length ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
					i_20_ = anIntArray3796[i_10_];
					if ((i_20_ ^ 0xffffffff) != -65536) {
						class11_sub45_sub18_18_ = ((Class281) this).aClass198_3805
								.method1280(80, i_20_ >> 16);
						i_20_ &= 0xffff;
					}
				}
			}
			if (((Class281) this).aBool3820)
				i_11_ |= 0x200;
			if (class11_sub45_sub18.method3760(false, i_15_))
				i_11_ |= 0x80;
			if (class11_sub45_sub18.method3759(118, i_15_))
				i_11_ |= 0x100;
			if (class11_sub45_sub18.method3755(i_15_, i ^ ~0x1))
				i_11_ |= 0x400;
			if (class11_sub45_sub18_17_ != null) {
				if (class11_sub45_sub18_17_.method3760(false, i_19_))
					i_11_ |= 0x80;
				if (class11_sub45_sub18_17_.method3759(120, i_19_))
					i_11_ |= 0x100;
				if (class11_sub45_sub18_17_.method3755(i_19_, 1))
					i_11_ |= 0x400;
			}
			if (class11_sub45_sub18_16_ != null) {
				if (class11_sub45_sub18_16_.method3760(false, i_10_))
					i_11_ |= 0x80;
				if (class11_sub45_sub18_16_.method3759(124, i_10_))
					i_11_ |= 0x100;
				if (class11_sub45_sub18_16_.method3755(i_10_, 1))
					i_11_ |= 0x400;
			}
			if (class11_sub45_sub18_18_ != null) {
				if (class11_sub45_sub18_18_.method3760(false, i_20_))
					i_11_ |= 0x80;
				if (class11_sub45_sub18_18_.method3759(121, i_20_))
					i_11_ |= 0x100;
				if (class11_sub45_sub18_18_.method3755(i_20_, i + 2))
					i_11_ |= 0x400;
			}
			i_11_ |= 0x20;
			Class206 class206_21_ = class206.method1313((byte) 1, i_11_, true);
			class206_21_.method1304(class11_sub45_sub18, i_12_ + i, i_15_,
					i_10_, ((Class281) this).aBool3820, 0, i_14_,
					class11_sub45_sub18_16_, 1000);
			if (class11_sub45_sub18_17_ != null)
				class206_21_.method1304(class11_sub45_sub18_17_, -1 + i_12_,
						i_19_, i_20_, ((Class281) this).aBool3820, 0, i_14_,
						class11_sub45_sub18_18_, 1000);
			return class206_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mga.B(" + i + ','
					+ (class206 != null ? "{...}" : "null") + ',' + i_10_ + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public static void method1735(byte i) {
		try {
			aColorArray3806 = null;
			int i_22_ = -11 / ((-6 - i) / 58);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mga.G(" + i + ')');
		}
	}

	private final void method1736(Stream stream, int i, int i_23_) {
		do {
			try {
				if ((i ^ 0xffffffff) == -2) {
					int i_24_ = stream.readUnsignedShort((byte) -65);
					((Class281) this).anIntArray3817 = new int[i_24_];
					for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
						((Class281) this).anIntArray3817[i_25_] = stream
								.readUnsignedShort((byte) -65);
					((Class281) this).anIntArray3794 = new int[i_24_];
					for (int i_26_ = 0; i_26_ < i_24_; i_26_++)
						((Class281) this).anIntArray3794[i_26_] = stream
								.readUnsignedShort((byte) -65);
					for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (i_24_ ^ 0xffffffff); i_27_++)
						((Class281) this).anIntArray3794[i_27_] = ((stream
								.readUnsignedShort((byte) -65) << 16) - -((Class281) this).anIntArray3794[i_27_]);
				} else if (i == 2)
					((Class281) this).anInt3808 = stream
							.readUnsignedShort((byte) -65);
				else if ((i ^ 0xffffffff) != -4) {
					if (i != 5) {
						if (i != 6) {
							if ((i ^ 0xffffffff) != -8) {
								if (i == 8)
									((Class281) this).anInt3809 = stream
											.readUnsignedByte((byte) 35);
								else if ((i ^ 0xffffffff) == -10)
									((Class281) this).anInt3791 = stream
											.readUnsignedByte((byte) 35);
								else if ((i ^ 0xffffffff) != -11) {
									if (i != 11) {
										if (i != 12) {
											if ((i ^ 0xffffffff) == -14) {
												int i_28_ = (stream
														.readUnsignedShort((byte) -65));
												((Class281) this).anIntArrayArray3813 = new int[i_28_][];
												for (int i_29_ = 0; ((i_28_ ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
													int i_30_ = (stream
															.readUnsignedByte((byte) 35));
													if ((i_30_ ^ 0xffffffff) < -1) {
														((Class281) this).anIntArrayArray3813[i_29_] = new int[i_30_];
														((Class281) this).anIntArrayArray3813[i_29_][0] = (stream
																.method2558(false));
														for (int i_31_ = 1; i_31_ < i_30_; i_31_++)
															((Class281) this).anIntArrayArray3813[i_29_][i_31_] = (stream
																	.readUnsignedShort((byte) -65));
													}
												}
											} else if (i != 14) {
												if (i == 15)
													((Class281) this).aBool3798 = true;
												else if (i == 16)
													((Class281) this).aBool3797 = true;
												else if ((i ^ 0xffffffff) == -19)
													((Class281) this).aBool3800 = true;
												else if ((i ^ 0xffffffff) != -20) {
													if (i == 20) {
														if (((((Class281) this).anIntArray3812) == null)
																|| ((((Class281) this).anIntArray3793) == null)) {
															((Class281) this).anIntArray3812 = (new int[(((Class281) this).anIntArrayArray3813).length]);
															((Class281) this).anIntArray3793 = (new int[(((Class281) this).anIntArrayArray3813).length]);
															for (int i_32_ = 0; ((((Class281) this).anIntArrayArray3813).length > i_32_); i_32_++) {
																((Class281) this).anIntArray3812[i_32_] = 256;
																((Class281) this).anIntArray3793[i_32_] = 256;
															}
														}
														int i_33_ = (stream
																.readUnsignedByte((byte) 35));
														((Class281) this).anIntArray3812[i_33_] = (stream
																.readUnsignedShort((byte) -65));
														((Class281) this).anIntArray3793[i_33_] = (stream
																.readUnsignedShort((byte) -65));
													}
												} else {
													if ((((Class281) this).anIntArray3819) == null) {
														((Class281) this).anIntArray3819 = (new int[(((Class281) this).anIntArrayArray3813).length]);
														for (int i_34_ = 0; (i_34_ < (((Class281) this).anIntArrayArray3813).length); i_34_++)
															((Class281) this).anIntArray3819[i_34_] = 255;
													}
													((Class281) this).anIntArray3819[(stream
															.readUnsignedByte((byte) 35))] = (stream
															.readUnsignedByte((byte) 35));
												}
											} else
												((Class281) this).aBool3820 = true;
										} else {
											int i_35_ = stream
													.readUnsignedByte((byte) 35);
											anIntArray3796 = new int[i_35_];
											for (int i_36_ = 0; ((i_35_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff)); i_36_++)
												anIntArray3796[i_36_] = (stream
														.readUnsignedShort((byte) -65));
											for (int i_37_ = 0; ((i_37_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff)); i_37_++)
												anIntArray3796[i_37_] = (((stream
														.readUnsignedShort((byte) -65)) << 16) - -(anIntArray3796[i_37_]));
										}
									} else
										((Class281) this).anInt3816 = stream
												.readUnsignedByte((byte) 35);
								} else
									((Class281) this).anInt3807 = stream
											.readUnsignedByte((byte) 35);
							} else
								((Class281) this).anInt3803 = stream
										.readUnsignedShort((byte) -65);
						} else
							((Class281) this).anInt3815 = stream
									.readUnsignedShort((byte) -65);
					} else
						((Class281) this).anInt3792 = stream
								.readUnsignedByte((byte) 35);
				} else {
					((Class281) this).aBoolArray3814 = new boolean[256];
					int i_38_ = stream.readUnsignedByte((byte) 35);
					for (int i_39_ = 0; i_38_ > i_39_; i_39_++)
						((Class281) this).aBoolArray3814[stream
								.readUnsignedByte((byte) 35)] = true;
				}
				anInt3802++;
				if (i_23_ == 15)
					break;
				method1736(null, 29, -98);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mga.E("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ i_23_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1737(int i, Stream stream) {
		do {
			try {
				anInt3818++;
				for (;;) {
					int i_40_ = stream.readUnsignedByte((byte) 35);
					if (i_40_ == 0)
						break;
					method1736(stream, i_40_, 15);
				}
				if (i == 24718)
					break;
				((Class281) this).anInt3808 = -64;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mga.C(" + i + ','
						+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method1738(int i, int i_41_, boolean bool, int i_42_) {
		try {
			if (i_41_ != 1024)
				((Class281) this).anInt3803 = -128;
			anInt3804++;
			int i_43_ = 0;
			int i_44_ = 0;
			int i_45_ = ((Class281) this).anIntArray3794[i_42_];
			Class11_Sub45_Sub18 class11_sub45_sub18 = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_46_ = ((Class281) this).aClass198_3805
					.method1280(96, i_45_ >> 16);
			i_45_ &= 0xffff;
			if (class11_sub45_sub18_46_ == null)
				return i_43_;
			if ((((Class281) this).aBool3798 || Class11_Sub2_Sub11.aBool8858)
					&& i != -1 && ((Class281) this).anIntArray3794.length > i) {
				i_44_ = ((Class281) this).anIntArray3794[i];
				class11_sub45_sub18 = ((Class281) this).aClass198_3805
						.method1280(115, i_44_ >> 16);
				i_44_ &= 0xffff;
			}
			if (((Class281) this).aBool3820)
				i_43_ |= 0x200;
			if (class11_sub45_sub18_46_.method3760(false, i_45_))
				i_43_ |= 0x80;
			if (class11_sub45_sub18_46_.method3759(i_41_ - 907, i_45_))
				i_43_ |= 0x100;
			if (class11_sub45_sub18_46_.method3755(i_45_, i_41_ ^ 0x401))
				i_43_ |= 0x400;
			if (class11_sub45_sub18 != null) {
				if (class11_sub45_sub18.method3760(false, i_44_))
					i_43_ |= 0x80;
				if (class11_sub45_sub18.method3759(i_41_ - 909, i_44_))
					i_43_ |= 0x100;
				if (class11_sub45_sub18.method3755(i_44_, 1))
					i_43_ |= 0x400;
			}
			if (anIntArray3796 != null && bool) {
				if ((anIntArray3796.length ^ 0xffffffff) < (i_42_ ^ 0xffffffff)) {
					int i_47_ = anIntArray3796[i_42_];
					if ((i_47_ ^ 0xffffffff) != -65536) {
						Class11_Sub45_Sub18 class11_sub45_sub18_48_ = ((Class281) this).aClass198_3805
								.method1280(28, i_47_ >> 16);
						i_47_ &= 0xffff;
						if (class11_sub45_sub18_48_ != null) {
							if (class11_sub45_sub18_48_
									.method3760(false, i_47_))
								i_43_ |= 0x80;
							if (class11_sub45_sub18_48_.method3759(123, i_47_))
								i_43_ |= 0x100;
							if (class11_sub45_sub18_48_.method3755(i_47_, 1))
								i_43_ |= 0x400;
						}
					}
				}
				if ((((Class281) this).aBool3798 || Class11_Sub2_Sub11.aBool8858)
						&& i != -1 && anIntArray3796.length > i) {
					int i_49_ = anIntArray3796[i];
					if ((i_49_ ^ 0xffffffff) != -65536) {
						Class11_Sub45_Sub18 class11_sub45_sub18_50_ = ((Class281) this).aClass198_3805
								.method1280(i_41_ - 1135, i_49_ >> 16);
						i_49_ &= 0xffff;
						if (class11_sub45_sub18_50_ != null) {
							if (class11_sub45_sub18_50_
									.method3760(false, i_49_))
								i_43_ |= 0x80;
							if (class11_sub45_sub18_50_.method3759(121, i_49_))
								i_43_ |= 0x100;
							if (class11_sub45_sub18_50_.method3755(i_49_, 1))
								i_43_ |= 0x400;
						}
					}
				}
			}
			return 0x20 | i_43_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mga.D(" + i + ','
					+ i_41_ + ',' + bool + ',' + i_42_ + ')'));
		}
	}

	final void method1739(int i) {
		try {
			if (((Class281) this).anInt3807 == -1) {
				if (((Class281) this).aBoolArray3814 == null)
					((Class281) this).anInt3807 = 0;
				else
					((Class281) this).anInt3807 = 2;
			}
			if (i == -29274) {
				if (((Class281) this).anInt3791 == -1) {
					if (((Class281) this).aBoolArray3814 == null)
						((Class281) this).anInt3791 = 0;
					else
						((Class281) this).anInt3791 = 2;
				}
				anInt3799++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mga.A(" + i + ')');
		}
	}

	public Class281() {
		((Class281) this).anInt3791 = -1;
		((Class281) this).anInt3809 = 99;
		((Class281) this).anInt3807 = -1;
		((Class281) this).aBool3797 = false;
		((Class281) this).anInt3815 = -1;
		((Class281) this).anInt3808 = -1;
		((Class281) this).anInt3803 = -1;
		((Class281) this).aBool3800 = false;
		((Class281) this).anInt3816 = 2;
		((Class281) this).aBool3820 = false;
	}
}
