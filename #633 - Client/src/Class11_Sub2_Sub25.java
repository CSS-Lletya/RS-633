/* Class11_Sub2_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub25 extends Class11_Sub2 {
	private int anInt9320;
	private int anInt9321 = 4096;
	static Class213 aClass213_9322 = new Class213(64);
	private int anInt9323;
	static int anInt9324;
	static int anInt9325;
	static Class376_Sub7[] aClass376_Sub7Array9326;
	static int anInt9327;
	static int anInt9328;
	static Class6 aClass6_9329 = Class112.method751(0);
	static int anInt9330;
	static boolean[][][] aBoolArrayArrayArray9331;
	static String aString9332 = null;
	static int anInt9333;
	/* synthetic */static Class aClass9334;

	static final void method3643(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, Class163 class163, int i_5_, int i_6_) {
		do {
			try {
				if (i_6_ > -12)
					method3644(21);
				anInt9324++;
				Interface13 interface13 = (Interface13) Class209.method1342(
						i_3_, i_2_, i);
				if (interface13 != null) {
					Class42 class42 = (Class11_Sub4.aClass290_5237.method1793(
							(byte) 115, interface13.method42((byte) -17)));
					int i_7_ = 0x3 & interface13.method30(30374);
					int i_8_ = interface13.method29((byte) -10);
					if ((((Class42) class42).anInt600 ^ 0xffffffff) == 0) {
						int i_9_ = i_1_;
						if ((((Class42) class42).anInt664 ^ 0xffffffff) < -1)
							i_9_ = i_4_;
						if (i_8_ == 0 || i_8_ == 2) {
							if ((i_7_ ^ 0xffffffff) != -1) {
								if ((i_7_ ^ 0xffffffff) == -2)
									class163.method1059(i_0_, i_5_, 8985, 4,
											i_9_);
								else if ((i_7_ ^ 0xffffffff) != -3) {
									if ((i_7_ ^ 0xffffffff) == -4)
										class163.method1059(i_0_, 3 + i_5_,
												8985, 4, i_9_);
								} else
									class163.method1022(127, 3 + i_0_, i_5_, 4,
											i_9_);
							} else
								class163.method1022(118, i_0_, i_5_, 4, i_9_);
						}
						if ((i_8_ ^ 0xffffffff) == -4) {
							if (i_7_ != 0) {
								if (i_7_ != 1) {
									if (i_7_ != 2) {
										if ((i_7_ ^ 0xffffffff) == -4)
											class163.method1035(i_9_, i_0_,
													i_5_ + 3, (byte) 78, 1, 1);
									} else
										class163.method1035(i_9_, 3 + i_0_,
												3 + i_5_, (byte) 108, 1, 1);
								} else
									class163.method1035(i_9_, i_0_ + 3, i_5_,
											(byte) 102, 1, 1);
							} else
								class163.method1035(i_9_, i_0_, i_5_,
										(byte) 110, 1, 1);
						}
						if ((i_8_ ^ 0xffffffff) == -3) {
							if ((i_7_ ^ 0xffffffff) == -1)
								class163.method1059(i_0_, i_5_, 8985, 4, i_9_);
							else if (i_7_ != 1) {
								if ((i_7_ ^ 0xffffffff) == -3)
									class163.method1059(i_0_, 3 + i_5_, 8985,
											4, i_9_);
								else if ((i_7_ ^ 0xffffffff) == -4)
									class163.method1022(119, i_0_, i_5_, 4,
											i_9_);
							} else
								class163.method1022(126, 3 + i_0_, i_5_, 4,
										i_9_);
						}
					} else
						Class234_Sub2_Sub2.method3537(-65534, i_7_, i_5_,
								class163, i_0_, class42);
				}
				interface13 = ((Interface13) Class180
						.method1185(
								i_3_,
								i_2_,
								i,
								(aClass9334 != null ? aClass9334
										: (aClass9334 = getClassByName("Interface13")))));
				if (interface13 != null) {
					Class42 class42 = (Class11_Sub4.aClass290_5237.method1793(
							(byte) 112, interface13.method42((byte) -17)));
					int i_10_ = 0x3 & interface13.method30(30374);
					int i_11_ = interface13.method29((byte) -10);
					if ((((Class42) class42).anInt600 ^ 0xffffffff) != 0)
						Class234_Sub2_Sub2.method3537(-65534, i_10_, i_5_,
								class163, i_0_, class42);
					else if (i_11_ == 9) {
						int i_12_ = -1118482;
						if ((((Class42) class42).anInt664 ^ 0xffffffff) < -1)
							i_12_ = -1179648;
						if ((i_10_ ^ 0xffffffff) != -1 && i_10_ != 2)
							class163.method1029(89, i_5_, i_5_ + 3, 3 + i_0_,
									i_12_, i_0_);
						else
							class163.method1029(127, i_5_ + 3, i_5_, 3 + i_0_,
									i_12_, i_0_);
					}
				}
				interface13 = (Interface13) Class159.method988(i_3_, i_2_, i);
				if (interface13 == null)
					break;
				Class42 class42 = (Class11_Sub4.aClass290_5237.method1793(
						(byte) 109, interface13.method42((byte) -17)));
				int i_13_ = 0x3 & interface13.method30(30374);
				if ((((Class42) class42).anInt600 ^ 0xffffffff) == 0)
					break;
				Class234_Sub2_Sub2.method3537(-65534, i_13_, i_5_, class163,
						i_0_, class42);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mv.C(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ','
						+ i_4_ + ',' + (class163 != null ? "{...}" : "null")
						+ ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3644(int i) {
		try {
			if (i != 4)
				method3645(77);
			aClass376_Sub7Array9326 = null;
			aString9332 = null;
			aClass6_9329 = null;
			aClass213_9322 = null;
			aBoolArrayArrayArray9331 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mv.F(" + i + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_14_) {
		try {
			int i_15_ = i_14_;
			while_191_: do {
				do {
					if ((i_15_ ^ 0xffffffff) != -1) {
						if ((i_15_ ^ 0xffffffff) != -2) {
							if ((i_15_ ^ 0xffffffff) == -3)
								break;
							break while_191_;
						}
					} else {
						anInt9323 = stream.readUnsignedShort((byte) -65);
						break while_191_;
					}
					anInt9321 = stream.readUnsignedShort((byte) -65);
					break while_191_;
				} while (false);
				anInt9320 = stream.readUnsignedShort((byte) -65);
			} while (false);
			if (i != 3731)
				method3643(70, -113, 81, 69, 123, -73, null, 4, 99);
			anInt9330++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mv.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_14_ + ')'));
		}
	}

	static final void method3645(int i) {
		try {
			anInt9327++;
			Class58_Sub1_Sub2.method3741((long) Class11_Sub25.anInt6279,
					Class321_Sub2.aClass163_6648, -16448);
			if (Class365.anInt4797 != -1)
				Class33_Sub1.method2637(Class365.anInt4797, -118);
			for (int i_16_ = 0; ((i_16_ ^ 0xffffffff) > (Class11_Sub2_Sub6.anInt8702 ^ 0xffffffff)); i_16_++) {
				if (Class11_Sub45.aBoolArray7907[i_16_])
					Class254.aBoolArray3493[i_16_] = true;
				Class363.aBoolArray4732[i_16_] = Class11_Sub45.aBoolArray7907[i_16_];
				Class11_Sub45.aBoolArray7907[i_16_] = false;
			}
			Class11_Sub2_Sub37.anInt9757 = Class11_Sub25.anInt6279;
			if (Class365.anInt4797 != -1) {
				Class11_Sub2_Sub6.anInt8702 = 0;
				Class11_Sub47.method3214((byte) -120);
			}
			Class321_Sub2.aClass163_6648.la();
			Class100.method666(Class321_Sub2.aClass163_6648, -16711936);
			int i_17_ = Class268.method1691(false);
			if ((i_17_ ^ 0xffffffff) == 0)
				i_17_ = Class325.anInt4329;
			if (i_17_ == -1)
				i_17_ = Class11_Sub10.anInt5389;
			if (i > -74)
				method3645(-107);
			Class32_Sub1.method2441(i_17_, (byte) -39);
			Class104.anInt1398 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mv.E(" + i + ')');
		}
	}

	public Class11_Sub2_Sub25() {
		super(1, false);
		anInt9320 = 4096;
		anInt9323 = 4096;
	}

	final int[][] method2255(int i, int i_18_) {
		try {
			if (i_18_ != 1)
				method3644(-78);
			anInt9325++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_19_ = this.method2262(i, 52, 0);
				int[] is_20_ = is_19_[0];
				int[] is_21_ = is_19_[1];
				int[] is_22_ = is_19_[2];
				int[] is_23_ = is[0];
				int[] is_24_ = is[1];
				int[] is_25_ = is[2];
				for (int i_26_ = 0; Class33_Sub2.anInt6696 > i_26_; i_26_++) {
					int i_27_ = is_20_[i_26_];
					int i_28_ = is_22_[i_26_];
					int i_29_ = is_21_[i_26_];
					if ((i_27_ ^ 0xffffffff) == (i_28_ ^ 0xffffffff)
							&& (i_28_ ^ 0xffffffff) == (i_29_ ^ 0xffffffff)) {
						is_23_[i_26_] = i_27_ * anInt9323 >> 12;
						is_24_[i_26_] = anInt9321 * i_28_ >> 12;
						is_25_[i_26_] = i_29_ * anInt9320 >> 12;
					} else {
						is_23_[i_26_] = anInt9323;
						is_24_[i_26_] = anInt9321;
						is_25_[i_26_] = anInt9320;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mv.I(" + i + ','
					+ i_18_ + ')');
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
