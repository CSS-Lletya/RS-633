/* Class11_Sub45_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub18 extends Class11_Sub45 {
	static int anInt9525;
	private int anInt9526;
	static int anInt9527;
	private byte[][] aByteArrayArray9528;
	static int anInt9529;
	static int anInt9530;
	static int anInt9531;
	static int anInt9532;
	static int anInt9533;
	Class74[] aClass74Array9534;

	final boolean method3755(int i, int i_0_) {
		try {
			anInt9530++;
			if (i_0_ != 1)
				method3757((byte) 63);
			return (((Class74) ((Class11_Sub45_Sub18) this).aClass74Array9534[i]).aBool1034);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iaa.H(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method3756(Class376_Sub7 class376_sub7, int i, int i_1_,
			int i_2_) {
		if (i_1_ < Class138.anInt1886) {
			Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_1_ + 1][i_2_];
			if (class364 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777
							.method2862(-108))
				class376_sub7.method2871(true, Class87.aClass163_1210, 0, 0,
						(((Class364) class364).aClass376_Sub7_Sub2_4777),
						22501, Class376_Sub7_Sub3_Sub2.anInt10141);
		}
		if (i_2_ < Class138.anInt1886) {
			Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_1_][i_2_ + 1];
			if (class364 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777
							.method2862(-112))
				class376_sub7.method2871(true, Class87.aClass163_1210, 0,
						Class376_Sub7_Sub3_Sub2.anInt10141,
						(((Class364) class364).aClass376_Sub7_Sub2_4777),
						22501, 0);
		}
		if (i_1_ < Class138.anInt1886 && i_2_ < Class82.anInt1133) {
			Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_1_ + 1][i_2_ + 1];
			if (class364 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777
							.method2862(-109))
				class376_sub7.method2871(true, Class87.aClass163_1210, 0,
						Class376_Sub7_Sub3_Sub2.anInt10141,
						(((Class364) class364).aClass376_Sub7_Sub2_4777),
						22501, Class376_Sub7_Sub3_Sub2.anInt10141);
		}
		if (i_1_ < Class138.anInt1886 && i_2_ > 0) {
			Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_1_ + 1][i_2_ - 1];
			if (class364 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777 != null
					&& ((Class364) class364).aClass376_Sub7_Sub2_4777
							.method2862(-127))
				class376_sub7.method2871(true, Class87.aClass163_1210, 0,
						-Class376_Sub7_Sub3_Sub2.anInt10141,
						(((Class364) class364).aClass376_Sub7_Sub2_4777),
						22501, Class376_Sub7_Sub3_Sub2.anInt10141);
		}
	}

	static final void method3757(byte i) {
		do {
			try {
				anInt9532++;
				if (i != -6)
					method3756(null, -103, 81, -74);
				if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
						.method3158(false) == 0
						&& Class376_Sub7_Sub2.anInt9242 != Class51.anInt800)
					Class124.method811(11, false, Class350.anInt4617,
							Class376_Sub7_Sub3_Sub1.anInt9867, false);
				else {
					Class11_Sub45_Sub8.method3457(31885,
							Class321_Sub2.aClass163_6648);
					if ((Class290.anInt3921 ^ 0xffffffff) == (Class376_Sub7_Sub2.anInt9242 ^ 0xffffffff))
						break;
					Class11_Sub18.method2476(-98);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "iaa.D(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method3758(int i) {
		try {
			anInt9533++;
			if (i != -31394)
				return false;
			if (((Class11_Sub45_Sub18) this).aClass74Array9534 != null)
				return true;
			if (aByteArrayArray9528 == null) {
				synchronized (Class78.aClass146_1050) {
					if (!Class78.aClass146_1050.method931(anInt9526, -123))
						return false;
					int[] is = Class78.aClass146_1050.method907(anInt9526, 0);
					aByteArrayArray9528 = new byte[is.length][];
					for (int i_3_ = 0; (is.length ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
						aByteArrayArray9528[i_3_] = Class78.aClass146_1050
								.method930(is[i_3_], (byte) 112, anInt9526);
				}
			}
			boolean bool = true;
			for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (aByteArrayArray9528.length ^ 0xffffffff)); i_4_++) {
				byte[] is = aByteArrayArray9528[i_4_];
				Stream stream = new Stream(is);
				((Stream) stream).position = 1;
				int i_5_ = stream.readUnsignedShort((byte) -65);
				synchronized (Class11_Sub10.aClass146_5396) {
					bool &= Class11_Sub10.aClass146_5396.method918(i_5_, i
							^ ~0x7acf);
				}
			}
			if (!bool)
				return false;
			Class84 class84 = new Class84();
			int[] is;
			synchronized (Class78.aClass146_1050) {
				int i_6_ = Class78.aClass146_1050.method914(anInt9526, 0);
				((Class11_Sub45_Sub18) this).aClass74Array9534 = new Class74[i_6_];
				is = Class78.aClass146_1050.method907(anInt9526, 0);
			}
			for (int i_7_ = 0; is.length > i_7_; i_7_++) {
				byte[] is_8_ = aByteArrayArray9528[i_7_];
				Stream stream = new Stream(is_8_);
				((Stream) stream).position = 1;
				int i_9_ = stream.readUnsignedShort((byte) -65);
				Class11_Sub29 class11_sub29 = null;
				for (Class11_Sub29 class11_sub29_10_ = (Class11_Sub29) class84
						.method584(-12261); class11_sub29_10_ != null; class11_sub29_10_ = (Class11_Sub29) class84
						.method578(-15361)) {
					if (((Class11_Sub29) class11_sub29_10_).anInt6594 == i_9_) {
						class11_sub29 = class11_sub29_10_;
						break;
					}
				}
				if (class11_sub29 == null) {
					synchronized (Class11_Sub10.aClass146_5396) {
						class11_sub29 = (new Class11_Sub29(i_9_,
								Class11_Sub10.aClass146_5396.method938(i_9_,
										i + 31394)));
					}
					class84.method589((byte) -13, class11_sub29);
				}
				((Class11_Sub45_Sub18) this).aClass74Array9534[is[i_7_]] = new Class74(
						is_8_, class11_sub29);
			}
			aByteArrayArray9528 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iaa.G(" + i + ')');
		}
	}

	final boolean method3759(int i, int i_11_) {
		try {
			if (i < 112)
				anInt9526 = -28;
			anInt9527++;
			return (((Class74) ((Class11_Sub45_Sub18) this).aClass74Array9534[i_11_]).aBool1019);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iaa.C(" + i + ','
					+ i_11_ + ')');
		}
	}

	final boolean method3760(boolean bool, int i) {
		try {
			if (bool != false)
				method3760(false, 124);
			anInt9529++;
			return (((Class74) ((Class11_Sub45_Sub18) this).aClass74Array9534[i]).aBool1033);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iaa.F(" + bool + ','
					+ i + ')');
		}
	}

	static final void method3761(int i, int i_12_, int i_13_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[i][i_12_][i_13_];
		if (class364 != null) {
			Class351.method2105(((Class364) class364).aClass376_Sub7_Sub3_4780);
			Class351.method2105(((Class364) class364).aClass376_Sub7_Sub3_4776);
			if (((Class364) class364).aClass376_Sub7_Sub3_4780 != null)
				((Class364) class364).aClass376_Sub7_Sub3_4780 = null;
			if (((Class364) class364).aClass376_Sub7_Sub3_4776 != null)
				((Class364) class364).aClass376_Sub7_Sub3_4776 = null;
		}
	}

	static final Class11_Sub45_Sub15 method3762(int i) {
		try {
			anInt9525++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = ((Class11_Sub45_Sub15) Class11_Sub2_Sub32.aClass38_9651
					.method331((byte) -7));
			if (class11_sub45_sub15 != null) {
				class11_sub45_sub15.method122(-86);
				class11_sub45_sub15.method3187(100);
				return class11_sub45_sub15;
			}
			if (i != 30548)
				return null;
			do {
				class11_sub45_sub15 = ((Class11_Sub45_Sub15) Class331.aClass38_4397
						.method331((byte) -7));
				if (class11_sub45_sub15 == null)
					return null;
				if ((class11_sub45_sub15.method3658(0) ^ 0xffffffffffffffffL) < (Class137
						.method878((byte) -57) ^ 0xffffffffffffffffL))
					return null;
				class11_sub45_sub15.method122(-81);
				class11_sub45_sub15.method3187(100);
			} while (((((Class11_Sub45) class11_sub45_sub15).aLong7904 & ~0x7fffffffffffffffL) ^ 0xffffffffffffffffL) == -1L);
			return class11_sub45_sub15;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iaa.A(" + i + ')');
		}
	}

	Class11_Sub45_Sub18(int i) {
		try {
			anInt9526 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "iaa.<init>(" + i + ')');
		}
	}
}
