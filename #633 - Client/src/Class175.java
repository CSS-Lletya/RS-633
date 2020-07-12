/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class175 implements Runnable {
	static int anInt2227;
	static float aFloat2228 = 0.0F;
	volatile boolean aBool2229;
	static int anInt2230;
	static int[] anIntArray2231;
	volatile Class37[] aClass37Array2232 = new Class37[2];
	static int anInt2233;
	volatile boolean aBool2234 = false;
	Class341 aClass341_2235;

	static final void method1143(byte i) {
		try {
			anInt2230++;
			if (i < 61)
				method1144((byte) 49, null, -10);
			Class11_Sub23 class11_sub23 = ((Class11_Sub23) Class108_Sub13.aClass84_6264
					.method584(-12261));
			boolean bool = (Class11_Sub2_Sub32_Sub1.aClass192_9889 != null || (Class254_Sub1.anInt5519 ^ 0xffffffff) < -1);
			int i_0_ = class11_sub23.method2568((byte) 81);
			int i_1_ = class11_sub23.method2569(-127);
			if (bool)
				Class197.anInt2668 = 1;
			if (bool)
				Class342.aClass11_Sub45_Sub5_4538 = Class11_Sub19.aClass11_Sub45_Sub5_5815;
			else
				Class11_Sub30_Sub1.method3526((byte) -100, i_0_,
						(Class11_Sub19.aClass11_Sub45_Sub5_5815), i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hv.A(" + i + ')');
		}
	}

	static final boolean method1144(byte i, String string, int i_2_) {
		try {
			anInt2233++;
			if (((Class341) Class108_Sub21.aClass341_7304).aBool4520) {
				Class275.aClass46_3705 = new Class46();
				((Class46) Class275.aClass46_3705).aString733 = string;
				((Class46) Class275.aClass46_3705).anInt730 = i_2_;
				if (Class362.aClass347_4711 != Class11_Sub2_Sub24.aClass347_9284) {
					((Class46) Class275.aClass46_3705).anInt720 = ((Class46) Class275.aClass46_3705).anInt730 + 40000;
					((Class46) Class275.aClass46_3705).anInt726 = ((Class46) Class275.aClass46_3705).anInt730 + 50000;
				}
				if (Class65.aClass195_Sub1Array940.length > i_2_
						&& Class65.aClass195_Sub1Array940[i_2_] != null)
					Class254_Sub3.anInt8047 = (((Class195) Class65.aClass195_Sub1Array940[i_2_]).anInt2649);
				return true;
			}
			String string_3_ = "";
			if (Class11_Sub2_Sub24.aClass347_9284 != Class362.aClass347_4711)
				string_3_ = ":" + (7000 + i_2_);
			String string_4_ = "";
			if (Class11_Sub2_Sub5.aString8552 != null)
				string_4_ = "/p=" + Class11_Sub2_Sub5.aString8552;
			String string_5_ = ("http://" + string + string_3_ + "/l="
					+ Class11_Sub45_Sub1_Sub2.anInt9884 + "/a="
					+ Class53.anInt817 + string_4_ + "/j"
					+ (!Class11_Sub52.aBool8053 ? "0" : "1") + ",o"
					+ (Class376_Sub5.aBool6919 ? "1" : "0") + ",a2");
			if (i != 49)
				method1144((byte) -11, null, -23);
			try {
				Class11_Sub2_Sub23.aclient9263.getAppletContext().showDocument(
						new URL(string_5_), "_self");
			} catch (Exception exception) {
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hv.B(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_2_ + ')'));
		}
	}

	public static void method1145(byte i) {
		do {
			try {
				anIntArray2231 = null;
				if (i == -99)
					break;
				method1145((byte) 16);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hv.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public final void run() {
		try {
			anInt2227++;
			((Class175) this).aBool2229 = true;
			try {
				while (!((Class175) this).aBool2234) {
					for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
						Class37 class37 = ((Class175) this).aClass37Array2232[i];
						if (class37 != null)
							class37.method314(-8910);
					}
					Class11_Sub51.method3236(10L, 0);
					Class126.method821(null, ((Class175) this).aClass341_2235,
							0);
				}
			} catch (Exception exception) {
				Class11_Sub12_Sub3.method3602((byte) -71, null, exception);
			} finally {
				((Class175) this).aBool2229 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hv.run(" + ')');
		}
	}

	Class175() {
		((Class175) this).aBool2229 = false;
	}
}
