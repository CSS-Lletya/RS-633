/* OggPage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPage extends SimplePeer {
	public final native long getPageNumber();

	public final native boolean isBOS();

	public final native long getGranulePos();

	protected final native void clear();

	public final native boolean isEOS();

	public final native int getSerialNumber();

	public final native boolean isContinued();

	public final native int getCompletedPackets();

	public final native int getVersion();
}
