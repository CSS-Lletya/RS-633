/* Class217 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

abstract class Class217 {
	static int anInt3002;
	static int anInt3003 = 0;

	static final void method1394(boolean bool, int[] is, int i, int[] is_0_,
			int i_1_) {
		try {
			if (bool == true) {
				if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
					int i_2_ = (i_1_ + i) / 2;
					int i_3_ = i;
					int i_4_ = is_0_[i_2_];
					is_0_[i_2_] = is_0_[i_1_];
					is_0_[i_1_] = i_4_;
					int i_5_ = is[i_2_];
					is[i_2_] = is[i_1_];
					is[i_1_] = i_5_;
					int i_6_ = (i_4_ ^ 0xffffffff) != -2147483648 ? 1 : 0;
					for (int i_7_ = i; (i_1_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
						if ((is_0_[i_7_] ^ 0xffffffff) > ((i_7_ & i_6_) + i_4_ ^ 0xffffffff)) {
							int i_8_ = is_0_[i_7_];
							is_0_[i_7_] = is_0_[i_3_];
							is_0_[i_3_] = i_8_;
							int i_9_ = is[i_7_];
							is[i_7_] = is[i_3_];
							is[i_3_++] = i_9_;
						}
					}
					is_0_[i_1_] = is_0_[i_3_];
					is_0_[i_3_] = i_4_;
					is[i_1_] = is[i_3_];
					is[i_3_] = i_5_;
					method1394(true, is, i, is_0_, i_3_ - 1);
					method1394(bool, is, i_3_ + 1, is_0_, i_1_);
				}
				anInt3002++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kr.I(" + bool + ','
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ')'));
		}
	}

	abstract void method1395(int i, byte[] is, int i_10_, int i_11_)
			throws IOException;

	public Class217() {
		/* empty */
	}

	abstract int method1396(int i, byte[] is, int i_12_, int i_13_)
			throws IOException;

	static long method1397(long l, long l_14_) {
		try {
			return l | l_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kr.H(" + l + ','
					+ l_14_ + ')');
		}
	}

	abstract void method1398(int i);

	abstract boolean method1399(byte i, int i_15_) throws IOException;

	abstract void method1400(byte i);
}
