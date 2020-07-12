/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class274 {
	private Class163_Sub2_Sub1 aClass163_Sub2_Sub1_3689;
	long aLong3690;
	static Class124 aClass124_3691 = new Class124(16);
	static int anInt3692;
	static int anInt3693;
	static int anInt3694 = -1;

	public static void method1707(byte i) {
		do {
			try {
				aClass124_3691 = null;
				if (i == -114)
					break;
				method1707((byte) 118);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pl.A(" + i + ')');
			}
			break;
		} while (false);
	}

	static final void method1708(double d, byte i) {
		try {
			anInt3692++;
			int i_0_ = -82 % ((i + 73) / 49);
			Class11_Sub2_Sub34.aClass33_9692.method296(Class321.aClass33_4280);
			Class11_Sub2_Sub34.aClass33_9692.method299(0, 0, (int) d);
			Class243.aClass163_3308
					.method1080(Class11_Sub2_Sub34.aClass33_9692);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pl.B(" + d + ',' + i
					+ ')');
		}
	}

	protected final void finalize() throws Throwable {
		try {
			aClass163_Sub2_Sub1_3689.method3401(((Class274) this).aLong3690,
					(byte) -107);
			anInt3693++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pl.finalize(" + ')');
		}
	}

	Class274(Class163_Sub2_Sub1 class163_sub2_sub1, long l, int i) {
		try {
			aClass163_Sub2_Sub1_3689 = class163_sub2_sub1;
			((Class274) this).aLong3690 = l;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pl.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + l
					+ ',' + i + ')'));
		}
	}
}
