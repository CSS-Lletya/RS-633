/* Class225_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

final class Class225_Sub2 extends Class225 implements MouseListener,
		MouseMotionListener, MouseWheelListener {
	private int anInt6996;
	private Class84 aClass84_6997 = new Class84();
	private int anInt6998;
	private int anInt6999;
	private int anInt7000;
	private Class84 aClass84_7001 = new Class84();
	private int anInt7002;
	private int anInt7003;
	private boolean aBool7004;
	private Component aComponent7005;

	final Class11_Sub23 method1445(int i) {
		Class11_Sub23 class11_sub23;
		try {
			if (i != -3)
				mouseMoved(null);
			class11_sub23 = (Class11_Sub23) aClass84_6997.method581((byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class11_sub23;
	}

	private final void method2831(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		try {
			Class11_Sub23_Sub1 class11_sub23_sub1 = new Class11_Sub23_Sub1();
			((Class11_Sub23_Sub1) class11_sub23_sub1).anInt8519 = i_1_;
			((Class11_Sub23_Sub1) class11_sub23_sub1).anInt8518 = i;
			((Class11_Sub23_Sub1) class11_sub23_sub1).anInt8517 = i_2_;
			((Class11_Sub23_Sub1) class11_sub23_sub1).aLong8516 = Class137
					.method878((byte) -58);
			if (i_0_ == 4062) {
				((Class11_Sub23_Sub1) class11_sub23_sub1).anInt8520 = i_3_;
				aClass84_7001.method589((byte) -13, class11_sub23_sub1);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final int method2832(MouseEvent mouseevent, boolean bool) {
		int i;
		try {
			if (bool)
				mouseClicked(null);
			if (mouseevent.getButton() == 1) {
				if (mouseevent.isMetaDown())
					return 4;
				return 1;
			}
			if (mouseevent.getButton() == 2)
				return 2;
			if (mouseevent.getButton() == 3)
				return 4;
			i = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		try {
			int i = method2832(mouseevent, false);
			if (0 == (i & anInt7002))
				i = anInt7002;
			if ((i & 0x1 ^ 0xffffffff) != -1)
				method2831(mouseevent.getY(), 4062, 3, mouseevent.getX(),
						mouseevent.getClickCount());
			if ((0x4 & i) != 0)
				method2831(mouseevent.getY(), 4062, 5, mouseevent.getX(),
						mouseevent.getClickCount());
			if (0 != (0x2 & i))
				method2831(mouseevent.getY(), 4062, 4, mouseevent.getX(),
						mouseevent.getClickCount());
			anInt7002 &= i ^ 0xffffffff;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method2833(int i, Component component) {
		try {
			method2835(0);
			aComponent7005 = component;
			if (i == 3) {
				aComponent7005.addMouseListener(this);
				aComponent7005.addMouseMotionListener(this);
				aComponent7005.addMouseWheelListener(this);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			method2834(mouseevent.getX(), mouseevent.getY(), -12617);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method1447(int i) {
		boolean bool;
		try {
			if (i != -1)
				mouseReleased(null);
			bool = 0 != (0x2 & anInt6999);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final synchronized void mouseWheelMoved(
			MouseWheelEvent mousewheelevent) {
		try {
			int i = mousewheelevent.getX();
			int i_4_ = mousewheelevent.getY();
			int i_5_ = mousewheelevent.getWheelRotation();
			method2831(i_4_, 4062, 6, i, i_5_);
			if (mousewheelevent.isControlDown() && !mousewheelevent.isShiftDown())
				client.handleGameZoom(i_5_);
			mousewheelevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			method2834(mouseevent.getX(), mouseevent.getY(), -12617);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method1452(byte i) {
		boolean bool;
		try {
			if (i != 46)
				method1449(-72);
			bool = -1 != (0x4 & anInt6999 ^ 0xffffffff);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final synchronized void mouseClicked(MouseEvent mouseevent) {
		try {
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private final void method2834(int i, int i_6_, int i_7_) {
		try {
			anInt7000 = i_6_;
			if (i_7_ != -12617)
				method1445(121);
			anInt7003 = i;
			if (aBool7004)
				method2831(i_6_, 4062, -1, i, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mousePressed(MouseEvent mouseevent) {
		try {
			int i = method2832(mouseevent, false);
			if (-2 == (i ^ 0xffffffff))
				method2831(mouseevent.getY(), 4062, 0, mouseevent.getX(),
						mouseevent.getClickCount());
			else if (-5 != (i ^ 0xffffffff)) {
				if (-3 == (i ^ 0xffffffff))
					method2831(mouseevent.getY(), 4062, 1, mouseevent.getX(),
							mouseevent.getClickCount());
			} else
				method2831(mouseevent.getY(), 4062, 2, mouseevent.getX(),
						mouseevent.getClickCount());
			anInt7002 |= i;
			if (mouseevent.isPopupTrigger())
				mouseevent.consume();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final synchronized void method1439(int i) {
		try {
			if (i != 0)
				method2834(-103, 10, 113);
			anInt6999 = anInt7002;
			anInt6996 = anInt7000;
			anInt6998 = anInt7003;
			Class84 class84 = aClass84_6997;
			aClass84_6997 = aClass84_7001;
			aClass84_7001 = class84;
			aClass84_7001.method586((byte) -19);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method2834(mouseevent.getX(), mouseevent.getY(), -12617);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method1448(byte i) {
		int i_8_;
		try {
			if (i != -63)
				method2832(null, true);
			i_8_ = anInt6996;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_8_;
	}

	private final void method2835(int i) {
		try {
			if (aComponent7005 != null) {
				aComponent7005.removeMouseWheelListener(this);
				aComponent7005.removeMouseMotionListener(this);
				aComponent7005.removeMouseListener(this);
				aClass84_7001 = null;
				anInt6998 = anInt6996 = anInt6999 = 0;
				anInt7003 = anInt7000 = anInt7002 = i;
				aComponent7005 = null;
				aClass84_6997 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method1449(int i) {
		int i_9_;
		try {
			if (i >= -69)
				mouseExited(null);
			i_9_ = anInt6998;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_9_;
	}

	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			method2834(mouseevent.getX(), mouseevent.getY(), -12617);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1441(int i) {
		try {
			method2835(0);
			if (i != -1)
				mouseReleased(null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method1444(int i) {
		boolean bool;
		try {
			if (i != 0)
				aComponent7005 = null;
			bool = (0x1 & anInt6999 ^ 0xffffffff) != -1;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class225_Sub2(Component component, boolean bool) {
		try {
			method2833(3, component);
			aBool7004 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
