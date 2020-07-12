/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import jagex3.jagmisc.jagmisc;

public abstract class Applet_Sub1 extends Applet implements Runnable,
		FocusListener, WindowListener {
	static int anInt10432;
	static int anInt10433;
	static int anInt10434;
	static int anInt10435;
	static int anInt10436;
	static int anInt10437;
	static int anInt10438;
	static int anInt10439;
	static int anInt10440;
	static int anInt10441;
	static int anInt10442;
	static int anInt10443;
	static int anInt10444;
	static int anInt10445;
	static int anInt10446;
	static int anInt10447;
	static int anInt10448;
	private boolean aBool10449 = false;
	static int anInt10450;
	static int anInt10451;
	static int anInt10452;
	static int anInt10453;
	private boolean aBool10454 = false;
	static int anInt10455;
	static int anInt10456;
	static int anInt10457;
	static int anInt10458;
	static int anInt10459;
	static int anInt10460;
	static int anInt10461;
	static IncomingPacket aClass160_10462 = new IncomingPacket(96, -2);
	static int anInt10463;
	static int anInt10464;
	static int anInt10465;
	static IncomingPacket aClass160_10466 = new IncomingPacket(42, -1);
	static int anInt10467;
	static int anInt10468;
	static int anInt10469;
	static int anInt10470;
	static Class79 aClass79_10471 = new Class79(10, 2, 2, 0);
	static int[] anIntArray10472 = new int[4];
	public static boolean aBool10473;
	public static boolean aBool10474;
	public static int anInt10475;
	public static int anInt10476;
	public static boolean aBool10477;
	public static boolean aBool10478;
	public static boolean aBool10479;
	public static boolean aBool10480;
	public static boolean aBool10481;
	public static boolean aBool10482;
	public static boolean aBool10483;
	public static boolean aBool10484;
	public static int anInt10485;
	public static int anInt10486;
	public static int anInt10487;
	public static boolean aBool10488;
	public static int anInt10489;
	public static boolean aBool10490;
	public static boolean aBool10491;

	private final void method3983(int i) {
		try {
			if (i != -1)
				aBool10454 = false;
			anInt10451++;
			long l = Class137.method878((byte) -66);
			long l_0_ = Class11_Sub2_Sub34.aLongArray9688[Class163_Sub3.anInt8253];
			Class11_Sub2_Sub34.aLongArray9688[Class163_Sub3.anInt8253] = l;
			Class163_Sub3.anInt8253 = 0x1f & 1 + Class163_Sub3.anInt8253;
			if ((l_0_ ^ 0xffffffffffffffffL) != -1L
					&& (l_0_ ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
				/* empty */
			}
			synchronized (this) {
				Class11_Sub12_Sub4.aBool9452 = Class256_Sub1.aBool5322;
			}
			method3987(false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.OA(" + i + ')');
		}
	}

	public final AppletContext getAppletContext() {
		try {
			anInt10453++;
			if (Class376_Sub5.aFrame6918 != null)
				return null;
			if (Class108_Sub16.anApplet6538 != null
					&& Class108_Sub16.anApplet6538 != this)
				return Class108_Sub16.anApplet6538.getAppletContext();
			return super.getAppletContext();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					"ng.getAppletContext(" + ')');
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		try {
			anInt10436++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.windowActivated("
					+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final URL getCodeBase() {
		try {
			anInt10465++;
			if (Class376_Sub5.aFrame6918 != null)
				return null;
			if (Class108_Sub16.anApplet6538 != null
					&& this != Class108_Sub16.anApplet6538)
				return Class108_Sub16.anApplet6538.getCodeBase();
			return super.getCodeBase();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method3984(int i) {
		try {
			if (i != 0)
				method3989((byte) 55);
			anInt10468++;
			return Class335_Sub3_Sub1.method3711("jagtheora", true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.DA(" + i + ')');
		}
	}

	String method3985(boolean bool) {
		try {
			if (bool != true)
				method3995(-10);
			anInt10470++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.F(" + bool + ')');
		}
	}

	public final void stop() {
		try {
			anInt10435++;
			if (this == Class112.anApplet_Sub1_1542 && !Class256_Sub2.aBool7717)
				Class23.aLong251 = Class137.method878((byte) -50) - -4000L;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.stop(" + ')');
		}
	}

	static final void method3986(int i) {
		try {
			if (i <= 18)
				method3999((byte) 65, null);
			anInt10442++;
			for (Class11_Sub45_Sub10 class11_sub45_sub10 = ((Class11_Sub45_Sub10) Class376.aClass84_4911
					.method584(-12261)); class11_sub45_sub10 != null; class11_sub45_sub10 = ((Class11_Sub45_Sub10) Class376.aClass84_4911
					.method578(-15361))) {
				Class376_Sub7_Sub5_Sub3 class376_sub7_sub5_sub3 = (((Class11_Sub45_Sub10) class11_sub45_sub10).aClass376_Sub7_Sub5_Sub3_8955);
				if (!((Class376_Sub7_Sub5_Sub3) class376_sub7_sub5_sub3).aBool10066) {
					if ((Class11_Sub25.anInt6279 ^ 0xffffffff) <= (((Class376_Sub7_Sub5_Sub3) class376_sub7_sub5_sub3).anInt10065 ^ 0xffffffff)) {
						class376_sub7_sub5_sub3.method3917((byte) 126,
								Class104.anInt1398);
						if (((Class376_Sub7_Sub5_Sub3) class376_sub7_sub5_sub3).aBool10066)
							class11_sub45_sub10.method122(-71);
						else
							Class98.method661(class376_sub7_sub5_sub3, true);
					}
				} else {
					class11_sub45_sub10.method122(-122);
					class376_sub7_sub5_sub3.method3918((byte) -120);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.BA(" + i + ')');
		}
	}

	abstract void method3987(boolean bool);

	public final void windowIconified(WindowEvent windowevent) {
		try {
			anInt10458++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.windowIconified("
					+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3988(String string, int i) {
		try {
			anInt10447++;
			if (!aBool10449) {
				aBool10449 = true;
				if (i > -92)
					aClass160_10462 = null;
				System.out.println("error_game_" + string);
				try {
					Class36.method311("loggedout", 93,
							Class108_Sub16.anApplet6538);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					getAppletContext().showDocument(
							new URL(getCodeBase(),
									("error_game_" + string + ".ws")), "_top");
				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.LA("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	abstract void method3989(byte i);

	public final void windowOpened(WindowEvent windowevent) {
		try {
			anInt10439++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.windowOpened("
					+ (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	private final void method3990(int i) {
		try {
			anInt10455++;
			int i_1_ = 87 % ((-34 - i) / 57);
			long l = Class137.method878((byte) -96);
			long l_2_ = Class84.aLongArray1159[Class168.anInt2166];
			Class84.aLongArray1159[Class168.anInt2166] = l;
			Class168.anInt2166 = 0x1f & Class168.anInt2166 + 1;
			if (l_2_ != 0L && l_2_ < l) {
				int i_3_ = (int) (-l_2_ + l);
				Class11_Sub2_Sub11.anInt8855 = (32000 - -(i_3_ >> 1)) / i_3_;
			}
			do {
				if (Class11_Sub45_Sub8.anInt8814++ > 50) {
					Class108_Sub21.aBool7302 = true;
					Class11_Sub45_Sub8.anInt8814 -= 50;
					Class11_Sub45_Sub13.aCanvas9308.setSize(
							Class11_Sub36.anInt7079, Class153.anInt2025);
					Class11_Sub45_Sub13.aCanvas9308.setVisible(true);
					if (Class376_Sub5.aFrame6918 == null
							|| Class355.aFrame4658 != null) {
						Class11_Sub45_Sub13.aCanvas9308.setLocation(
								Class198.anInt2687, Class124.anInt1677);
						if (!client.aBool10531)
							break;
					}
					Insets insets = Class376_Sub5.aFrame6918.getInsets();
					Class11_Sub45_Sub13.aCanvas9308.setLocation(insets.left
							+ Class198.anInt2687, insets.top
							+ Class124.anInt1677);
				}
			} while (false);
			method3997(-109);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.MA(" + i + ')');
		}
	}

	public final String getParameter(String string) {
		try {
			anInt10456++;
			if (Class376_Sub5.aFrame6918 != null)
				return null;
			if (Class108_Sub16.anApplet6538 != null
					&& Class108_Sub16.anApplet6538 != this)
				return Class108_Sub16.anApplet6538.getParameter(string);
			return super.getParameter(string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.getParameter("
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	public final URL getDocumentBase() {
		try {
			anInt10438++;
			if (Class376_Sub5.aFrame6918 != null)
				return null;
			if (Class108_Sub16.anApplet6538 != null
					&& Class108_Sub16.anApplet6538 != this)
				return Class108_Sub16.anApplet6538.getDocumentBase();
			return super.getDocumentBase();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					"ng.getDocumentBase(" + ')');
		}
	}

	final boolean method3991(boolean bool) {
		try {
			anInt10432++;
			String string = getDocumentBase().getHost().toLowerCase();
			if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
				return true;
			if (string.equals("runescape.com")
					|| string.endsWith(".runescape.com"))
				return true;
			if (string.equals("stellardawn.com")
					|| string.endsWith(".stellardawn.com"))
				return true;
			if (string.endsWith("127.0.0.1"))
				return true;
			for (/**/; (string.length() > 0
					&& (string.charAt(-1 + string.length()) ^ 0xffffffff) <= -49 && (string
					.charAt(string.length() - 1) ^ 0xffffffff) >= -58); string = string
					.substring(0, string.length() - 1)) {
				/* empty */
			}
			if (string.endsWith("192.168.1."))
				return true;
			if (bool != false)
				return false;
			method3988("invalidhost", -117);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.CA(" + bool + ')');
		}
	}

	public abstract void init();

	public final void start() {
		try {
			anInt10463++;
			if (this == Class112.anApplet_Sub1_1542 && !Class256_Sub2.aBool7717)
				Class23.aLong251 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.start(" + ')');
		}
	}

	public final void destroy() {
		try {
			anInt10461++;
			if (this == Class112.anApplet_Sub1_1542 && !Class256_Sub2.aBool7717) {
				Class23.aLong251 = Class137.method878((byte) -110);
				Class11_Sub51.method3236(5000L, 0);
				Class11_Sub45_Sub12.aClass341_9179 = null;
				method3998((byte) -71, false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.destroy(" + ')');
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			anInt10433++;
			Class256_Sub1.aBool5322 = true;
			Class108_Sub21.aBool7302 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.focusGained("
					+ (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	static final boolean method3992(int i) {
		try {
			anInt10457++;
			if (Class11_Sub52.aBool8053) {
				try {
					if (((Boolean) Class36.method311("showingVideoAd", 93,
							Class108_Sub16.anApplet6538)).booleanValue())
						return false;
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			if (i != 5)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.GA(" + i + ')');
		}
	}

	final void writeInt(int i, int i_4_, int i_5_, String string, boolean bool,
			int i_6_, int i_7_, int i_8_) {
		try {
			try {
				Class112.anApplet_Sub1_1542 = this;
				Class198.anInt2687 = 0;
				Class330.anInt4377 = i;
				Class11_Sub45_Sub18.anInt9531 = Class11_Sub36.anInt7079 = i_7_;
				Class124.anInt1677 = i_4_;
				Class231.anInt3160 = Class153.anInt2025 = i_5_;
				OutputStream_Sub2.anApplet7948 = null;
				Class376_Sub5.aFrame6918 = new Frame();
				Class376_Sub5.aFrame6918.setTitle("Jagex");
				Class376_Sub5.aFrame6918.setResizable(true);
				Class376_Sub5.aFrame6918.addWindowListener(this);
				Class376_Sub5.aFrame6918.setVisible(true);
				Class376_Sub5.aFrame6918.toFront();
				Insets insets = Class376_Sub5.aFrame6918.getInsets();
				Class376_Sub5.aFrame6918.setSize(insets.left
						+ (Class11_Sub45_Sub18.anInt9531 - -insets.right),
						insets.bottom + (Class231.anInt3160 - -insets.top));
				Class11_Sub45_Sub12.aClass341_9179 = Class108_Sub21.aClass341_7304 = new Class341(
						i_6_, string, i_8_, true);
				Class368 class368 = Class108_Sub21.aClass341_7304.method2063(
						i_4_ ^ 0x2, this, 1);
				while ((class368.anInt4837 ^ 0xffffffff) == -1)
					Class11_Sub51.method3236(10L, 0);
			} catch (Exception exception) {
				Class11_Sub12_Sub3.method3602((byte) -126, null, exception);
			}
			anInt10467++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.HA(" + i + ','
					+ i_4_ + ',' + i_5_ + ','
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
		}
	}

	final boolean method3994(int i) {
		try {
			if (i != -12362)
				method3983(23);
			anInt10460++;
			return Class335_Sub3_Sub1.method3711("jaclib", true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.KA(" + i + ')');
		}
	}

	abstract void method3995(int i);

	public final void update(Graphics graphics) {
		try {
			anInt10445++;
			paint(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.update("
					+ (graphics != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3996(int i) {
		try {
			anInt10446++;
			if (i != -1)
				method3986(-37);
			return Class335_Sub3_Sub1.method3711("jagmisc", true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.FA(" + i + ')');
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		try {
			anInt10434++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.windowClosed("
					+ (windowevent != null ? "{...}" : "null") + ')');
		}
	}

	public final synchronized void paint(Graphics graphics) {
		do {
			try {
				anInt10440++;
				if (Class112.anApplet_Sub1_1542 == this
						&& !Class256_Sub2.aBool7717) {
					Class108_Sub21.aBool7302 = true;
					if (!Class149.aBool1998
							|| (Class137.method878((byte) -68)
									- Class30.aLong407 ^ 0xffffffffffffffffL) >= -1001L)
						break;
					Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null
							|| (((Class11_Sub45_Sub18.anInt9531 ^ 0xffffffff) >= (rectangle.width ^ 0xffffffff)) && ((Class231.anInt3160 ^ 0xffffffff) >= (rectangle.height ^ 0xffffffff))))
						Class332.aBool4409 = true;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ng.paint("
						+ (graphics != null ? "{...}" : "null") + ')');
			}
			break;
		} while (false);
	}

	abstract void method3997(int i);

	private final void method3998(byte i, boolean bool) {
		try {
			anInt10437++;
			synchronized (this) {
				if (Class256_Sub2.aBool7717)
					return;
				if (i >= -27)
					aBool10449 = true;
				Class256_Sub2.aBool7717 = true;
			}
			System.out.println("Shutdown start - clean:" + bool);
			if (Class108_Sub16.anApplet6538 != null)
				Class108_Sub16.anApplet6538.destroy();
			try {
				method4001((byte) 103);
			} catch (Exception exception) {
				/* empty */
			}
			if (aBool10454) {
				try {
					jagmisc.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				aBool10454 = false;
			}
			Class257.method1643(true, true);
			Class11_Sub21.method2560((byte) -91);
			if (Class11_Sub45_Sub13.aCanvas9308 != null) {
				try {
					Class11_Sub45_Sub13.aCanvas9308.removeFocusListener(this);
					Class11_Sub45_Sub13.aCanvas9308.getParent().remove(
							Class11_Sub45_Sub13.aCanvas9308);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (Class108_Sub21.aClass341_7304 != null) {
				try {
					Class108_Sub21.aClass341_7304.method2066(false);
				} catch (Exception exception) {
					/* empty */
				}
			}
			method3989((byte) 39);
			if (Class376_Sub5.aFrame6918 != null) {
				Class376_Sub5.aFrame6918.setVisible(false);
				Class376_Sub5.aFrame6918.dispose();
				Class376_Sub5.aFrame6918 = null;
			}
			System.out.println("Shutdown complete - clean:" + bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.JA(" + i + ','
					+ bool + ')');
		}
	}

	public final void focusLost(FocusEvent focusevent) {
		try {
			Class256_Sub1.aBool5322 = false;
			anInt10452++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.focusLost("
					+ (focusevent != null ? "{...}" : "null") + ')');
		}
	}

	static final int method3999(byte i, Class174 class174) {
		try {
			anInt10443++;
			int i_9_ = 124 / ((i + 28) / 34);
			if (InputStream_Sub2.aClass174_6943 != class174) {
				if (Class11_Sub2_Sub24.aClass174_9281 == class174)
					return 34065;
				if (Class63.aClass174_921 == class174)
					return 34066;
			} else
				return 9216;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.EA(" + i + ','
					+ (class174 != null ? "{...}" : "null") + ')'));
		}
	}

	synchronized void method4000(int i) {
		try {
			anInt10450++;
			if (Class11_Sub45_Sub13.aCanvas9308 != null) {
				Class11_Sub45_Sub13.aCanvas9308.removeFocusListener(this);
				Class11_Sub45_Sub13.aCanvas9308.getParent().setBackground(
						Color.black);
				Class11_Sub45_Sub13.aCanvas9308.getParent().remove(
						Class11_Sub45_Sub13.aCanvas9308);
			}
			Container container;
			if (Class355.aFrame4658 != null)
				container = Class355.aFrame4658;
			else if (Class376_Sub5.aFrame6918 == null) {
				if (Class108_Sub16.anApplet6538 != null)
					container = Class108_Sub16.anApplet6538;
				else
					container = Class112.anApplet_Sub1_1542;
			} else
				container = Class376_Sub5.aFrame6918;
			container.setLayout(null);
			if (i == -15671) {
				Class11_Sub45_Sub13.aCanvas9308 = new Canvas_Sub1(this);
				container.add(Class11_Sub45_Sub13.aCanvas9308);
				Class11_Sub45_Sub13.aCanvas9308.setSize(
						Class11_Sub36.anInt7079, Class153.anInt2025);
				Class11_Sub45_Sub13.aCanvas9308.setVisible(true);
				if (Class376_Sub5.aFrame6918 == container) {
					Insets insets = Class376_Sub5.aFrame6918.getInsets();
					Class11_Sub45_Sub13.aCanvas9308.setLocation(
							Class198.anInt2687 + insets.left, insets.top
									+ Class124.anInt1677);
				} else
					Class11_Sub45_Sub13.aCanvas9308.setLocation(
							Class198.anInt2687, Class124.anInt1677);
				Class11_Sub45_Sub13.aCanvas9308.addFocusListener(this);
				Class11_Sub45_Sub13.aCanvas9308.requestFocus();
				Class256_Sub1.aBool5322 = true;
				Class11_Sub12_Sub4.aBool9452 = true;
				Class108_Sub21.aBool7302 = true;
				Class332.aBool4409 = false;
				Class30.aLong407 = Class137.method878((byte) -69);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.M(" + i + ')');
		}
	}

	public static final void provideLoaderApplet(Applet applet) {
		try {
			Class108_Sub16.anApplet6538 = applet;
			anInt10469++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ng.provideLoaderApplet("
							+ (applet != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method4001(byte i);

	public final void windowDeactivated(WindowEvent windowevent) {
		try {
			anInt10459++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ng.windowDeactivated("
							+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final void run() {
		try {
			anInt10441++;
			do {
				try {
					if (Class341.aString4509 != null) {
						String string = Class341.aString4509.toLowerCase();
						if ((string.indexOf("sun") ^ 0xffffffff) == 0
								&& string.indexOf("apple") == -1) {
							if (string.indexOf("ibm") != -1
									&& (Class341.aString4517 == null || Class341.aString4517
											.equals("1.4.2"))) {
								method3988("wrongjava", -95);
								break;
							}
						} else {
							String string_10_ = Class341.aString4517;
							if (string_10_.equals("1.1")
									|| string_10_.startsWith("1.1.")
									|| string_10_.equals("1.2")
									|| string_10_.startsWith("1.2.")) {
								method3988("wrongjava", -116);
								break;
							}
						}
					}
					if (Class341.aString4517 != null
							&& Class341.aString4517.startsWith("1.")) {
						int i = 2;
						int i_11_ = 0;
						while ((i ^ 0xffffffff) > (Class341.aString4517
								.length() ^ 0xffffffff)) {
							int i_12_ = Class341.aString4517.charAt(i);
							if ((i_12_ ^ 0xffffffff) > -49 || i_12_ > 57)
								break;
							i++;
							i_11_ = -48 - (-i_12_ - i_11_ * 10);
						}
						if ((i_11_ ^ 0xffffffff) <= -6)
							Class149.aBool1998 = true;
					}
					Applet applet = Class112.anApplet_Sub1_1542;
					if (Class108_Sub16.anApplet6538 != null)
						applet = Class108_Sub16.anApplet6538;
					Method method = Class341.aMethod4528;
					if (method != null) {
						try {
							method.invoke(applet, new Object[] { Boolean.TRUE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					Class173.method1136(108);
					Class11_Sub44.method3131(16711935);
					method4000(-15671);
					method3995(0);
					Class272.aClass264_3672 = Class380.method2227((byte) -19);
					while (Class23.aLong251 == 0L
							|| (Class137.method878((byte) -42) < Class23.aLong251)) {
						Class33_Sub3.anInt7172 = Class272.aClass264_3672
								.method1672(Class301.aLong4060, 4);
						for (int i = 0; ((i ^ 0xffffffff) > (Class33_Sub3.anInt7172 ^ 0xffffffff)); i++)
							method3983(-1);
						method3990(-124);
						Class126.method821(Class11_Sub45_Sub13.aCanvas9308,
								Class108_Sub21.aClass341_7304, 0);
					}
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class11_Sub12_Sub3.method3602((byte) -40, method3985(true),
							throwable);
					method3988("crash", -93);
				} finally {
					method3998((byte) -98, true);
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.run(" + ')');
		}
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		try {
			anInt10448++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ng.windowDeiconified("
							+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	public final void windowClosing(WindowEvent windowevent) {
		try {
			destroy();
			anInt10444++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.windowClosing("
					+ (windowevent != null ? "{...}" : "null") + ')'));
		}
	}

	final void method4002(int i, int i_13_, int i_14_, int i_15_,
			String string, int i_16_, int i_17_) {
		try {
			anInt10464++;
			try {
				if (Class112.anApplet_Sub1_1542 != null) {
					Class166.anInt2149++;
					if ((Class166.anInt2149 ^ 0xffffffff) <= -4)
						method3988("alreadyloaded", -118);
					else
						getAppletContext().showDocument(getDocumentBase(),
								"_self");
				} else {
					Class231.anInt3160 = Class153.anInt2025 = i_15_;
					Class112.anApplet_Sub1_1542 = this;
					OutputStream_Sub2.anApplet7948 = Class108_Sub16.anApplet6538;
					Class330.anInt4377 = i_17_;
					Class124.anInt1677 = 0;
					Class198.anInt2687 = 0;
					Class11_Sub45_Sub18.anInt9531 = Class11_Sub36.anInt7079 = i;
					int i_18_ = -16 / ((58 - i_16_) / 60);
					Class11_Sub45_Sub12.aClass341_9179 = Class108_Sub21.aClass341_7304 = new Class341(
							i_14_, string, i_13_,
							Class108_Sub16.anApplet6538 != null);
					Class368 class368 = Class108_Sub21.aClass341_7304
							.method2063(2, this, 1);
					while (class368.anInt4837 == 0)
						Class11_Sub51.method3236(10L, 0);
				}
			} catch (Throwable throwable) {
				Class11_Sub12_Sub3.method3602((byte) -113, null, throwable);
				method3988("crash", -122);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ng.IA(" + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ','
					+ (string != null ? "{...}" : "null") + ',' + i_16_ + ','
					+ i_17_ + ')'));
		}
	}

	public static void method4003(byte i) {
		try {
			aClass160_10462 = null;
			aClass79_10471 = null;
			anIntArray10472 = null;
			int i_19_ = -30 / ((48 - i) / 45);
			aClass160_10466 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ng.NA(" + i + ')');
		}
	}
}
