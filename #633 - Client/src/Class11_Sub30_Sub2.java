/* Class11_Sub30_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class Class11_Sub30_Sub2 extends Class11_Sub30 {
	private Rectangle aRectangle9149;
	private Canvas aCanvas9150;
	private Image anImage9151;
	private Shape aShape9152;

	final void method2730(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_, int i_5_, Graphics graphics) {
		try {
			aShape9152 = graphics.getClip();
			aRectangle9149.y = i_3_;
			int i_6_ = 70 % ((16 - i_2_) / 62);
			aRectangle9149.width = i_1_;
			aRectangle9149.height = i;
			aRectangle9149.x = i_0_;
			graphics.setClip(aRectangle9149);
			graphics.drawImage(anImage9151, i_0_ + -i_5_, i_3_ - i_4_,
					aCanvas9150);
			graphics.setClip(aShape9152);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2731(int i, int i_7_, boolean bool, Canvas canvas) {
		try {
			aCanvas9150 = canvas;
			aRectangle9149 = new Rectangle();
			((Class11_Sub30_Sub2) this).anInt6617 = i;
			((Class11_Sub30_Sub2) this).anInt6613 = i_7_;
			((Class11_Sub30_Sub2) this).anIntArray6611 = new int[(((Class11_Sub30_Sub2) this).anInt6613 * ((Class11_Sub30_Sub2) this).anInt6617)];
			DataBufferInt databufferint = new DataBufferInt(
					((Class11_Sub30_Sub2) this).anIntArray6611,
					(((Class11_Sub30_Sub2) this).anIntArray6611).length);
			DirectColorModel directcolormodel = new DirectColorModel(32,
					16711680, 65280, 255);
			WritableRaster writableraster = Raster.createWritableRaster(
					(directcolormodel.createCompatibleSampleModel(
							(((Class11_Sub30_Sub2) this).anInt6613),
							(((Class11_Sub30_Sub2) this).anInt6617))),
					databufferint, null);
			anImage9151 = new BufferedImage(directcolormodel, writableraster,
					bool, new Hashtable());
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
