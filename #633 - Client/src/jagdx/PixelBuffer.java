/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.Class185;
import jaclib.peer.Peer_Sub1;

public class PixelBuffer extends Peer_Sub1 implements Buffer {
	private final native void geti(int[] is, int i, int i_0_, int i_1_);

	public final void method3397(int[] is, int i, int i_2_, int i_3_) {
		try {
			if (((i_2_ ^ 0xffffffff) > -1 | ((is.length ^ 0xffffffff) > (i
					+ i_3_ ^ 0xffffffff) | (0 > i | null == is)))
					|| i_2_ - -(i_3_ * 4) > getSize())
				throw new RuntimeException_Sub2();
			geti(is, i, i_2_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void puti(int[] is, int i, int i_4_, int i_5_);

	private final native void getub(byte[] is, int i, int i_6_, int i_7_);

	public final native int getRowPitch();

	public final native int getSlicePitch();

	public final void method1(byte[] is, int i, int i_8_, int i_9_) {
		try {
			if (is.length < i_9_ + i | (0 > i | is == null) | 0 > i_8_
					|| i_8_ + i_9_ > getSize())
				throw new RuntimeException_Sub2();
			putub(is, i, i_8_, i_9_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void init();

	public final native int getSize();

	public final void method3398(int[] is, int i, int i_10_, int i_11_) {
		try {
			if (0 > i_10_
					| (is.length < i_11_ + i | (-1 < (i ^ 0xffffffff) | is == null))
					|| getSize() < 4 * i_11_ + i_10_)
				throw new RuntimeException_Sub2();
			puti(is, i, i_10_, i_11_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public PixelBuffer(Class185 class185) {
		super(class185);
		try {
			init();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void putub(byte[] is, int i, int i_12_, int i_13_);

	public final long getAddress() {
		long l;
		try {
			l = 0L;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}
}
