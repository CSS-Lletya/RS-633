/* Class11_Sub45_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class11_Sub45_Sub9_Sub1 extends Class11_Sub45_Sub9 {
	private SoftReference aSoftReference10078;

	final boolean method3485(byte i) {
		boolean bool;
		try {
			if (i <= 97)
				method3483(99);
			bool = true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class11_Sub45_Sub9_Sub1(Object object, int i) {
		super(i);
		try {
			aSoftReference10078 = new SoftReference(object);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Object method3483(int i) {
		Object object;
		try {
			if (i <= 43)
				return null;
			object = aSoftReference10078.get();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}
}
