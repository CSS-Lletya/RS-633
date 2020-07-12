/* Class108_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

final class Class108_Sub20 extends Class108 {
	static Clipboard aClipboard7231;
	static int anInt7232;
	static int anInt7233;
	static int anInt7234;
	static int anInt7235;
	static int anInt7236;
	static int anInt7237;

	public static void method2934(int i) {
		do {
			try {
				aClipboard7231 = null;
				if (i == 12165)
					break;
				aClipboard7231 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rj.G(" + i + ')');
			}
			break;
		} while (false);
	}

	Class108_Sub20(int i, Class11_Sub17 class11_sub17) {
		super(i, class11_sub17);
	}

	final int method721(int i, int i_0_) {
		try {
			if (i_0_ < 10)
				aClipboard7231 = null;
			anInt7232++;
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rj.F(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method728(int i, int i_1_) {
		do {
			try {
				((Class108) this).anInt1459 = i_1_;
				anInt7236++;
				if (i == 0)
					break;
				method726(false);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rj.C(" + i + ','
						+ i_1_ + ')');
			}
			break;
		} while (false);
	}

	final void method726(boolean bool) {
		do {
			try {
				anInt7237++;
				if ((((Class108) this).anInt1459 ^ 0xffffffff) != -2
						&& (((Class108) this).anInt1459 ^ 0xffffffff) != -1)
					((Class108) this).anInt1459 = method725((byte) -69);
				if (bool == false)
					break;
				aClipboard7231 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "rj.E(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	final int method2935(boolean bool) {
		try {
			if (bool != false)
				aClipboard7231 = null;
			anInt7233++;
			return ((Class108) this).anInt1459;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rj.B(" + bool + ')');
		}
	}

	static final void method2936(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		while_43_: do {
			try {
				anInt7235++;
				if (i_3_ != -1)
					aClipboard7231 = null;
				int i_6_ = Class177.anInt2246;
				do {
					if ((i_6_ ^ 0xffffffff) != -1) {
						if (i_6_ != 1) {
							if ((i_6_ ^ 0xffffffff) == -3)
								break;
							break while_43_;
						}
					} else
						return;
					Class11_Sub2_Sub36.anInt9754 = i_5_;
					Class177.anInt2246 = 2;
					Class61.anInt900 = i_4_;
					OutgoingPacket.anInt4859 = i;
					Class137.anInt1879 = i_2_;
					return;
				} while (false);
				if ((Class11_Sub2_Sub36.anInt9754 ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
					Class11_Sub2_Sub36.anInt9754 = i_5_;
				if ((i_2_ ^ 0xffffffff) < (Class137.anInt1879 ^ 0xffffffff))
					Class137.anInt1879 = i_2_;
				if (i_4_ < Class61.anInt900)
					Class61.anInt900 = i_4_;
				if ((i ^ 0xffffffff) < (OutgoingPacket.anInt4859 ^ 0xffffffff))
					OutgoingPacket.anInt4859 = i;
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("rj.D(" + i + ','
						+ i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
			}
		} while (false);
	}

	final int method725(byte i) {
		try {
			anInt7234++;
			int i_7_ = 92 % ((70 - i) / 51);
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rj.A(" + i + ')');
		}
	}

	Class108_Sub20(Class11_Sub17 class11_sub17) {
		super(class11_sub17);
	}
}
