/* Class107_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class107_Sub2 extends Class107 {
	private Class337 aClass337_5342;
	private Class321_Sub3_Sub1 aClass321_Sub3_Sub1_5343;
	private Class163_Sub3 aClass163_Sub3_5344;
	private boolean aBool5345;

	final void method703(char c, int i, int i_0_, int i_1_, boolean bool,
			Class72 class72, int i_2_, int i_3_) {
		Class72_Sub3 class72_sub3 = (Class72_Sub3) class72;
		Class321_Sub3_Sub1 class321_sub3_sub1 = ((Class72_Sub3) class72_sub3).aClass321_Sub3_Sub1_7312;
		aClass163_Sub3_5344.method3257(4);
		aClass163_Sub3_5344.method3295(aClass321_Sub3_Sub1_5343, 92);
		if (aBool5345 || bool) {
			aClass163_Sub3_5344.method3315(false, 7681, 8448);
			aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 34168);
		} else
			aClass163_Sub3_5344.method3315(false, 7681, 7681);
		aClass163_Sub3_5344.method3253(1, true);
		aClass163_Sub3_5344.method3295(class321_sub3_sub1, 105);
		aClass163_Sub3_5344.method3315(false, 7681, 8448);
		aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9255 / (float) ((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9259);
		float f_4_ = (((Class321_Sub3_Sub1) class321_sub3_sub1).aFloat9253 / (float) ((Class321_Sub3_Sub1) class321_sub3_sub1).anInt9254);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F,
				(float) -i_2_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F,
				(float) -i_3_ * f_4_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_,
				(byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		aClass337_5342.method2026(-24, c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 5890);
		aClass163_Sub3_5344.method3315(false, 8448, 8448);
		aClass163_Sub3_5344.method3295(null, 66);
		aClass163_Sub3_5344.method3253(0, true);
		if (aBool5345 || bool)
			aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 5890);
	}

	final void fa(char c, int i, int i_5_, int i_6_, boolean bool) {
		aClass163_Sub3_5344.method3257(4);
		aClass163_Sub3_5344.method3295(aClass321_Sub3_Sub1_5343, 62);
		if (aBool5345 || bool) {
			aClass163_Sub3_5344.method3315(false, 7681, 8448);
			aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 34168);
		} else
			aClass163_Sub3_5344.method3315(false, 7681, 7681);
		OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_,
				(byte) (i_6_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
		aClass337_5342.method2026(-32, c);
		OpenGL.glLoadIdentity();
		if (aBool5345 || bool)
			aClass163_Sub3_5344.method3252((byte) 34, 0, 768, 5890);
	}

	Class107_Sub2(Class163_Sub3 class163_sub3, Class292 class292,
			Class80[] class80s, boolean bool) {
		super(class163_sub3, class292);
		aClass163_Sub3_5344 = class163_sub3;
		int i = 0;
		for (int i_7_ = 0; i_7_ < 256; i_7_++) {
			Class80 class80 = class80s[i_7_];
			if (((Class80) class80).anInt1082 > i)
				i = ((Class80) class80).anInt1082;
			if (((Class80) class80).anInt1075 > i)
				i = ((Class80) class80).anInt1075;
		}
		int i_8_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_8_ * i_8_];
			for (int i_9_ = 0; i_9_ < 256; i_9_++) {
				Class80 class80 = class80s[i_9_];
				int i_10_ = ((Class80) class80).anInt1082;
				int i_11_ = ((Class80) class80).anInt1075;
				int i_12_ = i_9_ % 16 * i;
				int i_13_ = i_9_ / 16 * i;
				int i_14_ = i_13_ * i_8_ + i_12_;
				int i_15_ = 0;
				if (((Class80) class80).aByteArray1078 == null) {
					byte[] is_16_ = ((Class80) class80).aByteArray1079;
					for (int i_17_ = 0; i_17_ < i_10_; i_17_++) {
						for (int i_18_ = 0; i_18_ < i_11_; i_18_++)
							is[i_14_++] = (byte) (is_16_[i_15_++] == 0 ? 0 : -1);
						i_14_ += i_8_ - i_11_;
					}
				} else {
					byte[] is_19_ = ((Class80) class80).aByteArray1078;
					for (int i_20_ = 0; i_20_ < i_10_; i_20_++) {
						for (int i_21_ = 0; i_21_ < i_11_; i_21_++)
							is[i_14_++] = is_19_[i_15_++];
						i_14_ += i_8_ - i_11_;
					}
				}
			}
			aClass321_Sub3_Sub1_5343 = Class236_Sub9.method3119(true, i_8_,
					false, i_8_, is, class163_sub3, 6406, 6406);
			aBool5345 = true;
		} else {
			int[] is = new int[i_8_ * i_8_];
			for (int i_22_ = 0; i_22_ < 256; i_22_++) {
				Class80 class80 = class80s[i_22_];
				int[] is_23_ = ((Class80) class80).anIntArray1074;
				byte[] is_24_ = ((Class80) class80).aByteArray1078;
				byte[] is_25_ = ((Class80) class80).aByteArray1079;
				int i_26_ = ((Class80) class80).anInt1082;
				int i_27_ = ((Class80) class80).anInt1075;
				int i_28_ = i_22_ % 16 * i;
				int i_29_ = i_22_ / 16 * i;
				int i_30_ = i_29_ * i_8_ + i_28_;
				int i_31_ = 0;
				if (is_24_ != null) {
					for (int i_32_ = 0; i_32_ < i_26_; i_32_++) {
						for (int i_33_ = 0; i_33_ < i_27_; i_33_++) {
							is[i_30_++] = (is_24_[i_31_] << 24 | is_23_[is_25_[i_31_] & 0xff]);
							i_31_++;
						}
						i_30_ += i_8_ - i_27_;
					}
				} else {
					for (int i_34_ = 0; i_34_ < i_26_; i_34_++) {
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
							int i_36_;
							if ((i_36_ = is_25_[i_31_++]) != 0)
								is[i_30_++] = ~0xffffff | is_23_[i_36_ & 0xff];
							else
								i_30_++;
						}
						i_30_ += i_8_ - i_27_;
					}
				}
			}
			aClass321_Sub3_Sub1_5343 = Class137.method876(false, 0,
					class163_sub3, is, 0, 34037, i_8_, i_8_);
			aBool5345 = false;
		}
		aClass321_Sub3_Sub1_5343.method1963(false, false);
		aClass337_5342 = new Class337(class163_sub3, 256);
		float f = (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9255 / (float) (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).anInt9259));
		float f_37_ = (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9253 / (float) (((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).anInt9254));
		for (int i_38_ = 0; i_38_ < 256; i_38_++) {
			Class80 class80 = class80s[i_38_];
			int i_39_ = ((Class80) class80).anInt1082;
			int i_40_ = ((Class80) class80).anInt1075;
			int i_41_ = ((Class80) class80).anInt1077;
			int i_42_ = ((Class80) class80).anInt1080;
			float f_43_ = (float) (i_38_ % 16 * i);
			float f_44_ = (float) (i_38_ / 16 * i);
			float f_45_ = f_43_ * f;
			float f_46_ = f_44_ * f_37_;
			float f_47_ = (f_43_ + (float) i_40_) * f;
			float f_48_ = (f_44_ + (float) i_39_) * f_37_;
			aClass337_5342.method2028(i_38_, 119);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_45_,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9253
							- f_46_);
			OpenGL.glVertex2i(i_42_, i_41_);
			OpenGL.glTexCoord2f(f_45_,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9253
							- f_48_);
			OpenGL.glVertex2i(i_42_, i_41_ + i_39_);
			OpenGL.glTexCoord2f(f_47_,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9253
							- f_48_);
			OpenGL.glVertex2i(i_42_ + i_40_, i_41_ + i_39_);
			OpenGL.glTexCoord2f(f_47_,
					((Class321_Sub3_Sub1) aClass321_Sub3_Sub1_5343).aFloat9253
							- f_46_);
			OpenGL.glVertex2i(i_42_ + i_40_, i_41_);
			OpenGL.glEnd();
			aClass337_5342.method2027(-50135600);
		}
	}
}
