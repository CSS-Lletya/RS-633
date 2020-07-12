/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116 {
	static int anInt1582;
	static int anInt1583;
	Class246 aClass246_1584 = new Class246();

	static final void method763(byte i) {
		try {
			int i_0_ = 124 % ((i + 19) / 63);
			anInt1583++;
			OutgoingPacket.anInt4857 = Class79.anInt1066 = Class11_Sub6_Sub2.anInt8905 = Class376_Sub3.anInt6120 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dm.B(" + i + ')');
		}
	}

	static final void decodeLocalNPCUpdate(int i) {
		try {
			Class11_Sub2_Sub22.anInt9204 = 0;
			anInt1582++;
			Class147.anInt1994++;
			Class228.anInt3148 = 0;
			Class277.method1712(29921);
			Class280.method1722(68);
			Class11_Sub47.decodeLocalNPCMasks(107);
			boolean bool = false;
			for (int i_1_ = 0; Class228.anInt3148 > i_1_; i_1_++) {
				int i_2_ = Class236_Sub1.anIntArray6080[i_1_];
				Class11_Sub25 class11_sub25 = (Class11_Sub25) Class11_Sub2_Sub25.aClass213_9322
						.method1369((byte) 26, (long) i_2_);
				Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
				if (Class306.aBool4114
						&& Class236_Sub4.method2768(i_2_, (byte) -120))
					Class11_Sub18.method2477((byte) 78);
				if ((((Actor) class376_sub7_sub5_sub5_sub2).anInt10322) != Class147.anInt1994) {
					if (((Npc) class376_sub7_sub5_sub5_sub2).aClass215_10501
							.method1376(90))
						Class82.method566(-123, class376_sub7_sub5_sub5_sub2);
					class376_sub7_sub5_sub5_sub2.method4005(-1, null);
					bool = true;
					class11_sub25.method122(-105);
				}
			}
			if (bool) {
				Class108_Sub17.anInt6619 = Class11_Sub2_Sub25.aClass213_9322
						.method1366(-52);
				Class11_Sub2_Sub25.aClass213_9322.method1370(
						Class369.aClass11_Sub25Array4842, -1);
			}
			if ((((Stream) Class3.packetStream).position ^ 0xffffffff) != (Class37.anInt486 ^ 0xffffffff))
				throw new RuntimeException("gnp1 pos:"
						+ (((Stream) Class3.packetStream).position) + " psize:"
						+ Class37.anInt486);
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (Class23.anInt249 ^ 0xffffffff); i_3_++) {
				if ((Class11_Sub2_Sub25.aClass213_9322.method1369((byte) 26,
						(long) Class11_Sub52.anIntArray8054[i_3_])) == null)
					throw new RuntimeException("gnp2 pos:" + i_3_ + " size:"
							+ Class23.anInt249);
			}
			int i_4_ = -43 % ((i + 68) / 39);
			if (Class108_Sub17.anInt6619 - Class23.anInt249 != 0)
				throw new RuntimeException("gnp3 mis:"
						+ (Class108_Sub17.anInt6619 - Class23.anInt249));
			for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (Class108_Sub17.anInt6619 ^ 0xffffffff); i_5_++) {
				if ((((Actor) (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_5_]).aNpc_2373)).anInt10322 ^ 0xffffffff) != (Class147.anInt1994 ^ 0xffffffff))
					throw new RuntimeException(
							"gnp4 uk:"
									+ (((Actor) (((Class11_Sub25) Class369.aClass11_Sub25Array4842[i_5_]).aNpc_2373)).anInt10319));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dm.A(" + i + ')');
		}
	}

	public Class116() {
		/* empty */
	}
}
