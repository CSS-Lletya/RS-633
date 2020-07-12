/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

abstract class Class19 {
	static Hashtable aHashtable150 = new Hashtable();
	static OutgoingPacket aClass370_151 = new OutgoingPacket(27, 3);
	static int anInt152;

	abstract int method162(boolean bool, int i);

	abstract void method163(byte i, int i_0_);

	public Class19() {
		/* empty */
	}

	public static void method164(int i) {
		try {
			aClass370_151 = null;
			int i_1_ = 52 / ((i + 53) / 47);
			aHashtable150 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "rfa.C(" + i + ')');
		}
	}

	abstract byte[] method165(int i, int i_2_);

	abstract Class130 method166(int i);
}
