/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3DEventQuery extends IUnknown {
	public final native int Issue();

	IDirect3DEventQuery(Class185 class185) {
		super(class185);
	}

	public final native int IsSignaled();
}
