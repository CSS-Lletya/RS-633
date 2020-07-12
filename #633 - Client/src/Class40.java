/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class40 {
	private boolean aBool581 = false;
	private static int anInt582 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			.length();
	private int[] anIntArray583 = new int[4];
	private int anInt584;
	private Class253[] aClass253Array585;
	private int anInt586;
	private int[] anIntArray587;
	private static int[] anIntArray588 = new int[256];

	final int method358() {
		return anInt584;
	}

	final int method359() {
		return anInt586 - 1;
	}

	final int method360(String string) {
		int i = 0;
		for (int i_0_ = 0; i_0_ < string.length(); i_0_++) {
			int i_1_ = anIntArray588[string.charAt(i_0_)];
			i += anIntArray587[i_1_];
		}
		return i;
	}

	public static void method361() {
		anIntArray588 = null;
	}

	final void method362(Class163 class163, String string, int i, int i_2_,
			int i_3_, boolean bool) {
		int i_4_ = method360(string) / 2;
		class163.K(anIntArray583);
		if (i - i_4_ <= anIntArray583[2] && i + i_4_ >= anIntArray583[0]
				&& i_2_ - anInt584 <= anIntArray583[3]
				&& i_2_ + anInt586 >= anIntArray583[1])
			method364(class163, string, anIntArray583, i - i_4_, i_2_, i_3_,
					bool);
	}

	private final void method363(Class163 class163, Font font,
			FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_5_ = fontmetrics.charWidth(c);
		int i_6_ = i_5_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k'
						|| c == 'x' || c == 'y' || c == 'A' || c == 'V'
						|| c == 'W')
					i_5_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_7_ = fontmetrics.getMaxAscent();
		int i_8_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_9_ = fontmetrics.getHeight();
		Image image = Class11_Sub45_Sub13.aCanvas9308.createImage(i_5_, i_8_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_5_, i_8_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, i_7_);
		if (bool)
			graphics.drawString(String.valueOf(c), 1, i_7_);
		int[] is = new int[i_5_ * i_8_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_5_, i_8_,
				is, 0, i_5_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_10_ = 0;
		while_250_: for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
			for (int i_12_ = 0; i_12_ < i_5_; i_12_++) {
				int i_13_ = is[i_12_ + i_11_ * i_5_];
				if ((i_13_ & 0xffffff) != 0) {
					i_10_ = i_11_;
					break while_250_;
				}
			}
		}
		for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
			if ((is[i_14_] & 0xffffff) == 0)
				is[i_14_] = 0;
		}
		anInt584 = i_7_ - i_10_;
		anInt586 = i_9_;
		anIntArray587[i] = i_6_;
		aClass253Array585[i] = class163.method1040(i_5_, i_8_, is, -1, i_5_, 0);
	}

	private final void method364(Class163 class163, String string, int[] is,
			int i, int i_15_, int i_16_, boolean bool) {
		if (i_16_ == 0)
			bool = false;
		i_16_ |= ~0xffffff;
		for (int i_17_ = 0; i_17_ < string.length(); i_17_++) {
			int i_18_ = anIntArray588[string.charAt(i_17_)];
			if (bool)
				aClass253Array585[i_18_].method1624(i + 1, i_15_ + 1, 0,
						-16777216, 1);
			aClass253Array585[i_18_].method1624(i, i_15_, 0, i_16_, 1);
			i += anIntArray587[i_18_];
		}
	}

	Class40(Class163 class163, int i, boolean bool, Component component) {
		aBool581 = false;
		aClass253Array585 = new Class253[256];
		anIntArray587 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_19_ = 0; i_19_ < anInt582; i_19_++)
			method363(
					class163,
					font,
					fontmetrics,
					"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
							.charAt(i_19_), i_19_, false);
		if (bool && aBool581) {
			aBool581 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_20_ = 0; i_20_ < anInt582; i_20_++)
				method363(
						class163,
						font,
						fontmetrics,
						"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
								.charAt(i_20_), i_20_, false);
			if (!aBool581) {
				aBool581 = false;
				for (int i_21_ = 0; i_21_ < anInt582; i_21_++)
					method363(
							class163,
							font,
							fontmetrics,
							"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
									.charAt(i_21_), i_21_, true);
			}
		}
	}

	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
					.indexOf(i);
			if (i_22_ == -1)
				i_22_ = 74;
			anIntArray588[i] = i_22_;
		}
	}
}
