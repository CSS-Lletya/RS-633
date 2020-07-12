/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class364 {
	static Class11_Sub6_Sub2 aClass11_Sub6_Sub2_4773;
	static Class98 aClass98_4774 = new Class98(4);
	static IncomingPacket aClass160_4775 = new IncomingPacket(40, 10);
	Class376_Sub7_Sub3 aClass376_Sub7_Sub3_4776;
	Class376_Sub7_Sub2 aClass376_Sub7_Sub2_4777;
	Class376_Sub7_Sub4 aClass376_Sub7_Sub4_4778;
	static int anInt4779;
	Class376_Sub7_Sub3 aClass376_Sub7_Sub3_4780;
	Class140 aClass140_4781;
	Class376_Sub7_Sub1 aClass376_Sub7_Sub1_4782;
	Class364 aClass364_4783;
	short aShort4784;
	byte aByte4785;
	short aShort4786;
	short aShort4787;
	short aShort4788;
	Class376_Sub7_Sub4 aClass376_Sub7_Sub4_4789;

	final void method2157(byte i) {
		try {
			anInt4779++;
			if (i == 46) {
				Class140 class140;
				for (/**/; ((Class364) this).aClass140_4781 != null; ((Class364) this).aClass140_4781 = class140) {
					class140 = (((Class140) ((Class364) this).aClass140_4781).aClass140_1895);
					((Class364) this).aClass140_4781.method889(-501);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wq.A(" + i + ')');
		}
	}

	public static void method2158(int i) {
		try {
			aClass11_Sub6_Sub2_4773 = null;
			aClass98_4774 = null;
			if (i < -81)
				aClass160_4775 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wq.B(" + i + ')');
		}
	}

	Class364(int i) {
		try {
			((Class364) this).aByte4785 = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wq.<init>(" + i + ')');
		}
	}
}
