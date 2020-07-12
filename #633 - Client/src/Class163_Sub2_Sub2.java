/* Class163_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

import jaclib.peer.Class185;
import jagdx.Class18;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.RuntimeException_Sub2;

public final class Class163_Sub2_Sub2 extends Class163_Sub2 {
	private D3DLIGHT aD3DLIGHT9554;
	private int anInt9555;
	private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9556;
	private int[] anIntArray9557;
	private static int[] anIntArray9558;
	boolean aBool9559;
	PixelBuffer aPixelBuffer9560;
	boolean aBool9561;
	GeometryBuffer aGeometryBuffer9562;
	private D3DLIGHT aD3DLIGHT9563;
	private int anInt9564;
	private IDirect3DVertexShader anIDirect3DVertexShader9565;
	private boolean[] aBoolArray9566;
	private static int[] anIntArray9567 = { 77, 80 };
	private IDirect3D anIDirect3D9568;
	boolean aBool9569;
	private boolean aBool9570;
	private static float[] aFloatArray9571 = new float[16];
	private Class34[] aClass34Array9572;
	private int anInt9573 = 0;
	D3DCAPS aD3DCAPS9574;
	private boolean[] aBoolArray9575;
	private D3DLIGHT aD3DLIGHT9576;
	Class185 aClass185_9577;
	IDirect3DDevice anIDirect3DDevice9578;
	private boolean[] aBoolArray9579;
	private boolean[] aBoolArray9580;
	private Class157 aClass157_9581;

	private static final int method3769(Class314 class314, int i) {
		try {
			if (Class121.aClass314_1643 != class314) {
				if (class314 != Class188.aClass314_2424) {
					if (Class11_Sub2_Sub19.aClass314_9092 != class314) {
						if (class314 == Class380.aClass314_4960)
							return 7;
						if (Class11_Sub35_Sub1.aClass314_9109 == class314)
							return 10;
					} else
						return 26;
				} else
					return 4;
			} else
				return 2;
			if (i != 12225)
				method3777(null, -82);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3099(byte i) {
		try {
			if (i != -45)
				((Class163_Sub2_Sub2) this).aBool9561 = true;
			if (aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570]) {
				aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570] = false;
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetTexture(
						((Class163_Sub2_Sub2) this).anInt7570, null);
				method3054((byte) 70);
				method3044(26776);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3022(int i) {
		try {
			if (i != 3)
				((Class163_Sub2_Sub2) this).aClass185_9577 = null;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3369(174,
					((Class163_Sub2_Sub2) this).aBool7664);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final Class163 createToolkit(Canvas canvas, Interface1 interface1,
			Class146 class146, Integer integer) {
		try {
			Class163_Sub2_Sub2 class163_sub2_sub2 = null;
			Class163_Sub2_Sub2 class163_sub2_sub2_0_;
			try {
				int i = 0;
				int i_1_ = 1;
				Class185 class185 = new Class185();
				IDirect3D idirect3d = IDirect3D.method3380(-2147483616,
						class185);
				D3DCAPS d3dcaps = idirect3d.method3381(i, i_1_);
				if (-1 == (d3dcaps.RasterCaps & 0x1000000 ^ 0xffffffff))
					throw new RuntimeException("");
				if (2 > d3dcaps.MaxSimultaneousTextures)
					throw new RuntimeException("");
				if (-1 == (0x2 & d3dcaps.TextureOpCaps ^ 0xffffffff))
					throw new RuntimeException("");
				if (0 == (d3dcaps.TextureOpCaps & 0x8))
					throw new RuntimeException("");
				if (0 == (d3dcaps.TextureOpCaps & 0x40))
					throw new RuntimeException("");
				if (-1 == (0x200 & d3dcaps.TextureOpCaps ^ 0xffffffff))
					throw new RuntimeException("");
				if ((0x2000000 & d3dcaps.TextureOpCaps) == 0)
					throw new RuntimeException("");
				if ((d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps & 0x10 ^ 0xffffffff) == -1)
					throw new RuntimeException("");
				if (-1 == (0x20 & (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps) ^ 0xffffffff))
					throw new RuntimeException("");
				if (0 == (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2))
					throw new RuntimeException("");
				if (-1 > (d3dcaps.MaxActiveLights ^ 0xffffffff)
						&& (d3dcaps.MaxActiveLights ^ 0xffffffff) > -3)
					throw new RuntimeException("");
				if (d3dcaps.MaxStreams < 5)
					throw new RuntimeException("");
				D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(
						canvas);
				if (!method3774(integer.intValue(), idirect3d, 0,
						d3dpresent_parameters, i_1_, i))
					throw new RuntimeException("");
				d3dpresent_parameters.PresentationInterval = -2147483648;
				d3dpresent_parameters.Windowed = true;
				d3dpresent_parameters.EnableAutoDepthStencil = true;
				int i_2_ = 2;
				if ((0x100000 & d3dcaps.DevCaps ^ 0xffffffff) != -1)
					i_2_ |= 0x10;
				Object object = null;
				IDirect3DDevice idirect3ddevice;
				try {
					idirect3ddevice = idirect3d.method3378(i, i_1_, canvas,
							i_2_ | 0x40, d3dpresent_parameters);
				} catch (RuntimeException_Sub2 runtimeexception_sub2) {
					idirect3ddevice = idirect3d.method3378(i, i_1_, canvas,
							i_2_ | 0x20, d3dpresent_parameters);
				}
				Class157 class157 = new Class157(idirect3ddevice.method3361(0),
						idirect3ddevice.method3362());
				class163_sub2_sub2 = new Class163_Sub2_Sub2(i, i_1_, canvas,
						class185, idirect3d, idirect3ddevice, class157,
						d3dpresent_parameters, d3dcaps, interface1, class146,
						integer.intValue());
				class163_sub2_sub2.method2974((byte) 55);
				class163_sub2_sub2_0_ = class163_sub2_sub2;
			} catch (RuntimeException runtimeexception) {
				if (null != class163_sub2_sub2)
					class163_sub2_sub2.method1016();
				throw runtimeexception;
			}
			return class163_sub2_sub2_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3072(int i) {
		try {
			if (i != 11)
				method1032();
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetTransform(3,
					((Class163_Sub2_Sub2) this).aFloatArray7562);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int[] na(int i, int i_3_, int i_4_, int i_5_) {
		int[] is;
		try {
			int[] is_6_ = null;
			IDirect3DSurface idirect3dsurface = ((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3368(0);
			IDirect3DSurface idirect3dsurface_7_ = ((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3375(i_4_, i_5_, 21, 0, 0, true);
			if (Class18.method157(-128,
					(((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.StretchRect(idirect3dsurface, i, i_3_, i_4_, i_5_,
									idirect3dsurface_7_, 0, 0, i_4_, i_5_, 0)))
					&& Class18.method157(-96, (idirect3dsurface_7_.LockRect(0,
							0, i_4_, i_5_, 16,
							(((Class163_Sub2_Sub2) this).aPixelBuffer9560))))) {
				is_6_ = new int[i_5_ * i_4_];
				int i_8_ = ((Class163_Sub2_Sub2) this).aPixelBuffer9560
						.getRowPitch();
				if (i_8_ != 4 * i_4_) {
					for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff); i_9_++)
						((Class163_Sub2_Sub2) this).aPixelBuffer9560
								.method3397(is_6_, i_4_ * i_9_, i_9_ * i_8_,
										i_4_);
				} else
					((Class163_Sub2_Sub2) this).aPixelBuffer9560.method3397(
							is_6_, 0, 0, i_5_ * i_4_);
				idirect3dsurface_7_.UnlockRect();
			}
			idirect3dsurface.method3243(7516);
			idirect3dsurface_7_.method3243(7516);
			is = is_6_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return is;
	}

	final void method1043() {
		/* empty */
	}

	final void method1042(float f, float f_10_, float f_11_) {
		/* empty */
	}

	final void method3096(Canvas canvas, Object object, boolean bool) {
		try {
			if (bool != true)
				method1053(false);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface3 method3005(boolean bool, int i) {
		Class90 class90;
		try {
			if (i != 30519)
				aD3DPRESENT_PARAMETERS9556 = null;
			class90 = new Class90(this, bool);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class90;
	}

	final void method3085(int i, byte i_12_) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, 11, i);
			if (i_12_ != 70)
				anIntArray9558 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3770(int i, IDirect3DPixelShader idirect3dpixelshader) {
		try {
			int i_13_ = -24 / ((-42 - i) / 34);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetPixelShader(idirect3dpixelshader);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1076(Interface10 interface10) {
		/* empty */
	}

	final void method1016() {
		try {
			((Class163_Sub2_Sub2) this).aClass185_9577.method1209(false);
			super.method1016();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3004(byte i) {
		try {
			if (((Class163_Sub2_Sub2) this).aClass282_7560 != Class376_Sub7_Sub3_Sub1.aClass282_9845) {
				if (Class11_Sub2_Sub1.aClass282_8437 == ((Class163_Sub2_Sub2) this).aClass282_7560) {
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetRenderState(19, 2);
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetRenderState(20, 2);
				} else if (Class165.aClass282_2145 == ((Class163_Sub2_Sub2) this).aClass282_7560) {
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetRenderState(19, 9);
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetRenderState(20, 2);
				}
			} else {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetRenderState(19, 5);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetRenderState(20, 6);
			}
			if (i != -83)
				method3781(123, null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3027(int i) {
		try {
			if (anIDirect3DVertexShader9565 == null
					&& ((((Class163_Sub2_Sub2) this).aClass240Array7599[((Class163_Sub2_Sub2) this).anInt7570]) != Class251_Sub2.aClass240_5429)) {
				if (Class11_Sub2_Sub2.aClass240_8463 == (((Class163_Sub2_Sub2) this).aClass240Array7599[((Class163_Sub2_Sub2) this).anInt7570]))
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetTransform(
									((Class163_Sub2_Sub2) this).anInt7570 + 16,
									((Class163_Sub2_Sub2) this).aClass33_Sub2Array7568[((Class163_Sub2_Sub2) this).anInt7570]
											.method2756(-95, aFloatArray9571));
				else
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetTransform(
									((Class163_Sub2_Sub2) this).anInt7570 + 16,
									((Class163_Sub2_Sub2) this).aClass33_Sub2Array7568[((Class163_Sub2_Sub2) this).anInt7570]
											.method2752(aFloatArray9571, 113));
				int i_14_ = method3777(
						(((Class163_Sub2_Sub2) this).aClass240Array7599[((Class163_Sub2_Sub2) this).anInt7570]),
						i - 13212);
				if (i_14_ != anIntArray9557[((Class163_Sub2_Sub2) this).anInt7570]) {
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetTextureStageState(
									((Class163_Sub2_Sub2) this).anInt7570, 24,
									i_14_);
					anIntArray9557[((Class163_Sub2_Sub2) this).anInt7570] = i_14_;
				}
			} else {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetTextureStageState(
								((Class163_Sub2_Sub2) this).anInt7570, 24, 0);
				anIntArray9557[((Class163_Sub2_Sub2) this).anInt7570] = 0;
			}
			if (i != 13225)
				anInt9564 = -96;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3076(boolean bool) {
		try {
			if (!((Class163_Sub2_Sub2) this).aBool7526)
				((Class163_Sub2_Sub2) this).aClass33_Sub2_7533.method2752(
						aFloatArray9571, 15);
			else {
				aFloatArray9571[11] = 0.0F;
				aFloatArray9571[6] = 0.0F;
				aFloatArray9571[13] = 0.0F;
				aFloatArray9571[4] = 0.0F;
				aFloatArray9571[3] = 0.0F;
				aFloatArray9571[8] = 0.0F;
				aFloatArray9571[5] = 1.0F;
				aFloatArray9571[7] = 0.0F;
				aFloatArray9571[9] = 0.0F;
				aFloatArray9571[14] = 0.0F;
				aFloatArray9571[1] = 0.0F;
				aFloatArray9571[12] = 0.0F;
				aFloatArray9571[10] = 1.0F;
				aFloatArray9571[2] = 0.0F;
				aFloatArray9571[15] = 1.0F;
				aFloatArray9571[0] = 1.0F;
			}
			if (bool != true)
				method3046(-65);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetTransform(256,
					aFloatArray9571);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2991(Canvas canvas, int i, Object object) {
		try {
			if (i <= 115)
				((Class163_Sub2_Sub2) this).aGeometryBuffer9562 = null;
			if (((Class163_Sub2_Sub2) this).aCanvas7463 == canvas) {
				Dimension dimension = canvas.getSize();
				if (dimension.width > 0 && (dimension.height ^ 0xffffffff) < -1) {
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.EndScene();
					method3780(104);
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.BeginScene();
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3044(int i) {
		try {
			int i_15_ = (!aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570] ? 1
					: method3769(
							(((Class163_Sub2_Sub2) this).aClass314Array7592[((Class163_Sub2_Sub2) this).anInt7570]),
							i ^ 0x4759));
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, 1, i_15_);
			if (i != 26776)
				aBoolArray9579 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method1032() {
		boolean bool;
		try {
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	private static final int method3771(byte i, Class218 class218) {
		try {
			if (Class11_Sub45_Sub12.aClass218_9187 == class218)
				return 2;
			if (Class345.aClass218_4579 == class218)
				return 0;
			if (class218 == Class6.aClass218_42)
				return 1;
			if (class218 == Class68.aClass218_962)
				return 3;
			if (i != -44)
				return -6;
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3053(boolean bool, Class218 class218, byte i, int i_16_) {
		try {
			if (i >= -35)
				anIntArray9567 = null;
			int i_17_ = i_16_;
			int i_18_;
			while_89_: do {
				do {
					if (-2 != (i_17_ ^ 0xffffffff)) {
						if ((i_17_ ^ 0xffffffff) != -3)
							break;
					} else {
						i_18_ = 6;
						break while_89_;
					}
					i_18_ = 27;
					break while_89_;
				} while (false);
				i_18_ = 5;
			} while (false);
			int i_19_ = 0;
			if (bool)
				i_19_ |= 0x10;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, i_18_,
							method3771((byte) -44, class218) | i_19_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method2977(Class366 class366, Class98 class98, int i) {
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (i != 98)
				return false;
			bool = (Class18.method157(-72,
					(anIDirect3D9568.method3379(anInt9555, d3ddisplaymode))) && Class18
					.method157(-76, (anIDirect3D9568.CheckDeviceFormat(
							anInt9555, anInt9564, d3ddisplaymode.Format, 0, 4,
							method3778(class366, class98, i ^ ~0x12)))));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void ya() {
		try {
			method3039(true, (byte) -28);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.Clear(2, 0, 1.0F,
					0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3041(byte i) {
		try {
			if (((Class163_Sub2_Sub2) this).aClass16_7564.method151(true))
				((Class163_Sub2_Sub2) this).aClass33_Sub2_7538.method2752(
						aFloatArray9571, i ^ ~0x29);
			else {
				aFloatArray9571[3] = 0.0F;
				aFloatArray9571[11] = 0.0F;
				aFloatArray9571[13] = 0.0F;
				aFloatArray9571[9] = 0.0F;
				aFloatArray9571[12] = 0.0F;
				aFloatArray9571[4] = 0.0F;
				aFloatArray9571[6] = 0.0F;
				aFloatArray9571[10] = 1.0F;
				aFloatArray9571[2] = 0.0F;
				aFloatArray9571[8] = 0.0F;
				aFloatArray9571[0] = 1.0F;
				aFloatArray9571[14] = 0.0F;
				aFloatArray9571[1] = 0.0F;
				aFloatArray9571[5] = 1.0F;
				aFloatArray9571[15] = 1.0F;
				aFloatArray9571[7] = 0.0F;
			}
			if (i != 20)
				method1033(28, -102);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetTransform(2,
					aFloatArray9571);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface7 method3105(int i, int i_20_, int i_21_, Class98 class98,
			int i_22_, int i_23_, float[] fs, boolean bool) {
		Interface7 interface7;
		try {
			int i_24_ = -36 % ((i + 11) / 46);
			interface7 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface7;
	}

	final void method3059(byte i) {
		try {
			if (i > -109)
				aD3DLIGHT9563 = null;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3369(
							137,
							(((Class163_Sub2_Sub2) this).aBool7602 && !((Class163_Sub2_Sub2) this).aBool7582));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3001(byte i) {
		try {
			int i_25_ = 42 % ((i + 68) / 49);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final boolean method3009(Class366 class366, Class98 class98, byte i) {
		boolean bool;
		try {
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (i != -45)
				method3772((byte) 76, null);
			bool = (Class18.method157(-102,
					(anIDirect3D9568.method3379(anInt9555, d3ddisplaymode))) && Class18
					.method157(-74, (anIDirect3D9568.CheckDeviceFormat(
							anInt9555, anInt9564, d3ddisplaymode.Format, 0, 3,
							method3778(class366, class98, 126)))));
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final boolean method1086() {
		boolean bool;
		try {
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method3023(boolean bool) {
		try {
			float f = (((Class163_Sub2_Sub2) this).aBool7640 ? ((Class163_Sub2_Sub2) this).aFloat7589
					: 0.0F);
			float f_26_ = (((Class163_Sub2_Sub2) this).aBool7640 ? -((Class163_Sub2_Sub2) this).aFloat7588
					: 0.0F);
			aD3DLIGHT9554.SetDiffuse(
					f * ((Class163_Sub2_Sub2) this).aFloat7626, f
							* ((Class163_Sub2_Sub2) this).aFloat7613,
					((Class163_Sub2_Sub2) this).aFloat7633 * f, 0.0F);
			aD3DLIGHT9563.SetDiffuse(f_26_
					* ((Class163_Sub2_Sub2) this).aFloat7626,
					((Class163_Sub2_Sub2) this).aFloat7613 * f_26_, f_26_
							* ((Class163_Sub2_Sub2) this).aFloat7633, 0.0F);
			aBool9570 = bool;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3082(int i) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetScissorRect(
							(((Class163_Sub2_Sub2) this).anInt7573 + ((Class163_Sub2_Sub2) this).anInt7614),
							(((Class163_Sub2_Sub2) this).anInt7610 + ((Class163_Sub2_Sub2) this).anInt7543),
							((Class163_Sub2_Sub2) this).anInt7631,
							((Class163_Sub2_Sub2) this).anInt7554);
			if (i != 0)
				aClass157_9581 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2976(boolean bool) {
		try {
			if (bool != true)
				((Class163_Sub2_Sub2) this).aBool9569 = true;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3369(7,
					((Class163_Sub2_Sub2) this).aBool7605);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2985(int i) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3369(
							14,
							(((Class163_Sub2_Sub2) this).aBool7575 && ((Class163_Sub2_Sub2) this).aBool7547));
			if (i > -81)
				method2986(113, 93, 86, 81, 117, null, false);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3046(int i) {
		try {
			if (i <= -30)
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3369(
						15, ((Class163_Sub2_Sub2) this).aBool7638);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3089(boolean bool, Class218 class218, int i,
			boolean bool_27_, boolean bool_28_) {
		try {
			int i_29_ = i;
			int i_30_;
			while_90_: do {
				do {
					if ((i_29_ ^ 0xffffffff) != -2) {
						if (-3 != (i_29_ ^ 0xffffffff))
							break;
					} else {
						i_30_ = 3;
						break while_90_;
					}
					i_30_ = 26;
					break while_90_;
				} while (false);
				i_30_ = 2;
			} while (false);
			int i_31_ = 0;
			if (bool_28_)
				((Class163_Sub2_Sub2) this).aBool9569 = true;
			if (bool_27_)
				i_31_ |= 0x20;
			if (bool)
				i_31_ |= 0x10;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, i_30_,
							method3771((byte) -44, class218) | i_31_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class2 method3038(byte i, int i_32_) {
		Class2 class2;
		try {
			int i_33_ = 53 % ((-37 - i) / 54);
			int i_34_ = i_32_;
			while_91_: do {
				do {
					if ((i_34_ ^ 0xffffffff) != -4) {
						if ((i_34_ ^ 0xffffffff) != -5) {
							if ((i_34_ ^ 0xffffffff) == -9)
								break;
							break while_91_;
						}
					} else
						return new Class2_Sub11(this,
								(((Class163_Sub2_Sub2) this).aClass146_7513));
					return new Class2_Sub4(this,
							(((Class163_Sub2_Sub2) this).aClass146_7513),
							(((Class163_Sub2_Sub2) this).aClass177_7408));
				} while (false);
				return new Class2_Sub2(this,
						(((Class163_Sub2_Sub2) this).aClass146_7513),
						(((Class163_Sub2_Sub2) this).aClass177_7408));
			} while (false);
			class2 = super.method3038((byte) -103, i_32_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class2;
	}

	final void method1078() {
		try {
			IDirect3DEventQuery idirect3deventquery = ((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3360();
			if (Class18.method157(-71, idirect3deventquery.Issue())) {
				for (;;) {
					int i = idirect3deventquery.IsSignaled();
					if ((i ^ 0xffffffff) != -2)
						break;
					Thread.yield();
				}
			}
			idirect3deventquery.method3243(7516);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void b(int i, int i_35_, int i_36_, int i_37_, double d) {
		/* empty */
	}

	final void method1006() {
		/* empty */
	}

	final void method3772(byte i, Class269_Sub1 class269_sub1) {
		try {
			int i_38_ = 68 / ((i + 36) / 60);
			method3779(7, class269_sub1);
			if (!aBoolArray9575[((Class163_Sub2_Sub2) this).anInt7570]) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(((Class163_Sub2_Sub2) this).anInt7570,
								1, 1);
				aBoolArray9575[((Class163_Sub2_Sub2) this).anInt7570] = true;
			}
			if (!aBoolArray9580[((Class163_Sub2_Sub2) this).anInt7570]) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(((Class163_Sub2_Sub2) this).anInt7570,
								2, 1);
				aBoolArray9580[((Class163_Sub2_Sub2) this).anInt7570] = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3088(byte i) {
		try {
			if (i >= -56)
				method2976(true);
			int i_39_;
			for (i_39_ = 0; ((((Class163_Sub2_Sub2) this).anInt7598 ^ 0xffffffff) < (i_39_ ^ 0xffffffff)); i_39_++) {
				Class11_Sub46 class11_sub46 = (((Class163_Sub2_Sub2) this).aClass11_Sub46Array7546[i_39_]);
				int i_40_ = i_39_ + 2;
				int i_41_ = class11_sub46.method3209((byte) 101);
				float f = class11_sub46.method3211(-18277) / 255.0F;
				aD3DLIGHT9576.SetPosition(
						(float) class11_sub46.method3203(false),
						(float) class11_sub46.method3205(-47),
						(float) class11_sub46.method3204(true));
				aD3DLIGHT9576.SetDiffuse(
						((float) ((i_41_ & 0xfff10e) >> 16) * f),
						(float) ((i_41_ & 0xffe6) >> 8) * f, f
								* (float) (0xff & i_41_), 0.0F);
				aD3DLIGHT9576
						.SetAttenuation(
								0.0F,
								0.0F,
								1.0F / (float) (class11_sub46.method3208(-1) * class11_sub46
										.method3208(-1)));
				aD3DLIGHT9576.SetRange((float) class11_sub46.method3208(-1));
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetLight(
						i_40_, aD3DLIGHT9576);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						i_40_, true);
			}
			for (/**/; ((Class163_Sub2_Sub2) this).anInt7609 > i_39_; i_39_++)
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						2 + i_39_, false);
			super.method3088((byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	private static final int method3773(int i, Class183 class183) {
		try {
			if (i != 2)
				anIntArray9567 = null;
			if (Class91_Sub2.aClass183_7700 != class183) {
				if (Class72_Sub3.aClass183_7316 != class183) {
					if (Class350.aClass183_4614 == class183)
						return 1;
					if (class183 != Class346.aClass183_4590) {
						if (class183 != Class7.aClass183_48) {
							if (class183 == Class220_Sub1.aClass183_7150)
								return 5;
						} else
							return 6;
					} else
						return 4;
				} else
					return 3;
			} else
				return 2;
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface26 method1071(int i, int i_42_) {
		Interface26 interface26;
		try {
			interface26 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface26;
	}

	final void method3054(byte i) {
		try {
			int i_43_ = (aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570] ? method3769(
					(((Class163_Sub2_Sub2) this).aClass314Array7572[((Class163_Sub2_Sub2) this).anInt7570]),
					12225)
					: 1);
			int i_44_ = -76 / ((i - 4) / 56);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, 4, i_43_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1053(boolean bool) {
		/* empty */
	}

	final void method3080(int i) {
		try {
			aD3DLIGHT9554.SetDirection(
					-((Class163_Sub2_Sub2) this).aFloatArray7578[0],
					-((Class163_Sub2_Sub2) this).aFloatArray7578[i],
					-((Class163_Sub2_Sub2) this).aFloatArray7578[2]);
			aD3DLIGHT9563.SetDirection(
					-((Class163_Sub2_Sub2) this).aFloatArray7555[0],
					-((Class163_Sub2_Sub2) this).aFloatArray7555[1],
					-((Class163_Sub2_Sub2) this).aFloatArray7555[2]);
			aBool9570 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class234 method1057(Class234 class234, Class234 class234_45_,
			float f, Class234 class234_46_) {
		Class234 class234_47_;
		try {
			class234_47_ = 0.5F > f ? class234 : class234_45_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class234_47_;
	}

	private static final boolean method3774(int i, IDirect3D idirect3d,
			int i_48_, D3DPRESENT_PARAMETERS d3dpresent_parameters, int i_49_,
			int i_50_) {
		boolean bool;
		do {
			try {
				int i_51_ = 0;
				int i_52_ = 0;
				int i_53_ = 0;
				boolean bool_54_;
				try {
					D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
					if (Class18.method158(
							idirect3d.method3379(i_50_, d3ddisplaymode), 0))
						return false;
					while_92_: for (/**/; (i ^ 0xffffffff) <= -1; i--) {
						if ((i ^ 0xffffffff) != -2) {
							i_53_ = i + 0;
							for (int i_55_ = 0; i_55_ < anIntArray9558.length; i_55_++) {
								if (0 == (idirect3d.CheckDeviceType(i_50_,
										i_49_, d3ddisplaymode.Format,
										anIntArray9558[i_55_], true))
										&& ((idirect3d.CheckDeviceFormat(i_50_,
												i_49_, d3ddisplaymode.Format,
												1, 1, anIntArray9558[i_55_])) ^ 0xffffffff) == -1
										&& ((i ^ 0xffffffff) == -1 || (-1 == ((idirect3d
												.CheckDeviceMultiSampleType(
														i_50_, i_49_,
														anIntArray9558[i_55_],
														true, i_53_)) ^ 0xffffffff)))) {
									for (int i_56_ = 0; i_56_ < anIntArray9567.length; i_56_++) {
										if (((idirect3d.CheckDeviceFormat(
												i_50_, i_49_,
												d3ddisplaymode.Format, 2, 1,
												anIntArray9567[i_56_])) ^ 0xffffffff) == -1
												&& (-1 == ((idirect3d
														.CheckDepthStencilMatch(
																i_50_,
																i_49_,
																d3ddisplaymode.Format,
																anIntArray9558[i_55_],
																anIntArray9567[i_56_])) ^ 0xffffffff))
												&& (-1 == (i ^ 0xffffffff) || ((idirect3d
														.CheckDeviceMultiSampleType(
																i_50_,
																i_49_,
																anIntArray9567[i_55_],
																true, i_53_)) ^ 0xffffffff) == -1)) {
											i_52_ = anIntArray9558[i_55_];
											i_51_ = anIntArray9567[i_56_];
											break while_92_;
										}
									}
								}
							}
						}
					}
					if (i < 0 || 0 == i_52_ || -1 == (i_51_ ^ 0xffffffff))
						return false;
					d3dpresent_parameters.AutoDepthStencilFormat = i_51_;
					d3dpresent_parameters.MultiSampleQuality = i_48_;
					d3dpresent_parameters.MultiSampleType = i_53_;
					d3dpresent_parameters.BackBufferFormat = i_52_;
					bool_54_ = true;
				} catch (Throwable throwable) {
					bool = false;
					break;
				}
				return bool_54_;
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
		} while (false);
		return bool;
	}

	private Class163_Sub2_Sub2(int i, int i_57_, Canvas canvas,
			Class185 class185, IDirect3D idirect3d,
			IDirect3DDevice idirect3ddevice, Class157 class157,
			D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps,
			Interface1 interface1, Class146 class146, int i_58_) {
		super(canvas, class157, interface1, class146, i_58_, 0);
		aBool9570 = false;
		try {
			try {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578 = idirect3ddevice;
				anInt9564 = i_57_;
				((Class163_Sub2_Sub2) this).aD3DCAPS9574 = d3dcaps;
				aClass157_9581 = class157;
				anInt9555 = i;
				((Class163_Sub2_Sub2) this).aClass185_9577 = class185;
				aD3DPRESENT_PARAMETERS9556 = d3dpresent_parameters;
				anIDirect3D9568 = idirect3d;
				aD3DLIGHT9554 = new D3DLIGHT(
						((Class163_Sub2_Sub2) this).aClass185_9577);
				aD3DLIGHT9563 = new D3DLIGHT(
						((Class163_Sub2_Sub2) this).aClass185_9577);
				aD3DLIGHT9576 = new D3DLIGHT(
						((Class163_Sub2_Sub2) this).aClass185_9577);
				((Class163_Sub2_Sub2) this).aPixelBuffer9560 = new PixelBuffer(
						((Class163_Sub2_Sub2) this).aClass185_9577);
				((Class163_Sub2_Sub2) this).aGeometryBuffer9562 = new GeometryBuffer(
						((Class163_Sub2_Sub2) this).aClass185_9577);
				new GeometryBuffer(((Class163_Sub2_Sub2) this).aClass185_9577);
				((Class163_Sub2_Sub2) this).aBool9561 = (((Class163_Sub2_Sub2) this).aD3DCAPS9574.TextureCaps & 0x10000) != 0;
				((Class163_Sub2_Sub2) this).anInt7551 = (((Class163_Sub2_Sub2) this).aD3DCAPS9574.MaxSimultaneousTextures);
				((Class163_Sub2_Sub2) this).aBool7549 = ((((Class163_Sub2_Sub2) this).aD3DCAPS9574.TextureCaps & 0x800) ^ 0xffffffff) != -1;
				((Class163_Sub2_Sub2) this).aBool7612 = 0 != (0x2000 & (((Class163_Sub2_Sub2) this).aD3DCAPS9574.TextureCaps));
				((Class163_Sub2_Sub2) this).aBool9569 = ((0x4000 & ((Class163_Sub2_Sub2) this).aD3DCAPS9574.TextureCaps) ^ 0xffffffff) != -1;
				((Class163_Sub2_Sub2) this).aBool9559 = 0 == (0x2 & (((Class163_Sub2_Sub2) this).aD3DCAPS9574.TextureCaps));
				((Class163_Sub2_Sub2) this).anInt7617 = ((((Class163_Sub2_Sub2) this).aD3DCAPS9574.MaxActiveLights) <= 0 ? 8
						: (((Class163_Sub2_Sub2) this).aD3DCAPS9574.MaxActiveLights));
				((Class163_Sub2_Sub2) this).aBool7623 = (((Class163_Sub2_Sub2) this).anInt7583 > 0 || 0 == (anIDirect3D9568
						.CheckDeviceMultiSampleType(anInt9555, anInt9564,
								aD3DPRESENT_PARAMETERS9556.BackBufferFormat,
								true, 2)));
				anIntArray9557 = new int[((Class163_Sub2_Sub2) this).anInt7551];
				aBoolArray9575 = new boolean[((Class163_Sub2_Sub2) this).anInt7551];
				aClass34Array9572 = new Class34[((Class163_Sub2_Sub2) this).anInt7551];
				aBoolArray9579 = new boolean[((Class163_Sub2_Sub2) this).anInt7551];
				aBoolArray9580 = new boolean[((Class163_Sub2_Sub2) this).anInt7551];
				aBoolArray9566 = new boolean[((Class163_Sub2_Sub2) this).anInt7551];
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.BeginScene();
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				method1072(1);
				throw new RuntimeException("");
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface7 method2986(int i, int i_59_, int i_60_, int i_61_,
			int i_62_, int[] is, boolean bool) {
		Class269_Sub2 class269_sub2;
		try {
			int i_63_ = 73 / ((i_59_ - 50) / 55);
			class269_sub2 = new Class269_Sub2(this, i_60_, i_61_, bool, is,
					i_62_, i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class269_sub2;
	}

	final float method2987(int i) {
		float f;
		try {
			int i_64_ = 125 % ((i + 8) / 54);
			f = -0.5F;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return f;
	}

	final void method2996(int i, int i_65_, Interface3 interface3) {
		try {
			if (i_65_ == 1) {
				Class90 class90 = (Class90) interface3;
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetStreamSource(
								i,
								((Class90) class90).anIDirect3DVertexBuffer1229,
								0, class90.method622(i_65_ - 1612));
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3021(byte i) {
		try {
			for (int i_66_ = 0; ((Class163_Sub2_Sub2) this).anInt7551 > i_66_; i_66_++) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(i_66_, 7, 0);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(i_66_, 6, 2);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(i_66_, 5, 2);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(i_66_, 1, 1);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(i_66_, 2, 1);
				aClass34Array9572[i_66_] = Class301.aClass34_4059;
				aBoolArray9575[i_66_] = aBoolArray9580[i_66_] = true;
				aBoolArray9566[i_66_] = false;
				anIntArray9557[i_66_] = 0;
			}
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(0, 6, 1);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(9,
					2);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					23, 4);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					25, 5);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					24, 0);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					22, 2);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					147, 1);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					145, 1);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3370(38,
					0.95F);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					140, 3);
			aD3DLIGHT9554.SetType(3);
			aD3DLIGHT9563.SetType(3);
			aD3DLIGHT9576.SetType(1);
			aBool9570 = false;
			super.method3021(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3102(byte i) {
		try {
			if (i != -57)
				method3042((byte) -20, true);
			aD3DLIGHT9554
					.SetAmbient(
							(((Class163_Sub2_Sub2) this).aFloat7606 * ((Class163_Sub2_Sub2) this).aFloat7626),
							(((Class163_Sub2_Sub2) this).aFloat7606 * ((Class163_Sub2_Sub2) this).aFloat7613),
							(((Class163_Sub2_Sub2) this).aFloat7633 * ((Class163_Sub2_Sub2) this).aFloat7606),
							0.0F);
			aBool9570 = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface8 method1033(int i, int i_67_) {
		Interface8 interface8;
		try {
			interface8 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface8;
	}

	final Interface10 method1066(Interface8 interface8, Interface26 interface26) {
		Interface10 interface10;
		try {
			interface10 = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return interface10;
	}

	private static final int method3775(byte i, Class34 class34) {
		try {
			if (Class301.aClass34_4059 != class34) {
				if (Class271.aClass34_3655 == class34)
					return 1;
			} else
				return 2;
			if (i != -2)
				method3777(null, 67);
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3058(byte i) {
		try {
			method3023(false);
			if (i != 55)
				aBoolArray9580 = null;
			method2983(i + 7);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1031() {
		/* empty */
	}

	final Object method3000(Canvas canvas, byte i) {
		Object object;
		try {
			int i_68_ = 85 % ((24 - i) / 54);
			object = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return object;
	}

	final Class219 method3018(Class315[] class315s, byte i) {
		dxVertexLayout var_dxVertexLayout;
		try {
			int i_69_ = -102 / ((20 - i) / 36);
			var_dxVertexLayout = new dxVertexLayout(this, class315s);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return var_dxVertexLayout;
	}

	final void method3042(byte i, boolean bool) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3369(161,
					bool);
			if (i != 115)
				method1006();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3051(int i, Canvas canvas, Object object) {
		try {
			if (i != 0)
				method3774(16, null, -34, null, 46, -43);
			aClass157_9581 = (Class157) object;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface17 method3028(int i, byte i_70_, int i_71_, Class98 class98,
			int i_72_, byte[] is) {
		Class269_Sub1 class269_sub1;
		try {
			if (i_70_ >= -56)
				aClass34Array9572 = null;
			class269_sub1 = new Class269_Sub1(this, class98, i, i_72_, i_71_,
					is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class269_sub1;
	}

	final synchronized void method1021(int i) {
		try {
			((Class163_Sub2_Sub2) this).aClass185_9577.method1206(false);
			super.method1021(i);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1083(int i, int i_73_, int i_74_, int i_75_) {
		/* empty */
	}

	final void method2992(int i) {
		try {
			((Class163_Sub2_Sub2) this).aFloat7632 = (float) (((Class163_Sub2_Sub2) this).anInt7569 + -((Class163_Sub2_Sub2) this).anInt7628);
			((Class163_Sub2_Sub2) this).aFloat7607 = ((float) -((Class163_Sub2_Sub2) this).anInt7600 + ((Class163_Sub2_Sub2) this).aFloat7632);
			if (((Class163_Sub2_Sub2) this).aFloat7607 < (float) ((Class163_Sub2_Sub2) this).anInt7571)
				((Class163_Sub2_Sub2) this).aFloat7607 = (float) ((Class163_Sub2_Sub2) this).anInt7571;
			if (i != 5)
				aClass157_9581 = null;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3370(36,
					((Class163_Sub2_Sub2) this).aFloat7607);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3370(37,
					((Class163_Sub2_Sub2) this).aFloat7632);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetRenderState(
					34, ((Class163_Sub2_Sub2) this).anInt7636);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void F(int i, int i_76_) {
		/* empty */
	}

	final void method3776(byte i, IDirect3DVertexShader idirect3dvertexshader) {
		try {
			anIDirect3DVertexShader9565 = idirect3dvertexshader;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetVertexShader(idirect3dvertexshader);
			method3027(13225);
			if (i <= 62)
				method1076(null);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3040(int i) {
		try {
			if (i == -5617)
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetRenderState(60,
								((Class163_Sub2_Sub2) this).anInt7556);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface7 method2981(int i, int i_77_, Class98 class98, int i_78_,
			Class366 class366) {
		Class269_Sub2 class269_sub2;
		try {
			if (i_78_ != -20634)
				anInt9564 = -75;
			class269_sub2 = new Class269_Sub2(this, class98, class366, i, i_77_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class269_sub2;
	}

	final void GA(int i) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.Clear(1, i, 0.0F,
					0);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Class100 method1055() {
		Class100 class100;
		try {
			D3DADAPTER_IDENTIFIER d3dadapter_identifier = anIDirect3D9568
					.method3382(anInt9555, 0);
			class100 = new Class100(d3dadapter_identifier.VendorID, "Direct3D",
					9, d3dadapter_identifier.Description,
					d3dadapter_identifier.DriverVersion);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class100;
	}

	final void method3034(int i) {
		try {
			if (i != 13)
				anIDirect3DVertexShader9565 = null;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetViewport(
					((Class163_Sub2_Sub2) this).anInt7573,
					((Class163_Sub2_Sub2) this).anInt7610,
					((Class163_Sub2_Sub2) this).anInt7393,
					((Class163_Sub2_Sub2) this).anInt7421, 0.0F, 1.0F);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3063(int i, int i_79_, Class183 class183, int i_80_,
			int i_81_, Interface27 interface27, int i_82_) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetIndices(((Class202) (Class202) interface27).anIDirect3DIndexBuffer2715);
			if (i_80_ != -17390)
				method2987(36);
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.DrawIndexedPrimitive(method3773(2, class183), 0, i_81_, i,
							i_82_, i_79_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1004(Rectangle[] rectangles, int i, int i_83_, int i_84_)
			throws Exception_Sub1 {
		try {
			method1044(i_83_, i_84_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final int I() {
		int i;
		try {
			i = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i;
	}

	private static final int method3777(Class240 class240, int i) {
		int i_85_;
		try {
			int i_86_ = -53 % ((75 - i) / 46);
			if (class240 == Class228.aClass240_3142)
				return 1;
			if (Class11_Sub2_Sub2.aClass240_8463 != class240) {
				if (Class39.aClass240_554 != class240) {
					if (class240 != Class106.aClass240_1431) {
						if (class240 == Class205.aClass240_2760)
							return 256;
					} else
						return 4;
				} else
					return 3;
			} else
				return 2;
			i_85_ = 0;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_85_;
	}

	final void method2983(int i) {
		try {
			int i_87_ = 84 / ((i + 18) / 43);
			if (!aBool9570) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						0, false);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						1, false);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetLight(0,
						aD3DLIGHT9554);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetLight(1,
						aD3DLIGHT9563);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						0, true);
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.LightEnable(
						1, true);
				aBool9570 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method2990(Class174 class174, int i) {
		try {
			if (i != -1)
				method3072(-91);
			int i_88_ = 0;
			if (Class11_Sub2_Sub24.aClass174_9281 != class174) {
				if (class174 != InputStream_Sub2.aClass174_6943) {
					if (Class63.aClass174_921 == class174)
						i_88_ = 196608;
				} else
					i_88_ = 131072;
			} else
				i_88_ = 65536;
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.SetTextureStageState(
							((Class163_Sub2_Sub2) this).anInt7570, 11, i_88_
									| ((Class163_Sub2_Sub2) this).anInt7570);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3012(Class219 class219, int i) {
		try {
			if (i == 16) {
				dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class219;
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetVertexDeclaration(((dxVertexLayout) var_dxVertexLayout).anIDirect3DVertexDeclaration5334);
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3030(int i) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.method3369(
							28,
							(((Class163_Sub2_Sub2) this).aBool7590
									&& ((Class163_Sub2_Sub2) this).aBool7558 && ((((Class163_Sub2_Sub2) this).anInt7600 ^ 0xffffffff) <= -1)));
			if (i <= 56)
				method3042((byte) -32, true);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3008(int i, int i_89_, int i_90_, Class183 class183) {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.DrawPrimitive(
					method3773(2, class183), i_89_, i);
			int i_91_ = 1 % ((41 - i_90_) / 60);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final int method3778(Class366 class366, Class98 class98, int i) {
		try {
			if (Class366.aClass366_4808 == class366) {
				if (Class11_Sub2_Sub23.aClass98_9267 != class98) {
					if (class98 != Class364.aClass98_4774) {
						if (Class128.aClass98_1726 != class98) {
							if (class98 == Class329.aClass98_4372)
								return 50;
							if (Class376_Sub6.aClass98_6952 != class98) {
								if (class98 == Class11_Sub50.aClass98_8021)
									return 77;
							} else
								return 51;
						} else
							return 28;
					} else
						return 21;
				} else
					return 22;
			}
			int i_92_ = -35 % ((-14 - i) / 49);
			throw new IllegalArgumentException("");
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method1070() {
		/* empty */
	}

	final Interface12 method3060(int i, int[][] is, byte i_93_, boolean bool) {
		Class269_Sub3 class269_sub3;
		try {
			int i_94_ = 13 % ((-34 - i_93_) / 38);
			class269_sub3 = new Class269_Sub3(this, i, bool, is);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class269_sub3;
	}

	final void method3779(int i, Class269 class269) {
		try {
			if (i == 7) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.SetTexture(
						((Class163_Sub2_Sub2) this).anInt7570,
						class269.method1693(-4406));
				if (aClass34Array9572[((Class163_Sub2_Sub2) this).anInt7570] == ((Class269) class269).aClass34_3645) {
					if (!aBoolArray9566[((Class163_Sub2_Sub2) this).anInt7570] != !((Class269) class269).aBool3644) {
						((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
								.SetSamplerState(
										((Class163_Sub2_Sub2) this).anInt7570,
										7,
										(((Class269) class269).aBool3644 ? method3775(
												(byte) -2,
												((Class269) class269).aClass34_3645)
												: 0));
						aBoolArray9566[((Class163_Sub2_Sub2) this).anInt7570] = ((Class269) class269).aBool3644;
					}
				} else {
					int i_95_ = method3775((byte) -2,
							((Class269) class269).aClass34_3645);
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetSamplerState(
									((Class163_Sub2_Sub2) this).anInt7570, 6,
									i_95_);
					((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.SetSamplerState(
									((Class163_Sub2_Sub2) this).anInt7570, 5,
									i_95_);
					aClass34Array9572[((Class163_Sub2_Sub2) this).anInt7570] = ((Class269) class269).aClass34_3645;
					if (!((Class269) class269).aBool3644 == (aBoolArray9566[((Class163_Sub2_Sub2) this).anInt7570])) {
						((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
								.SetSamplerState(
										((Class163_Sub2_Sub2) this).anInt7570,
										7,
										(!((Class269) class269).aBool3644 ? 0
												: method3775(
														(byte) -2,
														(((Class269) class269).aClass34_3645))));
						aBoolArray9566[((Class163_Sub2_Sub2) this).anInt7570] = ((Class269) class269).aBool3644;
					}
				}
				if (!aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570]) {
					aBoolArray9579[((Class163_Sub2_Sub2) this).anInt7570] = true;
					method3054((byte) 95);
					method3044(i + 26769);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface27 method3016(byte i, boolean bool) {
		Class202 class202;
		try {
			if (i <= 20)
				return null;
			class202 = new Class202(this, Class366.aClass366_4809, bool);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class202;
	}

	private final boolean method3780(int i) {
		boolean bool;
		try {
			int i_96_ = ((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
					.TestCooperativeLevel();
			if (i <= 102)
				method3059((byte) -53);
			if (0 == i_96_ || 2005530518 == (i_96_ ^ 0xffffffff)) {
				Class157 class157 = (Class157) ((Class163_Sub2_Sub2) this).anObject7348;
				method3101((byte) -27);
				class157.method982(-59);
				aD3DPRESENT_PARAMETERS9556.BackBufferHeight = 0;
				aD3DPRESENT_PARAMETERS9556.BackBufferWidth = 0;
				if (method3774(((Class163_Sub2_Sub2) this).anInt7583,
						anIDirect3D9568, 0, aD3DPRESENT_PARAMETERS9556,
						anInt9564, anInt9555)) {
					int i_97_ = ((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
							.Reset(aD3DPRESENT_PARAMETERS9556);
					if (Class18.method157(-116, i_97_)) {
						class157.method983(
								((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
										.method3362(),
								((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
										.method3361(0), 0);
						method3066(0);
						method3021((byte) 39);
						return true;
					}
				}
			}
			bool = false;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return bool;
	}

	final void method3071(boolean bool) {
		try {
			if (bool == true)
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.method3369(
						27, ((Class163_Sub2_Sub2) this).aBool7559);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final void method3781(int i, Class269_Sub2 class269_sub2) {
		try {
			method3779(7, class269_sub2);
			if (!((Class269_Sub2) class269_sub2).aBool6205 == aBoolArray9575[((Class163_Sub2_Sub2) this).anInt7570]) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(((Class163_Sub2_Sub2) this).anInt7570,
								1,
								!((Class269_Sub2) class269_sub2).aBool6205 ? 3
										: 1);
				aBoolArray9575[((Class163_Sub2_Sub2) this).anInt7570] = ((Class269_Sub2) class269_sub2).aBool6205;
			}
			if (i != -21100)
				method1055();
			if (!((Class269_Sub2) class269_sub2).aBool6203 == aBoolArray9580[((Class163_Sub2_Sub2) this).anInt7570]) {
				((Class163_Sub2_Sub2) this).anIDirect3DDevice9578
						.SetSamplerState(((Class163_Sub2_Sub2) this).anInt7570,
								2,
								((Class269_Sub2) class269_sub2).aBool6203 ? 1
										: 3);
				aBoolArray9580[((Class163_Sub2_Sub2) this).anInt7570] = ((Class269_Sub2) class269_sub2).aBool6203;
			}
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	final Interface7 method3045(int i, int i_98_, int i_99_, byte[] is,
			boolean bool, Class98 class98, byte i_100_, int i_101_) {
		Class269_Sub2 class269_sub2;
		try {
			if (i_100_ != -77)
				aD3DLIGHT9576 = null;
			class269_sub2 = new Class269_Sub2(this, class98, i, i_99_, bool,
					is, i_98_, i_101_);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return class269_sub2;
	}

	final void method1044(int i, int i_102_) throws Exception_Sub1 {
		try {
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.EndScene();
			if (aClass157_9581.method985(false)) {
				anInt9573 = 0;
				if (Class18.method158(aClass157_9581.method984(0, true), 0))
					method3780(111);
			} else {
				if ((++anInt9573 ^ 0xffffffff) < -51)
					throw new Exception_Sub1();
				method3780(105);
			}
			((Class163_Sub2_Sub2) this).anIDirect3DDevice9578.BeginScene();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static {
		anIntArray9558 = new int[] { 22, 23 };
	}
}
