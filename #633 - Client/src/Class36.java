/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class36 {
	static final Object method309(Applet applet, int i, String string,
			Object[] objects) throws Throwable {
		try {
			if (i != 23131)
				return null;
			return JSObject.getWindow(applet).call(string, objects);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final void method310(String string, Applet applet, int i)
			throws Throwable {
		try {
			JSObject.getWindow(applet).eval(string);
			int i_0_ = 65 / ((45 - i) / 37);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Object method311(String string, int i, Applet applet)
			throws Throwable {
		try {
			if (i <= 83)
				return null;
			return JSObject.getWindow(applet).call(string, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
