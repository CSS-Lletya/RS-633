/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	public int anInt255;
	private int anInt256;
	private NativeHeap aNativeHeap257;
	private boolean aBool258 = true;

	public final synchronized void method1(byte[] is, int i, int i_0_, int i_1_) {
		try {
			if ((i ^ 0xffffffff) > -1 | (!method210() | is == null)
					| i_1_ + i > is.length | (i_0_ ^ 0xffffffff) > -1
					| anInt255 < i_0_ - -i_1_)
				throw new RuntimeException();
			aNativeHeap257.put(anInt256, is, i, i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final synchronized boolean method210() {
		try {
			if (!aNativeHeap257.method532() || !aBool258)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int getSize() {
		try {
			return anInt255;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final synchronized void finalize() throws Throwable {
		try {
			super.finalize();
			method211();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final long getAddress() {
		try {
			return aNativeHeap257.getBufferAddress(anInt256);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final synchronized void method211() {
		try {
			if (method210())
				aNativeHeap257.deallocateBuffer(anInt256);
			aBool258 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_2_) {
		try {
			aNativeHeap257 = nativeheap;
			anInt255 = i_2_;
			anInt256 = i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
