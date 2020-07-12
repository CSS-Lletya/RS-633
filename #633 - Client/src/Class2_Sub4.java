/* Class2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub4 extends Class2 {
	private static float[] aFloatArray5481 = new float[16];
	private Class163_Sub2_Sub2 aClass163_Sub2_Sub2_5482;
	private IDirect3DVertexShader anIDirect3DVertexShader5483;
	private Class177 aClass177_5484;

	final void method72(boolean bool) {
		try {
			if (null != anIDirect3DVertexShader5483) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
				idirect3ddevice.method3364(4,
						((Class2_Sub4) this).aClass163_Sub2_13.method3086(
								-20248, aFloatArray5481));
			}
			if (bool != true)
				method78(32, 39, 37);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method74(int i) {
		try {
			if (anIDirect3DVertexShader5483 != null) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
				if ((((Class163_Sub2) ((Class2_Sub4) this).aClass163_Sub2_13).anInt7600) <= 0)
					idirect3ddevice.method3376(10, 0.0F, 0.0F, 0.0F, 0.0F);
				else {
					float f = (((Class163_Sub2) ((Class2_Sub4) this).aClass163_Sub2_13).aFloat7632);
					float f_0_ = (((Class163_Sub2) ((Class2_Sub4) this).aClass163_Sub2_13).aFloat7607);
					float f_1_ = -512.0F + f_0_;
					idirect3ddevice.method3376(10, f_1_, 1.0F / (f_0_ - f_1_),
							f_0_, 1.0F / (-f_0_ + f));
				}
				((Class2_Sub4) this).aClass163_Sub2_13
						.method3062(
								true,
								(((Class163_Sub2) ((Class2_Sub4) this).aClass163_Sub2_13).anInt7636));
			}
			if (i != 25411)
				method69((byte) -18);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method71(int i, boolean bool) {
		try {
			((Class2_Sub4) this).aClass163_Sub2_13.method3013(i - 5516,
					Class11_Sub2_Sub19.aClass314_9092, Class380.aClass314_4960);
			if (i != 5486)
				aFloatArray5481 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method77(byte i) {
		try {
			if (i != -122)
				aFloatArray5481 = null;
			if (null != anIDirect3DVertexShader5483) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = ((Class2_Sub4) this).aClass163_Sub2_13
						.method3087(false);
				class33_sub2.method2761((byte) 42, aFloatArray5481);
				aFloatArray5481[6] *= 0.25F;
				aFloatArray5481[4] *= 0.25F;
				aFloatArray5481[0] *= 0.25F;
				aFloatArray5481[3] *= 0.25F;
				aFloatArray5481[1] *= 0.25F;
				aFloatArray5481[5] *= 0.25F;
				aFloatArray5481[7] *= 0.25F;
				aFloatArray5481[2] *= 0.25F;
				idirect3ddevice.SetVertexShaderConstantF(8, aFloatArray5481, 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method69(byte i) {
		try {
			if (i >= -111)
				method76(-82);
			if (null != anIDirect3DVertexShader5483) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_5482
						.method3081(90);
				idirect3ddevice.method3364(0,
						class33_sub2.method2758(-89, aFloatArray5481));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method78(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ < 91)
				method70(null, -88, -15);
			IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
			if (!((Class177) aClass177_5484).aBool2243) {
				int i_4_ = (((Class163_Sub2) ((Class2_Sub4) this).aClass163_Sub2_13).anInt7576) % 4000 * 16 / 4000;
				((Class2_Sub4) this).aClass163_Sub2_13
						.method3094(
								((Class177) aClass177_5484).anInterface7Array2240[i_4_],
								-2);
				idirect3ddevice.method3376(11, 0.0F, 0.0F, 0.0F, 0.0F);
			} else {
				float f = (float) (((Class163_Sub2) (((Class2_Sub4) this).aClass163_Sub2_13)).anInt7576 % 4000) / 4000.0F;
				((Class2_Sub4) this).aClass163_Sub2_13.method3094(
						((Class177) aClass177_5484).anInterface17_2247, -2);
				idirect3ddevice.method3376(11, f, 0.0F, 0.0F, 0.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class2_Sub4(Class163_Sub2_Sub2 class163_sub2_sub2, Class146 class146,
			Class177 class177) {
		super(class163_sub2_sub2);
		try {
			aClass163_Sub2_Sub2_5482 = class163_sub2_sub2;
			aClass177_5484 = class177;
			if (null == class146
					|| !aClass177_5484.method1149(-30571)
					|| -258 < ((0xffff & (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).aD3DCAPS9574.VertexShaderVersion)) ^ 0xffffffff))
				anIDirect3DVertexShader5483 = null;
			else
				anIDirect3DVertexShader5483 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578
						.method3366(class146.method932("dx",
								"transparent_water", 0)));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method76(int i) {
		try {
			if (anIDirect3DVertexShader5483 != null) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5482).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_5482
						.method3081(i ^ 0x18);
				idirect3ddevice.method3364(0,
						class33_sub2.method2758(56, aFloatArray5481));
			}
			if (i != 64)
				method75(-98);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method75(int i) {
		boolean bool;
		try {
			if (i < 19)
				return false;
			bool = anIDirect3DVertexShader5483 != null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method68(boolean bool, int i) {
		try {
			((Class2_Sub4) this).aClass163_Sub2_13.method3095((byte) -119,
					Class11_Sub45_Sub12.aClass218_9187, 0);
			((Class2_Sub4) this).aClass163_Sub2_13.method3095((byte) -82,
					Class68.aClass218_962, 1);
			((Class2_Sub4) this).aClass163_Sub2_13.method3089(true,
					Class345.aClass218_4579, 2, false, false);
			((Class2_Sub4) this).aClass163_Sub2_13.method3055(false, (byte) 20);
			aClass163_Sub2_Sub2_5482.method3776((byte) 111,
					anIDirect3DVertexShader5483);
			if (i >= -64)
				method67((byte) -57);
			method69((byte) -118);
			method77((byte) -122);
			method72(true);
			method74(25411);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method67(byte i) {
		try {
			aClass163_Sub2_Sub2_5482.method3776((byte) 119, null);
			((Class2_Sub4) this).aClass163_Sub2_13.method3095((byte) -106,
					Class11_Sub45_Sub12.aClass218_9187, 0);
			((Class2_Sub4) this).aClass163_Sub2_13.method3095((byte) -96,
					Class345.aClass218_4579, 1);
			int i_5_ = 53 / ((-26 - i) / 56);
			((Class2_Sub4) this).aClass163_Sub2_13.method3095((byte) -93,
					Class68.aClass218_962, 2);
			((Class2_Sub4) this).aClass163_Sub2_13.method3055(true, (byte) 20);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method70(Interface15 interface15, int i, int i_6_) {
		try {
			if (i_6_ != 3)
				aClass163_Sub2_Sub2_5482 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
