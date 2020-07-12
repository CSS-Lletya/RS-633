/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146 {
	static int anInt1949;
	static int anInt1950;
	static int anInt1951;
	static int anInt1952;
	static int anInt1953;
	static int anInt1954;
	static int anInt1955;
	static int anInt1956;
	static int anInt1957;
	private Class19 aClass19_1958;
	static int anInt1959;
	static int anInt1960;
	private boolean aBool1961;
	static int anInt1962;
	static int anInt1963;
	private Object[][] anObjectArrayArray1964;
	static int anInt1965;
	static int anInt1966;
	static int anInt1967;
	static int anInt1968;
	static int anInt1969;
	static int anInt1970;
	static int anInt1971;
	static int anInt1972;
	static int anInt1973;
	static int anInt1974;
	static int anInt1975;
	static int anInt1976;
	private Class130 aClass130_1977 = null;
	static int anInt1978;
	static int anInt1979;
	static int anInt1980;
	static Class347 aClass347_1981 = new Class347("WTI", 5);
	static int anInt1982;
	static int anInt1983;
	static int anInt1984;
	private Object[] anObjectArray1985;
	static int anInt1986;
	int anInt1987;
	static int anInt1988;
	static int anInt1989;

	final int[] method907(int i, int i_0_) {
		try {
			anInt1973++;
			if (!method937(i_0_ ^ 0x34e4, i))
				return null;
			if (i_0_ != 0)
				method915((byte) 94);
			int[] is = ((Class130) aClass130_1977).anIntArrayArray1817[i];
			if (is == null) {
				is = new int[((Class130) aClass130_1977).anIntArray1807[i]];
				for (int i_1_ = 0; is.length > i_1_; i_1_++)
					is[i_1_] = i_1_;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.HA(" + i + ','
					+ i_0_ + ')');
		}
	}

	final int method908(String string, byte i) {
		try {
			anInt1978++;
			if (!method935(123))
				return 0;
			string = string.toLowerCase();
			if (i < 11)
				return -44;
			int i_2_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -29));
			return method919(0, i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.K("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final void method909(int i, int i_3_) {
		try {
			if (i == -1) {
				if (!aBool1961)
					anObjectArray1985[i_3_] = (Class254_Sub3.method3238(105,
							false, aClass19_1958.method165(i_3_, -23159)));
				else
					anObjectArray1985[i_3_] = aClass19_1958.method165(i_3_,
							Class77.method527(i, 23158));
				anInt1971++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.F(" + i + ','
					+ i_3_ + ')');
		}
	}

	final void method910(int i, int i_4_) {
		do {
			try {
				anInt1963++;
				if (method937(13540, i_4_) && i < -111) {
					if (anObjectArrayArray1964 == null)
						break;
					anObjectArrayArray1964[i_4_] = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fp.V(" + i + ','
						+ i_4_ + ')');
			}
			break;
		} while (false);
	}

	final void method911(int i) {
		try {
			if (anObjectArrayArray1964 != null) {
				for (int i_5_ = 0; ((anObjectArrayArray1964.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff)); i_5_++)
					anObjectArrayArray1964[i_5_] = null;
			}
			if (i < -81)
				anInt1953++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.R(" + i + ')');
		}
	}

	final int method912(int i) {
		try {
			anInt1970++;
			if (!method935(104))
				return 0;
			int i_6_ = 0;
			int i_7_ = 0;
			for (int i_8_ = 0; anObjectArray1985.length > i_8_; i_8_++) {
				if ((((Class130) aClass130_1977).anIntArray1807[i_8_] ^ 0xffffffff) < -1) {
					i_7_ += method919(0, i_8_);
					i_6_ += 100;
				}
			}
			if (i == i_6_)
				return 100;
			int i_9_ = i_7_ * 100 / i_6_;
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.O(" + i + ')');
		}
	}

	static final IComponentDefinitions method913(int i, byte i_10_, int i_11_) {
		try {
			anInt1969++;
			IComponentDefinitions class192 = Class11_Sub2_Sub13.method3533(
					(byte) -112, i);
			int i_12_ = -91 % ((i_10_ + 37) / 53);
			if ((i_11_ ^ 0xffffffff) == 0)
				return class192;
			if (class192 == null
					|| ((IComponentDefinitions) class192).aClass192Array2524 == null
					|| ((i_11_ ^ 0xffffffff) <= (((IComponentDefinitions) class192).aClass192Array2524.length ^ 0xffffffff)))
				return null;
			return ((IComponentDefinitions) class192).aClass192Array2524[i_11_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.AA(" + i + ','
					+ i_10_ + ',' + i_11_ + ')'));
		}
	}

	final int method914(int i, int i_13_) {
		try {
			if (i_13_ != 0)
				method930(-74, (byte) -42, -18);
			anInt1957++;
			if (!method937(13540, i))
				return 0;
			return ((Class130) aClass130_1977).anIntArray1811[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.I(" + i + ','
					+ i_13_ + ')');
		}
	}

	public static void method915(byte i) {
		do {
			try {
				aClass347_1981 = null;
				if (i == 12)
					break;
				aClass347_1981 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fp.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method916(int i) {
		try {
			anInt1959++;
			if (i != -7296)
				aClass19_1958 = null;
			if (!method935(105))
				return false;
			boolean bool = true;
			for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (((Class130) aClass130_1977).anIntArray1815.length ^ 0xffffffff)); i_14_++) {
				int i_15_ = ((Class130) aClass130_1977).anIntArray1815[i_14_];
				if (anObjectArray1985[i_15_] == null) {
					method909(-1, i_15_);
					if (anObjectArray1985[i_15_] == null)
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.GA(" + i + ')');
		}
	}

	private final boolean method917(int[] is, int i, int i_16_, int i_17_) {
		try {
			anInt1975++;
			if (!method937(13540, i_16_))
				return false;
			if (anObjectArray1985[i_16_] == null)
				return false;
			int i_18_ = ((Class130) aClass130_1977).anIntArray1807[i_16_];
			int[] is_19_ = ((Class130) aClass130_1977).anIntArrayArray1817[i_16_];
			if (anObjectArrayArray1964[i_16_] == null)
				anObjectArrayArray1964[i_16_] = (new Object[((Class130) aClass130_1977).anIntArray1811[i_16_]]);
			Object[] objects = anObjectArrayArray1964[i_16_];
			boolean bool = true;
			for (int i_20_ = i_17_; i_20_ < i_18_; i_20_++) {
				int i_21_;
				if (is_19_ == null)
					i_21_ = i_20_;
				else
					i_21_ = is_19_[i_20_];
				if (objects[i_21_] == null) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
			byte[] is_22_;
			if (is == null
					|| ((is[0] ^ 0xffffffff) == -1
							&& (is[1] ^ 0xffffffff) == -1
							&& (is[2] ^ 0xffffffff) == -1 && is[3] == 0))
				is_22_ = Class236_Sub9.method3122(i_17_ ^ 0x2, false,
						anObjectArray1985[i_16_]);
			else {
				is_22_ = Class236_Sub9.method3122(i_17_ ^ 0x2, true,
						anObjectArray1985[i_16_]);
				Stream stream = new Stream(is_22_);
				stream.method2533(5, is, ((Stream) stream).buffer.length,
						(byte) -127);
			}
			byte[] is_23_;
			try {
				is_23_ = Class58_Sub1.method2950(is_22_, false);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(
								runtimeexception,
								("T3 - "
										+ (is != null)
										+ ","
										+ i_16_
										+ ","
										+ is_22_.length
										+ ","
										+ Class11_Sub23.method2572(
												is_22_.length, (byte) 28,
												is_22_)
										+ ","
										+ Class11_Sub23.method2572(
												is_22_.length - 2, (byte) 28,
												is_22_)
										+ ","
										+ ((Class130) aClass130_1977).anIntArray1804[i_16_]
										+ "," + ((Class130) aClass130_1977).anInt1809));
			}
			if (aBool1961)
				anObjectArray1985[i_16_] = null;
			if ((i_18_ ^ 0xffffffff) >= -2) {
				int i_24_;
				if (is_19_ != null)
					i_24_ = is_19_[0];
				else
					i_24_ = 0;
				if ((((Class146) this).anInt1987 ^ 0xffffffff) != -1)
					objects[i_24_] = is_23_;
				else
					objects[i_24_] = Class254_Sub3.method3238(101, false,
							is_23_);
			} else if (((Class146) this).anInt1987 != 2) {
				int i_25_ = is_23_.length;
				int i_26_ = 0xff & is_23_[--i_25_];
				i_25_ -= i_26_ * i_18_ * 4;
				Stream stream = new Stream(is_23_);
				int[] is_27_ = new int[i_18_];
				((Stream) stream).position = i_25_;
				for (int i_28_ = 0; (i_28_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff); i_28_++) {
					int i_29_ = 0;
					for (int i_30_ = 0; (i_18_ ^ 0xffffffff) < (i_30_ ^ 0xffffffff); i_30_++) {
						i_29_ += stream.readInt(123);
						is_27_[i_30_] += i_29_;
					}
				}
				byte[][] is_31_ = new byte[i_18_][];
				for (int i_32_ = 0; (i_32_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff); i_32_++) {
					is_31_[i_32_] = new byte[is_27_[i_32_]];
					is_27_[i_32_] = 0;
				}
				((Stream) stream).position = i_25_;
				int i_33_ = 0;
				for (int i_34_ = 0; (i_26_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++) {
					int i_35_ = 0;
					for (int i_36_ = 0; (i_18_ ^ 0xffffffff) < (i_36_ ^ 0xffffffff); i_36_++) {
						i_35_ += stream.readInt(i_17_ + 90);
						Class311.method1898(is_23_, i_33_, is_31_[i_36_],
								is_27_[i_36_], i_35_);
						i_33_ += i_35_;
						is_27_[i_36_] += i_35_;
					}
				}
				for (int i_37_ = 0; (i_18_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++) {
					int i_38_;
					if (is_19_ == null)
						i_38_ = i_37_;
					else
						i_38_ = is_19_[i_37_];
					if (((Class146) this).anInt1987 == 0)
						objects[i_38_] = Class254_Sub3.method3238(88, false,
								is_31_[i_37_]);
					else
						objects[i_38_] = is_31_[i_37_];
				}
			} else {
				int i_39_ = is_23_.length;
				int i_40_ = 0xff & is_23_[--i_39_];
				i_39_ -= 4 * i_40_ * i_18_;
				Stream stream = new Stream(is_23_);
				int i_41_ = 0;
				int i_42_ = 0;
				((Stream) stream).position = i_39_;
				for (int i_43_ = 0; (i_40_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
					int i_44_ = 0;
					for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
						i_44_ += stream.readInt(93);
						int i_46_;
						if (is_19_ == null)
							i_46_ = i_45_;
						else
							i_46_ = is_19_[i_45_];
						if (i == i_46_) {
							i_41_ += i_44_;
							i_42_ = i_46_;
						}
					}
				}
				if ((i_41_ ^ 0xffffffff) == -1)
					return true;
				byte[] is_47_ = new byte[i_41_];
				((Stream) stream).position = i_39_;
				i_41_ = 0;
				int i_48_ = 0;
				for (int i_49_ = 0; (i_40_ ^ 0xffffffff) < (i_49_ ^ 0xffffffff); i_49_++) {
					int i_50_ = 0;
					for (int i_51_ = 0; i_51_ < i_18_; i_51_++) {
						i_50_ += stream.readInt(i_17_ ^ 0x5f);
						int i_52_;
						if (is_19_ != null)
							i_52_ = is_19_[i_51_];
						else
							i_52_ = i_51_;
						if (i == i_52_) {
							Class311.method1898(is_23_, i_48_, is_47_, i_41_,
									i_50_);
							i_41_ += i_50_;
						}
						i_48_ += i_50_;
					}
				}
				objects[i_42_] = is_47_;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.FA("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_16_
					+ ',' + i_17_ + ')'));
		}
	}

	final boolean method918(int i, int i_53_) {
		try {
			anInt1960++;
			int i_54_ = 63 % ((i_53_ - 33) / 54);
			if (!method935(-109))
				return false;
			if ((((Class130) aClass130_1977).anIntArray1811.length ^ 0xffffffff) == -2)
				return method927((byte) -84, 0, i);
			if (!method937(13540, i))
				return false;
			if (((Class130) aClass130_1977).anIntArray1811[i] == 1)
				return method927((byte) -117, i, 0);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.A(" + i + ','
					+ i_53_ + ')');
		}
	}

	private final int method919(int i, int i_55_) {
		try {
			anInt1968++;
			if (!method937(13540, i_55_))
				return 0;
			if (i != 0)
				method915((byte) 14);
			if (anObjectArray1985[i_55_] != null)
				return 100;
			return aClass19_1958.method162(false, i_55_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.EA(" + i + ','
					+ i_55_ + ')');
		}
	}

	final int method920(int i, String string) {
		try {
			anInt1980++;
			if (!method935(108))
				return -1;
			int i_56_ = -66 % ((57 - i) / 52);
			string = string.toLowerCase();
			int i_57_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -24));
			if (!method937(13540, i_57_))
				return -1;
			return i_57_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.JA(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method921(String string, int i) {
		try {
			anInt1955++;
			if (i != -2)
				return false;
			if (!method935(i + 124))
				return false;
			string = string.toLowerCase();
			int i_58_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -61));
			return method931(i_58_, -88);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.LA("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final void method922(boolean bool, int i, boolean bool_59_) {
		do {
			try {
				if (i != 0)
					method934(null, (byte) 96);
				anInt1952++;
				if (method935(123)) {
					if (bool_59_) {
						((Class130) aClass130_1977).anIntArray1812 = null;
						((Class130) aClass130_1977).aClass67_1808 = null;
					}
					if (!bool)
						break;
					((Class130) aClass130_1977).aClass67Array1806 = null;
					((Class130) aClass130_1977).anIntArrayArray1803 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fp.L(" + bool
						+ ',' + i + ',' + bool_59_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method923(byte i, String string) {
		try {
			anInt1954++;
			if (!method935(120))
				return false;
			string = string.toLowerCase();
			int i_60_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -46));
			int i_61_ = -28 % ((-65 - i) / 57);
			if ((i_60_ ^ 0xffffffff) > -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.CA(" + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method924(int i, String string, String string_62_) {
		try {
			anInt1949++;
			if (!method935(108))
				return false;
			string = string.toLowerCase();
			string_62_ = string_62_.toLowerCase();
			int i_63_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -80));
			if ((i_63_ ^ 0xffffffff) > -1)
				return false;
			int i_64_ = (((Class130) aClass130_1977).aClass67Array1806[i_63_]
					.method495(false, Class5.method84(string_62_, (byte) -108)));
			if (i <= 21)
				method921(null, -72);
			if ((i_64_ ^ 0xffffffff) > -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.E(" + i + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (string_62_ != null ? "{...}" : "null") + ')'));
		}
	}

	final int method925(int i) {
		try {
			int i_65_ = -53 % ((68 - i) / 46);
			anInt1979++;
			if (!method935(-97))
				throw new IllegalStateException("");
			return ((Class130) aClass130_1977).anInt1809;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.D(" + i + ')');
		}
	}

	private final boolean method926(String string, int i, String string_66_) {
		try {
			anInt1972++;
			if (!method935(117))
				return false;
			string = string.toLowerCase();
			string_66_ = string_66_.toLowerCase();
			int i_67_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -45));
			if (!method937(13540, i_67_))
				return false;
			if (i != 5)
				return false;
			int i_68_ = (((Class130) aClass130_1977).aClass67Array1806[i_67_]
					.method495(false, Class5.method84(string_66_, (byte) -128)));
			return method927((byte) -101, i_67_, i_68_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.IA("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ (string_66_ != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method927(byte i, int i_69_, int i_70_) {
		try {
			anInt1956++;
			if (!method940((byte) 25, i_70_, i_69_))
				return false;
			if (i >= -66)
				method927((byte) -101, 122, 79);
			if (anObjectArrayArray1964[i_69_] != null
					&& anObjectArrayArray1964[i_69_][i_70_] != null)
				return true;
			if (anObjectArray1985[i_69_] != null)
				return true;
			method909(-1, i_69_);
			if (anObjectArray1985[i_69_] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.KA(" + i + ','
					+ i_69_ + ',' + i_70_ + ')'));
		}
	}

	final int method928(byte i) {
		try {
			anInt1974++;
			if (i != 20)
				return 127;
			if (!method935(i ^ ~0x2a))
				return -1;
			return ((Class130) aClass130_1977).anIntArray1811.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.BA(" + i + ')');
		}
	}

	private final void method929(int i, int i_71_) {
		try {
			if (i > -64)
				anObjectArray1985 = null;
			anInt1967++;
			aClass19_1958.method163((byte) 1, i_71_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.B(" + i + ','
					+ i_71_ + ')');
		}
	}

	final byte[] method930(int i, byte i_72_, int i_73_) {
		try {
			if (i_72_ != 112)
				method911(53);
			anInt1988++;
			return method933(i_73_, null, (byte) 105, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.W(" + i + ','
					+ i_72_ + ',' + i_73_ + ')'));
		}
	}

	final boolean method931(int i, int i_74_) {
		try {
			anInt1976++;
			if (!method937(13540, i))
				return false;
			if (i_74_ >= -58)
				method915((byte) 4);
			if (anObjectArray1985[i] != null)
				return true;
			method909(-1, i);
			if (anObjectArray1985[i] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.P(" + i + ','
					+ i_74_ + ')');
		}
	}

	final byte[] method932(String string, String string_75_, int i) {
		try {
			if (i != 0)
				return null;
			anInt1989++;
			if (!method935(i ^ 0x7d))
				return null;
			string = string.toLowerCase();
			string_75_ = string_75_.toLowerCase();
			int i_76_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					false, Class5.method84(string, (byte) -39));
			if (!method937(13540, i_76_))
				return null;
			int i_77_ = (((Class130) aClass130_1977).aClass67Array1806[i_76_]
					.method495(false, Class5.method84(string_75_, (byte) -77)));
			return method930(i_77_, (byte) 112, i_76_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.T("
					+ (string != null ? "{...}" : "null") + ','
					+ (string_75_ != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	final byte[] method933(int i, int[] is, byte i_78_, int i_79_) {
		try {
			anInt1962++;
			if (!method940((byte) 25, i_79_, i))
				return null;
			if (anObjectArrayArray1964[i] == null
					|| anObjectArrayArray1964[i][i_79_] == null) {
				boolean bool = method917(is, i_79_, i, i_78_ ^ 0x69);
				if (!bool) {
					method909(-1, i);
					bool = method917(is, i_79_, i, 0);
					if (!bool)
						return null;
				}
			}
			byte[] is_80_ = Class236_Sub9.method3122(2, false,
					anObjectArrayArray1964[i][i_79_]);
			if (((Class146) this).anInt1987 == 1) {
				anObjectArrayArray1964[i][i_79_] = null;
				if (((Class130) aClass130_1977).anIntArray1811[i] == 1)
					anObjectArrayArray1964[i] = null;
			} else if (((Class146) this).anInt1987 == 2)
				anObjectArrayArray1964[i] = null;
			if (i_78_ != 105)
				aClass130_1977 = null;
			return is_80_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.Q(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_78_ + ','
					+ i_79_ + ')'));
		}
	}

	final boolean method934(String string, byte i) {
		try {
			anInt1950++;
			int i_81_ = method920(124, "");
			if (i_81_ != -1)
				return method926("", 5, string);
			int i_82_ = -70 / ((-53 - i) / 52);
			return method926(string, 5, "");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.N("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final boolean method935(int i) {
		try {
			int i_83_ = 108 / ((i - 63) / 37);
			anInt1982++;
			if (aClass130_1977 == null) {
				aClass130_1977 = aClass19_1958.method166(12607);
				if (aClass130_1977 == null)
					return false;
				anObjectArrayArray1964 = new Object[((Class130) aClass130_1977).anInt1810][];
				anObjectArray1985 = new Object[((Class130) aClass130_1977).anInt1810];
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.C(" + i + ')');
		}
	}

	final void method936(byte i, String string) {
		do {
			try {
				anInt1966++;
				if (method935(121)) {
					string = string.toLowerCase();
					int i_84_ = (((Class130) aClass130_1977).aClass67_1808
							.method495(false,
									Class5.method84(string, (byte) -59)));
					method929(-105, i_84_);
					if (i < -8)
						break;
					anObjectArray1985 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("fp.M(" + i + ','
						+ (string != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	private final boolean method937(int i, int i_85_) {
		try {
			anInt1983++;
			if (!method935(110))
				return false;
			if ((i_85_ ^ 0xffffffff) > -1
					|| i_85_ >= ((Class130) aClass130_1977).anIntArray1811.length
					|| (((Class130) aClass130_1977).anIntArray1811[i_85_] ^ 0xffffffff) == -1) {
				if (!Class117.aBool1598)
					return false;
				throw new IllegalArgumentException(Integer.toString(i_85_));
			}
			if (i != 13540)
				aBool1961 = false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.DA(" + i + ','
					+ i_85_ + ')');
		}
	}

	final byte[] method938(int i, int i_86_) {
		try {
			anInt1986++;
			if (!method935(i_86_ ^ ~0x51))
				return null;
			if (i_86_ != 0)
				return null;
			if ((((Class130) aClass130_1977).anIntArray1811.length ^ 0xffffffff) == -2)
				return method930(i, (byte) 112, 0);
			if (!method937(13540, i))
				return null;
			if (((Class130) aClass130_1977).anIntArray1811[i] == 1)
				return method930(0, (byte) 112, i);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.H(" + i + ','
					+ i_86_ + ')');
		}
	}

	final void method939(byte i) {
		do {
			try {
				anInt1965++;
				if (i > 38) {
					if (anObjectArray1985 == null)
						break;
					for (int i_87_ = 0; anObjectArray1985.length > i_87_; i_87_++)
						anObjectArray1985[i_87_] = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fp.G(" + i + ')');
			}
			break;
		} while (false);
	}

	private final boolean method940(byte i, int i_88_, int i_89_) {
		try {
			anInt1984++;
			if (i != 25)
				aClass347_1981 = null;
			if (!method935(i ^ ~0x5f))
				return false;
			if ((i_89_ ^ 0xffffffff) > -1
					|| (i_88_ ^ 0xffffffff) > -1
					|| ((Class130) aClass130_1977).anIntArray1811.length <= i_89_
					|| (i_88_ >= ((Class130) aClass130_1977).anIntArray1811[i_89_])) {
				if (Class117.aBool1598)
					throw new IllegalArgumentException(String.valueOf(i_89_)
							+ "," + i_88_);
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.U(" + i + ','
					+ i_88_ + ',' + i_89_ + ')'));
		}
	}

	final int method941(boolean bool, int i) {
		try {
			anInt1951++;
			if (!method935(17))
				return -1;
			if (bool != false)
				return 45;
			int i_90_ = ((Class130) aClass130_1977).aClass67_1808.method495(
					bool, i);
			if (!method937(13540, i_90_))
				return -1;
			return i_90_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fp.S(" + bool + ','
					+ i + ')');
		}
	}

	Class146(Class19 class19, boolean bool, int i) {
		try {
			if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) < -3)
				throw new IllegalArgumentException("js5: Invalid value " + i
						+ " supplied for discardunpacked");
			((Class146) this).anInt1987 = i;
			aClass19_1958 = class19;
			aBool1961 = bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fp.<init>("
					+ (class19 != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ')'));
		}
	}
}
