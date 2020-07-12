/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85 {
	static int anInt1162;
	static IncomingPacket aClass160_1163 = new IncomingPacket(47, 3);
	static int anInt1164;
	private Class22 aClass22_1165 = new Class22(64);
	private Class146 aClass146_1166;
	static int anInt1167;
	static int anInt1168;
	static int anInt1169;
	static int anInt1170;
	static int anInt1171;
	static int anInt1172;

	static final Class72_Sub3 method591(int i, int[] is, int[] is_0_, int i_1_,
			int i_2_, Class163_Sub3 class163_sub3) {
		try {
			anInt1172++;
			byte[] is_3_ = new byte[i * i_2_];
			if (i_1_ != -1)
				method594((byte) -72);
			for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
				int i_5_ = is_0_[i_4_] + i * i_4_;
				for (int i_6_ = 0; (is[i_4_] ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
					is_3_[i_5_++] = (byte) -1;
			}
			return new Class72_Sub3(class163_sub3, i, i_2_, is_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("bh.G(" + i + ','
							+ (is != null ? "{...}" : "null") + ','
							+ (is_0_ != null ? "{...}" : "null") + ',' + i_1_
							+ ',' + i_2_ + ','
							+ (class163_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method592(int i) {
		try {
			anInt1164++;
			synchronized (aClass22_1165) {
				aClass22_1165.method189((byte) -128);
				int i_7_ = -45 % ((63 - i) / 52);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.F(" + i + ')');
		}
	}

	final void method593(int i, int i_8_) {
		try {
			anInt1169++;
			synchronized (aClass22_1165) {
				aClass22_1165.method182(i, (byte) -73);
				if (i_8_ != 0)
					method596((byte) -5, '\uffde');
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.H(" + i + ','
					+ i_8_ + ')');
		}
	}

	public static void method594(byte i) {
		try {
			if (i != -12)
				aClass160_1163 = null;
			aClass160_1163 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.B(" + i + ')');
		}
	}

	static final float method595(float f, float f_9_, float f_10_, float f_11_,
			float f_12_, int i, float f_13_, int i_14_) {
		try {
			anInt1168++;
			float f_15_ = 0.0F;
			float f_16_ = -f_11_ + f_13_;
			float f_17_ = f_9_ - f_10_;
			if (i < 66)
				method594((byte) -82);
			float f_18_ = -f + f_12_;
			float f_19_ = 0.0F;
			float f_20_ = 0.0F;
			float f_21_ = 0.0F;
			while (f_15_ < 1.1F) {
				float f_22_ = f_11_ + f_15_ * f_16_;
				float f_23_ = f_15_ * f_17_ + f_10_;
				float f_24_ = f + f_18_ * f_15_;
				int i_25_ = (int) f_22_ >> 9;
				int i_26_ = (int) f_24_ >> 9;
				if ((i_25_ ^ 0xffffffff) < -1
						&& i_26_ > 0
						&& (i_25_ ^ 0xffffffff) > (Class300.anInt4051 ^ 0xffffffff)
						&& Class108_Sub12.anInt6228 > i_26_) {
					int i_27_ = (((Class376_Sub7) (Class11_Sub2_Sub8.myPlayer)).aByte7047);
					if ((i_27_ ^ 0xffffffff) > -4
							&& (0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_25_][i_26_])) != 0)
						i_27_++;
					int i_28_ = Class11_Sub2_Sub38.aClass12Array9796[i_27_]
							.method130((int) f_24_, (int) f_22_, 27);
					if (f_23_ > (float) i_28_) {
						if (i_14_ < 2)
							return f_15_;
						return (0.1F * method595(f_21_, f_23_, f_20_, f_19_,
								f_24_, 87, f_22_, -1 + i_14_) + (f_15_ - 0.1F));
					}
				}
				f_21_ = f_24_;
				f_15_ += 0.1F;
				f_19_ = f_22_;
				f_20_ = f_23_;
			}
			return -1.0F;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bh.D(" + f + ','
					+ f_9_ + ',' + f_10_ + ',' + f_11_ + ',' + f_12_ + ',' + i
					+ ',' + f_13_ + ',' + i_14_ + ')'));
		}
	}

	static final int method596(byte i, char c) {
		try {
			anInt1167++;
			if ((c ^ 0xffffffff) <= -1 && c < Class378.anIntArray4941.length)
				return Class378.anIntArray4941[c];
			if (i != -123)
				method591(114, null, null, -87, 83, null);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.C(" + i + ',' + c
					+ ')');
		}
	}

	final void method597(int i) {
		try {
			anInt1162++;
			synchronized (aClass22_1165) {
				aClass22_1165.method190(i ^ i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.E(" + i + ')');
		}
	}

	Class85(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_1166 = class146;
			aClass146_1166.method914(31, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bh.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class112 method598(int i, int i_29_) {
		try {
			anInt1170++;
			Class112 class112;
			synchronized (aClass22_1165) {
				class112 = (Class112) aClass22_1165.method188((long) i,
						(byte) 80);
			}
			if (class112 != null)
				return class112;
			byte[] is;
			synchronized (aClass146_1166) {
				is = aClass146_1166.method930(i, (byte) 112, i_29_);
			}
			class112 = new Class112();
			if (is != null)
				class112.method754(new Stream(is), 0);
			synchronized (aClass22_1165) {
				aClass22_1165.method184((byte) 127, class112, (long) i);
			}
			return class112;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bh.A(" + i + ','
					+ i_29_ + ')');
		}
	}
}
