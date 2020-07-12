/* SetupInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class SetupInfo extends SimplePeer {
	public final native int decodeHeader(TheoraInfo theorainfo,
			TheoraComment theoracomment, OggPacket oggpacket);

	protected final native void clear();
}
