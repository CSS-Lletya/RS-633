/* Class11_Sub2_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub14 extends Class11_Sub2 {
	static int anInt9003;
	static int anInt9004;
	static IncomingPacket aClass160_9005;
	static int anInt9006;
	static int anInt9007;
	private int anInt9008 = 2048;
	static int anInt9009;
	static boolean aBool9010 = false;
	private int anInt9011 = 1024;
	private int anInt9012 = 3072;
	static Class22 aClass22_9013;
	static short aShort9014;
	static boolean aBool9015;

	final void method2263(int i, Stream stream, int i_0_) {
		while_123_: do {
			try {
				anInt9009++;
				if (i != 3731)
					anInt9012 = -124;
				int i_1_ = i_0_;
				while_122_: do {
					do {
						if (i_1_ != 0) {
							if (i_1_ == 1)
								break;
							if ((i_1_ ^ 0xffffffff) != -3)
								break while_123_;
							if (!client.aBool10531)
								break while_122_;
						}
						anInt9011 = stream.readUnsignedShort((byte) -65);
						return;
					} while (false);
					anInt9012 = stream.readUnsignedShort((byte) -65);
					return;
				} while (false);
				((Class11_Sub2) this).aBool5044 = (stream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("gl.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
		} while (false);
	}

	final void method2256(int i) {
		try {
			anInt9003++;
			if (i != 7)
				aClass22_9013 = null;
			anInt9008 = anInt9012 + -anInt9011;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gl.D(" + i + ')');
		}
	}

	public Class11_Sub2_Sub14() {
		super(1, false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9006++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_2_ = this.method2260(4463, 0, i);
				for (int i_3_ = 0; i_3_ < Class33_Sub2.anInt6696; i_3_++)
					is[i_3_] = anInt9011 - -(anInt9008 * is_2_[i_3_] >> 12);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gl.A(" + i + ','
					+ bool + ')');
		}
	}

	public static void method3543(byte i) {
		try {
			aClass22_9013 = null;
			if (i < 113)
				aBool9010 = false;
			aClass160_9005 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gl.C(" + i + ')');
		}
	}

	final int[][] method2255(int i, int i_4_) {
		try {
			anInt9004++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (i_4_ != 1)
				return null;
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_5_ = this.method2262(i, -33, 0);
				int[] is_6_ = is_5_[0];
				int[] is_7_ = is_5_[1];
				int[] is_8_ = is_5_[2];
				int[] is_9_ = is[0];
				int[] is_10_ = is[1];
				int[] is_11_ = is[2];
				for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_12_++) {
					is_9_[i_12_] = anInt9011 + (anInt9008 * is_6_[i_12_] >> 12);
					is_10_[i_12_] = anInt9011
							+ (is_7_[i_12_] * anInt9008 >> 12);
					is_11_[i_12_] = (is_8_[i_12_] * anInt9008 >> 12)
							+ anInt9011;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gl.I(" + i + ','
					+ i_4_ + ')');
		}
	}

	static final void method3544(int i, int i_13_, int i_14_, int i_15_,
			int i_16_) {
		try {
			Class218.anInt3005 = i_16_;
			if (i_14_ == 1) {
				Class11_Sub2_Sub2.anInt8459 = i_15_;
				Class248.anInt3354 = i;
				Class11_Sub50_Sub2.anInt9081 = i_13_;
				anInt9007++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gl.E(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	static {
		aClass160_9005 = new IncomingPacket(111, 10);
		aClass22_9013 = new Class22(128, 4);
		aShort9014 = (short) 205;
		aBool9015 = false;
	}
}
