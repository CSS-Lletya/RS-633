/* Class11_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub14_Sub1 extends Class11_Sub14 {
	int anInt9356;
	int anInt9357;
	byte[] aByteArray9358;
	boolean aBool9359;
	int anInt9360;

	final Class11_Sub14_Sub1 method3654(Class165 class165) {
		((Class11_Sub14_Sub1) this).aByteArray9358 = class165.method1095(true,
				((Class11_Sub14_Sub1) this).aByteArray9358);
		((Class11_Sub14_Sub1) this).anInt9360 = class165.method1097(
				((Class11_Sub14_Sub1) this).anInt9360, 14);
		if (((Class11_Sub14_Sub1) this).anInt9357 == ((Class11_Sub14_Sub1) this).anInt9356)
			((Class11_Sub14_Sub1) this).anInt9357 = ((Class11_Sub14_Sub1) this).anInt9356 = class165
					.method1099(10, ((Class11_Sub14_Sub1) this).anInt9357);
		else {
			((Class11_Sub14_Sub1) this).anInt9357 = class165.method1099(10,
					((Class11_Sub14_Sub1) this).anInt9357);
			((Class11_Sub14_Sub1) this).anInt9356 = class165.method1099(10,
					((Class11_Sub14_Sub1) this).anInt9356);
			if (((Class11_Sub14_Sub1) this).anInt9357 == ((Class11_Sub14_Sub1) this).anInt9356)
				((Class11_Sub14_Sub1) this).anInt9357--;
		}
		return this;
	}

	Class11_Sub14_Sub1(int i, byte[] is, int i_0_, int i_1_) {
		((Class11_Sub14_Sub1) this).anInt9360 = i;
		((Class11_Sub14_Sub1) this).aByteArray9358 = is;
		((Class11_Sub14_Sub1) this).anInt9357 = i_0_;
		((Class11_Sub14_Sub1) this).anInt9356 = i_1_;
	}

	Class11_Sub14_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
		((Class11_Sub14_Sub1) this).anInt9360 = i;
		((Class11_Sub14_Sub1) this).aByteArray9358 = is;
		((Class11_Sub14_Sub1) this).anInt9357 = i_2_;
		((Class11_Sub14_Sub1) this).anInt9356 = i_3_;
		((Class11_Sub14_Sub1) this).aBool9359 = bool;
	}
}
