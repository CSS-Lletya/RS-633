/* Class28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class28_Sub1 extends Class28 {
	private byte[][] aByteArrayArray6599 = new byte[10][];
	static int anInt6600;
	private Stream aClass11_Sub20_6601 = new Stream(null);
	private Class146 aClass146_6602;
	static int anInt6603;
	private int anInt6604;
	static IncomingPacket aClass160_6605 = new IncomingPacket(5, 3);
	static int anInt6606;
	private int[] anIntArray6607;
	static int anInt6608;
	private int anInt6609;
	private Stream aClass11_Sub20_6610 = new Stream(null);

	static final Class324 method2724(int i) {
		try {
			anInt6608++;
			try {
				if (i < 21)
					method2727(-110);
				return (Class324) Class.forName("Class324_Sub2").newInstance();
			} catch (Throwable throwable) {
				return new Class324_Sub1();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jw.T(" + i + ')');
		}
	}

	Class28_Sub1(int i, Class146 class146, int i_0_) {
		super(i);
		try {
			anInt6609 = i_0_;
			aClass146_6602 = class146;
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(runtimeexception, ("jw.<init>(" + i + ','
							+ (class146 != null ? "{...}" : "null") + ','
							+ i_0_ + ')'));
		}
	}

	static final void decodePlayerMasks(int i, Packet class11_sub20_sub1) {
		try {
			anInt6603++;
			for (int i_1_ = 0; Class56.anInt841 > i_1_; i_1_++) {
				int i_2_ = Class11_Sub45_Sub7.anIntArray8801[i_1_];
				Player class376_sub7_sub5_sub5_sub1 = Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_2_];
				int i_3_ = class11_sub20_sub1.readUnsignedByte((byte) 35);
				if ((0x2 & i_3_) != 0)
					i_3_ += class11_sub20_sub1.readUnsignedByte((byte) 35) << 8;
				if ((i_3_ & 0x4000 ^ 0xffffffff) != -1)
					i_3_ += class11_sub20_sub1.readUnsignedByte((byte) 35) << 16;
				Class131.playerMasksHelper(class376_sub7_sub5_sub5_sub1, i_3_,
						class11_sub20_sub1, (byte) 122, i_2_);
			}
			int i_4_ = 122 % ((i - 2) / 38);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("jw.S(" + i + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2726(boolean bool) {
		while_42_: do {
			try {
				if (bool != true)
					anInt6604 = 80;
				anInt6600++;
				if (anIntArray6607 != null) {
					int i = 0;
					for (;;) {
						if ((i ^ 0xffffffff) <= -11)
							break while_42_;
						if (anIntArray6607.length <= anInt6604 + i)
							break;
						if (aByteArrayArray6599[i] == null
								&& aClass146_6602.method927((byte) -108,
										(anIntArray6607[i + anInt6604]), 0))
							aByteArrayArray6599[i] = aClass146_6602.method930(
									0, (byte) 112, (anIntArray6607[i
											+ anInt6604]));
						i++;
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "jw.R(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method240(byte i, byte[] is) throws IOException {
		try {
			anInt6606++;
			if (anIntArray6607 == null) {
				if (!aClass146_6602.method927((byte) -87, anInt6609, 0))
					return 0;
				byte[] is_5_ = aClass146_6602.method930(0, (byte) 112,
						anInt6609);
				if (is_5_ == null)
					throw new IllegalStateException("");
				((Stream) aClass11_Sub20_6610).buffer = is_5_;
				((Stream) aClass11_Sub20_6610).position = 0;
				int i_6_ = is_5_.length >> 1;
				anIntArray6607 = new int[i_6_];
				for (int i_7_ = 0; i_6_ > i_7_; i_7_++)
					anIntArray6607[i_7_] = aClass11_Sub20_6610
							.readUnsignedShort((byte) -65);
			}
			if ((anInt6604 ^ 0xffffffff) <= (anIntArray6607.length ^ 0xffffffff))
				return -1;
			method2726(true);
			((Stream) aClass11_Sub20_6610).position = 0;
			((Stream) aClass11_Sub20_6610).buffer = is;
			while (((Stream) aClass11_Sub20_6610).position < ((Stream) aClass11_Sub20_6610).buffer.length) {
				if (((Stream) aClass11_Sub20_6601).buffer == null) {
					if (aByteArrayArray6599[0] == null) {
						((Stream) aClass11_Sub20_6610).buffer = null;
						return ((Stream) aClass11_Sub20_6610).position;
					}
					((Stream) aClass11_Sub20_6601).buffer = aByteArrayArray6599[0];
				}
				int i_8_ = (-((Stream) aClass11_Sub20_6610).position + ((Stream) aClass11_Sub20_6610).buffer.length);
				int i_9_ = (((Stream) aClass11_Sub20_6601).buffer.length + -((Stream) aClass11_Sub20_6601).position);
				if (i_8_ >= i_9_) {
					aClass11_Sub20_6610.writeBytes(true,
							((Stream) aClass11_Sub20_6601).buffer, i_9_,
							((Stream) aClass11_Sub20_6601).position);
					anInt6604++;
					((Stream) aClass11_Sub20_6601).buffer = null;
					((Stream) aClass11_Sub20_6601).position = 0;
					for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -10; i_10_++)
						aByteArrayArray6599[i_10_] = aByteArrayArray6599[1 + i_10_];
					aByteArrayArray6599[9] = null;
					if (anInt6604 >= anIntArray6607.length) {
						((Stream) aClass11_Sub20_6610).buffer = null;
						return ((Stream) aClass11_Sub20_6610).position;
					}
				} else {
					aClass11_Sub20_6601.readBytes(
							((Stream) aClass11_Sub20_6610).buffer, i ^ 0xe,
							i_8_, ((Stream) aClass11_Sub20_6610).position);
					((Stream) aClass11_Sub20_6610).buffer = null;
					return is.length;
				}
			}
			((Stream) aClass11_Sub20_6610).buffer = null;
			if (i != 10)
				return 11;
			return is.length;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jw.O(" + i + ','
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method2727(int i) {
		try {
			if (i != -438808511)
				aClass160_6605 = null;
			aClass160_6605 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "jw.Q(" + i + ')');
		}
	}
}
