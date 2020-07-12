/* Class214 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public final class Class214 {
	private DisplayMode aDisplayMode2899;
	private GraphicsDevice aGraphicsDevice2900;

	public final int[] listmodes() {
		int[] is;
		try {
			DisplayMode[] displaymodes = aGraphicsDevice2900.getDisplayModes();
			int[] is_0_ = new int[displaymodes.length << 2];
			for (int i = 0; displaymodes.length > i; i++) {
				is_0_[i << 2] = displaymodes[i].getWidth();
				is_0_[1 + (i << 2)] = displaymodes[i].getHeight();
				is_0_[2 + (i << 2)] = displaymodes[i].getBitDepth();
				is_0_[3 + (i << 2)] = displaymodes[i].getRefreshRate();
			}
			is = is_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	private final void method1373(byte i, Frame frame) {
		try {
			boolean bool = false;
			int i_1_ = 95 / ((i - 26) / 39);
			try {
				Field field = Class.forName("sun.awt.Win32GraphicsDevice")
						.getDeclaredField("valid");
				field.setAccessible(true);
				boolean bool_2_ = ((Boolean) field.get(aGraphicsDevice2900))
						.booleanValue();
				if (bool_2_) {
					bool = true;
					field.set(aGraphicsDevice2900, Boolean.FALSE);
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				aGraphicsDevice2900.setFullScreenWindow(frame);
			} catch (Throwable object) {
				if (bool) {
					try {
						Field field = Class.forName(
								"sun.awt.Win32GraphicsDevice")
								.getDeclaredField("valid");
						field.set(aGraphicsDevice2900, Boolean.TRUE);
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				// throw object;
			}
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice")
							.getDeclaredField("valid");
					field.set(aGraphicsDevice2900, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void exit() {
		try {
			if (null != aDisplayMode2899) {
				aGraphicsDevice2900.setDisplayMode(aDisplayMode2899);
				if (!aGraphicsDevice2900.getDisplayMode().equals(
						aDisplayMode2899))
					throw new RuntimeException(
							"Did not return to correct resolution!");
				aDisplayMode2899 = null;
			}
			method1373((byte) -106, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class214() throws Exception {
		try {
			GraphicsEnvironment graphicsenvironment = GraphicsEnvironment
					.getLocalGraphicsEnvironment();
			aGraphicsDevice2900 = graphicsenvironment.getDefaultScreenDevice();
			if (!aGraphicsDevice2900.isFullScreenSupported()) {
				GraphicsDevice[] graphicsdevices = graphicsenvironment
						.getScreenDevices();
				GraphicsDevice[] graphicsdevices_3_ = graphicsdevices;
				for (int i = 0; i < graphicsdevices_3_.length; i++) {
					GraphicsDevice graphicsdevice = graphicsdevices_3_[i];
					if (null != graphicsdevice
							&& graphicsdevice.isFullScreenSupported()) {
						aGraphicsDevice2900 = graphicsdevice;
						return;
					}
				}
				throw new Exception();
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void enter(Frame frame, int i, int i_4_, int i_5_, int i_6_) {
		try {
			aDisplayMode2899 = aGraphicsDevice2900.getDisplayMode();
			if (aDisplayMode2899 == null)
				throw new NullPointerException();
			frame.setUndecorated(true);
			frame.enableInputMethods(false);
			method1373((byte) -43, frame);
			if ((i_6_ ^ 0xffffffff) == -1) {
				int i_7_ = aDisplayMode2899.getRefreshRate();
				DisplayMode[] displaymodes = aGraphicsDevice2900
						.getDisplayModes();
				boolean bool = false;
				for (int i_8_ = 0; (displaymodes.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
					if (i == displaymodes[i_8_].getWidth()
							&& displaymodes[i_8_].getHeight() == i_4_
							&& displaymodes[i_8_].getBitDepth() == i_5_) {
						int i_9_ = displaymodes[i_8_].getRefreshRate();
						if (!bool
								|| ((Math.abs(-i_7_ + i_9_) ^ 0xffffffff) > (Math
										.abs(-i_7_ + i_6_) ^ 0xffffffff))) {
							i_6_ = i_9_;
							bool = true;
						}
					}
				}
				if (!bool)
					i_6_ = i_7_;
			}
			aGraphicsDevice2900.setDisplayMode(new DisplayMode(i, i_4_, i_5_,
					i_6_));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
