/* Class11_Sub2_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub24 extends Class11_Sub2 {
	static int anInt9280;
	static Class174 aClass174_9281 = new Class174();
	static int anInt9282;
	static IncomingPacket aClass160_9283 = new IncomingPacket(106, 6);
	static Class347 aClass347_9284;
	static int anInt9285;
	static double aDouble9286;

	private final int method3621(int i, boolean bool, int i_0_) {
		try {
			anInt9280++;
			int i_1_ = i_0_ * 57 + i;
			if (bool != true)
				return 56;
			i_1_ ^= i_1_ << 1;
			return (4096 - ((0x7fffffff & 1376312589
					+ (789221 + i_1_ * i_1_ * 15731) * i_1_) / 262144));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mm.C(" + i + ','
					+ bool + ',' + i_0_ + ')'));
		}
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9285++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				aDouble9286 = 1.4861288448381387;
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_2_ = Class171.anIntArray2199[i];
				for (int i_3_ = 0; ((i_3_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_3_++)
					is[i_3_] = method3621(Class208.anIntArray2808[i_3_], true,
							i_2_) % 4096;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mm.A(" + i + ','
					+ bool + ')');
		}
	}

	public static void method3622(int i) {
		try {
			int i_4_ = 17 / ((i + 13) / 34);
			aClass174_9281 = null;
			aClass347_9284 = null;
			aClass160_9283 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mm.F(" + i + ')');
		}
	}

	static final void method3623(int i, int i_5_, byte i_6_) {
		try {
			anInt9282++;
			Class11_Sub45_Sub15 class11_sub45_sub15 = Packet.method3421(
					-652872096, 16, i_5_);
			class11_sub45_sub15.method3661(0);
			if (i_6_ <= -99)
				((Class11_Sub45_Sub15) class11_sub45_sub15).anInt9363 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mm.E(" + i + ','
					+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	public Class11_Sub2_Sub24() {
		super(0, true);
	}
}
