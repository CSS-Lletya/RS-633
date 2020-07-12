/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class381 {
	Interface19 anInterface19_4961;
	static int anInt4962;

	static final int method2229(Class163 class163, boolean bool,
			Class233 class233) {
		try {
			anInt4962++;
			if ((((Class233) class233).anInt3183 ^ 0xffffffff) != 0)
				return ((Class233) class233).anInt3183;
			if (((Class233) class233).anInt3188 != -1) {
				Class188 class188 = (((Class163) class163).anInterface1_2118
						.method7((byte) 127, ((Class233) class233).anInt3188));
				if (!((Class188) class188).aBool2416)
					return ((Class188) class188).aShort2413;
			}
			if (bool != true)
				return -87;
			return ((Class233) class233).anInt3187;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vha.A("
					+ (class163 != null ? "{...}" : "null") + ',' + bool + ','
					+ (class233 != null ? "{...}" : "null") + ')'));
		}
	}
}
