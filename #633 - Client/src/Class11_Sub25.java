/* Class11_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub25 extends Class11 {
	public static int anInt6279 = 0;
	static Class11_Sub31 aClass11_Sub31_6280 = null;
	static int anInt6281;
	static int anInt6282;
	Npc aNpc_2373;

	static final void method2661(String string, int i) {
		try {
			anInt6282++;
			if (Class81.aClass92Array1096 != null) {
				Class11_Sub3.anInt5109++;
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113,
						Class11_Sub24.aClass370_6234, (byte) -63);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeByte(Class98.method660(string, 0), -1528071456);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeString((byte) 27, string);
				int i_0_ = 29 / ((65 - i) / 32);
				Class79.method541(class11_sub10, -116);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hd.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final String method2662(int i, Stream stream) {
		try {
			anInt6281++;
			if (i != 32767)
				anInt6279 = 22;
			return Class58_Sub2.method3156(112, stream, 32767);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hd.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2663(int i) {
		try {
			if (i != 0)
				method2663(124);
			aClass11_Sub31_6280 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hd.C(" + i + ')');
		}
	}

	Class11_Sub25(Npc class376_sub7_sub5_sub5_sub2) {
		try {
			((Class11_Sub25) this).aNpc_2373 = class376_sub7_sub5_sub5_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("hd.<init>("
							+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}
}
