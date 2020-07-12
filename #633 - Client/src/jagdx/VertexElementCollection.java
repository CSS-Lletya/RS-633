/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.Peer_Sub1;

public class VertexElementCollection extends Peer_Sub1 {
	public VertexElementCollection(Class185 class185) {
		super(class185);
		try {
			init();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void addElement(int i, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_);

	public final native void finish();

	private final native void init();

	public final native void reset();
}
