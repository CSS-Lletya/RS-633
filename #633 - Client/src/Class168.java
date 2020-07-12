/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class168 {
	static Class174 aClass174_2155 = new Class174();
	int anInt2156;
	int anInt2157;
	int anInt2158;
	int anInt2159 = 128;
	static Class280 aClass280_2160;
	static int anInt2161;
	int anInt2162;
	static int anInt2163;
	int anInt2164 = 128;
	static int anInt2165;
	static int anInt2166;

	static final Class237 method1102(byte i) {
		try {
			int i_0_ = -4 % ((i - 56) / 42);
			anInt2161++;
			return Class41.method366(-30727, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hj.D(" + i + ')');
		}
	}

	final Class168 method1103(int i) {
		try {
			if (i != 128)
				return null;
			anInt2163++;
			return new Class168(((Class168) this).anInt2156,
					((Class168) this).anInt2164, ((Class168) this).anInt2159,
					((Class168) this).anInt2158, ((Class168) this).anInt2162,
					((Class168) this).anInt2157);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hj.A(" + i + ')');
		}
	}

	public static void method1104(byte i) {
		try {
			if (i > -97)
				method1102((byte) 68);
			aClass280_2160 = null;
			aClass174_2155 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hj.B(" + i + ')');
		}
	}

	final void method1105(int i, Class168 class168_1_) {
		try {
			((Class168) this).anInt2164 = ((Class168) class168_1_).anInt2164;
			if (i == 128) {
				anInt2165++;
				((Class168) this).anInt2158 = ((Class168) class168_1_).anInt2158;
				((Class168) this).anInt2159 = ((Class168) class168_1_).anInt2159;
				((Class168) this).anInt2157 = ((Class168) class168_1_).anInt2157;
				((Class168) this).anInt2156 = ((Class168) class168_1_).anInt2156;
				((Class168) this).anInt2162 = ((Class168) class168_1_).anInt2162;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hj.C(" + i + ','
					+ (class168_1_ != null ? "{...}" : "null") + ')');
		}
	}

	Class168(int i) {
		try {
			((Class168) this).anInt2156 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hj.<init>(" + i + ')');
		}
	}

	private Class168(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			((Class168) this).anInt2156 = i;
			((Class168) this).anInt2158 = i_4_;
			((Class168) this).anInt2162 = i_5_;
			((Class168) this).anInt2159 = i_3_;
			((Class168) this).anInt2164 = i_2_;
			((Class168) this).anInt2157 = i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("hj.<init>(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
							+ ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}
}
