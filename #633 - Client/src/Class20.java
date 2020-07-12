/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class20 {
	static int anInt153;
	private String aString154 = "null";
	static int anInt155;
	static int anInt156;
	static int anInt157;
	static int anInt158;
	static int anInt159 = 0;
	static int anInt160;
	static int anInt161;
	private int anInt162;
	private Class213 aClass213_163;
	Class213 aClass213_164;
	static int anInt165;
	char aChar166;
	static int anInt167;
	static float aFloat168;
	static int anInt169;
	char aChar170;
	static int anInt171;

	final boolean method167(int i, byte i_0_) {
		try {
			int i_1_ = 2 % ((i_0_ - 61) / 33);
			anInt171++;
			if (((Class20) this).aClass213_164 == null)
				return false;
			if (aClass213_163 == null)
				method177(-21411);
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) aClass213_163
					.method1369((byte) 26, (long) i));
			if (class11_sub51 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method168(Stream stream, int i) {
		try {
			for (;;) {
				int i_2_ = stream.readUnsignedByte((byte) 35);
				if ((i_2_ ^ 0xffffffff) == -1)
					break;
				method174(false, i_2_, stream);
			}
			if (i == -1)
				anInt156++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.G("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final int method169(int i, byte i_3_) {
		try {
			anInt165++;
			if (i_3_ != 11)
				method170(-16, null);
			return 0xff & i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	static final boolean method170(int i, byte[] is) {
		try {
			anInt153++;
			Stream stream = new Stream(is);
			if (i >= -53)
				anInt159 = -84;
			int i_4_ = stream.readUnsignedByte((byte) 35);
			if (i_4_ != 2)
				return false;
			boolean bool = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
			if (bool)
				Class109.method731(stream, (byte) -108);
			Class11_Sub45_Sub21.method3843(32768, stream);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pba.F(" + i + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method171(int i) {
		try {
			anInt158++;
			aClass213_163 = new Class213(
					((Class20) this).aClass213_164.method1372(0));
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) ((Class20) this).aClass213_164
					.method1365(24490));
			int i_5_ = -124 % ((i - 15) / 49);
			for (/**/; class11_sub3 != null; class11_sub3 = (Class11_Sub3) ((Class20) this).aClass213_164
					.method1367((byte) 71)) {
				Class11_Sub49 class11_sub49 = new Class11_Sub49(
						(((Class11_Sub3) class11_sub3).aString5110),
						(int) (((Class11) class11_sub3).aLong91));
				aClass213_163.method1368(Class374.method2200(0,
						(((Class11_Sub3) class11_sub3).aString5110)),
						class11_sub49, (byte) -26);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.C(" + i + ')');
		}
	}

	final String method172(int i, int i_6_) {
		try {
			anInt169++;
			if (((Class20) this).aClass213_164 == null)
				return aString154;
			Class11_Sub3 class11_sub3 = ((Class11_Sub3) ((Class20) this).aClass213_164
					.method1369((byte) 26, (long) i_6_));
			if (class11_sub3 == null)
				return aString154;
			if (i != -27058)
				method173(null, -7);
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.J(" + i + ','
					+ i_6_ + ')');
		}
	}

	final boolean method173(String string, int i) {
		try {
			int i_7_ = -121 % ((-19 - i) / 54);
			anInt167++;
			if (((Class20) this).aClass213_164 == null)
				return false;
			if (aClass213_163 == null)
				method171(70);
			for (Class11_Sub49 class11_sub49 = ((Class11_Sub49) aClass213_163
					.method1369((byte) 26, Class374.method2200(0, string))); class11_sub49 != null; class11_sub49 = (Class11_Sub49) aClass213_163
					.method1363(0)) {
				if (((Class11_Sub49) class11_sub49).aString8016.equals(string))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.D("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method174(boolean bool, int i, Stream stream) {
		try {
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2)
					((Class20) this).aChar166 = Class64.method486(
							stream.readByte(1854307120), 0);
				else if ((i ^ 0xffffffff) != -4) {
					if (i != 4) {
						if ((i ^ 0xffffffff) == -6 || i == 6) {
							int i_8_ = stream.readUnsignedShort((byte) -65);
							((Class20) this).aClass213_164 = new Class213(
									Class11_Sub2_Sub33.method3808(122, i_8_));
							for (int i_9_ = 0; (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
								int i_10_ = stream.readInt(94);
								Class11 class11;
								if (i != 5)
									class11 = (new Class11_Sub51(
											stream.readInt(100)));
								else
									class11 = (new Class11_Sub3(
											stream.readString(-1)));
								((Class20) this).aClass213_164.method1368(
										(long) i_10_, class11, (byte) -26);
							}
						}
					} else
						anInt162 = stream.readInt(104);
				} else
					aString154 = stream.readString(-1);
			} else
				((Class20) this).aChar170 = Class64.method486(
						stream.readByte(1854307120), 0);
			if (bool != false)
				aString154 = null;
			anInt161++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pba.E(" + bool + ','
					+ i + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method175(int i, int i_11_) {
		try {
			anInt155++;
			if (((Class20) this).aClass213_164 == null)
				return anInt162;
			int i_12_ = -11 / ((i + 18) / 44);
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) ((Class20) this).aClass213_164
					.method1369((byte) 26, (long) i_11_));
			if (class11_sub51 == null)
				return anInt162;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pba.I(" + i + ','
					+ i_11_ + ')');
		}
	}

	static final void method176(byte i, Class376_Sub3 class376_sub3) {
		do {
			try {
				anInt157++;
				((Class376_Sub3) class376_sub3).aClass376_Sub7_Sub5_Sub5_6112 = null;
				if (i != -98)
					aFloat168 = 0.35850775F;
				if (Class11_Sub45_Sub11.anInt9159 >= 20)
					break;
				Class11_Sub45_Sub20_Sub1.aClass131_9959.method853(0,
						class376_sub3);
				Class11_Sub45_Sub11.anInt9159++;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pba.H(" + i + ','
						+ (class376_sub3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class20() {
		/* empty */
	}

	private final void method177(int i) {
		do {
			try {
				anInt160++;
				aClass213_163 = new Class213(
						((Class20) this).aClass213_164.method1372(0));
				for (Class11_Sub51 class11_sub51 = (Class11_Sub51) ((Class20) this).aClass213_164
						.method1365(i + 45901); class11_sub51 != null; class11_sub51 = (Class11_Sub51) ((Class20) this).aClass213_164
						.method1367((byte) 71)) {
					Class11_Sub51 class11_sub51_13_ = new Class11_Sub51(
							(int) ((Class11) class11_sub51).aLong91);
					aClass213_163.method1368(
							(long) ((Class11_Sub51) class11_sub51).anInt8036,
							class11_sub51_13_, (byte) -26);
				}
				if (i == -21411)
					break;
				anInt159 = -72;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pba.K(" + i + ')');
			}
			break;
		} while (false);
	}
}
