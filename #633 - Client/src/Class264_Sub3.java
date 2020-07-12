/* Class264_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class264_Sub3 extends Class264 {
	private long aLong6491;
	private int anInt6492 = 0;
	private long[] aLongArray6493 = new long[10];
	private int anInt6494;
	private long aLong6495;
	private long aLong6496;

	final long method1673(byte i) {
		try {
			if (i < 2)
				return -20L;
			return aLong6491;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1677(int i) {
		try {
			aLong6495 = 0L;
			if (aLong6491 < aLong6496)
				aLong6491 += -aLong6491 + aLong6496;
			int i_0_ = 99 / ((i + 65) / 48);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method2697(int i) {
		try {
			long l = Class137.method878((byte) -83) * 1000000L;
			long l_1_ = l + -aLong6495;
			aLong6495 = l;
			if ((l_1_ ^ 0xffffffffffffffffL) < 4999999999L
					&& l_1_ < 5000000000L) {
				aLongArray6493[anInt6492] = l_1_;
				if (anInt6494 < 10)
					anInt6494++;
				anInt6492 = (anInt6492 + 1) % 10;
			}
			long l_2_ = 0L;
			for (int i_3_ = i; (i_3_ ^ 0xffffffff) >= (anInt6494 ^ 0xffffffff); i_3_++)
				l_2_ += aLongArray6493[(-i_3_ + (anInt6492 + 10)) % 10];
			return l_2_ / (long) anInt6494;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method1674(int i, long l) {
		try {
			if (i != 70)
				return -127;
			if ((aLong6491 ^ 0xffffffffffffffffL) <= (aLong6496 ^ 0xffffffffffffffffL)) {
				int i_4_ = 0;
				do {
					i_4_++;
					aLong6496 += l;
				} while (i_4_ < 10
						&& ((aLong6496 ^ 0xffffffffffffffffL) > (aLong6491 ^ 0xffffffffffffffffL)));
				if (aLong6496 < aLong6491)
					aLong6496 = aLong6491;
				return i_4_;
			}
			aLong6495 += -aLong6491 + aLong6496;
			aLong6491 += -aLong6491 + aLong6496;
			aLong6496 += l;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final long method1675(int i) {
		try {
			if (i != -9876)
				aLong6491 = -33L;
			aLong6491 += method2697(1);
			if ((aLong6496 ^ 0xffffffffffffffffL) < (aLong6491 ^ 0xffffffffffffffffL))
				return (aLong6496 - aLong6491) / 1000000L;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class264_Sub3() {
		aLong6491 = 0L;
		anInt6494 = 1;
		aLong6495 = 0L;
		aLong6496 = 0L;
	}
}
