/* Class11_Sub2_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class11_Sub2_Sub32 extends Class11_Sub2 {
	static int anInt9646;
	static int anInt9647;
	int anInt9648;
	private int anInt9649 = -1;
	static int anInt9650;
	static Class38 aClass38_9651 = new Class38();
	static int anInt9652;
	static Class341 aClass341_9653;
	static int anInt9654;
	static int anInt9655;
	int anInt9656;
	int[] anIntArray9657;

	final boolean method3803(int i) {
		try {
			anInt9652++;
			if (((Class11_Sub2_Sub32) this).anIntArray9657 != null)
				return true;
			if (i != 2250)
				return false;
			if (anInt9649 >= 0) {
				Class80 class80 = (Class108_Sub21.anInt7301 >= 0 ? Class80
						.method545(Class339.aClass146_4481,
								Class108_Sub21.anInt7301, anInt9649) : Class80
						.method555(Class339.aClass146_4481, anInt9649));
				class80.method556();
				((Class11_Sub2_Sub32) this).anIntArray9657 = class80
						.method552();
				((Class11_Sub2_Sub32) this).anInt9656 = ((Class80) class80).anInt1075;
				((Class11_Sub2_Sub32) this).anInt9648 = ((Class80) class80).anInt1082;
				return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "us.P(" + i + ')');
		}
	}

	public Class11_Sub2_Sub32() {
		super(0, false);
	}

	public static void method3804(int i) {
		do {
			try {
				aClass341_9653 = null;
				aClass38_9651 = null;
				if (i >= 116)
					break;
				aClass38_9651 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "us.M(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2257(byte i) {
		try {
			super.method2257((byte) -38);
			anInt9655++;
			((Class11_Sub2_Sub32) this).anIntArray9657 = null;
			int i_0_ = -125 % ((52 - i) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "us.N(" + i + ')');
		}
	}

	final int method2253(int i) {
		try {
			anInt9647++;
			if (i != 8347)
				return -45;
			return anInt9649;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "us.O(" + i + ')');
		}
	}

	int[][] method2255(int i, int i_1_) {
		try {
			if (i_1_ != 1)
				method3804(44);
			anInt9646++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(
					i_1_ - 1, i);
			if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943
					&& method3803(2250)) {
				int[] is_2_ = is[0];
				int[] is_3_ = is[1];
				int[] is_4_ = is[2];
				int i_5_ = (((((Class11_Sub2_Sub32) this).anInt9648 != Class29.anInt398) ? (((Class11_Sub2_Sub32) this).anInt9648
						* i / Class29.anInt398)
						: i) * ((Class11_Sub2_Sub32) this).anInt9656);
				if ((((Class11_Sub2_Sub32) this).anInt9656 ^ 0xffffffff) != (Class33_Sub2.anInt6696 ^ 0xffffffff)) {
					for (int i_6_ = 0; Class33_Sub2.anInt6696 > i_6_; i_6_++) {
						int i_7_ = (i_6_
								* ((Class11_Sub2_Sub32) this).anInt9656 / Class33_Sub2.anInt6696);
						int i_8_ = (((Class11_Sub2_Sub32) this).anIntArray9657[i_5_
								+ i_7_]);
						is_4_[i_6_] = Class77.method529(i_8_, 255) << 4;
						is_3_[i_6_] = Class77.method529(4080, i_8_ >> 4);
						is_2_[i_6_] = Class77.method529(i_8_, 16711680) >> 12;
					}
				} else {
					for (int i_9_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)); i_9_++) {
						int i_10_ = (((Class11_Sub2_Sub32) this).anIntArray9657[i_5_++]);
						is_4_[i_9_] = Class77.method529(i_10_, 255) << 4;
						is_3_[i_9_] = Class77.method529(4080, i_10_ >> 4);
						is_2_[i_9_] = Class77.method529(16711680, i_10_) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "us.I(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_11_) {
		do {
			try {
				anInt9654++;
				if ((i_11_ ^ 0xffffffff) == -1)
					anInt9649 = stream.readUnsignedShort((byte) -65);
				if (i == 3731)
					break;
				((Class11_Sub2_Sub32) this).anIntArray9657 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("us.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_11_ + ')'));
			}
			break;
		} while (false);
	}
}
