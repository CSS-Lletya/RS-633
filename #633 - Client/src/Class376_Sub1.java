/* Class376_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class376_Sub1 extends Class376 {
	Class376_Sub1 aClass376_Sub1_5092;
	static IncomingPacket aClass160_5093 = new IncomingPacket(44, 0);
	static int anInt5094;
	Class376_Sub1 aClass376_Sub1_5095;
	static int anInt5096;
	static int anInt5097;
	static boolean aBool5098 = false;
	static int anInt5099;
	static int anInt5100;
	static Class83 aClass83_5101 = new Class83(7, 7);
	static int anInt5102;
	static Class153 aClass153_5103 = new Class153(2);

	static final byte[] method2272(Object object, int i, int i_0_, int i_1_) {
		try {
			anInt5100++;
			if (i_0_ != 0)
				aClass160_5093 = null;
			if (object == null)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				return Class11_Sub39.method2930(i_1_, 255, i, is);
			}
			if (object instanceof Class61) {
				Class61 class61 = (Class61) object;
				return class61.method469(i_1_, true, i);
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rda.F("
					+ (object != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final boolean method2273(byte i, int i_2_, int i_3_) {
		try {
			anInt5096++;
			if (i <= 71)
				return false;
			return ((Class11_Sub36.method2884(33, i_2_, i_3_)
					| Class11_Sub45_Sub9_Sub2.method3951((byte) 77, i_3_, i_2_) | Class11_Sub45_Sub1_Sub1
						.method3862(i_3_, (byte) -87, i_2_)) & Class11_Sub45_Sub17
					.method3748(i_3_, i_2_, (byte) 120));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rda.E(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method2274(byte i) {
		try {
			anInt5099++;
			if (((Class376_Sub1) this).aClass376_Sub1_5092 != null) {
				int i_4_ = 39 % ((i - 25) / 55);
				((Class376_Sub1) ((Class376_Sub1) this).aClass376_Sub1_5092).aClass376_Sub1_5095 = ((Class376_Sub1) this).aClass376_Sub1_5095;
				((Class376_Sub1) ((Class376_Sub1) this).aClass376_Sub1_5095).aClass376_Sub1_5092 = ((Class376_Sub1) this).aClass376_Sub1_5092;
				((Class376_Sub1) this).aClass376_Sub1_5092 = null;
				((Class376_Sub1) this).aClass376_Sub1_5095 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rda.A(" + i + ')');
		}
	}

	static final void method2275(int i) {
		try {
			if (i != 5)
				method2277(null, 57, (byte) 37, 78, false);
			if (Class81.anInt1093 >= 0) {
				long l = Class137.method878((byte) -69);
				Class81.anInt1093 -= -Class251.aLong3460 + l;
				if (Class81.anInt1093 > 0) {
					int i_5_ = ((Class81.anInt1093 << 8) / Class376_Sub7_Sub2.anInt9238);
					int i_6_ = -i_5_ + 255;
					float f = (float) i_5_ / 255.0F;
					float f_7_ = 1.0F - f;
					Class206_Sub3.anInt6833 = ((0xff0000 & (i_6_
							* ((((Class104) Class191.aClass104_2455).anInt1401) & 0xff00) + i_5_
							* (0xff00 & Class11_Sub6_Sub3.anInt9141))) + (((((Class104) Class191.aClass104_2455).anInt1401 & 0xff00ff)
							* i_6_ + ((0xff00ff & Class11_Sub6_Sub3.anInt9141) * i_5_)) & ~0xff00ff)) >>> 8;
					Class221.aFloat3037 = ((-Class161.aFloat2099 + ((Class104) Class191.aClass104_2455).aFloat1404) * f_7_)
							+ Class161.aFloat2099;
					Class245.aFloat3318 = (Class286.aFloat3875 + f_7_
							* (-Class286.aFloat3875 + (((Class104) Class191.aClass104_2455).aFloat1393)));
					Class57.aFloat862 = f_7_
							* (-Class236_Sub6.aFloat6963 + (((Class104) Class191.aClass104_2455).aFloat1392))
							+ Class236_Sub6.aFloat6963;
					Class11_Sub20_Sub2.aFloat9496 = (((Class104) Class191.aClass104_2455).aFloat1397 - Class93.aFloat1250)
							* f_7_ + Class93.aFloat1250;
					Class346.anInt4588 = ((~0xff00ff & ((0xff00ff & Class108_Sub12.anInt6225)
							* i_5_ - -(i_6_ * ((((Class104) Class191.aClass104_2455).anInt1403) & 0xff00ff)))) + (((((Class104) Class191.aClass104_2455).anInt1403 & 0xff00)
							* i_6_ + i_5_ * (Class108_Sub12.anInt6225 & 0xff00)) & 0xff0000)) >>> 8;
					Class11_Sub31.aFloat6705 = (Class334.aFloat4421 + f_7_
							* (-Class334.aFloat4421 + (((Class104) Class191.aClass104_2455).aFloat1387)));
					Class119.anInt1617 = (Class23.anInt250 * i_5_ + (((Class104) Class191.aClass104_2455).anInt1396 * i_6_)) >> 8;
					Class11_Sub2_Sub29.aFloat9469 = ((-Class182.aFloat2343 + ((Class104) Class191.aClass104_2455).aFloat1385) * f_7_)
							+ Class182.aFloat2343;
					if (Class259.aClass234_3572 != ((Class104) Class191.aClass104_2455).aClass234_1386)
						Class372.aClass234_4876 = (Class11_Sub31.aClass163_6702
								.method1057(
										Class259.aClass234_3572,
										(((Class104) Class191.aClass104_2455).aClass234_1386),
										f_7_, Class372.aClass234_4876));
				} else {
					Class81.anInt1093 = -1;
					Class206_Sub3.anInt6833 = ((Class104) Class191.aClass104_2455).anInt1401;
					Class57.aFloat862 = ((Class104) Class191.aClass104_2455).aFloat1392;
					Class119.anInt1617 = ((Class104) Class191.aClass104_2455).anInt1396;
					Class11_Sub31.aFloat6705 = ((Class104) Class191.aClass104_2455).aFloat1387;
					Class11_Sub2_Sub29.aFloat9469 = ((Class104) Class191.aClass104_2455).aFloat1385;
					Class346.anInt4588 = ((Class104) Class191.aClass104_2455).anInt1403;
					Class245.aFloat3318 = ((Class104) Class191.aClass104_2455).aFloat1393;
					Class221.aFloat3037 = ((Class104) Class191.aClass104_2455).aFloat1404;
					Class11_Sub20_Sub2.aFloat9496 = ((Class104) Class191.aClass104_2455).aFloat1397;
					Class372.aClass234_4876 = ((Class104) Class191.aClass104_2455).aClass234_1386;
				}
				Class251.aLong3460 = l;
			}
			anInt5102++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rda.C(" + i + ')');
		}
	}

	static final void method2276(int i) {
		try {
			anInt5097++;
			if (i != 16711680)
				aClass160_5093 = null;
			Class219_Sub1.aBool7241 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rda.D(" + i + ')');
		}
	}

	static final void method2277(IComponentDefinitions class192, int i,
			byte i_8_, int i_9_, boolean bool) {
		do {
			try {
				anInt5094++;
				int i_10_ = ((IComponentDefinitions) class192).anInt2610;
				if ((((IComponentDefinitions) class192).aByte2465 ^ 0xffffffff) == -1)
					((IComponentDefinitions) class192).anInt2610 = ((IComponentDefinitions) class192).anInt2613;
				else if (((IComponentDefinitions) class192).aByte2465 != 1) {
					if ((((IComponentDefinitions) class192).aByte2465 ^ 0xffffffff) == -3)
						((IComponentDefinitions) class192).anInt2610 = i_9_
								* ((IComponentDefinitions) class192).anInt2613 >> 14;
				} else
					((IComponentDefinitions) class192).anInt2610 = i_9_
							+ -((IComponentDefinitions) class192).anInt2613;
				int i_11_ = ((IComponentDefinitions) class192).anInt2546;
				if (((IComponentDefinitions) class192).aByte2521 == 0)
					((IComponentDefinitions) class192).anInt2546 = ((IComponentDefinitions) class192).anInt2498;
				else if (((IComponentDefinitions) class192).aByte2521 != 1) {
					if (((IComponentDefinitions) class192).aByte2521 == 2)
						((IComponentDefinitions) class192).anInt2546 = ((IComponentDefinitions) class192).anInt2498
								* i >> 14;
				} else
					((IComponentDefinitions) class192).anInt2546 = -((IComponentDefinitions) class192).anInt2498
							+ i;
				if (((IComponentDefinitions) class192).aByte2465 == 4)
					((IComponentDefinitions) class192).anInt2610 = (((IComponentDefinitions) class192).anInt2602
							* ((IComponentDefinitions) class192).anInt2546 / ((IComponentDefinitions) class192).anInt2497);
				if ((((IComponentDefinitions) class192).aByte2521 ^ 0xffffffff) == -5)
					((IComponentDefinitions) class192).anInt2546 = (((IComponentDefinitions) class192).anInt2497
							* ((IComponentDefinitions) class192).anInt2610 / ((IComponentDefinitions) class192).anInt2602);
				int i_12_ = -56 / ((i_8_ - 53) / 50);
				if (Class11_Sub2_Sub14.aBool9010
						&& ((((InterfaceSettings) client.method4013(class192)).anInt5349 ^ 0xffffffff) != -1 || ((((IComponentDefinitions) class192).anInt2531 ^ 0xffffffff) == -1))) {
					if (((IComponentDefinitions) class192).anInt2546 < 5
							&& ((((IComponentDefinitions) class192).anInt2610 ^ 0xffffffff) > -6)) {
						((IComponentDefinitions) class192).anInt2610 = 5;
						((IComponentDefinitions) class192).anInt2546 = 5;
					} else {
						if (((IComponentDefinitions) class192).anInt2546 <= 0)
							((IComponentDefinitions) class192).anInt2546 = 5;
						if ((((IComponentDefinitions) class192).anInt2610 ^ 0xffffffff) >= -1)
							((IComponentDefinitions) class192).anInt2610 = 5;
					}
				}
				if (((IComponentDefinitions) class192).anInt2536 == Class78.anInt1056)
					Class321_Sub4.aClass192_8010 = class192;
				if (!bool
						|| ((IComponentDefinitions) class192).anObjectArray2553 == null)
					break;
				if (((IComponentDefinitions) class192).anInt2610 != i_10_
						|| ((IComponentDefinitions) class192).anInt2546 != i_11_) {
					Class11_Sub48 class11_sub48 = new Class11_Sub48();
					((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2553;
					((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
					Class180.aClass84_2332.method589((byte) -13, class11_sub48);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rda.G("
						+ (class192 != null ? "{...}" : "null") + ',' + i + ','
						+ i_8_ + ',' + i_9_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public Class376_Sub1() {
		/* empty */
	}

	public static void method2278(byte i) {
		try {
			aClass83_5101 = null;
			aClass153_5103 = null;
			int i_13_ = 47 / ((55 - i) / 62);
			aClass160_5093 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rda.B(" + i + ')');
		}
	}
}
