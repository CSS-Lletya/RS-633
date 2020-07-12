/* Class11_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub23 extends Class11 {
	static int anInt5988 = 0;
	static int anInt5989;

	abstract int method2568(byte i);

	abstract int method2569(int i);

	abstract int method2570(int i);

	public Class11_Sub23() {
		/* empty */
	}

	abstract int method2571(int i);

	static final int method2572(int i, byte i_0_, byte[] is) {
		try {
			if (i_0_ != 28)
				method2572(-37, (byte) -49, null);
			anInt5989++;
			return Class11_Sub2_Sub37.method3841(is, true, i, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("es.F(" + i + ','
					+ i_0_ + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract long method2573(int i);
}
