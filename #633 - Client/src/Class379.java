/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class379 {
	static Class79 aClass79_4948 = new Class79(2, 4, 4, 0);
	static int anInt4949;
	static int anInt4950;
	private Class146 aClass146_4951;
	static int anInt4952;
	private Class22 aClass22_4953 = new Class22(16);
	static OutgoingPacket aClass370_4954 = new OutgoingPacket(26, 7);
	static int anInt4955;
	static int anInt4956;
	static boolean aBool4957;

	final void method2221(int i) {
		try {
			anInt4952++;
			synchronized (aClass22_4953) {
				aClass22_4953.method189((byte) 36);
			}
			int i_0_ = -14 % ((i - 35) / 32);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "caa.A(" + i + ')');
		}
	}

	private final Class45 method2222(int i, int i_1_) {
		try {
			anInt4950++;
			Class45 class45;
			synchronized (aClass22_4953) {
				class45 = (Class45) aClass22_4953.method188((long) i_1_,
						(byte) 127);
				if (i != 7)
					method2222(-68, 60);
			}
			if (class45 != null)
				return class45;
			byte[] is;
			synchronized (aClass146_4951) {
				is = aClass146_4951.method930(i_1_, (byte) 112, 29);
			}
			class45 = new Class45();
			if (is != null)
				class45.method397(new Stream(is), (byte) -101);
			synchronized (aClass22_4953) {
				aClass22_4953.method184((byte) 127, class45, (long) i_1_);
			}
			return class45;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "caa.E(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method2223(int i, int i_2_) {
		try {
			if (i_2_ >= -126)
				aBool4957 = false;
			synchronized (aClass22_4953) {
				aClass22_4953.method182(i, (byte) -73);
			}
			anInt4956++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "caa.D(" + i + ','
					+ i_2_ + ')');
		}
	}

	public static void method2224(int i) {
		try {
			aClass79_4948 = null;
			if (i != 7)
				method2224(116);
			aClass370_4954 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "caa.F(" + i + ')');
		}
	}

	final Class141 method2225(int i, int i_3_, Class154 class154, int i_4_,
			int i_5_, int i_6_) {
		try {
			if (i_3_ != 4)
				method2224(-119);
			anInt4949++;
			Class178[] class178s = null;
			Class45 class45 = method2222(7, i_6_);
			if (((Class45) class45).anIntArray716 != null) {
				class178s = new Class178[((Class45) class45).anIntArray716.length];
				for (int i_7_ = 0; class178s.length > i_7_; i_7_++) {
					Class375 class375 = class154.method969(
							(((Class45) class45).anIntArray716[i_7_]), -7588);
					class178s[i_7_] = new Class178(
							((Class375) class375).anInt4906,
							((Class375) class375).anInt4898,
							((Class375) class375).anInt4902,
							((Class375) class375).anInt4904,
							((Class375) class375).anInt4895,
							((Class375) class375).anInt4899,
							((Class375) class375).anInt4900,
							((Class375) class375).aBool4903);
				}
			}
			return new Class141(((Class45) class45).anInt711, class178s,
					((Class45) class45).anInt710, i, i_4_, i_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("caa.C(" + i + ','
					+ i_3_ + ',' + (class154 != null ? "{...}" : "null") + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method2226(boolean bool) {
		try {
			anInt4955++;
			synchronized (aClass22_4953) {
				aClass22_4953.method190(0);
				if (bool != true)
					aClass22_4953 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "caa.B(" + bool + ')');
		}
	}

	Class379(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_4951 = class146;
			aClass146_4951.method914(29, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("caa.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
