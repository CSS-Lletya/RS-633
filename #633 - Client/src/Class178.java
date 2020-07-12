/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178 {
	private static int[] anIntArray2251 = new int[4];
	private int anInt2252;
	private int anInt2253;
	private int anInt2254;
	private Class253 aClass253_2255;
	private static Class253 aClass253_2256;
	private static Class253 aClass253_2257;
	private int anInt2258;
	int anInt2259;
	private int anInt2260;
	private int anInt2261;
	private int anInt2262;
	private int anInt2263;
	private static Class206 aClass206_2264;
	private int anInt2265;
	private boolean aBool2266;
	private int anInt2267;
	private int anInt2268;

	final void method1151() {
		aClass253_2255 = null;
	}

	final boolean method1152(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_;
		int i_4_;
		int i_5_;
		if (!aBool2266) {
			i_3_ = anInt2267 - i;
			i_4_ = anInt2265 - i_0_;
			i_5_ = anInt2262 - i_1_;
			((Class178) this).anInt2259 = (int) Math.sqrt((double) (i_3_ * i_3_
					+ i_4_ * i_4_ + i_5_ * i_5_));
			if (((Class178) this).anInt2259 == 0)
				((Class178) this).anInt2259 = 1;
			i_3_ = (i_3_ << 8) / ((Class178) this).anInt2259;
			i_4_ = (i_4_ << 8) / ((Class178) this).anInt2259;
			i_5_ = (i_5_ << 8) / ((Class178) this).anInt2259;
		} else {
			((Class178) this).anInt2259 = 1073741823;
			i_3_ = anInt2267;
			i_4_ = anInt2265;
			i_5_ = anInt2262;
		}
		int i_6_ = (int) (Math.sqrt((double) (i_3_ * i_3_ + i_4_ * i_4_ + i_5_
				* i_5_)) * 256.0);
		if (i_6_ > 128) {
			i_3_ = (i_3_ << 16) / i_6_;
			i_4_ = (i_4_ << 16) / i_6_;
			i_5_ = (i_5_ << 16) / i_6_;
			anInt2253 = anInt2261 * i_2_
					/ (aBool2266 ? 1024 : ((Class178) this).anInt2259);
		} else
			anInt2253 = 0;
		if (anInt2253 < 8) {
			aClass253_2255 = null;
			return false;
		}
		int i_7_ = Class11_Sub2_Sub33.method3808(108, anInt2253);
		if (i_7_ > i_2_)
			i_7_ = Class94.method635(-1350259935, i_2_);
		if (i_7_ > 512)
			i_7_ = 512;
		if (i_7_ != anInt2252)
			anInt2252 = i_7_;
		anInt2263 = (int) (Math.asin((double) ((float) i_4_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
		anInt2258 = (int) (Math.atan2((double) i_3_, (double) -i_5_) * 2607.5945876176133) & 0x3fff;
		aClass253_2255 = null;
		return true;
	}

	final void method1153(Class163 class163, int i, int i_8_, int i_9_,
			int i_10_, int i_11_, int i_12_) {
		if (aClass253_2255 != null) {
			int i_13_ = anInt2263 - i_11_ & 0x3fff;
			int i_14_ = anInt2258 - i_12_ & 0x3fff;
			if (i_14_ > 8192)
				i_14_ -= 16384;
			if (i_13_ > 8192)
				i_13_ -= 16384;
			int i_15_ = i_13_ * i_10_ / 4096 + (i_10_ - anInt2253) / 2;
			int i_16_ = i_14_ * i_10_ / -4096 + (i_9_ - anInt2253) / 2;
			if (i_15_ < i_10_ && i_15_ + anInt2253 > 0 && i_16_ < i_9_
					&& i_16_ + anInt2253 > 0)
				aClass253_2255.method1620(i_16_ + i, i_15_ + i_8_, anInt2253,
						anInt2253);
		}
	}

	private static final void method1154(Class163 class163) {
		if (aClass206_2264 == null) {
			Class179 class179 = new Class179(580, 1104, 1);
			class179.method1170((byte) 0, (short) 0, (short) 1024, 126,
					(short) 1024, (short) 0, (byte) 0, (short) 32767,
					(short) 1024, (byte) 0);
			class179.method1164(true, 0, 0, 128);
			class179.method1164(true, 0, 0, -128);
			for (int i = 0; i <= 24; i++) {
				int i_17_ = i * 8192 / 24;
				int i_18_ = Class335.anIntArray4436[i_17_];
				int i_19_ = Class335.anIntArray4430[i_17_];
				for (int i_20_ = 1; i_20_ < 24; i_20_++) {
					int i_21_ = i_20_ * 8192 / 24;
					int i_22_ = Class335.anIntArray4430[i_21_] >> 7;
					int i_23_ = Class335.anIntArray4436[i_21_] * i_18_ >> 21;
					int i_24_ = Class335.anIntArray4436[i_21_] * i_19_ >> 21;
					class179.method1164(true, -i_23_, i_24_, i_22_);
				}
				if (i > 0) {
					int i_25_ = i * 23 + 2;
					int i_26_ = i_25_ - 23;
					class179.method1173(i_25_, (byte) 0, (short) 0,
							(short) 127, (byte) 0, (byte) 0, 0, i_26_, -10373);
					for (int i_27_ = 1; i_27_ < 23; i_27_++) {
						int i_28_ = i_26_ + 1;
						int i_29_ = i_25_ + 1;
						class179.method1173(i_25_, (byte) 0, (short) 0,
								(short) 127, (byte) 0, (byte) 0, i_26_, i_28_,
								-10373);
						class179.method1173(i_25_, (byte) 0, (short) 0,
								(short) 127, (byte) 0, (byte) 0, i_28_, i_29_,
								-10373);
						i_26_ = i_28_;
						i_25_ = i_29_;
					}
					class179.method1173(1, (byte) 0, (short) 0, (short) 127,
							(byte) 0, (byte) 0, i_25_, i_26_, -10373);
				}
			}
			((Class179) class179).anInt2311 = ((Class179) class179).anInt2278;
			((Class179) class179).anIntArray2293 = null;
			((Class179) class179).anIntArray2317 = null;
			((Class179) class179).aByteArray2305 = null;
			aClass206_2264 = class163.method1020(class179, 51200, 33, 64, 768);
		}
	}

	private static final void method1155(Class163 class163) {
		if (aClass253_2256 == null) {
			int[] is = new int[16384];
			int[] is_30_ = new int[16384];
			for (int i = 0; i < 64; i++) {
				int i_31_ = 64 - i;
				i_31_ *= i_31_;
				int i_32_ = 128 - i - 1;
				int i_33_ = i * 128;
				int i_34_ = i_32_ * 128;
				for (int i_35_ = 0; i_35_ < 64; i_35_++) {
					int i_36_ = 64 - i_35_;
					i_36_ *= i_36_;
					int i_37_ = 128 - i_35_ - 1;
					int i_38_ = 256 - (i_36_ + i_31_ << 8) / 4096;
					i_38_ = i_38_ * 16 * 192 / 1536;
					if (i_38_ < 0)
						i_38_ = 0;
					else if (i_38_ > 255)
						i_38_ = 255;
					int i_39_ = i_38_ / 2;
					is_30_[i_33_ + i_35_] = is_30_[i_33_ + i_37_] = is_30_[i_34_
							+ i_35_] = is_30_[i_34_ + i_37_] = ~0xffffff
							| i_38_ << 16;
					is[i_33_ + i_35_] = is[i_33_ + i_37_] = is[i_34_ + i_35_] = is[i_34_
							+ i_37_] = 127 - i_39_ << 24 | 0xffffff;
				}
			}
			aClass253_2256 = class163.method1040(128, 128, is_30_, -1, 128, 0);
			aClass253_2257 = class163.method1040(128, 128, is, -1, 128, 0);
		}
	}

	final boolean method1156(Class163 class163, Class178 class178_40_) {
		if (aClass253_2255 == null && !method1160(class163, class178_40_))
			return false;
		return true;
	}

	static final void method1157() {
		aClass206_2264 = null;
		aClass253_2256 = null;
	}

	public static void method1158() {
		aClass206_2264 = null;
		aClass253_2257 = null;
		aClass253_2256 = null;
		anIntArray2251 = null;
	}

	private final void method1159(Class163 class163, Class178 class178_41_) {
		Class179 class179 = Class11_Sub16.method2443(0,
				Class314.aClass146_4165, anInt2260, 0);
		if (class179 != null) {
			class163.K(anIntArray2251);
			class163.KA(0, 0, anInt2252, anInt2252);
			class163.aa(0, 0, anInt2252, anInt2252, 0, 0);
			int i = 0;
			int i_42_ = 0;
			int i_43_ = 256;
			if (class178_41_ != null) {
				if (class178_41_.aBool2266) {
					i = -class178_41_.anInt2267;
					i_42_ = -class178_41_.anInt2265;
					i_43_ = -class178_41_.anInt2262;
				} else {
					i = anInt2267 - class178_41_.anInt2267;
					i_42_ = anInt2265 - class178_41_.anInt2265;
					i_43_ = anInt2262 - class178_41_.anInt2262;
				}
			}
			if (anInt2263 != 0) {
				int i_44_ = -anInt2263 & 0x3fff;
				int i_45_ = Class335.anIntArray4436[i_44_];
				int i_46_ = Class335.anIntArray4430[i_44_];
				int i_47_ = i_42_ * i_46_ - i_43_ * i_45_ >> 14;
				i_43_ = i_42_ * i_45_ + i_43_ * i_46_ >> 14;
				i_42_ = i_47_;
			}
			if (anInt2258 != 0) {
				int i_48_ = -anInt2258 & 0x3fff;
				int i_49_ = Class335.anIntArray4436[i_48_];
				int i_50_ = Class335.anIntArray4430[i_48_];
				int i_51_ = i_43_ * i_49_ + i * i_50_ >> 14;
				i_43_ = i_43_ * i_50_ - i * i_49_ >> 14;
				i = i_51_;
			}
			class163.xa(1.0F);
			class163.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_42_,
					(float) i_43_);
			Class206 class206 = class163.method1020(class179, 2048, 0, 64, 768);
			int i_52_ = class206.RA() - class206.V();
			int i_53_ = class206.EA() - class206.fa();
			int i_54_ = class206.V() + i_52_ / 2;
			int i_55_ = class206.fa() + i_53_ / 2;
			int i_56_ = i_52_ > i_53_ ? i_52_ : i_53_;
			class163.DA(i_54_, i_55_, i_56_, i_56_);
			class163.method1080(class163.method1041());
			Class33 class33 = class163.method1048();
			class33.method301(0, 0, class163.i() - class206.HA());
			class206.method1329(class33, null, class163.i(), 1);
			aClass253_2255 = class163.method1014(0, 0, anInt2252, anInt2252,
					true);
			aClass253_2255.method1613(0, 0, 3);
			class163.KA(anIntArray2251[0], anIntArray2251[1],
					anIntArray2251[2], anIntArray2251[3]);
		}
	}

	private final boolean method1160(Class163 class163, Class178 class178_57_) {
		if (aClass253_2255 == null) {
			if (anInt2268 == 0) {
				if (Class129.anInterface1_1753.method2(anInt2260, -121)) {
					int[] is = Class129.anInterface1_1753.method3(anInt2252,
							-102, false, 0.7F, anInt2252, anInt2260);
					aClass253_2255 = class163.method1040(anInt2252, anInt2252,
							is, -1, anInt2252, 0);
				}
			} else if (anInt2268 == 2)
				method1159(class163, class178_57_);
			else if (anInt2268 == 1)
				method1161(class163, class178_57_);
		}
		if (aClass253_2255 == null)
			return false;
		return true;
	}

	private final void method1161(Class163 class163, Class178 class178_58_) {
		method1154(class163);
		method1155(class163);
		class163.K(anIntArray2251);
		class163.KA(0, 0, anInt2252, anInt2252);
		class163.ya();
		class163.aa(0, 0, anInt2252, anInt2252, ~0xffffff | anInt2254, 0);
		int i = 0;
		int i_59_ = 0;
		int i_60_ = 256;
		if (class178_58_ != null) {
			if (class178_58_.aBool2266) {
				i = -class178_58_.anInt2267;
				i_59_ = -class178_58_.anInt2265;
				i_60_ = -class178_58_.anInt2262;
			} else {
				i = class178_58_.anInt2267 - anInt2267;
				i_59_ = class178_58_.anInt2265 - anInt2265;
				i_60_ = class178_58_.anInt2262 - anInt2262;
			}
		}
		if (anInt2263 != 0) {
			int i_61_ = Class335.anIntArray4436[anInt2263];
			int i_62_ = Class335.anIntArray4430[anInt2263];
			int i_63_ = i_59_ * i_62_ - i_60_ * i_61_ >> 14;
			i_60_ = i_59_ * i_61_ + i_60_ * i_62_ >> 14;
			i_59_ = i_63_;
		}
		if (anInt2258 != 0) {
			int i_64_ = Class335.anIntArray4436[anInt2258];
			int i_65_ = Class335.anIntArray4430[anInt2258];
			int i_66_ = i_60_ * i_64_ + i * i_65_ >> 14;
			i_60_ = i_60_ * i_65_ - i * i_64_ >> 14;
			i = i_66_;
		}
		Class206 class206 = aClass206_2264.method1313((byte) 0, 51200, true);
		class206.aa((short) 0, (short) anInt2260);
		class163.xa(1.0F);
		class163.ZA(16777215, 1.0F, 1.0F, (float) i, (float) i_59_,
				(float) i_60_);
		int i_67_ = 1024 * anInt2252 / (class206.RA() - class206.V());
		if (anInt2254 != 0)
			i_67_ = i_67_ * 13 / 16;
		class163.DA(anInt2252 / 2, anInt2252 / 2, i_67_, i_67_);
		class163.method1080(class163.method1041());
		Class33 class33 = class163.method1041();
		class33.method301(0, 0, class163.i() - class206.HA());
		class206.method1329(class33, null, 1024, 1);
		int i_68_ = anInt2252 * 13 / 16;
		int i_69_ = (anInt2252 - i_68_) / 2;
		aClass253_2257.method1606(i_69_, i_69_, i_68_, i_68_, 0, ~0xffffff
				| anInt2254, 1);
		aClass253_2255 = class163.method1014(0, 0, anInt2252, anInt2252, true);
		class163.ya();
		class163.aa(0, 0, anInt2252, anInt2252, 0, 0);
		aClass253_2256.method1606(0, 0, anInt2252, anInt2252, 1, 0, 0);
		aClass253_2255.method1613(0, 0, 0);
		class163.KA(anIntArray2251[0], anIntArray2251[1], anIntArray2251[2],
				anIntArray2251[3]);
	}

	Class178(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_,
			int i_75_, boolean bool) {
		anInt2267 = i_71_;
		anInt2265 = i_72_;
		anInt2262 = i_73_;
		aBool2266 = bool;
		anInt2260 = i_70_;
		anInt2254 = i_75_;
		anInt2261 = i_74_;
		anInt2268 = i;
	}
}
