/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

class Class75 {
	Buffer aBuffer1035;
	private Class163_Sub3 aClass163_Sub3_1036;

	final void method524(byte[] is, int i) {
		if (((Class75) this).aBuffer1035 == null
				|| ((Class75) this).aBuffer1035.getSize() < i)
			((Class75) this).aBuffer1035 = ((Class163_Sub3) aClass163_Sub3_1036).aNativeHeap8271
					.method531(i, false);
		((Class75) this).aBuffer1035.method1(is, 0, 0, i);
	}

	Class75(Class163_Sub3 class163_sub3, byte[] is, int i) {
		aClass163_Sub3_1036 = class163_sub3;
		((Class75) this).aBuffer1035 = ((Class163_Sub3) aClass163_Sub3_1036).aNativeHeap8271
				.method531(i, false);
		if (is != null)
			((Class75) this).aBuffer1035.method1(is, 0, 0, i);
	}

	Class75(Class163_Sub3 class163_sub3, Buffer buffer) {
		aClass163_Sub3_1036 = class163_sub3;
		((Class75) this).aBuffer1035 = buffer;
	}
}
