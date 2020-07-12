/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class244 {
	static int anInt3309;
	static int[] anIntArray3310 = new int[8];
	static int anInt3311;
	static int anInt3312;
	static int anInt3313;
	static int[] anIntArray3314 = null;

	static final int method1540(int i, int i_0_, boolean bool, int i_1_) {
		try {
			if (bool != false)
				anIntArray3314 = null;
			anInt3313++;
			if (i >= i_0_) {
				if ((i_1_ ^ 0xffffffff) <= (i ^ 0xffffffff))
					return i;
				return i_1_;
			}
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nc.B(" + i + ','
					+ i_0_ + ',' + bool + ',' + i_1_ + ')'));
		}
	}

	public static void method1541(int i) {
		try {
			anIntArray3314 = null;
			if (i != -18169)
				anInt3312 = -91;
			anIntArray3310 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nc.A(" + i + ')');
		}
	}

	static final Class57_Sub1 method1542(byte i, Stream stream) {
		try {
			anInt3311++;
			int i_2_ = -2 % ((i - 3) / 44);
			Class57 class57 = Class110.method739(false, stream);
			int i_3_ = stream.method2554(-126);
			return new Class57_Sub1(((Class57) class57).anInt857,
					((Class57) class57).aClass118_858,
					((Class57) class57).aClass150_853,
					((Class57) class57).anInt859, ((Class57) class57).anInt855,
					i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nc.C(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method1543(int i, IComponentDefinitions class192) {
		try {
			anInt3309++;
			if (i != 0)
				method1540(-19, 79, true, 66);
			if (Class256_Sub2.anInt7710 == ((IComponentDefinitions) class192).anInt2536) {
				if ((((Player) Class11_Sub2_Sub8.myPlayer).aString10400) == null) {
					((IComponentDefinitions) class192).anInt2562 = 0;
					((IComponentDefinitions) class192).anInt2512 = 0;
				} else {
					((IComponentDefinitions) class192).anInt2496 = 150;
					((IComponentDefinitions) class192).anInt2578 = 0x7ff & (int) (Math
							.sin((double) (Class11_Sub25.anInt6279) / 40.0) * 256.0);
					((IComponentDefinitions) class192).anInt2597 = 5;
					((IComponentDefinitions) class192).anInt2512 = Class11_Sub44.anInt7791;
					((IComponentDefinitions) class192).anInt2562 = (Class11_Sub2_Sub30
							.method3795(
									(((Player) (Class11_Sub2_Sub8.myPlayer)).aString10400),
									-27550));
					((IComponentDefinitions) class192).anInt2502 = 0;
					((IComponentDefinitions) class192).anInt2539 = ((Actor) (Class11_Sub2_Sub8.myPlayer)).anInt10267;
					((IComponentDefinitions) class192).anInt2491 = ((Actor) (Class11_Sub2_Sub8.myPlayer)).anInt10291;
					((IComponentDefinitions) class192).anInt2545 = ((Actor) (Class11_Sub2_Sub8.myPlayer)).anInt10288;
					Class281 class281 = (((IComponentDefinitions) class192).anInt2491 != -1 ? (Class108_Sub23.aClass198_7760
							.method1284(
									((IComponentDefinitions) class192).anInt2491,
									(byte) -78))
							: null);
					if (class281 != null)
						Class318.method1936((byte) 121,
								((IComponentDefinitions) class192).anInt2539,
								class281);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nc.D(" + i + ','
					+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}
}
