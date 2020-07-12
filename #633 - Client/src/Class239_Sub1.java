/* Class239_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub1 extends Class239 implements Interface19 {
	static int anInt7259;
	static int anInt7260;
	private int anInt7261;
	static int anInt7262;
	static int anInt7263;
	static int anInt7264;
	static int anInt7265;
	static IncomingPacket aClass160_7266 = new IncomingPacket(34, -2);
	static boolean aBool7267 = false;
	static int anInt7268 = 0;
	static Class146 aClass146_7269;
	static int anInt7270;

	public final void method49(int i, int i_0_, byte[] is, int i_1_) {
		try {
			if (i_1_ <= -40) {
				anInt7259++;
				this.method1518(true, i_0_, is);
				anInt7261 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("rt.F(" + i + ',' + i_0_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_1_ + ')'));
		}
	}

	final void method1520(byte i) {
		try {
			anInt7263++;
			if (i <= 33)
				aBool7267 = true;
			((Class239) this).aClass163_Sub3_3249.method3263(34963, this);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rt.G(" + i + ')');
		}
	}

	static final int method2941(int i, byte i_2_, byte[] is, int i_3_,
			String string, int i_4_) {
		try {
			anInt7262++;
			int i_5_ = i_3_ + -i;
			if (i_2_ != -30)
				aClass146_7269 = null;
			for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
				int i_7_ = string.charAt(i + i_6_);
				if (i_7_ > 0
						&& (i_7_ ^ 0xffffffff) > -129
						|| ((i_7_ ^ 0xffffffff) <= -161 && (i_7_ ^ 0xffffffff) >= -256))
					is[i_4_ + i_6_] = (byte) i_7_;
				else if (i_7_ != 8364) {
					if (i_7_ == 8218)
						is[i_4_ + i_6_] = (byte) -126;
					else if ((i_7_ ^ 0xffffffff) != -403) {
						if (i_7_ == 8222)
							is[i_6_ + i_4_] = (byte) -124;
						else if ((i_7_ ^ 0xffffffff) != -8231) {
							if (i_7_ != 8224) {
								if (i_7_ != 8225) {
									if ((i_7_ ^ 0xffffffff) != -711) {
										if ((i_7_ ^ 0xffffffff) == -8241)
											is[i_4_ - -i_6_] = (byte) -119;
										else if (i_7_ == 352)
											is[i_6_ + i_4_] = (byte) -118;
										else if ((i_7_ ^ 0xffffffff) == -8250)
											is[i_6_ + i_4_] = (byte) -117;
										else if ((i_7_ ^ 0xffffffff) != -339) {
											if ((i_7_ ^ 0xffffffff) == -382)
												is[i_4_ + i_6_] = (byte) -114;
											else if ((i_7_ ^ 0xffffffff) != -8217) {
												if ((i_7_ ^ 0xffffffff) != -8218) {
													if (i_7_ == 8220)
														is[i_6_ + i_4_] = (byte) -109;
													else if ((i_7_ ^ 0xffffffff) != -8222) {
														if (i_7_ == 8226)
															is[i_6_ + i_4_] = (byte) -107;
														else if ((i_7_ ^ 0xffffffff) == -8212)
															is[i_4_ - -i_6_] = (byte) -106;
														else if ((i_7_ ^ 0xffffffff) == -8213)
															is[i_6_ + i_4_] = (byte) -105;
														else if ((i_7_ ^ 0xffffffff) != -733) {
															if ((i_7_ ^ 0xffffffff) != -8483) {
																if (i_7_ == 353)
																	is[(i_6_ + i_4_)] = (byte) -102;
																else if ((i_7_ ^ 0xffffffff) == -8251)
																	is[(i_6_ + i_4_)] = (byte) -101;
																else if (i_7_ == 339)
																	is[(i_6_ + i_4_)] = (byte) -100;
																else if (i_7_ == 382)
																	is[(i_6_ + i_4_)] = (byte) -98;
																else if ((i_7_ ^ 0xffffffff) == -377)
																	is[(i_4_ + i_6_)] = (byte) -97;
																else
																	is[(i_4_ + i_6_)] = (byte) 63;
															} else
																is[(i_4_ - -i_6_)] = (byte) -103;
														} else
															is[i_4_ - -i_6_] = (byte) -104;
													} else
														is[i_4_ + i_6_] = (byte) -108;
												} else
													is[i_4_ + i_6_] = (byte) -110;
											} else
												is[i_6_ + i_4_] = (byte) -111;
										} else
											is[i_4_ + i_6_] = (byte) -116;
									} else
										is[i_6_ + i_4_] = (byte) -120;
								} else
									is[i_4_ - -i_6_] = (byte) -121;
							} else
								is[i_4_ + i_6_] = (byte) -122;
						} else
							is[i_6_ + i_4_] = (byte) -123;
					} else
						is[i_4_ + i_6_] = (byte) -125;
				} else
					is[i_4_ - -i_6_] = (byte) -128;
			}
			return i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("rt.A(" + i + ',' + i_2_ + ','
							+ (is != null ? "{...}" : "null") + ',' + i_3_
							+ ',' + (string != null ? "{...}" : "null") + ','
							+ i_4_ + ')'));
		}
	}

	public final long method33(byte i) {
		try {
			anInt7260++;
			if (i != -27)
				method33((byte) -57);
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rt.C(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			if (i != -23198)
				method33((byte) -101);
			anInt7265++;
			return ((Class239) this).anInt3248;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rt.E(" + i + ')');
		}
	}

	public static void method2942(int i) {
		do {
			try {
				aClass146_7269 = null;
				aClass160_7266 = null;
				if (i == 34)
					break;
				method2941(87, (byte) 37, null, -117, null, 106);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rt.B(" + i + ')');
			}
			break;
		} while (false);
	}

	Class239_Sub1(Class163_Sub3 class163_sub3, int i, byte[] is, int i_8_,
			boolean bool) {
		super(class163_sub3, 34963, is, i_8_, bool);
		try {
			anInt7261 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rt.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_8_ + ','
					+ bool + ')'));
		}
	}

	public final int method48(boolean bool) {
		try {
			anInt7264++;
			if (bool != true)
				method1520((byte) 115);
			return anInt7261;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rt.D(" + bool + ')');
		}
	}
}
