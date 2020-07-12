/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class212 {
	private int anInt2867;
	private int anInt2868;
	private int anInt2869;
	private int anInt2870;
	private int anInt2871;
	private int anInt2872;
	static int anInt2873;
	private int anInt2874;
	static int anInt2875;
	static int anInt2876;
	private int anInt2877;
	private int anInt2878;
	private int anInt2879;
	static int anInt2880;
	static int[] anIntArray2881 = new int[50];
	static int anInt2882;

	final boolean method1358(int i, int i_0_, int i_1_, byte i_2_) {
		try {
			anInt2873++;
			if (i_1_ < anInt2871 || i_1_ > anInt2879)
				return false;
			if (i_0_ < anInt2878 || anInt2868 < i_0_)
				return false;
			int i_3_ = -128 / ((i_2_ - 2) / 63);
			if (anInt2869 > i || anInt2867 < i)
				return false;
			int i_4_ = -anInt2874 + i_1_;
			int i_5_ = i - anInt2877;
			if ((anInt2872 ^ 0xffffffff) >= (i_4_ * i_4_ - -(i_5_ * i_5_) ^ 0xffffffff))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kj.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1359(String string, String string_6_, int i,
			boolean bool, int i_7_) {
		do {
			try {
				anInt2875++;
				Class11_Sub10 class11_sub10 = Class11_Sub45_Sub6
						.method3441(-104);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(
								((Class289) Class11_Sub37.aClass289_7098).opcode,
								-1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-117, 0);
				int i_8_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-114, 633);
				int[] is = Class292.method1814(9108, class11_sub10);
				int i_9_ = (((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-112, Class53.anInt817);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string_6_);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeLong((byte) -103, Class118.aLong1607);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(Class11_Sub45_Sub1_Sub2.anInt9884,
								-1528071456);
				if (i_7_ != 18703)
					method1362(100, -66);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(((Class66) Class198.aClass66_2679).anInt945,
								-1528071456);
				Class83.method573(
						(((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397),
						(byte) 111);
				String string_10_ = Class11_Sub2_Sub1.aString8438;
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(string_10_ != null ? 1 : 0, -1528071456);
				if (string_10_ != null)
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.writeString((byte) 27, string_10_);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(i, -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(!bool ? 0 : 1, i_7_ + -1528090159);
				((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position += 7;
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.encryptXTEA(
								((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position,
								is, 106, i_9_);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.endPacketVarShort(
								-i_8_
										+ ((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).position,
								(byte) -87);
				Class79.method541(class11_sub10, -125);
				Class313.anInt4162 = 1;
				Class255.anInt3503 = 0;
				Class207.anInt2800 = 0;
				Class108_Sub6.anInt5632 = -3;
				if ((i ^ 0xffffffff) <= -14)
					break;
				Class239_Sub1.aBool7267 = true;
				Class253_Sub2.method2703((byte) -66);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kj.B("
						+ (string != null ? "{...}" : "null") + ','
						+ (string_6_ != null ? "{...}" : "null") + ',' + i
						+ ',' + bool + ',' + i_7_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1360(int i, int i_11_, int i_12_, int i_13_, int i_14_,
			int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		try {
			anInt2877 = i_20_;
			anInt2876++;
			anInt2872 = i_14_ * i_14_;
			anInt2874 = i_19_;
			anInt2870 = i;
			if (i_15_ != 633)
				method1358(28, 92, 100, (byte) -44);
			anInt2878 = i_12_ + anInt2870;
			anInt2869 = i_17_ + anInt2877;
			anInt2879 = anInt2874 - -i_13_;
			anInt2868 = i_16_ + anInt2870;
			anInt2871 = i_18_ + anInt2874;
			anInt2867 = anInt2877 + i_11_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kj.A(" + i + ','
					+ i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ','
					+ i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ','
					+ i_19_ + ',' + i_20_ + ')'));
		}
	}

	public static void method1361(boolean bool) {
		try {
			if (bool != false)
				method1362(117, 37);
			anIntArray2881 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kj.E(" + bool + ')');
		}
	}

	Class212(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_,
			int i_26_, int i_27_, int i_28_, int i_29_) {
		try {
			anInt2874 = i;
			anInt2877 = i_22_;
			anInt2870 = i_21_;
			anInt2872 = i_23_ * i_23_;
			anInt2868 = i_27_ + anInt2870;
			anInt2879 = i_25_ + anInt2874;
			anInt2869 = i_28_ + anInt2877;
			anInt2878 = anInt2870 + i_26_;
			anInt2867 = i_29_ + anInt2877;
			anInt2871 = anInt2874 - -i_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kj.<init>(" + i + ','
					+ i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ','
					+ i_29_ + ')'));
		}
	}

	static final int method1362(int i, int i_30_) {
		try {
			if (i != 2)
				return 56;
			anInt2880++;
			if ((i_30_ ^ 0xffffffff) > -97)
				return 0;
			if ((i_30_ ^ 0xffffffff) > -129)
				return 2;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kj.D(" + i + ','
					+ i_30_ + ')');
		}
	}
}
