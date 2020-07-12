/* Class11_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub1 extends Class11_Sub2 {
	private int anInt8432 = 4096;
	static int anInt8433;
	static int anInt8434;
	static int anInt8435;
	static int[] anIntArray8436;
	static Class282 aClass282_8437;
	static String aString8438 = null;
	private boolean aBool8439 = true;

	final void method2263(int i, Stream stream, int i_0_) {
		try {
			int i_1_ = i_0_;
			do {
				if ((i_1_ ^ 0xffffffff) != -1) {
					if ((i_1_ ^ 0xffffffff) != -2)
						break;
				} else {
					anInt8432 = stream.readUnsignedShort((byte) -65);
					break;
				}
				aBool8439 = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
			} while (false);
			if (i != 3731)
				method2263(43, null, -45);
			anInt8435++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cca.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final int[][] method2255(int i, int i_2_) {
		try {
			anInt8433++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(
					i_2_ - 1, i);
			if (i_2_ != 1)
				method2255(-41, 41);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_3_ = this.method2260(4463, 0,
						(Class11_Sub45_Sub16_Sub2.anInt10167 & i - 1));
				int[] is_4_ = this.method2260(i_2_ ^ 0x116e, 0, i);
				int[] is_5_ = this.method2260(4463, 0, i + 1
						& (Class11_Sub45_Sub16_Sub2.anInt10167));
				int[] is_6_ = is[0];
				int[] is_7_ = is[1];
				int[] is_8_ = is[2];
				for (int i_9_ = 0; i_9_ < Class33_Sub2.anInt6696; i_9_++) {
					int i_10_ = (-is_3_[i_9_] + is_5_[i_9_]) * anInt8432;
					int i_11_ = anInt8432
							* (-is_4_[-1 + i_9_ & Class297.anInt4024] + is_4_[Class297.anInt4024
									& i_9_ + 1]);
					int i_12_ = i_11_ >> 12;
					int i_13_ = i_10_ >> 12;
					int i_14_ = i_12_ * i_12_ >> 12;
					int i_15_ = i_13_ * i_13_ >> 12;
					int i_16_ = (int) (4096.0 * Math
							.sqrt((double) ((float) (i_15_ + i_14_ + 4096) / 4096.0F)));
					int i_17_;
					int i_18_;
					int i_19_;
					if (i_16_ != 0) {
						i_19_ = 16777216 / i_16_;
						i_17_ = i_10_ / i_16_;
						i_18_ = i_11_ / i_16_;
					} else {
						i_17_ = 0;
						i_18_ = 0;
						i_19_ = 0;
					}
					if (aBool8439) {
						i_19_ = (i_19_ >> 1) + 2048;
						i_17_ = 2048 - -(i_17_ >> 1);
						i_18_ = 2048 - -(i_18_ >> 1);
					}
					is_6_[i_9_] = i_18_;
					is_7_[i_9_] = i_17_;
					is_8_[i_9_] = i_19_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cca.I(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method3329(boolean bool) {
		try {
			aClass282_8437 = null;
			anIntArray8436 = null;
			if (bool != true)
				method3329(false);
			aString8438 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cca.C(" + bool + ')');
		}
	}

	public Class11_Sub2_Sub1() {
		super(1, false);
	}

	static {
		aClass282_8437 = new Class282();
	}
}
