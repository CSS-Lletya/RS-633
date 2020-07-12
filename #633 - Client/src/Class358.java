/* Class358 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class358 {
	int anInt4668;
	int anInt4669;
	static boolean aBool4670 = false;
	static int anInt4671;
	static int anInt4672;
	int anInt4673;

	static final Class11_Sub2 method2129(int i, Stream stream) {
		try {
			anInt4671++;
			stream.readUnsignedByte((byte) 35);
			int i_0_ = stream.readUnsignedByte((byte) 35);
			Class11_Sub2 class11_sub2 = Class11_Sub2_Sub27.method3708(-111,
					i_0_);
			if (i != 17956)
				aBool4670 = true;
			((Class11_Sub2) class11_sub2).anInt5046 = stream
					.readUnsignedByte((byte) 35);
			int i_1_ = stream.readUnsignedByte((byte) 35);
			for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
				int i_3_ = stream.readUnsignedByte((byte) 35);
				class11_sub2.method2263(3731, stream, i_3_);
			}
			class11_sub2.method2256(7);
			return class11_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wg.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final char method2130(int i, char c) {
		try {
			anInt4672++;
			if ((c ^ 0xffffffff) == -199)
				return 'E';
			if ((c ^ 0xffffffff) == -231)
				return 'e';
			if (i != 5)
				aBool4670 = false;
			if ((c ^ 0xffffffff) == -224)
				return 's';
			if (c == 338)
				return 'E';
			if ((c ^ 0xffffffff) == -340)
				return 'e';
			return '\0';
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wg.B(" + i + ',' + c
					+ ')');
		}
	}

	public Class358() {
		/* empty */
	}

	static final void method2131(int i) {
		if (i == 0) {
			if (Class68.anInt974 == 2) {
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[0]);
				Packet.aClass13Array8724[1]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[1]);
			} else if (Class68.anInt974 == 3) {
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[0]);
				Packet.aClass13Array8724[1]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[1]);
				Packet.aClass13Array8724[2]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[2]);
			} else {
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[0]);
				Packet.aClass13Array8724[1]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[1]);
				Packet.aClass13Array8724[2]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[2]);
				Packet.aClass13Array8724[3]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[3]);
			}
		} else if (i == 1) {
			if (Class68.anInt974 == 2)
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[2]);
			else if (Class68.anInt974 == 3) {
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[3]);
				Packet.aClass13Array8724[1]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[4]);
			} else {
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[4]);
				Packet.aClass13Array8724[1]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[5]);
				Packet.aClass13Array8724[2]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[6]);
			}
		} else if (i == 2) {
			if (Class68.anInt974 == 2)
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[3]);
			else if (Class68.anInt974 == 3)
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[5]);
			else
				Packet.aClass13Array8724[0]
						.method142(Class376_Sub1_Sub1.aClass322Array8690[7]);
		}
	}
}
