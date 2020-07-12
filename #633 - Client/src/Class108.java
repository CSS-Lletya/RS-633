/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class108 {
	static int anInt1455;
	static int anInt1456;
	static OutgoingPacket aClass370_1457 = new OutgoingPacket(46, 3);
	Class11_Sub17 aClass11_Sub17_1458;
	int anInt1459;
	static IncomingPacket aClass160_1460;
	static int anInt1461;
	static int anInt1462;
	static float aFloat1463 = 1.0F;
	static Class253 aClass253_1464;
	static char[] aCharArray1465;

	abstract int method721(int i, int i_0_);

	static final boolean method722(int i) {
		try {
			anInt1456++;
			boolean bool = true;
			if (Class135.aClass80_1867 == null) {
				if (!Class108_Sub7.aClass146_5636.method918(Class280.anInt3790,
						88))
					bool = false;
				else
					Class135.aClass80_1867 = Class80.method555(
							Class108_Sub7.aClass146_5636, Class280.anInt3790);
			}
			if (Class233.aClass80_3189 == null) {
				if (Class108_Sub7.aClass146_5636.method918(
						Class58_Sub1_Sub2.anInt9490, i ^ 0x1c8))
					Class233.aClass80_3189 = Class80.method555(
							Class108_Sub7.aClass146_5636,
							Class58_Sub1_Sub2.anInt9490);
				else
					bool = false;
			}
			if (Class108_Sub16.aClass80_6542 == null) {
				if (!Class108_Sub7.aClass146_5636.method918(Class304.anInt4093,
						i ^ 0x1c5))
					bool = false;
				else
					Class108_Sub16.aClass80_6542 = Class80.method555(
							Class108_Sub7.aClass146_5636, Class304.anInt4093);
			}
			if (i != 402)
				method724(-41);
			if (Class327.aClass292_4362 == null) {
				if (!Class11_Sub18.aClass146_5781.method918(
						Class376_Sub7_Sub2_Sub2.anInt10242, i - 285))
					bool = false;
				else
					Class327.aClass292_4362 = Class194.method1270(
							Class11_Sub18.aClass146_5781, 2,
							(Class376_Sub7_Sub2_Sub2.anInt10242));
			}
			if (Class11_Sub2_Sub18.aClass80Array9055 == null) {
				if (Class108_Sub7.aClass146_5636.method918(
						Class376_Sub7_Sub2_Sub2.anInt10242, -124))
					Class11_Sub2_Sub18.aClass80Array9055 = Class80.method544(
							Class108_Sub7.aClass146_5636,
							(Class376_Sub7_Sub2_Sub2.anInt10242));
				else
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "db.M(" + i + ')');
		}
	}

	static final void method723(int i, int i_1_, int i_2_, int i_3_, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		try {
			anInt1462++;
			int i_8_ = Class244.method1540(i, Class292.anInt3962, false,
					Class351.anInt4618);
			int i_9_ = Class244.method1540(i_7_, Class292.anInt3962, false,
					Class351.anInt4618);
			int i_10_ = Class244.method1540(i_5_, Class26.anInt340, false,
					Class11_Sub45_Sub1_Sub2.anInt9880);
			int i_11_ = Class244.method1540(i_1_, Class26.anInt340, false,
					Class11_Sub45_Sub1_Sub2.anInt9880);
			int i_12_ = Class244.method1540(i + i_2_, Class292.anInt3962,
					false, Class351.anInt4618);
			int i_13_ = Class244.method1540(i_7_ + -i_2_, Class292.anInt3962,
					false, Class351.anInt4618);
			for (int i_14_ = i_8_; i_14_ < i_12_; i_14_++)
				Class11_Sub2_Sub32_Sub1.method3883(i_10_,
						(Class297.anIntArrayArray4026[i_14_]), (byte) 74, i_6_,
						i_11_);
			if (i_3_ == 8222) {
				for (int i_15_ = i_9_; (i_15_ ^ 0xffffffff) < (i_13_ ^ 0xffffffff); i_15_--)
					Class11_Sub2_Sub32_Sub1.method3883(i_10_,
							(Class297.anIntArrayArray4026[i_15_]), (byte) 76,
							i_6_, i_11_);
				int i_16_ = Class244.method1540(i_5_ + i_2_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				int i_17_ = Class244.method1540(-i_2_ + i_1_, Class26.anInt340,
						false, Class11_Sub45_Sub1_Sub2.anInt9880);
				for (int i_18_ = i_12_; (i_18_ ^ 0xffffffff) >= (i_13_ ^ 0xffffffff); i_18_++) {
					int[] is = Class297.anIntArrayArray4026[i_18_];
					Class11_Sub2_Sub32_Sub1.method3883(i_10_, is, (byte) 67,
							i_6_, i_16_);
					Class11_Sub2_Sub32_Sub1.method3883(i_16_, is, (byte) 92,
							i_4_, i_17_);
					Class11_Sub2_Sub32_Sub1.method3883(i_17_, is, (byte) 87,
							i_6_, i_11_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("db.L(" + i + ','
					+ i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_
					+ ',' + i_6_ + ',' + i_7_ + ')'));
		}
	}

	public static void method724(int i) {
		try {
			aClass370_1457 = null;
			if (i < 35)
				method724(82);
			aCharArray1465 = null;
			aClass253_1464 = null;
			aClass160_1460 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "db.K(" + i + ')');
		}
	}

	abstract int method725(byte i);

	abstract void method726(boolean bool);

	final void method727(byte i, int i_19_) {
		try {
			if (method721(i_19_, 68) != 3)
				method728(0, i_19_);
			if (i < -107)
				anInt1461++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "db.N(" + i + ','
					+ i_19_ + ')');
		}
	}

	Class108(Class11_Sub17 class11_sub17) {
		try {
			((Class108) this).aClass11_Sub17_1458 = class11_sub17;
			((Class108) this).anInt1459 = method725((byte) -96);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "db.<init>("
					+ (class11_sub17 != null ? "{...}" : "null") + ')');
		}
	}

	abstract void method728(int i, int i_20_);

	Class108(int i, Class11_Sub17 class11_sub17) {
		try {
			((Class108) this).anInt1459 = i;
			((Class108) this).aClass11_Sub17_1458 = class11_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("db.<init>(" + i + ','
					+ (class11_sub17 != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass160_1460 = new IncomingPacket(99, 2);
		aCharArray1465 = new char[] { '\u20ac', '\0', '\u201a', '\u0192',
				'\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030',
				'\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0',
				'\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013',
				'\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153',
				'\0', '\u017e', '\u0178' };
	}
}
