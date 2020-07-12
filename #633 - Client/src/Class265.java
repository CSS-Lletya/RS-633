/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class265 {
	static int anInt3605;
	static int anInt3606;
	static Class146 aClass146_3607;
	private Class190 aClass190_3608;
	static int anInt3609;
	static Class9 aClass9_3610 = new Class9(5, 1);
	private Class146 aClass146_3611;
	private Class146 aClass146_3612;
	static int anInt3613;
	static int anInt3614;
	static OutgoingPacket aClass370_3615 = new OutgoingPacket(34, 11);

	static final void method1678(boolean bool) {
		try {
			if (bool != false)
				method1678(false);
			anInt3613++;
			if (!Class11_Sub28.aBool6576) {
				Class175.aFloat2228 += (-Class175.aFloat2228 + 12.0F) / 2.0F;
				Class11_Sub28.aBool6576 = true;
				Class313.aBool4153 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oo.B(" + bool + ')');
		}
	}

	static final void method1679(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if (i_3_ <= -115) {
				anInt3609++;
				Class242.aClass203Array3287[Class142.anInt1926++] = new Class203(
						i_6_, i_2_, i, i_7_, i_7_, i, i_1_, i_0_, i_0_, i_1_,
						i_5_, i_5_, i_4_, i_4_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oo.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	private final Class190 method1680(byte i) {
		try {
			anInt3606++;
			int i_8_ = -40 % ((i + 77) / 49);
			if (aClass190_3608 == null)
				aClass190_3608 = new Class190();
			return aClass190_3608;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oo.C(" + i + ')');
		}
	}

	final Interface22 method1681(int i, Interface6 interface6) {
		try {
			anInt3605++;
			if (interface6 == null)
				return null;
			Class9 class9 = interface6.method21(false);
			if (Class291.aClass9_3944 == class9)
				return new Class287((Class167) interface6);
			if (class9 == Class11_Sub49.aClass9_8019)
				return new Class121(method1680((byte) -126),
						(Class272) interface6);
			if (class9 == aClass9_3610)
				return new Class220(aClass146_3611, (Class57) interface6);
			if (class9 == Class117.aClass9_1594)
				return new Class220_Sub1(aClass146_3611,
						(Class57_Sub1) interface6);
			if (Class107.aClass9_1440 == class9)
				return new Class335_Sub1(aClass146_3611, aClass146_3612,
						(Class254_Sub3) interface6);
			if (class9 == Class15.aClass9_131)
				return new Class335_Sub2(aClass146_3611, aClass146_3612,
						(Class254_Sub1) interface6);
			if (Class70.aClass9_983 == class9)
				return new Class335_Sub3(aClass146_3611, aClass146_3612,
						(Class254_Sub2) interface6);
			if (class9 == Class209.aClass9_2843)
				return new Class63(aClass146_3611, aClass146_3612,
						(Class113) interface6);
			if (Class11_Sub45_Sub2.aClass9_8504 == class9)
				return new Class172(aClass146_3611, (Class204) interface6);
			if (i != 5)
				aClass146_3607 = null;
			if (class9 == Class33.aClass9_454)
				return new Class335_Sub3_Sub1(aClass146_3611, aClass146_3612,
						(Class254_Sub2_Sub1) interface6);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oo.A(" + i + ','
					+ (interface6 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1682(byte i) {
		try {
			aClass146_3607 = null;
			if (i >= -52)
				anInt3614 = 21;
			aClass370_3615 = null;
			aClass9_3610 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oo.D(" + i + ')');
		}
	}

	Class265(Class146 class146, Class146 class146_9_) {
		try {
			aClass146_3612 = class146_9_;
			aClass146_3611 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oo.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_9_ != null ? "{...}" : "null") + ')'));
		}
	}
}
