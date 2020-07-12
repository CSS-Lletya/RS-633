/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class340 implements Interface10 {
	static IncomingPacket aClass160_4489;
	static OutgoingPacket aClass370_4490 = new OutgoingPacket(55, 6);
	static int anInt4491;
	static int anInt4492;
	int[] anIntArray4493;
	private Class377 aClass377_4494;
	int anInt4495;
	private Class163_Sub1 aClass163_Sub1_4496;
	int anInt4497;
	static int anInt4498;
	static Class11_Sub10[] aClass11_Sub10Array4499 = new Class11_Sub10[300];
	float[] aFloatArray4500;

	static final void method2051(int i, boolean bool) {
		try {
			anInt4498++;
			if (RunClient.ENABLE_LOBBY) {
				if (bool == false) {
					if ((Class11_Sub45_Sub1_Sub2.anInt9885 ^ 0xffffffff) != -2) {
						if ((Class11_Sub45_Sub1_Sub2.anInt9885 ^ 0xffffffff) == -3)
							Class115.anInt1567 = i;
					} else
						Class11_Sub29.anInt6598 = i;
				}
			} else {
				Class115.anInt1567 = i;
				Class11_Sub29.anInt6598 = i;

			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "va.D(" + i + ','
					+ bool + ')');
		}
	}

	public final void method35(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, boolean bool, boolean bool_5_) {
		try {
			Class108_Sub22
					.method2964(
							i,
							i_2_,
							((Class11_Sub30) (((Class163_Sub1) aClass163_Sub1_4496).aClass11_Sub30_5170)).anIntArray6611,
							((Class11_Sub30) (((Class163_Sub1) aClass163_Sub1_4496).aClass11_Sub30_5170)).anInt6613,
							bool ? ((Class340) this).anIntArray4493 : null,
							((Class340) this).anInt4497,
							(bool_5_ ? ((Class163_Sub1) aClass163_Sub1_4496).aFloatArray5187
									: null), i_0_, i_1_, -122, !bool_5_ ? null
									: ((Class340) this).aFloatArray4500, i_3_,
							i_4_);
			anInt4492++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("va.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + bool + ',' + bool_5_ + ')'));
		}
	}

	public final void method34(int i, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, boolean bool, boolean bool_11_) {
		try {
			Class108_Sub22
					.method2964(
							i,
							i_8_,
							((Class340) this).anIntArray4493,
							((Class340) this).anInt4497,
							(!bool ? null
									: ((Class11_Sub30) (((Class163_Sub1) aClass163_Sub1_4496).aClass11_Sub30_5170)).anIntArray6611),
							((Class11_Sub30) (((Class163_Sub1) aClass163_Sub1_4496).aClass11_Sub30_5170)).anInt6613,
							bool_11_ ? ((Class340) this).aFloatArray4500 : null,
							i_6_,
							i_7_,
							-101,
							(!bool_11_ ? null
									: ((Class163_Sub1) aClass163_Sub1_4496).aFloatArray5187),
							i_9_, i_10_);
			anInt4491++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("va.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_
					+ ',' + bool + ',' + bool_11_ + ')'));
		}
	}

	public static void method2052(int i) {
		do {
			try {
				aClass11_Sub10Array4499 = null;
				aClass160_4489 = null;
				aClass370_4490 = null;
				if (i == -7045)
					break;
				aClass370_4490 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "va.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class340(Class163_Sub1 class163_sub1, Class253 class253, Class377 class377) {
		do {
			try {
				aClass163_Sub1_4496 = class163_sub1;
				if (class253 instanceof Class253_Sub3_Sub3) {
					Class253_Sub3_Sub3 class253_sub3_sub3 = (Class253_Sub3_Sub3) class253;
					((Class340) this).anInt4495 = ((Class253_Sub3) class253_sub3_sub3).anInt7671;
					((Class340) this).anInt4497 = ((Class253_Sub3) class253_sub3_sub3).anInt7679;
					((Class340) this).anIntArray4493 = (((Class253_Sub3_Sub3) class253_sub3_sub3).anIntArray9002);
				} else if (class253 instanceof Class253_Sub3_Sub2) {
					Class253_Sub3_Sub2 class253_sub3_sub2 = (Class253_Sub3_Sub2) class253;
					((Class340) this).anInt4495 = ((Class253_Sub3) class253_sub3_sub2).anInt7671;
					((Class340) this).anIntArray4493 = (((Class253_Sub3_Sub2) class253_sub3_sub2).anIntArray8799);
					((Class340) this).anInt4497 = ((Class253_Sub3) class253_sub3_sub2).anInt7679;
				} else
					throw new RuntimeException();
				if (class377 == null)
					break;
				aClass377_4494 = class377;
				if (((((Class340) this).anInt4497 ^ 0xffffffff) != (((Class377) aClass377_4494).anInt4914 ^ 0xffffffff))
						|| (((Class377) aClass377_4494).anInt4915 != ((Class340) this).anInt4495))
					throw new RuntimeException();
				((Class340) this).aFloatArray4500 = ((Class377) aClass377_4494).aFloatArray4917;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("va.<init>("
						+ (class163_sub1 != null ? "{...}" : "null") + ','
						+ (class253 != null ? "{...}" : "null") + ','
						+ (class377 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
