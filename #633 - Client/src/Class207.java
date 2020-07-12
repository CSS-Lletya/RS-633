/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;

final class Class207 {
	static int anInt2782;
	private short[] aShortArray2783;
	static int anInt2784;
	private short[] aShortArray2785;
	Class221 aClass221_2786;
	static int anInt2787;
	private int[] anIntArray2788 = { -1, -1, -1, -1, -1 };
	static FileOutputStream aFileOutputStream2789;
	private short[] aShortArray2790;
	static int anInt2791;
	private int[] anIntArray2792;
	static int anInt2793;
	private short[] aShortArray2794;
	static Class22 aClass22_2795 = new Class22(32);
	static int anInt2796;
	static int anInt2797;
	static int anInt2798;
	static int anInt2799;
	static int anInt2800 = 0;
	static long[] aLongArray2801;
	static int anInt2802;

	final boolean method1330(int i) {
		try {
			anInt2793++;
			boolean bool = true;
			synchronized (((Class221) ((Class207) this).aClass221_2786).aClass146_3039) {
				int i_0_ = -112 % ((-30 - i) / 46);
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -6; i_1_++) {
					if ((anIntArray2788[i_1_] ^ 0xffffffff) != 0
							&& !(((Class221) ((Class207) this).aClass221_2786).aClass146_3039
									.method927((byte) -95,
											anIntArray2788[i_1_], 0)))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.E(" + i + ')');
		}
	}

	final void method1331(Stream stream, byte i) {
		try {
			if (i == -36) {
				anInt2791++;
				for (;;) {
					int i_2_ = stream.readUnsignedByte((byte) 35);
					if ((i_2_ ^ 0xffffffff) == -1)
						break;
					method1333((byte) -42, i_2_, stream);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.J("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1332(int i) {
		try {
			anInt2802++;
			if (i == 18429 && Class11_Sub2_Sub26.aClass209_9344 != null) {
				Class321_Sub2.aClass382_6641 = new Class382();
				Class321_Sub2.aClass382_6641
						.method2235(
								Class11_Sub2_Sub26.aClass209_9344,
								(((Class209) Class11_Sub2_Sub26.aClass209_9344).aClass26_2816
										.method217(
												(byte) 120,
												Class11_Sub45_Sub1_Sub2.anInt9884)),
								Class210.aLong2848,
								((Class209) Class11_Sub2_Sub26.aClass209_9344).anInt2813,
								(byte) 118);
				Class351.aThread4620 = new Thread(Class321_Sub2.aClass382_6641,
						"");
				Class351.aThread4620.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.D(" + i + ')');
		}
	}

	private final void method1333(byte i, int i_3_, Stream stream) {
		try {
			anInt2796++;
			if (i != -42)
				method1339((byte) -103);
			if (i_3_ != 1) {
				if (i_3_ != 2) {
					if (i_3_ != 3) {
						if ((i_3_ ^ 0xffffffff) != -41) {
							if (i_3_ == 41) {
								int i_4_ = stream.readUnsignedByte((byte) 35);
								aShortArray2783 = new short[i_4_];
								aShortArray2790 = new short[i_4_];
								for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff); i_5_++) {
									aShortArray2783[i_5_] = (short) stream
											.readUnsignedShort((byte) -65);
									aShortArray2790[i_5_] = (short) stream
											.readUnsignedShort((byte) -65);
								}
							} else if ((i_3_ ^ 0xffffffff) <= -61
									&& (i_3_ ^ 0xffffffff) > -71)
								anIntArray2788[-60 + i_3_] = stream
										.readUnsignedShort((byte) -65);
						} else {
							int i_6_ = stream.readUnsignedByte((byte) 35);
							aShortArray2794 = new short[i_6_];
							aShortArray2785 = new short[i_6_];
							for (int i_7_ = 0; (i_6_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
								aShortArray2794[i_7_] = (short) stream
										.readUnsignedShort((byte) -65);
								aShortArray2785[i_7_] = (short) stream
										.readUnsignedShort((byte) -65);
							}
						}
					}
				} else {
					int i_8_ = stream.readUnsignedByte((byte) 35);
					anIntArray2792 = new int[i_8_];
					for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++)
						anIntArray2792[i_9_] = stream
								.readUnsignedShort((byte) -65);
				}
			} else
				stream.readUnsignedByte((byte) 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kb.H(" + i + ','
					+ i_3_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1334(int i) {
		try {
			aClass22_2795 = null;
			if (i == -31693) {
				aLongArray2801 = null;
				aFileOutputStream2789 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.A(" + i + ')');
		}
	}

	final boolean method1335(int i) {
		try {
			anInt2798++;
			if (i != 10779)
				aShortArray2785 = null;
			if (anIntArray2792 == null)
				return true;
			boolean bool = true;
			synchronized (((Class221) ((Class207) this).aClass221_2786).aClass146_3039) {
				for (int i_10_ = 0; ((i_10_ ^ 0xffffffff) > (anIntArray2792.length ^ 0xffffffff)); i_10_++) {
					if (!((Class221) ((Class207) this).aClass221_2786).aClass146_3039
							.method927((byte) -114, anIntArray2792[i_10_], 0))
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.F(" + i + ')');
		}
	}

	public Class207() {
		/* empty */
	}

	static final void method1336(int i, Class163 class163) {
		do {
			try {
				anInt2782++;
				int i_11_ = 0;
				int i_12_ = 0;
				if (Class11_Sub2_Sub19.aBool9087) {
					i_11_ = Class54.method443(5467);
					i_12_ = Class376_Sub7_Sub4_Sub1.method3887((byte) -113);
				}
				class163.KA(i_11_, i_12_, i_11_ + Class11_Sub36.anInt7079,
						i_12_ + 350);
				class163.aa(i_11_, i_12_, Class11_Sub36.anInt7079, 350,
						Class11_Sub26.anInt6294 << 24 | 0x332277, 1);
				Class11.method123(i_12_ + 350, Class11_Sub36.anInt7079 + i_11_,
						(byte) -122, i_11_, i_12_);
				int i_13_ = 350 / Class2_Sub7.anInt6107;
				if ((Class11_Sub2_Sub39.anInt9807 ^ 0xffffffff) < -1) {
					int i_14_ = 346 + -Class2_Sub7.anInt6107 - 4;
					int i_15_ = i_14_ * i_13_
							/ (Class11_Sub2_Sub39.anInt9807 + (i_13_ - 1));
					int i_16_ = 4;
					if (Class11_Sub2_Sub39.anInt9807 > 1)
						i_16_ += ((i_14_ - i_15_)
								* (-Class11_Sub36.anInt7080
										+ Class11_Sub2_Sub39.anInt9807 - 1) / (-1 + Class11_Sub2_Sub39.anInt9807));
					class163.aa(i_11_ + Class11_Sub36.anInt7079 - 16, i_16_
							+ i_12_, 12, i_15_,
							Class11_Sub26.anInt6294 << 24 | 0x332277, 2);
					for (int i_17_ = Class11_Sub36.anInt7080; (i_17_ < i_13_
							+ Class11_Sub36.anInt7080 && ((i_17_ ^ 0xffffffff) > (Class11_Sub2_Sub39.anInt9807 ^ 0xffffffff))); i_17_++) {
						String[] strings = Class121.method788(11027, '\010',
								(Class11_Sub2_Sub6.aStringArray8706[i_17_]));
						int i_18_ = ((Class11_Sub36.anInt7079 - 8 - 16) / strings.length);
						for (int i_19_ = 0; ((strings.length ^ 0xffffffff) < (i_19_ ^ 0xffffffff)); i_19_++) {
							int i_20_ = 8 + i_19_ * i_18_;
							class163.KA(i_11_ - -i_20_, i_12_, i_11_
									+ (i_20_ - -i_18_) - 8, 350 + i_12_);
							OutputStream_Sub2.aClass107_7949
									.method708(
											i_11_ - -i_20_,
											173,
											-1,
											(-((-Class11_Sub36.anInt7080 + i_17_) * Class2_Sub7.anInt6107)
													+ -(((Class292) Class161.aClass292_2096).anInt3959)
													+ i_12_ - (-350
													- -Class50.anInt773 + 2)),
											Class256_Sub2.method3113(-112,
													strings[i_19_]), -16777216);
						}
					}
				}
				Class298.aClass107_4028.method716((byte) -102, -16777216, -25
						+ (i_11_ + (Class11_Sub36.anInt7079)), "Build: 633",
						-1, 350 + i_12_ - 20);
				class163.KA(i_11_, i_12_, Class11_Sub36.anInt7079 + i_11_,
						i_12_ + 350);
				class163.method1059(i_11_, -Class50.anInt773 + (i_12_ + 350),
						8985, Class11_Sub36.anInt7079, -1);
				if (i == 1599052696) {
					Class98.aClass107_1308
							.method708(
									10 + i_11_,
									173,
									-1,
									(349 + i_12_ + -(((Class292) Class256_Sub1.aClass292_5320).anInt3959)),
									("--> " + Class256_Sub2
											.method3113(i ^ ~0x5f4f9bd4,
													Class267.aString3625)),
									-16777216);
					if (!Class11_Sub12_Sub4.aBool9452)
						break;
					int i_21_ = -1;
					if (Class11_Sub25.anInt6279 % 30 > 15)
						i_21_ = 16777215;
					class163.method1022(
							121,
							(Class256_Sub1.aClass292_5320
									.method1805(
											"--> "
													+ Class256_Sub2
															.method3113(
																	i
																			^ ~0x5f4f9bd7,
																	Class267.aString3625)
															.substring(
																	0,
																	Class108_Sub4.anInt5385),
											(byte) -47))
									+ (i_11_ + 10),
							-11
									+ -(((Class292) Class256_Sub1.aClass292_5320).anInt3959)
									+ (i_12_ + 350), 12, i_21_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kb.C(" + i + ','
						+ (class163 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class179 method1337(byte i) {
		try {
			anInt2799++;
			if (anIntArray2792 == null)
				return null;
			Class179[] class179s = new Class179[anIntArray2792.length];
			synchronized (((Class221) ((Class207) this).aClass221_2786).aClass146_3039) {
				for (int i_22_ = 0; anIntArray2792.length > i_22_; i_22_++)
					class179s[i_22_] = Class11_Sub16
							.method2443(
									0,
									(((Class221) (((Class207) this).aClass221_2786)).aClass146_3039),
									anIntArray2792[i_22_], 0);
			}
			if (i != 20)
				aClass22_2795 = null;
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (anIntArray2792.length ^ 0xffffffff); i_23_++) {
				if (((Class179) class179s[i_23_]).anInt2277 < 13)
					class179s[i_23_].method1166(2, true);
			}
			Class179 class179;
			if ((class179s.length ^ 0xffffffff) != -2)
				class179 = new Class179(class179s, class179s.length);
			else
				class179 = class179s[0];
			if (class179 == null)
				return null;
			if (aShortArray2794 != null) {
				for (int i_24_ = 0; ((aShortArray2794.length ^ 0xffffffff) < (i_24_ ^ 0xffffffff)); i_24_++)
					class179.method1169(aShortArray2785[i_24_],
							aShortArray2794[i_24_], (byte) -1);
			}
			if (aShortArray2783 != null) {
				for (int i_25_ = 0; i_25_ < aShortArray2783.length; i_25_++)
					class179.method1167(aShortArray2783[i_25_],
							aShortArray2790[i_25_], i - 143);
			}
			return class179;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.B(" + i + ')');
		}
	}

	static final void method1338(long l, byte i) {
		try {
			anInt2797++;
			if (Class181.aClass364ArrayArrayArray2336 != null) {
				if (Class191.anInt2453 == 1 || Class191.anInt2453 == 5)
					Class210.method1347(l, (byte) -116);
				else if (Class191.anInt2453 == 4)
					Class11_Sub46_Sub2.method3555(l, i ^ 0x3dff);
			}
			Class58_Sub1_Sub2.method3741((long) Class11_Sub25.anInt6279,
					Class321_Sub2.aClass163_6648, -16448);
			if (Class365.anInt4797 != -1)
				Class33_Sub1.method2637(Class365.anInt4797, -125);
			if (i != 87)
				method1332(96);
			for (int i_26_ = 0; i_26_ < Class11_Sub2_Sub6.anInt8702; i_26_++) {
				if (Class11_Sub45.aBoolArray7907[i_26_])
					Class254.aBoolArray3493[i_26_] = true;
				Class363.aBoolArray4732[i_26_] = Class11_Sub45.aBoolArray7907[i_26_];
				Class11_Sub45.aBoolArray7907[i_26_] = false;
			}
			Class11_Sub2_Sub37.anInt9757 = Class11_Sub25.anInt6279;
			Class330.method1996(-1, -1, null, 0);
			Class376_Sub7_Sub5_Sub1.method3884(null, -1, -104, -1);
			if (Class365.anInt4797 != -1) {
				Class11_Sub2_Sub6.anInt8702 = 0;
				Class11_Sub47.method3214((byte) -72);
			}
			Class321_Sub2.aClass163_6648.la();
			Class100.method666(Class321_Sub2.aClass163_6648, -16711936);
			int i_27_ = Class268.method1691(false);
			if (i_27_ == -1)
				i_27_ = Class325.anInt4329;
			if ((i_27_ ^ 0xffffffff) == 0)
				i_27_ = Class11_Sub10.anInt5389;
			Class32_Sub1.method2441(i_27_, (byte) 125);
			int i_28_ = (Class11_Sub2_Sub8.myPlayer.method3968((byte) 127) << 8);
			Class11_Sub17.method2452(
					(((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7031)
							+ i_28_,
					(((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045)
							+ i_28_,
					(((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).aByte7047),
					(byte) 109, Class104.anInt1398);
			Class104.anInt1398 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.I(" + l + ',' + i
					+ ')');
		}
	}

	final Class179 method1339(byte i) {
		try {
			anInt2787++;
			Class179[] class179s = new Class179[5];
			int i_29_ = 0;
			synchronized (((Class221) ((Class207) this).aClass221_2786).aClass146_3039) {
				for (int i_30_ = 0; i_30_ < 5; i_30_++) {
					if (anIntArray2788[i_30_] != -1)
						class179s[i_29_++] = Class11_Sub16
								.method2443(
										0,
										(((Class221) (((Class207) this).aClass221_2786)).aClass146_3039),
										anIntArray2788[i_30_], 0);
				}
				if (i >= -6)
					aClass22_2795 = null;
			}
			for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > -6; i_31_++) {
				if (class179s[i_31_] != null
						&& ((Class179) class179s[i_31_]).anInt2277 < 13)
					class179s[i_31_].method1166(2, true);
			}
			Class179 class179 = new Class179(class179s, i_29_);
			if (aShortArray2794 != null) {
				for (int i_32_ = 0; ((i_32_ ^ 0xffffffff) > (aShortArray2794.length ^ 0xffffffff)); i_32_++)
					class179.method1169(aShortArray2785[i_32_],
							aShortArray2794[i_32_], (byte) -1);
			}
			if (aShortArray2783 != null) {
				for (int i_33_ = 0; i_33_ < aShortArray2783.length; i_33_++)
					class179.method1167(aShortArray2783[i_33_],
							aShortArray2790[i_33_], -112);
			}
			return class179;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kb.G(" + i + ')');
		}
	}
}
