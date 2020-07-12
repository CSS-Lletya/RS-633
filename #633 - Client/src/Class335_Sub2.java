/* Class335_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

final class Class335_Sub2 extends Class335 {
	static int anInt6954;
	static int anInt6955;
	static int anInt6956;
	private Class253 aClass253_6957;
	static int anInt6958;
	static int anInt6959;
	static int anInt6960;

	public final boolean method24(int i) {
		try {
			anInt6955++;
			if (i != -32252)
				aClass253_6957 = null;
			if (!super.method24(i))
				return false;
			return (((Class335) this).aClass146_4427
					.method918(
							((Class254_Sub1) (Class254_Sub1) ((Class335) this).aClass254_4434).anInt5521,
							115));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ob.G(" + i + ')');
		}
	}

	Class335_Sub2(Class146 class146, Class146 class146_0_,
			Class254_Sub1 class254_sub1) {
		super(class146, class146_0_, (Class254) class254_sub1);
	}

	public final void method39(int i) {
		try {
			anInt6958++;
			super.method39(i);
			aClass253_6957 = Class228
					.method1473(
							-20770,
							((Class335) this).aClass146_4427,
							(((Class254_Sub1) (Class254_Sub1) ((Class335) this).aClass254_4434).anInt5521));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ob.B(" + i + ')');
		}
	}

	final void method2014(int i, int i_1_, boolean bool, byte i_2_) {
		try {
			anInt6960++;
			if (i_2_ <= -88) {
				int i_3_ = (this.method2016(2)
						* (((Class254) ((Class335) this).aClass254_4434).anInt3489) / 10000);
				int[] is = new int[4];
				Class321_Sub2.aClass163_6648.K(is);
				Class321_Sub2.aClass163_6648
						.KA(i_1_,
								2 + i,
								i_3_ + i_1_,
								i
										+ (((Class254) (((Class335) this).aClass254_4434)).anInt3490));
				aClass253_6957
						.method1618(
								i_1_,
								2 + i,
								((Class254) ((Class335) this).aClass254_4434).anInt3489,
								((Class254) ((Class335) this).aClass254_4434).anInt3490);
				Class321_Sub2.aClass163_6648.KA(is[0], is[1], is[2], is[3]);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ob.A(" + i + ','
					+ i_1_ + ',' + bool + ',' + i_2_ + ')'));
		}
	}

	static final void method2821(boolean bool, int i, long l, byte i_4_,
			int i_5_, int i_6_, Class146 class146) {
		try {
			anInt6956++;
			Class66.method494(0, i_5_, i, i_6_, true, l, class146, bool);
			if (i_4_ >= -15)
				return;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ob.E(" + bool + ','
					+ i + ',' + l + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2822(int i) {
		try {
			anInt6954++;
			if (i >= 94) {
				Class11_Sub2_Sub19.aClass1_9098.method62((byte) 97);
				Class280.aClass225_3786.method1441(-1);
				Class11_Sub2_Sub23.aclient9263.method4000(-15671);
				Class11_Sub45_Sub13.aCanvas9308.setBackground(Color.black);
				Class274.anInt3694 = -1;
				Class11_Sub2_Sub19.aClass1_9098 = Class292.method1807(
						Class11_Sub45_Sub13.aCanvas9308, 13764);
				Class280.aClass225_3786 = Class327.method1982(-2451, true,
						Class11_Sub45_Sub13.aCanvas9308);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ob.D(" + i + ')');
		}
	}

	final void method2013(boolean bool, int i, byte i_7_, int i_8_) {
		do {
			try {
				anInt6959++;
				Class321_Sub2.aClass163_6648
						.method1051(
								i - 2,
								i_8_,
								(((Class254) ((Class335) this).aClass254_4434).anInt3489 + 4),
								(((Class254) ((Class335) this).aClass254_4434).anInt3490 + 2),
								((Class254_Sub1) (Class254_Sub1) ((Class335) this).aClass254_4434).anInt5524,
								0);
				Class321_Sub2.aClass163_6648
						.method1051(
								-1 + i,
								1 + i_8_,
								2 + (((Class254) ((Class335) this).aClass254_4434).anInt3489),
								((Class254) ((Class335) this).aClass254_4434).anInt3490,
								0, 0);
				if (i_7_ == -104)
					break;
				aClass253_6957 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ob.C(" + bool
						+ ',' + i + ',' + i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}
}
