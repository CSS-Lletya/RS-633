/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 extends OutputStream {
	static int anInt5845;
	static int anInt5846;
	static int[] anIntArray5847 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511,
			1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143,
			524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431,
			67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647,
			-1 };
	static int anInt5848;
	static int anInt5849;
	static boolean aBool5850 = true;

	static final boolean method2484(int i) {
		try {
			anInt5848++;
			if (i != 1)
				method2484(74);
			if (!Class335_Sub3_Sub1.method3711("jaclib", true))
				return false;
			return Class335_Sub3_Sub1.method3711("hw3d", true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bea.A(" + i + ')');
		}
	}

	public final void write(int i) throws IOException {
		try {
			anInt5849++;
			throw new IOException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bea.write(" + i + ')');
		}
	}

	public static void method2485(int i) {
		do {
			try {
				anIntArray5847 = null;
				if (i >= 92)
					break;
				aBool5850 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bea.B(" + i + ')');
			}
			break;
		} while (false);
	}
}
