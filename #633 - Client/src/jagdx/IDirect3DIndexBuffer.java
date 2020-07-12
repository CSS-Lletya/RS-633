/* IDirect3DIndexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3DIndexBuffer extends IUnknown {
	IDirect3DIndexBuffer(Class185 class185) {
		super(class185);
	}

	protected final long method222() {
		long l;
		try {
			l = super.method222();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final native int Lock(int i, int i_0_, int i_1_,
			GeometryBuffer geometrybuffer);

	public final native int Unlock();

	private final native boolean _Update(long l, int i, int i_2_);
}
