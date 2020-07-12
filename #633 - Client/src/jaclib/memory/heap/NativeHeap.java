/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	private boolean aBool1047;
	private int anInt1048;
	long peer;

	public final NativeHeapBuffer method531(int i, boolean bool) {
		try {
			if (!aBool1047)
				throw new IllegalStateException();
			return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native long getBufferAddress(int i);

	final synchronized native void get(int i, byte[] is, int i_0_, int i_1_,
			int i_2_);

	final synchronized native void deallocateBuffer(int i);

	final synchronized native int allocateBuffer(int i, boolean bool);

	final synchronized boolean method532() {
		try {
			return aBool1047;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized native void put(int i, byte[] is, int i_3_, int i_4_,
			int i_5_);

	private final native void allocateHeap(int i);

	private final native void deallocateHeap();

	public final synchronized void method533() {
		try {
			if (aBool1047)
				deallocateHeap();
			aBool1047 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public NativeHeap(int i) {
		try {
			anInt1048 = i;
			allocateHeap(anInt1048);
			aBool1047 = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final synchronized void finalize() throws Throwable {
		try {
			super.finalize();
			method533();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
