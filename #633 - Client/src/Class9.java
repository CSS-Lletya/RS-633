/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9 {
	static int anInt64;
	static int anInt65;
	static int anInt66;
	static int anInt67;
	static int anInt68;
	static int anInt69;
	static int anInt70;
	static int anInt71;
	int anInt72;

	static final void method109(int i, int i_0_) {
		do {
			try {
				anInt67++;
				Class108.anInt1455 = 100;
				Class308.anInt4126 = 3;
				Class134.anInt1848 = i_0_;
				Class108_Sub8.anInt5737 = -1;
				if (i == 1)
					break;
				anInt66 = -48;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "g.C(" + i + ','
						+ i_0_ + ')');
			}
			break;
		} while (false);
	}

	static final boolean method110(int i, int i_1_, int i_2_) {
		try {
			anInt69++;
			if (i_2_ != 20858)
				return false;
			if ((i_1_ & 0x180 ^ 0xffffffff) == -1)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("g.A(" + i + ','
					+ i_1_ + ',' + i_2_ + ')'));
		}
	}

	static final void method111(int i, int i_3_,
			Actor class376_sub7_sub5_sub5,
			Actor class376_sub7_sub5_sub5_4_, int i_5_,
			int i_6_, int i_7_, byte i_8_, int i_9_, int i_10_) {
		try {
			anInt68++;
			int i_11_ = class376_sub7_sub5_sub5.method3955((byte) 72);
			if (i_11_ != -1) {
				Object object = null;
				Class253 class253 = ((Class253) Class163_Sub2_Sub1.aClass22_8565
						.method188((long) i_11_, (byte) -45));
				if (class253 == null) {
					Class80[] class80s = Class80.method543(
							Class108_Sub7.aClass146_5636, i_11_, 0);
					if (class80s == null)
						return;
					class253 = Class321_Sub2.aClass163_6648.method1081(
							class80s[0], true);
					Class163_Sub2_Sub1.aClass22_8565.method184((byte) 127,
							class253, (long) i_11_);
				}
				Class11_Sub33
						.method2796(
								0,
								(byte) -59,
								((Class376_Sub7) class376_sub7_sub5_sub5_4_).aByte7047,
								i_6_ >> 1,
								i,
								i_7_,
								((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7045,
								256 * class376_sub7_sub5_sub5_4_
										.method3968((byte) 127),
								i_3_ >> 1,
								((Class376_Sub7) class376_sub7_sub5_sub5_4_).anInt7031);
				int i_12_ = -18 + (Class12.anIntArray104[0] + i_10_);
				int i_13_ = -70 + (i_9_ - -Class12.anIntArray104[1]);
				i_12_ += 18 * (i_5_ / 4);
				if (i_8_ != -39)
					method111(70, 30, null, null, -40, -4, 14, (byte) 102, 116,
							106);
				i_13_ += i_5_ % 4 * 18;
				class253.method1610(i_12_, i_13_);
				if (class376_sub7_sub5_sub5 == class376_sub7_sub5_sub5_4_)
					Class321_Sub2.aClass163_6648.method1018(-1 + i_13_, -256,
							18, 18, i_8_ + 82, i_12_ - 1);
				Class11.method123(18 + i_13_, 18 + i_12_, (byte) -104,
						i_12_ - 1, i_13_ - 1);
				Class376_Sub3 class376_sub3 = Class353.method2114(1);
				((Class376_Sub3) class376_sub3).anInt6121 = 16 + i_13_;
				((Class376_Sub3) class376_sub3).anInt6119 = 16 + i_12_;
				((Class376_Sub3) class376_sub3).anInt6113 = i_13_;
				((Class376_Sub3) class376_sub3).anInt6115 = i_12_;
				((Class376_Sub3) class376_sub3).aClass376_Sub7_Sub5_Sub5_6112 = class376_sub7_sub5_sub5;
				Class333.aClass131_4412.method853(0, class376_sub3);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("g.D(" + i + ','
					+ i_3_ + ','
					+ (class376_sub7_sub5_sub5 != null ? "{...}" : "null")
					+ ','
					+ (class376_sub7_sub5_sub5_4_ != null ? "{...}" : "null")
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ','
					+ i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final void method112(int i, String string, String string_14_,
			int i_15_) {
		try {
			Class11_Sub45_Sub1_Sub2.anInt9885 = 2;
			Class108_Sub23.anInt7766 = i_15_;
			anInt65++;
			if (i != 15341)
				method111(-22, 62, null, null, -41, -18, -70, (byte) 61, -83,
						-116);
			Class11_Sub2_Sub4.method3352(string, false, 0, string_14_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("g.B(" + i + ',' + (string != null ? "{...}" : "null")
							+ ',' + (string_14_ != null ? "{...}" : "null")
							+ ',' + i_15_ + ')'));
		}
	}

	static final void method113(Class376_Sub7[] class376_sub7s, int i, int i_16_) {
		if (i < i_16_) {
			int i_17_ = (i + i_16_) / 2;
			int i_18_ = i;
			Class376_Sub7 class376_sub7 = class376_sub7s[i_17_];
			class376_sub7s[i_17_] = class376_sub7s[i_16_];
			class376_sub7s[i_16_] = class376_sub7;
			int i_19_ = ((Class376_Sub7) class376_sub7).anInt7041;
			for (int i_20_ = i; i_20_ < i_16_; i_20_++) {
				if (((Class376_Sub7) class376_sub7s[i_20_]).anInt7041 < i_19_
						+ (i_20_ & 0x1)) {
					Class376_Sub7 class376_sub7_21_ = class376_sub7s[i_20_];
					class376_sub7s[i_20_] = class376_sub7s[i_18_];
					class376_sub7s[i_18_++] = class376_sub7_21_;
				}
			}
			class376_sub7s[i_16_] = class376_sub7s[i_18_];
			class376_sub7s[i_18_] = class376_sub7;
			method113(class376_sub7s, i, i_18_ - 1);
			method113(class376_sub7s, i_18_ + 1, i_16_);
		}
	}

	public final String toString() {
		try {
			anInt64++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "g.toString(" + ')');
		}
	}

	Class9(int i, int i_22_) {
		try {
			((Class9) this).anInt72 = i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "g.<init>(" + i + ','
					+ i_22_ + ')');
		}
	}

	static final int method114(byte i,
			Npc class376_sub7_sub5_sub5_sub2) {
		try {
			anInt71++;
			NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
			if (((NPCDefinitions) class215).anIntArray2950 != null) {
				class215 = class215.method1375((byte) 29,
						Class11_Sub26.aClass97_6296);
				if (class215 == null)
					return -1;
			}
			int i_23_ = ((NPCDefinitions) class215).anInt2937;
			Class39 class39 = class376_sub7_sub5_sub5_sub2.method3960(21816);
			if (((((Actor) class376_sub7_sub5_sub5_sub2).anInt10291) ^ 0xffffffff) != 0
					&& !(((Actor) class376_sub7_sub5_sub5_sub2).aBool10329)) {
				if ((((((Actor) class376_sub7_sub5_sub5_sub2).anInt10291) ^ 0xffffffff) == (((Class39) class39).anInt525 ^ 0xffffffff))
						|| (((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 == ((Class39) class39).anInt573)
						|| ((((Class39) class39).anInt555 ^ 0xffffffff) == (((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 ^ 0xffffffff))
						|| ((((Class39) class39).anInt569 ^ 0xffffffff) == (((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 ^ 0xffffffff)))
					i_23_ = ((NPCDefinitions) class215).anInt2965;
				else if ((((Class39) class39).anInt540 == ((Actor) class376_sub7_sub5_sub5_sub2).anInt10291)
						|| ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 ^ 0xffffffff) == (((Class39) class39).anInt568 ^ 0xffffffff))
						|| (((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 == ((Class39) class39).anInt546)
						|| ((((Class39) class39).anInt551 ^ 0xffffffff) == (((Actor) class376_sub7_sub5_sub5_sub2).anInt10291 ^ 0xffffffff)))
					i_23_ = ((NPCDefinitions) class215).anInt2953;
			} else
				i_23_ = ((NPCDefinitions) class215).anInt2938;
			if (i >= -52)
				anInt66 = 39;
			return i_23_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("g.E("
							+ i
							+ ','
							+ (class376_sub7_sub5_sub5_sub2 != null ? "{...}"
									: "null") + ')'));
		}
	}
}
