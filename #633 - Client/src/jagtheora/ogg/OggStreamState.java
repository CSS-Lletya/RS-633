/* OggStreamState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer {
	public final native int packetPeek(OggPacket oggpacket);

	public OggStreamState(int i) {
		try {
			if (!init(i))
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native int packetOut(OggPacket oggpacket);

	public final native boolean reset();

	protected final native void clear();

	public final native boolean resetSerialNo(int i);

	public final native int packetPeek();

	private final native boolean init(int i);

	public final native int packetOut();

	public final native boolean pageIn(OggPage oggpage);

	public final native boolean isEOS();
}
