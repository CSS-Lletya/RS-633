/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class63 implements Interface22 {
	static int anInt909;
	static int anInt910;
	static int anInt911;
	static int anInt912;
	static int anInt913;
	private Class146 aClass146_914;
	private Class107 aClass107_915;
	private Class146 aClass146_916;
	private Class113 aClass113_917;
	static int anInt918;
	static int anInt919;
	static int anInt920;
	static Class174 aClass174_921 = new Class174();
	static OutgoingPacket aClass370_922;
	static boolean aBool923;
	static boolean aBool924 = false;

	public final void method36(boolean bool, int i) {
		do {
			try {
				if (bool) {
					int i_0_ = ((((Class113) aClass113_917).aClass118_1556
							.method772(Class233.anInt3186,
									((Class113) aClass113_917).anInt1550, -104)) - -((Class113) aClass113_917).anInt1561);
					int i_1_ = ((((Class113) aClass113_917).aClass150_1545
							.method948(((Class113) aClass113_917).anInt1549, 0,
									Class279.anInt3772)) - -((Class113) aClass113_917).anInt1560);
					aClass107_915.method720(i_1_, 0,
							((Class113) aClass113_917).anInt1550, null,
							((Class113) aClass113_917).anInt1553,
							((Class113) aClass113_917).anInt1552, null,
							((Class113) aClass113_917).anInt1558,
							((Class113) aClass113_917).anInt1547,
							((Class113) aClass113_917).anInt1549,
							((Class113) aClass113_917).anInt1554, 0, i_0_,
							null, ((Class113) aClass113_917).aString1546,
							(byte) 100);
				}
				anInt913++;
				if (i == -3340)
					break;
				method479((byte) 95, 98);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fga.F(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	public final void method39(int i) {
		try {
			anInt920++;
			if (i != 11133)
				method483((byte) 76);
			Class292 class292 = Class194.method1270(aClass146_914, 2,
					((Class113) aClass113_917).anInt1551);
			aClass107_915 = (Class321_Sub2.aClass163_6648.method1060(class292,
					Class80.method544(aClass146_916,
							((Class113) aClass113_917).anInt1551), true));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.B(" + i + ')');
		}
	}

	static final int method478(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, boolean bool) {
		try {
			if ((i_6_ & 0x1 ^ 0xffffffff) == -2) {
				int i_7_ = i_2_;
				i_2_ = i_4_;
				i_4_ = i_7_;
			}
			if (bool != true)
				aClass370_922 = null;
			anInt910++;
			i_5_ &= 0x3;
			if (i_5_ == 0)
				return i_3_;
			if ((i_5_ ^ 0xffffffff) == -2)
				return i;
			if ((i_5_ ^ 0xffffffff) == -3)
				return 1 + -i_2_ + (7 - i_3_);
			return -i + 7 + (-i_4_ + 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fga.H(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_
					+ ',' + bool + ')'));
		}
	}

	public final boolean method24(int i) {
		try {
			anInt911++;
			boolean bool = true;
			if (i != -32252)
				aBool923 = true;
			if (!aClass146_916.method918(((Class113) aClass113_917).anInt1551,
					113))
				bool = false;
			if (!aClass146_914.method918(((Class113) aClass113_917).anInt1551,
					-45))
				bool = false;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.G(" + i + ')');
		}
	}

	static final Class11_Sub45_Sub6 method479(byte i, int i_8_) {
		try {
			int i_9_ = 71 / ((i + 31) / 53);
			anInt919++;
			Class11_Sub45_Sub6 class11_sub45_sub6 = (Class11_Sub45_Sub6) Class376_Sub7_Sub5_Sub1.aClass124_9902
					.method813(-117, (long) i_8_);
			if (class11_sub45_sub6 != null)
				return class11_sub45_sub6;
			byte[] is = Class335.aClass146_4433.method930(0, (byte) 112, i_8_);
			if (is == null || (is.length ^ 0xffffffff) >= -2)
				return null;
			try {
				class11_sub45_sub6 = Class270.method1694(is, 0);
			} catch (Exception exception) {
				throw new RuntimeException(exception.getMessage() + " S: "
						+ i_8_);
			}
			Class376_Sub7_Sub5_Sub1.aClass124_9902.method812(
					class11_sub45_sub6, (byte) 36, (long) i_8_);
			return class11_sub45_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.E(" + i + ','
					+ i_8_ + ')');
		}
	}

	static final void method480(int i, boolean bool) {
		try {
			Class337.aClass33_4457.method296(Class243.aClass163_3308
					.method1045());
			anInt909++;
			int[] is = Class243.aClass163_3308.Y();
			Class287.anInt3888 = is[i];
			Class376_Sub8.anInt7756 = is[1];
			Class11_Sub10.anInt5398 = is[0];
			Class273.anInt3687 = is[3];
			if (!bool) {
				Class243.aClass163_3308.DA(Class58_Sub1_Sub1.anInt9174,
						Class236_Sub8.anInt7053, Class79.anInt1072,
						Class11_Sub32.anInt6872);
				Class274.method1708(Class273.aDouble3679, (byte) -126);
			} else {
				Class243.aClass163_3308.DA(Class11_Sub12_Sub3.anInt9214,
						Class319.anInt4240, Class256_Sub2.anInt7712,
						Class11_Sub47.anInt7988);
				Class274.method1708(Class11_Sub2_Sub19.aDouble9096, (byte) -126);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.C(" + i + ','
					+ bool + ')');
		}
	}

	static final int method481(byte i, int i_10_) {
		try {
			if (i != -58)
				return 64;
			anInt912++;
			return i_10_ >>> 8;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.D(" + i + ','
					+ i_10_ + ')');
		}
	}

	Class63(Class146 class146, Class146 class146_11_, Class113 class113) {
		try {
			aClass113_917 = class113;
			aClass146_914 = class146_11_;
			aClass146_916 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fga.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_11_ != null ? "{...}" : "null") + ','
					+ (class113 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method482(int i) {
		try {
			aClass370_922 = null;
			if (i <= 27)
				method481((byte) 92, 22);
			aClass174_921 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.A(" + i + ')');
		}
	}

	static final boolean method483(byte i) {
		try {
			anInt918++;
			if (i != 127)
				return true;
			if (Class52.anInt802 <= 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fga.I(" + i + ')');
		}
	}

	static {
		aBool923 = false;
		aClass370_922 = new OutgoingPacket(57, 12);
	}
}
