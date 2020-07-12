/* Class11_Sub2_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub34 extends Class11_Sub2 {
	static int anInt9686;
	static int anInt9687;
	static long[] aLongArray9688;
	static int anInt9689;
	static boolean aBool9690;
	static byte[][] aByteArrayArray9691 = new byte[1000][];
	static Class33 aClass33_9692;
	static int anInt9693;

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9689++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				method2263(-125, null, 64);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_0_ = this.method2260(4463, 0, i);
				for (int i_1_ = 0; i_1_ < Class33_Sub2.anInt6696; i_1_++)
					is[i_1_] = 4096 + -is_0_[i_1_];
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uv.A(" + i + ','
					+ bool + ')');
		}
	}

	final int[][] method2255(int i, int i_2_) {
		try {
			anInt9687++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (i_2_ != 1)
				return null;
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[][] is_3_ = this.method2262(i, -79, 0);
				int[] is_4_ = is_3_[0];
				int[] is_5_ = is_3_[1];
				int[] is_6_ = is_3_[2];
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				for (int i_10_ = 0; Class33_Sub2.anInt6696 > i_10_; i_10_++) {
					is_7_[i_10_] = 4096 + -is_4_[i_10_];
					is_8_[i_10_] = 4096 + -is_5_[i_10_];
					is_9_[i_10_] = 4096 - is_6_[i_10_];
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uv.I(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final boolean method3812(int i) {
		try {
			anInt9693++;
			try {
				if (i != -51)
					return false;
				return Class161.method996((byte) -114);
			} catch (java.io.IOException ioexception) {
				Class287.method1777((byte) 93);
				return true;
			} catch (Exception exception) {
				String string = ("T2 - "
						+ (Class236_Sub9.incomingPacket == null ? -1
								: Class236_Sub9.incomingPacket
										.method993((byte) 127))
						+ ","
						+ (Class340.aClass160_4489 != null ? Class340.aClass160_4489
								.method993((byte) 123) : -1)
						+ ","
						+ (Class266.aClass160_3621 == null ? -1
								: Class266.aClass160_3621.method993((byte) 127))
						+ " - "
						+ Class37.anInt486
						+ ","
						+ ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10370[0]) + Class194.anInt2641)
						+ ","
						+ ((((Actor) (Class11_Sub2_Sub8.myPlayer)).anIntArray10376[0]) + Class118.anInt1605) + " - ");
				for (int i_11_ = 0; i_11_ < Class37.anInt486
						&& (i_11_ ^ 0xffffffff) > -51; i_11_++)
					string += (((Stream) Class3.packetStream).buffer[i_11_])
							+ ",";
				Class11_Sub12_Sub3.method3602((byte) -61, string, exception);
				InputStream_Sub2.method2814(false, i ^ 0x642b);
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uv.E(" + i + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_12_) {
		do {
			try {
				if (i != 3731)
					method3812(-92);
				anInt9686++;
				if ((i_12_ ^ 0xffffffff) != -1)
					break;
				((Class11_Sub2) this).aBool5044 = stream
						.readUnsignedByte((byte) 35) == 1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("uv.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_12_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3813(byte i) {
		try {
			aLongArray9688 = null;
			aByteArrayArray9691 = null;
			int i_13_ = 56 % ((i + 14) / 61);
			aClass33_9692 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uv.C(" + i + ')');
		}
	}

	public Class11_Sub2_Sub34() {
		super(1, false);
	}

	static {
		aLongArray9688 = new long[32];
		aBool9690 = false;
	}
}
