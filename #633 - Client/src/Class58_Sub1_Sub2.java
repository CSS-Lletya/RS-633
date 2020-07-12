/* Class58_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58_Sub1_Sub2 extends Class58_Sub1 {
	static int anInt9487;
	static int anInt9488;
	static int anInt9489;
	static int anInt9490;
	private byte[] aByteArray9491;
	static int anInt9492;

	public Class58_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	final byte[] method3740(int i, byte i_0_, int i_1_, int i_2_) {
		try {
			anInt9492++;
			if (i_0_ != -56)
				method3741(86L, null, 115);
			aByteArray9491 = new byte[i_1_ * (i * i_2_) * 2];
			this.method457(i, i_1_, false, i_2_);
			return aByteArray9491;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kda.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method2951(boolean bool, byte i, int i_3_) {
		try {
			anInt9489++;
			if (bool != false)
				aByteArray9491 = null;
			i = (byte) (127 + (i >> 1 & 0x7f));
			int i_4_ = i_3_ * 2;
			aByteArray9491[i_4_++] = i;
			aByteArray9491[i_4_] = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("kda.D(" + bool + ','
					+ i + ',' + i_3_ + ')'));
		}
	}

	static final void method3741(long l, Class163 class163, int i) {
		do {
			try {
				Class11_Sub12_Sub4.anInt9464 = Class305.anInt4104;
				anInt9488++;
				Class140.anInt1897 = 0;
				Class59.anInt883 = 0;
				Class305.anInt4104 = 0;
				long l_5_ = Class137.method878((byte) -95);
				if (i != -16448)
					method3741(126L, null, -61);
				for (Class376_Sub10 class376_sub10 = ((Class376_Sub10) IncomingPacket.aClass131_2086
						.method847(-31182)); class376_sub10 != null; class376_sub10 = (Class376_Sub10) IncomingPacket.aClass131_2086
						.method856(110)) {
					if (class376_sub10.method3164(class163, l))
						Class140.anInt1897++;
				}
				if (!Class376_Sub7_Sub5_Sub2.aBool10025 || l % 100L != 0L)
					break;
				System.out.println("Particle system count: "
						+ IncomingPacket.aClass131_2086.method848((byte) 58)
						+ ", running: " + Class140.anInt1897);
				System.out.println("Emitters: " + Class59.anInt883
						+ " Particles: " + Class305.anInt4104
						+ ". Time taken: "
						+ (-l_5_ + Class137.method878((byte) -55)) + "ms");
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("kda.C(" + l + ','
								+ (class163 != null ? "{...}" : "null") + ','
								+ i + ')'));
			}
			break;
		} while (false);
	}
}
