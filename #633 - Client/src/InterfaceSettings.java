/* Class11_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InterfaceSettings extends Class11 {
	static int anInt5346;
	static int anInt5347;
	static int anInt5348;
	int anInt5349;
	static int anInt5350;
	static int anInt5351 = 0;
	static int anInt5352;
	static int anInt5353;
	int anInt5354;
	static int anInt5355;
	static int anInt5356;

	final boolean method2348(int i, int i_0_) {
		try {
			anInt5355++;
			if (i >= -24)
				return false;
			if ((((InterfaceSettings) this).anInt5349 >> i_0_ + 1 & 0x1 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2349(int i, boolean bool, int i_1_, int i_2_,
			int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			if ((i_8_ ^ 0xffffffff) == (i_7_ ^ 0xffffffff)
					&& (i_6_ ^ 0xffffffff) == (i_5_ ^ 0xffffffff)
					&& i_1_ == i_2_ && i_4_ == i_3_)
				Class75_Sub1.method2407(i_8_, i_1_, true, i, i_3_, i_5_);
			else {
				int i_9_ = i_8_;
				int i_10_ = i_5_;
				int i_11_ = i_8_ * 3;
				int i_12_ = i_5_ * 3;
				int i_13_ = 3 * i_7_;
				int i_14_ = i_6_ * 3;
				int i_15_ = 3 * i_2_;
				int i_16_ = i_4_ * 3;
				int i_17_ = i_13_ + (i_1_ - (i_15_ + i_8_));
				int i_18_ = -i_16_ + i_3_ - (-i_14_ + i_5_);
				int i_19_ = i_11_ + (-i_13_ + -i_13_) + i_15_;
				int i_20_ = i_16_ - (i_14_ - (-i_14_ - -i_12_));
				int i_21_ = i_13_ - i_11_;
				int i_22_ = -i_12_ + i_14_;
				for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
					int i_24_ = i_23_ * i_23_ >> 12;
					int i_25_ = i_23_ * i_24_ >> 12;
					int i_26_ = i_25_ * i_17_;
					int i_27_ = i_18_ * i_25_;
					int i_28_ = i_19_ * i_24_;
					int i_29_ = i_20_ * i_24_;
					int i_30_ = i_21_ * i_23_;
					int i_31_ = i_22_ * i_23_;
					int i_32_ = (i_26_ + (i_28_ + i_30_) >> 12) + i_8_;
					int i_33_ = (i_29_ + i_27_ - -i_31_ >> 12) + i_5_;
					Class75_Sub1.method2407(i_9_, i_32_, true, i, i_33_, i_10_);
					i_10_ = i_33_;
					i_9_ = i_32_;
				}
			}
			if (bool != false)
				anInt5353 = 12;
			anInt5348++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lia.H(" + i + ','
					+ bool + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final int method2350(int i) {
		try {
			anInt5347++;
			if (i != -1)
				anInt5351 = 86;
			return 0x7 & ((InterfaceSettings) this).anInt5349 >> 18;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.B(" + i + ')');
		}
	}

	final boolean method2351(int i) {
		try {
			if (i < 24)
				method2355(-120);
			anInt5350++;
			if (((((InterfaceSettings) this).anInt5349 & 0x5d38f5) >> 22 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.G(" + i + ')');
		}
	}

	static final void method2352(int i, int i_34_, int i_35_, Class var_class) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_34_][i_35_];
		if (class364 != null) {
			for (Class140 class140 = ((Class364) class364).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
				Class376_Sub7_Sub5 class376_sub7_sub5 = ((Class140) class140).aClass376_Sub7_Sub5_1896;
				if (var_class.isAssignableFrom(class376_sub7_sub5.getClass())
						&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 == i_34_)
						&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629 == i_35_)) {
					Class11_Sub45_Sub19.method3823(class376_sub7_sub5, false);
					break;
				}
			}
		}
	}

	final int method2353(boolean bool) {
		try {
			if (bool != false)
				return -104;
			anInt5352++;
			return Class11_Sub2_Sub27.method3710(-10391,
					((InterfaceSettings) this).anInt5349);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.E(" + bool + ')');
		}
	}

	final boolean method2354(int i) {
		try {
			if (i != 9162)
				((InterfaceSettings) this).anInt5349 = -95;
			anInt5346++;
			if ((0x1 & ((InterfaceSettings) this).anInt5349 >> 21) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.D(" + i + ')');
		}
	}

	final boolean method2355(int i) {
		try {
			anInt5356++;
			if (i > -111)
				anInt5353 = 126;
			if ((((InterfaceSettings) this).anInt5349 & 0x1) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.C(" + i + ')');
		}
	}

	InterfaceSettings(int i, int i_36_) {
		try {
			((InterfaceSettings) this).anInt5354 = i_36_;
			((InterfaceSettings) this).anInt5349 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lia.<init>(" + i + ','
					+ i_36_ + ')');
		}
	}
}
