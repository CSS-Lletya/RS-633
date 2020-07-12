/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class1 {
	static boolean aBool1 = false;
	static int anInt2;
	static Class326[] aClass326Array3 = new Class326[100];
	static Class197 aClass197_4;
	static int anInt5;
	static int anInt6 = 0;

	abstract boolean method60(int i, int i_0_);

	public static void method61(int i) {
		do {
			try {
				aClass197_4 = null;
				aClass326Array3 = null;
				if (i <= -108)
					break;
				method64((byte) 85);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tea.D(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract void method62(byte i);

	abstract Interface25 method63(byte i);

	static final void method64(byte i) {
		try {
			anInt2++;
			Class11_Sub31.aClass163_6702
					.xa(1.1523438F * (0.1F * (float) ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub9_5685
							.method2607(false) + 0.7F));
			Class11_Sub31.aClass163_6702.ZA(Class106.anInt1434, 0.69921875F,
					1.2F, -200.0F, -240.0F, -200.0F);
			Class11_Sub31.aClass163_6702.L(Class253_Sub1.anInt5855, -1, 0);
			if (i != 126)
				method64((byte) -21);
			Class11_Sub31.aClass163_6702.method1027(Class96.aClass234_1289);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tea.C(" + i + ')');
		}
	}

	abstract void method65(byte i);

	public Class1() {
		/* empty */
	}
}
