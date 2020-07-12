/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class200 implements Interface16 {
	private String aString2703;
	private Class146 aClass146_2704;
	static double aDouble2705 = -1.0;
	static int anInt2706;
	static int anInt2707;
	static int anInt2708;
	static int anInt2709;

	public final int method30(int i) {
		try {
			anInt2707++;
			if (aClass146_2704.method921(aString2703, -2))
				return 100;
			if (i != 6340)
				return 43;
			return aClass146_2704.method908(aString2703, (byte) 91);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jm.A(" + i + ')');
		}
	}

	static final long method1287(int i, int i_0_, Interface13 interface13,
			int i_1_) {
		try {
			anInt2709++;
			long l = 4194304L;
			if (i >= -39)
				method1288(119, 71, 61, 30);
			long l_2_ = -9223372036854775808L;
			Class42 class42 = (Class11_Sub4.aClass290_5237.method1793(
					(byte) 110, interface13.method42((byte) -17)));
			long l_3_ = (long) (interface13.method29((byte) -10) << 14
					| (i_1_ << 7 | i_0_) | interface13.method30(30374) << 20 | 0x40000000);
			if (((Class42) class42).anInt664 == 0)
				l_3_ |= l_2_;
			if ((((Class42) class42).anInt660 ^ 0xffffffff) == -2)
				l_3_ |= l;
			l_3_ |= (long) interface13.method42((byte) -17) << 32;
			return l_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jm.C(" + i + ','
					+ i_0_ + ',' + (interface13 != null ? "{...}" : "null")
					+ ',' + i_1_ + ')'));
		}
	}

	static final void method1288(int i, int i_4_, int i_5_, int i_6_) {
		try {
			anInt2706++;
			String string = ("tele " + i_6_ + "," + (i_5_ >> 6) + ","
					+ (i >> 6) + "," + (0x3f & i_5_) + "," + (0x3f & i));
			System.out.println(string);
			if (i_4_ > -65)
				method1288(25, 89, 82, -27);
			Class344.method2084(string, true, false, -116);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jm.D(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	public final Class117 method47(int i) {
		try {
			int i_7_ = -88 % ((i + 19) / 60);
			anInt2708++;
			return Class117.aClass117_1592;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jm.B(" + i + ')');
		}
	}

	Class200(Class146 class146, String string) {
		try {
			aClass146_2704 = class146;
			aString2703 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jm.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}
}
