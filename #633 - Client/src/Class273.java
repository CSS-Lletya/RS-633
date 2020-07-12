/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class273 {
	static int anInt3677;
	private Class146 aClass146_3678;
	static double aDouble3679;
	static boolean aBool3680 = false;
	static int anInt3681;
	static int anInt3682;
	private Class22 aClass22_3683 = new Class22(64);
	static int anInt3684;
	static Object anObject3685;
	static int anInt3686;
	static int anInt3687;
	static int anInt3688;

	public static void method1700(int i) {
		do {
			try {
				anObject3685 = null;
				if (i < -127)
					break;
				aDouble3679 = 1.7567499720467357;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pk.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1701(int i, int i_0_) {
		try {
			synchronized (aClass22_3683) {
				if (i != 2341)
					return;
				aClass22_3683.method182(i_0_, (byte) -73);
			}
			anInt3677++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pk.B(" + i + ','
					+ i_0_ + ')');
		}
	}

	final Class101 method1702(int i, byte i_1_) {
		try {
			anInt3688++;
			if (i_1_ <= 67)
				method1703(true);
			Class101 class101;
			synchronized (aClass22_3683) {
				class101 = (Class101) aClass22_3683.method188((long) i,
						(byte) -64);
			}
			if (class101 != null)
				return class101;
			byte[] is;
			synchronized (aClass146_3678) {
				is = aClass146_3678.method930(i, (byte) 112, 35);
			}
			class101 = new Class101();
			if (is != null)
				class101.method672(new Stream(is), 125);
			class101.method673(-16661);
			synchronized (aClass22_3683) {
				aClass22_3683.method184((byte) 125, class101, (long) i);
			}
			return class101;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pk.A(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method1703(boolean bool) {
		try {
			if (bool != false)
				aBool3680 = false;
			synchronized (aClass22_3683) {
				aClass22_3683.method190(0);
			}
			anInt3684++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pk.C(" + bool + ')');
		}
	}

	static final Class11_Sub6_Sub2 method1704(int i) {
		try {
			anInt3686++;
			int i_2_ = -122 / ((48 - i) / 36);
			return Class364.aClass11_Sub6_Sub2_4773;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pk.F(" + i + ')');
		}
	}

	final void method1705(int i) {
		try {
			if (i != 35)
				method1706((byte) -108, 109, -15, 75, -49, -68, 30);
			anInt3681++;
			synchronized (aClass22_3683) {
				aClass22_3683.method189((byte) 62);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pk.E(" + i + ')');
		}
	}

	static final Class234 method1706(byte i, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_) {
		try {
			if (i > -74)
				aDouble3679 = -0.54414779682267;
			anInt3682++;
			long l = (76724863L * (long) i_6_ ^ ((long) i_5_ * 32147369L ^ ((long) i_4_ * 986053L ^ ((long) i_3_ * 475427L ^ ((long) i_7_ * 67481L ^ (long) i_8_ * 97549L)))));
			Class234 class234 = ((Class234) Class236_Sub5.aClass22_6844
					.method188(l, (byte) -62));
			if (class234 != null)
				return class234;
			class234 = Class11_Sub31.aClass163_6702.method1052(i_7_, i_8_,
					i_3_, i_4_, i_5_, i_6_);
			Class236_Sub5.aClass22_6844.method184((byte) 127, class234, l);
			return class234;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pk.G(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
					+ ',' + i_8_ + ')'));
		}
	}

	Class273(Class66 class66, int i, Class146 class146) {
		do {
			try {
				aClass146_3678 = class146;
				if (aClass146_3678 == null)
					break;
				aClass146_3678.method914(35, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pk.<init>("
						+ (class66 != null ? "{...}" : "null") + ',' + i + ','
						+ (class146 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
