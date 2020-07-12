/* Class376_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub2 extends Class376 {
	static int anInt5554;
	private int anInt5555 = 0;
	static int anInt5556;
	int anInt5557;
	private long aLong5558;
	Class129 aClass129_5559;
	static int anInt5560;
	Class376_Sub10 aClass376_Sub10_5561;
	static int anInt5562;
	Class87 aClass87_5563;
	Class110 aClass110_5564;
	static int anInt5565;
	boolean aBool5566 = false;
	static Class298 aClass298_5567 = new Class298("", 12);
	static byte[][] aByteArrayArray5568;
	Class131 aClass131_5569;
	private Class87 aClass87_5570;
	private int anInt5571;
	private int anInt5572;
	private int anInt5573;
	private int anInt5574;
	private int anInt5575;
	private int anInt5576;
	private int anInt5577;
	private boolean aBool5578;
	static IncomingPacket SKILL_LEVEL_IN_PACKET = new IncomingPacket(91, 6);

	static final int method2416(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			anInt5554++;
			if (i_0_ != 107)
				method2419('\uffbe', -59, (byte) -108);
			if ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[i_2_][i_1_][i] & 0x8) != 0)
				return 0;
			if ((i_2_ ^ 0xffffffff) < -1
					&& (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_1_][i] & 0x2) != 0)
				return i_2_ - 1;
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("at.C(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2417(byte i) {
		do {
			try {
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1492);
				anInt5565++;
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1504);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1499);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1509);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1505);
				if (i < -96) {
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1493);
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1491);
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1502);
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1494);
					if ((((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204) ^ 0xffffffff) == ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215) ^ 0xffffffff))
							&& (((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214) ^ 0xffffffff) == (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1215 ^ 0xffffffff))
							&& (((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202) ^ 0xffffffff) == (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1217 ^ 0xffffffff))
							&& (((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211) ^ 0xffffffff) == (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1217 ^ 0xffffffff))
							&& ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207) == ((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1212)
							&& ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209) == ((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1207))
						aBool5578 = true;
					else {
						if (!aBool5578)
							break;
						((Class87) aClass87_5570).anInt1209 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209);
						((Class87) aClass87_5570).anInt1215 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215);
						((Class87) aClass87_5570).anInt1212 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212);
						((Class87) aClass87_5570).anInt1217 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217);
						((Class87) aClass87_5570).anInt1207 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207);
						aBool5578 = false;
						((Class87) aClass87_5570).anInt1211 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211);
						((Class87) aClass87_5570).anInt1214 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214);
						((Class87) aClass87_5570).anInt1204 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204);
						((Class87) aClass87_5570).anInt1202 = (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "at.F(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2418(long l, Class163 class163, boolean bool) {
		try {
			if (bool != true)
				((Class376_Sub2) this).aClass129_5559 = null;
			for (Class376_Sub1_Sub1_Sub1 class376_sub1_sub1_sub1 = (Class376_Sub1_Sub1_Sub1) ((Class376_Sub2) this).aClass131_5569
					.method847(-31182); class376_sub1_sub1_sub1 != null; class376_sub1_sub1_sub1 = ((Class376_Sub1_Sub1_Sub1) ((Class376_Sub2) this).aClass131_5569
					.method856(37)))
				class376_sub1_sub1_sub1.method3948(class163, l);
			anInt5560++;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("at.B(" + l + ','
							+ (class163 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	static final int method2419(char c, int i, byte i_3_) {
		try {
			anInt5562++;
			if (i_3_ >= -44)
				method2419('\uffe0', 123, (byte) -22);
			int i_4_ = c << 4;
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				c = Character.toLowerCase(c);
				i_4_ = (c << 4) + 1;
			}
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("at.D(" + c + ',' + i
					+ ',' + i_3_ + ')'));
		}
	}

	final void method2420(Class163 class163, byte i, boolean bool, long l,
			int i_5_) {
		try {
			if (!((Class376_Sub2) this).aBool5566) {
				if (Class280.anInt3787 >= (((Class129) ((Class376_Sub2) this).aClass129_5559).anInt1730)) {
					if (Class11_Sub12_Sub4.anInt9464 > Class123.anIntArray1666[Class280.anInt3787])
						bool = false;
					else if (aBool5578)
						bool = false;
					else if ((((Class129) ((Class376_Sub2) this).aClass129_5559).anInt1780 ^ 0xffffffff) != 0) {
						int i_6_ = (int) (-aLong5558 + l);
						if (!((Class129) ((Class376_Sub2) this).aClass129_5559).aBool1760
								&& (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1780 ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
							bool = false;
						else
							i_6_ %= ((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1780;
						if (!((Class129) ((Class376_Sub2) this).aClass129_5559).aBool1781
								&& ((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1786 > i_6_)
							bool = false;
						if ((((Class129) ((Class376_Sub2) this).aClass129_5559).aBool1781)
								&& (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1786 <= i_6_))
							bool = false;
					}
				} else
					bool = false;
			} else
				bool = false;
			anInt5556++;
			if (bool) {
				Class59.anInt883++;
				int i_7_ = (((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214)
						+ (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204) - -(((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215)) / 3);
				int i_8_ = (((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211)
						+ (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202) - -(((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217)) / 3);
				int i_9_ = ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207)
						+ (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212) + (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209)) / 3;
				if (((i_7_ ^ 0xffffffff) != ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1206) ^ 0xffffffff))
						|| (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1208) != i_8_
						|| (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1216) != i_9_) {
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1206 = i_7_;
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1216 = i_9_;
					((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1208 = i_8_;
					int i_10_ = ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215) - (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204));
					int i_11_ = ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217) - (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202));
					int i_12_ = ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207) - (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212));
					int i_13_ = (-(((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204) + (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214));
					int i_14_ = ((((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211) + -(((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202));
					int i_15_ = (-(((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212) + (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209));
					anInt5572 = i_13_ * i_12_ + -(i_10_ * i_15_);
					anInt5571 = i_14_ * i_10_ + -(i_11_ * i_13_);
					for (anInt5577 = i_15_ * i_11_ + -(i_12_ * i_14_); ((anInt5577 ^ 0xffffffff) < -32768
							|| anInt5572 > 32767
							|| (anInt5571 ^ 0xffffffff) < -32768
							|| (anInt5577 ^ 0xffffffff) > 32766
							|| (anInt5572 ^ 0xffffffff) > 32766 || anInt5571 < -32767); anInt5572 >>= 1) {
						anInt5571 >>= 1;
						anInt5577 >>= 1;
					}
					int i_16_ = (int) Math
							.sqrt((double) (anInt5571 * anInt5571 + (anInt5577
									* anInt5577 - -(anInt5572 * anInt5572))));
					if (i_16_ <= 0)
						i_16_ = 1;
					anInt5572 = 32767 * anInt5572 / i_16_;
					anInt5571 = anInt5571 * 32767 / i_16_;
					anInt5577 = 32767 * anInt5577 / i_16_;
					if ((((Class129) ((Class376_Sub2) this).aClass129_5559).aShort1765) > 0
							|| (((Class129) ((Class376_Sub2) this).aClass129_5559).aShort1763) > 0) {
						int i_17_ = (int) (Math.atan2((double) anInt5571,
								(double) anInt5577) * 2607.5945876176133);
						int i_18_ = (int) (2607.5945876176133 * (Math
								.atan2((double) anInt5572,
										(Math.sqrt((double) (anInt5571
												* anInt5571 + (anInt5577 * anInt5577)))))));
						anInt5573 = (((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1765 - ((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1747);
						anInt5576 = (((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1747 + (i_17_ - (anInt5573 >> 1)));
						anInt5574 = (-((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1775 + ((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1763);
						anInt5575 = (-(anInt5574 >> 1)
								+ ((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1775 + i_18_);
					}
				}
				anInt5555 += (int) (((Math.random() * (double) (-((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1741 + ((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1768)) + (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1741)) * (double) i_5_);
				if ((anInt5555 ^ 0xffffffff) < -64) {
					int i_19_ = anInt5555 >> 6;
					anInt5555 &= 0x3f;
					for (int i_20_ = 0; (i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff); i_20_++) {
						int i_21_;
						int i_22_;
						int i_23_;
						if ((((Class129) ((Class376_Sub2) this).aClass129_5559).aShort1765) > 0
								|| ((Class129) (((Class376_Sub2) this).aClass129_5559)).aShort1763 > 0) {
							int i_24_ = ((int) ((double) anInt5573 * Math
									.random()) + anInt5576);
							i_24_ &= 0x3fff;
							int i_25_ = Class335.anIntArray4436[i_24_];
							int i_26_ = Class335.anIntArray4430[i_24_];
							int i_27_ = ((int) (Math.random() * (double) anInt5574) + anInt5575);
							i_27_ &= 0x1fff;
							int i_28_ = Class335.anIntArray4436[i_27_];
							int i_29_ = Class335.anIntArray4430[i_27_];
							int i_30_ = 13;
							i_23_ = i_28_ * i_26_ >> i_30_;
							i_22_ = (i_29_ << 1) * -1;
							i_21_ = i_28_ * i_25_ >> i_30_;
						} else {
							i_21_ = anInt5571;
							i_22_ = anInt5572;
							i_23_ = anInt5577;
						}
						float f = (float) Math.random();
						float f_31_ = (float) Math.random();
						if (f + f_31_ > 1.0F) {
							f = -f + 1.0F;
							f_31_ = -f_31_ + 1.0F;
						}
						float f_32_ = -f_31_ - f + 1.0F;
						int i_33_ = (int) ((float) (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214)
								* f_32_ + (f
								* (float) (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1204) + (f_31_ * (float) (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1215))));
						int i_34_ = (int) ((float) (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217)
								* f_31_
								+ f
								* (float) ((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1202 + ((float) ((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1211 * f_32_));
						int i_35_ = (int) ((float) (((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209)
								* f_32_ + (((float) ((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1207 * f_31_) + f
								* (float) (((Class87) (((Class376_Sub2) this).aClass87_5563)).anInt1212)));
						int i_36_ = (int) (f_32_
								* (float) (((Class87) aClass87_5570).anInt1214) + (f
								* (float) (((Class87) aClass87_5570).anInt1204) + (f_31_ * (float) (((Class87) aClass87_5570).anInt1215))));
						int i_37_ = (int) (f_31_
								* (float) (((Class87) aClass87_5570).anInt1217)
								+ (float) (((Class87) aClass87_5570).anInt1202)
								* f + (float) (((Class87) aClass87_5570).anInt1211)
								* f_32_);
						int i_38_ = (int) ((float) (((Class87) aClass87_5570).anInt1209)
								* f_32_ + ((float) (((Class87) aClass87_5570).anInt1207)
								* f_31_ + (f * (float) (((Class87) aClass87_5570).anInt1212))));
						int i_39_ = i_33_ - i_36_;
						int i_40_ = i_34_ - i_37_;
						int i_41_ = -i_38_ + i_35_;
						int i_42_ = (int) ((double) i_39_ * Math.random() + (double) i_36_);
						int i_43_ = (int) ((double) i_37_ + (double) i_40_
								* Math.random());
						int i_44_ = (int) ((double) i_41_ * Math.random() + (double) i_38_);
						int i_45_ = (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1752 - -(int) (Math
								.random() * (double) ((((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1731) + -(((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1752))));
						int i_46_ = ((int) (Math.random() * (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1748 - (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1773))) + ((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1773);
						int i_47_ = (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1771 + (int) (Math
								.random() * (double) (-(((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1771) + (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1766))));
						int i_48_;
						if (!((Class129) ((Class376_Sub2) this).aClass129_5559).aBool1761)
							i_48_ = ((int) ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1770) + ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1749) * Math
									.random()))
									| ((int) ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1758) + (Math
											.random() * (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1793))) << 8 | (int) ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1729) + ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1778) * Math
											.random())) << 16) | (int) ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1799) + ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1745) * Math
									.random())) << 24);
						else {
							double d = Math.random();
							i_48_ = ((int) ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1799) + ((double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1745) * Math
									.random())) << 24 | ((int) (d
									* (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1793) + (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1758)) << 8
									| (int) ((d * (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1778)) + (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1729)) << 16 | (int) ((d * (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1749)) + (double) (((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1770))));
						}
						int i_49_ = (((Class129) ((Class376_Sub2) this).aClass129_5559).anInt1738);
						if (!class163.method1017()
								&& !((Class129) (((Class376_Sub2) this).aClass129_5559)).aBool1796)
							i_49_ = -1;
						if ((Class279.anInt3770 ^ 0xffffffff) != (Class4.anInt33 ^ 0xffffffff)) {
							Class376_Sub1_Sub1_Sub1 class376_sub1_sub1_sub1 = (Class11_Sub28.aClass376_Sub1_Sub1_Sub1Array6559[Class279.anInt3770]);
							Class279.anInt3770 = 0x3ff & Class279.anInt3770 + 1;
							class376_sub1_sub1_sub1
									.method3946(
											this,
											i_42_,
											i_43_,
											i_44_,
											i_23_,
											i_22_,
											i_21_,
											i_45_,
											i_46_,
											i_48_,
											i_47_,
											i_49_,
											((Class129) (((Class376_Sub2) this).aClass129_5559)).aBool1759,
											((Class129) (((Class376_Sub2) this).aClass129_5559)).aBool1746);
						} else {
							Class376_Sub1_Sub1_Sub1 class376_sub1_sub1_sub1 = (new Class376_Sub1_Sub1_Sub1(
									this,
									i_42_,
									i_43_,
									i_44_,
									i_23_,
									i_22_,
									i_21_,
									i_45_,
									i_46_,
									i_48_,
									i_47_,
									i_49_,
									((Class129) (((Class376_Sub2) this).aClass129_5559)).aBool1759,
									((Class129) (((Class376_Sub2) this).aClass129_5559)).aBool1746));
						}
					}
				}
			}
			if (!((Class376_Sub2) this).aClass87_5563.method617(-46,
					aClass87_5570)) {
				Class87 class87 = aClass87_5570;
				aClass87_5570 = ((Class376_Sub2) this).aClass87_5563;
				((Class376_Sub2) this).aClass87_5563 = class87;
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1499);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1491);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1502);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1509);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1505);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1216 = ((Class87) aClass87_5570).anInt1216;
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1493);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1208 = ((Class87) aClass87_5570).anInt1208;
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1504);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1206 = ((Class87) aClass87_5570).anInt1206;
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1494);
				((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204 = (((Class110) ((Class376_Sub2) this).aClass110_5564).anInt1492);
			}
			((Class376_Sub2) this).anInt5557 = 0;
			if (i <= -101) {
				for (Class376_Sub1_Sub1_Sub1 class376_sub1_sub1_sub1 = (Class376_Sub1_Sub1_Sub1) ((Class376_Sub2) this).aClass131_5569
						.method847(-31182); class376_sub1_sub1_sub1 != null; class376_sub1_sub1_sub1 = (Class376_Sub1_Sub1_Sub1) ((Class376_Sub2) this).aClass131_5569
						.method856(125)) {
					class376_sub1_sub1_sub1.method3950(l, i_5_);
					((Class376_Sub2) this).anInt5557++;
				}
				Class305.anInt4104 += ((Class376_Sub2) this).anInt5557;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("at.A("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ',' + l + ',' + i_5_ + ')'));
		}
	}

	public static void method2421(int i) {
		try {
			SKILL_LEVEL_IN_PACKET = null;
			if (i == -7050) {
				aClass298_5567 = null;
				aByteArrayArray5568 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "at.E(" + i + ')');
		}
	}

	Class376_Sub2(Class163 class163, Class110 class110,
			Class376_Sub10 class376_sub10, long l) {
		((Class376_Sub2) this).aClass87_5563 = new Class87();
		aClass87_5570 = new Class87();
		aBool5578 = false;
		try {
			aLong5558 = l;
			((Class376_Sub2) this).aClass376_Sub10_5561 = class376_sub10;
			((Class376_Sub2) this).aClass110_5564 = class110;
			((Class376_Sub2) this).aClass129_5559 = ((Class376_Sub2) this).aClass110_5564
					.method741(24844);
			if (!class163.method1017()
					&& (((Class129) ((Class376_Sub2) this).aClass129_5559).anInt1772) != -1)
				((Class376_Sub2) this).aClass129_5559 = Class216
						.method1387(
								(((Class129) (((Class376_Sub2) this).aClass129_5559)).anInt1772),
								true);
			((Class376_Sub2) this).aClass131_5569 = new Class131();
			anInt5555 += Math.random() * 64.0;
			method2417((byte) -115);
			((Class87) aClass87_5570).anInt1214 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1214;
			((Class87) aClass87_5570).anInt1204 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1204;
			((Class87) aClass87_5570).anInt1207 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1207;
			((Class87) aClass87_5570).anInt1202 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1202;
			((Class87) aClass87_5570).anInt1209 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1209;
			((Class87) aClass87_5570).anInt1217 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1217;
			((Class87) aClass87_5570).anInt1211 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1211;
			((Class87) aClass87_5570).anInt1212 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1212;
			((Class87) aClass87_5570).anInt1215 = ((Class87) ((Class376_Sub2) this).aClass87_5563).anInt1215;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("at.<init>(" + (class163 != null ? "{...}" : "null") + ','
							+ (class110 != null ? "{...}" : "null") + ','
							+ (class376_sub10 != null ? "{...}" : "null") + ','
							+ l + ')'));
		}
	}
}
