/* OggSyncState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggSyncState extends SimplePeer {
	public final native boolean write(byte[] is, int i);

	private final native void init();

	protected final native void clear();

	public final native int pageOut(OggPage oggpage);

	public final native long pageSeek(OggPage oggpage);

	public OggSyncState() {
		try {
			init();
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native boolean reset();
}
