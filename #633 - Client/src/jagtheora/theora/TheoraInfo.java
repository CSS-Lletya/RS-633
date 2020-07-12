/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer {
	public int colourSpace;
	public int fpsDenominator;
	public int fpsNumerator;
	public int frameWidth;
	public byte versionSubMinor;
	public int aspectNumerator;
	public int frameHeight;
	public byte versionMajor;
	public byte versionMinor;
	public int pixelFormat;
	public int picX;
	public int picY;
	public int picHeight;
	public int aspectDenominator;
	public int picWidth;

	private final native void init();

	private static final native void initFields();

	public TheoraInfo() {
		try {
			init();
			if (this.method870())
				throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	protected final native void clear();

	static {
		initFields();
	}
}
