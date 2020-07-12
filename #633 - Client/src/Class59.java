/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class59 {
	static Class298 aClass298_879 = new Class298("", 10);
	static int anInt880;
	static int anInt881;
	static IncomingPacket aClass160_882;
	static int anInt883 = 0;
	static byte[][][] aByteArrayArrayArray884;
	static IncomingPacket aClass160_885;

	static final void method465(byte i) {
		do {
			try {
				Class11_Sub45_Sub15.anInt9364 = 0;
				anInt881++;
				if (i != -73)
					method466(true);
				int i_0_ = (((((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045) >> 9) - -Class194.anInt2641);
				int i_1_ = (Class118.anInt1605 + (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031 >> 9));
				if ((i_0_ ^ 0xffffffff) <= -3054 && i_0_ <= 3156
						&& i_1_ >= 3056 && (i_1_ ^ 0xffffffff) >= -3137)
					Class11_Sub45_Sub15.anInt9364 = 1;
				if ((i_0_ ^ 0xffffffff) <= -3073
						&& (i_0_ ^ 0xffffffff) >= -3119
						&& (i_1_ ^ 0xffffffff) <= -9493
						&& (i_1_ ^ 0xffffffff) >= -9536)
					Class11_Sub45_Sub15.anInt9364 = 1;
				if ((Class11_Sub45_Sub15.anInt9364 ^ 0xffffffff) != -2
						|| i_0_ < 3139 || i_0_ > 3199 || i_1_ < 3008
						|| (i_1_ ^ 0xffffffff) < -3063)
					break;
				Class11_Sub45_Sub15.anInt9364 = 0;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fea.C(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method466(boolean bool) {
		try {
			if (bool != false)
				aClass298_879 = null;
			aClass298_879 = null;
			aClass160_885 = null;
			aByteArrayArrayArray884 = null;
			aClass160_882 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fea.B(" + bool + ')');
		}
	}

	static final Frame method467(Class341 class341, int i, int i_2_, int i_3_,
			int i_4_, int i_5_) {
		try {
			anInt880++;
			if (!class341.method2060(18))
				return null;
			if (i_3_ == 0) {
				Class35[] class35s = Class187.method1219(class341, (byte) 1);
				if (class35s == null)
					return null;
				boolean bool = false;
				for (int i_6_ = 0; class35s.length > i_6_; i_6_++) {
					if (((Class35) class35s[i_6_]).anInt464 == i
							&& ((i_4_ ^ 0xffffffff) == (((Class35) class35s[i_6_]).anInt467 ^ 0xffffffff))
							&& ((i_2_ ^ 0xffffffff) == -1 || ((i_2_ ^ 0xffffffff) == (((Class35) class35s[i_6_]).anInt468 ^ 0xffffffff)))
							&& (!bool || (((Class35) class35s[i_6_]).anInt466 ^ 0xffffffff) < (i_3_ ^ 0xffffffff))) {
						i_3_ = ((Class35) class35s[i_6_]).anInt466;
						bool = true;
					}
				}
				if (!bool)
					return null;
			}
			Class368 class368 = class341.method2068(i_2_, 82, i_4_, i_3_, i);
			while ((class368.anInt4837 ^ 0xffffffff) == -1)
				Class11_Sub51.method3236(10L, 0);
			int i_7_ = 6 / ((45 - i_5_) / 48);
			Frame frame = (Frame) class368.anObject4838;
			if (frame == null)
				return null;
			if (class368.anInt4837 == 2) {
				Class118.method773(class341, (byte) -104, frame);
				return null;
			}
			return frame;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fea.A("
					+ (class341 != null ? "{...}" : "null") + ',' + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static {
		aClass160_882 = new IncomingPacket(14, -1);
		aClass160_885 = new IncomingPacket(52, 6);
	}
}
