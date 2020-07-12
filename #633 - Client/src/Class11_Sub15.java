/* Class11_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub15 extends Class11 {
	static int anInt5594;
	int anInt5595;
	int anInt5596;
	int anInt5597;
	int anInt5598;
	static IncomingPacket aClass160_5599 = new IncomingPacket(48, 5);
	int anInt5600 = -1;
	int anInt5601;
	int anInt5602;
	int anInt5603;
	int anInt5604;
	static OutgoingPacket aClass370_5605 = new OutgoingPacket(1, -1);
	int anInt5606;
	static int anInt5607;
	int anInt5608 = 0;
	int anInt5609;
	static Class83 aClass83_5610 = new Class83(0, 4);
	static OutgoingPacket aClass370_5611 = new OutgoingPacket(5, 4);

	public static void method2423(int i) {
		try {
			aClass370_5611 = null;
			aClass370_5605 = null;
			if (i <= 38)
				aClass83_5610 = null;
			aClass160_5599 = null;
			aClass83_5610 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "av.A(" + i + ')');
		}
	}

	static final void method2424(boolean bool) {
		try {
			if (bool != false)
				aClass370_5611 = null;
			anInt5607++;
			Class376_Sub7_Sub2_Sub2.anIntArray10250 = Class33_Sub1.method2632(
					8, 0.4F, 4, 2048, -27, true, 35, 8);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "av.B(" + bool + ')');
		}
	}

	static final Class333 method2425(int i, int i_0_, String string) {
		try {
			anInt5594++;
			Class333 class333;
			try {
				class333 = (Class333) Class.forName("Class333_Sub1")
						.newInstance();
			} catch (Throwable throwable) {
				class333 = new Class333_Sub2();
			}
			((Class333) class333).aString4418 = string;
			((Class333) class333).anInt4416 = i_0_;
			if (i != 48)
				aClass370_5611 = null;
			return class333;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("av.C(" + i + ','
					+ i_0_ + ',' + (string != null ? "{...}" : "null") + ')'));
		}
	}

	public Class11_Sub15() {
		/* empty */
	}
}
