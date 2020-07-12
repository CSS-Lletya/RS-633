/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class179 {
	int[] anIntArray2269;
	Class261[] aClass261Array2270;
	byte[] aByteArray2271;
	short[] aShortArray2272;
	short[] aShortArray2273;
	static IncomingPacket aClass160_2274 = new IncomingPacket(100, 2);
	short[] aShortArray2275;
	short[] aShortArray2276;
	int anInt2277;
	int anInt2278 = 0;
	static Class154 aClass154_2279;
	int[] anIntArray2280;
	static int anInt2281;
	short[] aShortArray2282;
	static int anInt2283;
	byte[] aByteArray2284;
	static int anInt2285;
	static int anInt2286;
	short[] aShortArray2287;
	int[] anIntArray2288;
	byte[] aByteArray2289;
	byte[] aByteArray2290;
	static int anInt2291;
	Class210[] aClass210Array2292;
	int[] anIntArray2293;
	byte[] aByteArray2294;
	static int anInt2295;
	int[] anIntArray2296;
	short[] aShortArray2297;
	short[] aShortArray2298;
	Class110[] aClass110Array2299;
	int anInt2300;
	int[] anIntArray2301;
	static int anInt2302;
	short[] aShortArray2303;
	static int anInt2304;
	byte[] aByteArray2305;
	short[] aShortArray2306;
	static int anInt2307;
	static int anInt2308;
	static int anInt2309;
	static int anInt2310;
	int anInt2311;
	int[] anIntArray2312;
	int[] anIntArray2313;
	static int anInt2314;
	int[] anIntArray2315;
	static int anInt2316;
	int[] anIntArray2317;
	int anInt2318;
	static int anInt2319;
	static int anInt2320;
	byte aByte2321;
	int[] anIntArray2322;
	byte[] aByteArray2323;

	final int[][] method1162(byte i) {
		try {
			anInt2308++;
			int[] is = new int[256];
			int i_0_ = 10 / ((-40 - i) / 35);
			int i_1_ = 0;
			for (int i_2_ = 0; ((((Class179) this).anInt2318 ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
				int i_3_ = ((Class179) this).anIntArray2293[i_2_];
				if (i_3_ >= 0) {
					if ((i_1_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
						i_1_ = i_3_;
					is[i_3_]++;
				}
			}
			int[][] is_4_ = new int[1 + i_1_][];
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) >= (i_1_ ^ 0xffffffff); i_5_++) {
				is_4_[i_5_] = new int[is[i_5_]];
				is[i_5_] = 0;
			}
			for (int i_6_ = 0; ((i_6_ ^ 0xffffffff) > (((Class179) this).anInt2318 ^ 0xffffffff)); i_6_++) {
				int i_7_ = ((Class179) this).anIntArray2293[i_6_];
				if (i_7_ >= 0)
					is_4_[i_7_][is[i_7_]++] = i_6_;
			}
			return is_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.M(" + i + ')');
		}
	}

	final void method1163(int i, byte i_8_, int i_9_, int i_10_) {
		try {
			anInt2304++;
			if (i_8_ <= 44)
				((Class179) this).aShortArray2275 = null;
			for (int i_11_ = 0; ((Class179) this).anInt2278 > i_11_; i_11_++) {
				((Class179) this).anIntArray2288[i_11_] += i_10_;
				((Class179) this).anIntArray2322[i_11_] += i;
				((Class179) this).anIntArray2269[i_11_] += i_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.H(" + i + ','
					+ i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	final int method1164(boolean bool, int i, int i_12_, int i_13_) {
		try {
			anInt2310++;
			for (int i_14_ = 0; ((i_14_ ^ 0xffffffff) > (((Class179) this).anInt2278 ^ 0xffffffff)); i_14_++) {
				if (((Class179) this).anIntArray2288[i_14_] == i_12_
						&& ((((Class179) this).anIntArray2322[i_14_] ^ 0xffffffff) == (i_13_ ^ 0xffffffff))
						&& ((i ^ 0xffffffff) == (((Class179) this).anIntArray2269[i_14_] ^ 0xffffffff)))
					return i_14_;
			}
			((Class179) this).anIntArray2288[((Class179) this).anInt2278] = i_12_;
			((Class179) this).anIntArray2322[((Class179) this).anInt2278] = i_13_;
			if (bool != true)
				return 83;
			((Class179) this).anIntArray2269[((Class179) this).anInt2278] = i;
			((Class179) this).anInt2311 = 1 + ((Class179) this).anInt2278;
			return ((Class179) this).anInt2278++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.B(" + bool + ','
					+ i + ',' + i_12_ + ',' + i_13_ + ')'));
		}
	}

	public static void method1165(boolean bool) {
		try {
			aClass160_2274 = null;
			if (bool != true)
				anInt2291 = 78;
			aClass154_2279 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.E(" + bool + ')');
		}
	}

	final void method1166(int i, boolean bool) {
		do {
			try {
				for (int i_15_ = 0; ((i_15_ ^ 0xffffffff) > (((Class179) this).anInt2278 ^ 0xffffffff)); i_15_++) {
					((Class179) this).anIntArray2288[i_15_] <<= i;
					((Class179) this).anIntArray2322[i_15_] <<= i;
					((Class179) this).anIntArray2269[i_15_] <<= i;
				}
				anInt2285++;
				if ((((Class179) this).anInt2300 ^ 0xffffffff) < -1
						&& ((Class179) this).anIntArray2280 != null) {
					for (int i_16_ = 0; i_16_ < ((Class179) this).anIntArray2280.length; i_16_++) {
						((Class179) this).anIntArray2280[i_16_] <<= i;
						((Class179) this).anIntArray2301[i_16_] <<= i;
						if (((Class179) this).aByteArray2290[i_16_] != 1)
							((Class179) this).anIntArray2315[i_16_] <<= i;
					}
				}
				if (bool == true)
					break;
				method1163(122, (byte) -10, -112, -79);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ie.J(" + i + ','
						+ bool + ')');
			}
			break;
		} while (false);
	}

	final void method1167(short i, short i_17_, int i_18_) {
		do {
			try {
				anInt2283++;
				if (((Class179) this).aShortArray2306 != null) {
					for (int i_19_ = 0; ((Class179) this).anInt2318 > i_19_; i_19_++) {
						if (i == ((Class179) this).aShortArray2306[i_19_])
							((Class179) this).aShortArray2306[i_19_] = i_17_;
					}
					if (i_18_ <= -110)
						break;
					((Class179) this).aByteArray2305 = null;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ie.D(" + i + ','
						+ i_17_ + ',' + i_18_ + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method1168(int i, boolean bool) {
		try {
			anInt2286++;
			int[] is = new int[256];
			int i_20_ = 0;
			int i_21_ = (!bool ? ((Class179) this).anInt2311
					: ((Class179) this).anInt2278);
			for (int i_22_ = 0; (i_21_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
				int i_23_ = ((Class179) this).anIntArray2317[i_22_];
				if (i_23_ >= 0) {
					is[i_23_]++;
					if (i_20_ < i_23_)
						i_20_ = i_23_;
				}
			}
			if (i != -6395)
				method1162((byte) -128);
			int[][] is_24_ = new int[i_20_ + 1][];
			for (int i_25_ = 0; (i_25_ ^ 0xffffffff) >= (i_20_ ^ 0xffffffff); i_25_++) {
				is_24_[i_25_] = new int[is[i_25_]];
				is[i_25_] = 0;
			}
			for (int i_26_ = 0; i_21_ > i_26_; i_26_++) {
				int i_27_ = ((Class179) this).anIntArray2317[i_26_];
				if ((i_27_ ^ 0xffffffff) <= -1)
					is_24_[i_27_][is[i_27_]++] = i_26_;
			}
			return is_24_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.L(" + i + ','
					+ bool + ')');
		}
	}

	final void method1169(short i, short i_28_, byte i_29_) {
		try {
			if (i_29_ == -1) {
				for (int i_30_ = 0; ((((Class179) this).anInt2318 ^ 0xffffffff) < (i_30_ ^ 0xffffffff)); i_30_++) {
					if ((((Class179) this).aShortArray2298[i_30_] ^ 0xffffffff) == (i_28_ ^ 0xffffffff))
						((Class179) this).aShortArray2298[i_30_] = i;
				}
				anInt2314++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.F(" + i + ','
					+ i_28_ + ',' + i_29_ + ')'));
		}
	}

	final byte method1170(byte i, short i_31_, short i_32_, int i_33_,
			short i_34_, short i_35_, byte i_36_, short i_37_, short i_38_,
			byte i_39_) {
		try {
			anInt2319++;
			if (i_33_ < 125)
				method1171(null, -21);
			if ((((Class179) this).anInt2300 ^ 0xffffffff) <= -256)
				throw new IllegalStateException();
			((Class179) this).aByteArray2290[((Class179) this).anInt2300] = (byte) 3;
			((Class179) this).aShortArray2275[((Class179) this).anInt2300] = i_35_;
			((Class179) this).aShortArray2273[((Class179) this).anInt2300] = i_37_;
			((Class179) this).aShortArray2303[((Class179) this).anInt2300] = i_31_;
			((Class179) this).anIntArray2280[((Class179) this).anInt2300] = i_38_;
			((Class179) this).anIntArray2301[((Class179) this).anInt2300] = i_32_;
			((Class179) this).anIntArray2315[((Class179) this).anInt2300] = i_34_;
			((Class179) this).aByteArray2271[((Class179) this).anInt2300] = i_36_;
			((Class179) this).aByteArray2284[((Class179) this).anInt2300] = i;
			((Class179) this).anIntArray2312[((Class179) this).anInt2300] = i_39_;
			return (byte) ((Class179) this).anInt2300++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.N(" + i + ','
					+ i_31_ + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ','
					+ i_35_ + ',' + i_36_ + ',' + i_37_ + ',' + i_38_ + ','
					+ i_39_ + ')'));
		}
	}

	private final void method1171(byte[] is, int i) {
		do {
			try {
				anInt2281++;
				boolean bool = false;
				boolean bool_40_ = false;
				Stream stream = new Stream(is);
				Stream stream_41_ = new Stream(is);
				Stream stream_42_ = new Stream(is);
				Stream stream_43_ = new Stream(is);
				Stream stream_44_ = new Stream(is);
				((Stream) stream).position = -18 + is.length;
				((Class179) this).anInt2278 = stream
						.readUnsignedShort((byte) -65);
				((Class179) this).anInt2318 = stream
						.readUnsignedShort((byte) -65);
				((Class179) this).anInt2300 = stream
						.readUnsignedByte((byte) 35);
				int i_45_ = stream.readUnsignedByte((byte) 35);
				int i_46_ = stream.readUnsignedByte((byte) 35);
				int i_47_ = stream.readUnsignedByte((byte) 35);
				int i_48_ = stream.readUnsignedByte((byte) 35);
				int i_49_ = stream.readUnsignedByte((byte) 35);
				int i_50_ = stream.readUnsignedShort((byte) -65);
				int i_51_ = stream.readUnsignedShort((byte) -65);
				int i_52_ = stream.readUnsignedShort((byte) -65);
				int i_53_ = stream.readUnsignedShort((byte) -65);
				int i_54_ = 0;
				int i_55_ = i_54_;
				i_54_ += ((Class179) this).anInt2278;
				int i_56_ = i_54_;
				i_54_ += ((Class179) this).anInt2318;
				int i_57_ = i_54_;
				if (i_46_ == 255)
					i_54_ += ((Class179) this).anInt2318;
				int i_58_ = i_54_;
				if (i_48_ == 1)
					i_54_ += ((Class179) this).anInt2318;
				int i_59_ = i_54_;
				if (i_45_ == 1)
					i_54_ += ((Class179) this).anInt2318;
				int i_60_ = i_54_;
				if ((i_49_ ^ 0xffffffff) == i)
					i_54_ += ((Class179) this).anInt2278;
				int i_61_ = i_54_;
				if ((i_47_ ^ 0xffffffff) == -2)
					i_54_ += ((Class179) this).anInt2318;
				int i_62_ = i_54_;
				i_54_ += i_53_;
				int i_63_ = i_54_;
				i_54_ += ((Class179) this).anInt2318 * 2;
				int i_64_ = i_54_;
				i_54_ += 6 * ((Class179) this).anInt2300;
				int i_65_ = i_54_;
				i_54_ += i_50_;
				int i_66_ = i_54_;
				i_54_ += i_51_;
				int i_67_ = i_54_;
				((Class179) this).aShortArray2298 = new short[((Class179) this).anInt2318];
				((Class179) this).aShortArray2297 = new short[((Class179) this).anInt2318];
				((Stream) stream).position = i_55_;
				((Class179) this).anIntArray2269 = new int[((Class179) this).anInt2278];
				if (i_45_ == 1) {
					((Class179) this).aShortArray2306 = new short[((Class179) this).anInt2318];
					((Class179) this).aByteArray2323 = new byte[((Class179) this).anInt2318];
					((Class179) this).aByteArray2289 = new byte[((Class179) this).anInt2318];
				}
				((Class179) this).anIntArray2288 = new int[((Class179) this).anInt2278];
				((Class179) this).aShortArray2287 = new short[((Class179) this).anInt2318];
				if ((i_47_ ^ 0xffffffff) == -2)
					((Class179) this).aByteArray2294 = new byte[((Class179) this).anInt2318];
				i_54_ += i_52_;
				((Class179) this).aShortArray2282 = new short[((Class179) this).anInt2318];
				if ((i_46_ ^ 0xffffffff) != -256)
					((Class179) this).aByte2321 = (byte) i_46_;
				else
					((Class179) this).aByteArray2305 = new byte[((Class179) this).anInt2318];
				if ((i_48_ ^ 0xffffffff) == -2)
					((Class179) this).anIntArray2293 = new int[((Class179) this).anInt2318];
				((Class179) this).anIntArray2322 = new int[((Class179) this).anInt2278];
				if (((Class179) this).anInt2300 > 0) {
					((Class179) this).aByteArray2290 = new byte[((Class179) this).anInt2300];
					((Class179) this).aShortArray2303 = new short[((Class179) this).anInt2300];
					((Class179) this).aShortArray2275 = new short[((Class179) this).anInt2300];
					((Class179) this).aShortArray2273 = new short[((Class179) this).anInt2300];
				}
				if ((i_49_ ^ 0xffffffff) == -2)
					((Class179) this).anIntArray2317 = new int[((Class179) this).anInt2278];
				((Stream) stream_41_).position = i_65_;
				((Stream) stream_42_).position = i_66_;
				((Stream) stream_43_).position = i_67_;
				((Stream) stream_44_).position = i_60_;
				int i_68_ = 0;
				int i_69_ = 0;
				int i_70_ = 0;
				for (int i_71_ = 0; ((Class179) this).anInt2278 > i_71_; i_71_++) {
					int i_72_ = stream.readUnsignedByte((byte) 35);
					int i_73_ = 0;
					if ((i_72_ & 0x1 ^ 0xffffffff) != -1)
						i_73_ = stream_41_.method2532(-5929);
					int i_74_ = 0;
					if ((i_72_ & 0x2 ^ 0xffffffff) != -1)
						i_74_ = stream_42_.method2532(i - 5927);
					int i_75_ = 0;
					if ((i_72_ & 0x4 ^ 0xffffffff) != -1)
						i_75_ = stream_43_.method2532(-5929);
					((Class179) this).anIntArray2288[i_71_] = i_68_ - -i_73_;
					((Class179) this).anIntArray2322[i_71_] = i_74_ + i_69_;
					((Class179) this).anIntArray2269[i_71_] = i_70_ + i_75_;
					i_69_ = ((Class179) this).anIntArray2322[i_71_];
					i_68_ = ((Class179) this).anIntArray2288[i_71_];
					i_70_ = ((Class179) this).anIntArray2269[i_71_];
					if ((i_49_ ^ 0xffffffff) == -2)
						((Class179) this).anIntArray2317[i_71_] = stream_44_
								.readUnsignedByte((byte) 35);
				}
				((Stream) stream).position = i_63_;
				((Stream) stream_41_).position = i_59_;
				((Stream) stream_42_).position = i_57_;
				((Stream) stream_43_).position = i_61_;
				((Stream) stream_44_).position = i_58_;
				for (int i_76_ = 0; ((i_76_ ^ 0xffffffff) > (((Class179) this).anInt2318 ^ 0xffffffff)); i_76_++) {
					((Class179) this).aShortArray2298[i_76_] = (short) stream
							.readUnsignedShort((byte) -65);
					if ((i_45_ ^ 0xffffffff) == -2) {
						int i_77_ = stream_41_.readUnsignedByte((byte) 35);
						if ((i_77_ & 0x1) != 1)
							((Class179) this).aByteArray2289[i_76_] = (byte) 0;
						else {
							((Class179) this).aByteArray2289[i_76_] = (byte) 1;
							bool = true;
						}
						if ((0x2 & i_77_ ^ 0xffffffff) == -3) {
							((Class179) this).aByteArray2323[i_76_] = (byte) (i_77_ >> 2);
							((Class179) this).aShortArray2306[i_76_] = ((Class179) this).aShortArray2298[i_76_];
							((Class179) this).aShortArray2298[i_76_] = (short) 127;
							if ((((Class179) this).aShortArray2306[i_76_] ^ 0xffffffff) != 0)
								bool_40_ = true;
						} else {
							((Class179) this).aByteArray2323[i_76_] = (byte) -1;
							((Class179) this).aShortArray2306[i_76_] = (short) -1;
						}
					}
					if ((i_46_ ^ 0xffffffff) == -256)
						((Class179) this).aByteArray2305[i_76_] = stream_42_
								.readByte(i + 1854307122);
					if (i_47_ == 1)
						((Class179) this).aByteArray2294[i_76_] = stream_43_
								.readByte(1854307120);
					if ((i_48_ ^ 0xffffffff) == -2)
						((Class179) this).anIntArray2293[i_76_] = stream_44_
								.readUnsignedByte((byte) 35);
				}
				((Stream) stream).position = i_62_;
				((Class179) this).anInt2311 = -1;
				((Stream) stream_41_).position = i_56_;
				short i_78_ = 0;
				short i_79_ = 0;
				short i_80_ = 0;
				int i_81_ = 0;
				for (int i_82_ = 0; ((((Class179) this).anInt2318 ^ 0xffffffff) < (i_82_ ^ 0xffffffff)); i_82_++) {
					int i_83_ = stream_41_.readUnsignedByte((byte) 35);
					if ((i_83_ ^ 0xffffffff) == -2) {
						i_78_ = (short) (i_81_ + stream.method2532(-5929));
						i_81_ = i_78_;
						i_79_ = (short) (stream.method2532(-5929) + i_81_);
						i_81_ = i_79_;
						i_80_ = (short) (stream.method2532(i ^ 0x1729) + i_81_);
						i_81_ = i_80_;
						((Class179) this).aShortArray2297[i_82_] = i_78_;
						((Class179) this).aShortArray2287[i_82_] = i_79_;
						((Class179) this).aShortArray2282[i_82_] = i_80_;
						if ((((Class179) this).anInt2311 ^ 0xffffffff) > (i_78_ ^ 0xffffffff))
							((Class179) this).anInt2311 = i_78_;
						if (((Class179) this).anInt2311 < i_79_)
							((Class179) this).anInt2311 = i_79_;
						if (i_80_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_80_;
					}
					if (i_83_ == 2) {
						i_79_ = i_80_;
						i_80_ = (short) (stream.method2532(-5929) + i_81_);
						i_81_ = i_80_;
						((Class179) this).aShortArray2297[i_82_] = i_78_;
						((Class179) this).aShortArray2287[i_82_] = i_79_;
						((Class179) this).aShortArray2282[i_82_] = i_80_;
						if ((((Class179) this).anInt2311 ^ 0xffffffff) > (i_80_ ^ 0xffffffff))
							((Class179) this).anInt2311 = i_80_;
					}
					if (i_83_ == 3) {
						i_78_ = i_80_;
						i_80_ = (short) (stream.method2532(i ^ 0x1729) + i_81_);
						i_81_ = i_80_;
						((Class179) this).aShortArray2297[i_82_] = i_78_;
						((Class179) this).aShortArray2287[i_82_] = i_79_;
						((Class179) this).aShortArray2282[i_82_] = i_80_;
						if ((i_80_ ^ 0xffffffff) < (((Class179) this).anInt2311 ^ 0xffffffff))
							((Class179) this).anInt2311 = i_80_;
					}
					if ((i_83_ ^ 0xffffffff) == -5) {
						short i_84_ = i_78_;
						i_78_ = i_79_;
						i_79_ = i_84_;
						i_80_ = (short) (i_81_ + stream.method2532(i - 5927));
						((Class179) this).aShortArray2297[i_82_] = i_78_;
						i_81_ = i_80_;
						((Class179) this).aShortArray2287[i_82_] = i_79_;
						((Class179) this).aShortArray2282[i_82_] = i_80_;
						if (i_80_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_80_;
					}
				}
				((Class179) this).anInt2311++;
				((Stream) stream).position = i_64_;
				for (int i_85_ = 0; ((i_85_ ^ 0xffffffff) > (((Class179) this).anInt2300 ^ 0xffffffff)); i_85_++) {
					((Class179) this).aByteArray2290[i_85_] = (byte) 0;
					((Class179) this).aShortArray2275[i_85_] = (short) stream
							.readUnsignedShort((byte) -65);
					((Class179) this).aShortArray2273[i_85_] = (short) stream
							.readUnsignedShort((byte) -65);
					((Class179) this).aShortArray2303[i_85_] = (short) stream
							.readUnsignedShort((byte) -65);
				}
				if (((Class179) this).aByteArray2323 != null) {
					boolean bool_86_ = false;
					for (int i_87_ = 0; ((Class179) this).anInt2318 > i_87_; i_87_++) {
						int i_88_ = ((Class179) this).aByteArray2323[i_87_] & 0xff;
						if (i_88_ != 255) {
							if ((((((Class179) this).aShortArray2275[i_88_] & 0xffff) ^ 0xffffffff) == (((Class179) this).aShortArray2297[i_87_] ^ 0xffffffff))
									&& ((((Class179) this).aShortArray2287[i_87_] ^ 0xffffffff) == ((((Class179) this).aShortArray2273[i_88_]) & 0xffff ^ 0xffffffff))
									&& ((0xffff & (((Class179) this).aShortArray2303[i_88_]) ^ 0xffffffff) == ((((Class179) this).aShortArray2282[i_87_]) ^ 0xffffffff)))
								((Class179) this).aByteArray2323[i_87_] = (byte) -1;
							else
								bool_86_ = true;
						}
					}
					if (!bool_86_)
						((Class179) this).aByteArray2323 = null;
				}
				if (!bool)
					((Class179) this).aByteArray2289 = null;
				if (bool_40_)
					break;
				((Class179) this).aShortArray2306 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ie.A("
						+ (is != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	final void method1172(int i, int i_89_, int i_90_, int i_91_) {
		do {
			try {
				anInt2316++;
				if (i_89_ != 0) {
					int i_92_ = Class335.anIntArray4436[i_89_];
					int i_93_ = Class335.anIntArray4430[i_89_];
					for (int i_94_ = 0; ((((Class179) this).anInt2278 ^ 0xffffffff) < (i_94_ ^ 0xffffffff)); i_94_++) {
						int i_95_ = ((i_92_
								* ((Class179) this).anIntArray2322[i_94_] + (((Class179) this).anIntArray2288[i_94_] * i_93_)) >> 14);
						((Class179) this).anIntArray2322[i_94_] = ((i_93_
								* ((Class179) this).anIntArray2322[i_94_] + -(i_92_ * ((Class179) this).anIntArray2288[i_94_])) >> 14);
						((Class179) this).anIntArray2288[i_94_] = i_95_;
					}
				}
				if (i_90_ != i) {
					int i_96_ = Class335.anIntArray4436[i];
					int i_97_ = Class335.anIntArray4430[i];
					for (int i_98_ = 0; ((Class179) this).anInt2278 > i_98_; i_98_++) {
						int i_99_ = ((-(((Class179) this).anIntArray2269[i_98_] * i_96_) + i_97_
								* (((Class179) this).anIntArray2322[i_98_])) >> 14);
						((Class179) this).anIntArray2269[i_98_] = (i_96_
								* ((Class179) this).anIntArray2322[i_98_] + i_97_
								* (((Class179) this).anIntArray2269[i_98_])) >> 14;
						((Class179) this).anIntArray2322[i_98_] = i_99_;
					}
				}
				if (i_91_ == 0)
					break;
				int i_100_ = Class335.anIntArray4436[i_91_];
				int i_101_ = Class335.anIntArray4430[i_91_];
				for (int i_102_ = 0; ((((Class179) this).anInt2278 ^ 0xffffffff) < (i_102_ ^ 0xffffffff)); i_102_++) {
					int i_103_ = ((((Class179) this).anIntArray2269[i_102_]
							* i_100_ - -(((Class179) this).anIntArray2288[i_102_] * i_101_)) >> 14);
					((Class179) this).anIntArray2269[i_102_] = (-(((Class179) this).anIntArray2288[i_102_] * i_100_) + (((Class179) this).anIntArray2269[i_102_] * i_101_)) >> 14;
					((Class179) this).anIntArray2288[i_102_] = i_103_;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ie.C(" + i + ','
						+ i_89_ + ',' + i_90_ + ',' + i_91_ + ')'));
			}
			break;
		} while (false);
	}

	final int method1173(int i, byte i_104_, short i_105_, short i_106_,
			byte i_107_, byte i_108_, int i_109_, int i_110_, int i_111_) {
		try {
			anInt2309++;
			((Class179) this).aShortArray2297[((Class179) this).anInt2318] = (short) i_109_;
			((Class179) this).aShortArray2287[((Class179) this).anInt2318] = (short) i_110_;
			((Class179) this).aShortArray2282[((Class179) this).anInt2318] = (short) i;
			((Class179) this).aByteArray2289[((Class179) this).anInt2318] = i_107_;
			((Class179) this).aByteArray2323[((Class179) this).anInt2318] = i_108_;
			((Class179) this).aShortArray2298[((Class179) this).anInt2318] = i_106_;
			((Class179) this).aByteArray2294[((Class179) this).anInt2318] = i_104_;
			((Class179) this).aShortArray2306[((Class179) this).anInt2318] = i_105_;
			if (i_111_ != -10373)
				((Class179) this).anIntArray2317 = null;
			return ((Class179) this).anInt2318++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ie.P(" + i + ',' + i_104_ + ',' + i_105_ + ',' + i_106_
							+ ',' + i_107_ + ',' + i_108_ + ',' + i_109_ + ','
							+ i_110_ + ',' + i_111_ + ')'));
		}
	}

	private final void method1174(byte i, byte[] is) {
		do {
			try {
				anInt2307++;
				Stream stream = new Stream(is);
				Stream stream_112_ = new Stream(is);
				Stream stream_113_ = new Stream(is);
				Stream stream_114_ = new Stream(is);
				Stream stream_115_ = new Stream(is);
				Stream stream_116_ = new Stream(is);
				Stream stream_117_ = new Stream(is);
				((Stream) stream).position = -23 + is.length;
				((Class179) this).anInt2278 = stream
						.readUnsignedShort((byte) -65);
				((Class179) this).anInt2318 = stream
						.readUnsignedShort((byte) -65);
				((Class179) this).anInt2300 = stream
						.readUnsignedByte((byte) 35);
				int i_118_ = stream.readUnsignedByte((byte) 35);
				boolean bool = (i_118_ & 0x1) == 1;
				boolean bool_119_ = (0x2 & i_118_ ^ 0xffffffff) == -3;
				boolean bool_120_ = (0x4 & i_118_) == 4;
				boolean bool_121_ = (0x8 & i_118_ ^ 0xffffffff) == -9;
				if (bool_121_) {
					((Stream) stream).position -= 7;
					((Class179) this).anInt2277 = stream
							.readUnsignedByte((byte) 35);
					((Stream) stream).position += 6;
				}
				int i_122_ = stream.readUnsignedByte((byte) 35);
				int i_123_ = stream.readUnsignedByte((byte) 35);
				int i_124_ = stream.readUnsignedByte((byte) 35);
				int i_125_ = stream.readUnsignedByte((byte) 35);
				int i_126_ = stream.readUnsignedByte((byte) 35);
				int i_127_ = stream.readUnsignedShort((byte) -65);
				int i_128_ = stream.readUnsignedShort((byte) -65);
				int i_129_ = stream.readUnsignedShort((byte) -65);
				int i_130_ = stream.readUnsignedShort((byte) -65);
				int i_131_ = stream.readUnsignedShort((byte) -65);
				int i_132_ = 0;
				int i_133_ = 0;
				int i_134_ = 0;
				if ((((Class179) this).anInt2300 ^ 0xffffffff) < -1) {
					((Stream) stream).position = 0;
					((Class179) this).aByteArray2290 = new byte[((Class179) this).anInt2300];
					for (int i_135_ = 0; ((((Class179) this).anInt2300 ^ 0xffffffff) < (i_135_ ^ 0xffffffff)); i_135_++) {
						byte i_136_ = (((Class179) this).aByteArray2290[i_135_] = stream
								.readByte(1854307120));
						if ((i_136_ ^ 0xffffffff) <= -2 && i_136_ <= 3)
							i_133_++;
						if ((i_136_ ^ 0xffffffff) == -1)
							i_132_++;
						if (i_136_ == 2)
							i_134_++;
					}
				}
				int i_137_ = ((Class179) this).anInt2300;
				int i_138_ = i_137_;
				i_137_ += ((Class179) this).anInt2278;
				int i_139_ = i_137_;
				if (bool)
					i_137_ += ((Class179) this).anInt2318;
				int i_140_ = i_137_;
				i_137_ += ((Class179) this).anInt2318;
				int i_141_ = i_137_;
				if ((i_122_ ^ 0xffffffff) == -256)
					i_137_ += ((Class179) this).anInt2318;
				int i_142_ = i_137_;
				if (i_124_ == 1)
					i_137_ += ((Class179) this).anInt2318;
				int i_143_ = i_137_;
				if ((i_126_ ^ 0xffffffff) == -2)
					i_137_ += ((Class179) this).anInt2278;
				int i_144_ = i_137_;
				if (i_123_ == 1)
					i_137_ += ((Class179) this).anInt2318;
				int i_145_ = i_137_;
				i_137_ += i_130_;
				int i_146_ = i_137_;
				if ((i_125_ ^ 0xffffffff) == -2)
					i_137_ += 2 * ((Class179) this).anInt2318;
				int i_147_ = i_137_;
				i_137_ += i_131_;
				int i_148_ = i_137_;
				i_137_ += ((Class179) this).anInt2318 * 2;
				int i_149_ = i_137_;
				i_137_ += i_127_;
				int i_150_ = i_137_;
				i_137_ += i_128_;
				int i_151_ = i_137_;
				i_137_ += i_129_;
				int i_152_ = i_137_;
				i_137_ += i_132_ * 6;
				int i_153_ = -124 / ((i - 34) / 53);
				int i_154_ = i_137_;
				i_137_ += 6 * i_133_;
				int i_155_ = 6;
				if ((((Class179) this).anInt2277 ^ 0xffffffff) == -15)
					i_155_ = 7;
				else if ((((Class179) this).anInt2277 ^ 0xffffffff) <= -16)
					i_155_ = 9;
				int i_156_ = i_137_;
				i_137_ += i_133_ * i_155_;
				int i_157_ = i_137_;
				i_137_ += i_133_;
				int i_158_ = i_137_;
				i_137_ += i_133_;
				int i_159_ = i_137_;
				i_137_ += i_133_ - -(i_134_ * 2);
				((Class179) this).aShortArray2287 = new short[((Class179) this).anInt2318];
				int i_160_ = i_137_;
				if (bool)
					((Class179) this).aByteArray2289 = new byte[((Class179) this).anInt2318];
				((Class179) this).anIntArray2269 = new int[((Class179) this).anInt2278];
				if ((i_123_ ^ 0xffffffff) == -2)
					((Class179) this).aByteArray2294 = new byte[((Class179) this).anInt2318];
				if ((i_125_ ^ 0xffffffff) == -2
						&& ((Class179) this).anInt2300 > 0)
					((Class179) this).aByteArray2323 = new byte[((Class179) this).anInt2318];
				((Class179) this).anIntArray2322 = new int[((Class179) this).anInt2278];
				((Class179) this).anIntArray2288 = new int[((Class179) this).anInt2278];
				if ((i_124_ ^ 0xffffffff) == -2)
					((Class179) this).anIntArray2293 = new int[((Class179) this).anInt2318];
				((Class179) this).aShortArray2282 = new short[((Class179) this).anInt2318];
				if (i_126_ == 1)
					((Class179) this).anIntArray2317 = new int[((Class179) this).anInt2278];
				((Stream) stream).position = i_138_;
				if (i_125_ == 1)
					((Class179) this).aShortArray2306 = new short[((Class179) this).anInt2318];
				((Class179) this).aShortArray2297 = new short[((Class179) this).anInt2318];
				if ((((Class179) this).anInt2300 ^ 0xffffffff) < -1) {
					((Class179) this).aShortArray2273 = new short[((Class179) this).anInt2300];
					((Class179) this).aShortArray2303 = new short[((Class179) this).anInt2300];
					if (i_133_ > 0) {
						((Class179) this).anIntArray2280 = new int[i_133_];
						((Class179) this).anIntArray2312 = new int[i_133_];
						((Class179) this).aByteArray2284 = new byte[i_133_];
						((Class179) this).anIntArray2301 = new int[i_133_];
						((Class179) this).anIntArray2315 = new int[i_133_];
						((Class179) this).aByteArray2271 = new byte[i_133_];
					}
					((Class179) this).aShortArray2275 = new short[((Class179) this).anInt2300];
					if (i_134_ > 0) {
						((Class179) this).anIntArray2296 = new int[i_134_];
						((Class179) this).anIntArray2313 = new int[i_134_];
					}
				}
				if ((i_122_ ^ 0xffffffff) == -256)
					((Class179) this).aByteArray2305 = new byte[((Class179) this).anInt2318];
				else
					((Class179) this).aByte2321 = (byte) i_122_;
				((Class179) this).aShortArray2298 = new short[((Class179) this).anInt2318];
				((Stream) stream_112_).position = i_149_;
				((Stream) stream_113_).position = i_150_;
				((Stream) stream_114_).position = i_151_;
				((Stream) stream_115_).position = i_143_;
				int i_161_ = 0;
				int i_162_ = 0;
				int i_163_ = 0;
				for (int i_164_ = 0; ((i_164_ ^ 0xffffffff) > (((Class179) this).anInt2278 ^ 0xffffffff)); i_164_++) {
					int i_165_ = stream.readUnsignedByte((byte) 35);
					int i_166_ = 0;
					if ((i_165_ & 0x1 ^ 0xffffffff) != -1)
						i_166_ = stream_112_.method2532(-5929);
					int i_167_ = 0;
					if ((i_165_ & 0x2 ^ 0xffffffff) != -1)
						i_167_ = stream_113_.method2532(-5929);
					int i_168_ = 0;
					if ((i_165_ & 0x4) != 0)
						i_168_ = stream_114_.method2532(-5929);
					((Class179) this).anIntArray2288[i_164_] = i_161_ + i_166_;
					((Class179) this).anIntArray2322[i_164_] = i_162_ + i_167_;
					((Class179) this).anIntArray2269[i_164_] = i_168_ + i_163_;
					i_163_ = ((Class179) this).anIntArray2269[i_164_];
					i_161_ = ((Class179) this).anIntArray2288[i_164_];
					i_162_ = ((Class179) this).anIntArray2322[i_164_];
					if ((i_126_ ^ 0xffffffff) == -2)
						((Class179) this).anIntArray2317[i_164_] = stream_115_
								.readUnsignedByte((byte) 35);
				}
				((Stream) stream).position = i_148_;
				((Stream) stream_112_).position = i_139_;
				((Stream) stream_113_).position = i_141_;
				((Stream) stream_114_).position = i_144_;
				((Stream) stream_115_).position = i_142_;
				((Stream) stream_116_).position = i_146_;
				((Stream) stream_117_).position = i_147_;
				for (int i_169_ = 0; ((i_169_ ^ 0xffffffff) > (((Class179) this).anInt2318 ^ 0xffffffff)); i_169_++) {
					((Class179) this).aShortArray2298[i_169_] = (short) stream
							.readUnsignedShort((byte) -65);
					if (bool)
						((Class179) this).aByteArray2289[i_169_] = stream_112_
								.readByte(1854307120);
					if ((i_122_ ^ 0xffffffff) == -256)
						((Class179) this).aByteArray2305[i_169_] = stream_113_
								.readByte(1854307120);
					if (i_123_ == 1)
						((Class179) this).aByteArray2294[i_169_] = stream_114_
								.readByte(1854307120);
					if (i_124_ == 1)
						((Class179) this).anIntArray2293[i_169_] = stream_115_
								.readUnsignedByte((byte) 35);
					if (i_125_ == 1)
						((Class179) this).aShortArray2306[i_169_] = (short) (stream_116_
								.readUnsignedShort((byte) -65) - 1);
					if (((Class179) this).aByteArray2323 != null) {
						if ((((Class179) this).aShortArray2306[i_169_] ^ 0xffffffff) != 0)
							((Class179) this).aByteArray2323[i_169_] = (byte) (-1 + stream_117_
									.readUnsignedByte((byte) 35));
						else
							((Class179) this).aByteArray2323[i_169_] = (byte) -1;
					}
				}
				((Class179) this).anInt2311 = -1;
				((Stream) stream).position = i_145_;
				((Stream) stream_112_).position = i_140_;
				short i_170_ = 0;
				short i_171_ = 0;
				short i_172_ = 0;
				int i_173_ = 0;
				for (int i_174_ = 0; ((((Class179) this).anInt2318 ^ 0xffffffff) < (i_174_ ^ 0xffffffff)); i_174_++) {
					int i_175_ = stream_112_.readUnsignedByte((byte) 35);
					if ((i_175_ ^ 0xffffffff) == -2) {
						i_170_ = (short) (i_173_ + stream.method2532(-5929));
						i_173_ = i_170_;
						i_171_ = (short) (i_173_ + stream.method2532(-5929));
						i_173_ = i_171_;
						i_172_ = (short) (stream.method2532(-5929) + i_173_);
						i_173_ = i_172_;
						((Class179) this).aShortArray2297[i_174_] = i_170_;
						((Class179) this).aShortArray2287[i_174_] = i_171_;
						((Class179) this).aShortArray2282[i_174_] = i_172_;
						if (((Class179) this).anInt2311 < i_170_)
							((Class179) this).anInt2311 = i_170_;
						if (i_171_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_171_;
						if (i_172_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_172_;
					}
					if ((i_175_ ^ 0xffffffff) == -3) {
						i_171_ = i_172_;
						i_172_ = (short) (stream.method2532(-5929) + i_173_);
						i_173_ = i_172_;
						((Class179) this).aShortArray2297[i_174_] = i_170_;
						((Class179) this).aShortArray2287[i_174_] = i_171_;
						((Class179) this).aShortArray2282[i_174_] = i_172_;
						if (i_172_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_172_;
					}
					if ((i_175_ ^ 0xffffffff) == -4) {
						i_170_ = i_172_;
						i_172_ = (short) (stream.method2532(-5929) + i_173_);
						i_173_ = i_172_;
						((Class179) this).aShortArray2297[i_174_] = i_170_;
						((Class179) this).aShortArray2287[i_174_] = i_171_;
						((Class179) this).aShortArray2282[i_174_] = i_172_;
						if (((Class179) this).anInt2311 < i_172_)
							((Class179) this).anInt2311 = i_172_;
					}
					if (i_175_ == 4) {
						short i_176_ = i_170_;
						i_170_ = i_171_;
						i_171_ = i_176_;
						i_172_ = (short) (i_173_ + stream.method2532(-5929));
						i_173_ = i_172_;
						((Class179) this).aShortArray2297[i_174_] = i_170_;
						((Class179) this).aShortArray2287[i_174_] = i_171_;
						((Class179) this).aShortArray2282[i_174_] = i_172_;
						if (i_172_ > ((Class179) this).anInt2311)
							((Class179) this).anInt2311 = i_172_;
					}
				}
				((Class179) this).anInt2311++;
				((Stream) stream).position = i_152_;
				((Stream) stream_112_).position = i_154_;
				((Stream) stream_113_).position = i_156_;
				((Stream) stream_114_).position = i_157_;
				((Stream) stream_115_).position = i_158_;
				((Stream) stream_116_).position = i_159_;
				for (int i_177_ = 0; ((Class179) this).anInt2300 > i_177_; i_177_++) {
					int i_178_ = ((Class179) this).aByteArray2290[i_177_] & 0xff;
					if (i_178_ == 0) {
						((Class179) this).aShortArray2275[i_177_] = (short) stream
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2273[i_177_] = (short) stream
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2303[i_177_] = (short) stream
								.readUnsignedShort((byte) -65);
					}
					if (i_178_ == 1) {
						((Class179) this).aShortArray2275[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2273[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2303[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						if ((((Class179) this).anInt2277 ^ 0xffffffff) > -16) {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
							if (((Class179) this).anInt2277 < 14)
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.readUnsignedShort((byte) -65);
							else
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.method2558(false);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
						} else {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2301[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.method2558(false);
						}
						((Class179) this).aByteArray2271[i_177_] = stream_114_
								.readByte(1854307120);
						((Class179) this).aByteArray2284[i_177_] = stream_115_
								.readByte(1854307120);
						((Class179) this).anIntArray2312[i_177_] = stream_116_
								.readByte(1854307120);
					}
					if (i_178_ == 2) {
						((Class179) this).aShortArray2275[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2273[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2303[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						if ((((Class179) this).anInt2277 ^ 0xffffffff) <= -16) {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2301[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.method2558(false);
						} else {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
							if ((((Class179) this).anInt2277 ^ 0xffffffff) <= -15)
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.method2558(false);
							else
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.readUnsignedShort((byte) -65);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
						}
						((Class179) this).aByteArray2271[i_177_] = stream_114_
								.readByte(1854307120);
						((Class179) this).aByteArray2284[i_177_] = stream_115_
								.readByte(1854307120);
						((Class179) this).anIntArray2312[i_177_] = stream_116_
								.readByte(1854307120);
						((Class179) this).anIntArray2296[i_177_] = stream_116_
								.readByte(1854307120);
						((Class179) this).anIntArray2313[i_177_] = stream_116_
								.readByte(1854307120);
					}
					if (i_178_ == 3) {
						((Class179) this).aShortArray2275[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2273[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						((Class179) this).aShortArray2303[i_177_] = (short) stream_112_
								.readUnsignedShort((byte) -65);
						if ((((Class179) this).anInt2277 ^ 0xffffffff) <= -16) {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2301[i_177_] = stream_113_
									.method2558(false);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.method2558(false);
						} else {
							((Class179) this).anIntArray2280[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
							if (((Class179) this).anInt2277 >= 14)
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.method2558(false);
							else
								((Class179) this).anIntArray2301[i_177_] = stream_113_
										.readUnsignedShort((byte) -65);
							((Class179) this).anIntArray2315[i_177_] = stream_113_
									.readUnsignedShort((byte) -65);
						}
						((Class179) this).aByteArray2271[i_177_] = stream_114_
								.readByte(1854307120);
						((Class179) this).aByteArray2284[i_177_] = stream_115_
								.readByte(1854307120);
						((Class179) this).anIntArray2312[i_177_] = stream_116_
								.readByte(1854307120);
					}
				}
				((Stream) stream).position = i_160_;
				if (bool_119_) {
					int i_179_ = stream.readUnsignedByte((byte) 35);
					if ((i_179_ ^ 0xffffffff) < -1) {
						((Class179) this).aClass110Array2299 = new Class110[i_179_];
						for (int i_180_ = 0; (i_180_ ^ 0xffffffff) > (i_179_ ^ 0xffffffff); i_180_++) {
							int i_181_ = stream.readUnsignedShort((byte) -65);
							int i_182_ = stream.readUnsignedShort((byte) -65);
							byte i_183_;
							if (i_122_ == 255)
								i_183_ = ((Class179) this).aByteArray2305[i_182_];
							else
								i_183_ = (byte) i_122_;
							((Class179) this).aClass110Array2299[i_180_] = new Class110(
									i_181_,
									(((Class179) this).aShortArray2297[i_182_]),
									(((Class179) this).aShortArray2287[i_182_]),
									(((Class179) this).aShortArray2282[i_182_]),
									i_183_);
						}
					}
					int i_184_ = stream.readUnsignedByte((byte) 35);
					if (i_184_ > 0) {
						((Class179) this).aClass261Array2270 = new Class261[i_184_];
						for (int i_185_ = 0; i_184_ > i_185_; i_185_++) {
							int i_186_ = stream.readUnsignedShort((byte) -65);
							int i_187_ = stream.readUnsignedShort((byte) -65);
							((Class179) this).aClass261Array2270[i_185_] = new Class261(
									i_186_, i_187_);
						}
					}
				}
				if (!bool_120_)
					break;
				int i_188_ = stream.readUnsignedByte((byte) 35);
				if (i_188_ <= 0)
					break;
				((Class179) this).aClass210Array2292 = new Class210[i_188_];
				for (int i_189_ = 0; i_188_ > i_189_; i_189_++) {
					int i_190_ = stream.readUnsignedShort((byte) -65);
					int i_191_ = stream.readUnsignedShort((byte) -65);
					int i_192_ = stream.readUnsignedByte((byte) 35);
					byte i_193_ = stream.readByte(1854307120);
					((Class179) this).aClass210Array2292[i_189_] = new Class210(
							i_190_, i_191_, i_192_, i_193_);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ie.I(" + i + ','
						+ (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int[][] method1175(int i) {
		try {
			anInt2295++;
			int i_194_ = 39 % ((i + 33) / 61);
			int[] is = new int[256];
			int i_195_ = 0;
			for (int i_196_ = 0; ((((Class179) this).aClass210Array2292.length ^ 0xffffffff) < (i_196_ ^ 0xffffffff)); i_196_++) {
				int i_197_ = (((Class210) ((Class179) this).aClass210Array2292[i_196_]).anInt2852);
				if (i_197_ >= 0) {
					if (i_197_ > i_195_)
						i_195_ = i_197_;
					is[i_197_]++;
				}
			}
			int[][] is_198_ = new int[i_195_ + 1][];
			for (int i_199_ = 0; i_199_ <= i_195_; i_199_++) {
				is_198_[i_199_] = new int[is[i_199_]];
				is[i_199_] = 0;
			}
			for (int i_200_ = 0; ((((Class179) this).aClass210Array2292.length ^ 0xffffffff) < (i_200_ ^ 0xffffffff)); i_200_++) {
				int i_201_ = (((Class210) ((Class179) this).aClass210Array2292[i_200_]).anInt2852);
				if ((i_201_ ^ 0xffffffff) <= -1)
					is_198_[i_201_][is[i_201_]++] = i_200_;
			}
			return is_198_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.G(" + i + ')');
		}
	}

	static final int method1176(int i, byte i_202_) {
		try {
			i = (~0x2aaaaaaa & i >>> 1) + (i & 0x55555555);
			anInt2302++;
			i = (0x33333333 & i >>> 2) + (0x33333333 & i);
			i = (i >>> 4) + i & 0xf0f0f0f;
			i += i >>> 8;
			i += i >>> 16;
			if (i_202_ != 116)
				return -114;
			return i & 0xff;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.K(" + i + ','
					+ i_202_ + ')');
		}
	}

	private final int method1177(short i, Class179 class179_203_, int i_204_,
			int i_205_) {
		try {
			anInt2320++;
			int i_206_ = ((Class179) class179_203_).anIntArray2288[i_205_];
			int i_207_ = ((Class179) class179_203_).anIntArray2322[i_205_];
			int i_208_ = ((Class179) class179_203_).anIntArray2269[i_205_];
			if (i_204_ < 33)
				return -23;
			for (int i_209_ = 0; ((((Class179) this).anInt2278 ^ 0xffffffff) < (i_209_ ^ 0xffffffff)); i_209_++) {
				if (((i_206_ ^ 0xffffffff) == (((Class179) this).anIntArray2288[i_209_] ^ 0xffffffff))
						&& ((((Class179) this).anIntArray2322[i_209_] ^ 0xffffffff) == (i_207_ ^ 0xffffffff))
						&& ((((Class179) this).anIntArray2269[i_209_] ^ 0xffffffff) == (i_208_ ^ 0xffffffff))) {
					((Class179) this).aShortArray2272[i_209_] = (short) Class173
							.method1134(
									(((Class179) this).aShortArray2272[i_209_]),
									i);
					return i_209_;
				}
			}
			((Class179) this).anIntArray2288[((Class179) this).anInt2278] = i_206_;
			((Class179) this).anIntArray2322[((Class179) this).anInt2278] = i_207_;
			((Class179) this).anIntArray2269[((Class179) this).anInt2278] = i_208_;
			((Class179) this).aShortArray2272[((Class179) this).anInt2278] = i;
			((Class179) this).anIntArray2317[((Class179) this).anInt2278] = (((Class179) class179_203_).anIntArray2317 == null ? -1
					: ((Class179) class179_203_).anIntArray2317[i_205_]);
			return ((Class179) this).anInt2278++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.O(" + i + ','
					+ (class179_203_ != null ? "{...}" : "null") + ',' + i_204_
					+ ',' + i_205_ + ')'));
		}
	}

	public Class179() {
		((Class179) this).anInt2277 = 12;
		((Class179) this).anInt2300 = 0;
		((Class179) this).anInt2318 = 0;
		((Class179) this).anInt2311 = 0;
		((Class179) this).aByte2321 = (byte) 0;
	}

	Class179(byte[] is) {
		((Class179) this).anInt2277 = 12;
		((Class179) this).anInt2300 = 0;
		((Class179) this).anInt2318 = 0;
		((Class179) this).anInt2311 = 0;
		((Class179) this).aByte2321 = (byte) 0;
		try {
			if ((is[-1 + is.length] ^ 0xffffffff) == 0
					&& is[is.length - 2] == -1)
				method1174((byte) 90, is);
			else
				method1171(is, -2);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ie.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	Class179(int i, int i_210_, int i_211_) {
		((Class179) this).anInt2277 = 12;
		((Class179) this).anInt2300 = 0;
		((Class179) this).anInt2318 = 0;
		((Class179) this).anInt2311 = 0;
		((Class179) this).aByte2321 = (byte) 0;
		try {
			((Class179) this).aByteArray2305 = new byte[i_210_];
			((Class179) this).aByteArray2294 = new byte[i_210_];
			((Class179) this).anIntArray2322 = new int[i];
			((Class179) this).anIntArray2288 = new int[i];
			if (i_211_ > 0) {
				((Class179) this).anIntArray2301 = new int[i_211_];
				((Class179) this).anIntArray2280 = new int[i_211_];
				((Class179) this).anIntArray2313 = new int[i_211_];
				((Class179) this).anIntArray2312 = new int[i_211_];
				((Class179) this).aByteArray2284 = new byte[i_211_];
				((Class179) this).aByteArray2271 = new byte[i_211_];
				((Class179) this).anIntArray2315 = new int[i_211_];
				((Class179) this).aShortArray2275 = new short[i_211_];
				((Class179) this).aByteArray2290 = new byte[i_211_];
				((Class179) this).anIntArray2296 = new int[i_211_];
				((Class179) this).aShortArray2273 = new short[i_211_];
				((Class179) this).aShortArray2303 = new short[i_211_];
			}
			((Class179) this).aByteArray2289 = new byte[i_210_];
			((Class179) this).anIntArray2317 = new int[i];
			((Class179) this).aShortArray2298 = new short[i_210_];
			((Class179) this).aShortArray2287 = new short[i_210_];
			((Class179) this).anIntArray2293 = new int[i_210_];
			((Class179) this).aByteArray2323 = new byte[i_210_];
			((Class179) this).anIntArray2269 = new int[i];
			((Class179) this).aShortArray2297 = new short[i_210_];
			((Class179) this).aShortArray2282 = new short[i_210_];
			((Class179) this).aShortArray2306 = new short[i_210_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.<init>(" + i + ','
					+ i_210_ + ',' + i_211_ + ')'));
		}
	}

	Class179(Class179[] class179s, int i) {
		((Class179) this).anInt2277 = 12;
		((Class179) this).anInt2300 = 0;
		((Class179) this).anInt2318 = 0;
		((Class179) this).anInt2311 = 0;
		((Class179) this).aByte2321 = (byte) 0;
		try {
			((Class179) this).anInt2300 = 0;
			((Class179) this).anInt2278 = 0;
			((Class179) this).anInt2318 = 0;
			int i_212_ = 0;
			int i_213_ = 0;
			int i_214_ = 0;
			boolean bool = false;
			boolean bool_215_ = false;
			boolean bool_216_ = false;
			boolean bool_217_ = false;
			boolean bool_218_ = false;
			((Class179) this).aByte2321 = (byte) -1;
			boolean bool_219_ = false;
			for (int i_220_ = 0; i > i_220_; i_220_++) {
				Class179 class179_221_ = class179s[i_220_];
				if (class179_221_ != null) {
					((Class179) this).anInt2278 += ((Class179) class179_221_).anInt2278;
					((Class179) this).anInt2318 += ((Class179) class179_221_).anInt2318;
					((Class179) this).anInt2300 += ((Class179) class179_221_).anInt2300;
					bool = bool
							| (((Class179) class179_221_).aByteArray2289 != null);
					if (((Class179) class179_221_).aClass210Array2292 != null)
						i_214_ += (((Class179) class179_221_).aClass210Array2292).length;
					if (((Class179) class179_221_).aClass261Array2270 != null)
						i_213_ += (((Class179) class179_221_).aClass261Array2270).length;
					if (((Class179) class179_221_).aClass110Array2299 != null)
						i_212_ += (((Class179) class179_221_).aClass110Array2299).length;
					bool_218_ = bool_218_
							| (((Class179) class179_221_).aShortArray2306) != null;
					bool_219_ = bool_219_
							| (((Class179) class179_221_).anIntArray2293) != null;
					bool_217_ = bool_217_
							| (((Class179) class179_221_).aByteArray2323) != null;
					if (((Class179) class179_221_).aByteArray2305 != null)
						bool_215_ = true;
					else {
						if (((Class179) this).aByte2321 == -1)
							((Class179) this).aByte2321 = ((Class179) class179_221_).aByte2321;
						if ((((Class179) class179_221_).aByte2321 ^ 0xffffffff) != (((Class179) this).aByte2321 ^ 0xffffffff))
							bool_215_ = true;
					}
					bool_216_ = bool_216_
							| (((Class179) class179_221_).aByteArray2294) != null;
				}
			}
			((Class179) this).anIntArray2288 = new int[((Class179) this).anInt2278];
			if (bool)
				((Class179) this).aByteArray2289 = new byte[((Class179) this).anInt2318];
			if (i_212_ > 0)
				((Class179) this).aClass110Array2299 = new Class110[i_212_];
			if (bool_217_)
				((Class179) this).aByteArray2323 = new byte[((Class179) this).anInt2318];
			if (bool_215_)
				((Class179) this).aByteArray2305 = new byte[((Class179) this).anInt2318];
			((Class179) this).anIntArray2322 = new int[((Class179) this).anInt2278];
			((Class179) this).aShortArray2298 = new short[((Class179) this).anInt2318];
			if (bool_219_)
				((Class179) this).anIntArray2293 = new int[((Class179) this).anInt2318];
			((Class179) this).anIntArray2269 = new int[((Class179) this).anInt2278];
			if ((((Class179) this).anInt2300 ^ 0xffffffff) < -1) {
				((Class179) this).aShortArray2273 = new short[((Class179) this).anInt2300];
				((Class179) this).aShortArray2303 = new short[((Class179) this).anInt2300];
				((Class179) this).anIntArray2315 = new int[((Class179) this).anInt2300];
				((Class179) this).aByteArray2271 = new byte[((Class179) this).anInt2300];
				((Class179) this).aByteArray2290 = new byte[((Class179) this).anInt2300];
				((Class179) this).anIntArray2301 = new int[((Class179) this).anInt2300];
				((Class179) this).aByteArray2284 = new byte[((Class179) this).anInt2300];
				((Class179) this).anIntArray2312 = new int[((Class179) this).anInt2300];
				((Class179) this).aShortArray2275 = new short[((Class179) this).anInt2300];
				((Class179) this).anIntArray2296 = new int[((Class179) this).anInt2300];
				((Class179) this).anIntArray2313 = new int[((Class179) this).anInt2300];
				((Class179) this).anIntArray2280 = new int[((Class179) this).anInt2300];
			}
			((Class179) this).anIntArray2317 = new int[((Class179) this).anInt2278];
			((Class179) this).aShortArray2287 = new short[((Class179) this).anInt2318];
			((Class179) this).aShortArray2282 = new short[((Class179) this).anInt2318];
			((Class179) this).aShortArray2276 = new short[((Class179) this).anInt2318];
			if ((i_214_ ^ 0xffffffff) < -1)
				((Class179) this).aClass210Array2292 = new Class210[i_214_];
			if (bool_218_)
				((Class179) this).aShortArray2306 = new short[((Class179) this).anInt2318];
			if ((i_213_ ^ 0xffffffff) < -1)
				((Class179) this).aClass261Array2270 = new Class261[i_213_];
			((Class179) this).aShortArray2297 = new short[((Class179) this).anInt2318];
			((Class179) this).aShortArray2272 = new short[((Class179) this).anInt2278];
			if (bool_216_)
				((Class179) this).aByteArray2294 = new byte[((Class179) this).anInt2318];
			i_212_ = 0;
			((Class179) this).anInt2278 = 0;
			((Class179) this).anInt2300 = 0;
			i_214_ = 0;
			i_213_ = 0;
			((Class179) this).anInt2318 = 0;
			for (int i_222_ = 0; (i ^ 0xffffffff) < (i_222_ ^ 0xffffffff); i_222_++) {
				short i_223_ = (short) (1 << i_222_);
				Class179 class179_224_ = class179s[i_222_];
				if (class179_224_ != null) {
					if (((Class179) class179_224_).aClass210Array2292 != null) {
						for (int i_225_ = 0; ((((Class179) class179_224_).aClass210Array2292).length > i_225_); i_225_++) {
							Class210 class210 = (((Class179) class179_224_).aClass210Array2292[i_225_]);
							((Class179) this).aClass210Array2292[i_214_++] = class210
									.method1345(
											((((Class179) this).anInt2318) + (((Class210) class210).anInt2847)),
											(byte) 84);
						}
					}
					for (int i_226_ = 0; ((i_226_ ^ 0xffffffff) > (((Class179) class179_224_).anInt2318 ^ 0xffffffff)); i_226_++) {
						if (bool
								&& (((Class179) class179_224_).aByteArray2289 != null))
							((Class179) this).aByteArray2289[(((Class179) this).anInt2318)] = (((Class179) class179_224_).aByteArray2289[i_226_]);
						if (bool_215_) {
							if (((Class179) class179_224_).aByteArray2305 != null)
								((Class179) this).aByteArray2305[((Class179) this).anInt2318] = (((Class179) class179_224_).aByteArray2305[i_226_]);
							else
								((Class179) this).aByteArray2305[((Class179) this).anInt2318] = ((Class179) class179_224_).aByte2321;
						}
						if (bool_216_
								&& (((Class179) class179_224_).aByteArray2294 != null))
							((Class179) this).aByteArray2294[(((Class179) this).anInt2318)] = (((Class179) class179_224_).aByteArray2294[i_226_]);
						if (bool_218_) {
							if (((Class179) class179_224_).aShortArray2306 != null)
								((Class179) this).aShortArray2306[((Class179) this).anInt2318] = (((Class179) class179_224_).aShortArray2306[i_226_]);
							else
								((Class179) this).aShortArray2306[((Class179) this).anInt2318] = (short) -1;
						}
						if (bool_219_) {
							if (((Class179) class179_224_).anIntArray2293 != null)
								((Class179) this).anIntArray2293[((Class179) this).anInt2318] = (((Class179) class179_224_).anIntArray2293[i_226_]);
							else
								((Class179) this).anIntArray2293[((Class179) this).anInt2318] = -1;
						}
						((Class179) this).aShortArray2297[(((Class179) this).anInt2318)] = (short) method1177(
								i_223_,
								class179_224_,
								108,
								(((Class179) class179_224_).aShortArray2297[i_226_]));
						((Class179) this).aShortArray2287[(((Class179) this).anInt2318)] = (short) method1177(
								i_223_,
								class179_224_,
								64,
								(((Class179) class179_224_).aShortArray2287[i_226_]));
						((Class179) this).aShortArray2282[(((Class179) this).anInt2318)] = (short) method1177(
								i_223_,
								class179_224_,
								76,
								(((Class179) class179_224_).aShortArray2282[i_226_]));
						((Class179) this).aShortArray2276[(((Class179) this).anInt2318)] = i_223_;
						((Class179) this).aShortArray2298[(((Class179) this).anInt2318)] = (((Class179) class179_224_).aShortArray2298[i_226_]);
						((Class179) this).anInt2318++;
					}
					if (((Class179) class179_224_).aClass110Array2299 != null) {
						for (int i_227_ = 0; (((((Class179) class179_224_).aClass110Array2299).length ^ 0xffffffff) < (i_227_ ^ 0xffffffff)); i_227_++) {
							int i_228_ = method1177(
									i_223_,
									class179_224_,
									116,
									(((Class110) (((Class179) class179_224_).aClass110Array2299[i_227_])).anInt1506));
							int i_229_ = method1177(
									i_223_,
									class179_224_,
									35,
									(((Class110) (((Class179) class179_224_).aClass110Array2299[i_227_])).anInt1510));
							int i_230_ = method1177(
									i_223_,
									class179_224_,
									94,
									(((Class110) (((Class179) class179_224_).aClass110Array2299[i_227_])).anInt1497));
							((Class179) this).aClass110Array2299[i_212_] = ((Class179) class179_224_).aClass110Array2299[i_227_]
									.method738(i_228_, 2, i_229_, i_230_);
							i_212_++;
						}
					}
					if (((Class179) class179_224_).aClass261Array2270 != null) {
						for (int i_231_ = 0; i_231_ < (((Class179) class179_224_).aClass261Array2270).length; i_231_++) {
							int i_232_ = method1177(
									i_223_,
									class179_224_,
									92,
									(((Class261) (((Class179) class179_224_).aClass261Array2270[i_231_])).anInt3577));
							((Class179) this).aClass261Array2270[i_213_] = ((Class179) class179_224_).aClass261Array2270[i_231_]
									.method1664(i_232_, 18938);
							i_213_++;
						}
					}
				}
			}
			((Class179) this).anInt2311 = ((Class179) this).anInt2278;
			int i_233_ = 0;
			for (int i_234_ = 0; i_234_ < i; i_234_++) {
				short i_235_ = (short) (1 << i_234_);
				Class179 class179_236_ = class179s[i_234_];
				if (class179_236_ != null) {
					for (int i_237_ = 0; ((((Class179) class179_236_).anInt2318 ^ 0xffffffff) < (i_237_ ^ 0xffffffff)); i_237_++) {
						if (bool_217_)
							((Class179) this).aByteArray2323[i_233_++] = (byte) (((((Class179) class179_236_).aByteArray2323) == null || (((Class179) class179_236_).aByteArray2323[i_237_]) == -1) ? -1
									: ((((Class179) class179_236_).aByteArray2323[i_237_]) + ((Class179) this).anInt2300));
					}
					for (int i_238_ = 0; ((i_238_ ^ 0xffffffff) > (((Class179) class179_236_).anInt2300 ^ 0xffffffff)); i_238_++) {
						byte i_239_ = (((Class179) this).aByteArray2290[((Class179) this).anInt2300] = (((Class179) class179_236_).aByteArray2290[i_238_]));
						if (i_239_ == 0) {
							((Class179) this).aShortArray2275[((Class179) this).anInt2300] = (short) method1177(
									i_235_,
									class179_236_,
									50,
									(((Class179) class179_236_).aShortArray2275[i_238_]));
							((Class179) this).aShortArray2273[((Class179) this).anInt2300] = (short) method1177(
									i_235_,
									class179_236_,
									85,
									(((Class179) class179_236_).aShortArray2273[i_238_]));
							((Class179) this).aShortArray2303[((Class179) this).anInt2300] = (short) method1177(
									i_235_,
									class179_236_,
									37,
									(((Class179) class179_236_).aShortArray2303[i_238_]));
						}
						if (i_239_ >= 1 && i_239_ <= 3) {
							((Class179) this).aShortArray2275[((Class179) this).anInt2300] = (((Class179) class179_236_).aShortArray2275[i_238_]);
							((Class179) this).aShortArray2273[((Class179) this).anInt2300] = (((Class179) class179_236_).aShortArray2273[i_238_]);
							((Class179) this).aShortArray2303[((Class179) this).anInt2300] = (((Class179) class179_236_).aShortArray2303[i_238_]);
							((Class179) this).anIntArray2280[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2280[i_238_]);
							((Class179) this).anIntArray2301[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2301[i_238_]);
							((Class179) this).anIntArray2315[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2315[i_238_]);
							((Class179) this).aByteArray2271[(((Class179) this).anInt2300)] = (((Class179) class179_236_).aByteArray2271[i_238_]);
							((Class179) this).aByteArray2284[(((Class179) this).anInt2300)] = (((Class179) class179_236_).aByteArray2284[i_238_]);
							((Class179) this).anIntArray2312[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2312[i_238_]);
						}
						if ((i_239_ ^ 0xffffffff) == -3) {
							((Class179) this).anIntArray2296[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2296[i_238_]);
							((Class179) this).anIntArray2313[(((Class179) this).anInt2300)] = (((Class179) class179_236_).anIntArray2313[i_238_]);
						}
						((Class179) this).anInt2300++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ie.<init>("
					+ (class179s != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
