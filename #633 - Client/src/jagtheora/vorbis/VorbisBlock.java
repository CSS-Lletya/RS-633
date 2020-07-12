/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer {
	private final native void init(DSPState dspstate);

	protected final native void clear();

	public final native int synthesis(OggPacket oggpacket);

	public VorbisBlock(DSPState dspstate) {
		try {
			init(dspstate);
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
