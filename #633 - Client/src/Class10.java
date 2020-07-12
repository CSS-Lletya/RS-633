/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
	int anInt73;
	static short[] aShortArray74 = { 46, 60, 6, 18, 59, 44, 22, 20 };
	static int anInt75;
	Interface6[] anInterface6Array76;
	static int anInt77;
	static int anInt78;
	int anInt79;
	static int anInt80;
	static int anInt81;
	static Class22 aClass22_82 = new Class22(10);
	static IncomingPacket INDEX_14_SOUND_IN_PACKET = new IncomingPacket(66, 8);

	private final Interface6 method115(byte i, Class9 class9, Stream stream) {
		try {
			anInt75++;
			if (class9 == Class291.aClass9_3944)
				return Class335_Sub1.method2694(stream, (byte) 96);
			if (Class107.aClass9_1440 == class9)
				return Class256_Sub4.method3199((byte) 48, stream);
			if (class9 == Class11_Sub49.aClass9_8019)
				return Class11_Sub2_Sub7.method3429((byte) 22, stream);
			if (class9 == Class117.aClass9_1594)
				return Class244.method1542((byte) -104, stream);
			if (Class265.aClass9_3610 == class9)
				return Class110.method739(false, stream);
			if (i <= 69)
				method120(null, -41, 37);
			if (class9 == Class15.aClass9_131)
				return Class163_Sub2.method3020(stream, (byte) 120);
			if (Class70.aClass9_983 == class9)
				return Class153.method962(94, stream);
			if (Class209.aClass9_2843 == class9)
				return Class253_Sub2.method2706(stream, true);
			if (Class11_Sub45_Sub2.aClass9_8504 == class9)
				return Class108_Sub7.method2437(-1, stream);
			if (class9 == Class33.aClass9_454)
				return Class156.method976(-68, stream);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("k.B(" + i + ','
					+ (class9 != null ? "{...}" : "null") + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method116(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			int i_4_) {
		try {
			anInt77++;
			int i_5_ = i_2_;
			if (i >= -19)
				method120(null, 26, 86);
			for (/**/; (i_1_ ^ 0xffffffff) <= (i_5_ ^ 0xffffffff); i_5_++)
				Class11_Sub2_Sub32_Sub1.method3883(i_0_,
						(Class297.anIntArrayArray4026[i_5_]), (byte) 111, i_3_,
						i_4_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("k.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ','
							+ i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method117(int i) {
		try {
			INDEX_14_SOUND_IN_PACKET = null;
			aClass22_82 = null;
			if (i != 1)
				method120(null, 60, -8);
			aShortArray74 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "k.F(" + i + ')');
		}
	}

	static final boolean method118(byte i, int i_6_) {
		try {
			anInt78++;
			if (i >= -24)
				return false;
			if (i_6_ == 1 || i_6_ == 7)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "k.A(" + i + ',' + i_6_
					+ ')');
		}
	}

	final void method119(int i, Stream stream) {
		try {
			((Class10) this).anInt79 = stream.method2558(false);
			anInt80++;
			((Class10) this).anInt73 = stream.readUnsignedShort((byte) -65);
			((Class10) this).anInterface6Array76 = new Interface6[stream
					.readUnsignedByte((byte) 35)];
			Class9[] class9s = Class33.method290((byte) 113);
			if (i > -111)
				((Class10) this).anInterface6Array76 = null;
			for (int i_7_ = 0; ((i_7_ ^ 0xffffffff) > (((Class10) this).anInterface6Array76.length ^ 0xffffffff)); i_7_++)
				((Class10) this).anInterface6Array76[i_7_] = method115(
						(byte) 101,
						class9s[stream.readUnsignedByte((byte) 35)], stream);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("k.C(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class10() {
		/* empty */
	}

	static final void method120(Class376_Sub7[] class376_sub7s, int i, int i_8_) {
		if (i < i_8_) {
			int i_9_ = (i + i_8_) / 2;
			int i_10_ = i;
			Class376_Sub7 class376_sub7 = class376_sub7s[i_9_];
			class376_sub7s[i_9_] = class376_sub7s[i_8_];
			class376_sub7s[i_8_] = class376_sub7;
			int i_11_ = ((Class376_Sub7) class376_sub7).anInt7041;
			for (int i_12_ = i; i_12_ < i_8_; i_12_++) {
				if (((Class376_Sub7) class376_sub7s[i_12_]).anInt7041 > i_11_
						+ (i_12_ & 0x1)) {
					Class376_Sub7 class376_sub7_13_ = class376_sub7s[i_12_];
					class376_sub7s[i_12_] = class376_sub7s[i_10_];
					class376_sub7s[i_10_++] = class376_sub7_13_;
				}
			}
			class376_sub7s[i_8_] = class376_sub7s[i_10_];
			class376_sub7s[i_10_] = class376_sub7;
			method120(class376_sub7s, i, i_10_ - 1);
			method120(class376_sub7s, i_10_ + 1, i_8_);
		}
	}
}
