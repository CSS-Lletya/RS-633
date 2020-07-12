/* Class2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub7 extends Class2 {
	static int anInt6103;
	static int anInt6104;
	static int anInt6105;
	static int anInt6106;
	static int anInt6107;
	static int anInt6108;
	static int anInt6109;
	static int anInt6110;
	static int anInt6111;

	final void method67(byte i) {
		try {
			anInt6105++;
			int i_0_ = 18 / ((i + 26) / 56);
			((Class2) this).aClass163_Sub2_13.method3031(122, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fe.E(" + i + ')');
		}
	}

	static final void method2609(byte i, Packet class11_sub20_sub1) {
		try {
			class11_sub20_sub1.method3427(7);
			anInt6109++;
			int i_1_ = Class11_Sub44.anInt7791;
			Player class376_sub7_sub5_sub5_sub1 = (Class11_Sub2_Sub8.myPlayer = Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_1_] = new Player());
			((Actor) class376_sub7_sub5_sub5_sub1).anInt10319 = i_1_;
			int i_2_ = class11_sub20_sub1.readBits(30, (byte) 108);
			byte i_3_ = (byte) (i_2_ >> 28);
			int i_4_ = (0xfffc5a2 & i_2_) >> 14;
			((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0] = i_4_
					+ -Class194.anInt2641;
			int i_5_ = 0x3fff & i_2_;
			((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045 = (((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]) << 9) - -(class376_sub7_sub5_sub5_sub1
					.method3968((byte) 127) << 8));
			((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0] = -Class118.anInt1605
					+ i_5_;
			((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031 = (((((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]) << 9) - -(class376_sub7_sub5_sub5_sub1
					.method3968((byte) 127) << 8));
			Class376_Sub7_Sub2.anInt9242 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047 = ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039 = i_3_;
			if (Class321_Sub3_Sub1
					.method3613(
							(byte) -110,
							(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
							(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0])))
				((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7039++;
			if (Class70.cachedAppearances[i_1_] != null)
				class376_sub7_sub5_sub5_sub1.readAppearance(
						Class70.cachedAppearances[i_1_], 116);
			Class190.anInt2446 = 0;
			Class6.anIntArray40[Class190.anInt2446++] = i_1_;
			Class218.aByteArray3011[i_1_] = (byte) 0;
			Class11_Sub2_Sub38.anInt9794 = 0;
			if (i >= 3) {
				for (int i_6_ = 1; (i_6_ ^ 0xffffffff) > -2049; i_6_++) {
					if (i_1_ != i_6_) {
						int i_7_ = class11_sub20_sub1
								.readBits(18, (byte) 108);
						int i_8_ = i_7_ >> 16;
						int i_9_ = 0xff & i_7_ >> 8;
						int i_10_ = 0xff & i_7_;
						Class362 class362 = Class38.aClass362Array510[i_6_] = new Class362();
						((Class362) class362).anInt4708 = -1;
						((Class362) class362).anInt4706 = i_10_
								+ ((i_8_ << 28) - -(i_9_ << 14));
						((Class362) class362).anInt4709 = 0;
						((Class362) class362).aBool4712 = false;
						Class373.anIntArray4886[Class11_Sub2_Sub38.anInt9794++] = i_6_;
						Class218.aByteArray3011[i_6_] = (byte) 0;
					}
				}
				class11_sub20_sub1.finishBitAccess((byte) 125);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fe.C(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2610(int i, boolean bool, int i_11_, int i_12_,
			boolean bool_13_) {
		try {
			anInt6110++;
			if (Class11_Sub16.method2449(104, i_11_)) {
				if (bool != true)
					anInt6107 = -91;
				Class300.method1854((byte) -102,
						(Class11_Sub45_Sub5.aClass192ArrayArray8772[i_11_]), i,
						-1, bool_13_, i_12_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fe.A(" + i + ','
					+ bool + ',' + i_11_ + ',' + i_12_ + ',' + bool_13_ + ')'));
		}
	}

	final boolean method75(int i) {
		try {
			anInt6104++;
			if (i < 19)
				method68(false, -43);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fe.B(" + i + ')');
		}
	}

	final void method70(Interface15 interface15, int i, int i_14_) {
		try {
			if (i_14_ == 3) {
				anInt6108++;
				((Class2) this).aClass163_Sub2_13.method3094(interface15,
						i_14_ - 5);
				((Class2) this).aClass163_Sub2_13.method3037((byte) 117, i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fe.I("
					+ (interface15 != null ? "{...}" : "null") + ',' + i + ','
					+ i_14_ + ')'));
		}
	}

	final void method78(int i, int i_15_, int i_16_) {
		try {
			if (i_15_ >= 91)
				anInt6103++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fe.J(" + i + ','
					+ i_15_ + ',' + i_16_ + ')'));
		}
	}

	Class2_Sub7(Class163_Sub2 class163_sub2) {
		super(class163_sub2);
	}

	final void method68(boolean bool, int i) {
		try {
			((Class2) this).aClass163_Sub2_13.method3031(117, true);
			if (i <= -64)
				anInt6111++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fe.G(" + bool + ','
					+ i + ')');
		}
	}

	final void method71(int i, boolean bool) {
		try {
			if (i != 5486)
				method68(true, 81);
			anInt6106++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fe.M(" + i + ','
					+ bool + ')');
		}
	}
}
