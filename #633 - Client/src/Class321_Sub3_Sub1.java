/* Class321_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class321_Sub3_Sub1 extends Class321_Sub3 {
	static int anInt9252 = 0;
	float aFloat9253;
	int anInt9254;
	float aFloat9255;
	static int anInt9256;
	boolean aBool9257;
	static int anInt9258;
	int anInt9259;
	static int anInt9260;
	static IncomingPacket aClass160_9261 = new IncomingPacket(56, 4);
	static int anInt9262;

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_0_, int i_1_,
			boolean bool, int[] is, int i_2_, int i_3_) {
		super(class163_sub3, i, 6408, i_0_, i_1_, bool, is, i_2_, i_3_, true);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_1_;
			((Class321_Sub3_Sub1) this).anInt9259 = i_0_;
			if ((((Class321) this).anInt4302 ^ 0xffffffff) != -34038) {
				((Class321_Sub3_Sub1) this).aBool9257 = true;
				((Class321_Sub3_Sub1) this).aFloat9255 = ((Class321_Sub3_Sub1) this).aFloat9253 = 1.0F;
			} else {
				((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_0_;
				((Class321_Sub3_Sub1) this).aBool9257 = false;
				((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_1_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ll.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + bool
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_4_, int i_5_,
			int i_6_, int i_7_, boolean bool) {
		super(class163_sub3, i, i_4_, i_5_, i_6_, i_7_);
		try {
			do {
				if (((Class321) this).anInt4302 != 34037) {
					((Class321_Sub3_Sub1) this).aFloat9255 = ((Class321_Sub3_Sub1) this).aFloat9253 = 1.0F;
					((Class321_Sub3_Sub1) this).aBool9257 = true;
					if (!client.aBool10531)
						break;
				}
				((Class321_Sub3_Sub1) this).aBool9257 = false;
				((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_6_;
				((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_7_;
			} while (false);
			((Class321_Sub3_Sub1) this).anInt9259 = i_6_;
			((Class321_Sub3_Sub1) this).anInt9254 = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ll.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ','
					+ bool + ')'));
		}
	}

	static final boolean method3613(byte i, int i_8_, int i_9_) {
		try {
			if (i > -6)
				return true;
			anInt9260++;
			if ((i_8_ ^ 0xffffffff) > -1
					|| i_9_ < 0
					|| (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1].length <= i_8_)
					|| (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_8_]).length <= i_9_)
				return false;
			if (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_8_][i_9_] & 0x2) ^ 0xffffffff) != -1)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ll.P(" + i + ','
					+ i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final void method3614(boolean bool, int i) {
		try {
			if (i != -14543)
				method3614(true, -114);
			anInt9262++;
			Class2_Sub7.method2610(Class153.anInt2025, true,
					Class365.anInt4797, Class11_Sub36.anInt7079, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ll.O(" + bool + ','
					+ i + ')');
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_10_,
			int i_11_, int i_12_, int i_13_, int i_14_, boolean bool) {
		super(class163_sub3, 3553, i, i_10_, i_13_, i_14_);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_12_;
			((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_12_
					/ (float) i_14_;
			((Class321_Sub3_Sub1) this).aBool9257 = false;
			((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_11_
					/ (float) i_13_;
			((Class321_Sub3_Sub1) this).anInt9259 = i_11_;
			this.method2855(false, false, 127);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ll.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_
					+ ',' + i_14_ + ',' + bool + ')'));
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_15_,
			int i_16_, int i_17_, boolean bool, byte[] is, int i_18_) {
		super(class163_sub3, i, i_15_, i_16_, i_17_, bool, is, i_18_, true);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_17_;
			((Class321_Sub3_Sub1) this).anInt9259 = i_16_;
			if ((((Class321) this).anInt4302 ^ 0xffffffff) == -34038) {
				((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_17_;
				((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_16_;
				((Class321_Sub3_Sub1) this).aBool9257 = false;
			} else {
				((Class321_Sub3_Sub1) this).aFloat9255 = ((Class321_Sub3_Sub1) this).aFloat9253 = 1.0F;
				((Class321_Sub3_Sub1) this).aBool9257 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("ll.<init>("
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ','
							+ bool + ',' + (is != null ? "{...}" : "null")
							+ ',' + i_18_ + ')'));
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_19_,
			int i_20_, int i_21_, int i_22_, byte[] is, int i_23_) {
		super(class163_sub3, 3553, i, i_21_, i_22_);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_20_;
			((Class321_Sub3_Sub1) this).anInt9259 = i_19_;
			this.method2856(i_19_, true, 0, false, i_23_, is, 0, i_20_, 0, 0);
			((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_20_
					/ (float) i_22_;
			((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_19_
					/ (float) i_21_;
			((Class321_Sub3_Sub1) this).aBool9257 = false;
			this.method2855(false, false, 85);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("ll.<init>("
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ','
							+ i_22_ + ',' + (is != null ? "{...}" : "null")
							+ ',' + i_23_ + ')'));
		}
	}

	public static void method3615(int i) {
		try {
			int i_24_ = 43 / ((-48 - i) / 49);
			aClass160_9261 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ll.R(" + i + ')');
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_25_,
			int i_26_, int i_27_, int[] is) {
		super(class163_sub3, 3553, 6408, i_26_, i_27_);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_25_;
			((Class321_Sub3_Sub1) this).anInt9259 = i;
			this.method2850(0, 0, is, true, i, 0, -126, 0, i_25_);
			((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_25_
					/ (float) i_27_;
			((Class321_Sub3_Sub1) this).aBool9257 = false;
			((Class321_Sub3_Sub1) this).aFloat9255 = (float) i / (float) i_26_;
			this.method2855(false, false, 91);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ll.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_25_ + ',' + i_26_ + ',' + i_27_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final boolean method3616(int i, byte i_28_) {
		try {
			if (i_28_ != -88)
				return false;
			anInt9256++;
			if (i < 4 || i > 8)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ll.Q(" + i + ','
					+ i_28_ + ')');
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_29_,
			int i_30_, int i_31_) {
		super(class163_sub3, i, i_29_, i_30_, i_31_);
		try {
			((Class321_Sub3_Sub1) this).anInt9254 = i_31_;
			do {
				if (((Class321) this).anInt4302 != 34037) {
					((Class321_Sub3_Sub1) this).aBool9257 = true;
					((Class321_Sub3_Sub1) this).aFloat9255 = ((Class321_Sub3_Sub1) this).aFloat9253 = 1.0F;
					if (!client.aBool10531)
						break;
				}
				((Class321_Sub3_Sub1) this).aBool9257 = false;
				((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_30_;
				((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_31_;
			} while (false);
			((Class321_Sub3_Sub1) this).anInt9259 = i_30_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ll.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ')'));
		}
	}

	Class321_Sub3_Sub1(Class163_Sub3 class163_sub3, int i, int i_32_,
			int i_33_, int i_34_, int i_35_) {
		super(class163_sub3, 3553, i, i_34_, i_35_);
		try {
			((Class321_Sub3_Sub1) this).aBool9257 = false;
			((Class321_Sub3_Sub1) this).anInt9259 = i_32_;
			((Class321_Sub3_Sub1) this).anInt9254 = i_33_;
			((Class321_Sub3_Sub1) this).aFloat9255 = (float) i_32_
					/ (float) i_34_;
			((Class321_Sub3_Sub1) this).aFloat9253 = (float) i_33_
					/ (float) i_35_;
			this.method2855(false, false, 95);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ll.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_
							+ ',' + i_35_ + ')'));
		}
	}
}
