/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3DSwapChain extends IUnknown {
	private Class185 aClass185_9741;

	private final native int _GetBackBuffer(int i, int i_0_,
			IDirect3DSurface idirect3dsurface);

	IDirect3DSwapChain(Class185 class185) {
		super(class185);
		try {
			aClass185_9741 = class185;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final IDirect3DSurface method3835(int i, int i_1_) {
		IDirect3DSurface idirect3dsurface;
		try {
			IDirect3DSurface idirect3dsurface_2_ = new IDirect3DSurface(
					aClass185_9741);
			int i_3_ = _GetBackBuffer(i, i_1_, idirect3dsurface_2_);
			if (Class18.method158(i_3_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_3_));
			idirect3dsurface = idirect3dsurface_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3dsurface;
	}

	public final native int Present(int i);
}
