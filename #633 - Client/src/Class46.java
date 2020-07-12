/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class46 {
	static int anInt719;
	int anInt720;
	static int anInt721;
	static Class253[] aClass253Array722;
	static int anInt723;
	static int anInt724;
	private boolean aBool725;
	int anInt726;
	private boolean aBool727 = false;
	static int anInt728;
	static int anInt729;
	int anInt730;
	static int anInt731;
	static int anInt732;
	String aString733;

	public static void method401(byte i) {
		do {
			try {
				aClass253Array722 = null;
				if (i == 14)
					break;
				aClass253Array722 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hda.E(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method402(int i) {
		try {
			Class236_Sub5.aClass22_6844.method189((byte) -125);
			if (i == 0)
				anInt724++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hda.H(" + i + ')');
		}
	}

	static final boolean method403(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ != 55)
				return false;
			anInt729++;
			if (!Class62.method477(i_0_, i, -75))
				return false;
			if ((0x9000 & i_0_ ^ 0xffffffff) != -1
					| Class234.method1495(false, i, i_0_)
					| Class95.method642((byte) 9, i, i_0_))
				return true;
			return ((i & 0x37 ^ 0xffffffff) == -1 & ((0x2000 & i_0_) != 0
					| Class11_Sub45_Sub5.method3437((byte) 33, i, i_0_) | Class11_Sub46
						.method3207(i_0_, (byte) -94, i)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hda.D(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method404(int i, byte i_2_) {
		do {
			try {
				if (i_2_ < 45)
					method404(127, (byte) 77);
				anInt728++;
				Class11_Sub26 class11_sub26 = ((Class11_Sub26) Class111.aClass213_1522
						.method1369((byte) 26, (long) i));
				if (class11_sub26 == null)
					break;
				((Class11_Sub26) class11_sub26).aClass28_Sub1_6305.method239(0);
				Class306.method1878(true,
						((Class11_Sub26) class11_sub26).anInt6297,
						((Class11_Sub26) class11_sub26).aBool6306);
				class11_sub26.method122(-32);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hda.C(" + i + ','
						+ i_2_ + ')');
			}
			break;
		} while (false);
	}

	static final void method405(int i, int i_3_, int i_4_) {
		do {
			try {
				anInt732++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 17, i);
				class11_sub45_sub15.method3661(0);
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_4_;
				if (i_3_ == 36864)
					break;
				method403(-37, 113, 78);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hda.B(" + i + ','
						+ i_3_ + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	final Class368 method406(Class341 class341, byte i) {
		try {
			if (i > -60)
				method402(106);
			anInt723++;
			return class341.method2059(((Class46) this).aString733,
					(aBool725 ? ((Class46) this).anInt726
							: ((Class46) this).anInt720), aBool727, 22);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hda.I("
					+ (class341 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method407(int i, Class46 class46_5_) {
		try {
			anInt719++;
			int i_6_ = -13 / ((i + 32) / 59);
			if (class46_5_ == null)
				return false;
			if (((Class46) class46_5_).anInt730 != ((Class46) this).anInt730
					|| !((Class46) this).aString733
							.equals(((Class46) class46_5_).aString733))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hda.G(" + i + ','
					+ (class46_5_ != null ? "{...}" : "null") + ')');
		}
	}

	static final Class326 method408(byte i, int i_7_) {
		try {
			if (i > -59)
				return null;
			anInt721++;
			if ((i_7_ ^ 0xffffffff) > -1 || i_7_ >= 100)
				return null;
			return Class1.aClass326Array3[i_7_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hda.A(" + i + ','
					+ i_7_ + ')');
		}
	}

	public Class46() {
		((Class46) this).anInt726 = 443;
		((Class46) this).anInt720 = 43594;
		aBool725 = true;
	}

	final void method409(int i) {
		try {
			anInt731++;
			int i_8_ = 50 / ((13 - i) / 36);
			if (!aBool725) {
				aBool725 = true;
				aBool727 = true;
			} else if (aBool727)
				aBool727 = false;
			else
				aBool725 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hda.F(" + i + ')');
		}
	}
}
