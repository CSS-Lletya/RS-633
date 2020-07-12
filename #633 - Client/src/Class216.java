/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class216 {
	static OutgoingPacket aClass370_2980 = new OutgoingPacket(40, -1);
	static int anInt2981;
	static int anInt2982;
	static int anInt2983;
	int anInt2984;
	static int anInt2985;
	int anInt2986;
	static Class146 aClass146_2987;
	int anInt2988 = 128;
	int anInt2989;
	int anInt2990;
	static int anInt2991;
	int anInt2992;
	int anInt2993;
	int anInt2994;
	static long[][][] aLongArrayArrayArray2995;
	static int anInt2996;
	int anInt2997;
	int anInt2998;
	int anInt2999 = 128;
	static boolean aBool3000 = false;
	static int anInt3001;

	static final String method1386(int i, int i_0_, boolean bool) {
		try {
			anInt2985++;
			if (!bool || i_0_ < 0)
				return Integer.toString(i_0_);
			if (i != -9165)
				method1391(-110);
			return Class373.method2199(i_0_, bool, (byte) 41, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kp.D(" + i + ','
					+ i_0_ + ',' + bool + ')'));
		}
	}

	static final Class129 method1387(int i, boolean bool) {
		try {
			anInt2981++;
			Class129 class129 = ((Class129) Class111.aClass22_1515.method188(
					(long) i, (byte) 93));
			if (class129 != null)
				return class129;
			byte[] is = Class38.aClass146_511.method930(i, (byte) 112, 0);
			if (bool != true)
				aClass370_2980 = null;
			class129 = new Class129();
			if (is != null)
				class129.method841(-31, new Stream(is));
			class129.method839((byte) 86);
			Class111.aClass22_1515.method184((byte) 126, class129, (long) i);
			return class129;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.E(" + i + ','
					+ bool + ')');
		}
	}

	static final int method1388(int i) {
		try {
			if (i != 26908)
				method1387(-55, true);
			anInt2991++;
			int i_1_ = Class11_Sub2_Sub26.aClass209_9344
					.method1341((byte) -110);
			if (Class19_Sub1.aClass209Array5765.length - 1 > i_1_)
				Class11_Sub2_Sub26.aClass209_9344 = Class19_Sub1.aClass209Array5765[1 + i_1_];
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.B(" + i + ')');
		}
	}

	final Class216 method1389(boolean bool) {
		try {
			if (bool != false)
				method1388(95);
			anInt2996++;
			return new Class216(((Class216) this).anInt2998,
					((Class216) this).anInt2988, ((Class216) this).anInt2999,
					((Class216) this).anInt2992, ((Class216) this).anInt2994,
					((Class216) this).anInt2990);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.H(" + bool + ')');
		}
	}

	final void method1390(Class216 class216_2_, int i) {
		try {
			((Class216) this).anInt2990 = ((Class216) class216_2_).anInt2990;
			((Class216) this).anInt2998 = ((Class216) class216_2_).anInt2998;
			anInt2983++;
			((Class216) this).anInt2988 = ((Class216) class216_2_).anInt2988;
			((Class216) this).anInt2994 = ((Class216) class216_2_).anInt2994;
			if (i != -1)
				((Class216) this).anInt2990 = -59;
			((Class216) this).anInt2999 = ((Class216) class216_2_).anInt2999;
			((Class216) this).anInt2992 = ((Class216) class216_2_).anInt2992;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.F("
					+ (class216_2_ != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method1391(int i) {
		try {
			if (i != 10)
				aBool3000 = true;
			anInt3001++;
			return 16;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.G(" + i + ')');
		}
	}

	static final Class321_Sub3_Sub1 method1392(int i, int i_3_, int i_4_,
			Class163_Sub3 class163_sub3, int i_5_, int i_6_) {
		try {
			if (i != 3553)
				return null;
			anInt2982++;
			if (!((Class163_Sub3) class163_sub3).aBool8352
					&& (!Class261.method1669(i_3_, (byte) 123) || !Class261
							.method1669(i_5_, (byte) 72))) {
				if (((Class163_Sub3) class163_sub3).aBool8389)
					return new Class321_Sub3_Sub1(class163_sub3, 34037, i_4_,
							i_6_, i_3_, i_5_, true);
				return new Class321_Sub3_Sub1(class163_sub3, i_4_, i_6_, i_3_,
						i_5_, Class11_Sub2_Sub33.method3808(118, i_3_),
						Class11_Sub2_Sub33.method3808(i ^ 0xd9e, i_5_), true);
			}
			return new Class321_Sub3_Sub1(class163_sub3, 3553, i_4_, i_6_,
					i_3_, i_5_, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kp.C(" + i + ','
					+ i_3_ + ',' + i_4_ + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i_5_
					+ ',' + i_6_ + ')'));
		}
	}

	public static void method1393(int i) {
		try {
			if (i != 40)
				method1386(-43, -99, false);
			aLongArrayArrayArray2995 = null;
			aClass370_2980 = null;
			aClass146_2987 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.A(" + i + ')');
		}
	}

	Class216(int i) {
		try {
			((Class216) this).anInt2998 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kp.<init>(" + i + ')');
		}
	}

	private Class216(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			((Class216) this).anInt2988 = i_7_;
			((Class216) this).anInt2994 = i_10_;
			((Class216) this).anInt2999 = i_8_;
			((Class216) this).anInt2990 = i_11_;
			((Class216) this).anInt2998 = i;
			((Class216) this).anInt2992 = i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kp.<init>(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ')'));
		}
	}
}
