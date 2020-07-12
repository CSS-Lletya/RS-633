/* Class11_Sub6_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub6_Sub5 extends Class11_Sub6 {
	static int anInt9582;
	static int anInt9583;
	private int anInt9584;
	static int anInt9585;
	private Class84 aClass84_9586 = new Class84();
	static int anInt9587;
	static int anInt9588;
	static int anInt9589;
	static int anInt9590;
	private int anInt9591;
	static int anInt9592;
	static int anInt9593;
	private int anInt9594 = 0;
	static int anInt9595;
	static int anInt9596;
	private int anInt9597;
	static OutgoingPacket ACTION_BUTTON8 = new OutgoingPacket(12, 8);
	static int anInt9599;
	static int anInt9600;
	private int anInt9601;
	static int anInt9602;
	private boolean aBool9603;
	static IncomingPacket aClass160_9604 = new IncomingPacket(102, 6);
	private boolean aBool9605;
	static int anInt9606;
	static OutgoingPacket aClass370_9607 = new OutgoingPacket(16, 1);

	final void method3782(int i, int i_0_) {
		do {
			try {
				anInt9591 = i_0_;
				anInt9595++;
				anInt9601 = i_0_;
				if (i == 0)
					break;
				method3782(22, -36);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tv.C(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	final synchronized void method2315(int i) {
		try {
			anInt9596++;
			if (!aBool9605) {
				for (;;) {
					Class11_Sub45_Sub3 class11_sub45_sub3 = method3790((byte) -120);
					if (class11_sub45_sub3 == null) {
						if (aBool9603) {
							this.method122(-42);
							Class344.aClass124_4570.method807(63);
						}
						break;
					}
					if (((-anInt9597 + (((Class11_Sub45_Sub3) class11_sub45_sub3).aShortArrayArray8527[0]).length) ^ 0xffffffff) < (i ^ 0xffffffff)) {
						anInt9597 += i;
						break;
					}
					i -= (-anInt9597 + (((Class11_Sub45_Sub3) class11_sub45_sub3).aShortArrayArray8527[0]).length);
					method3787(13964);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.D(" + i + ')');
		}
	}

	final synchronized void method3783(int i,
			Class11_Sub45_Sub3 class11_sub45_sub3) {
		try {
			if (i != -101)
				aClass84_9586 = null;
			anInt9602++;
			for (/**/; (anInt9594 ^ 0xffffffff) <= -101; anInt9594--)
				aClass84_9586.method581((byte) -16);
			aClass84_9586.method589((byte) -13, class11_sub45_sub3);
			anInt9594++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tv.K(" + i + ','
					+ (class11_sub45_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final synchronized void method2318(int[] is, int i, int i_1_) {
		try {
			anInt9588++;
			if (!aBool9605) {
				if (method3790((byte) -119) == null) {
					if (aBool9603) {
						this.method122(-91);
						Class344.aClass124_4570.method807(63);
					}
				} else {
					int i_2_ = i_1_ + i;
					if (Class236_Sub1.aBool6092)
						i_2_ <<= 1;
					int i_3_ = 0;
					int i_4_ = 0;
					if (anInt9584 == 2)
						i_4_ = 1;
					while (i_2_ > i) {
						Class11_Sub45_Sub3 class11_sub45_sub3 = method3790((byte) -118);
						if (class11_sub45_sub3 == null)
							break;
						short[][] is_5_;
						for (is_5_ = (((Class11_Sub45_Sub3) class11_sub45_sub3).aShortArrayArray8527); ((i ^ 0xffffffff) > (i_2_ ^ 0xffffffff) && (anInt9597 ^ 0xffffffff) > (is_5_[0].length ^ 0xffffffff)); anInt9597++) {
							if (!Class236_Sub1.aBool6092)
								is[i++] += (is_5_[i_4_][anInt9597] * anInt9591 + anInt9601
										* is_5_[i_3_][anInt9597]);
							else {
								is[i++] = is_5_[i_3_][anInt9597] * anInt9601;
								is[i++] = is_5_[i_4_][anInt9597] * anInt9591;
							}
						}
						if (is_5_[0].length <= anInt9597)
							method3787(13964);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tv.A(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_1_ + ')'));
		}
	}

	final synchronized double method3784(int i) {
		try {
			anInt9599++;
			if ((anInt9594 ^ 0xffffffff) > -2)
				return -1.0;
			Class11_Sub45_Sub3 class11_sub45_sub3 = (Class11_Sub45_Sub3) aClass84_9586
					.method584(-12261);
			if (class11_sub45_sub3 == null)
				return -1.0;
			if (i != 0)
				aBool9603 = true;
			return (((Class11_Sub45_Sub3) class11_sub45_sub3).aDouble8524 - (double) ((float) (((Class11_Sub45_Sub3) class11_sub45_sub3).aShortArrayArray8527[0]).length / (float) Class119.anInt1610));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.H(" + i + ')');
		}
	}

	final synchronized int method3785(byte i) {
		try {
			if (i != 98)
				return -112;
			anInt9585++;
			return anInt9594;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.O(" + i + ')');
		}
	}

	public static void method3786(int i) {
		try {
			aClass160_9604 = null;
			ACTION_BUTTON8 = null;
			if (i == -28855)
				aClass370_9607 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.N(" + i + ')');
		}
	}

	private final synchronized void method3787(int i) {
		do {
			try {
				anInt9592++;
				Class11_Sub45_Sub3 class11_sub45_sub3 = method3790((byte) -110);
				if (class11_sub45_sub3 != null) {
					class11_sub45_sub3.method122(-45);
					anInt9594--;
					anInt9597 = 0;
					Class344.aClass124_4570
							.method812(class11_sub45_sub3, (byte) 36,
									class11_sub45_sub3.method3385((byte) -6));
					if (i == 13964)
						break;
					method3788(15, (byte) -94, -0.4526220619112119);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tv.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class11_Sub45_Sub3 method3788(int i, byte i_6_, double d) {
		try {
			anInt9593++;
			long l = (long) (i | anInt9584 << 0);
			Class11_Sub45_Sub3 class11_sub45_sub3 = ((Class11_Sub45_Sub3) Class344.aClass124_4570
					.method813(-115, l));
			do {
				if (class11_sub45_sub3 == null) {
					class11_sub45_sub3 = new Class11_Sub45_Sub3(
							new short[anInt9584][i], d);
					if (!client.aBool10531)
						break;
				}
				((Class11_Sub45_Sub3) class11_sub45_sub3).aDouble8524 = d;
				Class344.aClass124_4570.method810(l, (byte) 127);
			} while (false);
			if (i_6_ != 26)
				method3784(45);
			return class11_sub45_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tv.B(" + i + ','
					+ i_6_ + ',' + d + ')'));
		}
	}

	final synchronized void method3789(byte i, boolean bool) {
		do {
			try {
				anInt9582++;
				aBool9605 = bool;
				if (i == -123)
					break;
				method3783(-33, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tv.F(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	final Class11_Sub6 method2319() {
		try {
			anInt9589++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.M(" + ')');
		}
	}

	private final synchronized Class11_Sub45_Sub3 method3790(byte i) {
		try {
			if (i >= -97)
				return null;
			anInt9587++;
			return (Class11_Sub45_Sub3) aClass84_9586.method584(-12261);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.G(" + i + ')');
		}
	}

	final Class11_Sub6 method2316() {
		try {
			anInt9600++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.I(" + ')');
		}
	}

	final int method2314() {
		try {
			anInt9583++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.J(" + ')');
		}
	}

	final synchronized void method3791(boolean bool) {
		try {
			anInt9590++;
			aBool9603 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.L(" + bool + ')');
		}
	}

	Class11_Sub6_Sub5(int i) {
		anInt9591 = 256;
		anInt9601 = 256;
		try {
			anInt9584 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tv.<init>(" + i + ')');
		}
	}
}
