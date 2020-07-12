/* Class11_Sub45_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class11_Sub45_Sub4 extends Class11_Sub45 implements Interface18 {
	static int anInt8531;
	private int anInt8532;
	static int anInt8533;
	static Class376_Sub7[] aClass376_Sub7Array8534;
	static int anInt8535;
	int anInt8536;
	static int anInt8537;
	static int anInt8538;
	static int anInt8539 = 0;
	private int anInt8540;
	private int anInt8541;
	private int anInt8542;
	int anInt8543;
	private int anInt8544 = -1;
	static int anInt8545;
	private Class163_Sub3 aClass163_Sub3_8546;

	final void method3387(int i, byte i_0_, int i_1_) {
		try {
			if (i_0_ <= 123)
				anInt8532 = -32;
			anInt8538++;
			OpenGL.glFramebufferRenderbufferEXT(i, i_1_, 36161, anInt8542);
			anInt8544 = i_1_;
			anInt8540 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nha.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ')'));
		}
	}

	public static void method3388(byte i) {
		do {
			try {
				aClass376_Sub7Array8534 = null;
				if (i > 39)
					break;
				method3389(-64, -107, 47, -104, -33, 50);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nha.B(" + i + ')');
			}
			break;
		} while (false);
	}

	protected final void finalize() throws Throwable {
		try {
			anInt8545++;
			method3390((byte) 108);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nha.finalize(" + ')');
		}
	}

	public final void method8(int i) {
		try {
			if (i > -38)
				method3390((byte) -40);
			anInt8533++;
			OpenGL.glFramebufferRenderbufferEXT(anInt8540, anInt8544, 36161, 0);
			anInt8540 = -1;
			anInt8544 = -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nha.S(" + i + ')');
		}
	}

	static final int method3389(int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_) {
		try {
			anInt8535++;
			if (Class315.aClass12Array4179 == null)
				return 0;
			if (i_2_ != 18016)
				method3389(83, 50, 74, 76, -8, 60);
			if (i < 3) {
				int i_7_ = i_5_ >> 9;
				int i_8_ = i_6_ >> 9;
				if ((i_4_ ^ 0xffffffff) > -1
						|| i_3_ < 0
						|| i_4_ > Class300.anInt4051 - 1
						|| ((Class108_Sub12.anInt6228 - 1 ^ 0xffffffff) > (i_3_ ^ 0xffffffff)))
					return 0;
				if (i_7_ < 1
						|| i_8_ < 1
						|| (-1 + Class300.anInt4051 ^ 0xffffffff) > (i_7_ ^ 0xffffffff)
						|| ((-1 + Class108_Sub12.anInt6228 ^ 0xffffffff) > (i_8_ ^ 0xffffffff)))
					return 0;
				boolean bool = (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_5_ >> 9][i_6_ >> 9]) & 0x2 ^ 0xffffffff) != -1);
				if ((i_5_ & 0x1ff) == 0) {
					boolean bool_9_ = (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][-1
							+ i_7_][i_6_ >> 9]) & 0x2) != 0);
					boolean bool_10_ = (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_7_][i_6_ >> 9]) & 0x2 ^ 0xffffffff) != -1);
					if (bool_9_ != bool_10_)
						bool = ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_4_][i_3_]) & 0x2) != 0;
				}
				if ((0x1ff & i_6_ ^ 0xffffffff) == -1) {
					boolean bool_11_ = ((0x2 & (Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_5_ >> 9][-1
							+ i_8_])) != 0);
					boolean bool_12_ = (((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_5_ >> 9][i_8_]) & 0x2 ^ 0xffffffff) != -1);
					if (bool_12_ == !bool_11_)
						bool = ((Class11_Sub45_Sub17.aByteArrayArrayArray9509[1][i_4_][i_3_]) & 0x2) != 0;
				}
				if (bool)
					i++;
			}
			return Class315.aClass12Array4179[i].method130(i_6_, i_5_,
					i_2_ - 18016);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("nha.C(" + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ','
							+ i_5_ + ',' + i_6_ + ')'));
		}
	}

	Class11_Sub45_Sub4(Class163_Sub3 class163_sub3, int i, int i_13_, int i_14_) {
		anInt8540 = -1;
		try {
			aClass163_Sub3_8546 = class163_sub3;
			((Class11_Sub45_Sub4) this).anInt8543 = i_14_;
			((Class11_Sub45_Sub4) this).anInt8536 = i_13_;
			anInt8532 = i;
			OpenGL.glGenRenderbuffersEXT(1,
					(Class376_Sub7_Sub4_Sub2.anIntArray10028), 0);
			anInt8542 = Class376_Sub7_Sub4_Sub2.anIntArray10028[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt8542);
			OpenGL.glRenderbufferStorageEXT(36161, anInt8532,
					(((Class11_Sub45_Sub4) this).anInt8536),
					(((Class11_Sub45_Sub4) this).anInt8543));
			anInt8541 = (((Class11_Sub45_Sub4) this).anInt8543 * (((Class11_Sub45_Sub4) this).anInt8536 * aClass163_Sub3_8546
					.method3249(-22330, anInt8532)));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nha.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_13_ + ',' + i_14_ + ')'));
		}
	}

	final void method3390(byte i) {
		try {
			if (anInt8542 > 0) {
				aClass163_Sub3_8546
						.method3265(anInt8541, (byte) -53, anInt8542);
				anInt8542 = 0;
			}
			anInt8531++;
			int i_15_ = 108 % ((i - 32) / 49);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nha.A(" + i + ')');
		}
	}

	static final void method3391(int i, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_, byte i_21_) {
		try {
			anInt8537++;
			Class14.anInt116 = i_16_;
			Class88.anInt1219 = i_18_;
			Class376_Sub3.anInt6117 = i_20_;
			int i_22_ = 49 / ((53 - i_21_) / 49);
			Class125.anInt1687 = i;
			Class195.anInt2655 = i_19_;
			Class30.anInt404 = i_17_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nha.D(" + i + ','
					+ i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ','
					+ i_20_ + ',' + i_21_ + ')'));
		}
	}

	Class11_Sub45_Sub4(Class163_Sub3 class163_sub3, int i, int i_23_,
			int i_24_, int i_25_) {
		anInt8540 = -1;
		try {
			aClass163_Sub3_8546 = class163_sub3;
			((Class11_Sub45_Sub4) this).anInt8536 = i_23_;
			anInt8532 = i;
			((Class11_Sub45_Sub4) this).anInt8543 = i_24_;
			OpenGL.glGenRenderbuffersEXT(1,
					(Class376_Sub7_Sub4_Sub2.anIntArray10028), 0);
			anInt8542 = Class376_Sub7_Sub4_Sub2.anIntArray10028[0];
			OpenGL.glBindRenderbufferEXT(36161, anInt8542);
			OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_25_, anInt8532,
					((Class11_Sub45_Sub4) this).anInt8536,
					((Class11_Sub45_Sub4) this).anInt8543);
			anInt8541 = (((Class11_Sub45_Sub4) this).anInt8536
					* ((Class11_Sub45_Sub4) this).anInt8543 * aClass163_Sub3_8546
					.method3249(-22330, anInt8532));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nha.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
		}
	}
}
