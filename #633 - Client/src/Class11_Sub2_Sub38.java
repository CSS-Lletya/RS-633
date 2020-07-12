/* Class11_Sub2_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub38 extends Class11_Sub2 {
	private int[][] anIntArrayArray9782;
	private int anInt9783 = 0;
	static int anInt9784;
	static int anInt9785;
	static int anInt9786;
	static int anInt9787;
	static int anInt9788;
	static int anInt9789;
	private short[] aShortArray9790 = new short[257];
	private int[] anIntArray9791;
	static int anInt9792;
	static int anInt9793;
	static int anInt9794 = 0;
	private int[] anIntArray9795;
	static Class12[] aClass12Array9796;
	static int anInt9797;

	private final void method3850(int i) {
		try {
			anInt9792++;
			int[] is = anIntArrayArray9782[0];
			int[] is_0_ = anIntArrayArray9782[1];
			int[] is_1_ = anIntArrayArray9782[-2 + anIntArrayArray9782.length];
			int[] is_2_ = anIntArrayArray9782[anIntArrayArray9782.length - 1];
			anIntArray9791 = new int[] { is[0] + -is_0_[0] + is[0],
					is[1] - (-is[1] - -is_0_[1]) };
			anIntArray9795 = new int[] { is_1_[0] + -is_2_[0] + is_1_[0],
					-is_2_[1] + is_1_[i] + is_1_[1] };
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eba.F(" + i + ')');
		}
	}

	final void method2256(int i) {
		try {
			if (anIntArrayArray9782 == null)
				anIntArrayArray9782 = new int[][] { new int[2], { 4096, 4096 } };
			anInt9784++;
			if ((anIntArrayArray9782.length ^ 0xffffffff) > -3)
				throw new RuntimeException(
						"Curve operation requires at least two markers");
			if (anInt9783 == 2)
				method3850(1);
			Class234_Sub1_Sub1.method3829(false);
			if (i != 7)
				anIntArrayArray9782 = null;
			method3854(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eba.D(" + i + ')');
		}
	}

	public Class11_Sub2_Sub38() {
		super(1, true);
	}

	final void method2263(int i, Stream stream, int i_3_) {
		try {
			if (i != 3731)
				method3854(false);
			if ((i_3_ ^ 0xffffffff) == -1) {
				anInt9783 = stream.readUnsignedByte((byte) 35);
				anIntArrayArray9782 = new int[stream
						.readUnsignedByte((byte) 35)][2];
				for (int i_4_ = 0; ((anIntArrayArray9782.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
					anIntArrayArray9782[i_4_][0] = stream
							.readUnsignedShort((byte) -65);
					anIntArrayArray9782[i_4_][1] = stream
							.readUnsignedShort((byte) -65);
				}
			}
			anInt9785++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eba.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_3_ + ')'));
		}
	}

	public static void method3851(byte i) {
		do {
			try {
				aClass12Array9796 = null;
				if (i == -14)
					break;
				anInt9797 = -83;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eba.G(" + i + ')');
			}
			break;
		} while (false);
	}

	private final int[] method3852(int i, byte i_5_) {
		try {
			anInt9793++;
			if ((i ^ 0xffffffff) > -1)
				return anIntArray9791;
			if (i_5_ <= 125)
				return null;
			if ((i ^ 0xffffffff) <= (anIntArrayArray9782.length ^ 0xffffffff))
				return anIntArray9795;
			return anIntArrayArray9782[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eba.H(" + i + ','
					+ i_5_ + ')');
		}
	}

	static final void method3853(int i, Class286_Sub1 class286_sub1, byte[][] is) {
		do {
			try {
				anInt9786++;
				int[] is_6_ = { -1, 0, 0, 0, 0 };
				for (int i_7_ = 0; ((((Class286) class286_sub1).anInt3880 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
					Class34.method304((byte) -120);
					for (int i_8_ = 0; ((Class300.anInt4051 >> 3 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++) {
						for (int i_9_ = 0; i_9_ < Class108_Sub12.anInt6228 >> 3; i_9_++) {
							int i_10_ = (Class108_Sub18.anIntArrayArrayArray6923[i_7_][i_8_][i_9_]);
							if ((i_10_ ^ 0xffffffff) != 0) {
								int i_11_ = i_10_ >> 24 & 0x3;
								if (!((Class286) class286_sub1).aBool3870
										|| i_11_ == 0) {
									int i_12_ = i_10_ >> 1 & 0x3;
									int i_13_ = i_10_ >> 14 & 0x3ff;
									int i_14_ = (i_10_ & 0x3fff) >> 3;
									int i_15_ = i_14_ / 8 + (i_13_ / 8 << 8);
									for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (Class183.anIntArray2362.length ^ 0xffffffff)); i_16_++) {
										if ((Class183.anIntArray2362[i_16_] == i_15_)
												&& is[i_16_] != null) {
											Stream stream = new Stream(
													is[i_16_]);
											class286_sub1
													.method1767(
															i_11_,
															i_14_,
															stream,
															8 * i_8_,
															Class235.aClass338Array3217,
															i_12_, i_13_, i_7_,
															(byte) -114,
															i_9_ * 8);
											class286_sub1
													.method2909(
															i_9_ * 8,
															i_11_,
															i_12_,
															stream,
															i_14_,
															is_6_[0] != -1 ? null
																	: is_6_,
															i - 43,
															Class321_Sub2.aClass163_6648,
															i_13_, 8 * i_8_,
															i_7_);
											break;
										}
									}
								}
							}
						}
					}
				}
				for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (((Class286) class286_sub1).anInt3880 ^ 0xffffffff)); i_17_++) {
					Class34.method304((byte) 123);
					for (int i_18_ = 0; Class300.anInt4051 >> 3 > i_18_; i_18_++) {
						for (int i_19_ = 0; ((i_19_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 >> 3 ^ 0xffffffff)); i_19_++) {
							int i_20_ = (Class108_Sub18.anIntArrayArrayArray6923[i_17_][i_18_][i_19_]);
							if (i_20_ == -1)
								class286_sub1.method1764(8, 8 * i_19_,
										8 * i_18_, 8, i_17_, 29274);
						}
					}
				}
				if (i == is_6_[0])
					break;
				Class108_Sub18.aClass141_6924 = Class233.aClass379_3181
						.method2225(is_6_[1], 4, (Class179.aClass154_2279),
								is_6_[2], is_6_[3], is_6_[0]);
				Class11_Sub45_Sub9.anInt8878 = is_6_[4];
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("eba.E(" + i + ','
						+ (class286_sub1 != null ? "{...}" : "null") + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9788++;
			if (bool != true)
				method2256(-39);
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_21_ = this.method2260(4463, 0, i);
				for (int i_22_ = 0; i_22_ < Class33_Sub2.anInt6696; i_22_++) {
					int i_23_ = is_21_[i_22_] >> 4;
					if (i_23_ < 0)
						i_23_ = 0;
					if ((i_23_ ^ 0xffffffff) < -257)
						i_23_ = 256;
					is[i_22_] = aShortArray9790[i_23_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eba.A(" + i + ','
					+ bool + ')');
		}
	}

	private final void method3854(boolean bool) {
		try {
			int i = anInt9783;
			while_185_: do {
				do {
					if (i != 2) {
						if (i != 1)
							break;
					} else {
						for (i = 0; (i ^ 0xffffffff) > -258; i++) {
							int i_24_ = i << 4;
							int i_25_;
							for (i_25_ = 1; i_25_ < -1
									+ anIntArrayArray9782.length; i_25_++) {
								if (i_24_ < anIntArrayArray9782[i_25_][0])
									break;
							}
							int[] is = anIntArrayArray9782[i_25_ - 1];
							int[] is_26_ = anIntArrayArray9782[i_25_];
							int i_27_ = method3852(i_25_ - 2, (byte) 126)[1];
							int i_28_ = is[1];
							int i_29_ = is_26_[1];
							int i_30_ = method3852(i_25_ + 1, (byte) 126)[1];
							int i_31_ = (-is[0] + i_24_ << 12)
									/ (is_26_[0] - is[0]);
							int i_32_ = i_31_ * i_31_ >> 12;
							int i_33_ = -i_27_ + i_30_ + (-i_29_ - -i_28_);
							int i_34_ = i_27_ - i_28_ - i_33_;
							int i_35_ = -i_27_ + i_29_;
							int i_36_ = i_28_;
							int i_37_ = i_32_ * (i_33_ * i_31_ >> 12) >> 12;
							int i_38_ = i_32_ * i_34_ >> 12;
							int i_39_ = i_35_ * i_31_ >> 12;
							int i_40_ = i_39_ + (i_37_ + i_38_ - -i_36_);
							if (i_40_ <= -32768)
								i_40_ = -32767;
							if (i_40_ >= 32768)
								i_40_ = 32767;
							aShortArray9790[i] = (short) i_40_;
						}
						break while_185_;
					}
					for (i = 0; i < 257; i++) {
						int i_41_ = i << 4;
						int i_42_;
						for (i_42_ = 1; i_42_ < anIntArrayArray9782.length - 1; i_42_++) {
							if ((anIntArrayArray9782[i_42_][0] ^ 0xffffffff) < (i_41_ ^ 0xffffffff))
								break;
						}
						int[] is = anIntArrayArray9782[-1 + i_42_];
						int[] is_43_ = anIntArrayArray9782[i_42_];
						int i_44_ = (-is[0] + i_41_ << 12)
								/ (-is[0] + is_43_[0]);
						int i_45_ = (4096 + -(Class191.anIntArray2457[(i_44_ & 0x1ff5) >> 5]) >> 1);
						int i_46_ = -i_45_ + 4096;
						int i_47_ = is_43_[1] * i_45_ + i_46_ * is[1] >> 12;
						if (i_47_ <= -32768)
							i_47_ = -32767;
						if (i_47_ >= 32768)
							i_47_ = 32767;
						aShortArray9790[i] = (short) i_47_;
					}
					break while_185_;
				} while (false);
				for (i = 0; i < 257; i++) {
					int i_48_ = i << 4;
					int i_49_;
					for (i_49_ = 1; ((-1 + anIntArrayArray9782.length ^ 0xffffffff) < (i_49_ ^ 0xffffffff)); i_49_++) {
						if ((i_48_ ^ 0xffffffff) > (anIntArrayArray9782[i_49_][0] ^ 0xffffffff))
							break;
					}
					int[] is = anIntArrayArray9782[i_49_ - 1];
					int[] is_50_ = anIntArrayArray9782[i_49_];
					int i_51_ = (-is[0] + i_48_ << 12) / (-is[0] + is_50_[0]);
					int i_52_ = -i_51_ + 4096;
					int i_53_ = is[1] * i_52_ - -(is_50_[1] * i_51_) >> 12;
					if ((i_53_ ^ 0xffffffff) >= 32767)
						i_53_ = -32767;
					if (i_53_ >= 32768)
						i_53_ = 32767;
					aShortArray9790[i] = (short) i_53_;
				}
			} while (false);
			if (bool != false)
				method3852(-107, (byte) -115);
			anInt9787++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eba.C(" + bool + ')');
		}
	}
}
