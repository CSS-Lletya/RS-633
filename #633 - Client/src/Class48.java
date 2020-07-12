/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48 implements Interface14 {
	static float aFloat748;
	static int anInt749;
	static int anInt750;
	static OutgoingPacket aClass370_751 = new OutgoingPacket(22, 3);
	static int anInt752;
	static Class298 aClass298_753 = new Class298("", 13);

	public static void method413(byte i) {
		try {
			aClass298_753 = null;
			if (i == -63)
				aClass370_751 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jia.B(" + i + ')');
		}
	}

	public Class48() {
		/* empty */
	}

	static final void method414(Class376 class376, int i, Class376 class376_0_) {
		try {
			if (((Class376) class376_0_).aClass376_4910 != null)
				class376_0_.method2207((byte) -111);
			anInt750++;
			int i_1_ = 119 / ((-36 - i) / 37);
			((Class376) class376_0_).aClass376_4909 = class376;
			((Class376) class376_0_).aClass376_4910 = ((Class376) class376).aClass376_4910;
			((Class376) ((Class376) class376_0_).aClass376_4910).aClass376_4909 = class376_0_;
			((Class376) ((Class376) class376_0_).aClass376_4909).aClass376_4910 = class376_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jia.C("
					+ (class376 != null ? "{...}" : "null") + ',' + i + ','
					+ (class376_0_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final int method415(int i, byte i_2_) {
		try {
			if (i_2_ <= 83)
				aClass370_751 = null;
			anInt749++;
			return i >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jia.D(" + i + ','
					+ i_2_ + ')');
		}
	}

	public final String method45(int[] is, Class79 class79, long l, boolean bool) {
		try {
			anInt752++;
			if (Class163_Sub3.aClass79_8113 == class79) {
				Class20 class20 = Class11_Sub35_Sub1.aClass374_9125.method2201(
						is[0], 115);
				return class20.method172(-27058, (int) l);
			}
			if (bool != false)
				return null;
			if (Class11_Sub39.aClass79_7216 == class79
					|| Applet_Sub1.aClass79_10471 == class79) {
				Class249 class249 = Packet.aClass223_8723.method1430((int) l,
						false);
				return ((Class249) class249).aString3359;
			}
			if (Class338.aClass79_4478 == class79
					|| Class11_Sub2_Sub6.aClass79_8699 == class79
					|| class79 == Class217_Sub1.aClass79_5526)
				return Class11_Sub35_Sub1.aClass374_9125.method2201(is[0], 118)
						.method172(-27058, (int) l);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jia.A("
					+ (is != null ? "{...}" : "null") + ','
					+ (class79 != null ? "{...}" : "null") + ',' + l + ','
					+ bool + ')'));
		}
	}
}
