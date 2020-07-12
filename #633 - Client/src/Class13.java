/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class13 implements Runnable {
	private volatile boolean aBool106;
	private int[] anIntArray107 = new int[3];
	private Class322 aClass322_108;
	private Class11_Sub46[] aClass11_Sub46Array109 = new Class11_Sub46[8];
	private volatile boolean aBool110;
	private volatile boolean aBool111 = true;
	private long aLong112;
	private Class163 aClass163_113;
	private int anInt114;

	final void method138() {
		aBool111 = true;
		synchronized (this) {
			this.notify();
		}
	}

	final void method139() {
		aBool111 = false;
		aBool106 = false;
		synchronized (this) {
			this.notify();
		}
	}

	private final void method140() {
		aClass163_113.method1050(anInt114);
		while (!aBool111 && aBool106) {
			if (aClass322_108 != null && !aClass322_108.method1969(121)) {
				aBool110 = true;
				Class376 class376 = aClass322_108.method1965(true);
				if (class376 instanceof Class376_Sub7) {
					Class376_Sub7 class376_sub7 = (Class376_Sub7) class376;
					if (((Class376_Sub7) class376_sub7).aBool7043)
						class376_sub7.method2874((byte) -74,
								Class87.aClass163_1210);
					else {
						Class321.method1958(class376_sub7,
								aClass11_Sub46Array109);
						if (Class91_Sub2.aClass107_7701 != null)
							Class91_Sub2.aClass107_7701.method708(
									((Class376_Sub7) class376_sub7).anInt7034,
									173, -256,
									((Class376_Sub7) class376_sub7).anInt7048,
									((Class322) aClass322_108).aString4305,
									-16777216);
					}
				} else {
					int i = ((Class376_Sub6) (Class376_Sub6) class376).anInt6953;
					if (i >= 1 && i <= 4) {
						Class12 class12 = Class315.aClass12Array4179[i - 1];
						for (int i_0_ = 0; i_0_ < (Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730); i_0_++) {
							for (int i_1_ = 0; i_1_ < (Class94_Sub4.anInt7730 + Class94_Sub4.anInt7730); i_1_++) {
								if (Class11_Sub2_Sub25.aBoolArrayArrayArray9331[i - 1][i_0_][i_1_]) {
									int i_2_ = (Class11_Sub45_Sub7.anInt8807
											- Class94_Sub4.anInt7730 + i_0_);
									int i_3_ = (Class15.anInt134
											- Class94_Sub4.anInt7730 + i_1_);
									if (i_2_ >= 0
											&& i_2_ < ((Class12) class12).anInt103
											&& i_3_ >= 0
											&& (i_3_ < ((Class12) class12).anInt98)) {
										Class87.aClass163_1210
												.H((i_2_ << Class11_Sub2_Sub8.anInt8751),
														class12.method131(
																(byte) -85,
																i_3_, i_2_),
														(i_3_ << Class11_Sub2_Sub8.anInt8751),
														anIntArray107);
										if (Class98.method662(anIntArray107[0]) == anInt114 - 1)
											class12.method127(i_2_, i_3_);
									}
								}
							}
						}
					}
				}
			} else {
				aBool110 = false;
				aLong112 = InputStream_Sub2.aClass324_6947.method1976(false);
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		}
		aClass163_113.method1034(anInt114);
		while (aBool111 && aBool106) {
			synchronized (this) {
				try {
					this.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public final void run() {
		while (aBool106)
			method140();
	}

	final long method141() {
		return aLong112;
	}

	final void method142(Class322 class322) {
		if (aClass322_108 != null)
			aClass322_108.method1970(null, false);
		aClass322_108 = class322;
		if (aClass322_108 != null)
			aClass322_108.method1970(this, false);
	}

	final boolean method143() {
		if (aClass322_108 != null
				&& (aBool110 || !aClass322_108.method1969(126)))
			return false;
		return true;
	}

	final void method144() {
		aBool111 = false;
		synchronized (this) {
			this.notify();
		}
	}

	Class13(int i, Class163 class163) {
		aBool106 = true;
		aBool110 = false;
		anInt114 = i;
		aClass163_113 = class163;
	}
}
