/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class14 implements Interface5 {
	int anInt115;
	static int anInt116;
	boolean aBool117;
	int anInt118;
	static int anInt119;
	static int anInt120;
	static int anInt121;
	int anInt122;
	static int anInt123;
	static int anInt124;
	static Class146 aClass146_125;
	int anInt126;
	int anInt127;
	int anInt128;
	static boolean aBool129 = false;

	public final long method20(boolean bool) {
		try {
			anInt121++;
			long[] ls = Class23.aLongArray228;
			long l = -1L;
			l = l >>> 8
					^ ls[(int) (0xffL & (l ^ (long) ((Class14) this).anInt128))];
			l = l >>> 8
					^ ls[(int) (0xffL & (l ^ (long) (((Class14) this).anInt126 >> 8)))];
			l = l >>> 8
					^ ls[(int) (0xffL & ((long) ((Class14) this).anInt126 ^ l))];
			l = ls[(int) ((l ^ (long) (((Class14) this).anInt115 >> 24)) & 0xffL)]
					^ l >>> 8;
			l = ls[(int) (0xffL & (l ^ (long) (((Class14) this).anInt115 >> 16)))]
					^ l >>> 8;
			l = l >>> 8
					^ ls[(int) (0xffL & (l ^ (long) (((Class14) this).anInt115 >> 8)))];
			l = (ls[(int) (0xffL & (l ^ (long) ((Class14) this).anInt115))] ^ l >>> 8);
			l = (ls[(int) (0xffL & ((long) ((Class14) this).anInt122 ^ l))] ^ l >>> 8);
			l = l >>> 8
					^ ls[(int) (0xffL & ((long) (((Class14) this).anInt127 >> 24) ^ l))];
			if (bool != true)
				aBool129 = true;
			l = l >>> 8
					^ ls[(int) (0xffL & ((long) (((Class14) this).anInt127 >> 16) ^ l))];
			l = l >>> 8
					^ ls[(int) (0xffL & (l ^ (long) (((Class14) this).anInt127 >> 8)))];
			l = l >>> 8
					^ ls[(int) (0xffL & (l ^ (long) ((Class14) this).anInt127))];
			l = l >>> 8
					^ ls[(int) (0xffL & ((long) ((Class14) this).anInt118 ^ l))];
			l = ls[(int) ((l ^ (long) (((Class14) this).aBool117 ? 1 : 0)) & 0xffL)]
					^ l >>> 8;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "w.A(" + bool + ')');
		}
	}

	public static void method145(int i) {
		try {
			if (i != -15784)
				method147(-68, null);
			aClass146_125 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "w.D(" + i + ')');
		}
	}

	static final void method146(byte i) {
		try {
			Class11_Sub2_Sub36.aClass253_9752 = null;
			Class124.aClass253_1679 = null;
			Class300.aClass253_4052 = null;
			Class11_Sub2_Sub22.aClass253_9203 = null;
			Class7.aClass253_49 = null;
			Class108_Sub16.aClass253_6549 = null;
			anInt120++;
			Class78.aClass253_1061 = null;
			Class11_Sub45_Sub6.aClass253_8787 = null;
			if (i != -126)
				aBool129 = false;
			Class46.aClass253Array722 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "w.E(" + i + ')');
		}
	}

	public final boolean method19(int i, Interface5 interface5) {
		try {
			anInt119++;
			if (!(interface5 instanceof Class14))
				return false;
			Class14 class14_0_ = (Class14) interface5;
			if (((Class14) this).anInt128 != ((Class14) class14_0_).anInt128)
				return false;
			if (((Class14) this).anInt126 != ((Class14) class14_0_).anInt126)
				return false;
			if (((Class14) class14_0_).anInt115 != ((Class14) this).anInt115)
				return false;
			if ((((Class14) class14_0_).anInt122 ^ 0xffffffff) != (((Class14) this).anInt122 ^ 0xffffffff))
				return false;
			if ((((Class14) this).anInt127 ^ 0xffffffff) != (((Class14) class14_0_).anInt127 ^ 0xffffffff))
				return false;
			if (i > -17)
				((Class14) this).anInt128 = -34;
			if ((((Class14) class14_0_).anInt118 ^ 0xffffffff) != (((Class14) this).anInt118 ^ 0xffffffff))
				return false;
			if (((Class14) this).aBool117 != ((Class14) class14_0_).aBool117)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "w.B(" + i + ','
					+ (interface5 != null ? "{...}" : "null") + ')');
		}
	}

	static final void method147(int i, Player class376_sub7_sub5_sub5_sub1) {
		try {
			if (i != 0)
				method145(108);
			anInt123++;
			Class11_Sub19 class11_sub19 = ((Class11_Sub19) (Class151.aClass213_2009
					.method1369(
							(byte) 26,
							(long) ((Actor) class376_sub7_sub5_sub5_sub1).anInt10319)));
			if (class11_sub19 == null)
				Class11_Sub30_Sub1
						.method3530(
								null,
								(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10376[0]),
								0,
								class376_sub7_sub5_sub5_sub1,
								((Class376_Sub7) class376_sub7_sub5_sub5_sub1).aByte7047,
								(((Actor) class376_sub7_sub5_sub5_sub1).anIntArray10370[0]),
								i ^ 0x72, null);
			else
				class11_sub19.method2482(107);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("w.C("
							+ i
							+ ','
							+ (class376_sub7_sub5_sub5_sub1 != null ? "{...}"
									: "null") + ')'));
		}
	}
}
