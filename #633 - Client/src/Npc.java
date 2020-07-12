/* Class376_Sub7_Sub5_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Npc extends Actor {
	static int anInt10492;
	static int anInt10493;
	static int anInt10494;
	static int anInt10495;
	static int anInt10496;
	static int anInt10497;
	static int anInt10498;
	static int anInt10499;
	static int anInt10500;
	NPCDefinitions aClass215_10501;
	static int anInt10502;
	static int anInt10503;
	static int anInt10504;
	int anInt10505 = -1;
	static int anInt10506;
	int anInt10507 = -1;
	static int anInt10508;
	static int anInt10509;
	static int anInt10510;
	static int anInt10511;
	static int anInt10512;

	final int method3964(int i) {
		try {
			anInt10510++;
			if (((NPCDefinitions) (((Npc) this).aClass215_10501)).anIntArray2950 != null) {
				NPCDefinitions class215 = ((Npc) this).aClass215_10501
						.method1375((byte) 29, Class11_Sub26.aClass97_6296);
				if (class215 != null && ((NPCDefinitions) class215).anInt2921 != -1)
					return ((NPCDefinitions) class215).anInt2921;
			}
			if (i != 2)
				return 52;
			return (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2921);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.O(" + i + ')');
		}
	}

	private final boolean method4004(int i, Class163 class163, int i_0_) {
		try {
			anInt10512++;
			int i_1_ = i;
			Class39 class39 = this.method3960(21816);
			Class281 class281 = ((i_0_ == (((Actor) this).anInt10352 ^ 0xffffffff) || ((Actor) this).anInt10286 != 0) ? null
					: (Class108_Sub23.aClass198_7760.method1284(
							((Actor) this).anInt10352,
							(byte) 109)));
			Class281 class281_2_ = ((((Actor) this).anInt10291 != -1 && (!((Actor) this).aBool10329 || class281 == null)) ? (Class108_Sub23.aClass198_7760
					.method1284(((Actor) this).anInt10291,
							(byte) -99)) : null);
			int i_3_ = ((Class39) class39).anInt558;
			int i_4_ = ((Class39) class39).anInt571;
			if ((i_3_ ^ 0xffffffff) != -1 || (i_4_ ^ 0xffffffff) != -1
					|| (((Class39) class39).anInt562 ^ 0xffffffff) != -1
					|| ((Class39) class39).anInt563 != 0)
				i |= 0x7;
			boolean bool = (((Actor) this).aByte10332 != 0
					&& (((Actor) this).anInt10360 <= Class11_Sub25.anInt6279) && (Class11_Sub25.anInt6279 < ((Actor) this).anInt10344));
			if (bool)
				i |= 0x80000;
			int i_5_ = ((Actor) this).aClass173_10278
					.method1140(i_0_ ^ 0xffffffff);
			Class206 class206 = (((Actor) this).aClass206Array10371[0] = (((Npc) this).aClass215_10501
					.method1381(
							((Actor) this).anInt10282,
							Class108_Sub23.aClass198_7760,
							((Actor) this).anInt10267,
							Class11_Sub26.aClass97_6296,
							((Actor) this).anInt10288,
							((Actor) this).anInt10283,
							((Actor) this).aClass208Array10342,
							class163, i_5_,
							((Actor) this).anInt10343,
							class281, true, i, class281_2_,
							Class108_Sub26.aClass127_7833,
							((Actor) this).anIntArray10324,
							((Actor) this).anInt10326)));
			if (class206 == null)
				return false;
			((Actor) this).anInt10335 = class206.fa();
			((Actor) this).anInt10356 = class206.ma();
			this.method3966((byte) -89, class206);
			if ((i_3_ ^ 0xffffffff) == -1 && (i_4_ ^ 0xffffffff) == -1)
				this.method3956(0, this.method3968((byte) 127) << 9, 0, i_5_,
						(byte) -5, this.method3968((byte) 127) << 9);
			else {
				this.method3956(((Class39) class39).anInt535, i_3_,
						((Class39) class39).anInt575, i_5_, (byte) -39, i_4_);
				if (((Actor) this).anInt10309 != 0)
					((Actor) this).aClass206Array10371[0]
							.FA(((Actor) this).anInt10309);
				if ((((Actor) this).anInt10302 ^ 0xffffffff) != -1)
					((Actor) this).aClass206Array10371[0]
							.VA(((Actor) this).anInt10302);
				if (((Actor) this).anInt10318 != 0)
					((Actor) this).aClass206Array10371[0].H(
							0, ((Actor) this).anInt10318, 0);
			}
			if (bool)
				class206.method1323(
						((Actor) this).aByte10323,
						((Actor) this).aByte10275,
						((Actor) this).aByte10358,
						0xff & ((Actor) this).aByte10332);
			if (((Actor) this).anInt10289 != -1
					&& ((((Actor) this).anInt10327 ^ 0xffffffff) != 0)) {
				Class224 class224 = (Class254.aClass227_3495.method1465(
						((Actor) this).anInt10289, (byte) 84));
				boolean bool_6_ = (((Class224) class224).aByte3075 == 3 && ((i_3_ ^ 0xffffffff) != -1 || i_4_ != 0));
				int i_7_ = i_1_;
				if (!bool_6_) {
					if (((Actor) this).anInt10297 != 0)
						i_7_ |= 0x5;
					if (((Actor) this).anInt10299 != 0)
						i_7_ |= 0x2;
					if (((Actor) this).anInt10337 >= 0)
						i_7_ |= 0x7;
				} else
					i_7_ |= 0x7;
				Class206 class206_8_ = (((Actor) this).aClass206Array10371[1] = (class224
						.method1436(class163, (byte) 6,
								((Actor) this).anInt10281,
								((Actor) this).anInt10327,
								((Actor) this).anInt10284,
								i_7_, Class108_Sub23.aClass198_7760)));
				if (class206_8_ != null) {
					if (((Actor) this).anInt10337 < 0) {
						if ((((Actor) this).anInt10297 ^ 0xffffffff) != -1)
							class206_8_
									.a(2048 * ((Actor) this).anInt10297);
					} else {
						int i_9_ = 0;
						int i_10_ = 0;
						int i_11_ = 0;
						if (((Class39) class39).anIntArrayArray564 != null
								&& ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10337]) != null)) {
							i_10_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][1]);
							i_9_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][0]);
							i_11_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10337)][2]);
						}
						if (((Class39) class39).anIntArrayArray529 != null
								&& ((((Class39) class39).anIntArrayArray529[((Actor) this).anInt10337]) != null)) {
							i_10_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][1]);
							i_9_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][0]);
							i_11_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10337)][2]);
						}
						if ((i_11_ ^ 0xffffffff) != -1
								|| (i_9_ ^ 0xffffffff) != -1) {
							int i_12_ = i_5_;
							if ((((Actor) this).anIntArray10324) != null
									&& (((Actor) this).anIntArray10324[(((Actor) this).anInt10337)]) != -1)
								i_12_ = (((Actor) this).anIntArray10324[(((Actor) this).anInt10337)]);
							int i_13_ = ((((Actor) this).anInt10297 * 2048)
									- -i_12_ + -i_5_ & 0x3fff);
							if (i_13_ != 0)
								class206_8_.a(i_13_);
							int i_14_ = Class335.anIntArray4436[i_13_];
							int i_15_ = Class335.anIntArray4430[i_13_];
							int i_16_ = i_11_ * i_14_ + i_15_ * i_9_ >> 14;
							i_11_ = -(i_9_ * i_14_) + i_11_ * i_15_ >> 14;
							i_9_ = i_16_;
						}
						class206_8_.H(i_9_, i_10_, i_11_);
					}
					if (((Actor) this).anInt10299 != 0)
						class206_8_
								.H(0,
										-(((Actor) this).anInt10299) << 2,
										0);
					if (bool_6_) {
						if (((Actor) this).anInt10309 != 0)
							class206_8_
									.FA(((Actor) this).anInt10309);
						if (((Actor) this).anInt10302 != 0)
							class206_8_
									.VA(((Actor) this).anInt10302);
						if (((Actor) this).anInt10318 != 0)
							class206_8_
									.H(0,
											(((Actor) this).anInt10318),
											0);
					}
				}
			} else
				((Actor) this).aClass206Array10371[1] = null;
			if (((Actor) this).anInt10338 != -1
					&& ((Actor) this).anInt10314 != -1) {
				Class224 class224 = (Class254.aClass227_3495
						.method1465(
								((Actor) this).anInt10338,
								(byte) -65));
				boolean bool_17_ = (((Class224) class224).aByte3075 == 3 && (i_3_ != 0 || i_4_ != 0));
				int i_18_ = i_1_;
				if (bool_17_)
					i_18_ |= 0x7;
				else {
					if (((Actor) this).anInt10334 != 0)
						i_18_ |= 0x5;
					if ((((Actor) this).anInt10347 ^ 0xffffffff) != -1)
						i_18_ |= 0x2;
					if ((((Actor) this).anInt10316 ^ 0xffffffff) <= -1)
						i_18_ |= 0x7;
				}
				Class206 class206_19_ = (((Actor) this).aClass206Array10371[2] = (class224
						.method1431(
								((Actor) this).anInt10314,
								Class108_Sub23.aClass198_7760, class163, i_18_,
								((Actor) this).anInt10273,
								((Actor) this).anInt10313,
								(byte) -123)));
				if (class206_19_ != null) {
					if (((Actor) this).anInt10316 < 0
							|| ((Class39) class39).anIntArrayArray564 == null
							|| ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10316]) == null)) {
						if (((Actor) this).anInt10334 != 0)
							class206_19_
									.a(2048 * ((Actor) this).anInt10334);
					} else {
						int i_20_ = 0;
						int i_21_ = 0;
						int i_22_ = 0;
						if (((Class39) class39).anIntArrayArray564 != null
								&& ((((Class39) class39).anIntArrayArray564[((Actor) this).anInt10316]) != null)) {
							i_20_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][0]);
							i_22_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][2]);
							i_21_ += (((Class39) class39).anIntArrayArray564[(((Actor) this).anInt10316)][1]);
						}
						if (((Class39) class39).anIntArrayArray529 != null
								&& ((((Class39) class39).anIntArrayArray529[((Actor) this).anInt10316]) != null)) {
							i_22_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][2]);
							i_21_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][1]);
							i_20_ += (((Class39) class39).anIntArrayArray529[(((Actor) this).anInt10316)][0]);
						}
						if ((i_22_ ^ 0xffffffff) != -1
								|| (i_20_ ^ 0xffffffff) != -1) {
							int i_23_ = i_5_;
							if ((((Actor) this).anIntArray10324) != null
									&& ((((Actor) this).anIntArray10324[(((Actor) this).anInt10316)]) ^ 0xffffffff) != 0)
								i_23_ = (((Actor) this).anIntArray10324[(((Actor) this).anInt10316)]);
							int i_24_ = ((((Actor) this).anInt10334 * 2048)
									- (-i_23_ - -i_5_) & 0x3fff);
							if ((i_24_ ^ 0xffffffff) != -1)
								class206_19_.a(i_24_);
							int i_25_ = Class335.anIntArray4436[i_24_];
							int i_26_ = Class335.anIntArray4430[i_24_];
							int i_27_ = i_25_ * i_22_ - -(i_26_ * i_20_) >> 14;
							i_22_ = -(i_20_ * i_25_) + i_22_ * i_26_ >> 14;
							i_20_ = i_27_;
						}
						class206_19_.H(i_20_, i_21_, i_22_);
					}
					if ((((Actor) this).anInt10347 ^ 0xffffffff) != -1)
						class206_19_
								.H(0,
										-(((Actor) this).anInt10347) << 2,
										0);
					if (bool_17_) {
						if (((Actor) this).anInt10309 != 0)
							class206_19_
									.FA(((Actor) this).anInt10309);
						if (((Actor) this).anInt10302 != 0)
							class206_19_
									.VA(((Actor) this).anInt10302);
						if (((Actor) this).anInt10318 != 0)
							class206_19_
									.H(0,
											(((Actor) this).anInt10318),
											0);
					}
				}
			} else
				((Actor) this).aClass206Array10371[2] = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("vaa.F(" + i + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	final void method2872(int i) {
		try {
			if (i == 26062) {
				anInt10493++;
				throw new IllegalStateException();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.L(" + i + ')');
		}
	}

	final boolean method2862(int i) {
		try {
			if (i > -103)
				method3955((byte) 65);
			anInt10502++;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.W(" + i + ')');
		}
	}

	final void method4005(int i, NPCDefinitions class215) {
		do {
			try {
				((Npc) this).aClass215_10501 = class215;
				anInt10506++;
				if (i != -1)
					((Npc) this).anInt10505 = -35;
				if (((Actor) this).aClass376_Sub10_10369 == null)
					break;
				((Actor) this).aClass376_Sub10_10369
						.method3167();
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vaa.B(" + i + ','
						+ (class215 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	final int method3957(int i) {
		try {
			anInt10508++;
			if (((NPCDefinitions) (((Npc) this).aClass215_10501)).anIntArray2950 != null) {
				NPCDefinitions class215 = ((Npc) this).aClass215_10501
						.method1375((byte) 29, Class11_Sub26.aClass97_6296);
				if (class215 != null && ((NPCDefinitions) class215).anInt2922 != -1)
					return ((NPCDefinitions) class215).anInt2922;
			}
			if (i != 0)
				method4005(-93, null);
			if (((NPCDefinitions) (((Npc) this).aClass215_10501)).anInt2922 == -1)
				return super.method3957(0);
			return (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2922);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.KA(" + i + ')');
		}
	}

	final int method3955(byte i) {
		try {
			anInt10509++;
			if (i != 72)
				return 75;
			if (((NPCDefinitions) (((Npc) this).aClass215_10501)).anIntArray2950 != null) {
				NPCDefinitions class215 = ((Npc) this).aClass215_10501
						.method1375((byte) 29, Class11_Sub26.aClass97_6296);
				if (class215 != null && ((NPCDefinitions) class215).anInt2968 != -1)
					return ((NPCDefinitions) class215).anInt2968;
			}
			return (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2968);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.Q(" + i + ')');
		}
	}

	final void method2871(boolean bool, Class163 class163, int i, int i_28_,
			Class376_Sub7 class376_sub7, int i_29_, int i_30_) {
		try {
			if (i_29_ != 22501)
				method2873(null, 19, -45, -30);
			anInt10499++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.G(" + bool + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_28_ + ',' + (class376_sub7 != null ? "{...}" : "null")
					+ ',' + i_29_ + ',' + i_30_ + ')'));
		}
	}

	final int method2864(int i) {
		try {
			anInt10498++;
			if (i <= 72)
				method4008(39);
			if (((Npc) this).aClass215_10501 == null)
				return 0;
			return (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2924);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.TA(" + i + ')');
		}
	}

	final void method4006(int i, int i_31_, int i_32_) {
		try {
			anInt10495++;
			int i_33_ = ((Actor) this).anIntArray10370[0];
			int i_34_ = ((Actor) this).anIntArray10376[0];
			if (i == 0)
				i_34_++;
			if ((i ^ 0xffffffff) == -2) {
				i_33_++;
				i_34_++;
			}
			if (i == 2)
				i_33_++;
			if ((i ^ 0xffffffff) == -4) {
				i_33_++;
				i_34_--;
			}
			if ((i ^ 0xffffffff) == -5)
				i_34_--;
			if (i == 5) {
				i_33_--;
				i_34_--;
			}
			if (i == 6)
				i_33_--;
			if ((((Actor) this).anInt10352 ^ 0xffffffff) != 0
					&& (((Class281) (Class108_Sub23.aClass198_7760.method1284(
							((Actor) this).anInt10352,
							(byte) 98))).anInt3807 ^ 0xffffffff) == -2) {
				((Actor) this).anInt10352 = -1;
				((Actor) this).anIntArray10272 = null;
			}
			if (i_32_ != -1)
				((Npc) this).anInt10507 = 18;
			if ((i ^ 0xffffffff) == -8) {
				i_33_--;
				i_34_++;
			}
			if ((((Actor) this).anInt10289 ^ 0xffffffff) != 0) {
				Class224 class224 = (Class254.aClass227_3495
						.method1465(
								((Actor) this).anInt10289,
								(byte) 112));
				if (((Class224) class224).aBool3073
						&& (((Class224) class224).anInt3079 ^ 0xffffffff) != 0
						&& (((Class281) (Class108_Sub23.aClass198_7760
								.method1284(((Class224) class224).anInt3079,
										(byte) -77))).anInt3807 ^ 0xffffffff) == -2)
					((Actor) this).anInt10289 = -1;
			}
			if ((((Actor) this).anInt10338 ^ 0xffffffff) != 0) {
				Class224 class224 = (Class254.aClass227_3495.method1465(
						((Actor) this).anInt10338,
						(byte) -127));
				if (((Class224) class224).aBool3073
						&& (((Class224) class224).anInt3079 ^ 0xffffffff) != 0
						&& (((Class281) (Class108_Sub23.aClass198_7760
								.method1284(((Class224) class224).anInt3079,
										(byte) -63))).anInt3807 ^ 0xffffffff) == -2)
					((Actor) this).anInt10338 = -1;
			}
			if (((Actor) this).anInt10375 < 9)
				((Actor) this).anInt10375++;
			for (int i_35_ = ((Actor) this).anInt10375; i_35_ > 0; i_35_--) {
				((Actor) this).anIntArray10370[i_35_] = (((Actor) this).anIntArray10370[-1
						+ i_35_]);
				((Actor) this).anIntArray10376[i_35_] = (((Actor) this).anIntArray10376[-1
						+ i_35_]);
				((Actor) this).aByteArray10372[i_35_] = (((Actor) this).aByteArray10372[-1
						+ i_35_]);
			}
			((Actor) this).anIntArray10370[0] = i_33_;
			((Actor) this).anIntArray10376[0] = i_34_;
			((Actor) this).aByteArray10372[0] = (byte) i_31_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.E(" + i + ','
					+ i_31_ + ',' + i_32_ + ')'));
		}
	}

	final Class376_Sub5 method2876(byte i, Class163 class163) {
		try {
			anInt10494++;
			if (((Npc) this).aClass215_10501 == null
					|| !method4004(2048, class163, 0))
				return null;
			Class33 class33 = class163.method1048();
			int i_36_ = ((Actor) this).aClass173_10278
					.method1140(i + 126);
			class33.method298(i_36_);
			Class364 class364 = (Class181.aClass364ArrayArrayArray2336[((Class376_Sub7) this).aByte7047][(((Class376_Sub7) this).anInt7045 >> Class11_Sub2_Sub8.anInt8751)][(((Class376_Sub7) this).anInt7031 >> Class11_Sub2_Sub8.anInt8751)]);
			if (class364 == null
					|| ((Class364) class364).aClass376_Sub7_Sub2_4777 == null)
				((Actor) this).anInt10307 -= ((float) ((Actor) this).anInt10307 / 10.0F);
			else {
				int i_37_ = (-(((Class376_Sub7_Sub2) ((Class364) class364).aClass376_Sub7_Sub2_4777).aShort9237) + ((Actor) this).anInt10307);
				((Actor) this).anInt10307 -= (float) i_37_ / 10.0F;
			}
			class33.method299(
					((Class376_Sub7) this).anInt7045,
					-20
							+ (((Class376_Sub7) this).anInt7036 - (((Actor) this).anInt10307)),
					((Class376_Sub7) this).anInt7031);
			Class39 class39 = this.method3960(21816);
			NPCDefinitions class215 = (((NPCDefinitions) (((Npc) this).aClass215_10501)).anIntArray2950 != null ? ((Npc) this).aClass215_10501
					.method1375((byte) 29, Class11_Sub26.aClass97_6296)
					: ((Npc) this).aClass215_10501);
			((Actor) this).aBool10378 = false;
			Class376_Sub5 class376_sub5 = null;
			if ((((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub21_5700
					.method2958(false) ^ 0xffffffff) == -2
					&& ((NPCDefinitions) class215).aBool2947
					&& ((Class39) class39).aBool534) {
				Class281 class281 = ((((Actor) this).anInt10352 == -1 || (((Actor) this).anInt10286 ^ 0xffffffff) != -1) ? null
						: (Class108_Sub23.aClass198_7760.method1284(
								((Actor) this).anInt10352,
								(byte) 107)));
				Class281 class281_38_ = ((((Actor) this).anInt10291 == -1 || (((Actor) this).aBool10329 && class281 != null)) ? null
						: (Class108_Sub23.aClass198_7760.method1284(
								((Actor) this).anInt10291,
								(byte) -96)));
				Class206 class206 = (Class11_Sub45_Sub3
						.method3386(
								((NPCDefinitions) (((Npc) this).aClass215_10501)).aByte2951 & 0xff,
								((Actor) this).anInt10309,
								((Actor) this).anInt10302,
								((Actor) this).anInt10318,
								((NPCDefinitions) (((Npc) this).aClass215_10501)).aByte2931 & 0xff,
								class163,
								21525,
								(((Actor) this).aClass206Array10371[0]),
								(0xffff & ((NPCDefinitions) (((Npc) this).aClass215_10501)).aShort2930),
								((NPCDefinitions) (((Npc) this).aClass215_10501)).anInt2975,
								((NPCDefinitions) (((Npc) this).aClass215_10501)).aShort2945 & 0xffff,
								(class281_38_ != null ? ((Actor) this).anInt10267
										: ((Actor) this).anInt10326),
								class281_38_ != null ? class281_38_ : class281,
								i_36_));
				if (class206 != null) {
					class376_sub5 = (Class11_Sub11
							.method2370(
									method4008(-19066),
									1 + (((Actor) this).aClass206Array10371).length,
									i + 24951));
					((Actor) this).aBool10378 = true;
					class163.C(false);
					if (!Class11_Sub45_Sub1.aBool8490)
						class206.method1321(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[(((Actor) this).aClass206Array10371).length]),
								0);
					else
						class206.method1329(
								class33,
								(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[(((Actor) this).aClass206Array10371).length]),
								Class117.anInt1597, 0);
					class163.C(true);
				}
			}
			class33.method298(i_36_);
			class33.method299(
					((Class376_Sub7) this).anInt7045,
					(((Class376_Sub7) this).anInt7036 - (5 - -(((Actor) this).anInt10307))),
					((Class376_Sub7) this).anInt7031);
			if (i != -127)
				method2872(-54);
			if (class376_sub5 == null)
				class376_sub5 = Class11_Sub11
						.method2370(
								method4008(i ^ 0x4a07),
								(((Actor) this).aClass206Array10371).length,
								24824);
			this.method3962(true, class33, class163,
					(((Actor) this).aClass206Array10371),
					false);
			if (!Class11_Sub45_Sub1.aBool8490) {
				for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > ((((Actor) this).aClass206Array10371).length ^ 0xffffffff); i_39_++) {
					if ((((Actor) this).aClass206Array10371[i_39_]) != null)
						((Actor) this).aClass206Array10371[i_39_]
								.method1321(
										class33,
										(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_39_]),
										0);
				}
			} else {
				for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > ((((Actor) this).aClass206Array10371).length ^ 0xffffffff); i_40_++) {
					if ((((Actor) this).aClass206Array10371[i_40_]) != null)
						((Actor) this).aClass206Array10371[i_40_]
								.method1329(
										class33,
										(((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_40_]),
										Class117.anInt1597, 0);
				}
			}
			if (((Actor) this).aClass376_Sub10_10369 != null) {
				Class116 class116 = ((Actor) this).aClass376_Sub10_10369
						.method3172();
				if (Class11_Sub45_Sub1.aBool8490)
					class163.method1008(class116, Class117.anInt1597);
				else
					class163.method1010(class116);
			}
			for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > ((((Actor) this).aClass206Array10371).length ^ 0xffffffff); i_41_++) {
				if (((Actor) this).aClass206Array10371[i_41_] != null)
					((Actor) this).aBool10378 |= ((Actor) this).aClass206Array10371[i_41_]
							.F();
			}
			((Actor) this).anInt10268 = Class283.anInt3835;
			((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			return class376_sub5;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.U(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method4007(int i) {
		try {
			if (i != 92160000)
				((Npc) this).aClass215_10501 = null;
			anInt10504++;
			if (((Npc) this).aClass215_10501 == null)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.T(" + i + ')');
		}
	}

	private final boolean method4008(int i) {
		try {
			anInt10492++;
			if (i != -19066)
				return true;
			return (((NPCDefinitions) ((Npc) this).aClass215_10501).aBool2970);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vaa.A(" + i + ')');
		}
	}

	final Class212 method2860(int i, Class163 class163) {
		try {
			if (i != 0)
				method2874((byte) -82, null);
			anInt10496++;
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.D(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2874(byte i, Class163 class163) {
		try {
			anInt10503++;
			int i_42_ = 102 / ((18 - i) / 40);
			if (((Npc) this).aClass215_10501 != null
					&& (((Actor) this).aBool10377 || method4004(
							0, class163, 0))) {
				Class33 class33 = class163.method1048();
				class33.method298(((Actor) this).aClass173_10278
						.method1140(-1));
				class33.method299(((Class376_Sub7) this).anInt7045,
						((Class376_Sub7) this).anInt7036 - 20,
						((Class376_Sub7) this).anInt7031);
				this.method3962(true, class33, class163,
						(((Actor) this).aClass206Array10371),
						((Actor) this).aBool10377);
				((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method4009(boolean bool, int i, int i_43_, int i_44_,
			byte i_45_, int i_46_) {
		do {
			try {
				anInt10497++;
				((Class376_Sub7) this).aByte7047 = ((Class376_Sub7) this).aByte7039 = (byte) i_43_;
				if (Class321_Sub3_Sub1.method3613((byte) -88, i_46_, i_44_))
					((Class376_Sub7) this).aByte7039++;
				if (((Actor) this).anInt10352 != -1
						&& (((Class281) (Class108_Sub23.aClass198_7760
								.method1284(
										((Actor) this).anInt10352,
										(byte) -45))).anInt3807 ^ 0xffffffff) == -2) {
					((Actor) this).anIntArray10272 = null;
					((Actor) this).anInt10352 = -1;
				}
				if ((((Actor) this).anInt10289 ^ 0xffffffff) != 0) {
					Class224 class224 = (Class254.aClass227_3495.method1465(
							((Actor) this).anInt10289,
							(byte) -74));
					if (((Class224) class224).aBool3073
							&& ((Class224) class224).anInt3079 != -1
							&& ((Class281) (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) -46))).anInt3807 == 1)
						((Actor) this).anInt10289 = -1;
				}
				if (((Actor) this).anInt10338 != -1) {
					Class224 class224 = (Class254.aClass227_3495.method1465(
							((Actor) this).anInt10338,
							(byte) 61));
					if (((Class224) class224).aBool3073
							&& (((Class224) class224).anInt3079 ^ 0xffffffff) != 0
							&& (((Class281) (Class108_Sub23.aClass198_7760
									.method1284(
											((Class224) class224).anInt3079,
											(byte) -44))).anInt3807 ^ 0xffffffff) == -2)
						((Actor) this).anInt10338 = -1;
				}
				if (!bool) {
					int i_47_ = (-((Actor) this).anIntArray10370[0] + i_46_);
					int i_48_ = (-((Actor) this).anIntArray10376[0] + i_44_);
					if ((i_47_ ^ 0xffffffff) <= 7 && (i_47_ ^ 0xffffffff) >= -9
							&& i_48_ >= -8 && (i_48_ ^ 0xffffffff) >= -9) {
						if ((((Actor) this).anInt10375 ^ 0xffffffff) > -10)
							((Actor) this).anInt10375++;
						for (int i_49_ = ((Actor) this).anInt10375; (i_49_ ^ 0xffffffff) < -1; i_49_--) {
							((Actor) this).anIntArray10370[i_49_] = (((Actor) this).anIntArray10370[-1
									+ i_49_]);
							((Actor) this).anIntArray10376[i_49_] = (((Actor) this).anIntArray10376[i_49_ - 1]);
							((Actor) this).aByteArray10372[i_49_] = (((Actor) this).aByteArray10372[i_49_ - 1]);
						}
						((Actor) this).anIntArray10370[0] = i_46_;
						((Actor) this).anIntArray10376[0] = i_44_;
						((Actor) this).aByteArray10372[0] = (byte) 1;
						break;
					}
				}
				((Actor) this).anInt10375 = 0;
				((Actor) this).anInt10373 = 0;
				((Actor) this).anIntArray10370[0] = i_46_;
				((Actor) this).anInt10368 = 0;
				((Actor) this).anIntArray10376[0] = i_44_;
				((Class376_Sub7) this).anInt7045 = ((i << 8) + (((Actor) this).anIntArray10370[0] << 9));
				((Class376_Sub7) this).anInt7031 = ((i << 8) + (((Actor) this).anIntArray10376[0] << 9));
				if (((Actor) this).aClass376_Sub10_10369 != null)
					((Actor) this).aClass376_Sub10_10369
							.method3167();
				if (i_45_ > 13)
					break;
				((Npc) this).anInt10507 = -33;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vaa.C(" + bool
						+ ',' + i + ',' + i_43_ + ',' + i_44_ + ',' + i_45_
						+ ',' + i_46_ + ')'));
			}
			break;
		} while (false);
	}

	final boolean method2873(Class163 class163, int i, int i_50_, int i_51_) {
		try {
			anInt10500++;
			if (((Npc) this).aClass215_10501 == null
					|| !method4004(131072, class163, 0))
				return false;
			Class33 class33 = class163.method1048();
			int i_52_ = ((Actor) this).aClass173_10278
					.method1140(-1);
			class33.method298(i_52_);
			class33.method299(((Class376_Sub7) this).anInt7045,
					((Class376_Sub7) this).anInt7036,
					((Class376_Sub7) this).anInt7031);
			boolean bool = false;
			for (int i_53_ = i; ((((Actor) this).aClass206Array10371.length ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
				if (((Actor) this).aClass206Array10371[i_53_] != null) {
					boolean bool_54_ = (((NPCDefinitions) (((Npc) this).aClass215_10501)).anInt2924 > 0 || ((((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2908 == -1) ? (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2975 ^ 0xffffffff) == -2
							: (((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2908 ^ 0xffffffff) == -2));
					boolean bool_55_;
					if (!Class11_Sub45_Sub1.aBool8490)
						bool_55_ = (((Actor) this).aClass206Array10371[i_53_]
								.method1309(
										i_51_,
										i_50_,
										class33,
										bool_54_,
										((NPCDefinitions) (((Npc) this).aClass215_10501)).anInt2924));
					else
						bool_55_ = (((Actor) this).aClass206Array10371[i_53_]
								.method1305(
										i_51_,
										i_50_,
										class33,
										bool_54_,
										((NPCDefinitions) ((Npc) this).aClass215_10501).anInt2924,
										Class117.anInt1597));
					if (bool_55_) {
						bool = true;
						break;
					}
				}
			}
			((Actor) this).aClass206Array10371[0] = ((Actor) this).aClass206Array10371[1] = ((Actor) this).aClass206Array10371[2] = null;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vaa.M("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ i_50_ + ',' + i_51_ + ')'));
		}
	}

	public Npc() {
		/* empty */
	}
}
