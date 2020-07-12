/* Class11_Sub2_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub17 extends Class11_Sub2 {
	static int anInt9044;
	private boolean aBool9045;
	static boolean aBool9046;
	private boolean aBool9047 = true;
	static int anInt9048;
	static int[] anIntArray9049 = new int[1000];
	static int anInt9050;
	static boolean aBool9051;

	final int[][] method2255(int i, int i_0_) {
		try {
			anInt9048++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(i_0_
					^ i_0_, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_1_ = this.method2262(
						aBool9045 ? (Class11_Sub45_Sub16_Sub2.anInt10167) - i
								: i, i_0_ ^ 0x7e, 0);
				int[] is_2_ = is_1_[0];
				int[] is_3_ = is_1_[1];
				int[] is_4_ = is_1_[2];
				int[] is_5_ = is[0];
				int[] is_6_ = is[1];
				int[] is_7_ = is[2];
				if (aBool9047) {
					for (int i_8_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++) {
						is_5_[i_8_] = is_2_[Class297.anInt4024 - i_8_];
						is_6_[i_8_] = is_3_[Class297.anInt4024 + -i_8_];
						is_7_[i_8_] = is_4_[Class297.anInt4024 - i_8_];
					}
				} else {
					for (int i_9_ = 0; ((i_9_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_9_++) {
						is_5_[i_9_] = is_2_[i_9_];
						is_6_[i_9_] = is_3_[i_9_];
						is_7_[i_9_] = is_4_[i_9_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "he.I(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9044++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_10_ = this.method2260(4463, 0, (!aBool9045 ? i : -i
						+ (Class11_Sub45_Sub16_Sub2.anInt10167)));
				if (!aBool9047)
					Class311.method1896(is_10_, 0, is, 0,
							Class33_Sub2.anInt6696);
				else {
					for (int i_11_ = 0; Class33_Sub2.anInt6696 > i_11_; i_11_++)
						is[i_11_] = is_10_[Class297.anInt4024 + -i_11_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "he.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_12_) {
		while_189_: do {
			try {
				if (i != 3731)
					aBool9051 = true;
				anInt9050++;
				int i_13_ = i_12_;
				while_188_: do {
					do {
						if ((i_13_ ^ 0xffffffff) != -1) {
							if ((i_13_ ^ 0xffffffff) == -2)
								break;
							if ((i_13_ ^ 0xffffffff) != -3)
								break while_189_;
							if (!client.aBool10531)
								break while_188_;
						}
						aBool9047 = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
						return;
					} while (false);
					aBool9045 = stream.readUnsignedByte((byte) 35) == 1;
					return;
				} while (false);
				((Class11_Sub2) this).aBool5044 = (stream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("he.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_12_ + ')'));
			}
		} while (false);
	}

	public static void method3552(byte i) {
		try {
			int i_14_ = 1 / ((16 - i) / 62);
			anIntArray9049 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "he.C(" + i + ')');
		}
	}

	public Class11_Sub2_Sub17() {
		super(1, false);
		aBool9045 = true;
	}

	static {
		aBool9046 = false;
	}
}
