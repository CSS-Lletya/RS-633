/* Class382 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class382 implements Runnable {
	static int anInt4963;
	static int anInt4964;
	static int anInt4965;
	static int anInt4966;
	static int anInt4967;
	static int anInt4968;
	static int anInt4969;
	private Interface11 anInterface11_4970 = new Class81();
	static Class376_Sub7[] aClass376_Sub7Array4971;
	static int anInt4972;
	static int anInt4973;
	static int anInt4974;
	private volatile boolean aBool4975;
	static int anInt4976;
	static int anInt4977;
	static int anInt4978;
	private boolean aBool4979;
	static int anInt4980;
	static int anInt4981;
	static int anInt4982;
	private int anInt4983;
	private String aString4984;
	private int anInt4985;
	private long aLong4986;
	private long aLong4987;
	private Interface11 anInterface11_4988 = null;
	private Class209 aClass209_4989;

	static final void method2230(boolean bool, IComponentDefinitions class192,
			IComponentDefinitions class192_0_) {
		try {
			if (bool == false) {
				Class208.anInt2806++;
				anInt4977++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113, Class115.aClass370_1581,
						(byte) 64);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeInt(-49,
								((IComponentDefinitions) class192).anInt2471);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShortLE128((byte) 50,
								((IComponentDefinitions) class192).anInt2467);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShortLE128((byte) 69,
								((IComponentDefinitions) class192_0_).anInt2459);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.method2492(21,
								((IComponentDefinitions) class192_0_).anInt2471);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShortLE128((byte) 111,
								((IComponentDefinitions) class192).anInt2459);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-119,
								((IComponentDefinitions) class192_0_).anInt2467);
				Class79.method541(class11_sub10, -110);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ega.K(" + bool + ','
					+ (class192 != null ? "{...}" : "null") + ','
					+ (class192_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final String method2231(int i, int i_1_) {
		try {
			anInt4969++;
			if (i_1_ != 1677133712)
				aClass376_Sub7Array4971 = null;
			return (String.valueOf(0xff & i >> 24) + "."
					+ ((i & 0xffe3c4) >> 16) + "." + ((i & 0xff2e) >> 8) + "." + (0xff & i));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.G(" + i + ','
					+ i_1_ + ')');
		}
	}

	final String method2232(byte i) {
		try {
			anInt4981++;
			if (i != -45)
				anInterface11_4988 = null;
			return aString4984;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.F(" + i + ')');
		}
	}

	public static void method2233(byte i) {
		do {
			try {
				aClass376_Sub7Array4971 = null;
				if (i < -59)
					break;
				method2231(31, -25);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ega.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class209 method2234(byte i) {
		try {
			anInt4964++;
			int i_2_ = 85 % ((i - 8) / 49);
			return aClass209_4989;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.L(" + i + ')');
		}
	}

	final synchronized void method2235(Class209 class209, String string,
			long l, int i, byte i_3_) {
		try {
			anInt4985 = i;
			if (i_3_ > 112) {
				anInt4980++;
				aString4984 = string;
				aClass209_4989 = class209;
				aLong4986 = l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ega.E("
					+ (class209 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + l + ',' + i
					+ ',' + i_3_ + ')'));
		}
	}

	final synchronized void method2236(byte i) {
		try {
			if (i == 1) {
				aBool4979 = true;
				anInt4976++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.M(" + i + ')');
		}
	}

	public final void run() {
		try {
			while (!aBool4975) {
				long l = Class137.method878((byte) -72);
				synchronized (this) {
					try {
						anInt4983++;
						if (anInterface11_4970 instanceof Class81)
							anInterface11_4970.method36(aBool4979, 13751);
						else {
							long l_4_ = Class137.method878((byte) -114);
							if (Class321_Sub2.aClass163_6648 == null
									|| anInterface11_4988 == null
									|| (anInterface11_4988.method4((byte) 119) ^ 0xffffffff) == -1
									|| ((aLong4987 ^ 0xffffffffffffffffL) > (-(long) anInterface11_4988
											.method4((byte) 118) + l_4_ ^ 0xffffffffffffffffL))) {
								if (anInterface11_4988 != null) {
									aBool4979 = true;
									anInterface11_4988.method37(true);
									anInterface11_4988 = null;
								}
								if (aBool4979) {
									Class324.method1974((byte) 79);
									if (Class321_Sub2.aClass163_6648 != null)
										Class321_Sub2.aClass163_6648.GA(0);
								}
								anInterface11_4970
										.method36(
												(aBool4979 || (Class321_Sub2.aClass163_6648 != null && Class321_Sub2.aClass163_6648
														.method1069())), 13751);
							} else {
								int i = (int) ((-aLong4987 + l_4_) * 255L / (long) (anInterface11_4988
										.method4((byte) 124)));
								int i_5_ = 255 - i;
								i = 0xffffff | i << 24;
								Class324.method1974((byte) 112);
								i_5_ = i_5_ << 24 | 0xffffff;
								Class321_Sub2.aClass163_6648.GA(0);
								Class253 class253 = (Class321_Sub2.aClass163_6648
										.method1009(Class11_Sub36.anInt7079,
												Class153.anInt2025, true));
								Class321_Sub2.aClass163_6648.method1023(
										(byte) 26, class253);
								anInterface11_4988.method36(true, 13751);
								Class321_Sub2.aClass163_6648.method1031();
								class253.method1624(0, 0, 0, i_5_, 1);
								Class321_Sub2.aClass163_6648.method1023(
										(byte) 26, class253);
								Class321_Sub2.aClass163_6648.GA(0);
								anInterface11_4970.method36(true, 13751);
								Class321_Sub2.aClass163_6648.method1031();
								class253.method1624(0, 0, 0, i, 1);
							}
							try {
								if (Class321_Sub2.aClass163_6648 != null
										&& !(anInterface11_4970 instanceof Class81))
									Class321_Sub2.aClass163_6648.method1056(0);
							} catch (Exception_Sub1 exception_sub1) {
								Class11_Sub12_Sub3
										.method3602(
												(byte) -116,
												(exception_sub1.getMessage()
														+ " (Recovered) " + Class11_Sub2_Sub23.aclient9263
														.method3985(true)),
												exception_sub1);
								Class239.method1521(true, 0, 0);
							}
						}
						java.awt.Container container;
						if (Class376_Sub5.aFrame6918 == null) {
							if (Class108_Sub16.anApplet6538 == null)
								container = Class112.anApplet_Sub1_1542;
							else
								container = Class108_Sub16.anApplet6538;
						} else
							container = Class376_Sub5.aFrame6918;
						container.getSize();
						container.getSize();
						if (container == Class376_Sub5.aFrame6918)
							Class376_Sub5.aFrame6918.getInsets();
						aBool4979 = false;
						if (Class321_Sub2.aClass163_6648 != null
								&& !(anInterface11_4970 instanceof Class81)
								&& (aClass209_4989.method1341((byte) -110) < Class209.aClass209_2839
										.method1341((byte) -110)))
							Class33_Sub3.method2919((byte) -123);
					} catch (Exception exception) {
						continue;
					}
				}
				long l_6_ = Class137.method878((byte) -90);
				int i = (int) (-l_6_ + (l + 20L));
				if (i > 0)
					Class11_Sub51.method3236((long) i, 0);
			}
			anInt4982++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.run(" + ')');
		}
	}

	static final boolean method2237(int i, int i_7_, int i_8_) {
		try {
			anInt4972++;
			if (i != 458752)
				return false;
			if (!((i_7_ & 0x70000) != 0 | Class11_Sub45_Sub1_Sub1.method3862(
					i_7_, (byte) 126, i_8_))
					&& !Class376_Sub1.method2273((byte) 87, i_8_, i_7_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ega.O(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method2238(byte i) {
		try {
			anInt4974++;
			aBool4975 = true;
			int i_9_ = 64 / ((i + 39) / 42);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.A(" + i + ')');
		}
	}

	final synchronized boolean method2239(byte i) {
		try {
			anInt4978++;
			if (i > -11)
				return false;
			return anInterface11_4970.method38(aLong4987, 14320);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.D(" + i + ')');
		}
	}

	final int method2240(boolean bool) {
		try {
			if (bool != false)
				return 6;
			anInt4963++;
			return anInt4983;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.J(" + bool + ')');
		}
	}

	final int method2241(int i) {
		try {
			anInt4973++;
			if (i != -1)
				aString4984 = null;
			return anInt4985;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.N(" + i + ')');
		}
	}

	final synchronized void method2242(Interface11 interface11, byte i) {
		try {
			anInt4968++;
			anInterface11_4988 = anInterface11_4970;
			anInterface11_4970 = interface11;
			if (i != -30)
				method2230(false, null, null);
			aLong4987 = Class137.method878((byte) -80);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.I("
					+ (interface11 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method2243(byte i) {
		try {
			anInt4965++;
			if (aClass209_4989 == null)
				return 0;
			int i_10_ = -73 / ((-56 - i) / 47);
			int i_11_ = aClass209_4989.method1341((byte) -110);
			if (((Class209) aClass209_4989).aBool2814
					&& ((anInt4985 ^ 0xffffffff) > (((Class209) aClass209_4989).anInt2818 ^ 0xffffffff)))
				return 1 + anInt4985;
			if ((i_11_ ^ 0xffffffff) > -1
					|| Class19_Sub1.aClass209Array5765.length - 1 <= i_11_)
				return 100;
			if ((anInt4985 ^ 0xffffffff) == (((Class209) aClass209_4989).anInt2813 ^ 0xffffffff))
				return ((Class209) aClass209_4989).anInt2818;
			return ((Class209) aClass209_4989).anInt2813;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.B(" + i + ')');
		}
	}

	final long method2244(int i) {
		try {
			if (i <= 78)
				return -128L;
			anInt4967++;
			return aLong4986;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ega.H(" + i + ')');
		}
	}

	public Class382() {
		/* empty */
	}
}
