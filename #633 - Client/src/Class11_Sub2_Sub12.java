/* Class11_Sub2_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub12 extends Class11_Sub2 {
	static int anInt8864;
	private int[] anIntArray8865;
	private int anInt8866 = 2048;
	static int anInt8867;
	private int anInt8868;
	private int anInt8869 = 10;
	static int anInt8870;
	private int[] anIntArray8871;
	static int anInt8872;
	static Class131[] aClass131Array8873 = new Class131[5];
	static Class281[] aClass281Array8874;

	public Class11_Sub2_Sub12() {
		super(0, true);
		anInt8868 = 0;
	}

	final void method2256(int i) {
		try {
			if (i != 7)
				method3480(-53);
			anInt8864++;
			method3481(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dt.D(" + i + ')');
		}
	}

	public static void method3480(int i) {
		do {
			try {
				aClass281Array8874 = null;
				aClass131Array8873 = null;
				if (i == 0)
					break;
				method3480(95);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dt.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8867++;
			if (bool != true)
				method2256(-84);
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_0_ = Class171.anIntArray2199[i];
				if (anInt8868 == 0) {
					int i_1_ = 0;
					for (int i_2_ = 0; i_2_ < anInt8869; i_2_++) {
						if (anIntArray8871[i_2_] <= i_0_
								&& i_0_ < anIntArray8871[i_2_ + 1]) {
							if (anIntArray8865[i_2_] > i_0_)
								i_1_ = 4096;
							break;
						}
					}
					Class311.method1899(is, 0, Class33_Sub2.anInt6696, i_1_);
				} else {
					for (int i_3_ = 0; i_3_ < Class33_Sub2.anInt6696; i_3_++) {
						int i_4_ = 0;
						int i_5_ = 0;
						int i_6_ = Class208.anIntArray2808[i_3_];
						int i_7_ = anInt8868;
						while_115_: do {
							do {
								if ((i_7_ ^ 0xffffffff) != -2) {
									if (i_7_ != 2) {
										if (i_7_ == 3)
											break;
										break while_115_;
									}
								} else {
									i_4_ = i_6_;
									break while_115_;
								}
								i_4_ = 2048 - -(i_6_ + (i_0_ - 4096) >> 1);
								break while_115_;
							} while (false);
							i_4_ = (i_6_ - i_0_ >> 1) + 2048;
						} while (false);
						for (i_7_ = 0; anInt8869 > i_7_; i_7_++) {
							if (anIntArray8871[i_7_] <= i_4_
									&& ((i_4_ ^ 0xffffffff) > (anIntArray8871[i_7_ + 1] ^ 0xffffffff))) {
								if ((i_4_ ^ 0xffffffff) > (anIntArray8865[i_7_] ^ 0xffffffff))
									i_5_ = 4096;
								break;
							}
						}
						is[i_3_] = i_5_;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dt.A(" + i + ','
					+ bool + ')');
		}
	}

	private final void method3481(boolean bool) {
		try {
			anInt8870++;
			anIntArray8865 = new int[1 + anInt8869];
			int i = 0;
			anIntArray8871 = new int[1 + anInt8869];
			int i_8_ = 4096 / anInt8869;
			int i_9_ = i_8_ * anInt8866 >> 12;
			if (bool != false)
				anIntArray8871 = null;
			for (int i_10_ = 0; anInt8869 > i_10_; i_10_++) {
				anIntArray8871[i_10_] = i;
				anIntArray8865[i_10_] = i + i_9_;
				i += i_8_;
			}
			anIntArray8871[anInt8869] = 4096;
			anIntArray8865[anInt8869] = 4096 + anIntArray8865[0];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dt.C(" + bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_11_) {
		try {
			if (i != 3731)
				anInt8869 = 19;
			int i_12_ = i_11_;
			while_116_: do {
				do {
					if ((i_12_ ^ 0xffffffff) != -1) {
						if (i_12_ != 1) {
							if ((i_12_ ^ 0xffffffff) == -3)
								break;
							break while_116_;
						}
					} else {
						anInt8869 = stream.readUnsignedByte((byte) 35);
						break while_116_;
					}
					anInt8866 = stream.readUnsignedShort((byte) -65);
					break while_116_;
				} while (false);
				anInt8868 = stream.readUnsignedByte((byte) 35);
			} while (false);
			anInt8872++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dt.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_11_ + ')'));
		}
	}

	static {
		for (int i = 0; aClass131Array8873.length > i; i++)
			aClass131Array8873[i] = new Class131();
		aClass281Array8874 = new Class281[14];
	}
}
