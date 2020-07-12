/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class187 {
	static int anInt2381;
	static int anInt2382;
	static int anInt2383;
	static int anInt2384;
	static int anInt2385;
	static int anInt2386;
	static int anInt2387;
	static Class52 aClass52_2388;
	static int anInt2389;
	static int anInt2390;
	static int anInt2391;
	static int anInt2392;
	static int anInt2393;
	static int anInt2394;
	private Class38 aClass38_2395 = new Class38();
	static int anInt2396;
	static int anInt2397;
	private Class38 aClass38_2398 = new Class38();
	private Class38 aClass38_2399 = new Class38();
	private Class38 aClass38_2400 = new Class38();
	private int anInt2401;
	private Stream aClass11_Sub20_2402 = new Stream(4);
	private long aLong2403;
	private Class126 aClass126_2404;
	volatile int anInt2405 = 0;
	private Stream aClass11_Sub20_2406;
	volatile int anInt2407;
	private byte aByte2408 = 0;
	private Class11_Sub45_Sub20_Sub2 aClass11_Sub45_Sub20_Sub2_2409;

	final void method1215(boolean bool) {
		try {
			anInt2386++;
			if (aClass126_2404 != null) {
				try {
					((Stream) aClass11_Sub20_2402).position = 0;
					aClass11_Sub20_2402.writeByte(7, -1528071456);
					aClass11_Sub20_2402.method2555(1333491824, 0);
					if (bool == false)
						aClass126_2404.method823(4, 0,
								(((Stream) aClass11_Sub20_2402).buffer),
								(byte) 95);
				} catch (IOException ioexception) {
					try {
						aClass126_2404.method825((byte) 78);
					} catch (Exception exception) {
						/* empty */
					}
					aClass126_2404 = null;
					((Class187) this).anInt2407 = -2;
					((Class187) this).anInt2405++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.O(" + bool + ')');
		}
	}

	final boolean method1216(int i) {
		try {
			if (aClass126_2404 != null) {
				long l = Class137.method878((byte) -91);
				int i_0_ = (int) (l - aLong2403);
				if (i_0_ > 200)
					i_0_ = 200;
				aLong2403 = l;
				anInt2401 += i_0_;
				if ((anInt2401 ^ 0xffffffff) < -30001) {
					try {
						aClass126_2404.method825((byte) 78);
					} catch (Exception exception) {
						/* empty */
					}
					aClass126_2404 = null;
				}
			}
			anInt2391++;
			if (aClass126_2404 == null) {
				if (method1230(true) != 0 || (method1218(0) ^ 0xffffffff) != -1)
					return false;
				return true;
			}
			try {
				aClass126_2404.method826(125);
				for (Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2395
						.method331((byte) -7)); class11_sub45_sub20_sub2 != null; class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2395
						.method333(-40))) {
					((Stream) aClass11_Sub20_2402).position = 0;
					aClass11_Sub20_2402.writeByte(1, -1528071456);
					aClass11_Sub20_2402
							.method2555(
									1333491824,
									(int) (((Class11_Sub45) class11_sub45_sub20_sub2).aLong7904));
					aClass126_2404
							.method823(4, 0,
									(((Stream) aClass11_Sub20_2402).buffer),
									(byte) 109);
					aClass38_2398.method330(class11_sub45_sub20_sub2, 21934);
				}
				if (i > -124)
					aClass126_2404 = null;
				for (Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2399
						.method331((byte) -7)); class11_sub45_sub20_sub2 != null; class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2399
						.method333(-77))) {
					((Stream) aClass11_Sub20_2402).position = 0;
					aClass11_Sub20_2402.writeByte(0, -1528071456);
					aClass11_Sub20_2402
							.method2555(
									1333491824,
									(int) (((Class11_Sub45) class11_sub45_sub20_sub2).aLong7904));
					aClass126_2404
							.method823(4, 0,
									(((Stream) aClass11_Sub20_2402).buffer),
									(byte) 113);
					aClass38_2400.method330(class11_sub45_sub20_sub2, 21934);
				}
				for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -101; i_1_++) {
					int i_2_ = aClass126_2404.method820(-128);
					if (i_2_ < 0)
						throw new IOException();
					if (i_2_ == 0)
						break;
					anInt2401 = 0;
					int i_3_ = 0;
					if (aClass11_Sub45_Sub20_Sub2_2409 == null)
						i_3_ = 8;
					else if (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 == 0)
						i_3_ = 1;
					if ((i_3_ ^ 0xffffffff) >= -1) {
						int i_4_ = ((((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).buffer).length + -((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aByte10212);
						int i_5_ = 512 - (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215);
						if (i_5_ > (-((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position + i_4_))
							i_5_ = i_4_
									+ -((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position;
						if (i_5_ > i_2_)
							i_5_ = i_2_;
						aClass126_2404
								.method824(
										i_5_,
										((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).buffer,
										-108,
										((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position);
						if ((aByte2408 ^ 0xffffffff) != -1) {
							for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_6_++)
								((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).buffer[(((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position + i_6_)] = (byte) (Class77
										.method527(
												(((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).buffer[(((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position)
														+ i_6_]), aByte2408));
						}
						((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 += i_5_;
						((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position += i_5_;
						if (i_4_ == ((Stream) (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218)).position) {
							aClass11_Sub45_Sub20_Sub2_2409.method3187(100);
							((Class11_Sub45_Sub20) aClass11_Sub45_Sub20_Sub2_2409).aBool9737 = false;
							aClass11_Sub45_Sub20_Sub2_2409 = null;
						} else if (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 == 512)
							((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 = 0;
					} else {
						int i_7_ = i_3_
								- ((Stream) aClass11_Sub20_2406).position;
						if (i_2_ < i_7_)
							i_7_ = i_2_;
						aClass126_2404.method824(i_7_,
								((Stream) aClass11_Sub20_2406).buffer, -115,
								((Stream) aClass11_Sub20_2406).position);
						if ((aByte2408 ^ 0xffffffff) != -1) {
							for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
								((Stream) aClass11_Sub20_2406).buffer[(((Stream) aClass11_Sub20_2406).position - -i_8_)] = (byte) (Class77
										.method527(
												(((Stream) aClass11_Sub20_2406).buffer[(((Stream) aClass11_Sub20_2406).position)
														+ i_8_]), aByte2408));
						}
						((Stream) aClass11_Sub20_2406).position += i_7_;
						if (i_3_ <= ((Stream) aClass11_Sub20_2406).position) {
							if (aClass11_Sub45_Sub20_Sub2_2409 == null) {
								((Stream) aClass11_Sub20_2406).position = 0;
								int i_9_ = aClass11_Sub20_2406
										.readUnsignedByte((byte) 35);
								int i_10_ = aClass11_Sub20_2406
										.readUnsignedShort((byte) -65);
								int i_11_ = aClass11_Sub20_2406
										.readUnsignedByte((byte) 35);
								int i_12_ = aClass11_Sub20_2406.readInt(98);
								int i_13_ = i_11_ & 0x7f;
								boolean bool = (i_11_ & 0x80) != 0;
								long l = (long) (i_10_ + (i_9_ << 16));
								Object object = null;
								Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2;
								if (bool) {
									for (class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2400
											.method331((byte) -7)); class11_sub45_sub20_sub2 != null; class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2400
											.method333(-110))) {
										if ((((Class11_Sub45) class11_sub45_sub20_sub2).aLong7904) == l)
											break;
									}
								} else {
									for (class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2398
											.method331((byte) -7)); class11_sub45_sub20_sub2 != null; class11_sub45_sub20_sub2 = ((Class11_Sub45_Sub20_Sub2) aClass38_2398
											.method333(-50))) {
										if (l == (((Class11_Sub45) class11_sub45_sub20_sub2).aLong7904))
											break;
									}
								}
								if (class11_sub45_sub20_sub2 == null)
									throw new IOException();
								int i_14_ = i_13_ != 0 ? 9 : 5;
								aClass11_Sub45_Sub20_Sub2_2409 = class11_sub45_sub20_sub2;
								((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218 = (new Stream(
										i_12_
												+ i_14_
												+ (((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aByte10212)));
								((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218
										.writeByte(i_13_, -1528071456);
								((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).aClass11_Sub20_10218
										.writeInt(-49, i_12_);
								((Stream) aClass11_Sub20_2406).position = 0;
								((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 = 8;
							} else if (((((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215) ^ 0xffffffff) == -1) {
								if ((((Stream) aClass11_Sub20_2406).buffer[0]) == -1) {
									((Stream) aClass11_Sub20_2406).position = 0;
									((Class11_Sub45_Sub20_Sub2) aClass11_Sub45_Sub20_Sub2_2409).anInt10215 = 1;
								} else
									aClass11_Sub45_Sub20_Sub2_2409 = null;
							} else
								throw new IOException();
						}
					}
				}
				return true;
			} catch (IOException ioexception) {
				try {
					aClass126_2404.method825((byte) 78);
				} catch (Exception exception) {
					/* empty */
				}
				((Class187) this).anInt2405++;
				aClass126_2404 = null;
				((Class187) this).anInt2407 = -2;
				if ((method1230(true) ^ 0xffffffff) != -1
						|| (method1218(0) ^ 0xffffffff) != -1)
					return false;
				return true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.J(" + i + ')');
		}
	}

	final Class11_Sub45_Sub20_Sub2 method1217(byte i, boolean bool, byte i_15_,
			int i_16_, int i_17_) {
		try {
			anInt2394++;
			long l = (long) (i_16_ + (i_17_ << 16));
			Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = new Class11_Sub45_Sub20_Sub2();
			((Class11_Sub45_Sub20) class11_sub45_sub20_sub2).aBool9736 = bool;
			((Class11_Sub45) class11_sub45_sub20_sub2).aLong7904 = l;
			if (i != 75)
				aClass38_2399 = null;
			((Class11_Sub45_Sub20_Sub2) class11_sub45_sub20_sub2).aByte10212 = i_15_;
			if (bool) {
				if ((method1230(true) ^ 0xffffffff) <= -21)
					throw new RuntimeException();
				aClass38_2395.method330(class11_sub45_sub20_sub2, i + 21859);
			} else {
				if (method1218(0) >= 20)
					throw new RuntimeException();
				aClass38_2399.method330(class11_sub45_sub20_sub2, 21934);
			}
			return class11_sub45_sub20_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iq.L(" + i + ','
					+ bool + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	private final int method1218(int i) {
		try {
			anInt2387++;
			if (i != 0)
				method1218(-79);
			return (aClass38_2399.method332((byte) -98) + aClass38_2400
					.method332((byte) -112));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.I(" + i + ')');
		}
	}

	static final Class35[] method1219(Class341 class341, byte i) {
		try {
			anInt2397++;
			if (i != 1)
				return null;
			if (!class341.method2060(18))
				return new Class35[0];
			Class368 class368 = class341.method2056(i ^ 0x1);
			while (class368.anInt4837 == 0)
				Class11_Sub51.method3236(10L, 0);
			if (class368.anInt4837 == 2)
				return new Class35[0];
			int[] is = (int[]) class368.anObject4838;
			Class35[] class35s = new Class35[is.length >> 2];
			for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > (class35s.length ^ 0xffffffff); i_18_++) {
				Class35 class35 = new Class35();
				class35s[i_18_] = class35;
				((Class35) class35).anInt464 = is[i_18_ << 2];
				((Class35) class35).anInt467 = is[(i_18_ << 2) + 1];
				((Class35) class35).anInt466 = is[2 + (i_18_ << 2)];
				((Class35) class35).anInt468 = is[3 + (i_18_ << 2)];
			}
			return class35s;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.P("
					+ (class341 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method1220(byte i) {
		do {
			try {
				if (i <= -90) {
					anInt2381++;
					if (aClass126_2404 == null)
						break;
					aClass126_2404.method827(false);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "iq.C(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1221(Class126 class126, boolean bool, int i) {
		try {
			anInt2392++;
			if (aClass126_2404 != null) {
				try {
					aClass126_2404.method825((byte) 78);
				} catch (Exception exception) {
					/* empty */
				}
				aClass126_2404 = null;
			}
			aClass126_2404 = class126;
			method1224((byte) -67);
			method1226((byte) 0, bool);
			aClass11_Sub45_Sub20_Sub2_2409 = null;
			((Stream) aClass11_Sub20_2406).position = 0;
			for (;;) {
				Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = (Class11_Sub45_Sub20_Sub2) aClass38_2398
						.method328(0);
				if (class11_sub45_sub20_sub2 == null)
					break;
				aClass38_2395.method330(class11_sub45_sub20_sub2, 21934);
			}
			for (;;) {
				Class11_Sub45_Sub20_Sub2 class11_sub45_sub20_sub2 = (Class11_Sub45_Sub20_Sub2) aClass38_2400
						.method328(0);
				if (class11_sub45_sub20_sub2 == null)
					break;
				aClass38_2399.method330(class11_sub45_sub20_sub2, 21934);
			}
			if (i == -25904) {
				if ((aByte2408 ^ 0xffffffff) != -1) {
					try {
						((Stream) aClass11_Sub20_2402).position = 0;
						aClass11_Sub20_2402.writeByte(4, -1528071456);
						aClass11_Sub20_2402
								.writeByte(aByte2408, i ^ 0x5b14e030);
						aClass11_Sub20_2402.writeShort(-124, 0);
						aClass126_2404.method823(4, 0,
								(((Stream) aClass11_Sub20_2402).buffer),
								(byte) 104);
					} catch (IOException ioexception) {
						try {
							aClass126_2404.method825((byte) 78);
						} catch (Exception exception) {
							/* empty */
						}
						((Class187) this).anInt2405++;
						((Class187) this).anInt2407 = -2;
						aClass126_2404 = null;
					}
				}
				anInt2401 = 0;
				aLong2403 = Class137.method878((byte) -88);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iq.G("
					+ (class126 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}

	final boolean method1222(byte i) {
		try {
			anInt2396++;
			if (i < 105)
				method1219(null, (byte) -43);
			if (method1218(0) < 20)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.H(" + i + ')');
		}
	}

	final void method1223(byte i) {
		do {
			try {
				anInt2393++;
				if (i == -65) {
					if (aClass126_2404 == null)
						break;
					aClass126_2404.method825((byte) 78);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "iq.K(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method1224(byte i) {
		try {
			anInt2384++;
			if (aClass126_2404 != null) {
				try {
					((Stream) aClass11_Sub20_2402).position = 0;
					aClass11_Sub20_2402.writeByte(6, -1528071456);
					aClass11_Sub20_2402.method2555(i ^ ~0x4f7b7832, 3);
					if (i != -67)
						((Class187) this).anInt2407 = 110;
					aClass126_2404
							.method823(4, 0,
									(((Stream) aClass11_Sub20_2402).buffer),
									(byte) 118);
				} catch (IOException ioexception) {
					try {
						aClass126_2404.method825((byte) 78);
					} catch (Exception exception) {
						/* empty */
					}
					((Class187) this).anInt2407 = -2;
					aClass126_2404 = null;
					((Class187) this).anInt2405++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.N(" + i + ')');
		}
	}

	final void method1225(byte i) {
		try {
			anInt2385++;
			try {
				aClass126_2404.method825((byte) 78);
			} catch (Exception exception) {
				/* empty */
			}
			((Class187) this).anInt2405++;
			((Class187) this).anInt2407 = -1;
			aByte2408 = (byte) (int) (255.0 * Math.random() + 1.0);
			aClass126_2404 = null;
			int i_19_ = -55 / ((42 - i) / 55);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.A(" + i + ')');
		}
	}

	final void method1226(byte i, boolean bool) {
		do {
			try {
				anInt2383++;
				if (aClass126_2404 != null) {
					try {
						((Stream) aClass11_Sub20_2402).position = 0;
						aClass11_Sub20_2402
								.writeByte(bool ? 2 : 3, -1528071456);
						aClass11_Sub20_2402.method2555(1333491824, 0);
						aClass126_2404.method823(4, 0,
								(((Stream) aClass11_Sub20_2402).buffer),
								(byte) 99);
					} catch (IOException ioexception) {
						try {
							aClass126_2404.method825((byte) 78);
						} catch (Exception exception) {
							/* empty */
						}
						aClass126_2404 = null;
						((Class187) this).anInt2407 = -2;
						((Class187) this).anInt2405++;
					}
					if (i == 0)
						break;
					((Class187) this).anInt2407 = -109;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "iq.D(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	static final int method1227(byte i) {
		try {
			if (i != 54)
				return 13;
			anInt2390++;
			if (Class355.aFrame4658 != null)
				return 3;
			if (!Class251_Sub2.aBool5439)
				return 1;
			return 2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.M(" + i + ')');
		}
	}

	public static void method1228(int i) {
		do {
			try {
				aClass52_2388 = null;
				if (i < -36)
					break;
				aClass52_2388 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "iq.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1229(byte i) {
		try {
			if (i < 104)
				method1229((byte) -92);
			anInt2382++;
			if ((method1230(true) ^ 0xffffffff) > -21)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.B(" + i + ')');
		}
	}

	final int method1230(boolean bool) {
		try {
			if (bool != true)
				method1219(null, (byte) 11);
			anInt2389++;
			return (aClass38_2395.method332((byte) -89) - -aClass38_2398
					.method332((byte) -113));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iq.F(" + bool + ')');
		}
	}

	public Class187() {
		((Class187) this).anInt2407 = 0;
		aClass11_Sub20_2406 = new Stream(8);
	}
}
