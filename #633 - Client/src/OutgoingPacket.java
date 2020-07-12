import tool.DumpPacketSizes;

/* Class370 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class OutgoingPacket {
	static int anInt4854;
	private int anInt4855;
	static int anInt4856;
	static int anInt4857;
	static int anInt4858 = 0;
	static int anInt4859;
	static int anInt4860;
	int anInt4861;
	static int anInt4862;

	static final boolean method2184(int i, int i_0_, int i_1_) {
		try {
			if (i_1_ != 1485)
				return false;
			anInt4860++;
			if ((i & 0x800) == 0 || (0x37 & i_0_ ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gda.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final String toString() {
		try {
			anInt4856++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gda.toString(" + ')');
		}
	}

	static final int method2185(boolean bool, Class314 class314) {
		try {
			anInt4862++;
			if (bool != false)
				anInt4858 = 57;
			if (Class121.aClass314_1643 == class314)
				return 7681;
			if (class314 != Class188.aClass314_2424) {
				if (class314 == Class11_Sub2_Sub19.aClass314_9092)
					return 34165;
				if (class314 == Class380.aClass314_4960)
					return 260;
				if (Class11_Sub35_Sub1.aClass314_9109 == class314)
					return 34023;
			} else
				return 8448;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gda.A(" + bool + ','
					+ (class314 != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2186(int i) {
		try {
			anInt4854++;
			if (i != -20537)
				return 72;
			return anInt4855;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gda.C(" + i + ')');
		}
	}

	OutgoingPacket(int i, int length) {
		try {
			anInt4855 = i;
			
			((OutgoingPacket) this).anInt4861 = length;
			System.out.println("Packet: " + i + " Length: " + length);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gda.<init>(" + i + ','
					+ length + ')');
		}

	}

	static {
		anInt4857 = 0;
	}
}
