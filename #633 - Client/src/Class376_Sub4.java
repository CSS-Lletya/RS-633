/* Class376_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub4 extends Class376 {
	int anInt6122;
	int anInt6123;
	boolean aBool6124 = false;
	int anInt6125;
	int anInt6126;
	int anInt6127;

	final boolean method2613(int i, int i_0_) {
		if (!((Class376_Sub4) this).aBool6124)
			return false;
		int i_1_ = (((Class376_Sub4) this).anInt6127 - ((Class376_Sub4) this).anInt6122);
		int i_2_ = (((Class376_Sub4) this).anInt6126 - ((Class376_Sub4) this).anInt6123);
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = (i * i_1_ + i_0_ * i_2_ - (((Class376_Sub4) this).anInt6122
				* i_1_ + ((Class376_Sub4) this).anInt6123 * i_2_));
		if (i_4_ <= 0) {
			int i_5_ = ((Class376_Sub4) this).anInt6122 - i;
			int i_6_ = ((Class376_Sub4) this).anInt6123 - i_0_;
			if (i_5_ * i_5_ + i_6_ * i_6_ >= (((Class376_Sub4) this).anInt6125 * ((Class376_Sub4) this).anInt6125))
				return false;
			return true;
		}
		if (i_4_ > i_3_) {
			int i_7_ = ((Class376_Sub4) this).anInt6127 - i;
			int i_8_ = ((Class376_Sub4) this).anInt6126 - i_0_;
			if (i_7_ * i_7_ + i_8_ * i_8_ >= (((Class376_Sub4) this).anInt6125 * ((Class376_Sub4) this).anInt6125))
				return false;
			return true;
		}
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = ((Class376_Sub4) this).anInt6122 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = ((Class376_Sub4) this).anInt6123 + (i_2_ * i_4_ >> 10)
				- i_0_;
		if (i_9_ * i_9_ + i_10_ * i_10_ >= (((Class376_Sub4) this).anInt6125 * ((Class376_Sub4) this).anInt6125))
			return false;
		return true;
	}

	public Class376_Sub4() {
		/* empty */
	}
}
