/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;

final class Class81 implements Interface11 {
	static int anInt1083;
	private boolean aBool1084;
	private boolean aBool1085;
	static int anInt1086;
	static int anInt1087;
	private Image anImage1088;
	private int anInt1089;
	static int anInt1090 = 0;
	private int anInt1091;
	private Image anImage1092;
	static int anInt1093 = -1;
	private int anInt1094;
	static int anInt1095;
	static Class92[] aClass92Array1096;
	static int anInt1097;
	static int anInt1098;
	private int anInt1099;
	private int anInt1100;
	private Color aColor1101;
	private int anInt1102;
	static int anInt1103;
	private int anInt1104;
	private int anInt1105;
	private Image anImage1106;
	private int anInt1107;
	private Image anImage1108;
	private Image anImage1109;
	static int anInt1110;
	private Image anImage1111;
	private Image anImage1112;
	private boolean aBool1113;
	static int anInt1114;
	static int anInt1115;
	static int anInt1116;
	private Font aFont1117;
	static int anInt1118;
	private Image anImage1119;
	private Image anImage1120;
	static int anInt1121;
	private FontMetrics aFontMetrics1122;
	private Image anImage1123;

	public final boolean method38(long l, int i) {
		try {
			anInt1110++;
			if (i != 14320)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.A(" + l + ',' + i
					+ ')');
		}
	}

	private final Object method558(Class var_class, String string, byte i)
			throws IllegalAccessException, NoSuchFieldException {
		try {
			anInt1098++;
			Field field = var_class.getDeclaredField(string);
			Object object = field.get(Class108_Sub16.anApplet6538);
			field.set(Class108_Sub16.anApplet6538, null);
			if (i < 111)
				anInt1090 = -22;
			return object;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bb.I("
					+ (var_class != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	private final int method559(boolean bool, int i) {
		try {
			if (bool != false)
				anImage1092 = null;
			anInt1116++;
			if (aBool1084)
				return (Class11_Sub36.anInt7079 - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.M(" + bool + ','
					+ i + ')');
		}
	}

	public final int method30(int i) {
		try {
			anInt1114++;
			int i_0_ = -53 / ((-16 - i) / 47);
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.C(" + i + ')');
		}
	}

	public final void method36(boolean bool, int i) {
		do {
			try {
				anInt1086++;
				if (!aBool1085) {
					if (Class108_Sub16.anApplet6538 == null)
						aBool1085 = true;
					else if (aFont1117 == null) {
						try {
							method563(i ^ ~0x35cb);
						} catch (Exception exception) {
							aBool1085 = true;
						}
					}
				}
				if (aBool1085)
					method565((byte) -123);
				else {
					Graphics graphics = Class11_Sub45_Sub13.aCanvas9308
							.getGraphics();
					if (graphics != null) {
						try {
							int i_1_ = Class321_Sub2.aClass382_6641
									.method2241(i - 13752);
							String string = Class321_Sub2.aClass382_6641
									.method2232((byte) -45);
							if (Class11_Sub45_Sub10.anImage8960 == null)
								Class11_Sub45_Sub10.anImage8960 = (Class11_Sub45_Sub13.aCanvas9308
										.createImage(Class11_Sub36.anInt7079,
												Class153.anInt2025));
							Graphics graphics_2_ = Class11_Sub45_Sub10.anImage8960
									.getGraphics();
							graphics_2_
									.clearRect(0, 0, Class11_Sub36.anInt7079,
											Class153.anInt2025);
							int i_3_ = anImage1106.getWidth(null);
							int i_4_ = anImage1111.getWidth(null);
							int i_5_ = anImage1112.getWidth(null);
							int i_6_ = anImage1106.getHeight(null);
							int i_7_ = anImage1111.getHeight(null);
							int i_8_ = anImage1112.getHeight(null);
							graphics_2_
									.drawImage(
											anImage1106,
											(method559(false, i_3_) + anInt1107 - anInt1094 / 2),
											(method561(i_6_, false) - -anInt1102),
											null);
							int i_9_ = anInt1107 - anInt1094 / 2 + i_3_;
							int i_10_ = anInt1094 / 2 + anInt1107;
							for (int i_11_ = i_9_; i_10_ >= i_11_; i_11_ += i_5_)
								graphics_2_.drawImage(anImage1112, (i_11_
										+ method559(false, i_3_) - -anInt1107),
										(method561(i_8_, false) - -anInt1102),
										null);
							graphics_2_
									.drawImage(
											anImage1111,
											(method559(false, i_4_) + anInt1107 + anInt1094 / 2),
											(method561(i_7_, false) - -anInt1102),
											null);
							int i_12_ = anImage1123.getWidth(null);
							int i_13_ = anImage1123.getHeight(null);
							int i_14_ = anImage1109.getWidth(null);
							int i_15_ = anImage1109.getHeight(null);
							int i_16_ = anImage1088.getHeight(null);
							int i_17_ = anImage1092.getWidth(null);
							int i_18_ = anImage1092.getHeight(null);
							int i_19_ = anImage1088.getWidth(null);
							int i_20_ = anImage1108.getWidth(null);
							int i_21_ = anImage1120.getWidth(null);
							int i_22_ = method559(false, anInt1091) + anInt1105;
							int i_23_ = method561(anInt1099, false) + anInt1100;
							graphics_2_.drawImage(anImage1123, i_22_,
									(i_23_ + (-i_13_ + anInt1099) / 2), null);
							graphics_2_.drawImage(anImage1109, -i_14_ + i_22_
									+ anInt1091,
									(i_23_ + (-i_15_ + anInt1099) / 2), null);
							if (anImage1119 == null)
								anImage1119 = (Class11_Sub45_Sub13.aCanvas9308
										.createImage(anInt1091 + -i_12_
												+ -i_14_, anInt1099));
							Graphics graphics_24_ = anImage1119.getGraphics();
							for (int i_25_ = 0; ((-i_12_ + (anInt1091 + -i_14_) ^ 0xffffffff) < (i_25_ ^ 0xffffffff)); i_25_ += i_17_)
								graphics_24_.drawImage(anImage1092, i_25_, 0,
										null);
							for (int i_26_ = 0; ((i_26_ ^ 0xffffffff) > (anInt1091
									- (i_12_ - -i_14_) ^ 0xffffffff)); i_26_ += i_19_)
								graphics_24_.drawImage(anImage1088, i_26_,
										anInt1099 + -i_16_, null);
							int i_27_ = (-i_12_ + (anInt1091 + -i_14_)) * i_1_
									/ 100;
							if ((i_27_ ^ 0xffffffff) < -1) {
								Image image = (Class11_Sub45_Sub13.aCanvas9308
										.createImage(i_27_, -i_18_
												+ (anInt1099 + -i_16_)));
								int i_28_ = image.getWidth(null);
								Graphics graphics_29_ = image.getGraphics();
								int i_30_ = (anInt1089
										* Class11_Sub45_Sub20_Sub1
												.method3892((byte) -127) / 10 % i_20_);
								for (int i_31_ = -i_20_ + i_30_; i_28_ > i_31_; i_31_ += i_20_)
									graphics_29_.drawImage(anImage1108, i_31_,
											0, null);
								graphics_24_.drawImage(image, 0, i_18_, null);
							}
							int i_32_ = i_27_;
							i_27_ = anInt1091 + -i_12_ + (-i_14_ - i_27_);
							if (i_27_ > 0) {
								Image image = (Class11_Sub45_Sub13.aCanvas9308
										.createImage(i_27_, -i_16_
												+ (anInt1099 - i_18_)));
								int i_33_ = image.getWidth(null);
								Graphics graphics_34_ = image.getGraphics();
								for (int i_35_ = 0; i_33_ > i_35_; i_35_ += i_21_)
									graphics_34_.drawImage(anImage1120, i_35_,
											0, null);
								graphics_24_.drawImage(image, i_32_, i_18_,
										null);
							}
							graphics_2_.drawImage(anImage1119, i_12_ + i_22_,
									i_23_, null);
							graphics_2_.setFont(aFont1117);
							graphics_2_.setColor(aColor1101);
							graphics_2_.drawString(string,
									(i_22_ - -((anInt1091 + -aFontMetrics1122
											.stringWidth(string)) / 2)),
									anInt1104 + i_23_ + (anInt1099 / 2 + 4));
							graphics.drawImage(Class11_Sub45_Sub10.anImage8960,
									0, 0, null);
						} catch (Exception exception) {
							aBool1085 = true;
						}
					} else
						Class11_Sub45_Sub13.aCanvas9308.repaint();
					if (i == 13751)
						break;
					aBool1085 = false;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bb.J(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	private final int method560(Class var_class, int i, Object object,
			String string) throws IllegalAccessException, NoSuchFieldException {
		try {
			anInt1118++;
			Field field = var_class.getDeclaredField(string);
			if (i != 0)
				anInt1093 = 102;
			return field.getInt(object);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bb.G("
					+ (var_class != null ? "{...}" : "null") + ',' + i + ','
					+ (object != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method37(boolean bool) {
		do {
			try {
				Class130.method842(!bool);
				anInt1121++;
				if (bool == true)
					break;
				method564((byte) -88);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bb.D(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	private final int method561(int i, boolean bool) {
		try {
			anInt1103++;
			if (aBool1113)
				return (-i + Class153.anInt2025) / 2;
			if (bool != false)
				anImage1111 = null;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.B(" + i + ','
					+ bool + ')');
		}
	}

	private final boolean method562(Class var_class, Object object, byte i,
			String string) throws IllegalAccessException, NoSuchFieldException {
		try {
			anInt1083++;
			if (i != -23)
				return false;
			Field field = var_class.getDeclaredField(string);
			return field.getBoolean(object);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bb.K("
					+ (var_class != null ? "{...}" : "null") + ','
					+ (object != null ? "{...}" : "null") + ',' + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method563(int i) throws IllegalAccessException,
			NoSuchFieldException {
		try {
			anInt1095++;
			Class var_class = Class108_Sub16.anApplet6538.getClass();
			if (i > -103)
				method30(80);
			anImage1108 = (Image) method558(var_class, "bar", (byte) 122);
			anImage1120 = (Image) method558(var_class, "background", (byte) 116);
			anImage1123 = (Image) method558(var_class, "left", (byte) 116);
			anImage1109 = (Image) method558(var_class, "right", (byte) 120);
			anImage1092 = (Image) method558(var_class, "top", (byte) 126);
			anImage1088 = (Image) method558(var_class, "bottom", (byte) 115);
			anImage1106 = (Image) method558(var_class, "bodyLeft", (byte) 117);
			anImage1111 = (Image) method558(var_class, "bodyRight", (byte) 117);
			anImage1112 = (Image) method558(var_class, "bodyFill", (byte) 121);
			aFont1117 = (Font) method558(var_class, "bf", (byte) 119);
			aFontMetrics1122 = (FontMetrics) method558(var_class, "bfm",
					(byte) 119);
			aColor1101 = (Color) method558(var_class, "colourtext", (byte) 123);
			Object object = method558(var_class, "lb", (byte) 123);
			Class var_class_36_ = object.getClass();
			aBool1084 = method562(var_class_36_, object, (byte) -23, "xMiddle");
			aBool1113 = method562(var_class_36_, object, (byte) -23, "yMiddle");
			anInt1105 = method560(var_class_36_, 0, object, "xOffset");
			anInt1100 = method560(var_class_36_, 0, object, "yOffset");
			anInt1091 = method560(var_class_36_, 0, object, "width");
			anInt1099 = method560(var_class_36_, 0, object, "height");
			anInt1107 = method560(var_class_36_, 0, object, "boxXOffset");
			anInt1102 = method560(var_class_36_, 0, object, "boxYOffset");
			anInt1094 = method560(var_class_36_, 0, object, "boxWidth");
			anInt1104 = method560(var_class_36_, 0, object, "textYOffset");
			anInt1089 = method560(var_class_36_, 0, object,
					"offsetPerTenCycles");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.L(" + i + ')');
		}
	}

	public final void method39(int i) {
		try {
			anInt1115++;
			int i_37_ = 101 / ((i - 15) / 44);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.F(" + i + ')');
		}
	}

	public static void method564(byte i) {
		try {
			if (i != 57)
				method564((byte) -9);
			aClass92Array1096 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.N(" + i + ')');
		}
	}

	public final int method4(byte i) {
		try {
			if (i < 114)
				return -116;
			anInt1097++;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.H(" + i + ')');
		}
	}

	private final void method565(byte i) {
		try {
			int i_38_ = -8 % ((45 - i) / 52);
			anInt1087++;
			Class248.method1571(
					Class190.aColorArray2447[Class33_Sub1.anInt6178],
					Class321_Sub2.aClass382_6641.method2241(-1),
					Class281.aColorArray3806[Class33_Sub1.anInt6178], 0,
					Class321_Sub2.aClass382_6641.method2232((byte) -45),
					Class291.aColorArray3931[Class33_Sub1.anInt6178]);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bb.E(" + i + ')');
		}
	}

	public Class81() {
		/* empty */
	}
}
