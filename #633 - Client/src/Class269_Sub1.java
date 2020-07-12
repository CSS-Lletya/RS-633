/* Class269_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class18;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;

final class Class269_Sub1 extends Class269 implements Interface17 {
	private int anInt5677;
	private int anInt5678;
	private IDirect3DVolumeTexture anIDirect3DVolumeTexture5679;
	private int anInt5680;

	public final void method39(int i) {
		try {
			if (i == 20276)
				((Class269_Sub1) this).aClass163_Sub2_Sub2_3643.method3772(
						(byte) 71, this);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final IDirect3DBaseTexture method1693(int i) {
		IDirect3DVolumeTexture idirect3dvolumetexture;
		try {
			if (i != -4406)
				anIDirect3DVolumeTexture5679 = null;
			idirect3dvolumetexture = anIDirect3DVolumeTexture5679;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvolumetexture;
	}

	Class269_Sub1(Class163_Sub2_Sub2 class163_sub2_sub2, Class98 class98,
			int i, int i_0_, int i_1_, byte[] is) {
		super(class163_sub2_sub2, class98, Class366.aClass366_4808, false, i_1_
				* (i * i_0_));
		try {
			anInt5680 = i_1_;
			anInt5677 = i;
			anInt5678 = i_0_;
			anIDirect3DVolumeTexture5679 = (((Class163_Sub2_Sub2) ((Class269_Sub1) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
					.method3372(i, i_0_, i_1_, 1, 0, Class163_Sub2_Sub2
							.method3778(
									(((Class269_Sub1) this).aClass366_3647),
									class98, -63), 1));
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub1) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			int i_2_ = anIDirect3DVolumeTexture5679.LockBox(0, 0, 0, 0, i,
					i_0_, i_1_, 0, pixelbuffer);
			if (Class18.method157(-110, i_2_)) {
				int i_3_ = ((((Class98) ((Class269_Sub1) this).aClass98_3646).anInt1306) * anInt5677);
				int i_4_ = anInt5678 * i_3_;
				int i_5_ = pixelbuffer.getSlicePitch();
				if (i_4_ == i_5_)
					pixelbuffer.method1(is, 0, 0, anInt5678 * i_3_ * anInt5680);
				else {
					int i_6_ = pixelbuffer.getRowPitch();
					if ((i_6_ ^ 0xffffffff) != (i_3_ ^ 0xffffffff)) {
						for (int i_7_ = 0; i_7_ < anInt5680; i_7_++) {
							for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (anInt5678 ^ 0xffffffff)); i_8_++)
								pixelbuffer.method1(is, i_4_ * i_7_
										- -(i_3_ * i_8_), i_5_ * i_7_ + i_6_
										* i_8_, i_3_);
						}
					} else {
						for (int i_9_ = 0; i_9_ < anInt5680; i_9_++)
							pixelbuffer.method1(is, i_9_ * i_4_, i_9_ * i_5_,
									i_4_);
					}
				}
				anIDirect3DVolumeTexture5679.UnlockBox(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method46(Class34 class34, int i) {
		try {
			super.method46(class34, i + 0);
			if (i != -21969)
				method46(null, -98);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
