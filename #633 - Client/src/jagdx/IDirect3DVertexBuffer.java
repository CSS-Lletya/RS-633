/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Source;
import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3DVertexBuffer extends IUnknown {
	int anInt9192;

	protected final long method222() {
		long l;
		try {
			anInt9192 = 0;
			l = super.method222();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final native int Unlock();

	public final native int Lock(int i, int i_0_, int i_1_,
			GeometryBuffer geometrybuffer);

	public final boolean method3594(Source source, int i, int i_2_, int i_3_,
			int i_4_) {
		boolean bool;
		try {
			if (null == source || (i ^ 0xffffffff) > -1
					|| i - -source.getSize() < i_3_)
				throw new RuntimeException_Sub2("");
			if ((i_2_ ^ 0xffffffff) > -1
					|| (i_3_ ^ 0xffffffff) < (i_2_ - -anInt9192 ^ 0xffffffff))
				throw new RuntimeException_Sub2("");
			bool = _Update(source.getAddress() + (long) i, i_2_, i_3_, i_4_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	private final native boolean _Update(long l, int i, int i_5_, int i_6_);

	IDirect3DVertexBuffer(Class185 class185) {
		super(class185);
	}
}
