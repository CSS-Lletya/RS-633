/* DSPState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public class DSPState extends SimplePeer {
	private final native void init(VorbisInfo vorbisinfo);

	public final native void blockIn(VorbisBlock vorbisblock);

	public final native void read(int i);

	public DSPState(VorbisInfo vorbisinfo) {
		try {
			init(vorbisinfo);
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native float[][] pcmOut(int i);

	protected final native void clear();

	public final native double granuleTime();
}
