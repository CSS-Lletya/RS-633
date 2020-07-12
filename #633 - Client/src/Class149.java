/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class149 {
	static int anInt1996;
	static double aDouble1997;
	static boolean aBool1998 = false;
	static int anInt1999;
	static int anInt2000;

	static final void method946(Class212 class212, int i, int i_0_, int i_1_,
			byte i_2_, Class206 class206) {
		try {
			if (i_2_ > -70)
				method947((byte) -96, null);
			anInt1999++;
			if (class206 != null)
				class212.method1360(i, class206.G(), class206.fa(),
						class206.RA(), class206.na(), 633, class206.EA(),
						class206.HA(), class206.V(), i_1_, i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fs.B("
					+ (class212 != null ? "{...}" : "null") + ',' + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ','
					+ (class206 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method947(byte i,
			Actor class376_sub7_sub5_sub5) {
		do {
			try {
				anInt2000++;
				if (i != -120)
					method946(null, 67, -43, -19, (byte) -29, null);
				boolean bool = false;
				do {
					if ((((Actor) class376_sub7_sub5_sub5).anInt10330) != Class11_Sub25.anInt6279
							&& (((Actor) class376_sub7_sub5_sub5).anInt10352 ^ 0xffffffff) != 0
							&& (((Actor) class376_sub7_sub5_sub5).anInt10286 ^ 0xffffffff) == -1) {
						Class281 class281 = (Class108_Sub23.aClass198_7760
								.method1284(
										((Actor) class376_sub7_sub5_sub5).anInt10352,
										(byte) 114));
						if (!((Class281) class281).aBool3798
								&& (1 + ((Actor) class376_sub7_sub5_sub5).anInt10282 <= (((Class281) class281).anIntArray3817[((Actor) class376_sub7_sub5_sub5).anInt10326])))
							break;
						bool = true;
						if (!client.aBool10531)
							break;
					}
					bool = true;
				} while (false);
				if (bool) {
					int i_3_ = (-((Actor) class376_sub7_sub5_sub5).anInt10315 + ((Actor) class376_sub7_sub5_sub5).anInt10330);
					int i_4_ = -(((Actor) class376_sub7_sub5_sub5).anInt10315)
							+ Class11_Sub25.anInt6279;
					int i_5_ = ((((Actor) class376_sub7_sub5_sub5).anInt10333) * 512 - -(class376_sub7_sub5_sub5
							.method3968((byte) 127) * 256));
					int i_6_ = ((((Actor) class376_sub7_sub5_sub5).anInt10341) * 512 + (class376_sub7_sub5_sub5
							.method3968((byte) 127) * 256));
					int i_7_ = (512 * ((Actor) class376_sub7_sub5_sub5).anInt10308 - -(256 * class376_sub7_sub5_sub5
							.method3968((byte) 127)));
					int i_8_ = (512 * ((Actor) class376_sub7_sub5_sub5).anInt10328 - -(256 * class376_sub7_sub5_sub5
							.method3968((byte) 127)));
					((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 = (i_8_
							* i_4_ + i_6_ * (i_3_ - i_4_))
							/ i_3_;
					((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 = (i_5_
							* (-i_4_ + i_3_) - -(i_4_ * i_7_))
							/ i_3_;
				}
				((Actor) class376_sub7_sub5_sub5).anInt10373 = 0;
				if (((((Actor) class376_sub7_sub5_sub5).anInt10294) ^ 0xffffffff) == -1)
					class376_sub7_sub5_sub5.method3961(false, 42, 8192);
				if ((((Actor) class376_sub7_sub5_sub5).anInt10294) == 1)
					class376_sub7_sub5_sub5.method3961(false, -115, 12288);
				if (((((Actor) class376_sub7_sub5_sub5).anInt10294) ^ 0xffffffff) == -3)
					class376_sub7_sub5_sub5.method3961(false, -106, 0);
				if (((((Actor) class376_sub7_sub5_sub5).anInt10294) ^ 0xffffffff) != -4)
					break;
				class376_sub7_sub5_sub5.method3961(false, 60, 4096);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("fs.A("
								+ i
								+ ','
								+ (class376_sub7_sub5_sub5 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	static {
		anInt1996 = 0;
	}
}
