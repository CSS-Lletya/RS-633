/* NativeHeapPeerReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class NativeHeapPeerReference extends PeerReference {
	protected final native long releasePeer(long l);

	NativeHeapPeerReference(Peer_Sub1 peer_sub1, Class185 class185) {
		super((Peer) peer_sub1, class185);
	}
}
