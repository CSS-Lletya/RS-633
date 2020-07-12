/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class363 {
	static int anInt4719;
	int anInt4720 = 0;
	Class33_Sub3 aClass33_Sub3_4721;
	Runnable aRunnable4722;
	boolean aBool4723;
	int anInt4724;
	static int anInt4725;
	int anInt4726;
	static int anInt4727;
	boolean aBool4728;
	int anInt4729 = 0;
	static float[] aFloatArray4730 = new float[4];
	boolean aBool4731 = true;
	static boolean[] aBoolArray4732 = new boolean[100];
	static int anInt4733;
	private Class163_Sub1 aClass163_Sub1_4734;
	int anInt4735;
	static int anInt4736;
	Class206_Sub1 aClass206_Sub1_4737;
	int[] anIntArray4738;
	Class206_Sub1 aClass206_Sub1_4739;
	int[] anIntArray4740;
	int[] anIntArray4741;
	Class206_Sub1 aClass206_Sub1_4742;
	int[] anIntArray4743;
	int[] anIntArray4744;
	int[] anIntArray4745;
	Class206_Sub1 aClass206_Sub1_4746;
	int anInt4747;
	int anInt4748;
	int[] anIntArray4749;
	Class206_Sub1 aClass206_Sub1_4750;
	int[] anIntArray4751;
	int[] anIntArray4752;
	int[] anIntArray4753;
	int[] anIntArray4754;
	int[] anIntArray4755;
	Class206_Sub1 aClass206_Sub1_4756;
	int[] anIntArray4757;
	int[] anIntArray4758;
	Class206_Sub1 aClass206_Sub1_4759;
	Class206_Sub1 aClass206_Sub1_4760;
	int[] anIntArray4761;
	int[] anIntArray4762;
	int[] anIntArray4763;
	float[] aFloatArray4764;
	int[] anIntArray4765;
	int[] anIntArray4766;
	Class296 aClass296_4767;
	Class206_Sub1 aClass206_Sub1_4768;
	int[] anIntArray4769;
	int anInt4770;
	Class206_Sub1 aClass206_Sub1_4771;
	int[] anIntArray4772;

	public static void method2151(boolean bool) {
		try {
			if (bool != false)
				aBoolArray4732 = null;
			aFloatArray4730 = null;
			aBoolArray4732 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wn.E(" + bool + ')');
		}
	}

	static final boolean method2152(int i, boolean bool, int i_0_) {
		try {
			anInt4733++;
			if (bool != false)
				return false;
			if ((0x800 & i_0_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wn.F(" + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	final void method2153(byte i, Runnable runnable) {
		try {
			if (i == -126) {
				((Class363) this).aRunnable4722 = runnable;
				anInt4736++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wn.A(" + i + ','
					+ (runnable != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2154(byte i) {
		do {
			try {
				anInt4725++;
				if (Class19_Sub1.aClass209Array5765 == null) {
					Class19_Sub1.aClass209Array5765 = Class209.method1344(10);
					Class11_Sub2_Sub26.aClass209_9344 = Class19_Sub1.aClass209Array5765[0];
					Class210.aLong2848 = Class137.method878((byte) -101);
				}
				if (Class321_Sub2.aClass382_6641 == null)
					Class207.method1332(18429);
				Class209 class209 = Class11_Sub2_Sub26.aClass209_9344;
				if (i >= 122) {
					int i_1_ = Class347.method2093(1);
					if (Class11_Sub2_Sub26.aClass209_9344 == class209) {
						Class55.aString836 = (((Class209) Class11_Sub2_Sub26.aClass209_9344).aClass26_2816
								.method217((byte) 90,
										Class11_Sub45_Sub1_Sub2.anInt9884));
						if (((Class209) Class11_Sub2_Sub26.aClass209_9344).aBool2814)
							Class78.anInt1051 = (((Class209) (Class11_Sub2_Sub26.aClass209_9344)).anInt2813 - -((-(((Class209) Class11_Sub2_Sub26.aClass209_9344).anInt2813) + (((Class209) Class11_Sub2_Sub26.aClass209_9344).anInt2818))
									* i_1_ / 100));
						if (((Class209) Class11_Sub2_Sub26.aClass209_9344).aBool2819)
							Class55.aString836 += Class78.anInt1051 + "%";
					} else if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2841) {
						Class321_Sub2.aClass382_6641 = null;
						Class83.method575(false, 3);
					} else {
						Class55.aString836 = (((Class209) class209).aClass26_2811
								.method217((byte) 114,
										Class11_Sub45_Sub1_Sub2.anInt9884));
						Class78.anInt1051 = ((Class209) class209).anInt2818;
						if (((Class209) Class11_Sub2_Sub26.aClass209_9344).aBool2819)
							Class55.aString836 += ((Class209) class209).anInt2818
									+ "%";
						if ((((Class209) Class11_Sub2_Sub26.aClass209_9344).aBool2814)
								|| ((Class209) class209).aBool2814)
							Class210.aLong2848 = Class137.method878((byte) -40);
					}
					if (Class321_Sub2.aClass382_6641 == null)
						break;
					Class321_Sub2.aClass382_6641.method2235(
							(Class11_Sub2_Sub26.aClass209_9344),
							Class55.aString836, Class210.aLong2848,
							Class78.anInt1051, (byte) 124);
					if (Class111.anInterface11Array1524 == null)
						break;
					for (int i_2_ = 1 + Class182.anInt2339; ((Class111.anInterface11Array1524.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
						if ((Class111.anInterface11Array1524[i_2_]
								.method30(113) ^ 0xffffffff) <= -101
								&& (i_2_ - 1 ^ 0xffffffff) == (Class182.anInt2339 ^ 0xffffffff)
								&& Class285.anInt3846 >= 1
								&& Class321_Sub2.aClass382_6641
										.method2239((byte) -87)) {
							try {
								Class111.anInterface11Array1524[i_2_]
										.method39(93);
							} catch (Exception exception) {
								Class111.anInterface11Array1524 = null;
								break;
							}
							Class321_Sub2.aClass382_6641.method2242(
									Class111.anInterface11Array1524[i_2_],
									(byte) -30);
							Class182.anInt2339++;
							if ((-1 + Class111.anInterface11Array1524.length <= Class182.anInt2339)
									&& Class111.anInterface11Array1524.length > 1)
								Class182.anInt2339 = Class163_Sub2.aClass346_7418
										.method2091(-22358) ? 0 : -1;
						}
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wn.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2155(byte i) {
		try {
			anInt4719++;
			if (Class27.anIntArray359 == null)
				Class27.anIntArray359 = new int[65536];
			else
				return;
			double d = 0.7 + (-0.015 + Math.random() * 0.03);
			if (i == 102) {
				for (int i_3_ = 0; i_3_ < 65536; i_3_++) {
					double d_4_ = (double) (0x3f & i_3_ >> 10) / 64.0 + 0.0078125;
					double d_5_ = 0.0625 + (double) ((0x3a1 & i_3_) >> 7) / 8.0;
					double d_6_ = (double) (0x7f & i_3_) / 128.0;
					double d_7_ = d_6_;
					double d_8_ = d_6_;
					double d_9_ = d_6_;
					if (d_5_ != 0.0) {
						double d_10_;
						if (!(d_6_ < 0.5))
							d_10_ = d_6_ + d_5_ - d_6_ * d_5_;
						else
							d_10_ = (1.0 + d_5_) * d_6_;
						double d_11_ = 2.0 * d_6_ - d_10_;
						double d_12_ = 0.3333333333333333 + d_4_;
						if (d_12_ > 1.0)
							d_12_--;
						double d_13_ = d_4_;
						double d_14_ = -0.3333333333333333 + d_4_;
						if (d_14_ < 0.0)
							d_14_++;
						if (!(d_12_ * 6.0 < 1.0)) {
							if (!(2.0 * d_12_ < 1.0)) {
								if (3.0 * d_12_ < 2.0)
									d_7_ = ((d_10_ - d_11_)
											* (-d_12_ + 0.6666666666666666) * 6.0)
											+ d_11_;
								else
									d_7_ = d_11_;
							} else
								d_7_ = d_10_;
						} else
							d_7_ = d_11_ + d_12_ * (6.0 * (d_10_ - d_11_));
						if (!(6.0 * d_13_ < 1.0)) {
							if (!(2.0 * d_13_ < 1.0)) {
								if (!(3.0 * d_13_ < 2.0))
									d_8_ = d_11_;
								else
									d_8_ = (6.0 * ((d_10_ - d_11_) * (-d_13_ + 0.6666666666666666)) + d_11_);
							} else
								d_8_ = d_10_;
						} else
							d_8_ = d_11_ + (d_10_ - d_11_) * 6.0 * d_13_;
						if (!(6.0 * d_14_ < 1.0)) {
							if (d_14_ * 2.0 < 1.0)
								d_9_ = d_10_;
							else if (!(3.0 * d_14_ < 2.0))
								d_9_ = d_11_;
							else
								d_9_ = d_11_
										+ ((-d_14_ + 0.6666666666666666)
												* (d_10_ - d_11_) * 6.0);
						} else
							d_9_ = d_14_ * ((-d_11_ + d_10_) * 6.0) + d_11_;
					}
					d_7_ = Math.pow(d_7_, d);
					d_8_ = Math.pow(d_8_, d);
					d_9_ = Math.pow(d_9_, d);
					int i_15_ = (int) (256.0 * d_7_);
					int i_16_ = (int) (d_8_ * 256.0);
					int i_17_ = (int) (256.0 * d_9_);
					int i_18_ = i_17_ + (i_15_ << 16) - -(i_16_ << 8);
					Class27.anIntArray359[i_3_] = i_18_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wn.D(" + i + ')');
		}
	}

	final void method2156(byte i) {
		do {
			try {
				((Class363) this).aClass296_4767 = new Class296(
						aClass163_Sub1_4734, this);
				anInt4727++;
				if (i == 58)
					break;
				method2155((byte) 33);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wn.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class363(Class163_Sub1 class163_sub1) {
		((Class363) this).anInt4726 = 0;
		((Class363) this).anInt4735 = 0;
		((Class363) this).aBool4728 = false;
		((Class363) this).aClass33_Sub3_4721 = new Class33_Sub3();
		((Class363) this).anIntArray4741 = new int[10];
		((Class363) this).anIntArray4744 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4740 = new int[8];
		((Class363) this).anIntArray4745 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4752 = new int[10000];
		((Class363) this).anIntArray4755 = new int[10];
		((Class363) this).anIntArray4758 = new int[10];
		((Class363) this).anIntArray4753 = new int[64];
		((Class363) this).anIntArray4743 = new int[64];
		((Class363) this).anIntArray4738 = new int[64];
		((Class363) this).anIntArray4757 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4762 = new int[8];
		((Class363) this).anIntArray4769 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4766 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4751 = new int[64];
		((Class363) this).anIntArray4765 = new int[8];
		((Class363) this).anIntArray4763 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4761 = new int[10];
		((Class363) this).anIntArray4749 = new int[Class206_Sub1.anInt6017];
		((Class363) this).anIntArray4772 = new int[10000];
		((Class363) this).aFloatArray4764 = new float[2];
		try {
			aClass163_Sub1_4734 = class163_sub1;
			((Class363) this).anInt4724 = -255
					+ ((Class163_Sub1) aClass163_Sub1_4734).anInt5201;
			((Class363) this).aClass296_4767 = new Class296(class163_sub1, this);
			((Class363) this).aClass206_Sub1_4746 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4771 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4739 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4750 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4760 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4742 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4756 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4768 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4737 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).aClass206_Sub1_4759 = new Class206_Sub1(
					aClass163_Sub1_4734);
			((Class363) this).anIntArray4754 = new int[Class206_Sub1.anInt6021];
			for (int i = 0; i < Class206_Sub1.anInt6021; i++)
				((Class363) this).anIntArray4754[i] = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wn.<init>("
					+ (class163_sub1 != null ? "{...}" : "null") + ')');
		}
	}
}
