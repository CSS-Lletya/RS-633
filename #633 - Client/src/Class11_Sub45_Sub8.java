/* Class11_Sub45_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub8 extends Class11_Sub45 {
	static double aDouble8810;
	static int anInt8811;
	static int anInt8812;
	static String currentPassword = "";
	static int anInt8814 = 500;
	static int anInt8815;
	int anInt8816 = 0;
	static int anInt8817;

	static final void method3453(IComponentDefinitions[] class192s, byte i,
			int i_0_) {
		try {
			anInt8817++;
			int i_1_ = 0;
			if (i != -9)
				currentPassword = null;
			for (/**/; class192s.length > i_1_; i_1_++) {
				IComponentDefinitions class192 = class192s[i_1_];
				if (class192 != null
						&& ((IComponentDefinitions) class192).anInt2593 == i_0_
						&& !client.method4010(class192)) {
					if (((IComponentDefinitions) class192).anInt2531 == 0) {
						method3453(class192s, (byte) -9,
								((IComponentDefinitions) class192).anInt2471);
						if (((IComponentDefinitions) class192).aClass192Array2524 != null)
							method3453(
									(((IComponentDefinitions) class192).aClass192Array2524),
									(byte) -9,
									((IComponentDefinitions) class192).anInt2471);
						Class11_Sub24 class11_sub24 = ((Class11_Sub24) (Class75_Sub2.aClass213_7160
								.method1369(
										(byte) 26,
										(long) ((IComponentDefinitions) class192).anInt2471)));
						if (class11_sub24 != null)
							Class33_Sub1.method2637(
									((Class11_Sub24) class11_sub24).anInt6233,
									-112);
					}
					if (((IComponentDefinitions) class192).anInt2531 == 6
							&& ((((IComponentDefinitions) class192).anInt2491 ^ 0xffffffff) != 0)) {
						Class281 class281 = (Class108_Sub23.aClass198_7760
								.method1284(
										((IComponentDefinitions) class192).anInt2491,
										(byte) -119));
						if (class281 != null) {
							((IComponentDefinitions) class192).anInt2502 += Class104.anInt1398;
							int i_2_ = ((IComponentDefinitions) class192).anInt2539;
							while ((((IComponentDefinitions) class192).anInt2502 ^ 0xffffffff) < ((((Class281) class281).anIntArray3817[((IComponentDefinitions) class192).anInt2539]) ^ 0xffffffff)) {
								((IComponentDefinitions) class192).anInt2502 -= (((Class281) class281).anIntArray3817[((IComponentDefinitions) class192).anInt2539]);
								((IComponentDefinitions) class192).anInt2539++;
								if ((((IComponentDefinitions) class192).anInt2539 ^ 0xffffffff) <= ((((Class281) class281).anIntArray3794).length ^ 0xffffffff)) {
									((IComponentDefinitions) class192).anInt2539 -= ((Class281) class281).anInt3808;
									if ((((IComponentDefinitions) class192).anInt2539 ^ 0xffffffff) > -1
											|| (((IComponentDefinitions) class192).anInt2539 >= (((Class281) class281).anIntArray3794).length))
										((IComponentDefinitions) class192).anInt2539 = 0;
								}
								((IComponentDefinitions) class192).anInt2545 = 1 + ((IComponentDefinitions) class192).anInt2539;
								if (((IComponentDefinitions) class192).anInt2545 >= (((Class281) class281).anIntArray3794).length) {
									((IComponentDefinitions) class192).anInt2545 -= ((Class281) class281).anInt3808;
									if ((((IComponentDefinitions) class192).anInt2545 ^ 0xffffffff) > -1
											|| (((((Class281) class281).anIntArray3794).length ^ 0xffffffff) >= (((IComponentDefinitions) class192).anInt2545 ^ 0xffffffff)))
										((IComponentDefinitions) class192).anInt2545 = -1;
								}
								Class232.method1484(class192, 1);
							}
							if ((i_2_ ^ 0xffffffff) != (((IComponentDefinitions) class192).anInt2539 ^ 0xffffffff))
								Class318.method1936(
										(byte) 115,
										(((IComponentDefinitions) class192).anInt2539),
										class281);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ci.C("
					+ (class192s != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ')'));
		}
	}

	final void method3454(int i, Stream stream) {
		do {
			try {
				for (;;) {
					int i_3_ = stream.readUnsignedByte((byte) 35);
					if (i_3_ == 0)
						break;
					method3455((byte) 63, i_3_, stream);
				}
				anInt8815++;
				if (i == -15650)
					break;
				aDouble8810 = 0.31228642064890216;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ci.B(" + i + ','
						+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method3455(byte i, int i_4_, Stream stream) {
		try {
			if (i == 63) {
				if ((i_4_ ^ 0xffffffff) == -3)
					((Class11_Sub45_Sub8) this).anInt8816 = stream
							.readUnsignedShort((byte) -65);
				anInt8812++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ci.D(" + i + ','
					+ i_4_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3456(byte i) {
		do {
			try {
				currentPassword = null;
				if (i > 34)
					break;
				method3456((byte) -93);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ci.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3457(int i, Class163 class163) {
		do {
			try {
				if (i == 31885) {
					anInt8811++;
					if ((((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047 ^ 0xffffffff) != (Class228.anInt3150 ^ 0xffffffff)
							&& Class181.aClass364ArrayArrayArray2336 != null) {
						if (!Class11_Sub45_Sub16_Sub2
								.method3930(
										class163,
										(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047),
										4))
							break;
						Class228.anInt3150 = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ci.A(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class11_Sub45_Sub8() {
		/* empty */
	}
}
