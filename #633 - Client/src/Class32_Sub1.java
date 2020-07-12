/* Class32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class32_Sub1 extends Class32 {
	static int anInt5646;
	static int anInt5647;
	static int anInt5648;

	static final void method2440(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		try {
			Class351.anInt4618 = i_0_;
			Class11_Sub45_Sub1_Sub2.anInt9880 = i;
			Class292.anInt3962 = i_1_;
			if (i_3_ == 37) {
				Class26.anInt340 = i_2_;
				anInt5647++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bp.A(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method2441(int i, byte i_4_) {
		do {
			try {
				if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub2_5710
						.method2266(false) ^ 0xffffffff) == -1)
					i = -1;
				int i_5_ = 106 % ((i_4_ - 50) / 62);
				anInt5648++;
				if ((Class274.anInt3694 ^ 0xffffffff) != (i ^ 0xffffffff)) {
					if (i != -1) {
						Class319 class319 = Class369.aClass96_4847.method650(i,
								true);
						Class80 class80 = class319.method1938(1757380419);
						if (class80 == null)
							i = -1;
						else {
							Class108_Sub21.aClass341_7304.method2055(class80
									.method549(), (byte) 56, class80
									.method552(), new Point(
									((Class319) class319).anInt4241,
									((Class319) class319).anInt4238),
									Class11_Sub45_Sub13.aCanvas9308, class80
											.method550());
							Class274.anInt3694 = i;
						}
					}
					if (i != -1 || (Class274.anInt3694 ^ 0xffffffff) == 0)
						break;
					Class108_Sub21.aClass341_7304.method2055(-1, (byte) 56,
							null, new Point(), Class11_Sub45_Sub13.aCanvas9308,
							-1);
					Class274.anInt3694 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bp.C(" + i + ','
						+ i_4_ + ')');
			}
			break;
		} while (false);
	}

	static final void method2442(byte i) {
		try {
			if (i > -10)
				method2440(-104, -27, 125, -89, (byte) 52);
			anInt5646++;
			Class10.aClass22_82.method189((byte) 96);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bp.B(" + i + ')');
		}
	}
}
