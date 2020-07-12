/* PeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

import java.lang.ref.WeakReference;

abstract class PeerReference extends WeakReference {
	private long peer;
	PeerReference aPeerReference9821;
	PeerReference aPeerReference9822;

	PeerReference(Peer peer, Class185 class185) {
		super(peer, ((Class185) class185).aReferenceQueue2374);
		try {
			class185.method1205(this, 5808);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void setPeer(long l) {
		try {
			method3861(10807);
			peer = l;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method3860(int i) {
		boolean bool;
		try {
			if (i != 0)
				return true;
			bool = 0L != peer;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	protected abstract long releasePeer(long l);

	final long method3861(int i) {
		long l;
		try {
			long l_0_;
			if (0L != peer) {
				l_0_ = releasePeer(peer);
				peer = 0L;
			} else
				l_0_ = 0L;
			if (i != 10807)
				return 92L;
			l = l_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return l;
	}
}
