/* Class11_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class11_Sub12_Sub3 extends Class11_Sub12 {
	private String aString9210;
	static int anInt9211;
	static int anInt9212;
	static int anInt9213;
	static int anInt9214;
	private float aFloat9215;
	static int anInt9216;
	static Class62 aClass62_9217;
	static int anInt9218;
	private int anInt9219;
	private float aFloat9220;
	private String aString9221;
	private int anInt9222;
	static int anInt9223;
	private String aString9224;
	static int[] anIntArray9225 = new int[4];
	static int anInt9226;
	static int anInt9227;

	final float method3598(int i) {
		try {
			if (i > -87)
				aFloat9215 = -0.6465238F;
			anInt9227++;
			return aFloat9220;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kw.I(" + i + ')');
		}
	}

	public static void method3599(boolean bool) {
		try {
			aClass62_9217 = null;
			if (bool != true)
				method3600(115, 74, -101, -95, -10, (byte) -5, -37, -97, 89, -4);
			anIntArray9225 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kw.B(" + bool + ')');
		}
	}

	static final void method3600(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			anInt9226++;
			Class11_Sub15 class11_sub15 = null;
			if (i_4_ <= 121)
				method3600(-66, 49, 12, 126, 121, (byte) -61, 89, -52, -125,
						-102);
			for (Class11_Sub15 class11_sub15_9_ = ((Class11_Sub15) Class198.aClass84_2686
					.method584(-12261)); class11_sub15_9_ != null; class11_sub15_9_ = (Class11_Sub15) Class198.aClass84_2686
					.method578(-15361)) {
				if ((((Class11_Sub15) class11_sub15_9_).anInt5609 ^ 0xffffffff) == (i_5_ ^ 0xffffffff)
						&& i_1_ == ((Class11_Sub15) class11_sub15_9_).anInt5596
						&& ((i_2_ ^ 0xffffffff) == (((Class11_Sub15) class11_sub15_9_).anInt5595 ^ 0xffffffff))
						&& (((Class11_Sub15) class11_sub15_9_).anInt5603 ^ 0xffffffff) == (i_6_ ^ 0xffffffff)) {
					class11_sub15 = class11_sub15_9_;
					break;
				}
			}
			if (class11_sub15 == null) {
				class11_sub15 = new Class11_Sub15();
				((Class11_Sub15) class11_sub15).anInt5595 = i_2_;
				((Class11_Sub15) class11_sub15).anInt5596 = i_1_;
				((Class11_Sub15) class11_sub15).anInt5609 = i_5_;
				((Class11_Sub15) class11_sub15).anInt5603 = i_6_;
				if (i_1_ >= 0
						&& i_2_ >= 0
						&& (i_1_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
						&& Class108_Sub12.anInt6228 > i_2_)
					Class369.method2175(class11_sub15, true);
				Class198.aClass84_2686.method589((byte) -13, class11_sub15);
			}
			((Class11_Sub15) class11_sub15).anInt5600 = i_7_;
			((Class11_Sub15) class11_sub15).anInt5608 = i_8_;
			((Class11_Sub15) class11_sub15).anInt5598 = i_3_;
			((Class11_Sub15) class11_sub15).anInt5606 = i;
			((Class11_Sub15) class11_sub15).anInt5602 = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kw.G(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final String method3601(int i) {
		try {
			anInt9212++;
			if (i != 0)
				return null;
			return aString9224;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kw.F(" + i + ')');
		}
	}

	static final void method3602(byte i, String string, Throwable throwable) {
		do {
			try {
				anInt9211++;
				try {
					String string_10_ = "";
					if (throwable != null)
						string_10_ = Class91_Sub3_Sub1.method3651(-121,
								throwable);
					if (string != null) {
						if (throwable != null)
							string_10_ += " | ";
						string_10_ += (String) string;
					}
					Class141.method895((byte) -103, string_10_);
					string_10_ = Class266.method1683(":", "%3a", 0, string_10_);
					string_10_ = Class266.method1683("@", "%40", 0, string_10_);
					if (i < -39) {
						string_10_ = Class266.method1683("&", "%26", 0,
								string_10_);
						string_10_ = Class266.method1683("#", "%23", 0,
								string_10_);
						if (OutputStream_Sub2.anApplet7948 != null) {
							Class368 class368 = (Class11_Sub45_Sub12.aClass341_9179
									.method2057(
											(new URL(
													OutputStream_Sub2.anApplet7948
															.getCodeBase(),
													("clienterror.ws?c="
															+ Class330.anInt4377
															+ "&u="
															+ (Class126.aString1691 != null ? Class126.aString1691
																	: String.valueOf(Class11_Sub46_Sub3.aLong9552))
															+ "&v1="
															+ Class341.aString4509
															+ "&v2="
															+ Class341.aString4517
															+ "&e=" + string_10_))),
											14));
							while (class368.anInt4837 == 0)
								Class11_Sub51.method3236(1L, 0);
							if (class368.anInt4837 != 1)
								break;
							DataInputStream datainputstream = (DataInputStream) class368.anObject4838;
							datainputstream.read();
							datainputstream.close();
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
	}

	final float method3603(byte i) {
		try {
			if (i != 64)
				aClass62_9217 = null;
			anInt9216++;
			return aFloat9215;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kw.C(" + i + ')');
		}
	}

	final void method2385(int i, OggPacket oggpacket) {
		do {
			try {
				anInt9223++;
				if (i != -19767)
					method2385(49, null);
				if ((((Class11_Sub12) this).anInt5442 ^ 0xffffffff) >= -1
						|| "SUB".equals(aString9221)) {
					Stream stream = new Stream(oggpacket.getData());
					int i_11_ = stream.readUnsignedByte((byte) 35);
					if (((Class11_Sub12) this).anInt5442 > 8) {
						if ((i_11_ ^ 0xffffffff) == -1) {
							long l = stream.method2529(-15100);
							long l_12_ = stream.method2529(-15100);
							long l_13_ = stream.method2529(-15100);
							if (l < 0L || l_12_ < 0L || l_13_ < 0L || l < l_13_)
								throw new IllegalStateException();
							aFloat9220 = ((float) ((long) anInt9222 * l) / (float) anInt9219);
							aFloat9215 = ((float) ((l_12_ + l) * (long) anInt9222) / (float) anInt9219);
							int i_14_ = stream.method2540((byte) 105);
							if ((i_14_ ^ 0xffffffff) > -1
									|| ((((Stream) stream).buffer.length + -((Stream) stream).position) ^ 0xffffffff) > (i_14_ ^ 0xffffffff))
								throw new IllegalStateException();
							aString9224 = Class245.method1546(i_14_,
									(((Stream) stream).position), 240,
									(((Stream) stream).buffer));
						}
						if (((i_11_ | 0x80) ^ 0xffffffff) != -1)
							break;
					} else {
						if ((0x80 | i_11_) == 0)
							throw new IllegalStateException();
						if ((((Class11_Sub12) this).anInt5442 ^ 0xffffffff) != -1)
							break;
						((Stream) stream).position += 23;
						anInt9219 = stream.method2540((byte) 105);
						anInt9222 = stream.method2540((byte) 105);
						if (anInt9219 == 0 || anInt9222 == 0)
							throw new IllegalStateException();
						Stream stream_15_ = new Stream(16);
						stream.readBytes(((Stream) stream_15_).buffer, 4, 16, 0);
						aString9210 = stream_15_.readString(i + 19766);
						((Stream) stream_15_).position = 0;
						stream.readBytes(((Stream) stream_15_).buffer, 4, 16, 0);
						aString9221 = stream_15_.readString(-1);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("kw.H(" + i + ','
						+ (oggpacket != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final void method2387(int i) {
		do {
			try {
				anInt9213++;
				if (i <= -8)
					break;
				aFloat9215 = -1.2969289F;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "kw.E(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub12_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	final String method3604(boolean bool) {
		try {
			anInt9218++;
			if (bool != false)
				method3603((byte) -124);
			return aString9210;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "kw.A(" + bool + ')');
		}
	}

	static {
		aClass62_9217 = Class108_Sub12.method2643(104);
	}
}
