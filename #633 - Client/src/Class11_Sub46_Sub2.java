/* Class11_Sub46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub46_Sub2 extends Class11_Sub46 {
	static int anInt9056;
	static int anInt9057;
	static int anInt9058;
	static int anInt9059;
	static boolean aBool9060;

	static final void method3554(int i, int i_0_, long[] ls, int i_1_,
			Object[] objects) {
		do {
			try {
				if ((i_1_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
					int i_2_ = (i - -i_1_) / 2;
					int i_3_ = i;
					long l = ls[i_2_];
					ls[i_2_] = ls[i_1_];
					ls[i_1_] = l;
					Object object = objects[i_2_];
					objects[i_2_] = objects[i_1_];
					objects[i_1_] = object;
					int i_4_ = ((l ^ 0xffffffffffffffffL) == -9223372036854775808L ? 0
							: 1);
					for (int i_5_ = i; (i_5_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff); i_5_++) {
						if ((ls[i_5_] ^ 0xffffffffffffffffL) > (l
								- -(long) (i_4_ & i_5_) ^ 0xffffffffffffffffL)) {
							long l_6_ = ls[i_5_];
							ls[i_5_] = ls[i_3_];
							ls[i_3_] = l_6_;
							Object object_7_ = objects[i_5_];
							objects[i_5_] = objects[i_3_];
							objects[i_3_++] = object_7_;
						}
					}
					ls[i_1_] = ls[i_3_];
					ls[i_3_] = l;
					objects[i_1_] = objects[i_3_];
					objects[i_3_] = object;
					method3554(i, i_0_, ls, -1 + i_3_, objects);
					method3554(i_3_ + 1, i_0_, ls, i_1_, objects);
				}
				anInt9057++;
				if (i_0_ == 29288)
					break;
				method3555(-13L, 9);
			} catch (RuntimeException runtimeexception) {
				throw Class205
						.method1298(runtimeexception, ("hq.A(" + i + ',' + i_0_
								+ ',' + (ls != null ? "{...}" : "null") + ','
								+ i_1_ + ','
								+ (objects != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	Class11_Sub46_Sub2(int i, int i_8_, int i_9_, int i_10_, int i_11_, float f) {
		super(i, i_8_, i_9_, i_10_, i_11_, f);
	}

	final void method3202(float f, int i) {
		do {
			try {
				((Class11_Sub46) this).aFloat7973 = f;
				anInt9059++;
				if (i == 65536)
					break;
				aBool9060 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hq.D(" + f + ','
						+ i + ')');
			}
			break;
		} while (false);
	}

	static final void method3555(long l, int i) {
		try {
			anInt9058++;
			int i_12_ = Class38.anInt508;
			int i_13_ = Class201.anInt2713;
			if ((i_12_ ^ 0xffffffff) != (Class94_Sub4.anInt7728 ^ 0xffffffff)) {
				int i_14_ = i_12_ + -Class94_Sub4.anInt7728;
				int i_15_ = (int) ((long) i_14_ * l / 320L);
				if ((i_14_ ^ 0xffffffff) < -1) {
					if ((i_15_ ^ 0xffffffff) == -1)
						i_15_ = 1;
					else if (i_15_ > i_14_)
						i_15_ = i_14_;
				} else if (i_15_ == 0)
					i_15_ = -1;
				else if ((i_15_ ^ 0xffffffff) > (i_14_ ^ 0xffffffff))
					i_15_ = i_14_;
				Class94_Sub4.anInt7728 += i_15_;
			}
			if (i == 15784) {
				Class219_Sub1.aFloat7244 += Class175.aFloat2228 * (float) l
						/ 40.0F * 8.0F;
				if ((Class279.anInt3771 ^ 0xffffffff) != (i_13_ ^ 0xffffffff)) {
					int i_16_ = -Class279.anInt3771 + i_13_;
					int i_17_ = (int) ((long) i_16_ * l / 320L);
					if (i_16_ <= 0) {
						if ((i_17_ ^ 0xffffffff) != -1) {
							if (i_16_ > i_17_)
								i_17_ = i_16_;
						} else
							i_17_ = -1;
					} else if (i_17_ != 0) {
						if (i_17_ > i_16_)
							i_17_ = i_16_;
					} else
						i_17_ = 1;
					Class279.anInt3771 += i_17_;
				}
				Class2_Sub8.aFloat6868 += 8.0F * ((float) l
						* Class171.aFloat2192 / 40.0F);
				Class253_Sub2.method2708(i - 15735);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "hq.B(" + l + ',' + i
					+ ')');
		}
	}

	final void method3212(int i, int i_18_, int i_19_, int i_20_) {
		do {
			try {
				((Class11_Sub46) this).anInt7974 = i_18_;
				anInt9056++;
				((Class11_Sub46) this).anInt7970 = i_19_;
				((Class11_Sub46) this).anInt7983 = i;
				if (i_20_ == 16)
					break;
				method3212(37, -126, -104, -120);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hq.C(" + i + ','
						+ i_18_ + ',' + i_19_ + ',' + i_20_ + ')'));
			}
			break;
		} while (false);
	}
}
