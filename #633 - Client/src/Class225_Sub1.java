/* Class225_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class Class225_Sub1 extends Class225 implements MouseListener,
		MouseMotionListener {
	private int anInt4990;
	static int anInt4991;
	static int anInt4992;
	static int anInt4993;
	static int anInt4994;
	private int anInt4995;
	static int anInt4996;
	static int anInt4997;
	static int anInt4998;
	static int anInt4999;
	static int anInt5000;
	static int anInt5001;
	static int anInt5002;
	static int anInt5003;
	static int anInt5004;
	static int anInt5005;
	static int anInt5006;
	static int anInt5007 = 0;
	static int anInt5008;
	static int anInt5009;
	private int anInt5010;
	static int anInt5011;
	static int anInt5012;
	static int anInt5013;
	static int anInt5014;
	static int anInt5015;
	static int anInt5016;
	private Class84 aClass84_5017 = new Class84();
	private Class84 aClass84_5018 = new Class84();
	private int anInt5019;
	private int anInt5020;
	private int anInt5021;
	private boolean aBool5022;
	private Component aComponent5023;

	public final synchronized void mousePressed(MouseEvent mouseevent) {
		do {
			try {
				anInt5006++;
				int i = method2248((byte) -53, mouseevent);
				if (i != 1) {
					if (i != 4) {
						if ((i ^ 0xffffffff) == -3)
							method2247(1, mouseevent.getY(),
									mouseevent.getClickCount(), (byte) 82,
									mouseevent.getX());
					} else
						method2247(2, mouseevent.getY(),
								mouseevent.getClickCount(), (byte) 82,
								mouseevent.getX());
				} else
					method2247(0, mouseevent.getY(),
							mouseevent.getClickCount(), (byte) 82,
							mouseevent.getX());
				anInt5019 |= i;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("cda.mousePressed("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method2245(int i, Component component) {
		try {
			method2246(-115);
			anInt5015++;
			if (i != 0)
				mouseMoved(null);
			aComponent5023 = component;
			aComponent5023.addMouseListener(this);
			aComponent5023.addMouseMotionListener(this);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("cda.M(" + i + ','
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void mouseExited(MouseEvent mouseevent) {
		try {
			method2249((byte) -99, mouseevent.getX(), mouseevent.getY());
			anInt5016++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.mouseExited("
					+ (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseMoved(MouseEvent mouseevent) {
		try {
			anInt4996++;
			method2249((byte) -122, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.mouseMoved("
					+ (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void mouseClicked(MouseEvent mouseevent) {
		do {
			try {
				anInt5008++;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("cda.mouseClicked("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	private final void method2246(int i) {
		try {
			anInt5013++;
			if (aComponent5023 != null) {
				aComponent5023.removeMouseMotionListener(this);
				aComponent5023.removeMouseListener(this);
				if (i < -49) {
					anInt5010 = anInt4990 = anInt4995 = 0;
					anInt5021 = anInt5020 = anInt5019 = 0;
					aClass84_5017 = null;
					aComponent5023 = null;
					aClass84_5018 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.G(" + i + ')');
		}
	}

	final int method1448(byte i) {
		try {
			anInt5004++;
			if (i != -63)
				aClass84_5017 = null;
			return anInt4990;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.A(" + i + ')');
		}
	}

	final boolean method1452(byte i) {
		try {
			anInt5001++;
			if (i != 46)
				method1452((byte) 0);
			if ((anInt4995 & 0x4 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.D(" + i + ')');
		}
	}

	final boolean method1447(int i) {
		try {
			if (i != -1)
				method2246(-75);
			anInt5005++;
			if ((anInt4995 & 0x2) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.I(" + i + ')');
		}
	}

	final synchronized void method1439(int i) {
		try {
			anInt4990 = anInt5020;
			anInt4995 = anInt5019;
			anInt4998++;
			if (i != 0)
				anInt5007 = 55;
			anInt5010 = anInt5021;
			Class84 class84 = aClass84_5017;
			aClass84_5017 = aClass84_5018;
			aClass84_5018 = class84;
			aClass84_5018.method586((byte) -19);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.K(" + i + ')');
		}
	}

	public final synchronized void mouseEntered(MouseEvent mouseevent) {
		try {
			method2249((byte) -101, mouseevent.getX(), mouseevent.getY());
			anInt5014++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.mouseEntered("
					+ (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	private final void method2247(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		do {
			try {
				anInt4991++;
				Class11_Sub23_Sub2 class11_sub23_sub2 = new Class11_Sub23_Sub2();
				((Class11_Sub23_Sub2) class11_sub23_sub2).anInt9516 = i_0_;
				((Class11_Sub23_Sub2) class11_sub23_sub2).anInt9518 = i_1_;
				((Class11_Sub23_Sub2) class11_sub23_sub2).anInt9519 = i_3_;
				((Class11_Sub23_Sub2) class11_sub23_sub2).anInt9515 = i;
				((Class11_Sub23_Sub2) class11_sub23_sub2).aLong9523 = Class137
						.method878((byte) -44);
				aClass84_5018.method589((byte) -13, class11_sub23_sub2);
				if (i_2_ == 82)
					break;
				anInt4990 = -48;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cda.E(" + i + ','
						+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void mouseReleased(MouseEvent mouseevent) {
		do {
			try {
				anInt4993++;
				int i = method2248((byte) -81, mouseevent);
				if ((i & anInt5019 ^ 0xffffffff) == -1)
					i = anInt5019;
				if ((0x1 & i) != 0)
					method2247(3, mouseevent.getY(),
							mouseevent.getClickCount(), (byte) 82,
							mouseevent.getX());
				if ((0x4 & i ^ 0xffffffff) != -1)
					method2247(5, mouseevent.getY(),
							mouseevent.getClickCount(), (byte) 82,
							mouseevent.getX());
				if ((i & 0x2 ^ 0xffffffff) != -1)
					method2247(4, mouseevent.getY(),
							mouseevent.getClickCount(), (byte) 82,
							mouseevent.getX());
				anInt5019 &= i ^ 0xffffffff;
				if (!mouseevent.isPopupTrigger())
					break;
				mouseevent.consume();
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("cda.mouseReleased("
										+ (mouseevent != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	public final synchronized void mouseDragged(MouseEvent mouseevent) {
		try {
			anInt4999++;
			method2249((byte) -127, mouseevent.getX(), mouseevent.getY());
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.mouseDragged("
					+ (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	final int method1449(int i) {
		try {
			anInt5003++;
			if (i > -69)
				aClass84_5017 = null;
			return anInt5010;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.C(" + i + ')');
		}
	}

	private final int method2248(byte i, MouseEvent mouseevent) {
		try {
			anInt5011++;
			int i_4_ = mouseevent.getModifiers();
			boolean bool = (0x10 & i_4_) != 0;
			boolean bool_5_ = (0x8 & i_4_) != 0;
			if (i > -51)
				mouseClicked(null);
			boolean bool_6_ = (0x4 & i_4_ ^ 0xffffffff) != -1;
			if (bool_5_ && (bool || bool_6_))
				bool_5_ = false;
			if (bool && bool_6_)
				return 4;
			if (bool)
				return 1;
			if (bool_5_)
				return 2;
			if (bool_6_)
				return 4;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.J(" + i + ','
					+ (mouseevent != null ? "{...}" : "null") + ')');
		}
	}

	final void method1441(int i) {
		do {
			try {
				method2246(-93);
				anInt5012++;
				if (i == -1)
					break;
				anInt5010 = 71;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "cda.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class11_Sub23 method1445(int i) {
		try {
			anInt5000++;
			if (i != -3)
				method2245(99, null);
			return (Class11_Sub23) aClass84_5017.method581((byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.H(" + i + ')');
		}
	}

	final boolean method1444(int i) {
		try {
			if (i != 0)
				return true;
			anInt4992++;
			if ((anInt4995 & 0x1 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cda.B(" + i + ')');
		}
	}

	private final void method2249(byte i, int i_7_, int i_8_) {
		do {
			try {
				anInt5020 = i_8_;
				if (i >= -87)
					method1452((byte) -31);
				anInt5021 = i_7_;
				anInt5002++;
				if (!aBool5022)
					break;
				method2247(-1, i_8_, 0, (byte) 82, i_7_);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cda.L(" + i + ','
						+ i_7_ + ',' + i_8_ + ')'));
			}
			break;
		} while (false);
	}

	Class225_Sub1(Component component, boolean bool) {
		try {
			method2245(0, component);
			aBool5022 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("cda.<init>(" + (component != null ? "{...}" : "null")
							+ ',' + bool + ')'));
		}
	}
}
