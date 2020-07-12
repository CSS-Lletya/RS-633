/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class16 {
	static int anInt138;
	static int anInt139;
	static int anInt140;
	static int[] anIntArray141 = new int[3];
	static int anInt142;
	static int anInt143;

	final boolean method151(boolean bool) {
		try {
			anInt143++;
			if (bool != true)
				return true;
			return (Class194.aClass16_2639 == this | Class112.aClass16_1537 == this);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tia.B(" + bool + ')');
		}
	}

	public final String toString() {
		try {
			anInt142++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tia.toString(" + ')');
		}
	}

	static final void method152(boolean bool, int i, int i_0_, int i_1_,
			int i_2_, byte i_3_) {
		try {
			anInt140++;
			if (Class355.aFrame4658 != null
					&& ((i_0_ ^ 0xffffffff) != -4
							|| (i_2_ ^ 0xffffffff) != (Class103.anInt1381 ^ 0xffffffff) || i != Class11_Sub51.anInt8032)) {
				Class118.method773(Class108_Sub21.aClass341_7304, (byte) -104,
						Class355.aFrame4658);
				Class355.aFrame4658 = null;
			}
			if ((i_0_ ^ 0xffffffff) == -4 && Class355.aFrame4658 == null) {
				Class355.aFrame4658 = Class59.method467(
						Class108_Sub21.aClass341_7304, i_2_, 0, 0, i,
						i_3_ ^ 0x6b);
				if (Class355.aFrame4658 != null) {
					Class11_Sub51.anInt8032 = i;
					Class103.anInt1381 = i_2_;
					Class186.method1212(10343);
				}
			}
			if (i_0_ == 3 && Class355.aFrame4658 == null)
				method152(
						true,
						-1,
						((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub13_5726
								.method2654(false), i_1_, -1, (byte) -102);
			else {
				java.awt.Container container;
				if (Class355.aFrame4658 == null) {
					if (Class376_Sub5.aFrame6918 != null) {
						Insets insets = Class376_Sub5.aFrame6918.getInsets();
						Class11_Sub45_Sub18.anInt9531 = (Class376_Sub5.aFrame6918
								.getSize().width - (insets.right + insets.left));
						Class231.anInt3160 = (Class376_Sub5.aFrame6918
								.getSize().height - (insets.bottom + insets.top));
						container = Class376_Sub5.aFrame6918;
					} else {
						if (Class108_Sub16.anApplet6538 == null)
							container = Class112.anApplet_Sub1_1542;
						else
							container = Class108_Sub16.anApplet6538;
						Class11_Sub45_Sub18.anInt9531 = container.getSize().width;
						Class231.anInt3160 = container.getSize().height;
					}
				} else {
					container = Class355.aFrame4658;
					Class11_Sub45_Sub18.anInt9531 = i_2_;
					Class231.anInt3160 = i;
				}
				if (i_0_ != 1)
					Class108_Sub17.method2732((byte) -27);
				else {
					Class11_Sub36.anInt7079 = Class233.anInt3186;
					Class153.anInt2025 = Class279.anInt3772;
					Class198.anInt2687 = (Class11_Sub45_Sub18.anInt9531 - Class233.anInt3186) / 2;
					Class124.anInt1677 = 0;
				}
				if (Class362.aClass347_4711 != Class11_Sub2_Sub24.aClass347_9284) {
					if ((Class11_Sub36.anInt7079 ^ 0xffffffff) > -1025
							&& Class153.anInt2025 < 768) {
						/* empty */
					}
				}
				if (bool)
					Class11_Sub37.method2886((byte) -74);
				else {
					Class11_Sub45_Sub13.aCanvas9308.setSize(
							Class11_Sub36.anInt7079, Class153.anInt2025);
					if (!Class11_Sub2_Sub19.aBool9087)
						Class321_Sub2.aClass163_6648.method1013(
								Class11_Sub45_Sub13.aCanvas9308,
								Class11_Sub36.anInt7079, Class153.anInt2025);
					else
						Class355.method2123(-127,
								Class11_Sub45_Sub13.aCanvas9308);
					if (Class376_Sub5.aFrame6918 == container) {
						Insets insets = Class376_Sub5.aFrame6918.getInsets();
						Class11_Sub45_Sub13.aCanvas9308.setLocation(insets.left
								- -Class198.anInt2687, insets.top
								- -Class124.anInt1677);
					} else
						Class11_Sub45_Sub13.aCanvas9308.setLocation(
								Class198.anInt2687, Class124.anInt1677);
				}
				if (i_0_ >= 2)
					Class251_Sub2.aBool5439 = true;
				else
					Class251_Sub2.aBool5439 = false;
				if (i_3_ != -102)
					method156(null, -109);
				if ((Class365.anInt4797 ^ 0xffffffff) != 0)
					Class321_Sub3_Sub1.method3614(true, -14543);
				if (Class108_Sub2.aClass217_5081 != null
						&& Class2_Sub5
								.method2400((byte) 35, Class285.anInt3846))
					Class336.method2021(-116);
				for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -101; i_4_++)
					Class11_Sub45.aBoolArray7907[i_4_] = true;
				Class108_Sub21.aBool7302 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tia.A(" + bool + ',' + i + ',' + i_0_ + ',' + i_1_ + ','
							+ i_2_ + ',' + i_3_ + ')'));
		}
	}

	static final void method153(int i, int i_5_) {
		Class364 class364 = Class181.aClass364ArrayArrayArray2336[0][i][i_5_];
		for (int i_6_ = 0; i_6_ < 3; i_6_++) {
			Class364 class364_7_ = (Class181.aClass364ArrayArrayArray2336[i_6_][i][i_5_] = Class181.aClass364ArrayArrayArray2336[i_6_ + 1][i][i_5_]);
			if (class364_7_ != null) {
				for (Class140 class140 = ((Class364) class364_7_).aClass140_4781; class140 != null; class140 = ((Class140) class140).aClass140_1895) {
					Class376_Sub7_Sub5 class376_sub7_sub5 = ((Class140) class140).aClass376_Sub7_Sub5_1896;
					if ((((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9626 == i)
							&& (((Class376_Sub7_Sub5) class376_sub7_sub5).aShort9629) == i_5_)
						((Class376_Sub7) class376_sub7_sub5).aByte7047--;
				}
				if (((Class364) class364_7_).aClass376_Sub7_Sub2_4777 != null)
					((Class376_Sub7) (((Class364) class364_7_).aClass376_Sub7_Sub2_4777)).aByte7047--;
				if (((Class364) class364_7_).aClass376_Sub7_Sub3_4780 != null)
					((Class376_Sub7) (((Class364) class364_7_).aClass376_Sub7_Sub3_4780)).aByte7047--;
				if (((Class364) class364_7_).aClass376_Sub7_Sub3_4776 != null)
					((Class376_Sub7) (((Class364) class364_7_).aClass376_Sub7_Sub3_4776)).aByte7047--;
				if (((Class364) class364_7_).aClass376_Sub7_Sub4_4778 != null)
					((Class376_Sub7) (((Class364) class364_7_).aClass376_Sub7_Sub4_4778)).aByte7047--;
				if (((Class364) class364_7_).aClass376_Sub7_Sub4_4789 != null)
					((Class376_Sub7) (((Class364) class364_7_).aClass376_Sub7_Sub4_4789)).aByte7047--;
			}
		}
		if (Class181.aClass364ArrayArrayArray2336[0][i][i_5_] == null) {
			Class181.aClass364ArrayArrayArray2336[0][i][i_5_] = new Class364(0);
			((Class364) Class181.aClass364ArrayArrayArray2336[0][i][i_5_]).aByte4785 = (byte) 1;
		}
		((Class364) Class181.aClass364ArrayArrayArray2336[0][i][i_5_]).aClass364_4783 = class364;
		Class181.aClass364ArrayArrayArray2336[3][i][i_5_] = null;
	}

	public static void method154(int i) {
		do {
			try {
				anIntArray141 = null;
				if (i == 11677)
					break;
				method155(68, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tia.D(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method155(int i, Class376_Sub5 class376_sub5) {
		try {
			((Class376_Sub5) class376_sub5).aClass376_Sub7_6917 = null;
			anInt138++;
			int i_8_ = (((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916).length;
			for (int i_9_ = i; i_9_ < i_8_; i_9_++)
				((Class376_Sub4) (((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_9_])).aBool6124 = false;
			synchronized (Class11_Sub2_Sub12.aClass131Array8873) {
				if (Class11_Sub2_Sub12.aClass131Array8873.length > i_8_
						&& Class11_Sub37.anIntArray7090[i_8_] < 200) {
					Class11_Sub2_Sub12.aClass131Array8873[i_8_].method853(i,
							class376_sub5);
					Class11_Sub37.anIntArray7090[i_8_]++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tia.F(" + i + ','
					+ (class376_sub5 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class16() {
		/* empty */
	}

	static final boolean method156(String string, int i) {
		try {
			anInt139++;
			if (string == null)
				return false;
			for (int i_10_ = i; (Class94_Sub1.anInt5228 ^ 0xffffffff) < (i_10_ ^ 0xffffffff); i_10_++) {
				if (string.equalsIgnoreCase(Class109.aStringArray1476[i_10_]))
					return true;
			}
			if (string
					.equalsIgnoreCase(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tia.E("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
