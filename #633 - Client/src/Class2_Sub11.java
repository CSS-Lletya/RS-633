/* Class2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub11 extends Class2 {
	private Interface7 anInterface7_7932;
	private IDirect3DVertexShader anIDirect3DVertexShader7933;
	private IDirect3DVertexShader anIDirect3DVertexShader7934;
	private boolean aBool7935;
	private static float[] aFloatArray7936;
	private IDirect3DVertexShader anIDirect3DVertexShader7937;
	private static float[] aFloatArray7938 = new float[4];
	private IDirect3DVertexShader anIDirect3DVertexShader7939;
	private IDirect3DVertexShader anIDirect3DVertexShader7940;
	private boolean aBool7941 = false;
	private Class163_Sub2_Sub2 aClass163_Sub2_Sub2_7942;
	private boolean aBool7943;

	final void method67(byte i) {
		try {
			((Class2_Sub11) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			((Class2_Sub11) this).aClass163_Sub2_13.method3094(null, -2);
			((Class2_Sub11) this).aClass163_Sub2_13.method3013(-30,
					Class188.aClass314_2424, Class188.aClass314_2424);
			((Class2_Sub11) this).aClass163_Sub2_13.method3095((byte) -45,
					Class11_Sub45_Sub12.aClass218_9187, 0);
			((Class2_Sub11) this).aClass163_Sub2_13.method3095((byte) -102,
					Class68.aClass218_962, 2);
			((Class2_Sub11) this).aClass163_Sub2_13.method2993(
					Class11_Sub45_Sub12.aClass218_9187, 0, 256);
			((Class2_Sub11) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			if (aBool7941) {
				((Class2_Sub11) this).aClass163_Sub2_13.method3095((byte) -90,
						Class11_Sub45_Sub12.aClass218_9187, 0);
				((Class2_Sub11) this).aClass163_Sub2_13.method2993(
						Class11_Sub45_Sub12.aClass218_9187, 0, 256);
				aBool7941 = false;
			}
			int i_0_ = -41 / ((-26 - i) / 56);
			if (null != anIDirect3DVertexShader7933) {
				aClass163_Sub2_Sub2_7942.method3776((byte) 72, null);
				anIDirect3DVertexShader7933 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method78(int i, int i_1_, int i_2_) {
		try {
			if (i_1_ <= 91)
				anIDirect3DVertexShader7937 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method74(int i) {
		try {
			if (i != 25411)
				method74(21);
			if (anIDirect3DVertexShader7933 != null) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
				int i_3_ = ((Class2_Sub11) this).aClass163_Sub2_13.XA();
				int i_4_ = ((Class2_Sub11) this).aClass163_Sub2_13.i();
				float f = (float) i_3_ - (float) (i_3_ + -i_4_) * 0.125F;
				float f_5_ = (float) i_3_ - (float) (-i_4_ + i_3_) * 0.25F;
				idirect3ddevice.method3376(10, f_5_, 1.0F / (f - f_5_), f,
						1.0F / ((float) i_3_ - f));
				idirect3ddevice
						.method3376(
								11,
								1.0F / (float) ((Class2_Sub11) this).aClass163_Sub2_13
										.method3077((byte) -126),
								(float) ((Class2_Sub11) this).aClass163_Sub2_13
										.method2971(i ^ ~0x6360) / 255.0F,
								(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7632),
								1.0F / (-((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7607 + (((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7632)));
				((Class2_Sub11) this).aClass163_Sub2_13.method3062(true,
						((Class2_Sub11) this).aClass163_Sub2_13.method3074(3));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method72(boolean bool) {
		try {
			if (anIDirect3DVertexShader7933 != null) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
				idirect3ddevice.method3364(4,
						((Class2_Sub11) this).aClass163_Sub2_13.method3086(
								-20248, aFloatArray7936));
			}
			if (bool != true)
				method75(-64);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class2_Sub11(Class163_Sub2_Sub2 class163_sub2_sub2, Class146 class146) {
		super(class163_sub2_sub2);
		try {
			aClass163_Sub2_Sub2_7942 = class163_sub2_sub2;
			if (class146 != null
					&& ((((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).aD3DCAPS9574.VertexShaderVersion) & 0xffff) >= 257) {
				anIDirect3DVertexShader7937 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578
						.method3366(class146.method932("dx", "uw_ground_unlit",
								0)));
				anIDirect3DVertexShader7934 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578
						.method3366(class146
								.method932("dx", "uw_ground_lit", 0)));
				anIDirect3DVertexShader7939 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578
						.method3366(class146.method932("dx", "uw_model_unlit",
								0)));
				anIDirect3DVertexShader7940 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578
						.method3366(class146.method932("dx", "uw_model_lit", 0)));
				if (null != anIDirect3DVertexShader7939
						& (null != anIDirect3DVertexShader7934 & anIDirect3DVertexShader7937 != null)
						& null != anIDirect3DVertexShader7940) {
					anInterface7_7932 = (((Class2_Sub11) this).aClass163_Sub2_13
							.method3075(1, new int[] { 0, -1 }, false, 2, false));
					anInterface7_7932.method26(28970, false, false);
					aBool7943 = true;
				} else
					aBool7943 = false;
			} else
				aBool7943 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method77(byte i) {
		try {
			if (i != -122)
				anInterface7_7932 = null;
			if (null != anIDirect3DVertexShader7933) {
				IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
				Class33_Sub2 class33_sub2 = ((Class2_Sub11) this).aClass163_Sub2_13
						.method3087(false);
				idirect3ddevice.SetVertexShaderConstantF(8,
						class33_sub2.method2761((byte) 60, aFloatArray7936), 2);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method75(int i) {
		boolean bool;
		try {
			if (i <= 19)
				method68(true, 36);
			bool = aBool7943;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				anInterface7_7932 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method76(int i) {
		try {
			if (i == 64) {
				if (null != anIDirect3DVertexShader7933) {
					IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
					Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_7942
							.method3081(-73);
					idirect3ddevice.method3364(0,
							class33_sub2.method2758(i - 161, aFloatArray7936));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method68(boolean bool, int i) {
		try {
			aBool7935 = bool;
			((Class2_Sub11) this).aClass163_Sub2_13.method3073(1, (byte) 66);
			if (i > -64)
				aBool7935 = false;
			((Class2_Sub11) this).aClass163_Sub2_13.method3094(
					anInterface7_7932, -2);
			((Class2_Sub11) this).aClass163_Sub2_13.method3013(-30,
					Class11_Sub2_Sub19.aClass314_9092, Class121.aClass314_1643);
			((Class2_Sub11) this).aClass163_Sub2_13.method3095((byte) -124,
					Class68.aClass218_962, 0);
			((Class2_Sub11) this).aClass163_Sub2_13.method3089(false,
					Class11_Sub45_Sub12.aClass218_9187, 2, true, false);
			((Class2_Sub11) this).aClass163_Sub2_13.method2993(
					Class6.aClass218_42, 0, 256);
			((Class2_Sub11) this).aClass163_Sub2_13.method3073(0, (byte) 66);
			method73(-103);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method3193(byte i) {
		try {
			if (i == 96) {
				if (anIDirect3DVertexShader7933 != null && aBool7935) {
					Class33_Sub2 class33_sub2 = ((Class2_Sub11) this).aClass163_Sub2_13
							.method3047(0);
					IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
					idirect3ddevice
							.method3376(
									13,
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7606 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7626),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7606 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7613),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7633 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7606),
									1.0F);
					idirect3ddevice
							.method3376(
									14,
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7626 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7589),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7589 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7613),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7589 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7633),
									1.0F);
					idirect3ddevice
							.method3376(
									16,
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7588 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7626),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7588 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7613),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloat7633 * ((Class163_Sub2) (((Class2_Sub11) this).aClass163_Sub2_13)).aFloat7588),
									1.0F);
					class33_sub2
							.method2748(
									(byte) 69,
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7578[2]),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7578[0]),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7578[1]),
									aFloatArray7938);
					idirect3ddevice.SetVertexShaderConstantF(15,
							aFloatArray7938, 1);
					class33_sub2
							.method2748(
									(byte) 69,
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7555[2]),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7555[0]),
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).aFloatArray7555[1]),
									aFloatArray7938);
					idirect3ddevice.SetVertexShaderConstantF(17,
							aFloatArray7938, 1);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method69(byte i) {
		try {
			if (i <= -111) {
				if (null != anIDirect3DVertexShader7933) {
					IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
					Class33_Sub2 class33_sub2 = aClass163_Sub2_Sub2_7942
							.method3081(-114);
					idirect3ddevice.method3364(0,
							class33_sub2.method2758(76, aFloatArray7936));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method73(int i) {
		try {
			IDirect3DDevice idirect3ddevice = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_7942).anIDirect3DDevice9578);
			int i_6_ = ((Class2_Sub11) this).aClass163_Sub2_13.method2973(0);
			if (i > -62)
				anIDirect3DVertexShader7933 = null;
			Class33_Sub2 class33_sub2 = ((Class2_Sub11) this).aClass163_Sub2_13
					.method3024(-50);
			IDirect3DVertexShader idirect3dvertexshader;
			if (!aBool7935)
				idirect3dvertexshader = (2147483647 == i_6_ ? anIDirect3DVertexShader7937
						: anIDirect3DVertexShader7939);
			else
				idirect3dvertexshader = (-2147483648 == (i_6_ ^ 0xffffffff) ? anIDirect3DVertexShader7934
						: anIDirect3DVertexShader7940);
			if (anIDirect3DVertexShader7933 != idirect3dvertexshader) {
				anIDirect3DVertexShader7933 = idirect3dvertexshader;
				aClass163_Sub2_Sub2_7942.method3776((byte) 122,
						idirect3dvertexshader);
				method3193((byte) 96);
				method72(true);
				method77((byte) -122);
				method69((byte) -119);
				method76(64);
				method74(25411);
			}
			class33_sub2.method2763((float) i_6_, 0, 0.0F, -1.0F, 0.0F,
					aFloatArray7938);
			idirect3ddevice.method3364(12, aFloatArray7938);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method70(Interface15 interface15, int i, int i_7_) {
		try {
			if (null == interface15) {
				if (!aBool7941) {
					((Class2_Sub11) this).aClass163_Sub2_13
							.method3094(
									(((Class163_Sub2) ((Class2_Sub11) this).aClass163_Sub2_13).anInterface15_7637),
									i_7_ - 5);
					((Class2_Sub11) this).aClass163_Sub2_13.method3037(
							(byte) 11, 1);
					((Class2_Sub11) this).aClass163_Sub2_13.method3095(
							(byte) -114, Class6.aClass218_42, 0);
					((Class2_Sub11) this).aClass163_Sub2_13.method2993(
							Class6.aClass218_42, 0, 256);
					aBool7941 = true;
				}
			} else {
				if (aBool7941) {
					((Class2_Sub11) this).aClass163_Sub2_13.method3095(
							(byte) -105, Class11_Sub45_Sub12.aClass218_9187, 0);
					((Class2_Sub11) this).aClass163_Sub2_13.method2993(
							Class11_Sub45_Sub12.aClass218_9187, 0, 256);
					aBool7941 = false;
				}
				((Class2_Sub11) this).aClass163_Sub2_13.method3094(interface15,
						-2);
				((Class2_Sub11) this).aClass163_Sub2_13.method3037((byte) -24,
						i);
			}
			if (i_7_ != 3)
				aBool7943 = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		aFloatArray7936 = new float[16];
	}
}
