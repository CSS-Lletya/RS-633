/* Class11_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

final class Class11_Sub37 extends Class11 {
	int[] anIntArray7082 = { -1 };
	static int anInt7083;
	static int anInt7084;
	static int[] anIntArray7085;
	static int anInt7086;
	static int anInt7087;
	int[] anIntArray7088 = new int[1];
	static Class289 aClass289_7089;
	static int[] anIntArray7090 = new int[5];
	static Class289 aClass289_7091;
	static Class289 aClass289_7092;
	static Class289 aClass289_7093;
	static Class289 aClass289_7094;
	static Class289 aClass289_7095;
	static Class289 aClass289_7096;
	static Class289 aClass289_7097;
	static Class289 aClass289_7098;
	static Class289 aClass289_7099;
	static Class289 aClass289_7100;
	static Class289 aClass289_7101;
	static Class289 aClass289_7102;
	static Class289 aClass289_7103;
	private static Class289[] aClass289Array7104;

	static final float[] method2885(float f, int i, int i_0_, byte i_1_,
			int i_2_, float f_3_, int i_4_, float f_5_) {
		try {
			anInt7086++;
			float[] fs = new float[9];
			float[] fs_6_ = new float[9];
			float f_7_ = (float) Math.cos((double) ((float) i * 0.024543693F));
			float f_8_ = (float) Math.sin((double) (0.024543693F * (float) i));
			fs[5] = 0.0F;
			float f_9_ = 1.0F - f_7_;
			fs[7] = 0.0F;
			fs[1] = 0.0F;
			int i_10_ = -50 / ((i_1_ - 60) / 53);
			fs[3] = 0.0F;
			fs[6] = -f_8_;
			fs[2] = f_8_;
			fs[4] = 1.0F;
			fs[0] = f_7_;
			fs[8] = f_7_;
			float[] fs_11_ = new float[9];
			float f_12_ = 1.0F;
			float f_13_ = 0.0F;
			f_7_ = (float) i_0_ / 32767.0F;
			f_8_ = -(float) Math.sqrt((double) (-(f_7_ * f_7_) + 1.0F));
			f_9_ = 1.0F - f_7_;
			float f_14_ = (float) Math
					.sqrt((double) (i_2_ * i_2_ + i_4_ * i_4_));
			if (f_14_ == 0.0F && f_7_ == 0.0F)
				fs_6_ = fs;
			else {
				if (f_14_ != 0.0F) {
					f_13_ = (float) i_4_ / f_14_;
					f_12_ = (float) -i_2_ / f_14_;
				}
				fs_11_[0] = f_12_ * f_12_ * f_9_ + f_7_;
				fs_11_[4] = f_7_;
				fs_11_[5] = f_8_ * f_12_;
				fs_11_[3] = -f_13_ * f_8_;
				fs_11_[2] = f_13_ * f_12_ * f_9_;
				fs_11_[8] = f_13_ * f_13_ * f_9_ + f_7_;
				fs_11_[6] = f_9_ * (f_12_ * f_13_);
				fs_11_[1] = f_13_ * f_8_;
				fs_11_[7] = f_8_ * -f_12_;
				fs_6_[0] = fs[2] * fs_11_[6]
						+ (fs_11_[3] * fs[1] + fs_11_[0] * fs[0]);
				fs_6_[1] = (fs_11_[4] * fs[1] + fs_11_[1] * fs[0] + fs_11_[7]
						* fs[2]);
				fs_6_[2] = (fs[1] * fs_11_[5] + fs_11_[2] * fs[0] + fs[2]
						* fs_11_[8]);
				fs_6_[3] = (fs[4] * fs_11_[3] + fs[3] * fs_11_[0] + fs[5]
						* fs_11_[6]);
				fs_6_[4] = (fs_11_[1] * fs[3] + fs_11_[4] * fs[4] + fs_11_[7]
						* fs[5]);
				fs_6_[6] = (fs[6] * fs_11_[0] + fs[7] * fs_11_[3] + fs[8]
						* fs_11_[6]);
				fs_6_[5] = (fs_11_[2] * fs[3] + fs_11_[5] * fs[4] + fs_11_[8]
						* fs[5]);
				fs_6_[7] = (fs_11_[4] * fs[7] + fs[6] * fs_11_[1] + fs[8]
						* fs_11_[7]);
				fs_6_[8] = (fs_11_[5] * fs[7] + fs_11_[2] * fs[6] + fs_11_[8]
						* fs[8]);
			}
			fs_6_[8] *= f_3_;
			fs_6_[0] *= f_5_;
			fs_6_[7] *= f_3_;
			fs_6_[2] *= f_5_;
			fs_6_[1] *= f_5_;
			fs_6_[3] *= f;
			fs_6_[5] *= f;
			fs_6_[4] *= f;
			fs_6_[6] *= f_3_;
			return fs_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ps.A(" + f + ',' + i
					+ ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + f_3_ + ','
					+ i_4_ + ',' + f_5_ + ')'));
		}
	}

	static final void method2886(byte i) {
		try {
			if (Class321_Sub2.aClass163_6648.method1074()) {
				Class321_Sub2.aClass163_6648
						.method1075(Class11_Sub45_Sub13.aCanvas9308);
				Class335_Sub2.method2822(98);
				if (!Class11_Sub2_Sub19.aBool9087) {
					Dimension dimension = Class11_Sub45_Sub13.aCanvas9308
							.getSize();
					Class321_Sub2.aClass163_6648.method1025(
							Class11_Sub45_Sub13.aCanvas9308, dimension.width,
							dimension.height);
				} else
					Class352.method2111(27634, Class11_Sub45_Sub13.aCanvas9308);
				Class321_Sub2.aClass163_6648
						.method1054(Class11_Sub45_Sub13.aCanvas9308);
			} else
				Class239.method1521(
						false,
						0,
						((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5696
								.method3181(false));
			anInt7083++;
			if (i > -22)
				method2885(-0.8139066F, 16, -43, (byte) 40, -107, -1.914978F,
						-23, 0.7198109F);
			Class307.method1879(-101);
			Class333.aBool4411 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ps.C(" + i + ')');
		}
	}

	public static void method2887(int i) {
		try {
			aClass289_7094 = null;
			aClass289_7102 = null;
			aClass289_7103 = null;
			aClass289_7100 = null;
			aClass289_7096 = null;
			aClass289_7093 = null;
			aClass289_7101 = null;
			aClass289_7092 = null;
			anIntArray7090 = null;
			aClass289_7089 = null;
			aClass289_7091 = null;
			aClass289_7097 = null;
			if (i != 19)
				method2885(-0.91950655F, -85, 107, (byte) -91, 15,
						-0.18214524F, -76, -0.38330656F);
			aClass289_7095 = null;
			aClass289_7099 = null;
			anIntArray7085 = null;
			aClass289Array7104 = null;
			aClass289_7098 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ps.E(" + i + ')');
		}
	}

	private final long method2888(int i, boolean bool, int[] is, int i_15_,
			int[] is_16_) {
		try {
			anInt7087++;
			long[] ls = Class23.aLongArray228;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) (((long) (i >> 8) ^ l) & 0xffL)];
			l = l >>> 8 ^ ls[(int) (((long) i ^ l) & 0xffL)];
			for (int i_17_ = 0; (is.length ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
				l = (ls[(int) (((long) (is[i_17_] >> 24) ^ l) & 0xffL)] ^ l >>> 8);
				l = l >>> 8
						^ ls[(int) (0xffL & ((long) (is[i_17_] >> 16) ^ l))];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_17_] >> 8)) & 0xffL)];
				l = ls[(int) (0xffL & (l ^ (long) is[i_17_]))] ^ l >>> 8;
			}
			if (is_16_ != null) {
				for (int i_18_ = 0; (i_18_ ^ 0xffffffff) > -6; i_18_++)
					l = l >>> 8
							^ ls[(int) ((l ^ (long) is_16_[i_18_]) & 0xffL)];
			}
			l = ls[(int) (((long) (bool ? 1 : 0) ^ l) & 0xffL)] ^ l >>> 8;
			if (i_15_ < 39)
				aClass289Array7104 = null;
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ps.D(" + i + ','
					+ bool + ',' + (is != null ? "{...}" : "null") + ','
					+ i_15_ + ',' + (is_16_ != null ? "{...}" : "null") + ')'));
		}
	}

	final Class206 method2889(boolean bool, byte i, Class281 class281,
			int i_19_, Class163 class163, int i_20_, int i_21_, int i_22_,
			int i_23_, Class258 class258) {
		try {
			anInt7084++;
			if (i >= -62)
				aClass289_7097 = null;
			Class206 class206 = null;
			int i_24_ = i_20_;
			Class39 class39 = null;
			if (i_19_ != -1)
				class39 = Class108_Sub26.aClass127_7833.method829(i_19_, 64);
			int[] is = ((Class11_Sub37) this).anIntArray7082;
			if (class39 != null && ((Class39) class39).anIntArray553 != null) {
				is = new int[((Class39) class39).anIntArray553.length];
				for (int i_25_ = 0; i_25_ < ((Class39) class39).anIntArray553.length; i_25_++) {
					int i_26_ = ((Class39) class39).anIntArray553[i_25_];
					if (i_26_ < 0
							|| (((Class11_Sub37) this).anIntArray7082.length <= i_26_))
						is[i_25_] = -1;
					else
						is[i_25_] = ((Class11_Sub37) this).anIntArray7082[i_26_];
				}
			}
			boolean bool_27_ = false;
			boolean bool_28_ = false;
			boolean bool_29_ = false;
			boolean bool_30_ = false;
			int i_31_ = -1;
			int i_32_ = -1;
			int i_33_ = 0;
			Class11_Sub45_Sub18 class11_sub45_sub18 = null;
			Class11_Sub45_Sub18 class11_sub45_sub18_34_ = null;
			if (class281 != null) {
				i_31_ = ((Class281) class281).anIntArray3794[i_23_];
				i_24_ |= 0x20;
				int i_35_ = i_31_ >>> 16;
				class11_sub45_sub18 = Class108_Sub23.aClass198_7760.method1280(
						111, i_35_);
				i_31_ &= 0xffff;
				if (class11_sub45_sub18 != null) {
					bool_28_ |= class11_sub45_sub18.method3760(false, i_31_);
					bool_27_ |= class11_sub45_sub18.method3759(126, i_31_);
					bool_30_ |= class11_sub45_sub18.method3755(i_31_, 1);
					bool_29_ |= ((Class281) class281).aBool3820;
				}
				if ((((Class281) class281).aBool3798 || Class11_Sub2_Sub11.aBool8858)
						&& i_21_ != -1
						&& i_21_ < ((Class281) class281).anIntArray3794.length) {
					i_32_ = ((Class281) class281).anIntArray3794[i_21_];
					i_33_ = ((Class281) class281).anIntArray3817[i_23_];
					int i_36_ = i_32_ >>> 16;
					i_32_ &= 0xffff;
					if ((i_35_ ^ 0xffffffff) != (i_36_ ^ 0xffffffff))
						class11_sub45_sub18_34_ = Class108_Sub23.aClass198_7760
								.method1280(59, i_32_ >>> 16);
					else
						class11_sub45_sub18_34_ = class11_sub45_sub18;
					if (class11_sub45_sub18_34_ != null) {
						bool_28_ |= class11_sub45_sub18_34_.method3760(false,
								i_32_);
						bool_27_ |= class11_sub45_sub18_34_.method3759(127,
								i_32_);
						bool_30_ |= class11_sub45_sub18_34_
								.method3755(i_32_, 1);
					}
				}
				if (bool_28_)
					i_24_ |= 0x80;
				if (bool_27_)
					i_24_ |= 0x100;
				if (bool_29_)
					i_24_ |= 0x200;
				if (bool_30_)
					i_24_ |= 0x400;
			}
			long l = method2888(i_19_, bool, is, 70, (class258 == null ? null
					: ((Class258) class258).anIntArray3529));
			if (Class10.aClass22_82 != null)
				class206 = (Class206) Class10.aClass22_82.method188(l,
						(byte) 81);
			if (class206 == null
					|| (class163.method1065(class206.ua(), i_24_) ^ 0xffffffff) != -1) {
				if (class206 != null)
					i_24_ = class163.method1077(i_24_, class206.ua());
				int i_37_ = i_24_;
				boolean bool_38_ = false;
				for (int i_39_ = 0; i_39_ < is.length; i_39_++) {
					if (is[i_39_] != -1
							&& !Packet.aClass223_8723.method1430(is[i_39_],
									false).method1576(bool, (byte) 42))
						bool_38_ = true;
				}
				if (bool_38_)
					return null;
				Class179[] class179s = new Class179[is.length];
				for (int i_40_ = 0; is.length > i_40_; i_40_++) {
					if (is[i_40_] != -1)
						class179s[i_40_] = Packet.aClass223_8723.method1430(
								is[i_40_], false).method1584(bool, 4371);
				}
				if (class39 != null
						&& ((Class39) class39).anIntArrayArray564 != null) {
					for (int i_41_ = 0; i_41_ < ((Class39) class39).anIntArrayArray564.length; i_41_++) {
						if ((((Class39) class39).anIntArrayArray564[i_41_] != null)
								&& class179s[i_41_] != null) {
							int i_42_ = (((Class39) class39).anIntArrayArray564[i_41_][0]);
							int i_43_ = (((Class39) class39).anIntArrayArray564[i_41_][1]);
							int i_44_ = (((Class39) class39).anIntArrayArray564[i_41_][2]);
							int i_45_ = (((Class39) class39).anIntArrayArray564[i_41_][3]);
							int i_46_ = (((Class39) class39).anIntArrayArray564[i_41_][4]);
							int i_47_ = (((Class39) class39).anIntArrayArray564[i_41_][5]);
							if ((i_45_ ^ 0xffffffff) != -1
									|| (i_46_ ^ 0xffffffff) != -1 || i_47_ != 0)
								class179s[i_41_].method1172(i_45_, i_47_, 0,
										i_46_);
							if (i_42_ != 0 || i_43_ != 0
									|| (i_44_ ^ 0xffffffff) != -1)
								class179s[i_41_].method1163(i_43_, (byte) 79,
										i_44_, i_42_);
						}
					}
				}
				if (class258 != null)
					i_37_ |= 0x4000;
				Class179 class179 = new Class179(class179s, class179s.length);
				class206 = class163.method1020(class179, i_37_,
						Class310.anInt4148, 64, 850);
				if (class258 != null) {
					for (int i_48_ = 0; i_48_ < 5; i_48_++) {
						for (int i_49_ = 0; ((i_49_ ^ 0xffffffff) > (Class34.aShortArrayArrayArray463.length ^ 0xffffffff)); i_49_++) {
							if ((((Class258) class258).anIntArray3529[i_48_] ^ 0xffffffff) > ((Class34.aShortArrayArrayArray463[i_49_][i_48_]).length ^ 0xffffffff))
								class206.ia(
										(Class11_Sub46.aShortArrayArray7982[i_49_][i_48_]),
										(Class34.aShortArrayArrayArray463[i_49_][i_48_][(((Class258) class258).anIntArray3529[i_48_])]));
						}
					}
				}
				if (Class10.aClass22_82 != null) {
					class206.s(i_24_);
					Class10.aClass22_82.method184((byte) 127, class206, l);
				}
			}
			if (class281 == null || class11_sub45_sub18 == null)
				return class206;
			Class206 class206_50_ = class206.method1313((byte) 1, i_24_, true);
			class206_50_.method1304(class11_sub45_sub18, -1 + i_22_, i_31_,
					i_32_, ((Class281) class281).aBool3820, 0, i_33_,
					class11_sub45_sub18_34_, 1000);
			return class206_50_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ps.B(" + bool + ','
					+ i + ',' + (class281 != null ? "{...}" : "null") + ','
					+ i_19_ + ',' + (class163 != null ? "{...}" : "null") + ','
					+ i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ','
					+ (class258 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class11_Sub37() {
		/* empty */
	}

	static {
		aClass289_7089 = new Class289(14, 0);
		aClass289_7091 = new Class289(15, 4);
		aClass289_7092 = new Class289(16, -2);
		aClass289_7093 = new Class289(17, 0);
		aClass289_7094 = new Class289(18, -2);
		aClass289_7095 = new Class289(19, -2);
		aClass289_7096 = new Class289(20, 6);
		aClass289_7097 = new Class289(21, 9);
		aClass289_7098 = new Class289(22, -2);
		aClass289_7099 = new Class289(23, 4);
		aClass289_7100 = new Class289(24, -1);
		aClass289_7101 = new Class289(26, 0);
		aClass289_7102 = new Class289(27, 0);
		aClass289_7103 = new Class289(28, -2);
		aClass289Array7104 = new Class289[32];
		Class289[] class289s = Class24.method209(0);
		for (int i = 0; i < class289s.length; i++)
			aClass289Array7104[((Class289) class289s[i]).opcode] = class289s[i];
	}
}
