/* Class269_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class18;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;

final class Class269_Sub3 extends Class269 implements Interface12 {
	private int anInt8430;
	private IDirect3DCubeTexture anIDirect3DCubeTexture8431;

	public final void method39(int i) {
		try {
			((Class269_Sub3) this).aClass163_Sub2_Sub2_3643.method3779(7, this);
			if (i != 20276)
				anInt8430 = 87;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class269_Sub3(Class163_Sub2_Sub2 class163_sub2_sub2, int i, boolean bool,
			int[][] is) {
		super(class163_sub2_sub2, Class364.aClass98_4774,
				Class366.aClass366_4808, bool
						&& ((Class163_Sub2_Sub2) class163_sub2_sub2).aBool9561,
				i * (i * 6));
		try {
			anInt8430 = i;
			if (!((Class269_Sub3) this).aBool3644)
				anIDirect3DCubeTexture8431 = ((Class163_Sub2_Sub2) ((Class269_Sub3) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3363(anInt8430, 1, 0, 21, 1);
			else
				anIDirect3DCubeTexture8431 = ((Class163_Sub2_Sub2) ((Class269_Sub3) this).aClass163_Sub2_Sub2_3643).anIDirect3DDevice9578
						.method3363(anInt8430, 0, 1024, 21, 1);
			PixelBuffer pixelbuffer = (((Class163_Sub2_Sub2) ((Class269_Sub3) this).aClass163_Sub2_Sub2_3643).aPixelBuffer9560);
			for (int i_0_ = 0; 6 > i_0_; i_0_++) {
				int i_1_ = anIDirect3DCubeTexture8431.LockRect(i_0_, 0, 0, 0,
						anInt8430, anInt8430, 0, pixelbuffer);
				if (Class18.method157(-92, i_1_)) {
					int i_2_ = pixelbuffer.getRowPitch();
					if (i_2_ != anInt8430 * 4) {
						for (int i_3_ = 0; i_3_ < anInt8430; i_3_++)
							pixelbuffer.method3398(is[i_0_], i_3_ * anInt8430,
									i_3_ * i_2_, anInt8430);
					} else
						pixelbuffer.method3398(is[i_0_], 0, 0, anInt8430
								* anInt8430);
					anIDirect3DCubeTexture8431.UnlockRect(i_0_, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method46(Class34 class34, int i) {
		try {
			super.method46(class34, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final IDirect3DBaseTexture method1693(int i) {
		IDirect3DCubeTexture idirect3dcubetexture;
		try {
			if (i != -4406)
				return null;
			idirect3dcubetexture = anIDirect3DCubeTexture8431;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dcubetexture;
	}
}
