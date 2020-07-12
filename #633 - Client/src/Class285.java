/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class285 {
	private Class146 aClass146_3838;
	static int anInt3839;
	static int anInt3840;
	static int anInt3841;
	static int anInt3842;
	private Class22 aClass22_3843 = new Class22(256);
	static String[] aStringArray3844 = new String[200];
	static int anInt3845;
	static int anInt3846 = 0;

	static final int method1758(int i, int i_0_, boolean bool, boolean bool_1_,
			int i_2_) {
		try {
			anInt3842++;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, i_0_ - 7149,
					i_2_);
			if (class11_sub37 == null)
				return 0;
			int i_3_ = 0;
			if (i_0_ != -2705)
				aStringArray3844 = null;
			for (int i_4_ = 0; ((((Class11_Sub37) class11_sub37).anIntArray7082.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff)); i_4_++) {
				if ((((Class11_Sub37) class11_sub37).anIntArray7082[i_4_] ^ 0xffffffff) <= -1
						&& (((((Class223) Packet.aClass223_8723).anInt3062) ^ 0xffffffff) < (((Class11_Sub37) class11_sub37).anIntArray7082[i_4_] ^ 0xffffffff))) {
					Class249 class249 = (Packet.aClass223_8723
							.method1430(
									(((Class11_Sub37) class11_sub37).anIntArray7082[i_4_]),
									false));
					int i_5_ = class249.method1593(
							(((Class283) Class187.aClass52_2388.method432(i,
									(byte) -116)).anInt3827), i, 46);
					if (!bool_1_)
						i_3_ += i_5_;
					else
						i_3_ += (((Class11_Sub37) class11_sub37).anIntArray7088[i_4_])
								* i_5_;
				}
			}
			return i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qb.B(" + i + ','
					+ i_0_ + ',' + bool + ',' + bool_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method1759(byte i) {
		try {
			synchronized (aClass22_3843) {
				aClass22_3843.method190(0);
				if (i != -19)
					method1762(true, -36);
			}
			anInt3841++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qb.D(" + i + ')');
		}
	}

	final void method1760(int i) {
		try {
			synchronized (aClass22_3843) {
				aClass22_3843.method189((byte) -126);
				if (i != 200)
					method1762(true, -17);
			}
			anInt3845++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qb.E(" + i + ')');
		}
	}

	public static void method1761(int i) {
		try {
			if (i != 22311)
				method1761(127);
			aStringArray3844 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qb.F(" + i + ')');
		}
	}

	final Class11_Sub45_Sub2 method1762(boolean bool, int i) {
		try {
			anInt3840++;
			Class11_Sub45_Sub2 class11_sub45_sub2;
			synchronized (aClass22_3843) {
				class11_sub45_sub2 = (Class11_Sub45_Sub2) aClass22_3843
						.method188((long) i, (byte) -99);
			}
			if (class11_sub45_sub2 != null)
				return class11_sub45_sub2;
			byte[] is;
			synchronized (aClass146_3838) {
				is = aClass146_3838.method930(i, (byte) 112, 26);
			}
			if (bool != false)
				method1760(64);
			class11_sub45_sub2 = new Class11_Sub45_Sub2();
			if (is != null)
				class11_sub45_sub2.method3359(19898, new Stream(is));
			synchronized (aClass22_3843) {
				aClass22_3843.method184((byte) 124, class11_sub45_sub2,
						(long) i);
			}
			return class11_sub45_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qb.C(" + bool + ','
					+ i + ')');
		}
	}

	final void method1763(int i, int i_6_) {
		do {
			try {
				anInt3839++;
				synchronized (aClass22_3843) {
					aClass22_3843.method182(i_6_, (byte) -73);
				}
				if (i < -54)
					break;
				method1760(-67);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qb.A(" + i + ','
						+ i_6_ + ')');
			}
			break;
		} while (false);
	}

	Class285(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_3838 = class146;
			aClass146_3838.method914(26, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qb.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
