/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface {
	long peer;

	public final native void copyColours(short[] is, byte[] is_0_,
			short[] is_1_, int i, short[] is_2_, int i_3_, int i_4_, int i_5_,
			long l);

	public final native void setSunDirection(float f, float f_6_, float f_7_);

	public final native void copyPositions(int[] is, int[] is_8_, int[] is_9_,
			short[] is_10_, int i, int i_11_, int i_12_, long l);

	public final native void setAmbient(float f);

	public final native void copyTexCoords(float[] fs, float[] fs_13_, int i,
			int i_14_, int i_15_, long l);

	public NativeInterface(int i, int i_16_) {
		try {
			init(i, i_16_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void initTextureMetrics(int i, byte i_17_, byte i_18_);

	public final native void copyLighting(short[] is, byte[] is_19_,
			short[] is_20_, short[] is_21_, short[] is_22_, short[] is_23_,
			byte[] is_24_, int i, int i_25_, short[] is_26_, int i_27_,
			int i_28_, int i_29_, long l);

	public final native void copyNormals(short[] is, short[] is_30_,
			short[] is_31_, byte[] is_32_, float f, float f_33_, int i,
			int i_34_, int i_35_, long l);

	public final native void setSunColour(float f, float f_36_, float f_37_,
			float f_38_, float f_39_);

	private final native void init(int i, int i_40_);

	public final native void release();
}
