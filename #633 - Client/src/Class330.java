/* Class330 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class330 {
	static int anInt4377;
	static int anInt4378;
	int anInt4379 = 128;
	int anInt4380;
	static int anInt4381;
	int anInt4382;
	static int anInt4383 = 0;
	int anInt4384 = 128;
	static int anInt4385;
	static int anInt4386;
	int anInt4387;
	int anInt4388;
	static int anInt4389;

	static final void method1996(int i, int i_0_,
			IComponentDefinitions class192, int i_1_) {
		do {
			try {
				anInt4378++;
				Class108_Sub8.aClass192_5734 = class192;
				Class204.anInt2748 = i;
				Class11_Sub18.anInt5792 = i_0_;
				if (i_1_ == 0)
					break;
				anInt4383 = 48;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kga.D(" + i + ','
						+ i_0_ + ',' + (class192 != null ? "{...}" : "null")
						+ ',' + i_1_ + ')'));
			}
			break;
		} while (false);
	}

	static final byte[] method1997(byte[] is, int i, byte i_2_) {
		try {
			anInt4381++;
			if (i_2_ < 123)
				method1997(null, -116, (byte) 17);
			byte[] is_3_ = new byte[i];
			Class311.method1898(is, 0, is_3_, 0, i);
			return is_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("kga.C(" + (is != null ? "{...}" : "null") + ',' + i + ','
							+ i_2_ + ')'));
		}
	}

	final void method1998(byte i, Class330 class330_4_) {
		try {
			int i_5_ = 26 % ((i + 57) / 62);
			((Class330) this).anInt4379 = ((Class330) class330_4_).anInt4379;
			((Class330) this).anInt4380 = ((Class330) class330_4_).anInt4380;
			((Class330) this).anInt4382 = ((Class330) class330_4_).anInt4382;
			((Class330) this).anInt4388 = ((Class330) class330_4_).anInt4388;
			anInt4385++;
			((Class330) this).anInt4387 = ((Class330) class330_4_).anInt4387;
			((Class330) this).anInt4384 = ((Class330) class330_4_).anInt4384;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kga.B(" + i + ','
					+ (class330_4_ != null ? "{...}" : "null") + ')');
		}
	}

	final Class330 method1999(byte i) {
		try {
			int i_6_ = 91 / ((-29 - i) / 43);
			anInt4389++;
			return new Class330(((Class330) this).anInt4382,
					((Class330) this).anInt4384, ((Class330) this).anInt4379,
					((Class330) this).anInt4380, ((Class330) this).anInt4388,
					((Class330) this).anInt4387);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kga.A(" + i + ')');
		}
	}

	Class330(int i) {
		try {
			((Class330) this).anInt4382 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "kga.<init>(" + i + ')');
		}
	}

	private Class330(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		try {
			((Class330) this).anInt4380 = i_9_;
			((Class330) this).anInt4382 = i;
			((Class330) this).anInt4384 = i_7_;
			((Class330) this).anInt4388 = i_10_;
			((Class330) this).anInt4387 = i_11_;
			((Class330) this).anInt4379 = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kga.<init>(" + i
					+ ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ','
					+ i_11_ + ')'));
		}
	}
}
