/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public final class IDirect3DDevice extends IUnknown {
	private static float[] aFloatArray8521 = new float[4];
	private Class185 aClass185_8522;

	public final native int _CreateCubeTexture(int i, int i_0_, int i_1_,
			int i_2_, int i_3_, IDirect3DCubeTexture idirect3dcubetexture);

	public final IDirect3DEventQuery method3360() {
		IDirect3DEventQuery idirect3deventquery;
		try {
			IDirect3DEventQuery idirect3deventquery_4_ = new IDirect3DEventQuery(
					aClass185_8522);
			if (Class18.method157(-103,
					_CreateEventQuery(idirect3deventquery_4_)))
				return (idirect3deventquery_4_.method223((byte) -19) ? idirect3deventquery_4_
						: null);
			idirect3deventquery = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3deventquery;
	}

	private final native int _CreateVertexBuffer(int i, int i_5_, int i_6_,
			int i_7_, IDirect3DVertexBuffer idirect3dvertexbuffer);

	public final native int BeginScene();

	public final native int StretchRect(IDirect3DSurface idirect3dsurface,
			int i, int i_8_, int i_9_, int i_10_,
			IDirect3DSurface idirect3dsurface_11_, int i_12_, int i_13_,
			int i_14_, int i_15_, int i_16_);

	public final native int Reset(D3DPRESENT_PARAMETERS d3dpresent_parameters);

	private final native int _GetBackBuffer(int i, int i_17_, int i_18_,
			IDirect3DSurface idirect3dsurface);

	public final native int SetViewport(int i, int i_19_, int i_20_, int i_21_,
			float f, float f_22_);

	IDirect3DDevice(Class185 class185) {
		super(class185);
		try {
			aClass185_8522 = class185;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native int _GetSwapChain(int i,
			IDirect3DSwapChain idirect3dswapchain);

	public final IDirect3DSwapChain method3361(int i) {
		IDirect3DSwapChain idirect3dswapchain;
		try {
			IDirect3DSwapChain idirect3dswapchain_23_ = new IDirect3DSwapChain(
					aClass185_8522);
			int i_24_ = _GetSwapChain(i, idirect3dswapchain_23_);
			if (Class18.method158(i_24_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_24_));
			idirect3dswapchain = idirect3dswapchain_23_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dswapchain;
	}

	public final native int SetLight(int i, D3DLIGHT d3dlight);

	public final native int SetScissorRect(int i, int i_25_, int i_26_,
			int i_27_);

	public final native int SetVertexShaderConstantF(int i, float[] fs,
			int i_28_);

	public final native int SetFVF(int i);

	public final native int DrawPrimitive(int i, int i_29_, int i_30_);

	public final native int SetVertexDeclaration(
			IDirect3DVertexDeclaration idirect3dvertexdeclaration);

	public final native int SetPixelShader(
			IDirect3DPixelShader idirect3dpixelshader);

	public final native int _CreateTexture(int i, int i_31_, int i_32_,
			int i_33_, int i_34_, int i_35_, IDirect3DTexture idirect3dtexture);

	public final native int SetIndices(IDirect3DIndexBuffer idirect3dindexbuffer);

	public final IDirect3DSurface method3362() {
		IDirect3DSurface idirect3dsurface;
		try {
			IDirect3DSurface idirect3dsurface_36_ = new IDirect3DSurface(
					aClass185_8522);
			int i = _GetDepthStencilSurface(idirect3dsurface_36_);
			if (Class18.method158(i, 0))
				throw new RuntimeException_Sub2(String.valueOf(i));
			idirect3dsurface = idirect3dsurface_36_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final IDirect3DCubeTexture method3363(int i, int i_37_, int i_38_,
			int i_39_, int i_40_) {
		IDirect3DCubeTexture idirect3dcubetexture;
		try {
			IDirect3DCubeTexture idirect3dcubetexture_41_ = new IDirect3DCubeTexture(
					aClass185_8522);
			int i_42_ = _CreateCubeTexture(i, i_37_, i_38_, i_39_, i_40_,
					idirect3dcubetexture_41_);
			if (Class18.method158(i_42_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_42_));
			idirect3dcubetexture = idirect3dcubetexture_41_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dcubetexture;
	}

	public final native int SetStreamSource(int i,
			IDirect3DVertexBuffer idirect3dvertexbuffer, int i_43_, int i_44_);

	public final native int DrawIndexedPrimitive(int i, int i_45_, int i_46_,
			int i_47_, int i_48_, int i_49_);

	public final int method3364(int i, float[] fs) {
		int i_50_;
		try {
			i_50_ = SetVertexShaderConstantF(i, fs, fs.length / 4);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_50_;
	}

	public final IDirect3DPixelShader method3365(byte[] is) {
		IDirect3DPixelShader idirect3dpixelshader;
		try {
			if (is == null)
				return null;
			IDirect3DPixelShader idirect3dpixelshader_51_ = new IDirect3DPixelShader(
					aClass185_8522);
			int i = _CreatePixelShader(is, idirect3dpixelshader_51_);
			if (Class18.method158(i, 0))
				throw new RuntimeException_Sub2(String.valueOf(i));
			idirect3dpixelshader = idirect3dpixelshader_51_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dpixelshader;
	}

	public final native int SetTexture(int i,
			IDirect3DBaseTexture idirect3dbasetexture);

	public final IDirect3DVertexShader method3366(byte[] is) {
		IDirect3DVertexShader idirect3dvertexshader;
		try {
			if (null == is)
				return null;
			IDirect3DVertexShader idirect3dvertexshader_52_ = new IDirect3DVertexShader(
					aClass185_8522);
			int i = _CreateVertexShader(is, idirect3dvertexshader_52_);
			if (Class18.method158(i, 0))
				throw new RuntimeException_Sub2(String.valueOf(i));
			idirect3dvertexshader = idirect3dvertexshader_52_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexshader;
	}

	public final native int SetVertexShader(
			IDirect3DVertexShader idirect3dvertexshader);

	public final native int Clear(int i, int i_53_, float f, int i_54_);

	private final native int _CreateRenderTarget(int i, int i_55_, int i_56_,
			int i_57_, int i_58_, boolean bool,
			IDirect3DSurface idirect3dsurface);

	public final native int TestCooperativeLevel();

	public final native int _CreateVertexShader(byte[] is,
			IDirect3DVertexShader idirect3dvertexshader);

	public final IDirect3DIndexBuffer method3367(int i, int i_59_, int i_60_,
			int i_61_, IDirect3DIndexBuffer idirect3dindexbuffer) {
		IDirect3DIndexBuffer idirect3dindexbuffer_62_;
		try {
			if (null != idirect3dindexbuffer)
				idirect3dindexbuffer.method3243(7516);
			else
				idirect3dindexbuffer = new IDirect3DIndexBuffer(aClass185_8522);
			int i_63_ = _CreateIndexBuffer(i, i_59_, i_60_, i_61_,
					idirect3dindexbuffer);
			if (Class18.method158(i_63_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_63_));
			idirect3dindexbuffer_62_ = idirect3dindexbuffer;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dindexbuffer_62_;
	}

	public final IDirect3DSurface method3368(int i) {
		IDirect3DSurface idirect3dsurface;
		try {
			IDirect3DSurface idirect3dsurface_64_ = new IDirect3DSurface(
					aClass185_8522);
			int i_65_ = _GetRenderTarget(i, idirect3dsurface_64_);
			if (Class18.method158(i_65_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_65_));
			idirect3dsurface = idirect3dsurface_64_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final native int _CreatePixelShader(byte[] is,
			IDirect3DPixelShader idirect3dpixelshader);

	public final int method3369(int i, boolean bool) {
		int i_66_;
		try {
			i_66_ = SetRenderStateb(i, bool);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_66_;
	}

	public final int method3370(int i, float f) {
		int i_67_;
		try {
			i_67_ = SetRenderStatef(i, f);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_67_;
	}

	public final int method3371(int i, float f, float f_68_, float f_69_,
			float f_70_) {
		int i_71_;
		try {
			aFloatArray8521[3] = f_70_;
			aFloatArray8521[0] = f;
			aFloatArray8521[1] = f_68_;
			aFloatArray8521[2] = f_69_;
			i_71_ = SetPixelShaderConstantF(i, aFloatArray8521, 1);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_71_;
	}

	public final IDirect3DVolumeTexture method3372(int i, int i_72_, int i_73_,
			int i_74_, int i_75_, int i_76_, int i_77_) {
		IDirect3DVolumeTexture idirect3dvolumetexture;
		try {
			IDirect3DVolumeTexture idirect3dvolumetexture_78_ = new IDirect3DVolumeTexture(
					aClass185_8522);
			int i_79_ = _CreateVolumeTexture(i, i_72_, i_73_, i_74_, i_75_,
					i_76_, i_77_, idirect3dvolumetexture_78_);
			if (Class18.method158(i_79_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_79_));
			idirect3dvolumetexture = idirect3dvolumetexture_78_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvolumetexture;
	}

	private final native int _GetDepthStencilSurface(
			IDirect3DSurface idirect3dsurface);

	public final native int SetTransform(int i, float[] fs);

	private final native int _CreateEventQuery(
			IDirect3DEventQuery idirect3deventquery);

	private final native int _GetRenderTarget(int i,
			IDirect3DSurface idirect3dsurface);

	private final native int _CreateOffscreenPlainSurface(int i, int i_80_,
			int i_81_, int i_82_, IDirect3DSurface idirect3dsurface);

	public final IDirect3DVertexDeclaration method3373(
			VertexElementCollection vertexelementcollection,
			IDirect3DVertexDeclaration idirect3dvertexdeclaration) {
		IDirect3DVertexDeclaration idirect3dvertexdeclaration_83_;
		try {
			if (null == idirect3dvertexdeclaration)
				idirect3dvertexdeclaration = new IDirect3DVertexDeclaration(
						aClass185_8522);
			else
				idirect3dvertexdeclaration.method3243(7516);
			int i = _CreateVertexDeclaration(vertexelementcollection,
					idirect3dvertexdeclaration);
			if (Class18.method158(i, 0))
				throw new RuntimeException_Sub2(String.valueOf(i));
			idirect3dvertexdeclaration_83_ = idirect3dvertexdeclaration;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexdeclaration_83_;
	}

	public final native boolean LightEnable(int i, boolean bool);

	public final native int SetRenderState(int i, int i_84_);

	public final native int EndScene();

	public final native int SetSamplerState(int i, int i_85_, int i_86_);

	private final native int _CreateVertexDeclaration(
			VertexElementCollection vertexelementcollection,
			IDirect3DVertexDeclaration idirect3dvertexdeclaration);

	private final native int _CreateDepthStencilSurface(int i, int i_87_,
			int i_88_, int i_89_, int i_90_, boolean bool,
			IDirect3DSurface idirect3dsurface);

	private final native int _CreateIndexBuffer(int i, int i_91_, int i_92_,
			int i_93_, IDirect3DIndexBuffer idirect3dindexbuffer);

	private final native int SetRenderStatef(int i, float f);

	private final native int SetRenderStateb(int i, boolean bool);

	public final native int SetPixelShaderConstantF(int i, float[] fs, int i_94_);

	public final IDirect3DTexture method3374(int i, int i_95_, int i_96_,
			int i_97_, int i_98_, int i_99_) {
		IDirect3DTexture idirect3dtexture;
		try {
			IDirect3DTexture idirect3dtexture_100_ = new IDirect3DTexture(
					aClass185_8522);
			int i_101_ = _CreateTexture(i, i_95_, i_96_, i_97_, i_98_, i_99_,
					idirect3dtexture_100_);
			if (Class18.method158(i_101_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_101_));
			idirect3dtexture = idirect3dtexture_100_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dtexture;
	}

	public final native int _CreateVolumeTexture(int i, int i_102_, int i_103_,
			int i_104_, int i_105_, int i_106_, int i_107_,
			IDirect3DVolumeTexture idirect3dvolumetexture);

	public final IDirect3DSurface method3375(int i, int i_108_, int i_109_,
			int i_110_, int i_111_, boolean bool) {
		IDirect3DSurface idirect3dsurface;
		try {
			IDirect3DSurface idirect3dsurface_112_ = new IDirect3DSurface(
					aClass185_8522);
			int i_113_ = _CreateRenderTarget(i, i_108_, i_109_, i_110_, i_111_,
					bool, idirect3dsurface_112_);
			if (Class18.method158(i_113_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_113_));
			idirect3dsurface = idirect3dsurface_112_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final int method3376(int i, float f, float f_114_, float f_115_,
			float f_116_) {
		int i_117_;
		try {
			aFloatArray8521[1] = f_114_;
			aFloatArray8521[3] = f_116_;
			aFloatArray8521[0] = f;
			aFloatArray8521[2] = f_115_;
			i_117_ = SetVertexShaderConstantF(i, aFloatArray8521, 1);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_117_;
	}

	public final IDirect3DVertexBuffer method3377(int i, int i_118_,
			int i_119_, int i_120_, IDirect3DVertexBuffer idirect3dvertexbuffer) {
		IDirect3DVertexBuffer idirect3dvertexbuffer_121_;
		try {
			if (null == idirect3dvertexbuffer)
				idirect3dvertexbuffer = new IDirect3DVertexBuffer(
						aClass185_8522);
			else
				idirect3dvertexbuffer.method3243(7516);
			int i_122_ = _CreateVertexBuffer(i, i_118_, i_119_, i_120_,
					idirect3dvertexbuffer);
			if (Class18.method158(i_122_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_122_));
			idirect3dvertexbuffer.anInt9192 = i;
			idirect3dvertexbuffer_121_ = idirect3dvertexbuffer;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dvertexbuffer_121_;
	}

	public final native int SetTextureStageState(int i, int i_123_, int i_124_);
}
