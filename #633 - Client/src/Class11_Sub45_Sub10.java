/* Class11_Sub45_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

final class Class11_Sub45_Sub10 extends Class11_Sub45 {
	static IncomingPacket aClass160_8954 = new IncomingPacket(39, 6);
	Class376_Sub7_Sub5_Sub3 aClass376_Sub7_Sub5_Sub3_8955;
	static int anInt8956;
	static int anInt8957;
	static int anInt8958;
	static int anInt8959;
	static Image anImage8960;

	static final Class143 method3524(Class163 class163, int i, boolean bool,
			byte i_0_) {
		try {
			anInt8956++;
			if (i_0_ != -22)
				return null;
			if (i == -1)
				return null;
			if (Class244.anIntArray3314 != null) {
				for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (Class244.anIntArray3314.length ^ 0xffffffff)); i_1_++) {
					if (i == Class244.anIntArray3314[i_1_])
						return InputStream_Sub2.aClass143Array6948[i_1_];
				}
			}
			Class143 class143 = (Class143) Class11_Sub45_Sub16_Sub2.aClass22_10164
					.method188((long) i, (byte) 105);
			if (class143 != null) {
				if (bool && ((Class143) class143).aClass292_1931 == null) {
					Class292 class292 = Class194.method1270(
							Class286_Sub1.aClass146_7138, 2, i);
					if (class292 == null)
						return null;
					((Class143) class143).aClass292_1931 = class292;
				}
				return class143;
			}
			Class80[] class80s = Class80.method544(Class41.aClass146_595, i);
			if (class80s == null)
				return null;
			Class292 class292 = Class194.method1270(
					Class286_Sub1.aClass146_7138, 2, i);
			if (class292 == null)
				return null;
			if (bool)
				class143 = new Class143(class163.method1060(class292, class80s,
						true), class292);
			else
				class143 = new Class143(class163.method1060(class292, class80s,
						true));
			Class11_Sub45_Sub16_Sub2.aClass22_10164.method184((byte) 127,
					class143, (long) i);
			return class143;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eo.A("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	Class11_Sub45_Sub10(Class376_Sub7_Sub5_Sub3 class376_sub7_sub5_sub3) {
		try {
			((Class11_Sub45_Sub10) this).aClass376_Sub7_Sub5_Sub3_8955 = class376_sub7_sub5_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("eo.<init>("
							+ (class376_sub7_sub5_sub3 != null ? "{...}"
									: "null") + ')'));
		}
	}

	public static void method3525(boolean bool) {
		do {
			try {
				anImage8960 = null;
				aClass160_8954 = null;
				if (bool == true)
					break;
				method3524(null, 87, true, (byte) 117);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eo.B(" + bool
						+ ')');
			}
			break;
		} while (false);
	}
}
