/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class366 {
	int anInt4802;
	static int anInt4803;
	static Class366 aClass366_4804 = new Class366(1);
	static int anInt4805;
	static Class366 aClass366_4806 = new Class366(2);
	static Class366 aClass366_4807 = new Class366(4);
	static Class366 aClass366_4808 = new Class366(1);
	static Class366 aClass366_4809 = new Class366(2);
	static Class366 aClass366_4810 = new Class366(4);
	static Class366 aClass366_4811 = new Class366(2);
	static Class366 aClass366_4812 = new Class366(4);
	static int anInt4813;
	static Player[] aClass376_Sub7_Sub5_Sub5_Sub1Array4814;
	static float[] aFloatArray4815 = { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F,
			0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	public final String toString() {
		try {
			anInt4803++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wt.toString(" + ')');
		}
	}

	private Class366(int i) {
		try {
			((Class366) this).anInt4802 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wt.<init>(" + i + ')');
		}
	}

	public static void method2166(byte i) {
		try {
			aFloatArray4815 = null;
			aClass366_4811 = null;
			aClass366_4808 = null;
			aClass366_4812 = null;
			if (i != -117)
				method2167(-82, -78, -93, true);
			aClass366_4810 = null;
			aClass366_4807 = null;
			aClass366_4809 = null;
			aClass366_4804 = null;
			aClass376_Sub7_Sub5_Sub5_Sub1Array4814 = null;
			aClass366_4806 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wt.A(" + i + ')');
		}
	}

	static final void method2167(int i, int i_0_, int i_1_, boolean bool) {
		do {
			try {
				if ((i_1_ ^ 0xffffffff) != -1011) {
					if (i_1_ != 1007) {
						if ((i_1_ ^ 0xffffffff) != -1004) {
							if ((i_1_ ^ 0xffffffff) == -1010)
								Class86.method606(Class48.aClass298_753, i_0_,
										i);
							else if (i_1_ == 1012)
								Class86.method606(Class376_Sub7.aClass298_7046,
										i_0_, i);
						} else
							Class86.method606(Class376_Sub2.aClass298_5567,
									i_0_, i);
					} else
						Class86.method606(Class12_Sub1.aClass298_5128, i_0_, i);
				} else
					Class86.method606(Class59.aClass298_879, i_0_, i);
				anInt4805++;
				if (bool == false)
					break;
				method2167(40, 112, 0, true);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wt.B(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + bool + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass376_Sub7_Sub5_Sub5_Sub1Array4814 = new Player[2048];
	}
}
