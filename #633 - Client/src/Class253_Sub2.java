/* Class253_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class253_Sub2 extends Class253 {
	static int anInt6506;
	static int anInt6507;
	static int anInt6508;
	static int anInt6509;
	private int anInt6510 = 0;
	static IncomingPacket aClass160_6511 = new IncomingPacket(110, 0);
	static int anInt6512;
	static int anInt6513;
	static int anInt6514;
	static int anInt6515;
	private Class321_Sub3_Sub1 aClass321_Sub3_Sub1_6516;
	private boolean aBool6517;
	static int anInt6518;
	static int anInt6519;
	private int anInt6520;
	static int anInt6521;
	static int anInt6522;
	static int anInt6523;
	private int anInt6524;
	private int anInt6525 = 0;
	static int anInt6526;
	static int anInt6527;
	private Class163_Sub3 aClass163_Sub3_6528;
	private Class321_Sub3_Sub1 aClass321_Sub3_Sub1_6529;
	private int anInt6530;
	static int anInt6531;
	static int anInt6532;
	static int anInt6533;
	static int anInt6534;
	static int[] anIntArray6535;
	static Class11_Sub31 aClass11_Sub31_6536;
	static int anInt6537;

	public static void method2702(int i) {
		try {
			if (i != 1278894712)
				aClass11_Sub31_6536 = null;
			aClass11_Sub31_6536 = null;
			aClass160_6511 = null;
			anIntArray6535 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.H(" + i + ')');
		}
	}

	final void method1613(int i, int i_0_, int i_1_) {
		try {
			anInt6523++;
			OpenGL.glPixelTransferf(3348, 0.5F);
			OpenGL.glPixelTransferf(3349, 0.499F);
			OpenGL.glPixelTransferf(3352, 0.5F);
			OpenGL.glPixelTransferf(3353, 0.499F);
			OpenGL.glPixelTransferf(3354, 0.5F);
			OpenGL.glPixelTransferf(3355, 0.499F);
			aClass321_Sub3_Sub1_6529 = Class216.method1392(3553,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259,
					i, aClass163_Sub3_6528,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254,
					i_0_);
			anInt6520 = i_1_;
			OpenGL.glPixelTransferf(3348, 1.0F);
			OpenGL.glPixelTransferf(3349, 0.0F);
			OpenGL.glPixelTransferf(3352, 1.0F);
			OpenGL.glPixelTransferf(3353, 0.0F);
			OpenGL.glPixelTransferf(3354, 1.0F);
			OpenGL.glPixelTransferf(3355, 0.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.AA(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method2703(byte i) {
		try {
			anInt6519++;
			if (Class108_Sub16.anApplet6538 != null) {
				try {
					String string = Class108_Sub16.anApplet6538
							.getParameter("cookiehost");
					if (i != -66)
						method2702(99);
					int i_2_ = ((int) (Class137.method878((byte) -99) / 86400000L) - 11745);
					String string_3_ = ("usrdob=" + i_2_
							+ "; version=1; path=/; domain=" + string);
					Class36.method310("document.cookie=\"" + string_3_ + "\"",
							Class108_Sub16.anApplet6538, 122);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.G(" + i + ')');
		}
	}

	private final void method2704(int i) {
		do {
			try {
				anInt6521++;
				aClass163_Sub3_6528.method3253(1, true);
				aClass163_Sub3_6528.method3295(null, 71);
				aClass163_Sub3_6528.method3315(false, 8448, 8448);
				aClass163_Sub3_6528.method3252((byte) 34, 1, 768, 34168);
				aClass163_Sub3_6528.method3317(5890, 0, 770, (byte) 73);
				aClass163_Sub3_6528.method3253(0, true);
				aClass163_Sub3_6528.method3252((byte) 34, 1, 768, 34168);
				if (i > 2)
					break;
				anInt6534 = 62;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "je.B(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method1626(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_, int i_9_, int i_10_) {
		try {
			anInt6531++;
			aClass321_Sub3_Sub1_6516.method1963((i_10_ & 0x1) != 0, false);
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3283(1, i_9_);
			OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8),
					(byte) i_8_, (byte) (i_8_ >> 24));
			if (!aBool6517) {
				if (aClass321_Sub3_Sub1_6529 != null) {
					method2707(i_7_, (byte) 7);
					aClass321_Sub3_Sub1_6529.method1963(true, false);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(
							33985,
							0.0F,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
					OpenGL.glTexCoord2f(
							0.0F,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2i(i, i_4_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_6_ + i_4_);
					OpenGL.glMultiTexCoord2f(
							33985,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
							0.0F);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							0.0F);
					OpenGL.glVertex2i(i - -i_5_, i_4_ + i_6_);
					OpenGL.glMultiTexCoord2f(
							33985,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2i(i_5_ + i, i_4_);
					OpenGL.glEnd();
					method2704(67);
				} else {
					aClass163_Sub3_6528
							.method3295(aClass321_Sub3_Sub1_6516, 91);
					aClass163_Sub3_6528.method3260(i_7_, (byte) 17);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(
							0.0F,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2i(i, i_4_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i, i_4_ - -i_6_);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							0.0F);
					OpenGL.glVertex2i(i_5_ + i, i_6_ + i_4_);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2i(i_5_ + i, i_4_);
					OpenGL.glEnd();
				}
			} else {
				float f = (float) i_5_ / (float) method1608();
				float f_11_ = (float) i_6_ / (float) method1622();
				float f_12_ = f * (float) anInt6510 + (float) i;
				float f_13_ = (float) anInt6524 * f_11_ + (float) i_4_;
				float f_14_ = f_12_
						+ f
						* (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259;
				float f_15_ = (f_11_
						* (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254 + f_13_);
				if (aClass321_Sub3_Sub1_6529 != null) {
					method2707(i_7_, (byte) 7);
					aClass321_Sub3_Sub1_6529.method1963(true, false);
					OpenGL.glBegin(7);
					OpenGL.glMultiTexCoord2f(
							33985,
							0.0F,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
					OpenGL.glTexCoord2f(
							0.0F,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2f(f_12_, f_13_);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_12_, f_15_);
					OpenGL.glMultiTexCoord2f(
							33985,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
							0.0F);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							0.0F);
					OpenGL.glVertex2f(f_14_, f_15_);
					OpenGL.glMultiTexCoord2f(
							33985,
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
							(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2f(f_14_, f_13_);
					OpenGL.glEnd();
					method2704(102);
				} else {
					aClass163_Sub3_6528
							.method3295(aClass321_Sub3_Sub1_6516, 62);
					aClass163_Sub3_6528.method3260(i_7_, (byte) 17);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(
							0.0F,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2f(f_12_, f_13_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2f(f_12_, f_15_);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							0.0F);
					OpenGL.glVertex2f(f_14_, f_15_);
					OpenGL.glTexCoord2f(
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
							((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
					OpenGL.glVertex2f(f_14_, f_13_);
					OpenGL.glEnd();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.Q(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method2705(int i, Class146 class146) {
		try {
			Class11_Sub45_Sub11.aClass146_9162 = class146;
			if (i != 7)
				anIntArray6535 = null;
			anInt6537++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.BA(" + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1624(int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		try {
			aClass321_Sub3_Sub1_6516.method1963(false, false);
			anInt6522++;
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3283(1, i_19_);
			OpenGL.glColor4ub((byte) (i_18_ >> 16), (byte) (i_18_ >> 8),
					(byte) i_18_, (byte) (i_18_ >> 24));
			i += anInt6510;
			i_16_ += anInt6524;
			if (aClass321_Sub3_Sub1_6529 == null) {
				aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 106);
				aClass163_Sub3_6528.method3260(i_17_, (byte) 17);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(
						0.0F,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
				OpenGL.glVertex2i(i, i_16_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(
						i,
						(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254 + i_16_));
				OpenGL.glTexCoord2f(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						0.0F);
				OpenGL.glVertex2i(
						i
								+ ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259,
						(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254 + i_16_));
				OpenGL.glTexCoord2f(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
				OpenGL.glVertex2i(
						i
								- -((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259,
						i_16_);
				OpenGL.glEnd();
			} else {
				method2707(i_17_, (byte) 7);
				aClass321_Sub3_Sub1_6529.method1963(false, false);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(
						33985,
						0.0F,
						(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
				OpenGL.glTexCoord2f(
						0.0F,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
				OpenGL.glVertex2i(i, i_16_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(
						i,
						(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254 + i_16_));
				OpenGL.glMultiTexCoord2f(
						33985,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						0.0F);
				OpenGL.glTexCoord2f(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						0.0F);
				OpenGL.glVertex2i(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259
								+ i,
						i_16_
								- -(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254));
				OpenGL.glMultiTexCoord2f(
						33985,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
				OpenGL.glTexCoord2f(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
				OpenGL.glVertex2i(
						((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259
								+ i, i_16_);
				OpenGL.glEnd();
				method2704(120);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.FA(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ')'));
		}
	}

	final void method1628(float f, float f_20_, float f_21_, float f_22_,
			float f_23_, float f_24_, int i, Class72 class72, int i_25_,
			int i_26_) {
		try {
			anInt6509++;
			Class321_Sub3_Sub1 class321_sub3_sub1 = (((Class72_Sub3) (Class72_Sub3) class72).aClass321_Sub3_Sub1_7312);
			if (aBool6517) {
				float f_27_ = (float) method1608();
				float f_28_ = (float) method1622();
				float f_29_ = (f_21_ - f) / f_27_;
				float f_30_ = (-f_20_ + f_22_) / f_27_;
				float f_31_ = (f_23_ - f) / f_28_;
				float f_32_ = (-f_20_ + f_24_) / f_28_;
				float f_33_ = f_31_ * (float) anInt6524;
				float f_34_ = (float) anInt6524 * f_32_;
				float f_35_ = (float) anInt6510 * f_29_;
				float f_36_ = (float) anInt6510 * f_30_;
				float f_37_ = (float) anInt6525 * -f_29_;
				float f_38_ = (float) anInt6525 * -f_30_;
				float f_39_ = -f_31_ * (float) anInt6530;
				f = f_33_ + (f + f_35_);
				f_23_ = f_35_ + f_23_ + f_39_;
				f_20_ = f_34_ + (f_36_ + f_20_);
				f_22_ = f_22_ + f_38_ + f_34_;
				float f_40_ = -f_32_ * (float) anInt6530;
				f_21_ = f_21_ + f_37_ + f_33_;
				f_24_ = f_40_ + (f_36_ + f_24_);
			}
			float f_41_ = f_21_ - f + f_23_;
			aClass321_Sub3_Sub1_6516.method1963((0x1 & i ^ 0xffffffff) != -1,
					false);
			float f_42_ = -f_20_ + f_24_ + f_22_;
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 100);
			aClass163_Sub3_6528.method3260(1, (byte) 17);
			aClass163_Sub3_6528.method3253(1, true);
			aClass163_Sub3_6528.method3295(class321_sub3_sub1, 78);
			aClass163_Sub3_6528.method3315(false, 7681, 8448);
			aClass163_Sub3_6528.method3252((byte) 34, 0, 768, 34168);
			aClass163_Sub3_6528.method3283(1, 1);
			float f_43_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9255 / (float) (((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9259));
			float f_44_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 / (float) (((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9254));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glMultiTexCoord2f(
					33985,
					(f - (float) i_25_) * f_43_,
					(-(f_44_ * (f_20_ - (float) i_26_)) + ((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253));
			OpenGL.glVertex2f(f, f_20_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(
					33985,
					f_43_ * (f_23_ - (float) i_25_),
					(-((f_24_ - (float) i_26_) * f_44_) + ((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253));
			OpenGL.glVertex2f(f_23_, f_24_);
			OpenGL.glMultiTexCoord2f(33984,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					0.0F);
			OpenGL.glMultiTexCoord2f(
					33985,
					(f_41_ - (float) i_25_) * f_43_,
					(((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 - f_44_
							* ((float) -i_26_ + f_42_)));
			OpenGL.glVertex2f(f_41_, f_42_);
			OpenGL.glMultiTexCoord2f(33984,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glMultiTexCoord2f(
					33985,
					(f_21_ - (float) i_25_) * f_43_,
					(((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 - (f_22_ - (float) i_26_)
							* f_44_));
			OpenGL.glVertex2f(f_21_, f_22_);
			OpenGL.glEnd();
			aClass163_Sub3_6528.method3252((byte) 34, 0, 768, 5890);
			aClass163_Sub3_6528.method3260(0, (byte) 17);
			aClass163_Sub3_6528.method3295(null, 103);
			aClass163_Sub3_6528.method3253(0, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.E(" + f + ','
					+ f_20_ + ',' + f_21_ + ',' + f_22_ + ',' + f_23_ + ','
					+ f_24_ + ',' + i + ','
					+ (class72 != null ? "{...}" : "null") + ',' + i_25_ + ','
					+ i_26_ + ')'));
		}
	}

	final void method1612(int i, int i_45_, Class72 class72, int i_46_,
			int i_47_) {
		try {
			anInt6532++;
			Class72_Sub3 class72_sub3 = (Class72_Sub3) class72;
			Class321_Sub3_Sub1 class321_sub3_sub1 = ((Class72_Sub3) class72_sub3).aClass321_Sub3_Sub1_7312;
			aClass321_Sub3_Sub1_6516.method1963(false, false);
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 47);
			aClass163_Sub3_6528.method3260(1, (byte) 17);
			aClass163_Sub3_6528.method3253(1, true);
			aClass163_Sub3_6528.method3295(class321_sub3_sub1, 92);
			aClass163_Sub3_6528.method3315(false, 7681, 8448);
			aClass163_Sub3_6528.method3252((byte) 34, 0, 768, 34168);
			aClass163_Sub3_6528.method3283(1, 1);
			i += anInt6510;
			i_45_ += anInt6524;
			int i_48_ = (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259 + i);
			int i_49_ = i_45_
					+ (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254);
			float f = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9255 / (float) (((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9259));
			float f_50_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 / (float) (((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9254));
			float f_51_ = (float) (i + -i_46_) * f;
			float f_52_ = f * (float) (-i_46_ + i_48_);
			float f_53_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 - (float) (-i_47_ + i_45_)
					* f_50_);
			float f_54_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 - f_50_
					* (float) (-i_47_ + i_49_));
			OpenGL.glBegin(7);
			OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
			OpenGL.glMultiTexCoord2f(33984, 0.0F,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glMultiTexCoord2f(33985, f_51_, f_53_);
			OpenGL.glVertex2i(i, i_45_);
			OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_51_, f_54_);
			OpenGL.glVertex2i(i, i_45_
					+ ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254);
			OpenGL.glMultiTexCoord2f(33984,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					0.0F);
			OpenGL.glMultiTexCoord2f(33985, f_52_, f_54_);
			OpenGL.glVertex2i(
					i
							+ ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259,
					(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254)
							+ i_45_);
			OpenGL.glMultiTexCoord2f(33984,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glMultiTexCoord2f(33985, f_52_, f_53_);
			OpenGL.glVertex2i(
					(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259)
							+ i, i_45_);
			OpenGL.glEnd();
			aClass163_Sub3_6528.method3252((byte) 34, 0, 768, 5890);
			aClass163_Sub3_6528.method3260(0, (byte) 17);
			aClass163_Sub3_6528.method3295(null, 68);
			aClass163_Sub3_6528.method3253(0, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.U(" + i + ','
					+ i_45_ + ',' + (class72 != null ? "{...}" : "null") + ','
					+ i_46_ + ',' + i_47_ + ')'));
		}
	}

	final void method1607(int i, int i_55_, int i_56_, int i_57_) {
		try {
			anInt6530 = i_57_;
			anInt6510 = i;
			anInt6525 = i_56_;
			anInt6524 = i_55_;
			anInt6513++;
			aBool6517 = ((anInt6510 ^ 0xffffffff) != -1 || anInt6524 != 0
					|| anInt6525 != 0 || (anInt6530 ^ 0xffffffff) != -1);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.F(" + i + ','
					+ i_55_ + ',' + i_56_ + ',' + i_57_ + ')'));
		}
	}

	static final Class113 method2706(Stream stream, boolean bool) {
		try {
			anInt6508++;
			String string = stream.readString(-1);
			Class118 class118 = Class239.method1519(-11911)[stream
					.readUnsignedByte((byte) 35)];
			Class150 class150 = Class171.method1124(25992)[stream
					.readUnsignedByte((byte) 35)];
			int i = stream.method2508((byte) 102);
			if (bool != true)
				aClass11_Sub31_6536 = null;
			int i_58_ = stream.method2508((byte) -85);
			int i_59_ = stream.readUnsignedByte((byte) 35);
			int i_60_ = stream.readUnsignedByte((byte) 35);
			int i_61_ = stream.readUnsignedByte((byte) 35);
			int i_62_ = stream.readUnsignedShort((byte) -65);
			int i_63_ = stream.readUnsignedShort((byte) -65);
			int i_64_ = stream.readInt(96);
			int i_65_ = stream.readInt(103);
			int i_66_ = stream.readInt(104);
			return new Class113(string, class118, class150, i, i_58_, i_59_,
					i_60_, i_61_, i_62_, i_63_, i_64_, i_65_, i_66_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.DA("
					+ (stream != null ? "{...}" : "null") + ',' + bool + ')'));
		}
	}

	final int method1608() {
		try {
			anInt6514++;
			return (anInt6525 + ((((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259) + anInt6510));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.T(" + ')');
		}
	}

	final int method1622() {
		try {
			anInt6533++;
			return (anInt6524
					+ ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254 + anInt6530);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.O(" + ')');
		}
	}

	final int method1615() {
		try {
			anInt6506++;
			return ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.L(" + ')');
		}
	}

	private final void method2707(int i, byte i_67_) {
		try {
			aClass163_Sub3_6528.method3253(1, true);
			anInt6507++;
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 74);
			if (i_67_ != 7)
				aClass11_Sub31_6536 = null;
			aClass163_Sub3_6528.method3315(false,
					aClass163_Sub3_6528.method3305(i, 7681), 7681);
			aClass163_Sub3_6528.method3252((byte) 34, 1, 768, 34167);
			aClass163_Sub3_6528.method3317(34168, 0, 770, (byte) -112);
			aClass163_Sub3_6528.method3253(0, true);
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6529, 38);
			aClass163_Sub3_6528.method3315(false, 34479, 7681);
			aClass163_Sub3_6528.method3252((byte) 34, 1, 768, 34166);
			if (anInt6520 == 0)
				aClass163_Sub3_6528.method3293(111, 0.5F, 1.0F, 0.0F, 0.5F);
			else if (anInt6520 != 1) {
				if ((anInt6520 ^ 0xffffffff) == -3)
					aClass163_Sub3_6528.method3293(i_67_ + 117, 0.5F, 0.5F,
							0.0F, 1.0F);
				else if ((anInt6520 ^ 0xffffffff) == -4)
					aClass163_Sub3_6528.method3293(i_67_ ^ 0x4a, 128.5F,
							128.5F, 0.0F, 128.5F);
			} else
				aClass163_Sub3_6528.method3293(46, 1.0F, 0.5F, 0.0F, 0.5F);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.D(" + i + ','
					+ i_67_ + ')');
		}
	}

	static final void method2708(int i) {
		try {
			anInt6527++;
			if (i <= 25)
				aClass11_Sub31_6536 = null;
			int i_68_ = 1024;
			int i_69_ = 3072;
			if (Class11_Sub45_Sub1.aBool8490) {
				if (OutputStream_Sub1.aBool5850)
					i_68_ = 2048;
				i_69_ = 4096;
			}
			if ((float) i_68_ > Class219_Sub1.aFloat7244)
				Class219_Sub1.aFloat7244 = (float) i_68_;
			for (/**/; Class2_Sub8.aFloat6868 >= 16384.0F; Class2_Sub8.aFloat6868 -= 16384.0F) {
				/* empty */
			}
			if ((float) i_69_ < Class219_Sub1.aFloat7244)
				Class219_Sub1.aFloat7244 = (float) i_69_;
			for (/**/; Class2_Sub8.aFloat6868 < 0.0F; Class2_Sub8.aFloat6868 += 16384.0F) {
				/* empty */
			}
			int i_70_ = Class94_Sub4.anInt7728 >> 9;
			int i_71_ = Class279.anInt3771 >> 9;
			int i_72_ = Class318.method1931(107, Class279.anInt3771,
					Class376_Sub7_Sub2.anInt9242, Class94_Sub4.anInt7728);
			int i_73_ = 0;
			if ((i_70_ ^ 0xffffffff) < -4
					&& (i_71_ ^ 0xffffffff) < -4
					&& (i_70_ ^ 0xffffffff) > (-4 + Class300.anInt4051 ^ 0xffffffff)
					&& (i_71_ ^ 0xffffffff) > (-4 + Class108_Sub12.anInt6228 ^ 0xffffffff)) {
				for (int i_74_ = i_70_ - 4; (i_74_ ^ 0xffffffff) >= (i_70_ + 4 ^ 0xffffffff); i_74_++) {
					for (int i_75_ = i_71_ - 4; i_75_ <= i_71_ + 4; i_75_++) {
						int i_76_ = Class376_Sub7_Sub2.anInt9242;
						if ((i_76_ ^ 0xffffffff) > -4
								&& Class321_Sub3_Sub1.method3613((byte) -114,
										i_74_, i_75_))
							i_76_++;
						int i_77_ = 0;
						if ((((Class286) Class376_Sub6.aClass286_Sub1_6949).aByteArrayArrayArray3856) != null
								&& (((Class286) Class376_Sub6.aClass286_Sub1_6949).aByteArrayArrayArray3856[i_76_]) != null)
							i_77_ = 8 * (0xff & (((Class286) Class376_Sub6.aClass286_Sub1_6949).aByteArrayArrayArray3856[i_76_][i_74_][i_75_])) << 2;
						if (Class315.aClass12Array4179 != null
								&& Class315.aClass12Array4179[i_76_] != null) {
							int i_78_ = (i_72_
									- Class315.aClass12Array4179[i_76_]
											.method131((byte) 6, i_75_, i_74_) + i_77_);
							if ((i_73_ ^ 0xffffffff) > (i_78_ ^ 0xffffffff))
								i_73_ = i_78_;
						}
					}
				}
			}
			int i_79_ = (i_73_ >> 2) * 1536;
			if ((i_79_ ^ 0xffffffff) < -786433)
				i_79_ = 786432;
			if (i_79_ < 262144)
				i_79_ = 262144;
			if (Class300.anInt4050 >= i_79_) {
				if (i_79_ < Class300.anInt4050)
					Class300.anInt4050 += (i_79_ - Class300.anInt4050) / 80;
			} else
				Class300.anInt4050 += (-Class300.anInt4050 + i_79_) / 24;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.K(" + i + ')');
		}
	}

	final void method1625(int i, int i_80_, int i_81_, int i_82_, int i_83_,
			int i_84_, int i_85_) {
		try {
			anInt6526++;
			int i_86_ = i_81_ + i;
			int i_87_ = i_82_ + i_80_;
			aClass321_Sub3_Sub1_6516.method1963(false, false);
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 111);
			aClass163_Sub3_6528.method3283(1, i_85_);
			aClass163_Sub3_6528.method3260(i_83_, (byte) 17);
			OpenGL.glColor4ub((byte) (i_84_ >> 16), (byte) (i_84_ >> 8),
					(byte) i_84_, (byte) (i_84_ >> 24));
			if (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aBool9257
					&& !aBool6517) {
				float f = ((((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253)
						* (float) i_82_ / (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254);
				float f_88_ = ((((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255)
						* (float) i_81_ / (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, f);
				OpenGL.glVertex2i(i, i_80_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(i, i_87_);
				OpenGL.glTexCoord2f(f_88_, 0.0F);
				OpenGL.glVertex2i(i_86_, i_87_);
				OpenGL.glTexCoord2f(f_88_, f);
				OpenGL.glVertex2i(i_86_, i_80_);
				OpenGL.glEnd();
			} else {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef((float) anInt6510, (float) anInt6524, 0.0F);
				int i_89_ = method1608();
				int i_90_ = method1622();
				int i_91_ = i_80_
						- -(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254);
				OpenGL.glBegin(7);
				int i_92_ = i_80_;
				for (/**/; i_87_ >= i_91_; i_91_ += i_90_) {
					int i_93_ = ((((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259) + i);
					int i_94_ = i;
					for (/**/; (i_93_ ^ 0xffffffff) >= (i_86_ ^ 0xffffffff); i_93_ += i_89_) {
						OpenGL.glTexCoord2f(
								0.0F,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_94_, i_92_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_94_, i_91_);
						OpenGL.glTexCoord2f(
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
								0.0F);
						OpenGL.glVertex2i(i_93_, i_91_);
						OpenGL.glTexCoord2f(
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_93_, i_92_);
						i_94_ += i_89_;
					}
					if (i_94_ < i_86_) {
						float f = ((float) (i_86_ - i_94_)
								* ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255 / (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259);
						OpenGL.glTexCoord2f(
								0.0F,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_94_, i_92_);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glVertex2i(i_94_, i_91_);
						OpenGL.glTexCoord2f(f, 0.0F);
						OpenGL.glVertex2i(i_86_, i_91_);
						OpenGL.glTexCoord2f(
								f,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_86_, i_92_);
					}
					i_92_ += i_90_;
				}
				if (i_92_ < i_87_) {
					float f = ((float) (-i_87_ + (i_92_ + ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254))
							* (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253) / (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9254);
					int i_95_ = i
							- -(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259);
					int i_96_ = i;
					while ((i_86_ ^ 0xffffffff) <= (i_95_ ^ 0xffffffff)) {
						OpenGL.glTexCoord2f(
								0.0F,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_96_, i_92_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_96_, i_87_);
						OpenGL.glTexCoord2f(
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
								f);
						OpenGL.glVertex2i(i_95_, i_87_);
						OpenGL.glTexCoord2f(
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255),
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_95_, i_92_);
						i_95_ += i_89_;
						i_96_ += i_89_;
					}
					if (i_96_ < i_86_) {
						float f_97_ = ((float) (-i_96_ + i_86_)
								* ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255 / (float) ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259);
						OpenGL.glTexCoord2f(
								0.0F,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_96_, i_92_);
						OpenGL.glTexCoord2f(0.0F, f);
						OpenGL.glVertex2i(i_96_, i_87_);
						OpenGL.glTexCoord2f(f_97_, f);
						OpenGL.glVertex2i(i_86_, i_87_);
						OpenGL.glTexCoord2f(
								f_97_,
								(((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253));
						OpenGL.glVertex2i(i_86_, i_92_);
					}
				}
				OpenGL.glEnd();
				OpenGL.glPopMatrix();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.CA(" + i + ','
					+ i_80_ + ',' + i_81_ + ',' + i_82_ + ',' + i_83_ + ','
					+ i_84_ + ',' + i_85_ + ')'));
		}
	}

	final void method1611(int i, int i_98_, int i_99_, int i_100_, int i_101_,
			int i_102_) {
		try {
			anInt6515++;
			aClass321_Sub3_Sub1_6516.method2854(28490, i_101_, i_102_, i_98_,
					i, i_100_, i_99_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.J(" + i + ','
					+ i_98_ + ',' + i_99_ + ',' + i_100_ + ',' + i_101_ + ','
					+ i_102_ + ')'));
		}
	}

	final void method1617(float f, float f_103_, float f_104_, float f_105_,
			float f_106_, float f_107_, int i, int i_108_, int i_109_,
			int i_110_) {
		try {
			if (aBool6517) {
				float f_111_ = (float) method1608();
				float f_112_ = (float) method1622();
				float f_113_ = (-f + f_104_) / f_111_;
				float f_114_ = (-f_103_ + f_105_) / f_111_;
				float f_115_ = (f_106_ - f) / f_112_;
				float f_116_ = (f_107_ - f_103_) / f_112_;
				float f_117_ = f_115_ * (float) anInt6524;
				float f_118_ = (float) anInt6524 * f_116_;
				float f_119_ = (float) anInt6510 * f_113_;
				float f_120_ = f_114_ * (float) anInt6510;
				float f_121_ = (float) anInt6525 * -f_113_;
				float f_122_ = -f_114_ * (float) anInt6525;
				float f_123_ = (float) anInt6530 * -f_115_;
				f = f_119_ + f + f_117_;
				f_103_ = f_120_ + f_103_ + f_118_;
				f_105_ = f_122_ + f_105_ + f_118_;
				float f_124_ = (float) anInt6530 * -f_116_;
				f_106_ = f_106_ + f_119_ + f_123_;
				f_104_ = f_104_ + f_121_ + f_117_;
				f_107_ = f_124_ + (f_120_ + f_107_);
			}
			anInt6518++;
			float f_125_ = f_106_ + (f_104_ - f);
			float f_126_ = f_107_ - f_103_ + f_105_;
			aClass321_Sub3_Sub1_6516.method1963(
					(i_110_ & 0x1 ^ 0xffffffff) != -1, false);
			aClass163_Sub3_6528.method3244(2);
			aClass163_Sub3_6528.method3295(aClass321_Sub3_Sub1_6516, 58);
			aClass163_Sub3_6528.method3283(1, i_109_);
			aClass163_Sub3_6528.method3260(i, (byte) 17);
			OpenGL.glColor4ub((byte) (i_108_ >> 16), (byte) (i_108_ >> 8),
					(byte) i_108_, (byte) (i_108_ >> 24));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glVertex2f(f, f_103_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2f(f_106_, f_107_);
			OpenGL.glTexCoord2f(
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					0.0F);
			OpenGL.glVertex2f(f_125_, f_126_);
			OpenGL.glTexCoord2f(
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9255,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).aFloat9253);
			OpenGL.glVertex2f(f_104_, f_105_);
			OpenGL.glEnd();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.S(" + f + ','
					+ f_103_ + ',' + f_104_ + ',' + f_105_ + ',' + f_106_ + ','
					+ f_107_ + ',' + i + ',' + i_108_ + ',' + i_109_ + ','
					+ i_110_ + ')'));
		}
	}

	final int method1609() {
		try {
			anInt6512++;
			return ((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_6516).anInt9259;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "je.C(" + ')');
		}
	}

	Class253_Sub2(Class163_Sub3 class163_sub3, int i, int i_127_, boolean bool) {
		aBool6517 = false;
		anInt6530 = 0;
		anInt6520 = 0;
		anInt6524 = 0;
		try {
			aClass163_Sub3_6528 = class163_sub3;
			aClass321_Sub3_Sub1_6516 = Class78.method537((byte) 118, i_127_,
					class163_sub3, i, bool ? 6408 : 6407);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_127_ + ',' + bool + ')'));
		}
	}

	Class253_Sub2(Class163_Sub3 class163_sub3, int i, int i_128_, int i_129_,
			int i_130_) {
		aBool6517 = false;
		anInt6530 = 0;
		anInt6520 = 0;
		anInt6524 = 0;
		try {
			aClass163_Sub3_6528 = class163_sub3;
			aClass321_Sub3_Sub1_6516 = Class216.method1392(3553, i_129_, i,
					class163_sub3, i_130_, i_128_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_128_ + ',' + i_129_ + ',' + i_130_ + ')'));
		}
	}

	Class253_Sub2(Class163_Sub3 class163_sub3, int i, int i_131_, int[] is,
			int i_132_, int i_133_) {
		aBool6517 = false;
		anInt6530 = 0;
		anInt6520 = 0;
		anInt6524 = 0;
		try {
			aClass163_Sub3_6528 = class163_sub3;
			aClass321_Sub3_Sub1_6516 = Class137.method876(false, i_132_,
					class163_sub3, is, i_133_, 34037, i, i_131_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("je.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_131_ + ',' + (is != null ? "{...}" : "null")
					+ ',' + i_132_ + ',' + i_133_ + ')'));
		}
	}
}
