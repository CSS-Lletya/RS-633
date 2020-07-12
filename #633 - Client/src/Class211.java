/* Class211 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class211 {
	static int anInt2857;
	static int anInt2858;
	static int anInt2859;
	static Class40 aClass40_2860;
	static int anInt2861;
	static int anInt2862;
	static int anInt2863;
	static int anInt2864;
	/* synthetic */static Class aClass2865;
	/* synthetic */static Class aClass2866;

	static final void method1350(byte i) {
		try {
			if (i < 63)
				anInt2857 = 13;
			Class83.method575(false, 11);
			anInt2864++;
			Class11_Sub45_Sub20.method3832(-1);
			System.gc();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ki.D(" + i + ')');
		}
	}

	static final boolean method1351(Class146 class146, int i,
			Class11_Sub6_Sub2 class11_sub6_sub2, Class37 class37,
			Class146 class146_0_, Class146 class146_1_) {
		try {
			if (i < 58)
				aClass40_2860 = null;
			Class11_Sub45_Sub7.aClass37_8800 = class37;
			Class234_Sub2_Sub2.aClass146_8997 = class146_0_;
			Class301.anIntArray4058 = new int[16];
			Class11_Sub45_Sub16_Sub2.aClass146_10170 = class146_1_;
			anInt2863++;
			Class131.aClass146_1824 = class146;
			Class364.aClass11_Sub6_Sub2_4773 = class11_sub6_sub2;
			for (int i_2_ = 0; i_2_ < 16; i_2_++)
				Class301.anIntArray4058[i_2_] = 255;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ki.G("
					+ (class146 != null ? "{...}" : "null") + ',' + i + ','
					+ (class11_sub6_sub2 != null ? "{...}" : "null") + ','
					+ (class37 != null ? "{...}" : "null") + ','
					+ (class146_0_ != null ? "{...}" : "null") + ','
					+ (class146_1_ != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1352(int i, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			do {
				if (i_10_ < Class26.anInt340
						|| Class11_Sub45_Sub1_Sub2.anInt9880 < i_10_
						|| (i_4_ ^ 0xffffffff) > (Class26.anInt340 ^ 0xffffffff)
						|| ((Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff) > (i_4_ ^ 0xffffffff))
						|| Class26.anInt340 > i_3_
						|| i_3_ > Class11_Sub45_Sub1_Sub2.anInt9880
						|| i_11_ < Class26.anInt340
						|| ((Class11_Sub45_Sub1_Sub2.anInt9880 ^ 0xffffffff) > (i_11_ ^ 0xffffffff))
						|| (i_9_ ^ 0xffffffff) > (Class292.anInt3962 ^ 0xffffffff)
						|| (i_9_ ^ 0xffffffff) < (Class351.anInt4618 ^ 0xffffffff)
						|| Class292.anInt3962 > i_8_
						|| (Class351.anInt4618 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)
						|| (i_7_ ^ 0xffffffff) > (Class292.anInt3962 ^ 0xffffffff)
						|| (Class351.anInt4618 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)
						|| (Class292.anInt3962 ^ 0xffffffff) < (i ^ 0xffffffff)
						|| i > Class351.anInt4618) {
					InterfaceSettings.method2349(i_5_, false, i_11_, i_3_, i, i_7_,
							i_9_, i_8_, i_4_, i_10_);
					if (!client.aBool10531)
						break;
				}
				Class236_Sub8.method2880(i_6_ + 6, i_7_, i_10_, i_4_, i_5_,
						i_8_, i, i_3_, i_11_, i_9_);
			} while (false);
			if (i_6_ == -3)
				anInt2858++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ki.C(" + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ','
							+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ','
							+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	static final synchronized void method1353(byte i) {
		try {
			anInt2859++;
			if (Class112.anObject1536 == null) {
				try {
					Class var_class = (Class
							.forName("java.lang.management.ManagementFactory"));
					Method method = var_class.getDeclaredMethod(
							"getPlatformMBeanServer", null);
					if (i <= 120)
						aClass40_2860 = null;
					Object object = method.invoke(null, null);
					Method method_12_ = (var_class
							.getMethod(
									"newPlatformMXBeanProxy",
									(new Class[] {
											(Class.forName("javax.management.MBeanServerConnection")),
											(aClass2865 != null ? aClass2865
													: (aClass2865 = getClassByName("java.lang.String"))),
											(aClass2866 != null ? aClass2866
													: (aClass2866 = getClassByName("java.lang.Class"))) })));
					Class112.anObject1536 = (method_12_
							.invoke(null,
									(new Object[] {
											object,
											"com.sun.management:type=HotSpotDiagnostic",
											(Class.forName("com.sun.management.HotSpotDiagnosticMXBean")) })));
				} catch (Exception exception) {
					System.out.println("HeapDump setup error:");
					exception.printStackTrace();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ki.A(" + i + ')');
		}
	}

	public static void method1354(int i) {
		try {
			if (i >= -56)
				method1351(null, 104, null, null, null, null);
			aClass40_2860 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ki.F(" + i + ')');
		}
	}

	static final int method1355(int i, int i_13_, int i_14_, int i_15_) {
		try {
			i_14_ &= 0x3;
			if (i_13_ != 201)
				anInt2857 = -34;
			anInt2861++;
			if ((i_14_ ^ 0xffffffff) == -1)
				return i;
			if (i_14_ == 1)
				return i_15_;
			if ((i_14_ ^ 0xffffffff) == -3)
				return -i + 4095;
			return 4095 - i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ki.B(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
		}
	}

	static final void method1356(int i, boolean bool, boolean bool_16_) {
		try {
			anInt2862++;
			if (bool_16_ == true) {
				Class11_Sub37 class11_sub37 = Class26.method218(bool, -9854, i);
				if (class11_sub37 != null) {
					for (int i_17_ = 0; i_17_ < (((Class11_Sub37) class11_sub37).anIntArray7082).length; i_17_++) {
						((Class11_Sub37) class11_sub37).anIntArray7082[i_17_] = -1;
						((Class11_Sub37) class11_sub37).anIntArray7088[i_17_] = 0;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ki.E(" + i + ','
					+ bool + ',' + bool_16_ + ')'));
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
