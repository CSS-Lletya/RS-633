/* Class264_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class264_Sub2 extends Class264 {
	private long aLong5807;
	private long aLong5808 = 0L;
	private long[] aLongArray5809;
	private int anInt5810;
	private long aLong5811;
	private int anInt5812;

	final long method1673(byte i) {
		try {
			if (i <= 2)
				return 23L;
			return aLong5807;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1677(int i) {
		try {
			int i_0_ = 74 % ((-65 - i) / 48);
			if (aLong5808 > aLong5807)
				aLong5807 += -aLong5807 + aLong5808;
			aLong5811 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method1674(int i, long l) {
		try {
			if (i != 70)
				return -1;
			if (aLong5807 >= aLong5808) {
				int i_1_ = 0;
				do {
					i_1_++;
					aLong5808 += l;
				} while (i_1_ < 10
						&& ((aLong5808 ^ 0xffffffffffffffffL) > (aLong5807 ^ 0xffffffffffffffffL)));
				if ((aLong5807 ^ 0xffffffffffffffffL) < (aLong5808 ^ 0xffffffffffffffffL))
					aLong5808 = aLong5807;
				return i_1_;
			}
			aLong5811 += -aLong5807 + aLong5808;
			aLong5807 += -aLong5807 + aLong5808;
			aLong5808 += l;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final long method1675(int i) {
		try {
			if (i != -9876)
				return 74L;
			aLong5807 += method2480(false);
			if (aLong5808 > aLong5807)
				return (aLong5808 - aLong5807) / 1000000L;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final long method2480(boolean bool) {
		try {
			if (bool != false)
				anInt5812 = -31;
			long l = jagmisc.nanoTime();
			long l_2_ = -aLong5811 + l;
			aLong5811 = l;
			if (l_2_ > -5000000000L
					&& (l_2_ ^ 0xffffffffffffffffL) > -5000000001L) {
				aLongArray5809[anInt5812] = l_2_;
				if (anInt5810 < 1)
					anInt5810++;
				anInt5812 = (anInt5812 + 1) % 10;
			}
			long l_3_ = 0L;
			for (int i = 1; (anInt5810 ^ 0xffffffff) <= (i ^ 0xffffffff); i++)
				l_3_ += aLongArray5809[(10 + (anInt5812 + -i)) % 10];
			return l_3_ / (long) anInt5810;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class264_Sub2() {
		aLong5807 = 0L;
		anInt5810 = 1;
		aLongArray5809 = new long[10];
		anInt5812 = 0;
		aLong5811 = 0L;
		try {
			aLong5808 = aLong5807 = jagmisc.nanoTime();
			if ((aLong5807 ^ 0xffffffffffffffffL) == -1L)
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
