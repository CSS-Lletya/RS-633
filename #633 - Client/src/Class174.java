/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 {
	static int anInt2223;
	static float aFloat2224;
	static int anInt2225;
	static int anInt2226 = 0;

	static final void method1142(int i, int i_0_) {
		try {
			anInt2225++;
			Class11_Sub4.anInt5235 = i_0_;
			synchronized (Class186.aClass22_2379) {
				Class186.aClass22_2379.method189((byte) -126);
				if (i != 15094)
					anInt2226 = 96;
			}
			synchronized (Class376_Sub1_Sub1.aClass22_8685) {
				Class376_Sub1_Sub1.aClass22_8685.method189((byte) 84);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ht.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	public final String toString() {
		try {
			anInt2223++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ht.toString(" + ')');
		}
	}

	public Class174() {
		/* empty */
	}
}
