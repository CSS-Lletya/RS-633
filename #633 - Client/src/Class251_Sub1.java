/* Class251_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class251_Sub1 extends Class251 implements Interface27 {
	static int anInt5416;
	static int anInt5417;
	static int anInt5418;
	static int anInt5419;
	static int[] anIntArray5420 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
	private Class366 aClass366_5421;
	static int anInt5422;
	static int anInt5423;
	static int[] anIntArray5424;
	static int anInt5425;
	static int anInt5426;

	public final boolean method40(byte i) {
		try {
			anInt5423++;
			if (i < 104)
				return false;
			return super
					.method1601(
							(byte) 100,
							(((Class163_Sub2_Sub1) (((Class251) this).aClass163_Sub2_Sub1_3465)).aMapBuffer8668));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.F(" + i + ')');
		}
	}

	public final void method8(int i) {
		try {
			anInt5416++;
			super.method8(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.E(" + i + ')');
		}
	}

	public final void method17(int i, byte i_0_) {
		try {
			anInt5426++;
			int i_1_ = -10 / ((3 - i_0_) / 47);
			super.method17(i * ((Class366) aClass366_5421).anInt4802, (byte) 97);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class251_Sub1(Class163_Sub2_Sub1 class163_sub2_sub1, Class366 class366,
			boolean bool) {
		super(class163_sub2_sub1, 34963, bool);
		try {
			aClass366_5421 = class366;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("wia.<init>("
							+ (class163_sub2_sub1 != null ? "{...}" : "null")
							+ ',' + (class366 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	public final Class366 method59(int i) {
		try {
			anInt5425++;
			if (i != -14876)
				aClass366_5421 = null;
			return aClass366_5421;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.C(" + i + ')');
		}
	}

	public static void method2377(byte i) {
		try {
			anIntArray5424 = null;
			if (i != 56)
				method2377((byte) -7);
			anIntArray5420 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.D(" + i + ')');
		}
	}

	public final int method48(boolean bool) {
		try {
			if (bool != true)
				anIntArray5424 = null;
			anInt5419++;
			return super.method48(true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.A(" + bool + ')');
		}
	}

	public final Buffer method12(int i, boolean bool) {
		try {
			anInt5418++;
			if (i != 27599)
				anIntArray5424 = null;
			return super
					.method1603(
							bool,
							(((Class163_Sub2_Sub1) (((Class251) this).aClass163_Sub2_Sub1_3465)).aMapBuffer8668),
							(byte) -24);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wia.B(" + i + ','
					+ bool + ')');
		}
	}

	static final boolean method2378(byte i, int i_2_, int i_3_) {
		try {
			anInt5422++;
			int i_4_ = -49 % ((66 - i) / 40);
			return ((Class58_Sub1.method2954(33, i_3_, i_2_)
					| Class38.method335(i_3_, i_2_, (byte) 51) | Class256_Sub2
						.method3112(i_2_, -129767092, i_3_)) & Class57_Sub1
					.method2488(true, i_2_, i_3_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wia.H(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}
}
