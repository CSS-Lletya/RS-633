/* Class11_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub11 extends Class11 {
	short aShort5399;
	static int anInt5400;
	static int[] anIntArray5401 = new int[1];
	static int anInt5402;

	static final Class376_Sub5 method2370(boolean bool, int i, int i_0_) {
		try {
			anInt5400++;
			if (i_0_ != 24824)
				method2371(-125, null, null, false, 79);
			synchronized (Class11_Sub2_Sub12.aClass131Array8873) {
				Class376_Sub5 class376_sub5;
				if (Class11_Sub2_Sub12.aClass131Array8873.length > i
						&& !Class11_Sub2_Sub12.aClass131Array8873[i]
								.method852(15)) {
					class376_sub5 = (Class376_Sub5) Class11_Sub2_Sub12.aClass131Array8873[i]
							.method854(i_0_ ^ 0x6078);
					class376_sub5.method2207((byte) -111);
					Class11_Sub37.anIntArray7090[i]--;
				} else {
					class376_sub5 = new Class376_Sub5();
					((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916 = new Class376_Sub4[i];
					for (int i_1_ = 0; i_1_ < i; i_1_++)
						((Class376_Sub5) class376_sub5).aClass376_Sub4Array6916[i_1_] = new Class376_Sub4();
				}
				((Class376_Sub5) class376_sub5).aBool6914 = bool;
				return class376_sub5;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("hia.B(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	public Class11_Sub11() {
		/* empty */
	}

	static final void method2371(int i, Object[] objects, int[] is,
			boolean bool, int i_2_) {
		do {
			try {
				anInt5402++;
				if ((i ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
					int i_3_ = (i_2_ + i) / 2;
					int i_4_ = i;
					int i_5_ = is[i_3_];
					is[i_3_] = is[i_2_];
					is[i_2_] = i_5_;
					Object object = objects[i_3_];
					objects[i_3_] = objects[i_2_];
					objects[i_2_] = object;
					int i_6_ = (i_5_ ^ 0xffffffff) == -2147483648 ? 0 : 1;
					for (int i_7_ = i; (i_2_ ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
						if (((i_6_ & i_7_) + i_5_ ^ 0xffffffff) < (is[i_7_] ^ 0xffffffff)) {
							int i_8_ = is[i_7_];
							is[i_7_] = is[i_4_];
							is[i_4_] = i_8_;
							Object object_9_ = objects[i_7_];
							objects[i_7_] = objects[i_4_];
							objects[i_4_++] = object_9_;
						}
					}
					is[i_2_] = is[i_4_];
					is[i_4_] = i_5_;
					objects[i_2_] = objects[i_4_];
					objects[i_4_] = object;
					method2371(i, objects, is, bool, -1 + i_4_);
					method2371(i_4_ + 1, objects, is, bool, i_2_);
				}
				if (bool == true)
					break;
				anIntArray5401 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("hia.C(" + i + ','
						+ (objects != null ? "{...}" : "null") + ','
						+ (is != null ? "{...}" : "null") + ',' + bool + ','
						+ i_2_ + ')'));
			}
			break;
		} while (false);
	}

	Class11_Sub11(short i) {
		try {
			((Class11_Sub11) this).aShort5399 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, "hia.<init>(" + i + ')');
		}
	}

	public static void method2372(byte i) {
		do {
			try {
				anIntArray5401 = null;
				if (i == 25)
					break;
				anIntArray5401 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "hia.A(" + i + ')');
			}
			break;
		} while (false);
	}
}
