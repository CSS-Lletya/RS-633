/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class311 {
	static final void method1896(int[] is, int i, int[] is_0_, int i_1_,
			int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	static final void method1897(float[] fs, int i, float[] fs_3_, int i_4_,
			int i_5_) {
		if (fs == fs_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					fs_3_[i_4_--] = fs[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			fs_3_[i_4_++] = fs[i++];
	}

	static final void method1898(byte[] is, int i, byte[] is_6_, int i_7_,
			int i_8_) {
		if (is == is_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
					is_6_[i_7_--] = is[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					is_6_[i_7_--] = is[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
			is_6_[i_7_++] = is[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			is_6_[i_7_++] = is[i++];
	}

	static final void method1899(int[] is, int i, int i_9_, int i_10_) {
		i_9_ = i + i_9_ - 7;
		while (i < i_9_) {
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
		}
		i_9_ += 7;
		while (i < i_9_)
			is[i++] = i_10_;
	}

	static final void method1900(short[] is, int i, short[] is_11_, int i_12_,
			int i_13_) {
		if (is == is_11_) {
			if (i == i_12_)
				return;
			if (i_12_ > i && i_12_ < i + i_13_) {
				i_13_--;
				i += i_13_;
				i_12_ += i_13_;
				i_13_ = i - i_13_;
				i_13_ += 7;
				while (i >= i_13_) {
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
					is_11_[i_12_--] = is[i--];
				}
				i_13_ -= 7;
				while (i >= i_13_)
					is_11_[i_12_--] = is[i--];
				return;
			}
		}
		i_13_ += i;
		i_13_ -= 7;
		while (i < i_13_) {
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
			is_11_[i_12_++] = is[i++];
		}
		i_13_ += 7;
		while (i < i_13_)
			is_11_[i_12_++] = is[i++];
	}

	static final void method1901(Object[] objects, int i, Object[] objects_14_,
			int i_15_, int i_16_) {
		if (objects == objects_14_) {
			if (i == i_15_)
				return;
			if (i_15_ > i && i_15_ < i + i_16_) {
				i_16_--;
				i += i_16_;
				i_15_ += i_16_;
				i_16_ = i - i_16_;
				i_16_ += 7;
				while (i >= i_16_) {
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
					objects_14_[i_15_--] = objects[i--];
				}
				i_16_ -= 7;
				while (i >= i_16_)
					objects_14_[i_15_--] = objects[i--];
				return;
			}
		}
		i_16_ += i;
		i_16_ -= 7;
		while (i < i_16_) {
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
			objects_14_[i_15_++] = objects[i++];
		}
		i_16_ += 7;
		while (i < i_16_)
			objects_14_[i_15_++] = objects[i++];
	}

	static final void method1902(int[] is, int i, int i_17_) {
		i_17_ = i + i_17_ - 7;
		while (i < i_17_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_17_ += 7;
		while (i < i_17_)
			is[i++] = 0;
	}
}
