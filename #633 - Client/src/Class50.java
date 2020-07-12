/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class50 {
	static int anInt757;
	private boolean aBool758 = false;
	private Class206 aClass206_759;
	private int anInt760;
	static int anInt761;
	private Class376_Sub7 aClass376_Sub7_762;
	int anInt763;
	static int anInt764;
	static int anInt765;
	static int anInt766;
	int anInt767;
	int anInt768;
	private int anInt769;
	private boolean aBool770;
	Class376_Sub10 aClass376_Sub10_771;
	private int anInt772 = 0;
	static int anInt773;
	private boolean[] aBoolArray774;
	private int anInt775;
	static int anInt776;
	static int anInt777;
	private boolean aBool778;
	private Class11_Sub45_Sub1 aClass11_Sub45_Sub1_779;
	private int anInt780 = -1;
	private byte aByte781;
	static int[] anIntArray782 = new int[1000];
	private Class281 aClass281_783;
	private int anInt784;
	private int anInt785;
	static int anInt786;
	static int anInt787;
	static int anInt788;
	private byte aByte789;
	private int anInt790;
	private int anInt791;
	static int anInt792;

	final boolean method417(int i) {
		try {
			anInt757++;
			int i_0_ = 118 % ((i - 59) / 32);
			return aBool778;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wca.F(" + i + ')');
		}
	}

	public static void method418(int i) {
		do {
			try {
				anIntArray782 = null;
				if (i == 0)
					break;
				anIntArray782 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "wca.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final int method419(byte i) {
		try {
			int i_1_ = 99 / ((i - 56) / 57);
			anInt777++;
			return anInt772;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wca.H(" + i + ')');
		}
	}

	final void method420(int i, byte i_2_) {
		try {
			aBool758 = true;
			anInt766++;
			int i_3_ = 66 % ((i_2_ + 61) / 49);
			method426((byte) -113, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wca.E(" + i + ','
					+ i_2_ + ')');
		}
	}

	private final void method421(int i, Class376_Sub7 class376_sub7) {
		try {
			int i_4_ = -86 % ((i + 72) / 46);
			anInt764++;
			int i_5_;
			while_253_: for (;;) {
				if (aClass281_783 == null) {
					if (aBool758)
						return;
					method426((byte) -113, -1);
					if (aClass281_783 == null)
						return;
				}
				i_5_ = Class11_Sub25.anInt6279 + -anInt769;
				if (i_5_ > 100 && ((Class281) aClass281_783).anInt3808 > 0) {
					int i_6_;
					for (i_6_ = (-((Class281) aClass281_783).anInt3808 + (((Class281) aClass281_783).anIntArray3794).length); ((anInt790 ^ 0xffffffff) > (i_6_ ^ 0xffffffff) && i_5_ > (((Class281) aClass281_783).anIntArray3817[anInt790])); anInt790++)
						i_5_ -= (((Class281) aClass281_783).anIntArray3817[anInt790]);
					if (i_6_ <= anInt790) {
						int i_7_ = 0;
						for (int i_8_ = i_6_; (((Class281) aClass281_783).anIntArray3794.length > i_8_); i_8_++)
							i_7_ += (((Class281) aClass281_783).anIntArray3817[i_8_]);
						i_5_ %= i_7_;
					}
					anInt760 = anInt790 + 1;
					if ((anInt760 ^ 0xffffffff) <= (((Class281) aClass281_783).anIntArray3794.length ^ 0xffffffff)) {
						anInt760 -= ((Class281) aClass281_783).anInt3808;
						if (anInt760 < 0
								|| ((((Class281) aClass281_783).anIntArray3794).length ^ 0xffffffff) >= (anInt760 ^ 0xffffffff))
							anInt760 = -1;
					}
				}
				for (;;) {
					if ((i_5_ ^ 0xffffffff) >= (((Class281) aClass281_783).anIntArray3817[anInt790] ^ 0xffffffff))
						break while_253_;
					Class268.method1690(-701644944, anInt790, class376_sub7,
							aClass281_783);
					i_5_ -= ((Class281) aClass281_783).anIntArray3817[anInt790];
					anInt790++;
					if ((((Class281) aClass281_783).anIntArray3794.length ^ 0xffffffff) >= (anInt790 ^ 0xffffffff)) {
						anInt790 -= ((Class281) aClass281_783).anInt3808;
						if (anInt790 < 0
								|| (((Class281) aClass281_783).anIntArray3794).length <= anInt790) {
							aClass281_783 = null;
							break;
						}
					}
					anInt760 = 1 + anInt790;
					if (anInt760 >= ((Class281) aClass281_783).anIntArray3794.length) {
						anInt760 -= ((Class281) aClass281_783).anInt3808;
						if ((anInt760 ^ 0xffffffff) > -1
								|| anInt760 >= (((Class281) aClass281_783).anIntArray3794).length)
							anInt760 = -1;
					}
				}
			}
			anInt775 = i_5_;
			anInt769 = Class11_Sub25.anInt6279 - i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wca.D(" + i + ','
					+ (class376_sub7 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method422(int i, Class163 class163) {
		do {
			try {
				method424(true, -16386, true, class163, 262144);
				anInt787++;
				if (i == -1)
					break;
				((Class50) this).anInt768 = 91;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wca.I(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	protected final void finalize() {
		do {
			try {
				anInt792++;
				if (((Class50) this).aClass376_Sub10_771 == null)
					break;
				((Class50) this).aClass376_Sub10_771.method3171();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						"wca.finalize(" + ')');
			}
			break;
		} while (false);
	}

	final void method423(int i, Class163 class163) {
		do {
			try {
				if (i != 3)
					aClass206_759 = null;
				anInt776++;
				if (aClass11_Sub45_Sub1_779 == null)
					break;
				Class222.method1419(aClass11_Sub45_Sub1_779, aByte789,
						(((Class376_Sub7) aClass376_Sub7_762).anInt7045),
						(((Class376_Sub7) aClass376_Sub7_762).anInt7031),
						aBoolArray774);
				aBoolArray774 = null;
				aClass11_Sub45_Sub1_779 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wca.J(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class206 method424(boolean bool, int i, boolean bool_9_,
			Class163 class163, int i_10_) {
		try {
			anInt765++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
					(byte) 109, ((Class50) this).anInt768);
			if (((Class42) class42).anIntArray683 != null)
				class42 = class42.method380(Class11_Sub26.aClass97_6296, 0);
			if (class42 == null) {
				method423(3, class163);
				anInt780 = -1;
				anInt785 = -1;
				anInt784 = -1;
				return null;
			}
			if (!aBool758
					&& (anInt784 ^ 0xffffffff) != (((Class42) class42).anInt693 ^ 0xffffffff)) {
				aClass206_759 = null;
				method426((byte) -113, -1);
			}
			method421(i + 16268, aClass376_Sub7_762);
			if (bool_9_) {
				bool_9_ = bool_9_
						& (aBool778 & (((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub26_5717
								.method3147(false) != 0));
				bool_9_ = (bool_9_ & (((((Class42) class42).anInt693 ^ 0xffffffff) != (anInt785 ^ 0xffffffff)) || (aClass281_783 != null
						&& ((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub26_5717
								.method3147(false) >= 2 && (anInt780 != anInt790 || ((((Class281) aClass281_783).aBool3797 || Class11_Sub2_Sub11.aBool8858) && anInt790 != anInt760)))));
			}
			if (i != -16386)
				method418(-121);
			if (bool && !bool_9_) {
				anInt784 = ((Class42) class42).anInt693;
				return null;
			}
			if (bool_9_) {
				Class222.method1419(aClass11_Sub45_Sub1_779, aByte789,
						(((Class376_Sub7) aClass376_Sub7_762).anInt7045),
						(((Class376_Sub7) aClass376_Sub7_762).anInt7031),
						aBoolArray774);
				anInt785 = -1;
				anInt780 = -1;
			}
			Class12 class12 = Class315.aClass12Array4179[aByte789];
			Class12 class12_11_;
			if (!aBool770)
				class12_11_ = (aByte789 >= 3 ? null
						: Class315.aClass12Array4179[1 + aByte789]);
			else
				class12_11_ = Class11_Sub2_Sub38.aClass12Array9796[0];
			Class206 class206 = null;
			if (aClass281_783 == null) {
				if (aClass206_759 == null
						|| (i_10_ ^ 0xffffffff) != (i_10_ & aClass206_759.ua() ^ 0xffffffff)
						|| ((((Class42) class42).anInt693 ^ 0xffffffff) != (anInt784 ^ 0xffffffff))) {
					if (aClass206_759 != null)
						i_10_ |= aClass206_759.ua();
					Class189 class189 = (class42
							.method384(
									-109,
									class12.method130(
											((Class376_Sub7) aClass376_Sub7_762).anInt7031,
											((Class376_Sub7) aClass376_Sub7_762).anInt7045,
											125),
									class12,
									class12_11_,
									bool_9_,
									((((Class50) this).anInt767 ^ 0xffffffff) != -12 ? ((Class50) this).anInt763
											: ((Class50) this).anInt763 + 4),
									((Class376_Sub7) aClass376_Sub7_762).anInt7045,
									((Class376_Sub7) aClass376_Sub7_762).anInt7031,
									class163,
									i_10_,
									((((Class50) this).anInt767 ^ 0xffffffff) != -12 ? ((Class50) this).anInt767
											: 10)));
					if (class189 == null) {
						aClass11_Sub45_Sub1_779 = null;
						aClass206_759 = null;
						anInt791 = 0;
						aBoolArray774 = null;
						anInt772 = 0;
					} else {
						aClass206_759 = class206 = ((Class189) class189).aClass206_2431;
						if (bool_9_) {
							aBoolArray774 = null;
							aClass11_Sub45_Sub1_779 = (((Class189) class189).aClass11_Sub45_Sub1_2432);
							Class11_Sub45
									.method3188(
											aClass11_Sub45_Sub1_779,
											aByte789,
											(((Class376_Sub7) aClass376_Sub7_762).anInt7045),
											(((Class376_Sub7) aClass376_Sub7_762).anInt7031),
											null);
							anInt785 = ((Class42) class42).anInt693;
							anInt780 = -1;
						}
						anInt772 = class206.fa();
						anInt791 = class206.ma();
					}
				} else
					class206 = aClass206_759;
			} else {
				if (bool_9_)
					i_10_ |= 0x40000;
				class206 = (class42
						.method388(
								anInt775,
								i_10_,
								class163,
								class12.method130(
										(((Class376_Sub7) aClass376_Sub7_762).anInt7031),
										(((Class376_Sub7) aClass376_Sub7_762).anInt7045),
										i ^ 0x407c),
								((Class376_Sub7) aClass376_Sub7_762).anInt7031,
								class12,
								anInt790,
								0,
								(((Class50) this).anInt767 == 11 ? 4 + ((Class50) this).anInt763
										: ((Class50) this).anInt763),
								anInt760,
								aClass281_783,
								((((Class50) this).anInt767 ^ 0xffffffff) == -12 ? 10
										: ((Class50) this).anInt767),
								class12_11_,
								((Class376_Sub7) aClass376_Sub7_762).anInt7045));
				if (class206 == null) {
					aBoolArray774 = null;
					anInt791 = 0;
					anInt772 = 0;
					aClass11_Sub45_Sub1_779 = null;
				} else {
					if (bool_9_) {
						if (aBoolArray774 == null)
							aBoolArray774 = new boolean[4];
						aClass11_Sub45_Sub1_779 = class206
								.ba(aClass11_Sub45_Sub1_779);
						Class11_Sub45.method3188(aClass11_Sub45_Sub1_779,
								aByte789,
								((Class376_Sub7) aClass376_Sub7_762).anInt7045,
								((Class376_Sub7) aClass376_Sub7_762).anInt7031,
								aBoolArray774);
						anInt785 = ((Class42) class42).anInt693;
						anInt780 = anInt790;
					}
					anInt772 = class206.fa();
					anInt791 = class206.ma();
				}
				aClass206_759 = null;
			}
			anInt784 = ((Class42) class42).anInt693;
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("wca.C(" + bool + ',' + i + ',' + bool_9_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_10_ + ')'));
		}
	}

	final int method425(int i) {
		try {
			anInt788++;
			if (i >= 0)
				method427(null, 89, false, null, (byte) 67, null, -55, 57, 60);
			return anInt791;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wca.K(" + i + ')');
		}
	}

	private final void method426(byte i, int i_12_) {
		try {
			anInt761++;
			int i_13_ = i_12_;
			boolean bool = false;
			if (i_13_ == -1) {
				Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
						(byte) 26, ((Class50) this).anInt768);
				Class42 class42_14_ = class42;
				if (((Class42) class42).anIntArray683 != null)
					class42 = class42.method380(Class11_Sub26.aClass97_6296, 0);
				if (class42 == null)
					return;
				if (class42 == class42_14_)
					class42_14_ = null;
				if (((Class42) class42).anIntArray669 != null) {
					if (aClass281_783 != null
							&& class42.method371(
									(((Class281) aClass281_783).anInt3810),
									(byte) 88))
						return;
					i_13_ = class42.method381(i ^ ~0x3d);
					if ((((Class42) class42).anInt693 ^ 0xffffffff) != (anInt784 ^ 0xffffffff))
						bool = ((Class42) class42).aBool650;
				} else if (((Class42) class42).anInt688 != -1) {
					if (((Class42) class42).anInt693 != anInt784) {
						bool = ((Class42) class42).aBool650;
						i_13_ = ((Class42) class42).anInt688;
					}
				} else if (class42_14_ != null
						&& ((Class42) class42_14_).anIntArray669 != null) {
					if (aClass281_783 != null
							&& class42_14_.method371(
									(((Class281) aClass281_783).anInt3810),
									(byte) 103))
						return;
					i_13_ = class42_14_.method381(15);
					if ((((Class42) class42_14_).anInt693 ^ 0xffffffff) != (anInt784 ^ 0xffffffff))
						bool = ((Class42) class42_14_).aBool650;
				} else if (class42_14_ != null
						&& ((((Class42) class42_14_).anInt688 ^ 0xffffffff) != 0)
						&& ((((Class42) class42_14_).anInt693 ^ 0xffffffff) != (anInt784 ^ 0xffffffff))) {
					bool = ((Class42) class42_14_).aBool650;
					i_13_ = ((Class42) class42_14_).anInt688;
				}
			}
			if ((i_13_ ^ 0xffffffff) == 0)
				aClass281_783 = null;
			else {
				aClass206_759 = null;
				if (aClass281_783 != null
						&& ((((Class281) aClass281_783).anInt3810 ^ 0xffffffff) == (i_13_ ^ 0xffffffff))) {
					if ((((Class281) aClass281_783).anInt3816 ^ 0xffffffff) == -1)
						return;
				} else
					aClass281_783 = Class108_Sub23.aClass198_7760.method1284(
							i_13_, (byte) -119);
				if (((Class281) aClass281_783).anIntArray3794 == null)
					aClass281_783 = null;
				else {
					if (i != -113)
						finalize();
					if (bool) {
						anInt790 = (int) ((double) (((Class281) aClass281_783).anIntArray3794).length * Math
								.random());
						anInt775 = 1 + (int) (Math.random() * (double) (((Class281) aClass281_783).anIntArray3817[anInt790]));
					} else {
						anInt775 = 1;
						anInt790 = 0;
					}
					anInt760 = 1 + anInt790;
					if (anInt760 < 0
							|| (((Class281) aClass281_783).anIntArray3794.length ^ 0xffffffff) >= (anInt760 ^ 0xffffffff))
						anInt760 = -1;
					anInt769 = -anInt775 + Class11_Sub25.anInt6279;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wca.G(" + i + ','
					+ i_12_ + ')');
		}
	}

	final void method427(Class206 class206, int i, boolean bool,
			Class163 class163, byte i_15_, Class33 class33, int i_16_,
			int i_17_, int i_18_) {
		do {
			try {
				anInt786++;
				Class110[] class110s = class206.method1307();
				int i_19_ = 79 % ((i_15_ + 65) / 60);
				Class261[] class261s = class206.method1325();
				if ((((Class50) this).aClass376_Sub10_771 == null || ((Class376_Sub10) ((Class50) this).aClass376_Sub10_771).aBool7877)
						&& (class110s != null || class261s != null)) {
					Class42 class42 = Class11_Sub4.aClass290_5237.method1793(
							(byte) 127, (((Class50) this).anInt768));
					if (((Class42) class42).anIntArray683 != null)
						class42 = class42.method380(
								Class11_Sub26.aClass97_6296, 0);
					if (class42 != null)
						((Class50) this).aClass376_Sub10_771 = Class376_Sub10
								.method3166(Class11_Sub25.anInt6279, true);
				}
				if (((Class50) this).aClass376_Sub10_771 == null)
					break;
				class206.method1318(class33);
				do {
					if (!bool) {
						((Class50) this).aClass376_Sub10_771
								.method3168((long) Class11_Sub25.anInt6279);
						if (!client.aBool10531)
							break;
					}
					((Class50) this).aClass376_Sub10_771.method3176(class163,
							(long) Class11_Sub25.anInt6279, class110s,
							class261s, false);
				} while (false);
				((Class50) this).aClass376_Sub10_771.method3170(aByte781,
						i_17_, i, i_18_, i_16_);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wca.A("
						+ (class206 != null ? "{...}" : "null") + ',' + i + ','
						+ bool + ',' + (class163 != null ? "{...}" : "null")
						+ ',' + i_15_ + ','
						+ (class33 != null ? "{...}" : "null") + ',' + i_16_
						+ ',' + i_17_ + ',' + i_18_ + ')'));
			}
			break;
		} while (false);
	}

	Class50(Class163 class163, Class42 class42, int i, int i_20_, int i_21_,
			int i_22_, Class376_Sub7 class376_sub7, boolean bool, int i_23_) {
		aBool770 = false;
		anInt784 = -1;
		anInt785 = -1;
		anInt791 = 0;
		try {
			aBool770 = bool;
			((Class50) this).anInt763 = i_20_;
			aByte781 = (byte) i_21_;
			((Class50) this).anInt768 = ((Class42) class42).anInt693;
			((Class50) this).anInt767 = i;
			aClass376_Sub7_762 = class376_sub7;
			aByte789 = (byte) i_22_;
			aBool778 = (class163.method1084() && ((Class42) class42).aBool634 && !aBool770);
			if ((i_23_ ^ 0xffffffff) != 0)
				aBool758 = true;
			method426((byte) -113, i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wca.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (class42 != null ? "{...}" : "null") + ',' + i + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ','
					+ (class376_sub7 != null ? "{...}" : "null") + ',' + bool
					+ ',' + i_23_ + ')'));
		}
	}
}
