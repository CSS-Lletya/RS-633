/* Class11_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class11_Sub31 extends Class11 {
	volatile int anInt6700 = -1;
	volatile String aString6701;
	static Class163 aClass163_6702;
	static Class146 aClass146_6703;
	static int anInt6704;
	static float aFloat6705;

	Class11_Sub31(String string) {
		try {
			((Class11_Sub31) this).aString6701 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "la.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	static final byte[] method2765(int i, byte i_0_, File file) {
		try {
			anInt6704++;
			try {
				if (i_0_ != -124)
					method2765(72, (byte) 69, null);
				byte[] is = new byte[i];
				Class42.method382(is, i, -21895, file);
				return is;
			} catch (java.io.IOException ioexception) {
				return null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("la.A(" + i + ','
					+ i_0_ + ',' + (file != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2766(int i) {
		try {
			aClass163_6702 = null;
			if (i == 9413)
				aClass146_6703 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "la.B(" + i + ')');
		}
	}
}
