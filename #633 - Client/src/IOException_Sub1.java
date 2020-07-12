/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class IOException_Sub1 extends IOException {
	static byte[] aByteArray9968 = new byte[520];
	static int anInt9969 = -1;

	public static void method3898(boolean bool) {
		try {
			if (bool != true)
				method3898(true);
			aByteArray9968 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fm.A(" + bool + ')');
		}
	}

	IOException_Sub1(String string) {
		super(string);
	}
}
