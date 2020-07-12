/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

final class Callback_Sub1 extends Callback {
	private int anInt5618;
	private volatile int anInt5619;
	private volatile boolean aBool5620 = true;
	private volatile int anInt5621;
	private boolean aBool5622;

	final void method2427(int i, int i_0_, boolean bool) {
		do {
			try {
				User32.SetCursorPos(i_0_, i);
				if (bool == false)
					break;
				method2428(null, true, -94);
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	final synchronized int callback(int i, int i_1_, int i_2_, int i_3_) {
		try {
			if ((anInt5621 ^ 0xffffffff) != (i ^ 0xffffffff)) {
				int i_4_ = User32.GetWindowLong(i, -4);
				return User32.CallWindowProc(i_4_, i, i_1_, i_2_, i_3_);
			}
			if ((i_1_ ^ 0xffffffff) == -33) {
				int i_5_ = 0xffff & i_3_;
				if (i_5_ == 1) {
					User32.SetCursor(aBool5620 ? anInt5618 : 0);
					return 0;
				}
			}
			if ((i_1_ ^ 0xffffffff) == -101025) {
				User32.SetCursor(aBool5620 ? anInt5618 : 0);
				return 0;
			}
			if ((i_1_ ^ 0xffffffff) == -2) {
				anInt5621 = 0;
				aBool5620 = true;
			}
			return User32.CallWindowProc(anInt5619, i, i_1_, i_2_, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2428(Component component, boolean bool, int i) {
		do {
			try {
				WComponentPeer wcomponentpeer = (WComponentPeer) component
						.getPeer();
				int i_6_ = wcomponentpeer.getTopHwnd();
				if (anInt5621 != i_6_ || !aBool5620 != !bool) {
					if (!aBool5622) {
						anInt5618 = User32.LoadCursor(0, 32512);
						Root.alloc(this);
						aBool5622 = true;
					}
					if ((anInt5621 ^ 0xffffffff) != (i_6_ ^ 0xffffffff)) {
						if (anInt5621 != 0) {
							aBool5620 = true;
							User32.SendMessage(i_6_, 101024, 0, 0);
							synchronized (this) {
								User32.SetWindowLong(anInt5621, -4, anInt5619);
							}
						}
						synchronized (this) {
							anInt5621 = i_6_;
							anInt5619 = User32.SetWindowLong(anInt5621, -4,
									this);
						}
					}
					aBool5620 = bool;
					User32.SendMessage(i_6_, 101024, 0, 0);
					if (i > 102)
						break;
					aBool5620 = false;
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}
}
