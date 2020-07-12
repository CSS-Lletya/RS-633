/* Class75_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75_Sub1 extends Class75 implements Interface19 {
	private int anInt5512;
	static int anInt5513;
	static int anInt5514;
	static int anInt5515;
	static int anInt5516;
	static int anInt5517;

	public final int method48(boolean bool) {
		try {
			if (bool != true)
				return 80;
			anInt5517++;
			return anInt5512;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "al.D(" + bool + ')');
		}
	}

	Class75_Sub1(Class163_Sub3 class163_sub3, int i, byte[] is, int i_0_) {
		super(class163_sub3, is, i_0_);
		try {
			anInt5512 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("al.<init>("
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	public final int method30(int i) {
		try {
			if (i != -23198)
				method2407(-1, -9, false, 37, 87, -109);
			anInt5513++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "al.E(" + i + ')');
		}
	}

	public final long method33(byte i) {
		try {
			anInt5514++;
			if (i != -27)
				method30(-12);
			return ((Class75) this).aBuffer1035.getAddress();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "al.C(" + i + ')');
		}
	}

	static final void method2407(int i, int i_1_, boolean bool, int i_2_,
			int i_3_, int i_4_) {
		try {
			anInt5515++;
			int i_5_ = -i + i_1_;
			int i_6_ = -i_4_ + i_3_;
			if ((i_5_ ^ 0xffffffff) != -1) {
				if ((i_6_ ^ 0xffffffff) == -1) {
					Packet.method3415(i_2_, i_1_, i_4_, -114, i);
					return;
				}
			} else {
				if ((i_6_ ^ 0xffffffff) != -1)
					Class58.method456(i_2_, i_4_, i_3_, i, (byte) -77);
				return;
			}
			int i_7_ = (i_6_ << 12) / i_5_;
			int i_8_ = -(i * i_7_ >> 12) + i_4_;
			int i_9_;
			int i_10_;
			if ((Class26.anInt340 ^ 0xffffffff) < (i ^ 0xffffffff)) {
				i_10_ = Class26.anInt340;
				i_9_ = (i_7_ * Class26.anInt340 >> 12) + i_8_;
			} else if (Class11_Sub45_Sub1_Sub2.anInt9880 >= i) {
				i_9_ = i_4_;
				i_10_ = i;
			} else {
				i_10_ = Class11_Sub45_Sub1_Sub2.anInt9880;
				i_9_ = (Class11_Sub45_Sub1_Sub2.anInt9880 * i_7_ >> 12) + i_8_;
			}
			int i_11_;
			int i_12_;
			if (Class26.anInt340 <= i_1_) {
				if (Class11_Sub45_Sub1_Sub2.anInt9880 < i_1_) {
					i_12_ = Class11_Sub45_Sub1_Sub2.anInt9880;
					i_11_ = ((Class11_Sub45_Sub1_Sub2.anInt9880 * i_7_ >> 12) + i_8_);
				} else {
					i_12_ = i_1_;
					i_11_ = i_3_;
				}
			} else {
				i_11_ = (Class26.anInt340 * i_7_ >> 12) + i_8_;
				i_12_ = Class26.anInt340;
			}
			if (i_9_ < Class292.anInt3962) {
				i_10_ = (-i_8_ + Class292.anInt3962 << 12) / i_7_;
				i_9_ = Class292.anInt3962;
			} else if ((i_9_ ^ 0xffffffff) < (Class351.anInt4618 ^ 0xffffffff)) {
				i_9_ = Class351.anInt4618;
				i_10_ = (Class351.anInt4618 - i_8_ << 12) / i_7_;
			}
			if (i_11_ < Class292.anInt3962) {
				i_11_ = Class292.anInt3962;
				i_12_ = (Class292.anInt3962 + -i_8_ << 12) / i_7_;
			} else if ((i_11_ ^ 0xffffffff) < (Class351.anInt4618 ^ 0xffffffff)) {
				i_11_ = Class351.anInt4618;
				i_12_ = (Class351.anInt4618 - i_8_ << 12) / i_7_;
			}
			Class153.method960(i_9_, i_10_, i_11_, i_2_, i_12_, 38);
			if (bool != true)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("al.B(" + i + ',' + i_1_ + ',' + bool + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public final void method49(int i, int i_13_, byte[] is, int i_14_) {
		do {
			try {
				anInt5516++;
				this.method524(is, i_13_);
				anInt5512 = i;
				if (i_14_ < -40)
					break;
				anInt5512 = -111;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("al.F(" + i + ','
						+ i_13_ + ',' + (is != null ? "{...}" : "null") + ','
						+ i_14_ + ')'));
			}
			break;
		} while (false);
	}
}
