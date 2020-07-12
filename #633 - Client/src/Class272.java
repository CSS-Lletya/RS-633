/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class272 implements Interface6 {
	int anInt3658;
	int anInt3659;
	int anInt3660;
	int anInt3661;
	Class118 aClass118_3662;
	int anInt3663;
	static int anInt3664;
	Class150 aClass150_3665;
	int anInt3666;
	int anInt3667;
	int anInt3668;
	static int anInt3669;
	boolean aBool3670;
	static Class79 aClass79_3671 = new Class79(8, 0, 4, 1);
	static Class264 aClass264_3672;
	static Class253 aClass253_3673;
	static OutgoingPacket aClass370_3674;
	static int[] anIntArray3675 = new int[256];
	static float aFloat3676;

	public final Class9 method21(boolean bool) {
		try {
			anInt3669++;
			if (bool != false)
				return null;
			return Class11_Sub49.aClass9_8019;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pj.A(" + bool + ')');
		}
	}

	static final void method1698(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ < 114)
				aClass370_3674 = null;
			anInt3664++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 15, 0);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i_0_;
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pj.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method1699(int i) {
		try {
			aClass253_3673 = null;
			anIntArray3675 = null;
			int i_2_ = 3 % ((i + 47) / 42);
			aClass370_3674 = null;
			aClass79_3671 = null;
			aClass264_3672 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pj.C(" + i + ')');
		}
	}

	Class272(int i, Class118 class118, Class150 class150, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool) {
		try {
			((Class272) this).anInt3661 = i_3_;
			((Class272) this).aBool3670 = bool;
			((Class272) this).aClass150_3665 = class150;
			((Class272) this).anInt3666 = i;
			((Class272) this).anInt3658 = i_4_;
			((Class272) this).anInt3663 = i_5_;
			((Class272) this).aClass118_3662 = class118;
			((Class272) this).anInt3660 = i_6_;
			((Class272) this).anInt3659 = i_7_;
			((Class272) this).anInt3668 = i_9_;
			((Class272) this).anInt3667 = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pj.<init>(" + i + ','
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i_3_ + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + i_9_ + ',' + bool + ')'));
		}
	}

	static {
		aClass370_3674 = new OutgoingPacket(20, -1);
	}
}
