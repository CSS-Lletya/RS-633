/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

final class Class126 implements Runnable {
	private boolean aBool1689;
	private OutputStream anOutputStream1690;
	static String aString1691;
	private int anInt1692;
	static int anInt1693;
	static int anInt1694;
	static int anInt1695;
	static int anInt1696;
	private InputStream anInputStream1697;
	static int anInt1698;
	private int anInt1699 = 0;
	private boolean aBool1700;
	private Class341 aClass341_1701;
	private Class368 aClass368_1702;
	static int anInt1703;
	static int anInt1704;
	static int anInt1705;
	private byte[] aByteArray1706;
	private Socket aSocket1707;
	static int anInt1708;
	private int anInt1709;
	static int anInt1710;
	static int anInt1711;
	static int anInt1712;

	final int method818(int i) throws IOException {
		try {
			anInt1705++;
			if (aBool1700)
				return 0;
			if (i != 50)
				method827(false);
			return anInputStream1697.read();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.F(" + i + ')');
		}
	}

	static final void method819(Class107 class107) {
		Class91_Sub2.aClass107_7701 = class107;
	}

	final int method820(int i) throws IOException {
		try {
			anInt1694++;
			if (aBool1700)
				return 0;
			if (i > -61)
				return -63;
			return anInputStream1697.available();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.K(" + i + ')');
		}
	}

	static final void method821(Object object, Class341 class341, int i) {
		do {
			try {
				anInt1698++;
				if (((Class341) class341).anEventQueue4523 != null) {
					for (int i_0_ = i; i_0_ < 50
							&& ((Class341) class341).anEventQueue4523
									.peekEvent() != null; i_0_++)
						Class11_Sub51.method3236(1L, 0);
					try {
						if (object == null)
							break;
						((Class341) class341).anEventQueue4523
								.postEvent(new ActionEvent(object, 1001,
										"dummy"));
					} catch (Exception exception) {
						/* empty */
					}
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ea.A(" + (object != null ? "{...}" : "null") + ','
								+ (class341 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
		} while (false);
	}

	public static void method822(int i) {
		try {
			aString1691 = null;
			int i_1_ = 59 % ((i + 52) / 34);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.E(" + i + ')');
		}
	}

	final void method823(int i, int i_2_, byte[] is, byte i_3_)
			throws IOException {
		try {
			anInt1703++;
			if (!aBool1700) {
				if (aBool1689) {
					aBool1689 = false;
					throw new IOException();
				}
				if (aByteArray1706 == null)
					aByteArray1706 = new byte[anInt1692];
				if (i_3_ < 94)
					method827(true);
				synchronized (this) {
					for (int i_4_ = 0; i > i_4_; i_4_++) {
						aByteArray1706[anInt1699] = is[i_4_ + i_2_];
						anInt1699 = (1 + anInt1699) % anInt1692;
						if ((anInt1699 ^ 0xffffffff) == ((anInt1709 - (-anInt1692 + 100))
								% anInt1692 ^ 0xffffffff))
							throw new IOException();
					}
					if (aClass368_1702 == null)
						aClass368_1702 = aClass341_1701.method2063(2, this, 3);
					this.notifyAll();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("ea.C(" + i + ',' + i_2_
							+ ',' + (is != null ? "{...}" : "null") + ','
							+ i_3_ + ')'));
		}
	}

	public final void run() {
		try {
			anInt1696++;
			try {
				for (;;) {
					int i;
					int i_5_;
					synchronized (this) {
						if (anInt1709 == anInt1699) {
							if (aBool1700)
								break;
							try {
								this.wait();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
						i = anInt1709;
						if ((anInt1699 ^ 0xffffffff) <= (anInt1709 ^ 0xffffffff))
							i_5_ = anInt1699 - anInt1709;
						else
							i_5_ = -anInt1709 + anInt1692;
					}
					if ((i_5_ ^ 0xffffffff) < -1) {
						try {
							anOutputStream1690.write(aByteArray1706, i, i_5_);
						} catch (IOException ioexception) {
							aBool1689 = true;
						}
						anInt1709 = (anInt1709 + i_5_) % anInt1692;
						try {
							if ((anInt1709 ^ 0xffffffff) == (anInt1699 ^ 0xffffffff))
								anOutputStream1690.flush();
						} catch (IOException ioexception) {
							aBool1689 = true;
						}
					}
				}
				try {
					if (anInputStream1697 != null)
						anInputStream1697.close();
					if (anOutputStream1690 != null)
						anOutputStream1690.close();
					if (aSocket1707 != null)
						aSocket1707.close();
				} catch (IOException ioexception) {
					/* empty */
				}
				aByteArray1706 = null;
			} catch (Exception exception) {
				Class11_Sub12_Sub3.method3602((byte) -44, null, exception);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.run(" + ')');
		}
	}

	final void method824(int i, byte[] is, int i_6_, int i_7_)
			throws IOException {
		try {
			if (i_6_ < -100) {
				anInt1710++;
				if (!aBool1700) {
					while ((i ^ 0xffffffff) < -1) {
						int i_8_ = anInputStream1697.read(is, i_7_, i);
						if ((i_8_ ^ 0xffffffff) >= -1)
							throw new EOFException();
						i -= i_8_;
						i_7_ += i_8_;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ea.D(" + i + ',' + (is != null ? "{...}" : "null") + ','
							+ i_6_ + ',' + i_7_ + ')'));
		}
	}

	protected final void finalize() {
		try {
			anInt1695++;
			method825((byte) 78);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.finalize(" + ')');
		}
	}

	final void method825(byte i) {
		do {
			try {
				anInt1711++;
				if (!aBool1700) {
					synchronized (this) {
						aBool1700 = true;
						this.notifyAll();
					}
					if (aClass368_1702 != null) {
						while ((aClass368_1702.anInt4837 ^ 0xffffffff) == -1)
							Class11_Sub51.method3236(1L, 0);
						if (aClass368_1702.anInt4837 == 1) {
							try {
								((Thread) aClass368_1702.anObject4838).join();
							} catch (InterruptedException interruptedexception) {
								/* empty */
							}
						}
					}
					aClass368_1702 = null;
					if (i == 78)
						break;
					anInt1692 = 89;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ea.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method826(int i) throws IOException {
		try {
			anInt1693++;
			if (i > 63 && !aBool1700) {
				if (aBool1689) {
					aBool1689 = false;
					throw new IOException();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.J(" + i + ')');
		}
	}

	final void method827(boolean bool) {
		try {
			if (bool == false) {
				anInt1712++;
				if (!aBool1700) {
					anInputStream1697 = new InputStream_Sub1();
					anOutputStream1690 = new OutputStream_Sub2();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.I(" + bool + ')');
		}
	}

	Class126(Socket socket, Class341 class341, int i) throws IOException {
		aBool1689 = false;
		aBool1700 = false;
		anInt1709 = 0;
		try {
			aSocket1707 = socket;
			aClass341_1701 = class341;
			aSocket1707.setSoTimeout(30000);
			aSocket1707.setTcpNoDelay(true);
			anInputStream1697 = aSocket1707.getInputStream();
			anOutputStream1690 = aSocket1707.getOutputStream();
			anInt1692 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ea.<init>("
					+ (socket != null ? "{...}" : "null") + ','
					+ (class341 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	static final void method828(int i, boolean bool) {
		try {
			anInt1704++;
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5718));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5682));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub24_5684));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub3_5703));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub19_5732));
			if (i < 36)
				method819(null);
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub16_5721));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub18_5686));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub20_5687));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub26_5717));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub6_5697));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub11_5723));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub5_5695));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5712));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub15_5728));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub4_5691));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub29_5689));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							0,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699));
			Class328_Sub1.method2667(-92);
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							2,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub10_5727));
			Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
					.method2460(
							249682952,
							1,
							(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub7_5683));
			Class108_Sub13.method2653((byte) -108);
			Class376_Sub1.method2276(16711680);
			Class295.aBool3989 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ea.G(" + i + ','
					+ bool + ')');
		}
	}
}
