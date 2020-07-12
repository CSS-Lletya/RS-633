/* Class376_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub3 extends Class376 {
	Actor aClass376_Sub7_Sub5_Sub5_6112;
	int anInt6113;
	static IncomingPacket aClass160_6114;
	int anInt6115;
	static int anInt6116 = -1;
	static int anInt6117;
	static int anInt6118;
	int anInt6119;
	static int anInt6120;
	int anInt6121;

	public static void method2611(int i) {
		do {
			try {
				aClass160_6114 = null;
				if (i < -12)
					break;
				anInt6120 = 26;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ff.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method2612(Class286_Sub1 class286_sub1, int i, byte[][] is) {
		try {
			if (i == -1754610264) {
				anInt6118++;
				int i_0_ = Class11_Sub2_Sub23.aByteArrayArray9266.length;
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_1_++) {
					byte[] is_2_ = is[i_1_];
					if (is_2_ != null) {
						int i_3_ = ((Class183.anIntArray2362[i_1_] >> 8) * 64 + -Class194.anInt2641);
						int i_4_ = (64 * (Class183.anIntArray2362[i_1_] & 0xff) + -Class118.anInt1605);
						Class34.method304((byte) 34);
						class286_sub1.method2910(Class321_Sub2.aClass163_6648,
								i_3_, Class235.aClass338Array3217, i_4_, i
										^ ~0x68953a54, is_2_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ff.A("
					+ (class286_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass160_6114 = new IncomingPacket(31, 6);
		anInt6120 = 0;
	}
}
