/* MapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {
	private int anInt5325;

	public final boolean method2343(int i, int i_0_, int i_1_) {
		try {
			if (anInt5325 != 0)
				return false;
			long l = OpenGL.glMapBufferARB(i, i_1_);
			if (l == 0L)
				return false;
			this.method884(l, i_0_);
			anInt5325 = i;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method1(byte[] is, int i, int i_2_, int i_3_) {
		try {
			if (anInt5325 == 0)
				throw new RuntimeException();
			super.method1(is, i, i_2_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean method2344() {
		try {
			boolean bool = true;
			if (anInt5325 != 0) {
				bool = OpenGL.glUnmapBufferARB(anInt5325);
				this.method884(0L, 0);
				anInt5325 = 0;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean method2345() {
		try {
			if ((anInt5325 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
