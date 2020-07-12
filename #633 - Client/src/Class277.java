/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class277 {
	int anInt3741;
	static int anInt3742;
	static int anInt3743;
	static int[] anIntArray3744 = new int[1000];
	static int anInt3745;
	static int anInt3746 = 0;
	private Class163_Sub3 aClass163_Sub3_3747;

	static final int method1711(int i, int i_0_, int i_1_, int i_2_) {
		try {
			i_0_ &= 0x3;
			anInt3742++;
			if (i_0_ == 0)
				return i_1_;
			if (i >= -93)
				method1713(-37);
			if ((i_0_ ^ 0xffffffff) == -2)
				return -i_2_ + 4095;
			if ((i_0_ ^ 0xffffffff) == -3)
				return -i_1_ + 4095;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("po.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method1712(int i) {
		try {
			Class3.packetStream.method3427(7);
			anInt3743++;
			int i_3_ = Class3.packetStream.readBits(8, (byte) 108);
			if (i != 29921)
				method1712(68);
			if (Class23.anInt249 > i_3_) {
				for (int i_4_ = i_3_; Class23.anInt249 > i_4_; i_4_++)
					Class236_Sub1.anIntArray6080[Class228.anInt3148++] = Class11_Sub52.anIntArray8054[i_4_];
			}
			if ((i_3_ ^ 0xffffffff) < (Class23.anInt249 ^ 0xffffffff))
				throw new RuntimeException("gnpov1");
			Class23.anInt249 = 0;
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
				int i_6_ = Class11_Sub52.anIntArray8054[i_5_];
				Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26, (long) i_6_)).aNpc_2373);
				int i_7_ = Class3.packetStream.readBits(1, (byte) 108);
				if (i_7_ == 0) {
					Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_6_;
					((Actor) class376_sub7_sub5_sub5_sub2).anInt10322 = Class147.anInt1994;
				} else {
					int i_8_ = Class3.packetStream.readBits(2, (byte) 108);
					if ((i_8_ ^ 0xffffffff) == -1) {
						Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_6_;
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10322 = Class147.anInt1994;
						Class94_Sub3.anIntArray6905[Class11_Sub2_Sub22.anInt9204++] = i_6_;
					} else if ((i_8_ ^ 0xffffffff) == -2) {
						Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_6_;
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10322 = Class147.anInt1994;
						int i_9_ = Class3.packetStream
								.readBits(3, (byte) 108);
						class376_sub7_sub5_sub5_sub2.method4006(i_9_, 1, -1);
						int i_10_ = Class3.packetStream.readBits(1,
								(byte) 108);
						if ((i_10_ ^ 0xffffffff) == -2)
							Class94_Sub3.anIntArray6905[Class11_Sub2_Sub22.anInt9204++] = i_6_;
					} else if (i_8_ == 2) {
						Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_6_;
						((Actor) class376_sub7_sub5_sub5_sub2).anInt10322 = Class147.anInt1994;
						if ((Class3.packetStream.readBits(1, (byte) 108) ^ 0xffffffff) == -2) {
							int i_11_ = Class3.packetStream.readBits(3,
									(byte) 108);
							class376_sub7_sub5_sub5_sub2.method4006(i_11_, 2,
									-1);
							int i_12_ = Class3.packetStream.readBits(3,
									(byte) 108);
							class376_sub7_sub5_sub5_sub2.method4006(i_12_, 2,
									-1);
						} else {
							int i_13_ = Class3.packetStream.readBits(3,
									(byte) 108);
							class376_sub7_sub5_sub5_sub2.method4006(i_13_, 0,
									-1);
						}
						int i_14_ = Class3.packetStream.readBits(1,
								(byte) 108);
						if ((i_14_ ^ 0xffffffff) == -2)
							Class94_Sub3.anIntArray6905[Class11_Sub2_Sub22.anInt9204++] = i_6_;
					} else if (i_8_ == 3)
						Class236_Sub1.anIntArray6080[Class228.anInt3148++] = i_6_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "po.B(" + i + ')');
		}
	}

	public static void method1713(int i) {
		try {
			if (i == -22339)
				anIntArray3744 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "po.A(" + i + ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aClass163_Sub3_3747.method3306(((Class277) this).anInt3741, 905);
			anInt3745++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "po.finalize(" + ')');
		}
	}

	Class277(Class163_Sub3 class163_sub3, int i, int i_15_) {
		try {
			((Class277) this).anInt3741 = i_15_;
			aClass163_Sub3_3747 = class163_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("po.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_15_ + ')'));
		}
	}
}
