/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class27 {
	static int anInt342;
	int anInt343;
	private Class366 aClass366_344;
	static Class27 aClass27_345 = new Class27(0, 3, Class366.aClass366_4812);
	static int anInt346;
	private int anInt347;
	static int anInt348;
	int anInt349;
	static int anInt350;
	static Class27 aClass27_351 = new Class27(1, 3, Class366.aClass366_4812);
	static Class27 aClass27_352 = new Class27(2, 4, Class366.aClass366_4808);
	static Class27 aClass27_353 = new Class27(3, 1, Class366.aClass366_4812);
	static Class27 aClass27_354 = new Class27(4, 2, Class366.aClass366_4812);
	static Class27 aClass27_355 = new Class27(5, 3, Class366.aClass366_4812);
	static Class27 aClass27_356 = new Class27(6, 4, Class366.aClass366_4812);
	static int anInt357 = Class163_Sub2_Sub1.method3406((byte) 66, 16);
	static int[] anIntArray358 = new int[4096];
	static int[] anIntArray359;

	static final void method225(byte i) {
		try {
			anInt342++;
			int i_0_ = Class376_Sub2.aByteArrayArray5568.length;
			int i_1_ = 0;
			int i_2_ = -35 / ((i - 32) / 52);
			for (/**/; (i_0_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
				if (Class376_Sub2.aByteArrayArray5568[i_1_] != null) {
					int i_3_ = -1;
					for (int i_4_ = 0; i_4_ < Class239_Sub1.anInt7268; i_4_++) {
						if ((Class183.anIntArray2362[i_1_] ^ 0xffffffff) == (Class234_Sub1_Sub1.anIntArray9733[i_4_] ^ 0xffffffff)) {
							i_3_ = i_4_;
							break;
						}
					}
					if ((i_3_ ^ 0xffffffff) == 0) {
						Class234_Sub1_Sub1.anIntArray9733[(Class239_Sub1.anInt7268)] = Class183.anIntArray2362[i_1_];
						i_3_ = Class239_Sub1.anInt7268++;
					}
					Stream stream = new Stream(
							Class376_Sub2.aByteArrayArray5568[i_1_]);
					int i_5_ = 0;
					while (((Stream) stream).position < Class376_Sub2.aByteArrayArray5568[i_1_].length) {
						if (i_5_ >= 511
								|| (Class23.anInt249 ^ 0xffffffff) <= -1024)
							break;
						int i_6_ = i_3_ | i_5_++ << 6;
						int i_7_ = stream.readUnsignedShort((byte) -65);
						int i_8_ = i_7_ >> 14;
						int i_9_ = i_7_ >> 7 & 0x3f;
						int i_10_ = 0x3f & i_7_;
						int i_11_ = (-Class194.anInt2641 + ((Class183.anIntArray2362[i_1_] >> 8) * 64 + i_9_));
						int i_12_ = ((Class183.anIntArray2362[i_1_] & 0xff)
								* 64 - Class118.anInt1605 - -i_10_);
						NPCDefinitions class215 = (Class11_Sub19.aClass318_5817
								.getNPCDefinitions(
										stream.readUnsignedShort((byte) -65),
										false));
						Class11_Sub25 class11_sub25 = ((Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
								.method1369((byte) 26, (long) i_6_));
						if (class11_sub25 == null
								&& (((NPCDefinitions) class215).aByte2926 & 0x1 ^ 0xffffffff) < -1
								&& (i_8_ ^ 0xffffffff) == (Class51.anInt800 ^ 0xffffffff)
								&& i_11_ >= 0
								&& ((Class300.anInt4051 ^ 0xffffffff) < (((NPCDefinitions) class215).anInt2975
										+ i_11_ ^ 0xffffffff))
								&& i_12_ >= 0
								&& (Class108_Sub12.anInt6228 > ((NPCDefinitions) class215).anInt2975
										+ i_12_)) {
							Npc class376_sub7_sub5_sub5_sub2 = new Npc();
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10319 = i_6_;
							Class11_Sub25 class11_sub25_13_ = (new Class11_Sub25(
									class376_sub7_sub5_sub5_sub2));
							Class11_Sub2_Sub25.aClass213_9322.method1368(
									(long) i_6_, class11_sub25_13_, (byte) -26);
							Class369.aClass11_Sub25Array4842[Class108_Sub17.anInt6619++] = class11_sub25_13_;
							Class11_Sub52.anIntArray8054[Class23.anInt249++] = i_6_;
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10322 = Class11_Sub25.anInt6279;
							class376_sub7_sub5_sub5_sub2.method4005(-1,
									class215);
							class376_sub7_sub5_sub5_sub2
									.method3954(
											109,
											((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2975);
							((Actor) class376_sub7_sub5_sub5_sub2).anInt10320 = (((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).anInt2959 << 3);
							class376_sub7_sub5_sub5_sub2
									.method3961(
											true,
											100,
											(0x24e00007 & ((NPCDefinitions) (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501)).aByte2943 + 4) << 11);
							class376_sub7_sub5_sub5_sub2.method4009(true,
									class376_sub7_sub5_sub5_sub2
											.method3968((byte) 127), i_8_,
									i_12_, (byte) 107, i_11_);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pfa.D(" + i + ')');
		}
	}

	static final void method226(int i, byte[] is, int i_14_, int i_15_,
			int i_16_, byte[] is_17_, int i_18_, int i_19_, int i_20_) {
		do {
			try {
				anInt346++;
				int i_21_ = -(i_15_ >> 2);
				i_15_ = -(0x3 & i_15_);
				for (int i_22_ = -i_19_; i_22_ < 0; i_22_++) {
					for (int i_23_ = i_21_; i_23_ < 0; i_23_++) {
						is[i_18_++] += -is_17_[i_14_++];
						is[i_18_++] += -is_17_[i_14_++];
						is[i_18_++] += -is_17_[i_14_++];
						is[i_18_++] += -is_17_[i_14_++];
					}
					for (int i_24_ = i_15_; (i_24_ ^ 0xffffffff) > -1; i_24_++)
						is[i_18_++] += -is_17_[i_14_++];
					i_14_ += i_16_;
					i_18_ += i_20_;
				}
				if (i == -1)
					break;
				anIntArray358 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("pfa.C(" + i + ','
						+ (is != null ? "{...}" : "null") + ',' + i_14_ + ','
						+ i_15_ + ',' + i_16_ + ','
						+ (is_17_ != null ? "{...}" : "null") + ',' + i_18_
						+ ',' + i_19_ + ',' + i_20_ + ')'));
			}
			break;
		} while (false);
	}

	public final String toString() {
		try {
			anInt348++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pfa.toString(" + ')');
		}
	}

	static final Class27 method227(byte i, int i_25_) {
		try {
			anInt350++;
			int i_26_ = i_25_;
			while_242_: do {
				while_241_: do {
					while_240_: do {
						while_239_: do {
							while_238_: do {
								while_237_: do {
									do {
										if ((i_26_ ^ 0xffffffff) != -1) {
											if (i_26_ == 1)
												break;
											if (i_26_ == 2)
												break while_237_;
											if (i_26_ == 3)
												break while_238_;
											if (i_26_ == 4)
												break while_239_;
											if (i_26_ == 5)
												break while_240_;
											if (i_26_ != 6)
												break while_242_;
											if (!client.aBool10531)
												break while_241_;
										}
										return aClass27_345;
									} while (false);
									return aClass27_351;
								} while (false);
								return aClass27_352;
							} while (false);
							return aClass27_353;
						} while (false);
						return aClass27_354;
					} while (false);
					return aClass27_355;
				} while (false);
				return aClass27_356;
			} while (false);
			if (i != 38)
				method225((byte) 52);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pfa.B(" + i + ','
					+ i_25_ + ')');
		}
	}

	public static void method228(int i) {
		try {
			anIntArray359 = null;
			anIntArray358 = null;
			if (i <= -19) {
				aClass27_353 = null;
				aClass27_355 = null;
				aClass27_356 = null;
				aClass27_354 = null;
				aClass27_351 = null;
				aClass27_345 = null;
				aClass27_352 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pfa.A(" + i + ')');
		}
	}

	private Class27(int i, int i_27_, Class366 class366) {
		try {
			((Class27) this).anInt343 = i;
			anInt347 = i_27_;
			aClass366_344 = class366;
			((Class27) this).anInt349 = anInt347
					* ((Class366) aClass366_344).anInt4802;
			if ((((Class27) this).anInt343 ^ 0xffffffff) <= -17)
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("pfa.<init>(" + i + ',' + i_27_ + ','
							+ (class366 != null ? "{...}" : "null") + ')'));
		}
	}
}
