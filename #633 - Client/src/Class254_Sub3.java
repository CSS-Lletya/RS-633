/* Class254_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class254_Sub3 extends Class254 {
	static int anInt8038;
	int anInt8039;
	static int anInt8040;
	static int anInt8041;
	static IncomingPacket aClass160_8042;
	static int[] anIntArray8043 = new int[14];
	static int anInt8044;
	int anInt8045;
	static int anInt8046;
	static int anInt8047;
	static int anInt8048;
	static boolean aBool8049;

	static final void method3237(byte i,
			Actor class376_sub7_sub5_sub5) {
		do {
			try {
				anInt8046++;
				int i_0_ = (-Class11_Sub25.anInt6279 + (((Actor) class376_sub7_sub5_sub5).anInt10315));
				int i_1_ = (512 * ((Actor) class376_sub7_sub5_sub5).anInt10333 + class376_sub7_sub5_sub5
						.method3968((byte) 127) * 256);
				int i_2_ = (512 * ((Actor) class376_sub7_sub5_sub5).anInt10341 - -(256 * class376_sub7_sub5_sub5
						.method3968((byte) 127)));
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 += (-((Class376_Sub7) class376_sub7_sub5_sub5).anInt7045 + i_1_)
						/ i_0_;
				((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031 += ((i_2_ - ((Class376_Sub7) class376_sub7_sub5_sub5).anInt7031) / i_0_);
				((Actor) class376_sub7_sub5_sub5).anInt10373 = 0;
				if (((((Actor) class376_sub7_sub5_sub5).anInt10294) ^ 0xffffffff) == -1)
					class376_sub7_sub5_sub5.method3953(8192, 8192);
				if ((((Actor) class376_sub7_sub5_sub5).anInt10294) == 1)
					class376_sub7_sub5_sub5.method3953(i + 8117, 12288);
				if (i != 75)
					anInt8048 = 101;
				if ((((Actor) class376_sub7_sub5_sub5).anInt10294) == 2)
					class376_sub7_sub5_sub5.method3953(i + 8117, 0);
				if (((((Actor) class376_sub7_sub5_sub5).anInt10294) ^ 0xffffffff) != -4)
					break;
				class376_sub7_sub5_sub5.method3953(i + 8117, 4096);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("vea.D("
								+ i
								+ ','
								+ (class376_sub7_sub5_sub5 != null ? "{...}"
										: "null") + ')'));
			}
			break;
		} while (false);
	}

	static final Object method3238(int i, boolean bool, byte[] is) {
		try {
			if (i <= 70)
				method3239(-54, 89, 68);
			anInt8044++;
			if (is == null)
				return null;
			if ((is.length ^ 0xffffffff) < -137 && !Class216.aBool3000) {
				try {
					Class61 class61 = (Class61) Class.forName("Class61_Sub1")
							.newInstance();
					class61.method471(14, is);
					return class61;
				} catch (Throwable throwable) {
					Class216.aBool3000 = true;
				}
			}
			if (bool)
				return Class11_Sub45_Sub20_Sub2.method3943(is, (byte) 95);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vea.B(" + i + ','
					+ bool + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	Class254_Sub3(Class118 class118, Class150 class150, int i, int i_3_,
			int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_) {
		super(class118, class150, i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_);
		try {
			((Class254_Sub3) this).anInt8045 = i_9_;
			((Class254_Sub3) this).anInt8039 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vea.<init>("
					+ (class118 != null ? "{...}" : "null") + ','
					+ (class150 != null ? "{...}" : "null") + ',' + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_
					+ ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ')'));
		}
	}

	static final boolean method3239(int i, int i_11_, int i_12_) {
		try {
			if (i <= 126)
				return false;
			anInt8041++;
			if ((i_12_ & 0x10000) == 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vea.E(" + i + ','
					+ i_11_ + ',' + i_12_ + ')'));
		}
	}

	public final Class9 method21(boolean bool) {
		try {
			anInt8038++;
			if (bool != false)
				anIntArray8043 = null;
			return Class107.aClass9_1440;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vea.A(" + bool + ')');
		}
	}

	public static void method3240(int i) {
		do {
			try {
				anIntArray8043 = null;
				aClass160_8042 = null;
				if (i == 14)
					break;
				method3239(-36, 21, -126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vea.C(" + i + ')');
			}
			break;
		} while (false);
	}

	static {
		anInt8040 = 0;
		aBool8049 = false;
		anInt8047 = 0;
		aClass160_8042 = new IncomingPacket(13, 2);
	}
}
