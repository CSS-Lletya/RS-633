/* Class239_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class239_Sub2 extends Class239 implements Interface9 {
	static long aLong7909 = -1L;
	private int anInt7910;
	static int anInt7911;
	static int anInt7912;
	static int anInt7913;
	static int anInt7914;
	static int anInt7915;
	static int anInt7916;
	static int anInt7917;
	static int anInt7918;
	static int anInt7919;

	Class239_Sub2(Class163_Sub3 class163_sub3, int i, byte[] is, int i_0_,
			boolean bool) {
		super(class163_sub3, 34962, is, i_0_, bool);
		try {
			anInt7910 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vb.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ bool + ')'));
		}
	}

	static final void method3189(int i, int i_1_, int i_2_) {
		do {
			try {
				if ((i_1_ ^ 0xffffffff) != (Class33_Sub2.anInt6696 ^ 0xffffffff)) {
					Class208.anIntArray2808 = new int[i_1_];
					for (int i_3_ = 0; i_1_ > i_3_; i_3_++)
						Class208.anIntArray2808[i_3_] = (i_3_ << 12) / i_1_;
					Class33_Sub2.anInt6696 = i_1_;
					Class11_Sub50_Sub1.anInt8843 = 32 * i_1_;
					Class297.anInt4024 = i_1_ - 1;
				}
				anInt7919++;
				if (i != -11775)
					method3190(60);
				if (Class29.anInt398 == i_2_)
					break;
				if (i_2_ == Class33_Sub2.anInt6696)
					Class171.anIntArray2199 = Class208.anIntArray2808;
				else {
					Class171.anIntArray2199 = new int[i_2_];
					for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
						Class171.anIntArray2199[i_4_] = (i_4_ << 12) / i_2_;
				}
				Class29.anInt398 = i_2_;
				Class11_Sub45_Sub16_Sub2.anInt10167 = i_2_ - 1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vb.B(" + i + ','
						+ i_1_ + ',' + i_2_ + ')'));
			}
			break;
		} while (false);
	}

	public final void method31(int i, int i_5_, int i_6_, byte[] is) {
		try {
			this.method1518(true, i, is);
			if (i_5_ != 506)
				method31(-66, -85, -112, null);
			anInt7918++;
			anInt7910 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("vb.E(" + i + ',' + i_5_ + ',' + i_6_ + ','
							+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3190(int i) {
		do {
			try {
				anInt7917++;
				if (Class11_Sub2_Sub24.aClass347_9284 != Class11_Sub30_Sub1.aClass347_8979) {
					try {
						Class36.method311("tbrefresh", 102,
								Class11_Sub2_Sub23.aclient9263);
						if (i <= -120)
							break;
						method3190(-95);
					} catch (Throwable throwable) {
						/* empty */
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vb.A(" + i + ')');
			}
		} while (false);
	}

	final void method1520(byte i) {
		do {
			try {
				((Class239) this).aClass163_Sub3_3249.method3290(this, false);
				anInt7916++;
				if (i > 33)
					break;
				aLong7909 = -123L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vb.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public final long method33(byte i) {
		try {
			if (i != 42)
				return 103L;
			anInt7913++;
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vb.F(" + i + ')');
		}
	}

	public final int method32(int i) {
		try {
			anInt7914++;
			int i_7_ = -108 % ((i + 32) / 48);
			return ((Class239) this).anInt3248;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vb.C(" + i + ')');
		}
	}

	Class239_Sub2(Class163_Sub3 class163_sub3, int i, Buffer buffer, int i_8_,
			boolean bool) {
		super(class163_sub3, 34962, buffer, i_8_, bool);
		try {
			anInt7910 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vb.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (buffer != null ? "{...}" : "null") + ',' + i_8_
					+ ',' + bool + ')'));
		}
	}

	public final int method30(int i) {
		try {
			int i_9_ = -27 / ((-70 - i) / 45);
			anInt7911++;
			return anInt7910;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vb.D(" + i + ')');
		}
	}
}
