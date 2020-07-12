/* SimplePeer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.misc;

public abstract class SimplePeer {
	private long peer;

	public final boolean method870() {
		try {
			if (peer != 0L)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected abstract void clear();

	private static final native void init();

	private final void setPeer(long l) {
		try {
			peer = l;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final void finalize() throws Throwable {
		try {
			if (!method870())
				method871();
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method871() {
		do {
			try {
				if (method870())
					break;
				clear();
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	static {
		init();
	}
}
