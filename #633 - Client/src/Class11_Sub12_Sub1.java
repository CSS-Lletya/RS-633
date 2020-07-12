/* Class11_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class11_Sub12_Sub1 extends Class11_Sub12 {
	static int anInt8822;
	static IncomingPacket aClass160_8823;
	static int anInt8824;
	static long aLong8825 = 0L;
	static int anInt8826;
	static int anInt8827;
	static int anInt8828 = -1;

	final void method2385(int i, OggPacket oggpacket) {
		do {
			try {
				anInt8826++;
				if (i == -19767)
					break;
				anInt8828 = 37;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("co.H(" + i + ','
						+ (oggpacket != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method3466(int i, int i_0_, int i_1_) {
		try {
			anInt8824++;
			if (Class11_Sub16.method2449(126, i_1_)) {
				if (i_0_ > -69)
					method3467(47);
				Class203.method1291((byte) -70, i,
						(Class11_Sub45_Sub5.aClass192ArrayArray8772[i_1_]));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("co.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class11_Sub12_Sub1(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	final void method2387(int i) {
		try {
			if (i <= -8)
				anInt8822++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "co.E(" + i + ')');
		}
	}

	public static void method3467(int i) {
		do {
			try {
				aClass160_8823 = null;
				if (i == -1)
					break;
				method3467(-38);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "co.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		aClass160_8823 = new IncomingPacket(36, 2);
	}
}
