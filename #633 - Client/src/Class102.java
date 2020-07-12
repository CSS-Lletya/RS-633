/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class102 {
	static int anInt1359;
	int anInt1360;
	static int anInt1361;
	static int anInt1362;
	static byte[] aByteArray1363 = new byte[32896];
	static Class118 aClass118_1364;
	static int anInt1365;
	int anInt1366;
	int anInt1367;

	static final void method677(Class163 class163, int i) {
		try {
			if (Class254_Sub3.aBool8049)
				Class159.method986(i - 31202, class163);
			else
				Class329.method1995((byte) 112, class163);
			if (i != -2)
				method679(41, 67, false);
			anInt1359++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cm.C("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method678(int i, byte i_0_, Stream stream) {
		do {
			try {
				anInt1362++;
				if ((i ^ 0xffffffff) == -2) {
					((Class102) this).anInt1366 = stream
							.readUnsignedShort((byte) -65);
					((Class102) this).anInt1360 = stream
							.readUnsignedByte((byte) 35);
					((Class102) this).anInt1367 = stream
							.readUnsignedByte((byte) 35);
				}
				if (i_0_ >= 61)
					break;
				method677(null, -9);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("cm.A(" + i + ',' + i_0_ + ','
								+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method679(int i, int i_1_, boolean bool) {
		try {
			if (bool != false)
				method681(-58);
			anInt1361++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 14, i);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cm.B(" + i + ','
					+ i_1_ + ',' + bool + ')'));
		}
	}

	final void method680(Stream stream, int i) {
		try {
			if (i != 22071)
				aByteArray1363 = null;
			for (;;) {
				int i_2_ = stream.readUnsignedByte((byte) 35);
				if ((i_2_ ^ 0xffffffff) == -1)
					break;
				method678(i_2_, (byte) 112, stream);
			}
			anInt1365++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cm.E("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method681(int i) {
		try {
			aClass118_1364 = null;
			int i_3_ = 77 / ((-62 - i) / 50);
			aByteArray1363 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cm.D(" + i + ')');
		}
	}

	public Class102() {
		/* empty */
	}

	static {
		int i = 0;
		for (int i_4_ = 0; i_4_ < 256; i_4_++) {
			for (int i_5_ = 0; (i_4_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff); i_5_++)
				aByteArray1363[i++] = (byte) (int) (255.0 / (Math
						.sqrt((double) ((float) (i_4_ * i_4_ + (i_5_ * i_5_ - -65535)) / 65535.0F))));
		}
		aClass118_1364 = new Class118();
	}
}
