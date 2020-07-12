/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.Peer_Sub1;

public class D3DLIGHT extends Peer_Sub1 {
	public final native void SetDirection(float f, float f_0_, float f_1_);

	public final native void SetSpotParams(float f, float f_2_, float f_3_);

	public final native void SetPosition(float f, float f_4_, float f_5_);

	public final native void SetType(int i);

	private final native void Init();

	public final native void SetSpecular(float f, float f_6_, float f_7_,
			float f_8_);

	public final native void SetAmbient(float f, float f_9_, float f_10_,
			float f_11_);

	public final native void SetDiffuse(float f, float f_12_, float f_13_,
			float f_14_);

	public final native void SetAttenuation(float f, float f_15_, float f_16_);

	public D3DLIGHT(Class185 class185) {
		super(class185);
		try {
			Init();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final native void SetRange(float f);
}
