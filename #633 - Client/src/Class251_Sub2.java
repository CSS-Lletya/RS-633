/* Class251_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;

final class Class251_Sub2 extends Class251 implements Interface3 {
	static int anInt5427;
	static int anInt5428;
	static Class240 aClass240_5429;
	static int anInt5430;
	static int anInt5431;
	static int anInt5432 = 0;
	static boolean aBool5433 = false;
	static int anInt5434;
	static int anInt5435;
	static int anInt5436;
	private byte aByte5437;
	static int anInt5438;
	static boolean aBool5439;
	static int anInt5440;

	public final int method48(boolean bool) {
		try {
			anInt5440++;
			if (bool != true)
				aBool5433 = false;
			return super.method48(true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.A(" + bool + ')');
		}
	}

	Class251_Sub2(Class163_Sub2_Sub1 class163_sub2_sub1, boolean bool) {
		super(class163_sub2_sub1, 34962, bool);
	}

	public final boolean method9(int i) {
		try {
			if (i != -17151)
				method2382(false, null);
			anInt5428++;
			return super
					.method1601(
							(byte) 100,
							(((Class163_Sub2_Sub1) (((Class251) this).aClass163_Sub2_Sub1_3465)).aMapBuffer8671));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.D(" + i + ')');
		}
	}

	static final void method2379(int i,
			Actor class376_sub7_sub5_sub5, int i_0_) {
		try {
			if ((((Actor) class376_sub7_sub5_sub5).anIntArray10272) != null) {
				int i_1_ = (((Actor) class376_sub7_sub5_sub5).anIntArray10272[1 + i]);
				if ((((Actor) class376_sub7_sub5_sub5).anInt10352) != i_1_) {
					((Actor) class376_sub7_sub5_sub5).anInt10305 = 0;
					((Actor) class376_sub7_sub5_sub5).anInt10282 = 0;
					((Actor) class376_sub7_sub5_sub5).anInt10326 = 0;
					((Actor) class376_sub7_sub5_sub5).anInt10283 = 1;
					((Actor) class376_sub7_sub5_sub5).anInt10368 = (((Actor) class376_sub7_sub5_sub5).anInt10375);
					((Actor) class376_sub7_sub5_sub5).anInt10352 = i_1_;
					if ((((Actor) class376_sub7_sub5_sub5).anInt10352) != -1)
						Class268.method1690(
								-701644944,
								(((Actor) class376_sub7_sub5_sub5).anInt10326),
								class376_sub7_sub5_sub5,
								(Class108_Sub23.aClass198_7760
										.method1284(
												(((Actor) class376_sub7_sub5_sub5).anInt10352),
												(byte) -43)));
				}
			}
			if (i_0_ != -1)
				method2379(121, null, -48);
			anInt5427++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dea.Q(" + i + ','
					+ (class376_sub7_sub5_sub5 != null ? "{...}" : "null")
					+ ',' + i_0_ + ')'));
		}
	}

	public static void method2380(int i) {
		try {
			if (i != 30386)
				anInt5432 = -48;
			aClass240_5429 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.P(" + i + ')');
		}
	}

	public final void method8(int i) {
		try {
			if (i != 5342)
				aByte5437 = (byte) 62;
			super.method8(i);
			anInt5435++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.E(" + i + ')');
		}
	}

	public final boolean method10(int i, int i_2_, int i_3_) {
		try {
			anInt5430++;
			aByte5437 = (byte) i_2_;
			int i_4_ = 88 / ((-67 - i) / 56);
			super.method17(i_3_, (byte) 55);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dea.B(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	public final boolean method11(Source source, byte i, int i_5_, int i_6_) {
		try {
			int i_7_ = 110 % ((i - 22) / 49);
			aByte5437 = (byte) i_6_;
			anInt5438++;
			super.method1604(source, i_5_, 2);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dea.C("
					+ (source != null ? "{...}" : "null") + ',' + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	final int method2381(int i) {
		try {
			if (i != -1611)
				method2381(117);
			anInt5436++;
			return aByte5437;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.G(" + i + ')');
		}
	}

	static final String method2382(boolean bool, String string) {
		try {
			if (bool != false)
				aClass240_5429 = null;
			anInt5431++;
			String string_8_ = Class42.method385(45,
					Class11_Sub30.method2728(57, string));
			if (string_8_ == null)
				string_8_ = "";
			return string_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dea.H(" + bool + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final Buffer method12(int i, boolean bool) {
		try {
			if (i != -5419)
				return null;
			anInt5434++;
			return super
					.method1603(
							bool,
							(((Class163_Sub2_Sub1) (((Class251) this).aClass163_Sub2_Sub1_3465)).aMapBuffer8671),
							(byte) -24);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dea.F(" + i + ','
					+ bool + ')');
		}
	}

	static {
		aClass240_5429 = new Class240();
		aBool5439 = true;
	}
}
