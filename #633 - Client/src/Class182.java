/* Class182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class182 {
	static int anInt2339 = -1;
	static int anInt2340;
	static int anInt2341;
	static int anInt2342;
	static float aFloat2343;
	private long aLong2344;
	private byte[] aByteArray2345;
	static int[] anIntArray2346 = new int[2];
	static int anInt2347;
	static int anInt2348;
	static int anInt2349;
	private Class119 aClass119_2350;
	private long aLong2351;
	private long aLong2352 = -1L;
	private long aLong2353;
	static int anInt2354;
	static int anInt2355;
	private byte[] aByteArray2356;
	static int anInt2357;
	private int anInt2358 = 0;
	private long aLong2359;
	private long aLong2360;
	private int anInt2361;

	final void method1189(int i, byte i_0_, byte[] is, int i_1_)
			throws IOException {
		do {
			try {
				anInt2348++;
				try {
					if (aLong2360 < aLong2353 - -(long) i)
						aLong2360 = (long) i + aLong2353;
					if (aLong2351 != -1L
							&& (aLong2353 < aLong2351 || ((aLong2353 ^ 0xffffffffffffffffL) < (aLong2351
									+ (long) anInt2358 ^ 0xffffffffffffffffL))))
						method1196((byte) -125);
					if ((aLong2351 ^ 0xffffffffffffffffL) != 0L
							&& ((long) aByteArray2345.length + aLong2351 < (long) i
									+ aLong2353)) {
						int i_2_ = (int) (aLong2351 + (-aLong2353 + (long) aByteArray2345.length));
						Class311.method1898(is, i_1_, aByteArray2345,
								(int) (aLong2353 - aLong2351), i_2_);
						i -= i_2_;
						aLong2353 += (long) i_2_;
						i_1_ += i_2_;
						anInt2358 = aByteArray2345.length;
						method1196((byte) -125);
					}
					if (i > aByteArray2345.length) {
						if ((aLong2353 ^ 0xffffffffffffffffL) != (aLong2344 ^ 0xffffffffffffffffL)) {
							aClass119_2350.method775(-114, aLong2353);
							aLong2344 = aLong2353;
						}
						aClass119_2350.method782(i_1_, i, is, true);
						aLong2344 += (long) i;
						if ((aLong2359 ^ 0xffffffffffffffffL) > (aLong2344 ^ 0xffffffffffffffffL))
							aLong2359 = aLong2344;
						long l = -1L;
						long l_3_ = -1L;
						if (aLong2353 >= aLong2352
								&& aLong2352 - -(long) anInt2361 > aLong2353)
							l = aLong2353;
						else if (aLong2353 <= aLong2352
								&& (long) i + aLong2353 > aLong2352)
							l = aLong2352;
						if (((aLong2352 ^ 0xffffffffffffffffL) > ((long) i
								+ aLong2353 ^ 0xffffffffffffffffL))
								&& (((long) anInt2361 + aLong2352 ^ 0xffffffffffffffffL) <= (aLong2353
										- -(long) i ^ 0xffffffffffffffffL)))
							l_3_ = (long) i + aLong2353;
						else if (((aLong2353 ^ 0xffffffffffffffffL) > ((long) anInt2361
								+ aLong2352 ^ 0xffffffffffffffffL))
								&& (aLong2352 + (long) anInt2361 <= (long) i
										+ aLong2353))
							l_3_ = aLong2352 + (long) anInt2361;
						if ((l ^ 0xffffffffffffffffL) < 0L
								&& ((l ^ 0xffffffffffffffffL) > (l_3_ ^ 0xffffffffffffffffL))) {
							int i_4_ = (int) (-l + l_3_);
							Class311.method1898(is,
									(int) (-aLong2353 + (l + (long) i_1_)),
									aByteArray2356, (int) (l - aLong2352), i_4_);
						}
						aLong2353 += (long) i;
						break;
					}
					if (i > 0) {
						if ((aLong2351 ^ 0xffffffffffffffffL) == 0L)
							aLong2351 = aLong2353;
						Class311.method1898(is, i_1_, aByteArray2345,
								(int) (aLong2353 + -aLong2351), i);
						aLong2353 += (long) i;
						if ((aLong2353 - aLong2351 ^ 0xffffffffffffffffL) < ((long) anInt2358 ^ 0xffffffffffffffffL))
							anInt2358 = (int) (-aLong2351 + aLong2353);
						break;
					}
				} catch (IOException ioexception) {
					aLong2344 = -1L;
					throw ioexception;
				}
				if (i_0_ > 58)
					break;
				anInt2339 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ij.C(" + i + ','
						+ i_0_ + ',' + (is != null ? "{...}" : "null") + ','
						+ i_1_ + ')'));
			}
			break;
		} while (false);
	}

	final long method1190(int i) {
		try {
			anInt2354++;
			if (i >= -15)
				return 0L;
			return aLong2360;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.E(" + i + ')');
		}
	}

	public static void method1191(byte i) {
		try {
			if (i != -121)
				anInt2339 = 111;
			anIntArray2346 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.D(" + i + ')');
		}
	}

	final void method1192(long l, boolean bool) throws IOException {
		try {
			anInt2342++;
			if (bool == true) {
				if (l < 0L)
					throw new IOException("Invalid seek to " + l + " in file "
							+ method1198(1432962400));
				aLong2353 = l;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.A(" + l + ','
					+ bool + ')');
		}
	}

	final void method1193(byte i, byte[] is) throws IOException {
		try {
			method1195(0, is, is.length, (byte) -78);
			if (i != 25)
				method1191((byte) -53);
			anInt2340++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.H(" + i + ','
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	private final void method1194(byte i) throws IOException {
		try {
			anInt2361 = 0;
			anInt2355++;
			if ((aLong2344 ^ 0xffffffffffffffffL) != (aLong2353 ^ 0xffffffffffffffffL)) {
				aClass119_2350.method775(-86, aLong2353);
				aLong2344 = aLong2353;
			}
			aLong2352 = aLong2353;
			if (i <= 51)
				method1198(70);
			int i_5_;
			for (/**/; ((aByteArray2356.length ^ 0xffffffff) < (anInt2361 ^ 0xffffffff)); anInt2361 += i_5_) {
				int i_6_ = -anInt2361 + aByteArray2356.length;
				if (i_6_ > 200000000)
					i_6_ = 200000000;
				i_5_ = aClass119_2350.method780(anInt2361, (byte) -65, i_6_,
						aByteArray2356);
				if (i_5_ == -1)
					break;
				aLong2344 += (long) i_5_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.I(" + i + ')');
		}
	}

	final void method1195(int i, byte[] is, int i_7_, byte i_8_)
			throws IOException {
		try {
			anInt2349++;
			try {
				if ((is.length ^ 0xffffffff) > (i + i_7_ ^ 0xffffffff))
					throw new ArrayIndexOutOfBoundsException(-is.length + i_7_
							+ i);
				if (aLong2351 != -1L
						&& aLong2351 <= aLong2353
						&& ((aLong2353 + (long) i_7_ ^ 0xffffffffffffffffL) >= ((long) anInt2358
								+ aLong2351 ^ 0xffffffffffffffffL))) {
					Class311.method1898(aByteArray2345,
							(int) (aLong2353 - aLong2351), is, i, i_7_);
					aLong2353 += (long) i_7_;
					return;
				}
				long l = aLong2353;
				if (i_8_ != -78)
					return;
				int i_9_ = i;
				int i_10_ = i_7_;
				if (((aLong2353 ^ 0xffffffffffffffffL) <= (aLong2352 ^ 0xffffffffffffffffL))
						&& (long) anInt2361 + aLong2352 > aLong2353) {
					int i_11_ = (int) (aLong2352 - (aLong2353 - (long) anInt2361));
					if (i_7_ < i_11_)
						i_11_ = i_7_;
					Class311.method1898(aByteArray2356,
							(int) (-aLong2352 + aLong2353), is, i, i_11_);
					i_7_ -= i_11_;
					i += i_11_;
					aLong2353 += (long) i_11_;
				}
				if (aByteArray2356.length < i_7_) {
					aClass119_2350.method775(-86, aLong2353);
					aLong2344 = aLong2353;
					while (i_7_ > 0) {
						int i_12_ = aClass119_2350.method780(i, (byte) -108,
								i_7_, is);
						if ((i_12_ ^ 0xffffffff) == 0)
							break;
						i += i_12_;
						i_7_ -= i_12_;
						aLong2344 += (long) i_12_;
						aLong2353 += (long) i_12_;
					}
				} else if (i_7_ > 0) {
					method1194((byte) 126);
					int i_13_ = i_7_;
					if (anInt2361 < i_13_)
						i_13_ = anInt2361;
					Class311.method1898(aByteArray2356, 0, is, i, i_13_);
					i += i_13_;
					aLong2353 += (long) i_13_;
					i_7_ -= i_13_;
				}
				if (aLong2351 != -1L) {
					if (aLong2353 < aLong2351 && (i_7_ ^ 0xffffffff) < -1) {
						int i_14_ = (int) (aLong2351 + -aLong2353) + i;
						if ((i_7_ + i ^ 0xffffffff) > (i_14_ ^ 0xffffffff))
							i_14_ = i_7_ + i;
						while (i_14_ > i) {
							i_7_--;
							is[i++] = (byte) 0;
							aLong2353++;
						}
					}
					long l_15_ = -1L;
					if ((l ^ 0xffffffffffffffffL) >= (aLong2351 ^ 0xffffffffffffffffL)
							&& ((l + (long) i_10_ ^ 0xffffffffffffffffL) < (aLong2351 ^ 0xffffffffffffffffL)))
						l_15_ = aLong2351;
					else if (l >= aLong2351 && (long) anInt2358 + aLong2351 > l)
						l_15_ = l;
					long l_16_ = -1L;
					if (((aLong2351 + (long) anInt2358 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))
							&& (((long) i_10_ + l ^ 0xffffffffffffffffL) <= (aLong2351
									+ (long) anInt2358 ^ 0xffffffffffffffffL)))
						l_16_ = aLong2351 - -(long) anInt2358;
					else if (l - -(long) i_10_ > aLong2351
							&& (l - -(long) i_10_ <= aLong2351
									- -(long) anInt2358))
						l_16_ = (long) i_10_ + l;
					if ((l_15_ ^ 0xffffffffffffffffL) < 0L && l_15_ < l_16_) {
						int i_17_ = (int) (l_16_ + -l_15_);
						Class311.method1898(aByteArray2345,
								(int) (l_15_ - aLong2351), is, i_9_
										+ (int) (l_15_ - l), i_17_);
						if ((aLong2353 ^ 0xffffffffffffffffL) > (l_16_ ^ 0xffffffffffffffffL)) {
							i_7_ -= l_16_ - aLong2353;
							aLong2353 = l_16_;
						}
					}
				}
			} catch (IOException ioexception) {
				aLong2344 = -1L;
				throw ioexception;
			}
			if ((i_7_ ^ 0xffffffff) < -1)
				throw new EOFException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ij.J(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	private final void method1196(byte i) throws IOException {
		try {
			anInt2357++;
			if ((aLong2351 ^ 0xffffffffffffffffL) != 0L) {
				if ((aLong2344 ^ 0xffffffffffffffffL) != (aLong2351 ^ 0xffffffffffffffffL)) {
					aClass119_2350.method775(-103, aLong2351);
					aLong2344 = aLong2351;
				}
				aClass119_2350.method782(0, anInt2358, aByteArray2345, true);
				aLong2344 += (long) anInt2358;
				if (aLong2344 > aLong2359)
					aLong2359 = aLong2344;
				long l = -1L;
				long l_18_ = -1L;
				if (aLong2352 > aLong2351
						|| (((long) anInt2361 + aLong2352 ^ 0xffffffffffffffffL) >= (aLong2351 ^ 0xffffffffffffffffL))) {
					if (aLong2351 <= aLong2352
							&& (long) anInt2358 + aLong2351 > aLong2352)
						l = aLong2352;
				} else
					l = aLong2351;
				if (aLong2352 >= (long) anInt2358 + aLong2351
						|| ((long) anInt2358 + aLong2351 > aLong2352
								+ (long) anInt2361)) {
					if (aLong2352 + (long) anInt2361 > aLong2351
							&& (((long) anInt2361 + aLong2352 ^ 0xffffffffffffffffL) >= (aLong2351
									+ (long) anInt2358 ^ 0xffffffffffffffffL)))
						l_18_ = (long) anInt2361 + aLong2352;
				} else
					l_18_ = aLong2351 + (long) anInt2358;
				if (l > -1L && l < l_18_) {
					int i_19_ = (int) (l_18_ + -l);
					Class311.method1898(aByteArray2345, (int) (-aLong2351 + l),
							aByteArray2356, (int) (-aLong2352 + l), i_19_);
				}
				anInt2358 = 0;
				aLong2351 = -1L;
			}
			int i_20_ = 51 / ((-57 - i) / 52);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.F(" + i + ')');
		}
	}

	final void method1197(boolean bool) throws IOException {
		try {
			if (bool == true) {
				method1196((byte) 16);
				anInt2347++;
				aClass119_2350.method777(124);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.B(" + bool + ')');
		}
	}

	private final File method1198(int i) {
		try {
			anInt2341++;
			if (i != 1432962400)
				aLong2344 = 58L;
			return aClass119_2350.method781((byte) 112);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ij.G(" + i + ')');
		}
	}

	Class182(Class119 class119, int i, int i_21_) throws IOException {
		aLong2351 = -1L;
		try {
			aClass119_2350 = class119;
			aLong2360 = aLong2359 = class119.method776((byte) 69);
			aByteArray2345 = new byte[i_21_];
			aLong2353 = 0L;
			aByteArray2356 = new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ij.<init>("
					+ (class119 != null ? "{...}" : "null") + ',' + i + ','
					+ i_21_ + ')'));
		}
	}
}
