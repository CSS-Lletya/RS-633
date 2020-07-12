/* Class264_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class264_Sub1 extends Class264 {
	private long aLong5612 = 0L;
	private long aLong5613 = 0L;
	private long aLong5614 = 0L;
	private int anInt5615;
	private int anInt5616 = 0;
	private long[] aLongArray5617;

	final long method1675(int i) {
		long l;
		try {
			if (i != -9876)
				method1674(100, 58L);
			aLong5613 += method2426((byte) -123);
			if (aLong5612 > aLong5613)
				return (-aLong5613 + aLong5612) / 1000000L;
			l = 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final long method1673(byte i) {
		long l;
		try {
			if (i < 2)
				method2426((byte) -124);
			l = aLong5613;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final void method1677(int i) {
		try {
			int i_0_ = 78 / ((-65 - i) / 48);
			if ((aLong5613 ^ 0xffffffffffffffffL) > (aLong5612 ^ 0xffffffffffffffffL))
				aLong5613 += -aLong5613 + aLong5612;
			aLong5614 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method2426(byte i) {
		long l;
		try {
			if (i >= -119)
				method1674(70, 71L);
			long l_1_ = System.nanoTime();
			long l_2_ = l_1_ + -aLong5614;
			aLong5614 = l_1_;
			if (l_2_ > -5000000000L
					&& (l_2_ ^ 0xffffffffffffffffL) > -5000000001L) {
				aLongArray5617[anInt5616] = l_2_;
				anInt5616 = (anInt5616 + 1) % 10;
				if (anInt5615 < 1)
					anInt5615++;
			}
			long l_3_ = 0L;
			for (int i_4_ = 1; (i_4_ ^ 0xffffffff) >= (anInt5615 ^ 0xffffffff); i_4_++)
				l_3_ += aLongArray5617[(10 + (-i_4_ + anInt5616)) % 10];
			l = l_3_ / (long) anInt5615;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	final int method1674(int i, long l) {
		int i_5_;
		try {
			if (i != 70)
				return 43;
			if ((aLong5612 ^ 0xffffffffffffffffL) < (aLong5613 ^ 0xffffffffffffffffL)) {
				aLong5614 += aLong5612 - aLong5613;
				aLong5613 += -aLong5613 + aLong5612;
				aLong5612 += l;
				return 1;
			}
			int i_6_ = 0;
			do {
				i_6_++;
				aLong5612 += l;
			} while (10 > i_6_ && aLong5613 > aLong5612);
			if ((aLong5612 ^ 0xffffffffffffffffL) > (aLong5613 ^ 0xffffffffffffffffL))
				aLong5612 = aLong5613;
			i_5_ = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_5_;
	}

	Class264_Sub1() {
		anInt5615 = 1;
		aLongArray5617 = new long[10];
		try {
			aLong5613 = System.nanoTime();
			aLong5612 = System.nanoTime();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
