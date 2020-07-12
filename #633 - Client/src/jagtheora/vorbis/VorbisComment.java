/* VorbisComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class VorbisComment extends SimplePeer {
	public VorbisComment() {
		try {
			init();
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final native void init();

	protected final native void clear();
}
