/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class51 {
	static int[] anIntArray793;
	static int anInt794;
	static boolean aBool795 = false;
	static Class84 aClass84_796;
	static byte[][] aByteArrayArray797;
	static int anInt798;
	static short aShort799;
	static int anInt800;
	static int anInt801;

	static final void method428(boolean bool,
			Class11_Sub45_Sub5 class11_sub45_sub5) {
		do {
			try {
				anInt794++;
				if (!Class306.aBool4114) {
					class11_sub45_sub5.method122(-98);
					Class52.anInt802--;
					if (((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8761) {
						for (Class11_Sub45_Sub14 class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
								.method331((byte) -7)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class161.aClass38_2097
								.method333(-85))) {
							if (((Class11_Sub45_Sub14) class11_sub45_sub14).aString9315
									.equals(((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767)) {
								boolean bool_0_ = false;
								for (Class11_Sub45_Sub5 class11_sub45_sub5_1_ = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312
										.method331((byte) -7)); class11_sub45_sub5_1_ != null; class11_sub45_sub5_1_ = ((Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) class11_sub45_sub14).aClass38_9312
										.method333(-111))) {
									if (class11_sub45_sub5 == class11_sub45_sub5_1_) {
										if (class11_sub45_sub14.method3641(
												class11_sub45_sub5, (byte) 20))
											Exception_Sub1.method3739(-128,
													class11_sub45_sub14);
										bool_0_ = true;
										break;
									}
								}
								if (bool_0_)
									break;
							}
						}
					} else {
						long l = (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8763);
						Class11_Sub45_Sub14 class11_sub45_sub14;
						for (class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class376_Sub7_Sub5_Sub4.aClass213_10131
								.method1369((byte) 26, l)); class11_sub45_sub14 != null; class11_sub45_sub14 = ((Class11_Sub45_Sub14) Class376_Sub7_Sub5_Sub4.aClass213_10131
								.method1363(0))) {
							if (((Class11_Sub45_Sub14) class11_sub45_sub14).aString9315
									.equals(((Class11_Sub45_Sub5) class11_sub45_sub5).aString8767))
								break;
						}
						if (class11_sub45_sub14 != null
								&& class11_sub45_sub14.method3641(
										class11_sub45_sub5, (byte) 20))
							Exception_Sub1
									.method3739(-113, class11_sub45_sub14);
					}
					if (bool == true)
						break;
					method430((byte) 29);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("hfa.A("
								+ bool
								+ ','
								+ (class11_sub45_sub5 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final boolean method429(int i, int i_2_, int i_3_) {
		try {
			anInt798++;
			int i_4_ = 61 % ((i - 67) / 39);
			if ((0x800 & i_3_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hfa.C(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method430(byte i) {
		try {
			if (i > 36) {
				anInt801++;
				if (!Class11_Sub28.aBool6576) {
					Class313.aBool4153 = true;
					Class11_Sub28.aBool6576 = true;
					Class175.aFloat2228 += (-12.0F - Class175.aFloat2228) / 2.0F;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hfa.B(" + i + ')');
		}
	}

	public static void method431(int i) {
		try {
			aClass84_796 = null;
			anIntArray793 = null;
			if (i > -107)
				aBool795 = false;
			aByteArrayArray797 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hfa.D(" + i + ')');
		}
	}

	static {
		anIntArray793 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069,
				36070, 36071, 36096 };
		aByteArrayArray797 = new byte[50][];
		anInt800 = 0;
		aShort799 = (short) 1;
		aClass84_796 = new Class84();
	}
}
