/* Class376_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub8 extends Class376 {
	static int anInt7747;
	int anInt7748;
	static int anInt7749;
	int anInt7750;
	int anInt7751;
	int anInt7752;
	int anInt7753;
	String aString7754;
	int anInt7755;
	static int anInt7756;
	static boolean[] aBoolArray7757 = new boolean[200];

	static final void method3123(byte[] is, float f, int i, byte i_0_,
			int i_1_, int i_2_, Class328 class328, float f_3_, float f_4_,
			int i_5_, int i_6_, float f_7_, float f_8_) {
		do {
			try {
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_9_++) {
					Class108_Sub26.method3149(f, i_5_, f_4_, i_6_, i_9_, f_8_,
							f_3_, is, i, i_1_, i_2_, f_7_, (byte) -119,
							class328);
					i_5_ += i_1_ * i;
				}
				anInt7747++;
				if (i_0_ == -52)
					break;
				method3123(null, -0.43736634F, 60, (byte) -10, -11, -40, null,
						0.25178352F, 0.8199201F, 22, -32, -1.4088161F,
						0.45945552F);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("th.B("
						+ (is != null ? "{...}" : "null") + ',' + f + ',' + i
						+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
						+ (class328 != null ? "{...}" : "null") + ',' + f_3_
						+ ',' + f_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f_7_
						+ ',' + f_8_ + ')'));
			}
			break;
		} while (false);
	}

	public Class376_Sub8() {
		/* empty */
	}

	public static void method3124(int i) {
		try {
			if (i <= -24)
				aBoolArray7757 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "th.A(" + i + ')');
		}
	}

	static {
		anInt7749 = 0;
	}
}
