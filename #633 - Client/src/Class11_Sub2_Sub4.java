/* Class11_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class11_Sub2_Sub4 extends Class11_Sub2 {
	static OutgoingPacket aClass370_8494 = new OutgoingPacket(75, 7);
	private int anInt8495;
	private int anInt8496 = 204;
	private int anInt8497 = 1;
	static int anInt8498;
	static int anInt8499;
	static Class368 aClass368_8500;
	static int anInt8501;
	static int anInt8502;

	public static void method3350(int i) {
		do {
			try {
				aClass368_8500 = null;
				aClass370_8494 = null;
				if (i == 1)
					break;
				method3352(null, true, -35, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "v.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt8498++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				method3350(-51);
			if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
				int i_0_ = 0;
				for (/**/; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_0_ ^ 0xffffffff)); i_0_++) {
					int i_1_ = Class208.anIntArray2808[i_0_];
					int i_2_ = Class171.anIntArray2199[i];
					int i_3_ = i_1_ * anInt8497 >> 12;
					int i_4_ = i_2_ * anInt8495 >> 12;
					int i_5_ = anInt8497 * (i_1_ % (4096 / anInt8497));
					int i_6_ = i_2_ % (4096 / anInt8495) * anInt8495;
					if ((i_6_ ^ 0xffffffff) > (anInt8496 ^ 0xffffffff)) {
						for (i_3_ -= i_4_; i_3_ < 0; i_3_ += 4) {
							/* empty */
						}
						for (/**/; i_3_ > 3; i_3_ -= 4) {
							/* empty */
						}
						if (i_3_ != 1) {
							is[i_0_] = 0;
							continue;
						}
						if ((anInt8496 ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
							is[i_0_] = 0;
							continue;
						}
					}
					if ((i_5_ ^ 0xffffffff) > (anInt8496 ^ 0xffffffff)) {
						for (i_3_ -= i_4_; (i_3_ ^ 0xffffffff) > -1; i_3_ += 4) {
							/* empty */
						}
						for (/**/; (i_3_ ^ 0xffffffff) < -4; i_3_ -= 4) {
							/* empty */
						}
						if ((i_3_ ^ 0xffffffff) < -1) {
							is[i_0_] = 0;
							continue;
						}
					}
					is[i_0_] = 4096;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "v.A(" + i + ',' + bool
					+ ')');
		}
	}

	public Class11_Sub2_Sub4() {
		super(0, true);
		anInt8495 = 1;
	}

	static final Class21 method3351(Class95[] class95s, int i,
			Class163_Sub3 class163_sub3) {
		try {
			anInt8501++;
			for (int i_7_ = 0; (class95s.length ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				if (class95s[i_7_] == null
						|| ((Class95) class95s[i_7_]).aLong1279 <= 0L)
					return null;
			}
			long l = OpenGL.glCreateProgramObjectARB();
			for (int i_8_ = 0; class95s.length > i_8_; i_8_++)
				OpenGL.glAttachObjectARB(l,
						((Class95) class95s[i_8_]).aLong1279);
			OpenGL.glLinkProgramARB(l);
			OpenGL.glGetObjectParameterivARB(l, 35714, Class301.anIntArray4057,
					0);
			if (i == (Class301.anIntArray4057[0] ^ 0xffffffff)) {
				if ((Class301.anIntArray4057[0] ^ 0xffffffff) == -1)
					System.out.println("Shader linking failed:");
				OpenGL.glGetObjectParameterivARB(l, 35716,
						Class301.anIntArray4057, 1);
				if ((Class301.anIntArray4057[1] ^ 0xffffffff) < -2) {
					byte[] is = new byte[Class301.anIntArray4057[1]];
					OpenGL.glGetInfoLogARB(l, Class301.anIntArray4057[1],
							Class301.anIntArray4057, 0, is, 0);
					System.out.println(new String(is));
				}
				if (Class301.anIntArray4057[0] == 0) {
					for (int i_9_ = 0; i_9_ < class95s.length; i_9_++)
						OpenGL.glDetachObjectARB(l,
								(((Class95) class95s[i_9_]).aLong1279));
					OpenGL.glDeleteObjectARB(l);
					return null;
				}
			}
			return new Class21(class163_sub3, l, class95s);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("v.F("
					+ (class95s != null ? "{...}" : "null") + ',' + i + ','
					+ (class163_sub3 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2263(int i, Stream stream, int i_10_) {
		do {
			try {
				anInt8502++;
				int i_11_ = i_10_;
				while_102_: do {
					do {
						if (i_11_ != 0) {
							if ((i_11_ ^ 0xffffffff) != -2) {
								if ((i_11_ ^ 0xffffffff) == -3)
									break;
								break while_102_;
							}
						} else {
							anInt8497 = stream.readUnsignedByte((byte) 35);
							break while_102_;
						}
						anInt8495 = stream.readUnsignedByte((byte) 35);
						break while_102_;
					} while (false);
					anInt8496 = stream.readUnsignedShort((byte) -65);
				} while (false);
				if (i == 3731)
					break;
				method3352(null, false, 91, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("v.B(" + i + ',' + (stream != null ? "{...}" : "null")
								+ ',' + i_10_ + ')'));
			}
			break;
		} while (false);
	}

	static final void method3352(String string, boolean bool, int i,
			String string_12_) {
		try {
			Class11_Sub30_Sub1.currentUsername = string;
			anInt8499++;
			Class11_Sub45_Sub8.currentPassword = string_12_;
			Class11_Sub2_Sub21.aBool9197 = bool;
			if (!Class11_Sub2_Sub21.aBool9197
					&& (Class11_Sub30_Sub1.currentUsername.equals("") || Class11_Sub45_Sub8.currentPassword
							.equals("")))
				Class340.method2051(3, false);
			else {
				if (Class11_Sub45_Sub1_Sub2.anInt9885 != 1) {
					Class261.anInt3589 = -1;
					Class330.anInt4383 = 0;
				}
				Class38.aBool505 = false;
				Class340.method2051(-3, false);
				Class231.anInt3170 = 0;
				Class94_Sub1.loginStep = 1;
				Class225_Sub1.anInt5007 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("v.C("
					+ (string != null ? "{...}" : "null") + ',' + bool + ','
					+ i + ',' + (string_12_ != null ? "{...}" : "null") + ')'));
		}
	}
}
