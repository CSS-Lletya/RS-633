/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jagdx.Class18;
import jagdx.IDirect3DIndexBuffer;

final class Class202 implements Interface27 {
	private int anInt2714;
	IDirect3DIndexBuffer anIDirect3DIndexBuffer2715;
	private boolean aBool2716 = false;
	private Class366 aClass366_2717;
	private boolean aBool2718;
	private Class163_Sub2_Sub2 aClass163_Sub2_Sub2_2719;
	private int anInt2720;

	public final Buffer method12(int i, boolean bool) {
		Buffer buffer;
		try {
			if (null == ((Class202) this).anIDirect3DIndexBuffer2715)
				return null;
			bool &= aBool2718;
			if (i != 27599)
				aClass366_2717 = null;
			if (!aBool2716
					&& Class18
							.method157(
									-103,
									(((Class202) this).anIDirect3DIndexBuffer2715
											.Lock(0,
													anInt2714,
													bool ? 8192 : 0,
													(((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_2719).aGeometryBuffer9562))))) {
				aBool2716 = true;
				return (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_2719).aGeometryBuffer9562);
			}
			buffer = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return buffer;
	}

	public final int method48(boolean bool) {
		int i;
		try {
			if (bool != true)
				method59(127);
			i = anInt2720;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public final Class366 method59(int i) {
		Class366 class366;
		try {
			if (i != -14876)
				method59(33);
			class366 = aClass366_2717;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class366;
	}

	public final void method8(int i) {
		try {
			if (((Class202) this).anIDirect3DIndexBuffer2715 != null) {
				((Class202) this).anIDirect3DIndexBuffer2715.method3243(7516);
				((Class202) this).anIDirect3DIndexBuffer2715 = null;
			}
			anInt2714 = 0;
			if (i != 5342)
				method59(-128);
			anInt2720 = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final boolean method40(byte i) {
		boolean bool;
		try {
			if (aBool2716
					&& Class18.method157(-108,
							((Class202) this).anIDirect3DIndexBuffer2715
									.Unlock())) {
				aBool2716 = false;
				return true;
			}
			if (i < 104)
				return false;
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	Class202(Class163_Sub2_Sub2 class163_sub2_sub2, Class366 class366,
			boolean bool) {
		try {
			aClass163_Sub2_Sub2_2719 = class163_sub2_sub2;
			aClass366_2717 = class366;
			aBool2718 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final void method17(int i, byte i_0_) {
		try {
			int i_1_ = 26 % ((3 - i_0_) / 47);
			anInt2720 = i * ((Class366) aClass366_2717).anInt4802;
			if (anInt2720 > anInt2714) {
				int i_2_ = 8;
				int i_3_;
				if (aBool2718) {
					i_3_ = 0;
					i_2_ |= 0x200;
				} else
					i_3_ = 1;
				if (((Class202) this).anIDirect3DIndexBuffer2715 != null)
					((Class202) this).anIDirect3DIndexBuffer2715
							.method3243(7516);
				((Class202) this).anIDirect3DIndexBuffer2715 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_2719).anIDirect3DDevice9578
						.method3367(anInt2720, i_2_,
								Class366.aClass366_4809 == aClass366_2717 ? 101
										: 102, i_3_,
								((Class202) this).anIDirect3DIndexBuffer2715));
				anInt2714 = anInt2720;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
