/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class37 {
	static int anInt471;
	int[] anIntArray472;
	static int anInt473;
	static int anInt474;
	static int anInt475;
	private int anInt476 = 32;
	static int anInt477;
	static int anInt478;
	static int anInt479;
	static int anInt480;
	static int anInt481;
	private Class11_Sub6 aClass11_Sub6_482;
	static IncomingPacket aClass160_483 = new IncomingPacket(23, 0);
	static int anInt484;
	static int anInt485;
	static int anInt486 = 0;
	private long aLong487;
	static int anInt488;
	static int anInt489;
	private boolean aBool490 = false;
	static int anInt491;
	private Class11_Sub6[] aClass11_Sub6Array492;
	private Class11_Sub6[] aClass11_Sub6Array493;
	private int anInt494;
	private int anInt495;
	private long aLong496;
	private int anInt497;
	private int anInt498;
	private boolean aBool499;
	private long aLong500;
	int anInt501;
	private int anInt502;
	int anInt503;

	void method312(Component component) throws Exception {
		try {
			anInt489++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.E("
					+ (component != null ? "{...}" : "null") + ')');
		}
	}

	private final void method313(int[] is, int i) {
		int i_0_ = i;
		if (Class236_Sub1.aBool6092)
			i_0_ <<= 1;
		Class311.method1902(is, 0, i_0_);
		anInt497 -= i;
		if (aClass11_Sub6_482 != null && anInt497 <= 0) {
			anInt497 += Class119.anInt1610 >> 4;
			Class206.method1312((byte) 42, aClass11_Sub6_482);
			method320(aClass11_Sub6_482.method2317(), false, aClass11_Sub6_482);
			int i_1_ = 0;
			int i_2_ = 255;
			int i_3_ = 7;
			while_245_: while (i_2_ != 0) {
				int i_4_;
				int i_5_;
				if (i_3_ < 0) {
					i_4_ = i_3_ & 0x3;
					i_5_ = -(i_3_ >> 2);
				} else {
					i_4_ = i_3_;
					i_5_ = 0;
				}
				for (int i_6_ = i_2_ >>> i_4_ & 0x11111111; i_6_ != 0; i_6_ >>>= 4) {
					if ((i_6_ & 0x1) != 0) {
						i_2_ &= 1 << i_4_ ^ 0xffffffff;
						Class11_Sub6 class11_sub6 = null;
						Class11_Sub6 class11_sub6_7_ = aClass11_Sub6Array492[i_4_];
						while (class11_sub6_7_ != null) {
							Class11_Sub14 class11_sub14 = (((Class11_Sub6) class11_sub6_7_).aClass11_Sub14_5246);
							if (class11_sub14 != null
									&& (((Class11_Sub14) class11_sub14).anInt5518 > i_5_)) {
								i_2_ |= 1 << i_4_;
								class11_sub6 = class11_sub6_7_;
								class11_sub6_7_ = (((Class11_Sub6) class11_sub6_7_).aClass11_Sub6_5244);
							} else {
								((Class11_Sub6) class11_sub6_7_).aBool5247 = true;
								int i_8_ = class11_sub6_7_.method2314();
								i_1_ += i_8_;
								if (class11_sub14 != null)
									((Class11_Sub14) class11_sub14).anInt5518 += i_8_;
								if (i_1_ >= anInt476)
									break while_245_;
								Class11_Sub6 class11_sub6_9_ = class11_sub6_7_
										.method2319();
								if (class11_sub6_9_ != null) {
									int i_10_ = (((Class11_Sub6) class11_sub6_7_).anInt5245);
									for (/**/; class11_sub6_9_ != null; class11_sub6_9_ = class11_sub6_7_
											.method2316())
										method320(
												(i_10_
														* class11_sub6_9_
																.method2317() >> 8),
												false, class11_sub6_9_);
								}
								Class11_Sub6 class11_sub6_11_ = (((Class11_Sub6) class11_sub6_7_).aClass11_Sub6_5244);
								((Class11_Sub6) class11_sub6_7_).aClass11_Sub6_5244 = null;
								if (class11_sub6 == null)
									aClass11_Sub6Array492[i_4_] = class11_sub6_11_;
								else
									((Class11_Sub6) class11_sub6).aClass11_Sub6_5244 = class11_sub6_11_;
								if (class11_sub6_11_ == null)
									aClass11_Sub6Array493[i_4_] = class11_sub6;
								class11_sub6_7_ = class11_sub6_11_;
							}
						}
					}
					i_4_ += 4;
					i_5_++;
				}
				i_3_--;
			}
			for (int i_12_ = 0; i_12_ < 8; i_12_++) {
				Class11_Sub6 class11_sub6 = aClass11_Sub6Array492[i_12_];
				aClass11_Sub6Array492[i_12_] = aClass11_Sub6Array493[i_12_] = null;
				Class11_Sub6 class11_sub6_13_;
				for (/**/; class11_sub6 != null; class11_sub6 = class11_sub6_13_) {
					class11_sub6_13_ = ((Class11_Sub6) class11_sub6).aClass11_Sub6_5244;
					((Class11_Sub6) class11_sub6).aClass11_Sub6_5244 = null;
				}
			}
		}
		if (anInt497 < 0)
			anInt497 = 0;
		if (aClass11_Sub6_482 != null)
			aClass11_Sub6_482.method2318(is, 0, i);
		aLong487 = Class137.method878((byte) -123);
	}

	final synchronized void method314(int i) {
		try {
			anInt477++;
			if (!aBool490) {
				long l = Class137.method878((byte) -79);
				try {
					if ((6000L + aLong487 ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL))
						aLong487 = l - 6000L;
					for (/**/; ((aLong487 + 5000L ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)); l = Class137
							.method878((byte) -112)) {
						method327(256, 1);
						aLong487 += (long) (256000 / Class119.anInt1610);
					}
				} catch (Exception exception) {
					aLong487 = l;
				}
				if (((Class37) this).anIntArray472 != null) {
					try {
						if ((aLong496 ^ 0xffffffffffffffffL) != -1L) {
							if ((l ^ 0xffffffffffffffffL) > (aLong496 ^ 0xffffffffffffffffL))
								return;
							method317(((Class37) this).anInt503);
							aLong496 = 0L;
							aBool499 = true;
						}
						int i_14_ = method321();
						if (i != -8910)
							anInt497 = 80;
						if ((-i_14_ + anInt498 ^ 0xffffffff) < (anInt495 ^ 0xffffffff))
							anInt495 = anInt498 - i_14_;
						int i_15_ = anInt502 + ((Class37) this).anInt501;
						if (i_15_ + 256 > 16384)
							i_15_ = 16128;
						if ((((Class37) this).anInt503 ^ 0xffffffff) > (i_15_ + 256 ^ 0xffffffff)) {
							((Class37) this).anInt503 += 1024;
							if (((Class37) this).anInt503 > 16384)
								((Class37) this).anInt503 = 16384;
							method323();
							i_14_ = 0;
							method317(((Class37) this).anInt503);
							if ((((Class37) this).anInt503 ^ 0xffffffff) > (256 + i_15_ ^ 0xffffffff)) {
								i_15_ = -256 + ((Class37) this).anInt503;
								anInt502 = -((Class37) this).anInt501 + i_15_;
							}
							aBool499 = true;
						}
						for (/**/; i_14_ < i_15_; i_14_ += 256) {
							method313(((Class37) this).anIntArray472, 256);
							method325();
						}
						if (aLong500 < l) {
							if (aBool499)
								aBool499 = false;
							else {
								if (anInt495 == 0 && anInt494 == 0) {
									method323();
									aLong496 = l - -2000L;
									return;
								}
								anInt502 = Math.min(anInt494, anInt495);
								anInt494 = anInt495;
							}
							anInt495 = 0;
							aLong500 = l + 2000L;
						}
						anInt498 = i_14_;
					} catch (Exception exception) {
						method323();
						aLong496 = l - -2000L;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.F(" + i + ')');
		}
	}

	static final boolean method315(int i, int i_16_, int i_17_) {
		try {
			anInt484++;
			if (i_17_ != 0)
				method324((byte) -121);
			if ((0x800 & i ^ 0xffffffff) == -1 || (0x37 & i_16_) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jba.H(" + i + ','
					+ i_16_ + ',' + i_17_ + ')'));
		}
	}

	final synchronized void method316(int i) {
		do {
			try {
				aBool499 = true;
				anInt488++;
				try {
					method319();
					if (i == 12107)
						break;
					method314(104);
				} catch (Exception exception) {
					method323();
					aLong496 = Class137.method878((byte) -50) + 2000L;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jba.K(" + i + ')');
			}
		} while (false);
	}

	void method317(int i) throws Exception {
		try {
			anInt474++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.A(" + i + ')');
		}
	}

	static final Class343 method318(int i, boolean bool) {
		try {
			anInt481++;
			Class343 class343 = ((Class343) Class28.aClass22_384.method188(
					(long) i, (byte) 99));
			if (class343 != null)
				return class343;
			byte[] is = Class239_Sub1.aClass146_7269
					.method930(i, (byte) 112, 1);
			class343 = new Class343();
			((Class343) class343).anInt4545 = i;
			if (is != null)
				class343.method2079((byte) -56, new Stream(is));
			class343.method2080((byte) 124);
			if (bool != false)
				method324((byte) 7);
			if ((((Class343) class343).anInt4542 ^ 0xffffffff) == -3
					&& (Class35.aClass213_465.method1369((byte) 26, (long) i) == null)) {
				Class35.aClass213_465.method1368((long) i, new Class11_Sub51(
						Class20.anInt159), (byte) -26);
				Class49.aClass343Array756[Class20.anInt159++] = class343;
			}
			Class28.aClass22_384.method184((byte) 127, class343, (long) i);
			return class343;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.O(" + i + ','
					+ bool + ')');
		}
	}

	void method319() throws Exception {
		try {
			anInt473++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.I(" + ')');
		}
	}

	private final void method320(int i, boolean bool, Class11_Sub6 class11_sub6) {
		try {
			anInt491++;
			int i_18_ = i >> 5;
			Class11_Sub6 class11_sub6_19_ = aClass11_Sub6Array493[i_18_];
			if (class11_sub6_19_ == null)
				aClass11_Sub6Array492[i_18_] = class11_sub6;
			else
				((Class11_Sub6) class11_sub6_19_).aClass11_Sub6_5244 = class11_sub6;
			if (bool == false) {
				aClass11_Sub6Array493[i_18_] = class11_sub6;
				((Class11_Sub6) class11_sub6).anInt5245 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("jba.B(" + i + ',' + bool + ','
							+ (class11_sub6 != null ? "{...}" : "null") + ')'));
		}
	}

	int method321() throws Exception {
		try {
			anInt485++;
			return ((Class37) this).anInt503;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.M(" + ')');
		}
	}

	final synchronized void method322(byte i) {
		try {
			anInt475++;
			if (Class30.aClass175_403 != null) {
				boolean bool = true;
				for (int i_20_ = 0; i_20_ < 2; i_20_++) {
					if ((((Class175) Class30.aClass175_403).aClass37Array2232[i_20_]) == this)
						((Class175) Class30.aClass175_403).aClass37Array2232[i_20_] = null;
					if ((((Class175) Class30.aClass175_403).aClass37Array2232[i_20_]) != null)
						bool = false;
				}
				if (bool) {
					((Class175) Class30.aClass175_403).aBool2234 = true;
					while (((Class175) Class30.aClass175_403).aBool2229)
						Class11_Sub51.method3236(50L, 0);
					Class30.aClass175_403 = null;
				}
			}
			method323();
			((Class37) this).anIntArray472 = null;
			if (i < -96)
				aBool490 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.J(" + i + ')');
		}
	}

	void method323() {
		try {
			anInt479++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.N(" + ')');
		}
	}

	public static void method324(byte i) {
		try {
			if (i >= -45)
				anInt486 = 67;
			aClass160_483 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.D(" + i + ')');
		}
	}

	void method325() throws Exception {
		try {
			anInt471++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jba.C(" + ')');
		}
	}

	final synchronized void method326(boolean bool, Class11_Sub6 class11_sub6) {
		try {
			aClass11_Sub6_482 = class11_sub6;
			if (bool != true)
				method316(-34);
			anInt480++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jba.P(" + bool + ','
					+ (class11_sub6 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method327(int i, int i_21_) {
		do {
			try {
				anInt478++;
				anInt497 -= i;
				if ((anInt497 ^ 0xffffffff) > -1)
					anInt497 = 0;
				if (aClass11_Sub6_482 != null)
					aClass11_Sub6_482.method2315(i);
				if (i_21_ == 1)
					break;
				aLong500 = 126L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jba.L(" + i + ','
						+ i_21_ + ')');
			}
			break;
		} while (false);
	}

	public Class37() {
		aLong487 = Class137.method878((byte) -112);
		anInt494 = 0;
		aLong496 = 0L;
		anInt497 = 0;
		aLong500 = 0L;
		anInt495 = 0;
		aClass11_Sub6Array492 = new Class11_Sub6[8];
		aClass11_Sub6Array493 = new Class11_Sub6[8];
		anInt498 = 0;
		aBool499 = true;
	}
}
