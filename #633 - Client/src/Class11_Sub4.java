/* Class11_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub4 extends Class11 {
	static IncomingPacket aClass160_5232 = new IncomingPacket(6, -1);
	int anInt5233;
	int anInt5234;
	static int anInt5235;
	static IncomingPacket aClass160_5236 = new IncomingPacket(50, -1);
	static Class290 aClass290_5237;

	public static void method2310(int i) {
		try {
			if (i != 31356)
				anInt5235 = 13;
			aClass160_5232 = null;
			aClass160_5236 = null;
			aClass290_5237 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cia.A(" + i + ')');
		}
	}

	Class11_Sub4(int i, int i_0_) {
		try {
			((Class11_Sub4) this).anInt5233 = i;
			((Class11_Sub4) this).anInt5234 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cia.<init>(" + i + ','
					+ i_0_ + ')');
		}
	}
}
