/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318 {
	boolean aBool4215;
	static int anInt4216;
	static int anInt4217;
	static int anInt4218;
	Class66 aClass66_4219;
	static int anInt4220;
	static int anInt4221;
	Class146 aClass146_4222;
	static int anInt4223;
	private Class146 aClass146_4224;
	static int anInt4225;
	static int anInt4226 = 0;
	static int anInt4227;
	static int anInt4228;
	static int anInt4229;
	static int anInt4230;
	private Class22 aClass22_4231 = new Class22(64);
	static int anInt4232;
	static int anInt4233;
	Class22 aClass22_4234 = new Class22(50);
	Class22 aClass22_4235 = new Class22(5);
	int anInt4236;

	final void method1928(int i, int i_0_) {
		try {
			anInt4217++;
			((Class318) this).anInt4236 = i;
			synchronized (((Class318) this).aClass22_4234) {
				((Class318) this).aClass22_4234.method189((byte) 46);
				if (i_0_ != 50)
					method1934(false);
			}
			synchronized (((Class318) this).aClass22_4235) {
				((Class318) this).aClass22_4235.method189((byte) -126);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method1929(byte i, int i_1_) {
		try {
			anInt4221++;
			synchronized (aClass22_4231) {
				aClass22_4231.method182(i_1_, (byte) -73);
				if (i != -78)
					((Class318) this).aClass22_4234 = null;
			}
			synchronized (((Class318) this).aClass22_4234) {
				((Class318) this).aClass22_4234.method182(i_1_, (byte) -73);
			}
			synchronized (((Class318) this).aClass22_4235) {
				((Class318) this).aClass22_4235.method182(i_1_, (byte) -73);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.G(" + i + ','
					+ i_1_ + ')');
		}
	}

	final NPCDefinitions getNPCDefinitions(int i, boolean bool) {
		try {
			anInt4218++;
			NPCDefinitions class215;
			synchronized (aClass22_4231) {
				class215 = (NPCDefinitions) aClass22_4231.method188((long) i,
						(byte) 121);
			}
			if (class215 != null)
				return class215;
			byte[] is;
			synchronized (aClass146_4224) {
				is = aClass146_4224.method930(Class239.method1524(i, 127),
						(byte) 112, Class58.method458(i, 0));
			}
			class215 = new NPCDefinitions();
			if (bool != false)
				return null;
			((NPCDefinitions) class215).anInt2904 = i;
			((NPCDefinitions) class215).aClass318_2901 = this;
			if (is != null)
				class215.method1378(new Stream(is), 105);
			class215.method1380(-113);
			synchronized (aClass22_4231) {
				aClass22_4231.method184((byte) 127, class215, (long) i);
			}
			return class215;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.C(" + i + ','
					+ bool + ')');
		}
	}

	static final int method1931(int i, int i_2_, int i_3_, int i_4_) {
		try {
			anInt4232++;
			if (Class315.aClass12Array4179 == null)
				return 0;
			int i_5_ = i_4_ >> 9;
			int i_6_ = i_2_ >> 9;
			if ((i_5_ ^ 0xffffffff) > -1
					|| (i_6_ ^ 0xffffffff) > -1
					|| (Class300.anInt4051 - 1 ^ 0xffffffff) > (i_5_ ^ 0xffffffff)
					|| i_6_ > Class108_Sub12.anInt6228 - 1)
				return 0;
			int i_7_ = i_3_;
			if (i <= 67)
				anInt4220 = -111;
			if ((i_7_ ^ 0xffffffff) > -4
					&& (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_5_][i_6_] & 0x2) != 0)
				i_7_++;
			return Class315.aClass12Array4179[i_7_].method130(i_2_, i_4_, 58);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("so.E(" + i + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	final void method1932(int i, boolean bool) {
		try {
			if (i > -72)
				method1931(115, 121, -96, 104);
			anInt4223++;
			if (((Class318) this).aBool4215 != bool) {
				((Class318) this).aBool4215 = bool;
				method1934(true);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.A(" + i + ','
					+ bool + ')');
		}
	}

	final void method1933(boolean bool) {
		try {
			synchronized (((Class318) this).aClass22_4234) {
				((Class318) this).aClass22_4234.method189((byte) -127);
			}
			anInt4229++;
			synchronized (((Class318) this).aClass22_4235) {
				((Class318) this).aClass22_4235.method189((byte) 12);
				if (bool != false)
					method1936((byte) -20, 94, null);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.D(" + bool + ')');
		}
	}

	final void method1934(boolean bool) {
		try {
			if (bool != true)
				method1936((byte) -9, -59, null);
			anInt4216++;
			synchronized (aClass22_4231) {
				aClass22_4231.method189((byte) 23);
			}
			synchronized (((Class318) this).aClass22_4234) {
				((Class318) this).aClass22_4234.method189((byte) 84);
			}
			synchronized (((Class318) this).aClass22_4235) {
				((Class318) this).aClass22_4235.method189((byte) 74);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.H(" + bool + ')');
		}
	}

	final void method1935(int i) {
		try {
			anInt4233++;
			synchronized (aClass22_4231) {
				aClass22_4231.method190(0);
			}
			synchronized (((Class318) this).aClass22_4234) {
				((Class318) this).aClass22_4234.method190(i ^ i);
			}
			synchronized (((Class318) this).aClass22_4235) {
				((Class318) this).aClass22_4235.method190(i + 51);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "so.I(" + i + ')');
		}
	}

	static final void method1936(byte i, int i_8_, Class281 class281) {
		try {
			anInt4228++;
			if ((Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff) > -51
					&& (class281 != null
							&& ((Class281) class281).anIntArrayArray3813 != null
							&& (((Class281) class281).anIntArrayArray3813.length ^ 0xffffffff) < (i_8_ ^ 0xffffffff) && (((Class281) class281).anIntArrayArray3813[i_8_] != null))) {
				int i_9_ = ((Class281) class281).anIntArrayArray3813[i_8_][0];
				int i_10_ = i_9_ >> 8;
				if ((((Class281) class281).anIntArrayArray3813[i_8_].length ^ 0xffffffff) < -2) {
					int i_11_ = (int) (Math.random() * (double) (((Class281) class281).anIntArrayArray3813[i_8_]).length);
					if ((i_11_ ^ 0xffffffff) < -1)
						i_10_ = (((Class281) class281).anIntArrayArray3813[i_8_][i_11_]);
				}
				if (i <= 114)
					method1931(-55, 45, 28, 58);
				int i_12_ = 0x7 & i_9_ >> 5;
				int i_13_ = 256;
				if (((Class281) class281).anIntArray3812 != null
						&& ((Class281) class281).anIntArray3793 != null)
					i_13_ = Class335_Sub3.method3141(-111,
							(((Class281) class281).anIntArray3793[i_8_]),
							(((Class281) class281).anIntArray3812[i_8_]));
				if (!((Class281) class281).aBool3800)
					Class133.method860(i_13_, 255, (byte) 67, i_12_, i_10_, 0);
				else
					Class254.method1630(i_10_, false, i_12_, i_13_, 9400, 255,
							0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("so.B(" + i + ',' + i_8_ + ','
									+ (class281 != null ? "{...}" : "null") + ')'));
		}
	}

	Class318(Class66 class66, int i, boolean bool, Class146 class146,
			Class146 class146_14_) {
		do {
			try {
				((Class318) this).aClass66_4219 = class66;
				((Class318) this).aClass146_4222 = class146_14_;
				aClass146_4224 = class146;
				((Class318) this).aBool4215 = bool;
				if (aClass146_4224 == null)
					break;
				int i_15_ = -1 + aClass146_4224.method928((byte) 20);
				aClass146_4224.method914(i_15_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception,
								("so.<init>("
										+ (class66 != null ? "{...}" : "null")
										+ ','
										+ i
										+ ','
										+ bool
										+ ','
										+ (class146 != null ? "{...}" : "null")
										+ ','
										+ (class146_14_ != null ? "{...}"
												: "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt4220 = 0;
		anInt4227 = 0;
		anInt4230 = 0;
	}
}
