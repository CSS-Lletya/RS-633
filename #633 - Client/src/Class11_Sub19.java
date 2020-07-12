/* Class11_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub19 extends Class11 {
	Class11_Sub14_Sub1 aClass11_Sub14_Sub1_5813;
	int anInt5814;
	static Class11_Sub45_Sub5 aClass11_Sub45_Sub5_5815;
	int[] anIntArray5816;
	static Class318 aClass318_5817;
	static int[] anIntArray5818;
	int anInt5819;
	int anInt5820;
	int anInt5821;
	int anInt5822;
	int anInt5823;
	Class11_Sub14_Sub1 aClass11_Sub14_Sub1_5824;
	Class11_Sub13 aClass11_Sub13_5825;
	int anInt5826;
	int anInt5827;
	int anInt5828;
	static int anInt5829;
	Class11_Sub6_Sub4 aClass11_Sub6_Sub4_5830;
	boolean aBool5831;
	int anInt5832;
	boolean aBool5833;
	boolean aBool5834;
	int anInt5835;
	int anInt5836;
	Class11_Sub13 aClass11_Sub13_5837;
	Class11_Sub6_Sub4 aClass11_Sub6_Sub4_5838;
	int anInt5839 = 0;
	Class42 aClass42_5840;
	Player aClass376_Sub7_Sub5_Sub5_Sub1_5841;
	int anInt5842;
	static int anInt5843;
	Npc aClass376_Sub7_Sub5_Sub5_Sub2_5844;

	static final int method2481(int i) {
		try {
			anInt5843++;
			if (i == (OutputStream_Sub1.anInt5845 ^ 0xffffffff))
				return Class11_Sub39.anInt7215;
			return Class11_Sub2_Sub16.anInt9038;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dia.C(" + i + ')');
		}
	}

	final void method2482(int i) {
		do {
			try {
				anInt5829++;
				int i_0_ = ((Class11_Sub19) this).anInt5842;
				boolean bool = ((Class11_Sub19) this).aBool5834;
				if (((Class11_Sub19) this).aClass42_5840 != null) {
					Class42 class42 = ((Class11_Sub19) this).aClass42_5840
							.method380(Class11_Sub26.aClass97_6296, 0);
					if (class42 == null) {
						((Class11_Sub19) this).anInt5822 = 0;
						((Class11_Sub19) this).anInt5820 = 0;
						((Class11_Sub19) this).aBool5834 = false;
						((Class11_Sub19) this).anInt5836 = 0;
						((Class11_Sub19) this).anInt5821 = 0;
						((Class11_Sub19) this).anIntArray5816 = null;
						((Class11_Sub19) this).aBool5833 = false;
						((Class11_Sub19) this).anInt5835 = 256;
						((Class11_Sub19) this).anInt5826 = 256;
						((Class11_Sub19) this).anInt5842 = -1;
					} else {
						((Class11_Sub19) this).anInt5822 = ((Class42) class42).anInt668;
						((Class11_Sub19) this).anInt5836 = ((Class42) class42).anInt609;
						((Class11_Sub19) this).anInt5821 = ((Class42) class42).anInt689 << 9;
						((Class11_Sub19) this).anInt5826 = ((Class42) class42).anInt598;
						((Class11_Sub19) this).anInt5842 = ((Class42) class42).anInt680;
						((Class11_Sub19) this).anInt5835 = ((Class42) class42).anInt651;
						((Class11_Sub19) this).anIntArray5816 = ((Class42) class42).anIntArray631;
						((Class11_Sub19) this).aBool5834 = ((Class42) class42).aBool613;
						((Class11_Sub19) this).anInt5820 = ((Class42) class42).anInt617;
						((Class11_Sub19) this).aBool5833 = ((Class42) class42).aBool603;
					}
				} else if ((((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub2_5844) != null) {
					int i_1_ = (Class9
							.method114(
									(byte) -87,
									(((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub2_5844)));
					if (i_1_ != i_0_) {
						((Class11_Sub19) this).anInt5842 = i_1_;
						NPCDefinitions class215 = (((Npc) (((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).aClass215_10501);
						if (((NPCDefinitions) class215).anIntArray2950 != null)
							class215 = class215.method1375((byte) 29,
									(Class11_Sub26.aClass97_6296));
						if (class215 != null) {
							((Class11_Sub19) this).anInt5821 = ((NPCDefinitions) class215).anInt2923 << 9;
							((Class11_Sub19) this).aBool5834 = ((NPCDefinitions) class215).aBool2936;
							((Class11_Sub19) this).anInt5836 = ((NPCDefinitions) class215).anInt2934;
							((Class11_Sub19) this).anInt5826 = ((NPCDefinitions) class215).anInt2935;
							((Class11_Sub19) this).anInt5835 = ((NPCDefinitions) class215).anInt2927;
						} else {
							((Class11_Sub19) this).anInt5835 = 256;
							((Class11_Sub19) this).aBool5834 = ((NPCDefinitions) (((Npc) (((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).aClass215_10501)).aBool2936;
							((Class11_Sub19) this).anInt5836 = ((Class11_Sub19) this).anInt5821 = 0;
							((Class11_Sub19) this).anInt5826 = 256;
						}
					}
				} else if ((((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub1_5841) != null) {
					((Class11_Sub19) this).anInt5842 = (Class180
							.method1180(
									(((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub1_5841),
									-23426));
					((Class11_Sub19) this).anInt5835 = 256;
					((Class11_Sub19) this).aBool5834 = ((Player) (((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).hasDisplayName;
					((Class11_Sub19) this).anInt5826 = 256;
					((Class11_Sub19) this).anInt5821 = (((Player) (((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10383 << 9);
					((Class11_Sub19) this).anInt5836 = ((Player) (((Class11_Sub19) this).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10394;
				}
				if (((i_0_ ^ 0xffffffff) != (((Class11_Sub19) this).anInt5842 ^ 0xffffffff) || bool == !((Class11_Sub19) this).aBool5834)
						&& (((Class11_Sub19) this).aClass11_Sub6_Sub4_5830 != null)) {
					Class233.aClass11_Sub6_Sub1_3185
							.method3464(((Class11_Sub19) this).aClass11_Sub6_Sub4_5830);
					((Class11_Sub19) this).aClass11_Sub6_Sub4_5830 = null;
					((Class11_Sub19) this).aClass11_Sub14_Sub1_5824 = null;
					((Class11_Sub19) this).aClass11_Sub13_5825 = null;
				}
				if (i >= 4)
					break;
				((Class11_Sub19) this).anInt5820 = -24;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "dia.A(" + i + ')');
			}
			break;
		} while (false);
	}

	public static void method2483(int i) {
		try {
			aClass11_Sub45_Sub5_5815 = null;
			aClass318_5817 = null;
			if (i != 256)
				anIntArray5818 = null;
			anIntArray5818 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dia.B(" + i + ')');
		}
	}

	public Class11_Sub19() {
		/* empty */
	}
}
