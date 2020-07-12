/* TheoraComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer {
	protected final native void clear();

	private final native void init();

	public TheoraComment() {
		try {
			init();
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
