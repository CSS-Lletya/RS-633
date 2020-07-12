/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Constructor;

final class Class327 {
	int anInt4353 = -1;
	int anInt4354 = 512;
	static int anInt4355;
	boolean aBool4356;
	static int anInt4357;
	static int anInt4358;
	static int anInt4359;
	int anInt4360;
	int anInt4361;
	static Class292 aClass292_4362;
	static int anInt4363;
	boolean aBool4364 = true;
	int anInt4365;
	int anInt4366;
	static int anInt4367;
	private int anInt4368;
	static int anInt4369;
	/* synthetic */static Class aClass4370;

	static final Class225 method1982(int i, boolean bool, Component component) {
		try {
			anInt4357++;
			try {
				if (i != -2451)
					return null;
				Constructor constructor = (Class.forName("Class225_Sub2")
						.getDeclaredConstructor(new Class[] {
								(aClass4370 != null ? aClass4370
										: (aClass4370 = getClassByName("java.awt.Component"))),
								Boolean.TYPE }));
				return ((Class225) constructor.newInstance(new Object[] {
						component, new Boolean(bool) }));
			} catch (Throwable throwable) {
				return new Class225_Sub1(component, bool);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tr.F(" + i + ',' + bool + ','
							+ (component != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1983(int i) {
		try {
			int i_0_ = -55 / ((i + 51) / 62);
			aClass292_4362 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tr.C(" + i + ')');
		}
	}

	static final int method1984(int i, int i_1_, String string, byte[] is) {
		try {
			anInt4355++;
			int i_2_ = i;
			int i_3_ = string.length();
			if (i_1_ != 17363)
				aClass292_4362 = null;
			for (int i_4_ = 0; i_3_ > i_4_; i_4_ += 4) {
				int i_5_ = Class85.method596((byte) -123, string.charAt(i_4_));
				int i_6_ = ((i_4_ + 1 ^ 0xffffffff) > (i_3_ ^ 0xffffffff) ? Class85
						.method596((byte) -123, string.charAt(i_4_ + 1)) : -1);
				int i_7_ = ((i_4_ + 2 ^ 0xffffffff) <= (i_3_ ^ 0xffffffff) ? -1
						: Class85.method596((byte) -123,
								string.charAt(2 + i_4_)));
				int i_8_ = (3 + i_4_ >= i_3_ ? -1 : Class85.method596(
						(byte) -123, string.charAt(3 + i_4_)));
				is[i++] = (byte) Class173.method1134(i_5_ << 2, i_6_ >>> 4);
				if (i_7_ == -1)
					break;
				is[i++] = (byte) Class173.method1134(i_7_ >>> 2,
						Class77.method529(240, i_6_ << 4));
				if (i_8_ == -1)
					break;
				is[i++] = (byte) Class173.method1134(i_8_,
						(Class77.method529(3, i_7_) << 6));
			}
			return -i_2_ + i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tr.G(" + i + ','
					+ i_1_ + ',' + (string != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1985(int i, int i_9_, int i_10_, int i_11_,
			Actor class376_sub7_sub5_sub5) {
		try {
			anInt4367++;
			Class39 class39 = class376_sub7_sub5_sub5.method3960(21816);
			if (i_10_ == 1) {
				int i_12_ = ((-((Class173) (((Actor) class376_sub7_sub5_sub5).aClass173_10278)).anInt2220 + (((Actor) class376_sub7_sub5_sub5).anInt10363)) & 0x3fff);
				if ((i_11_ ^ 0xffffffff) == 0) {
					if ((i_12_ ^ 0xffffffff) == -1
							&& (((Actor) class376_sub7_sub5_sub5).anInt10321) <= 25) {
						if (!((Actor) class376_sub7_sub5_sub5).aBool10329
								|| !class39
										.method339(
												(((Actor) class376_sub7_sub5_sub5).anInt10291),
												(byte) 64)) {
							((Actor) class376_sub7_sub5_sub5).anInt10291 = class39
									.method337(i_10_ - 2);
							((Actor) class376_sub7_sub5_sub5).aBool10329 = ((Actor) class376_sub7_sub5_sub5).anInt10291 != -1;
						}
					} else {
						if (i_9_ >= 0 || ((Class39) class39).anInt538 == -1) {
							if ((i_9_ ^ 0xffffffff) >= -1
									|| ((Class39) class39).anInt552 == -1)
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt561;
							else
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt552;
						} else {
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt538;
							((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
						}
						((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
					}
				} else if ((((Actor) class376_sub7_sub5_sub5).faceEntity ^ 0xffffffff) == 0
						|| i_12_ < 10240 && (i_12_ ^ 0xffffffff) < -2049) {
					if ((i_12_ ^ 0xffffffff) != -1
							|| (((Actor) class376_sub7_sub5_sub5).anInt10321) > 25) {
						((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
						if ((i_11_ ^ 0xffffffff) != -3
								|| ((Class39) class39).anInt525 == -1) {
							if (i_11_ != 0
									|| ((Class39) class39).anInt540 == -1) {
								if ((i_9_ ^ 0xffffffff) > -1
										&& (((Class39) class39).anInt559 ^ 0xffffffff) != 0)
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt559;
								else if ((i_9_ ^ 0xffffffff) >= -1
										|| (((Class39) class39).anInt532 ^ 0xffffffff) == 0)
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt561;
								else
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt532;
							} else if (i_9_ >= 0
									|| ((Class39) class39).anInt566 == -1) {
								if (i_9_ > 0
										&& ((Class39) class39).anInt557 != -1)
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt557;
								else
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt540;
							} else
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt566;
						} else if ((i_9_ ^ 0xffffffff) <= -1
								|| ((Class39) class39).anInt527 == -1) {
							if ((i_9_ ^ 0xffffffff) >= -1
									|| ((((Class39) class39).anInt574 ^ 0xffffffff) == 0))
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt525;
							else
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt574;
						} else
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt527;
					} else {
						((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
						if (i_11_ == 2
								&& (((Class39) class39).anInt525 ^ 0xffffffff) != 0)
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt525;
						else if ((i_11_ ^ 0xffffffff) != -1
								|| ((Class39) class39).anInt540 == -1)
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt561;
						else
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt540;
					}
				} else {
					int i_13_ = ((Class249.anIntArray3411[i] - ((Class173) (((Actor) class376_sub7_sub5_sub5).aClass173_10278)).anInt2220) & 0x3fff);
					if (i_11_ == 2
							&& (((Class39) class39).anInt525 ^ 0xffffffff) != 0) {
						if (i_13_ <= 2048
								|| (i_13_ ^ 0xffffffff) < -6145
								|| ((((Class39) class39).anInt555 ^ 0xffffffff) == 0)) {
							if ((i_13_ ^ 0xffffffff) > -10241
									|| (i_13_ ^ 0xffffffff) <= -14337
									|| ((Class39) class39).anInt569 == -1) {
								if (i_13_ > 6144
										&& i_13_ < 10240
										&& (((Class39) class39).anInt573 ^ 0xffffffff) != 0)
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt573;
								else
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt525;
							} else
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt569;
						} else
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt555;
					} else if (i_11_ != 0 || ((Class39) class39).anInt540 == -1) {
						if (i_13_ <= 2048 || i_13_ > 6144
								|| ((Class39) class39).anInt531 == -1) {
							if (i_13_ < 10240
									|| i_13_ >= 14336
									|| ((((Class39) class39).anInt524 ^ 0xffffffff) == 0)) {
								if ((i_13_ ^ 0xffffffff) < -6145
										&& (i_13_ ^ 0xffffffff) > -10241
										&& (((Class39) class39).anInt567 ^ 0xffffffff) != 0)
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt567;
								else
									((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt561;
							} else
								((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt524;
						} else
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt531;
					} else if ((i_13_ ^ 0xffffffff) >= -2049
							|| (i_13_ ^ 0xffffffff) < -6145
							|| ((Class39) class39).anInt546 == -1) {
						if (i_13_ >= 10240
								&& (i_13_ ^ 0xffffffff) > -14337
								&& ((((Class39) class39).anInt551 ^ 0xffffffff) != 0))
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt551;
						else if ((i_13_ ^ 0xffffffff) >= -6145
								|| i_13_ >= 10240
								|| ((Class39) class39).anInt568 == -1)
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt540;
						else
							((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt568;
					} else
						((Actor) class376_sub7_sub5_sub5).anInt10291 = ((Class39) class39).anInt546;
					((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tr.E("
							+ i
							+ ','
							+ i_9_
							+ ','
							+ i_10_
							+ ','
							+ i_11_
							+ ','
							+ (class376_sub7_sub5_sub5 != null ? "{...}"
									: "null") + ')'));
		}
	}

	private final void method1986(Stream stream, int i, boolean bool) {
		try {
			anInt4359++;
			if (bool != true)
				method1985(48, -10, 44, -74, null);
			if (i != 1) {
				if (i != 2) {
					if ((i ^ 0xffffffff) == -4)
						((Class327) this).anInt4354 = stream
								.readUnsignedShort((byte) -65) << 2;
					else if ((i ^ 0xffffffff) != -5) {
						if ((i ^ 0xffffffff) == -6)
							((Class327) this).aBool4364 = false;
					} else
						((Class327) this).aBool4356 = false;
				} else {
					((Class327) this).anInt4353 = stream
							.readUnsignedShort((byte) -65);
					if ((((Class327) this).anInt4353 ^ 0xffffffff) == -65536)
						((Class327) this).anInt4353 = -1;
				}
			} else {
				anInt4368 = stream.method2558(false);
				method1988((byte) -71, anInt4368);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tr.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ')'));
		}
	}

	static final void method1987(int i, int i_14_) {
		try {
			anInt4369++;
			int i_15_ = -Class11_Sub41.anInt7255 + Class11_Sub25.anInt6279;
			if (i_15_ >= 100) {
				Class191.anInt2453 = 1;
				Canvas_Sub1.anInt9233 = Class170.anInt2186 = -1;
			} else {
				if (i_14_ != -128)
					method1985(-8, 75, -48, -40, null);
				int i_16_ = (int) Class219_Sub1.aFloat7244;
				if ((i_16_ ^ 0xffffffff) > (Class300.anInt4050 >> 8 ^ 0xffffffff))
					i_16_ = Class300.anInt4050 >> 8;
				if (Class11_Sub45_Sub19.aBoolArray9711[4]
						&& i_16_ < Class339.anIntArray4488[4] + 128)
					i_16_ = 128 + Class339.anIntArray4488[4];
				int i_17_ = 0x3fff & (Class256_Sub2.anInt7703 + (int) Class2_Sub8.aFloat6868);
				Class134.method862(
						(Class318
								.method1931(
										95,
										(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7031),
										Class376_Sub7_Sub2.anInt9242,
										(((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).anInt7045))) - 200,
						(byte) -127, 3 * (i_16_ >> 3) + 600 << 2,
						Class94_Sub4.anInt7728, Class279.anInt3771, i, i_17_,
						i_16_);
				float f = (-((float) ((100 - i_15_) * ((-i_15_ + 100) * (-i_15_ + 100))) / 1000000.0F) + 1.0F);
				Class218.anInt3007 = (int) ((float) Class259.anInt3571 + (float) (-Class259.anInt3571 + Class218.anInt3007)
						* f);
				Class266.anInt3616 = (int) ((float) Class130.anInt1821 + f
						* (float) (Class266.anInt3616 - Class130.anInt1821));
				Class11_Sub45_Sub11.anInt9157 = (int) ((float) (Class11_Sub45_Sub11.anInt9157 - Class135.anInt1866)
						* f + (float) Class135.anInt1866);
				Class303.anInt4088 = (int) ((float) (-Class11_Sub32.anInt6870 + Class303.anInt4088)
						* f + (float) Class11_Sub32.anInt6870);
				int i_18_ = -Class260.anInt3573 + Class171.anInt2193;
				if (i_18_ <= 8192) {
					if (i_18_ < -8192)
						i_18_ += 16384;
				} else
					i_18_ -= 16384;
				Class171.anInt2193 = (int) ((float) Class260.anInt3573 + f
						* (float) i_18_);
				Class171.anInt2193 &= 0x3fff;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tr.B(" + i + ','
					+ i_14_ + ')');
		}
	}

	private final void method1988(byte i, int i_19_) {
		try {
			anInt4358++;
			double d = (double) ((i_19_ & 0xff9366) >> 16) / 256.0;
			double d_20_ = (double) ((0xfff1 & i_19_) >> 8) / 256.0;
			double d_21_ = (double) (0xff & i_19_) / 256.0;
			if (i < -42) {
				double d_22_ = d;
				if (d_22_ > d_20_)
					d_22_ = d_20_;
				if (d_21_ < d_22_)
					d_22_ = d_21_;
				double d_23_ = d;
				if (d_23_ < d_20_)
					d_23_ = d_20_;
				if (d_21_ > d_23_)
					d_23_ = d_21_;
				double d_24_ = 0.0;
				double d_25_ = 0.0;
				double d_26_ = (d_23_ + d_22_) / 2.0;
				if (d_23_ != d_22_) {
					if (d_26_ < 0.5)
						d_25_ = (d_23_ - d_22_) / (d_22_ + d_23_);
					if (d_23_ != d) {
						if (d_20_ != d_23_) {
							if (d_21_ == d_23_)
								d_24_ = (-d_20_ + d) / (d_23_ - d_22_) + 4.0;
						} else
							d_24_ = 2.0 + (d_21_ - d) / (-d_22_ + d_23_);
					} else
						d_24_ = (d_20_ - d_21_) / (d_23_ - d_22_);
					if (d_26_ >= 0.5)
						d_25_ = (d_23_ - d_22_) / (-d_22_ + (-d_23_ + 2.0));
				}
				((Class327) this).anInt4361 = (int) (d_25_ * 256.0);
				((Class327) this).anInt4366 = (int) (256.0 * d_26_);
				d_24_ /= 6.0;
				if ((((Class327) this).anInt4361 ^ 0xffffffff) <= -1) {
					if (((Class327) this).anInt4361 > 255)
						((Class327) this).anInt4361 = 255;
				} else
					((Class327) this).anInt4361 = 0;
				if ((((Class327) this).anInt4366 ^ 0xffffffff) <= -1) {
					if ((((Class327) this).anInt4366 ^ 0xffffffff) < -256)
						((Class327) this).anInt4366 = 255;
				} else
					((Class327) this).anInt4366 = 0;
				if (!(d_26_ > 0.5))
					((Class327) this).anInt4365 = (int) (d_25_ * d_26_ * 512.0);
				else
					((Class327) this).anInt4365 = (int) (512.0 * (d_25_ * (1.0 - d_26_)));
				if ((((Class327) this).anInt4365 ^ 0xffffffff) > -2)
					((Class327) this).anInt4365 = 1;
				((Class327) this).anInt4360 = (int) (d_24_ * (double) ((Class327) this).anInt4365);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tr.A(" + i + ','
					+ i_19_ + ')');
		}
	}

	final void method1989(Stream stream, int i) {
		try {
			anInt4363++;
			if (i <= -126) {
				for (;;) {
					int i_27_ = stream.readUnsignedByte((byte) 35);
					if ((i_27_ ^ 0xffffffff) == -1)
						break;
					method1986(stream, i_27_, true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tr.H("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class327() {
		((Class327) this).aBool4356 = true;
		anInt4368 = 0;
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
