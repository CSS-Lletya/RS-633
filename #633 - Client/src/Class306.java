/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class306 {
	static int anInt4107;
	private Class146 aClass146_4108;
	static String aString4109;
	int anInt4110;
	static int anInt4111;
	private Class22 aClass22_4112 = new Class22(64);
	static String aString4113;
	static boolean aBool4114;

	public static void method1876(byte i) {
		try {
			if (i < 37)
				method1876((byte) 0);
			aString4113 = null;
			aString4109 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rp.A(" + i + ')');
		}
	}

	Class306(Class66 class66, int i, Class146 class146) {
		try {
			aClass146_4108 = class146;
			((Class306) this).anInt4110 = aClass146_4108.method914(19, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rp.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ','
					+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final Class161 method1877(int i, boolean bool) {
		try {
			anInt4111++;
			Class161 class161;
			synchronized (aClass22_4112) {
				class161 = (Class161) aClass22_4112.method188((long) i,
						(byte) -86);
			}
			if (class161 != null)
				return class161;
			byte[] is;
			synchronized (aClass146_4108) {
				is = aClass146_4108.method930(i, (byte) 112, 19);
			}
			class161 = new Class161();
			if (bool != false)
				return null;
			if (is != null)
				class161.method994(60, new Stream(is));
			synchronized (aClass22_4112) {
				aClass22_4112.method184((byte) 125, class161, (long) i);
			}
			return class161;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rp.B(" + i + ','
					+ bool + ')');
		}
	}

	static final void method1878(boolean bool, int i, boolean bool_0_) {
		try {
			if (bool != true)
				aBool4114 = true;
			if (!bool_0_)
				Class86.method606(Class103.aClass298_1378, i, -1);
			else {
				Class11_Sub10 class11_sub10 = Class11_Sub48.method3215(
						Class11_Sub3.aClass25_5113, Class151.aClass370_2010,
						(byte) 119);
				((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
						.writeShort(-121, i);
				Class79.method541(class11_sub10, -57);
			}
			anInt4107++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("rp.C(" + bool + ','
					+ i + ',' + bool_0_ + ')'));
		}
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString4113 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString4109 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
		aBool4114 = false;
	}
}
