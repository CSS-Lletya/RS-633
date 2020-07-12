/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class206 {
	boolean aBool2765 = false;
	static int anInt2766;
	static int anInt2767;
	static int anInt2768;
	static int anInt2769;
	static int anInt2770;
	static int anInt2771;
	static int anInt2772;
	static int anInt2773;
	static int anInt2774;
	static int anInt2775;
	static byte[] movementTypes = new byte[2048];
	static int anInt2777;
	static int anInt2778;
	static Class103 aClass103_2779;
	static Class103 aClass103_2780;
	static OutgoingPacket aClass370_2781;

	abstract void method1302(Class33 class33, int i, boolean bool);

	abstract void v();

	abstract int HA();

	private final void method1303(boolean bool, int i, int i_0_, int i_1_,
			int[] is, int i_2_, int[] is_3_, byte i_4_, int i_5_, int i_6_) {
		try {
			if (i_4_ <= 39)
				method1324((byte) 83);
			if (i_2_ != 1) {
				if ((i_2_ ^ 0xffffffff) != -3) {
					if (i_2_ == 3) {
						if ((i ^ 0xffffffff) != -1 && i != 1) {
							if (i == 3) {
								int i_7_ = i_5_;
								i_5_ = i_0_;
								i_0_ = i_7_;
							} else if ((i ^ 0xffffffff) == -3) {
								int i_8_ = i_5_;
								i_5_ = 0x3fff & i_0_;
								i_0_ = -i_8_ & 0x3fff;
							}
						} else {
							int i_9_ = i_5_;
							i_5_ = -i_0_;
							i_0_ = i_9_;
						}
					}
				} else if ((i ^ 0xffffffff) != -1 && i != 1) {
					if ((i ^ 0xffffffff) == -3) {
						i_5_ = 0x3fff & -i_5_;
						i_0_ = -i_0_ & 0x3fff;
					}
				} else {
					i_5_ = -i_5_;
					i_0_ = -i_0_;
				}
			} else if (i != 0 && i != 1) {
				if (i == 3) {
					int i_10_ = i_5_;
					i_5_ = i_0_;
					i_0_ = i_10_;
				} else if ((i ^ 0xffffffff) == -3) {
					int i_11_ = i_5_;
					i_5_ = -i_0_ & 0x3fff;
					i_0_ = 0x3fff & i_11_;
				}
			} else {
				int i_12_ = -i_5_;
				i_5_ = i_0_;
				i_0_ = i_12_;
			}
			anInt2772++;
			if (i_1_ != 65535)
				I(i, is, i_5_, i_6_, i_0_, bool, i_1_, is_3_);
			else
				method1320(i, is, i_5_, i_6_, i_0_, i_2_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ka.LB(" + bool + ','
					+ i + ',' + i_0_ + ',' + i_1_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ (is_3_ != null ? "{...}" : "null") + ',' + i_4_ + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	abstract int da();

	abstract int ua();

	abstract void a(int i);

	final void method1304(Class11_Sub45_Sub18 class11_sub45_sub18, int i,
			int i_13_, int i_14_, boolean bool, int i_15_, int i_16_,
			Class11_Sub45_Sub18 class11_sub45_sub18_17_, int i_18_) {
		try {
			anInt2769++;
			if ((i_13_ ^ 0xffffffff) != 0) {
				method1326();
				if (!NA())
					method1317();
				else {
					Class74 class74 = (((Class11_Sub45_Sub18) class11_sub45_sub18).aClass74Array9534[i_13_]);
					Class11_Sub29 class11_sub29 = ((Class74) class74).aClass11_Sub29_1020;
					Class74 class74_19_ = null;
					if (class11_sub45_sub18_17_ != null) {
						class74_19_ = (((Class11_Sub45_Sub18) class11_sub45_sub18_17_).aClass74Array9534[i_14_]);
						if (((Class74) class74_19_).aClass11_Sub29_1020 != class11_sub29)
							class74_19_ = null;
					}
					method1319((byte) -102, i_16_, null, null, 65535, false, i,
							i_15_, class11_sub29, class74_19_, class74, bool);
					wa();
					if (i_18_ != 1000)
						fa();
					method1317();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ka.GB("
					+ (class11_sub45_sub18 != null ? "{...}" : "null") + ','
					+ i + ',' + i_13_ + ',' + i_14_ + ',' + bool + ',' + i_15_
					+ ',' + i_16_ + ','
					+ (class11_sub45_sub18_17_ != null ? "{...}" : "null")
					+ ',' + i_18_ + ')'));
		}
	}

	abstract Class11_Sub45_Sub1 ba(Class11_Sub45_Sub1 class11_sub45_sub1);

	abstract boolean method1305(int i, int i_20_, Class33 class33,
			boolean bool, int i_21_, int i_22_);

	abstract void ia(short i, short i_23_);

	abstract void H(int i, int i_24_, int i_25_);

	abstract void method1306();

	abstract void I(int i, int[] is, int i_26_, int i_27_, int i_28_,
			boolean bool, int i_29_, int[] is_30_);

	abstract int G();

	abstract Class110[] method1307();

	abstract void P(int i, int i_31_, int i_32_, int i_33_);

	static final Class256_Sub2 method1308(Stream stream, byte i) {
		try {
			anInt2767++;
			if (i >= -92)
				movementTypes = null;
			return new Class256_Sub2(stream.method2508((byte) -121),
					stream.method2508((byte) 81),
					stream.method2508((byte) -103),
					stream.method2508((byte) -99),
					stream.method2508((byte) -124),
					stream.method2508((byte) 57), stream.method2508((byte) 16),
					stream.method2508((byte) -118), stream.method2558(false),
					stream.readUnsignedByte((byte) 35));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ka.QB("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	abstract boolean NA();

	abstract boolean method1309(int i, int i_34_, Class33 class33,
			boolean bool, int i_35_);

	abstract int ma();

	static final boolean method1310(boolean bool, int i, int i_36_, int i_37_,
			Class376_Sub7_Sub3 class376_sub7_sub3) {
		try {
			anInt2768++;
			if (!Class108_Sub10.aBool6130 || !Class236_Sub5.aBool6848)
				return false;
			if (Class217.anInt3003 < 100)
				return false;
			if (!Class11_Sub2_Sub30.method3792(i_36_, 843095752, i_37_, i))
				return false;
			if (bool != true)
				method1324((byte) -83);
			int i_38_ = i << Class11_Sub2_Sub8.anInt8751;
			int i_39_ = i_37_ << Class11_Sub2_Sub8.anInt8751;
			int i_40_ = (Class315.aClass12Array4179[i_36_].method131(
					(byte) 126, i_37_, i) - 1);
			int i_41_ = class376_sub7_sub3.method2867(32767) + i_40_;
			if ((((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 ^ 0xffffffff) == -2) {
				if (!Class181.method1188(i_38_, i_41_,
						(Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_), 0, i_38_,
						i_40_, i_38_, i_39_, i_41_, i_39_))
					return false;
				if (!Class181.method1188(i_38_, i_41_,
						(Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_), 0, i_38_,
						i_40_, i_38_, i_39_, i_40_,
						(Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_)))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if ((((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 ^ 0xffffffff) == -3) {
				if (!Class181.method1188(i_38_, i_41_,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_, 0, i_38_,
						i_40_, Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_, i_41_,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_))
					return false;
				if (!Class181.method1188(i_38_, i_40_,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_, 0, i_38_
								+ Class376_Sub7_Sub3_Sub2.anInt10141, i_40_,
						i_38_ - -Class376_Sub7_Sub3_Sub2.anInt10141, i_39_
								- -Class376_Sub7_Sub3_Sub2.anInt10141, i_41_,
						i_39_ - -Class376_Sub7_Sub3_Sub2.anInt10141))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if ((((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 ^ 0xffffffff) == -5) {
				if (!Class181.method1188(i_38_
						- -Class376_Sub7_Sub3_Sub2.anInt10141, i_41_,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_39_, 0,
						Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_, i_40_,
						i_38_ - -Class376_Sub7_Sub3_Sub2.anInt10141, i_39_,
						i_41_, i_39_))
					return false;
				if (!Class181.method1188(Class376_Sub7_Sub3_Sub2.anInt10141
						+ i_38_, i_41_, Class376_Sub7_Sub3_Sub2.anInt10141
						+ i_39_, 0, Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_,
						i_40_, Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_,
						i_39_, i_40_, i_39_
								+ Class376_Sub7_Sub3_Sub2.anInt10141))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if (((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 == 8) {
				if (!Class181.method1188(i_38_, i_41_, i_39_, 0, i_38_, i_40_,
						(Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_), i_39_,
						i_41_, i_39_))
					return false;
				if (!Class181.method1188(i_38_, i_40_, i_39_, 0,
						(Class376_Sub7_Sub3_Sub2.anInt10141 + i_38_), i_40_,
						i_38_ - -(Class376_Sub7_Sub3_Sub2.anInt10141), i_39_,
						i_41_, i_39_))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if ((((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 ^ 0xffffffff) == -17) {
				if (!Class243.method1536(i_41_, Class19.anInt152,
						Class19.anInt152, i_39_ - -Class19.anInt152,
						(byte) 116, i_40_, i_38_))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if (((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 == 32) {
				if (!Class243.method1536(i_41_, Class19.anInt152,
						Class19.anInt152, i_39_ + Class19.anInt152, (byte) 108,
						i_40_, Class19.anInt152 + i_38_))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if ((((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 ^ 0xffffffff) == -65) {
				if (!Class243.method1536(i_41_, Class19.anInt152,
						Class19.anInt152, i_39_, (byte) 107, i_40_, i_38_
								+ Class19.anInt152))
					return false;
				Class201.anInt2711++;
				return true;
			}
			if (((Class376_Sub7_Sub3) class376_sub7_sub3).aShort9274 == 128) {
				if (!Class243.method1536(i_41_, Class19.anInt152,
						Class19.anInt152, i_39_, (byte) 69, i_40_, i_38_))
					return false;
				Class201.anInt2711++;
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ka.JB(" + bool + ','
					+ i + ',' + i_36_ + ',' + i_37_ + ','
					+ (class376_sub7_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method1311(Class206 class206_42_, int i, int i_43_,
			int i_44_, boolean bool);

	static final void method1312(byte i, Class11_Sub6 class11_sub6) {
		do {
			try {
				anInt2778++;
				((Class11_Sub6) class11_sub6).aBool5247 = false;
				if (((Class11_Sub6) class11_sub6).aClass11_Sub14_5246 != null)
					((Class11_Sub14) (((Class11_Sub6) class11_sub6).aClass11_Sub14_5246)).anInt5518 = 0;
				for (Class11_Sub6 class11_sub6_45_ = class11_sub6.method2319(); class11_sub6_45_ != null; class11_sub6_45_ = class11_sub6
						.method2316())
					method1312((byte) 42, class11_sub6_45_);
				if (i == 42)
					break;
				method1316(27);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ka.HB(" + i + ','
						+ (class11_sub6 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	abstract Class206 method1313(byte i, int i_46_, boolean bool);

	abstract void p(int i, int i_47_, Class12 class12, Class12 class12_48_,
			int i_49_, int i_50_, int i_51_);

	abstract void s(int i);

	abstract void k(int i);

	abstract void wa();

	abstract void C(int i);

	abstract int WA();

	final void method1314(int i, int i_52_, int i_53_, int i_54_, int i_55_,
			boolean[] bools, Class11_Sub45_Sub18 class11_sub45_sub18,
			int i_56_, int i_57_, int i_58_,
			Class11_Sub45_Sub18 class11_sub45_sub18_59_, int i_60_,
			boolean bool, Class11_Sub45_Sub18 class11_sub45_sub18_61_,
			Class11_Sub45_Sub18 class11_sub45_sub18_62_) {
		try {
			anInt2775++;
			if ((i_58_ ^ 0xffffffff) != 0) {
				if (bools == null || (i_54_ ^ 0xffffffff) == 0)
					method1304(class11_sub45_sub18_61_, i_52_, i_58_, i_53_,
							bool, 0, i_57_, class11_sub45_sub18, 1000);
				else {
					method1326();
					if (!NA())
						method1317();
					else {
						Class74 class74 = (((Class11_Sub45_Sub18) class11_sub45_sub18_61_).aClass74Array9534[i_58_]);
						Class11_Sub29 class11_sub29 = ((Class74) class74).aClass11_Sub29_1020;
						Class74 class74_63_ = null;
						if (class11_sub45_sub18 != null) {
							class74_63_ = (((Class11_Sub45_Sub18) class11_sub45_sub18).aClass74Array9534[i_53_]);
							if (class11_sub29 != ((Class74) class74_63_).aClass11_Sub29_1020)
								class74_63_ = null;
						}
						method1319((byte) -85, i_57_, bools, null, 65535,
								false, i_52_, 0, class11_sub29, class74_63_,
								class74, bool);
						Class74 class74_64_ = (((Class11_Sub45_Sub18) class11_sub45_sub18_59_).aClass74Array9534[i_54_]);
						Class74 class74_65_ = null;
						if (class11_sub45_sub18_62_ != null) {
							class74_65_ = (((Class11_Sub45_Sub18) class11_sub45_sub18_62_).aClass74Array9534[i_60_]);
							if (((Class74) class74_65_).aClass11_Sub29_1020 != class11_sub29)
								class74_65_ = null;
						}
						int i_66_ = -58 % ((i_56_ + 65) / 33);
						method1320(0, new int[0], 0, 0, 0, 0, bool);
						method1319((byte) -49, i_55_, bools, null, 65535, true,
								i, 0,
								((Class74) class74_64_).aClass11_Sub29_1020,
								class74_65_, class74_64_, bool);
						wa();
						method1317();
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ka.MB("
							+ i
							+ ','
							+ i_52_
							+ ','
							+ i_53_
							+ ','
							+ i_54_
							+ ','
							+ i_55_
							+ ','
							+ (bools != null ? "{...}" : "null")
							+ ','
							+ (class11_sub45_sub18 != null ? "{...}" : "null")
							+ ','
							+ i_56_
							+ ','
							+ i_57_
							+ ','
							+ i_58_
							+ ','
							+ (class11_sub45_sub18_59_ != null ? "{...}"
									: "null")
							+ ','
							+ i_60_
							+ ','
							+ bool
							+ ','
							+ (class11_sub45_sub18_61_ != null ? "{...}"
									: "null")
							+ ','
							+ (class11_sub45_sub18_62_ != null ? "{...}"
									: "null") + ')'));
		}
	}

	abstract void LA(int i);

	final void method1315(int i, int i_67_,
			Class11_Sub45_Sub18 class11_sub45_sub18) {
		try {
			anInt2774++;
			if ((i ^ 0xffffffff) != 0) {
				method1326();
				if (!NA())
					method1317();
				else {
					Class74 class74 = (((Class11_Sub45_Sub18) class11_sub45_sub18).aClass74Array9534[i]);
					if (i_67_ != 30626)
						movementTypes = null;
					Class11_Sub29 class11_sub29 = ((Class74) class74).aClass11_Sub29_1020;
					for (int i_68_ = 0; ((i_68_ ^ 0xffffffff) > (((Class74) class74).anInt1021 ^ 0xffffffff)); i_68_++) {
						short i_69_ = ((Class74) class74).aShortArray1026[i_68_];
						if (((Class11_Sub29) class11_sub29).aBoolArray6596[i_69_]) {
							if (((Class74) class74).aShortArray1032[i_68_] != -1)
								P(0, 0, 0, 0);
							P((((Class11_Sub29) class11_sub29).anIntArray6592[i_69_]),
									((Class74) class74).aShortArray1027[i_68_],
									((Class74) class74).aShortArray1025[i_68_],
									((Class74) class74).aShortArray1029[i_68_]);
						}
					}
					wa();
					method1317();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ka.OB(" + i + ','
					+ i_67_ + ','
					+ (class11_sub45_sub18 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method1316(int i) {
		try {
			aClass370_2781 = null;
			aClass103_2780 = null;
			if (i < 113)
				method1310(false, 54, 102, 54, null);
			movementTypes = null;
			aClass103_2779 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ka.FB(" + i + ')');
		}
	}

	abstract void VA(int i);

	abstract boolean F();

	abstract int na();

	abstract void method1317();

	abstract void aa(short i, short i_70_);

	abstract void method1318(Class33 class33);

	abstract void O(int i, int i_71_, int i_72_);

	private final void method1319(byte i, int i_73_, boolean[] bools, int[] is,
			int i_74_, boolean bool, int i_75_, int i_76_,
			Class11_Sub29 class11_sub29, Class74 class74, Class74 class74_77_,
			boolean bool_78_) {
		try {
			anInt2773++;
			if (class74 == null || i_75_ == 0) {
				for (int i_79_ = 0; ((Class74) class74_77_).anInt1021 > i_79_; i_79_++) {
					short i_80_ = ((Class74) class74_77_).aShortArray1026[i_79_];
					if (bools == null
							|| !bool != bools[i_80_]
							|| ((((Class11_Sub29) class11_sub29).anIntArray6592[i_80_]) ^ 0xffffffff) == -1) {
						short i_81_ = ((Class74) class74_77_).aShortArray1032[i_79_];
						if ((i_81_ ^ 0xffffffff) != 0)
							method1303(
									bool_78_,
									0,
									0,
									(((Class11_Sub29) class11_sub29).anIntArray6597[i_81_])
											& i_74_,
									(((Class11_Sub29) class11_sub29).anIntArrayArray6595[i_81_]),
									i_76_, is, (byte) 71, 0, 0);
						method1303(
								bool_78_,
								(((Class11_Sub29) class11_sub29).anIntArray6592[i_80_]),
								((Class74) class74_77_).aShortArray1029[i_79_],
								i_74_
										& (((Class11_Sub29) class11_sub29).anIntArray6597[i_80_]),
								(((Class11_Sub29) class11_sub29).anIntArrayArray6595[i_80_]),
								i_76_, is, (byte) 70,
								((Class74) class74_77_).aShortArray1027[i_79_],
								((Class74) class74_77_).aShortArray1025[i_79_]);
					}
				}
			} else {
				int i_82_ = 0;
				int i_83_ = 0;
				if (i >= -32)
					aClass370_2781 = null;
				for (int i_84_ = 0; ((((Class11_Sub29) class11_sub29).anInt6590 ^ 0xffffffff) < (i_84_ ^ 0xffffffff)); i_84_++) {
					boolean bool_85_ = false;
					if (((((Class74) class74_77_).anInt1021 ^ 0xffffffff) < (i_82_ ^ 0xffffffff))
							&& (((Class74) class74_77_).aShortArray1026[i_82_] ^ 0xffffffff) == (i_84_ ^ 0xffffffff))
						bool_85_ = true;
					boolean bool_86_ = false;
					if ((i_83_ ^ 0xffffffff) > (((Class74) class74).anInt1021 ^ 0xffffffff)
							&& ((i_84_ ^ 0xffffffff) == (((Class74) class74).aShortArray1026[i_83_] ^ 0xffffffff)))
						bool_86_ = true;
					if (bool_85_ || bool_86_) {
						if (bools != null
								&& !bool != !bools[i_84_]
								&& ((((Class11_Sub29) class11_sub29).anIntArray6592[i_84_]) ^ 0xffffffff) != -1) {
							if (bool_86_)
								i_83_++;
							if (bool_85_)
								i_82_++;
						} else {
							int i_87_ = 0;
							int i_88_ = (((Class11_Sub29) class11_sub29).anIntArray6592[i_84_]);
							if (i_88_ == 3 || i_88_ == 10)
								i_87_ = 128;
							int i_89_;
							int i_90_;
							int i_91_;
							short i_92_;
							byte i_93_;
							if (bool_85_) {
								i_90_ = (((Class74) class74_77_).aShortArray1029[i_82_]);
								i_89_ = (((Class74) class74_77_).aShortArray1027[i_82_]);
								i_93_ = (((Class74) class74_77_).aByteArray1031[i_82_]);
								i_92_ = (((Class74) class74_77_).aShortArray1032[i_82_]);
								i_91_ = (((Class74) class74_77_).aShortArray1025[i_82_]);
								i_82_++;
							} else {
								i_89_ = i_87_;
								i_90_ = i_87_;
								i_91_ = i_87_;
								i_92_ = (short) -1;
								i_93_ = (byte) 0;
							}
							int i_94_;
							short i_95_;
							int i_96_;
							byte i_97_;
							int i_98_;
							if (bool_86_) {
								i_96_ = (((Class74) class74).aShortArray1029[i_83_]);
								i_95_ = (((Class74) class74).aShortArray1032[i_83_]);
								i_98_ = (((Class74) class74).aShortArray1027[i_83_]);
								i_94_ = (((Class74) class74).aShortArray1025[i_83_]);
								i_97_ = (((Class74) class74).aByteArray1031[i_83_]);
								i_83_++;
							} else {
								i_94_ = i_87_;
								i_95_ = (short) -1;
								i_96_ = i_87_;
								i_97_ = (byte) 0;
								i_98_ = i_87_;
							}
							if ((i_92_ ^ 0xffffffff) != 0)
								method1303(
										bool_78_,
										0,
										0,
										(((Class11_Sub29) class11_sub29).anIntArray6597[i_92_])
												& i_74_,
										(((Class11_Sub29) class11_sub29).anIntArrayArray6595[i_92_]),
										i_76_, is, (byte) 73, 0, 0);
							else if (i_95_ != -1)
								method1303(
										bool_78_,
										0,
										0,
										(i_74_ & (((Class11_Sub29) class11_sub29).anIntArray6597[i_95_])),
										(((Class11_Sub29) class11_sub29).anIntArrayArray6595[i_95_]),
										i_76_, is, (byte) 43, 0, 0);
							int i_99_;
							int i_100_;
							int i_101_;
							if ((0x2 & i_93_) == 0
									&& (0x1 & i_97_ ^ 0xffffffff) == -1) {
								if ((i_88_ ^ 0xffffffff) == -3) {
									int i_102_ = 0x3fff & -i_89_ + i_98_;
									int i_103_ = 0x3fff & -i_91_ + i_94_;
									if ((i_103_ ^ 0xffffffff) <= -8193)
										i_103_ -= 16384;
									if (i_102_ >= 8192)
										i_102_ -= 16384;
									int i_104_ = 0x3fff & -i_90_ + i_96_;
									i_100_ = (i_75_ * i_103_ / i_73_ + i_91_ & 0x3fff);
									if ((i_104_ ^ 0xffffffff) <= -8193)
										i_104_ -= 16384;
									i_99_ = (0x3fff & i_102_ * i_75_ / i_73_
											+ i_89_);
									i_101_ = (i_104_ * i_75_ / i_73_ + i_90_ & 0x3fff);
								} else if ((i_88_ ^ 0xffffffff) == -10) {
									int i_105_ = i_98_ - i_89_ & 0x3fff;
									if ((i_105_ ^ 0xffffffff) <= -8193)
										i_105_ -= 16384;
									i_99_ = (i_89_ - -(i_75_ * i_105_ / i_73_) & 0x3fff);
									i_100_ = i_101_ = 0;
								} else if ((i_88_ ^ 0xffffffff) == -8) {
									int i_106_ = 0x3f & -i_89_ + i_98_;
									if ((i_106_ ^ 0xffffffff) <= -33)
										i_106_ -= 64;
									i_99_ = (0x3f & i_75_ * i_106_ / i_73_
											+ i_89_);
									i_100_ = ((-i_91_ + i_94_) * i_75_ / i_73_ + i_91_);
									i_101_ = i_90_
											+ (i_75_ * (-i_90_ + i_96_) / i_73_);
								} else {
									i_100_ = i_91_
											+ (i_75_ * (-i_91_ + i_94_) / i_73_);
									i_101_ = i_90_
											- -((-i_90_ + i_96_) * i_75_ / i_73_);
									i_99_ = i_89_
											- -(i_75_ * (i_98_ - i_89_) / i_73_);
								}
							} else {
								i_99_ = i_89_;
								i_100_ = i_91_;
								i_101_ = i_90_;
							}
							method1303(
									bool_78_,
									i_88_,
									i_101_,
									(((Class11_Sub29) class11_sub29).anIntArray6597[i_84_])
											& i_74_,
									(((Class11_Sub29) class11_sub29).anIntArrayArray6595[i_84_]),
									i_76_, is, (byte) 106, i_99_, i_100_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ka.NB(" + i + ',' + i_73_ + ','
							+ (bools != null ? "{...}" : "null") + ','
							+ (is != null ? "{...}" : "null") + ',' + i_74_
							+ ',' + bool + ',' + i_75_ + ',' + i_76_ + ','
							+ (class11_sub29 != null ? "{...}" : "null") + ','
							+ (class74 != null ? "{...}" : "null") + ','
							+ (class74_77_ != null ? "{...}" : "null") + ','
							+ bool_78_ + ')'));
		}
	}

	abstract void method1320(int i, int[] is, int i_107_, int i_108_,
			int i_109_, int i_110_, boolean bool);

	abstract void method1321(Class33 class33, Class376_Sub4 class376_sub4, int i);

	abstract int EA();

	final void method1322(int i, Class12 class12, int i_111_, int i_112_,
			int i_113_, int i_114_, int i_115_, int i_116_, int i_117_) {
		do {
			try {
				anInt2771++;
				if (i_114_ != -3)
					aClass103_2780 = null;
				boolean bool = false;
				boolean bool_118_ = false;
				boolean bool_119_ = false;
				int i_120_ = -i_116_ / 2;
				int i_121_ = -i_112_ / 2;
				int i_122_ = class12.method130(i_115_ + i_121_, i_111_
						- -i_120_, -16);
				int i_123_ = i_116_ / 2;
				int i_124_ = -i_112_ / 2;
				int i_125_ = class12.method130(i_124_ + i_115_,
						i_123_ + i_111_, i_114_ ^ 0x7f);
				int i_126_ = -i_116_ / 2;
				int i_127_ = i_112_ / 2;
				int i_128_ = class12.method130(i_115_ - -i_127_, i_126_
						+ i_111_, i_114_ ^ 0x7e);
				int i_129_ = i_116_ / 2;
				int i_130_ = i_112_ / 2;
				int i_131_ = class12.method130(i_130_ + i_115_, i_111_
						- -i_129_, -128);
				int i_132_ = ((i_125_ ^ 0xffffffff) < (i_122_ ^ 0xffffffff) ? i_122_
						: i_125_);
				int i_133_ = ((i_128_ ^ 0xffffffff) > (i_131_ ^ 0xffffffff) ? i_128_
						: i_131_);
				int i_134_ = i_125_ < i_131_ ? i_125_ : i_131_;
				if (i_112_ != 0) {
					int i_135_ = (0x3fff & (int) (2607.5945876176133 * Math
							.atan2((double) (i_132_ + -i_133_), (double) i_112_)));
					if ((i_135_ ^ 0xffffffff) != -1) {
						if (i != 0) {
							if ((i_135_ ^ 0xffffffff) >= -8193) {
								if ((i_135_ ^ 0xffffffff) < (i ^ 0xffffffff))
									i_135_ = i;
							} else {
								int i_136_ = 16384 - i;
								if ((i_136_ ^ 0xffffffff) < (i_135_ ^ 0xffffffff))
									i_135_ = i_136_;
							}
						}
						FA(i_135_);
					}
				}
				int i_137_ = ((i_128_ ^ 0xffffffff) >= (i_122_ ^ 0xffffffff) ? i_128_
						: i_122_);
				int i_138_ = i_122_ + i_131_;
				if ((i_116_ ^ 0xffffffff) != -1) {
					int i_139_ = ((int) (2607.5945876176133 * Math.atan2(
							(double) (-i_134_ + i_137_), (double) i_116_)) & 0x3fff);
					if ((i_139_ ^ 0xffffffff) != -1) {
						if ((i_113_ ^ 0xffffffff) != -1) {
							if ((i_139_ ^ 0xffffffff) >= -8193) {
								if (i_113_ < i_139_)
									i_139_ = i_113_;
							} else {
								int i_140_ = -i_113_ + 16384;
								if ((i_140_ ^ 0xffffffff) < (i_139_ ^ 0xffffffff))
									i_139_ = i_140_;
							}
						}
						VA(i_139_);
					}
				}
				if ((i_138_ ^ 0xffffffff) < (i_125_ - -i_128_ ^ 0xffffffff))
					i_138_ = i_128_ + i_125_;
				i_138_ = -i_117_ + (i_138_ >> 1);
				if ((i_138_ ^ 0xffffffff) == -1)
					break;
				H(0, i_138_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ka.IB(" + i + ','
						+ (class12 != null ? "{...}" : "null") + ',' + i_111_
						+ ',' + i_112_ + ',' + i_113_ + ',' + i_114_ + ','
						+ i_115_ + ',' + i_116_ + ',' + i_117_ + ')'));
			}
			break;
		} while (false);
	}

	abstract int fa();

	abstract void method1323(int i, int i_141_, int i_142_, int i_143_);

	static final int method1324(byte i) {
		try {
			anInt2770++;
			boolean bool = false;
			boolean bool_144_ = false;
			boolean bool_145_ = false;
			if (((Class341) Class108_Sub21.aClass341_7304).aBool4520
					&& !((Class341) Class108_Sub21.aClass341_7304).aBool4502) {
				bool = true;
				if ((((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656 < 512)
						&& ((((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656) ^ 0xffffffff) != -1)
					bool = false;
				if (!Class341.aString4512.startsWith("win"))
					bool_144_ = true;
				else {
					bool_144_ = true;
					bool_145_ = true;
				}
			}
			if (Class251_Sub2.aBool5433)
				bool = false;
			if (Class11_Sub7.aBool5254)
				bool_144_ = false;
			if (Class108_Sub29.aBool8023)
				bool_145_ = false;
			if (!bool && !bool_144_ && !bool_145_)
				return Class108_Sub15.method2701(i + 79);
			int i_146_ = -1;
			if (i != -76)
				aClass103_2779 = null;
			int i_147_ = -1;
			if (bool) {
				try {
					i_146_ = Class224.method1437(1000, 2, (byte) 83);
				} catch (Exception exception) {
					/* empty */
				}
			}
			int i_148_ = -1;
			do {
				if (bool_145_) {
					try {
						i_148_ = Class224.method1437(1000, 3, (byte) 83);
						if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5696
								.method3181(false) ^ 0xffffffff) == -4) {
							Class100 class100 = Class321_Sub2.aClass163_6648
									.method1055();
							long l = (0xffffffffffffL & ((Class100) class100).aLong1330);
							int i_149_ = ((Class100) class100).anInt1332;
							if ((i_149_ ^ 0xffffffff) != -4319) {
								if ((i_149_ ^ 0xffffffff) != -4099)
									break;
							} else {
								bool_144_ = bool_144_
										& ((l ^ 0xffffffffffffffffL) <= -64425238955L);
								break;
							}
							bool_144_ = bool_144_ & l >= 60129613779L;
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} while (false);
			if (bool_144_) {
				try {
					i_147_ = Class224.method1437(1000, 1, (byte) 83);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if ((i_146_ ^ 0xffffffff) == 0 && (i_147_ ^ 0xffffffff) == 0
					&& i_148_ == -1)
				return Class108_Sub15.method2701(3);
			i_147_ *= 1.1F;
			i_148_ *= 1.1F;
			if ((i_146_ ^ 0xffffffff) < (i_148_ ^ 0xffffffff)
					&& i_146_ > i_147_)
				return Class236.method1507(i_146_, -11904);
			if ((i_147_ ^ 0xffffffff) <= (i_148_ ^ 0xffffffff))
				return Class293.method1815(-57, 1, i_147_);
			return Class293.method1815(i - 19, 3, i_148_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ka.PB(" + i + ')');
		}
	}

	abstract boolean r();

	abstract void FA(int i);

	abstract Class261[] method1325();

	abstract void method1326();

	final void method1327(int i, boolean bool, int i_150_, int i_151_,
			byte i_152_, Class11_Sub45_Sub18 class11_sub45_sub18, int i_153_,
			int i_154_, int i_155_,
			Class11_Sub45_Sub18 class11_sub45_sub18_156_, int[] is) {
		try {
			if (i_152_ > -34)
				aClass103_2780 = null;
			anInt2766++;
			if ((i_150_ ^ 0xffffffff) != 0) {
				method1326();
				if (!NA())
					method1317();
				else {
					Class74 class74 = (((Class11_Sub45_Sub18) class11_sub45_sub18).aClass74Array9534[i_150_]);
					Class11_Sub29 class11_sub29 = ((Class74) class74).aClass11_Sub29_1020;
					Class74 class74_157_ = null;
					if (class11_sub45_sub18_156_ != null) {
						class74_157_ = (((Class11_Sub45_Sub18) class11_sub45_sub18_156_).aClass74Array9534[i]);
						if (class11_sub29 != ((Class74) class74_157_).aClass11_Sub29_1020)
							class74_157_ = null;
					}
					method1319((byte) -84, i_154_, null, is, i_151_, false,
							i_155_, i_153_, class11_sub29, class74_157_,
							class74, bool);
					wa();
					method1317();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ka.KB(" + i + ','
					+ bool + ',' + i_150_ + ',' + i_151_ + ',' + i_152_ + ','
					+ (class11_sub45_sub18 != null ? "{...}" : "null") + ','
					+ i_153_ + ',' + i_154_ + ',' + i_155_ + ','
					+ (class11_sub45_sub18_156_ != null ? "{...}" : "null")
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	abstract int V();

	abstract int RA();

	abstract boolean method1328();

	abstract void method1329(Class33 class33, Class376_Sub4 class376_sub4,
			int i, int i_158_);

	public Class206() {
		/* empty */
	}

	static {
		aClass103_2779 = aClass103_2780 = new Class103(false);
		aClass370_2781 = new OutgoingPacket(25, 3);
	}
}
