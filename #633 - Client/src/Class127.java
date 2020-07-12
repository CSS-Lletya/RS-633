/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127 {
	private Class22 aClass22_1713 = new Class22(64);
	static int anInt1714;
	static int anInt1715;
	static int anInt1716;
	static int anInt1717;
	private Class146 aClass146_1718;
	static IncomingPacket aClass160_1719 = new IncomingPacket(90, -1);
	static int anInt1720 = -1;
	static int anInt1721;
	static Class189 aClass189_1722 = new Class189();

	final Class39 method829(int i, int i_0_) {
		try {
			anInt1715++;
			Class39 class39;
			synchronized (aClass22_1713) {
				class39 = (Class39) aClass22_1713.method188((long) i,
						(byte) -76);
			}
			if (class39 != null)
				return class39;
			if (i_0_ != 64)
				aClass146_1718 = null;
			byte[] is;
			synchronized (aClass146_1718) {
				is = aClass146_1718.method930(i, (byte) 112, 32);
			}
			class39 = new Class39();
			if (is != null)
				class39.method340(new Stream(is), -97);
			synchronized (aClass22_1713) {
				aClass22_1713.method184((byte) 125, class39, (long) i);
			}
			return class39;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eb.D(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method830(int i) {
		try {
			synchronized (aClass22_1713) {
				aClass22_1713.method189((byte) -126);
				if (i >= -88)
					anInt1721 = -88;
			}
			anInt1717++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eb.E(" + i + ')');
		}
	}

	final void method831(int i) {
		try {
			if (i != 32)
				method832(false);
			synchronized (aClass22_1713) {
				aClass22_1713.method190(0);
			}
			anInt1714++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eb.B(" + i + ')');
		}
	}

	public static void method832(boolean bool) {
		try {
			aClass189_1722 = null;
			if (bool != true)
				method832(false);
			aClass160_1719 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eb.C(" + bool + ')');
		}
	}

	final void method833(int i, byte i_1_) {
		try {
			synchronized (aClass22_1713) {
				aClass22_1713.method182(i, (byte) -73);
				int i_2_ = -37 % ((i_1_ - 43) / 61);
			}
			anInt1716++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eb.A(" + i + ','
					+ i_1_ + ')');
		}
	}

	Class127(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_1718 = class146;
			aClass146_1718.method914(32, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eb.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
