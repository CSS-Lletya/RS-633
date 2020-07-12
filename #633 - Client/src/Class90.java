/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.Class18;
import jagdx.IDirect3DVertexBuffer;

final class Class90 implements Interface3 {
	private boolean aBool1226 = false;
	private boolean aBool1227;
	private Class163_Sub2_Sub2 aClass163_Sub2_Sub2_1228;
	IDirect3DVertexBuffer anIDirect3DVertexBuffer1229;
	private int anInt1230;
	private byte aByte1231;
	private int anInt1232;

	public final boolean method9(int i) {
		boolean bool;
		try {
			if (i != -17151)
				return true;
			if (aBool1226
					&& Class18.method157(-74,
							((Class90) this).anIDirect3DVertexBuffer1229
									.Unlock())) {
				aBool1226 = false;
				return true;
			}
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final int method48(boolean bool) {
		int i;
		try {
			if (bool != true)
				return -105;
			i = anInt1230;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	public final void method8(int i) {
		try {
			if (((Class90) this).anIDirect3DVertexBuffer1229 != null) {
				((Class90) this).anIDirect3DVertexBuffer1229
						.method3243(i + 2174);
				((Class90) this).anIDirect3DVertexBuffer1229 = null;
			}
			if (i == 5342) {
				anInt1230 = 0;
				anInt1232 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int method622(int i) {
		byte i_0_;
		try {
			if (i != -1611)
				return 65;
			i_0_ = aByte1231;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_0_;
	}

	public final boolean method11(Source source, byte i, int i_1_, int i_2_) {
		boolean bool;
		try {
			int i_3_ = 94 / ((i - 22) / 49);
			if (method10(-128, i_2_, i_1_))
				return (((Class90) this).anIDirect3DVertexBuffer1229
						.method3594(source, 0, 0, anInt1230, !aBool1227 ? 0
								: 8192));
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final boolean method10(int i, int i_4_, int i_5_) {
		boolean bool;
		try {
			aByte1231 = (byte) i_4_;
			int i_6_ = 35 % ((i + 67) / 56);
			anInt1230 = i_5_;
			if (anInt1232 < anInt1230) {
				int i_7_ = 8;
				int i_8_;
				if (!aBool1227)
					i_8_ = 1;
				else {
					i_7_ |= 0x200;
					i_8_ = 0;
				}
				if (null != ((Class90) this).anIDirect3DVertexBuffer1229)
					((Class90) this).anIDirect3DVertexBuffer1229
							.method3243(7516);
				((Class90) this).anIDirect3DVertexBuffer1229 = (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_1228).anIDirect3DDevice9578
						.method3377(anInt1230, i_7_, 0, i_8_,
								((Class90) this).anIDirect3DVertexBuffer1229));
				anInt1232 = anInt1230;
			}
			bool = ((Class90) this).anIDirect3DVertexBuffer1229 != null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	public final Buffer method12(int i, boolean bool) {
		Buffer buffer;
		try {
			if (null == ((Class90) this).anIDirect3DVertexBuffer1229)
				return null;
			bool &= aBool1227;
			if (i != -5419)
				method8(73);
			if (!aBool1226
					&& Class18
							.method157(
									-105,
									(((Class90) this).anIDirect3DVertexBuffer1229
											.Lock(0,
													anInt1232,
													!bool ? 0 : 8192,
													(((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_1228).aGeometryBuffer9562))))) {
				aBool1226 = true;
				return (((Class163_Sub2_Sub2) aClass163_Sub2_Sub2_1228).aGeometryBuffer9562);
			}
			buffer = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return buffer;
	}

	Class90(Class163_Sub2_Sub2 class163_sub2_sub2, boolean bool) {
		try {
			aClass163_Sub2_Sub2_1228 = class163_sub2_sub2;
			aBool1227 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
