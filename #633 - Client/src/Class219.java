/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class219 {
	static int anInt3013;
	static IncomingPacket aClass160_3014 = new IncomingPacket(120, 1);
	static int anInt3015;
	static OutgoingPacket aClass370_3016 = new OutgoingPacket(63, -1);
	static Class33 aClass33_3017;
	static int anInt3018;
	static int anInt3019 = 0;
	static Class213 aClass213_3020 = new Class213(16);

	static final boolean method1404(boolean bool, int i, int i_0_) {
		try {
			if (bool != false)
				method1406((byte) 36);
			anInt3013++;
			return (Class321.method1962((byte) -93, i_0_, i) & Class51
					.method429(118, i_0_, i));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("lb.D(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	static final void method1405(int i, boolean bool) {
		try {
			if (bool) {
				if ((Class365.anInt4797 ^ 0xffffffff) != 0)
					Class11_Sub45_Sub19.method3822(0, Class365.anInt4797);
				for (Class11_Sub24 class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1365(24490)); class11_sub24 != null; class11_sub24 = (Class11_Sub24) Class75_Sub2.aClass213_7160
						.method1367((byte) 71)) {
					if (!class11_sub24.method124(0)) {
						class11_sub24 = ((Class11_Sub24) Class75_Sub2.aClass213_7160
								.method1365(24490));
						if (class11_sub24 == null)
							break;
					}
					NPCDefinitions.method1377(false, true, class11_sub24, -88);
				}
				Class365.anInt4797 = -1;
				Class75_Sub2.aClass213_7160 = new Class213(8);
				InputStream_Sub2.method2817(30695);
				Class365.anInt4797 = Class108_Sub9.anInt6099;
				Class321_Sub3_Sub1.method3614(false, -14543);
				Class307.method1879(-101);
				Class86.parseIComponentScript(Class365.anInt4797);
			}
			anInt3015++;
			if (i > -108)
				aClass370_3016 = null;
			Class11_Sub2_Sub17.aBool9046 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lb.E(" + i + ','
					+ bool + ')');
		}
	}

	public static void method1406(byte i) {
		try {
			if (i != -73)
				method1405(-22, true);
			aClass370_3016 = null;
			aClass160_3014 = null;
			aClass33_3017 = null;
			aClass213_3020 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "lb.F(" + i + ')');
		}
	}

	public Class219() {
		/* empty */
	}
}
