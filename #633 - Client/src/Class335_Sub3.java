/* Class335_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class335_Sub3 extends Class335 {
	static int anInt7793;
	Class253 aClass253_7794;
	private Class253 aClass253_7795;
	static int anInt7796;
	static int anInt7797;
	static int anInt7798;
	static int anInt7799;
	static int anInt7800;
	private Class253 aClass253_7801;
	static int anInt7802;
	private Class253 aClass253_7803;
	static int anInt7804;
	static Class16 aClass16_7805 = new Class16();
	private Class253 aClass253_7806;
	private Class253 aClass253_7807;
	static int anInt7808;
	static int anInt7809;

	public static void method3140(int i) {
		do {
			try {
				aClass16_7805 = null;
				if (i == 11)
					break;
				method3143(-44, -122, -13, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "to.H(" + i + ')');
			}
			break;
		} while (false);
	}

	Class335_Sub3(Class146 class146, Class146 class146_0_,
			Class254_Sub2 class254_sub2) {
		super(class146, class146_0_, (Class254) class254_sub2);
	}

	public final boolean method24(int i) {
		try {
			anInt7809++;
			if (!super.method24(i))
				return false;
			Class254_Sub2 class254_sub2 = (Class254_Sub2) ((Class335) this).aClass254_4434;
			if (!((Class335) this).aClass146_4427.method918(
					(((Class254_Sub2) class254_sub2).anInt6991), -28))
				return false;
			if (!((Class335) this).aClass146_4427.method918(
					(((Class254_Sub2) class254_sub2).anInt6984), i + 32343))
				return false;
			if (!((Class335) this).aClass146_4427.method918(
					(((Class254_Sub2) class254_sub2).anInt6988), i + 32346))
				return false;
			if (!((Class335) this).aClass146_4427.method918(
					((Class254_Sub2) class254_sub2).anInt6993, 92))
				return false;
			if (!((Class335) this).aClass146_4427.method918(
					(((Class254_Sub2) class254_sub2).anInt6985), 125))
				return false;
			if (!((Class335) this).aClass146_4427.method918(
					(((Class254_Sub2) class254_sub2).anInt6986), 109))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "to.G(" + i + ')');
		}
	}

	static final int method3141(int i, int i_1_, int i_2_) {
		try {
			anInt7797++;
			double d = Math.log((double) i_1_) / Math.log(2.0);
			if (i >= -64)
				return 103;
			double d_3_ = Math.log((double) i_2_) / Math.log(2.0);
			double d_4_ = Math.random() * (-d_3_ + d) + d_3_;
			return (int) (Math.pow(2.0, d_4_) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("to.E(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2013(boolean bool, int i, byte i_5_, int i_6_) {
		do {
			try {
				anInt7804++;
				if (bool) {
					int[] is = new int[4];
					Class321_Sub2.aClass163_6648.K(is);
					Class321_Sub2.aClass163_6648
							.KA(i,
									i_6_,
									i
											+ (((Class254) ((Class335) this).aClass254_4434).anInt3489),
									i_6_
											- -(((Class254) ((Class335) this).aClass254_4434).anInt3490));
					int i_7_ = aClass253_7807.method1608();
					int i_8_ = aClass253_7807.method1622();
					int i_9_ = aClass253_7806.method1608();
					int i_10_ = aClass253_7806.method1622();
					aClass253_7807
							.method1610(
									i,
									((-i_8_ + (((Class254) (((Class335) this).aClass254_4434)).anInt3490)) / 2 + i_6_));
					aClass253_7806
							.method1610(
									(((Class254) (((Class335) this).aClass254_4434)).anInt3489)
											+ (i + -i_9_),
									i_6_
											- -(((((Class254) (((Class335) this).aClass254_4434)).anInt3490) - i_10_) / 2));
					Class321_Sub2.aClass163_6648
							.KA(i,
									i_6_,
									(((Class254) ((Class335) this).aClass254_4434).anInt3489)
											+ i,
									i_6_ - -aClass253_7801.method1622());
					aClass253_7801
							.method1618(
									i_7_ + i,
									i_6_,
									-i_9_
											+ ((((Class254) (((Class335) this).aClass254_4434)).anInt3489) - i_7_),
									(((Class254) (((Class335) this).aClass254_4434)).anInt3490));
					int i_11_ = aClass253_7795.method1622();
					Class321_Sub2.aClass163_6648
							.KA(i,
									-i_11_
											+ (i_6_ - -(((Class254) ((Class335) this).aClass254_4434).anInt3490)),
									(((Class254) ((Class335) this).aClass254_4434).anInt3489)
											+ i,
									i_6_
											- -(((Class254) ((Class335) this).aClass254_4434).anInt3490));
					aClass253_7795
							.method1618(
									i + i_7_,
									(-i_11_
											+ (((Class254) ((Class335) this).aClass254_4434).anInt3490) + i_6_),
									-i_7_
											+ (((Class254) ((Class335) this).aClass254_4434).anInt3489 + -i_9_),
									(((Class254) ((Class335) this).aClass254_4434).anInt3490));
					Class321_Sub2.aClass163_6648.KA(is[0], is[1], is[2], is[3]);
				}
				if (i_5_ == -104)
					break;
				aClass253_7795 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("to.C(" + bool
						+ ',' + i + ',' + i_5_ + ',' + i_6_ + ')'));
			}
			break;
		} while (false);
	}

	final void method2014(int i, int i_12_, boolean bool, byte i_13_) {
		try {
			anInt7808++;
			int i_14_ = i_12_ - -aClass253_7807.method1608();
			if (i_13_ >= -88)
				method3142(-84, -116, 82, -14, 4);
			int i_15_ = (i_12_
					+ ((Class254) ((Class335) this).aClass254_4434).anInt3489 - aClass253_7806
					.method1608());
			int i_16_ = aClass253_7801.method1622() + i;
			int i_17_ = (i
					- -((Class254) ((Class335) this).aClass254_4434).anInt3490 - aClass253_7795
					.method1622());
			int i_18_ = -i_14_ + i_15_;
			int i_19_ = i_17_ + -i_16_;
			int i_20_ = this.method2016(2) * i_18_ / 10000;
			int[] is = new int[4];
			Class321_Sub2.aClass163_6648.K(is);
			Class321_Sub2.aClass163_6648.KA(i_14_, i_16_, i_14_ + i_20_, i_17_);
			method3142(i_16_, 11, i_19_, i_18_, i_14_);
			Class321_Sub2.aClass163_6648.KA(i_20_ + i_14_, i_16_, i_15_, i_17_);
			aClass253_7803.method1618(i_14_, i_16_, i_18_, i_19_);
			Class321_Sub2.aClass163_6648.KA(is[0], is[1], is[2], is[3]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("to.A(" + i + ','
					+ i_12_ + ',' + bool + ',' + i_13_ + ')'));
		}
	}

	void method3142(int i, int i_21_, int i_22_, int i_23_, int i_24_) {
		do {
			try {
				((Class335_Sub3) this).aClass253_7794.method1618(i_24_, i,
						i_23_, i_22_);
				anInt7802++;
				if (i_21_ == 11)
					break;
				method3142(10, -6, 10, 39, -124);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("to.I(" + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_
								+ ',' + i_24_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3143(int i, int i_25_, int i_26_, boolean bool) {
		try {
			anInt7799++;
			if (bool != true)
				anInt7796 = 88;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 11, i_25_);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i_26_;
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("to.D(" + i + ','
					+ i_25_ + ',' + i_26_ + ',' + bool + ')'));
		}
	}

	public final void method39(int i) {
		try {
			if (i == 11133) {
				anInt7798++;
				super.method39(i);
				Class254_Sub2 class254_sub2 = (Class254_Sub2) ((Class335) this).aClass254_4434;
				((Class335_Sub3) this).aClass253_7794 = Class228.method1473(
						-20770, ((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6991));
				aClass253_7803 = Class228.method1473(-20770,
						((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6984));
				aClass253_7807 = Class228.method1473(-20770,
						((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6988));
				aClass253_7806 = Class228.method1473(-20770,
						((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6993));
				aClass253_7801 = Class228.method1473(-20770,
						((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6985));
				aClass253_7795 = Class228.method1473(-20770,
						((Class335) this).aClass146_4427,
						(((Class254_Sub2) class254_sub2).anInt6986));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "to.B(" + i + ')');
		}
	}
}
