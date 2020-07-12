/* Class11_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class11_Sub2_Sub5 extends Class11_Sub2 {
	static int anInt8547;
	static int anInt8548;
	static BigInteger loginExponentRSA = new BigInteger("65537");
	static int anInt8550;
	static int anInt8551;
	static String aString8552;
	static int[][] anIntArrayArray8553 = new int[6][];
	private int anInt8554 = 4;
	private int anInt8555 = 4;
	static int anInt8556;
	static OutgoingPacket aClass370_8557;
	static int anInt8558;
	static int anInt8559;
	static Class83 aClass83_8560;

	final void method2263(int i, Stream stream, int i_0_) {
		while_103_: do {
			try {
				anInt8548++;
				if (i != 3731)
					loginExponentRSA = null;
				int i_1_ = i_0_;
				do {
					if ((i_1_ ^ 0xffffffff) != -1) {
						if (i_1_ != 1)
							break while_103_;
						if (!client.aBool10531)
							break;
					}
					anInt8554 = stream.readUnsignedByte((byte) 35);
					return;
				} while (false);
				anInt8555 = stream.readUnsignedByte((byte) 35);
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("jaa.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
		} while (false);
	}

	static final void method3392(int i, int i_2_, Class163 class163, int i_3_,
			boolean bool, int i_4_, int i_5_, int i_6_) {
		try {
			anInt8558++;
			class163.method1035(i_4_, i_6_, i_2_, (byte) 95, i_5_, i);
			if (bool != true)
				anIntArrayArray8553 = null;
			class163.method1035(i_3_, 1 + i_6_, 1 + i_2_, (byte) 122, 16, -2
					+ i);
			class163.method1018(i_2_ + 18, i_3_, -19 + i_5_, -2 + i, 95,
					i_6_ + 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("jaa.G(" + i + ',' + i_2_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_3_ + ',' + bool + ',' + i_4_ + ',' + i_5_ + ','
							+ i_6_ + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8547++;
			if (bool != true)
				anInt8555 = 71;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_7_ = Class33_Sub2.anInt6696 / anInt8554;
				int i_8_ = Class29.anInt398 / anInt8555;
				int[] is_9_;
				if (i_8_ > 0) {
					int i_10_ = i % i_8_;
					is_9_ = this.method2260(4463, 0, i_10_ * Class29.anInt398
							/ i_8_);
				} else
					is_9_ = this.method2260(4463, 0, 0);
				for (int i_11_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_11_ ^ 0xffffffff)); i_11_++) {
					if ((i_7_ ^ 0xffffffff) >= -1)
						is[i_11_] = is_9_[0];
					else {
						int i_12_ = i_11_ % i_7_;
						is[i_11_] = is_9_[i_12_ * Class33_Sub2.anInt6696 / i_7_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jaa.A(" + i + ','
					+ bool + ')');
		}
	}

	static final void method3393(int i, int i_13_, int i_14_, int i_15_,
			byte[][][] is, int[] is_16_, int[] is_17_, int[] is_18_,
			int[] is_19_, int[] is_20_, int i_21_, byte i_22_, int i_23_,
			int i_24_, boolean bool, boolean bool_25_, int i_26_, int i_27_,
			boolean bool_28_) {
		Class236_Sub5.aBool6848 = true;
		Class11_Sub2_Sub17.aBool9051 = Class87.aClass163_1210.method1026() > 0;
		Class246.aBool3327 = bool_25_;
		Class11_Sub45_Sub7.anInt8807 = i_13_ >> Class11_Sub2_Sub8.anInt8751;
		Class15.anInt134 = i_15_ >> Class11_Sub2_Sub8.anInt8751;
		Class11_Sub2_Sub25.anInt9333 = i_13_;
		Class108_Sub3.anInt5330 = i_15_;
		Class235.anInt3215 = i_14_;
		Class244.anInt3312 = Class11_Sub45_Sub7.anInt8807
				- Class94_Sub4.anInt7730;
		if (Class244.anInt3312 < 0) {
			Class219.anInt3018 = -Class244.anInt3312;
			Class244.anInt3312 = 0;
		} else
			Class219.anInt3018 = 0;
		Class33.anInt456 = Class15.anInt134 - Class94_Sub4.anInt7730;
		if (Class33.anInt456 < 0) {
			Player.anInt10411 = -Class33.anInt456;
			Class33.anInt456 = 0;
		} else
			Player.anInt10411 = 0;
		Class331.anInt4398 = Class11_Sub45_Sub7.anInt8807
				+ Class94_Sub4.anInt7730;
		if (Class331.anInt4398 > Class138.anInt1886)
			Class331.anInt4398 = Class138.anInt1886;
		Class179.anInt2291 = Class15.anInt134 + Class94_Sub4.anInt7730;
		if (Class179.anInt2291 > Class82.anInt1133)
			Class179.anInt2291 = Class82.anInt1133;
		boolean[][] bools = Class11_Sub2_Sub19.aBoolArrayArray9091;
		boolean[][] bools_29_ = Class106.aBoolArrayArray1426;
		if (Class246.aBool3327) {
			for (int i_30_ = 0; i_30_ < Class94_Sub4.anInt7730
					+ Class94_Sub4.anInt7730 + 2; i_30_++) {
				int i_31_ = 0;
				int i_32_ = 0;
				for (int i_33_ = 0; (i_33_ < Class94_Sub4.anInt7730
						+ Class94_Sub4.anInt7730 + 2); i_33_++) {
					if (i_33_ > 1)
						Class68.anIntArray968[i_33_ - 2] = i_31_;
					i_31_ = i_32_;
					int i_34_ = (Class11_Sub45_Sub7.anInt8807
							- Class94_Sub4.anInt7730 + i_30_);
					int i_35_ = Class15.anInt134 - Class94_Sub4.anInt7730
							+ i_33_;
					if (i_34_ >= 0 && i_35_ >= 0 && i_34_ < Class138.anInt1886
							&& i_35_ < Class82.anInt1133) {
						int i_36_ = i_34_ << Class11_Sub2_Sub8.anInt8751;
						int i_37_ = i_35_ << Class11_Sub2_Sub8.anInt8751;
						int i_38_ = (Class11_Sub2_Sub38.aClass12Array9796[(Class11_Sub2_Sub38.aClass12Array9796).length - 1]
								.method131((byte) -36, i_35_, i_34_) - (1000 << Class11_Sub2_Sub8.anInt8751 - 7));
						int i_39_ = (Class234_Sub1_Sub1.aClass12Array9729 != null ? (Class234_Sub1_Sub1.aClass12Array9729[0]
								.method131((byte) 124, i_35_, i_34_) + Class376_Sub7_Sub3_Sub2.anInt10141)
								: (Class11_Sub2_Sub38.aClass12Array9796[0]
										.method131((byte) -122, i_35_, i_34_) + Class376_Sub7_Sub3_Sub2.anInt10141));
						i_32_ = (i_26_ >= 0 ? Class87.aClass163_1210.r(i_36_,
								i_38_, i_37_, i_36_, i_39_, i_37_, i_26_)
								: Class87.aClass163_1210.JA(i_36_, i_38_,
										i_37_, i_36_, i_39_, i_37_));
						Class106.aBoolArrayArray1426[i_30_][i_33_] = i_32_ == 0;
					} else {
						i_32_ = -1;
						Class106.aBoolArrayArray1426[i_30_][i_33_] = false;
					}
					if (i_30_ > 0 && i_33_ > 0) {
						int i_40_ = (Class68.anIntArray968[i_33_ - 1]
								& Class68.anIntArray968[i_33_] & i_31_ & i_32_);
						Class11_Sub2_Sub19.aBoolArrayArray9091[i_30_ - 1][i_33_ - 1] = i_40_ == 0;
					}
				}
				Class68.anIntArray968[(Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730)] = i_31_;
				Class68.anIntArray968[(Class94_Sub4.anInt7730
						+ Class94_Sub4.anInt7730 + 1)] = i_32_;
			}
			if (i_26_ >= 0)
				Class236_Sub5.aBool6848 = false;
			else {
				Class138.anIntArray1885 = is_16_;
				Class112.anIntArray1538 = is_17_;
				Class112.anIntArray1535 = is_18_;
				Class108_Sub27.anIntArray7864 = is_19_;
				Class242.anIntArray3290 = is_20_;
				Class254_Sub1.method2409(i_21_, 0, Class87.aClass163_1210);
			}
		} else {
			if (Class120.aBoolArrayArray1626 == null)
				Class120.aBoolArrayArray1626 = (new boolean[Class138.anInt1886
						+ Class138.anInt1886 + 1][Class82.anInt1133
						+ Class138.anInt1886 + 1]);
			for (int i_41_ = 0; i_41_ < Class120.aBoolArrayArray1626.length; i_41_++) {
				for (int i_42_ = 0; i_42_ < Class120.aBoolArrayArray1626[0].length; i_42_++)
					Class120.aBoolArrayArray1626[i_41_][i_42_] = true;
			}
			Class106.aBoolArrayArray1426 = Class120.aBoolArrayArray1626;
			Class11_Sub2_Sub19.aBoolArrayArray9091 = Class120.aBoolArrayArray1626;
			Class244.anInt3312 = 0;
			Class33.anInt456 = 0;
			Class331.anInt4398 = Class138.anInt1886;
			Class179.anInt2291 = Class82.anInt1133;
			Class236_Sub5.aBool6848 = false;
		}
		Class376_Sub7_Sub5_Sub2.method3905(false, Class87.aClass163_1210);
		if (!((Class103) Class206.aClass103_2779).aBool1372) {
			Class131 class131 = ((Class103) Class206.aClass103_2779).aClass131_1369;
			for (Class376_Sub5 class376_sub5 = (Class376_Sub5) class131
					.method847(-31182); class376_sub5 != null; class376_sub5 = (Class376_Sub5) class131
					.method856(43)) {
				class376_sub5.method2207((byte) -103);
				Class16.method155(0, class376_sub5);
			}
		}
		if (Class11_Sub2_Sub17.aBool9051) {
			for (int i_43_ = 0; i_43_ < Class11_Sub26.anInt6303; i_43_++)
				Class309.aClass248Array4132[i_43_].method1574(bool, 18223, i);
		}
		if (Class376_Sub1.aBool5098) {
			Class11_Sub12_Sub3.anIntArray9225 = Class87.aClass163_1210.Y();
			Class87.aClass163_1210.K(Applet_Sub1.anIntArray10472);
			int i_44_ = ((Applet_Sub1.anIntArray10472[2] - Applet_Sub1.anIntArray10472[0]) / Class205.anInt2763);
			for (int i_45_ = 0; i_45_ < Class205.anInt2763 - 1; i_45_++)
				Class11_Sub45_Sub1_Sub2.anIntArray9878[i_45_] = i_44_
						* (i_45_ + 1) + Class2_Sub8.anIntArray6861[i_45_];
			for (int i_46_ = 0; i_46_ < Packet.aClass13Array8724.length; i_46_++)
				Packet.aClass13Array8724[i_46_].method144();
		}
		if (Class108_Sub6.aClass364ArrayArrayArray5627 != null) {
			if (Class376_Sub1.aBool5098)
				Class358.method2131(0);
			Class11_Sub2_Sub9.method3471(true);
			Class87.aClass163_1210.ra(-1, 1583160, 40, 127);
			Class305.method1871(true, is, i_21_, i_22_, i_26_, i_27_, bool_28_);
			if (Class376_Sub1.aBool5098)
				Class124.method806();
			Class87.aClass163_1210.pa();
			Class11_Sub2_Sub9.method3471(false);
		}
		Class305.method1871(false, is, i_21_, i_22_, i_26_, i_27_, bool_28_);
		if (Class376_Sub1.aBool5098) {
			for (int i_47_ = 0; i_47_ < Class155.anInt2044; i_47_++)
				Class108_Sub13.aBoolArrayArrayArray6263[i_47_] = Class11_Sub2_Sub25.aBoolArrayArrayArray9331[i_47_];
			Class358.method2131(0);
			for (int i_48_ = 0; i_48_ < Packet.aClass13Array8724.length; i_48_++)
				Packet.aClass13Array8724[i_48_].method144();
		}
		if (Class376_Sub1.aBool5098) {
			Class124.method806();
			for (int i_49_ = 0; i_49_ < Class155.anInt2044; i_49_++)
				Class11_Sub2_Sub25.aBoolArrayArrayArray9331[i_49_] = Class108_Sub13.aBoolArrayArrayArray6263[i_49_];
			if (Class68.anInt974 == 2) {
				if (Class220_Sub1.aLongArray7154[0] < Class220_Sub1.aLongArray7154[1]) {
					if ((Class11_Sub45_Sub1_Sub2.anIntArray9878[0] + Class2_Sub8.anIntArray6861[0]) > Applet_Sub1.anIntArray10472[0])
						Class2_Sub8.anIntArray6861[0]++;
				} else if ((Class220_Sub1.aLongArray7154[0] > Class220_Sub1.aLongArray7154[1])
						&& ((Class11_Sub45_Sub1_Sub2.anIntArray9878[0] + Class2_Sub8.anIntArray6861[0]) < Applet_Sub1.anIntArray10472[2]))
					Class2_Sub8.anIntArray6861[0]--;
			}
		}
		if (!Class246.aBool3327) {
			Class11_Sub2_Sub19.aBoolArrayArray9091 = bools;
			Class106.aBoolArrayArray1426 = bools_29_;
		}
		Class234.method1494();
	}

	static final void method3394(int i) {
		try {
			anInt8551++;
			if (Class109.aClass104ArrayArray1477 != null) {
				for (int i_50_ = 0; ((i_50_ ^ 0xffffffff) > (Class109.aClass104ArrayArray1477.length ^ 0xffffffff)); i_50_++) {
					for (int i_51_ = 0; (Class109.aClass104ArrayArray1477[i_50_].length > i_51_); i_51_++)
						Class109.aClass104ArrayArray1477[i_50_][i_51_] = Class170.aClass104_2185;
				}
			}
			int i_52_ = 84 / ((31 - i) / 39);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jaa.K(" + i + ')');
		}
	}

	static final void method3395(boolean bool) {
		try {
			anInt8556++;
			if (bool != false)
				method3395(true);
			if ((Class341.aString4509.toLowerCase().indexOf("microsoft") ^ 0xffffffff) != 0) {
				Class204.anIntArray2753[188] = 71;
				Class204.anIntArray2753[219] = 42;
				Class204.anIntArray2753[222] = 59;
				Class204.anIntArray2753[221] = 43;
				Class204.anIntArray2753[220] = 74;
				Class204.anIntArray2753[186] = 57;
				Class204.anIntArray2753[189] = 26;
				Class204.anIntArray2753[190] = 72;
				Class204.anIntArray2753[192] = 58;
				Class204.anIntArray2753[223] = 28;
				Class204.anIntArray2753[187] = 27;
				Class204.anIntArray2753[191] = 73;
			} else {
				Class204.anIntArray2753[91] = 42;
				if (Class341.aMethod4525 != null) {
					Class204.anIntArray2753[222] = 58;
					Class204.anIntArray2753[192] = 28;
					Class204.anIntArray2753[520] = 59;
				} else {
					Class204.anIntArray2753[192] = 58;
					Class204.anIntArray2753[222] = 59;
				}
				Class204.anIntArray2753[46] = 72;
				Class204.anIntArray2753[47] = 73;
				Class204.anIntArray2753[44] = 71;
				Class204.anIntArray2753[93] = 43;
				Class204.anIntArray2753[61] = 27;
				Class204.anIntArray2753[59] = 57;
				Class204.anIntArray2753[92] = 74;
				Class204.anIntArray2753[45] = 26;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jaa.J(" + bool + ')');
		}
	}

	public static void method3396(boolean bool) {
		try {
			aClass370_8557 = null;
			anIntArrayArray8553 = null;
			if (bool == true) {
				loginExponentRSA = null;
				aClass83_8560 = null;
				aString8552 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jaa.L(" + bool + ')');
		}
	}

	public Class11_Sub2_Sub5() {
		super(1, false);
	}

	final int[][] method2255(int i, int i_53_) {
		try {
			anInt8550++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(i_53_
					^ i_53_, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int i_54_ = Class33_Sub2.anInt6696 / anInt8554;
				int i_55_ = Class29.anInt398 / anInt8555;
				int[][] is_56_;
				if ((i_55_ ^ 0xffffffff) >= -1)
					is_56_ = this.method2262(0, 126, 0);
				else {
					int i_57_ = i % i_55_;
					is_56_ = this.method2262(i_57_ * Class29.anInt398 / i_55_,
							33, 0);
				}
				int[] is_58_ = is_56_[0];
				int[] is_59_ = is_56_[1];
				int[] is_60_ = is_56_[2];
				int[] is_61_ = is[0];
				int[] is_62_ = is[1];
				int[] is_63_ = is[2];
				for (int i_64_ = 0; ((i_64_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_64_++) {
					int i_65_;
					if ((i_54_ ^ 0xffffffff) >= -1)
						i_65_ = 0;
					else {
						int i_66_ = i_64_ % i_54_;
						i_65_ = Class33_Sub2.anInt6696 * i_66_ / i_54_;
					}
					is_61_[i_64_] = is_58_[i_65_];
					is_62_[i_64_] = is_59_[i_65_];
					is_63_[i_64_] = is_60_[i_65_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jaa.I(" + i + ','
					+ i_53_ + ')');
		}
	}

	static {
		aString8552 = null;
		aClass370_8557 = new OutgoingPacket(68, -1);
		anInt8559 = 0;
		aClass83_8560 = new Class83(11, 7);
	}
}
