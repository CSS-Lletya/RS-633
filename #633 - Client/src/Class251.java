/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;

import jaggl.MapBuffer;
import jaggl.OpenGL;

abstract class Class251 implements Interface21 {
	static int anInt3446;
	static int anInt3447;
	static int anInt3448;
	private int anInt3449 = -1;
	static int anInt3450;
	static int anInt3451;
	static int anInt3452;
	static int anInt3453;
	private int anInt3454;
	static int anInt3455;
	private int anInt3456;
	static int anInt3457;
	private NativeHeapBuffer aNativeHeapBuffer3458;
	static int anInt3459;
	static long aLong3460 = 0L;
	private int anInt3461;
	private int anInt3462 = 0;
	private boolean aBool3463;
	static int anInt3464;
	Class163_Sub2_Sub1 aClass163_Sub2_Sub1_3465;

	private final void method1598(int i) {
		try {
			anInt3450++;
			if (anInt3449 < i) {
				if (((Class163_Sub2_Sub1) ((Class251) this).aClass163_Sub2_Sub1_3465).aBool8682) {
					OpenGL.glGenBuffersARB(1, Class307.anIntArray4116, 0);
					anInt3449 = Class307.anIntArray4116[0];
					OpenGL.glBindBufferARB(anInt3456, anInt3449);
				} else
					anInt3449 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nq.M(" + i + ')');
		}
	}

	final long method1599(boolean bool) {
		try {
			if (bool != true)
				anInt3461 = -123;
			anInt3447++;
			if (anInt3449 == 0)
				return aNativeHeapBuffer3458.getAddress();
			return 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nq.I(" + bool + ')');
		}
	}

	public int method48(boolean bool) {
		try {
			if (bool != true)
				return 60;
			anInt3446++;
			return anInt3461;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nq.A(" + bool + ')');
		}
	}

	final void method1600(int i) {
		do {
			try {
				if (((Class163_Sub2_Sub1) ((Class251) this).aClass163_Sub2_Sub1_3465).aBool8682)
					OpenGL.glBindBufferARB(anInt3456, anInt3449);
				anInt3448++;
				if (i == -24568)
					break;
				method1601((byte) 24, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nq.J(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1601(byte i, MapBuffer mapbuffer) {
		try {
			anInt3464++;
			if (i != 100)
				return true;
			boolean bool = true;
			if (anInt3462 != 0) {
				do {
					if (anInt3449 > 0) {
						OpenGL.glBindBufferARB(anInt3456, anInt3449);
						if (anInt3462 == 1) {
							OpenGL.glBufferSubDataARBa(
									anInt3456,
									0,
									anInt3454,
									((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).aNativeHeapBuffer7391
											.getAddress());
							if (!client.aBool10531)
								break;
						}
						bool = mapbuffer.method2344();
					}
				} while (false);
				anInt3462 = 0;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nq.N(" + i + ','
					+ (mapbuffer != null ? "{...}" : "null") + ')'));
		}
	}

	void method17(int i, byte i_0_) {
		try {
			anInt3459++;
			int i_1_ = 122 % ((i_0_ - 3) / 47);
			if ((anInt3454 ^ 0xffffffff) > (i ^ 0xffffffff)) {
				method1598(0);
				do {
					if (anInt3449 <= 0) {
						aNativeHeapBuffer3458 = ((Class251) this).aClass163_Sub2_Sub1_3465
								.method3025(-16455, i, false);
						if (!client.aBool10531)
							break;
					}
					OpenGL.glBindBufferARB(anInt3456, anInt3449);
					OpenGL.glBufferDataARBub(anInt3456, i, null, 0,
							!aBool3463 ? 35044 : 35040);
					((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).anInt7525 += i
							+ -anInt3454;
				} while (false);
				anInt3454 = i;
			}
			anInt3461 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nq.G(" + i + ','
					+ i_0_ + ')');
		}
	}

	static final Class206 method1602(int i, Class163 class163, int i_2_,
			int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			anInt3451++;
			long l = (long) i_5_;
			Class206 class206 = ((Class206) Class195_Sub1.aClass22_6153
					.method188(l, (byte) -48));
			int i_7_ = 2055;
			if (class206 == null) {
				Class179 class179 = Class11_Sub16.method2443(0,
						Class265.aClass146_3607, i_5_, 0);
				if (class179 == null)
					return null;
				if ((((Class179) class179).anInt2277 ^ 0xffffffff) > -14)
					class179.method1166(2, true);
				class206 = class163.method1020(class179, i_7_,
						Class196.anInt2662, 64, 768);
				Class195_Sub1.aClass22_6153.method184((byte) 126, class206, l);
			}
			class206 = class206.method1313((byte) 2, i_7_, true);
			if (i_2_ != 0)
				class206.a(i_2_);
			if (i_3_ != 0)
				class206.FA(i_3_);
			if (i_6_ >= -75)
				aLong3460 = 102L;
			if ((i ^ 0xffffffff) != -1)
				class206.VA(i);
			if ((i_4_ ^ 0xffffffff) != -1)
				class206.H(0, i_4_, 0);
			return class206;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nq.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ',' + i_2_ + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	final Buffer method1603(boolean bool, MapBuffer mapbuffer, byte i) {
		try {
			anInt3455++;
			if (i != -24)
				method8(81);
			if (anInt3462 == 0) {
				method1598(0);
				if (anInt3449 <= 0) {
					anInt3462 = 2;
					return aNativeHeapBuffer3458;
				}
				OpenGL.glBindBufferARB(anInt3456, anInt3449);
				if (bool) {
					OpenGL.glBufferDataARBub(anInt3456, anInt3454, null, 0,
							!aBool3463 ? 35044 : 35040);
					if (((((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).aNativeHeapBuffer7391.anInt255) ^ 0xffffffff) <= (anInt3461 ^ 0xffffffff)) {
						anInt3462 = 1;
						return (((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).aNativeHeapBuffer7391);
					}
				}
				if (!mapbuffer.method2345()
						&& mapbuffer.method2343(anInt3456, anInt3461, 35001)) {
					anInt3462 = 2;
					return mapbuffer;
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nq.L(" + bool + ','
					+ (mapbuffer != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	void method8(int i) {
		do {
			try {
				if (anInt3449 > 0) {
					((Class251) this).aClass163_Sub2_Sub1_3465.method3408(
							i - 5267, anInt3449, anInt3461);
					anInt3449 = -1;
				}
				anInt3452++;
				if (i == 5342)
					break;
				aLong3460 = 54L;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "nq.E(" + i + ')');
			}
			break;
		} while (false);
	}

	final boolean method1604(Source source, int i, int i_8_) {
		try {
			if (i_8_ != 2)
				aBool3463 = false;
			anInt3453++;
			if ((i ^ 0xffffffff) >= (anInt3454 ^ 0xffffffff)) {
				if (anInt3449 <= 0)
					throw new RuntimeException("ARGH!");
				OpenGL.glBindBufferARB(anInt3456, anInt3449);
				OpenGL.glBufferSubDataARBa(anInt3456, 0, anInt3461,
						source.getAddress());
				((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).anInt7525 += -anInt3461
						+ i;
			} else {
				method1598(0);
				if (anInt3449 > 0) {
					OpenGL.glBindBufferARB(anInt3456, anInt3449);
					OpenGL.glBufferDataARBa(anInt3456, i, source.getAddress(),
							!aBool3463 ? 35044 : 35040);
					((Class163_Sub2) ((Class251) this).aClass163_Sub2_Sub1_3465).anInt7525 += -anInt3461
							+ i;
				} else
					throw new RuntimeException("ARGH!");
				anInt3454 = i;
			}
			anInt3461 = i;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nq.O("
					+ (source != null ? "{...}" : "null") + ',' + i + ','
					+ i_8_ + ')'));
		}
	}

	protected final void finalize() throws Throwable {
		try {
			anInt3457++;
			method8(5342);
			super.finalize();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nq.finalize(" + ')');
		}
	}

	Class251(Class163_Sub2_Sub1 class163_sub2_sub1, int i, boolean bool) {
		try {
			aBool3463 = bool;
			anInt3456 = i;
			((Class251) this).aClass163_Sub2_Sub1_3465 = class163_sub2_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nq.<init>("
					+ (class163_sub2_sub1 != null ? "{...}" : "null") + ',' + i
					+ ',' + bool + ')'));
		}
	}
}
