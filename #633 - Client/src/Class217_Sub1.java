/* Class217_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class217_Sub1 extends Class217 {
	static boolean aBool5525 = false;
	static Class79 aClass79_5526;
	private Class309 aClass309_5527;
	private Class242 aClass242_5528;
	static int anInt5529;
	static int anInt5530;
	static int anInt5531;
	static int anInt5532;
	static int anInt5533;
	static int anInt5534;
	private Socket aSocket5535;
	static boolean DEBUG_GLOBAL_PLAYER_UPDATE = false;
	static int anInt5537;
	static Class146 aClass146_5538;
	static int anInt5539;
	static IncomingPacket aClass160_5540;

	final void method1395(int i, byte[] is, int i_0_, int i_1_)
			throws IOException {
		try {
			aClass242_5528.method1531(i, -1, is, i_1_);
			if (i_0_ <= -64)
				anInt5531++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ap.C(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	final void method1398(int i) {
		try {
			try {
				aSocket5535.close();
			} catch (IOException ioexception) {
				/* empty */
			}
			if (i != -2147483648)
				aClass309_5527 = null;
			anInt5537++;
			aClass309_5527.method1888(true);
			aClass242_5528.method1528(19602);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ap.G(" + i + ')');
		}
	}

	final void method1400(byte i) {
		try {
			anInt5534++;
			if (i != 125)
				method2411((byte) 3, null);
			aClass309_5527.method1891((byte) 48);
			aClass242_5528.method1529(i ^ ~0x7d);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ap.E(" + i + ')');
		}
	}

	protected final void finalize() {
		try {
			anInt5533++;
			method1398(-2147483648);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ap.finalize(" + ')');
		}
	}

	final boolean method1399(byte i, int i_2_) throws IOException {
		try {
			anInt5529++;
			if (i != 53)
				aBool5525 = false;
			return aClass309_5527.method1889(i_2_, (byte) 64);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ap.D(" + i + ','
					+ i_2_ + ')');
		}
	}

	final int method1396(int i, byte[] is, int i_3_, int i_4_)
			throws IOException {
		try {
			anInt5539++;
			if (i != -1)
				return -56;
			return aClass309_5527.method1890(i_4_, is, -19518, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ap.B(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final String method2411(byte i,
			Class11_Sub45_Sub14 class11_sub45_sub14) {
		try {
			anInt5530++;
			if (i >= -31)
				aClass146_5538 = null;
			return (((Class11_Sub45_Sub14) class11_sub45_sub14).aString9315 + " <col=ffffff>>");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ap.F(" + i + ','
					+ (class11_sub45_sub14 != null ? "{...}" : "null") + ')'));
		}
	}

	Class217_Sub1(Socket socket, int i) throws IOException {
		try {
			aSocket5535 = socket;
			aSocket5535.setSoTimeout(30000);
			aSocket5535.setTcpNoDelay(true);
			aClass309_5527 = new Class309(aSocket5535.getInputStream(), i);
			aClass242_5528 = new Class242(aSocket5535.getOutputStream(), i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ap.<init>("
					+ (socket != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2412(byte i) {
		try {
			if (i <= -99) {
				aClass160_5540 = null;
				aClass146_5538 = null;
				aClass79_5526 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ap.A(" + i + ')');
		}
	}

	static {
		aClass79_5526 = new Class79(11, 0, 1, 2);
		aClass160_5540 = new IncomingPacket(117, 1);
	}
}
