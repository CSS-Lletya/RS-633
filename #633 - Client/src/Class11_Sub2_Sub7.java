/* Class11_Sub2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class11_Sub2_Sub7 extends Class11_Sub2 {
	private int anInt8727 = 1;
	static int anInt8728;
	static int anInt8729 = 0;
	private int anInt8730 = 1;
	static int anInt8731;
	static int anInt8732;
	static int anInt8733;
	static int anInt8734 = 1;
	static int anInt8735;
	static int anInt8736;

	final int[][] method2255(int i, int i_0_) {
		try {
			anInt8735++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
				int i_1_ = anInt8727 + (anInt8727 + 1);
				int i_2_ = 65536 / i_1_;
				int i_3_ = 1 + (anInt8730 + anInt8730);
				int i_4_ = 65536 / i_3_;
				int[][][] is_5_ = new int[i_1_][][];
				for (int i_6_ = -anInt8727 + i; (i_6_ ^ 0xffffffff) >= (anInt8727
						+ i ^ 0xffffffff); i_6_++) {
					int[][] is_7_ = this.method2262(
							(Class11_Sub45_Sub16_Sub2.anInt10167 & i_6_), -54,
							0);
					int[][] is_8_ = new int[3][Class33_Sub2.anInt6696];
					int i_9_ = 0;
					int i_10_ = 0;
					int i_11_ = 0;
					int[] is_12_ = is_7_[0];
					int[] is_13_ = is_7_[1];
					int[] is_14_ = is_7_[2];
					for (int i_15_ = -anInt8730; (i_15_ ^ 0xffffffff) >= (anInt8730 ^ 0xffffffff); i_15_++) {
						int i_16_ = Class297.anInt4024 & i_15_;
						i_11_ += is_14_[i_16_];
						i_9_ += is_12_[i_16_];
						i_10_ += is_13_[i_16_];
					}
					int[] is_17_ = is_8_[0];
					int[] is_18_ = is_8_[1];
					int[] is_19_ = is_8_[2];
					int i_20_ = 0;
					while ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_20_ ^ 0xffffffff)) {
						is_17_[i_20_] = i_4_ * i_9_ >> 16;
						is_18_[i_20_] = i_10_ * i_4_ >> 16;
						is_19_[i_20_] = i_4_ * i_11_ >> 16;
						int i_21_ = Class297.anInt4024 & -anInt8730 + i_20_;
						i_9_ -= is_12_[i_21_];
						i_10_ -= is_13_[i_21_];
						i_11_ -= is_14_[i_21_];
						i_20_++;
						i_21_ = anInt8730 + i_20_ & Class297.anInt4024;
						i_10_ += is_13_[i_21_];
						i_9_ += is_12_[i_21_];
						i_11_ += is_14_[i_21_];
					}
					is_5_[-i + (i_6_ - -anInt8727)] = is_8_;
				}
				int[] is_22_ = is[0];
				int[] is_23_ = is[1];
				int[] is_24_ = is[2];
				for (int i_25_ = 0; i_25_ < Class33_Sub2.anInt6696; i_25_++) {
					int i_26_ = 0;
					int i_27_ = 0;
					int i_28_ = 0;
					for (int i_29_ = 0; i_29_ < i_1_; i_29_++) {
						int[][] is_30_ = is_5_[i_29_];
						i_28_ += is_30_[2][i_25_];
						i_27_ += is_30_[1][i_25_];
						i_26_ += is_30_[0][i_25_];
					}
					is_22_[i_25_] = i_2_ * i_26_ >> 16;
					is_23_[i_25_] = i_2_ * i_27_ >> 16;
					is_24_[i_25_] = i_2_ * i_28_ >> 16;
				}
			}
			if (i_0_ != 1)
				return null;
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aj.I(" + i + ','
					+ i_0_ + ')');
		}
	}

	public Class11_Sub2_Sub7() {
		super(1, false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8728++;
			if (bool != true)
				anInt8734 = 89;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_31_ = 1 + (anInt8727 - -anInt8727);
				int i_32_ = 65536 / i_31_;
				int i_33_ = anInt8730 + (anInt8730 + 1);
				int i_34_ = 65536 / i_33_;
				int[][] is_35_ = new int[i_31_][];
				for (int i_36_ = -anInt8727 + i; anInt8727 + i >= i_36_; i_36_++) {
					int[] is_37_ = this.method2260(4463, 0, i_36_
							& (Class11_Sub45_Sub16_Sub2.anInt10167));
					int[] is_38_ = new int[Class33_Sub2.anInt6696];
					int i_39_ = 0;
					for (int i_40_ = -anInt8730; anInt8730 >= i_40_; i_40_++)
						i_39_ += is_37_[Class297.anInt4024 & i_40_];
					int i_41_ = 0;
					while (i_41_ < Class33_Sub2.anInt6696) {
						is_38_[i_41_] = i_34_ * i_39_ >> 16;
						i_39_ -= is_37_[-anInt8730 + i_41_ & Class297.anInt4024];
						i_41_++;
						i_39_ += is_37_[Class297.anInt4024 & i_41_ + anInt8730];
					}
					is_35_[anInt8727 + i_36_ + -i] = is_38_;
				}
				for (int i_42_ = 0; Class33_Sub2.anInt6696 > i_42_; i_42_++) {
					int i_43_ = 0;
					for (int i_44_ = 0; (i_31_ ^ 0xffffffff) < (i_44_ ^ 0xffffffff); i_44_++)
						i_43_ += is_35_[i_44_][i_42_];
					is[i_42_] = i_43_ * i_32_ >> 16;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aj.A(" + i + ','
					+ bool + ')');
		}
	}

	static final void method3428(Rectangle[] rectangles, int i, byte i_45_)
			throws Exception_Sub1 {
		try {
			anInt8736++;
			if (i_45_ == -66) {
				if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) != -2)
					Class243.aClass163_3308.method1004(rectangles, i, 0, 0);
				else
					Class243.aClass163_3308.method1004(rectangles, i,
							Class292.anInt3955, Class218.anInt3004);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aj.C("
					+ (rectangles != null ? "{...}" : "null") + ',' + i + ','
					+ i_45_ + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_46_) {
		try {
			if (i != 3731)
				method2254(66, false);
			int i_47_ = i_46_;
			while_105_: do {
				do {
					if ((i_47_ ^ 0xffffffff) != -1) {
						if ((i_47_ ^ 0xffffffff) != -2) {
							if (i_47_ == 2)
								break;
							break while_105_;
						}
					} else {
						anInt8730 = stream.readUnsignedByte((byte) 35);
						break while_105_;
					}
					anInt8727 = stream.readUnsignedByte((byte) 35);
					break while_105_;
				} while (false);
				((Class11_Sub2) this).aBool5044 = stream
						.readUnsignedByte((byte) 35) == 1;
			} while (false);
			anInt8732++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aj.B(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_46_ + ')'));
		}
	}

	static final Class272 method3429(byte i, Stream stream) {
		try {
			anInt8733++;
			int i_48_ = stream.readUnsignedByte((byte) 35);
			Class118 class118 = Class239.method1519(-11911)[stream
					.readUnsignedByte((byte) 35)];
			Class150 class150 = Class171.method1124(25992)[stream
					.readUnsignedByte((byte) 35)];
			int i_49_ = stream.method2508((byte) -89);
			int i_50_ = stream.method2508((byte) 75);
			int i_51_ = stream.readUnsignedShort((byte) -65);
			int i_52_ = stream.readUnsignedShort((byte) -65);
			if (i < 16)
				anInt8734 = -27;
			int i_53_ = stream.readInt(124);
			int i_54_ = stream.readInt(101);
			int i_55_ = stream.readInt(106);
			boolean bool = stream.readUnsignedByte((byte) 35) == 1;
			return new Class272(i_48_, class118, class150, i_49_, i_50_, i_51_,
					i_52_, i_53_, i_54_, i_55_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aj.E(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}
}
