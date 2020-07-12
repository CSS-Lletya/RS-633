/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Canvas;

import jaclib.peer.Class185;
import jaclib.peer.IUnknown;

public class IDirect3D extends IUnknown {
	private Class185 aClass185_8523;

	public final native int CheckDepthStencilMatch(int i, int i_0_, int i_1_,
			int i_2_, int i_3_);

	private IDirect3D(Class185 class185) {
		super(class185);
		try {
			aClass185_8523 = class185;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public final IDirect3DDevice method3378(int i, int i_4_, Canvas canvas,
			int i_5_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		IDirect3DDevice idirect3ddevice;
		try {
			IDirect3DDevice idirect3ddevice_6_ = new IDirect3DDevice(
					aClass185_8523);
			int i_7_ = _CreateDevice(i, i_4_, canvas, i_5_,
					d3dpresent_parameters, idirect3ddevice_6_);
			if (Class18.method158(i_7_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_7_));
			idirect3ddevice = idirect3ddevice_6_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3ddevice;
	}

	private final native int _GetAdapterDisplayMode(int i,
			D3DDISPLAYMODE d3ddisplaymode);

	public final int method3379(int i, D3DDISPLAYMODE d3ddisplaymode) {
		int i_8_;
		try {
			i_8_ = _GetAdapterDisplayMode(i, d3ddisplaymode);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return i_8_;
	}

	private final native int _GetAdapterIdentifier(int i, int i_9_,
			D3DADAPTER_IDENTIFIER d3dadapter_identifier);

	public static final IDirect3D method3380(int i, Class185 class185) {
		IDirect3D idirect3d;
		try {
			IDirect3D idirect3d_10_ = new IDirect3D(class185);
			int i_11_ = _Direct3DCreate(i, idirect3d_10_);
			if (Class18.method158(i_11_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_11_));
			idirect3d = idirect3d_10_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return idirect3d;
	}

	public final native int CheckDeviceFormat(int i, int i_12_, int i_13_,
			int i_14_, int i_15_, int i_16_);

	private final native int _GetDeviceCaps(int i, int i_17_, D3DCAPS d3dcaps);

	private final native int _CreateDevice(int i, int i_18_, Canvas canvas,
			int i_19_, D3DPRESENT_PARAMETERS d3dpresent_parameters,
			IDirect3DDevice idirect3ddevice);

	public final D3DCAPS method3381(int i, int i_20_) {
		D3DCAPS d3dcaps;
		try {
			D3DCAPS d3dcaps_21_ = new D3DCAPS();
			int i_22_ = _GetDeviceCaps(i, i_20_, d3dcaps_21_);
			if (Class18.method158(i_22_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_22_));
			d3dcaps = d3dcaps_21_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return d3dcaps;
	}

	public final native int CheckDeviceType(int i, int i_23_, int i_24_,
			int i_25_, boolean bool);

	public final D3DADAPTER_IDENTIFIER method3382(int i, int i_26_) {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier;
		try {
			D3DADAPTER_IDENTIFIER d3dadapter_identifier_27_ = new D3DADAPTER_IDENTIFIER();
			int i_28_ = _GetAdapterIdentifier(i, i_26_,
					d3dadapter_identifier_27_);
			if (Class18.method158(i_28_, 0))
				throw new RuntimeException_Sub2(String.valueOf(i_28_));
			d3dadapter_identifier = d3dadapter_identifier_27_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return d3dadapter_identifier;
	}

	public final native int CheckDeviceMultiSampleType(int i, int i_29_,
			int i_30_, boolean bool, int i_31_);

	private static final native int _Direct3DCreate(int i, IDirect3D idirect3d);
}
