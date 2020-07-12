/* Class11_Sub45_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub45_Sub14 extends Class11_Sub45 {
	static int anInt9309;
	static int anInt9310;
	static IncomingPacket aClass160_9311;
	Class38 aClass38_9312;
	int anInt9313;
	static boolean aBool9314 = false;
	String aString9315;
	static int anInt9316;
	static int anInt9317;
	static int anInt9318;
	static int anInt9319;

	static final void method3637(boolean bool, IComponentDefinitions class192) {
		try {
			anInt9317++;
			IComponentDefinitions class192_0_ = Class65.method489(class192,
					true);
			int i;
			int i_1_;
			if (class192_0_ != null) {
				i = ((IComponentDefinitions) class192_0_).anInt2546;
				i_1_ = ((IComponentDefinitions) class192_0_).anInt2610;
			} else {
				i = Class153.anInt2025;
				i_1_ = Class11_Sub36.anInt7079;
			}
			Class376_Sub1.method2277(class192, i, (byte) -99, i_1_, bool);
			Class57.method452(126, i, class192, i_1_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mq.C(" + bool + ','
					+ (class192 != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3638(byte i, Class11_Sub45_Sub5 class11_sub45_sub5) {
		try {
			int i_2_ = 50 / ((-67 - i) / 57);
			anInt9309++;
			class11_sub45_sub5.method3187(100);
			boolean bool = true;
			Class11_Sub45_Sub5 class11_sub45_sub5_3_ = (Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) this).aClass38_9312
					.method331((byte) -7);
			while (class11_sub45_sub5_3_ != null) {
				if (Class140.method887(false,
						((Class11_Sub45_Sub5) class11_sub45_sub5_3_).anInt8760,
						((Class11_Sub45_Sub5) class11_sub45_sub5).anInt8760)) {
					Class133.method861(-48, class11_sub45_sub5_3_,
							class11_sub45_sub5);
					((Class11_Sub45_Sub14) this).anInt9313++;
					if (bool)
						return false;
					return true;
				}
				class11_sub45_sub5_3_ = (Class11_Sub45_Sub5) ((Class11_Sub45_Sub14) this).aClass38_9312
						.method333(-77);
				bool = false;
			}
			((Class11_Sub45_Sub14) this).aClass38_9312.method330(
					class11_sub45_sub5, 21934);
			((Class11_Sub45_Sub14) this).anInt9313++;
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mq.E(" + i + ','
					+ (class11_sub45_sub5 != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3639(int i, byte i_4_) {
		try {
			anInt9310++;
			if (Class1_Sub1.aByteArrayArrayArray7130 == null)
				Class1_Sub1.aByteArrayArrayArray7130 = (new byte[4][Class300.anInt4051][Class108_Sub12.anInt6228]);
			int i_5_ = 36 % ((i + 14) / 51);
			for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > -5; i_6_++) {
				for (int i_7_ = 0; Class300.anInt4051 > i_7_; i_7_++) {
					for (int i_8_ = 0; ((i_8_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 ^ 0xffffffff)); i_8_++)
						Class1_Sub1.aByteArrayArrayArray7130[i_6_][i_7_][i_8_] = i_4_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mq.B(" + i + ','
					+ i_4_ + ')');
		}
	}

	final int method3640(byte i) {
		try {
			if (i != 79)
				((Class11_Sub45_Sub14) this).aString9315 = null;
			anInt9319++;
			if ((((Class38) ((Class11_Sub45_Sub14) this).aClass38_9312).aClass11_Sub45_515) != ((Class11_Sub45) (((Class38) ((Class11_Sub45_Sub14) this).aClass38_9312).aClass11_Sub45_515)).aClass11_Sub45_7903)
				return (((Class11_Sub45_Sub5) (Class11_Sub45_Sub5) (((Class11_Sub45) ((Class38) (((Class11_Sub45_Sub14) this).aClass38_9312)).aClass11_Sub45_515).aClass11_Sub45_7903)).anInt8760);
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mq.D(" + i + ')');
		}
	}

	final boolean method3641(Class11_Sub45_Sub5 class11_sub45_sub5, byte i) {
		try {
			anInt9316++;
			if (i != 20)
				return false;
			int i_9_ = method3640((byte) 79);
			class11_sub45_sub5.method3187(100);
			((Class11_Sub45_Sub14) this).anInt9313--;
			if (((Class11_Sub45_Sub14) this).anInt9313 != 0) {
				if (method3640((byte) 79) == i_9_)
					return false;
				return true;
			}
			this.method122(-41);
			this.method3187(i + 80);
			Class307.anInt4123--;
			Class196.aClass22_2661.method184((byte) 127, this,
					((Class11_Sub45_Sub5) class11_sub45_sub5).aLong8763);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mq.A("
					+ (class11_sub45_sub5 != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	public static void method3642(byte i) {
		try {
			if (i <= 38)
				aClass160_9311 = null;
			aClass160_9311 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mq.F(" + i + ')');
		}
	}

	Class11_Sub45_Sub14(String string) {
		try {
			((Class11_Sub45_Sub14) this).aString9315 = string;
			((Class11_Sub45_Sub14) this).aClass38_9312 = new Class38();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mq.<init>("
					+ (string != null ? "{...}" : "null") + ')');
		}
	}

	static {
		aClass160_9311 = new IncomingPacket(3, 0);
	}
}
