/* Class376_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub1_Sub2 extends Class376_Sub1 {
	int anInt9742;
	short aShort9743;
	String aString9744;

	Class376_Sub1_Sub2(String string, int i) {
		try {
			((Class376_Sub1_Sub2) this).anInt9742 = (int) (Class137
					.method878((byte) -123) / 1000L);
			((Class376_Sub1_Sub2) this).aString9744 = string;
			((Class376_Sub1_Sub2) this).aShort9743 = (short) i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wo.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
