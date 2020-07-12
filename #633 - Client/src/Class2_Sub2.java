/* Class2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub2 extends Class2 {
	private IDirect3DPixelShader anIDirect3DPixelShader5335;
	private IDirect3DVertexShader anIDirect3DVertexShader5336;
	private Class163_Sub2_Sub2 aClass163_Sub2_Sub2_5337;
	private static float[] aFloatArray5338 = new float[16];
	private boolean aBool5339;
	private boolean aBool5340;
	private Class177 aClass177_5341;

	final void method72(boolean bool) {
		try {
			if (bool == true) {
				if (aBool5340) {
					IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
					idirect3ddevice.method3364(8,
							((Class2_Sub2) this).aClass163_Sub2_13.method3086(
									-20248, aFloatArray5338));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method67(byte i) {
		try {
			if (aBool5340) {
				aClass163_Sub2_Sub2_5337.method3776((byte) 72, null);
				aClass163_Sub2_Sub2_5337.method3770(-94, null);
				((Class2_Sub2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2_Sub2) this).aClass163_Sub2_13.method3094(null, -2);
				((Class2_Sub2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				((Class2_Sub2) this).aClass163_Sub2_13.method3094(null, -2);
				aBool5340 = false;
			}
			int i_0_ = -115 / ((-26 - i) / 56);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				method77((byte) -106);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method69(byte i) {
		try {
			if (i >= -111)
				aClass163_Sub2_Sub2_5337 = null;
			if (aBool5340) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_5337
						.method3081(54);
				idirect3ddevice.method3364(0,
						class33_sub2.method2758(49, aFloatArray5338));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method75(int i) {
		boolean bool;
		try {
			if (i <= 19)
				aBool5340 = false;
			bool = aBool5339;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method70(Interface15 interface15, int i, int i_1_) {
		try {
			if (i_1_ != 3)
				method75(-103);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method68(boolean bool, int i) {
		try {
			Interface12 interface12 = ((Class2_Sub2) this).aClass163_Sub2_13
					.method2972(22);
			if (aBool5339 && interface12 != null) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				aClass163_Sub2_Sub2_5337.method3776((byte) 106,
						anIDirect3DVertexShader5336);
				aClass163_Sub2_Sub2_5337.method3770(103,
						anIDirect3DPixelShader5335);
				((Class2_Sub2) this).aClass163_Sub2_13.method3073(1, (byte) 66);
				((Class2_Sub2) this).aClass163_Sub2_13.method3094(interface12,
						-2);
				((Class2_Sub2) this).aClass163_Sub2_13.method3073(0, (byte) 66);
				((Class2_Sub2) this).aClass163_Sub2_13.method3094(
						((Class177) aClass177_5341).anInterface17_2248, -2);
				aBool5340 = true;
				method76(64);
				method77((byte) -122);
				method72(true);
				method74(25411);
				idirect3ddevice
						.method3371(
								1,
								-(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloatArray7578[0]),
								-(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloatArray7578[1]),
								-(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloatArray7578[2]),
								0.0F);
				idirect3ddevice
						.method3371(
								2,
								(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloat7626),
								(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloat7613),
								(((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloat7633),
								1.0F);
				idirect3ddevice
						.method3371(
								3,
								(96.0F + (Math
										.abs(((Class163_Sub2) (((Class2_Sub2) this).aClass163_Sub2_13)).aFloatArray7578[1]) * 928.0F)),
								0.0F, 0.0F, 0.0F);
			}
			if (i > -64)
				aClass177_5341 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method78(int i, int i_2_, int i_3_) {
		try {
			if (i_2_ <= 91)
				method71(78, true);
			if (aBool5340) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				int i_4_ = 1 << (0x3 & i_3_);
				float f = (float) (1 << (0x7 & i_3_ >> 3)) / 32.0F;
				int i_5_ = 0xffff & i;
				float f_6_ = (float) (i >> 16 & 0x3) / 8.0F;
				idirect3ddevice
						.method3376(
								14,
								(float) (i_4_
										* (((Class163_Sub2) (((Class2_Sub2) this).aClass163_Sub2_13)).anInt7576) % 40000) / 40000.0F,
								0.0F, 0.0F, 0.0F);
				idirect3ddevice.method3376(15, f, 0.0F, 0.0F, 0.0F);
				idirect3ddevice.method3371(4, (float) i_5_, 0.0F, 0.0F, 0.0F);
				idirect3ddevice.method3371(5, f_6_, 0.0F, 0.0F, 0.0F);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method76(int i) {
		try {
			if (i != 64)
				aBool5339 = false;
			if (aBool5340) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_5337
						.method3024(-95);
				Class33_Sub2 class33_sub2_7_ = aClass163_Sub2_Sub2_5337
						.method3081(55);
				idirect3ddevice.method3364(0,
						class33_sub2_7_.method2758(-98, aFloatArray5338));
				idirect3ddevice.method3364(4,
						class33_sub2.method2764(-127, aFloatArray5338));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method74(int i) {
		try {
			if (aBool5340) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				if ((((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).anInt7600) <= 0)
					idirect3ddevice.method3376(16, 0.0F, 0.0F, 0.0F, 0.0F);
				else {
					float f = (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloat7632);
					float f_8_ = (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aFloat7607);
					idirect3ddevice.method3376(16, f, 1.0F / (-f_8_ + f), 0.0F,
							0.0F);
				}
				idirect3ddevice
						.method3371(
								0,
								(float) (0xff & (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).anInt7636) >> 16) / 255.0F,
								(float) ((((Class163_Sub2) (((Class2_Sub2) this).aClass163_Sub2_13)).anInt7636 >> 8) & 0xff) / 255.0F,
								(float) (0xff & (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).anInt7636)) / 255.0F,
								0.0F);
			}
			if (i != 25411)
				method72(false);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method77(byte i) {
		try {
			if (aBool5340) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = ((Class2_Sub2) this).aClass163_Sub2_13
						.method3087(false);
				idirect3ddevice.SetVertexShaderConstantF(12,
						class33_sub2.method2761((byte) 72, aFloatArray5338), 2);
			}
			if (i != -122)
				method70(null, -122, -88);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class2_Sub2(Class163_Sub2_Sub2 class163_sub2_sub2, Class146 class146,
			Class177 class177) {
		super(class163_sub2_sub2);
		try {
			aClass177_5341 = class177;
			aClass163_Sub2_Sub2_5337 = class163_sub2_sub2;
			if (null != class146
					&& (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aBool7549)
					&& (((Class163_Sub2) ((Class2_Sub2) this).aClass163_Sub2_13).aBool7612)
					&& 257 <= (0xffff & (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).aD3DCAPS9574.VertexShaderVersion))) {
				anIDirect3DVertexShader5336 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578
						.method3366(class146.method932("dx",
								"environment_mapped_water_v", 0)));
				anIDirect3DPixelShader5335 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_5337).anIDirect3DDevice9578
						.method3365(class146.method932("dx",
								"environment_mapped_water_f", 0)));
				aBool5339 = (anIDirect3DVertexShader5336 != null
						&& null != anIDirect3DPixelShader5335 && aClass177_5341
						.method1148(false));
			} else {
				aBool5339 = false;
				anIDirect3DVertexShader5336 = null;
				anIDirect3DPixelShader5335 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
