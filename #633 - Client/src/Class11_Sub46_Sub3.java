/* Class11_Sub46_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub46_Sub3 extends Class11_Sub46 {
	static int anInt9548;
	static int anInt9549;
	static int anInt9550;
	static int anInt9551;
	static long aLong9552;
	static int anInt9553 = 1;

	Class11_Sub46_Sub3(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
		super(i, i_0_, i_1_, i_2_, i_3_, f);
	}

	static final Class11_Sub43 method3767(int i, boolean bool, Class146 class146) {
		try {
			anInt9549++;
			if (bool != false)
				decodePlayerUpdate(42, -67, null);
			byte[] is = class146.method938(i, 0);
			if (is == null)
				return null;
			return new Class11_Sub43(is);
		} catch (RuntimeException runtimeexception) {
			throw Class205
					.method1298(
							runtimeexception,
							("st.B(" + i + ',' + bool + ','
									+ (class146 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method3212(int i, int i_4_, int i_5_, int i_6_) {
		try {
			((Class11_Sub46) this).anInt7974 = i_4_;
			anInt9550++;
			if (i_6_ != 16)
				method3202(-0.6999489F, 108);
			((Class11_Sub46) this).anInt7983 = i;
			((Class11_Sub46) this).anInt7970 = i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("st.C(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final void method3202(float f, int i) {
		try {
			if (i != 65536)
				aLong9552 = 79L;
			anInt9551++;
			((Class11_Sub46) this).aFloat7973 = f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "st.D(" + f + ',' + i
					+ ')');
		}
	}

	static final void decodePlayerUpdate(int i, int i_7_, Packet packet) {
		do {
			try {
				anInt9548++;
				Class217_Sub1.DEBUG_GLOBAL_PLAYER_UPDATE = false;
				Class56.anInt841 = 0;
				Class221.decodeGlobalPlayerUpdate(-4023, packet);
				Class28_Sub1.decodePlayerMasks(50, packet);
				if (Class217_Sub1.DEBUG_GLOBAL_PLAYER_UPDATE)
					System.out.println("---endgpp---");
				if (i != ((Stream) packet).position)
					throw new RuntimeException("gpi1 pos:"
							+ (((Stream) packet).position) + " psize:" + i);
				if (i_7_ >= 10)
					break;
				aLong9552 = 89L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("st.A(" + i + ',' + i_7_ + ','
								+ (packet != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
