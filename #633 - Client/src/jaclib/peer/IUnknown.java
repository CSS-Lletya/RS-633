/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer {
	protected IUnknown(Class185 class185) {
		try {
			reference = new IUnknownReference(this, class185);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final long method3243(int i) {
		long l;
		try {
			if (i != 7516)
				method3243(102);
			l = super.method222();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final native long AddRef();
}
