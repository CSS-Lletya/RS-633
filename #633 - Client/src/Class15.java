/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
	static int anInt130;
	static Class9 aClass9_131;
	static IComponentDefinitions aClass192_132 = null;
	static int anInt133 = 0;
	static int anInt134;
	static int anInt135;
	static long[] aLongArray136 = new long[100];
	static IncomingPacket ICOMPONENTSETTINGS_IN_PACKET;

	static final void method148(int i, boolean bool, byte[] is) {
		do {
			try {
				int i_0_ = 20 / ((i - 60) / 36);
				anInt130++;
				if (Class11_Sub2.aClass11_Sub20_5055 == null)
					Class11_Sub2.aClass11_Sub20_5055 = new Stream(20000);
				Class11_Sub2.aClass11_Sub20_5055.writeBytes(true, is,
						is.length, 0);
				if (!bool)
					break;
				Class20.method170(-99,
						(((Stream) Class11_Sub2.aClass11_Sub20_5055).buffer));
				Class65.aClass195_Sub1Array940 = new Class195_Sub1[Class57_Sub1.anInt5884];
				int i_1_ = 0;
				for (int i_2_ = Class108_Sub12.anInt6226; (Class343.anInt4554 ^ 0xffffffff) <= (i_2_ ^ 0xffffffff); i_2_++) {
					Class195_Sub1 class195_sub1 = Class128.method836(-75, i_2_);
					if (class195_sub1 != null)
						Class65.aClass195_Sub1Array940[i_1_++] = class195_sub1;
				}
				Class234_Sub1_Sub1.aBool9731 = false;
				Class359.aLong4685 = Class137.method878((byte) -89);
				Class11_Sub2.aClass11_Sub20_5055 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("cga.B(" + i + ','
						+ bool + ',' + (is != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method149(boolean bool) {
		try {
			aClass9_131 = null;
			ICOMPONENTSETTINGS_IN_PACKET = null;
			if (bool == true) {
				aLongArray136 = null;
				aClass192_132 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "cga.C(" + bool + ')');
		}
	}

	static final void method150(int i, int i_3_, int i_4_, String string,
			byte i_5_) {
		do {
			try {
				anInt135++;
				IComponentDefinitions class192 = Class146.method913(i,
						(byte) 64, i_4_);
				if (class192 != null && i_5_ > 117) {
					if (((IComponentDefinitions) class192).anObjectArray2555 != null) {
						Class11_Sub48 class11_sub48 = new Class11_Sub48();
						((Class11_Sub48) class11_sub48).aString7997 = string;
						((Class11_Sub48) class11_sub48).anInt7998 = i_3_;
						((Class11_Sub48) class11_sub48).parameters = ((IComponentDefinitions) class192).anObjectArray2555;
						((Class11_Sub48) class11_sub48).aClass192_7999 = class192;
						Class86.method610(class11_sub48);
					}
					if (Class285.anInt3846 == 10
							&& client.method4013(class192).method2348(-125,
									-1 + i_3_)) {
						if (i_3_ == 1) {
							Class377.anInt4913++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class68.ACTION_BUTTON1), (byte) 69);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -24);
						}
						if (i_3_ == 2) {
							Class300.anInt4046++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class295.ACTION_BUTTON2),
											(byte) 125);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -60);
						}
						if ((i_3_ ^ 0xffffffff) == -4) {
							Class180.anInt2328++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class88.ACTION_BUTTON3),
											(byte) 118);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -95);
						}
						if (i_3_ == 4) {
							Class11_Sub32.anInt6882++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class353.ACTION_BUTTON4),
											(byte) -73);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -85);
						}
						if (i_3_ == 5) {
							Class291.anInt3938++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class66.ACTION_BUTTON5), (byte) -49);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -89);
						}
						if ((i_3_ ^ 0xffffffff) == -7) {
							Class11_Sub2_Sub38.anInt9789++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class206_Sub3.ACTION_BUTTON9),
											(byte) -78);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -6);
						}
						if ((i_3_ ^ 0xffffffff) == -8) {
							Class217_Sub1.anInt5532++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class246.ACTION_BUTTON6),
											(byte) 66);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -107);
						}
						if ((i_3_ ^ 0xffffffff) == -9) {
							Class243.anInt3297++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215((Class11_Sub3.aClass25_5113),
											(Class39.ACTION_BUTTON7),
											(byte) -115);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -14);
						}
						if ((i_3_ ^ 0xffffffff) == -10) {
							Class23.anInt245++;
							Class11_Sub10 class11_sub10 = Class11_Sub48
									.method3215(
											(Class11_Sub3.aClass25_5113),
											(Class11_Sub45_Sub2.ACTION_BUTTON10),
											(byte) -83);
							Player.method3972(
									((IComponentDefinitions) class192).anInt2467,
									class11_sub10, i_4_, 2, i);
							Class79.method541(class11_sub10, -84);
						}
						if ((i_3_ ^ 0xffffffff) != -11)
							break;
						Class11_Sub30.anInt6615++;
						Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
								(Class11_Sub3.aClass25_5113),
								(Class11_Sub6_Sub5.ACTION_BUTTON8), (byte) 125);
						Player.method3972(
								(((IComponentDefinitions) class192).anInt2467),
								class11_sub10, i_4_, 2, i);
						Class79.method541(class11_sub10, -71);
					}
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("cga.A(" + i + ',' + i_3_ + ',' + i_4_ + ','
								+ (string != null ? "{...}" : "null") + ','
								+ i_5_ + ')'));
			}
			break;
		} while (false);
	}

	static {
		aClass9_131 = new Class9(2, 2);
		ICOMPONENTSETTINGS_IN_PACKET = new IncomingPacket(75, 12);
	}
}
