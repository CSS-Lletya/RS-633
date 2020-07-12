/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class262 {
	static int anInt3593;
	static int anInt3594;

	static final Class254 method1670(Stream stream, byte i) {
		try {
			anInt3594++;
			Class118 class118 = Class239.method1519(-11911)[stream
					.readUnsignedByte((byte) 35)];
			Class150 class150 = Class171.method1124(25992)[stream
					.readUnsignedByte((byte) 35)];
			int i_0_ = stream.method2508((byte) -119);
			if (i > -24)
				return null;
			int i_1_ = stream.method2508((byte) -87);
			int i_2_ = stream.readUnsignedShort((byte) -65);
			int i_3_ = stream.readUnsignedShort((byte) -65);
			int i_4_ = stream.method2508((byte) -110);
			int i_5_ = stream.readInt(114);
			int i_6_ = stream.readInt(116);
			return new Class254(class118, class150, i_0_, i_1_, i_2_, i_3_,
					i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ol.A("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final boolean method1671(int i, int i_7_, boolean bool) {
		try {
			anInt3593++;
			if (bool != false)
				method1671(-39, 39, true);
			if (!Class306.aBool4114)
				return false;
			int i_8_ = i_7_ >> 16;
			int i_9_ = 0xffff & i_7_;
			if (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_8_] == null
					|| (Class11_Sub45_Sub5.aClass192ArrayArray8772[i_8_][i_9_] == null))
				return false;
			IComponentDefinitions class192 = Class11_Sub45_Sub5.aClass192ArrayArray8772[i_8_][i_9_];
			if (i != -1 || ((IComponentDefinitions) class192).anInt2531 != 0) {
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method578(-15361))) {
					if ((i ^ 0xffffffff) == (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8758 ^ 0xffffffff)
							&& (((IComponentDefinitions) class192).anInt2471 == (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8762))
							&& ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) == 30
									|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) == 1002
									|| ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) ^ 0xffffffff) == -16
									|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) == 25 || (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760) == 12))
						return true;
				}
			} else {
				for (Class11_Sub45_Sub5 class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method584(-12261)); class11_sub45_sub5 != null; class11_sub45_sub5 = ((Class11_Sub45_Sub5) Class94_Sub1.aClass84_5220
						.method578(-15361))) {
					if ((((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 == 30)
							|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 == 1002)
							|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 ^ 0xffffffff) == -16
							|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 == 25)
							|| (((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760 == 12)) {
						for (IComponentDefinitions class192_10_ = (Class11_Sub2_Sub13
								.method3533(
										(byte) -94,
										(((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8762))); class192_10_ != null; class192_10_ = Class65
								.method489(class192_10_, !bool)) {
							if (((IComponentDefinitions) class192).anInt2471 == ((IComponentDefinitions) class192_10_).anInt2471)
								return true;
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ol.B(" + i + ','
					+ i_7_ + ',' + bool + ')'));
		}
	}
}
