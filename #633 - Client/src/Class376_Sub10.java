/* Class376_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376_Sub10 extends Class376 {
	private static boolean[] aBoolArray7874;
	private static boolean[] aBoolArray7875 = new boolean[32];
	private long aLong7876;
	boolean aBool7877 = false;
	private Class131 aClass131_7878;
	Class376_Sub1_Sub1_Sub1[] aClass376_Sub1_Sub1_Sub1Array7879;
	int anInt7880 = 0;
	private long aLong7881;
	private boolean aBool7882 = false;
	Class84 aClass84_7883;
	private int anInt7884;
	private boolean aBool7885;
	int anInt7886;
	private int anInt7887;
	boolean aBool7888;
	Class116 aClass116_7889;

	final boolean method3164(Class163 class163, long l) {
		if (aLong7881 != aLong7876)
			method3171();
		else
			method3174();
		if (l - aLong7881 > 750L) {
			method3177();
			return false;
		}
		int i = (int) (l - aLong7876);
		if (aBool7885) {
			for (Class376_Sub2 class376_sub2 = (Class376_Sub2) aClass131_7878
					.method847(-31182); class376_sub2 != null; class376_sub2 = (Class376_Sub2) aClass131_7878
					.method856(68)) {
				for (int i_0_ = 0; i_0_ < ((Class129) (((Class376_Sub2) class376_sub2).aClass129_5559)).anInt1764; i_0_++)
					class376_sub2.method2420(class163, (byte) -106, !aBool7882,
							l, 1);
			}
			aBool7885 = false;
		}
		for (Class376_Sub2 class376_sub2 = (Class376_Sub2) aClass131_7878
				.method847(-31182); class376_sub2 != null; class376_sub2 = (Class376_Sub2) aClass131_7878
				.method856(77))
			class376_sub2.method2420(class163, (byte) -121, !aBool7882, l, i);
		aLong7876 = l;
		return true;
	}

	public static void method3165() {
		aBoolArray7875 = null;
		aBoolArray7874 = null;
	}

	static final Class376_Sub10 method3166(int i, boolean bool) {
		if (Class68.anInt976 != Class1.anInt6) {
			Class376_Sub10 class376_sub10 = Class226.aClass376_Sub10Array3105[Class1.anInt6];
			Class1.anInt6 = (Class1.anInt6 + 1 & Class131.anIntArray1835[Class280.anInt3787]);
			class376_sub10.method3179(i, bool);
			return class376_sub10;
		}
		return new Class376_Sub10(i, bool);
	}

	final void method3167() {
		aBool7885 = true;
	}

	final void method3168(long l) {
		aLong7881 = l;
	}

	private final void method3169(Class163 class163, Class110[] class110s,
			boolean bool) {
		for (int i = 0; i < 32; i++)
			aBoolArray7875[i] = false;
		while_31_: for (Class376_Sub2 class376_sub2 = (Class376_Sub2) aClass131_7878
				.method847(-31182); class376_sub2 != null; class376_sub2 = (Class376_Sub2) aClass131_7878
				.method856(30)) {
			if (class110s != null) {
				for (int i = 0; i < class110s.length; i++) {
					if ((((Class376_Sub2) class376_sub2).aClass110_5564 == class110s[i])
							|| (((Class376_Sub2) class376_sub2).aClass110_5564 == ((Class110) class110s[i]).aClass110_1498)) {
						aBoolArray7875[i] = true;
						class376_sub2.method2417((byte) -108);
						((Class376_Sub2) class376_sub2).aBool5566 = false;
						continue while_31_;
					}
				}
			}
			if (!bool) {
				if (((Class376_Sub2) class376_sub2).anInt5557 == 0) {
					class376_sub2.method2207((byte) -127);
					anInt7884--;
				} else
					((Class376_Sub2) class376_sub2).aBool5566 = true;
			}
		}
		if (class110s != null) {
			for (int i = 0; i < class110s.length; i++) {
				if (i == 32 || anInt7884 == 32)
					break;
				if (!aBoolArray7875[i]) {
					Class376_Sub2 class376_sub2 = new Class376_Sub2(class163,
							class110s[i], this, aLong7881);
					aClass131_7878.method853(0, class376_sub2);
					anInt7884++;
					aBoolArray7875[i] = true;
				}
			}
		}
	}

	final void method3170(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class376_Sub10) this).anInt7886 = i;
	}

	final void method3171() {
		aBool7882 = true;
	}

	final Class116 method3172() {
		return ((Class376_Sub10) this).aClass116_7889;
	}

	final void method3173(Class163 class163) {
		((Class116) ((Class376_Sub10) this).aClass116_7889).aClass246_1584
				.method1551(4096);
		for (Class376_Sub2 class376_sub2 = (Class376_Sub2) aClass131_7878
				.method847(-31182); class376_sub2 != null; class376_sub2 = (Class376_Sub2) aClass131_7878
				.method856(122))
			class376_sub2.method2418(aLong7876, class163, true);
	}

	private final void method3174() {
		aBool7882 = false;
	}

	private final void method3175(Class261[] class261s, boolean bool) {
		for (int i = 0; i < 8; i++)
			aBoolArray7874[i] = false;
		while_33_: for (Class11_Sub45_Sub11 class11_sub45_sub11 = ((Class11_Sub45_Sub11) ((Class376_Sub10) this).aClass84_7883
				.method584(-12261)); class11_sub45_sub11 != null; class11_sub45_sub11 = ((Class11_Sub45_Sub11) ((Class376_Sub10) this).aClass84_7883
				.method578(-15361))) {
			if (class261s != null) {
				for (int i = 0; i < class261s.length; i++) {
					if ((((Class11_Sub45_Sub11) class11_sub45_sub11).aClass261_9154) == class261s[i]
							|| ((((Class11_Sub45_Sub11) class11_sub45_sub11).aClass261_9154) == ((Class261) class261s[i]).aClass261_3591)) {
						aBoolArray7874[i] = true;
						class11_sub45_sub11.method3580(-24485);
						continue while_33_;
					}
				}
			}
			if (!bool) {
				class11_sub45_sub11.method122(-81);
				anInt7887--;
				if (class11_sub45_sub11.method3186((byte) 64)) {
					class11_sub45_sub11.method3187(100);
					Class254_Sub3.anInt8040--;
				}
			}
		}
		if (class261s != null) {
			for (int i = 0; i < class261s.length; i++) {
				if (i == 8 || anInt7887 == 8)
					break;
				if (!aBoolArray7874[i]) {
					Class11_Sub45_Sub11 class11_sub45_sub11 = null;
					if ((((Class343) class261s[i].method1663(122)).anInt4542 == 1)
							&& Class254_Sub3.anInt8040 < 32) {
						class11_sub45_sub11 = new Class11_Sub45_Sub11(
								class261s[i], this);
						Class180.aClass65_2333.method487((byte) 52,
								(long) (((Class261) class261s[i]).anInt3587),
								class11_sub45_sub11);
						Class254_Sub3.anInt8040++;
					}
					if (class11_sub45_sub11 == null)
						class11_sub45_sub11 = new Class11_Sub45_Sub11(
								class261s[i], this);
					((Class376_Sub10) this).aClass84_7883.method589((byte) -13,
							class11_sub45_sub11);
					anInt7887++;
					aBoolArray7874[i] = true;
				}
			}
		}
	}

	final void method3176(Class163 class163, long l, Class110[] class110s,
			Class261[] class261s, boolean bool) {
		if (!((Class376_Sub10) this).aBool7877) {
			method3169(class163, class110s, bool);
			method3175(class261s, bool);
			aLong7881 = l;
		}
	}

	final void method3177() {
		((Class376_Sub10) this).aBool7877 = true;
		for (Class11_Sub45_Sub11 class11_sub45_sub11 = ((Class11_Sub45_Sub11) ((Class376_Sub10) this).aClass84_7883
				.method584(-12261)); class11_sub45_sub11 != null; class11_sub45_sub11 = ((Class11_Sub45_Sub11) ((Class376_Sub10) this).aClass84_7883
				.method578(-15361))) {
			if (((Class343) (((Class11_Sub45_Sub11) class11_sub45_sub11).aClass343_9155)).anInt4542 == 1)
				class11_sub45_sub11.method3187(100);
		}
		for (int i = 0; i < (((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879).length; i++) {
			if (((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i] != null) {
				((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i]
						.method3947();
				((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i] = null;
			}
		}
		((Class376_Sub10) this).anInt7880 = 0;
		aClass131_7878 = new Class131();
		anInt7884 = 0;
		((Class376_Sub10) this).aClass84_7883 = new Class84();
		anInt7887 = 0;
		this.method2207((byte) -112);
		Class226.aClass376_Sub10Array3105[Class68.anInt976] = this;
		Class68.anInt976 = (Class68.anInt976 + 1 & Class131.anIntArray1835[Class280.anInt3787]);
	}

	final Class116 method3178() {
		((Class116) ((Class376_Sub10) this).aClass116_7889).aClass246_1584
				.method1551(4096);
		for (int i = 0; i < (((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879).length; i++) {
			if ((((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i] != null)
					&& ((Class376_Sub1_Sub1_Sub1) (((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i])).aClass376_Sub2_10255 != null)
				((Class116) ((Class376_Sub10) this).aClass116_7889).aClass246_1584
						.method1550(
								4096,
								(((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879[i]));
		}
		return ((Class376_Sub10) this).aClass116_7889;
	}

	private final void method3179(int i, boolean bool) {
		IncomingPacket.aClass131_2086.method853(0, this);
		aLong7881 = (long) i;
		aLong7876 = (long) i;
		aBool7885 = true;
		((Class376_Sub10) this).aBool7888 = bool;
	}

	private Class376_Sub10(int i, boolean bool) {
		aClass131_7878 = new Class131();
		anInt7884 = 0;
		((Class376_Sub10) this).aClass84_7883 = new Class84();
		((Class376_Sub10) this).aBool7888 = false;
		anInt7887 = 0;
		aBool7885 = false;
		((Class376_Sub10) this).aClass116_7889 = new Class116();
		((Class376_Sub10) this).aClass376_Sub1_Sub1_Sub1Array7879 = new Class376_Sub1_Sub1_Sub1[8192];
		method3179(i, bool);
	}

	static {
		aBoolArray7874 = new boolean[8];
	}
}
