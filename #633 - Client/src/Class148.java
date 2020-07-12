/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

final class Class148 {
	static final Class163 method945(Interface1 interface1, Canvas canvas,
			Class146 class146, int i, int i_0_) {
		try {
			Class163 class163;
			try {
				if (i_0_ != -18090)
					return null;
				if (!OutputStream_Sub1.method2484(i_0_ + 18091))
					throw new RuntimeException("");
				if (!Class335_Sub3_Sub1.method3711("jagdx", true))
					throw new RuntimeException("");
				Class var_class = Class.forName("Class163_Sub2_Sub2");
				@SuppressWarnings("unchecked")
				Method method = (var_class.getDeclaredMethod(
						"createToolkit",
						new Class[] { Class.forName("java.awt.Canvas"),
								Class.forName("Interface1"),
								Class.forName("Class146"),
								Class.forName("java.lang.Integer") }));
				class163 = ((Class163) method.invoke(null, new Object[] {
						canvas, interface1, class146, new Integer(i) }));
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			} catch (Throwable throwable) {
				throw new RuntimeException("");
			}
			return class163;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
