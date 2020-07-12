/* Class256_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256_Sub2 extends Class256 {
	static int anInt7703;
	static int anInt7704;
	static int anInt7705;
	private int anInt7706;
	static int anInt7707;
	static int anInt7708;
	private int anInt7709;
	static int anInt7710;
	private int anInt7711;
	static int anInt7712;
	static int anInt7713;
	static int anInt7714;
	private int anInt7715;
	private int anInt7716;
	static boolean aBool7717 = false;
	private int anInt7718;
	static int anInt7719;
	static int anInt7720;
	private int anInt7721;
	private int anInt7722;

	final void method1636(int i, int i_0_, int i_1_) {
		try {
			int i_2_ = -23 / ((i_0_ + 7) / 42);
			anInt7708++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tb.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1637(boolean bool, int i, int i_3_) {
		do {
			try {
				anInt7704++;
				if (bool == false)
					break;
				method1637(true, 114, -93);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("tb.C(" + bool
						+ ',' + i + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	Class256_Sub2(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_) {
		super(-1, i_11_, i_12_);
		try {
			anInt7716 = i_7_;
			anInt7709 = i_8_;
			anInt7722 = i_6_;
			anInt7711 = i_10_;
			anInt7721 = i_4_;
			anInt7718 = i;
			anInt7706 = i_9_;
			anInt7715 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tb.<init>(" + i + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
							+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ','
							+ i_10_ + ',' + i_11_ + ',' + i_12_ + ')'));
		}
	}

	static final boolean method3112(int i, int i_13_, int i_14_) {
		try {
			anInt7714++;
			if (i_13_ != -129767092)
				aBool7717 = true;
			if ((0x34 & i_14_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tb.B(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	static final String method3113(int i, String string) {
		try {
			int i_15_ = -59 % ((i + 16) / 40);
			anInt7720++;
			String string_16_ = null;
			int i_17_ = string.indexOf("--> ");
			if ((i_17_ ^ 0xffffffff) <= -1) {
				string_16_ = string.substring(0, 4 + i_17_);
				string = string.substring(i_17_ + 4);
			}
			if (string.startsWith("directlogin ")) {
				int i_18_ = string.indexOf(" ", "directlogin ".length());
				if ((i_18_ ^ 0xffffffff) <= -1) {
					int i_19_ = string.length();
					string = string.substring(0, i_18_) + " ";
					for (int i_20_ = i_18_ + 1; i_20_ < i_19_; i_20_++)
						string += "*";
				}
			}
			if (string_16_ != null)
				return string_16_ + string;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tb.H(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final String method3114(boolean bool) {
		try {
			anInt7705++;
			String string = "www";
			if (Class210.aClass347_2856 != Class11_Sub2_Sub24.aClass347_9284) {
				if (Class11_Sub2_Sub24.aClass347_9284 != Class11_Sub45_Sub3.aClass347_8530) {
					if (Class11_Sub2_Sub24.aClass347_9284 == Class376_Sub7_Sub2_Sub2.aClass347_10223)
						string = "www-wtwip";
				} else
					string = "www-wtqa";
			} else
				string = "www-wtrc";
			String string_21_ = "";
			if (Class11_Sub2_Sub5.aString8552 != null)
				string_21_ = "/p=" + Class11_Sub2_Sub5.aString8552;
			if (bool != true)
				return null;
			return ("http://" + string + "."
					+ ((Class66) Class198.aClass66_2679).aString944 + ".com/l="
					+ Class11_Sub45_Sub1_Sub2.anInt9884 + "/a="
					+ Class53.anInt817 + string_21_ + "/");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tb.D(" + bool + ')');
		}
	}

	final void method1639(int i, int i_22_, int i_23_) {
		try {
			anInt7719++;
			int i_24_ = i_23_ * anInt7718 >> 12;
			int i_25_ = anInt7721 * i >> 12;
			int i_26_ = anInt7715 * i_23_ >> 12;
			int i_27_ = anInt7722 * i >> 12;
			int i_28_ = anInt7716 * i_23_ >> 12;
			int i_29_ = anInt7709 * i >> 12;
			int i_30_ = i_23_ * anInt7706 >> 12;
			int i_31_ = i * anInt7711 >> 12;
			if (i_22_ != -12939)
				method3114(false);
			Class211.method1352(i_31_, i_28_, i_26_,
					((Class256) this).anInt3506, -3, i_29_, i_27_, i_25_,
					i_24_, i_30_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tb.A(" + i + ','
					+ i_22_ + ',' + i_23_ + ')'));
		}
	}

	static final void method3115(long l, int i) {
		try {
			if (i == 52) {
				anInt7707++;
				try {
					Thread.sleep(l);
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tb.F(" + l + ',' + i
					+ ')');
		}
	}

	static {
		anInt7710 = 328;
		anInt7703 = 0;
		anInt7713 = 0;
	}
}
