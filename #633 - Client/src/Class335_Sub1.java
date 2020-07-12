/* Class335_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class335_Sub1 extends Class335 {
	static int anInt6441;
	static int anInt6442;
	static Class146 aClass146_6443;
	static int anInt6444;
	static OutgoingPacket aClass370_6445 = new OutgoingPacket(51, 3);

	final void method2013(boolean bool, int i, byte i_0_, int i_1_) {
		try {
			Class321_Sub2.aClass163_6648
					.method1051(
							i - 2,
							i_1_,
							((Class254) ((Class335) this).aClass254_4434).anInt3489 + 4,
							2 + ((Class254) ((Class335) this).aClass254_4434).anInt3490,
							((Class254_Sub3) (Class254_Sub3) ((Class335) this).aClass254_4434).anInt8039,
							0);
			if (i_0_ != -104)
				aClass370_6445 = null;
			anInt6444++;
			Class321_Sub2.aClass163_6648
					.method1051(
							-1 + i,
							i_1_ + 1,
							((Class254) ((Class335) this).aClass254_4434).anInt3489 + 2,
							((Class254) ((Class335) this).aClass254_4434).anInt3490,
							0, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("im.C(" + bool + ','
					+ i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	Class335_Sub1(Class146 class146, Class146 class146_2_,
			Class254_Sub3 class254_sub3) {
		super(class146, class146_2_, (Class254) class254_sub3);
	}

	public static void method2693(byte i) {
		try {
			if (i != 82)
				method2693((byte) -98);
			aClass146_6443 = null;
			aClass370_6445 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "im.E(" + i + ')');
		}
	}

	final void method2014(int i, int i_3_, boolean bool, byte i_4_) {
		do {
			try {
				anInt6442++;
				int i_5_ = (this.method2016(2)
						* (((Class254) ((Class335) this).aClass254_4434).anInt3489) / 10000);
				Class321_Sub2.aClass163_6648
						.aa(i_3_,
								i + 2,
								i_5_,
								-2
										+ (((Class254) ((Class335) this).aClass254_4434).anInt3490),
								((Class254_Sub3) (Class254_Sub3) ((Class335) this).aClass254_4434).anInt8045,
								0);
				Class321_Sub2.aClass163_6648
						.aa(i_3_ + i_5_,
								2 + i,
								-i_5_
										+ (((Class254) ((Class335) this).aClass254_4434).anInt3489),
								-2
										+ (((Class254) ((Class335) this).aClass254_4434).anInt3490),
								0, 0);
				if (i_4_ < -88)
					break;
				aClass370_6445 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("im.A(" + i + ','
						+ i_3_ + ',' + bool + ',' + i_4_ + ')'));
			}
			break;
		} while (false);
	}

	static final Class167 method2694(Stream stream, byte i) {
		try {
			anInt6441++;
			int i_6_ = stream.readInt(i - 1);
			if (i != 96)
				aClass370_6445 = null;
			return new Class167(i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "im.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}
}
