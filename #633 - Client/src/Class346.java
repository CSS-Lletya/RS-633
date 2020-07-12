/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class346 {
	static int anInt4586;
	private int[][] anIntArrayArray4587;
	static int anInt4588;
	private boolean[] aBoolArray4589;
	static Class183 aClass183_4590;
	private Class146 aClass146_4591;
	static int[][] anIntArrayArray4592 = { { 0, 1, 2, 3 }, { 1, -1, -1, 0 },
			{ -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 },
			{ 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 },
			{ -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 },
			{ 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
	static int anInt4593;
	private int anInt4594;
	static int anInt4595;

	final Class10 method2089(int i, int i_0_) {
		try {
			anInt4593++;
			byte[] is = aClass146_4591.method930(i, (byte) 112, i_0_);
			Class10 class10 = new Class10();
			class10.method119(-123, new Stream(is));
			return class10;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vj.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method2090(int i) {
		try {
			if (i >= 85) {
				anIntArrayArray4592 = null;
				aClass183_4590 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vj.A(" + i + ')');
		}
	}

	final boolean method2091(int i) {
		try {
			if (i != -22358)
				method2089(-40, 115);
			anInt4595++;
			if ((anInt4594 ^ 0xffffffff) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vj.D(" + i + ')');
		}
	}

	final int[] method2092(int i, byte i_1_) {
		try {
			anInt4586++;
			if (i < 0 || i >= anIntArrayArray4587.length) {
				if ((anInt4594 ^ 0xffffffff) != 0)
					return new int[] { anInt4594 };
				return new int[0];
			}
			if (!aBoolArray4589[i]
					|| (anIntArrayArray4587[i].length ^ 0xffffffff) >= -2)
				return anIntArrayArray4587[i];
			int i_2_ = anInt4594 == -1 ? 0 : 1;
			Random random = new Random();
			int[] is = new int[anIntArrayArray4587[i].length];
			Class311.method1896(anIntArrayArray4587[i], 0, is, 0, is.length);
			int i_3_ = i_2_;
			if (i_1_ != 79)
				return null;
			for (/**/; (i_3_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_3_++) {
				int i_4_ = (Class302.method1863(-i_2_ + is.length, random,
						(byte) -119) + i_2_);
				int i_5_ = is[i_3_];
				is[i_3_] = is[i_4_];
				is[i_4_] = i_5_;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vj.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class346(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_4591 = class146;
			aClass146_4591.method914(1, 0);
			Stream stream = new Stream(aClass146_4591.method930(0, (byte) 112,
					0));
			int i_6_ = stream.readUnsignedByte((byte) 35);
			if ((i_6_ ^ 0xffffffff) >= -4) {
				int i_7_ = stream.readUnsignedByte((byte) 35);
				Class9[] class9s = Class33.method290((byte) 108);
				boolean bool = true;
				if ((class9s.length ^ 0xffffffff) != (i_7_ ^ 0xffffffff))
					bool = false;
				else {
					for (int i_8_ = 0; class9s.length > i_8_; i_8_++) {
						int i_9_ = stream.readUnsignedByte((byte) 35);
						if (((Class9) class9s[i_8_]).anInt72 != i_9_) {
							bool = false;
							break;
						}
					}
				}
				if (bool) {
					int i_10_ = stream.readUnsignedByte((byte) 35);
					int i_11_ = stream.readUnsignedByte((byte) 35);
					if (i_6_ > 2)
						anInt4594 = stream.method2508((byte) 53);
					else
						anInt4594 = -1;
					aBoolArray4589 = new boolean[1 + i_11_];
					anIntArrayArray4587 = new int[i_11_ + 1][];
					for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
						int i_13_ = stream.readUnsignedByte((byte) 35);
						aBoolArray4589[i_13_] = (stream
								.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
						int i_14_ = stream.readUnsignedShort((byte) -65);
						if ((anInt4594 ^ 0xffffffff) != 0) {
							anIntArrayArray4587[i_13_] = new int[i_14_ + 1];
							anIntArrayArray4587[i_13_][0] = anInt4594;
							for (int i_15_ = 0; (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++)
								anIntArrayArray4587[i_13_][1 + i_15_] = stream
										.readUnsignedShort((byte) -65);
						} else {
							anIntArrayArray4587[i_13_] = new int[i_14_];
							for (int i_16_ = 0; (i_14_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++)
								anIntArrayArray4587[i_13_][i_16_] = stream
										.readUnsignedShort((byte) -65);
						}
					}
					for (int i_17_ = 0; (1 + i_11_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						if (anIntArrayArray4587[i_17_] == null) {
							if ((anInt4594 ^ 0xffffffff) == 0)
								anIntArrayArray4587[i_17_] = new int[0];
							else
								anIntArrayArray4587[i_17_] = new int[] { anInt4594 };
						}
					}
				} else {
					anIntArrayArray4587 = new int[0][];
					aBoolArray4589 = new boolean[0];
					anInt4594 = -1;
				}
			} else {
				anInt4594 = -1;
				aBoolArray4589 = new boolean[0];
				anIntArrayArray4587 = new int[0][];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vj.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass183_4590 = new Class183();
	}
}
