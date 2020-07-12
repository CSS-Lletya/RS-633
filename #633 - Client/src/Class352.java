/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class Class352 {
	static int anInt4622;
	static int anInt4623;
	private Class146 aClass146_4624;
	static int anInt4625;
	int anInt4626;
	private Class146 aClass146_4627;
	static int anInt4628;
	int anInt4629 = 0;
	static Class84 aClass84_4630 = new Class84();
	private Class22 aClass22_4631;
	private Interface14 anInterface14_4632;

	final Class11_Sub45_Sub13 method2107(int i, boolean bool) {
		try {
			anInt4628++;
			Class11_Sub45_Sub13 class11_sub45_sub13 = ((Class11_Sub45_Sub13) aClass22_4631
					.method188((long) i, (byte) 103));
			if (class11_sub45_sub13 != null)
				return class11_sub45_sub13;
			byte[] is;
			if ((i ^ 0xffffffff) <= -32769)
				is = aClass146_4627.method930(0x7fff & i, (byte) 112, 1);
			else
				is = aClass146_4624.method930(i, (byte) 112, 1);
			class11_sub45_sub13 = new Class11_Sub45_Sub13();
			if (bool != false)
				method2108(null, null, (byte) -25);
			((Class11_Sub45_Sub13) class11_sub45_sub13).aClass352_9301 = this;
			if (is != null)
				class11_sub45_sub13.method3624(-74, new Stream(is));
			if ((i ^ 0xffffffff) <= -32769)
				class11_sub45_sub13.method3632((byte) -79);
			aClass22_4631.method184((byte) 127, class11_sub45_sub13, (long) i);
			return class11_sub45_sub13;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vs.E(" + i + ','
					+ bool + ')');
		}
	}

	static final void method2108(String[] strings, short[] is, byte i) {
		try {
			if (i == 91) {
				anInt4625++;
				Class291.method1800(strings, strings.length - 1, true, is, 0);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vs.D("
					+ (strings != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public static void method2109(int i) {
		try {
			if (i == 1)
				aClass84_4630 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vs.A(" + i + ')');
		}
	}

	final String method2110(boolean bool, long l, Class79 class79, int[] is) {
		try {
			if (bool != false)
				method2107(114, true);
			anInt4623++;
			if (anInterface14_4632 != null) {
				String string = anInterface14_4632.method45(is, class79, l,
						false);
				if (string != null)
					return string;
			}
			return Long.toString(l);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vs.C(" + bool + ','
					+ l + ',' + (class79 != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method2111(int i, Canvas canvas) {
		try {
			anInt4622++;
			Dimension dimension = canvas.getSize();
			if (i != 27634)
				method2108(null, null, (byte) 93);
			Class138.method880(dimension.height, 0, dimension.width);
			if ((OutputStream_Sub1.anInt5845 ^ 0xffffffff) != -2)
				Class243.aClass163_3308.method1025(canvas,
						(Class11_Sub2_Sub16.anInt9038),
						(Class376_Sub7_Sub3_Sub2.anInt10143));
			else
				Class243.aClass163_3308.method1025(canvas,
						Class11_Sub39.anInt7215, Class11_Sub33.anInt6897);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vs.B(" + i + ','
					+ (canvas != null ? "{...}" : "null") + ')'));
		}
	}

	Class352(int i, Class146 class146, Class146 class146_0_,
			Interface14 interface14) {
		((Class352) this).anInt4626 = 0;
		aClass22_4631 = new Class22(64);
		anInterface14_4632 = null;
		do {
			try {
				aClass146_4627 = class146_0_;
				anInterface14_4632 = interface14;
				aClass146_4624 = class146;
				if (aClass146_4624 != null)
					((Class352) this).anInt4626 = aClass146_4624
							.method914(1, 0);
				if (aClass146_4627 == null)
					break;
				((Class352) this).anInt4629 = aClass146_4627.method914(1, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("vs.<init>(" + i
						+ ',' + (class146 != null ? "{...}" : "null") + ','
						+ (class146_0_ != null ? "{...}" : "null") + ','
						+ (interface14 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}
}
