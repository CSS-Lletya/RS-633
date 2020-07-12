/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class290 {
	static int anInt3903;
	static int anInt3904;
	static int anInt3905;
	static int anInt3906;
	Class146 aClass146_3907;
	static IncomingPacket aClass160_3908;
	private Class22 aClass22_3909;
	static int anInt3910;
	static boolean[] aBoolArray3911 = new boolean[8];
	static int anInt3912;
	static int anInt3913;
	boolean aBool3914;
	private Class146 aClass146_3915;
	static int anInt3916;
	static int anInt3917;
	static int anInt3918;
	static IncomingPacket aClass160_3919;
	boolean aBool3920 = false;
	static int anInt3921;
	Class22 aClass22_3922;
	Class22 aClass22_3923;
	Class22 aClass22_3924;
	int anInt3925;

	final void method1785(int i, boolean bool) {
		try {
			anInt3910++;
			if (bool != ((Class290) this).aBool3920) {
				((Class290) this).aBool3920 = bool;
				if (i != 0)
					((Class290) this).aClass146_3907 = null;
				method1790((byte) 73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.E(" + i + ','
					+ bool + ')');
		}
	}

	final void method1786(int i, boolean bool) {
		do {
			try {
				anInt3916++;
				if (!bool == ((Class290) this).aBool3914) {
					((Class290) this).aBool3914 = bool;
					method1790((byte) 73);
					if (i == 8)
						break;
					method1787(19, -81);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qh.D(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	final void method1787(int i, int i_0_) {
		try {
			anInt3905++;
			synchronized (aClass22_3909) {
				aClass22_3909.method182(i, (byte) -73);
			}
			synchronized (((Class290) this).aClass22_3922) {
				((Class290) this).aClass22_3922.method182(i, (byte) -73);
			}
			if (i_0_ != 8)
				method1788((byte) 9);
			synchronized (((Class290) this).aClass22_3923) {
				((Class290) this).aClass22_3923.method182(i, (byte) -73);
			}
			synchronized (((Class290) this).aClass22_3924) {
				((Class290) this).aClass22_3924.method182(i, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1788(byte i) {
		try {
			synchronized (aClass22_3909) {
				aClass22_3909.method190(0);
				if (i != 26)
					anInt3921 = 30;
			}
			anInt3917++;
			synchronized (((Class290) this).aClass22_3922) {
				((Class290) this).aClass22_3922.method190(i - 26);
			}
			synchronized (((Class290) this).aClass22_3923) {
				((Class290) this).aClass22_3923.method190(i ^ 0x1a);
			}
			synchronized (((Class290) this).aClass22_3924) {
				((Class290) this).aClass22_3924.method190(0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.H(" + i + ')');
		}
	}

	static final void method1789(byte i, int i_1_) {
		try {
			if (i > -116)
				anInt3921 = 77;
			anInt3903++;
			synchronized (Class207.aClass22_2795) {
				Class207.aClass22_2795.method182(i_1_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.F(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method1790(byte i) {
		try {
			anInt3912++;
			synchronized (aClass22_3909) {
				aClass22_3909.method189((byte) -127);
			}
			synchronized (((Class290) this).aClass22_3922) {
				((Class290) this).aClass22_3922.method189((byte) -128);
			}
			synchronized (((Class290) this).aClass22_3923) {
				((Class290) this).aClass22_3923.method189((byte) -124);
				if (i != 73)
					method1793((byte) 63, 14);
			}
			synchronized (((Class290) this).aClass22_3924) {
				((Class290) this).aClass22_3924.method189((byte) -128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.A(" + i + ')');
		}
	}

	final void method1791(int i, int i_2_) {
		try {
			((Class290) this).anInt3925 = i_2_;
			anInt3904++;
			synchronized (((Class290) this).aClass22_3922) {
				((Class290) this).aClass22_3922.method189((byte) -127);
			}
			synchronized (((Class290) this).aClass22_3923) {
				((Class290) this).aClass22_3923.method189((byte) -16);
			}
			synchronized (((Class290) this).aClass22_3924) {
				((Class290) this).aClass22_3924.method189((byte) -125);
			}
			if (i < 54)
				((Class290) this).aClass146_3907 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.I(" + i + ','
					+ i_2_ + ')');
		}
	}

	final void method1792(int i, int i_3_) {
		try {
			aClass22_3909 = new Class22(i);
			int i_4_ = 95 % ((i_3_ - 60) / 57);
			anInt3913++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.B(" + i + ','
					+ i_3_ + ')');
		}
	}

	final Class42 method1793(byte i, int i_5_) {
		try {
			anInt3906++;
			Class42 class42;
			synchronized (aClass22_3909) {
				class42 = (Class42) aClass22_3909.method188((long) i_5_,
						(byte) 124);
			}
			if (class42 != null)
				return class42;
			byte[] is;
			synchronized (aClass146_3915) {
				int i_6_ = -83 / ((i - 74) / 34);
				is = aClass146_3915.method930(
						Class20.method169(i_5_, (byte) 11), (byte) 112,
						Class11_Sub45_Sub19.method3815(0, i_5_));
			}
			class42 = new Class42();
			((Class42) class42).anInt693 = i_5_;
			((Class42) class42).aClass290_614 = this;
			if (is != null)
				class42.method378(new Stream(is), (byte) -45);
			class42.method383(5);
			if (((Class42) class42).aBool624) {
				((Class42) class42).anInt685 = 0;
				((Class42) class42).aBool618 = false;
			}
			if (!((Class290) this).aBool3914 && ((Class42) class42).aBool675) {
				((Class42) class42).aStringArray599 = null;
				((Class42) class42).anIntArray676 = null;
			}
			synchronized (aClass22_3909) {
				aClass22_3909.method184((byte) 126, class42, (long) i_5_);
			}
			return class42;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.G(" + i + ','
					+ i_5_ + ')');
		}
	}

	public static void method1794(boolean bool) {
		try {
			if (bool == false) {
				aBoolArray3911 = null;
				aClass160_3908 = null;
				aClass160_3919 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qh.J(" + bool + ')');
		}
	}

	Class290(Class66 class66, int i, boolean bool, Class146 class146,
			Class146 class146_7_) {
		aClass22_3909 = new Class22(64);
		((Class290) this).aClass22_3922 = new Class22(500);
		((Class290) this).aClass22_3923 = new Class22(30);
		((Class290) this).aClass22_3924 = new Class22(50);
		do {
			try {
				((Class290) this).aBool3914 = bool;
				aClass146_3915 = class146;
				((Class290) this).aClass146_3907 = class146_7_;
				if (aClass146_3915 == null)
					break;
				int i_8_ = -1 + aClass146_3915.method928((byte) 20);
				aClass146_3915.method914(i_8_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("qh.<init>("
										+ (class66 != null ? "{...}" : "null")
										+ ','
										+ i
										+ ','
										+ bool
										+ ','
										+ (class146 != null ? "{...}" : "null")
										+ ','
										+ (class146_7_ != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass160_3908 = new IncomingPacket(68, 0);
		anInt3921 = -1;
		aClass160_3919 = new IncomingPacket(37, 8);
	}
}
