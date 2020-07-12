/* Class11_Sub50_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaclib.memory.heap.NativeHeap;

final class Class11_Sub50_Sub2 extends Class11_Sub50 {
	static int anInt9077;
	static OutgoingPacket aClass370_9078 = new OutgoingPacket(3, -1);
	static short[][] aShortArrayArray9079;
	static int anInt9080;
	static int anInt9081;
	static Class369 aClass369_9082;
	NativeHeap aNativeHeap9083;
	static int[] anIntArray9084 = new int[8];
	static boolean aBool9085 = false;

	public static void method3562(byte i) {
		try {
			anIntArray9084 = null;
			aShortArrayArray9079 = null;
			if (i != -86)
				aShortArrayArray9079 = null;
			aClass370_9078 = null;
			aClass369_9082 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hu.D(" + i + ')');
		}
	}

	static final Class163 method3563(int i, Interface1 interface1,
			Canvas canvas, int i_0_) {
		try {
			anInt9077++;
			if (i_0_ != 18785)
				anIntArray9084 = null;
			return new Class163_Sub3(canvas, interface1, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hu.E(" + i + ','
					+ (interface1 != null ? "{...}" : "null") + ','
					+ (canvas != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final void method3564(int i) {
		try {
			((Class11_Sub50_Sub2) this).aNativeHeap9083.method533();
			if (i == 3)
				anInt9080++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hu.F(" + i + ')');
		}
	}

	Class11_Sub50_Sub2(int i) {
		try {
			((Class11_Sub50_Sub2) this).aNativeHeap9083 = new NativeHeap(i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hu.<init>(" + i + ')');
		}
	}
}
