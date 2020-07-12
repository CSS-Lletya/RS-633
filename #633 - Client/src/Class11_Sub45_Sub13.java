/* Class11_Sub45_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

final class Class11_Sub45_Sub13 extends Class11_Sub45 {
	static int anInt9287;
	static int anInt9288;
	private int[] anIntArray9289;
	static OutgoingPacket aClass370_9290;
	static int anInt9291;
	private String[] aStringArray9292;
	static int anInt9293;
	static int anInt9294;
	static int anInt9295;
	private int[][] anIntArrayArray9296;
	static int anInt9297;
	static int anInt9298;
	int[] anIntArray9299;
	boolean aBool9300 = true;
	Class352 aClass352_9301;
	static int anInt9302;
	static int anInt9303;
	static int anInt9304;
	static int anInt9305 = 0;
	static int anInt9306;
	static Rectangle[] aRectangleArray9307;
	static Canvas aCanvas9308;

	final void method3624(int i, Stream stream) {
		do {
			try {
				for (;;) {
					int i_0_ = stream.readUnsignedByte((byte) 35);
					if (i_0_ == 0)
						break;
					method3633(-75, stream, i_0_);
				}
				anInt9294++;
				if (i <= -36)
					break;
				((Class11_Sub45_Sub13) this).aBool9300 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mn.K(" + i + ','
						+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final Class79 method3625(int i, int i_1_) {
		try {
			if (i != -1)
				aCanvas9308 = null;
			anInt9298++;
			if (anIntArray9289 == null
					|| (i_1_ ^ 0xffffffff) > -1
					|| (i_1_ ^ 0xffffffff) < (anIntArray9289.length ^ 0xffffffff))
				return null;
			return Class193.method1268(anIntArray9289[i_1_], (byte) -107);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mn.H(" + i + ','
					+ i_1_ + ')');
		}
	}

	final String method3626(int i) {
		try {
			anInt9302++;
			StringBuffer stringbuffer = new StringBuffer(80);
			if (aStringArray9292 == null)
				return "";
			stringbuffer.append(aStringArray9292[0]);
			for (int i_2_ = 1; (i_2_ ^ 0xffffffff) > (aStringArray9292.length ^ 0xffffffff); i_2_++) {
				stringbuffer.append("...");
				stringbuffer.append(aStringArray9292[i_2_]);
			}
			if (i != 16584)
				return null;
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mn.E(" + i + ')');
		}
	}

	final int method3627(int i, int i_3_, int i_4_) {
		try {
			if (i != -3)
				method3628(-51, -97, -105, (byte) 105, false, 95, 56,
						-0.37955698F, -32);
			anInt9291++;
			if (anIntArray9289 == null
					|| (i_3_ ^ 0xffffffff) > -1
					|| (anIntArray9289.length ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
				return -1;
			if (anIntArrayArray9296[i_3_] == null || i_4_ < 0
					|| anIntArrayArray9296[i_3_].length < i_4_)
				return -1;
			return anIntArrayArray9296[i_3_][i_4_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mn.D(" + i + ','
					+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	static final int[][] method3628(int i, int i_5_, int i_6_, byte i_7_,
			boolean bool, int i_8_, int i_9_, float f, int i_10_) {
		try {
			anInt9293++;
			int[][] is = new int[i_9_][i_8_];
			Class11_Sub2_Sub39 class11_sub2_sub39 = new Class11_Sub2_Sub39();
			int i_11_ = 90 % ((i_7_ + 21) / 55);
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9798 = i;
			((Class11_Sub2_Sub39) class11_sub2_sub39).aBool9806 = bool;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9800 = i_6_;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9804 = i_10_;
			((Class11_Sub2_Sub39) class11_sub2_sub39).anInt9814 = (int) (4096.0F * f);
			class11_sub2_sub39.method2256(7);
			Class239_Sub2.method3189(-11775, i_8_, i_9_);
			for (int i_12_ = 0; i_9_ > i_12_; i_12_++)
				class11_sub2_sub39.method3857(false, i_12_, is[i_12_]);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mn.C(" + i + ','
					+ i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + i_8_
					+ ',' + i_9_ + ',' + f + ',' + i_10_ + ')'));
		}
	}

	final void method3629(Stream stream, byte i, int[] is) {
		do {
			try {
				anInt9295++;
				if (anIntArray9289 != null) {
					for (int i_13_ = 0; ((anIntArray9289.length ^ 0xffffffff) < (i_13_ ^ 0xffffffff) && is.length > i_13_); i_13_++) {
						int i_14_ = ((Class79) method3625(-1, i_13_)).anInt1071;
						if (i_14_ > 0)
							stream.method2506((long) is[i_13_], false, i_14_);
					}
					if (i == -51)
						break;
					anIntArray9289 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("mn.A("
						+ (stream != null ? "{...}" : "null") + ',' + i + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final String method3630(Stream stream, byte i) {
		try {
			anInt9303++;
			StringBuffer stringbuffer = new StringBuffer(80);
			if (anIntArray9289 != null) {
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (anIntArray9289.length ^ 0xffffffff)); i_15_++) {
					stringbuffer.append(aStringArray9292[i_15_]);
					stringbuffer
							.append(((Class11_Sub45_Sub13) this).aClass352_9301
									.method2110(false, stream.method2517(5225,
											((Class79) (Class193.method1268(
													anIntArray9289[i_15_],
													(byte) 124))).anInt1067),
											method3625(-1, i_15_),
											anIntArrayArray9296[i_15_]));
				}
			}
			stringbuffer.append(aStringArray9292[-1 + aStringArray9292.length]);
			if (i != 78)
				method3635(false);
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mn.F("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method3631(int i) {
		try {
			anInt9306++;
			if (anIntArray9289 == null)
				return 0;
			int i_16_ = 52 / ((i - 86) / 33);
			return anIntArray9289.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mn.G(" + i + ')');
		}
	}

	final void method3632(byte i) {
		do {
			try {
				anInt9287++;
				if (i < -52) {
					if (((Class11_Sub45_Sub13) this).anIntArray9299 == null)
						break;
					for (int i_17_ = 0; ((i_17_ ^ 0xffffffff) > (((Class11_Sub45_Sub13) this).anIntArray9299.length ^ 0xffffffff)); i_17_++)
						((Class11_Sub45_Sub13) this).anIntArray9299[i_17_] = Class173
								.method1134(
										(((Class11_Sub45_Sub13) this).anIntArray9299[i_17_]),
										32768);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "mn.L(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method3633(int i, Stream stream, int i_18_) {
		try {
			if (i > -2)
				((Class11_Sub45_Sub13) this).aClass352_9301 = null;
			anInt9297++;
			if ((i_18_ ^ 0xffffffff) != -2) {
				if ((i_18_ ^ 0xffffffff) != -3) {
					if ((i_18_ ^ 0xffffffff) == -4) {
						int i_19_ = stream.readUnsignedByte((byte) 35);
						anIntArray9289 = new int[i_19_];
						anIntArrayArray9296 = new int[i_19_][];
						for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
							int i_21_ = stream.readUnsignedShort((byte) -65);
							Class79 class79 = Class193.method1268(i_21_,
									(byte) -101);
							if (class79 != null) {
								anIntArray9289[i_20_] = i_21_;
								anIntArrayArray9296[i_20_] = new int[((Class79) class79).anInt1065];
								for (int i_22_ = 0; i_22_ < ((Class79) class79).anInt1065; i_22_++)
									anIntArrayArray9296[i_20_][i_22_] = stream
											.readUnsignedShort((byte) -65);
							}
						}
					} else if ((i_18_ ^ 0xffffffff) == -5)
						((Class11_Sub45_Sub13) this).aBool9300 = false;
				} else {
					int i_23_ = stream.readUnsignedByte((byte) 35);
					((Class11_Sub45_Sub13) this).anIntArray9299 = new int[i_23_];
					for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
						((Class11_Sub45_Sub13) this).anIntArray9299[i_24_] = stream
								.readUnsignedShort((byte) -65);
				}
			} else
				aStringArray9292 = Class121.method788(11027, '<',
						stream.readString(-1));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mn.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_18_ + ')'));
		}
	}

	static final int method3634(int i, Class366 class366) {
		try {
			anInt9304++;
			if (class366 == Class366.aClass366_4804)
				return 5120;
			if (Class366.aClass366_4806 != class366) {
				if (Class366.aClass366_4807 == class366)
					return 5124;
				if (Class366.aClass366_4808 != class366) {
					if (Class366.aClass366_4809 == class366)
						return 5123;
					if (class366 == Class366.aClass366_4810)
						return 5125;
					if (class366 != Class366.aClass366_4811) {
						if (Class366.aClass366_4812 == class366)
							return 5126;
					} else
						return 5131;
				} else
					return 5121;
			} else
				return 5122;
			if (i <= 17)
				aCanvas9308 = null;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mn.M(" + i + ','
					+ (class366 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3635(boolean bool) {
		try {
			aRectangleArray9307 = null;
			if (bool != true)
				method3628(-89, -33, -58, (byte) -88, true, -73, 33,
						1.2520173F, -39);
			aClass370_9290 = null;
			aCanvas9308 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mn.I(" + bool + ')');
		}
	}

	public Class11_Sub45_Sub13() {
		/* empty */
	}

	static final void method3636(int i, int i_25_, byte i_26_, int i_27_,
			int i_28_) {
		try {
			if (i_26_ < 51)
				aRectangleArray9307 = null;
			anInt9288++;
			if ((i ^ 0xffffffff) >= (i_28_ ^ 0xffffffff))
				Class11_Sub2_Sub32_Sub1.method3883(i,
						(Class297.anIntArrayArray4026[i_25_]), (byte) 108,
						i_27_, i_28_);
			else
				Class11_Sub2_Sub32_Sub1.method3883(i_28_,
						(Class297.anIntArrayArray4026[i_25_]), (byte) 59,
						i_27_, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mn.J(" + i + ','
					+ i_25_ + ',' + i_26_ + ',' + i_27_ + ',' + i_28_ + ')'));
		}
	}

	static {
		aClass370_9290 = new OutgoingPacket(45, -1);
		aRectangleArray9307 = new Rectangle[100];
	}
}
