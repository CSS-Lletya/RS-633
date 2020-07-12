/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class263 {
	int[] anIntArray3595;
	int anInt3596;
	int[] anIntArray3597;
	int anInt3598;

	Class263() {
		Class11_Sub13.method2397(16);
		((Class263) this).anInt3598 = (Class11_Sub13.method2390() != 0 ? Class11_Sub13
				.method2397(4) + 1 : 1);
		if (Class11_Sub13.method2390() != 0)
			Class11_Sub13.method2397(8);
		Class11_Sub13.method2397(2);
		if (((Class263) this).anInt3598 > 1)
			((Class263) this).anInt3596 = Class11_Sub13.method2397(4);
		((Class263) this).anIntArray3597 = new int[((Class263) this).anInt3598];
		((Class263) this).anIntArray3595 = new int[((Class263) this).anInt3598];
		for (int i = 0; i < ((Class263) this).anInt3598; i++) {
			Class11_Sub13.method2397(8);
			((Class263) this).anIntArray3597[i] = Class11_Sub13.method2397(8);
			((Class263) this).anIntArray3595[i] = Class11_Sub13.method2397(8);
		}
	}
}
