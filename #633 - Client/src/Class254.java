/* Class254 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;
import java.util.Random;

class Class254 implements Interface6 {
	int anInt3480;
	int anInt3481;
	static Random aRandom3482;
	Class118 aClass118_3483;
	static int anInt3484;
	static int anInt3485;
	static int anInt3486;
	int anInt3487;
	int anInt3488;
	int anInt3489;
	int anInt3490;
	int anInt3491;
	Class150 aClass150_3492;
	static boolean[] aBoolArray3493 = new boolean[100];
	static BigInteger aBigInteger3494;
	static Class227 aClass227_3495;
	static Class83 aClass83_3496;
	static short aShort3497;
	static Class37 aClass37_3498;

	public Class9 method21(boolean bool) {
		try {
			if (bool != false)
				method1630(84, true, 110, 17, 65, -70, 84);
			anInt3484++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nt.A(" + bool + ')');
		}
	}

	static final void method1629(byte i) {
		do {
			try {
				Class275.anInt3696 = 0;
				Class128.anInt1727 = 0;
				anInt3485++;
				for (int i_0_ = 0; ((i_0_ ^ 0xffffffff) > (Class11_Sub45_Sub10.anInt8958 ^ 0xffffffff)); i_0_++) {
					int i_1_ = Class39.anInt556 * i_0_;
					for (int i_2_ = 0; Class39.anInt556 > i_2_; i_2_++) {
						int i_3_ = i_2_ + i_1_;
						Class286.anInterface10Array3872[i_3_].method34(
								Class11_Sub27.anInt6556 * i_2_, i_0_
										* Class11_Sub24.anInt6238,
								Class11_Sub27.anInt6556,
								Class11_Sub24.anInt6238, 0, 0, true, true);
					}
				}
				if (i > 89)
					break;
				method1629((byte) 72);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nt.H(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1630(int i, boolean bool, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_) {
		do {
			try {
				if (((bool ? ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5720
						.method2462(false)
						: ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702
								.method2462(false)) ^ 0xffffffff) != -1
						&& (i_4_ ^ 0xffffffff) != -1
						&& (Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff) > -51
						&& i != -1)
					Class343.aClass56Array4543[Class376_Sub7_Sub3_Sub1.anInt9863++] = new Class56(
							bool ? (byte) 3 : (byte) 2, i, i_4_, i_8_, i_7_, 0,
							i_5_, null);
				anInt3486++;
				if (i_6_ == 9400)
					break;
				aShort3497 = (short) 119;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nt.G(" + i + ','
						+ bool + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
						+ i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	public static void method1631(byte i) {
		do {
			try {
				aBoolArray3493 = null;
				aBigInteger3494 = null;
				aClass227_3495 = null;
				aClass37_3498 = null;
				aRandom3482 = null;
				aClass83_3496 = null;
				if (i == 36)
					break;
				aRandom3482 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nt.I(" + i + ')');
			}
			break;
		} while (false);
	}

	Class254(Class118 class118, Class150 class150, int i, int i_9_, int i_10_,
			int i_11_, int i_12_, int i_13_, int i_14_) {
		try {
			((Class254) this).anInt3489 = i_10_;
			((Class254) this).anInt3488 = i_14_;
			((Class254) this).anInt3480 = i_13_;
			((Class254) this).anInt3490 = i_11_;
			((Class254) this).aClass118_3483 = class118;
			((Class254) this).anInt3491 = i_9_;
			((Class254) this).anInt3487 = i;
			((Class254) this).aClass150_3492 = class150;
			((Class254) this).anInt3481 = i_12_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nt.<init>("
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	static {
		aRandom3482 = new Random();
		aBigInteger3494 = new BigInteger("65537");
		aClass83_3496 = new Class83(9, 3);
		aShort3497 = (short) 32767;
	}
}
