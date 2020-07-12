/* Class11_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

import jaclib.memory.Buffer;
import jaclib.memory.heap.NativeHeapBuffer;

final class Class11_Sub44 extends Class11 {
	private Interface3 anInterface3_7771;
	static int anInt7772;
	static int anInt7773;
	int anInt7774;
	float aFloat7775;
	static int anInt7776;
	static int anInt7777;
	int anInt7778;
	private Class163_Sub2 aClass163_Sub2_7779;
	int anInt7780;
	int anInt7781 = 0;
	private NativeHeapBuffer aNativeHeapBuffer7782;
	private jaclib.memory.Stream aStream7783;
	private Class12_Sub1 aClass12_Sub1_7784;
	static int anInt7785;
	static int anInt7786;
	static int anInt7787;
	static Class298 aClass298_7788 = new Class298("", 15);
	int anInt7789;
	private int[] anIntArray7790;
	static int anInt7791 = -1;
	/* synthetic */static Class aClass7792;

	static final void method3131(int i) {
		try {
			if (i != 16711935)
				method3131(10);
			anInt7772++;
			try {
				Method method = (aClass7792 != null ? aClass7792
						: (aClass7792 = getClassByName("java.lang.Runtime")))
						.getMethod("availableProcessors", new Class[0]);
				if (method != null) {
					try {
						Runtime runtime = Runtime.getRuntime();
						Integer integer = (Integer) method
								.invoke(runtime, null);
						Class11_Sub2_Sub7.anInt8734 = integer.intValue();
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tm.H(" + i + ')');
		}
	}

	final void method3132(float f, int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_2_ <= 7)
				method3131(-11);
			if (((Class11_Sub44) this).anInt7789 != -1) {
				Class188 class188 = (((Class163) aClass163_Sub2_7779).anInterface1_2118
						.method7((byte) 127, ((Class11_Sub44) this).anInt7789));
				int i_3_ = ((Class188) class188).aByte2414 & 0xff;
				if (i_3_ != 0
						&& (((Class188) class188).aByte2426 ^ 0xffffffff) != -5) {
					int i_4_;
					if ((i_1_ ^ 0xffffffff) <= -1) {
						if (i_1_ > 127)
							i_4_ = 16777215;
						else
							i_4_ = i_1_ * 131586;
					} else
						i_4_ = 0;
					if ((i_3_ ^ 0xffffffff) == -257)
						i_0_ = i_4_;
					else {
						int i_5_ = i_3_;
						int i_6_ = -i_3_ + 256;
						i_0_ = (((i_0_ & 0xff00) * i_6_ + i_5_
								* (i_4_ & 0xff00) & 0xff0000) + (((i_4_ & 0xff00ff)
								* i_5_ + (0xff00ff & i_0_) * i_6_) & ~0xff00ff)) >> 8;
					}
				}
				int i_7_ = 0xff & ((Class188) class188).aByte2418;
				if (i_7_ != 0) {
					i_7_ += 256;
					int i_8_ = i_7_ * (0xff & i_0_ >> 16);
					if (i_8_ > 65535)
						i_8_ = 65535;
					int i_9_ = ((i_0_ & 0xff00) >> 8) * i_7_;
					if ((i_9_ ^ 0xffffffff) < -65536)
						i_9_ = 65535;
					int i_10_ = i_7_ * (0xff & i_0_);
					if ((i_10_ ^ 0xffffffff) < -65536)
						i_10_ = 65535;
					i_0_ = (((i_8_ & 0x4700ff00) << 8) + (i_9_ & 0xff00) - -(i_10_ >> 8));
				}
			}
			anInt7777++;
			if (f != 1.0F) {
				int i_11_ = 0xff & i_0_ >> 16;
				int i_12_ = (0xff6d & i_0_) >> 8;
				i_11_ *= f;
				int i_13_ = 0xff & i_0_;
				if ((i_11_ ^ 0xffffffff) <= -1) {
					if ((i_11_ ^ 0xffffffff) < -256)
						i_11_ = 255;
				} else
					i_11_ = 0;
				i_12_ *= f;
				if (i_12_ >= 0) {
					if (i_12_ > 255)
						i_12_ = 255;
				} else
					i_12_ = 0;
				i_13_ *= f;
				if ((i_13_ ^ 0xffffffff) <= -1) {
					if ((i_13_ ^ 0xffffffff) < -256)
						i_13_ = 255;
				} else
					i_13_ = 0;
				i_0_ = i_13_ | (i_11_ << 16 | i_12_ << 8);
			}
			aStream7783.method351(i * 4);
			if ((((Class163_Sub2) aClass163_Sub2_7779).anInt7608 ^ 0xffffffff) != -1) {
				aStream7783.method355((byte) (i_0_ >> 16));
				aStream7783.method355((byte) (i_0_ >> 8));
				aStream7783.method355((byte) i_0_);
			} else {
				aStream7783.method355((byte) i_0_);
				aStream7783.method355((byte) (i_0_ >> 8));
				aStream7783.method355((byte) (i_0_ >> 16));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tm.D(" + f + ',' + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method3133(int i, int i_14_) {
		try {
			aStream7783.method347();
			anInt7776++;
			anInterface3_7771 = aClass163_Sub2_7779.method3005(false,
					i ^ 0x7733);
			anInterface3_7771.method11(aNativeHeapBuffer7782, (byte) 113, i_14_
					* i, 4);
			aNativeHeapBuffer7782 = null;
			aStream7783 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tm.B(" + i + ','
					+ i_14_ + ')');
		}
	}

	final void method3134(int i, int[] is, int i_15_) {
		do {
			try {
				anInt7773++;
				Interface27 interface27 = aClass163_Sub2_7779.method3052(
						-14589, (((Class11_Sub44) this).anInt7781) * 3);
				Buffer buffer = interface27.method12(27599, true);
				if (buffer != null) {
					jaclib.memory.Stream stream = aClass163_Sub2_7779
							.method3098(buffer, true);
					int i_16_ = i;
					int i_17_ = 32767;
					int i_18_ = -32768;
					if (jaclib.memory.Stream.method353()) {
						for (int i_19_ = 0; i_19_ < i_15_; i_19_++) {
							int i_20_ = is[i_19_];
							int i_21_ = anIntArray7790[i_20_];
							short[] is_22_ = (((Class12_Sub1) aClass12_Sub1_7784).aShortArrayArray5125[i_20_]);
							if ((i_21_ ^ 0xffffffff) != -1 && is_22_ != null) {
								int i_23_ = 0;
								int i_24_ = 0;
								while (is_22_.length > i_24_) {
									if ((i_21_ & 1 << i_23_++ ^ 0xffffffff) != -1) {
										i_16_++;
										for (int i_25_ = 0; (i_25_ ^ 0xffffffff) > -4; i_25_++) {
											int i_26_ = 0xffff & is_22_[i_24_++];
											stream.method345(i_26_);
											if (i_17_ > i_26_)
												i_17_ = i_26_;
											if ((i_26_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff))
												i_18_ = i_26_;
										}
									} else
										i_24_ += 3;
								}
							}
						}
					} else {
						for (int i_27_ = 0; (i_15_ ^ 0xffffffff) < (i_27_ ^ 0xffffffff); i_27_++) {
							int i_28_ = is[i_27_];
							int i_29_ = anIntArray7790[i_28_];
							short[] is_30_ = (((Class12_Sub1) aClass12_Sub1_7784).aShortArrayArray5125[i_28_]);
							if ((i_29_ ^ 0xffffffff) != -1 && is_30_ != null) {
								int i_31_ = 0;
								int i_32_ = 0;
								while ((i_32_ ^ 0xffffffff) > (is_30_.length ^ 0xffffffff)) {
									if ((i_29_ & 1 << i_31_++) != 0) {
										i_16_++;
										for (int i_33_ = 0; (i_33_ ^ 0xffffffff) > -4; i_33_++) {
											int i_34_ = is_30_[i_32_++] & 0xffff;
											if ((i_18_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff))
												i_18_ = i_34_;
											stream.method346(i_34_);
											if (i_17_ > i_34_)
												i_17_ = i_34_;
										}
									} else
										i_32_ += 3;
								}
							}
						}
					}
					stream.method347();
					if (!interface27.method40((byte) 110) || i_16_ <= 0)
						break;
					aClass163_Sub2_7779
							.method2998(
									((0x8 & ((Class12_Sub1) aClass12_Sub1_7784).anInt5149) != 0),
									((Class11_Sub44) this).anInt7789,
									32242,
									((0x7 & ((Class12_Sub1) aClass12_Sub1_7784).anInt5149) != 0));
					if (((Class163_Sub2) aClass163_Sub2_7779).aBool7591)
						aClass163_Sub2_7779.EA(2147483647,
								((Class11_Sub44) this).anInt7780,
								((Class11_Sub44) this).anInt7778,
								((Class11_Sub44) this).anInt7774);
					Class33_Sub2 class33_sub2 = aClass163_Sub2_7779
							.method2975(124);
					class33_sub2.method2759(
							1.0F / ((Class11_Sub44) this).aFloat7775, 0,
							1.0F / ((Class11_Sub44) this).aFloat7775, 1.0F);
					aClass163_Sub2_7779.method2989((byte) 95,
							(Class11_Sub2_Sub2.aClass240_8463));
					aClass163_Sub2_7779.method2996(1, 1, anInterface3_7771);
					aClass163_Sub2_7779
							.method3012(
									(((Class12_Sub1) aClass12_Sub1_7784).aClass219_5158),
									16);
					aClass163_Sub2_7779.method3063(i_18_ + (-i_17_ + 1), i_16_,
							Class346.aClass183_4590, i - 17390, i_17_,
							interface27, 0);
					aClass163_Sub2_7779.method3048((byte) -117);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("tm.F(" + i + ','
						+ (is != null ? "{...}" : "null") + ',' + i_15_ + ')'));
			}
			break;
		} while (false);
	}

	final void method3135(int i, int i_35_, int i_36_, int i_37_) {
		try {
			if (i_35_ < -34) {
				anIntArray7790[i_36_ + i_37_
						* (((Class12) aClass12_Sub1_7784).anInt103)] = Class173
						.method1134((anIntArray7790[(i_36_ + i_37_
								* (((Class12) aClass12_Sub1_7784).anInt103))]),
								1 << i);
				anInt7787++;
				((Class11_Sub44) this).anInt7781++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tm.C(" + i + ','
					+ i_35_ + ',' + i_36_ + ',' + i_37_ + ')'));
		}
	}

	final void method3136(byte i, int i_38_) {
		try {
			anInt7786++;
			if (i >= -41)
				method3132(1.3722576F, -39, -108, -84, -14);
			aStream7783.method351(4 * i_38_ + 3);
			aStream7783.method355(-1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tm.G(" + i + ','
					+ i_38_ + ')');
		}
	}

	final void method3137(int i, int i_39_) {
		try {
			aNativeHeapBuffer7782 = aClass163_Sub2_7779.method3025(-16455,
					4 * i, true);
			if (i_39_ != 31601)
				((Class11_Sub44) this).anInt7781 = 36;
			anInt7785++;
			aStream7783 = new jaclib.memory.Stream(aNativeHeapBuffer7782, 0,
					i * 4);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tm.A(" + i + ','
					+ i_39_ + ')');
		}
	}

	public static void method3138(int i) {
		do {
			try {
				aClass298_7788 = null;
				if (i == -1)
					break;
				method3131(77);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "tm.E(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub44(Class12_Sub1 class12_sub1, int i, int i_40_, int i_41_,
			int i_42_, int i_43_) {
		try {
			aClass12_Sub1_7784 = class12_sub1;
			anIntArray7790 = new int[(((Class12) aClass12_Sub1_7784).anInt103 * ((Class12) aClass12_Sub1_7784).anInt98)];
			((Class11_Sub44) this).aFloat7775 = (float) i_40_;
			((Class11_Sub44) this).anInt7774 = i_43_;
			aClass163_Sub2_7779 = ((Class12_Sub1) aClass12_Sub1_7784).aClass163_Sub2_5145;
			((Class11_Sub44) this).anInt7789 = i;
			((Class11_Sub44) this).anInt7780 = i_41_;
			((Class11_Sub44) this).anInt7778 = i_42_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tm.<init>("
					+ (class12_sub1 != null ? "{...}" : "null") + ',' + i + ','
					+ i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'));
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
