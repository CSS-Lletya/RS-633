/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class130 {
	int anInt1800;
	static int anInt1801;
	private byte[] aByteArray1802;
	int[][] anIntArrayArray1803;
	int[] anIntArray1804;
	static int anInt1805;
	Class67[] aClass67Array1806;
	int[] anIntArray1807;
	Class67 aClass67_1808;
	int anInt1809;
	int anInt1810;
	int[] anIntArray1811;
	int[] anIntArray1812;
	int[] anIntArray1813;
	int anInt1814;
	int[] anIntArray1815;
	static int anInt1816;
	int[][] anIntArrayArray1817;
	byte[][] aByteArrayArray1818;
	static int anInt1819;
	static Class191 aClass191_1820 = new Class191();
	static int anInt1821;

	static final void method842(boolean bool) {
		do {
			try {
				anInt1801++;
				Class153.aFont2026 = null;
				Class11_Sub45_Sub10.anImage8960 = null;
				if (bool == false)
					break;
				method845(true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eg.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final void method843(boolean bool, boolean bool_0_,
			IComponentDefinitions class192) {
		do {
			try {
				anInt1805++;
				int i = ((((IComponentDefinitions) class192).anInt2522 ^ 0xffffffff) == -1 ? ((IComponentDefinitions) class192).anInt2610
						: ((IComponentDefinitions) class192).anInt2522);
				if (bool_0_ != true)
					aClass191_1820 = null;
				int i_1_ = (((IComponentDefinitions) class192).anInt2484 == 0 ? ((IComponentDefinitions) class192).anInt2546
						: ((IComponentDefinitions) class192).anInt2484);
				Class300.method1854(
						(byte) -112,
						(Class11_Sub45_Sub5.aClass192ArrayArray8772[((IComponentDefinitions) class192).anInt2471 >> 16]),
						i_1_, ((IComponentDefinitions) class192).anInt2471,
						bool, i);
				if (((IComponentDefinitions) class192).aClass192Array2524 != null)
					Class300.method1854(
							(byte) -127,
							(((IComponentDefinitions) class192).aClass192Array2524),
							i_1_, ((IComponentDefinitions) class192).anInt2471,
							bool, i);
				Class11_Sub24 class11_sub24 = ((Class11_Sub24) (Class75_Sub2.aClass213_7160
						.method1369(
								(byte) 26,
								(long) ((IComponentDefinitions) class192).anInt2471)));
				if (class11_sub24 == null)
					break;
				Class2_Sub7.method2610(i_1_, true,
						(((Class11_Sub24) class11_sub24).anInt6233), i, bool);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("eg.B(" + bool
						+ ',' + bool_0_ + ','
						+ (class192 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final String method844(int i, byte[] is) {
		try {
			anInt1816++;
			if (i > -105)
				anInt1821 = -89;
			return Class11_Sub45_Sub20_Sub2.method3941(is, 0, 63, is.length);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eg.E(" + i + ','
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method845(boolean bool) {
		try {
			if (bool == true)
				aClass191_1820 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eg.D(" + bool + ')');
		}
	}

	private final void method846(byte[] is, boolean bool) {
		do {
			try {
				anInt1819++;
				Stream stream = new Stream(Class58_Sub1.method2950(is, bool));
				int i = stream.readUnsignedByte((byte) 35);
				if ((i ^ 0xffffffff) > -6 || (i ^ 0xffffffff) < -7)
					throw new RuntimeException();
				if (i >= 6)
					((Class130) this).anInt1814 = stream.readInt(105);
				else
					((Class130) this).anInt1814 = 0;
				int i_2_ = stream.readUnsignedByte((byte) 35);
				boolean bool_3_ = (0x1 & i_2_) != 0;
				((Class130) this).anInt1800 = stream
						.readUnsignedShort((byte) -65);
				boolean bool_4_ = (i_2_ & 0x2) != 0;
				int i_5_ = 0;
				int i_6_ = -1;
				((Class130) this).anIntArray1815 = new int[((Class130) this).anInt1800];
				for (int i_7_ = 0; ((((Class130) this).anInt1800 ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
					((Class130) this).anIntArray1815[i_7_] = i_5_ += stream
							.readUnsignedShort((byte) -65);
					if ((i_6_ ^ 0xffffffff) > (((Class130) this).anIntArray1815[i_7_] ^ 0xffffffff))
						i_6_ = ((Class130) this).anIntArray1815[i_7_];
				}
				((Class130) this).anInt1810 = i_6_ + 1;
				if (bool_4_)
					((Class130) this).aByteArrayArray1818 = new byte[((Class130) this).anInt1810][];
				((Class130) this).anIntArrayArray1817 = new int[((Class130) this).anInt1810][];
				((Class130) this).anIntArray1813 = new int[((Class130) this).anInt1810];
				((Class130) this).anIntArray1807 = new int[((Class130) this).anInt1810];
				((Class130) this).anIntArray1804 = new int[((Class130) this).anInt1810];
				((Class130) this).anIntArray1811 = new int[((Class130) this).anInt1810];
				if (bool_3_) {
					((Class130) this).anIntArray1812 = new int[((Class130) this).anInt1810];
					for (int i_8_ = 0; ((((Class130) this).anInt1810 ^ 0xffffffff) < (i_8_ ^ 0xffffffff)); i_8_++)
						((Class130) this).anIntArray1812[i_8_] = -1;
					for (int i_9_ = 0; ((((Class130) this).anInt1800 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)); i_9_++)
						((Class130) this).anIntArray1812[((Class130) this).anIntArray1815[i_9_]] = stream
								.readInt(101);
					((Class130) this).aClass67_1808 = new Class67(
							((Class130) this).anIntArray1812);
				}
				for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (((Class130) this).anInt1800 ^ 0xffffffff)); i_10_++)
					((Class130) this).anIntArray1804[(((Class130) this).anIntArray1815[i_10_])] = stream
							.readInt(105);
				if (bool_4_) {
					for (int i_11_ = 0; ((Class130) this).anInt1800 > i_11_; i_11_++) {
						byte[] is_12_ = new byte[64];
						stream.readBytes(is_12_, 4, 64, 0);
						((Class130) this).aByteArrayArray1818[((Class130) this).anIntArray1815[i_11_]] = is_12_;
					}
				}
				for (int i_13_ = 0; ((Class130) this).anInt1800 > i_13_; i_13_++)
					((Class130) this).anIntArray1813[(((Class130) this).anIntArray1815[i_13_])] = stream
							.readInt(124);
				for (int i_14_ = 0; ((Class130) this).anInt1800 > i_14_; i_14_++)
					((Class130) this).anIntArray1807[(((Class130) this).anIntArray1815[i_14_])] = stream
							.readUnsignedShort((byte) -65);
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (((Class130) this).anInt1800 ^ 0xffffffff)); i_15_++) {
					int i_16_ = ((Class130) this).anIntArray1815[i_15_];
					int i_17_ = ((Class130) this).anIntArray1807[i_16_];
					i_5_ = 0;
					((Class130) this).anIntArrayArray1817[i_16_] = new int[i_17_];
					int i_18_ = -1;
					for (int i_19_ = 0; (i_17_ ^ 0xffffffff) < (i_19_ ^ 0xffffffff); i_19_++) {
						int i_20_ = (((Class130) this).anIntArrayArray1817[i_16_][i_19_] = i_5_ += stream
								.readUnsignedShort((byte) -65));
						if ((i_20_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
							i_18_ = i_20_;
					}
					((Class130) this).anIntArray1811[i_16_] = 1 + i_18_;
					if (1 + i_18_ == i_17_)
						((Class130) this).anIntArrayArray1817[i_16_] = null;
				}
				if (!bool_3_)
					break;
				((Class130) this).aClass67Array1806 = new Class67[1 + i_6_];
				((Class130) this).anIntArrayArray1803 = new int[i_6_ + 1][];
				for (int i_21_ = 0; ((((Class130) this).anInt1800 ^ 0xffffffff) < (i_21_ ^ 0xffffffff)); i_21_++) {
					int i_22_ = ((Class130) this).anIntArray1815[i_21_];
					int i_23_ = ((Class130) this).anIntArray1807[i_22_];
					((Class130) this).anIntArrayArray1803[i_22_] = new int[((Class130) this).anIntArray1811[i_22_]];
					for (int i_24_ = 0; ((i_24_ ^ 0xffffffff) > (((Class130) this).anIntArray1811[i_22_] ^ 0xffffffff)); i_24_++)
						((Class130) this).anIntArrayArray1803[i_22_][i_24_] = -1;
					for (int i_25_ = 0; i_23_ > i_25_; i_25_++) {
						int i_26_;
						if (((Class130) this).anIntArrayArray1817[i_22_] == null)
							i_26_ = i_25_;
						else
							i_26_ = (((Class130) this).anIntArrayArray1817[i_22_][i_25_]);
						((Class130) this).anIntArrayArray1803[i_22_][i_26_] = stream
								.readInt(99);
					}
					((Class130) this).aClass67Array1806[i_22_] = new Class67(
							((Class130) this).anIntArrayArray1803[i_22_]);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("eg.A("
						+ (is != null ? "{...}" : "null") + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	Class130(byte[] is, int i, byte[] is_27_) {
		try {
			((Class130) this).anInt1809 = Class11_Sub23.method2572(is.length,
					(byte) 28, is);
			if (i != ((Class130) this).anInt1809)
				throw new RuntimeException();
			if (is_27_ != null) {
				if ((is_27_.length ^ 0xffffffff) != -65)
					throw new RuntimeException();
				aByteArray1802 = Class91_Sub3_Sub1.method3652(is, is.length,
						62, 0);
				for (int i_28_ = 0; i_28_ < 64; i_28_++) {
					if ((aByteArray1802[i_28_] ^ 0xffffffff) != (is_27_[i_28_] ^ 0xffffffff))
						throw new RuntimeException();
				}
			}
			method846(is, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eg.<init>("
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (is_27_ != null ? "{...}" : "null") + ')'));
		}
	}
}
