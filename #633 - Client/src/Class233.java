/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class233 {
	int anInt3179;
	static int anInt3180;
	static Class379 aClass379_3181;
	boolean aBool3182;
	int anInt3183 = -1;
	int anInt3184;
	static Class11_Sub6_Sub1 aClass11_Sub6_Sub1_3185;
	static int anInt3186 = 765;
	int anInt3187 = 0;
	int anInt3188 = -1;
	static Class80 aClass80_3189;
	static int anInt3190;
	static int anInt3191;
	int anInt3192;
	int anInt3193;
	int anInt3194;
	boolean aBool3195;
	Class302 aClass302_3196;
	static boolean aBool3197 = false;
	int anInt3198;
	boolean aBool3199;
	static int anInt3200;
	static int anInt3201 = 0;

	public static void method1487(int i) {
		try {
			if (i != -29278)
				aClass80_3189 = null;
			aClass379_3181 = null;
			aClass80_3189 = null;
			aClass11_Sub6_Sub1_3185 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "me.B(" + i + ')');
		}
	}

	final void method1488(byte i) {
		try {
			if (i <= 113)
				method1487(-49);
			((Class233) this).anInt3192 = (((Class233) this).anInt3193 | ((Class233) this).anInt3192 << 8);
			anInt3180++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "me.D(" + i + ')');
		}
	}

	private final void method1489(Stream stream, int i, int i_0_) {
		do {
			try {
				if (i == 1)
					((Class233) this).anInt3187 = Class100.method669(
							stream.method2558(false), (byte) 79);
				else if ((i ^ 0xffffffff) == -3)
					((Class233) this).anInt3188 = stream
							.readUnsignedByte((byte) 35);
				else if ((i ^ 0xffffffff) != -4) {
					if ((i ^ 0xffffffff) == -6)
						((Class233) this).aBool3195 = false;
					else if (i == 7)
						((Class233) this).anInt3183 = Class100.method669(
								stream.method2558(false), (byte) -97);
					else if ((i ^ 0xffffffff) == -9)
						((Class302) ((Class233) this).aClass302_3196).anInt4074 = ((Class233) this).anInt3193;
					else if ((i ^ 0xffffffff) != -10) {
						if ((i ^ 0xffffffff) == -11)
							((Class233) this).aBool3182 = false;
						else if (i != 11) {
							if ((i ^ 0xffffffff) == -13)
								((Class233) this).aBool3199 = true;
							else if (i == 13)
								((Class233) this).anInt3194 = stream
										.method2558(false);
							else if (i != 14) {
								if (i == 16)
									((Class233) this).anInt3198 = stream
											.readUnsignedByte((byte) 35);
							} else
								((Class233) this).anInt3184 = stream
										.readUnsignedByte((byte) 35) << 2;
						} else
							((Class233) this).anInt3192 = stream
									.readUnsignedByte((byte) 35);
					} else
						((Class233) this).anInt3179 = stream
								.readUnsignedShort((byte) -65) << 2;
				} else {
					((Class233) this).anInt3188 = stream
							.readUnsignedShort((byte) -65);
					if ((((Class233) this).anInt3188 ^ 0xffffffff) == -65536)
						((Class233) this).anInt3188 = -1;
				}
				anInt3191++;
				if (i_0_ == -11)
					break;
				method1489(null, -70, 126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("me.E("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ i_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method1490(byte i, String string) {
		try {
			if (i <= 79)
				method1487(-12);
			Class300.method1852(-83, string, "", 0, "", "", 0);
			anInt3200++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("me.C(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1491(Stream stream, int i) {
		do {
			try {
				anInt3190++;
				for (;;) {
					int i_1_ = stream.readUnsignedByte((byte) 35);
					if ((i_1_ ^ 0xffffffff) == -1)
						break;
					method1489(stream, i_1_, -11);
				}
				if (i < -18)
					break;
				((Class233) this).anInt3188 = 96;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("me.A("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	public Class233() {
		((Class233) this).anInt3184 = 64;
		((Class233) this).aBool3182 = true;
		((Class233) this).anInt3192 = 8;
		((Class233) this).anInt3179 = 512;
		((Class233) this).anInt3198 = 127;
		((Class233) this).aBool3195 = true;
		((Class233) this).anInt3194 = 1190717;
		((Class233) this).aBool3199 = false;
	}
}
