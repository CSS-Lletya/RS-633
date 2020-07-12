/* Class37_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class37_Sub1 extends Class37 {
	private SourceDataLine aSourceDataLine5410;
	private byte[] aByteArray5411;
	private boolean aBool5412 = false;
	private int anInt5413;
	private AudioFormat anAudioFormat5414;
	static Class aClass5415;

	final void method323() {
		try {
			if (aSourceDataLine5410 != null) {
				aSourceDataLine5410.close();
				aSourceDataLine5410 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method321() {
		int i;
		try {
			i = anInt5413
					- (aSourceDataLine5410.available() >> (Class236_Sub1.aBool6092 ? 2
							: 1));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	final void method312(Component component) {
		try {
			Mixer.Info[] infos = AudioSystem.getMixerInfo();
			if (infos != null) {
				Mixer.Info[] infos_0_ = infos;
				for (int i = 0; infos_0_.length > i; i++) {
					Mixer.Info info = infos_0_[i];
					if (null != info) {
						String string = info.getName();
						if (string != null
								&& string.toLowerCase().indexOf("soundmax") >= 0)
							aBool5412 = true;
					}
				}
			}
			anAudioFormat5414 = new AudioFormat((float) Class119.anInt1610, 16,
					!Class236_Sub1.aBool6092 ? 1 : 2, true, false);
			aByteArray5411 = new byte[256 << (Class236_Sub1.aBool6092 ? 2 : 1)];
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method317(int i) throws LineUnavailableException {
		try {
			try {
				DataLine.Info info = (new DataLine.Info(
						(aClass5415 == null ? (aClass5415 = (getClassByName("javax.sound.sampled.SourceDataLine")))
								: aClass5415), anAudioFormat5414,
						i << (!Class236_Sub1.aBool6092 ? 1 : 2)));
				aSourceDataLine5410 = (SourceDataLine) AudioSystem
						.getLine(info);
				aSourceDataLine5410.open();
				aSourceDataLine5410.start();
				anInt5413 = i;
			} catch (LineUnavailableException lineunavailableexception) {
				if (1 != Class179.method1176(i, (byte) 116))
					method317(Class11_Sub2_Sub33.method3808(125, i));
				else {
					aSourceDataLine5410 = null;
					throw lineunavailableexception;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method319() throws LineUnavailableException {
		try {
			aSourceDataLine5410.flush();
			if (aBool5412) {
				aSourceDataLine5410.close();
				aSourceDataLine5410 = null;
				DataLine.Info info = (new DataLine.Info(
						(aClass5415 == null ? (aClass5415 = (getClassByName("javax.sound.sampled.SourceDataLine")))
								: aClass5415), anAudioFormat5414,
						anInt5413 << (Class236_Sub1.aBool6092 ? 2 : 1)));
				aSourceDataLine5410 = (SourceDataLine) AudioSystem
						.getLine(info);
				aSourceDataLine5410.open();
				aSourceDataLine5410.start();
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method325() {
		int i = 256;
		if (Class236_Sub1.aBool6092)
			i <<= 1;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			int i_2_ = ((Class37_Sub1) this).anIntArray472[i_1_];
			if ((i_2_ + 8388608 & ~0xffffff) != 0)
				i_2_ = 0x7fffff ^ i_2_ >> 31;
			aByteArray5411[i_1_ * 2] = (byte) (i_2_ >> 8);
			aByteArray5411[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
		}
		aSourceDataLine5410.write(aByteArray5411, 0, i << 1);
	}

	static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
