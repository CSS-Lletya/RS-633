/* Class376_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class376_Sub5 extends Class376 {
	static IncomingPacket ITEM_CONTAINER_UPDATE_IN_PACKET = new IncomingPacket(
			19, -2);
	boolean aBool6914;
	static int anInt6915;
	Class376_Sub4[] aClass376_Sub4Array6916;
	Class376_Sub7 aClass376_Sub7_6917;
	static Frame aFrame6918;
	static boolean aBool6919 = false;

	final boolean method2800(int i, Class163 class163, byte i_0_, int i_1_) {
		try {
			anInt6915++;
			int i_2_ = ((Class376_Sub5) this).aClass376_Sub7_6917
					.method2864(77);
			if (i_0_ != -122)
				return false;
			if (((Class376_Sub5) this).aClass376_Sub4Array6916 != null) {
				for (int i_3_ = 0; (((Class376_Sub5) this).aClass376_Sub4Array6916.length > i_3_); i_3_++) {
					((Class376_Sub4) (((Class376_Sub5) this).aClass376_Sub4Array6916[i_3_])).anInt6125 <<= i_2_;
					if (((Class376_Sub5) this).aClass376_Sub4Array6916[i_3_]
							.method2613(i_1_, i)
							&& ((Class376_Sub5) this).aClass376_Sub7_6917
									.method2873(class163, 0, i, i_1_)) {
						((Class376_Sub4) (((Class376_Sub5) this).aClass376_Sub4Array6916[i_3_])).anInt6125 >>= i_2_;
						return true;
					}
					((Class376_Sub4) (((Class376_Sub5) this).aClass376_Sub4Array6916[i_3_])).anInt6125 >>= i_2_;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ml.A(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_0_ + ','
					+ i_1_ + ')'));
		}
	}

	public static void method2801(int i) {
		try {
			int i_4_ = -7 / ((i - 48) / 53);
			aFrame6918 = null;
			ITEM_CONTAINER_UPDATE_IN_PACKET = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ml.B(" + i + ')');
		}
	}
}
