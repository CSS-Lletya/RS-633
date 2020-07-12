/* Class11_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub29 extends Class11 {
	int anInt6590;
	static Class11_Sub6_Sub2 aClass11_Sub6_Sub2_6591;
	int[] anIntArray6592;
	static int anInt6593;
	int anInt6594;
	int[][] anIntArrayArray6595;
	boolean[] aBoolArray6596;
	int[] anIntArray6597;
	static int anInt6598 = -2;

	static final void method2721(Class163 class163, int i, int i_0_, int i_1_,
			int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		Class87.aClass163_1210 = class163;
		Class68.anInt974 = i;
		Class376_Sub1.aBool5098 = Class68.anInt974 > 1
				&& Class87.aClass163_1210.method1049();
		Class11_Sub2_Sub8.anInt8751 = i_0_;
		Class376_Sub7_Sub3_Sub2.anInt10141 = 1 << Class11_Sub2_Sub8.anInt8751;
		Class19.anInt152 = Class376_Sub7_Sub3_Sub2.anInt10141 >> 1;
		Math.sqrt((double) (Class19.anInt152 * Class19.anInt152 + Class19.anInt152
				* Class19.anInt152));
		Class155.anInt2044 = i_1_;
		Class138.anInt1886 = i_2_;
		Class82.anInt1133 = i_3_;
		Class94_Sub4.anInt7730 = i_4_;
		InputStream_Sub2.aClass324_6947 = Class28_Sub1.method2724(22);
		Class359.method2132(-1);
		Class220_Sub1.aClass364ArrayArrayArray7155 = new Class364[i_1_][Class138.anInt1886][Class82.anInt1133];
		Class11_Sub2_Sub38.aClass12Array9796 = new Class12[i_1_];
		if (bool) {
			Class108_Sub26.anIntArrayArray7831 = new int[Class138.anInt1886][Class82.anInt1133];
			Class11_Sub39.aByteArrayArray7200 = new byte[Class138.anInt1886][Class82.anInt1133];
			Class11_Sub50_Sub2.aShortArrayArray9079 = new short[Class138.anInt1886][Class82.anInt1133];
			Class108_Sub6.aClass364ArrayArrayArray5627 = new Class364[1][Class138.anInt1886][Class82.anInt1133];
			Class234_Sub1_Sub1.aClass12Array9729 = new Class12[1];
		} else {
			Class108_Sub26.anIntArrayArray7831 = null;
			Class11_Sub39.aByteArrayArray7200 = null;
			Class11_Sub50_Sub2.aShortArrayArray9079 = null;
			Class108_Sub6.aClass364ArrayArrayArray5627 = null;
			Class234_Sub1_Sub1.aClass12Array9729 = null;
		}
		if (bool_5_) {
			Class216.aLongArrayArrayArray2995 = new long[i_1_][i_2_][i_3_];
			Class309.aClass248Array4132 = new Class248[65535];
			Class232.aBoolArray3176 = new boolean[65535];
			Class11_Sub26.anInt6303 = 0;
		} else {
			Class216.aLongArrayArrayArray2995 = null;
			Class309.aClass248Array4132 = null;
			Class232.aBoolArray3176 = null;
			Class11_Sub26.anInt6303 = 0;
		}
		Class11_Sub2_Sub9.method3471(false);
		Class382.aClass376_Sub7Array4971 = new Class376_Sub7[2];
		Class11_Sub2_Sub25.aClass376_Sub7Array9326 = new Class376_Sub7[2];
		Class11_Sub45_Sub4.aClass376_Sub7Array8534 = new Class376_Sub7[2];
		Class11_Sub28.aClass376_Sub7Array6568 = new Class376_Sub7[10000];
		Class12.anInt96 = 0;
		Class11_Sub2_Sub23.aClass376_Sub7Array9265 = new Class376_Sub7[5000];
		Class376_Sub7_Sub2_Sub1.anInt10206 = 0;
		Class286.aClass376_Sub7_Sub5Array3869 = new Class376_Sub7_Sub5[5000];
		Class174.anInt2226 = 0;
		Class11_Sub2_Sub19.aBoolArrayArray9091 = (new boolean[Class94_Sub4.anInt7730
				+ Class94_Sub4.anInt7730 + 1][Class94_Sub4.anInt7730
				+ Class94_Sub4.anInt7730 + 1]);
		Class106.aBoolArrayArray1426 = (new boolean[Class94_Sub4.anInt7730
				+ Class94_Sub4.anInt7730 + 2][Class94_Sub4.anInt7730
				+ Class94_Sub4.anInt7730 + 2]);
		Class68.anIntArray968 = new int[Class94_Sub4.anInt7730
				+ Class94_Sub4.anInt7730 + 2];
		Class206.aClass103_2779 = Class206.aClass103_2780;
		if (Class376_Sub1.aBool5098) {
			Class11_Sub2_Sub25.aBoolArrayArrayArray9331 = (new boolean[i_1_][Class94_Sub4.anInt7730
					+ Class94_Sub4.anInt7730 + 1][Class94_Sub4.anInt7730
					+ Class94_Sub4.anInt7730 + 1]);
			Class108_Sub13.aBoolArrayArrayArray6263 = new boolean[i_1_][][];
			if (Packet.aClass13Array8724 != null)
				Class11_Sub23_Sub2.method3751();
			Packet.aClass13Array8724 = new Class13[Class68.anInt974];
			Class87.aClass163_1210
					.method1024(Packet.aClass13Array8724.length + 1);
			Class87.aClass163_1210.method1050(0);
			for (int i_6_ = 0; i_6_ < Packet.aClass13Array8724.length; i_6_++) {
				Packet.aClass13Array8724[i_6_] = new Class13(i_6_ + 1,
						Class87.aClass163_1210);
				new Thread(Packet.aClass13Array8724[i_6_], "wr" + i_6_).start();
			}
			int i_7_;
			if (Class68.anInt974 == 2) {
				i_7_ = 4;
				Class205.anInt2763 = 2;
			} else if (Class68.anInt974 == 3) {
				i_7_ = 6;
				Class205.anInt2763 = 3;
			} else {
				i_7_ = 8;
				Class205.anInt2763 = 4;
			}
			Class376_Sub1_Sub1.aClass322Array8690 = new Class322[i_7_];
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				Class376_Sub1_Sub1.aClass322Array8690[i_8_] = new Class322(
						Class83.aStringArrayArray1137[Class68.anInt974 - 2][i_8_]);
		} else
			Class205.anInt2763 = 1;
		Class11_Sub45_Sub1_Sub2.anIntArray9878 = new int[Class205.anInt2763 - 1];
		Class2_Sub8.anIntArray6861 = new int[Class205.anInt2763 - 1];
	}

	public static void method2722(byte i) {
		try {
			if (i == -27)
				aClass11_Sub6_Sub2_6591 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jv.A(" + i + ')');
		}
	}

	static final void method2723(boolean bool, int i) {
		do {
			try {
				if (Class321_Sub2.aClass382_6641 == null)
					Class207.method1332(18429);
				anInt6593++;
				if (bool)
					Class321_Sub2.aClass382_6641.method2236((byte) 1);
				if (i < -109)
					break;
				method2723(true, 63);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jv.C(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub29(int i, byte[] is) {
		try {
			((Class11_Sub29) this).anInt6594 = i;
			Stream stream = new Stream(is);
			((Class11_Sub29) this).anInt6590 = stream
					.readUnsignedByte((byte) 35);
			((Class11_Sub29) this).anIntArray6597 = new int[((Class11_Sub29) this).anInt6590];
			((Class11_Sub29) this).aBoolArray6596 = new boolean[((Class11_Sub29) this).anInt6590];
			((Class11_Sub29) this).anIntArray6592 = new int[((Class11_Sub29) this).anInt6590];
			((Class11_Sub29) this).anIntArrayArray6595 = new int[((Class11_Sub29) this).anInt6590][];
			for (int i_9_ = 0; i_9_ < ((Class11_Sub29) this).anInt6590; i_9_++) {
				((Class11_Sub29) this).anIntArray6592[i_9_] = stream
						.readUnsignedByte((byte) 35);
				if (((Class11_Sub29) this).anIntArray6592[i_9_] == 6)
					((Class11_Sub29) this).anIntArray6592[i_9_] = 2;
			}
			for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (((Class11_Sub29) this).anInt6590 ^ 0xffffffff)); i_10_++)
				((Class11_Sub29) this).aBoolArray6596[i_10_] = (stream
						.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
			for (int i_11_ = 0; ((Class11_Sub29) this).anInt6590 > i_11_; i_11_++)
				((Class11_Sub29) this).anIntArray6597[i_11_] = stream
						.readUnsignedShort((byte) -65);
			for (int i_12_ = 0; ((((Class11_Sub29) this).anInt6590 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++)
				((Class11_Sub29) this).anIntArrayArray6595[i_12_] = new int[stream
						.readUnsignedByte((byte) 35)];
			for (int i_13_ = 0; ((Class11_Sub29) this).anInt6590 > i_13_; i_13_++) {
				for (int i_14_ = 0; i_14_ < (((Class11_Sub29) this).anIntArrayArray6595[i_13_]).length; i_14_++)
					((Class11_Sub29) this).anIntArrayArray6595[i_13_][i_14_] = stream
							.readUnsignedByte((byte) 35);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jv.<init>(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}
}
