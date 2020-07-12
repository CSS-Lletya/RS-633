/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;

final class Class355 {
	static int anInt4653;
	static int anInt4654;
	static OutgoingPacket MINIMAP_WALKING_OUT_PACKET = new OutgoingPacket(43,
			18);
	static int anInt4656;
	static Class22 aClass22_4657 = new Class22(4);
	static Frame aFrame4658;

	static final void method2123(int i, Canvas canvas) {
		try {
			anInt4653++;
			Dimension dimension = canvas.getSize();
			if (i > -126)
				aClass22_4657 = null;
			Class138.method880(dimension.height, 0, dimension.width);
			if (OutputStream_Sub1.anInt5845 == 1)
				Class243.aClass163_3308.method1013(canvas,
						Class11_Sub39.anInt7215, Class11_Sub33.anInt6897);
			else
				Class243.aClass163_3308.method1013(canvas,
						(Class11_Sub2_Sub16.anInt9038),
						(Class376_Sub7_Sub3_Sub2.anInt10143));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wd.A(" + i + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2124(byte i) {
		try {
			aFrame4658 = null;
			MINIMAP_WALKING_OUT_PACKET = null;
			int i_0_ = 38 % ((i - 60) / 57);
			aClass22_4657 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wd.C(" + i + ')');
		}
	}

	static final byte method2125(char c, int i) {
		try {
			if (i != -8910)
				method2123(-40, null);
			anInt4656++;
			byte i_1_;
			if (((c ^ 0xffffffff) >= -1 || (c ^ 0xffffffff) <= -129)
					&& (c < 160 || c > 255)) {
				if ((c ^ 0xffffffff) == -8365)
					i_1_ = (byte) -128;
				else if ((c ^ 0xffffffff) != -8219) {
					if ((c ^ 0xffffffff) != -403) {
						if ((c ^ 0xffffffff) == -8223)
							i_1_ = (byte) -124;
						else if ((c ^ 0xffffffff) == -8231)
							i_1_ = (byte) -123;
						else if (c != 8224) {
							if (c == 8225)
								i_1_ = (byte) -121;
							else if (c == 710)
								i_1_ = (byte) -120;
							else if ((c ^ 0xffffffff) != -8241) {
								if (c == 352)
									i_1_ = (byte) -118;
								else if ((c ^ 0xffffffff) != -8250) {
									if (c != 338) {
										if (c != 381) {
											if (c != 8216) {
												if ((c ^ 0xffffffff) != -8218) {
													if (c != 8220) {
														if (c == 8221)
															i_1_ = (byte) -108;
														else if (c == 8226)
															i_1_ = (byte) -107;
														else if ((c ^ 0xffffffff) == -8212)
															i_1_ = (byte) -106;
														else if (c != 8212) {
															if ((c ^ 0xffffffff) != -733) {
																if (c != 8482) {
																	if ((c ^ 0xffffffff) != -354) {
																		if (c == 8250)
																			i_1_ = (byte) -101;
																		else if ((c ^ 0xffffffff) == -340)
																			i_1_ = (byte) -100;
																		else if (c == 382)
																			i_1_ = (byte) -98;
																		else if ((c ^ 0xffffffff) != -377)
																			i_1_ = (byte) 63;
																		else
																			i_1_ = (byte) -97;
																	} else
																		i_1_ = (byte) -102;
																} else
																	i_1_ = (byte) -103;
															} else
																i_1_ = (byte) -104;
														} else
															i_1_ = (byte) -105;
													} else
														i_1_ = (byte) -109;
												} else
													i_1_ = (byte) -110;
											} else
												i_1_ = (byte) -111;
										} else
											i_1_ = (byte) -114;
									} else
										i_1_ = (byte) -116;
								} else
									i_1_ = (byte) -117;
							} else
								i_1_ = (byte) -119;
						} else
							i_1_ = (byte) -122;
					} else
						i_1_ = (byte) -125;
				} else
					i_1_ = (byte) -126;
			} else
				i_1_ = (byte) c;
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wd.B(" + c + ',' + i
					+ ')');
		}
	}

	static final void method2126(byte i, int i_2_, int i_3_) {
		do {
			try {
				anInt4654++;
				Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
						-652872096, 6, i_2_);
				class11_sub45_sub15.method3661(0);
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_3_;
				if (i == 76)
					break;
				aFrame4658 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("wd.D(" + i + ','
						+ i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}
}
