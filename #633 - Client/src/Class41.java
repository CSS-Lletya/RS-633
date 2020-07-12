/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class41 {
	static int anInt589;
	static int anInt590;
	static int anInt591;
	static int anInt592;
	static int anInt593;
	static Object anObject594;
	static Class146 aClass146_595;

	static final void method365(int i, String string, int i_0_) {
		try {
			anInt593++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, i_0_, i);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).aString9366 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jfa.D(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	static final Class237 method366(int i, int i_1_) {
		try {
			if (i != -30727)
				method367(23);
			anInt590++;
			Class237 class237 = new Class237(i_1_, false);
			return class237;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jfa.A(" + i + ','
					+ i_1_ + ')');
		}
	}

	public static void method367(int i) {
		do {
			try {
				aClass146_595 = null;
				anObject594 = null;
				if (i == 2)
					break;
				anObject594 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jfa.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method368(int i) {
		try {
			if (i > 70) {
				anInt591++;
				if (Class268.aClass368_3639 != null) {
					if ((Class268.aClass368_3639.anInt4837 ^ 0xffffffff) == -2)
						Class268.aClass368_3639 = null;
					else if ((Class268.aClass368_3639.anInt4837 ^ 0xffffffff) == -3) {
						Class21.method179(Class11_Sub2_Sub32.aClass341_9653,
								Class237.aString3240, 2, true);
						Class268.aClass368_3639 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jfa.E(" + i + ')');
		}
	}

	static final boolean method369(byte i, int i_2_, int i_3_) {
		try {
			if (i <= 48)
				aClass146_595 = null;
			anInt592++;
			if (!((i_3_ & 0x70000 ^ 0xffffffff) != -1 | Class11_Sub36
					.method2884(33, i_2_, i_3_))
					&& !Class376_Sub1.method2273((byte) 99, i_2_, i_3_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jfa.C(" + i + ','
					+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method370(int i, int i_4_, boolean bool) {
		try {
			anInt589++;
			Class104 class104 = Class109.aClass104ArrayArray1477[i][i_4_];
			if (class104 != null) {
				Class1_Sub1.anInt7118 = ((Class104) class104).anInt1399;
				Class180.anInt2331 = ((Class104) class104).anInt1391;
				Class11_Sub2_Sub19.anInt9095 = ((Class104) class104).anInt1394;
			}
			if (bool == false)
				Class351.method2103(-5100);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jfa.F(" + i + ','
					+ i_4_ + ',' + bool + ')'));
		}
	}
}
