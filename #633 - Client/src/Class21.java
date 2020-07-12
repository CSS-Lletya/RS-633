/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.net.URL;

final class Class21 {
	static int anInt172;
	private Class163_Sub3 aClass163_Sub3_173;
	static int anInt174;
	static int anInt175;
	long aLong176;

	static final Class11_Sub30 method178(int i, int i_0_, int i_1_,
			Canvas canvas) {
		try {
			anInt175++;
			try {
				Class var_class = Class.forName("Class11_Sub30_Sub2");
				if (i_1_ != 4380)
					method179(null, null, -106, true);
				Class11_Sub30 class11_sub30 = (Class11_Sub30) var_class
						.newInstance();
				class11_sub30.method2731(i_0_, i, false, canvas);
				return class11_sub30;
			} catch (Throwable throwable) {
				Class11_Sub30_Sub1 class11_sub30_sub1 = new Class11_Sub30_Sub1();
				class11_sub30_sub1.method2731(i_0_, i, false, canvas);
				return class11_sub30_sub1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aea.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt174++;
			aClass163_Sub3_173.method3299(((Class21) this).aLong176, -1);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "aea.finalize(" + ')');
		}
	}

	static final Class368 method179(Class341 class341, String string, int i,
			boolean bool) {
		try {
			anInt172++;
			if (i == 0)
				return class341.method2061(126, string);
			if (i == 1) {
				try {
					Class36.method309(Class108_Sub16.anApplet6538, 23131,
							"openjs", (new Object[] { new URL(
									Class108_Sub16.anApplet6538.getCodeBase(),
									string).toString() }));
					Class368 class368 = new Class368();
					class368.anInt4837 = 1;
					return class368;
				} catch (Throwable throwable) {
					Class368 class368 = new Class368();
					class368.anInt4837 = 2;
					return class368;
				}
			}
			if ((i ^ 0xffffffff) == -3) {
				try {
					Class108_Sub16.anApplet6538
							.getAppletContext()
							.showDocument(
									new URL(
											Class108_Sub16.anApplet6538
													.getCodeBase(),
											string), "_blank");
					Class368 class368 = new Class368();
					class368.anInt4837 = 1;
					return class368;
				} catch (Exception exception) {
					Class368 class368 = new Class368();
					class368.anInt4837 = 2;
					return class368;
				}
			}
			if (i == 3) {
				try {
					Class36.method311("loggedout", 93,
							Class108_Sub16.anApplet6538);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {
					Class108_Sub16.anApplet6538
							.getAppletContext()
							.showDocument(
									new URL(
											Class108_Sub16.anApplet6538
													.getCodeBase(),
											string), "_top");
					Class368 class368 = new Class368();
					class368.anInt4837 = 1;
					return class368;
				} catch (Exception exception) {
					Class368 class368 = new Class368();
					class368.anInt4837 = 2;
					return class368;
				}
			}
			if (bool != true)
				return null;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aea.A("
					+ (class341 != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ',' + i + ','
					+ bool + ')'));
		}
	}

	Class21(Class163_Sub3 class163_sub3, long l, Class95[] class95s) {
		try {
			((Class21) this).aLong176 = l;
			aClass163_Sub3_173 = class163_sub3;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("aea.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + l
					+ ',' + (class95s != null ? "{...}" : "null") + ')'));
		}
	}
}
