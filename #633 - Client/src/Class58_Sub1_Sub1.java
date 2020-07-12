/* Class58_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58_Sub1_Sub1 extends Class58_Sub1 {
	static int anInt9168;
	static int anInt9169;
	static int anInt9170;
	private byte[] aByteArray9171;
	static IncomingPacket RESET_SOUNDS_IN_PACKET = new IncomingPacket(70, 0);
	static Class203[] aClass203Array9173;
	static int anInt9174;

	public Class58_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	final void method2951(boolean bool, byte i, int i_0_) {
		try {
			anInt9170++;
			int i_1_ = i_0_ * 2;
			if (bool != false)
				RESET_SOUNDS_IN_PACKET = null;
			i = (byte) (127 + ((0xff & i) >> 1));
			aByteArray9171[i_1_++] = i;
			aByteArray9171[i_1_] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qia.D(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	static long method3583(long l, long l_2_) {
		try {
			return l & l_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qia.F(" + l + ','
					+ l_2_ + ')');
		}
	}

	static final int method3584(int i, boolean bool) {
		try {
			anInt9168++;
			if (bool != true)
				aClass203Array9173 = null;
			if (i != 6406) {
				if (i != 6409) {
					if ((i ^ 0xffffffff) == -32842)
						return 1;
					if (i == 6410)
						return 2;
					if (i != 6407) {
						if (i == 6408)
							return 4;
					} else
						return 3;
				} else
					return 1;
			} else
				return 1;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qia.C(" + i + ','
					+ bool + ')');
		}
	}

	public static void method3585(int i) {
		do {
			try {
				RESET_SOUNDS_IN_PACKET = null;
				aClass203Array9173 = null;
				if (i == -15522)
					break;
				aClass203Array9173 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qia.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final byte[] method3586(int i, byte i_3_, int i_4_, int i_5_) {
		try {
			anInt9169++;
			aByteArray9171 = new byte[i_4_ * (i * i_5_ * 2)];
			if (i_3_ != -56)
				method3585(23);
			this.method457(i, i_4_, false, i_5_);
			return aByteArray9171;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qia.B(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
