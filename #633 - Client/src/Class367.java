/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

final class Class367 {
	static int anInt4816;
	static int anInt4817;
	private int anInt4818;
	boolean aBool4819 = true;
	static Class253[] aClass253Array4820;
	static int anInt4821;
	static int anInt4822 = 0;
	private int anInt4823;
	private Interface19 anInterface19_4824;
	private int anInt4825 = -1;
	private int anInt4826;
	private Class321_Sub3 aClass321_Sub3_4827;
	static int anInt4828;
	private Class163_Sub3 aClass163_Sub3_4829;
	static int anInt4830;
	private Class156 aClass156_4831;
	static int anInt4832;
	private Class75_Sub1 aClass75_Sub1_4833;
	/* synthetic */static Class aClass4834;

	final void method2168(int i) {
		try {
			method2172(anInt4826, (byte) -114, anInterface19_4824);
			if (i == 128)
				anInt4816++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ww.B(" + i + ')');
		}
	}

	private final void method2169(int i) {
		try {
			anInt4832++;
			if (((Class367) this).aBool4819) {
				((Class367) this).aBool4819 = false;
				byte[] is = ((Class156) aClass156_4831).aByteArray2053;
				byte[] is_0_ = ((Class163_Sub3) aClass163_Sub3_4829).aByteArray8421;
				int i_1_ = i;
				int i_2_ = ((Class156) aClass156_4831).anInt2055;
				int i_3_ = (((Class156) aClass156_4831).anInt2055 * anInt4823 + anInt4818);
				for (int i_4_ = -128; (i_4_ ^ 0xffffffff) > -1; i_4_++) {
					i_1_ = -i_1_ + (i_1_ << 8);
					for (int i_5_ = -128; i_5_ < 0; i_5_++) {
						if (is[i_3_++] != 0)
							i_1_++;
					}
					i_3_ += i_2_ - 128;
				}
				if (aClass321_Sub3_4827 != null
						&& (i_1_ ^ 0xffffffff) == (anInt4825 ^ 0xffffffff))
					((Class367) this).aBool4819 = false;
				else {
					anInt4825 = i_1_;
					int i_6_ = 0;
					i_3_ = anInt4818 - -(anInt4823 * i_2_);
					for (int i_7_ = -128; (i_7_ ^ 0xffffffff) > -1; i_7_++) {
						for (int i_8_ = -128; (i_8_ ^ 0xffffffff) > -1; i_8_++) {
							if ((is[i_3_] ^ 0xffffffff) != -1)
								is_0_[i_6_++] = (byte) 68;
							else {
								int i_9_ = 0;
								if ((is[i_3_ - 1] ^ 0xffffffff) != -1)
									i_9_++;
								if (is[1 + i_3_] != 0)
									i_9_++;
								if ((is[i_3_ - i_2_] ^ 0xffffffff) != -1)
									i_9_++;
								if (is[i_3_ - -i_2_] != 0)
									i_9_++;
								is_0_[i_6_++] = (byte) (17 * i_9_);
							}
							i_3_++;
						}
						i_3_ += -128 + ((Class156) aClass156_4831).anInt2055;
					}
					if (aClass321_Sub3_4827 == null) {
						aClass321_Sub3_4827 = new Class321_Sub3(
								aClass163_Sub3_4829,
								3553,
								6406,
								128,
								128,
								false,
								(((Class163_Sub3) aClass163_Sub3_4829).aByteArray8421),
								6406, false);
						aClass321_Sub3_4827.method2855(false, false, 86);
						aClass321_Sub3_4827.method1963(true, false);
					} else
						aClass321_Sub3_4827
								.method2856(
										128,
										false,
										0,
										false,
										6406,
										(((Class163_Sub3) aClass163_Sub3_4829).aByteArray8421),
										0, 128, 0, 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ww.E(" + i + ')');
		}
	}

	final void method2170(int i, byte i_10_, int i_11_, byte[] is) {
		try {
			anInt4817++;
			if (i_10_ > -1)
				method2173(29);
			aClass75_Sub1_4833.method49(i_11_,
					i * aClass163_Sub3_4829.method3255(4318, i_11_), is, -42);
			method2172(i, (byte) -122, aClass75_Sub1_4833);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ww.A(" + i + ','
					+ i_10_ + ',' + i_11_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2171(byte i, File file, boolean bool) {
		try {
			anInt4821++;
			if (Class112.anObject1536 == null)
				Class211.method1353((byte) 124);
			try {
				if (i >= -6)
					aClass253Array4820 = null;
				Class var_class = (Class
						.forName("com.sun.management.HotSpotDiagnosticMXBean"));
				Method method = (var_class
						.getDeclaredMethod(
								"dumpHeap",
								(new Class[] {
										(aClass4834 != null ? aClass4834
												: (aClass4834 = getClassByName("java.lang.String"))),
										Boolean.TYPE })));
				method.invoke(Class112.anObject1536,
						new Object[] { file.getAbsolutePath(),
								new Boolean(bool) });
			} catch (Exception exception) {
				System.out.println("HeapDump error:");
				exception.printStackTrace();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ww.F(" + i + ','
					+ (file != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	private final void method2172(int i, byte i_12_, Interface19 interface19) {
		try {
			anInt4828++;
			if ((i ^ 0xffffffff) != -1 && i_12_ < -111) {
				method2169(0);
				aClass163_Sub3_4829.method3295(aClass321_Sub3_4827, 115);
				aClass163_Sub3_4829.method3288(-85, 0, 4, i, interface19);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ww.C(" + i + ',' + i_12_ + ','
							+ (interface19 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method2173(int i) {
		try {
			if (i != 0)
				method2173(-31);
			aClass253Array4820 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ww.D(" + i + ')');
		}
	}

	Class367(Class163_Sub3 class163_sub3, Class156 class156,
			Class12_Sub3 class12_sub3, int i, int i_13_, int i_14_, int i_15_,
			int i_16_) {
		try {
			aClass156_4831 = class156;
			aClass163_Sub3_4829 = class163_sub3;
			anInt4823 = i_16_;
			anInt4818 = i_15_;
			int i_17_ = 1 << i_14_;
			int i_18_ = 0;
			int i_19_ = i << i_14_;
			int i_20_ = i_13_ << i_14_;
			for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_21_++) {
				int i_22_ = (i_19_ + ((Class12) class12_sub3).anInt103
						* (i_21_ + i_20_));
				for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_23_++) {
					short[] is = (((Class12_Sub3) class12_sub3).aShortArrayArray6458[i_22_++]);
					if (is != null)
						i_18_ += is.length;
				}
			}
			anInt4826 = i_18_;
			if (i_18_ > 0) {
				Stream stream = new Stream(2 * i_18_);
				if (((Class163_Sub3) aClass163_Sub3_4829).aBool8348) {
					for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff); i_24_++) {
						int i_25_ = (((i_24_ + i_20_) * ((Class12) class12_sub3).anInt103) + i_19_);
						for (int i_26_ = 0; (i_17_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff); i_26_++) {
							short[] is = (((Class12_Sub3) class12_sub3).aShortArrayArray6458[i_25_++]);
							if (is != null) {
								for (int i_27_ = 0; ((i_27_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_27_++)
									stream.writeShort(-125, is[i_27_] & 0xffff);
							}
						}
					}
				} else {
					for (int i_28_ = 0; i_28_ < i_17_; i_28_++) {
						int i_29_ = i_19_
								+ ((i_20_ - -i_28_) * ((Class12) class12_sub3).anInt103);
						for (int i_30_ = 0; i_30_ < i_17_; i_30_++) {
							short[] is = (((Class12_Sub3) class12_sub3).aShortArrayArray6458[i_29_++]);
							if (is != null) {
								for (int i_31_ = 0; ((i_31_ ^ 0xffffffff) > (is.length ^ 0xffffffff)); i_31_++)
									stream.method2539(0xffff & is[i_31_],
											-1682769048);
							}
						}
					}
				}
				anInterface19_4824 = aClass163_Sub3_4829.method3245(-16889,
						(((Stream) stream).buffer),
						(((Stream) stream).position), 5123, false);
				aClass75_Sub1_4833 = new Class75_Sub1(aClass163_Sub3_4829,
						5123, null, 1);
			} else
				aClass321_Sub3_4827 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ww.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ','
					+ (class156 != null ? "{...}" : "null") + ','
					+ (class12_sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ')'));
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
