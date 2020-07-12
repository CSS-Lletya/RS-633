/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class Class157 {
	private IDirect3DSwapChain anIDirect3DSwapChain2062;
	private IDirect3DSurface anIDirect3DSurface2063;
	private IDirect3DSurface anIDirect3DSurface2064;

	final void method982(int i) {
		try {
			if (null != anIDirect3DSurface2063) {
				anIDirect3DSurface2063.method3243(7516);
				anIDirect3DSurface2063 = null;
			}
			if (anIDirect3DSurface2064 != null) {
				anIDirect3DSurface2064.method3243(7516);
				anIDirect3DSurface2064 = null;
			}
			if (null != anIDirect3DSwapChain2062) {
				anIDirect3DSwapChain2062.method3243(7516);
				anIDirect3DSwapChain2062 = null;
			}
			if (i > -54)
				method984(8, false);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method983(IDirect3DSurface idirect3dsurface,
			IDirect3DSwapChain idirect3dswapchain, int i) {
		try {
			anIDirect3DSwapChain2062 = idirect3dswapchain;
			anIDirect3DSurface2064 = idirect3dsurface;
			anIDirect3DSurface2063 = anIDirect3DSwapChain2062.method3835(i, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class157(IDirect3DSwapChain idirect3dswapchain,
			IDirect3DSurface idirect3dsurface) {
		try {
			method983(idirect3dsurface, idirect3dswapchain, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method984(int i, boolean bool) {
		int i_0_;
		try {
			if (bool != true)
				return 106;
			i_0_ = anIDirect3DSwapChain2062.Present(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	final boolean method985(boolean bool) {
		boolean bool_1_;
		try {
			if (bool)
				method985(true);
			bool_1_ = null != anIDirect3DSwapChain2062;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool_1_;
	}
}
