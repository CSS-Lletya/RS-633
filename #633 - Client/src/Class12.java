/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class12 {
	int anInt93;
	static int anInt94;
	static int anInt95;
	static int anInt96;
	int anInt97;
	int anInt98;
	static long[][] aLongArrayArray99 = new long[8][256];
	int[][] anIntArrayArray100;
	static int anInt101;
	static long[] aLongArray102 = new long[11];
	int anInt103;
	static int[] anIntArray104;
	static int[] anIntArray105;

	static boolean method126(boolean bool, boolean bool_0_) {
		try {
			return bool | bool_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "s.K(" + bool + ','
					+ bool_0_ + ')');
		}
	}

	abstract void ka(int i, int i_1_, int i_2_);

	abstract void wa(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_3_,
			int i_4_, int i_5_, boolean bool);

	abstract void CA(Class11_Sub45_Sub1 class11_sub45_sub1, int i, int i_6_,
			int i_7_, int i_8_, boolean bool);

	abstract void method127(int i, int i_9_);

	abstract boolean method128(Class11_Sub45_Sub1 class11_sub45_sub1, int i,
			int i_10_, int i_11_, int i_12_, boolean bool);

	public static void method129(int i) {
		try {
			anIntArray105 = null;
			if (i != 5871)
				aLongArrayArray99 = null;
			aLongArrayArray99 = null;
			anIntArray104 = null;
			aLongArray102 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "s.L(" + i + ')');
		}
	}

	final int method130(int i, int i_13_, int i_14_) {
		try {
			anInt94++;
			int i_15_ = i_13_ >> ((Class12) this).anInt97;
			int i_16_ = i >> ((Class12) this).anInt97;
			if ((i_15_ ^ 0xffffffff) > -1 || i_16_ < 0
					|| -1 + ((Class12) this).anInt103 < i_15_
					|| i_16_ > -1 + ((Class12) this).anInt98)
				return 0;
			int i_17_ = -113 / ((i_14_ + 78) / 44);
			int i_18_ = i_13_ & ((Class12) this).anInt93 - 1;
			int i_19_ = ((Class12) this).anInt93 - 1 & i;
			int i_20_ = ((((-i_18_ + ((Class12) this).anInt93) * ((Class12) this).anIntArrayArray100[i_15_][i_16_]) - -(i_18_ * (((Class12) this).anIntArrayArray100[1 + i_15_][i_16_]))) >> ((Class12) this).anInt97);
			int i_21_ = (((-i_18_ + ((Class12) this).anInt93) * ((Class12) this).anIntArrayArray100[i_15_][1 + i_16_]) + (((Class12) this).anIntArrayArray100[1 + i_15_][1 + i_16_] * i_18_)) >> ((Class12) this).anInt97;
			return (i_21_ * i_19_ + i_20_ * (((Class12) this).anInt93 - i_19_) >> ((Class12) this).anInt97);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("s.E(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	final int method131(byte i, int i_22_, int i_23_) {
		try {
			int i_24_ = -28 / ((89 - i) / 32);
			anInt95++;
			return ((Class12) this).anIntArrayArray100[i_23_][i_22_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("s.A(" + i + ','
					+ i_22_ + ',' + i_23_ + ')'));
		}
	}

	abstract void method132(int i, int i_25_, int i_26_, boolean[][] bools,
			boolean bool, int i_27_);

	abstract void U(int i, int i_28_, int[] is, int[] is_29_, int[] is_30_,
			int[] is_31_, int[] is_32_, int[] is_33_, int[] is_34_,
			int[] is_35_, int i_36_, int i_37_, int i_38_, boolean bool);

	abstract void method133(int i, int i_39_, int i_40_, int i_41_, int i_42_,
			int i_43_, int i_44_, boolean[][] bools);

	static final boolean method134(boolean bool, int i) {
		try {
			anInt101++;
			if (bool != true)
				anIntArray105 = null;
			if ((i ^ 0xffffffff) != -6 && (i ^ 0xffffffff) != -52
					&& (i ^ 0xffffffff) != -51 && (i ^ 0xffffffff) != -10
					&& i != 2 && i != 19 && i != 30)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "s.G(" + bool + ',' + i
					+ ')');
		}
	}

	abstract void YA();

	abstract Class11_Sub45_Sub1 fa(int i, int i_45_,
			Class11_Sub45_Sub1 class11_sub45_sub1);

	abstract void method135(int i, int i_46_, int i_47_, boolean[][] bools,
			boolean bool, int i_48_, int i_49_);

	abstract void method136(Class11_Sub46 class11_sub46, int[] is);

	abstract void method137(int i, int i_50_, int[] is, int[] is_51_,
			int[] is_52_, int[] is_53_, int[] is_54_, int[] is_55_,
			int[] is_56_, int[] is_57_, int[] is_58_, int[] is_59_,
			int[] is_60_, int i_61_, int i_62_, int i_63_, boolean bool);

	Class12(int i, int i_64_, int i_65_, int[][] is) {
		try {
			((Class12) this).anInt98 = i_64_;
			((Class12) this).anInt103 = i;
			int i_66_ = 0;
			for (/**/; (i_65_ ^ 0xffffffff) < -2; i_65_ >>= 1)
				i_66_++;
			((Class12) this).anInt93 = 1 << i_66_;
			((Class12) this).anInt97 = i_66_;
			((Class12) this).anIntArrayArray100 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("s.<init>(" + i + ','
					+ i_64_ + ',' + i_65_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
			int i_67_ = "\u1823\uc6e8\u87b8\u014f\u36a6\ud2f5\u796f\u9152\u60bc\u9b8e\ua30c\u7b35\u1de0\ud7c2\u2e4b\ufe57\u1577\u37e5\u9ff0\u4ada\u58c9\u290a\ub1a0\u6b85\ubd5d\u10f4\ucb3e\u0567\ue427\u418b\ua77d\u95d8\ufbee\u7c66\udd17\u479e\uca2d\ubf07\uad5a\u8333\u6302\uaa71\uc819\u49d9\uf2e3\u5b88\u9a26\u32b0\ue90f\ud580\ubecd\u3448\uff7a\u905f\u2068\u1aae\ub454\u9322\u64f1\u7312\u4008\uc3ec\udba1\u8d3d\u9700\ucf2b\u7682\ud61b\ub5af\u6a50\u45f3\u30ef\u3f55\ua2ea\u65ba\u2fc0\ude1c\ufd4d\u9275\u068a\ub2e6\u0e1f\u62d4\ua896\uf9c5\u2559\u8472\u394c\u5e78\u388c\ud1a5\ue261\ub321\u9c1e\u43c7\ufc04\u5199\u6d0d\ufadf\u7e24\u3bab\uce11\u8f4e\ub7eb\u3c81\u94f7\ub913\u2cd3\ue76e\uc403\u5644\u7fa9\u2abb\uc153\udc0b\u9d6c\u3174\uf646\uac89\u14e1\u163a\u6909\u70b6\ud0ed\ucc42\u98a4\u285c\uf886"
					.charAt(i / 2);
			long l = (long) ((0x1 & i ^ 0xffffffff) == -1 ? i_67_ >>> 8
					: i_67_ & 0xff);
			long l_68_ = l << 1;
			if (l_68_ >= 256L)
				l_68_ ^= 0x11dL;
			long l_69_ = l_68_ << 1;
			if (l_69_ >= 256L)
				l_69_ ^= 0x11dL;
			long l_70_ = l ^ l_69_;
			long l_71_ = l_69_ << 1;
			if ((l_71_ ^ 0xffffffffffffffffL) <= -257L)
				l_71_ ^= 0x11dL;
			long l_72_ = l_71_ ^ l;
			aLongArrayArray99[0][i] = (Class217.method1397((Class217
					.method1397((Class217.method1397(l_70_ << 16, (Class217
							.method1397((Class217.method1397(Class217
									.method1397(l_69_ << 40, Class217
											.method1397(l << 56, l << 48)),
									l << 32)), l_71_ << 24)))), l_68_ << 8)),
					l_72_));
			for (int i_73_ = 1; i_73_ < 8; i_73_++)
				aLongArrayArray99[i_73_][i] = Class217.method1397(
						(aLongArrayArray99[-1 + i_73_][i] >>> 8),
						(aLongArrayArray99[i_73_ - 1][i] << 56));
		}
		aLongArray102[0] = 0L;
		for (int i = 1; i <= 10; i++) {
			int i_74_ = (i - 1) * 8;
			aLongArray102[i] = (Class7
					.method92(
							(Class7.method92(
									(Class7.method92(
											Class58_Sub1_Sub1
													.method3583(
															16711680L,
															(aLongArrayArray99[5][i_74_ + 5])),
											(Class7.method92(
													(Class7.method92(
															Class58_Sub1_Sub1
																	.method3583(
																			1095216660480L,
																			(aLongArrayArray99[3][3 + i_74_])),
															(Class7.method92(
																	Class58_Sub1_Sub1
																			.method3583(
																					(aLongArrayArray99[2][2 + i_74_]),
																					280375465082880L),
																	Class7.method92(
																			(Class58_Sub1_Sub1
																					.method3583(
																							(aLongArrayArray99[1][1 + i_74_]),
																							71776119061217280L)),
																			(Class58_Sub1_Sub1
																					.method3583(
																							-72057594037927936L,
																							(aLongArrayArray99[0][i_74_])))))))),
													Class58_Sub1_Sub1
															.method3583(
																	(aLongArrayArray99[4][i_74_ + 4]),
																	4278190080L))))),
									Class58_Sub1_Sub1.method3583(65280L,
											(aLongArrayArray99[6][6 + i_74_])))),
							Class58_Sub1_Sub1.method3583(255L,
									aLongArrayArray99[7][7 + i_74_])));
		}
		anIntArray104 = new int[3];
	}
}
