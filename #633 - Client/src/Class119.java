/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import jaggl.OpenGL;

final class Class119 {
	private long aLong1609;
	static int anInt1610;
	private RandomAccessFile aRandomAccessFile1611;
	static int anInt1612;
	static int anInt1613;
	static int anInt1614;
	static int anInt1615;
	static int anInt1616;
	static int anInt1617;
	private long aLong1618;
	static int anInt1619 = 1338;
	static int anInt1620;
	static int anInt1621;
	private File aFile1622;
	static int anInt1623;
	static int anInt1624;

	protected final void finalize() throws Throwable {
		try {
			if (aRandomAccessFile1611 != null) {
				System.out
						.println("Warning! fileondisk "
								+ aFile1622
								+ " not closed correctly using close(). Auto-closing instead. ");
				method777(126);
			}
			anInt1614++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sga.finalize(" + ')');
		}
	}

	final void method775(int i, long l) throws IOException {
		do {
			try {
				anInt1620++;
				aRandomAccessFile1611.seek(l);
				aLong1618 = l;
				if (i <= -84)
					break;
				method781((byte) -59);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "sga.F(" + i + ','
						+ l + ')');
			}
			break;
		} while (false);
	}

	final long method776(byte i) throws IOException {
		try {
			if (i != 69)
				return 57L;
			anInt1621++;
			return aRandomAccessFile1611.length();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sga.A(" + i + ')');
		}
	}

	final void method777(int i) throws IOException {
		try {
			anInt1612++;
			if (aRandomAccessFile1611 != null) {
				aRandomAccessFile1611.close();
				aRandomAccessFile1611 = null;
			}
			int i_0_ = -1 / ((69 - i) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sga.H(" + i + ')');
		}
	}

	static final void method778(int i,
			Actor class376_sub7_sub5_sub5, int i_1_) {
		try {
			anInt1616++;
			int i_2_ = -1;
			int i_3_ = 0;
			if ((((Actor) class376_sub7_sub5_sub5).anInt10315 ^ 0xffffffff) >= (Class11_Sub25.anInt6279 ^ 0xffffffff)) {
				if ((((Actor) class376_sub7_sub5_sub5).anInt10330) >= Class11_Sub25.anInt6279)
					Class149.method947((byte) -120, class376_sub7_sub5_sub5);
				else {
					Class376_Sub7_Sub2_Sub1.method3934(false, (byte) 59,
							class376_sub7_sub5_sub5);
					i_2_ = Class67.anInt950;
					i_3_ = Class85.anInt1171;
				}
			} else
				Class254_Sub3.method3237((byte) 75, class376_sub7_sub5_sub5);
			if (i != -18081)
				method778(37, null, -87);
			if ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 ^ 0xffffffff) > -513
					|| ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 < 512
					|| ((512 * (-1 + Class300.anInt4051) ^ 0xffffffff) >= (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 ^ 0xffffffff))
					|| (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 >= -512
							+ 512 * Class108_Sub12.anInt6228)) {
				((Actor) class376_sub7_sub5_sub5).anInt10330 = 0;
				((Actor) class376_sub7_sub5_sub5).anInt10315 = 0;
				i_2_ = -1;
				((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
				((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
				((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
				((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
				i_3_ = 0;
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = (512 * ((Actor) class376_sub7_sub5_sub5).anIntArray10370[0] + 256 * class376_sub7_sub5_sub5
						.method3968((byte) 127));
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = ((((Actor) class376_sub7_sub5_sub5).anIntArray10376[0]) * 512 + class376_sub7_sub5_sub5
						.method3968((byte) 127) * 256);
				class376_sub7_sub5_sub5.method3967(-876801394);
			}
			if ((class376_sub7_sub5_sub5 == Class11_Sub2_Sub8.myPlayer)
					&& ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 ^ 0xffffffff) > -6145
							|| (((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 < 6144)
							|| (Class300.anInt4051 * 512 - 6144 <= ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045) || ((((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 ^ 0xffffffff) <= (-6144
							+ 512 * Class108_Sub12.anInt6228 ^ 0xffffffff)))) {
				((Actor) class376_sub7_sub5_sub5).anInt10315 = 0;
				((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
				((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
				((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
				((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
				i_2_ = -1;
				((Actor) class376_sub7_sub5_sub5).anInt10330 = 0;
				i_3_ = 0;
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = ((((Actor) class376_sub7_sub5_sub5).anIntArray10370[0]) * 512 - -(class376_sub7_sub5_sub5
						.method3968((byte) 127) * 256));
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = ((((Actor) class376_sub7_sub5_sub5).anIntArray10376[0]) * 512 + 256 * class376_sub7_sub5_sub5
						.method3968((byte) 127));
				class376_sub7_sub5_sub5.method3967(i + -876783313);
			}
			int i_4_ = Class344
					.method2086(class376_sub7_sub5_sub5, (byte) -105);
			Class120.method783(class376_sub7_sub5_sub5, (byte) 127);
			Class327.method1985(i_3_, i_4_, i + 18082, i_2_,
					class376_sub7_sub5_sub5);
			Class251_Sub2.method2379(i_2_, class376_sub7_sub5_sub5, -1);
			Class270.method1695(false, class376_sub7_sub5_sub5);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sga.B(" + i + ','
					+ (class376_sub7_sub5_sub5 != null ? "{...}" : "null")
					+ ',' + i_1_ + ')'));
		}
	}

	static final void method779(int i, int i_5_, int i_6_, float[] fs,
			int i_7_, int i_8_, int i_9_) {
		try {
			anInt1623++;
			if ((i_6_ ^ 0xffffffff) < -1
					&& !Class261.method1669(i_6_, (byte) 97))
				throw new IllegalArgumentException("");
			if ((i_9_ ^ 0xffffffff) < -1
					&& !Class261.method1669(i_9_, (byte) 88))
				throw new IllegalArgumentException("");
			int i_10_ = Class58_Sub1_Sub1.method3584(i, true);
			if (i_5_ <= 12)
				method779(-91, -31, 32, null, 126, -57, 2);
			int i_11_ = 0;
			int i_12_ = i_9_ > i_6_ ? i_6_ : i_9_;
			int i_13_ = i_6_ >> 1;
			int i_14_ = i_9_ >> 1;
			float[] fs_15_ = fs;
			float[] fs_16_ = new float[i_10_ * i_14_ * i_13_];
			for (;;) {
				OpenGL.glTexImage2Df(i_7_, i_11_, i_8_, i_6_, i_9_, 0, i, 5126,
						fs_15_, 0);
				if ((i_12_ ^ 0xffffffff) >= -2)
					break;
				int i_17_ = i_6_ * i_10_;
				for (int i_18_ = 0; i_18_ < i_10_; i_18_++) {
					int i_19_ = i_18_;
					int i_20_ = i_18_;
					int i_21_ = i_17_ + i_20_;
					for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff); i_22_++) {
						for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_23_++) {
							float f = fs_15_[i_20_];
							i_20_ += i_10_;
							f += fs_15_[i_20_];
							f += fs_15_[i_21_];
							i_20_ += i_10_;
							i_21_ += i_10_;
							f += fs_15_[i_21_];
							i_21_ += i_10_;
							fs_16_[i_19_] = f * 0.25F;
							i_19_ += i_10_;
						}
						i_21_ += i_17_;
						i_20_ += i_17_;
					}
				}
				float[] fs_24_ = fs_16_;
				fs_16_ = fs_15_;
				fs_15_ = fs_24_;
				i_6_ = i_13_;
				i_9_ = i_14_;
				i_11_++;
				i_14_ >>= 1;
				i_13_ >>= 1;
				i_12_ >>= 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sga.E(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + (fs != null ? "{...}" : "null")
					+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	Class119(File file, String string, long l) throws IOException {
		try {
			if (l == -1L)
				l = 9223372036854775807L;
			if ((l ^ 0xffffffffffffffffL) > (file.length() ^ 0xffffffffffffffffL))
				file.delete();
			aRandomAccessFile1611 = new RandomAccessFile(file, string);
			aFile1622 = file;
			aLong1618 = 0L;
			aLong1609 = l;
			int i = aRandomAccessFile1611.read();
			if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
				aRandomAccessFile1611.seek(0L);
				aRandomAccessFile1611.write(i);
			}
			aRandomAccessFile1611.seek(0L);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sga.<init>("
					+ (file != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + l + ')'));
		}
	}

	final int method780(int i, byte i_25_, int i_26_, byte[] is)
			throws IOException {
		try {
			anInt1613++;
			int i_27_ = 115 % ((-6 - i_25_) / 40);
			int i_28_ = aRandomAccessFile1611.read(is, i, i_26_);
			if ((i_28_ ^ 0xffffffff) < -1)
				aLong1618 += (long) i_28_;
			return i_28_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sga.G(" + i + ','
					+ i_25_ + ',' + i_26_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final File method781(byte i) {
		try {
			if (i != 112)
				method779(76, -104, 101, null, -79, -71, -17);
			anInt1624++;
			return aFile1622;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "sga.C(" + i + ')');
		}
	}

	final void method782(int i, int i_29_, byte[] is, boolean bool)
			throws IOException {
		try {
			anInt1615++;
			if ((long) i_29_ + aLong1618 > aLong1609) {
				aRandomAccessFile1611.seek(aLong1609);
				aRandomAccessFile1611.write(1);
				throw new EOFException();
			}
			if (bool != true)
				aLong1618 = -117L;
			aRandomAccessFile1611.write(is, i, i_29_);
			aLong1618 += (long) i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("sga.D(" + i + ','
					+ i_29_ + ',' + (is != null ? "{...}" : "null") + ','
					+ bool + ')'));
		}
	}
}
