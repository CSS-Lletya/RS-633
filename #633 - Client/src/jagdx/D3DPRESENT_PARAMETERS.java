/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

import java.awt.Canvas;

public class D3DPRESENT_PARAMETERS {
	public boolean Windowed;
	public int SwapEffect;
	public int BackBufferHeight;
	public int BackBufferFormat = 0;
	public int PresentationInterval;
	public Canvas DeviceWindow;
	public int MultiSampleQuality;
	public int BackBufferWidth = 0;
	public int BackBufferCount;
	public int Flags;
	public int FullScreen_RefreshRateInHz;
	public int AutoDepthStencilFormat;
	public int MultiSampleType;
	public boolean EnableAutoDepthStencil;

	public D3DPRESENT_PARAMETERS(Canvas canvas) {
		PresentationInterval = 0;
		SwapEffect = 1;
		BackBufferHeight = 0;
		AutoDepthStencilFormat = 0;
		MultiSampleQuality = 0;
		BackBufferCount = 0;
		MultiSampleType = 0;
		try {
			DeviceWindow = canvas;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
