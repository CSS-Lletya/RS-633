/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class193 {
	String aString2631;
	static int anInt2632;
	static int anInt2633;
	static int anInt2634 = 0;
	static IncomingPacket HIDE_INTERFACE_COMPONENT_IN_PACKET = new IncomingPacket(85, 5);
	int anInt2636;
	static int anInt2637;
	static int anInt2638;

	static final void method1263(int i) {
		do {
			try {
				anInt2638++;
				if (Class94_Sub1.loginStep == 5) {
					Class94_Sub1.loginStep = 6;
					if (i == 0)
						break;
					HIDE_INTERFACE_COMPONENT_IN_PACKET = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jc.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class292 method1264(byte i, int i_0_, Class146 class146,
			int i_1_) {
		try {
			anInt2637++;
			byte[] is = class146.method930(i_0_, (byte) 112, i_1_);
			if (i >= -62)
				HIDE_INTERFACE_COMPONENT_IN_PACKET = null;
			if (is == null)
				return null;
			return new Class292(is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jc.F(" + i + ','
					+ i_0_ + ',' + (class146 != null ? "{...}" : "null") + ','
					+ i_1_ + ')'));
		}
	}

	static final void method1265(int i) {
		Class316.anInt4186 = i;
	}

	static final boolean method1266(String string, int i) {
		try {
			anInt2633++;
			if (i >= -24)
				HIDE_INTERFACE_COMPONENT_IN_PACKET = null;
			return Class19.aHashtable150.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jc.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1267(int i) {
		try {
			if (i > -7)
				method1263(123);
			HIDE_INTERFACE_COMPONENT_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jc.D(" + i + ')');
		}
	}

	static final Class79 method1268(int i, byte i_2_) {
		try {
			int i_3_ = -97 / ((-36 - i_2_) / 37);
			anInt2632++;
			Class79[] class79s = Class180.method1183(false);
			for (int i_4_ = 0; (class79s.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				if (i == ((Class79) class79s[i_4_]).anInt1070)
					return class79s[i_4_];
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jc.C(" + i + ','
					+ i_2_ + ')');
		}
	}
}
