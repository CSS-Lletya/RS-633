/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class24 {
	static Interface1 anInterface1_252;
	static int anInt253;
	static int anInt254;

	static final void method207(int i) {
		try {
			anInt253++;
			Class180.aClass65_2333 = new Class65(i);
			Class254_Sub3.anInt8040 = 0;
			for (Class376_Sub10 class376_sub10 = ((Class376_Sub10) IncomingPacket.aClass131_2086
					.method847(-31182)); class376_sub10 != null; class376_sub10 = (Class376_Sub10) IncomingPacket.aClass131_2086
					.method856(96))
				class376_sub10.method3177();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aga.B(" + i + ')');
		}
	}

	public static void method208(byte i) {
		do {
			try {
				anInterface1_252 = null;
				if (i == -121)
					break;
				method207(106);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "aga.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static final Class289[] method209(int i) {
		try {
			anInt254++;
			if (i != 0)
				method209(-8);
			return new Class289[] { Class11_Sub37.aClass289_7089,
					Class11_Sub37.aClass289_7091, Class11_Sub37.aClass289_7092,
					Class11_Sub37.aClass289_7093, Class11_Sub37.aClass289_7094,
					Class11_Sub37.aClass289_7095, Class11_Sub37.aClass289_7096,
					Class11_Sub37.aClass289_7097, Class11_Sub37.aClass289_7098,
					Class11_Sub37.aClass289_7099, Class11_Sub37.aClass289_7100,
					Class11_Sub37.aClass289_7101, Class11_Sub37.aClass289_7102,
					Class11_Sub37.aClass289_7103 };
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aga.A(" + i + ')');
		}
	}
}
