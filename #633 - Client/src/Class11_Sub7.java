/* Class11_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.OpenGL;

final class Class11_Sub7 extends Class11 {
	static int anInt5248;
	static int anInt5249;
	int anInt5250;
	static int anInt5251;
	private jaclib.memory.Stream aStream5252;
	private Class75_Sub1 aClass75_Sub1_5253;
	static boolean aBool5254;
	int anInt5255;
	private Class163_Sub3 aClass163_Sub3_5256;
	static int anInt5257;
	static int anInt5258;
	static long aLong5259;
	static int[] anIntArray5260 = new int[32];
	static int anInt5261;
	static int anInt5262;
	static int anInt5263;
	private Class12_Sub3 aClass12_Sub3_5264;
	private int[] anIntArray5265;
	int anInt5266;
	float aFloat5267;
	private NativeHeapBuffer aNativeHeapBuffer5268;
	static int[] anIntArray5269;
	static int anInt5270;
	int anInt5271;
	private Class350 aClass350_5272;

	static final int method2321(int i, boolean bool) {
		try {
			if (bool != true)
				method2325(-115);
			anInt5270++;
			return i >>> 10;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.F(" + i + ','
					+ bool + ')');
		}
	}

	final void method2322(int i, byte i_0_) {
		try {
			aStream5252.method351(3 + i * 4);
			if (i_0_ != 46)
				aStream5252 = null;
			anInt5249++;
			aStream5252.method355(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.C(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method2323(int i, float f, int i_1_, int i_2_, int i_3_) {
		try {
			anInt5262++;
			if (((Class11_Sub7) this).anInt5271 != -1) {
				Class188 class188 = (((Class163) aClass163_Sub3_5256).anInterface1_2118
						.method7((byte) 127, ((Class11_Sub7) this).anInt5271));
				int i_4_ = ((Class188) class188).aByte2414 & 0xff;
				if (i_4_ != 0 && ((Class188) class188).aByte2426 != 4) {
					int i_5_;
					if ((i_1_ ^ 0xffffffff) <= -1) {
						if (i_1_ <= 127)
							i_5_ = 131586 * i_1_;
						else
							i_5_ = 16777215;
					} else
						i_5_ = 0;
					if (i_4_ != 256) {
						int i_6_ = i_4_;
						int i_7_ = 256 - i_4_;
						i_2_ = ((0xff0000 & i_6_ * (0xff00 & i_5_)
								- -((i_2_ & 0xff00) * i_7_)) + (((i_5_ & 0xff00ff)
								* i_6_ - -(i_7_ * (i_2_ & 0xff00ff))) & ~0xff00ff)) >> 8;
					} else
						i_2_ = i_5_;
				}
				int i_8_ = ((Class188) class188).aByte2418 & 0xff;
				if ((i_8_ ^ 0xffffffff) != -1) {
					i_8_ += 256;
					int i_9_ = i_8_ * ((0xff0000 & i_2_) >> 16);
					if ((i_9_ ^ 0xffffffff) < -65536)
						i_9_ = 65535;
					int i_10_ = (i_2_ >> 8 & 0xff) * i_8_;
					if ((i_10_ ^ 0xffffffff) < -65536)
						i_10_ = 65535;
					int i_11_ = (i_2_ & 0xff) * i_8_;
					if ((i_11_ ^ 0xffffffff) < -65536)
						i_11_ = 65535;
					i_2_ = (i_11_ >> 8)
							+ ((i_10_ & 0xff00) + (i_9_ << 8 & 0xff0076));
				}
			}
			if (f != 1.0F) {
				int i_12_ = (i_2_ & 0xffa9c3) >> 16;
				int i_13_ = (0xff1c & i_2_) >> 8;
				int i_14_ = i_2_ & 0xff;
				i_12_ *= f;
				i_13_ *= f;
				if ((i_12_ ^ 0xffffffff) <= -1) {
					if (i_12_ > 255)
						i_12_ = 255;
				} else
					i_12_ = 0;
				i_14_ *= f;
				if (i_13_ >= 0) {
					if ((i_13_ ^ 0xffffffff) < -256)
						i_13_ = 255;
				} else
					i_13_ = 0;
				if ((i_14_ ^ 0xffffffff) > -1)
					i_14_ = 0;
				else if ((i_14_ ^ 0xffffffff) < -256)
					i_14_ = 255;
				i_2_ = i_12_ << 16 | i_13_ << 8 | i_14_;
			}
			aStream5252.method351(4 * i_3_);
			aStream5252.method355((byte) (i_2_ >> 16));
			if (i != 255)
				aBool5254 = true;
			aStream5252.method355((byte) (i_2_ >> 8));
			aStream5252.method355((byte) i_2_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aha.E(" + i + ',' + f
					+ ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	final void method2324(int i, byte i_15_, int[] is) {
		do {
			try {
				anInt5258++;
				int i_16_ = 0;
				Class11_Sub20_Sub2 class11_sub20_sub2 = (((Class163_Sub3) aClass163_Sub3_5256).aClass11_Sub20_Sub2_8406);
				((Stream) class11_sub20_sub2).position = 0;
				int i_17_ = -109 % ((-12 - i_15_) / 60);
				if (((Class163_Sub3) aClass163_Sub3_5256).aBool8348) {
					for (int i_18_ = 0; i > i_18_; i_18_++) {
						int i_19_ = is[i_18_];
						short[] is_20_ = (((Class12_Sub3) aClass12_Sub3_5264).aShortArrayArray6458[i_19_]);
						int i_21_ = anIntArray5265[i_19_];
						if (i_21_ != 0 && is_20_ != null) {
							int i_22_ = 0;
							int i_23_ = 0;
							while (is_20_.length > i_23_) {
								if ((i_21_ & 1 << i_22_++) != 0) {
									i_16_++;
									class11_sub20_sub2.writeShort(-117,
											0xffff & is_20_[i_23_++]);
									i_16_++;
									class11_sub20_sub2.writeShort(-123,
											((is_20_[i_23_++]) & 0xffff));
									i_16_++;
									class11_sub20_sub2.writeShort(-113,
											((is_20_[i_23_++]) & 0xffff));
								} else
									i_23_ += 3;
							}
						}
					}
				} else {
					for (int i_24_ = 0; (i ^ 0xffffffff) < (i_24_ ^ 0xffffffff); i_24_++) {
						int i_25_ = is[i_24_];
						short[] is_26_ = (((Class12_Sub3) aClass12_Sub3_5264).aShortArrayArray6458[i_25_]);
						int i_27_ = anIntArray5265[i_25_];
						if (i_27_ != 0 && is_26_ != null) {
							int i_28_ = 0;
							int i_29_ = 0;
							while (i_29_ < is_26_.length) {
								if ((1 << i_28_++ & i_27_ ^ 0xffffffff) != -1) {
									class11_sub20_sub2.method2539(
											0xffff & is_26_[i_29_++],
											-1682769048);
									i_16_++;
									i_16_++;
									class11_sub20_sub2.method2539(
											((is_26_[i_29_++]) & 0xffff),
											-1682769048);
									class11_sub20_sub2.method2539(
											0xffff & is_26_[i_29_++],
											-1682769048);
									i_16_++;
								} else
									i_29_ += 3;
							}
						}
					}
				}
				if ((i_16_ ^ 0xffffffff) >= -1)
					break;
				aClass75_Sub1_5253.method49(5123,
						((Stream) class11_sub20_sub2).position,
						((Stream) class11_sub20_sub2).buffer, -83);
				aClass163_Sub3_5256.method3304(
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6485,
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6482,
						aClass350_5272, (byte) 117,
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6484);
				aClass163_Sub3_5256
						.method3310(
								((Class11_Sub7) this).anInt5271,
								(0x8 & ((Class12_Sub3) aClass12_Sub3_5264).anInt6452 ^ 0xffffffff) != -1,
								((((Class12_Sub3) aClass12_Sub3_5264).anInt6452 & 0x7) != 0),
								(byte) -91);
				if (((Class163_Sub3) aClass163_Sub3_5256).aBool8413)
					aClass163_Sub3_5256.EA(2147483647,
							((Class11_Sub7) this).anInt5266,
							((Class11_Sub7) this).anInt5250,
							((Class11_Sub7) this).anInt5255);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPushMatrix();
				OpenGL.glScalef(1.0F / ((Class11_Sub7) this).aFloat5267,
						1.0F / ((Class11_Sub7) this).aFloat5267, 1.0F);
				OpenGL.glMatrixMode(5888);
				aClass163_Sub3_5256.method3304(
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6485,
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6482,
						aClass350_5272, (byte) 94,
						((Class12_Sub3) aClass12_Sub3_5264).aClass350_6484);
				aClass163_Sub3_5256.method3288(109, 0, 4, i_16_,
						aClass75_Sub1_5253);
				OpenGL.glMatrixMode(5890);
				OpenGL.glPopMatrix();
				OpenGL.glMatrixMode(5888);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("aha.B(" + i + ','
						+ i_15_ + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	static final void method2325(int i) {
		try {
			anInt5257++;
			for (Class376_Sub3 class376_sub3 = ((Class376_Sub3) Class333.aClass131_4412
					.method849((byte) -37)); class376_sub3 != null; class376_sub3 = (Class376_Sub3) Class333.aClass131_4412
					.method849((byte) -37))
				Class20.method176((byte) -98, class376_sub3);
			if (i >= -121)
				method2325(97);
			int i_30_;
			int i_31_;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
					.method3158(false) != 1)
				i_31_ = i_30_ = Class51.anInt800;
			else {
				i_30_ = 3;
				i_31_ = 0;
			}
			client.method4026();
			for (int i_32_ = i_31_; (i_32_ ^ 0xffffffff) >= (i_30_ ^ 0xffffffff); i_32_++) {
				client.method4011();
				client.method4016(i_32_);
				client.method4012(i_32_);
			}
			client.method4022();
			client.method4025();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.H(" + i + ')');
		}
	}

	public static void method2326(byte i) {
		try {
			if (i < 29)
				method2326((byte) 16);
			anIntArray5260 = null;
			anIntArray5269 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.A(" + i + ')');
		}
	}

	final void method2327(byte i, int i_33_) {
		try {
			aStream5252.method347();
			anInt5263++;
			Interface9 interface9 = aClass163_Sub3_5256.method3289(4,
					aNativeHeapBuffer5268, 5890, false, i_33_ * 4);
			aClass350_5272 = new Class350(interface9, 5121, 4, 0);
			int i_34_ = 112 / ((28 - i) / 36);
			aNativeHeapBuffer5268 = null;
			aStream5252 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.I(" + i + ','
					+ i_33_ + ')');
		}
	}

	final void method2328(int i, int i_35_, int i_36_, byte i_37_) {
		try {
			anIntArray5265[(((Class12) aClass12_Sub3_5264).anInt103 * i_35_ - -i)] = Class173
					.method1134(
							(anIntArray5265[(((Class12) aClass12_Sub3_5264).anInt103)
									* i_35_ - -i]), 1 << i_36_);
			anInt5261++;
			int i_38_ = -9 % ((i_37_ + 60) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aha.D(" + i + ','
					+ i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	final void method2329(int i, int i_39_) {
		try {
			if (i <= -58) {
				aNativeHeapBuffer5268 = ((Class163_Sub3) aClass163_Sub3_5256).aNativeHeap8271
						.method531(4 * i_39_, true);
				anInt5248++;
				aStream5252 = new jaclib.memory.Stream(aNativeHeapBuffer5268);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aha.G(" + i + ','
					+ i_39_ + ')');
		}
	}

	Class11_Sub7(Class12_Sub3 class12_sub3, int i, int i_40_, int i_41_,
			int i_42_, int i_43_) {
		try {
			aClass12_Sub3_5264 = class12_sub3;
			((Class11_Sub7) this).anInt5266 = i_41_;
			((Class11_Sub7) this).anInt5250 = i_42_;
			anIntArray5265 = new int[(((Class12) aClass12_Sub3_5264).anInt98 * ((Class12) aClass12_Sub3_5264).anInt103)];
			((Class11_Sub7) this).anInt5255 = i_43_;
			((Class11_Sub7) this).aFloat5267 = (float) i_40_;
			((Class11_Sub7) this).anInt5271 = i;
			aClass163_Sub3_5256 = ((Class12_Sub3) aClass12_Sub3_5264).aClass163_Sub3_6476;
			aClass75_Sub1_5253 = new Class75_Sub1(aClass163_Sub3_5256, 5123,
					null, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aha.<init>("
					+ (class12_sub3 != null ? "{...}" : "null") + ',' + i + ','
					+ i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
		}
	}

	static {
		anInt5251 = 1403;
		aBool5254 = false;
		anIntArray5269 = new int[] { 0, -1, 0, 1 };
	}
}
