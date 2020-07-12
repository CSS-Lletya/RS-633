/* Class11_Sub2_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub26 extends Class11_Sub2 {
	static Class209 aClass209_9344;
	static int anInt9345;
	private int anInt9346;
	private int anInt9347;
	private int[] anIntArray9348;
	static int anInt9349;
	private int anInt9350 = -1;
	static int anInt9351;
	static IncomingPacket aClass160_9352 = new IncomingPacket(86, 4);
	static int anInt9353;
	static int anInt9354;
	static int anInt9355;

	final void method2259(int i, int i_0_, int i_1_) {
		do {
			try {
				anInt9353++;
				super.method2259(i, i_0_, i_1_);
				if (anInt9350 < 0 || Class256_Sub1.anInterface1_5321 == null)
					break;
				int i_2_ = (!(((Class188) Class256_Sub1.anInterface1_5321
						.method7((byte) 127, anInt9350)).aBool2430) ? 128 : 64);
				anIntArray9348 = Class256_Sub1.anInterface1_5321.method6(false,
						i_2_, i_0_ + 20378, i_2_, 1.0F, anInt9350);
				anInt9346 = i_2_;
				anInt9347 = i_2_;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nf.AA(" + i + ','
						+ i_0_ + ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method3653(byte i) {
		try {
			if (i != -122)
				method3653((byte) 70);
			aClass209_9344 = null;
			aClass160_9352 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nf.S(" + i + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_3_) {
		do {
			try {
				if ((i_3_ ^ 0xffffffff) == -1)
					anInt9350 = stream.readUnsignedShort((byte) -65);
				anInt9351++;
				if (i == 3731)
					break;
				aClass160_9352 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nf.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_3_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2257(byte i) {
		try {
			super.method2257((byte) -47);
			anInt9355++;
			int i_4_ = 114 % ((i - 52) / 49);
			anIntArray9348 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nf.N(" + i + ')');
		}
	}

	final int[][] method2255(int i, int i_5_) {
		try {
			anInt9354++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (i_5_ != 1)
				method2257((byte) 107);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int i_6_ = anInt9347
						* (anInt9346 == Class29.anInt398 ? i : i * anInt9346
								/ Class29.anInt398);
				int[] is_7_ = is[0];
				int[] is_8_ = is[1];
				int[] is_9_ = is[2];
				if ((Class33_Sub2.anInt6696 ^ 0xffffffff) == (anInt9347 ^ 0xffffffff)) {
					for (int i_10_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
						int i_11_ = anIntArray9348[i_6_++];
						is_9_[i_10_] = Class77.method529(4080, i_11_ << 4);
						is_8_[i_10_] = Class77.method529(4080, i_11_ >> 4);
						is_7_[i_10_] = Class77.method529(4080, i_11_ >> 12);
					}
				} else {
					for (int i_12_ = 0; Class33_Sub2.anInt6696 > i_12_; i_12_++) {
						int i_13_ = i_12_ * anInt9347 / Class33_Sub2.anInt6696;
						int i_14_ = anIntArray9348[i_6_ + i_13_];
						is_9_[i_12_] = Class77.method529(i_14_, 255) << 4;
						is_8_[i_12_] = Class77.method529(4080, i_14_ >> 4);
						is_7_[i_12_] = Class77.method529(4080, i_14_ >> 12);
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nf.I(" + i + ','
					+ i_5_ + ')');
		}
	}

	public Class11_Sub2_Sub26() {
		super(0, false);
	}

	final int method2258(int i) {
		try {
			if (i != -1)
				aClass160_9352 = null;
			anInt9345++;
			return anInt9350;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nf.W(" + i + ')');
		}
	}
}
