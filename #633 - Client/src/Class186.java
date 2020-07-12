/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class186 {
	static Class163 aClass163_2375;
	static int anInt2376;
	static int anInt2377;
	static int anInt2378;
	static Class22 aClass22_2379 = new Class22(5);
	static int anInt2380;

	static final void method1210(int i, boolean bool) {
		try {
			if (bool == false) {
				anInt2376++;
				Class11_Sub5.aClass22_5238.method182(i, (byte) -73);
				Class376_Sub7_Sub2_Sub1.aClass22_10204.method182(i, (byte) -73);
				Class256_Sub3.aClass22_7956.method182(i, (byte) -73);
				Class220.aClass22_3025.method182(i, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "in.A(" + i + ','
					+ bool + ')');
		}
	}

	public static void method1211(int i) {
		try {
			aClass163_2375 = null;
			if (i != 2)
				method1212(-46);
			aClass22_2379 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "in.C(" + i + ')');
		}
	}

	static final void method1212(int i) {
		do {
			try {
				anInt2377++;
				if (i != 10343)
					aClass163_2375 = null;
				Class119 class119 = null;
				try {
					Class368 class368 = Class108_Sub21.aClass341_7304
							.method2065(true, "", i ^ ~0x27b3);
					while ((class368.anInt4837 ^ 0xffffffff) == -1)
						Class11_Sub51.method3236(1L, 0);
					if (class368.anInt4837 == 1) {
						class119 = (Class119) class368.anObject4838;
						Stream stream = Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
								.method2457((byte) -78);
						class119.method782(0, ((Stream) stream).position,
								((Stream) stream).buffer, true);
					}
				} catch (Exception exception) {
					/* empty */
				}
				try {
					if (class119 == null)
						break;
					class119.method777(124);
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "in.E(" + i + ')');
			}
		} while (false);
	}

	static final void method1213(byte i, Class146 class146) {
		try {
			if (i >= 70) {
				anInt2380++;
				Class279.anInt3770 = 0;
				Class4.anInt33 = 0;
				IncomingPacket.aClass131_2086 = new Class131();
				Class11_Sub28.aClass376_Sub1_Sub1_Sub1Array6559 = new Class376_Sub1_Sub1_Sub1[1024];
				Class226.aClass376_Sub10Array3105 = (new Class376_Sub10[Class131.anIntArray1835[Class280.anInt3787] + 1]);
				Class1.anInt6 = 0;
				Class68.anInt976 = 0;
				Class11_Sub27.method2715(34166, class146);
				Class58_Sub2.method3157(class146, (byte) 106);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("in.D(" + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1214(byte i) {
		try {
			Class11_Sub2_Sub6.aStringArray8706 = new String[500];
			Class2_Sub7.anInt6107 = (2 + ((Class292) Class161.aClass292_2096).anInt3951 - -((Class292) Class161.aClass292_2096).anInt3959);
			Class50.anInt773 = 2 + (((Class292) Class256_Sub1.aClass292_5320).anInt3959 + ((Class292) Class256_Sub1.aClass292_5320).anInt3951);
			anInt2378++;
			if (i <= 100)
				method1211(109);
			for (int i_0_ = 0; Class11_Sub2_Sub6.aStringArray8706.length > i_0_; i_0_++)
				Class11_Sub2_Sub6.aStringArray8706[i_0_] = "";
			Class314.method1912(Class26.aClass26_272.method217((byte) 119,
					Class11_Sub45_Sub1_Sub2.anInt9884), (byte) 101);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "in.B(" + i + ')');
		}
	}
}
