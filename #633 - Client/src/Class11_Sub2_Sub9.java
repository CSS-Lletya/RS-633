/* Class11_Sub2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub9 extends Class11_Sub2 {
	static int anInt8835;
	private int anInt8836;
	static int anInt8837;
	private int anInt8838;
	private int anInt8839;
	private int anInt8840 = 1365;
	static int[] anIntArray8841 = { 16776960, 16711680, 65280, 65535, 16711935,
			16777215 };

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8835++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_0_++) {
					int i_1_ = anInt8836
							+ (Class208.anIntArray2808[i_0_] << 12) / anInt8840;
					int i_2_ = ((Class171.anIntArray2199[i] << 12) / anInt8840 - -anInt8838);
					int i_3_ = i_1_;
					int i_4_ = i_2_;
					int i_5_ = i_1_;
					int i_6_ = i_2_;
					int i_7_ = i_1_ * i_1_ >> 12;
					int i_8_ = i_2_ * i_2_ >> 12;
					int i_9_;
					for (i_9_ = 0; ((i_8_ + i_7_ ^ 0xffffffff) > -16385 && (anInt8839 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)); i_7_ = i_5_
							* i_5_ >> 12) {
						i_6_ = (i_6_ * i_5_ >> 12) * 2 + i_4_;
						i_5_ = i_3_ + (-i_8_ + i_7_);
						i_8_ = i_6_ * i_6_ >> 12;
						i_9_++;
					}
					is[i_0_] = -1 + anInt8839 > i_9_ ? (i_9_ << 12) / anInt8839
							: 0;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sfa.A(" + i + ','
					+ bool + ')');
		}
	}

	public Class11_Sub2_Sub9() {
		super(0, true);
		anInt8836 = 0;
		anInt8838 = 0;
		anInt8839 = 20;
	}

	public static void method3470(byte i) {
		do {
			try {
				anIntArray8841 = null;
				if (i > 36)
					break;
				method3471(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sfa.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3471(boolean bool) {
		if (bool) {
			Class181.aClass364ArrayArrayArray2336 = Class108_Sub6.aClass364ArrayArrayArray5627;
			Class315.aClass12Array4179 = Class234_Sub1_Sub1.aClass12Array9729;
		} else {
			Class181.aClass364ArrayArrayArray2336 = Class220_Sub1.aClass364ArrayArrayArray7155;
			Class315.aClass12Array4179 = Class11_Sub2_Sub38.aClass12Array9796;
		}
		Class155.anInt2044 = Class181.aClass364ArrayArrayArray2336.length;
	}

	final void method2263(int i, Stream stream, int i_10_) {
		try {
			if (i == 3731) {
				int i_11_ = i_10_;
				while_114_: do {
					while_113_: do {
						do {
							if ((i_11_ ^ 0xffffffff) != -1) {
								if ((i_11_ ^ 0xffffffff) != -2) {
									if (i_11_ != 2) {
										if (i_11_ != 3)
											break while_114_;
									} else
										break;
									break while_113_;
								}
							} else {
								anInt8840 = stream
										.readUnsignedShort((byte) -65);
								break while_114_;
							}
							anInt8839 = stream.readUnsignedShort((byte) -65);
							break while_114_;
						} while (false);
						anInt8836 = stream.readUnsignedShort((byte) -65);
						break while_114_;
					} while (false);
					anInt8838 = stream.readUnsignedShort((byte) -65);
				} while (false);
				anInt8837++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sfa.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_10_ + ')'));
		}
	}
}
