/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class310 {
	static int anInt4146;
	static int[] anIntArray4147 = new int[32];
	static int anInt4148;

	static final void method1894(int i, int i_0_, int i_1_, Class72 class72,
			Class253 class253, int i_2_, int i_3_,
			IComponentDefinitions class192) {
		try {
			anInt4146++;
			if (class253 != null) {
				if (i >= -109)
					anIntArray4147 = null;
				int i_4_;
				if ((Class191.anInt2453 ^ 0xffffffff) != -5)
					i_4_ = 0x3fff & ((int) Class2_Sub8.aFloat6868 + Class328.anInt4371);
				else
					i_4_ = 0x3fff & (int) Class2_Sub8.aFloat6868;
				int i_5_ = 10 + Math.max(
						((IComponentDefinitions) class192).anInt2610 / 2,
						((IComponentDefinitions) class192).anInt2546 / 2);
				int i_6_ = i_2_ * i_2_ + i_1_ * i_1_;
				if ((i_6_ ^ 0xffffffff) >= (i_5_ * i_5_ ^ 0xffffffff)) {
					int i_7_ = Class335.anIntArray4436[i_4_];
					int i_8_ = Class335.anIntArray4430[i_4_];
					if (Class191.anInt2453 != 4) {
						i_8_ = i_8_ * 256
								/ (256 + Class11_Sub45_Sub1.anInt8493);
						i_7_ = i_7_ * 256
								/ (Class11_Sub45_Sub1.anInt8493 + 256);
					}
					int i_9_ = i_2_ * i_7_ - -(i_8_ * i_1_) >> 14;
					int i_10_ = i_8_ * i_2_ - i_7_ * i_1_ >> 14;
					class253.method1612(
							i_3_
									- (-(((IComponentDefinitions) class192).anInt2610 / 2) - (i_9_ + -(class253
											.method1608() / 2))),
							(i_0_
									+ ((IComponentDefinitions) class192).anInt2546
									/ 2 - (i_10_ - -(class253.method1622() / 2))),
							class72, i_3_, i_0_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("sd.A(" + i + ',' + i_0_
							+ ',' + i_1_ + ','
							+ (class72 != null ? "{...}" : "null") + ','
							+ (class253 != null ? "{...}" : "null") + ','
							+ i_2_ + ',' + i_3_ + ','
							+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1895(int i) {
		do {
			try {
				anIntArray4147 = null;
				if (i == 2)
					break;
				method1894(8, 48, 58, null, null, -61, 89, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sd.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
