/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IncomingPacket {
	static int anInt2075;
	static int anInt2076;
	static int anInt2077;
	static OutgoingPacket aClass370_2078;
	private int anInt2079;
	static int anInt2080;
	static int anInt2081;
	static Class275[] aClass275Array2082 = new Class275[8];
	int anInt2083;
	static int anInt2084;
	static int anInt2085;
	static Class131 aClass131_2086;
	static float[] aFloatArray2087;

	static final Class11_Sub45_Sub19 method989(boolean bool, int i,
			Class146 class146, int i_0_) {
		try {
			anInt2080++;
			Stream stream = new Stream(class146.method930(i, (byte) 112, i_0_));
			if (bool != false)
				aClass131_2086 = null;
			Class11_Sub45_Sub19 class11_sub45_sub19 = new Class11_Sub45_Sub19(
					i, stream.readString(-1), stream.readString(-1),
					stream.readInt(101), stream.readInt(117),
					(stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2,
					stream.readUnsignedByte((byte) 35),
					stream.readUnsignedByte((byte) 35));
			int i_1_ = stream.readUnsignedByte((byte) 35);
			for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++)
				((Class11_Sub45_Sub19) class11_sub45_sub19).aClass84_9706
						.method589(
								(byte) -13,
								new Class11_Sub32(stream
										.readUnsignedByte((byte) 35), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65), stream
										.readUnsignedShort((byte) -65)));
			class11_sub45_sub19.method3814(0);
			return class11_sub45_sub19;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qfa.D(" + bool + ','
					+ i + ',' + (class146 != null ? "{...}" : "null") + ','
					+ i_0_ + ')'));
		}
	}

	static final void method990(int i, double d) {
		do {
			try {
				anInt2081++;
				if (Class200.aDouble2705 != d) {
					for (int i_3_ = 0; i_3_ < 256; i_3_++) {
						int i_4_ = (int) (Math.pow((double) i_3_ / 255.0, d) * 255.0);
						Class272.anIntArray3675[i_3_] = i_4_ > 255 ? 255 : i_4_;
					}
					Class200.aDouble2705 = d;
				}
				if (i <= -69)
					break;
				method990(-127, 0.15831594617291558);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qfa.A(" + i + ','
						+ d + ')');
			}
			break;
		} while (false);
	}

	public static void method991(int i) {
		try {
			aClass370_2078 = null;
			if (i >= -94)
				method991(1);
			aClass275Array2082 = null;
			aClass131_2086 = null;
			aFloatArray2087 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qfa.C(" + i + ')');
		}
	}

	static final void method992(int i, int i_5_, int i_6_) {
		try {
			anInt2075++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, i, i_6_);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qfa.B(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	final int method993(byte i) {
		try {
			if (i < 121)
				method992(115, 62, -25);
			anInt2076++;
			return anInt2079;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qfa.E(" + i + ')');
		}
	}

	IncomingPacket(int i, int i_7_) {
		try {
			anInt2079 = i;
			((IncomingPacket) this).anInt2083 = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qfa.<init>(" + i + ','
					+ i_7_ + ')');
		}
	}

	public final String toString() {
		try {
			anInt2077++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qfa.toString(" + ')');
		}
	}

	static {
		aClass370_2078 = new OutgoingPacket(17, -1);
		aFloatArray2087 = new float[2];
	}
}
