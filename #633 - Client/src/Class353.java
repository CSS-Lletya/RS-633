/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class353 {
	static int anInt4633;
	static OutgoingPacket ACTION_BUTTON4 = new OutgoingPacket(9, 8);
	static int anInt4635;
	static int anInt4636;
	private Class146 aClass146_4637;
	static int anInt4638;
	private Class22 aClass22_4639 = new Class22(128);
	static int anInt4640;
	static int anInt4641;
	static int anInt4642;
	static int anInt4643;

	final void method2112(byte i) {
		try {
			anInt4636++;
			if (i == -93) {
				synchronized (aClass22_4639) {
					aClass22_4639.method189((byte) 120);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vu.A(" + i + ')');
		}
	}

	final Class327 method2113(int i, boolean bool) {
		try {
			anInt4642++;
			Class327 class327;
			synchronized (aClass22_4639) {
				class327 = (Class327) aClass22_4639.method188((long) i,
						(byte) 84);
			}
			if (class327 != null)
				return class327;
			byte[] is;
			synchronized (aClass146_4637) {
				is = aClass146_4637.method930(i, (byte) 112, 1);
			}
			class327 = new Class327();
			if (is != null)
				class327.method1989(new Stream(is), -128);
			synchronized (aClass22_4639) {
				aClass22_4639.method184((byte) 127, class327, (long) i);
			}
			if (bool != true)
				return null;
			return class327;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vu.D(" + i + ','
					+ bool + ')');
		}
	}

	static final Class376_Sub3 method2114(int i) {
		try {
			anInt4638++;
			if (i != 1)
				ACTION_BUTTON4 = null;
			Class376_Sub3 class376_sub3 = (Class376_Sub3) Class11_Sub45_Sub20_Sub1.aClass131_9959
					.method849((byte) -37);
			if (class376_sub3 != null) {
				Class11_Sub45_Sub11.anInt9159--;
				return class376_sub3;
			}
			return new Class376_Sub3();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vu.B(" + i + ')');
		}
	}

	public static void method2115(boolean bool) {
		do {
			try {
				ACTION_BUTTON4 = null;
				if (bool == true)
					break;
				anInt4643 = 56;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vu.F(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final void method2116(int i) {
		try {
			anInt4635++;
			synchronized (aClass22_4639) {
				aClass22_4639.method190(0);
				if (i != -16505)
					method2116(-56);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vu.C(" + i + ')');
		}
	}

	final void method2117(byte i, int i_0_) {
		try {
			synchronized (aClass22_4639) {
				aClass22_4639.method182(i_0_, (byte) -73);
				if (i != -106)
					ACTION_BUTTON4 = null;
			}
			anInt4633++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vu.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final void method2118(int i, int i_1_, int i_2_, Class163 class163,
			int i_3_, int i_4_, int i_5_,
			Class11_Sub45_Sub5 class11_sub45_sub5, int i_6_, int i_7_,
			int i_8_, int i_9_) {
		do {
			try {
				if ((i_5_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff)
						&& i_5_ < i_7_ + i_9_ && i_8_ - 13 < i_4_
						&& i_8_ + 3 > i_4_
						&& ((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8757)
					i_2_ = i_1_;
				anInt4640++;
				int[] is = null;
				if (!Class135.method872(-46,
						((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760)) {
					if (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759 != -1)
						is = ((Class249) (Packet.aClass223_8723
								.method1430(
										(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8759),
										false))).anIntArray3368;
					else if (!Class26
							.method221(
									((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760,
									(byte) -94)) {
						if (Class11_Sub45_Sub16_Sub2
								.method3931(
										8071,
										(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760))) {
							Object object = null;
							Class42 class42;
							if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) != 1004)
								class42 = (Class11_Sub4.aClass290_5237
										.method1793(
												(byte) -115,
												(int) ((((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771 >>> 32) & 0x7fffffffL)));
							else
								class42 = (Class11_Sub4.aClass290_5237
										.method1793(
												(byte) 39,
												(int) ((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771));
							if (((Class42) class42).anIntArray683 != null)
								class42 = class42
										.method380(
												(Class11_Sub26.aClass97_6296),
												i_6_ - 9);
							if (class42 != null)
								is = ((Class42) class42).anIntArray676;
						}
					} else {
						Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
								.method1369(
										(byte) 26,
										(long) (int) (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771))));
						if (class11_sub25 != null) {
							Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
							NPCDefinitions class215 = (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501);
							if (((NPCDefinitions) class215).anIntArray2950 != null)
								class215 = class215.method1375((byte) 29,
										(Class11_Sub26.aClass97_6296));
							if (class215 != null)
								is = ((NPCDefinitions) class215).anIntArray2925;
						}
					}
				} else
					is = ((Class249) (Packet.aClass223_8723
							.method1430(
									(int) (((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8771),
									false))).anIntArray3368;
				String string = Class164.method1091(class11_sub45_sub5, -126);
				if (i_6_ == 9) {
					if (is != null)
						string += Class11_Sub32.method2795(is, (byte) 122);
					Class98.aClass107_1308.method718(0, i_2_, i_6_ ^ 0x6d,
							i_9_ + 3, Class46.aClass253Array722, string,
							(Class376_Sub7_Sub5_Sub4.anIntArray10126), i_8_);
					if (!((Class11_Sub45_Sub5) class11_sub45_sub5).aBool8768)
						break;
					Class108.aClass253_1464.method1610(
							(Class256_Sub1.aClass292_5320.method1805(string,
									(byte) -88) + 5 + i_9_), i_8_ - 12);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vu.E(" + i + ','
						+ i_1_ + ',' + i_2_ + ','
						+ (class163 != null ? "{...}" : "null") + ',' + i_3_
						+ ',' + i_4_ + ',' + i_5_ + ','
						+ (class11_sub45_sub5 != null ? "{...}" : "null") + ','
						+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
			}
			break;
		} while (false);
	}

	Class353(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_4637 = class146;
			aClass146_4637.method914(1, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vu.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}
}
