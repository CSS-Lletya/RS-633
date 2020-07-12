/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;

final class Class42 {
	static int anInt596;
	private int anInt597;
	int anInt598;
	String[] aStringArray599 = new String[5];
	int anInt600;
	private int anInt601;
	private byte aByte602;
	boolean aBool603;
	boolean aBool604;
	int anInt605;
	String aString606;
	int anInt607;
	static int anInt608;
	int anInt609;
	private byte aByte610;
	private byte aByte611;
	int anInt612;
	boolean aBool613;
	Class290 aClass290_614;
	boolean aBool615;
	static int anInt616;
	int anInt617;
	boolean aBool618;
	static int anInt619;
	int anInt620;
	private int anInt621;
	static int anInt622;
	private byte[] aByteArray623;
	boolean aBool624 = false;
	static int anInt625;
	private int[] anIntArray626;
	boolean aBool627;
	boolean aBool628;
	private int anInt629 = 128;
	int anInt630;
	int[] anIntArray631;
	static int anInt632;
	private int anInt633;
	boolean aBool634;
	static int anInt635;
	private short[] aShortArray636;
	int anInt637;
	private int anInt638;
	int anInt639;
	static int anInt640;
	private byte aByte641;
	private short[] aShortArray642;
	boolean aBool643;
	boolean aBool644;
	private int anInt645;
	static int anInt646;
	int anInt647;
	private short[] aShortArray648;
	private int anInt649;
	boolean aBool650;
	int anInt651;
	int anInt652;
	static int anInt653;
	static int anInt654;
	private Class213 aClass213_655;
	private byte[] aByteArray656;
	int anInt657;
	private int[][] anIntArrayArray658;
	private short[] aShortArray659;
	int anInt660;
	int anInt661;
	private int anInt662;
	private int anInt663;
	int anInt664;
	static int anInt665;
	int anInt666;
	private int anInt667;
	int anInt668;
	int[] anIntArray669;
	static int anInt670;
	boolean aBool671;
	static int anInt672;
	static int anInt673;
	static BigInteger aBigInteger674 = (new BigInteger(
			"120684072056280935288427827946427111553241708199336899728637540010539851684827542274005027444025182722373693874630942678750225147898041539436465038752862996523582623683050478903900622900745629235369980114857562631625233381072331798032418279261790337275058300738584974228751698542644837745940989177562329966303"));
	boolean aBool675;
	int[] anIntArray676;
	private int anInt677;
	private int anInt678;
	private byte aByte679;
	int anInt680;
	boolean aBool681;
	int anInt682;
	int[] anIntArray683;
	private int anInt684;
	int anInt685;
	static int anInt686;
	int anInt687;
	int anInt688;
	int anInt689;
	static int anInt690;
	private int anInt691;
	static IComponentDefinitions aClass192_692;
	int anInt693;
	static int anInt694;
	static int anInt695 = 0;

	final boolean method371(int i, byte i_0_) {
		try {
			anInt622++;
			if ((i ^ 0xffffffff) == 0)
				return false;
			if (i_0_ < 78)
				method379(29);
			if ((i ^ 0xffffffff) == (((Class42) this).anInt688 ^ 0xffffffff))
				return true;
			if (((Class42) this).anIntArray669 != null) {
				for (int i_1_ = 0; ((i_1_ ^ 0xffffffff) > (((Class42) this).anIntArray669.length ^ 0xffffffff)); i_1_++) {
					if (i == ((Class42) this).anIntArray669[i_1_])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.Q(" + i + ','
					+ i_0_ + ')');
		}
	}

	final String method372(String string, int i, byte i_2_) {
		try {
			anInt654++;
			if (aClass213_655 == null)
				return string;
			if (i_2_ <= 19)
				return null;
			Class11_Sub3 class11_sub3 = (Class11_Sub3) aClass213_655
					.method1369((byte) 26, (long) i);
			if (class11_sub3 == null)
				return string;
			return ((Class11_Sub3) class11_sub3).aString5110;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hba.K("
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ i_2_ + ')'));
		}
	}

	final boolean method373(boolean bool, int i) {
		try {
			anInt640++;
			if (anIntArrayArray658 == null)
				return true;
			synchronized (((Class290) ((Class42) this).aClass290_614).aClass146_3907) {
				if (bool != true)
					method387(null, (byte) 55, 80, 12, 14);
				for (int i_3_ = 0; i_3_ < aByteArray656.length; i_3_++) {
					if ((aByteArray656[i_3_] ^ 0xffffffff) == (i ^ 0xffffffff)) {
						for (int i_4_ = 0; i_4_ < anIntArrayArray658[i_3_].length; i_4_++) {
							if (!((Class290) ((Class42) this).aClass290_614).aClass146_3907
									.method927((byte) -107,
											anIntArrayArray658[i_3_][i_4_], 0))
								return false;
						}
						return true;
					}
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.D(" + bool + ','
					+ i + ')');
		}
	}

	final int method374(int i, int i_5_, int i_6_) {
		try {
			anInt635++;
			if (aClass213_655 == null)
				return i_6_;
			Class11_Sub51 class11_sub51 = ((Class11_Sub51) aClass213_655
					.method1369((byte) 26, (long) i));
			if (class11_sub51 == null)
				return i_6_;
			if (i_5_ <= 28)
				anInt632 = -72;
			return ((Class11_Sub51) class11_sub51).anInt8036;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hba.E(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	final boolean method375(byte i) {
		try {
			anInt653++;
			if (((Class42) this).anIntArray683 == null) {
				if (((Class42) this).anInt680 == -1
						&& ((Class42) this).anIntArray631 == null)
					return false;
				return true;
			}
			for (int i_7_ = 0; ((((Class42) this).anIntArray683.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff)); i_7_++) {
				if ((((Class42) this).anIntArray683[i_7_] ^ 0xffffffff) != 0) {
					Class42 class42_8_ = (((Class42) this).aClass290_614
							.method1793((byte) -116,
									((Class42) this).anIntArray683[i_7_]));
					if (((Class42) class42_8_).anInt680 != -1
							|| ((Class42) class42_8_).anIntArray631 != null)
						return true;
				}
			}
			if (i != 114)
				((Class42) this).anInt607 = 67;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.F(" + i + ')');
		}
	}

	static final Class292 method376(int i, Class163 class163, int i_9_) {
		try {
			int i_10_ = 30 % ((i - 21) / 62);
			anInt608++;
			Class143 class143 = Class11_Sub45_Sub10.method3524(class163, i_9_,
					true, (byte) -22);
			if (class143 == null)
				return null;
			return ((Class143) class143).aClass292_1931;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("hba.B(" + i + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_9_ + ')'));
		}
	}

	final boolean method377(int i) {
		try {
			anInt646++;
			if (anIntArrayArray658 == null)
				return true;
			boolean bool = true;
			if (i > -68)
				method385(-40, 108L);
			synchronized (((Class290) ((Class42) this).aClass290_614).aClass146_3907) {
				for (int i_11_ = 0; anIntArrayArray658.length > i_11_; i_11_++) {
					for (int i_12_ = 0; ((i_12_ ^ 0xffffffff) > (anIntArrayArray658[i_11_].length ^ 0xffffffff)); i_12_++)
						bool &= (((Class290) ((Class42) this).aClass290_614).aClass146_3907
								.method927((byte) -105,
										anIntArrayArray658[i_11_][i_12_], 0));
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.R(" + i + ')');
		}
	}

	final void method378(Stream stream, byte i) {
		try {
			if (i <= -6) {
				anInt672++;
				for (;;) {
					int i_13_ = stream.readUnsignedByte((byte) 35);
					if (i_13_ == 0)
						break;
					method389(10, stream, i_13_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.O("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method379(int i) {
		try {
			int i_14_ = -20 / ((i - 23) / 43);
			aClass192_692 = null;
			aBigInteger674 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.S(" + i + ')');
		}
	}

	final Class42 method380(Interface20 interface20, int i) {
		try {
			anInt616++;
			int i_15_ = -1;
			if (i != (anInt601 ^ 0xffffffff))
				i_15_ = interface20.method51(anInt601, i ^ 0x6947);
			else if (anInt645 != -1)
				i_15_ = interface20.method50(-1, anInt645);
			if (i_15_ < 0
					|| ((i_15_ ^ 0xffffffff) <= (-1
							+ ((Class42) this).anIntArray683.length ^ 0xffffffff))
					|| (((Class42) this).anIntArray683[i_15_] ^ 0xffffffff) == 0) {
				int i_16_ = (((Class42) this).anIntArray683[((Class42) this).anIntArray683.length - 1]);
				if ((i_16_ ^ 0xffffffff) != 0)
					return ((Class42) this).aClass290_614.method1793(
							(byte) -117, i_16_);
				return null;
			}
			return ((Class42) this).aClass290_614.method1793((byte) 27,
					(((Class42) this).anIntArray683[i_15_]));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.M("
					+ (interface20 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method381(int i) {
		try {
			if (i <= 9)
				return -91;
			anInt596++;
			if (((Class42) this).anIntArray669 != null) {
				int i_17_ = (int) ((double) anInt691 * Math.random());
				int i_18_;
				for (i_18_ = 0; ((i_17_ ^ 0xffffffff) <= (anIntArray626[i_18_] ^ 0xffffffff)); i_18_++)
					i_17_ -= anIntArray626[i_18_];
				return ((Class42) this).anIntArray669[i_18_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.N(" + i + ')');
		}
	}

	static final void method382(byte[] is, int i, int i_19_, File file)
			throws IOException {
		try {
			anInt670++;
			DataInputStream datainputstream = (new DataInputStream(
					new BufferedInputStream(new FileInputStream(file))));
			try {
				datainputstream.readFully(is, 0, i);
			} catch (java.io.EOFException eofexception) {
				/* empty */
			}
			if (i_19_ != -21895)
				method385(1, 112L);
			datainputstream.close();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hba.A("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_19_
					+ ',' + (file != null ? "{...}" : "null") + ')'));
		}
	}

	final void method383(int i) {
		do {
			try {
				if (i != 5)
					((Class42) this).aString606 = null;
				anInt619++;
				if ((((Class42) this).anInt664 ^ 0xffffffff) == 0) {
					((Class42) this).anInt664 = 0;
					if (aByteArray656 != null
							&& (aByteArray656.length ^ 0xffffffff) == -2
							&& (aByteArray656[0] ^ 0xffffffff) == -11)
						((Class42) this).anInt664 = 1;
					for (int i_20_ = 0; i_20_ < 5; i_20_++) {
						if (((Class42) this).aStringArray599[i_20_] != null) {
							((Class42) this).anInt664 = 1;
							break;
						}
					}
				}
				if ((((Class42) this).anInt660 ^ 0xffffffff) != 0)
					break;
				((Class42) this).anInt660 = ((Class42) this).anInt685 != 0 ? 1
						: 0;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hba.G(" + i + ')');
			}
			break;
		} while (false);
	}

	final Class189 method384(int i, int i_21_, Class12 class12,
			Class12 class12_22_, boolean bool, int i_23_, int i_24_, int i_25_,
			Class163 class163, int i_26_, int i_27_) {
		try {
			anInt665++;
			if (Class321_Sub3_Sub1.method3616(i_27_, (byte) -88))
				i_27_ = 4;
			long l = (long) ((((Class42) this).anInt693 << 10) - (-(i_27_ << 3) + -i_23_));
			l |= (long) (((Class163) class163).anInt2103 << 29);
			int i_28_ = i_26_;
			if ((aByte641 ^ 0xffffffff) != -4) {
				if (aByte641 != 0 || anInt662 != 0)
					i_28_ |= 0x2;
				if (anInt621 != 0)
					i_28_ |= 0x1;
				if ((anInt597 ^ 0xffffffff) != -1)
					i_28_ |= 0x4;
			} else
				i_28_ |= 0x7;
			if (bool)
				i_28_ |= 0x40000;
			Class189 class189;
			synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3923) {
				if (i > -63)
					return null;
				class189 = (Class189) ((Class290) ((Class42) this).aClass290_614).aClass22_3923
						.method188(l, (byte) -101);
			}
			Class206 class206 = (class189 != null ? ((Class189) class189).aClass206_2431
					: null);
			Class11_Sub45_Sub1 class11_sub45_sub1 = null;
			if (class206 != null
					&& (class163.method1065(class206.ua(), i_28_) ^ 0xffffffff) == -1) {
				class206 = ((Class189) class189).aClass206_2431;
				class11_sub45_sub1 = ((Class189) class189).aClass11_Sub45_Sub1_2432;
				if (bool && class11_sub45_sub1 == null)
					class11_sub45_sub1 = ((Class189) class189).aClass11_Sub45_Sub1_2432 = class206
							.ba(null);
			} else {
				if (class206 != null)
					i_28_ = class163.method1077(i_28_, class206.ua());
				int i_29_ = i_28_;
				if (i_27_ == 10 && (i_23_ ^ 0xffffffff) < -4)
					i_29_ |= 0x5;
				class206 = method387(class163, (byte) 109, i_23_, i_29_, i_27_);
				if (class206 == null)
					return null;
				if ((i_27_ ^ 0xffffffff) == -11 && (i_23_ ^ 0xffffffff) < -4)
					class206.a(2048);
				if (bool)
					class11_sub45_sub1 = class206.ba(null);
				class206.s(i_28_);
				class189 = new Class189();
				((Class189) class189).aClass206_2431 = class206;
				((Class189) class189).aClass11_Sub45_Sub1_2432 = class11_sub45_sub1;
				synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3923) {
					((Class290) ((Class42) this).aClass290_614).aClass22_3923
							.method184((byte) 126, class189, l);
				}
			}
			boolean bool_30_ = aByte641 != 0
					&& (class12 != null || class12_22_ != null);
			boolean bool_31_ = ((anInt621 ^ 0xffffffff) != -1
					|| (anInt662 ^ 0xffffffff) != -1 || anInt597 != 0);
			if (!bool_30_ && !bool_31_)
				class206 = class206.method1313((byte) 0, i_26_, true);
			else {
				class206 = class206.method1313((byte) 0, i_28_, true);
				if (bool_30_)
					class206.p(aByte641, anInt684, class12, class12_22_, i_24_,
							i_21_, i_25_);
				if (bool_31_)
					class206.H(anInt621, anInt662, anInt597);
				class206.s(i_26_);
			}
			((Class189) Class127.aClass189_1722).aClass206_2431 = class206;
			((Class189) Class127.aClass189_1722).aClass11_Sub45_Sub1_2432 = class11_sub45_sub1;
			return Class127.aClass189_1722;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hba.J(" + i + ','
					+ i_21_ + ',' + (class12 != null ? "{...}" : "null") + ','
					+ (class12_22_ != null ? "{...}" : "null") + ',' + bool
					+ ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_26_ + ','
					+ i_27_ + ')'));
		}
	}

	static final String method385(int i, long l) {
		try {
			anInt690++;
			if (l <= 0L || l >= 6582952005840035281L)
				return null;
			if ((l % 37L ^ 0xffffffffffffffffL) == -1L)
				return null;
			int i_32_ = 0;
			for (long l_33_ = l; l_33_ != 0L; l_33_ /= 37L)
				i_32_++;
			StringBuffer stringbuffer = new StringBuffer(i_32_);
			while (l != 0L) {
				long l_34_ = l;
				l /= 37L;
				char c = Class227.aCharArray3137[(int) (l_34_ + -(37L * l))];
				if (c == '_') {
					int i_35_ = -1 + stringbuffer.length();
					c = '\u00a0';
					stringbuffer.setCharAt(i_35_,
							Character.toUpperCase(stringbuffer.charAt(i_35_)));
				}
				stringbuffer.append(c);
			}
			stringbuffer.reverse();
			stringbuffer.setCharAt(0,
					Character.toUpperCase(stringbuffer.charAt(0)));
			if (i <= 14)
				anInt695 = -68;
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.P(" + i + ',' + l
					+ ')');
		}
	}

	private final void method386(Stream stream, int i) {
		try {
			anInt673++;
			int i_36_ = stream.readUnsignedByte((byte) 35);
			if (i > 95) {
				for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i_36_ ^ 0xffffffff); i_37_++) {
					((Stream) stream).position++;
					int i_38_ = stream.readUnsignedByte((byte) 35);
					((Stream) stream).position += 2 * i_38_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hba.H("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	private final Class206 method387(Class163 class163, byte i, int i_39_,
			int i_40_, int i_41_) {
		try {
			anInt694++;
			int i_42_ = 64 + anInt638;
			int i_43_ = 850 + anInt663;
			int i_44_ = i_40_;
			boolean bool = ((Class42) this).aBool644 || i_41_ == 2 && i_39_ > 3;
			if (bool)
				i_40_ |= 0x10;
			if (i_39_ != 0)
				i_40_ |= 0xd;
			else {
				if (anInt629 != 128 || (anInt677 ^ 0xffffffff) != -1)
					i_40_ |= 0x1;
				if ((anInt633 ^ 0xffffffff) != -129
						|| (anInt667 ^ 0xffffffff) != -1)
					i_40_ |= 0x4;
			}
			if ((anInt678 ^ 0xffffffff) != -129 || anInt649 != 0)
				i_40_ |= 0x2;
			if (aShortArray659 != null)
				i_40_ |= 0x4000;
			if (aShortArray636 != null)
				i_40_ |= 0x8000;
			if ((aByte602 ^ 0xffffffff) != -1)
				i_40_ |= 0x80000;
			Class206 class206 = null;
			if (aByteArray656 == null)
				return null;
			int i_45_ = -1;
			for (int i_46_ = 0; (aByteArray656.length ^ 0xffffffff) < (i_46_ ^ 0xffffffff); i_46_++) {
				if ((i_41_ ^ 0xffffffff) == (aByteArray656[i_46_] ^ 0xffffffff)) {
					i_45_ = i_46_;
					break;
				}
			}
			if ((i_45_ ^ 0xffffffff) == 0)
				return null;
			int i_47_ = anIntArrayArray658[i_45_].length;
			if (i_47_ > 0) {
				long l = (long) ((Class163) class163).anInt2103;
				for (int i_48_ = 0; i_48_ < i_47_; i_48_++)
					l = l * 67783L + (long) anIntArrayArray658[i_45_][i_48_];
				synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3922) {
					class206 = ((Class206) ((Class290) ((Class42) this).aClass290_614).aClass22_3922
							.method188(l, (byte) -73));
				}
				if (class206 != null) {
					if (class206.WA() != i_42_)
						i_40_ |= 0x1000;
					if (class206.da() != i_43_)
						i_40_ |= 0x2000;
				}
				if (class206 == null
						|| class163.method1065(class206.ua(), i_40_) != 0) {
					int i_49_ = i_40_ | 0x1f01f;
					if (class206 != null)
						i_49_ = class163.method1077(i_49_, class206.ua());
					Class179 class179 = null;
					synchronized (Class176.aClass179Array2236) {
						for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > (i_47_ ^ 0xffffffff); i_50_++) {
							synchronized (((Class290) ((Class42) this).aClass290_614).aClass146_3907) {
								class179 = (Class11_Sub16
										.method2443(
												0,
												(((Class290) ((Class42) this).aClass290_614).aClass146_3907),
												(anIntArrayArray658[i_45_][i_50_] & 0xffff),
												0));
							}
							if (class179 == null)
								return null;
							if ((((Class179) class179).anInt2277 ^ 0xffffffff) > -14)
								class179.method1166(2, true);
							if ((i_47_ ^ 0xffffffff) < -2)
								Class176.aClass179Array2236[i_50_] = class179;
						}
						if (i_47_ > 1)
							class179 = new Class179(
									Class176.aClass179Array2236, i_47_);
					}
					class206 = class163
							.method1020(
									class179,
									i_49_,
									(((Class290) ((Class42) this).aClass290_614).anInt3925),
									i_42_, i_43_);
					synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3922) {
						((Class290) ((Class42) this).aClass290_614).aClass22_3922
								.method184((byte) 126, class206, l);
					}
				}
			}
			Class206 class206_51_ = class206.method1313((byte) 0, i_40_, true);
			if ((i_42_ ^ 0xffffffff) != (class206.WA() ^ 0xffffffff))
				class206_51_.C(i_42_);
			if ((i_43_ ^ 0xffffffff) != (class206.da() ^ 0xffffffff))
				class206_51_.LA(i_43_);
			if (bool)
				class206_51_.v();
			if (i_41_ == 4 && i_39_ > 3) {
				class206_51_.k(2048);
				class206_51_.H(180, 0, -180);
			}
			i_39_ &= 0x3;
			if ((i_39_ ^ 0xffffffff) != -2) {
				if (i_39_ == 2)
					class206_51_.k(8192);
				else if ((i_39_ ^ 0xffffffff) == -4)
					class206_51_.k(12288);
			} else
				class206_51_.k(4096);
			if (aShortArray659 != null) {
				for (int i_52_ = 0; aShortArray659.length > i_52_; i_52_++) {
					if (aByteArray623 == null || aByteArray623.length <= i_52_)
						class206_51_.ia(aShortArray659[i_52_],
								aShortArray642[i_52_]);
					else
						class206_51_
								.ia(aShortArray659[i_52_],
										(Class266.aShortArray3620[0xff & aByteArray623[i_52_]]));
				}
			}
			if (aShortArray636 != null) {
				for (int i_53_ = 0; ((i_53_ ^ 0xffffffff) > (aShortArray636.length ^ 0xffffffff)); i_53_++)
					class206_51_.aa(aShortArray636[i_53_],
							aShortArray648[i_53_]);
			}
			if (i <= 67)
				method381(-118);
			if ((aByte602 ^ 0xffffffff) != -1)
				class206_51_.method1323(aByte611, aByte610, aByte679,
						aByte602 & 0xff);
			if ((anInt629 ^ 0xffffffff) != -129 || anInt678 != 128
					|| anInt633 != 128)
				class206_51_.O(anInt629, anInt678, anInt633);
			if ((anInt677 ^ 0xffffffff) != -1 || (anInt649 ^ 0xffffffff) != -1
					|| (anInt667 ^ 0xffffffff) != -1)
				class206_51_.H(anInt677, anInt649, anInt667);
			class206_51_.s(i_44_);
			return class206_51_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hba.L("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_39_ + ',' + i_40_ + ',' + i_41_ + ')'));
		}
	}

	final Class206 method388(int i, int i_54_, Class163 class163, int i_55_,
			int i_56_, Class12 class12, int i_57_, int i_58_, int i_59_,
			int i_60_, Class281 class281, int i_61_, Class12 class12_62_,
			int i_63_) {
		try {
			if (Class321_Sub3_Sub1.method3616(i_61_, (byte) -88))
				i_61_ = 4;
			anInt686++;
			long l = (long) (i_59_ + ((i_61_ << 3) + (((Class42) this).anInt693 << 10)));
			int i_64_ = i_54_;
			l |= (long) (((Class163) class163).anInt2103 << 29);
			if (class281 != null)
				i_54_ |= class281.method1738(i_60_, 1024, false, i_57_);
			do {
				if ((aByte641 ^ 0xffffffff) != -4) {
					if (aByte641 != 0 || anInt662 != 0)
						i_54_ |= 0x2;
					if ((anInt621 ^ 0xffffffff) != -1)
						i_54_ |= 0x1;
					if ((anInt597 ^ 0xffffffff) == -1)
						break;
					i_54_ |= 0x4;
					if (!client.aBool10531)
						break;
				}
				i_54_ |= 0x7;
			} while (false);
			if (i_61_ == 10 && (i_59_ ^ 0xffffffff) < -4)
				i_54_ |= 0x5;
			Class206 class206;
			synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3924) {
				class206 = (Class206) ((Class290) ((Class42) this).aClass290_614).aClass22_3924
						.method188(l, (byte) -75);
			}
			if (class206 == null
					|| class163.method1065(class206.ua(), i_54_) != 0) {
				if (class206 != null)
					i_54_ = class163.method1077(i_54_, class206.ua());
				class206 = method387(class163, (byte) 116, i_59_, i_54_, i_61_);
				if (class206 == null)
					return null;
				synchronized (((Class290) ((Class42) this).aClass290_614).aClass22_3924) {
					((Class290) ((Class42) this).aClass290_614).aClass22_3924
							.method184((byte) 127, class206, l);
				}
			}
			boolean bool = false;
			if (class281 != null) {
				bool = true;
				class206 = class281.method1732((byte) 1, i_54_, 256, i_57_, i,
						class206, i_59_ & 0x3, i_60_);
			}
			if (i_61_ == 10 && i_59_ > 3) {
				if (!bool) {
					class206 = class206.method1313((byte) 3, i_54_, true);
					bool = true;
				}
				class206.a(2048);
			}
			if ((aByte641 ^ 0xffffffff) != -1) {
				if (!bool) {
					class206 = class206.method1313((byte) 3, i_54_, true);
					bool = true;
				}
				class206.p(aByte641, anInt684, class12, class12_62_, i_63_,
						i_55_, i_56_);
			}
			if (i_58_ != anInt621 || (anInt662 ^ 0xffffffff) != -1
					|| anInt597 != 0) {
				if (!bool) {
					class206 = class206.method1313((byte) 3, i_54_, true);
					bool = true;
				}
				class206.H(anInt621, anInt662, anInt597);
			}
			if (bool)
				class206.s(i_64_);
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("hba.I(" + i + ',' + i_54_ + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_55_ + ',' + i_56_ + ','
							+ (class12 != null ? "{...}" : "null") + ','
							+ i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_
							+ ',' + (class281 != null ? "{...}" : "null") + ','
							+ i_61_ + ','
							+ (class12_62_ != null ? "{...}" : "null") + ','
							+ i_63_ + ')'));
		}
	}

	public Class42() {
		aByte602 = (byte) 0;
		((Class42) this).anInt598 = 256;
		((Class42) this).aBool628 = false;
		((Class42) this).aString606 = "null";
		((Class42) this).anInt605 = -1;
		((Class42) this).anInt609 = 255;
		anInt621 = 0;
		anIntArray626 = null;
		((Class42) this).aBool615 = false;
		((Class42) this).anInt617 = 0;
		((Class42) this).aBool643 = false;
		((Class42) this).anInt607 = 0;
		((Class42) this).anInt657 = 960;
		anInt663 = 0;
		((Class42) this).aBool613 = false;
		((Class42) this).anInt652 = -1;
		((Class42) this).anInt661 = -1;
		((Class42) this).anInt630 = 0;
		((Class42) this).anInt612 = 64;
		((Class42) this).anInt620 = 0;
		((Class42) this).anInt639 = 0;
		((Class42) this).anIntArray669 = null;
		((Class42) this).aBool603 = false;
		anInt638 = 0;
		((Class42) this).anInt664 = -1;
		((Class42) this).anInt666 = -1;
		((Class42) this).aBool634 = true;
		((Class42) this).anInt637 = -1;
		anInt662 = 0;
		((Class42) this).aBool618 = true;
		anInt667 = 0;
		aByte641 = (byte) 0;
		anInt678 = 128;
		((Class42) this).anInt660 = -1;
		((Class42) this).aBool671 = true;
		((Class42) this).anInt685 = 2;
		((Class42) this).anInt647 = -1;
		((Class42) this).aBool604 = false;
		((Class42) this).aBool627 = false;
		((Class42) this).anInt668 = 0;
		anInt633 = 128;
		((Class42) this).aBool675 = false;
		((Class42) this).anInt680 = -1;
		((Class42) this).anInt651 = 256;
		((Class42) this).aBool644 = false;
		((Class42) this).aBool650 = true;
		((Class42) this).aBool681 = false;
		((Class42) this).anInt682 = 1;
		anInt597 = 0;
		((Class42) this).anInt687 = 1;
		((Class42) this).anInt688 = -1;
		anInt677 = 0;
		((Class42) this).anInt600 = -1;
		anInt649 = 0;
		anInt691 = 0;
		anInt601 = -1;
		((Class42) this).anInt689 = 0;
		anInt645 = -1;
		anInt684 = -1;
	}

	private final void method389(int i, Stream stream, int i_65_) {
		do {
			try {
				if (i == 10) {
					anInt625++;
					if (i_65_ != 1 && i_65_ != 5) {
						if (i_65_ != 2) {
							if (i_65_ == 14)
								((Class42) this).anInt682 = stream
										.readUnsignedByte((byte) 35);
							else if ((i_65_ ^ 0xffffffff) != -16) {
								if (i_65_ != 17) {
									if (i_65_ != 18) {
										if ((i_65_ ^ 0xffffffff) != -20) {
											if (i_65_ == 21)
												aByte641 = (byte) 1;
											else if ((i_65_ ^ 0xffffffff) == -23)
												((Class42) this).aBool681 = true;
											else if ((i_65_ ^ 0xffffffff) != -24) {
												if (i_65_ != 24) {
													if (i_65_ != 27) {
														if ((i_65_ ^ 0xffffffff) != -29) {
															if ((i_65_ ^ 0xffffffff) == -30)
																anInt638 = (stream
																		.readByte(i + 1854307110));
															else if (i_65_ != 39) {
																if (i_65_ >= 30
																		&& (i_65_ < 35))
																	((Class42) this).aStringArray599[(-30 + i_65_)] = (stream
																			.readString(-1));
																else if ((i_65_ ^ 0xffffffff) != -41) {
																	if (i_65_ != 41) {
																		if (i_65_ == 42) {
																			int i_66_ = stream
																					.readUnsignedByte((byte) 35);
																			aByteArray623 = new byte[i_66_];
																			for (int i_67_ = 0; (i_66_ ^ 0xffffffff) < (i_67_ ^ 0xffffffff); i_67_++)
																				aByteArray623[i_67_] = stream
																						.readByte(Class77
																								.method527(
																										i,
																										1854307130));
																		} else if (i_65_ != 62) {
																			if ((i_65_ ^ 0xffffffff) == -65)
																				((Class42) this).aBool671 = false;
																			else if ((i_65_ ^ 0xffffffff) == -66)
																				anInt629 = stream
																						.readUnsignedShort((byte) -65);
																			else if ((i_65_ ^ 0xffffffff) == -67)
																				anInt678 = stream
																						.readUnsignedShort((byte) -65);
																			else if ((i_65_ ^ 0xffffffff) != -68) {
																				if ((i_65_ ^ 0xffffffff) == -70)
																					((Class42) this).anInt639 = stream
																							.readUnsignedByte((byte) 35);
																				else if ((i_65_ ^ 0xffffffff) != -71) {
																					if ((i_65_ ^ 0xffffffff) == -72)
																						anInt649 = stream
																								.method2508((byte) 53) << 2;
																					else if (i_65_ != 72) {
																						if (i_65_ != 73) {
																							if ((i_65_ ^ 0xffffffff) == -75)
																								((Class42) this).aBool624 = true;
																							else if ((i_65_ ^ 0xffffffff) == -76)
																								((Class42) this).anInt660 = stream
																										.readUnsignedByte((byte) 35);
																							else if ((i_65_ ^ 0xffffffff) == -78
																									|| i_65_ == 92) {
																								anInt601 = stream
																										.readUnsignedShort((byte) -65);
																								if ((anInt601 ^ 0xffffffff) == -65536)
																									anInt601 = -1;
																								anInt645 = stream
																										.readUnsignedShort((byte) -65);
																								if ((anInt645 ^ 0xffffffff) == -65536)
																									anInt645 = -1;
																								int i_68_ = -1;
																								if ((i_65_ ^ 0xffffffff) == -93) {
																									i_68_ = stream
																											.readUnsignedShort((byte) -65);
																									if (i_68_ == 65535)
																										i_68_ = -1;
																								}
																								int i_69_ = stream
																										.readUnsignedByte((byte) 35);
																								((Class42) this).anIntArray683 = new int[2 + i_69_];
																								for (int i_70_ = 0; i_70_ <= i_69_; i_70_++) {
																									((Class42) this).anIntArray683[i_70_] = stream
																											.readUnsignedShort((byte) -65);
																									if (((Class42) this).anIntArray683[i_70_] == 65535)
																										((Class42) this).anIntArray683[i_70_] = -1;
																								}
																								((Class42) this).anIntArray683[1 + i_69_] = i_68_;
																							} else if (i_65_ == 78) {
																								((Class42) this).anInt680 = stream
																										.readUnsignedShort((byte) -65);
																								((Class42) this).anInt689 = stream
																										.readUnsignedByte((byte) 35);
																							} else if (i_65_ == 79) {
																								((Class42) this).anInt617 = stream
																										.readUnsignedShort((byte) -65);
																								((Class42) this).anInt668 = stream
																										.readUnsignedShort((byte) -65);
																								((Class42) this).anInt689 = stream
																										.readUnsignedByte((byte) 35);
																								int i_71_ = stream
																										.readUnsignedByte((byte) 35);
																								((Class42) this).anIntArray631 = new int[i_71_];
																								for (int i_72_ = 0; i_71_ > i_72_; i_72_++)
																									((Class42) this).anIntArray631[i_72_] = stream
																											.readUnsignedShort((byte) -65);
																							} else if (i_65_ != 81) {
																								if (i_65_ != 82) {
																									if ((i_65_ ^ 0xffffffff) == -89)
																										((Class42) this).aBool634 = false;
																									else if (i_65_ != 89) {
																										if (i_65_ == 91)
																											((Class42) this).aBool675 = true;
																										else if ((i_65_ ^ 0xffffffff) != -94) {
																											if ((i_65_ ^ 0xffffffff) == -95)
																												aByte641 = (byte) 4;
																											else if (i_65_ == 95) {
																												aByte641 = (byte) 5;
																												anInt684 = stream
																														.method2508((byte) 37);
																											} else if ((i_65_ ^ 0xffffffff) == -98)
																												((Class42) this).aBool627 = true;
																											else if (i_65_ != 98) {
																												if (i_65_ == 99) {
																													((Class42) this).anInt605 = stream
																															.readUnsignedByte((byte) 35);
																													((Class42) this).anInt666 = stream
																															.readUnsignedShort((byte) -65);
																												} else if ((i_65_ ^ 0xffffffff) == -101) {
																													((Class42) this).anInt661 = stream
																															.readUnsignedByte((byte) 35);
																													((Class42) this).anInt647 = stream
																															.readUnsignedShort((byte) -65);
																												} else if (i_65_ == 101)
																													((Class42) this).anInt620 = stream
																															.readUnsignedByte((byte) 35);
																												else if (i_65_ == 102)
																													((Class42) this).anInt600 = stream
																															.readUnsignedShort((byte) -65);
																												else if (i_65_ != 103) {
																													if ((i_65_ ^ 0xffffffff) == -105)
																														((Class42) this).anInt609 = stream
																																.readUnsignedByte((byte) 35);
																													else if ((i_65_ ^ 0xffffffff) != -106) {
																														if (i_65_ == 106) {
																															int i_73_ = stream
																																	.readUnsignedByte((byte) 35);
																															anIntArray626 = new int[i_73_];
																															((Class42) this).anIntArray669 = new int[i_73_];
																															for (int i_74_ = 0; i_74_ < i_73_; i_74_++) {
																																((Class42) this).anIntArray669[i_74_] = stream
																																		.readUnsignedShort((byte) -65);
																																int i_75_ = stream
																																		.readUnsignedByte((byte) 35);
																																anIntArray626[i_74_] = i_75_;
																																anInt691 += i_75_;
																															}
																														} else if (i_65_ != 107) {
																															if (i_65_ < 150
																																	|| (i_65_ ^ 0xffffffff) <= -156) {
																																if ((i_65_ ^ 0xffffffff) != -161) {
																																	if (i_65_ == 162) {
																																		aByte641 = (byte) 3;
																																		anInt684 = stream
																																				.readInt(i ^ 0x65);
																																	} else if ((i_65_ ^ 0xffffffff) != -164) {
																																		if ((i_65_ ^ 0xffffffff) != -165) {
																																			if (i_65_ != 165) {
																																				if ((i_65_ ^ 0xffffffff) == -167)
																																					anInt597 = stream
																																							.method2508((byte) -107);
																																				else if (i_65_ != 167) {
																																					if ((i_65_ ^ 0xffffffff) == -169)
																																						((Class42) this).aBool613 = true;
																																					else if ((i_65_ ^ 0xffffffff) != -170) {
																																						if ((i_65_ ^ 0xffffffff) == -171)
																																							((Class42) this).anInt657 = stream
																																									.readSmart(117);
																																						else if ((i_65_ ^ 0xffffffff) == -172)
																																							((Class42) this).anInt630 = stream
																																									.readSmart(-1);
																																						else if ((i_65_ ^ 0xffffffff) == -174) {
																																							((Class42) this).anInt651 = stream
																																									.readUnsignedShort((byte) -65);
																																							((Class42) this).anInt598 = stream
																																									.readUnsignedShort((byte) -65);
																																						} else if (i_65_ == 249) {
																																							int i_76_ = stream
																																									.readUnsignedByte((byte) 35);
																																							if (aClass213_655 == null) {
																																								int i_77_ = Class11_Sub2_Sub33
																																										.method3808(
																																												118,
																																												i_76_);
																																								aClass213_655 = new Class213(
																																										i_77_);
																																							}
																																							for (int i_78_ = 0; i_76_ > i_78_; i_78_++) {
																																								boolean bool = stream
																																										.readUnsignedByte((byte) 35) == 1;
																																								int i_79_ = stream
																																										.method2558(false);
																																								Class11 class11;
																																								if (bool)
																																									class11 = new Class11_Sub3(
																																											stream.readString(-1));
																																								else
																																									class11 = new Class11_Sub51(
																																											stream.readInt(108));
																																								aClass213_655
																																										.method1368(
																																												(long) i_79_,
																																												class11,
																																												(byte) -26);
																																							}
																																						}
																																					} else
																																						((Class42) this).aBool603 = true;
																																				} else
																																					((Class42) this).anInt607 = stream
																																							.readUnsignedShort((byte) -65);
																																			} else
																																				anInt662 = stream
																																						.method2508((byte) 112);
																																		} else
																																			anInt621 = stream
																																					.method2508((byte) -123);
																																	} else {
																																		aByte611 = stream
																																				.readByte(i ^ 0x6e867b3a);
																																		aByte610 = stream
																																				.readByte(1854307120);
																																		aByte679 = stream
																																				.readByte(i ^ 0x6e867b3a);
																																		aByte602 = stream
																																				.readByte(i + 1854307110);
																																	}
																																} else {
																																	int i_80_ = stream
																																			.readUnsignedByte((byte) 35);
																																	((Class42) this).anIntArray676 = new int[i_80_];
																																	for (int i_81_ = 0; (i_80_ ^ 0xffffffff) < (i_81_ ^ 0xffffffff); i_81_++)
																																		((Class42) this).anIntArray676[i_81_] = stream
																																				.readUnsignedShort((byte) -65);
																																}
																															} else {
																																((Class42) this).aStringArray599[-150
																																		+ i_65_] = stream
																																		.readString(-1);
																																if (!((Class290) ((Class42) this).aClass290_614).aBool3914)
																																	((Class42) this).aStringArray599[i_65_ - 150] = null;
																															}
																														} else
																															((Class42) this).anInt637 = stream
																																	.readUnsignedShort((byte) -65);
																													} else
																														((Class42) this).aBool628 = true;
																												} else
																													((Class42) this).anInt652 = 0;
																											} else
																												((Class42) this).aBool615 = true;
																										} else {
																											aByte641 = (byte) 3;
																											anInt684 = stream
																													.readUnsignedShort((byte) -65);
																										}
																									} else
																										((Class42) this).aBool650 = false;
																								} else
																									((Class42) this).aBool643 = true;
																							} else {
																								aByte641 = (byte) 2;
																								anInt684 = 256 * stream
																										.readUnsignedByte((byte) 35);
																							}
																						} else
																							((Class42) this).aBool604 = true;
																					} else
																						anInt667 = stream
																								.method2508((byte) -118) << 2;
																				} else
																					anInt677 = stream
																							.method2508((byte) -95) << 2;
																			} else
																				anInt633 = stream
																						.readUnsignedShort((byte) -65);
																		} else
																			((Class42) this).aBool644 = true;
																	} else {
																		int i_82_ = stream
																				.readUnsignedByte((byte) 35);
																		aShortArray636 = new short[i_82_];
																		aShortArray648 = new short[i_82_];
																		for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (i_82_ ^ 0xffffffff); i_83_++) {
																			aShortArray636[i_83_] = (short) stream
																					.readUnsignedShort((byte) -65);
																			aShortArray648[i_83_] = (short) stream
																					.readUnsignedShort((byte) -65);
																		}
																	}
																} else {
																	int i_84_ = (stream
																			.readUnsignedByte((byte) 35));
																	aShortArray659 = (new short[i_84_]);
																	aShortArray642 = (new short[i_84_]);
																	for (int i_85_ = 0; (i_85_ < i_84_); i_85_++) {
																		aShortArray659[i_85_] = (short) stream
																				.readUnsignedShort((byte) -65);
																		aShortArray642[i_85_] = (short) stream
																				.readUnsignedShort((byte) -65);
																	}
																}
															} else
																anInt663 = ((stream
																		.readByte(1854307120)) * 5);
														} else
															((Class42) this).anInt612 = ((stream
																	.readUnsignedByte((byte) 35)) << 2);
													} else
														((Class42) this).anInt685 = 1;
												} else {
													((Class42) this).anInt688 = (stream
															.readUnsignedShort((byte) -65));
													if (((((Class42) this).anInt688) ^ 0xffffffff) == -65536)
														((Class42) this).anInt688 = -1;
												}
											} else
												((Class42) this).anInt652 = 1;
										} else
											((Class42) this).anInt664 = stream
													.readUnsignedByte((byte) 35);
									} else
										((Class42) this).aBool618 = false;
								} else {
									((Class42) this).anInt685 = 0;
									((Class42) this).aBool618 = false;
								}
							} else
								((Class42) this).anInt687 = stream
										.readUnsignedByte((byte) 35);
						} else
							((Class42) this).aString606 = stream.readString(-1);
					} else {
						if ((i_65_ ^ 0xffffffff) == -6
								&& (((Class290) ((Class42) this).aClass290_614).aBool3920))
							method386(stream, i ^ 0x67);
						int i_86_ = stream.readUnsignedByte((byte) 35);
						anIntArrayArray658 = new int[i_86_][];
						aByteArray656 = new byte[i_86_];
						for (int i_87_ = 0; (i_87_ ^ 0xffffffff) > (i_86_ ^ 0xffffffff); i_87_++) {
							aByteArray656[i_87_] = (stream.readByte(Class77
									.method527(i, 1854307130)));
							int i_88_ = stream.readUnsignedByte((byte) 35);
							anIntArrayArray658[i_87_] = new int[i_88_];
							for (int i_89_ = 0; (i_89_ ^ 0xffffffff) > (i_88_ ^ 0xffffffff); i_89_++)
								anIntArrayArray658[i_87_][i_89_] = stream
										.readUnsignedShort((byte) -65);
						}
						if (i_65_ != 5
								|| (((Class290) ((Class42) this).aClass290_614).aBool3920))
							break;
						method386(stream, i + 89);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("hba.C(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_65_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass192_692 = null;
	}
}
