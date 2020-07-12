/* Class11_Sub45_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class11_Sub45_Sub16_Sub1 extends Class11_Sub45_Sub16 {
	private SoftReference aSoftReference10161;

	final boolean method3704(int i) {
		boolean bool;
		try {
			if (i != 16311)
				aSoftReference10161 = null;
			bool = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final Object method3703(int i) {
		Object object;
		try {
			if (i != -11907)
				return null;
			object = aSoftReference10161.get();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	Class11_Sub45_Sub16_Sub1(Interface5 interface5, Object object, int i) {
		super(interface5, i);
		try {
			aSoftReference10161 = new SoftReference(object);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
