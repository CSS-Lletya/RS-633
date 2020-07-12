/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class331 {
	int anInt4390;
	short aShort4391;
	byte aByte4392;
	short aShort4393;
	static int anInt4394;
	static int anInt4395 = 1401;
	int anInt4396;
	static Class38 aClass38_4397 = new Class38();
	static int anInt4398;
	short aShort4399;
	int anInt4400;
	boolean aBool4401;
	int anInt4402;
	static Class307 aClass307_4403;
	int anInt4404;

	public static void method2000(byte i) {
		do {
			try {
				aClass307_4403 = null;
				aClass38_4397 = null;
				if (i <= -101)
					break;
				method2000((byte) -126);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uc.A(" + i + ')');
			}
			break;
		} while (false);
	}

	Class331(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, boolean bool, boolean bool_8_, int i_9_) {
		try {
			((Class331) this).aShort4399 = (short) i_5_;
			((Class331) this).anInt4404 = i;
			((Class331) this).aBool4401 = bool_8_;
			((Class331) this).aShort4393 = (short) i_4_;
			((Class331) this).anInt4396 = i_9_;
			((Class331) this).aByte4392 = (byte) i_7_;
			((Class331) this).aShort4391 = (short) i_3_;
			((Class331) this).anInt4400 = i_0_;
			((Class331) this).anInt4402 = i_1_;
			((Class331) this).anInt4390 = i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uc.<init>(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + bool + ','
					+ bool_8_ + ',' + i_9_ + ')'));
		}
	}
}
