/* Class11_Sub50_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class Class11_Sub50_Sub1 extends Class11_Sub50 {
	NativeHeap aNativeHeap8842;
	static int anInt8843;
	static int[] anIntArray8844 = new int[6];
	static int anInt8845;

	public static void method3472(int i) {
		try {
			if (i >= -40)
				method3472(-116);
			anIntArray8844 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cs.E(" + i + ')');
		}
	}

	static final void method3473() {
		for (int i = 0; i < Class174.anInt2226; i++) {
			Class376_Sub7_Sub5 class376_sub7_sub5 = Class286.aClass376_Sub7_Sub5Array3869[i];
			Class11_Sub45_Sub19.method3823(class376_sub7_sub5, true);
			Class286.aClass376_Sub7_Sub5Array3869[i] = null;
		}
		Class174.anInt2226 = 0;
	}

	final void method3474(int i) {
		try {
			if (i <= 110)
				method3473();
			anInt8845++;
			((Class11_Sub50_Sub1) this).aNativeHeap8842.method533();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cs.D(" + i + ')');
		}
	}

	Class11_Sub50_Sub1(int i) {
		try {
			((Class11_Sub50_Sub1) this).aNativeHeap8842 = new NativeHeap(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cs.<init>(" + i + ')');
		}
	}
}
