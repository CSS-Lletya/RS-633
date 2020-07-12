/* Class234_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class234_Sub2_Sub1 extends Class234_Sub2 {
	static int anInt8440;
	private Class163_Sub3 aClass163_Sub3_8441;
	static int anInt8442;
	static Class306 aClass306_8443;
	private int anInt8444;
	private int anInt8445;
	private int anInt8446;
	private int anInt8447;
	static int[] anIntArray8448 = new int[500];
	private Class321_Sub1 aClass321_Sub1_8449;
	static int anInt8450;
	private int anInt8451;
	private int anInt8452;

	final Class321_Sub1 method2565(byte i) {
		try {
			anInt8442++;
			if (aClass321_Sub1_8449 == null) {
				Class128.anIntArray1728[3] = anInt8445;
				Class128.anIntArray1728[1] = anInt8446;
				Class128.anIntArray1728[5] = anInt8451;
				Class128.anIntArray1728[2] = anInt8447;
				Class128.anIntArray1728[0] = anInt8444;
				Interface1 interface1 = ((Class163) aClass163_Sub3_8441).anInterface1_2118;
				Class128.anIntArray1728[4] = anInt8452;
				int i_0_ = 0;
				int i_1_ = 0;
				for (int i_2_ = 0; i_2_ < 6; i_2_++) {
					if (!interface1.method2(Class128.anIntArray1728[i_2_],
							i ^ 0x3f))
						return null;
					Class188 class188 = interface1.method7((byte) 127,
							Class128.anIntArray1728[i_2_]);
					int i_3_ = !((Class188) class188).aBool2430 ? 128 : 64;
					if (((Class188) class188).aByte2422 > 0)
						i_0_ = 1;
					if (i_1_ < i_3_)
						i_1_ = i_3_;
				}
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -7; i_4_++)
					Class229.anIntArrayArray3152[i_4_] = interface1.method6(
							false, i_1_, 20377, i_1_, 1.0F,
							Class128.anIntArray1728[i_4_]);
				aClass321_Sub1_8449 = new Class321_Sub1(aClass163_Sub3_8441,
						6407, i_1_, (i_0_ ^ 0xffffffff) != -1,
						Class229.anIntArrayArray3152);
			}
			if (i != -79)
				return null;
			return aClass321_Sub1_8449;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "via.B(" + i + ')');
		}
	}

	static final void method3330(byte i) {
		do {
			try {
				Class178.method1157();
				anInt8440++;
				if (i >= 86)
					break;
				method3330((byte) 57);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "via.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method3331(byte i) {
		do {
			try {
				anIntArray8448 = null;
				aClass306_8443 = null;
				if (i >= 56)
					break;
				method3331((byte) -42);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "via.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class234_Sub2_Sub1(Class163_Sub3 class163_sub3, int i, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_) {
		try {
			anInt8447 = i_6_;
			aClass163_Sub3_8441 = class163_sub3;
			anInt8452 = i_8_;
			anInt8446 = i_5_;
			anInt8445 = i_7_;
			anInt8451 = i_9_;
			anInt8444 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("via.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ i_9_ + ')'));
		}
	}
}
