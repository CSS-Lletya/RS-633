/* Class61_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class61_Sub1 extends Class61 {
	private ByteBuffer aByteBuffer5681;

	final byte[] method469(int i, boolean bool, int i_0_) {
		byte[] is;
		try {
			if (bool != true)
				method469(82, false, 85);
			byte[] is_1_ = new byte[i];
			aByteBuffer5681.position(i_0_);
			aByteBuffer5681.get(is_1_, 0, i);
			is = is_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final byte[] method472(int i) {
		byte[] is;
		try {
			if (i < 117)
				aByteBuffer5681 = null;
			byte[] is_2_ = new byte[aByteBuffer5681.capacity()];
			aByteBuffer5681.position(0);
			aByteBuffer5681.get(is_2_);
			is = is_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final void method471(int i, byte[] is) {
		try {
			if (i != 14)
				method471(39, null);
			aByteBuffer5681 = ByteBuffer.allocateDirect(is.length);
			aByteBuffer5681.position(0);
			aByteBuffer5681.put(is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
