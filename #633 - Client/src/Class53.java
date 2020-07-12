/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class53 {
	static int anInt813;
	static int anInt814;
	static int anInt815;
	static Class150 aClass150_816 = new Class150();
	static int anInt817 = 0;

	static final Class342 method438(boolean bool, Class146 class146, byte i,
			String string) {
		try {
			anInt815++;
			int i_0_ = class146.method920(112, string);
			if ((i_0_ ^ 0xffffffff) == 0)
				return new Class342(0);
			if (i >= -53)
				method439(-122);
			int[] is = class146.method907(i_0_, 0);
			Class342 class342 = new Class342(is.length);
			int i_1_ = 0;
			int i_2_ = 0;
			while (i_1_ < ((Class342) class342).anInt4539) {
				Stream stream = new Stream(class146.method930(is[i_2_++],
						(byte) 112, i_0_));
				int i_3_ = stream.readInt(100);
				int i_4_ = stream.readUnsignedShort((byte) -65);
				int i_5_ = stream.readUnsignedByte((byte) 35);
				if (!bool && (i_5_ ^ 0xffffffff) == -2)
					((Class342) class342).anInt4539--;
				else {
					((Class342) class342).anIntArray4533[i_1_] = i_3_;
					((Class342) class342).anIntArray4534[i_1_] = i_4_;
					i_1_++;
				}
			}
			return class342;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wda.D(" + bool + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method439(int i) {
		do {
			try {
				aClass150_816 = null;
				if (i == 1844)
					break;
				method440(50, -6, -13, -49, -82, -24, -6, -45);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wda.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method440(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_) {
		try {
			anInt813++;
			int i_13_ = i_6_ - -i_11_;
			int i_14_ = i_8_ + -i_11_;
			for (int i_15_ = i_6_; (i_15_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff); i_15_++)
				Class11_Sub2_Sub32_Sub1.method3883(i_7_,
						(Class297.anIntArrayArray4026[i_15_]), (byte) 93, i,
						i_10_);
			for (int i_16_ = i_8_; (i_14_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_16_--)
				Class11_Sub2_Sub32_Sub1.method3883(i_7_,
						(Class297.anIntArrayArray4026[i_16_]), (byte) 72, i,
						i_10_);
			int i_17_ = i_7_ - -i_11_;
			int i_18_ = i_10_ - i_11_;
			if (i_12_ != 18397)
				method439(13);
			for (int i_19_ = i_13_; (i_19_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff); i_19_++) {
				int[] is = Class297.anIntArrayArray4026[i_19_];
				Class11_Sub2_Sub32_Sub1.method3883(i_7_, is, (byte) 111, i,
						i_17_);
				Class11_Sub2_Sub32_Sub1.method3883(i_17_, is, (byte) 106, i_9_,
						i_18_);
				Class11_Sub2_Sub32_Sub1.method3883(i_18_, is, (byte) 52, i,
						i_10_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wda.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final void method441(int i) {
		Class11_Sub45_Sub7.anInt8803 = i;
		for (int i_20_ = 0; i_20_ < Class138.anInt1886; i_20_++) {
			for (int i_21_ = 0; i_21_ < Class82.anInt1133; i_21_++) {
				if (Class181.aClass364ArrayArrayArray2336[i][i_20_][i_21_] == null)
					Class181.aClass364ArrayArrayArray2336[i][i_20_][i_21_] = new Class364(
							i);
			}
		}
	}

	static final void method442(String string, int i) {
		try {
			anInt814++;
			if (!string.equals("")) {
				if (i <= 26)
					method442(null, 84);
				Class376_Sub7_Sub3.anInt9277++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						Class11_Sub15.aClass370_5605, (byte) 66);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(Class98.method660(string, 0), -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				Class79.method541(class11_sub10, -8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wda.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
