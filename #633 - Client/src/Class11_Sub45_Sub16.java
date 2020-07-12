/* Class11_Sub45_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class11_Sub45_Sub16 extends Class11_Sub45 {
	Interface5 anInterface5_9390;
	static int anInt9391 = 0;
	int anInt9392;
	static int[] anIntArray9393 = new int[32];
	static OutgoingPacket WALKING_OUT_PACKET = new OutgoingPacket(36, 5);
	static int anInt9395;

	static final String method3702(boolean bool, int i) {
		try {
			anInt9395++;
			if (bool != false)
				return null;
			Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
					.method1369((byte) 26, (long) i));
			if (class11_sub26 != null) {
				Class11_Sub12_Sub3 class11_sub12_sub3 = ((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
						.method232((byte) -107);
				if (class11_sub12_sub3 != null) {
					double d = ((Class11_Sub26) class11_sub26).aClass28_Sub1_6305
							.method233(-119);
					if (d >= (double) class11_sub12_sub3.method3598(-103)
							&& d <= (double) class11_sub12_sub3
									.method3603((byte) 64))
						return class11_sub12_sub3.method3601(0);
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "or.I(" + bool + ','
					+ i + ')');
		}
	}

	abstract Object method3703(int i);

	abstract boolean method3704(int i);

	public static void method3705(int i) {
		try {
			WALKING_OUT_PACKET = null;
			anIntArray9393 = null;
			int i_0_ = -38 / ((i + 66) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "or.H(" + i + ')');
		}
	}

	Class11_Sub45_Sub16(Interface5 interface5, int i) {
		try {
			((Class11_Sub45_Sub16) this).anInt9392 = i;
			((Class11_Sub45_Sub16) this).anInterface5_9390 = interface5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("or.<init>("
					+ (interface5 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
