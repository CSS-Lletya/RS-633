/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class342 {
	int[] anIntArray4533;
	int[] anIntArray4534;
	static OutgoingPacket aClass370_4535 = new OutgoingPacket(59, 7);
	static int anInt4536;
	static int anInt4537;
	static Class11_Sub45_Sub5 aClass11_Sub45_Sub5_4538;
	int anInt4539;

	static final void method2074(boolean bool, String string, byte i,
			Class341 class341, boolean bool_0_) {
		do {
			try {
				anInt4537++;
				if (!bool)
					Class21.method179(class341, string, 3, true);
				else {
					if (Class341.aString4512.startsWith("win")
							&& ((Class341) class341).aBool4520) {
						String string_1_ = null;
						if (Class108_Sub16.anApplet6538 != null)
							string_1_ = Class108_Sub16.anApplet6538
									.getParameter("haveie6");
						if (string_1_ == null || !string_1_.equals("1")) {
							Class368 class368 = Class21.method179(class341,
									string, 0, true);
							Class11_Sub2_Sub32.aClass341_9653 = class341;
							Class237.aString3240 = string;
							Class268.aClass368_3639 = class368;
							break;
						}
					}
					if (Class341.aString4512.startsWith("mac")) {
						String string_2_ = null;
						if (Class108_Sub16.anApplet6538 != null)
							string_2_ = Class108_Sub16.anApplet6538
									.getParameter("havefirefox");
						if (string_2_ != null && string_2_.equals("1")
								&& bool_0_) {
							Class21.method179(class341, string, 1, true);
							break;
						}
					}
					Class21.method179(class341, string, 2, true);
				}
				if (i >= 114)
					break;
				method2076((byte) -29);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vd.C(" + bool
						+ ',' + (string != null ? "{...}" : "null") + ',' + i
						+ ',' + (class341 != null ? "{...}" : "null") + ','
						+ bool_0_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method2075(int i, int i_3_, int i_4_, boolean bool,
			int i_5_, int i_6_) {
		try {
			if (bool != true)
				method2076((byte) -13);
			do {
				if ((Class26.anInt340 ^ 0xffffffff) >= (i ^ 0xffffffff)
						&& Class11_Sub45_Sub1_Sub2.anInt9880 >= i_6_
						&& i_4_ >= Class292.anInt3962
						&& (i_3_ ^ 0xffffffff) >= (Class351.anInt4618 ^ 0xffffffff)) {
					Class10.method116(-86, i, i_3_, i_4_, i_5_, i_6_);
					if (!client.aBool10531)
						break;
				}
				Class164.method1089(i_5_, i_6_, i, 63, i_4_, i_3_);
			} while (false);
			anInt4536++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("vd.A(" + i + ',' + i_3_ + ',' + i_4_ + ',' + bool + ','
							+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	public static void method2076(byte i) {
		try {
			aClass11_Sub45_Sub5_4538 = null;
			if (i < 86)
				aClass11_Sub45_Sub5_4538 = null;
			aClass370_4535 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vd.B(" + i + ')');
		}
	}

	Class342(int i) {
		try {
			((Class342) this).anInt4539 = i;
			((Class342) this).anIntArray4534 = new int[((Class342) this).anInt4539];
			((Class342) this).anIntArray4533 = new int[((Class342) this).anInt4539];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vd.<init>(" + i + ')');
		}
	}
}
