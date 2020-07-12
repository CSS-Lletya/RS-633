/* Class11_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub5 extends Class11 {
	static Class22 aClass22_5238 = new Class22(3000000, 200);
	static int anInt5239;
	static int anInt5240;
	int anInt5241;
	int anInt5242;
	static IncomingPacket RUN_ENERGY_IN_PACKET = new IncomingPacket(83, 1);

	public static void method2311(int i) {
		try {
			if (i > -43)
				method2312(39, false, -117, true, -19, null, null);
			aClass22_5238 = null;
			RUN_ENERGY_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rga.C(" + i + ')');
		}
	}

	static final int method2312(int i, boolean bool, int i_0_, boolean bool_1_,
			int i_2_, Class195_Sub1 class195_sub1,
			Class195_Sub1 class195_sub1_3_) {
		try {
			anInt5239++;
			if (i_0_ != 1)
				return -4;
			int i_4_ = Class11_Sub24.method2646(bool_1_, class195_sub1_3_,
					-123, i, class195_sub1);
			if (i_4_ != 0) {
				if (!bool_1_)
					return i_4_;
				return -i_4_;
			}
			if ((i_2_ ^ 0xffffffff) == 0)
				return 0;
			int i_5_ = Class11_Sub24.method2646(bool, class195_sub1_3_, -124,
					i_2_, class195_sub1);
			if (!bool)
				return i_5_;
			return -i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rga.A(" + i + ','
					+ bool + ',' + i_0_ + ',' + bool_1_ + ',' + i_2_ + ','
					+ (class195_sub1 != null ? "{...}" : "null") + ','
					+ (class195_sub1_3_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final byte method2313(byte i, int i_6_, int i_7_) {
		try {
			if (i != -32)
				method2313((byte) -97, 106, -52);
			anInt5240++;
			if ((i_6_ ^ 0xffffffff) != -10)
				return (byte) 0;
			if ((0x1 & i_7_) != 0)
				return (byte) 2;
			return (byte) 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rga.B(" + i + ','
					+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	Class11_Sub5(int i, int i_8_) {
		try {
			((Class11_Sub5) this).anInt5241 = i_8_;
			((Class11_Sub5) this).anInt5242 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rga.<init>(" + i + ','
					+ i_8_ + ')');
		}
	}
}
