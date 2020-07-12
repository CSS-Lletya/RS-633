/* Class11_Sub45_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub2 extends Class11_Sub45 {
	private Class213 aClass213_8503;
	static Class9 aClass9_8504 = new Class9(8, 1);
	static int anInt8505;
	static int anInt8506;
	static int anInt8507;
	static int anInt8508;
	static int anInt8509;
	static int[] anIntArray8510 = new int[32];
	static Class292 aClass292_8511;
	static int anInt8512;
	static int anInt8513;
	static OutgoingPacket ACTION_BUTTON10 = new OutgoingPacket(74, 8);
	static int anInt8515 = 0;

	static final void method3353(byte i, int i_0_, float f, int i_1_,
			float[] fs, int i_2_, int i_3_, int i_4_, float[] fs_5_, int i_6_,
			int i_7_, float f_8_) {
		try {
			if (i == -25) {
				i_2_ -= i_6_;
				anInt8509++;
				i_3_ -= i_0_;
				i_7_ -= i_1_;
				float f_9_ = (fs[2] * (float) i_2_ + ((float) i_7_ * fs[1] + (float) i_3_
						* fs[0]));
				float f_10_ = (fs[4] * (float) i_7_ + (float) i_3_ * fs[3] + fs[5]
						* (float) i_2_);
				float f_11_ = ((float) i_7_ * fs[7] + fs[6] * (float) i_3_ + (float) i_2_
						* fs[8]);
				float f_12_ = 0.5F + ((float) Math.atan2((double) f_9_,
						(double) f_11_) / 6.2831855F);
				if (f_8_ != 1.0F)
					f_12_ *= f_8_;
				float f_13_ = f + (0.5F + f_10_);
				if (i_4_ != 1) {
					if (i_4_ != 2) {
						if (i_4_ == 3) {
							float f_14_ = f_12_;
							f_12_ = f_13_;
							f_13_ = -f_14_;
						}
					} else {
						f_12_ = -f_12_;
						f_13_ = -f_13_;
					}
				} else {
					float f_15_ = f_12_;
					f_12_ = -f_13_;
					f_13_ = f_15_;
				}
				fs_5_[0] = f_12_;
				fs_5_[1] = f_13_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.D(" + i + ','
					+ i_0_ + ',' + f + ',' + i_1_ + ','
					+ (fs != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_
					+ ',' + i_4_ + ',' + (fs_5_ != null ? "{...}" : "null")
					+ ',' + i_6_ + ',' + i_7_ + ',' + f_8_ + ')'));
		}
	}

	static final void method3354(int i, int i_16_, int i_17_) {
		try {
			anInt8507++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 13, i_17_);
			if (i_16_ == 11931) {
				class11_sub45_sub15.method3661(0);
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.B(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	public static void method3355(int i) {
		do {
			try {
				ACTION_BUTTON10 = null;
				aClass292_8511 = null;
				aClass9_8504 = null;
				anIntArray8510 = null;
				if (i > 101)
					break;
				aClass9_8504 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rha.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method3356(int i, int i_18_, int i_19_) {
		try {
			anInt8508++;
			if (aClass213_8503 == null)
				return i;
			if (i_19_ != 6)
				return 76;
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) aClass213_8503
					.method1369((byte) 26, (long) i_18_));
			if (class11_sub51 == null)
				return i;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.C(" + i + ','
					+ i_18_ + ',' + i_19_ + ')'));
		}
	}

	final String method3357(String string, int i, int i_20_) {
		try {
			if (i != 3)
				method3358((byte) -95, null, -55);
			anInt8506++;
			if (aClass213_8503 == null)
				return string;
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) aClass213_8503
					.method1369((byte) 26, (long) i_20_));
			if (class11_sub3 == null)
				return string;
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.A("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_20_ + ')'));
		}
	}

	public Class11_Sub45_Sub2() {
		/* empty */
	}

	private final void method3358(byte i, Stream stream, int i_21_) {
		try {
			if ((i_21_ ^ 0xffffffff) == -250) {
				int i_22_ = stream.readUnsignedByte((byte) 35);
				if (aClass213_8503 == null) {
					int i_23_ = Class11_Sub2_Sub33.method3808(111, i_22_);
					aClass213_8503 = new Class213(i_23_);
				}
				for (int i_24_ = 0; i_22_ > i_24_; i_24_++) {
					boolean bool = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
					int i_25_ = stream.method2558(false);
					Class11 class11;
					if (bool)
						class11 = new Class11_Sub3(stream.readString(-1));
					else
						class11 = new Class11_Sub51(stream.readInt(104));
					aClass213_8503
							.method1368((long) i_25_, class11, (byte) -26);
				}
			}
			anInt8505++;
			int i_26_ = 8 % ((i - 48) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.G(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_21_ + ')'));
		}
	}

	final void method3359(int i, Stream stream) {
		try {
			for (;;) {
				int i_27_ = stream.readUnsignedByte((byte) 35);
				if (i_27_ == 0)
					break;
				method3358((byte) 100, stream, i_27_);
			}
			if (i == 19898)
				anInt8513++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rha.E(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}
}
