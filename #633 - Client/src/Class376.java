/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class376 {
	static int[] anIntArray4907 = new int[3];
	static int anInt4908;
	Class376 aClass376_4909;
	Class376 aClass376_4910;
	static Class84 aClass84_4911 = new Class84();

	static final void method2205() {
		Class206.aClass103_2779 = Class206.aClass103_2780;
	}

	public static void method2206(byte i) {
		do {
			try {
				aClass84_4911 = null;
				anIntArray4907 = null;
				if (i == -13)
					break;
				method2205();
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, "vfa.KB(" + i + ')');
			}
			break;
		} while (false);
	}

	public Class376() {
		/* empty */
	}

	final void method2207(byte i) {
		try {
			anInt4908++;
			if (i >= -101)
				method2205();
			if (((Class376) this).aClass376_4910 != null) {
				((Class376) ((Class376) this).aClass376_4910).aClass376_4909 = ((Class376) this).aClass376_4909;
				((Class376) ((Class376) this).aClass376_4909).aClass376_4910 = ((Class376) this).aClass376_4910;
				((Class376) this).aClass376_4909 = null;
				((Class376) this).aClass376_4910 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vfa.LB(" + i + ')');
		}
	}
}
