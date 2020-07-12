/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class210 {
	int anInt2847;
	static long aLong2848;
	int anInt2849;
	static int anInt2850;
	static int anInt2851;
	int anInt2852;
	static int anInt2853;
	static int anInt2854;
	int anInt2855;
	static Class347 aClass347_2856 = new Class347("WTRC", 1);

	final Class210 method1345(int i, byte i_0_) {
		try {
			if (i_0_ != 84)
				return null;
			anInt2851++;
			return new Class210(((Class210) this).anInt2849, i,
					((Class210) this).anInt2852, ((Class210) this).anInt2855);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kg.E(" + i + ','
					+ i_0_ + ')');
		}
	}

	public static void method1346(int i) {
		try {
			if (i >= 72)
				aClass347_2856 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kg.C(" + i + ')');
		}
	}

	static final void method1347(long l, byte i) {
		try {
			anInt2853++;
			int i_1_ = (Class376_Sub8.anInt7749 + (((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7045));
			int i_2_ = (Class91_Sub3_Sub1.anInt9335 + (((Class376_Sub7) Class11_Sub2_Sub8.myPlayer).anInt7031));
			if (Class94_Sub4.anInt7728 - i_1_ < -2000
					|| Class94_Sub4.anInt7728 - i_1_ > 2000
					|| (Class279.anInt3771 - i_2_ ^ 0xffffffff) > 1999
					|| Class279.anInt3771 + -i_2_ > 2000) {
				Class279.anInt3771 = i_2_;
				Class94_Sub4.anInt7728 = i_1_;
			}
			if ((i_1_ ^ 0xffffffff) != (Class94_Sub4.anInt7728 ^ 0xffffffff)) {
				int i_3_ = -Class94_Sub4.anInt7728 + i_1_;
				int i_4_ = (int) ((long) i_3_ * l / 320L);
				if (i_3_ <= 0) {
					if (i_4_ != 0) {
						if ((i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff))
							i_4_ = i_3_;
					} else
						i_4_ = -1;
				} else if ((i_4_ ^ 0xffffffff) != -1) {
					if (i_4_ > i_3_)
						i_4_ = i_3_;
				} else
					i_4_ = 1;
				Class94_Sub4.anInt7728 += i_4_;
			}
			if ((i_2_ ^ 0xffffffff) != (Class279.anInt3771 ^ 0xffffffff)) {
				int i_5_ = -Class279.anInt3771 + i_2_;
				int i_6_ = (int) (l * (long) i_5_ / 320L);
				if ((i_5_ ^ 0xffffffff) < -1) {
					if ((i_6_ ^ 0xffffffff) != -1) {
						if ((i_5_ ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
							i_6_ = i_5_;
					} else
						i_6_ = 1;
				} else if (i_6_ != 0) {
					if ((i_5_ ^ 0xffffffff) < (i_6_ ^ 0xffffffff))
						i_6_ = i_5_;
				} else
					i_6_ = -1;
				Class279.anInt3771 += i_6_;
			}
			Class2_Sub8.aFloat6868 += (float) l * Class171.aFloat2192 / 6.0F;
			Class219_Sub1.aFloat7244 += Class175.aFloat2228 * (float) l / 6.0F;
			int i_7_ = -54 % ((i + 40) / 58);
			Class253_Sub2.method2708(102);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kg.A(" + l + ',' + i
					+ ')');
		}
	}

	static final Class getClassByName(String string, int i)
			throws ClassNotFoundException {
		System.out.println(string);
		try {
			anInt2850++;
			if (string.equals("B"))
				return Byte.TYPE;
			if (i < 70)
				aLong2848 = -1L;
			if (string.equals("I"))
				return Integer.TYPE;
			if (string.equals("S"))
				return Short.TYPE;
			if (string.equals("J"))
				return Long.TYPE;
			if (string.equals("Z"))
				return Boolean.TYPE;
			if (string.equals("F"))
				return Float.TYPE;
			if (string.equals("D"))
				return Double.TYPE;
			if (string.equals("C"))
				return Character.TYPE;
			return Class.forName(string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kg.D("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class210(int i, int i_8_, int i_9_, int i_10_) {
		try {
			((Class210) this).anInt2855 = i_10_;
			((Class210) this).anInt2847 = i_8_;
			((Class210) this).anInt2852 = i_9_;
			((Class210) this).anInt2849 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kg.<init>(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final byte[] method1349(byte i, int i_11_) {
		try {
			if (i != 69)
				aLong2848 = -29L;
			anInt2854++;
			Class11_Sub45_Sub7 class11_sub45_sub7 = ((Class11_Sub45_Sub7) Class274.aClass124_3691
					.method813(-126, (long) i_11_));
			if (class11_sub45_sub7 == null) {
				byte[] is = new byte[512];
				Random random = new Random((long) i_11_);
				for (int i_12_ = 0; i_12_ < 255; i_12_++)
					is[i_12_] = (byte) i_12_;
				for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -256; i_13_++) {
					int i_14_ = 255 - i_13_;
					int i_15_ = Class302.method1863(i_14_, random, (byte) -119);
					byte i_16_ = is[i_15_];
					is[i_15_] = is[i_14_];
					is[i_14_] = is[511 + -i_13_] = i_16_;
				}
				class11_sub45_sub7 = new Class11_Sub45_Sub7(is);
				Class274.aClass124_3691.method812(class11_sub45_sub7,
						(byte) 36, (long) i_11_);
			}
			return ((Class11_Sub45_Sub7) class11_sub45_sub7).aByteArray8806;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kg.B(" + i + ','
					+ i_11_ + ')');
		}
	}
}
