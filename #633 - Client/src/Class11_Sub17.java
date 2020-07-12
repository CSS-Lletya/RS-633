/* Class11_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;

final class Class11_Sub17 extends Class11 {
	Class108_Sub24 aClass108_Sub24_5682;
	Class108_Sub7 aClass108_Sub7_5683;
	Class108_Sub24 aClass108_Sub24_5684;
	Class108_Sub9 aClass108_Sub9_5685;
	Class108_Sub18 aClass108_Sub18_5686;
	Class108_Sub20 aClass108_Sub20_5687;
	static int anInt5688;
	Class108_Sub29 aClass108_Sub29_5689;
	Class108_Sub8 aClass108_Sub8_5690;
	Class108_Sub4 aClass108_Sub4_5691;
	private Class66 aClass66_5692;
	Class108_Sub14 aClass108_Sub14_5693;
	static int anInt5694;
	Class108_Sub5 aClass108_Sub5_5695;
	Class108_Sub28 aClass108_Sub28_5696;
	Class108_Sub6 aClass108_Sub6_5697;
	static int anInt5698;
	Class108_Sub23 aClass108_Sub23_5699;
	Class108_Sub21 aClass108_Sub21_5700;
	static int anInt5701;
	Class108_Sub8 aClass108_Sub8_5702;
	Class108_Sub3 aClass108_Sub3_5703;
	static int anInt5704;
	static int anInt5705;
	static int anInt5706;
	Class108_Sub27 aClass108_Sub27_5707;
	Class108_Sub12 aClass108_Sub12_5708;
	static int anInt5709;
	Class108_Sub2 aClass108_Sub2_5710;
	Class108_Sub22 aClass108_Sub22_5711;
	Class108_Sub15 aClass108_Sub15_5712;
	private Class106 aClass106_5713;
	static int anInt5714;
	Class108_Sub1 aClass108_Sub1_5715;
	static int anInt5716;
	Class108_Sub26 aClass108_Sub26_5717;
	Class108_Sub27 aClass108_Sub27_5718;
	Class108_Sub25 aClass108_Sub25_5719;
	Class108_Sub8 aClass108_Sub8_5720;
	Class108_Sub16 aClass108_Sub16_5721;
	Class108_Sub8 aClass108_Sub8_5722;
	Class108_Sub11 aClass108_Sub11_5723;
	Class108_Sub13 aClass108_Sub13_5724;
	Class108_Sub8 aClass108_Sub8_5725;
	Class108_Sub13 aClass108_Sub13_5726;
	Class108_Sub10 aClass108_Sub10_5727;
	Class108_Sub15 aClass108_Sub15_5728;
	static int anInt5729;
	Class108_Sub28 aClass108_Sub28_5730;
	Class108_Sub17 aClass108_Sub17_5731;
	Class108_Sub19 aClass108_Sub19_5732;
	/* synthetic */static Class aClass5733;

	private final void method2450(Stream stream, byte i) {
		do {
			try {
				anInt5705++;
				if (stream == null || ((Stream) stream).buffer == null)
					method2455((byte) -114, true);
				else {
					int i_0_ = stream.readUnsignedByte((byte) 35);
					if (i_0_ < 23) {
						try {
							method2453(1, stream, i_0_);
						} catch (Exception exception) {
							method2455((byte) -118, true);
						}
						method2455((byte) -112, false);
					} else if ((i_0_ ^ 0xffffffff) < -25)
						method2455((byte) -116, true);
					else {
						((Class11_Sub17) this).aClass108_Sub15_5712 = new Class108_Sub15(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub15_5728 = new Class108_Sub15(
								((Class11_Sub17) this).aClass108_Sub15_5712
										.method2698(false),
								this);
						((Class11_Sub17) this).aClass108_Sub23_5699 = new Class108_Sub23(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub9_5685 = new Class108_Sub9(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub29_5689 = new Class108_Sub29(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub20_5687 = new Class108_Sub20(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub19_5732 = new Class108_Sub19(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub16_5721 = new Class108_Sub16(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub3_5703 = new Class108_Sub3(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub18_5686 = new Class108_Sub18(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub11_5723 = new Class108_Sub11(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub26_5717 = new Class108_Sub26(
								stream.readUnsignedByte((byte) 35), this);
						if ((i_0_ ^ 0xffffffff) <= -25)
							((Class11_Sub17) this).aClass108_Sub17_5731 = (new Class108_Sub17(
									stream.readUnsignedByte((byte) 35), this));
						((Class11_Sub17) this).aClass108_Sub4_5691 = new Class108_Sub4(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub24_5682 = new Class108_Sub24(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub24_5684 = new Class108_Sub24(
								((Class11_Sub17) this).aClass108_Sub24_5682
										.method3144(false),
								this);
						((Class11_Sub17) this).aClass108_Sub10_5727 = new Class108_Sub10(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub21_5700 = new Class108_Sub21(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub25_5719 = new Class108_Sub25(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub6_5697 = new Class108_Sub6(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub28_5730 = new Class108_Sub28(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub28_5696 = new Class108_Sub28(
								((Class11_Sub17) this).aClass108_Sub28_5730
										.method3181(false),
								this);
						((Class11_Sub17) this).aClass108_Sub27_5718 = new Class108_Sub27(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub27_5707 = new Class108_Sub27(
								((Class11_Sub17) this).aClass108_Sub27_5718
										.method3158(false),
								this);
						((Class11_Sub17) this).aClass108_Sub5_5695 = new Class108_Sub5(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub13_5726 = new Class108_Sub13(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub13_5724 = new Class108_Sub13(
								((Class11_Sub17) this).aClass108_Sub13_5726
										.method2654(false),
								this);
						((Class11_Sub17) this).aClass108_Sub2_5710 = new Class108_Sub2(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub7_5683 = new Class108_Sub7(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub1_5715 = new Class108_Sub1(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub14_5693 = new Class108_Sub14(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub12_5708 = new Class108_Sub12(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub8_5702 = new Class108_Sub8(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub8_5725 = new Class108_Sub8(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub8_5720 = new Class108_Sub8(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub8_5722 = new Class108_Sub8(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub8_5690 = new Class108_Sub8(
								stream.readUnsignedByte((byte) 35), this);
						((Class11_Sub17) this).aClass108_Sub22_5711 = new Class108_Sub22(
								stream.readUnsignedByte((byte) 35), this);
						method2455((byte) -117, false);
					}
				}
				method2451(0);
				if (i == -123)
					break;
				((Class11_Sub17) this).aClass108_Sub11_5723 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ch.C("
						+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
			}
			break;
		} while (false);
	}

	@SuppressWarnings("unchecked")
	private final void method2451(int i) {
		try {
			anInt5704++;
			try {
				Field[] fields = this.getClass().getDeclaredFields();
				Field[] fields_1_ = fields;
				for (int i_2_ = i; (fields_1_.length ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
					Field field = fields_1_[i_2_];
					if ((aClass5733 != null ? aClass5733
							: (aClass5733 = getClassByName("Class108")))
							.isAssignableFrom(field.getType())) {
						Class108 class108 = (Class108) field.get(this);
						class108.method726(false);
					}
				}
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.K(" + i + ')');
		}
	}

	static final void method2452(int i, int i_3_, int i_4_, byte i_5_, int i_6_) {
		try {
			anInt5709++;
			for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class332.aClass84_4407
					.method584(-12261)); class11_sub19 != null; class11_sub19 = ((Class11_Sub19) Class332.aClass84_4407
					.method578(-15361)))
				Class195_Sub1.method2625(i, i_4_, 11908, i_6_, class11_sub19,
						i_3_);
			if (i_5_ != 109)
				method2452(20, -38, 89, (byte) -81, 57);
			for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class339.aClass84_4487
					.method584(-12261)); class11_sub19 != null; class11_sub19 = ((Class11_Sub19) Class339.aClass84_4487
					.method578(i_5_ - 15470))) {
				int i_7_ = 1;
				Class39 class39 = ((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844
						.method3960(21816);
				if (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291 == -1
						|| ((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).aBool10329)
					i_7_ = 0;
				else if ((((Class39) class39).anInt525 != (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291))
						&& (((Class39) class39).anInt573 != (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291))
						&& (((Class39) class39).anInt555 != (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291))
						&& (((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291) ^ 0xffffffff) != (((Class39) class39).anInt569 ^ 0xffffffff))) {
					if (((((Class39) class39).anInt540 ^ 0xffffffff) == (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291 ^ 0xffffffff))
							|| ((((Class39) class39).anInt568 ^ 0xffffffff) == ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291) ^ 0xffffffff))
							|| ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291 ^ 0xffffffff) == (((Class39) class39).anInt546 ^ 0xffffffff))
							|| (((Class39) class39).anInt551 == (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt10291)))
						i_7_ = 3;
				} else
					i_7_ = 2;
				if ((i_7_ ^ 0xffffffff) != (((Class11_Sub19) class11_sub19).anInt5839 ^ 0xffffffff)) {
					int i_8_ = (Class9
							.method114(
									(byte) -113,
									(((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)));
					NPCDefinitions class215 = (((Npc) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).aClass215_10501);
					if (((NPCDefinitions) class215).anIntArray2950 != null)
						class215 = class215.method1375((byte) 29,
								Class11_Sub26.aClass97_6296);
					if (class215 == null || (i_8_ ^ 0xffffffff) == 0) {
						((Class11_Sub19) class11_sub19).anInt5842 = -1;
						((Class11_Sub19) class11_sub19).aBool5834 = false;
						((Class11_Sub19) class11_sub19).anInt5839 = i_7_;
					} else if ((i_8_ != ((Class11_Sub19) class11_sub19).anInt5842)
							|| (((NPCDefinitions) class215).aBool2936 != (((Class11_Sub19) class11_sub19).aBool5834))) {
						boolean bool = false;
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830) != null) {
							((Class11_Sub19) class11_sub19).anInt5836 -= 512;
							if ((((Class11_Sub19) class11_sub19).anInt5836 ^ 0xffffffff) >= -1) {
								Class233.aClass11_Sub6_Sub1_3185
										.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
								bool = true;
								((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
							}
						} else
							bool = true;
						if (bool) {
							((Class11_Sub19) class11_sub19).aBool5834 = ((NPCDefinitions) class215).aBool2936;
							((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824 = null;
							((Class11_Sub19) class11_sub19).anInt5839 = i_7_;
							((Class11_Sub19) class11_sub19).anInt5842 = i_8_;
							((Class11_Sub19) class11_sub19).aClass11_Sub13_5825 = null;
							((Class11_Sub19) class11_sub19).anInt5836 = ((NPCDefinitions) class215).anInt2934;
						}
					} else {
						((Class11_Sub19) class11_sub19).anInt5839 = i_7_;
						((Class11_Sub19) class11_sub19).anInt5836 = ((NPCDefinitions) class215).anInt2934;
					}
				}
				((Class11_Sub19) class11_sub19).anInt5828 = (((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt7045);
				((Class11_Sub19) class11_sub19).anInt5819 = ((((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt7045) + (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844
						.method3968((byte) 127) << 8));
				((Class11_Sub19) class11_sub19).anInt5814 = (((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt7031);
				((Class11_Sub19) class11_sub19).anInt5832 = ((((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844)).anInt7031) + (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub2_5844
						.method3968((byte) 127) << 8));
				Class195_Sub1.method2625(i, i_4_, 11908, i_6_, class11_sub19,
						i_3_);
			}
			for (Class11_Sub19 class11_sub19 = ((Class11_Sub19) Class151.aClass213_2009
					.method1365(i_5_ + 24381)); class11_sub19 != null; class11_sub19 = (Class11_Sub19) Class151.aClass213_2009
					.method1367((byte) 71)) {
				int i_9_ = 1;
				Class39 class39 = ((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841
						.method3960(i_5_ ^ 0x5555);
				if ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291 ^ 0xffffffff) == 0
						|| ((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).aBool10329)
					i_9_ = 0;
				else if (((((Class39) class39).anInt525 ^ 0xffffffff) != ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291) ^ 0xffffffff))
						&& (((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291) ^ 0xffffffff) != (((Class39) class39).anInt573 ^ 0xffffffff))
						&& (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291 != ((Class39) class39).anInt555)
						&& (((Class39) class39).anInt569 != (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291))) {
					if (((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291 ^ 0xffffffff) == (((Class39) class39).anInt540 ^ 0xffffffff))
							|| (((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291 == ((Class39) class39).anInt568)
							|| ((((Class39) class39).anInt546 ^ 0xffffffff) == ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291) ^ 0xffffffff))
							|| ((((Class39) class39).anInt551 ^ 0xffffffff) == ((((Actor) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10291) ^ 0xffffffff)))
						i_9_ = 3;
				} else
					i_9_ = 2;
				if (i_9_ != ((Class11_Sub19) class11_sub19).anInt5839) {
					int i_10_ = (Class180
							.method1180(
									(((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841),
									-23426));
					if ((((Class11_Sub19) class11_sub19).anInt5842 ^ 0xffffffff) == (i_10_ ^ 0xffffffff)
							&& (((Player) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).hasDisplayName == ((Class11_Sub19) class11_sub19).aBool5834)) {
						((Class11_Sub19) class11_sub19).anInt5836 = (((Player) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10394);
						((Class11_Sub19) class11_sub19).anInt5839 = i_9_;
					} else {
						boolean bool = false;
						if ((((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830) == null)
							bool = true;
						else {
							((Class11_Sub19) class11_sub19).anInt5836 -= 512;
							if ((((Class11_Sub19) class11_sub19).anInt5836 ^ 0xffffffff) >= -1) {
								Class233.aClass11_Sub6_Sub1_3185
										.method3464(((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830);
								bool = true;
								((Class11_Sub19) class11_sub19).aClass11_Sub6_Sub4_5830 = null;
							}
						}
						if (bool) {
							((Class11_Sub19) class11_sub19).anInt5836 = (((Player) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt10394);
							((Class11_Sub19) class11_sub19).aBool5834 = (((Player) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).hasDisplayName);
							((Class11_Sub19) class11_sub19).anInt5842 = i_10_;
							((Class11_Sub19) class11_sub19).aClass11_Sub14_Sub1_5824 = null;
							((Class11_Sub19) class11_sub19).aClass11_Sub13_5825 = null;
							((Class11_Sub19) class11_sub19).anInt5839 = i_9_;
						}
					}
				}
				((Class11_Sub19) class11_sub19).anInt5828 = (((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt7045);
				((Class11_Sub19) class11_sub19).anInt5819 = ((((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt7045) - -(((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841
						.method3968((byte) 127) << 8));
				((Class11_Sub19) class11_sub19).anInt5814 = (((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt7031);
				((Class11_Sub19) class11_sub19).anInt5832 = ((((Class376_Sub7) (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841)).anInt7031) + (((Class11_Sub19) class11_sub19).aClass376_Sub7_Sub5_Sub5_Sub1_5841
						.method3968((byte) 127) << 8));
				Class195_Sub1.method2625(i, i_4_, 11908, i_6_, class11_sub19,
						i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ch.A(" + i + ','
					+ i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	private final void method2453(int i, Stream stream, int i_11_) {
		do {
			try {
				((Class11_Sub17) this).aClass108_Sub9_5685 = new Class108_Sub9(
						stream.readUnsignedByte((byte) 35), this);
				anInt5706++;
				((Class11_Sub17) this).aClass108_Sub27_5718 = new Class108_Sub27(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub24_5682 = new Class108_Sub24(
						stream.readUnsignedByte((byte) 35) + 1, this);
				((Class11_Sub17) this).aClass108_Sub3_5703 = new Class108_Sub3(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub25_5719 = new Class108_Sub25(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub18_5686 = new Class108_Sub18(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub20_5687 = new Class108_Sub20(
						stream.readUnsignedByte((byte) 35), this);
				stream.readUnsignedByte((byte) 35);
				((Class11_Sub17) this).aClass108_Sub21_5700 = new Class108_Sub21(
						stream.readUnsignedByte((byte) 35), this);
				int i_12_ = stream.readUnsignedByte((byte) 35);
				int i_13_ = 0;
				if ((i_11_ ^ 0xffffffff) <= -18)
					i_13_ = stream.readUnsignedByte((byte) 35);
				((Class11_Sub17) this).aClass108_Sub26_5717 = new Class108_Sub26(
						i_12_ <= i_13_ ? i_13_ : i_12_, this);
				boolean bool = true;
				boolean bool_14_ = true;
				if (i_11_ < 2) {
					bool = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
					stream.readUnsignedByte((byte) 35);
				} else {
					bool = (stream.readUnsignedByte((byte) 35) ^ 0xffffffff) == -2;
					if ((i_11_ ^ 0xffffffff) <= -18)
						bool_14_ = stream.readUnsignedByte((byte) 35) == 1;
				}
				((Class11_Sub17) this).aClass108_Sub11_5723 = new Class108_Sub11(
						!(bool_14_ | bool) ? 0 : 1, this);
				((Class11_Sub17) this).aClass108_Sub5_5695 = new Class108_Sub5(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub19_5732 = new Class108_Sub19(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub15_5712 = new Class108_Sub15(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub22_5711 = new Class108_Sub22(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub8_5702 = new Class108_Sub8(
						stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) > -21)
					((Class11_Sub17) this).aClass108_Sub8_5720 = new Class108_Sub8(
							((Class11_Sub17) this).aClass108_Sub8_5702
									.method2462(false),
							this);
				else
					((Class11_Sub17) this).aClass108_Sub8_5720 = new Class108_Sub8(
							stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub8_5722 = new Class108_Sub8(
						stream.readUnsignedByte((byte) 35), this);
				((Class11_Sub17) this).aClass108_Sub8_5725 = new Class108_Sub8(
						stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) > -22)
					((Class11_Sub17) this).aClass108_Sub8_5690 = new Class108_Sub8(
							((Class11_Sub17) this).aClass108_Sub8_5722
									.method2462(false),
							this);
				else
					((Class11_Sub17) this).aClass108_Sub8_5690 = new Class108_Sub8(
							stream.readUnsignedByte((byte) 35), this);
				if (i <= i_11_) {
					stream.readUnsignedShort((byte) -65);
					stream.readUnsignedShort((byte) -65);
				}
				if (i_11_ >= 3 && (i_11_ ^ 0xffffffff) > -7)
					stream.readUnsignedByte((byte) 35);
				if ((i_11_ ^ 0xffffffff) <= -5)
					((Class11_Sub17) this).aClass108_Sub4_5691 = new Class108_Sub4(
							stream.readUnsignedByte((byte) 35), this);
				stream.readInt(107);
				if (i_11_ >= 6)
					((Class11_Sub17) this).aClass108_Sub13_5726 = new Class108_Sub13(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 7)
					((Class11_Sub17) this).aClass108_Sub12_5708 = new Class108_Sub12(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 8)
					stream.readUnsignedByte((byte) 35);
				if (i_11_ >= 9)
					((Class11_Sub17) this).aClass108_Sub29_5689 = new Class108_Sub29(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 10)
					((Class11_Sub17) this).aClass108_Sub23_5699 = new Class108_Sub23(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 11)
					((Class11_Sub17) this).aClass108_Sub2_5710 = new Class108_Sub2(
							stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) <= -13)
					((Class11_Sub17) this).aClass108_Sub18_5686 = new Class108_Sub18(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 13)
					((Class11_Sub17) this).aClass108_Sub16_5721 = new Class108_Sub16(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 14)
					((Class11_Sub17) this).aClass108_Sub28_5730 = new Class108_Sub28(
							stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) <= -16)
					((Class11_Sub17) this).aClass108_Sub1_5715 = new Class108_Sub1(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ >= 16)
					((Class11_Sub17) this).aClass108_Sub6_5697 = new Class108_Sub6(
							stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) <= -19)
					((Class11_Sub17) this).aClass108_Sub7_5683 = new Class108_Sub7(
							stream.readUnsignedByte((byte) 35), this);
				if ((i_11_ ^ 0xffffffff) <= -20)
					((Class11_Sub17) this).aClass108_Sub10_5727 = new Class108_Sub10(
							stream.readUnsignedByte((byte) 35), this);
				if (i_11_ < 22)
					break;
				((Class11_Sub17) this).aClass108_Sub14_5693 = new Class108_Sub14(
						stream.readUnsignedByte((byte) 35), this);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("ch.D(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_11_ + ')'));
			}
			break;
		} while (false);
	}

	final Class66 method2454(int i) {
		try {
			anInt5714++;
			if (i != -21)
				return null;
			return aClass66_5692;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.J(" + i + ')');
		}
	}

	private final void method2455(byte i, boolean bool) {
		try {
			anInt5688++;
			if (bool || ((Class11_Sub17) this).aClass108_Sub15_5712 == null)
				((Class11_Sub17) this).aClass108_Sub15_5712 = new Class108_Sub15(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub15_5728 == null)
				((Class11_Sub17) this).aClass108_Sub15_5728 = new Class108_Sub15(
						((Class11_Sub17) this).aClass108_Sub15_5712
								.method2698(false),
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub23_5699 == null)
				((Class11_Sub17) this).aClass108_Sub23_5699 = new Class108_Sub23(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub9_5685 == null)
				((Class11_Sub17) this).aClass108_Sub9_5685 = new Class108_Sub9(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub29_5689 == null)
				((Class11_Sub17) this).aClass108_Sub29_5689 = new Class108_Sub29(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub20_5687 == null)
				((Class11_Sub17) this).aClass108_Sub20_5687 = new Class108_Sub20(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub19_5732 == null)
				((Class11_Sub17) this).aClass108_Sub19_5732 = new Class108_Sub19(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub16_5721 == null)
				((Class11_Sub17) this).aClass108_Sub16_5721 = new Class108_Sub16(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub3_5703 == null)
				((Class11_Sub17) this).aClass108_Sub3_5703 = new Class108_Sub3(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub18_5686 == null)
				((Class11_Sub17) this).aClass108_Sub18_5686 = new Class108_Sub18(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub11_5723 == null)
				((Class11_Sub17) this).aClass108_Sub11_5723 = new Class108_Sub11(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub26_5717 == null)
				((Class11_Sub17) this).aClass108_Sub26_5717 = new Class108_Sub26(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub17_5731 == null)
				((Class11_Sub17) this).aClass108_Sub17_5731 = new Class108_Sub17(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub4_5691 == null)
				((Class11_Sub17) this).aClass108_Sub4_5691 = new Class108_Sub4(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub24_5682 == null)
				((Class11_Sub17) this).aClass108_Sub24_5682 = new Class108_Sub24(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub24_5684 == null)
				((Class11_Sub17) this).aClass108_Sub24_5684 = new Class108_Sub24(
						((Class11_Sub17) this).aClass108_Sub24_5682
								.method3144(false),
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub10_5727 == null)
				((Class11_Sub17) this).aClass108_Sub10_5727 = new Class108_Sub10(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub21_5700 == null)
				((Class11_Sub17) this).aClass108_Sub21_5700 = new Class108_Sub21(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub25_5719 == null)
				((Class11_Sub17) this).aClass108_Sub25_5719 = new Class108_Sub25(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub6_5697 == null)
				((Class11_Sub17) this).aClass108_Sub6_5697 = new Class108_Sub6(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub28_5730 == null)
				((Class11_Sub17) this).aClass108_Sub28_5730 = new Class108_Sub28(
						this);
			if (bool || ((Class11_Sub17) this).aClass108_Sub28_5696 == null)
				((Class11_Sub17) this).aClass108_Sub28_5696 = new Class108_Sub28(
						((Class11_Sub17) this).aClass108_Sub28_5730
								.method3181(false),
						this);
			if (i <= -108) {
				if (bool || ((Class11_Sub17) this).aClass108_Sub27_5718 == null)
					((Class11_Sub17) this).aClass108_Sub27_5718 = new Class108_Sub27(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub27_5707 == null)
					((Class11_Sub17) this).aClass108_Sub27_5707 = new Class108_Sub27(
							((Class11_Sub17) this).aClass108_Sub27_5718
									.method3158(false),
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub5_5695 == null)
					((Class11_Sub17) this).aClass108_Sub5_5695 = new Class108_Sub5(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub13_5726 == null)
					((Class11_Sub17) this).aClass108_Sub13_5726 = new Class108_Sub13(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub13_5724 == null)
					((Class11_Sub17) this).aClass108_Sub13_5724 = new Class108_Sub13(
							((Class11_Sub17) this).aClass108_Sub13_5726
									.method2654(false),
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub2_5710 == null)
					((Class11_Sub17) this).aClass108_Sub2_5710 = new Class108_Sub2(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub7_5683 == null)
					((Class11_Sub17) this).aClass108_Sub7_5683 = new Class108_Sub7(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub1_5715 == null)
					((Class11_Sub17) this).aClass108_Sub1_5715 = new Class108_Sub1(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub14_5693 == null)
					((Class11_Sub17) this).aClass108_Sub14_5693 = new Class108_Sub14(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub12_5708 == null)
					((Class11_Sub17) this).aClass108_Sub12_5708 = new Class108_Sub12(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub8_5702 == null)
					((Class11_Sub17) this).aClass108_Sub8_5702 = new Class108_Sub8(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub8_5725 == null)
					((Class11_Sub17) this).aClass108_Sub8_5725 = new Class108_Sub8(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub8_5720 == null)
					((Class11_Sub17) this).aClass108_Sub8_5720 = new Class108_Sub8(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub8_5722 == null)
					((Class11_Sub17) this).aClass108_Sub8_5722 = new Class108_Sub8(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub8_5690 == null)
					((Class11_Sub17) this).aClass108_Sub8_5690 = new Class108_Sub8(
							this);
				if (bool || ((Class11_Sub17) this).aClass108_Sub22_5711 == null)
					((Class11_Sub17) this).aClass108_Sub22_5711 = new Class108_Sub22(
							this);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.F(" + i + ','
					+ bool + ')');
		}
	}

	final boolean method2456(int i) {
		try {
			anInt5716++;
			if (i != -18373)
				((Class11_Sub17) this).aClass108_Sub19_5732 = null;
			if (!((Class11_Sub17) this).aClass108_Sub28_5696.method3183(5)
					|| (((Class11_Sub17) this).aClass108_Sub28_5696
							.method3181(false) ^ 0xffffffff) != -1
					|| aClass106_5713.method702((byte) -83) >= 96)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.G(" + i + ')');
		}
	}

	final Stream method2457(byte i) {
		try {
			anInt5701++;
			Stream stream = new Stream(Class71.method515((byte) 100));
			stream.writeByte(24, -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub15_5712
					.method2698(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub23_5699
					.method3126(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub9_5685
					.method2607(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub29_5689
					.method3230(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub20_5687
					.method2935(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub19_5732
					.method2892(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub16_5721
					.method2710(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub3_5703
					.method2347(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub18_5686
					.method2809(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub11_5723
					.method2623(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub26_5717
					.method3147(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub17_5731
					.method2734(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub4_5691
					.method2362(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub24_5682
					.method3144(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub10_5727
					.method2617(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub21_5700
					.method2958(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub25_5719
					.method3146(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub6_5697
					.method2429(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub28_5730
					.method3181(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub27_5718
					.method3158(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub5_5695
					.method2373(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub13_5726
					.method2654(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub2_5710
					.method2266(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub7_5683
					.method2435(false), -1528071456);
			int i_15_ = -86 % ((i + 1) / 35);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub1_5715
					.method2250(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub14_5693
					.method2658(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub12_5708
					.method2642(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub8_5702
					.method2462(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub8_5725
					.method2462(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub8_5720
					.method2462(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub8_5722
					.method2462(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub8_5690
					.method2462(false), -1528071456);
			stream.writeByte(((Class11_Sub17) this).aClass108_Sub22_5711
					.method2962(false), -1528071456);
			return stream;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.E(" + i + ')');
		}
	}

	final Class106 method2458(boolean bool) {
		try {
			if (bool != true)
				return null;
			anInt5694++;
			return aClass106_5713;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ch.B(" + bool + ')');
		}
	}

	static final void method2459(byte[][] is, Class286_Sub1 class286_sub1, int i) {
		try {
			anInt5729++;
			int i_16_ = 0;
			if (i != 9454)
				method2452(57, -115, -17, (byte) -17, 44);
			for (/**/; ((i_16_ ^ 0xffffffff) > (((Class286) class286_sub1).anInt3880 ^ 0xffffffff)); i_16_++) {
				Class34.method304((byte) 94);
				for (int i_17_ = 0; ((Class300.anInt4051 >> 3 ^ 0xffffffff) < (i_17_ ^ 0xffffffff)); i_17_++) {
					for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (Class108_Sub12.anInt6228 >> 3 ^ 0xffffffff)); i_18_++) {
						int i_19_ = (Class108_Sub18.anIntArrayArrayArray6923[i_16_][i_17_][i_18_]);
						if ((i_19_ ^ 0xffffffff) != 0) {
							int i_20_ = (0x3b4e394 & i_19_) >> 24;
							if (!((Class286) class286_sub1).aBool3870
									|| (i_20_ ^ 0xffffffff) == -1) {
								int i_21_ = i_19_ >> 1 & 0x3;
								int i_22_ = (0xfff2d6 & i_19_) >> 14;
								int i_23_ = i_19_ >> 3 & 0x7ff;
								int i_24_ = (i_22_ / 8 << 8) - -(i_23_ / 8);
								for (int i_25_ = 0; ((i_25_ ^ 0xffffffff) > (Class183.anIntArray2362.length ^ 0xffffffff)); i_25_++) {
									if (i_24_ == Class183.anIntArray2362[i_25_]
											&& is[i_25_] != null) {
										class286_sub1.method2905(i_18_ * 8,
												is[i_25_], i_20_,
												Class321_Sub2.aClass163_6648,
												i_21_, i_17_ * 8,
												8 * (0x7 & i_22_),
												8 * (0x7 & i_23_), i_16_, -124,
												Class235.aClass338Array3217);
										break;
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ch.I(" + (is != null ? "{...}" : "null") + ','
							+ (class286_sub1 != null ? "{...}" : "null") + ','
							+ i + ')'));
		}
	}

	final void method2460(int i, int i_26_, Class108 class108) {
		try {
			class108.method727((byte) -118, i_26_);
			if (i != 249682952)
				method2459(null, null, -54);
			anInt5698++;
			method2451(0);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("ch.H(" + i + ',' + i_26_ + ','
							+ (class108 != null ? "{...}" : "null") + ')'));
		}
	}

	Class11_Sub17(Class66 class66, int i) {
		try {
			aClass66_5692 = class66;
			aClass106_5713 = new Class106(
					(((Class341) Class108_Sub21.aClass341_7304).aBool4520),
					Class177.anInt2245, Class11_Sub2_Sub7.anInt8734,
					Class341.aString4521.toLowerCase().indexOf("arm") != -1);
			((Class11_Sub17) this).aClass108_Sub28_5696 = new Class108_Sub28(i,
					this);
			method2455((byte) -111, true);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ch.<init>("
					+ (class66 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	Class11_Sub17(Stream stream, Class66 class66, int i) {
		try {
			aClass66_5692 = class66;
			aClass106_5713 = new Class106(
					(((Class341) Class108_Sub21.aClass341_7304).aBool4520),
					Class177.anInt2245, Class11_Sub2_Sub7.anInt8734,
					Class341.aString4521.indexOf("arm") != -1);
			((Class11_Sub17) this).aClass108_Sub28_5696 = new Class108_Sub28(i,
					this);
			method2450(stream, (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ch.<init>("
					+ (stream != null ? "{...}" : "null") + ','
					+ (class66 != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	/* synthetic */static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
