/* Class376_Sub7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class376_Sub7_Sub3 extends Class376_Sub7 {
	static int anInt9270;
	static int anInt9271;
	static int anInt9272;
	static int anInt9273;
	short aShort9274;
	static int anInt9275;
	static float[] aFloatArray9276 = new float[16384];
	static int anInt9277;
	static int anInt9278;
	static float[] aFloatArray9279 = new float[16384];

	static final void method3618(int i, int i_0_, int i_1_, int i_2_) {
		try {
			anInt9270++;
			if (Class141.anInt1903 != i_0_
					|| i != Class11_Sub32.anInt6873
					|| (i_1_ ^ 0xffffffff) != (Class11_Sub2_Sub39.anInt9813 ^ 0xffffffff)) {
				Class141.anInt1903 = i_0_;
				Class11_Sub32.anInt6873 = i;
				Class11_Sub2_Sub39.anInt9813 = i_1_;
				Class333.aBool4411 = true;
				double d = -(3.141592653589793 * (double) (i_0_ * 2)) / 16384.0;
				double d_3_ = -(3.141592653589793 * (double) (2 * i)) / 16384.0;
				double d_4_ = Math.cos(d_3_);
				double d_5_ = Math.sin(d_3_);
				double d_6_ = Math.cos(d);
				double d_7_ = Math.sin(d);
				Class357.aDouble4666 = -d_4_ * d_7_;
				Class105.aDouble1408 = d_6_;
				Class11_Sub45_Sub8.aDouble8810 = d_7_ * d_5_;
				if (i_2_ != -1)
					aFloatArray9279 = null;
				Class108_Sub22.aDouble7317 = d_6_ * d_4_;
				Class11_Sub2_Sub24.aDouble9286 = d_7_;
				Class149.aDouble1997 = 0.0;
				Class177.aDouble2242 = d_4_;
				Class377.aDouble4912 = d_5_;
				Class114.aDouble1563 = d_6_ * -d_5_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lv.Q(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final int method2859(Class11_Sub46[] class11_sub46s, int i) {
		try {
			anInt9273++;
			int i_8_ = (((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751);
			int i_9_ = (((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751);
			int i_10_ = 0;
			if (Class11_Sub45_Sub7.anInt8807 != i_8_) {
				if (Class11_Sub45_Sub7.anInt8807 < i_8_)
					i_10_ += 2;
			} else
				i_10_++;
			if ((Class15.anInt134 ^ 0xffffffff) == (i_9_ ^ 0xffffffff))
				i_10_ += 3;
			else if (i_9_ < Class15.anInt134)
				i_10_ += 6;
			int i_11_ = Class223.anIntArray3066[i_10_];
			if ((i_11_ & ((Class376_Sub7_Sub3) this).aShort9274 ^ 0xffffffff) != i)
				return this.method2857(i_8_, class11_sub46s, (byte) -73, i_9_);
			if ((((Class376_Sub7_Sub3) this).aShort9274 ^ 0xffffffff) == -2
					&& (i_8_ ^ 0xffffffff) < -1)
				return this.method2857(-1 + i_8_, class11_sub46s, (byte) -19,
						i_9_);
			if ((((Class376_Sub7_Sub3) this).aShort9274 ^ 0xffffffff) == -5
					&& (Class138.anInt1886 ^ 0xffffffff) <= (i_8_ ^ 0xffffffff))
				return this.method2857(i_8_ + 1, class11_sub46s, (byte) -79,
						i_9_);
			if (((Class376_Sub7_Sub3) this).aShort9274 == 8
					&& (i_9_ ^ 0xffffffff) < -1)
				return this.method2857(i_8_, class11_sub46s, (byte) -112,
						i_9_ - 1);
			if (((Class376_Sub7_Sub3) this).aShort9274 == 2
					&& Class82.anInt1133 >= i_9_)
				return this.method2857(i_8_, class11_sub46s, (byte) -26,
						i_9_ + 1);
			if (((Class376_Sub7_Sub3) this).aShort9274 == 16
					&& (i_8_ ^ 0xffffffff) < -1 && Class82.anInt1133 >= i_9_)
				return this.method2857(i_8_ - 1, class11_sub46s, (byte) -97,
						i_9_ + 1);
			if ((((Class376_Sub7_Sub3) this).aShort9274 ^ 0xffffffff) == -33
					&& i_8_ <= Class138.anInt1886 && Class82.anInt1133 >= i_9_)
				return this.method2857(1 + i_8_, class11_sub46s, (byte) -37,
						i_9_ + 1);
			if (((Class376_Sub7_Sub3) this).aShort9274 == 128 && i_8_ > 0
					&& i_9_ > 0)
				return this.method2857(-1 + i_8_, class11_sub46s, (byte) -101,
						-1 + i_9_);
			if (((Class376_Sub7_Sub3) this).aShort9274 == 64
					&& (i_8_ ^ 0xffffffff) >= (Class138.anInt1886 ^ 0xffffffff)
					&& (i_9_ ^ 0xffffffff) < -1)
				return this.method2857(1 + i_8_, class11_sub46s, (byte) -33,
						i_9_ - 1);
			throw new RuntimeException("");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lv.OA("
					+ (class11_sub46s != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	public static void method3619(int i) {
		do {
			try {
				aFloatArray9276 = null;
				aFloatArray9279 = null;
				if (i <= -96)
					break;
				method3620(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lv.P(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method3620(boolean bool) {
		do {
			try {
				if (bool != true)
					anInt9278 = -79;
				anInt9271++;
				if (Class62.anInt908 == -1)
					break;
				Class227.method1462(-1, -1, Class62.anInt908, 0, false);
				Class62.anInt908 = -1;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "lv.R(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final boolean method2865(int i) {
		try {
			if (i > -85)
				aFloatArray9279 = null;
			anInt9275++;
			return Class206
					.method1310(
							true,
							(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751),
							((Class376_Sub7) this).aByte7039,
							(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751),
							this);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lv.JA(" + i + ')');
		}
	}

	Class376_Sub7_Sub3(int i, int i_12_, int i_13_, int i_14_, int i_15_,
			int i_16_) {
		try {
			((Class376_Sub7) this).anInt7031 = i_13_;
			((Class376_Sub7) this).aByte7039 = (byte) i_15_;
			((Class376_Sub7) this).aByte7047 = (byte) i_14_;
			((Class376_Sub7) this).anInt7045 = i;
			((Class376_Sub7_Sub3) this).aShort9274 = (short) i_16_;
			((Class376_Sub7) this).anInt7036 = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lv.<init>(" + i + ','
					+ i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ','
					+ i_16_ + ')'));
		}
	}

	final boolean method2869(int i) {
		try {
			if (i != -21499)
				method3620(false);
			anInt9272++;
			return (Class11_Sub2_Sub19.aBoolArrayArray9091[(Class94_Sub4.anInt7730 + (-Class11_Sub45_Sub7.anInt8807 + (((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751)))][(Class94_Sub4.anInt7730
					+ -Class15.anInt134 + (((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751))]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lv.LA(" + i + ')');
		}
	}

	static {
		double d = 3.834951969714103E-4;
		for (int i = 0; i < 16384; i++) {
			aFloatArray9279[i] = (float) Math.sin(d * (double) i);
			aFloatArray9276[i] = (float) Math.cos((double) i * d);
		}
	}
}
