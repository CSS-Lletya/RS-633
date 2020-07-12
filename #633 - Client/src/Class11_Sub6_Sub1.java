/* Class11_Sub6_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub6_Sub1 extends Class11_Sub6 {
	private Class84 aClass84_8818 = new Class84();
	private Class84 aClass84_8819 = new Class84();
	private int anInt8820 = -1;
	private int anInt8821 = 0;

	final synchronized int method3458() {
		return aClass84_8818.method583(64);
	}

	final synchronized void method3459(Class11_Sub6 class11_sub6) {
		aClass84_8818.method588(class11_sub6, -80);
	}

	final Class11_Sub6 method2319() {
		return (Class11_Sub6) aClass84_8818.method584(-12261);
	}

	private final void method3460(Class11 class11, Class11_Sub38 class11_sub38) {
		for (/**/; (class11 != ((Class84) aClass84_8819).aClass11_1149 && (((Class11_Sub38) (Class11_Sub38) class11).anInt7137 <= ((Class11_Sub38) class11_sub38).anInt7137)); class11 = ((Class11) class11).aClass11_88) {
			/* empty */
		}
		Class31.method259((byte) -102, class11, class11_sub38);
		anInt8820 = ((Class11_Sub38) (Class11_Sub38) (((Class11) ((Class84) aClass84_8819).aClass11_1149).aClass11_88)).anInt7137;
	}

	private final void method3461(Class11_Sub38 class11_sub38) {
		class11_sub38.method122(-76);
		class11_sub38.method2903();
		Class11 class11 = ((Class11) ((Class84) aClass84_8819).aClass11_1149).aClass11_88;
		if (class11 == ((Class84) aClass84_8819).aClass11_1149)
			anInt8820 = -1;
		else
			anInt8820 = ((Class11_Sub38) (Class11_Sub38) class11).anInt7137;
	}

	private final void method3462() {
		if (anInt8821 > 0) {
			for (Class11_Sub38 class11_sub38 = (Class11_Sub38) aClass84_8819
					.method584(-12261); class11_sub38 != null; class11_sub38 = (Class11_Sub38) aClass84_8819
					.method578(-15361))
				((Class11_Sub38) class11_sub38).anInt7137 -= anInt8821;
			anInt8820 -= anInt8821;
			anInt8821 = 0;
		}
	}

	final Class11_Sub6 method2316() {
		return (Class11_Sub6) aClass84_8818.method578(-15361);
	}

	private final void method3463(int i) {
		for (Class11_Sub6 class11_sub6 = (Class11_Sub6) aClass84_8818
				.method584(-12261); class11_sub6 != null; class11_sub6 = (Class11_Sub6) aClass84_8818
				.method578(-15361))
			class11_sub6.method2315(i);
	}

	final synchronized void method2315(int i) {
		do {
			if (anInt8820 < 0) {
				method3463(i);
				break;
			}
			if (anInt8821 + i < anInt8820) {
				anInt8821 += i;
				method3463(i);
				break;
			}
			int i_0_ = anInt8820 - anInt8821;
			method3463(i_0_);
			i -= i_0_;
			anInt8821 += i_0_;
			method3462();
			Class11_Sub38 class11_sub38 = (Class11_Sub38) aClass84_8819
					.method584(-12261);
			synchronized (class11_sub38) {
				int i_1_ = class11_sub38.method2904(this);
				if (i_1_ < 0) {
					((Class11_Sub38) class11_sub38).anInt7137 = 0;
					method3461(class11_sub38);
				} else {
					((Class11_Sub38) class11_sub38).anInt7137 = i_1_;
					method3460(((Class11) class11_sub38).aClass11_88,
							class11_sub38);
				}
			}
		} while (i != 0);
	}

	final synchronized void method3464(Class11_Sub6 class11_sub6) {
		class11_sub6.method122(-92);
	}

	private final void method3465(int[] is, int i, int i_2_) {
		for (Class11_Sub6 class11_sub6 = (Class11_Sub6) aClass84_8818
				.method584(-12261); class11_sub6 != null; class11_sub6 = (Class11_Sub6) aClass84_8818
				.method578(-15361))
			class11_sub6.method2320(is, i, i_2_);
	}

	final synchronized void method2318(int[] is, int i, int i_3_) {
		do {
			if (anInt8820 < 0) {
				method3465(is, i, i_3_);
				break;
			}
			if (anInt8821 + i_3_ < anInt8820) {
				anInt8821 += i_3_;
				method3465(is, i, i_3_);
				break;
			}
			int i_4_ = anInt8820 - anInt8821;
			method3465(is, i, i_4_);
			i += i_4_;
			i_3_ -= i_4_;
			anInt8821 += i_4_;
			method3462();
			Class11_Sub38 class11_sub38 = (Class11_Sub38) aClass84_8819
					.method584(-12261);
			synchronized (class11_sub38) {
				int i_5_ = class11_sub38.method2904(this);
				if (i_5_ < 0) {
					((Class11_Sub38) class11_sub38).anInt7137 = 0;
					method3461(class11_sub38);
				} else {
					((Class11_Sub38) class11_sub38).anInt7137 = i_5_;
					method3460(((Class11) class11_sub38).aClass11_88,
							class11_sub38);
				}
			}
		} while (i_3_ != 0);
	}

	final int method2314() {
		return 0;
	}

	public Class11_Sub6_Sub1() {
		/* empty */
	}
}
