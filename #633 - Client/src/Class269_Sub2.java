/* Class269_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class18;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;

final class Class269_Sub2 extends Class269 implements Interface7 {
	private IDirect3DTexture anIDirect3DTexture6202;
	boolean aBool6203;
	private int anInt6204;
	boolean aBool6205;
	private int anInt6206;

	public final float method22(byte i, float f) {
		float f_0_;
		try {
			int i_1_ = -120 % ((64 - i) / 52);
			f_0_ = f / (float) anInt6206;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f_0_;
	}

	public final void method46(Class34 class34, int i) {
		try {
			super.method46(class34, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final IDirect3DBaseTexture method1693(int i) {
		IDirect3DTexture idirect3dtexture;
		try {
			if (i != -4406)
				return null;
			idirect3dtexture = anIDirect3DTexture6202;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dtexture;
	}

	Class269_Sub2(Class163_Sub2_Sub2 class163_sub2_sub2, Class98 class98,
			Class366 class366, int i, int i_2_) {
		super(class163_sub2_sub2, class98, class366, false, i_2_ * i);
		try {
			if (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aBool9559) {
				anInt6206 = i;
				anInt6204 = i_2_;
			} else {
				anInt6206 = Class11_Sub2_Sub33.method3808(108, i);
				anInt6204 = Class11_Sub2_Sub33.method3808(114, i_2_);
			}
			anIDirect3DTexture6202 = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
					.method3374(i, i_2_, 1, 0, Class163_Sub2_Sub2.method3778(
							(((Class269_Sub2) this).aClass366_3647),
							(((Class269_Sub2) this).aClass98_3646), -107), 1));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method26(int i, boolean bool, boolean bool_3_) {
		try {
			((Class269_Sub2) this).aBool6205 = bool;
			((Class269_Sub2) this).aBool6203 = bool_3_;
			if (i != 28970)
				anInt6204 = 111;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean method24(int i) {
		boolean bool;
		try {
			if (i != -4111)
				return true;
			bool = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class269_Sub2(Class163_Sub2_Sub2 class163_sub2_sub2, Class98 class98,
			int i, int i_4_, boolean bool, byte[] is, int i_5_, int i_6_) {
		super(class163_sub2_sub2, class98, Class366.aClass366_4808, bool
				&& ((Class163_Sub2_Sub2) class163_sub2_sub2).aBool9569, i_4_
				* i);
		try {
			if (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aBool9559) {
				anInt6206 = i;
				anInt6204 = i_4_;
			} else {
				anInt6206 = Class11_Sub2_Sub33.method3808(110, i);
				anInt6204 = Class11_Sub2_Sub33.method3808(114, i_4_);
			}
			if (!bool)
				anIDirect3DTexture6202 = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3374(anInt6206, anInt6204, 1, 0,
								Class163_Sub2_Sub2.method3778(
										Class366.aClass366_4808,
										(((Class269_Sub2) this).aClass98_3646),
										-126), 1));
			else
				anIDirect3DTexture6202 = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3374(anInt6206, anInt6204, 0, 1024,
								Class163_Sub2_Sub2.method3778(
										Class366.aClass366_4808,
										(((Class269_Sub2) this).aClass98_3646),
										-119), 1));
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_7_ = anIDirect3DTexture6202.LockRect(0, 0, 0, i, i_4_, 0,
					pixelbuffer);
			if (Class18.method157(-83, i_7_)) {
				if ((i_6_ ^ 0xffffffff) == -1)
					i_6_ = i;
				i_6_ *= (((Class98) ((Class269_Sub2) this).aClass98_3646).anInt1306);
				i *= (((Class98) ((Class269_Sub2) this).aClass98_3646).anInt1306);
				int i_8_ = pixelbuffer.getRowPitch();
				if ((i_8_ ^ 0xffffffff) != (i ^ 0xffffffff)
						|| (i_6_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
					for (int i_9_ = 0; i_9_ < i_4_; i_9_++)
						pixelbuffer.method1(is, i_9_ * i_6_ + i_5_,
								i_9_ * i_8_, i);
				} else
					pixelbuffer.method1(is, i_5_, 0, i * i_4_);
				anIDirect3DTexture6202.UnlockRect(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int method29(byte i) {
		int i_10_;
		try {
			if (i > -2)
				return 51;
			i_10_ = anInt6204;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_10_;
	}

	public final float method28(boolean bool, float f) {
		float f_11_;
		try {
			if (bool != true)
				anInt6206 = -110;
			f_11_ = f / (float) anInt6204;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f_11_;
	}

	public final void method23(int i, Class98 class98, int i_12_, int i_13_,
			int i_14_, byte[] is, boolean bool, int i_15_, int i_16_) {
		try {
			if (class98 != ((Class269_Sub2) this).aClass98_3646
					|| (Class366.aClass366_4808 != ((Class269_Sub2) this).aClass366_3647))
				throw new RuntimeException();
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_17_ = anIDirect3DTexture6202.LockRect(0, i, i_13_, i_14_,
					i_12_, 0, pixelbuffer);
			if (Class18.method157(-118, i_17_)) {
				i_14_ *= (((Class98) ((Class269_Sub2) this).aClass98_3646).anInt1306);
				i_15_ *= (((Class98) ((Class269_Sub2) this).aClass98_3646).anInt1306);
				int i_18_ = pixelbuffer.getRowPitch();
				if ((i_18_ ^ 0xffffffff) != (i_14_ ^ 0xffffffff)
						|| i_14_ != i_15_) {
					for (int i_19_ = 0; i_12_ > i_19_; i_19_++)
						pixelbuffer.method1(is, i_16_ - -(i_15_ * i_19_), i_19_
								* i_18_, i_14_);
				} else
					pixelbuffer.method1(is, i_16_, 0, i_12_ * i_14_);
				anIDirect3DTexture6202.UnlockRect(0);
			}
			if (bool != true)
				method26(-61, false, true);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method25(int i, int i_20_, int[] is, int i_21_,
			boolean bool, int i_22_, int i_23_, int i_24_) {
		try {
			if (((Class269_Sub2) this).aClass98_3646 != Class364.aClass98_4774
					|| (Class366.aClass366_4808 != ((Class269_Sub2) this).aClass366_3647))
				throw new RuntimeException();
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_25_ = anIDirect3DTexture6202.LockRect(0, i_21_, i_24_, i_23_,
					i, 0, pixelbuffer);
			if (Class18.method157(-102, i_25_)) {
				int i_26_ = pixelbuffer.getRowPitch();
				if ((i_23_ * 4 ^ 0xffffffff) == (i_26_ ^ 0xffffffff)
						&& i_20_ == i_23_)
					pixelbuffer.method3398(is, i_22_, 0, i_23_ * i);
				else {
					for (int i_27_ = 0; (i ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++)
						pixelbuffer.method3398(is, i_22_ + i_27_ * i_20_, i_26_
								* i_27_, i_23_);
				}
				anIDirect3DTexture6202.UnlockRect(0);
			}
			if (bool != true)
				anInt6206 = -44;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method39(int i) {
		try {
			if (i == 20276)
				((Class269_Sub2) this).aClass163_Sub2_Sub2_3643.method3781(i
						+ -41376, this);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int method4(byte i) {
		int i_28_;
		try {
			if (i >= -57)
				anIDirect3DTexture6202 = null;
			i_28_ = anInt6206;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_28_;
	}

	Class269_Sub2(Class163_Sub2_Sub2 class163_sub2_sub2, int i, int i_29_,
			boolean bool, int[] is, int i_30_, int i_31_) {
		super(class163_sub2_sub2, Class364.aClass98_4774,
				Class366.aClass366_4808, bool
						&& ((Class163_Sub2_Sub2) class163_sub2_sub2).aBool9569,
				i_29_ * i);
		try {
			if (!((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aBool9559) {
				anInt6206 = Class11_Sub2_Sub33.method3808(110, i);
				anInt6204 = Class11_Sub2_Sub33.method3808(112, i_29_);
			} else {
				anInt6206 = i;
				anInt6204 = i_29_;
			}
			if (bool)
				anIDirect3DTexture6202 = ((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3374(anInt6206, anInt6204, 0, 1024, 21, 1);
			else
				anIDirect3DTexture6202 = ((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3374(anInt6206, anInt6204, 1, 0, 21, 1);
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_32_ = anIDirect3DTexture6202.LockRect(0, 0, 0, i, i_29_, 0,
					pixelbuffer);
			if (Class18.method157(-126, i_32_)) {
				if (0 == i_31_)
					i_31_ = i;
				int i_33_ = pixelbuffer.getRowPitch();
				if ((i_33_ ^ 0xffffffff) != (i * 4 ^ 0xffffffff)
						|| (i ^ 0xffffffff) != (i_31_ ^ 0xffffffff)) {
					for (int i_34_ = 0; i_34_ < i_29_; i_34_++)
						pixelbuffer.method3398(is, i_34_ * i_31_ + i_30_, i_33_
								* i_34_, i);
				} else
					pixelbuffer.method3398(is, i_30_, 0, i * i_29_);
				anIDirect3DTexture6202.UnlockRect(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method27(int i, int i_35_, int i_36_, int i_37_,
			int i_38_, int i_39_, int[] is) {
		try {
			if (((Class269_Sub2) this).aClass98_3646 != Class364.aClass98_4774
					|| (Class366.aClass366_4808 != ((Class269_Sub2) this).aClass366_3647))
				throw new RuntimeException();
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub2) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_40_ = anIDirect3DTexture6202.LockRect(0, i, i_38_, i_37_,
					i_35_, 16, pixelbuffer);
			if (Class18.method157(-124, i_40_)) {
				int i_41_ = pixelbuffer.getRowPitch();
				if (i_37_ * 4 == i_41_)
					pixelbuffer.method3397(is, i_36_, 0, is.length);
				else {
					for (int i_42_ = 0; i_42_ < i_35_; i_42_++)
						pixelbuffer.method3397(is, i_37_ * i_42_ + i_36_, i_41_
								* i_42_, i_37_);
				}
				anIDirect3DTexture6202.UnlockRect(0);
			}
			int i_43_ = 88 % ((16 - i_39_) / 62);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
