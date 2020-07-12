/* Class_p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

final class Class_p extends Class11 implements Interface2 {
	Canvas aCanvas5104;
	long nativeid;
	int anInt5105;
	int anInt5106;
	private static long aLong5107;
	private static boolean aBool5108 = false;

	final void method2279() {
		w(true);
		((Class_p) this).nativeid = 0L;
		((Class_p) this).aCanvas5104 = null;
	}

	private final native void K(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_);

	private final native void oa(Canvas canvas, int i, int i_5_);

	private final native void sa(oa var_oa, Canvas canvas, int i, int i_6_);

	final void method2280(Canvas canvas, int i, int i_7_) {
		((Class_p) this).anInt5106 = i;
		((Class_p) this).anInt5105 = i_7_;
		oa(canvas, i, i_7_);
	}

	private final native void H(int i, int i_8_, int i_9_, int i_10_);

	final void method2281(Rectangle[] rectangles, int i, int i_11_, int i_12_) {
		try {
			synchronized (((Class_p) this).aCanvas5104.getTreeLock()) {
				for (int i_13_ = 0; i_13_ < i; i_13_++) {
					Rectangle rectangle = rectangles[i_13_];
					if (rectangle.width > 0 && rectangle.height > 0)
						K(rectangle.x, rectangle.y, rectangle.width,
								rectangle.height, i_11_, i_12_);
				}
				aBool5108 = false;
			}
		} catch (Exception exception) {
			method2282(exception);
		}
	}

	private final void method2282(Exception exception) {
		if (!aBool5108) {
			aLong5107 = Class137.method878((byte) -119);
			aBool5108 = true;
		} else if (Class137.method878((byte) -106) - aLong5107 < 30000L)
			((Class_p) this).aCanvas5104.repaint();
		else
			throw new RuntimeException(exception.getMessage());
	}

	final void method2283(int i, int i_14_) {
		try {
			synchronized (((Class_p) this).aCanvas5104.getTreeLock()) {
				Dimension dimension = ((Class_p) this).aCanvas5104.getSize();
				H(i, i_14_, dimension.width, dimension.height);
				aBool5108 = false;
			}
		} catch (Exception exception) {
			method2282(exception);
		}
	}

	protected final void finalize() {
		if (((Class_p) this).nativeid != 0L)
			Class257.method1642((byte) 123, this);
	}

	Class_p(oa var_oa, Canvas canvas, int i, int i_15_) {
		((Class_p) this).aCanvas5104 = canvas;
		((Class_p) this).anInt5106 = i;
		((Class_p) this).anInt5105 = i_15_;
		sa(var_oa, ((Class_p) this).aCanvas5104, i, i_15_);
	}

	public final native void w(boolean bool);
}
