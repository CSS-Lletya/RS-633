/* Class314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class314 {
	static Class146 aClass146_4165;
	static int anInt4166;
	static int anInt4167;
	static int anInt4168;
	static Class78 aClass78_4169;

	static final void method1910(byte i, byte[] is) {
		try {
			anInt4166++;
			if (i != -80)
				aClass146_4165 = null;
			Stream stream = new Stream(is);
			for (;;) {
				int i_0_ = stream.readUnsignedByte((byte) 35);
				if (i_0_ == 0)
					break;
				if (i_0_ == 1) {
					int[] is_1_ = Class249.anIntArray3440 = new int[6];
					is_1_[0] = stream.readUnsignedShort((byte) -65);
					is_1_[1] = stream.readUnsignedShort((byte) -65);
					is_1_[2] = stream.readUnsignedShort((byte) -65);
					is_1_[3] = stream.readUnsignedShort((byte) -65);
					is_1_[4] = stream.readUnsignedShort((byte) -65);
					is_1_[5] = stream.readUnsignedShort((byte) -65);
				} else if (i_0_ == 4) {
					int i_2_ = stream.readUnsignedByte((byte) 35);
					Class258.anIntArray3532 = new int[i_2_];
					for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
						Class258.anIntArray3532[i_3_] = stream
								.readUnsignedShort((byte) -65);
						if ((Class258.anIntArray3532[i_3_] ^ 0xffffffff) == -65536)
							Class258.anIntArray3532[i_3_] = -1;
					}
				} else if (i_0_ == 5) {
					int i_4_ = stream.readUnsignedByte((byte) 35);
					Class105.anIntArray1411 = new int[i_4_];
					for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
						Class105.anIntArray1411[i_5_] = stream
								.readUnsignedShort((byte) -65);
						if ((Class105.anIntArray1411[i_5_] ^ 0xffffffff) == -65536)
							Class105.anIntArray1411[i_5_] = -1;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "si.C(" + i + ','
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1911(byte i) {
		try {
			aClass78_4169 = null;
			aClass146_4165 = null;
			int i_6_ = -35 / ((57 - i) / 50);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "si.A(" + i + ')');
		}
	}

	static final void method1912(String string, byte i) {
		try {
			anInt4167++;
			if (Class11_Sub2_Sub6.aStringArray8706 == null)
				Class186.method1214((byte) 123);
			Packet.aCalendar8713.setTime(new Date(Class137
					.method878((byte) -76)));
			int i_7_ = Packet.aCalendar8713.get(11);
			int i_8_ = Packet.aCalendar8713.get(12);
			int i_9_ = Packet.aCalendar8713.get(13);
			String string_10_ = (Integer.toString(i_7_ / 10) + i_7_ % 10 + ":"
					+ i_8_ / 10 + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10);
			String[] strings = Class121.method788(11027, '\n', string);
			int i_11_ = 97 % ((i + 40) / 42);
			for (int i_12_ = 0; (strings.length ^ 0xffffffff) < (i_12_ ^ 0xffffffff); i_12_++) {
				for (int i_13_ = Class11_Sub2_Sub39.anInt9807; (i_13_ ^ 0xffffffff) < -1; i_13_--)
					Class11_Sub2_Sub6.aStringArray8706[i_13_] = Class11_Sub2_Sub6.aStringArray8706[-1
							+ i_13_];
				Class11_Sub2_Sub6.aStringArray8706[0] = string_10_ + ": "
						+ strings[i_12_];
				if (Class207.aFileOutputStream2789 != null) {
					try {
						Class207.aFileOutputStream2789.write(Class103
								.method686(
										(Class11_Sub2_Sub6.aStringArray8706[0])
												+ "\n", 88));
					} catch (java.io.IOException ioexception) {
						/* empty */
					}
				}
				if (Class11_Sub2_Sub39.anInt9807 < -1
						+ Class11_Sub2_Sub6.aStringArray8706.length) {
					Class11_Sub2_Sub39.anInt9807++;
					if ((Class11_Sub36.anInt7080 ^ 0xffffffff) < -1)
						Class11_Sub36.anInt7080++;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "si.B("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public Class314() {
		/* empty */
	}
}
