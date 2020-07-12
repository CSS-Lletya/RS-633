/* Class375 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class375 {
	int anInt4895;
	static float aFloat4896;
	static int anInt4897;
	int anInt4898;
	int anInt4899 = 8;
	int anInt4900 = 16777215;
	static int anInt4901;
	int anInt4902;
	boolean aBool4903;
	int anInt4904;
	static int anInt4905;
	int anInt4906;

	private final void method2203(int i, byte i_0_, Stream stream) {
		try {
			if (i_0_ == -73) {
				anInt4897++;
				if (i == 1)
					((Class375) this).anInt4899 = stream
							.readUnsignedShort((byte) -65);
				else if (i == 2)
					((Class375) this).aBool4903 = true;
				else if (i != 3) {
					if (i != 4) {
						if (i != 5) {
							if (i == 6)
								((Class375) this).anInt4900 = stream
										.method2558(false);
						} else
							((Class375) this).anInt4898 = stream
									.readUnsignedShort((byte) -65);
					} else
						((Class375) this).anInt4906 = stream
								.readUnsignedByte((byte) 35);
				} else {
					((Class375) this).anInt4902 = stream
							.method2508((byte) -113);
					((Class375) this).anInt4904 = stream.method2508((byte) -91);
					((Class375) this).anInt4895 = stream
							.method2508((byte) -116);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gha.B(" + i + ','
					+ i_0_ + ',' + (stream != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2204(boolean bool, Stream stream) {
		try {
			if (bool == false) {
				anInt4905++;
				for (;;) {
					int i = stream.readUnsignedByte((byte) 35);
					if (i == 0)
						break;
					method2203(i, (byte) -73, stream);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("gha.A(" + bool + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	public Class375() {
		/* empty */
	}
}
