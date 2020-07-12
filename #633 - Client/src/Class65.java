/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static int anInt929;
	private long aLong930;
	static int anInt931;
	private Class11_Sub45 aClass11_Sub45_932;
	static int anInt933;
	private int anInt934;
	private Class11_Sub45[] aClass11_Sub45Array935;
	static int anInt936;
	static int anInt937;
	static Class153 aClass153_938 = new Class153(1);
	static int[] anIntArray939;
	static Class195_Sub1[] aClass195_Sub1Array940 = new Class195_Sub1[0];
	static long aLong941;

	final void method487(byte i, long l, Class11_Sub45 class11_sub45) {
		try {
			int i_0_ = -71 % ((-13 - i) / 32);
			if (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 != null)
				class11_sub45.method3187(100);
			anInt936++;
			Class11_Sub45 class11_sub45_1_ = aClass11_Sub45Array935[(int) ((long) (anInt934 - 1) & l)];
			((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 = ((Class11_Sub45) class11_sub45_1_).aClass11_Sub45_7902;
			((Class11_Sub45) class11_sub45).aClass11_Sub45_7903 = class11_sub45_1_;
			((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7902)).aClass11_Sub45_7903 = class11_sub45;
			((Class11_Sub45) class11_sub45).aLong7904 = l;
			((Class11_Sub45) (((Class11_Sub45) class11_sub45).aClass11_Sub45_7903)).aClass11_Sub45_7902 = class11_sub45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uea.F(" + i + ',' + l
					+ ',' + (class11_sub45 != null ? "{...}" : "null") + ')'));
		}
	}

	static final String method488(int i, int i_2_) {
		try {
			anInt931++;
			String string = Integer.toString(i);
			if (i_2_ <= 54)
				return null;
			for (int i_3_ = -3 + string.length(); i_3_ > 0; i_3_ -= 3)
				string = string.substring(0, i_3_) + ","
						+ string.substring(i_3_);
			if ((string.length() ^ 0xffffffff) < -10)
				return (" <col=00ff80>"
						+ string.substring(0, -8 + string.length())
						+ (Class26.aClass26_309.method217((byte) 109,
								Class11_Sub45_Sub1_Sub2.anInt9884)) + " ("
						+ string + ")</col>");
			if ((string.length() ^ 0xffffffff) < -7)
				return (" <col=ffffff>"
						+ string.substring(0, -4 + string.length())
						+ (Class26.aClass26_311.method217((byte) 97,
								Class11_Sub45_Sub1_Sub2.anInt9884)) + " ("
						+ string + ")</col>");
			return " <col=ffff00>" + string + "</col>";
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uea.A(" + i + ','
					+ i_2_ + ')');
		}
	}

	static final IComponentDefinitions method489(
			IComponentDefinitions class192, boolean bool) {
		try {
			anInt937++;
			if (((IComponentDefinitions) class192).anInt2593 != -1)
				return Class11_Sub2_Sub13.method3533((byte) -105,
						(((IComponentDefinitions) class192).anInt2593));
			int i = ((IComponentDefinitions) class192).anInt2471 >>> 16;
			Class313 class313 = new Class313(Class75_Sub2.aClass213_7160);
			if (bool != true)
				aClass153_938 = null;
			for (Class11_Sub24 class11_sub24 = (Class11_Sub24) class313
					.method1907(0); class11_sub24 != null; class11_sub24 = (Class11_Sub24) class313
					.method1905((byte) -93)) {
				if ((((Class11_Sub24) class11_sub24).anInt6233 ^ 0xffffffff) == (i ^ 0xffffffff))
					return Class11_Sub2_Sub13.method3533((byte) -88,
							(int) (((Class11) class11_sub24).aLong91));
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("uea.B("
							+ (class192 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	Class65(int i) {
		try {
			aClass11_Sub45Array935 = new Class11_Sub45[i];
			anInt934 = i;
			for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				Class11_Sub45 class11_sub45 = aClass11_Sub45Array935[i_4_] = new Class11_Sub45();
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7902 = class11_sub45;
				((Class11_Sub45) class11_sub45).aClass11_Sub45_7903 = class11_sub45;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "uea.<init>(" + i + ')');
		}
	}

	final Class11_Sub45 method490(int i, long l) {
		try {
			aLong930 = l;
			anInt929++;
			Class11_Sub45 class11_sub45 = aClass11_Sub45Array935[(int) ((long) (i + anInt934) & l)];
			for (aClass11_Sub45_932 = ((Class11_Sub45) class11_sub45).aClass11_Sub45_7903; class11_sub45 != aClass11_Sub45_932; aClass11_Sub45_932 = (((Class11_Sub45) aClass11_Sub45_932).aClass11_Sub45_7903)) {
				if ((l ^ 0xffffffffffffffffL) == (((Class11_Sub45) aClass11_Sub45_932).aLong7904 ^ 0xffffffffffffffffL)) {
					Class11_Sub45 class11_sub45_5_ = aClass11_Sub45_932;
					aClass11_Sub45_932 = (((Class11_Sub45) aClass11_Sub45_932).aClass11_Sub45_7903);
					return class11_sub45_5_;
				}
			}
			aClass11_Sub45_932 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uea.D(" + i + ',' + l
					+ ')');
		}
	}

	final Class11_Sub45 method491(int i) {
		try {
			if (i != -23702)
				return null;
			anInt933++;
			if (aClass11_Sub45_932 == null)
				return null;
			for (Class11_Sub45 class11_sub45 = (aClass11_Sub45Array935[(int) (aLong930 & (long) (-1 + anInt934))]); aClass11_Sub45_932 != class11_sub45; aClass11_Sub45_932 = (((Class11_Sub45) aClass11_Sub45_932).aClass11_Sub45_7903)) {
				if ((aLong930 ^ 0xffffffffffffffffL) == (((Class11_Sub45) aClass11_Sub45_932).aLong7904 ^ 0xffffffffffffffffL)) {
					Class11_Sub45 class11_sub45_6_ = aClass11_Sub45_932;
					aClass11_Sub45_932 = (((Class11_Sub45) aClass11_Sub45_932).aClass11_Sub45_7903);
					return class11_sub45_6_;
				}
			}
			aClass11_Sub45_932 = null;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uea.E(" + i + ')');
		}
	}

	public static void method492(int i) {
		do {
			try {
				anIntArray939 = null;
				aClass195_Sub1Array940 = null;
				aClass153_938 = null;
				if (i == 0)
					break;
				aClass153_938 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uea.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		anIntArray939 = new int[14];
	}
}
