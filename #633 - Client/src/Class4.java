/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class4 implements Interface16 {
	static Class243 aClass243_24;
	static int anInt25;
	static boolean aBool26 = false;
	static boolean aBool27 = false;
	static int anInt28;
	private String aString29;
	private Class146 aClass146_30;
	static int anInt31;
	static int[] anIntArray32;
	static int anInt33 = 0;

	public final Class117 method47(int i) {
		try {
			int i_0_ = -51 % ((i + 19) / 60);
			anInt31++;
			return Class117.aClass117_1591;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tfa.B(" + i + ')');
		}
	}

	static final void method82(int i) {
		try {
			anInt28++;
			Class205.aClass302_2761.method1864(5, 587437728);
			Class58_Sub2_Sub2.aClass353_9819.method2117((byte) -106, 5);
			Class2.aClass221_18.method1415((byte) 48, 5);
			Class11_Sub4.aClass290_5237.method1787(5, 8);
			Class11_Sub19.aClass318_5817.method1929((byte) -78, 5);
			Packet.aClass223_8723.method1422(5, (byte) 39);
			Class108_Sub23.aClass198_7760.method1281((byte) -117, 5);
			Class254.aClass227_3495.method1461(126, 5);
			int i_1_ = -112 / (i / 63);
			Class11_Sub50_Sub2.aClass369_9082.method2176(5, (byte) 17);
			Class91_Sub1.aClass171_6937.method1120((byte) -31, 5);
			Class108_Sub26.aClass127_7833.method833(5, (byte) -83);
			Class168.aClass280_2160.method1731((byte) -103, 5);
			Class47.aClass29_741.method250(5, (byte) -79);
			Class187.aClass52_2388.method436(5, (byte) 62);
			Class11_Sub12_Sub4.aClass273_9466.method1701(2341, 5);
			Class233.aClass379_3181.method2223(5, -128);
			Class179.aClass154_2279.method965(true, 5);
			Class299.aClass85_4031.method593(5, 0);
			Class369.aClass96_4847.method645(5, (byte) 88);
			Class11_Sub35_Sub1.aClass285_9126.method1763(-110, 5);
			Class11_Sub49.method3221(true, 5);
			Class186.method1210(50, false);
			Class58_Sub2.method3154(4096, 50);
			Class335_Sub3_Sub1.method3713(5, 15700);
			Class290.method1789((byte) -121, 5);
			Class11_Sub45_Sub1.aClass22_8487.method182(5, (byte) -73);
			Class355.aClass22_4657.method182(5, (byte) -73);
			Class163_Sub2_Sub1.aClass22_8565.method182(5, (byte) -73);
			Class19_Sub1.aClass22_5758.method182(5, (byte) -73);
			Class86.aClass22_1198.method182(5, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tfa.C(" + i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt25++;
			if (aClass146_30.method934(aString29, (byte) 120))
				return 100;
			if (i != 6340)
				aString29 = null;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tfa.A(" + i + ')');
		}
	}

	Class4(Class146 class146, String string) {
		try {
			aString29 = string;
			aClass146_30 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tfa.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method83(int i) {
		do {
			try {
				anIntArray32 = null;
				aClass243_24 = null;
				if (i > 26)
					break;
				aBool27 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tfa.D(" + i + ')');
			}
			break;
		} while (false);
	}
}
