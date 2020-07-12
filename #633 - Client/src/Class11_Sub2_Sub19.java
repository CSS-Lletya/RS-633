/* Class11_Sub2_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub19 extends Class11_Sub2 {
	private int anInt9086 = 4096;
	static boolean aBool9087 = false;
	static int anInt9088;
	static int anInt9089;
	static int anInt9090;
	static boolean[][] aBoolArrayArray9091;
	static Class314 aClass314_9092 = new Class314();
	static IncomingPacket aClass160_9093 = new IncomingPacket(22, -2);
	static IncomingPacket aClass160_9094 = new IncomingPacket(54, 3);
	static int anInt9095;
	static double aDouble9096;
	static boolean aBool9097 = false;
	static Class1 aClass1_9098;
	static long aLong9099;

	final void method2263(int i, Stream stream, int i_0_) {
		do {
			try {
				if (i_0_ == 0)
					anInt9086 = stream.readUnsignedShort((byte) -65);
				anInt9088++;
				if (i == 3731)
					break;
				aBoolArrayArray9091 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ia.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_0_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3565(int i) {
		try {
			aClass314_9092 = null;
			if (i != 1)
				method3566(94, (byte) 114);
			aClass1_9098 = null;
			aClass160_9093 = null;
			aBoolArrayArray9091 = null;
			aClass160_9094 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ia.C(" + i + ')');
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9090++;
			if (bool != true)
				anInt9095 = 74;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int[] is_1_ = this.method2260(4463, 0,
						(Class11_Sub45_Sub16_Sub2.anInt10167 & -1 + i));
				int[] is_2_ = this.method2260(4463, 0, i);
				int[] is_3_ = this.method2260(4463, 0, i + 1
						& (Class11_Sub45_Sub16_Sub2.anInt10167));
				for (int i_4_ = 0; i_4_ < Class33_Sub2.anInt6696; i_4_++) {
					int i_5_ = anInt9086 * (is_3_[i_4_] - is_1_[i_4_]);
					int i_6_ = anInt9086
							* (-is_2_[-1 + i_4_ & Class297.anInt4024] + is_2_[Class297.anInt4024
									& i_4_ + 1]);
					int i_7_ = i_6_ >> 12;
					int i_8_ = i_5_ >> 12;
					int i_9_ = i_7_ * i_7_ >> 12;
					int i_10_ = i_8_ * i_8_ >> 12;
					int i_11_ = (int) (Math
							.sqrt((double) ((float) (4096 + (i_10_ + i_9_)) / 4096.0F)) * 4096.0);
					int i_12_ = i_11_ != 0 ? 16777216 / i_11_ : 0;
					is[i_4_] = -i_12_ + 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ia.A(" + i + ','
					+ bool + ')');
		}
	}

	static final void method3566(int i, byte i_13_) {
		try {
			anInt9089++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 10, i);
			if (i_13_ == -91)
				class11_sub45_sub15.method3660(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ia.E(" + i + ','
					+ i_13_ + ')');
		}
	}

	public Class11_Sub2_Sub19() {
		super(1, true);
	}

	static {
		anInt9095 = -60;
		aLong9099 = 0L;
	}
}
