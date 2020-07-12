/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class97 implements Interface20 {
	static int anInt1291;
	static int anInt1292;
	static int anInt1293;
	int[] anIntArray1294;
	static int anInt1295;
	static int anInt1296;
	static int anInt1297;
	static int anInt1298;
	private Class213 aClass213_1299 = new Class213(128);
	static int anInt1300;
	static int anInt1301;
	static int anInt1302;
	static int anInt1303;
	private int[] anIntArray1304;

	public final int method51(int i, int i_0_) {
		try {
			anInt1295++;
			Class102 class102 = Class11_Sub50_Sub2.aClass369_9082.method2177(i,
					(byte) -121);
			int i_1_ = ((Class102) class102).anInt1366;
			if (i_0_ != 26951)
				return -112;
			int i_2_ = ((Class102) class102).anInt1360;
			int i_3_ = ((Class102) class102).anInt1367;
			int i_4_ = Class206_Sub2.anIntArray6317[i_3_ - i_2_];
			return ((Class97) this).anIntArray1294[i_1_] >> i_2_ & i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method651(int i, int i_5_, boolean bool) {
		do {
			try {
				if (bool == false) {
					anInt1292++;
					anIntArray1304[i_5_] = i;
					Class11_Sub52 class11_sub52 = ((Class11_Sub52) aClass213_1299
							.method1369((byte) 26, (long) i_5_));
					if (class11_sub52 == null) {
						class11_sub52 = new Class11_Sub52(4611686018427387905L);
						aClass213_1299.method1368((long) i_5_, class11_sub52,
								(byte) -26);
					} else {
						if ((((Class11_Sub52) class11_sub52).aLong8052 ^ 0xffffffffffffffffL) == -4611686018427387906L)
							break;
						((Class11_Sub52) class11_sub52).aLong8052 = (500L + Class137
								.method878((byte) -62) | 0x4000000000000000L);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ca.G(" + i + ','
						+ i_5_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	public final int method50(int i, int i_6_) {
		try {
			anInt1302++;
			if (i != -1)
				return 21;
			return ((Class97) this).anIntArray1294[i_6_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.B(" + i + ','
					+ i_6_ + ')');
		}
	}

	static final void method652(int i, int i_7_, int i_8_) {
		try {
			anInt1300++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 12, i);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_7_;
			if (i_8_ < 116)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ca.D(" + i + ','
					+ i_7_ + ',' + i_8_ + ')'));
		}
	}

	final void method653(int i, int i_9_, byte i_10_) {
		try {
			anInt1296++;
			Class102 class102 = Class11_Sub50_Sub2.aClass369_9082.method2177(i,
					(byte) -110);
			int i_11_ = ((Class102) class102).anInt1366;
			int i_12_ = ((Class102) class102).anInt1360;
			if (i_10_ <= -37) {
				int i_13_ = ((Class102) class102).anInt1367;
				int i_14_ = Class206_Sub2.anIntArray6317[-i_12_ + i_13_];
				if ((i_9_ ^ 0xffffffff) > -1
						|| (i_9_ ^ 0xffffffff) < (i_14_ ^ 0xffffffff))
					i_9_ = 0;
				i_14_ <<= i_12_;
				method657(
						i_11_,
						(((Class97) this).anIntArray1294[i_11_] & (i_14_ ^ 0xffffffff))
								| i_9_ << i_12_ & i_14_, (byte) -117);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ca.H(" + i + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	final void method654(byte i) {
		try {
			if (i <= 26)
				method651(-40, 12, false);
			for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (((Class171) Class91_Sub1.aClass171_6937).anInt2190 ^ 0xffffffff)); i_15_++) {
				Class71 class71 = Class91_Sub1.aClass171_6937.method1119(i_15_,
						(byte) 124);
				if (class71 != null && ((Class71) class71).anInt996 == 0) {
					anIntArray1304[i_15_] = 0;
					((Class97) this).anIntArray1294[i_15_] = 0;
				}
			}
			anInt1298++;
			aClass213_1299 = new Class213(128);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.C(" + i + ')');
		}
	}

	final void method655(byte i, int i_16_, int i_17_) {
		try {
			anInt1303++;
			Class102 class102 = Class11_Sub50_Sub2.aClass369_9082.method2177(
					i_17_, (byte) -7);
			int i_18_ = ((Class102) class102).anInt1366;
			int i_19_ = ((Class102) class102).anInt1360;
			int i_20_ = ((Class102) class102).anInt1367;
			int i_21_ = Class206_Sub2.anIntArray6317[-i_19_ + i_20_];
			if (i_16_ < 0 || (i_21_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff))
				i_16_ = 0;
			i_21_ <<= i_19_;
			method651((i_16_ << i_19_ & i_21_ | (i_21_ ^ 0xffffffff)
					& anIntArray1304[i_18_]), i_18_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ca.E(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	final int method656(boolean bool, int i) {
		try {
			anInt1291++;
			int i_23_ = -90 % ((i - 8) / 62);
			long l = Class137.method878((byte) -92);
			for (Class11_Sub52 class11_sub52 = (bool ? (Class11_Sub52) aClass213_1299
					.method1365(24490) : ((Class11_Sub52) aClass213_1299
					.method1367((byte) 71))); class11_sub52 != null; class11_sub52 = (Class11_Sub52) aClass213_1299
					.method1367((byte) 71)) {
				if (l > (0x3fffffffffffffffL & ((Class11_Sub52) class11_sub52).aLong8052)) {
					if (((0x4000000000000000L & ((Class11_Sub52) class11_sub52).aLong8052) ^ 0xffffffffffffffffL) != -1L) {
						int i_24_ = (int) ((Class11) class11_sub52).aLong91;
						((Class97) this).anIntArray1294[i_24_] = anIntArray1304[i_24_];
						class11_sub52.method122(-118);
						return i_24_;
					}
					class11_sub52.method122(-92);
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.K(" + bool + ','
					+ i + ')');
		}
	}

	final void method657(int i, int i_25_, byte i_26_) {
		try {
			((Class97) this).anIntArray1294[i] = i_25_;
			anInt1293++;
			Class11_Sub52 class11_sub52 = ((Class11_Sub52) aClass213_1299
					.method1369((byte) 26, (long) i));
			if (i_26_ > -78)
				method657(-106, 52, (byte) 12);
			if (class11_sub52 == null) {
				class11_sub52 = new Class11_Sub52(
						Class137.method878((byte) -110) - -500L);
				aClass213_1299.method1368((long) i, class11_sub52, (byte) -26);
			} else
				((Class11_Sub52) class11_sub52).aLong8052 = 500L + Class137
						.method878((byte) -104);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ca.J(" + i + ','
					+ i_25_ + ',' + i_26_ + ')'));
		}
	}

	static final void method658(int i) {
		do {
			try {
				if (i == -26159) {
					anInt1297++;
					if (Class321_Sub2.aClass163_6648 == null)
						break;
					if (Class11_Sub2_Sub19.aBool9087)
						Class11_Sub12_Sub4.method3720(true);
					Class206.aClass103_2779.method682(92);
					Class98.method665();
					Class11_Sub45_Sub16_Sub2.method3928(i + 42757);
					Class14.method146((byte) -126);
					Class144.method903(0);
					Canvas_Sub1.method3606(i + 26175);
					if (Class108_Sub18.aClass141_6924 != null)
						Class108_Sub18.aClass141_6924.method894(0);
					Class234_Sub2_Sub1.method3330((byte) 124);
					Class11_Sub2_Sub2.method3337((byte) -73);
					Class199.method1286(1339);
					Class143.method901(0);
					Class236_Sub1.method2605((byte) 113, false);
					for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > -2049; i_27_++) {
						Player class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_27_]);
						if (class376_sub7_sub5_sub5_sub1 != null) {
							for (int i_28_ = 0; i_28_ < (((Actor) class376_sub7_sub5_sub5_sub1).aClass206Array10371).length; i_28_++)
								((Actor) class376_sub7_sub5_sub5_sub1).aClass206Array10371[i_28_] = null;
						}
					}
					for (int i_29_ = 0; ((Class108_Sub17.anInt6619 ^ 0xffffffff) < (i_29_ ^ 0xffffffff)); i_29_++) {
						Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_29_]).aNpc_2373);
						if (class376_sub7_sub5_sub5_sub2 != null) {
							for (int i_30_ = 0; ((i_30_ ^ 0xffffffff) > ((((Actor) class376_sub7_sub5_sub5_sub2).aClass206Array10371).length ^ 0xffffffff)); i_30_++)
								((Actor) class376_sub7_sub5_sub5_sub2).aClass206Array10371[i_30_] = null;
						}
					}
					Class236.aClass33_3224 = null;
					Class219.aClass33_3017 = null;
					Class321_Sub2.aClass163_6648.method1072(i ^ ~0x662f);
					Class321_Sub2.aClass163_6648 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ca.F(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method659(int i, int i_31_) {
		try {
			anInt1301++;
			if (i == 128) {
				if (Class91_Sub3_Sub1.anIntArray9340 == null
						|| ((i_31_ ^ 0xffffffff) < (Class91_Sub3_Sub1.anIntArray9340.length ^ 0xffffffff)))
					Class91_Sub3_Sub1.anIntArray9340 = new int[i_31_];
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.I(" + i + ','
					+ i_31_ + ')');
		}
	}

	public Class97() {
		try {
			((Class97) this).anIntArray1294 = new int[((Class171) Class91_Sub1.aClass171_6937).anInt2190];
			anIntArray1304 = new int[((Class171) Class91_Sub1.aClass171_6937).anInt2190];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ca.<init>(" + ')');
		}
	}
}
