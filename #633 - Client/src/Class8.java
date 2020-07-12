/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

final class Class8 {
	private Robot aRobot62;
	private Component aComponent63;

	final void setcustomcursor(Component component, int[] is, int i, int i_0_,
			Point point) {
		try {
			if (null == is)
				component.setCursor(null);
			else {
				BufferedImage bufferedimage = new BufferedImage(i, i_0_, 2);
				bufferedimage.setRGB(0, 0, i, i_0_, is, 0, i);
				component.setCursor(component.getToolkit().createCustomCursor(
						bufferedimage, point, null));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void movemouse(int i, int i_1_) {
		try {
			aRobot62.mouseMove(i, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void showcursor(Component component, boolean bool) {
		try {
			if (bool)
				component = null;
			else if (component == null)
				throw new NullPointerException();
			if (aComponent63 != component) {
				if (null != aComponent63) {
					aComponent63.setCursor(null);
					aComponent63 = null;
				}
				if (component != null) {
					component.setCursor(component.getToolkit()
							.createCustomCursor(new BufferedImage(1, 1, 2),
									new Point(0, 0), null));
					aComponent63 = component;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class8() throws Exception {
		try {
			aRobot62 = new Robot();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
