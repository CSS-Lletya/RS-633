/* Class220_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class220_Sub1 extends Class220 {
	private int anInt7149 = 0;
	static Class183 aClass183_7150 = new Class183();
	static OutgoingPacket aClass370_7151;
	static int anInt7152;
	static int anInt7153 = -1;
	static long[] aLongArray7154;
	static Class364[][][] aClass364ArrayArrayArray7155;

	public final void method36(boolean bool, int i) {
		do {
			try {
				anInt7152++;
				int i_0_ = ((((Class57) ((Class220) this).aClass57_3028).aClass118_858
						.method772(Class233.anInt3186,
								((Class220) this).aClass253_3022.method1608(),
								-65)) - -(((Class57) ((Class220) this).aClass57_3028).anInt859));
				int i_1_ = ((((Class57) ((Class220) this).aClass57_3028).aClass150_853
						.method948(
								((Class220) this).aClass253_3022.method1622(),
								i + 3340, Class279.anInt3772)) - -(((Class57) ((Class220) this).aClass57_3028).anInt855));
				((Class220) this).aClass253_3022
						.method1616((float) (((Class220) this).aClass253_3022
								.method1608() / 2 + i_0_),
								(float) (((Class220) this).aClass253_3022
										.method1622() / 2 + i_1_), 4096,
								anInt7149);
				anInt7149 += ((Class57_Sub1) (Class57_Sub1) ((Class220) this).aClass57_3028).anInt5883;
				if (i == -3340)
					break;
				aClass183_7150 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "qp.F(" + bool
						+ ',' + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2915(int i) {
		try {
			aClass183_7150 = null;
			aLongArray7154 = null;
			if (i != 58)
				aClass370_7151 = null;
			aClass370_7151 = null;
			aClass364ArrayArrayArray7155 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qp.A(" + i + ')');
		}
	}

	Class220_Sub1(Class146 class146, Class57_Sub1 class57_sub1) {
		super(class146, (Class57) class57_sub1);
	}

	static {
		aClass370_7151 = new OutgoingPacket(58, 15);
		aLongArray7154 = new long[10];
	}
}
