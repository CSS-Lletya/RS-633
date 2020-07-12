/* Class11_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub20_Sub2 extends Stream {
	static float aFloat9496;
	static int anInt9497;
	static int anInt9498;
	static int anInt9499;
	static Class79 aClass79_9500;
	static int[] anIntArray9501 = { 1, 2, 4, 8 };
	static int anInt9502;
	static int[] anIntArray9503;

	final void method3743(int i, float f) {
		try {
			anInt9498++;
			int i_0_ = jaclib.memory.Stream.floatToRawIntBits(f);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_0_;
			if (i != -1526311408)
				method3746(124);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_0_ >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_0_ >> 16);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_0_ >> 24);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rn.A(" + i + ',' + f
					+ ')');
		}
	}

	final void method3744(float f, int i) {
		try {
			if (i != -32197)
				method3744(0.7704895F, 69);
			anInt9502++;
			int i_1_ = jaclib.memory.Stream.floatToRawIntBits(f);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_1_ >> 24);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_1_ >> 16);
			((Stream) this).buffer[((Stream) this).position++] = (byte) (i_1_ >> 8);
			((Stream) this).buffer[((Stream) this).position++] = (byte) i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rn.D(" + f + ',' + i
					+ ')');
		}
	}

	static final int method3745(float f, float f_2_, float f_3_, byte i) {
		try {
			if (i < 51)
				anIntArray9503 = null;
			anInt9497++;
			float f_4_ = !(f_2_ < 0.0F) ? f_2_ : -f_2_;
			float f_5_ = !(f < 0.0F) ? f : -f;
			float f_6_ = f_3_ < 0.0F ? -f_3_ : f_3_;
			if (f_4_ < f_5_ && f_5_ > f_6_) {
				if (f > 0.0F)
					return 0;
				return 1;
			}
			if (!(f_6_ > f_4_) || !(f_6_ > f_5_)) {
				if (!(f_2_ > 0.0F))
					return 5;
				return 4;
			}
			if (f_3_ > 0.0F)
				return 2;
			return 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rn.C(" + f + ','
					+ f_2_ + ',' + f_3_ + ',' + i + ')'));
		}
	}

	Class11_Sub20_Sub2(int i) {
		super(i);
	}

	public static void method3746(int i) {
		do {
			try {
				anIntArray9501 = null;
				anIntArray9503 = null;
				aClass79_9500 = null;
				if (i == 1)
					break;
				aClass79_9500 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rn.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass79_9500 = new Class79(13, 0, 1, 0);
		anIntArray9503 = new int[2];
	}
}
