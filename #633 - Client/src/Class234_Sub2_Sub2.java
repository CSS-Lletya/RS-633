/* Class234_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jaggl.OpenGL;

final class Class234_Sub2_Sub2 extends Class234_Sub2 {
	private Class321_Sub1 aClass321_Sub1_8992;
	static int anInt8993;
	private Class163_Sub3 aClass163_Sub3_8994;
	static boolean aBool8995 = false;
	static int anInt8996;
	static Class146 aClass146_8997;
	static int anInt8998;
	static int anInt8999;
	static int anInt9000;
	static int anInt9001;

	final Class321_Sub1 method2565(byte i) {
		try {
			anInt8999++;
			if (i != -79)
				return null;
			return aClass321_Sub1_8992;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fu.B(" + i + ')');
		}
	}

	static final void method3537(int i, int i_0_, int i_1_, Class163 class163,
			int i_2_, Class42 class42) {
		try {
			anInt8998++;
			if (i == -65534) {
				Class152 class152 = Class47.aClass29_741.method247(9,
						((Class42) class42).anInt600);
				if ((((Class152) class152).anInt2017 ^ 0xffffffff) != 0) {
					if (((Class42) class42).aBool627) {
						i_0_ += ((Class42) class42).anInt620;
						i_0_ &= 0x3;
					} else
						i_0_ = 0;
					Class253 class253 = class152
							.method955(((Class42) class42).aBool628, i_0_,
									class163, false);
					if (class253 != null) {
						int i_3_ = ((Class42) class42).anInt682;
						int i_4_ = ((Class42) class42).anInt687;
						if ((i_0_ & 0x1) == 1) {
							i_3_ = ((Class42) class42).anInt687;
							i_4_ = ((Class42) class42).anInt682;
						}
						int i_5_ = class253.method1608();
						int i_6_ = class253.method1622();
						if (((Class152) class152).aBool2011) {
							i_6_ = i_4_ * 4;
							i_5_ = 4 * i_3_;
						}
						if (((Class152) class152).anInt2016 != 0)
							class253.method1606(
									i_2_,
									i_1_ - 4 * (-1 + i_4_),
									i_5_,
									i_6_,
									0,
									(~0xffffff | (((Class152) class152).anInt2016)),
									1);
						else
							class253.method1620(i_2_, 4 - 4 * i_4_ + i_1_,
									i_5_, i_6_);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fu.F(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ (class42 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method3538(int i) {
		try {
			if (i != -65534)
				method3538(102);
			aClass146_8997 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fu.E(" + i + ')');
		}
	}

	static final void method3539(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			anInt9001++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 4, i_7_);
			class11_sub45_sub15.method3661(0);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i_9_;
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9367 = i;
			if (i_10_ <= 104)
				method3539(29, -7, -29, 17, -13);
			((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9369 = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fu.G(" + i + ','
					+ i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method3540(byte i) throws IOException {
		do {
			try {
				anInt8993++;
				int i_11_ = -5 % ((i - 54) / 47);
				if (Class108_Sub2.aClass217_5081 == null
						|| Class11_Sub43.anInt7337 <= 0)
					break;
				int i_12_ = 0;
				for (;;) {
					Class11_Sub10 class11_sub10 = ((Class11_Sub10) Class139.aClass84_1890
							.method584(-12261));
					if (class11_sub10 == null)
						break;
					Class108_Sub2.aClass217_5081
							.method1395(
									0,
									((Stream) (((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397)).buffer,
									-81,
									((Class11_Sub10) class11_sub10).anInt5392);
					Class11_Sub43.anInt7337 -= ((Class11_Sub10) class11_sub10).anInt5392;
					i_12_ += ((Class11_Sub10) class11_sub10).anInt5392;
					class11_sub10.method122(-123);
					((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
							.method2523((byte) 110);
					class11_sub10.method2367(-120);
				}
				Class70.anInt984 = 0;
				Class108_Sub3.anInt5328 += i_12_;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "fu.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class234_Sub2_Sub2(Class163_Sub3 class163_sub3, int i) {
		try {
			aClass163_Sub3_8994 = class163_sub3;
			aClass321_Sub1_8992 = new Class321_Sub1(class163_sub3, 6408, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fu.<init>(" + (class163_sub3 != null ? "{...}" : "null")
							+ ',' + i + ')'));
		}
	}

	final int method3541(int i) {
		try {
			int i_13_ = -87 / (-i / 37);
			anInt8996++;
			return ((Class321_Sub1) aClass321_Sub1_8992).anInt6630;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fu.D(" + i + ')');
		}
	}

	final boolean method3542(float f, Class321_Sub1 class321_sub1, int i,
			Class321_Sub1 class321_sub1_14_) {
		try {
			anInt9000++;
			boolean bool = true;
			Class378 class378 = ((Class163_Sub3) aClass163_Sub3_8994).aClass378_8394;
			aClass163_Sub3_8994.K(Class11_Sub45_Sub20_Sub2.anIntArray10214);
			aClass163_Sub3_8994.la();
			aClass163_Sub3_8994.method3281(6);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0,
					((Class321_Sub1) aClass321_Sub1_8992).anInt6630,
					((Class321_Sub1) aClass321_Sub1_8992).anInt6630);
			aClass163_Sub3_8994.method3254(false, (byte) 93);
			aClass163_Sub3_8994.method3267(false, i ^ ~0x6589);
			aClass163_Sub3_8994.method3248(false, 120);
			aClass163_Sub3_8994.method3250((byte) 87, false);
			aClass163_Sub3_8994.method3291(-115, -2);
			aClass163_Sub3_8994.method3253(1, true);
			aClass163_Sub3_8994.method3293(84, 0.0F, 0.0F, f, 0.0F);
			aClass163_Sub3_8994.method3315(false, 34165, 34165);
			aClass163_Sub3_8994.method3295(class321_sub1_14_, 121);
			aClass163_Sub3_8994.method3253(i, true);
			aClass163_Sub3_8994.method3260(1, (byte) 17);
			aClass163_Sub3_8994.method3295(class321_sub1, i ^ 0x6e);
			aClass163_Sub3_8994.method3246((byte) -99, class378);
			for (int i_15_ = 0; i_15_ < 6; i_15_++) {
				int i_16_ = i_15_ + 34069;
				class378.method2215(i + 19658, 0, i_16_, aClass321_Sub1_8992);
				class378.method2214(0, i ^ 0x56);
				if (!class378.method2210((byte) -116)) {
					bool = false;
					break;
				}
				OpenGL.glBegin(7);
				int i_17_ = i_16_;
				while_39_: do {
					while_38_: do {
						while_37_: do {
							while_36_: do {
								do {
									if (i_17_ != 34069) {
										if ((i_17_ ^ 0xffffffff) != -34071) {
											if (i_17_ != 34071) {
												if ((i_17_ ^ 0xffffffff) != -34073) {
													if (i_17_ != 34073) {
														if (i_17_ != 34074)
															break while_39_;
													} else
														break while_37_;
													break while_38_;
												}
											} else
												break;
											break while_36_;
										}
									} else {
										OpenGL.glTexCoord3i(65535, 65534, 65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												65534, 65534);
										OpenGL.glVertex2f(0.0F, 0.0F);
										OpenGL.glTexCoord3i(65535, 65534,
												-65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												65534, -65534);
										OpenGL.glVertex2f(1.0F, 0.0F);
										OpenGL.glTexCoord3i(65535, -65534,
												-65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												-65534, -65534);
										OpenGL.glVertex2f(1.0F, 1.0F);
										OpenGL.glTexCoord3i(65535, -65534,
												65534);
										OpenGL.glMultiTexCoord3i(33985, 65535,
												-65534, 65534);
										OpenGL.glVertex2f(0.0F, 1.0F);
										break while_39_;
									}
									OpenGL.glTexCoord3i(-65535, 65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											65534, -65534);
									OpenGL.glVertex2f(0.0F, 0.0F);
									OpenGL.glTexCoord3i(-65535, 65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											65534, 65534);
									OpenGL.glVertex2f(1.0F, 0.0F);
									OpenGL.glTexCoord3i(-65535, -65534, 65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											-65534, 65534);
									OpenGL.glVertex2f(1.0F, 1.0F);
									OpenGL.glTexCoord3i(-65535, -65534, -65534);
									OpenGL.glMultiTexCoord3i(33985, -65535,
											-65534, -65534);
									OpenGL.glVertex2f(0.0F, 1.0F);
									break while_39_;
								} while (false);
								OpenGL.glTexCoord3i(-65534, 65535, -65534);
								OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
										-65534);
								OpenGL.glVertex2f(0.0F, 0.0F);
								OpenGL.glTexCoord3i(65534, 65535, -65534);
								OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
										-65534);
								OpenGL.glVertex2f(1.0F, 0.0F);
								OpenGL.glTexCoord3i(65534, 65535, 65534);
								OpenGL.glMultiTexCoord3i(33985, 65534, 65535,
										65534);
								OpenGL.glVertex2f(1.0F, 1.0F);
								OpenGL.glTexCoord3i(-65534, 65535, 65534);
								OpenGL.glMultiTexCoord3i(33985, -65534, 65535,
										65534);
								OpenGL.glVertex2f(0.0F, 1.0F);
								break while_39_;
							} while (false);
							OpenGL.glTexCoord3i(-65534, -65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
									65534);
							OpenGL.glVertex2f(0.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, -65535, 65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
									65534);
							OpenGL.glVertex2f(1.0F, 0.0F);
							OpenGL.glTexCoord3i(65534, -65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, 65534, -65535,
									-65534);
							OpenGL.glVertex2f(1.0F, 1.0F);
							OpenGL.glTexCoord3i(-65534, -65535, -65534);
							OpenGL.glMultiTexCoord3i(33985, -65534, -65535,
									-65534);
							OpenGL.glVertex2f(0.0F, 1.0F);
							break while_39_;
						} while (false);
						OpenGL.glTexCoord3i(-65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break while_39_;
					} while (false);
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
				} while (false);
				OpenGL.glEnd();
			}
			class378.method2216(1, 0);
			aClass163_Sub3_8994.method3282(class378, (byte) -128);
			aClass163_Sub3_8994.method3253(1, true);
			aClass163_Sub3_8994.method3295(null, 63);
			aClass163_Sub3_8994.method3315(false, 8448, 8448);
			aClass163_Sub3_8994.method3253(0, true);
			aClass163_Sub3_8994.method3295(null, i + 103);
			OpenGL.glPopAttrib();
			aClass163_Sub3_8994.KA(Class11_Sub45_Sub20_Sub2.anIntArray10214[0],
					Class11_Sub45_Sub20_Sub2.anIntArray10214[1],
					Class11_Sub45_Sub20_Sub2.anIntArray10214[2],
					(Class11_Sub45_Sub20_Sub2.anIntArray10214[3]));
			if (bool && !((Class163_Sub3) aClass163_Sub3_8994).aBool8336)
				aClass321_Sub1_8992.method1956(0);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("fu.A("
									+ f
									+ ','
									+ (class321_sub1 != null ? "{...}" : "null")
									+ ','
									+ i
									+ ','
									+ (class321_sub1_14_ != null ? "{...}"
											: "null") + ')'));
		}
	}
}
