/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;

abstract class Class269 {
	Class163_Sub2_Sub2 aClass163_Sub2_Sub2_3643;
	boolean aBool3644;
	Class34 aClass34_3645 = Class301.aClass34_4059;
	Class98 aClass98_3646;
	Class366 aClass366_3647;

	abstract IDirect3DBaseTexture method1693(int i);

	void method46(Class34 class34, int i) {
		try {
			((Class269) this).aClass34_3645 = class34;
			if (i != -21969)
				method1693(-39);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class269(Class163_Sub2_Sub2 class163_sub2_sub2, Class98 class98,
			Class366 class366, boolean bool, int i) {
		try {
			((Class269) this).aBool3644 = bool;
			((Class269) this).aClass98_3646 = class98;
			((Class269) this).aClass163_Sub2_Sub2_3643 = class163_sub2_sub2;
			((Class269) this).aClass366_3647 = class366;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
