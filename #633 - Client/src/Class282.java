/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class282 {
	static int anInt3821;
	static int anInt3822;
	static boolean[][] aBoolArrayArray3823 = {
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true },
			{ true, true, true, false, false, false, true, true, false, false,
					false, false, true },
			{ true, false, false, false, false, true, true, true, false, false,
					false, false, false },
			{ false, false, true, true, true, true, false, false, false, false,
					false, false, false },
			{ true, true, true, true, true, true, false, false, false, false,
					false, false, false },
			{ true, true, true, false, false, true, true, true, false, false,
					false, false, false },
			{ true, true, false, false, false, true, true, true, false, false,
					false, false, true },
			{ true, true, false, false, false, false, false, true, false,
					false, false, false, false },
			{ false, true, true, true, true, true, true, true, false, false,
					false, false, false },
			{ true, false, false, false, true, true, true, true, true, true,
					false, false, false },
			{ true, true, true, true, true, false, false, false, true, true,
					false, false, false },
			{ true, true, true, false, false, false, false, false, false,
					false, true, true, false },
			new boolean[13],
			{ true, true, true, true, true, true, true, true, true, true, true,
					true, true }, new boolean[13] };
	static Class146 aClass146_3824;
	static int anInt3825;
	static int anInt3826;

	public static void method1740(boolean bool) {
		do {
			try {
				aBoolArrayArray3823 = null;
				aClass146_3824 = null;
				if (bool == true)
					break;
				method1742(-76, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pw.C(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			anInt3821++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pw.toString(" + ')');
		}
	}

	public Class282() {
		/* empty */
	}

	static final Class11_Sub17 method1741(int i) {
		try {
			anInt3826++;
			Class119 class119 = null;
			Class11_Sub17 class11_sub17 = new Class11_Sub17(
					Class198.aClass66_2679, 0);
			if (i >= -109)
				method1740(false);
			try {
				Class368 class368 = Class108_Sub21.aClass341_7304.method2065(
						true, "", -4053);
				while (class368.anInt4837 == 0)
					Class11_Sub51.method3236(1L, 0);
				if ((class368.anInt4837 ^ 0xffffffff) == -2) {
					class119 = (Class119) class368.anObject4838;
					byte[] is = new byte[(int) class119.method776((byte) 69)];
					int i_0_;
					for (int i_1_ = 0; is.length > i_1_; i_1_ += i_0_) {
						i_0_ = class119.method780(i_1_, (byte) 94, -i_1_
								+ is.length, is);
						if (i_0_ == -1)
							throw new IOException("EOF");
					}
					class11_sub17 = new Class11_Sub17(new Stream(is),
							Class198.aClass66_2679, 0);
				}
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (class119 != null)
					class119.method777(-47);
			} catch (Exception exception) {
				/* empty */
			}
			return class11_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pw.B(" + i + ')');
		}
	}

	static final String method1742(int i, String string) {
		try {
			anInt3822++;
			if (string == null)
				return null;
			int i_2_ = 0;
			int i_3_;
			for (i_3_ = string.length(); i_2_ < i_3_; i_2_++) {
				if (!Class30.method255(string.charAt(i_2_), false))
					break;
			}
			for (/**/; ((i_3_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff) && Class30
					.method255(string.charAt(i_3_ - 1), false)); i_3_--) {
				/* empty */
			}
			int i_4_ = i_3_ + -i_2_;
			if ((i_4_ ^ 0xffffffff) > -2 || i_4_ > 12)
				return null;
			StringBuffer stringbuffer = new StringBuffer(i_4_);
			for (int i_5_ = i_2_; (i_3_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
				char c = string.charAt(i_5_);
				if (Class11_Sub51.method3234(c, 0)) {
					char c_6_ = Class121.method787(35, c);
					if (c_6_ != 0)
						stringbuffer.append(c_6_);
				}
			}
			if (stringbuffer.length() == i)
				return null;
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pw.A(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1743(Class163 class163, boolean bool,
			Class146 class146) {
		try {
			anInt3825++;
			Class80[] class80s = Class80.method543(class146, Class57.anInt861,
					0);
			Class11_Sub33.aClass253Array6895 = new Class253[class80s.length];
			for (int i = 0; class80s.length > i; i++)
				Class11_Sub33.aClass253Array6895[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class236_Sub7.anInt6975, 0);
			Class203.aClass253Array2730 = new Class253[class80s.length];
			for (int i = 0; (i ^ 0xffffffff) > (class80s.length ^ 0xffffffff); i++)
				Class203.aClass253Array2730[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class307.anInt4119, 0);
			Class313.aClass253Array4155 = new Class253[class80s.length];
			for (int i = 0; i < class80s.length; i++)
				Class313.aClass253Array4155[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class236_Sub3.anInt6253, 0);
			Stream.aClass253Array5921 = new Class253[class80s.length];
			for (int i = 0; class80s.length > i; i++)
				Stream.aClass253Array5921[i] = class163.method1081(class80s[i],
						true);
			class80s = Class80.method543(class146, Class335_Sub3.anInt7800, 0);
			Class278.aClass253Array3762 = new Class253[class80s.length];
			for (int i = 0; (class80s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				Class278.aClass253Array3762[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class108_Sub10.anInt6140, 0);
			Class268.aClass253Array3635 = new Class253[class80s.length];
			for (int i = 0; i < class80s.length; i++)
				Class268.aClass253Array3635[i] = class163.method1081(
						class80s[i], true);
			if (bool != false)
				aClass146_3824 = null;
			class80s = Class80.method543(class146, Class108_Sub10.anInt6139, 0);
			Class58_Sub2_Sub1.aClass253Array9248 = new Class253[class80s.length];
			for (int i = 0; (i ^ 0xffffffff) > (class80s.length ^ 0xffffffff); i++)
				Class58_Sub2_Sub1.aClass253Array9248[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146,
					Class234_Sub2_Sub1.anInt8450, 0);
			Class347.aClass253Array4600 = new Class253[class80s.length];
			for (int i = 0; i < class80s.length; i++)
				Class347.aClass253Array4600[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class11_Sub2_Sub3.anInt8478,
					0);
			Class376_Sub7_Sub4.aClass253Array9535 = new Class253[class80s.length];
			for (int i = 0; (i ^ 0xffffffff) > (class80s.length ^ 0xffffffff); i++)
				Class376_Sub7_Sub4.aClass253Array9535[i] = class163.method1081(
						class80s[i], true);
			class80s = Class80.method543(class146, Class196.anInt2657, 0);
			Class47.aClass253Array743 = new Class253[class80s.length];
			for (int i = 0; i < class80s.length; i++)
				Class47.aClass253Array743[i] = class163.method1081(class80s[i],
						true);
			class80s = Class80.method543(class146, Class104.anInt1388, 0);
			Class11_Sub45_Sub20_Sub1.aClass253Array9954 = new Class253[class80s.length];
			for (int i = 0; class80s.length > i; i++)
				Class11_Sub45_Sub20_Sub1.aClass253Array9954[i] = class163
						.method1081(class80s[i], true);
			class80s = Class80.method543(class146, Class1.anInt5, 0);
			Class376_Sub7_Sub1_Sub1.aClass253Array10081 = new Class253[class80s.length];
			for (int i = 0; (class80s.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				Class376_Sub7_Sub1_Sub1.aClass253Array10081[i] = class163
						.method1081(class80s[i], true);
			Class114.aClass253_1565 = class163.method1081(
					Class80.method545(class146, Class9.anInt66, 0), true);
			Class108.aClass253_1464 = class163.method1081(
					Class80.method545(class146, Class67.anInt951, 0), true);
			class80s = Class80.method543(class146, Class353.anInt4643, 0);
			Class367.aClass253Array4820 = new Class253[class80s.length];
			for (int i = 0; i < class80s.length; i++)
				Class367.aClass253Array4820[i] = class163.method1081(
						class80s[i], true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pw.D("
					+ (class163 != null ? "{...}" : "null") + ',' + bool + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
