/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	static int anInt177;
	static int anInt178;
	static int anInt179;
	static int anInt180;
	static int anInt181;
	static int anInt182;
	static int anInt183;
	static int anInt184;
	private Class213 aClass213_185;
	static int anInt186;
	static int anInt187;
	static int anInt188;
	static int anInt189;
	static IncomingPacket aClass160_190 = new IncomingPacket(88, 20);
	private int anInt191;
	static int anInt192;
	static int anInt193;
	private Class38 aClass38_194 = new Class38();
	private int anInt195;

	private final void method180(int i, Class11_Sub45_Sub9 class11_sub45_sub9) {
		try {
			if (class11_sub45_sub9 != null) {
				class11_sub45_sub9.method122(-60);
				class11_sub45_sub9.method3187(100);
				anInt191 += ((Class11_Sub45_Sub9) class11_sub45_sub9).anInt8877;
			}
			int i_0_ = 56 / ((i + 44) / 48);
			anInt192++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pca.C(" + i + ','
					+ (class11_sub45_sub9 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method181(int i, long l) {
		try {
			anInt183++;
			Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass213_185
					.method1369((byte) 26, l);
			if (i != 88)
				method184((byte) -96, null, -96L);
			method180(100, class11_sub45_sub9);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.F(" + i + ',' + l
					+ ')');
		}
	}

	Class22(int i) {
		this(i, i);
	}

	final void method182(int i, byte i_1_) {
		do {
			try {
				anInt180++;
				if (Class11_Sub12_Sub3.aClass62_9217 != null) {
					for (Class11_Sub45_Sub9 class11_sub45_sub9 = ((Class11_Sub45_Sub9) aClass38_194
							.method331((byte) -7)); class11_sub45_sub9 != null; class11_sub45_sub9 = ((Class11_Sub45_Sub9) aClass38_194
							.method333(-69))) {
						if (class11_sub45_sub9.method3485((byte) 111)) {
							if (class11_sub45_sub9.method3483(106) == null) {
								class11_sub45_sub9.method122(-124);
								class11_sub45_sub9.method3187(100);
								anInt191 += ((Class11_Sub45_Sub9) class11_sub45_sub9).anInt8877;
							}
						} else if ((long) i < ++((Class11_Sub45) class11_sub45_sub9).aLong7904) {
							Class11_Sub45_Sub9 class11_sub45_sub9_2_ = (Class11_Sub12_Sub3.aClass62_9217
									.method474(i_1_ ^ ~0x4a, class11_sub45_sub9));
							aClass213_185.method1368(
									(((Class11) class11_sub45_sub9).aLong91),
									class11_sub45_sub9_2_, (byte) -26);
							Class321_Sub1.method2738(class11_sub45_sub9_2_,
									i_1_ ^ ~0x67d, class11_sub45_sub9);
							class11_sub45_sub9.method122(-50);
							class11_sub45_sub9.method3187(i_1_ + 173);
						}
					}
				}
				if (i_1_ == -73)
					break;
				anInt191 = 30;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pca.E(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	public static void method183(int i) {
		do {
			try {
				aClass160_190 = null;
				if (i == 27927)
					break;
				method183(9);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pca.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method184(byte i, Object object, long l) {
		do {
			try {
				method194(1, l, object, 1);
				anInt181++;
				if (i >= 123)
					break;
				anInt191 = 98;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pca.D(" + i + ','
						+ (object != null ? "{...}" : "null") + ',' + l + ')'));
			}
			break;
		} while (false);
	}

	static final int method185(boolean bool) {
		try {
			if (bool != true)
				aClass160_190 = null;
			anInt188++;
			return Class108_Sub21.anInt7311;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.O(" + bool + ')');
		}
	}

	final Object method186(byte i) {
		try {
			anInt193++;
			if (i > -39)
				method186((byte) -71);
			Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass213_185
					.method1365(24490);
			while (class11_sub45_sub9 != null) {
				Object object = class11_sub45_sub9.method3483(102);
				if (object == null) {
					Class11_Sub45_Sub9 class11_sub45_sub9_3_ = class11_sub45_sub9;
					class11_sub45_sub9 = ((Class11_Sub45_Sub9) aClass213_185
							.method1367((byte) 71));
					class11_sub45_sub9_3_.method122(-90);
					class11_sub45_sub9_3_.method3187(100);
					anInt191 += (((Class11_Sub45_Sub9) class11_sub45_sub9_3_).anInt8877);
				} else
					return object;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.L(" + i + ')');
		}
	}

	final Object method187(boolean bool) {
		try {
			if (bool != true)
				anInt195 = -125;
			anInt182++;
			Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass213_185
					.method1367((byte) 71);
			while (class11_sub45_sub9 != null) {
				Object object = class11_sub45_sub9.method3483(67);
				if (object != null)
					return object;
				Class11_Sub45_Sub9 class11_sub45_sub9_4_ = class11_sub45_sub9;
				class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass213_185
						.method1367((byte) 71);
				class11_sub45_sub9_4_.method122(-108);
				class11_sub45_sub9_4_.method3187(100);
				anInt191 += ((Class11_Sub45_Sub9) class11_sub45_sub9_4_).anInt8877;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.M(" + bool + ')');
		}
	}

	final Object method188(long l, byte i) {
		try {
			anInt179++;
			int i_5_ = 7 % ((15 - i) / 58);
			Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass213_185
					.method1369((byte) 26, l);
			if (class11_sub45_sub9 == null)
				return null;
			Object object = class11_sub45_sub9.method3483(83);
			if (object == null) {
				class11_sub45_sub9.method122(-94);
				class11_sub45_sub9.method3187(100);
				anInt191 += ((Class11_Sub45_Sub9) class11_sub45_sub9).anInt8877;
				return null;
			}
			if (!class11_sub45_sub9.method3485((byte) 125)) {
				aClass38_194.method330(class11_sub45_sub9, 21934);
				((Class11_Sub45) class11_sub45_sub9).aLong7904 = 0L;
			} else {
				Class11_Sub45_Sub9_Sub2 class11_sub45_sub9_sub2 = new Class11_Sub45_Sub9_Sub2(
						object,
						(((Class11_Sub45_Sub9) class11_sub45_sub9).anInt8877));
				aClass213_185.method1368(
						(((Class11) class11_sub45_sub9).aLong91),
						class11_sub45_sub9_sub2, (byte) -26);
				aClass38_194.method330(class11_sub45_sub9_sub2, 21934);
				((Class11_Sub45) class11_sub45_sub9_sub2).aLong7904 = 0L;
				class11_sub45_sub9.method122(-106);
				class11_sub45_sub9.method3187(100);
			}
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.J(" + l + ',' + i
					+ ')');
		}
	}

	final void method189(byte i) {
		try {
			aClass38_194.method334(3);
			anInt187++;
			aClass213_185.method1364((byte) 106);
			anInt191 = anInt195;
			int i_6_ = 77 / ((-80 - i) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.I(" + i + ')');
		}
	}

	final void method190(int i) {
		do {
			try {
				for (Class11_Sub45_Sub9 class11_sub45_sub9 = ((Class11_Sub45_Sub9) aClass38_194
						.method331((byte) -7)); class11_sub45_sub9 != null; class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass38_194
						.method333(-121)) {
					if (class11_sub45_sub9.method3485((byte) 110)) {
						class11_sub45_sub9.method122(i ^ ~0x4e);
						class11_sub45_sub9.method3187(100);
						anInt191 += (((Class11_Sub45_Sub9) class11_sub45_sub9).anInt8877);
					}
				}
				anInt189++;
				if (i == 0)
					break;
				method193(-70);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pca.K(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method191(int i) {
		try {
			anInt178++;
			int i_7_ = -122 % ((i + 34) / 59);
			return anInt191;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.N(" + i + ')');
		}
	}

	final int method192(int i) {
		try {
			anInt186++;
			int i_8_ = 0;
			if (i != 1)
				anInt191 = 72;
			for (Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass38_194
					.method331((byte) -7); class11_sub45_sub9 != null; class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass38_194
					.method333(-116)) {
				if (!class11_sub45_sub9.method3485((byte) 112))
					i_8_++;
			}
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.H(" + i + ')');
		}
	}

	final int method193(int i) {
		try {
			anInt184++;
			if (i != 0)
				method184((byte) -86, null, 43L);
			return anInt195;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.G(" + i + ')');
		}
	}

	final void method194(int i, long l, Object object, int i_9_) {
		try {
			anInt177++;
			if ((i ^ 0xffffffff) < (anInt195 ^ 0xffffffff))
				throw new IllegalStateException("s>cs");
			method181(i_9_ + 87, l);
			anInt191 -= i;
			while (anInt191 < 0) {
				Class11_Sub45_Sub9 class11_sub45_sub9 = (Class11_Sub45_Sub9) aClass38_194
						.method328(i_9_ ^ 0x1);
				method180(-96, class11_sub45_sub9);
			}
			Class11_Sub45_Sub9_Sub2 class11_sub45_sub9_sub2 = new Class11_Sub45_Sub9_Sub2(
					object, i);
			if (i_9_ != 1)
				method186((byte) 57);
			aClass213_185.method1368(l, class11_sub45_sub9_sub2, (byte) -26);
			aClass38_194.method330(class11_sub45_sub9_sub2, 21934);
			((Class11_Sub45) class11_sub45_sub9_sub2).aLong7904 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception,
							("pca.B(" + i + ',' + l + ','
									+ (object != null ? "{...}" : "null") + ','
									+ i_9_ + ')'));
		}
	}

	Class22(int i, int i_10_) {
		try {
			anInt191 = i;
			anInt195 = i;
			int i_11_;
			for (i_11_ = 1; ((i ^ 0xffffffff) < (i_11_ + i_11_ ^ 0xffffffff) && (i_11_ ^ 0xffffffff) > (i_10_ ^ 0xffffffff)); i_11_ += i_11_) {
				/* empty */
			}
			aClass213_185 = new Class213(i_11_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pca.<init>(" + i + ','
					+ i_10_ + ')');
		}
	}
}
