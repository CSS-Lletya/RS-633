/* Class11_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.hardware_info.HardwareInfo;

final class Class11_Sub16 extends Class11 {
	private String aString5649;
	private int anInt5650;
	private boolean aBool5651;
	private int anInt5652;
	private int anInt5653;
	private String aString5654;
	static int anInt5655;
	int anInt5656;
	private int anInt5657;
	private int anInt5658;
	static int anInt5659;
	private int anInt5660;
	private boolean aBool5661;
	private int anInt5662;
	private int anInt5663;
	private int anInt5664;
	private int anInt5665;
	static int anInt5666;
	private int anInt5667;
	private String aString5668;
	private int anInt5669;
	private int anInt5670;
	static int anInt5671;
	private String aString5672;
	static int anInt5673;
	static int anInt5674;
	static String[] aStringArray5675 = new String[8];
	private int anInt5676;

	static final Class179 method2443(int i, Class146 class146, int i_0_,
			int i_1_) {
		try {
			if (i != 0)
				aStringArray5675 = null;
			anInt5659++;
			byte[] is = class146.method930(i_1_, (byte) 112, i_0_);
			if (is == null)
				return null;
			return new Class179(is);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("br.G(" + i + ','
					+ (class146 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ')'));
		}
	}

	static final void method2444(byte i) {
		try {
			if (i == -97) {
				Class321_Sub3
						.method2852(
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub22_5711
										.method2962(false) ^ 0xffffffff) == -2,
								22050, 2, i ^ ~0x57);
				anInt5674++;
				Class254.aClass37_3498 = Class108_Sub14.method2659(22050,
						(Class11_Sub45_Sub13.aCanvas9308), 0, (byte) -93,
						Class108_Sub21.aClass341_7304);
				Class11_Sub2_Sub3.method3339(true, (byte) -50,
						Class291.method1801(null, (byte) 9));
				Class343.aClass37_4540 = Class108_Sub14.method2659(2048,
						(Class11_Sub45_Sub13.aCanvas9308), 1, (byte) 104,
						Class108_Sub21.aClass341_7304);
				Class233.aClass11_Sub6_Sub1_3185 = new Class11_Sub6_Sub1();
				Class343.aClass37_4540.method326(true,
						Class233.aClass11_Sub6_Sub1_3185);
				Class11_Sub33.aClass165_6902 = new Class165(22050,
						Class119.anInt1610);
				Class295.method1829(-1);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "br.B(" + i + ')');
		}
	}

	public static void method2445(byte i) {
		try {
			int i_2_ = 62 % ((21 - i) / 36);
			aStringArray5675 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "br.F(" + i + ')');
		}
	}

	private final void method2446(int i) {
		try {
			anInt5666++;
			if ((aString5654.length() ^ 0xffffffff) < -41)
				aString5654 = aString5654.substring(0, 40);
			if (aString5668.length() > 40)
				aString5668 = aString5668.substring(0, 40);
			if (aString5649.length() > 10)
				aString5649 = aString5649.substring(0, 10);
			if ((aString5672.length() ^ 0xffffffff) < -11)
				aString5672 = aString5672.substring(0, 10);
			int i_3_ = 123 / ((i + 38) / 56);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "br.C(" + i + ')');
		}
	}

	final void method2447(boolean bool, Stream stream) {
		try {
			stream.writeByte(5, -1528071456);
			anInt5673++;
			if (bool != false)
				method2443(41, null, -82, 8);
			stream.writeByte(anInt5652, -1528071456);
			stream.writeByte(aBool5661 ? 1 : 0, -1528071456);
			stream.writeByte(anInt5663, -1528071456);
			stream.writeByte(anInt5664, -1528071456);
			stream.writeByte(anInt5658, -1528071456);
			stream.writeByte(anInt5662, -1528071456);
			stream.writeByte(anInt5653, -1528071456);
			stream.writeByte(!aBool5651 ? 0 : 1, -1528071456);
			stream.writeShort(-124, anInt5676);
			stream.writeByte(anInt5657, -1528071456);
			stream.method2555(1333491824, ((Class11_Sub16) this).anInt5656);
			stream.writeShort(-120, anInt5667);
			stream.writeByte(anInt5670, -1528071456);
			stream.writeByte(anInt5665, -1528071456);
			stream.writeByte(anInt5660, -1528071456);
			stream.method2509(aString5654, (byte) -52);
			stream.method2509(aString5668, (byte) -52);
			stream.method2509(aString5649, (byte) -52);
			stream.method2509(aString5672, (byte) -52);
			stream.writeByte(anInt5650, -1528071456);
			stream.writeShort(-120, anInt5669);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("br.A(" + bool + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final int method2448(byte i) {
		try {
			anInt5671++;
			int i_4_ = 23;
			i_4_ += Class101.method675(8192, aString5654);
			i_4_ += Class101.method675(8192, aString5668);
			i_4_ += Class101.method675(8192, aString5649);
			if (i != -10)
				aBool5661 = true;
			i_4_ += Class101.method675(8192, aString5672);
			return i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "br.D(" + i + ')');
		}
	}

	static final boolean method2449(int i, int i_5_) {
		try {
			anInt5655++;
			if (Class256.aBoolArray3505[i_5_])
				return true;
			if (!Class47.aClass146_746.method931(i_5_, -120))
				return false;
			int i_6_ = Class47.aClass146_746.method914(i_5_, 0);
			if ((i_6_ ^ 0xffffffff) == -1) {
				Class256.aBoolArray3505[i_5_] = true;
				return true;
			}
			if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_5_] == null)
				Class11_Sub45_Sub5.aClass192ArrayArray8772[i_5_] = new IComponentDefinitions[i_6_];
			if (i <= 47)
				return true;
			for (int i_7_ = 0; i_6_ > i_7_; i_7_++) {
				if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_5_][i_7_] == null) {
					byte[] is = Class47.aClass146_746.method930(i_7_,
							(byte) 112, i_5_);
					if (is != null) {
						IComponentDefinitions class192 = (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_5_][i_7_] = new IComponentDefinitions());
						((IComponentDefinitions) class192).anInt2471 = i_7_
								+ (i_5_ << 16);
						if (is[0] == -1)
							class192.method1255((byte) 127, new Stream(is));
						else
							throw new IllegalStateException("if1");
					}
				}
			}
			Class256.aBoolArray3505[i_5_] = true;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "br.E(" + i + ','
					+ i_5_ + ')');
		}
	}

	public Class11_Sub16() {
		/* empty */
	}

	Class11_Sub16(boolean bool, Class341 class341) {
		try {
			if (bool) {
				if (Class341.aString4512.startsWith("win"))
					anInt5652 = 1;
				else if (Class341.aString4512.startsWith("mac"))
					anInt5652 = 2;
				else if (!Class341.aString4512.startsWith("linux"))
					anInt5652 = 4;
				else
					anInt5652 = 3;
				if (Class341.aString4521.startsWith("amd64")
						|| Class341.aString4521.startsWith("x86_64"))
					aBool5661 = true;
				else
					aBool5661 = false;
				if ((anInt5652 ^ 0xffffffff) == -2) {
					if ((Class341.aString4506.indexOf("4.0") ^ 0xffffffff) == 0) {
						if ((Class341.aString4506.indexOf("4.1") ^ 0xffffffff) == 0) {
							if ((Class341.aString4506.indexOf("4.9") ^ 0xffffffff) != 0)
								anInt5663 = 3;
							else if ((Class341.aString4506.indexOf("5.0") ^ 0xffffffff) != 0)
								anInt5663 = 4;
							else if ((Class341.aString4506.indexOf("5.1") ^ 0xffffffff) == 0) {
								if (Class341.aString4506.indexOf("6.0") == -1) {
									if ((Class341.aString4506.indexOf("6.1") ^ 0xffffffff) != 0)
										anInt5663 = 7;
								} else
									anInt5663 = 6;
							} else
								anInt5663 = 5;
						} else
							anInt5663 = 2;
					} else
						anInt5663 = 1;
				} else if ((anInt5652 ^ 0xffffffff) == -3) {
					if ((Class341.aString4506.indexOf("10.4") ^ 0xffffffff) != 0)
						anInt5663 = 20;
					else if (Class341.aString4506.indexOf("10.5") == -1) {
						if (Class341.aString4506.indexOf("10.6") != -1)
							anInt5663 = 22;
					} else
						anInt5663 = 21;
				}
				if ((Class341.aString4509.toLowerCase().indexOf("sun") ^ 0xffffffff) == 0) {
					if ((Class341.aString4509.toLowerCase()
							.indexOf("microsoft") ^ 0xffffffff) == 0) {
						if ((Class341.aString4509.toLowerCase()
								.indexOf("apple") ^ 0xffffffff) == 0)
							anInt5664 = 4;
						else
							anInt5664 = 3;
					} else
						anInt5664 = 2;
				} else
					anInt5664 = 1;
				int i = 2;
				int i_8_ = 0;
				try {
					while (i < Class341.aString4517.length()) {
						int i_9_ = Class341.aString4517.charAt(i);
						if ((i_9_ ^ 0xffffffff) > -49 || i_9_ > 57)
							break;
						i++;
						i_8_ = i_8_ * 10 + (-48 + i_9_);
					}
				} catch (Exception exception) {
					/* empty */
				}
				anInt5658 = i_8_;
				i = 1 + Class341.aString4517.indexOf('.', 2);
				i_8_ = 0;
				try {
					for (/**/; ((i ^ 0xffffffff) > (Class341.aString4517
							.length() ^ 0xffffffff)); i++) {
						int i_10_ = Class341.aString4517.charAt(i);
						if (i_10_ < 48 || i_10_ > 57)
							break;
						i_8_ = 10 * i_8_ - 48 + i_10_;
					}
				} catch (Exception exception) {
					/* empty */
				}
				anInt5662 = i_8_;
				i_8_ = 0;
				i = Class341.aString4517.indexOf('_', 4) + 1;
				try {
					for (/**/; Class341.aString4517.length() > i; i++) {
						int i_11_ = Class341.aString4517.charAt(i);
						if (i_11_ < 48 || (i_11_ ^ 0xffffffff) < -58)
							break;
						i_8_ = -48 + (i_11_ + 10 * i_8_);
					}
				} catch (Exception exception) {
					/* empty */
				}
				anInt5676 = Class177.anInt2245;
				anInt5653 = i_8_;
				if (((Class341) class341).aBool4520)
					aBool5651 = false;
				else
					aBool5651 = true;
				if (anInt5658 <= 3)
					anInt5657 = 0;
				else
					anInt5657 = Class11_Sub2_Sub7.anInt8734;
				try {
					int[] is = HardwareInfo.getCPUInfo();
					if (is != null && is.length == 7) {
						anInt5667 = is[2];
						anInt5670 = is[3];
						anInt5665 = is[4];
						anInt5660 = is[5];
						((Class11_Sub16) this).anInt5656 = is[6];
					}
				} catch (Throwable throwable) {
					((Class11_Sub16) this).anInt5656 = 0;
				}
			}
			if (aString5649 == null)
				aString5649 = "";
			if (aString5672 == null)
				aString5672 = "";
			if (aString5654 == null)
				aString5654 = "";
			if (aString5668 == null)
				aString5668 = "";
			method2446(72);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("br.<init>(" + bool
					+ ',' + (class341 != null ? "{...}" : "null") + ')'));
		}
	}
}
