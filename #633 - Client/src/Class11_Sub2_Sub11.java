/* Class11_Sub2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub11 extends Class11_Sub2 {
	static int anInt8855 = 0;
	static int anInt8856;
	static int anInt8857;
	static boolean aBool8858 = false;
	private int anInt8859;
	private int anInt8860;
	static int anInt8861;
	private int anInt8862;
	static int anInt8863;

	final int[][] method2255(int i, int i_0_) {
		try {
			anInt8856++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int[] is_1_ = is[0];
				int[] is_2_ = is[1];
				int[] is_3_ = is[2];
				for (int i_4_ = 0; i_4_ < Class33_Sub2.anInt6696; i_4_++) {
					is_1_[i_4_] = anInt8860;
					is_2_[i_4_] = anInt8859;
					is_3_[i_4_] = anInt8862;
				}
			}
			if (i_0_ != 1)
				method2255(21, -71);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dg.I(" + i + ','
					+ i_0_ + ')');
		}
	}

	private Class11_Sub2_Sub11(int i) {
		super(0, false);
		try {
			method3479((byte) -106, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dg.<init>(" + i + ')');
		}
	}

	private final void method3479(byte i, int i_5_) {
		try {
			anInt8862 = (i_5_ & 0xff) << 4;
			anInt8860 = (0xff0000 & i_5_) >> 12;
			if (i >= -62)
				anInt8861 = 107;
			anInt8857++;
			anInt8859 = 0xff0 & i_5_ >> 4;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dg.C(" + i + ','
					+ i_5_ + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_6_) {
		try {
			int i_7_ = i_6_;
			if (i_7_ == 0)
				method3479((byte) -109, stream.method2558(false));
			if (i == 3731)
				anInt8863++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dg.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_6_ + ')'));
		}
	}

	public Class11_Sub2_Sub11() {
		this(0);
	}
}
