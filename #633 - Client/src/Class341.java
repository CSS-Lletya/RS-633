/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class Class341 implements Runnable {
	private static String aString4501;
	boolean aBool4502;
	private Class368 aClass368_4503;
	private static int anInt4504;
	private static volatile long aLong4505 = 0L;
	static String aString4506;
	private Thread aThread4507;
	private Object anObject4508;
	static String aString4509;
	Class119[] aClass119Array4510;
	Class119 aClass119_4511 = null;
	static String aString4512;
	private Object anObject4513;
	private Object anObject4514;
	private static String aString4515;
	private static String aString4516;
	static String aString4517;
	Class119 aClass119_4518;
	private Class184 aClass184_4519;
	boolean aBool4520;
	static String aString4521;
	private Callback_Sub1 aCallback_Sub1_4522;
	EventQueue anEventQueue4523;
	private boolean aBool4524;
	static Method aMethod4525;
	private Class368 aClass368_4526;
	Class119 aClass119_4527;
	static Method aMethod4528;
	/* synthetic */static Class aClass4529;
	/* synthetic */static Class aClass4530;
	/* synthetic */static Class aClass4531;
	/* synthetic */static Class aClass4532;

	private final Class368 method2053(int i, int i_0_, int i_1_, Object object,
			int i_2_) {
		try {
			Class368 class368 = new Class368();
			((Class368) class368).anInt4836 = i_2_;
			if (i != -1)
				aClass368_4503 = null;
			((Class368) class368).anObject4835 = object;
			class368.anInt4841 = i_1_;
			((Class368) class368).anInt4839 = i_0_;
			synchronized (this) {
				if (aClass368_4526 != null) {
					((Class368) aClass368_4526).aClass368_4840 = class368;
					aClass368_4526 = class368;
				} else
					aClass368_4526 = aClass368_4503 = class368;
				this.notify();
			}
			return class368;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Class119 method2054(String string, byte i) {
		try {
			if (i > -42)
				return null;
			return method2072(aString4516, 16895, string, anInt4504);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2055(int i, byte i_3_, int[] is, Point point,
			Component component, int i_4_) {
		try {
			if (i_3_ != 56)
				return null;
			return method2053(-1, 17, i_4_,
					new Object[] { component, is, point }, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2056(int i) {
		try {
			if (i != 0)
				method2062(98, null, null, null);
			return method2053(-1, 5, 0, null, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2057(URL url, int i) {
		try {
			int i_5_ = -110 / ((i - 71) / 45);
			return method2053(-1, 4, 0, url, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2058(Class var_class, String string, int i) {
		try {
			if (i <= 110)
				aString4501 = null;
			return method2053(-1, 9, 0, new Object[] { var_class, string }, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2059(String string, int i, boolean bool, int i_6_) {
		try {
			if (i_6_ != 22)
				return null;
			return method2053(i_6_ ^ ~0x16, !bool ? 1 : 22, i, string, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void run() {
		try {
			for (;;) {
				Class368 class368;
				synchronized (this) {
					for (;;) {
						if (aBool4524)
							return;
						if (aClass368_4503 != null) {
							class368 = aClass368_4503;
							aClass368_4503 = ((Class368) aClass368_4503).aClass368_4840;
							if (aClass368_4503 == null)
								aClass368_4526 = null;
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
				}
				try {
					int i = ((Class368) class368).anInt4839;
					if (i == 1) {
						if (Class137.method878((byte) -93) < aLong4505)
							throw new IOException();
						class368.anObject4838 = new Socket(
								(InetAddress
										.getByName((String) (((Class368) class368).anObject4835))),
								class368.anInt4841);
					} else if (i != 22) {
						if (i == 2) {
							Thread thread = new Thread(
									(Runnable) (((Class368) class368).anObject4835));
							thread.setDaemon(true);
							thread.start();
							thread.setPriority(class368.anInt4841);
							class368.anObject4838 = thread;
						} else if ((i ^ 0xffffffff) != -5) {
							if ((i ^ 0xffffffff) != -9) {
								if (i != 9) {
									if ((i ^ 0xffffffff) == -19) {
										Clipboard clipboard = Toolkit
												.getDefaultToolkit()
												.getSystemClipboard();
										class368.anObject4838 = clipboard
												.getContents(null);
									} else if (i != 19) {
										if (((Class341) this).aBool4520) {
											if ((i ^ 0xffffffff) == -4) {
												if (Class137
														.method878((byte) -84) < aLong4505)
													throw new IOException();
												String string = ((String
														.valueOf((class368.anInt4841 >> 24) & 0xff))
														+ "."
														+ ((class368.anInt4841 & 0xff80de) >> 16)
														+ "."
														+ ((class368.anInt4841 >> 8) & 0xff)
														+ "." + (class368.anInt4841 & 0xff));
												class368.anObject4838 = InetAddress
														.getByName(string)
														.getHostName();
											} else if ((i ^ 0xffffffff) != -22) {
												if ((i ^ 0xffffffff) == -6) {
													if (!((Class341) this).aBool4502)
														class368.anObject4838 = (Class
																.forName(
																		"Class214")
																.getMethod(
																		"listmodes",
																		(new Class[0]))
																.invoke(anObject4513,
																		(new Object[0])));
													else
														class368.anObject4838 = (aClass184_4519
																.method1204(0));
												} else if (i == 6) {
													Frame frame = (new Frame(
															"Jagex Full Screen"));
													class368.anObject4838 = frame;
													frame.setResizable(false);
													if (!((Class341) this).aBool4502)
														Class.forName(
																"Class214")
																.getMethod(
																		"enter",
																		(new Class[] {
																				((aClass4529 != null) ? aClass4529
																						: (aClass4529 = (getClassByName("java.awt.Frame")))),
																				Integer.TYPE,
																				Integer.TYPE,
																				Integer.TYPE,
																				(Integer.TYPE) }))
																.invoke(anObject4513,
																		(new Object[] {
																				frame,
																				(new Integer(
																						(class368.anInt4841) >>> 16)),
																				(new Integer(
																						(class368.anInt4841) & 0xffff)),
																				(new Integer(
																						(((Class368) class368).anInt4836) >> 16)),
																				(new Integer(
																						0xffff & (((Class368) class368).anInt4836))) }));
													else
														aClass184_4519
																.method1203(
																		(byte) -122,
																		frame,
																		((class368.anInt4841) & 0xffff),
																		((((Class368) class368).anInt4836) & 0xffff),
																		((((Class368) class368).anInt4836) >> 16),
																		((class368.anInt4841) >>> 16));
												} else if (i == 7) {
													if (!((Class341) this).aBool4502)
														Class.forName(
																"Class214")
																.getMethod(
																		"exit",
																		new Class[0])
																.invoke(anObject4513,
																		new Object[0]);
													else
														aClass184_4519
																.method1202(
																		-126,
																		((Frame) (((Class368) class368).anObject4835)));
												} else if (i == 12) {
													Class119 class119 = (method2072(
															aString4516,
															16895,
															((String) (((Class368) class368).anObject4835)),
															anInt4504));
													class368.anObject4838 = class119;
												} else if ((i ^ 0xffffffff) != -14) {
													if ((((Class341) this).aBool4520)
															&& i == 14) {
														int i_7_ = (class368.anInt4841);
														int i_8_ = (((Class368) class368).anInt4836);
														if (!((Class341) this).aBool4502)
															Class.forName(
																	"Class8")
																	.getDeclaredMethod(
																			"movemouse",
																			(new Class[] {
																					(Integer.TYPE),
																					(Integer.TYPE) }))
																	.invoke(anObject4514,
																			(new Object[] {
																					(new Integer(
																							i_7_)),
																					(new Integer(
																							i_8_)) }));
														else
															aCallback_Sub1_4522
																	.method2427(
																			i_8_,
																			i_7_,
																			false);
													} else if (((Class341) this).aBool4520
															&& i == 15) {
														boolean bool = (((class368.anInt4841) ^ 0xffffffff) != -1);
														Component component = ((Component) (((Class368) class368).anObject4835));
														if (((Class341) this).aBool4502)
															aCallback_Sub1_4522
																	.method2428(
																			component,
																			bool,
																			105);
														else
															Class.forName(
																	"Class8")
																	.getDeclaredMethod(
																			"showcursor",
																			(new Class[] {
																					((aClass4530 != null) ? aClass4530
																							: (aClass4530 = (getClassByName("java.awt.Component")))),
																					(Boolean.TYPE) }))
																	.invoke(anObject4514,
																			(new Object[] {
																					component,
																					(new Boolean(
																							bool)) }));
													} else if (!(((Class341) this).aBool4502)
															&& i == 17) {
														Object[] objects = ((Object[]) (((Class368) class368).anObject4835));
														Class.forName("Class8")
																.getDeclaredMethod(
																		"setcustomcursor",
																		(new Class[] {
																				((aClass4530 != null) ? aClass4530
																						: (aClass4530 = (getClassByName("java.awt.Component")))),
																				((aClass4531 != null) ? aClass4531
																						: (aClass4531 = (getClassByName("[I")))),
																				Integer.TYPE,
																				Integer.TYPE,
																				((aClass4532 != null) ? aClass4532
																						: (aClass4532 = (getClassByName("java.awt.Point")))) }))
																.invoke(anObject4514,
																		(new Object[] {
																				((Component) objects[0]),
																				((int[]) objects[1]),
																				(new Integer(
																						class368.anInt4841)),
																				(new Integer(
																						((Class368) class368).anInt4836)),
																				((Point) (objects[2])) }));
													} else if (i == 16) {
														try {
															if (!aString4512
																	.startsWith("win"))
																throw new Exception();
															String string = ((String) (((Class368) class368).anObject4835));
															if (!(string
																	.startsWith("http://"))
																	&& !(string
																			.startsWith("https://")))
																throw new Exception();
															String string_9_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
															for (int i_10_ = 0; (((string
																	.length()) ^ 0xffffffff) < (i_10_ ^ 0xffffffff)); i_10_++) {
																if ((string_9_
																		.indexOf(string
																				.charAt(i_10_))) == -1)
																	throw new Exception();
															}
															Runtime.getRuntime()
																	.exec("cmd /c start \"j\" \""
																			+ string
																			+ "\"");
															class368.anObject4838 = null;
														} catch (Exception exception) {
															class368.anObject4838 = exception;
															throw exception;
														}
													} else
														throw new Exception("");
												} else {
													Class119 class119 = (method2072(
															"",
															16895,
															((String) (((Class368) class368).anObject4835)),
															anInt4504));
													class368.anObject4838 = class119;
												}
											} else {
												if (aLong4505 > (Class137
														.method878((byte) -60)))
													throw new IOException();
												class368.anObject4838 = InetAddress
														.getByName(
																(String) (((Class368) class368).anObject4835))
														.getAddress();
											}
										} else
											throw new Exception("");
									} else {
										Transferable transferable = ((Transferable) (((Class368) class368).anObject4835));
										Clipboard clipboard = Toolkit
												.getDefaultToolkit()
												.getSystemClipboard();
										clipboard.setContents(transferable,
												null);
									}
								} else {
									Object[] objects = ((Object[]) ((Class368) class368).anObject4835);
									if (((Class341) this).aBool4520
											&& ((Class) objects[0])
													.getClassLoader() == null)
										throw new SecurityException();
									class368.anObject4838 = (((Class) objects[0])
											.getDeclaredField((String) objects[1]));
								}
							} else {
								Object[] objects = ((Object[]) ((Class368) class368).anObject4835);
								if (((Class341) this).aBool4520
										&& (((Class) objects[0])
												.getClassLoader() == null))
									throw new SecurityException();
								class368.anObject4838 = (((Class) objects[0])
										.getDeclaredMethod((String) objects[1],
												(Class[]) objects[2]));
							}
						} else {
							if (Class137.method878((byte) -42) < aLong4505)
								throw new IOException();
							class368.anObject4838 = new DataInputStream(
									((URL) (((Class368) class368).anObject4835))
											.openStream());
						}
					} else {
						if (aLong4505 > Class137.method878((byte) -122))
							throw new IOException();
						try {
							class368.anObject4838 = Class11_Sub15
									.method2425(
											48,
											class368.anInt4841,
											((String) ((Class368) class368).anObject4835))
									.method2006(-122);
						} catch (IOException_Sub1 ioexception_sub1) {
							class368.anObject4838 = ioexception_sub1
									.getMessage();
							throw ioexception_sub1;
						}
					}
					class368.anInt4837 = 1;
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					class368.anInt4837 = 2;
				}
				synchronized (class368) {
					class368.notify();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method2060(int i) {
		try {
			if (i != 18)
				aClass368_4503 = null;
			if (!((Class341) this).aBool4520)
				return false;
			if (((Class341) this).aBool4502) {
				if (aClass184_4519 == null)
					return false;
				return true;
			}
			if (anObject4513 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2061(int i, String string) {
		try {
			if (i <= 35)
				aString4509 = null;
			return method2053(-1, 16, 0, string, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2062(int i, String string, Class[] var_classes,
			Class var_class) {
		try {
			if (i != 255)
				return null;
			return method2053(i ^ ~0xff, 8, 0, new Object[] { var_class,
					string, var_classes }, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2063(int i, Runnable runnable, int i_11_) {
		try {
			if (i != 2)
				aString4521 = null;
			return method2053(-1, 2, i_11_, runnable, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2064(int i) {
		try {
			if (i > -35)
				method2067(43, null, null);
			aLong4505 = 5000L + Class137.method878((byte) -128);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2065(boolean bool, String string, int i) {
		try {
			if (i != -4053)
				method2061(-33, null);
			if (bool)
				return method2053(i + 4052, 12, 0, string, 0);
			return method2053(-1, 13, 0, string, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2066(boolean bool) {
		try {
			synchronized (this) {
				aBool4524 = true;
				if (bool != false)
					return;
				this.notifyAll();
			}
			try {
				aThread4507.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			if (((Class341) this).aClass119_4518 != null) {
				try {
					((Class341) this).aClass119_4518.method777(-13);
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (((Class341) this).aClass119_4511 != null) {
				try {
					((Class341) this).aClass119_4511.method777(-87);
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (((Class341) this).aClass119Array4510 != null) {
				for (int i = 0; ((Class341) this).aClass119Array4510.length > i; i++) {
					if (((Class341) this).aClass119Array4510[i] != null) {
						try {
							((Class341) this).aClass119Array4510[i]
									.method777(127);
						} catch (IOException ioexception) {
							/* empty */
						}
					}
				}
			}
			if (((Class341) this).aClass119_4527 != null) {
				try {
					((Class341) this).aClass119_4527.method777(124);
				} catch (IOException ioexception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method2067(int i, File file, byte[] is) {
		try {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, i, is.length);
				fileoutputstream.close();
				return true;
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2068(int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			int i_16_ = 72 / ((-15 - i_12_) / 33);
			return method2053(-1, 6, (i_15_ << 16) - -i_13_, null, i
					+ (i_14_ << 16));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2069(int i, byte i_17_) {
		try {
			if (i_17_ != 0)
				return null;
			return method2053(-1, 3, i, null, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Object method2070(byte i) {
		try {
			if (i < 101)
				return null;
			return anObject4508;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class368 method2071(Frame frame, int i) {
		try {
			if (i >= -50)
				((Class341) this).aClass119_4518 = null;
			return method2053(-1, 7, 0, frame, 0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final Class119 method2072(String string, int i,
			String string_18_, int i_19_) {
		try {
			String string_20_;
			if (i_19_ != 33) {
				if ((i_19_ ^ 0xffffffff) == -35)
					string_20_ = ("jagex_" + string + "_preferences"
							+ string_18_ + "_wip.dat");
				else
					string_20_ = ("jagex_" + string + "_preferences"
							+ string_18_ + ".dat");
			} else
				string_20_ = ("jagex_" + string + "_preferences" + string_18_ + "_rc.dat");
			String[] strings = { "c:/rscache/", "/rscache/", aString4501,
					"c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
			if (i != 16895)
				aString4517 = null;
			for (int i_21_ = 0; (strings.length ^ 0xffffffff) < (i_21_ ^ 0xffffffff); i_21_++) {
				String string_22_ = strings[i_21_];
				if (string_22_.length() <= 0 || new File(string_22_).exists()) {
					try {
						Class119 class119 = new Class119(new File(string_22_,
								string_20_), "rw", 10000L);
						return class119;
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	Class341(int i, String string, int i_23_, boolean bool) throws Exception {
		aClass368_4503 = null;
		((Class341) this).aBool4502 = false;
		((Class341) this).aClass119_4527 = null;
		((Class341) this).aBool4520 = false;
		aClass368_4526 = null;
		aBool4524 = false;
		((Class341) this).aClass119_4518 = null;
		try {
			aString4517 = "1.1";
			((Class341) this).aBool4520 = bool;
			aString4509 = "Unknown";
			aString4516 = string;
			anInt4504 = i;
			try {
				aString4509 = System.getProperty("java.vendor");
				aString4517 = System.getProperty("java.version");
			} catch (Exception exception) {
				/* empty */
			}
			if ((aString4509.toLowerCase().indexOf("microsoft") ^ 0xffffffff) != 0)
				((Class341) this).aBool4502 = true;
			try {
				aString4515 = System.getProperty("os.name");
			} catch (Exception exception) {
				aString4515 = "Unknown";
			}
			aString4512 = aString4515.toLowerCase();
			try {
				aString4521 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception exception) {
				aString4521 = "";
			}
			try {
				aString4506 = System.getProperty("os.version").toLowerCase();
			} catch (Exception exception) {
				aString4506 = "";
			}
			try {
				aString4501 = System.getProperty("user.home");
				if (aString4501 != null)
					aString4501 += "/";
			} catch (Exception exception) {
				/* empty */
			}
			if (aString4501 == null)
				aString4501 = "~/";
			try {
				((Class341) this).anEventQueue4523 = Toolkit
						.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable throwable) {
				/* empty */
			}
			if (!((Class341) this).aBool4502) {
				try {
					aMethod4525 = (Class.forName("java.awt.Component")
							.getDeclaredMethod("setFocusTraversalKeysEnabled",
									new Class[] { Boolean.TYPE }));
				} catch (Exception exception) {
					/* empty */
				}
				try {
					aMethod4528 = (Class.forName("java.awt.Container")
							.getDeclaredMethod("setFocusCycleRoot",
									new Class[] { Boolean.TYPE }));
				} catch (Exception exception) {
					/* empty */
				}
			}
			Class348.method2097(aString4516, anInt4504, false);
			if (((Class341) this).aBool4520) {
				((Class341) this).aClass119_4527 = new Class119(
						Class348.method2096("random.dat", null, anInt4504,
								(byte) 123), "rw", 25L);
				((Class341) this).aClass119_4518 = new Class119(
						Class348.method2098("main_file_cache.dat2", -1), "rw",
						209715200L);
				((Class341) this).aClass119_4511 = (new Class119(
						Class348.method2098("main_file_cache.idx255", -1),
						"rw", 1048576L));
				((Class341) this).aClass119Array4510 = new Class119[i_23_];
				for (int i_24_ = 0; (i_23_ ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++)
					((Class341) this).aClass119Array4510[i_24_] = new Class119(
							(Class348.method2098("main_file_cache.idx" + i_24_,
									-1)), "rw", 1048576L);
				if (((Class341) this).aBool4502) {
					try {
						anObject4508 = Class.forName("Class60").newInstance();
					} catch (Throwable throwable) {
						/* empty */
					}
				}
				try {
					if (!((Class341) this).aBool4502)
						anObject4513 = Class.forName("Class214").newInstance();
					else
						aClass184_4519 = new Class184();
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					if (!((Class341) this).aBool4502)
						anObject4514 = Class.forName("Class8").newInstance();
					else
						aCallback_Sub1_4522 = new Callback_Sub1();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			if (((Class341) this).aBool4520 && !((Class341) this).aBool4502) {
				ThreadGroup threadgroup = Thread.currentThread()
						.getThreadGroup();
				for (ThreadGroup threadgroup_25_ = threadgroup.getParent(); threadgroup_25_ != null; threadgroup_25_ = threadgroup
						.getParent())
					threadgroup = threadgroup_25_;
				Thread[] threads = new Thread[1000];
				threadgroup.enumerate(threads);
				for (int i_26_ = 0; (threads.length ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
					if (threads[i_26_] != null
							&& threads[i_26_].getName().startsWith("AWT"))
						threads[i_26_].setPriority(1);
				}
			}
			aBool4524 = false;
			aThread4507 = new Thread(this);
			aThread4507.setPriority(10);
			aThread4507.setDaemon(true);
			aThread4507.start();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
