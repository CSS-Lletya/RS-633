/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class326 {
	String aString4336;
	static int[] anIntArray4337 = new int[200];
	int anInt4338;
	static int anInt4339;
	static int anInt4340;
	int anInt4341;
	static OutgoingPacket aClass370_4342;
	String aString4343;
	String aString4344;
	int anInt4345;
	int anInt4346;
	int anInt4347;
	static int anInt4348 = -1;
	static Class11_Sub45_Sub18[] aClass11_Sub45_Sub18Array4349 = new Class11_Sub45_Sub18[14];
	String aString4350;
	String aString4351;
	static float aFloat4352;

	public static void method1979(int i) {
		try {
			if (i == 60) {
				aClass11_Sub45_Sub18Array4349 = null;
				aClass370_4342 = null;
				anIntArray4337 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tp.C(" + i + ')');
		}
	}

	static final Class40 method1980(int i, int i_0_) {
		try {
			anInt4340++;
			if ((i_0_ ^ 0xffffffff) != i) {
				if ((i_0_ ^ 0xffffffff) == -2) {
					if ((double) Class32.aFloat428 == 3.0)
						return Class357.aClass40_4667;
					if ((double) Class32.aFloat428 == 4.0)
						return Class300.aClass40_4048;
					if ((double) Class32.aFloat428 == 6.0)
						return Class117.aClass40_1596;
					if ((double) Class32.aFloat428 >= 8.0)
						return Class11_Sub32.aClass40_6869;
				} else if ((i_0_ ^ 0xffffffff) == -3) {
					if ((double) Class32.aFloat428 == 3.0)
						return Class117.aClass40_1596;
					if ((double) Class32.aFloat428 == 4.0)
						return Class11_Sub32.aClass40_6869;
					if ((double) Class32.aFloat428 == 6.0)
						return Class112.aClass40_1543;
					if ((double) Class32.aFloat428 >= 8.0)
						return Class11_Sub45_Sub12.aClass40_9190;
				}
			} else {
				if ((double) Class32.aFloat428 == 3.0)
					return Class211.aClass40_2860;
				if ((double) Class32.aFloat428 == 4.0)
					return Class108_Sub11.aClass40_6150;
				if ((double) Class32.aFloat428 == 6.0)
					return Class357.aClass40_4667;
				if ((double) Class32.aFloat428 >= 8.0)
					return Class300.aClass40_4048;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "tp.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	Class326(int i, int i_1_, String string, String string_2_,
			String string_3_, String string_4_, int i_5_, String string_6_) {
		try {
			((Class326) this).anInt4345 = Class106.method697((byte) 81);
			((Class326) this).aString4336 = string_2_;
			((Class326) this).anInt4338 = i;
			((Class326) this).aString4351 = string_6_;
			((Class326) this).aString4344 = string;
			((Class326) this).anInt4341 = Class11_Sub25.anInt6279;
			((Class326) this).aString4343 = string_3_;
			((Class326) this).anInt4347 = i_1_;
			((Class326) this).anInt4346 = i_5_;
			((Class326) this).aString4350 = string_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("tp.<init>(" + i + ','
					+ i_1_ + ',' + (string != null ? "{...}" : "null") + ','
					+ (string_2_ != null ? "{...}" : "null") + ','
					+ (string_3_ != null ? "{...}" : "null") + ','
					+ (string_4_ != null ? "{...}" : "null") + ',' + i_5_ + ','
					+ (string_6_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1981(int i, int i_7_, String string, String string_8_,
			String string_9_, int i_10_, String string_11_, byte i_12_,
			String string_13_) {
		try {
			anInt4339++;
			((Class326) this).anInt4345 = Class106.method697((byte) 96);
			((Class326) this).anInt4341 = Class11_Sub25.anInt6279;
			((Class326) this).aString4344 = string_9_;
			int i_14_ = 111 / ((55 - i_12_) / 48);
			((Class326) this).anInt4338 = i_7_;
			((Class326) this).aString4336 = string_13_;
			((Class326) this).aString4350 = string_8_;
			((Class326) this).aString4343 = string;
			((Class326) this).anInt4347 = i;
			((Class326) this).aString4351 = string_11_;
			((Class326) this).anInt4346 = i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("tp.B(" + i + ',' + i_7_ + ','
							+ (string != null ? "{...}" : "null") + ','
							+ (string_8_ != null ? "{...}" : "null") + ','
							+ (string_9_ != null ? "{...}" : "null") + ','
							+ i_10_ + ','
							+ (string_11_ != null ? "{...}" : "null") + ','
							+ i_12_ + ','
							+ (string_13_ != null ? "{...}" : "null") + ')'));
		}
	}

	static {
		aClass370_4342 = new OutgoingPacket(60, 4);
	}
}
