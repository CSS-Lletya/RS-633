/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer {
	protected PeerReference reference;
	/* synthetic */static Class aClass341;

	protected long method222() {
		long l;
		try {
			l = reference.method3861(10807);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}

	public final boolean method223(byte i) {
		boolean bool;
		try {
			if (i != -19)
				return true;
			bool = reference.method3860(0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	private static final native void init(Class var_class);

	protected Peer() {
		/* empty */
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}

	static {
		init(aClass341 == null ? aClass341 = getClassByName("jaclib.peer.PeerReference")
				: aClass341);
	}
}
