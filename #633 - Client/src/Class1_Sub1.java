/* Class1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

final class Class1_Sub1 extends Class1 implements KeyListener, FocusListener {
	static int anInt7115;
	static int anInt7116;
	static int anInt7117;
	static int anInt7118 = -50;
	static int anInt7119;
	static int anInt7120;
	static int anInt7121;
	static int anInt7122;
	static int anInt7123;
	static int anInt7124;
	static int anInt7125;
	static int anInt7126;
	static int anInt7127;
	private Class84 aClass84_7128 = new Class84();
	static int anInt7129;
	static byte[][][] aByteArrayArrayArray7130;
	static int anInt7131;
	static int anInt7132;
	static int anInt7133;
	private Class84 aClass84_7134 = new Class84();
	private Component aComponent7135;
	private boolean[] aBoolArray7136 = new boolean[112];

	private final void method2895(char c, int i, int i_0_, int i_1_) {
		try {
			anInt7120++;
			Class11_Sub8 class11_sub8 = new Class11_Sub8();
			if (i_1_ == 0) {
				((Class11_Sub8) class11_sub8).aChar5297 = c;
				((Class11_Sub8) class11_sub8).anInt5295 = i_0_;
				((Class11_Sub8) class11_sub8).anInt5306 = i;
				((Class11_Sub8) class11_sub8).aLong5300 = Class137
						.method878((byte) -122);
				aClass84_7134.method589((byte) -13, class11_sub8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.J(" + c + ',' + i
					+ ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	public final synchronized void focusLost(FocusEvent focusevent) {
		try {
			anInt7132++;
			method2895('\0', -1, 0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.focusLost("
					+ (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void keyReleased(KeyEvent keyevent) {
		try {
			anInt7129++;
			method2899(1, (byte) -71, keyevent);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.keyReleased("
					+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final synchronized void keyPressed(KeyEvent keyevent) {
		try {
			anInt7116++;
			method2899(0, (byte) -71, keyevent);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.keyPressed("
					+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2896(byte i, Component component) {
		try {
			anInt7119++;
			method2900((byte) -45);
			if (i <= -101) {
				aComponent7135 = component;
				Method method = Class341.aMethod4525;
				if (method != null) {
					try {
						method.invoke(aComponent7135,
								new Object[] { Boolean.FALSE });
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				aComponent7135.addKeyListener(this);
				aComponent7135.addFocusListener(this);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.I(" + i + ','
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2897(boolean bool) {
		do {
			try {
				aByteArrayArrayArray7130 = null;
				if (bool == true)
					break;
				method2898(58);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qc.L(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final Class153[] method2898(int i) {
		try {
			if (i != -1)
				return null;
			anInt7126++;
			return (new Class153[] { Class124.aClass153_1673,
					Class65.aClass153_938, Class376_Sub1.aClass153_5103 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.G(" + i + ')');
		}
	}

	final boolean method60(int i, int i_2_) {
		try {
			if (i != 0)
				return false;
			anInt7117++;
			if ((i_2_ ^ 0xffffffff) > -1 || i_2_ >= 112)
				return false;
			return aBoolArray7136[i_2_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.F(" + i + ','
					+ i_2_ + ')');
		}
	}

	private final void method2899(int i, byte i_3_, KeyEvent keyevent) {
		try {
			if (i_3_ == -71) {
				anInt7115++;
				int i_4_ = keyevent.getKeyCode();
				if (i_4_ == 0)
					i_4_ = 0;
				else if ((i_4_ ^ 0xffffffff) <= -1
						&& i_4_ < Class204.anIntArray2753.length) {
					i_4_ = Class204.anIntArray2753[i_4_];
					if ((i ^ 0xffffffff) == -1
							&& (i_4_ & 0x80 ^ 0xffffffff) != -1)
						i_4_ = 0;
					else
						i_4_ &= ~0x80;
				} else
					i_4_ = 0;
				if (i_4_ != 0) {
					method2895('\0', i, i_4_, i_3_ ^ ~0x46);
					keyevent.consume();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("qc.H(" + i + ',' + i_3_ + ','
									+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method2900(byte i) {
		try {
			anInt7133++;
			if (aComponent7135 != null) {
				aComponent7135.removeKeyListener(this);
				aComponent7135.removeFocusListener(this);
				aComponent7135 = null;
				int i_5_ = 0;
				if (i != -45)
					method63((byte) 71);
				for (/**/; (i_5_ ^ 0xffffffff) > -113; i_5_++)
					aBoolArray7136[i_5_] = false;
				aClass84_7128.method586((byte) -19);
				aClass84_7134.method586((byte) -19);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.M(" + i + ')');
		}
	}

	public final synchronized void keyTyped(KeyEvent keyevent) {
		try {
			anInt7122++;
			char c = keyevent.getKeyChar();
			if ((c ^ 0xffffffff) != -1 && Class108_Sub1.method2251(c, false)) {
				method2895(c, 3, -1, 0);
				keyevent.consume();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.keyTyped("
					+ (keyevent != null ? "{...}" : "null") + ')'));
		}
	}

	final void method62(byte i) {
		do {
			try {
				anInt7131++;
				method2900((byte) -45);
				if (i >= 10)
					break;
				aByteArrayArrayArray7130 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qc.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final Interface25 method63(byte i) {
		try {
			int i_6_ = -89 % ((i - 21) / 42);
			anInt7123++;
			return (Interface25) aClass84_7128.method581((byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.A(" + i + ')');
		}
	}

	final synchronized void method65(byte i) {
		try {
			aClass84_7128.method586((byte) -19);
			if (i != -30)
				aClass84_7134 = null;
			anInt7125++;
			for (Class11_Sub8 class11_sub8 = (Class11_Sub8) aClass84_7134
					.method581((byte) -16); class11_sub8 != null; class11_sub8 = (Class11_Sub8) aClass84_7134
					.method581((byte) -16)) {
				((Class11_Sub8) class11_sub8).anInt5301 = method2901(1);
				if ((((Class11_Sub8) class11_sub8).anInt5306 ^ 0xffffffff) == -1) {
					if (!aBoolArray7136[((Class11_Sub8) class11_sub8).anInt5295]) {
						Class11_Sub8 class11_sub8_7_ = new Class11_Sub8();
						((Class11_Sub8) class11_sub8_7_).aChar5297 = '\0';
						((Class11_Sub8) class11_sub8_7_).aLong5300 = ((Class11_Sub8) class11_sub8).aLong5300;
						((Class11_Sub8) class11_sub8_7_).anInt5295 = ((Class11_Sub8) class11_sub8).anInt5295;
						((Class11_Sub8) class11_sub8_7_).anInt5306 = 0;
						((Class11_Sub8) class11_sub8_7_).anInt5301 = ((Class11_Sub8) class11_sub8).anInt5301;
						aClass84_7128.method589((byte) -13, class11_sub8_7_);
						aBoolArray7136[((Class11_Sub8) class11_sub8).anInt5295] = true;
					}
					((Class11_Sub8) class11_sub8).anInt5306 = 2;
					aClass84_7128.method589((byte) -13, class11_sub8);
				} else if ((((Class11_Sub8) class11_sub8).anInt5306 ^ 0xffffffff) != -2) {
					if (((Class11_Sub8) class11_sub8).anInt5306 == -1) {
						for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -113; i_8_++) {
							if (aBoolArray7136[i_8_]) {
								Class11_Sub8 class11_sub8_9_ = new Class11_Sub8();
								((Class11_Sub8) class11_sub8_9_).aChar5297 = '\0';
								((Class11_Sub8) class11_sub8_9_).anInt5301 = ((Class11_Sub8) class11_sub8).anInt5301;
								((Class11_Sub8) class11_sub8_9_).aLong5300 = ((Class11_Sub8) class11_sub8).aLong5300;
								((Class11_Sub8) class11_sub8_9_).anInt5306 = 1;
								((Class11_Sub8) class11_sub8_9_).anInt5295 = i_8_;
								aClass84_7128.method589((byte) -13,
										class11_sub8_9_);
								aBoolArray7136[i_8_] = false;
							}
						}
					} else if ((((Class11_Sub8) class11_sub8).anInt5306 ^ 0xffffffff) == -4)
						aClass84_7128.method589((byte) -13, class11_sub8);
				} else if (aBoolArray7136[((Class11_Sub8) class11_sub8).anInt5295]) {
					aClass84_7128.method589((byte) -13, class11_sub8);
					aBoolArray7136[((Class11_Sub8) class11_sub8).anInt5295] = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.E(" + i + ')');
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			anInt7127++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.focusGained("
					+ (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	private final int method2901(int i) {
		try {
			anInt7121++;
			int i_10_ = 0;
			if (i != 1)
				return -118;
			if (aBoolArray7136[81])
				i_10_ |= 0x1;
			if (aBoolArray7136[82])
				i_10_ |= 0x4;
			if (aBoolArray7136[86])
				i_10_ |= 0x2;
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qc.K(" + i + ')');
		}
	}

	static final void method2902(int i, int i_11_, int i_12_,
			Class376_Sub7_Sub4 class376_sub7_sub4,
			Class376_Sub7_Sub4 class376_sub7_sub4_13_) {
		Class364 class364 = Class221.method1414(i, i_11_, i_12_);
		if (class364 != null) {
			((Class364) class364).aClass376_Sub7_Sub4_4778 = class376_sub7_sub4;
			((Class364) class364).aClass376_Sub7_Sub4_4789 = class376_sub7_sub4_13_;
			int i_14_ = ((Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729) ? 1
					: 0);
			if (class376_sub7_sub4.method2863(-127)) {
				if (class376_sub7_sub4.method2870(false)) {
					((Class376_Sub7) class376_sub7_sub4).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_14_];
					Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_14_] = class376_sub7_sub4;
				} else {
					((Class376_Sub7) class376_sub7_sub4).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_14_];
					Class382.aClass376_Sub7Array4971[i_14_] = class376_sub7_sub4;
					Class333.aBool4411 = true;
				}
			} else {
				((Class376_Sub7) class376_sub7_sub4).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_14_];
				Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_14_] = class376_sub7_sub4;
			}
			if (class376_sub7_sub4_13_ != null) {
				if (class376_sub7_sub4_13_.method2863(-116)) {
					if (class376_sub7_sub4_13_.method2870(false)) {
						((Class376_Sub7) class376_sub7_sub4_13_).aClass376_Sub7_7032 = (Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_14_]);
						Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_14_] = class376_sub7_sub4_13_;
					} else {
						((Class376_Sub7) class376_sub7_sub4_13_).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_14_];
						Class382.aClass376_Sub7Array4971[i_14_] = class376_sub7_sub4_13_;
						Class333.aBool4411 = true;
					}
				} else {
					((Class376_Sub7) class376_sub7_sub4_13_).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_14_];
					Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_14_] = class376_sub7_sub4_13_;
				}
			}
		}
	}

	Class1_Sub1(Component component) {
		try {
			Class11_Sub2_Sub5.method3395(false);
			method2896((byte) -127, component);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qc.<init>("
					+ (component != null ? "{...}" : "null") + ')'));
		}
	}
}
