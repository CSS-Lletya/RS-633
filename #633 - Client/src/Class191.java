/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

final class Class191 {
	static int anInt2449;
	private Inflater anInflater2450;
	static Class282 aClass282_2451 = new Class282();
	static int anInt2452;
	static int anInt2453;
	static int anInt2454;
	static Class104 aClass104_2455;
	static int anInt2456;
	static int[] anIntArray2457;

	public Class191() {
		this(-1, 1000000, 1000000);
	}

	static final int method1237(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (i_2_ > -30)
				aClass282_2451 = null;
			anInt2452++;
			i_0_ = (~0xff00ff & i * (0xff00ff & i_0_) | 0xff0000
					& (i_0_ & 0xff00) * i) >>> 8;
			int i_3_ = 255 + -i;
			return (((0xff0000 & (i_1_ & 0xff00) * i_3_ | ~0xff00ff
					& (0xff00ff & i_1_) * i_3_) >>> 8) + i_0_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iv.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ')'));
		}
	}

	final void method1238(boolean bool, byte[] is, Stream stream) {
		try {
			anInt2449++;
			if ((((Stream) stream).buffer[((Stream) stream).position] ^ 0xffffffff) != -32
					|| ((((Stream) stream).buffer[1 + ((Stream) stream).position]) ^ 0xffffffff) != 116)
				throw new RuntimeException("Invalid GZIP header!");
			if (anInflater2450 == null)
				anInflater2450 = new Inflater(true);
			try {
				anInflater2450
						.setInput(
								((Stream) stream).buffer,
								10 + ((Stream) stream).position,
								((((Stream) stream).buffer).length - 8 - 10 - ((Stream) stream).position));
				if (bool != false)
					method1237(44, -10, 65, 26);
				anInflater2450.inflate(is);
			} catch (Exception exception) {
				anInflater2450.reset();
				throw new RuntimeException("Invalid GZIP compressed data!");
			}
			anInflater2450.reset();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iv.A(" + bool + ','
					+ (is != null ? "{...}" : "null") + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final byte[] method1239(byte[] is, byte i) {
		try {
			anInt2454++;
			Stream stream = new Stream(is);
			if (i != -73)
				return null;
			((Stream) stream).position = is.length - 4;
			int i_4_ = stream.method2540((byte) 105);
			byte[] is_5_ = new byte[i_4_];
			((Stream) stream).position = 0;
			method1238(false, is_5_, stream);
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iv.B("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	public static void method1240(int i) {
		try {
			aClass104_2455 = null;
			aClass282_2451 = null;
			if (i != 16711680)
				anIntArray2457 = null;
			anIntArray2457 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iv.D(" + i + ')');
		}
	}

	static final String method1241(int i) {
		try {
			anInt2456++;
			if (Class306.aBool4114
					|| Class11_Sub19.aClass11_Sub45_Sub5_5815 == null)
				return "";
			if (i <= 116)
				return null;
			if (((((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8767) == null || ((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8767
					.length() == 0)
					&& ((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8764 != null
					&& (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8764
							.length() ^ 0xffffffff) < -1)
				return (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8764);
			return (((Class11_Sub45_Sub5) Class11_Sub19.aClass11_Sub45_Sub5_5815).aString8767);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iv.C(" + i + ')');
		}
	}

	private Class191(int i, int i_6_, int i_7_) {
		/* empty */
	}
}
