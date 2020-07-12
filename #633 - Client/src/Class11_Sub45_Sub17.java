/* Class11_Sub45_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub17 extends Class11_Sub45 {
	static int anInt9504;
	static OutgoingPacket aClass370_9505 = new OutgoingPacket(77, 1);
	static int anInt9506;
	static int anInt9507;
	Class376_Sub7_Sub5_Sub2 aClass376_Sub7_Sub5_Sub2_9508;
	static byte[][][] aByteArrayArrayArray9509;

	public static void method3747(int i) {
		try {
			if (i <= -5) {
				aClass370_9505 = null;
				aByteArrayArrayArray9509 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rs.B(" + i + ')');
		}
	}

	static final boolean method3748(int i, int i_0_, byte i_1_) {
		try {
			anInt9507++;
			if (i_1_ <= 108)
				method3749((byte) -25, null);
			if ((0x800 & i) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rs.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final int method3749(byte i, Class98 class98) {
		try {
			anInt9506++;
			if (Class11_Sub2_Sub23.aClass98_9267 != class98) {
				if (class98 == Class364.aClass98_4774)
					return 6408;
				if (Class128.aClass98_1726 == class98)
					return 6406;
				if (class98 == Class329.aClass98_4372)
					return 6409;
				if (class98 != Class376_Sub6.aClass98_6952) {
					if (Class11_Sub50.aClass98_8021 == class98)
						return 6145;
				} else
					return 6410;
			} else
				return 6407;
			if (i >= -79)
				method3750(109, 106, 79, -45, -76, 102, null);
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rs.A(" + i + ','
					+ (class98 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3750(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, Class163 class163) {
		do {
			try {
				anInt9504++;
				if ((Class78.aClass253_1061 == null
						|| Class7.aClass253_49 == null || Class11_Sub2_Sub36.aClass253_9752 == null)
						&& Class108_Sub7.aClass146_5636.method918(
								Class246.anInt3321, 118)
						&& Class108_Sub7.aClass146_5636.method918(
								IncomingPacket.anInt2085, 98)
						&& Class108_Sub7.aClass146_5636.method918(
								Class350.anInt4616, 124)) {
					Class80 class80 = Class80.method545(
							Class108_Sub7.aClass146_5636,
							IncomingPacket.anInt2085, 0);
					Class7.aClass253_49 = class163.method1081(class80, true);
					class80.method547();
					Class108_Sub16.aClass253_6549 = class163.method1081(
							class80, true);
					Class78.aClass253_1061 = (class163.method1081(Class80
							.method545(Class108_Sub7.aClass146_5636,
									Class246.anInt3321, 0), true));
					Class80 class80_7_ = Class80
							.method545(Class108_Sub7.aClass146_5636,
									Class350.anInt4616, 0);
					Class11_Sub2_Sub36.aClass253_9752 = class163.method1081(
							class80_7_, true);
					class80_7_.method547();
					Class11_Sub45_Sub6.aClass253_8787 = class163.method1081(
							class80_7_, true);
				}
				if (Class78.aClass253_1061 != null
						&& Class7.aClass253_49 != null
						&& Class11_Sub2_Sub36.aClass253_9752 != null) {
					int i_8_ = ((i_2_ - 2 * Class11_Sub2_Sub36.aClass253_9752
							.method1609()) / Class78.aClass253_1061
							.method1609());
					for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_8_ ^ 0xffffffff); i_9_++)
						Class78.aClass253_1061
								.method1610(
										(i_6_
												+ Class11_Sub2_Sub36.aClass253_9752
														.method1609() + i_9_
												* Class78.aClass253_1061
														.method1609()),
										(-Class78.aClass253_1061.method1615()
												+ i_5_ + i_3_));
					int i_10_ = ((-Class11_Sub2_Sub36.aClass253_9752
							.method1615() + (-i + i_5_)) / Class7.aClass253_49
							.method1615());
					for (int i_11_ = 0; (i_10_ ^ 0xffffffff) < (i_11_ ^ 0xffffffff); i_11_++) {
						Class7.aClass253_49.method1610(i_6_, i_3_ + i
								- -(i_11_ * Class7.aClass253_49.method1615()));
						Class108_Sub16.aClass253_6549
								.method1610(
										(-Class108_Sub16.aClass253_6549
												.method1609() + i_2_ + i_6_),
										(Class7.aClass253_49.method1615()
												* i_11_ + (i + i_3_)));
					}
					Class11_Sub2_Sub36.aClass253_9752.method1610(
							i_6_,
							i_3_
									+ (i_5_ - Class11_Sub2_Sub36.aClass253_9752
											.method1615()));
					Class11_Sub45_Sub6.aClass253_8787
							.method1610((-Class11_Sub2_Sub36.aClass253_9752
									.method1609() + (i_6_ + i_2_)),
									(-Class11_Sub2_Sub36.aClass253_9752
											.method1615() + (i_3_ - -i_5_)));
				}
				if (i_4_ == 0)
					break;
				aClass370_9505 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("rs.D(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
								+ ',' + i_5_ + ',' + i_6_ + ','
								+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class11_Sub45_Sub17(Class376_Sub7_Sub5_Sub2 class376_sub7_sub5_sub2) {
		try {
			((Class11_Sub45_Sub17) this).aClass376_Sub7_Sub5_Sub2_9508 = class376_sub7_sub5_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("rs.<init>("
							+ (class376_sub7_sub5_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}
}
