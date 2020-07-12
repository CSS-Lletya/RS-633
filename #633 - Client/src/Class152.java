/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class152 {
	boolean aBool2011 = false;
	static int anInt2012;
	static int anInt2013;
	static int anInt2014;
	Class29 aClass29_2015;
	int anInt2016;
	int anInt2017;
	static int anInt2018;

	private final void method952(byte i, Stream stream, int i_0_) {
		try {
			anInt2014++;
			if (i != 36)
				((Class152) this).aClass29_2015 = null;
			if (i_0_ != 1) {
				if ((i_0_ ^ 0xffffffff) != -3) {
					if ((i_0_ ^ 0xffffffff) == -4)
						((Class152) this).aBool2011 = true;
					else if (i_0_ == 4)
						((Class152) this).anInt2017 = -1;
				} else
					((Class152) this).anInt2016 = stream.method2558(false);
			} else
				((Class152) this).anInt2017 = stream
						.readUnsignedShort((byte) -65);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gb.A(" + i + ','
					+ (stream != null ? "{...}" : "null") + ',' + i_0_ + ')'));
		}
	}

	final void method953(Stream stream, int i) {
		try {
			if (i != 248098352)
				method955(false, -114, null, false);
			anInt2013++;
			for (;;) {
				int i_1_ = stream.readUnsignedByte((byte) 35);
				if (i_1_ == 0)
					break;
				method952((byte) 36, stream, i_1_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gb.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final boolean method954(int i) {
		try {
			if (i < 58)
				return false;
			anInt2012++;
			return ((Class29) ((Class152) this).aClass29_2015).aClass146_394
					.method918(((Class152) this).anInt2017, 90);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "gb.B(" + i + ')');
		}
	}

	final Class253 method955(boolean bool, int i, Class163 class163,
			boolean bool_2_) {
		try {
			anInt2018++;
			long l = (long) ((!bool ? 0 : 262144)
					| (((Class152) this).anInt2017 | i << 16) | ((Class163) class163).anInt2103 << 19);
			if (bool_2_ != false)
				method955(false, 27, null, true);
			Class253 class253 = (Class253) ((Class29) ((Class152) this).aClass29_2015).aClass22_401
					.method188(l, (byte) 125);
			if (class253 != null)
				return class253;
			if (!((Class29) ((Class152) this).aClass29_2015).aClass146_394
					.method918(((Class152) this).anInt2017, 113))
				return null;
			Class80 class80 = Class80
					.method545(
							((Class29) (((Class152) this).aClass29_2015)).aClass146_394,
							((Class152) this).anInt2017, 0);
			if (class80 != null) {
				((Class80) class80).anInt1081 = ((Class80) class80).anInt1080 = ((Class80) class80).anInt1076 = ((Class80) class80).anInt1077 = 0;
				if (bool)
					class80.method548();
				for (int i_3_ = 0; (i ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++)
					class80.method546();
			}
			class253 = class163.method1081(class80, true);
			if (class253 != null)
				((Class29) ((Class152) this).aClass29_2015).aClass22_401
						.method184((byte) 124, class253, l);
			return class253;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gb.C(" + bool + ','
					+ i + ',' + (class163 != null ? "{...}" : "null") + ','
					+ bool_2_ + ')'));
		}
	}

	public Class152() {
		/* empty */
	}
}
