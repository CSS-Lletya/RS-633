/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class82 implements Runnable {
	static int anInt1124;
	static int anInt1125;
	private Class38 aClass38_1126 = new Class38();
	static int anInt1127;
	static float aFloat1128;
	static int anInt1129;
	static int anInt1130;
	static int anInt1131;
	static int anInt1132;
	static int anInt1133;
	private boolean aBool1134 = false;
	private Thread aThread1135;
	int anInt1136 = 0;

	static final void method566(int i,
			Npc class376_sub7_sub5_sub5_sub2) {
		try {
			anInt1129++;
			if (i <= -106) {
				for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class339.aClass84_4487
						.method584(-12261)); class11_sub19 != null; class11_sub19 = (Class11_Sub19) Class339.aClass84_4487
						.method578(-15361)) {
					if ((((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844) == class376_sub7_sub5_sub5_sub2) {
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830) != null) {
							Class233.aClass11_Sub6_Sub1_3185
									.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
							((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
						}
						class11_sub19.method122(-102);
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("bc.A("
							+ i
							+ ','
							+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}

	final Class11_Sub45_Sub20_Sub1 method567(int i, Class243 class243, int i_0_) {
		try {
			int i_1_ = -52 / ((34 - i_0_) / 39);
			anInt1124++;
			Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1 = new Class11_Sub45_Sub20_Sub1();
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).anInt9950 = 3;
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aClass243_9953 = class243;
			((Class11_Sub45) class11_sub45_sub20_sub1).aLong7904 = (long) i;
			((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9736 = false;
			method570(class11_sub45_sub20_sub1, -3);
			return class11_sub45_sub20_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("bc.E(" + i + ','
							+ (class243 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	final Class11_Sub45_Sub20_Sub1 method568(byte[] is, int i,
			Class243 class243, int i_2_) {
		try {
			anInt1127++;
			Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1 = new Class11_Sub45_Sub20_Sub1();
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956 = is;
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aClass243_9953 = class243;
			((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9736 = false;
			((Class11_Sub45) class11_sub45_sub20_sub1).aLong7904 = (long) i_2_;
			if (i != 29288)
				return null;
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).anInt9950 = 2;
			method570(class11_sub45_sub20_sub1, -3);
			return class11_sub45_sub20_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("bc.F("
							+ (is != null ? "{...}" : "null") + ',' + i + ','
							+ (class243 != null ? "{...}" : "null") + ','
							+ i_2_ + ')'));
		}
	}

	final void method569(int i) {
		try {
			anInt1130++;
			aBool1134 = true;
			synchronized (aClass38_1126) {
				aClass38_1126.notifyAll();
				if (i != -3)
					method569(-113);
			}
			try {
				aThread1135.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			aThread1135 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bc.D(" + i + ')');
		}
	}

	public final void run() {
		try {
			anInt1132++;
			while (!aBool1134) {
				Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1;
				synchronized (aClass38_1126) {
					class11_sub45_sub20_sub1 = ((Class11_Sub45_Sub20_Sub1) aClass38_1126
							.method328(0));
					if (class11_sub45_sub20_sub1 != null)
						((Class82) this).anInt1136--;
					else {
						try {
							aClass38_1126.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					if (((((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).anInt9950) ^ 0xffffffff) == -3)
						((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aClass243_9953
								.method1533(
										(int) (((Class11_Sub45) class11_sub45_sub20_sub1).aLong7904),
										((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956.length,
										0,
										((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956);
					else if (((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).anInt9950 == 3)
						((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956 = (((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aClass243_9953
								.method1534(
										255,
										(int) ((Class11_Sub45) class11_sub45_sub20_sub1).aLong7904));
				} catch (Exception exception) {
					Class11_Sub12_Sub3.method3602((byte) -69, null, exception);
				}
				((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9737 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bc.run(" + ')');
		}
	}

	private final void method570(
			Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1, int i) {
		try {
			if (i == -3) {
				anInt1125++;
				synchronized (aClass38_1126) {
					aClass38_1126.method330(class11_sub45_sub20_sub1, 21934);
					((Class82) this).anInt1136++;
					aClass38_1126.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bc.C("
					+ (class11_sub45_sub20_sub1 != null ? "{...}" : "null")
					+ ',' + i + ')'));
		}
	}

	final Class11_Sub45_Sub20_Sub1 method571(int i, int i_3_, Class243 class243) {
		try {
			anInt1131++;
			Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1 = new Class11_Sub45_Sub20_Sub1();
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).anInt9950 = 1;
			synchronized (aClass38_1126) {
				for (Class11_Sub45_Sub20_Sub1 class11_sub45_sub20_sub1_4_ = ((Class11_Sub45_Sub20_Sub1) aClass38_1126
						.method331((byte) -7)); class11_sub45_sub20_sub1_4_ != null; class11_sub45_sub20_sub1_4_ = ((Class11_Sub45_Sub20_Sub1) aClass38_1126
						.method333(-62))) {
					if ((((long) i_3_ ^ 0xffffffffffffffffL) == ((((Class11_Sub45) class11_sub45_sub20_sub1_4_).aLong7904) ^ 0xffffffffffffffffL))
							&& (((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1_4_).aClass243_9953 == class243)
							&& ((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1_4_).anInt9950 == 2) {
						((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9737 = false;
						((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956 = ((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1_4_).aByteArray9956;
						return class11_sub45_sub20_sub1;
					}
				}
			}
			((Class11_Sub45_Sub20_Sub1) class11_sub45_sub20_sub1).aByteArray9956 = class243
					.method1534(255, i_3_);
			((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9736 = true;
			if (i != -10970)
				method568(null, -101, null, 124);
			((Class11_Sub45_Sub20) class11_sub45_sub20_sub1).aBool9737 = false;
			return class11_sub45_sub20_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("bc.B(" + i + ',' + i_3_ + ','
									+ (class243 != null ? "{...}" : "null") + ')'));
		}
	}

	Class82(Class341 class341) {
		try {
			Class368 class368 = class341.method2063(2, this, 5);
			while (class368.anInt4837 == 0)
				Class11_Sub51.method3236(10L, 0);
			if ((class368.anInt4837 ^ 0xffffffff) == -3)
				throw new RuntimeException();
			aThread1135 = (Thread) class368.anObject4838;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bc.<init>("
					+ (class341 != null ? "{...}" : "null") + ')'));
		}
	}
}
