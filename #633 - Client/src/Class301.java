/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class301 {
	static int anInt4054;
	static int anInt4055;
	static int anInt4056;
	static int[] anIntArray4057;
	static int[] anIntArray4058;
	static Class34 aClass34_4059;
	static long aLong4060 = 20000000L;
	static int[] anIntArray4061 = new int[25];
	static int[] anIntArray4062;

	static final void method1855(int i, Packet class11_sub20_sub1) {
		try {
			anInt4055++;
			class11_sub20_sub1.writeInt(i ^ 0xcb2,
					Class321.aClass146_4293.method925(120));
			class11_sub20_sub1.writeInt(-49,
					Class335_Sub3_Sub1.aClass146_9417.method925(127));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub2_Sub15.aClass146_9023.method925(124));
			class11_sub20_sub1.writeInt(i ^ 0xcb2,
					Class282.aClass146_3824.method925(-30));
			class11_sub20_sub1.writeInt(i + 3154,
					Class135.aClass146_1863.method925(i + 3168));
			class11_sub20_sub1.writeInt(-49,
					Class14.aClass146_125.method925(120));
			class11_sub20_sub1.writeInt(-49,
					Class58_Sub2_Sub1.aClass146_9250.method925(120));
			class11_sub20_sub1.writeInt(-49,
					Class265.aClass146_3607.method925(126));
			class11_sub20_sub1.writeInt(-49,
					Class108_Sub7.aClass146_5636.method925(-82));
			class11_sub20_sub1.writeInt(i ^ 0xcb2,
					Class11_Sub45_Sub1_Sub2.aClass146_9886.method925(120));
			class11_sub20_sub1.writeInt(-49,
					Class194.aClass146_2640.method925(i + 3178));
			class11_sub20_sub1.writeInt(i + 3154,
					Class150.aClass146_2002.method925(i ^ ~0xcf4));
			class11_sub20_sub1.writeInt(-49,
					Class335.aClass146_4433.method925(i + 3177));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub18.aClass146_5781.method925(-126));
			class11_sub20_sub1.writeInt(i + 3154,
					Class280.aClass146_3789.method925(-123));
			class11_sub20_sub1.writeInt(i ^ 0xcb2,
					Class11_Sub2_Sub2.aClass146_8461.method925(118));
			class11_sub20_sub1.writeInt(i + 3154,
					Class308.aClass146_4128.method925(122));
			class11_sub20_sub1.writeInt(-49,
					Class108_Sub1.aClass146_5026.method925(i ^ 0xc8f));
			class11_sub20_sub1.writeInt(-49,
					Class131.aClass146_1825.method925(i ^ 0xcf0));
			class11_sub20_sub1.writeInt(-49,
					Class47.aClass146_744.method925(126));
			class11_sub20_sub1.writeInt(-49,
					Class217_Sub1.aClass146_5538.method925(125));
			class11_sub20_sub1.writeInt(-49,
					Class256_Sub1.aClass146_5323.method925(i ^ ~0xcfd));
			class11_sub20_sub1.writeInt(-49,
					Class287.aClass146_3887.method925(i ^ ~0xcff));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub2_Sub30.aClass146_9618.method925(-68));
			class11_sub20_sub1.writeInt(-49,
					Class234_Sub2.aClass146_5987.method925(-89));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub45_Sub11.aClass146_9165.method925(-19));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub45_Sub19.aClass146_9707.method925(125));
			class11_sub20_sub1.writeInt(-49,
					Class2.aClass146_15.method925(i ^ 0xcbc));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub49.aClass146_8012.method925(-105));
			class11_sub20_sub1.writeInt(-49,
					Class216.aClass146_2987.method925(i + 3154));
			class11_sub20_sub1.writeInt(-49,
					Class335_Sub1.aClass146_6443.method925(126));
			class11_sub20_sub1.writeInt(i + 3154,
					Class11_Sub31.aClass146_6703.method925(117));
			class11_sub20_sub1.writeInt(-49, Class108_Sub4.method2363(true));
			if (i != -3203)
				anInt4054 = -8;
			class11_sub20_sub1.writeInt(-49, Class22.method185(true));
			class11_sub20_sub1.writeInt(-49,
					Class11_Sub8.aClass146_5310.method925(119));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("re.A(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class256_Sub3 method1856(Stream stream, byte i) {
		try {
			anInt4056++;
			if (i < 25)
				anIntArray4062 = null;
			return new Class256_Sub3(stream.method2508((byte) 12),
					stream.method2508((byte) 36),
					stream.method2508((byte) -98),
					stream.method2508((byte) 86), stream.method2558(false),
					stream.method2558(false),
					stream.readUnsignedByte((byte) 35));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "re.B("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1857(int i) {
		do {
			try {
				anIntArray4061 = null;
				anIntArray4058 = null;
				aClass34_4059 = null;
				anIntArray4057 = null;
				anIntArray4062 = null;
				if (i > 117)
					break;
				method1855(20, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "re.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		anIntArray4057 = new int[2];
		anIntArray4062 = new int[1];
		anInt4054 = 0;
		aClass34_4059 = new Class34();
	}
}
