/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

final class Class184 implements IEnumModesCallback {
	private static int anInt2369;
	private DirectDraw aDirectDraw2370;
	private static int[] anIntArray2371;

	public final void callbackEnumModes(DDSurfaceDesc ddsurfacedesc,
			IUnknown iunknown) {
		try {
			if (anIntArray2371 != null) {
				anIntArray2371[anInt2369++] = ddsurfacedesc.width;
				anIntArray2371[anInt2369++] = ddsurfacedesc.height;
				anIntArray2371[anInt2369++] = ddsurfacedesc.rgbBitCount;
				anIntArray2371[anInt2369++] = ddsurfacedesc.refreshRate;
			} else
				anInt2369 += 4;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1202(int i, Frame frame) {
		try {
			aDirectDraw2370.restoreDisplayMode();
			aDirectDraw2370.setCooperativeLevel(frame, 8);
			int i_0_ = 98 % ((-29 - i) / 55);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class184() {
		try {
			aDirectDraw2370 = new DirectDraw();
			aDirectDraw2370.initialize(null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1203(byte i, Frame frame, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		try {
			frame.setVisible(true);
			if (i >= -90)
				anIntArray2371 = null;
			WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
			int i_5_ = wcomponentpeer.getHwnd();
			User32.SetWindowLong(i_5_, -16, -2147483648);
			User32.SetWindowLong(i_5_, -20, 8);
			aDirectDraw2370.setCooperativeLevel(frame, 17);
			aDirectDraw2370.setDisplayMode(i_4_, i_1_, i_3_, i_2_, 0);
			frame.setBounds(0, 0, i_4_, i_1_);
			frame.toFront();
			frame.requestFocus();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int[] method1204(int i) {
		try {
			aDirectDraw2370.enumDisplayModes(i, null, null, this);
			anIntArray2371 = new int[anInt2369];
			anInt2369 = 0;
			aDirectDraw2370.enumDisplayModes(0, null, null, this);
			int[] is = anIntArray2371;
			anInt2369 = 0;
			anIntArray2371 = null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
