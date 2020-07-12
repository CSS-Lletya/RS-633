/* Class11_Sub2_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class11_Sub2_Sub15 extends Class11_Sub2 {
	private int anInt9016;
	private int anInt9017 = 5;
	private int anInt9018;
	private int anInt9019;
	static int[] anIntArray9020 = new int[1];
	static int anInt9021;
	static int anInt9022;
	static Class146 aClass146_9023;
	static int anInt9024;
	private int anInt9025;
	private byte[] aByteArray9026;
	static int anInt9027;
	static int anInt9028;
	private int anInt9029;
	static int[] anIntArray9030 = new int[3];
	static int anInt9031;
	private short[] aShortArray9032;

	private final void method3545(int i) {
		do {
			try {
				anInt9022++;
				Random random = new Random((long) anInt9029);
				aShortArray9032 = new short[512];
				if ((anInt9016 ^ 0xffffffff) < -1) {
					for (int i_0_ = 0; i_0_ < 512; i_0_++)
						aShortArray9032[i_0_] = (short) Class302.method1863(
								anInt9016, random, (byte) -119);
				}
				if (i == -24617)
					break;
				anIntArray9020 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "gu.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final int method3546(int i, int i_1_, int i_2_) {
		try {
			anInt9031++;
			if (i != -2070226657)
				return -10;
			int i_3_ = i_2_ >>> 31;
			return -i_3_ + (i_3_ + i_2_) / i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gu.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2256(int i) {
		try {
			anInt9028++;
			if (i == 7) {
				aByteArray9026 = Class210.method1349((byte) 69, anInt9029);
				method3545(i ^ ~0x602f);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gu.D(" + i + ')');
		}
	}

	public static void method3547(boolean bool) {
		try {
			if (bool != true)
				method3546(-25, 57, 69);
			anIntArray9030 = null;
			anIntArray9020 = null;
			aClass146_9023 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gu.F(" + bool + ')');
		}
	}

	public Class11_Sub2_Sub15() {
		super(0, true);
		anInt9016 = 2048;
		anInt9019 = 1;
		aByteArray9026 = new byte[512];
		anInt9018 = 5;
		anInt9029 = 0;
		anInt9025 = 2;
		aShortArray9032 = new short[512];
	}

	final void method2263(int i, Stream stream, int i_4_) {
		while_129_: do {
			try {
				anInt9027++;
				if (i == 3731) {
					int i_5_ = i_4_;
					while_128_: do {
						while_127_: do {
							while_126_: do {
								while_125_: do {
									while_124_: do {
										do {
											if (i_5_ != 0) {
												if ((i_5_ ^ 0xffffffff) == -2)
													break;
												if ((i_5_ ^ 0xffffffff) == -3)
													break while_124_;
												if ((i_5_ ^ 0xffffffff) == -4)
													break while_125_;
												if (i_5_ == 4)
													break while_126_;
												if (i_5_ == 5)
													break while_127_;
												if ((i_5_ ^ 0xffffffff) != -7)
													break while_129_;
												if (!client.aBool10531)
													break while_128_;
											}
											anInt9017 = anInt9018 = stream
													.readUnsignedByte((byte) 35);
											return;
										} while (false);
										anInt9029 = stream
												.readUnsignedByte((byte) 35);
										return;
									} while (false);
									anInt9016 = stream
											.readUnsignedShort((byte) -65);
									return;
								} while (false);
								anInt9025 = stream.readUnsignedByte((byte) 35);
								return;
							} while (false);
							anInt9019 = stream.readUnsignedByte((byte) 35);
							return;
						} while (false);
						anInt9017 = stream.readUnsignedByte((byte) 35);
						return;
					} while (false);
					anInt9018 = stream.readUnsignedByte((byte) 35);
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("gu.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_4_ + ')'));
			}
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9024++;
			if (bool != true)
				return null;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_6_ = anInt9018 * Class171.anIntArray2199[i] + 2048;
				int i_7_ = i_6_ >> 12;
				int i_8_ = 1 + i_7_;
				int i_9_ = 0;
				while_137_: for (/**/; Class33_Sub2.anInt6696 > i_9_; i_9_++) {
					Class11_Sub20_Sub2.anInt9499 = Class190.anInt2444 = Class150.anInt2001 = InputStream_Sub2.anInt6945 = 2147483647;
					int i_10_ = 2048 - -(Class208.anIntArray2808[i_9_] * anInt9017);
					int i_11_ = i_10_ >> 12;
					int i_12_ = i_11_ + 1;
					for (int i_13_ = i_7_ - 1; i_8_ >= i_13_; i_13_++) {
						int i_14_ = 0xff & (aByteArray9026[0xff & (i_13_ < anInt9018 ? i_13_
								: i_13_ - anInt9018)]);
						for (int i_15_ = i_11_ - 1; (i_15_ ^ 0xffffffff) >= (i_12_ ^ 0xffffffff); i_15_++) {
							int i_16_ = (2 * ((aByteArray9026[0xff
									& i_14_
									+ (((i_15_ ^ 0xffffffff) > (anInt9017 ^ 0xffffffff)) ? i_15_
											: i_15_ + -anInt9017)]) & 0xff));
							int i_17_ = i_10_
									+ (-(i_15_ << 12) + -aShortArray9032[i_16_++]);
							int i_18_ = (-(i_13_ << 12)
									+ -aShortArray9032[i_16_] + i_6_);
							int i_19_ = anInt9019;
							int i_20_;
							while_133_: do {
								while_132_: do {
									while_131_: do {
										while_130_: do {
											do {
												if (i_19_ != 1) {
													if ((i_19_ ^ 0xffffffff) != -4) {
														if (i_19_ != 4) {
															if ((i_19_ ^ 0xffffffff) != -6) {
																if ((i_19_ ^ 0xffffffff) == -3)
																	break while_131_;
																break while_132_;
															}
														} else
															break;
														break while_130_;
													}
												} else {
													i_20_ = ((i_17_ * i_17_ + i_18_
															* i_18_) >> 12);
													break while_133_;
												}
												i_18_ = (i_18_ >= 0 ? i_18_
														: -i_18_);
												i_17_ = ((i_17_ ^ 0xffffffff) <= -1) ? i_17_
														: -i_17_;
												i_20_ = (i_18_ < i_17_ ? i_17_
														: i_18_);
												break while_133_;
											} while (false);
											i_17_ = (int) (4096.0 * (Math
													.sqrt((double) ((float) (i_17_ >= 0 ? i_17_
															: -i_17_) / 4096.0F))));
											i_18_ = (int) (4096.0 * (Math
													.sqrt((double) ((float) (i_18_ >= 0 ? i_18_
															: -i_18_) / 4096.0F))));
											i_20_ = i_17_ + i_18_;
											i_20_ = i_20_ * i_20_ >> 12;
											break while_133_;
										} while (false);
										i_17_ *= i_17_;
										i_18_ *= i_18_;
										i_20_ = (int) ((Math
												.sqrt(Math
														.sqrt((double) ((float) (i_18_ + i_17_) / 1.6777216E7F)))) * 4096.0);
										break while_133_;
									} while (false);
									i_20_ = (((i_18_ ^ 0xffffffff) <= -1 ? i_18_
											: -i_18_) + (i_17_ >= 0 ? i_17_
											: -i_17_));
									break while_133_;
								} while (false);
								i_20_ = (int) ((Math
										.sqrt((double) ((float) (i_18_ * i_18_ + (i_17_ * i_17_)) / 1.6777216E7F))) * 4096.0);
							} while (false);
							if (Class11_Sub20_Sub2.anInt9499 > i_20_) {
								InputStream_Sub2.anInt6945 = Class150.anInt2001;
								Class150.anInt2001 = Class190.anInt2444;
								Class190.anInt2444 = Class11_Sub20_Sub2.anInt9499;
								Class11_Sub20_Sub2.anInt9499 = i_20_;
							} else if (Class190.anInt2444 <= i_20_) {
								if (i_20_ < Class150.anInt2001) {
									InputStream_Sub2.anInt6945 = Class150.anInt2001;
									Class150.anInt2001 = i_20_;
								} else if ((InputStream_Sub2.anInt6945 ^ 0xffffffff) < (i_20_ ^ 0xffffffff))
									InputStream_Sub2.anInt6945 = i_20_;
							} else {
								InputStream_Sub2.anInt6945 = Class150.anInt2001;
								Class150.anInt2001 = Class190.anInt2444;
								Class190.anInt2444 = i_20_;
							}
						}
					}
					int i_21_ = anInt9025;
					while_135_: do {
						while_134_: do {
							do {
								if (i_21_ != 0) {
									if ((i_21_ ^ 0xffffffff) != -2) {
										if ((i_21_ ^ 0xffffffff) != -4) {
											if ((i_21_ ^ 0xffffffff) != -5) {
												if (i_21_ == 2)
													break while_135_;
												continue while_137_;
											}
										} else
											break;
										break while_134_;
									}
								} else {
									is[i_9_] = Class11_Sub20_Sub2.anInt9499;
									continue while_137_;
								}
								is[i_9_] = Class190.anInt2444;
								continue while_137_;
							} while (false);
							is[i_9_] = Class150.anInt2001;
							continue while_137_;
						} while (false);
						is[i_9_] = InputStream_Sub2.anInt6945;
						continue while_137_;
					} while (false);
					is[i_9_] = Class190.anInt2444
							+ -Class11_Sub20_Sub2.anInt9499;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gu.A(" + i + ','
					+ bool + ')');
		}
	}
}
