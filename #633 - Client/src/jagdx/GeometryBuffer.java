/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.Class185;
import jaclib.peer.Peer_Sub1;

public class GeometryBuffer extends Peer_Sub1 implements Buffer {
	public GeometryBuffer(Class185 class185) {
		super(class185);
		try {
			init();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native long getAddress();

	private final native void init();

	public final void method1(byte[] is, int i, int i_0_, int i_1_) {
		try {
			if ((i - -i_1_ > is.length | (i < 0 | null == is) | (i_0_ ^ 0xffffffff) > -1)
					|| i_0_ + i_1_ > getSize())
				throw new RuntimeException_Sub2();
			putub(is, i, i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void putub(byte[] is, int i, int i_2_, int i_3_);

	public final native int getSize();

	private final native void getub(byte[] is, int i, int i_4_, int i_5_);
}
