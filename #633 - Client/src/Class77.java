/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class77 {
	static OutgoingPacket aClass370_1043;
	static int anInt1044;
	static int anInt1045 = 0;
	static Class182 aClass182_1046;

	static int method527(int i, int i_0_) {
		try {
			return i ^ i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ao.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method528(int i) {
		try {
			aClass370_1043 = null;
			if (i != 3)
				method530(112, -98, 34, 54, null, -24, null, -125, -49);
			aClass182_1046 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ao.B(" + i + ')');
		}
	}

	static int method529(int i, int i_1_) {
		try {
			return i & i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ao.C(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final void method530(int i, int i_2_, int i_3_, int i_4_, byte[] is,
			int i_5_, byte[] is_6_, int i_7_, int i_8_) {
		try {
			anInt1044++;
			int i_9_ = -(i_7_ >> 2);
			if (i_4_ == -24147) {
				i_7_ = -(i_7_ & 0x3);
				for (int i_10_ = -i_5_; (i_10_ ^ 0xffffffff) > -1; i_10_++) {
					for (int i_11_ = i_9_; (i_11_ ^ 0xffffffff) > -1; i_11_++) {
						is[i_2_++] += -is_6_[i_3_++];
						is[i_2_++] += -is_6_[i_3_++];
						is[i_2_++] += -is_6_[i_3_++];
						is[i_2_++] += -is_6_[i_3_++];
					}
					for (int i_12_ = i_7_; (i_12_ ^ 0xffffffff) > -1; i_12_++)
						is[i_2_++] += -is_6_[i_3_++];
					i_2_ += i;
					i_3_ += i_8_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ao.D(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ (is_6_ != null ? "{...}" : "null") + ',' + i_7_ + ','
					+ i_8_ + ')'));
		}
	}

	static {
		aClass370_1043 = new OutgoingPacket(14, 3);
	}
}
