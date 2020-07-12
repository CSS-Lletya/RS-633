/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 {
	static int anInt1879;
	static int anInt1880;
	static int anInt1881;
	static String[] aStringArray1882 = new String[200];
	static int anInt1883;

	static final boolean method875(int i, boolean bool) {
		try {
			if (i >= -64)
				return false;
			anInt1880++;
			boolean bool_0_ = Class321_Sub2.aClass163_6648.method1086();
			if (bool_0_ != bool) {
				if (!bool)
					Class321_Sub2.aClass163_6648.method1006();
				else if (!Class321_Sub2.aClass163_6648.method1032())
					bool = false;
				if (bool_0_ != !bool)
					return false;
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								!bool ? 0 : 1,
								(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub23_5699));
				Class186.method1212(10343);
				return true;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eu.C(" + i + ','
					+ bool + ')');
		}
	}

	static final Class321_Sub3_Sub1 method876(boolean bool, int i,
			Class163_Sub3 class163_sub3, int[] is, int i_1_, int i_2_,
			int i_3_, int i_4_) {
		try {
			anInt1881++;
			if (i_2_ != 34037)
				method878((byte) 66);
			if (((Class163_Sub3) class163_sub3).aBool8352
					|| (Class261.method1669(i_3_, (byte) 117) && Class261
							.method1669(i_4_, (byte) 65)))
				return new Class321_Sub3_Sub1(class163_sub3, 3553, i_3_, i_4_,
						bool, is, i_1_, i);
			if (((Class163_Sub3) class163_sub3).aBool8389)
				return new Class321_Sub3_Sub1(class163_sub3, 34037, i_3_, i_4_,
						bool, is, i_1_, i);
			return new Class321_Sub3_Sub1(class163_sub3, i_3_, i_4_,
					Class11_Sub2_Sub33.method3808(113, i_3_),
					Class11_Sub2_Sub33.method3808(112, i_4_), is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("eu.D(" + bool + ','
					+ i + ',' + (class163_sub3 != null ? "{...}" : "null")
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
		}
	}

	public static void method877(byte i) {
		do {
			try {
				aStringArray1882 = null;
				if (i == 83)
					break;
				aStringArray1882 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "eu.B(" + i + ')');
			}
			break;
		} while (false);
	}

	static final synchronized long method878(byte i) {
		try {
			if (i >= -38)
				return -118L;
			anInt1883++;
			long l = System.currentTimeMillis();
			if ((Class11_Sub7.aLong5259 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL))
				Class255.aLong3500 += -l + Class11_Sub7.aLong5259;
			Class11_Sub7.aLong5259 = l;
			return Class255.aLong3500 + l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "eu.A(" + i + ')');
		}
	}
}
