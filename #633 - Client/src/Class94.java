/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class94 implements Interface15 {
	private int anInt1251;
	private Class34 aClass34_1252 = Class301.aClass34_4059;
	static int anInt1253;
	static int anInt1254;
	private boolean aBool1255;
	static int anInt1256;
	static int anInt1257;
	static int anInt1258;
	Class163_Sub2_Sub1 aClass163_Sub2_Sub1_1259;
	static int anInt1260;
	int anInt1261;
	static int anInt1262;
	Class366 aClass366_1263;
	static int anInt1264;
	static int anInt1265;
	private int anInt1266;
	static int anInt1267;
	static int anInt1268;
	Class98 aClass98_1269;
	static int anInt1270;
	static int anInt1271;

	public final void method46(Class34 class34, int i) {
		do {
			try {
				if (class34 != aClass34_1252) {
					aClass34_1252 = class34;
					method638((byte) 46);
				}
				anInt1258++;
				if (i == -21969)
					break;
				anInt1266 = -104;
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, ("bt.A("
								+ (class34 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}

	private final void method630(int i, int i_0_) {
		do {
			try {
				((Class163_Sub2) ((Class94) this).aClass163_Sub2_Sub1_1259).anInt7524 -= i;
				anInt1256++;
				((Class163_Sub2) ((Class94) this).aClass163_Sub2_Sub1_1259).anInt7524 += method632((byte) -114);
				if (i_0_ == -6203)
					break;
				((Class94) this).aClass163_Sub2_Sub1_1259 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bt.T(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	static final void method631(int i, Class163 class163) {
		try {
			InputStream_Sub2.aClass143Array6948 = new Class143[Class244.anIntArray3314.length];
			anInt1265++;
			if (i != 255)
				method635(44, -100);
			for (int i_1_ = 0; ((Class244.anIntArray3314.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff)); i_1_++) {
				int i_2_ = Class244.anIntArray3314[i_1_];
				Class292 class292 = Class194.method1270(
						Class286_Sub1.aClass146_7138, i ^ 0xfd, i_2_);
				Class107 class107 = class163.method1060(class292,
						Class80.method544((Class41.aClass146_595), i_2_), true);
				InputStream_Sub2.aClass143Array6948[i_1_] = new Class143(
						class107, class292);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bt.Q(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	public final void method39(int i) {
		do {
			try {
				anInt1267++;
				int i_3_ = ((Class94) this).aClass163_Sub2_Sub1_1259
						.method3083((byte) 123);
				int i_4_ = (((Class163_Sub2_Sub1) ((Class94) this).aClass163_Sub2_Sub1_1259).anIntArray8678[i_3_]);
				if ((i_4_ ^ 0xffffffff) != (((Class94) this).anInt1261 ^ 0xffffffff)) {
					if ((i_4_ ^ 0xffffffff) != -1) {
						OpenGL.glBindTexture(i_4_, 0);
						OpenGL.glDisable(i_4_);
					}
					OpenGL.glEnable(((Class94) this).anInt1261);
					((Class163_Sub2_Sub1) ((Class94) this).aClass163_Sub2_Sub1_1259).anIntArray8678[i_3_] = ((Class94) this).anInt1261;
				}
				OpenGL.glBindTexture(((Class94) this).anInt1261, anInt1266);
				if (i == 20276)
					break;
				((Class94) this).aClass98_1269 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bt.B(" + i + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			anInt1270++;
			method639(-126);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bt.finalize(" + ')');
		}
	}

	private final int method632(byte i) {
		try {
			anInt1268++;
			int i_5_ = (((Class98) ((Class94) this).aClass98_1269).anInt1306
					* ((Class366) ((Class94) this).aClass366_1263).anInt4802 * anInt1251);
			if (i != -114)
				return 76;
			if (!aBool1255)
				return i_5_;
			return 4 * i_5_ / 3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bt.W(" + i + ')');
		}
	}

	final void method633(float[] fs, int i, int i_6_, int i_7_, boolean bool) {
		try {
			anInt1254++;
			if (i_7_ > 0 && !Class261.method1669(i_7_, (byte) 81))
				throw new IllegalArgumentException("");
			if (i > 0 && !Class261.method1669(i, (byte) 112))
				throw new IllegalArgumentException("");
			int i_8_ = ((Class98) ((Class94) this).aClass98_1269).anInt1306;
			int i_9_ = 0;
			if (bool == false) {
				int i_10_ = i_7_ < i ? i_7_ : i;
				int i_11_ = i_7_ >> 1;
				int i_12_ = i >> 1;
				float[] fs_13_ = fs;
				float[] fs_14_ = new float[i_8_ * i_11_ * i_12_];
				for (;;) {
					OpenGL.glTexImage2Df(i_6_, i_9_, method637(-125), i_7_, i,
							0, Class11_Sub45_Sub17.method3749((byte) -88,
									(((Class94) this).aClass98_1269)), 5126,
							fs_13_, 0);
					if (i_10_ <= 1)
						break;
					int i_15_ = i_7_ * i_8_;
					float[] fs_16_ = fs_14_;
					for (int i_17_ = 0; (i_8_ ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
						int i_18_ = i_17_;
						int i_19_ = i_17_;
						int i_20_ = i_19_ - -i_15_;
						for (int i_21_ = 0; (i_21_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_21_++) {
							for (int i_22_ = 0; (i_22_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_22_++) {
								float f = fs_13_[i_19_];
								i_19_ += i_8_;
								f += fs_13_[i_19_];
								f += fs_13_[i_20_];
								i_19_ += i_8_;
								i_20_ += i_8_;
								f += fs_13_[i_20_];
								i_20_ += i_8_;
								fs_14_[i_18_] = f * 0.25F;
								i_18_ += i_8_;
							}
							i_20_ += i_15_;
							i_19_ += i_15_;
						}
					}
					fs_14_ = fs_13_;
					i_7_ = i_11_;
					i = i_12_;
					fs_13_ = fs_16_;
					i_10_ >>= 1;
					i_11_ >>= 1;
					i_12_ >>= 1;
					i_9_++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bt.N("
					+ (fs != null ? "{...}" : "null") + ',' + i + ',' + i_6_
					+ ',' + i_7_ + ',' + bool + ')'));
		}
	}

	final void method634(int i, int i_23_, byte[] is, int i_24_, int i_25_) {
		try {
			anInt1271++;
			if ((i_24_ ^ 0xffffffff) < -1
					&& !Class261.method1669(i_24_, (byte) 120))
				throw new IllegalArgumentException("");
			if (i_25_ > 0 && !Class261.method1669(i_25_, (byte) 99))
				throw new IllegalArgumentException("");
			int i_26_ = ((Class98) ((Class94) this).aClass98_1269).anInt1306;
			int i_27_ = 0;
			int i_28_ = -32 / ((5 - i) / 60);
			int i_29_ = i_24_ >= i_25_ ? i_25_ : i_24_;
			int i_30_ = i_24_ >> 1;
			int i_31_ = i_25_ >> 1;
			byte[] is_32_ = is;
			byte[] is_33_ = new byte[i_26_ * i_30_ * i_31_];
			for (;;) {
				OpenGL.glTexImage2Dub(i_23_, i_27_, method637(-51), i_24_,
						i_25_, 0, Class11_Sub45_Sub17.method3749((byte) -114,
								(((Class94) this).aClass98_1269)), 5121,
						is_32_, 0);
				if ((i_29_ ^ 0xffffffff) >= -2)
					break;
				int i_34_ = i_26_ * i_24_;
				for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
					int i_36_ = i_35_;
					int i_37_ = i_35_;
					int i_38_ = i_34_ + i_37_;
					for (int i_39_ = 0; (i_31_ ^ 0xffffffff) < (i_39_ ^ 0xffffffff); i_39_++) {
						for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_40_++) {
							int i_41_ = is_32_[i_37_];
							i_37_ += i_26_;
							i_41_ += is_32_[i_37_];
							i_41_ += is_32_[i_38_];
							i_37_ += i_26_;
							i_38_ += i_26_;
							i_41_ += is_32_[i_38_];
							is_33_[i_36_] = (byte) (i_41_ >> 2);
							i_38_ += i_26_;
							i_36_ += i_26_;
						}
						i_37_ += i_34_;
						i_38_ += i_34_;
					}
				}
				byte[] is_42_ = is_33_;
				is_33_ = is_32_;
				i_24_ = i_30_;
				is_32_ = is_42_;
				i_25_ = i_31_;
				i_31_ >>= 1;
				i_29_ >>= 1;
				i_30_ >>= 1;
				i_27_++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bt.U(" + i + ','
					+ i_23_ + ',' + (is != null ? "{...}" : "null") + ','
					+ i_24_ + ',' + i_25_ + ')'));
		}
	}

	static final int method635(int i, int i_43_) {
		try {
			anInt1257++;
			int i_44_ = i_43_ >>> 1;
			i_44_ |= i_44_ >>> 1;
			i_44_ |= i_44_ >>> 2;
			if (i != -1350259935)
				method635(29, 19);
			i_44_ |= i_44_ >>> 4;
			i_44_ |= i_44_ >>> 8;
			i_44_ |= i_44_ >>> 16;
			return i_43_ & (i_44_ ^ 0xffffffff);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bt.S(" + i + ','
					+ i_43_ + ')');
		}
	}

	final void method636(int i, byte i_45_, int i_46_, int i_47_, int[] is) {
		try {
			anInt1264++;
			if ((i_47_ ^ 0xffffffff) < -1
					&& !Class261.method1669(i_47_, (byte) 94))
				throw new IllegalArgumentException("");
			if (i > 0 && !Class261.method1669(i, (byte) 72))
				throw new IllegalArgumentException("");
			if (((Class94) this).aClass98_1269 != Class364.aClass98_4774)
				throw new IllegalArgumentException("");
			int i_48_ = 0;
			int i_49_ = i_47_ >= i ? i : i_47_;
			int i_50_ = i_47_ >> 1;
			int i_51_ = i >> 1;
			int[] is_52_ = is;
			if (i_45_ == -2) {
				int[] is_53_ = new int[i_50_ * i_51_];
				for (;;) {
					OpenGL.glTexImage2Di(
							i_46_,
							i_48_,
							method637(i_45_ ^ 0x51),
							i_47_,
							i,
							0,
							32993,
							(((Class163_Sub2_Sub1) (((Class94) this).aClass163_Sub2_Sub1_1259)).anInt8677),
							is_52_, 0);
					if (i_49_ <= 1)
						break;
					int i_54_ = 0;
					int i_55_ = 0;
					int i_56_ = i_47_ + i_55_;
					for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > (i_51_ ^ 0xffffffff); i_57_++) {
						for (int i_58_ = 0; i_50_ > i_58_; i_58_++) {
							int i_59_ = is_52_[i_55_++];
							int i_60_ = is_52_[i_55_++];
							int i_61_ = is_52_[i_56_++];
							int i_62_ = i_59_ >> 24 & 0xff;
							int i_63_ = (i_59_ & 0xff7e) >> 8;
							int i_64_ = i_59_ & 0xff;
							int i_65_ = is_52_[i_56_++];
							int i_66_ = 0xff & i_59_ >> 16;
							i_62_ += 0xff & i_60_ >> 24;
							i_64_ += i_60_ & 0xff;
							i_66_ += 0xff & i_60_ >> 16;
							i_63_ += 0xff & i_60_ >> 8;
							i_62_ += 0xff & i_61_ >> 24;
							i_63_ += (0xffbf & i_61_) >> 8;
							i_64_ += 0xff & i_61_;
							i_66_ += (0xfff6b0 & i_61_) >> 16;
							i_66_ += (i_65_ & 0xff8f50) >> 16;
							i_63_ += (0xffd9 & i_65_) >> 8;
							i_64_ += 0xff & i_65_;
							i_62_ += i_65_ >> 24 & 0xff;
							is_53_[i_54_++] = (Class173
									.method1134(
											Class77.method529(i_64_ >> 2, 255),
											(Class173.method1134(
													(Class173
															.method1134(
																	Class77.method529(
																			i_62_ << 22,
																			-16777216),
																	Class77.method529(
																			1020,
																			i_66_) << 14)),
													Class77.method529(i_63_,
															1020) << 6))));
						}
						i_56_ += i_47_;
						i_55_ += i_47_;
					}
					int[] is_67_ = is_53_;
					is_53_ = is_52_;
					i_47_ = i_50_;
					i = i_51_;
					is_52_ = is_67_;
					i_50_ >>= 1;
					i_49_ >>= 1;
					i_48_++;
					i_51_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bt.P(" + i + ','
					+ i_45_ + ',' + i_46_ + ',' + i_47_ + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	final int method637(int i) {
		try {
			anInt1253++;
			if (i >= -12)
				method631(7, null);
			if (((Class94) this).aClass366_1263 != Class366.aClass366_4808) {
				if (((Class94) this).aClass366_1263 != Class366.aClass366_4811) {
					if (Class366.aClass366_4812 == ((Class94) this).aClass366_1263) {
						if (((Class94) this).aClass98_1269 == Class11_Sub2_Sub23.aClass98_9267)
							return 34837;
						if (((Class94) this).aClass98_1269 == Class364.aClass98_4774)
							return 34836;
						if (((Class94) this).aClass98_1269 == Class128.aClass98_1726)
							return 34838;
						if (((Class94) this).aClass98_1269 == Class329.aClass98_4372)
							return 34840;
						if (Class376_Sub6.aClass98_6952 == ((Class94) this).aClass98_1269)
							return 34841;
						if (Class11_Sub50.aClass98_8021 == ((Class94) this).aClass98_1269)
							return 6145;
					}
				} else if (Class11_Sub2_Sub23.aClass98_9267 != ((Class94) this).aClass98_1269) {
					if (((Class94) this).aClass98_1269 == Class364.aClass98_4774)
						return 34842;
					if (((Class94) this).aClass98_1269 == Class128.aClass98_1726)
						return 34844;
					if (((Class94) this).aClass98_1269 != Class329.aClass98_4372) {
						if (((Class94) this).aClass98_1269 != Class376_Sub6.aClass98_6952) {
							if (((Class94) this).aClass98_1269 == Class11_Sub50.aClass98_8021)
								return 6145;
						} else
							return 34847;
					} else
						return 34846;
				} else
					return 34843;
			} else {
				if (Class11_Sub2_Sub23.aClass98_9267 == ((Class94) this).aClass98_1269)
					return 6407;
				if (Class364.aClass98_4774 != ((Class94) this).aClass98_1269) {
					if (Class128.aClass98_1726 == ((Class94) this).aClass98_1269)
						return 6406;
					if (Class329.aClass98_4372 != ((Class94) this).aClass98_1269) {
						if (((Class94) this).aClass98_1269 != Class376_Sub6.aClass98_6952) {
							if (Class11_Sub50.aClass98_8021 == ((Class94) this).aClass98_1269)
								return 6145;
						} else
							return 6410;
					} else
						return 6409;
				} else
					return 6408;
			}
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bt.R(" + i + ')');
		}
	}

	Class94(Class163_Sub2_Sub1 class163_sub2_sub1, int i, Class98 class98,
			Class366 class366, int i_68_, boolean bool) {
		try {
			aBool1255 = bool;
			((Class94) this).aClass366_1263 = class366;
			((Class94) this).aClass98_1269 = class98;
			anInt1251 = i_68_;
			((Class94) this).anInt1261 = i;
			((Class94) this).aClass163_Sub2_Sub1_1259 = class163_sub2_sub1;
			OpenGL.glGenTextures(1, Class11_Sub2_Sub15.anIntArray9020, 0);
			anInt1266 = Class11_Sub2_Sub15.anIntArray9020[0];
			method638((byte) 46);
			method630(0, -6203);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("bt.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + (class98 != null ? "{...}" : "null") + ','
					+ (class366 != null ? "{...}" : "null") + ',' + i_68_ + ','
					+ bool + ')'));
		}
	}

	private final void method638(byte i) {
		try {
			anInt1262++;
			((Class94) this).aClass163_Sub2_Sub1_1259.method3094(this, -2);
			if (i == 46) {
				if (Class301.aClass34_4059 == aClass34_1252) {
					OpenGL.glTexParameteri(((Class94) this).anInt1261, 10241,
							!aBool1255 ? 9729 : 9987);
					OpenGL.glTexParameteri(((Class94) this).anInt1261, 10240,
							9729);
				} else {
					OpenGL.glTexParameteri(((Class94) this).anInt1261, 10241,
							!aBool1255 ? 9728 : 9984);
					OpenGL.glTexParameteri(((Class94) this).anInt1261, 10240,
							9728);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "bt.O(" + i + ')');
		}
	}

	private final void method639(int i) {
		do {
			try {
				if (i <= -120) {
					anInt1260++;
					if ((anInt1266 ^ 0xffffffff) >= -1)
						break;
					((Class94) this).aClass163_Sub2_Sub1_1259.method3407(
							(byte) -120, anInt1266, method632((byte) -114));
					anInt1266 = 0;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "bt.V(" + i + ')');
			}
			break;
		} while (false);
	}
}
