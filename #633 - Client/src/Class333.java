/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class333 {
	static int anInt4410;
	static boolean aBool4411 = true;
	static Class131 aClass131_4412;
	static int anInt4413;
	static int anInt4414;
	static int[] anIntArray4415 = new int[14];
	int anInt4416;
	static IComponentDefinitions aClass192_4417;
	String aString4418;

	static final boolean method2005(int i, byte[] is, int i_0_, int i_1_,
			byte i_2_, int i_3_) {
		try {
			anInt4410++;
			boolean bool = true;
			Stream stream = new Stream(is);
			if (i_2_ > -69)
				aClass192_4417 = null;
			int i_4_ = -1;
			for (;;) {
				int i_5_ = stream.method2557(-2);
				if (i_5_ == 0)
					break;
				i_4_ += i_5_;
				int i_6_ = 0;
				boolean bool_7_ = false;
				for (;;) {
					if (!bool_7_) {
						int i_8_ = stream.readSmart(-59);
						if ((i_8_ ^ 0xffffffff) == -1)
							break;
						i_6_ += -1 + i_8_;
						int i_9_ = i_6_ & 0x3f;
						int i_10_ = (i_6_ & 0xfe3) >> 6;
						int i_11_ = stream.readUnsignedByte((byte) 35) >> 2;
						int i_12_ = i_3_ + i_10_;
						int i_13_ = i_1_ + i_9_;
						if ((i_12_ ^ 0xffffffff) < -1
								&& (i_13_ ^ 0xffffffff) < -1
								&& i_12_ < -1 + i
								&& (i_0_ - 1 ^ 0xffffffff) < (i_13_ ^ 0xffffffff)) {
							Class42 class42 = Class11_Sub4.aClass290_5237
									.method1793((byte) -79, i_4_);
							if ((i_11_ ^ 0xffffffff) != -23
									|| (((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub3_5703
											.method2347(false) != 0)
									|| ((((Class42) class42).anInt664 ^ 0xffffffff) != -1)
									|| ((Class42) class42).anInt685 == 1
									|| ((Class42) class42).aBool604) {
								if (!class42.method377(-73)) {
									Class7.anInt45++;
									bool = false;
								}
								bool_7_ = true;
							}
						}
					} else {
						int i_14_ = stream.readSmart(98);
						if (i_14_ == 0)
							break;
						stream.readUnsignedByte((byte) 35);
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ue.D(" + i + ','
					+ (is != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_
					+ ',' + i_2_ + ',' + i_3_ + ')'));
		}
	}

	abstract Socket method2006(int i) throws IOException;

	final Socket method2007(byte i) throws IOException {
		try {
			if (i <= 18)
				method2005(-69, null, 70, -59, (byte) -100, -38);
			anInt4413++;
			return new Socket(((Class333) this).aString4418,
					((Class333) this).anInt4416);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ue.C(" + i + ')');
		}
	}

	static final void method2008(Class146 class146, boolean bool,
			Class341 class341) {
		try {
			Class206_Sub2.aString6438 = "";
			Class236_Sub6.aClass341_6966 = class341;
			if (bool != true)
				anIntArray4415 = null;
			anInt4414++;
			Class2_Sub8.aClass146_6858 = class146;
			if (Class306.aString4113.startsWith("win"))
				Class206_Sub2.aString6438 += "windows/";
			else if (!Class306.aString4113.startsWith("linux")) {
				if (Class306.aString4113.startsWith("mac"))
					Class206_Sub2.aString6438 += "macos/";
			} else
				Class206_Sub2.aString6438 += "linux/";
			if (!((Class341) Class236_Sub6.aClass341_6966).aBool4502) {
				if (Class306.aString4109.startsWith("amd64")
						|| Class306.aString4109.startsWith("x86_64"))
					Class206_Sub2.aString6438 += "x86_64/";
				else if (!Class306.aString4109.startsWith("i386")
						&& !Class306.aString4109.startsWith("i486")
						&& !Class306.aString4109.startsWith("i586")
						&& !Class306.aString4109.startsWith("x86")) {
					if (!Class306.aString4109.startsWith("ppc"))
						Class206_Sub2.aString6438 += "universal/";
					else
						Class206_Sub2.aString6438 += "ppc/";
				} else
					Class206_Sub2.aString6438 += "x86/";
			} else
				Class206_Sub2.aString6438 += "msjava/";
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ue.E("
					+ (class146 != null ? "{...}" : "null") + ',' + bool + ','
					+ (class341 != null ? "{...}" : "null") + ')'));
		}
	}

	public Class333() {
		/* empty */
	}

	public static void method2009(int i) {
		try {
			if (i == 4067) {
				aClass192_4417 = null;
				anIntArray4415 = null;
				aClass131_4412 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ue.B(" + i + ')');
		}
	}

	static {
		aClass131_4412 = new Class131();
	}
}
