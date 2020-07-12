/* Class11_Sub2_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub10 extends Class11_Sub2 {
	static int anInt8846;
	static IncomingPacket aClass160_8847 = new IncomingPacket(79, 2);
	static int anInt8848;
	static int anInt8849;
	static long aLong8850;
	static Class352 aClass352_8851;
	static int anInt8852;
	static int anInt8853;
	static int anInt8854;

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8848++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				aClass352_8851 = null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_0_ = this.method2260(4463, 0, i);
				int[] is_1_ = this.method2260(4463, 1, i);
				int[] is_2_ = this.method2260(4463, 2, i);
				for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_3_++) {
					int i_4_ = is_2_[i_3_];
					if ((i_4_ ^ 0xffffffff) == -4097)
						is[i_3_] = is_0_[i_3_];
					else if (i_4_ != 0)
						is[i_3_] = is_0_[i_3_] * i_4_
								- -((4096 - i_4_) * is_1_[i_3_]) >> 12;
					else
						is[i_3_] = is_1_[i_3_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dc.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_5_) {
		do {
			try {
				anInt8852++;
				if ((i_5_ ^ 0xffffffff) == -1)
					((Class11_Sub2) this).aBool5044 = (stream
							.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
				if (i == 3731)
					break;
				aClass160_8847 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("dc.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_5_ + ')'));
			}
			break;
		} while (false);
	}

	static final String method3475(int i, String string) {
		try {
			anInt8849++;
			if (Class306.aString4113.startsWith("win"))
				return string + ".dll";
			if (!Class306.aString4113.startsWith("linux")) {
				if (Class306.aString4113.startsWith("mac"))
					return "lib" + string + ".dylib";
			} else
				return "lib" + string + ".so";
			if (i != 4096)
				return null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dc.F(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3476(byte i) {
		try {
			aClass352_8851 = null;
			if (i == 35)
				aClass160_8847 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dc.C(" + i + ')');
		}
	}

	public Class11_Sub2_Sub10() {
		super(3, false);
	}

	static final boolean method3477(int i, int i_6_, int i_7_) {
		try {
			anInt8846++;
			if (i_7_ > -3)
				method3475(12, null);
			if (!(Class58_Sub1.method2954(33, i, i_6_) | (0x70000 & i ^ 0xffffffff) != -1)
					&& !Class251_Sub1.method2378((byte) 115, i_6_, i))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dc.G(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	final int[][] method2255(int i, int i_8_) {
		try {
			if (i_8_ != 1)
				method2255(-67, 4);
			anInt8854++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_9_ = this.method2260(4463, 2, i);
				int[][] is_10_ = this.method2262(i, i_8_ ^ ~0x26, 0);
				int[][] is_11_ = this.method2262(i, 127, 1);
				int[] is_12_ = is[0];
				int[] is_13_ = is[1];
				int[] is_14_ = is[2];
				int[] is_15_ = is_10_[0];
				int[] is_16_ = is_10_[1];
				int[] is_17_ = is_10_[2];
				int[] is_18_ = is_11_[0];
				int[] is_19_ = is_11_[1];
				int[] is_20_ = is_11_[2];
				for (int i_21_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
					int i_22_ = is_9_[i_21_];
					if (i_22_ == 4096) {
						is_12_[i_21_] = is_15_[i_21_];
						is_13_[i_21_] = is_16_[i_21_];
						is_14_[i_21_] = is_17_[i_21_];
					} else if (i_22_ != 0) {
						int i_23_ = 4096 + -i_22_;
						is_12_[i_21_] = (i_22_ * is_15_[i_21_]
								- -(i_23_ * is_18_[i_21_]) >> 12);
						is_13_[i_21_] = (is_16_[i_21_] * i_22_ + is_19_[i_21_]
								* i_23_ >> 12);
						is_14_[i_21_] = (i_22_ * is_17_[i_21_] + is_20_[i_21_]
								* i_23_ >> 12);
					} else {
						is_12_[i_21_] = is_18_[i_21_];
						is_13_[i_21_] = is_19_[i_21_];
						is_14_[i_21_] = is_20_[i_21_];
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dc.I(" + i + ','
					+ i_8_ + ')');
		}
	}

	static final void method3478(int i, int i_24_, int i_25_, int i_26_,
			int i_27_) {
		do {
			try {
				anInt8853++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 10, i_25_);
				class11_sub45_sub15.method3661(0);
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367 = i_24_;
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_27_;
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i_26_;
				if (i == -818245748)
					break;
				aClass352_8851 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("dc.E(" + i + ',' + i_24_ + ',' + i_25_ + ',' + i_26_
								+ ',' + i_27_ + ')'));
			}
			break;
		} while (false);
	}
}
