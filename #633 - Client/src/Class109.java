/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class109 {
	static int anInt1466;
	static int anInt1467;
	static int anInt1468;
	private float[] aFloatArray1469 = new float[16];
	static int anInt1470;
	static int anInt1471;
	private Class11_Sub20_Sub2 aClass11_Sub20_Sub2_1472 = new Class11_Sub20_Sub2(
			786336);
	static int anInt1473;
	static IncomingPacket aClass160_1474 = new IncomingPacket(115, 3);
	static int anInt1475;
	static String[] aStringArray1476 = new String[200];
	static Class104[][] aClass104ArrayArray1477;
	private Class350 aClass350_1478;
	private Class350 aClass350_1479;
	private Class350 aClass350_1480;
	private Interface9 anInterface9_1481;
	private int anInt1482 = Class163_Sub2_Sub1.method3406((byte) 110, 1600);
	private int[] anIntArray1483 = new int[1600];
	private int[] anIntArray1484;
	private int anInt1485;
	private int[] anIntArray1486;
	private Class376_Sub1_Sub1[][] aClass376_Sub1_Sub1ArrayArray1487 = new Class376_Sub1_Sub1[64][768];
	private Class376_Sub1_Sub1[][] aClass376_Sub1_Sub1ArrayArray1488;

	private final void method729(int i, Class163_Sub3 class163_sub3, int i_0_) {
		try {
			Class11_Sub2_Sub33.aFloat9673 = ((Class163_Sub3) class163_sub3).aFloat8349;
			anInt1467++;
			class163_sub3.method3321((float) i_0_, (byte) -89);
			class163_sub3.method3279(-17);
			OpenGL.glDisable(16384);
			OpenGL.glDisable(i);
			class163_sub3.method3250((byte) 87, false);
			OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("dd.G(" + i + ','
							+ (class163_sub3 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	private final void method730(int i, Class163_Sub3 class163_sub3) {
		try {
			Class11_Sub2_Sub33.aFloat9673 = ((Class163_Sub3) class163_sub3).aFloat8349;
			if (i != 4)
				method734(null, (byte) -99, -5, null);
			anInt1468++;
			class163_sub3.method3308(32);
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
			class163_sub3.method3250((byte) 87, false);
			OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dd.A(" + i + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method731(Stream stream, byte i) {
		try {
			anInt1473++;
			int i_1_ = stream.readSmart(i + 215);
			Class115.aClass193Array1570 = new Class193[i_1_];
			for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_2_++) {
				Class115.aClass193Array1570[i_2_] = new Class193();
				((Class193) Class115.aClass193Array1570[i_2_]).anInt2636 = stream
						.readSmart(-100);
				((Class193) Class115.aClass193Array1570[i_2_]).aString2631 = stream
						.method2528(-74);
			}
			Class108_Sub12.anInt6226 = stream.readSmart(2);
			Class343.anInt4554 = stream.readSmart(i ^ ~0x65);
			Class57_Sub1.anInt5884 = stream.readSmart(7);
			Class47.aClass195_Sub1Array745 = (new Class195_Sub1[Class343.anInt4554
					+ -Class108_Sub12.anInt6226 + 1]);
			if (i != -108)
				method733(16);
			for (int i_3_ = 0; Class57_Sub1.anInt5884 > i_3_; i_3_++) {
				int i_4_ = stream.readSmart(-57);
				Class195_Sub1 class195_sub1 = (Class47.aClass195_Sub1Array745[i_4_] = new Class195_Sub1());
				((Class195) class195_sub1).anInt2653 = stream
						.readUnsignedByte((byte) 35);
				((Class195) class195_sub1).anInt2649 = stream.readInt(120);
				((Class195_Sub1) class195_sub1).anInt6159 = Class108_Sub12.anInt6226
						+ i_4_;
				((Class195_Sub1) class195_sub1).aString6160 = stream
						.method2528(-46);
				((Class195_Sub1) class195_sub1).aString6154 = stream
						.method2528(-106);
			}
			Class131.anInt1836 = stream.readInt(94);
			Class108_Sub7.aBool5634 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dd.E("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method732(int i, Class163_Sub3 class163_sub3) {
		try {
			anInterface9_1481 = class163_sub3.method3272(null, 196584, 24,
					true, (byte) 46);
			anInt1470++;
			aClass350_1479 = new Class350(anInterface9_1481, 5126, 2, 0);
			if (i > -66)
				method729(-93, null, 70);
			aClass350_1478 = new Class350(anInterface9_1481, 5126, 3, 8);
			aClass350_1480 = new Class350(anInterface9_1481, 5121, 4, 20);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dd.D(" + i + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method733(int i) {
		try {
			if (i != 64)
				aStringArray1476 = null;
			aStringArray1476 = null;
			aClass160_1474 = null;
			aClass104ArrayArray1477 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dd.C(" + i + ')');
		}
	}

	final void method734(Class116 class116, byte i, int i_5_,
			Class163_Sub3 class163_sub3) {
		try {
			anInt1466++;
			if (((Class163_Sub3) class163_sub3).aClass33_Sub1_8299 != null) {
				if ((i_5_ ^ 0xffffffff) <= -1)
					method729(16385, class163_sub3, i_5_);
				else
					method730(4, class163_sub3);
				float f = (((Class33_Sub1) ((Class163_Sub3) class163_sub3).aClass33_Sub1_8299).aFloat6197);
				float f_6_ = (((Class33_Sub1) (((Class163_Sub3) class163_sub3).aClass33_Sub1_8299)).aFloat6192);
				float f_7_ = (((Class33_Sub1) (((Class163_Sub3) class163_sub3).aClass33_Sub1_8299)).aFloat6174);
				float f_8_ = (((Class33_Sub1) (((Class163_Sub3) class163_sub3).aClass33_Sub1_8299)).aFloat6168);
				try {
					int i_9_ = 0;
					int i_10_ = 2147483647;
					int i_11_ = 0;
					Class376_Sub1 class376_sub1 = (((Class246) ((Class116) class116).aClass246_1584).aClass376_Sub1_3329);
					if (i < 97)
						method734(null, (byte) 87, -14, null);
					for (Class376_Sub1 class376_sub1_12_ = (((Class376_Sub1) class376_sub1).aClass376_Sub1_5095); class376_sub1 != class376_sub1_12_; class376_sub1_12_ = (((Class376_Sub1) class376_sub1_12_).aClass376_Sub1_5095)) {
						Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_12_;
						int i_13_ = (int) (f_8_ + ((float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689 >> 12)
								* f
								+ (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12)
								* f_6_ + (f_7_ * (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12))));
						if (i_11_ < i_13_)
							i_11_ = i_13_;
						if (i_10_ > i_13_)
							i_10_ = i_13_;
						anIntArray1486[i_9_++] = i_13_;
					}
					int i_14_ = -i_10_ + i_11_;
					int i_15_;
					if (2 + i_14_ <= 1600) {
						i_14_ += 2;
						i_15_ = 0;
					} else {
						i_15_ = 1 + (Class163_Sub2_Sub1.method3406((byte) 63,
								i_14_) + -anInt1482);
						i_14_ = 2 + (i_14_ >> i_15_);
					}
					Class376_Sub1 class376_sub1_16_ = ((Class376_Sub1) class376_sub1).aClass376_Sub1_5095;
					i_9_ = 0;
					int i_17_ = -2;
					boolean bool = true;
					boolean bool_18_ = true;
					while (class376_sub1_16_ != class376_sub1) {
						anInt1485 = 0;
						for (int i_19_ = 0; i_14_ > i_19_; i_19_++)
							anIntArray1483[i_19_] = 0;
						for (int i_20_ = 0; (i_20_ ^ 0xffffffff) > -65; i_20_++)
							anIntArray1484[i_20_] = 0;
						for (/**/; class376_sub1 != class376_sub1_16_; class376_sub1_16_ = (((Class376_Sub1) class376_sub1_16_).aClass376_Sub1_5095)) {
							Class376_Sub1_Sub1 class376_sub1_sub1 = (Class376_Sub1_Sub1) class376_sub1_16_;
							if (bool_18_) {
								i_17_ = ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694;
								bool_18_ = false;
								bool = ((Class376_Sub1_Sub1) class376_sub1_sub1).aBool8686;
							}
							if (i_9_ > 0
									&& (i_17_ != ((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8694 || !bool == (((Class376_Sub1_Sub1) class376_sub1_sub1).aBool8686))) {
								bool_18_ = true;
								break;
							}
							int i_21_ = -i_10_ + anIntArray1486[i_9_++] >> i_15_;
							if (i_21_ < 1600) {
								if (anIntArray1483[i_21_] < 64)
									aClass376_Sub1_Sub1ArrayArray1488[i_21_][anIntArray1483[i_21_]++] = class376_sub1_sub1;
								else {
									if (anIntArray1483[i_21_] == 64) {
										if (anInt1485 == 64)
											continue;
										anIntArray1483[i_21_] += anInt1485++ + 1;
									}
									aClass376_Sub1_Sub1ArrayArray1487[-1
											+ (anIntArray1483[i_21_] - 64)][anIntArray1484[(anIntArray1483[i_21_] - 64 - 1)]++] = class376_sub1_sub1;
								}
							}
						}
						if (i_17_ < 0)
							class163_sub3.method3291(119, -1);
						else
							class163_sub3.method3291(-85, i_17_);
						if (!bool
								|| (((Class163_Sub3) class163_sub3).aFloat8349 == Class11_Sub2_Sub33.aFloat9673)) {
							if (((Class163_Sub3) class163_sub3).aFloat8349 != 1.0F)
								class163_sub3.xa(1.0F);
						} else
							class163_sub3.xa(Class11_Sub2_Sub33.aFloat9673);
						method736(i_14_, class163_sub3, false);
					}
				} catch (Exception exception) {
					/* empty */
				}
				method735(class163_sub3, 16385);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("dd.H("
							+ (class116 != null ? "{...}" : "null") + ',' + i
							+ ',' + i_5_ + ','
							+ (class163_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	private final void method735(Class163_Sub3 class163_sub3, int i) {
		do {
			try {
				class163_sub3.method3250((byte) 87, true);
				anInt1475++;
				OpenGL.glEnable(16384);
				OpenGL.glEnable(i);
				if (Class11_Sub2_Sub33.aFloat9673 == ((Class163_Sub3) class163_sub3).aFloat8349)
					break;
				class163_sub3.xa(Class11_Sub2_Sub33.aFloat9673);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("dd.B(" + (class163_sub3 != null ? "{...}" : "null")
								+ ',' + i + ')'));
			}
			break;
		} while (false);
	}

	private final void method736(int i, Class163_Sub3 class163_sub3,
			boolean bool) {
		do {
			try {
				anInt1471++;
				OpenGL.glGetFloatv(2982, aFloatArray1469, 0);
				float f = aFloatArray1469[0];
				float f_22_ = aFloatArray1469[4];
				float f_23_ = aFloatArray1469[8];
				float f_24_ = aFloatArray1469[1];
				float f_25_ = aFloatArray1469[5];
				float f_26_ = aFloatArray1469[9];
				float f_27_ = f + f_24_;
				float f_28_ = f_25_ + f_22_;
				float f_29_ = f_26_ + f_23_;
				if (bool != false)
					method729(109, null, 41);
				float f_30_ = f - f_24_;
				float f_31_ = f_22_ - f_25_;
				float f_32_ = -f_26_ + f_23_;
				float f_33_ = f_24_ - f;
				float f_34_ = f_25_ - f_22_;
				float f_35_ = f_26_ - f_23_;
				((Stream) aClass11_Sub20_Sub2_1472).position = 0;
				if (((Class163_Sub3) class163_sub3).aBool8348) {
					for (int i_36_ = i - 1; (i_36_ ^ 0xffffffff) <= -1; i_36_--) {
						int i_37_ = (anIntArray1483[i_36_] > 64 ? 64
								: anIntArray1483[i_36_]);
						if (i_37_ > 0) {
							for (int i_38_ = -1 + i_37_; i_38_ >= 0; i_38_--) {
								Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray1488[i_36_][i_38_]);
								int i_39_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
								byte i_40_ = (byte) (i_39_ >> 16);
								byte i_41_ = (byte) (i_39_ >> 8);
								byte i_42_ = (byte) i_39_;
								byte i_43_ = (byte) (i_39_ >>> 24);
								float f_44_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689 >> 12);
								float f_45_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691 >> 12);
								float f_46_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684 >> 12);
								int i_47_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
								aClass11_Sub20_Sub2_1472.method3744(0.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(0.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(f_27_
										* (float) -i_47_ + f_44_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(
										(float) -i_47_ * f_28_ + f_45_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(f_46_
										+ f_29_ * (float) -i_47_, -32197);
								aClass11_Sub20_Sub2_1472.writeByte(i_40_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_41_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_42_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_43_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3744(1.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(0.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(f_44_
										+ (float) i_47_ * f_30_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(f_31_
										* (float) i_47_ + f_45_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(f_46_
										+ f_32_ * (float) i_47_, -32197);
								aClass11_Sub20_Sub2_1472.writeByte(i_40_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_41_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_42_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_43_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3744(1.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(1.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(f_44_
										+ (float) i_47_ * f_27_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(
										(float) i_47_ * f_28_ + f_45_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(f_29_
										* (float) i_47_ + f_46_, -32197);
								aClass11_Sub20_Sub2_1472.writeByte(i_40_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_41_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_42_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_43_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3744(0.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(1.0F,
										-32197);
								aClass11_Sub20_Sub2_1472.method3744(f_44_
										+ (float) i_47_ * f_33_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(
										(float) i_47_ * f_34_ + f_45_, -32197);
								aClass11_Sub20_Sub2_1472.method3744(f_46_
										+ (float) i_47_ * f_35_, -32197);
								aClass11_Sub20_Sub2_1472.writeByte(i_40_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_41_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_42_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_43_,
										-1528071456);
							}
							if ((anIntArray1483[i_36_] ^ 0xffffffff) < -65) {
								int i_48_ = anIntArray1483[i_36_] - 65;
								for (int i_49_ = -1 + anIntArray1484[i_48_]; (i_49_ ^ 0xffffffff) <= -1; i_49_--) {
									Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray1487[i_48_][i_49_]);
									int i_50_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
									byte i_51_ = (byte) (i_50_ >> 16);
									byte i_52_ = (byte) (i_50_ >> 8);
									byte i_53_ = (byte) i_50_;
									byte i_54_ = (byte) (i_50_ >>> 24);
									float f_55_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
									float f_56_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
									float f_57_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
									int i_58_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
									aClass11_Sub20_Sub2_1472.method3744(0.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(0.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(
											(float) -i_58_ * f_27_ + f_55_,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(f_56_
											+ (float) -i_58_ * f_28_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(
											(float) -i_58_ * f_29_ + f_57_,
											-32197);
									aClass11_Sub20_Sub2_1472.writeByte(i_51_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_52_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_53_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_54_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3744(1.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(0.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(f_55_
											+ (float) i_58_ * f_30_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(f_31_
											* (float) i_58_ + f_56_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(f_57_
											+ f_32_ * (float) i_58_, -32197);
									aClass11_Sub20_Sub2_1472.writeByte(i_51_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_52_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_53_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_54_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3744(1.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(1.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(f_55_
											+ (float) i_58_ * f_27_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(f_28_
											* (float) i_58_ + f_56_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(f_29_
											* (float) i_58_ + f_57_, -32197);
									aClass11_Sub20_Sub2_1472.writeByte(i_51_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_52_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_53_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_54_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3744(0.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(1.0F,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(f_55_
											+ f_33_ * (float) i_58_, -32197);
									aClass11_Sub20_Sub2_1472.method3744(
											(float) i_58_ * f_34_ + f_56_,
											-32197);
									aClass11_Sub20_Sub2_1472.method3744(
											(float) i_58_ * f_35_ + f_57_,
											-32197);
									aClass11_Sub20_Sub2_1472.writeByte(i_51_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_52_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_53_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_54_,
											-1528071456);
								}
							}
						}
					}
				} else {
					for (int i_59_ = i - 1; i_59_ >= 0; i_59_--) {
						int i_60_ = ((anIntArray1483[i_59_] ^ 0xffffffff) < -65 ? 64
								: anIntArray1483[i_59_]);
						if ((i_60_ ^ 0xffffffff) < -1) {
							for (int i_61_ = -1 + i_60_; i_61_ >= 0; i_61_--) {
								Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray1488[i_59_][i_61_]);
								int i_62_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
								byte i_63_ = (byte) (i_62_ >> 16);
								byte i_64_ = (byte) (i_62_ >> 8);
								byte i_65_ = (byte) i_62_;
								byte i_66_ = (byte) (i_62_ >>> 24);
								float f_67_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689 >> 12);
								float f_68_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691 >> 12);
								float f_69_ = (float) (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684 >> 12);
								int i_70_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 0.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 0.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_27_ * (float) -i_70_
												+ f_67_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_68_ + (float) -i_70_
												* f_28_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, (float) -i_70_ * f_29_
												+ f_69_);
								aClass11_Sub20_Sub2_1472.writeByte(i_63_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_64_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_65_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_66_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 1.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 0.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_67_ + f_30_
												* (float) i_70_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_31_ * (float) i_70_
												+ f_68_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_69_ + f_32_
												* (float) i_70_);
								aClass11_Sub20_Sub2_1472.writeByte(i_63_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_64_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_65_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_66_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 1.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 1.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_27_ * (float) i_70_
												+ f_67_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_68_ + f_28_
												* (float) i_70_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, (float) i_70_ * f_29_
												+ f_69_);
								aClass11_Sub20_Sub2_1472.writeByte(i_63_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_64_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_65_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_66_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 0.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, 1.0F);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_67_ + (float) i_70_
												* f_33_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, f_68_ + (float) i_70_
												* f_34_);
								aClass11_Sub20_Sub2_1472.method3743(
										-1526311408, (float) i_70_ * f_35_
												+ f_69_);
								aClass11_Sub20_Sub2_1472.writeByte(i_63_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_64_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_65_,
										-1528071456);
								aClass11_Sub20_Sub2_1472.writeByte(i_66_,
										-1528071456);
							}
							if ((anIntArray1483[i_59_] ^ 0xffffffff) < -65) {
								int i_71_ = -1 + (-64 + anIntArray1483[i_59_]);
								for (int i_72_ = -1 + anIntArray1484[i_71_]; i_72_ >= 0; i_72_--) {
									Class376_Sub1_Sub1 class376_sub1_sub1 = (aClass376_Sub1_Sub1ArrayArray1487[i_71_][i_72_]);
									int i_73_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8696);
									byte i_74_ = (byte) (i_73_ >> 16);
									byte i_75_ = (byte) (i_73_ >> 8);
									byte i_76_ = (byte) i_73_;
									byte i_77_ = (byte) (i_73_ >>> 24);
									float f_78_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8689) >> 12);
									float f_79_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8691) >> 12);
									float f_80_ = (float) ((((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8684) >> 12);
									int i_81_ = (((Class376_Sub1_Sub1) class376_sub1_sub1).anInt8692 >> 12);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 0.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 0.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_78_ + (float) -i_81_
													* f_27_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_79_ + f_28_
													* (float) -i_81_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_80_ + (float) -i_81_
													* f_29_);
									aClass11_Sub20_Sub2_1472.writeByte(i_74_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_75_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_76_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_77_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 1.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 0.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_78_ + f_30_
													* (float) i_81_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_31_ * (float) i_81_
													+ f_79_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_32_ * (float) i_81_
													+ f_80_);
									aClass11_Sub20_Sub2_1472.writeByte(i_74_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_75_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_76_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_77_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 1.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 1.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, (float) i_81_ * f_27_
													+ f_78_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_79_ + f_28_
													* (float) i_81_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_29_ * (float) i_81_
													+ f_80_);
									aClass11_Sub20_Sub2_1472.writeByte(i_74_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_75_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_76_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_77_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 0.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, 1.0F);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, (float) i_81_ * f_33_
													+ f_78_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_79_ + f_34_
													* (float) i_81_);
									aClass11_Sub20_Sub2_1472.method3743(
											-1526311408, f_80_ + (float) i_81_
													* f_35_);
									aClass11_Sub20_Sub2_1472.writeByte(i_74_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_75_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_76_,
											-1528071456);
									aClass11_Sub20_Sub2_1472.writeByte(i_77_,
											-1528071456);
								}
							}
						}
					}
				}
				if ((((Stream) aClass11_Sub20_Sub2_1472).position ^ 0xffffffff) == -1)
					break;
				anInterface9_1481.method31(
						(((Stream) aClass11_Sub20_Sub2_1472).position), 506,
						24, (((Stream) aClass11_Sub20_Sub2_1472).buffer));
				class163_sub3.method3304(null, aClass350_1478, aClass350_1480,
						(byte) 108, aClass350_1479);
				class163_sub3.method3268(7,
						(((Stream) aClass11_Sub20_Sub2_1472).position) / 24, 0,
						39);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("dd.F(" + i + ','
						+ (class163_sub3 != null ? "{...}" : "null") + ','
						+ bool + ')'));
			}
			break;
		} while (false);
	}

	Class109() {
		anInt1485 = 0;
		aClass376_Sub1_Sub1ArrayArray1488 = new Class376_Sub1_Sub1[1600][64];
		anIntArray1486 = new int[8191];
		anIntArray1484 = new int[64];
	}
}
