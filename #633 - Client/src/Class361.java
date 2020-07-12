/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class361 {
	private Class146 aClass146_4697;
	static int[] anIntArray4698 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 3 };
	private Class146 aClass146_4699;
	static Class84 aClass84_4700 = new Class84();
	static int anInt4701;
	static float aFloat4702;
	private Class22 aClass22_4703 = new Class22(64);
	static int anInt4704;

	final Class11_Sub45_Sub21 method2144(int i, byte i_0_) {
		try {
			anInt4701++;
			Class11_Sub45_Sub21 class11_sub45_sub21 = ((Class11_Sub45_Sub21) aClass22_4703
					.method188((long) i, (byte) 107));
			if (class11_sub45_sub21 != null)
				return class11_sub45_sub21;
			byte[] is;
			if ((i ^ 0xffffffff) > -32769)
				is = aClass146_4697.method930(i, (byte) 112, 0);
			else
				is = aClass146_4699.method930(0x7fff & i, (byte) 112, 0);
			if (i_0_ != 71)
				return null;
			class11_sub45_sub21 = new Class11_Sub45_Sub21();
			if (is != null)
				class11_sub45_sub21.method3848(new Stream(is), 94);
			if (i >= 32768)
				class11_sub45_sub21.method3845((byte) 101);
			aClass22_4703.method184((byte) 124, class11_sub45_sub21, (long) i);
			return class11_sub45_sub21;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wk.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method2145(int i) {
		try {
			if (i == 2) {
				aClass84_4700 = null;
				anIntArray4698 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wk.A(" + i + ')');
		}
	}

	Class361(int i, Class146 class146, Class146 class146_1_) {
		do {
			try {
				aClass146_4699 = class146_1_;
				aClass146_4697 = class146;
				if (aClass146_4697 != null)
					aClass146_4697.method914(0, 0);
				if (aClass146_4699 == null)
					break;
				aClass146_4699.method914(0, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wk.<init>(" + i
						+ ',' + (class146 != null ? "{...}" : "null") + ','
						+ (class146_1_ != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
