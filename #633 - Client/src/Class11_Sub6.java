/* Class11_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub6 extends Class11 {
	Class11_Sub6 aClass11_Sub6_5244;
	int anInt5245;
	Class11_Sub14 aClass11_Sub14_5246;
	volatile boolean aBool5247 = true;

	abstract int method2314();

	abstract void method2315(int i);

	abstract Class11_Sub6 method2316();

	int method2317() {
		return 255;
	}

	abstract void method2318(int[] is, int i, int i_0_);

	abstract Class11_Sub6 method2319();

	final void method2320(int[] is, int i, int i_1_) {
		if (((Class11_Sub6) this).aBool5247)
			method2318(is, i, i_1_);
		else
			method2315(i_1_);
	}

	public Class11_Sub6() {
		/* empty */
	}
}
