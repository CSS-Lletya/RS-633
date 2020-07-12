/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110 {
	static int anInt1489;
	private static Class11_Sub46[] aClass11_Sub46Array1490 = new Class11_Sub46[8];
	int anInt1491;
	int anInt1492;
	int anInt1493;
	int anInt1494;
	private int anInt1495;
	static int[] anIntArray1496 = new int[1];
	int anInt1497;
	Class110 aClass110_1498;
	int anInt1499;
	static int anInt1500;
	static int anInt1501;
	int anInt1502;
	byte aByte1503;
	int anInt1504;
	int anInt1505;
	int anInt1506;
	static int anInt1507;
	static int anInt1508;
	int anInt1509;
	int anInt1510;

	static final void method737(Class376_Sub7 class376_sub7, boolean bool,
			boolean bool_0_) {
		((Class376_Sub7) class376_sub7).aBool7044 = bool_0_;
		if (Class376_Sub1.aBool5098) {
			if (bool)
				Class376_Sub1_Sub1.aClass322Array8690[Class376_Sub1_Sub1.aClass322Array8690.length - 1]
						.method1971(-1, class376_sub7);
			else {
				int i = Class98
						.method662(((Class376_Sub7) class376_sub7).anInt7034);
				int i_1_ = (Class11_Sub12_Sub3.anIntArray9225[2]
						* class376_sub7.method2868((byte) 14) / ((Class376_Sub7) class376_sub7).anInt7041);
				int i_2_ = Class98
						.method662((((Class376_Sub7) class376_sub7).anInt7034)
								- i_1_);
				int i_3_ = Class98
						.method662((((Class376_Sub7) class376_sub7).anInt7034)
								+ i_1_);
				if (i_2_ == i_3_)
					Class376_Sub1_Sub1.aClass322Array8690[i].method1971(-1,
							class376_sub7);
				else if (i_3_ - i_2_ == 1)
					Class376_Sub1_Sub1.aClass322Array8690[Class205.anInt2763
							+ i_2_].method1971(-1, class376_sub7);
				else
					Class376_Sub1_Sub1.aClass322Array8690[Class376_Sub1_Sub1.aClass322Array8690.length - 1]
							.method1971(-1, class376_sub7);
			}
		} else
			Class321.method1958(class376_sub7, aClass11_Sub46Array1490);
	}

	final Class110 method738(int i, int i_4_, int i_5_, int i_6_) {
		try {
			if (i_4_ != 2)
				((Class110) this).anInt1506 = 125;
			anInt1508++;
			return new Class110(anInt1495, i, i_5_, i_6_,
					((Class110) this).aByte1503);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("de.E(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final Class57 method739(boolean bool, Stream stream) {
		try {
			anInt1500++;
			int i = stream.readUnsignedShort((byte) -65);
			Class118 class118 = Class239.method1519(-11911)[stream
					.readUnsignedByte((byte) 35)];
			Class150 class150 = Class171.method1124(25992)[stream
					.readUnsignedByte((byte) 35)];
			int i_7_ = stream.method2508((byte) 117);
			if (bool != false)
				method742(-28, true, null, 71, -42, 45, -102, -120);
			int i_8_ = stream.method2508((byte) 48);
			return new Class57(i, class118, class150, i_7_, i_8_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("de.F(" + bool + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method740(boolean bool) {
		try {
			if (bool == true) {
				anIntArray1496 = null;
				aClass11_Sub46Array1490 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "de.B(" + bool + ')');
		}
	}

	final Class129 method741(int i) {
		try {
			if (i != 24844)
				method742(-83, true, null, -7, -75, -104, 70, -39);
			anInt1501++;
			return Class216.method1387(anInt1495, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "de.A(" + i + ')');
		}
	}

	static final void method742(int i, boolean bool, String string, int i_9_,
			int i_10_, int i_11_, int i_12_, int i_13_) {
		try {
			anInt1507++;
			Class376_Sub8 class376_sub8 = new Class376_Sub8();
			((Class376_Sub8) class376_sub8).anInt7750 = i_12_;
			((Class376_Sub8) class376_sub8).anInt7755 = i_11_;
			((Class376_Sub8) class376_sub8).anInt7751 = i;
			((Class376_Sub8) class376_sub8).anInt7753 = i_9_;
			((Class376_Sub8) class376_sub8).anInt7748 = i_13_;
			if (bool == false) {
				((Class376_Sub8) class376_sub8).anInt7752 = i_10_
						+ Class11_Sub25.anInt6279;
				((Class376_Sub8) class376_sub8).aString7754 = string;
				Class163_Sub2.aClass131_7378.method853(0, class376_sub8);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("de.D(" + i + ','
					+ bool + ',' + (string != null ? "{...}" : "null") + ','
					+ i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ','
					+ i_13_ + ')'));
		}
	}

	Class110(int i, int i_14_, int i_15_, int i_16_, byte i_17_) {
		try {
			((Class110) this).anInt1497 = i_16_;
			((Class110) this).anInt1506 = i_14_;
			((Class110) this).anInt1510 = i_15_;
			((Class110) this).aByte1503 = i_17_;
			anInt1495 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("de.<init>(" + i + ','
					+ i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ')'));
		}
	}

	static {
		anInt1489 = 2;
	}
}
