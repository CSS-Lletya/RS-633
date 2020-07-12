/* Class37_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class37_Sub2 extends Class37 {
	private int anInt7930;
	private static Interface4 anInterface4_7931;

	final int method321() {
		return anInterface4_7931.method15((byte) -60, anInt7930);
	}

	public static void method3192() {
		anInterface4_7931 = null;
	}

	final void method323() {
		anInterface4_7931.method14((byte) 36, anInt7930);
	}

	final void method317(int i) throws Exception {
		if (i > 32768)
			throw new IllegalArgumentException();
		anInterface4_7931.method13(3, i, anInt7930);
	}

	final void method312(Component component) throws Exception {
		anInterface4_7931.method16(component, Class236_Sub1.aBool6092,
				Class119.anInt1610, 0);
	}

	final void method319() {
		anInterface4_7931.method17(anInt7930, (byte) 114);
	}

	Class37_Sub2(Class341 class341, int i) {
		anInterface4_7931 = (Interface4) class341.method2070((byte) 123);
		anInt7930 = i;
	}

	final void method325() {
		anInterface4_7931.method18(anInt7930, ((Class37) this).anIntArray472);
	}
}
