/* Class11_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Class11_Sub12 extends Class11 {
	static int anInt5441;
	int anInt5442;
	OggStreamState anOggStreamState5443;
	static int[] anIntArray5444 = new int[3];
	static int anInt5445;
	static int anInt5446 = -1;

	Class11_Sub12(OggStreamState oggstreamstate) {
		try {
			((Class11_Sub12) this).anOggStreamState5443 = oggstreamstate;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "uga.<init>("
					+ (oggstreamstate != null ? "{...}" : "null") + ')');
		}
	}

	static final void method2383(int i) {
		do {
			try {
				anInt5441++;
				if (!Class63.aBool924) {
					Class313.aBool4153 = true;
					Class63.aBool924 = true;
					Class171.aFloat2192 += (-Class171.aFloat2192 + 24.0F) / 2.0F;
					if (i == -1)
						break;
					method2383(-60);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uga.P(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method2384(byte i, OggPacket oggpacket) {
		try {
			anInt5445++;
			if (i < 82)
				anInt5446 = -96;
			method2385(-19767, oggpacket);
			((Class11_Sub12) this).anInt5442++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("uga.W(" + i + ','
					+ (oggpacket != null ? "{...}" : "null") + ')'));
		}
	}

	abstract void method2385(int i, OggPacket oggpacket);

	public static void method2386(boolean bool) {
		do {
			try {
				anIntArray5444 = null;
				if (bool == true)
					break;
				method2383(-26);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "uga.S(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	abstract void method2387(int i);
}
