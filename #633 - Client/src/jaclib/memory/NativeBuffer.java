/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int anInt1892 = -1;
	private long aLong1893;

	public void method1(byte[] is, int i, int i_0_, int i_1_) {
		try {
			if (is.length < i + i_1_
					| (aLong1893 == 0L | is == null | (i ^ 0xffffffff) > -1)
					| i_0_ < 0
					| (anInt1892 ^ 0xffffffff) > (i_1_ + i_0_ ^ 0xffffffff))
				throw new RuntimeException();
			put(aLong1893, is, i, i_0_, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void put(long l, byte[] is, int i, int i_2_, int i_3_);

	public final int getSize() {
		try {
			return anInt1892;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final long getAddress() {
		try {
			return aLong1893;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void get(long l, byte[] is, int i, int i_4_, int i_5_);

	protected final void method884(long l, int i) {
		try {
			anInt1892 = i;
			aLong1893 = l;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
