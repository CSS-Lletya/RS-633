/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class Class190 implements Runnable {
	private volatile boolean aBool2437;
	private Class368 aClass368_2438;
	static int anInt2439;
	static int anInt2440;
	static Class83 aClass83_2441 = new Class83(5, 4);
	private Thread aThread2442;
	static int anInt2443;
	static int anInt2444;
	private Class70[] aClass70Array2445;
	static int anInt2446 = 0;
	static Color[] aColorArray2447 = { new Color(9179409), new Color(16777215),
			new Color(16726277), new Color(16726277) };
	static int anInt2448;

	public static void method1233(boolean bool) {
		try {
			if (bool != false)
				method1233(false);
			aColorArray2447 = null;
			aClass83_2441 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iu.D(" + bool + ')');
		}
	}

	final boolean method1234(int i) {
		try {
			if (i >= -41)
				aColorArray2447 = null;
			anInt2440++;
			if (aBool2437)
				return true;
			if (aClass368_2438 == null) {
				try {
					int i_0_ = ((Class11_Sub2_Sub24.aClass347_9284 == Class362.aClass347_4711) ? 80
							: (((Class46) Class181.aClass46_2337).anInt730 + 7000));
					aClass368_2438 = (Class108_Sub21.aClass341_7304
							.method2057(
									new URL(
											"http://"
													+ (((Class46) Class181.aClass46_2337).aString733)
													+ ":"
													+ i_0_
													+ "/news.ws?game="
													+ (((Class66) Class198.aClass66_2679).anInt945)),
									118));
				} catch (java.net.MalformedURLException malformedurlexception) {
					return true;
				}
			}
			if (aClass368_2438 == null
					|| (aClass368_2438.anInt4837 ^ 0xffffffff) == -3)
				return true;
			if (aClass368_2438.anInt4837 != 1)
				return false;
			if (aThread2442 == null) {
				aThread2442 = new Thread(this);
				aThread2442.start();
			}
			return aBool2437;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iu.C(" + i + ')');
		}
	}

	public final void run() {
		try {
			anInt2439++;
			try {
				BufferedReader bufferedreader = (new BufferedReader(
						new InputStreamReader(
								(DataInputStream) aClass368_2438.anObject4838)));
				String string = bufferedreader.readLine();
				Class237 class237 = Class168.method1102((byte) -51);
				for (/**/; string != null; string = bufferedreader.readLine())
					class237.method1509(string, -94);
				String[] strings = class237.method1512(1);
				if (strings.length % 3 != 0)
					return;
				aClass70Array2445 = new Class70[strings.length / 3];
				for (int i = 0; i < strings.length; i += 3)
					aClass70Array2445[i / 3] = new Class70(strings[i],
							strings[1 + i], strings[i + 2]);
			} catch (java.io.IOException ioexception) {
				/* empty */
			}
			aBool2437 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iu.run(" + ')');
		}
	}

	public Class190() {
		/* empty */
	}

	final Class70 method1235(byte i, int i_1_) {
		try {
			int i_2_ = -81 % ((i + 13) / 45);
			anInt2448++;
			if (aClass70Array2445 == null
					|| (i_1_ ^ 0xffffffff) > -1
					|| (aClass70Array2445.length ^ 0xffffffff) >= (i_1_ ^ 0xffffffff))
				return null;
			return aClass70Array2445[i_1_];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iu.B(" + i + ','
					+ i_1_ + ')');
		}
	}

	static final boolean method1236(int i, int i_3_, int i_4_, int i_5_) {
		try {
			anInt2443++;
			Class236_Sub8.aClass33_7069.method295(i, i_4_, i_3_,
					Class303.anIntArray4086);
			int i_6_ = Class303.anIntArray4086[2];
			if (i_6_ < 50)
				return false;
			if (i_5_ != 3713)
				aColorArray2447 = null;
			Class303.anIntArray4086[2] = i_6_;
			Class303.anIntArray4086[0] = (Class303.anIntArray4086[0]
					* Class71.anInt997 / i_6_ + Class228.anInt3151);
			Class303.anIntArray4086[1] = (Class11_Sub2_Sub33.anInt9669
					* Class303.anIntArray4086[1] / i_6_)
					+ Class323.anInt4320;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iu.A(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}
}
