/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
	static int anInt829;
	static int anInt830;
	static int anInt831;
	static IncomingPacket aClass160_832 = new IncomingPacket(71, 10);
	static int anInt833;
	static OutgoingPacket aClass370_834 = new OutgoingPacket(67, 2);
	static Class83 aClass83_835 = new Class83(12, 16);
	static String aString836;

	static final boolean method446(Interface13 interface13, boolean bool) {
		try {
			anInt829++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793((byte) 5,
					interface13.method42((byte) -17));
			if (((Class42) class42).anInt600 == -1)
				return true;
			if (bool != false)
				return false;
			Class152 class152 = Class47.aClass29_741.method247(9,
					((Class42) class42).anInt600);
			if (((Class152) class152).anInt2017 == -1)
				return true;
			return class152.method954(79);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("fca.C(" + (interface13 != null ? "{...}" : "null") + ','
							+ bool + ')'));
		}
	}

	static final String method447(int i, int i_0_, String[] strings, int i_1_) {
		try {
			anInt833++;
			if ((i_0_ ^ 0xffffffff) == -1)
				return "";
			if (i_0_ == 1) {
				String string = strings[i_1_];
				if (string == null)
					return "null";
				return string.toString();
			}
			int i_2_ = i_1_ + i_0_;
			int i_3_ = 0;
			for (int i_4_ = i_1_; (i_4_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_4_++) {
				String string = strings[i_4_];
				if (string != null)
					i_3_ += string.length();
				else
					i_3_ += 4;
			}
			StringBuffer stringbuffer = new StringBuffer(i_3_);
			if (i >= -89)
				return null;
			for (int i_5_ = i_1_; i_2_ > i_5_; i_5_++) {
				String string = strings[i_5_];
				if (string == null)
					stringbuffer.append("null");
				else
					stringbuffer.append(string);
			}
			return stringbuffer.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("fca.B(" + i + ','
					+ i_0_ + ',' + (strings != null ? "{...}" : "null") + ','
					+ i_1_ + ')'));
		}
	}

	public static void method448(byte i) {
		try {
			if (i != 44)
				aString836 = null;
			aClass370_834 = null;
			aString836 = null;
			aClass160_832 = null;
			aClass83_835 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fca.A(" + i + ')');
		}
	}

	static final void method449(Class163 class163, byte i) {
		try {
			anInt831++;
			Class298.aClass107_4028 = Class329.method1993(
					Class11_Sub45_Sub14.anInt9318, true, 0, class163);
			Class11_Sub45_Sub2.aClass292_8511 = Class42.method376(101,
					class163, Class11_Sub45_Sub14.anInt9318);
			OutputStream_Sub2.aClass107_7949 = Class329.method1993(
					Class372.anInt4874, true, 0, class163);
			int i_6_ = 98 % ((i + 37) / 56);
			Class161.aClass292_2096 = Class42.method376(125, class163,
					Class372.anInt4874);
			Class98.aClass107_1308 = Class329.method1993(
					Class58_Sub2.anInt7839, true, 0, class163);
			Class256_Sub1.aClass292_5320 = Class42.method376(-125, class163,
					Class58_Sub2.anInt7839);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "fca.D("
					+ (class163 != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
