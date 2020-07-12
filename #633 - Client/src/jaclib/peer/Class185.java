package jaclib.peer;

/* Class185 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;

public final class Class185 {
	private PeerReference aPeerReference2372;
	private PeerReference aPeerReference2373;
	ReferenceQueue aReferenceQueue2374 = new ReferenceQueue();

	final void method1205(PeerReference peerreference, int i) {
		try {
			peerreference.aPeerReference9822 = aPeerReference2373;
			if (i == 5808) {
				peerreference.aPeerReference9821 = null;
				if (null == aPeerReference2372)
					aPeerReference2372 = peerreference;
				else
					aPeerReference2373.aPeerReference9821 = peerreference;
				aPeerReference2373 = peerreference;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method1206(boolean bool) {
		try {
			method1208(32);
			if (bool)
				method1205(null, -49);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method1207(int i, PeerReference peerreference) {
		try {
			peerreference.method3861(i ^ 0x59d6);
			if (i == 29665) {
				if (peerreference == aPeerReference2373)
					aPeerReference2373 = peerreference.aPeerReference9822;
				if (aPeerReference2372 == peerreference)
					aPeerReference2372 = peerreference.aPeerReference9821;
				if (peerreference.aPeerReference9821 != null)
					peerreference.aPeerReference9821.aPeerReference9822 = peerreference.aPeerReference9822;
				if (peerreference.aPeerReference9822 != null)
					peerreference.aPeerReference9822.aPeerReference9821 = peerreference.aPeerReference9821;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method1208(int i) {
		try {
			for (;;) {
				java.lang.ref.Reference reference = ((Class185) this).aReferenceQueue2374
						.poll();
				if (null == reference)
					break;
				PeerReference peerreference = (PeerReference) reference;
				method1207(29665, peerreference);
			}
			int i_0_ = 38 / ((-32 - i) / 53);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method1209(boolean bool) {
		try {
			method1208(-120);
			while (null != aPeerReference2373)
				method1207(29665, aPeerReference2373);
			if (!bool)
				method1208(-88);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
