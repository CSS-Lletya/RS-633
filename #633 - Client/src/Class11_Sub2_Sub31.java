/* Class11_Sub2_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub31 extends Class11_Sub2 {
	private int anInt9633 = 3216;
	private int anInt9634;
	private int anInt9635;
	private int[] anIntArray9636 = new int[3];
	static int anInt9637;
	static IncomingPacket LOGOUT_IN_PACKET = new IncomingPacket(26, 0);
	static int anInt9639;
	static int anInt9640 = 0;
	static int anInt9641;
	static int anInt9642;
	static IncomingPacket aClass160_9643 = new IncomingPacket(80, 11);
	static Class19_Sub1[] aClass19_Sub1Array9644 = new Class19_Sub1[37];
	static IncomingPacket aClass160_9645 = new IncomingPacket(17, 0);

	private final void method3801(int i) {
		do {
			try {
				anInt9641++;
				double d = Math.cos((double) ((float) anInt9633 / 4096.0F));
				anIntArray9636[0] = (int) (d
						* Math.sin((double) ((float) anInt9634 / 4096.0F)) * 4096.0);
				anIntArray9636[1] = (int) (Math
						.cos((double) ((float) anInt9634 / 4096.0F)) * d * 4096.0);
				anIntArray9636[2] = (int) (Math
						.sin((double) ((float) anInt9633 / 4096.0F)) * 4096.0);
				int i_0_ = anIntArray9636[0] * anIntArray9636[0] >> 12;
				if (i != 16692)
					aClass160_9643 = null;
				int i_1_ = anIntArray9636[1] * anIntArray9636[1] >> 12;
				int i_2_ = anIntArray9636[2] * anIntArray9636[2] >> 12;
				int i_3_ = (int) (4096.0 * Math.sqrt((double) (i_1_
						+ (i_0_ + i_2_) >> 12)));
				if ((i_3_ ^ 0xffffffff) == -1)
					break;
				anIntArray9636[0] = (anIntArray9636[0] << 12) / i_3_;
				anIntArray9636[1] = (anIntArray9636[1] << 12) / i_3_;
				anIntArray9636[2] = (anIntArray9636[2] << 12) / i_3_;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "un.E(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class11_Sub2_Sub31() {
		super(1, true);
		anInt9635 = 4096;
		anInt9634 = 3216;
	}

	final void method2263(int i, Stream stream, int i_4_) {
		do {
			try {
				int i_5_ = i_4_;
				while_157_: do {
					do {
						if ((i_5_ ^ 0xffffffff) != -1) {
							if (i_5_ != 1) {
								if (i_5_ == 2)
									break;
								break while_157_;
							}
						} else {
							anInt9635 = stream.readUnsignedShort((byte) -65);
							break while_157_;
						}
						anInt9634 = stream.readUnsignedShort((byte) -65);
						break while_157_;
					} while (false);
					anInt9633 = stream.readUnsignedShort((byte) -65);
				} while (false);
				anInt9637++;
				if (i == 3731)
					break;
				method3801(-70);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("un.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_4_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3802(int i) {
		do {
			try {
				LOGOUT_IN_PACKET = null;
				aClass160_9645 = null;
				aClass160_9643 = null;
				aClass19_Sub1Array9644 = null;
				if (i == -17189)
					break;
				method3802(65);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "un.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9639++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_6_ = Class11_Sub50_Sub1.anInt8843 * anInt9635 >> 12;
				int[] is_7_ = this.method2260(4463, 0, i - 1
						& (Class11_Sub45_Sub16_Sub2.anInt10167));
				int[] is_8_ = this.method2260(4463, 0, i);
				int[] is_9_ = this.method2260(4463, 0,
						(Class11_Sub45_Sub16_Sub2.anInt10167 & i + 1));
				for (int i_10_ = 0; Class33_Sub2.anInt6696 > i_10_; i_10_++) {
					int i_11_ = (-is_7_[i_10_] + is_9_[i_10_]) * i_6_ >> 12;
					int i_12_ = ((-is_8_[Class297.anInt4024 & i_10_ + 1] + is_8_[-1
							+ i_10_ & Class297.anInt4024])
							* i_6_ >> 12);
					int i_13_ = i_12_ >> 4;
					int i_14_ = i_11_ >> 4;
					if ((i_13_ ^ 0xffffffff) > -1)
						i_13_ = -i_13_;
					if ((i_14_ ^ 0xffffffff) > -1)
						i_14_ = -i_14_;
					if (i_13_ > 255)
						i_13_ = 255;
					if (i_14_ > 255)
						i_14_ = 255;
					int i_15_ = 0xff & (Class102.aByteArray1363[i_13_
							+ (i_14_ * (i_14_ + 1) >> 1)]);
					int i_16_ = i_15_ * i_12_ >> 8;
					int i_17_ = i_15_ * i_11_ >> 8;
					int i_18_ = 4096 * i_15_ >> 8;
					i_17_ = i_17_ * anIntArray9636[1] >> 12;
					i_16_ = i_16_ * anIntArray9636[0] >> 12;
					i_18_ = anIntArray9636[2] * i_18_ >> 12;
					is[i_10_] = i_18_ + (i_17_ + i_16_);
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "un.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method2256(int i) {
		try {
			if (i != 7)
				anInt9633 = -71;
			method3801(i + 16685);
			anInt9642++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "un.D(" + i + ')');
		}
	}
}
