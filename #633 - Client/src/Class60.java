/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;

public final class Class60 implements Interface4 {
	private DSCursors[] aDSCursorsArray886 = new DSCursors[2];
	private byte[][] aByteArrayArray887;
	private int anInt888;
	private WaveFormatEx aWaveFormatEx889;
	private boolean[] aBoolArray890;
	private int[] anIntArray891 = new int[2];
	private int[] anIntArray892 = new int[2];
	private int[] anIntArray893;
	private int anInt894;
	private DirectSound aDirectSound895;
	private int anInt896;
	private DSBufferDesc[] aDSBufferDescArray897;
	private DirectSoundBuffer[] aDirectSoundBufferArray898;

	public final void method13(int i, int i_0_, int i_1_) throws Exception {
		try {
			if ((anInt894 ^ 0xffffffff) == -1
					|| aDirectSoundBufferArray898[i_1_] != null)
				throw new IllegalStateException();
			int i_2_ = anInt896 * 65536;
			int i_3_ = -32 / ((i - 55) / 45);
			if (aByteArrayArray887[i_1_] == null
					|| (i_2_ ^ 0xffffffff) != (aByteArrayArray887[i_1_].length ^ 0xffffffff)) {
				aByteArrayArray887[i_1_] = new byte[i_2_];
				aDSBufferDescArray897[i_1_].bufferBytes = i_2_;
			}
			aDirectSoundBufferArray898[i_1_] = aDirectSound895
					.createSoundBuffer((aDSBufferDescArray897[i_1_]),
							aWaveFormatEx889);
			aBoolArray890[i_1_] = false;
			anIntArray892[i_1_] = 0;
			anIntArray891[i_1_] = i_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method17(int i, byte i_4_) {
		try {
			try {
				aDirectSoundBufferArray898[i].stop();
			} catch (com.ms.com.ComFailException comfailexception) {
				/* empty */
			}
			int i_5_ = 5 % ((i_4_ - 53) / 47);
			aBoolArray890[i] = false;
			aDirectSoundBufferArray898[i].setCurrentPosition(0);
			anIntArray892[i] = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final int method15(byte i, int i_6_) {
		try {
			if (!aBoolArray890[i_6_])
				return 0;
			aDirectSoundBufferArray898[i_6_]
					.getCurrentPosition(aDSCursorsArray886[i_6_]);
			int i_7_ = aDSCursorsArray886[i_6_].write / anInt896;
			int i_8_ = 0xffff & anIntArray892[i_6_] + -i_7_;
			if (i != -60)
				aDirectSoundBufferArray898 = null;
			if ((anIntArray891[i_6_] ^ 0xffffffff) > (i_8_ ^ 0xffffffff)) {
				for (int i_9_ = -anIntArray892[i_6_] + i_7_ & 0xffff; i_9_ > 0; i_9_ -= 256)
					method18(i_6_, anIntArray893);
				i_8_ = 0xffff & anIntArray892[i_6_] + -i_7_;
			}
			return i_8_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method14(byte i, int i_10_) {
		do {
			try {
				if (i != 36)
					method17(-27, (byte) -47);
				if (aDirectSoundBufferArray898[i_10_] == null)
					break;
				try {
					aDirectSoundBufferArray898[i_10_].stop();
				} catch (com.ms.com.ComFailException comfailexception) {
					/* empty */
				}
				aDirectSoundBufferArray898[i_10_] = null;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	public final void method18(int i, int[] is) {
		int i_11_ = is.length;
		if (i_11_ != 256 * anInt888)
			throw new IllegalArgumentException();
		int i_12_ = anIntArray892[i] * anInt896;
		for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
			int i_14_ = is[i_13_];
			if ((i_14_ + 8388608 & ~0xffffff) != 0)
				i_14_ = 0x7fffff ^ i_14_ >> 31;
			aByteArrayArray887[i][i_12_ + i_13_ * 2] = (byte) (i_14_ >> 8);
			aByteArrayArray887[i][i_12_ + i_13_ * 2 + 1] = (byte) (i_14_ >> 16);
		}
		aDirectSoundBufferArray898[i].writeBuffer(i_12_, i_11_ * 2,
				aByteArrayArray887[i], 0);
		anIntArray892[i] = anIntArray892[i] + i_11_ / anInt888 & 0xffff;
		if (!aBoolArray890[i]) {
			aDirectSoundBufferArray898[i].play(1);
			aBoolArray890[i] = true;
		}
	}

	public final void method16(Component component, boolean bool, int i,
			int i_15_) throws Exception {
		try {
			if (i_15_ == anInt894) {
				if (i < 8000 || i > 48000)
					throw new IllegalArgumentException();
				anInt896 = !bool ? 2 : 4;
				anInt888 = bool ? 2 : 1;
				anIntArray893 = new int[anInt888 * 256];
				aDirectSound895.initialize(null);
				aDirectSound895.setCooperativeLevel(component, 2);
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -3; i_16_++)
					aDSBufferDescArray897[i_16_].flags = 16384;
				aWaveFormatEx889.formatTag = 1;
				aWaveFormatEx889.avgBytesPerSec = anInt896 * i;
				aWaveFormatEx889.bitsPerSample = 16;
				aWaveFormatEx889.samplesPerSec = i;
				aWaveFormatEx889.blockAlign = anInt896;
				anInt894 = i;
				aWaveFormatEx889.channels = anInt888;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public Class60() throws Exception {
		aBoolArray890 = new boolean[2];
		aDSBufferDescArray897 = new DSBufferDesc[2];
		aByteArrayArray887 = new byte[2][];
		aDirectSoundBufferArray898 = new DirectSoundBuffer[2];
		try {
			aDirectSound895 = new DirectSound();
			aWaveFormatEx889 = new WaveFormatEx();
			for (int i = 0; (i ^ 0xffffffff) > -3; i++)
				aDSBufferDescArray897[i] = new DSBufferDesc();
			for (int i = 0; i < 2; i++)
				aDSCursorsArray886[i] = new DSCursors();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
