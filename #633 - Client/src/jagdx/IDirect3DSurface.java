/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3DSurface extends IUnknown {
	public final native boolean UnlockRect();

	IDirect3DSurface(Class185 class185) {
		super(class185);
	}

	public final native int LockRect(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, PixelBuffer pixelbuffer);
}
