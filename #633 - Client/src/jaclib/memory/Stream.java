/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private byte[] aByteArray576;
	private int anInt577;
	private int anInt578;
	private int anInt579;
	private Buffer aBuffer580;

	public final void method343(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if ((3 + anInt579 ^ 0xffffffff) <= (aByteArray576.length ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) i_0_;
			aByteArray576[anInt579++] = (byte) i_1_;
			aByteArray576[anInt579++] = (byte) i_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method344(int i) {
		try {
			if ((aByteArray576.length ^ 0xffffffff) >= (anInt579 + 3 ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) (i >> 8);
			aByteArray576[anInt579++] = (byte) (i >> 16);
			aByteArray576[anInt579++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method345(int i) {
		try {
			if (1 + anInt579 >= aByteArray576.length)
				method347();
			aByteArray576[anInt579++] = (byte) (i >> 8);
			aByteArray576[anInt579++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method346(int i) {
		try {
			if ((anInt579 + 1 ^ 0xffffffff) <= (aByteArray576.length ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) (i >> 8);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method347() {
		do {
			try {
				if ((anInt579 ^ 0xffffffff) >= -1)
					break;
				if (anInt577 + anInt579 > anInt578)
					throw new RuntimeException();
				aBuffer580.method1(aByteArray576, 0, anInt577, anInt579);
				anInt577 += anInt579;
				anInt579 = 0;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	public Stream(Buffer buffer, int i, int i_3_) {
		this(buffer.getSize() < 4096 ? buffer.getSize() : 4096);
		try {
			method348(buffer, i, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final native byte getLSB(int i);

	private final void method348(Buffer buffer, int i, int i_4_) {
		try {
			method347();
			anInt577 = i;
			anInt578 = i_4_ + i;
			aBuffer580 = buffer;
			if ((anInt578 ^ 0xffffffff) < (buffer.getSize() ^ 0xffffffff))
				throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method349(float f) {
		try {
			if (aByteArray576.length <= anInt579 + 3)
				method347();
			int i = floatToRawIntBits(f);
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) (i >> 8);
			aByteArray576[anInt579++] = (byte) (i >> 16);
			aByteArray576[anInt579++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method350(Buffer buffer) {
		try {
			method348(buffer, 0, buffer.getSize());
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.getSize());
	}

	public final void method351(int i) {
		try {
			method347();
			anInt577 = i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int method352() {
		try {
			return anInt579 + anInt577;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final boolean method353() {
		try {
			if ((getLSB(-65536) ^ 0xffffffff) != 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method354(int i) {
		try {
			if ((anInt579 + 3 ^ 0xffffffff) <= (aByteArray576.length ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) (i >> 16);
			aByteArray576[anInt579++] = (byte) (i >> 8);
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) (i >> 24);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method355(int i) {
		try {
			if ((aByteArray576.length ^ 0xffffffff) >= (anInt579 ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method356(int i, int i_5_, int i_6_, int i_7_) {
		try {
			if ((aByteArray576.length ^ 0xffffffff) >= (3 + anInt579 ^ 0xffffffff))
				method347();
			aByteArray576[anInt579++] = (byte) i_6_;
			aByteArray576[anInt579++] = (byte) i_5_;
			aByteArray576[anInt579++] = (byte) i;
			aByteArray576[anInt579++] = (byte) i_7_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static final native int floatToRawIntBits(float f);

	public final void method357(float f) {
		try {
			if ((anInt579 + 3 ^ 0xffffffff) <= (aByteArray576.length ^ 0xffffffff))
				method347();
			int i = floatToRawIntBits(f);
			aByteArray576[anInt579++] = (byte) (i >> 24);
			aByteArray576[anInt579++] = (byte) (i >> 16);
			aByteArray576[anInt579++] = (byte) (i >> 8);
			aByteArray576[anInt579++] = (byte) i;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		try {
			aByteArray576 = new byte[i];
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
