/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 implements Interface1 {
	static int anInt1567 = -2;
	static int anInt1568;
	static int anInt1569;
	static Class193[] aClass193Array1570;
	static int anInt1571;
	static int anInt1572;
	static int anInt1573;
	private Class146 aClass146_1574;
	private int anInt1575;
	static int anInt1576;
	private Class124 aClass124_1577 = new Class124(256);
	static int anInt1578;
	private Class146 aClass146_1579;
	private Class188[] aClass188Array1580;
	static OutgoingPacket aClass370_1581 = new OutgoingPacket(10, 16);

	public final int method4(byte i) {
		try {
			anInt1576++;
			if (i > -110)
				aClass146_1579 = null;
			return anInt1575;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dl.C(" + i + ')');
		}
	}

	public static void method761(int i) {
		do {
			try {
				aClass370_1581 = null;
				aClass193Array1570 = null;
				if (i == 3198)
					break;
				method761(16);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dl.G(" + i + ')');
			}
			break;
		} while (false);
	}

	public final int[] method3(int i, int i_0_, boolean bool, float f,
			int i_1_, int i_2_) {
		try {
			anInt1569++;
			if (i_0_ > -89)
				return null;
			return (method762(-6605, i_2_).method3587(i_1_, this, (double) f,
					i, (byte) 68, aClass146_1574,
					((Class188) aClass188Array1580[i_2_]).aBool2427));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("dl.B(" + i + ',' + i_0_ + ',' + bool + ',' + f + ','
							+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	public final boolean method2(int i, int i_3_) {
		try {
			int i_4_ = 94 % ((i_3_ + 33) / 63);
			anInt1568++;
			Class11_Sub45_Sub12 class11_sub45_sub12 = method762(-6605, i);
			if (class11_sub45_sub12 == null
					|| !class11_sub45_sub12.method3589(aClass146_1574, this,
							(byte) 87))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dl.E(" + i + ','
					+ i_3_ + ')');
		}
	}

	public final Class188 method7(byte i, int i_5_) {
		try {
			if (i <= 126)
				method6(false, -90, 61, -70, -0.060712732F, -27);
			anInt1571++;
			return aClass188Array1580[i_5_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dl.F(" + i + ','
					+ i_5_ + ')');
		}
	}

	private final Class11_Sub45_Sub12 method762(int i, int i_6_) {
		try {
			anInt1572++;
			Class11_Sub45 class11_sub45 = aClass124_1577.method813(i + 6619,
					(long) i_6_);
			if (class11_sub45 != null)
				return (Class11_Sub45_Sub12) class11_sub45;
			if (i != -6605)
				return null;
			byte[] is = aClass146_1579.method938(i_6_, i + 6605);
			if (is == null)
				return null;
			Class11_Sub45_Sub12 class11_sub45_sub12 = new Class11_Sub45_Sub12(
					new Stream(is));
			aClass124_1577.method812(class11_sub45_sub12, (byte) 36,
					(long) i_6_);
			return class11_sub45_sub12;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dl.H(" + i + ','
					+ i_6_ + ')');
		}
	}

	public final int[] method6(boolean bool, int i, int i_7_, int i_8_,
			float f, int i_9_) {
		try {
			anInt1573++;
			if (i_7_ != 20377)
				method762(-57, 70);
			return (method762(-6605, i_9_).method3588(
					((Class188) aClass188Array1580[i_9_]).aBool2427,
					aClass146_1574, 255, i_8_, bool, i, (double) f, this));
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception,
							("dl.D(" + bool + ',' + i + ',' + i_7_ + ',' + i_8_
									+ ',' + f + ',' + i_9_ + ')'));
		}
	}

	public final float[] method5(int i, int i_10_, int i_11_, int i_12_,
			float f, boolean bool) {
		try {
			anInt1578++;
			if (i_10_ != -23173)
				anInt1575 = -34;
			return (method762(i_10_ ^ 0x4348, i_12_).method3591(
					((Class188) aClass188Array1580[i_12_]).aBool2427, i, this,
					aClass146_1574, 10028, i_11_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("dl.A(" + i + ',' + i_10_ + ',' + i_11_ + ',' + i_12_
							+ ',' + f + ',' + bool + ')'));
		}
	}

	Class115(Class146 class146, Class146 class146_13_, Class146 class146_14_) {
		try {
			aClass146_1574 = class146_14_;
			aClass146_1579 = class146_13_;
			Stream stream = new Stream(class146.method930(0, (byte) 112, 0));
			anInt1575 = stream.readUnsignedShort((byte) -65);
			aClass188Array1580 = new Class188[anInt1575];
			for (int i = 0; (anInt1575 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if ((stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2)
					aClass188Array1580[i] = new Class188();
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2416 = stream
							.readUnsignedByte((byte) 35) == 0;
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt1575 ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2430 = (stream
							.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
			}
			for (int i = 0; (anInt1575 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2423 = stream
							.readUnsignedByte((byte) 35) == 1;
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt1575 ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2418 = stream
							.readByte(1854307120);
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt1575 ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2414 = stream
							.readByte(1854307120);
			}
			for (int i = 0; (anInt1575 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2426 = stream
							.readByte(1854307120);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2417 = stream
							.readByte(1854307120);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aShort2413 = (short) stream
							.readUnsignedShort((byte) -65);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2429 = stream
							.readByte(1854307120);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2415 = stream
							.readByte(1854307120);
			}
			for (int i = 0; (i ^ 0xffffffff) > (anInt1575 ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2410 = stream
							.readUnsignedByte((byte) 35) == 1;
			}
			for (int i = 0; (anInt1575 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2427 = stream
							.readUnsignedByte((byte) 35) == 1;
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aByte2422 = stream
							.readByte(1854307120);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2420 = (stream
							.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2419 = stream
							.readUnsignedByte((byte) 35) == 1;
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).aBool2412 = stream
							.readUnsignedByte((byte) 35) == 1;
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).anInt2411 = stream
							.readUnsignedByte((byte) 35);
			}
			for (int i = 0; (anInt1575 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).anInt2421 = stream
							.readInt(117);
			}
			for (int i = 0; anInt1575 > i; i++) {
				if (aClass188Array1580[i] != null)
					((Class188) aClass188Array1580[i]).anInt2425 = stream
							.readUnsignedByte((byte) 35);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dl.<init>("
					+ (class146 != null ? "{...}" : "null") + ','
					+ (class146_13_ != null ? "{...}" : "null") + ','
					+ (class146_14_ != null ? "{...}" : "null") + ')'));
		}
	}
}
