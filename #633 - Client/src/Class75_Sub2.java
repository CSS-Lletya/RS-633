/* Class75_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class75_Sub2 extends Class75 implements Interface9 {
	private int anInt7156;
	static int anInt7157;
	static int anInt7158;
	static int anInt7159;
	static Class213 aClass213_7160 = new Class213(8);
	static boolean aBool7161;
	static int anInt7162;
	static int anInt7163;

	public final int method30(int i) {
		try {
			int i_0_ = 62 / ((-70 - i) / 45);
			anInt7157++;
			return anInt7156;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qq.D(" + i + ')');
		}
	}

	public final void method31(int i, int i_1_, int i_2_, byte[] is) {
		try {
			if (i_1_ != 506)
				aClass213_7160 = null;
			this.method524(is, i);
			anInt7162++;
			anInt7156 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qq.E(" + i + ',' + i_1_ + ',' + i_2_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2916(Class248 class248) {
		if (Class11_Sub26.anInt6303 < 65535) {
			Class11_Sub46 class11_sub46 = ((Class248) class248).aClass11_Sub46_3357;
			Class309.aClass248Array4132[Class11_Sub26.anInt6303] = class248;
			Class232.aBoolArray3176[Class11_Sub26.anInt6303] = false;
			Class11_Sub26.anInt6303++;
			int i = ((Class248) class248).anInt3345;
			if (((Class248) class248).aBool3350)
				i = 0;
			int i_3_ = ((Class248) class248).anInt3345;
			if (((Class248) class248).aBool3342)
				i_3_ = Class155.anInt2044 - 1;
			for (int i_4_ = i; i_4_ <= i_3_; i_4_++) {
				int i_5_ = 0;
				int i_6_ = ((class11_sub46.method3204(true)
						- class11_sub46.method3208(-1) + Class19.anInt152) >> Class11_Sub2_Sub8.anInt8751);
				if (i_6_ < 0) {
					i_5_ -= i_6_;
					i_6_ = 0;
				}
				int i_7_ = ((class11_sub46.method3204(true)
						+ class11_sub46.method3208(-1) - Class19.anInt152) >> Class11_Sub2_Sub8.anInt8751);
				if (i_7_ >= Class82.anInt1133)
					i_7_ = Class82.anInt1133 - 1;
				for (int i_8_ = i_6_; i_8_ <= i_7_; i_8_++) {
					int i_9_ = ((Class248) class248).aShortArray3344[i_5_++];
					int i_10_ = (((class11_sub46.method3203(false)
							- class11_sub46.method3208(-1) + Class19.anInt152) >> Class11_Sub2_Sub8.anInt8751) + (i_9_ >>> 8));
					int i_11_ = i_10_ + (i_9_ & 0xff) - 1;
					if (i_10_ < 0)
						i_10_ = 0;
					if (i_11_ >= Class138.anInt1886)
						i_11_ = Class138.anInt1886 - 1;
					for (int i_12_ = i_10_; i_12_ <= i_11_; i_12_++) {
						long l = (Class216.aLongArrayArrayArray2995[i_4_][i_12_][i_8_]);
						if ((l & 0xffffL) == 0L)
							Class216.aLongArrayArrayArray2995[i_4_][i_12_][i_8_] = l
									| (long) Class11_Sub26.anInt6303;
						else if ((l & 0xffff0000L) == 0L)
							Class216.aLongArrayArrayArray2995[i_4_][i_12_][i_8_] = l
									| (long) Class11_Sub26.anInt6303 << 16;
						else if ((l & 0xffff00000000L) == 0L)
							Class216.aLongArrayArrayArray2995[i_4_][i_12_][i_8_] = l
									| (long) Class11_Sub26.anInt6303 << 32;
						else if ((l & ~0xffffffffffffL) == 0L)
							Class216.aLongArrayArrayArray2995[i_4_][i_12_][i_8_] = l
									| (long) Class11_Sub26.anInt6303 << 48;
					}
				}
			}
		}
	}

	public final int method32(int i) {
		try {
			int i_13_ = 22 / ((-32 - i) / 48);
			anInt7158++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qq.C(" + i + ')');
		}
	}

	public final long method33(byte i) {
		try {
			if (i != 42)
				aBool7161 = false;
			anInt7163++;
			return ((Class75) this).aBuffer1035.getAddress();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qq.F(" + i + ')');
		}
	}

	Class75_Sub2(Class163_Sub3 class163_sub3, int i, byte[] is, int i_14_) {
		super(class163_sub3, is, i_14_);
		try {
			anInt7156 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qq.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ',' + (is != null ? "{...}" : "null")
							+ ',' + i_14_ + ')'));
		}
	}

	static final void method2917(int i, byte i_15_, int i_16_,
			IComponentDefinitions class192) {
		try {
			anInt7159++;
			if (i_15_ > -25)
				aBool7161 = false;
			Class72 class72 = class192.method1254((byte) 125,
					Class321_Sub2.aClass163_6648);
			if (class72 != null) {
				Class321_Sub2.aClass163_6648
						.KA(i_16_,
								i,
								((IComponentDefinitions) class192).anInt2610
										+ i_16_,
								i
										- -((IComponentDefinitions) class192).anInt2546);
				if (Class2_Sub1.anInt5068 < 3)
					Class114.aClass253_1565
							.method1623(
									((float) ((IComponentDefinitions) class192).anInt2610 / 2.0F + (float) i_16_),
									((float) i + (float) ((IComponentDefinitions) class192).anInt2546 / 2.0F),
									4096,
									0xfffc & (int) -Class2_Sub8.aFloat6868 << 2,
									class72, i_16_, i);
				else
					Class321_Sub2.aClass163_6648
							.A(-16777216, class72, i_16_, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qq.G(" + i + ','
					+ i_15_ + ',' + i_16_ + ','
					+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	Class75_Sub2(Class163_Sub3 class163_sub3, int i, Buffer buffer) {
		super(class163_sub3, buffer);
		try {
			anInt7156 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qq.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (buffer != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2918(int i) {
		do {
			try {
				aClass213_7160 = null;
				if (i == 0)
					break;
				method2918(81);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qq.H(" + i + ')');
			}
			break;
		} while (false);
	}
}
