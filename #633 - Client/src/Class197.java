/* Class197 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class197 {
	private Class22 aClass22_2665 = new Class22(64);
	static int anInt2666 = 0;
	static int anInt2667;
	static int anInt2668 = 0;
	private Class146 aClass146_2669;
	static int anInt2670;
	static int anInt2671;

	final Class11_Sub45_Sub8 method1278(int i, boolean bool) {
		try {
			anInt2670++;
			Class11_Sub45_Sub8 class11_sub45_sub8;
			synchronized (aClass22_2665) {
				class11_sub45_sub8 = (Class11_Sub45_Sub8) aClass22_2665
						.method188((long) i, (byte) -92);
			}
			if (bool != true)
				method1278(33, false);
			if (class11_sub45_sub8 != null)
				return class11_sub45_sub8;
			byte[] is;
			synchronized (aClass146_2669) {
				is = aClass146_2669.method930(i, (byte) 112, 5);
			}
			class11_sub45_sub8 = new Class11_Sub45_Sub8();
			if (is != null)
				class11_sub45_sub8.method3454(-15650, new Stream(is));
			synchronized (aClass22_2665) {
				aClass22_2665.method184((byte) 125, class11_sub45_sub8,
						(long) i);
			}
			return class11_sub45_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jj.A(" + i + ','
					+ bool + ')');
		}
	}

	static final boolean method1279(int i, int i_0_, int i_1_) {
		try {
			if (i != 5)
				return false;
			anInt2671++;
			return (Class93.method628(i_0_, i_1_, 30743) & Class313.method1906(
					i_1_, (byte) 69, i_0_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jj.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class197(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_2669 = class146;
			aClass146_2669.method914(5, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jj.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
