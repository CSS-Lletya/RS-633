/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer {
	public int rate;
	public int channels;

	public final native int headerIn(VorbisComment vorbiscomment,
			OggPacket oggpacket);

	protected final native void clear();

	private final native void init();

	private static final native void initFields();

	public VorbisInfo() {
		try {
			init();
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		initFields();
	}
}
