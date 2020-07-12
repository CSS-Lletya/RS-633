/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

import jaclib.memory.Buffer;

import jaggl.OpenGL;

abstract class Class239 {
	static int anInt3243;
	static int anInt3244;
	static int anInt3245;
	static int anInt3246;
	private boolean aBool3247;
	int anInt3248;
	Class163_Sub3 aClass163_Sub3_3249;
	static int anInt3250 = -1;
	static int anInt3251;
	private int anInt3252;
	static int anInt3253;
	private int anInt3254;
	static int anInt3255;

	final void method1518(boolean bool, int i, byte[] is) {
		try {
			anInt3244++;
			if (bool != true)
				method1523(-118);
			method1520((byte) 50);
			if (anInt3252 >= i)
				OpenGL.glBufferSubDataARBub(anInt3254, 0, i, is, 0);
			else {
				OpenGL.glBufferDataARBub(anInt3254, i, is, 0, aBool3247 ? 35040
						: 35044);
				((Class163_Sub3) ((Class239) this).aClass163_Sub3_3249).anInt8288 += -anInt3252
						+ i;
				anInt3252 = i;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mp.H(" + bool + ','
					+ i + ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class118[] method1519(int i) {
		try {
			if (i != -11911)
				method1523(-33);
			anInt3243++;
			return new Class118[] { Class102.aClass118_1364,
					Class376_Sub7_Sub2_Sub1.aClass118_10207,
					Class47.aClass118_740 };
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mp.I(" + i + ')');
		}
	}

	abstract void method1520(byte i);

	protected final void finalize() throws Throwable {
		try {
			((Class239) this).aClass163_Sub3_3249.method3284(-103,
					((Class239) this).anInt3248, anInt3252);
			anInt3255++;
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mp.finalize(" + ')');
		}
	}

	static final void method1521(boolean bool, int i, int i_0_) {
		try {
			if (i != 0)
				anInt3250 = -46;
			anInt3246++;
			Class321_Sub3.method2851(Class26.aClass26_288.method217((byte) 95,
					Class11_Sub45_Sub1_Sub2.anInt9884), i_0_, (byte) -54, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mp.K(" + bool + ','
					+ i + ',' + i_0_ + ')'));
		}
	}

	static final String method1522(byte i, long l) {
		try {
			Packet.aCalendar8713.setTime(new Date(l));
			anInt3251++;
			int i_1_ = Packet.aCalendar8713.get(7);
			int i_2_ = -112 / ((i - 22) / 32);
			int i_3_ = Packet.aCalendar8713.get(5);
			int i_4_ = Packet.aCalendar8713.get(2);
			int i_5_ = Packet.aCalendar8713.get(1);
			int i_6_ = Packet.aCalendar8713.get(11);
			int i_7_ = Packet.aCalendar8713.get(12);
			int i_8_ = Packet.aCalendar8713.get(13);
			return (Class288.aStringArray3894[-1 + i_1_] + ", " + i_3_ / 10
					+ i_3_ % 10 + "-" + Class359.aStringArray4688[i_4_] + "-"
					+ i_5_ + " " + i_6_ / 10 + i_6_ % 10 + ":" + i_7_ / 10
					+ i_7_ % 10 + ":" + i_8_ / 10 + i_8_ % 10 + " GMT");
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mp.M(" + i + ',' + l
					+ ')');
		}
	}

	static final Class195_Sub1 method1523(int i) {
		try {
			if (i != 1554)
				anInt3250 = -26;
			anInt3253++;
			if (Class65.aClass195_Sub1Array940.length > Class11_Sub2_Sub22.anInt9208)
				return (Class65.aClass195_Sub1Array940[Class11_Sub2_Sub22.anInt9208++]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mp.L(" + i + ')');
		}
	}

	static final int method1524(int i, int i_9_) {
		try {
			anInt3245++;
			if (i_9_ != 127)
				method1523(-123);
			return i & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "mp.J(" + i + ','
					+ i_9_ + ')');
		}
	}

	Class239(Class163_Sub3 class163_sub3, int i, byte[] is, int i_10_,
			boolean bool) {
		try {
			anInt3252 = i_10_;
			aBool3247 = bool;
			anInt3254 = i;
			((Class239) this).aClass163_Sub3_3249 = class163_sub3;
			OpenGL.glGenBuffersARB(1, Class110.anIntArray1496, 0);
			((Class239) this).anInt3248 = Class110.anIntArray1496[0];
			method1520((byte) 76);
			OpenGL.glBufferDataARBub(i, anInt3252, is, 0, !aBool3247 ? 35044
					: 35040);
			((Class163_Sub3) ((Class239) this).aClass163_Sub3_3249).anInt8288 += anInt3252;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mp.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ','
					+ bool + ')'));
		}
	}

	Class239(Class163_Sub3 class163_sub3, int i, Buffer buffer, int i_11_,
			boolean bool) {
		try {
			aBool3247 = bool;
			anInt3252 = i_11_;
			((Class239) this).aClass163_Sub3_3249 = class163_sub3;
			anInt3254 = i;
			OpenGL.glGenBuffersARB(1, Class110.anIntArray1496, 0);
			((Class239) this).anInt3248 = Class110.anIntArray1496[0];
			method1520((byte) 76);
			OpenGL.glBufferDataARBa(i, anInt3252, buffer.getAddress(),
					!aBool3247 ? 35044 : 35040);
			((Class163_Sub3) ((Class239) this).aClass163_Sub3_3249).anInt8288 += anInt3252;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("mp.<init>("
					+ (class163_sub3 != null ? "{...}" : "null") + ',' + i
					+ ',' + (buffer != null ? "{...}" : "null") + ',' + i_11_
					+ ',' + bool + ')'));
		}
	}
}
