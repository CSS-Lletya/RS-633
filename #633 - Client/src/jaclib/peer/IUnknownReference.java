/* IUnknownReference - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

class IUnknownReference extends PeerReference {
	protected final native long releasePeer(long l);

	IUnknownReference(IUnknown iunknown, Class185 class185) {
		super((Peer) iunknown, class185);
	}
}
