/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

final class Class325 {
	static int anInt4324;
	short aShort4325;
	byte aByte4326;
	static String aString4327 = null;
	byte aByte4328;
	static int anInt4329 = -1;
	short aShort4330;
	static int anInt4331;
	short aShort4332;
	int anInt4333;
	boolean aBool4334;
	int anInt4335;

	public static void method1977(int i) {
		try {
			if (i != 0)
				method1977(-88);
			aString4327 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tn.A(" + i + ')');
		}
	}

	static final Class253 method1978(byte[] is, int i) {
		try {
			anInt4324++;
			if (i <= 102)
				return null;
			if (is == null)
				throw new RuntimeException("");
			for (;;) {
				try {
					Image image = Toolkit.getDefaultToolkit().createImage(is);
					MediaTracker mediatracker = new MediaTracker(
							Class11_Sub2_Sub23.aclient9263);
					mediatracker.addImage(image, 0);
					mediatracker.waitForAll();
					int i_0_ = image.getWidth(Class11_Sub2_Sub23.aclient9263);
					int i_1_ = image.getHeight(Class11_Sub2_Sub23.aclient9263);
					if (mediatracker.isErrorAny() || i_0_ < 0 || i_1_ < 0)
						throw new RuntimeException("");
					int[] is_2_ = new int[i_0_ * i_1_];
					PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0,
							i_0_, i_1_, is_2_, 0, i_0_);
					pixelgrabber.grabPixels();
					return Class321_Sub2.aClass163_6648.method1040(i_0_, i_1_,
							is_2_, -1, i_0_, 0);
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tn.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	Class325(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_,
			int i_9_, int i_10_, boolean bool, int i_11_) {
		try {
			((Class325) this).aShort4332 = (short) i_6_;
			((Class325) this).anInt4335 = i_11_;
			((Class325) this).aShort4325 = (short) i_7_;
			((Class325) this).aByte4326 = (byte) i_10_;
			((Class325) this).aShort4330 = (short) i_8_;
			((Class325) this).anInt4333 = i;
			((Class325) this).aByte4328 = (byte) i_9_;
			((Class325) this).aBool4334 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tn.<init>(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
					+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ','
					+ i_11_ + ')'));
		}
	}
}
