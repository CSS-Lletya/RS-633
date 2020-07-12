/* Class347 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class347 {
	static int anInt4596;
	int anInt4597;
	static long aLong4598 = -1L;
	static int anInt4599;
	static Class253[] aClass253Array4600;

	static final int method2093(int i) {
		try {
			anInt4596++;
			if (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub12_5708
					.method2642(false) == 0) {
				for (int i_0_ = 0; Class11_Sub26.anInt6301 > i_0_; i_0_++) {
					if (Class289.anInterface25Array3900[i_0_]
							.method56(i ^ 0x1039) == 's'
							|| (Class289.anInterface25Array3900[i_0_]
									.method56(4152) ^ 0xffffffff) == -84) {
						Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
								.method2460(
										249682952,
										1,
										(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub12_5708));
						Class62.aBool904 = true;
						break;
					}
				}
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2817) {
				Runtime runtime = Runtime.getRuntime();
				int i_1_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				long l = Class137.method878((byte) -43);
				if ((Class313.aLong4161 ^ 0xffffffffffffffffL) == -1L)
					Class313.aLong4161 = l;
				if (i_1_ > 16384
						&& (-Class313.aLong4161 + l ^ 0xffffffffffffffffL) > -5001L) {
					if (-Class11_Sub2_Sub19.aLong9099 + l > 1000L) {
						System.gc();
						Class11_Sub2_Sub19.aLong9099 = l;
					}
					return 0;
				}
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2822) {
				if (Class321_Sub4.aClass231_8007 == null)
					Class321_Sub4.aClass231_8007 = new Class231(
							Class52.aClass187_810, Class89.aClass82_1221,
							Class254.aBigInteger3494, Class42.aBigInteger674);
				if (!Class321_Sub4.aClass231_8007.method1481(65))
					return 0;
				Class336.method2017(0, (byte) -58, true, null);
				Class94_Sub4.aBool7726 = !Class291.method1797(-15377);
				Class11_Sub46_Sub1.aClass146_8833 = Class2_Sub9.method2947(
						!Class94_Sub4.aBool7726 ? 32 : 34, 5, false, 1);
				Class108_Sub18.aClass146_6932 = Class2_Sub9.method2947(33, 5,
						false, 1);
				Class11_Sub18.aClass146_5781 = Class2_Sub9.method2947(13, 5,
						false, 1);
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2823) {
				boolean bool = Class108_Sub18.aClass146_6932.method916(-7296);
				int i_2_ = Class11_Sub2_Sub31.aClass19_Sub1Array9644[33]
						.method2475((byte) -125);
				i_2_ = i_2_
						+ Class11_Sub2_Sub31.aClass19_Sub1Array9644[!Class94_Sub4.aBool7726 ? 32
								: 34].method2475((byte) -126);
				i_2_ += Class11_Sub2_Sub31.aClass19_Sub1Array9644[13]
						.method2475((byte) -128);
				i_2_ = i_2_
						+ (bool ? 100 : Class108_Sub18.aClass146_6932
								.method912(0));
				if (i_2_ != 400)
					return i_2_ / 4;
				Class108_Sub25.anInt7821 = Class11_Sub46_Sub1.aClass146_8833
						.method925(126);
				Class108_Sub21.anInt7311 = Class108_Sub18.aClass146_6932
						.method925(-106);
				Class278.method1714(false, Class11_Sub46_Sub1.aClass146_8833);
				int i_3_ = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub14_5693
						.method2658(false);
				Class163_Sub2.aClass346_7418 = new Class346(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class108_Sub18.aClass146_6932);
				int[] is = Class163_Sub2.aClass346_7418.method2092(i_3_,
						(byte) 79);
				if ((is.length ^ 0xffffffff) == -1)
					is = Class163_Sub2.aClass346_7418.method2092(0, (byte) 79);
				Class265 class265 = new Class265(
						Class11_Sub46_Sub1.aClass146_8833,
						Class11_Sub18.aClass146_5781);
				if ((is.length ^ 0xffffffff) < -1) {
					Class111.anInterface11Array1524 = new Interface11[is.length];
					for (int i_4_ = 0; ((i_4_ ^ 0xffffffff) > (Class111.anInterface11Array1524.length ^ 0xffffffff)); i_4_++)
						Class111.anInterface11Array1524[i_4_] = new Class303(
								Class163_Sub2.aClass346_7418.method2089(
										is[i_4_], 1), class265);
				}
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2824)
				Class11_Sub45_Sub7.method3452(458752, Class250.method1596(63),
						Class11_Sub18.aClass146_5781,
						(Class11_Sub46_Sub1.aClass146_8833));
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2825) {
				int i_5_ = Class255.method1633(1);
				int i_6_ = Class316.method1922(-2);
				if ((i_6_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff))
					return 100 * i_5_ / i_6_;
			}
			if (Class209.aClass209_2826 == Class11_Sub2_Sub26.aClass209_9344) {
				if (Class111.anInterface11Array1524 != null
						&& Class111.anInterface11Array1524.length > 0) {
					if ((Class111.anInterface11Array1524[0].method30(-73) ^ 0xffffffff) > -101)
						return 0;
					if (Class111.anInterface11Array1524.length > 1
							&& Class163_Sub2.aClass346_7418.method2091(i
									^ ~0x5754)
							&& (Class111.anInterface11Array1524[1]
									.method30(-111) ^ 0xffffffff) > -101)
						return 0;
				}
				Class94.method631(255, Class321_Sub2.aClass163_6648);
				Class55.method449(Class321_Sub2.aClass163_6648, (byte) -93);
				Class83.method575(false, 1);
			}
			if (Class209.aClass209_2827 == Class11_Sub2_Sub26.aClass209_9344) {
				for (int i_7_ = 0; i_7_ < 4; i_7_++)
					Class235.aClass338Array3217[i_7_] = Class222.method1417(
							Class300.anInt4051, Class108_Sub12.anInt6228,
							(byte) 96);
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2828) {
				Class108_Sub7.aClass146_5636 = Class2_Sub9.method2947(8, 5,
						false, 1);
				Class321.aClass146_4293 = Class2_Sub9
						.method2947(0, 5, false, 1);
				Class335_Sub3_Sub1.aClass146_9417 = Class2_Sub9.method2947(1,
						i + 4, false, 1);
				Class11_Sub2_Sub15.aClass146_9023 = Class2_Sub9.method2947(2,
						5, false, 1);
				Class282.aClass146_3824 = Class2_Sub9
						.method2947(3, 5, false, 1);
				Class135.aClass146_1863 = Class2_Sub9
						.method2947(4, 5, false, 1);
				Class14.aClass146_125 = Class2_Sub9.method2947(5, i ^ 0x4,
						true, 1);
				Class58_Sub2_Sub1.aClass146_9250 = Class2_Sub9.method2947(6,
						i + 4, true, 1);
				Class265.aClass146_3607 = Class2_Sub9
						.method2947(7, 5, false, 1);
				Class11_Sub45_Sub1_Sub2.aClass146_9886 = Class2_Sub9
						.method2947(9, 5, false, 1);
				Class194.aClass146_2640 = Class2_Sub9.method2947(10, 5, false,
						1);
				Class150.aClass146_2002 = Class2_Sub9.method2947(11, i ^ 0x4,
						false, 1);
				Class335.aClass146_4433 = Class2_Sub9.method2947(12, 5, false,
						1);
				Class280.aClass146_3789 = Class2_Sub9.method2947(14, 5, false,
						1);
				Class11_Sub2_Sub2.aClass146_8461 = Class2_Sub9.method2947(15,
						5, false, 1);
				Class308.aClass146_4128 = Class2_Sub9.method2947(16, 5, false,
						1);
				Class108_Sub1.aClass146_5026 = Class2_Sub9.method2947(17, 5,
						false, 1);
				Class131.aClass146_1825 = Class2_Sub9.method2947(18, 5, false,
						1);
				Class47.aClass146_744 = Class2_Sub9.method2947(19, 5, false, 1);
				Class217_Sub1.aClass146_5538 = Class2_Sub9.method2947(20,
						i ^ 0x4, false, 1);
				Class256_Sub1.aClass146_5323 = Class2_Sub9.method2947(21, 5,
						false, 1);
				Class287.aClass146_3887 = Class2_Sub9.method2947(22, 5, false,
						1);
				Class11_Sub2_Sub30.aClass146_9618 = Class2_Sub9.method2947(23,
						i + 4, true, 1);
				Class234_Sub2.aClass146_5987 = Class2_Sub9.method2947(24, 5,
						false, 1);
				Class11_Sub45_Sub11.aClass146_9165 = Class2_Sub9.method2947(25,
						i ^ 0x4, false, 1);
				Class11_Sub45_Sub19.aClass146_9707 = Class2_Sub9.method2947(26,
						5, true, 1);
				Class2.aClass146_15 = Class2_Sub9.method2947(27, 5, false, 1);
				Class11_Sub49.aClass146_8012 = Class2_Sub9.method2947(28, 5,
						true, 1);
				Class216.aClass146_2987 = Class2_Sub9.method2947(29, i + 4,
						false, 1);
				Class335_Sub1.aClass146_6443 = Class2_Sub9.method2947(30,
						i + 4, true, 1);
				Class11_Sub31.aClass146_6703 = Class2_Sub9.method2947(31,
						i ^ 0x4, true, 1);
				Class11_Sub8.aClass146_5310 = Class2_Sub9.method2947(36, 5,
						true, 2);
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2829) {
				int i_8_ = 0;
				for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -38; i_9_++) {
					if (Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_9_] != null)
						i_8_ += (Class11_Sub2_Sub31.aClass19_Sub1Array9644[i_9_]
								.method2475((byte) -125)
								* Canvas_Sub1.anIntArray9229[i_9_] / 100);
				}
				if ((i_8_ ^ 0xffffffff) != -101) {
					if (Class11_Sub2_Sub28.anInt9420 < 0)
						Class11_Sub2_Sub28.anInt9420 = i_8_;
					return ((i_8_ + -Class11_Sub2_Sub28.anInt9420) * 100 / (100 + -Class11_Sub2_Sub28.anInt9420));
				}
				Class108_Sub10.method2616(Class108_Sub7.aClass146_5636, -13903);
				Class11_Sub45_Sub7.method3452(458752, Class250.method1596(-55),
						Class11_Sub18.aClass146_5781,
						Class108_Sub7.aClass146_5636);
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2830) {
				if ((Class235.anInt3219 ^ 0xffffffff) == 0)
					Class235.anInt3219 = Class58_Sub2_Sub1.aClass146_9250
							.method920(126, "Aye Car Rum Ba");
				Class11_Sub16.method2444((byte) -97);
				Class83.method575(false, 2);
			}
			if (Class209.aClass209_2831 == Class11_Sub2_Sub26.aClass209_9344)
				Class333.method2008(Class335_Sub1.aClass146_6443, true,
						Class108_Sub21.aClass341_7304);
			if (Class209.aClass209_2832 == Class11_Sub2_Sub26.aClass209_9344) {
				int i_10_ = Class236_Sub3.method2647(-102);
				if ((i_10_ ^ 0xffffffff) > -101)
					return i_10_;
				Class314.method1910((byte) -80,
						Class11_Sub49.aClass146_8012.method938(1, 0));
				Class332.method2004(
						Class11_Sub49.aClass146_8012.method938(3, 0), 16143);
			}
			if (i != 1)
				method2095(123);
			if (Class209.aClass209_2833 == Class11_Sub2_Sub26.aClass209_9344) {
				if ((Class11_Sub8.anInt5308 ^ 0xffffffff) != 0
						&& !Class265.aClass146_3607.method927((byte) -122,
								Class11_Sub8.anInt5308, 0))
					return 99;
				Class24.anInterface1_252 = new Class115(
						Class11_Sub45_Sub19.aClass146_9707,
						Class11_Sub45_Sub1_Sub2.aClass146_9886,
						Class108_Sub7.aClass146_5636);
				Class187.aClass52_2388 = new Class52(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class108_Sub26.aClass127_7833 = new Class127(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class369.aClass96_4847 = new Class96(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023,
						Class108_Sub7.aClass146_5636);
				Class11_Sub35_Sub1.aClass374_9125 = new Class374(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class108_Sub1.aClass146_5026);
				Class205.aClass302_2761 = new Class302(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class58_Sub2_Sub2.aClass353_9819 = new Class353(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class2.aClass221_18 = new Class221(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023,
						Class265.aClass146_3607);
				Class1.aClass197_4 = new Class197(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class299.aClass85_4031 = new Class85(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class11_Sub4.aClass290_5237 = new Class290(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884, true,
						Class308.aClass146_4128, Class265.aClass146_3607);
				Class168.aClass280_2160 = new Class280(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023,
						Class108_Sub7.aClass146_5636);
				Class47.aClass29_741 = new Class29(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023,
						Class108_Sub7.aClass146_5636);
				Class11_Sub19.aClass318_5817 = new Class318(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884, true,
						Class131.aClass146_1825, Class265.aClass146_3607);
				Packet.aClass223_8723 = new Class223(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884, true,
						Class187.aClass52_2388, Class47.aClass146_744,
						Class265.aClass146_3607);
				Class11_Sub12_Sub4.aClass273_9466 = new Class273(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class108_Sub23.aClass198_7760 = new Class198(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class217_Sub1.aClass146_5538, Class321.aClass146_4293,
						Class335_Sub3_Sub1.aClass146_9417);
				Class233.aClass379_3181 = new Class379(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class179.aClass154_2279 = new Class154(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class254.aClass227_3495 = new Class227(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class256_Sub1.aClass146_5323, Class265.aClass146_3607);
				Class11_Sub35_Sub1.aClass285_9126 = new Class285(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class312.aClass260_4149 = new Class260(Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class234_Sub2_Sub1.aClass306_8443 = new Class306(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class11_Sub50_Sub2.aClass369_9082 = new Class369(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class287.aClass146_3887);
				Class91_Sub1.aClass171_6937 = new Class171(
						Class198.aClass66_2679,
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class11_Sub2_Sub15.aClass146_9023);
				Class100.method668(Class265.aClass146_3607,
						Class11_Sub18.aClass146_5781,
						Class108_Sub7.aClass146_5636, Class282.aClass146_3824,
						i ^ ~0x1);
				Class253_Sub2.method2705(7, Class216.aClass146_2987);
				Class321_Sub4.aClass361_8006 = new Class361(
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class234_Sub2.aClass146_5987,
						Class11_Sub45_Sub11.aClass146_9165);
				Class11_Sub2_Sub10.aClass352_8851 = new Class352(
						Class11_Sub45_Sub1_Sub2.anInt9884,
						Class234_Sub2.aClass146_5987,
						Class11_Sub45_Sub11.aClass146_9165, new Class48());
				Class108_Sub13.method2652(false);
				Class11_Sub4.aClass290_5237
						.method1785(
								0,
								((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub27_5707
										.method3158(false) == 0);
				Class11_Sub26.aClass97_6296 = new Class97();
				Class108_Sub13.method2653((byte) -123);
				Class186.method1213((byte) 82, Class2.aClass146_15);
				Class321.method1961(Class265.aClass146_3607, (byte) -112,
						Class24.anInterface1_252);
				Class78 class78 = new Class78(
						Class194.aClass146_2640.method932("huffman", "", 0));
				Class337.method2024(class78, 112);
				try {
					jagmisc.init();
				} catch (Throwable throwable) {
					/* empty */
				}
				Class272.aClass264_3672 = Class380.method2227((byte) -127);
				Class205.aClass11_Sub16_2755 = new Class11_Sub16(true,
						Class108_Sub21.aClass341_7304);
			}
			if (Class209.aClass209_2835 == Class11_Sub2_Sub26.aClass209_9344) {
				int i_11_ = (Class236_Sub1.method2604(
						Class108_Sub7.aClass146_5636, -110) + Class120
						.method784(-68, true));
				int i_12_ = Class216.method1391(10) - -Class316.method1922(-2);
				if ((i_11_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff))
					return 100 * i_11_ / i_12_;
			}
			if (Class209.aClass209_2836 == Class11_Sub2_Sub26.aClass209_9344)
				Class32.method267(Class11_Sub2_Sub30.aClass146_9618,
						Class205.aClass302_2761,
						Class58_Sub2_Sub2.aClass353_9819,
						Class11_Sub4.aClass290_5237, Class168.aClass280_2160,
						Class47.aClass29_741, Class11_Sub26.aClass97_6296);
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2837) {
				Class11_Sub2_Sub20.anIntArray9148 = new int[(((Class306) Class234_Sub2_Sub1.aClass306_8443).anInt4110)];
				Class299.aBoolArray4037 = new boolean[((Class306) (Class234_Sub2_Sub1.aClass306_8443)).anInt4110];
				Class138.aStringArray1888 = (new String[((Class260) Class312.aClass260_4149).anInt3576]);
				for (int i_13_ = 0; ((i_13_ ^ 0xffffffff) > ((((Class306) Class234_Sub2_Sub1.aClass306_8443).anInt4110) ^ 0xffffffff)); i_13_++) {
					if ((((Class161) Class234_Sub2_Sub1.aClass306_8443
							.method1877(i_13_, false)).anInt2090 ^ 0xffffffff) == -1) {
						Class299.aBoolArray4037[i_13_] = true;
						Class236.anInt3221++;
					}
					Class11_Sub2_Sub20.anIntArray9148[i_13_] = -1;
				}
				Class122.method795((byte) 55);
				Class2_Sub3.anInt5366 = Class282.aClass146_3824.method920(-48,
						"loginscreen");
				Class108_Sub9.anInt6099 = Class282.aClass146_3824.method920(
						i - 43, "lobbyscreen");
				Class14.aClass146_125.method922(true, 0, false);
				Class58_Sub2_Sub1.aClass146_9250.method922(true, 0, true);
				Class108_Sub7.aClass146_5636.method922(true, 0, true);
				Class11_Sub18.aClass146_5781.method922(true, 0, true);
				Class194.aClass146_2640.method922(true, 0, true);
				Class282.aClass146_3824.method922(true, 0, true);
				Class47.aBool747 = true;
				((Class146) Class11_Sub2_Sub15.aClass146_9023).anInt1987 = 2;
				((Class146) Class108_Sub1.aClass146_5026).anInt1987 = 2;
				((Class146) Class308.aClass146_4128).anInt1987 = 2;
				((Class146) Class131.aClass146_1825).anInt1987 = 2;
				((Class146) Class47.aClass146_744).anInt1987 = 2;
				((Class146) Class217_Sub1.aClass146_5538).anInt1987 = 2;
				((Class146) Class256_Sub1.aClass146_5323).anInt1987 = 2;
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2838) {
				if (!Class11_Sub16.method2449(88, Class2_Sub3.anInt5366))
					return 0;
				boolean bool = true;
				for (int i_14_ = 0; ((Class11_Sub45_Sub5.aClass192ArrayArray8772[Class2_Sub3.anInt5366]).length > i_14_); i_14_++) {
					IComponentDefinitions class192 = (Class11_Sub45_Sub5.aClass192ArrayArray8772[Class2_Sub3.anInt5366][i_14_]);
					if (((IComponentDefinitions) class192).anInt2531 == 5
							&& ((IComponentDefinitions) class192).anInt2544 != -1
							&& !(Class108_Sub7.aClass146_5636
									.method927(
											(byte) -111,
											((IComponentDefinitions) class192).anInt2544,
											0)))
						bool = false;
				}
				if (!bool)
					return 0;
			}
			if (Class11_Sub2_Sub26.aClass209_9344 == Class209.aClass209_2839)
				Class108_Sub21.method2956(true, (byte) -128);
			if (Class209.aClass209_2840 == Class11_Sub2_Sub26.aClass209_9344) {
				Class321_Sub2.aClass382_6641.method2238((byte) -124);
				try {
					Class351.aThread4620.join();
				} catch (InterruptedException interruptedexception) {
					return 0;
				}
				Class351.aThread4620 = null;
				Class111.anInterface11Array1524 = null;
				Class163_Sub2.aClass346_7418 = null;
				Class108_Sub18.aClass146_6932 = null;
				Class321_Sub2.aClass382_6641 = null;
				Class11_Sub46_Sub1.aClass146_8833 = null;
				Class222.method1418(-109);
				Class376_Sub7.aBool7050 = ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub12_5708
						.method2642(false) == 1;
				Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
						.method2460(
								249682952,
								1,
								(((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub12_5708));
				if (Class376_Sub7.aBool7050)
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730));
				else if (((Class108_Sub28) (((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730)).aBool7894
						&& (((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656) < 512
						&& (((Class11_Sub16) Class205.aClass11_Sub16_2755).anInt5656) != 0)
					Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847
							.method2460(
									249682952,
									0,
									(((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub28_5730));
				Class186.method1212(i + 10342);
				if (!Class376_Sub7.aBool7050)
					Class239.method1521(
							false,
							0,
							((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub28_5730
									.method3181(false));
				else
					Class239.method1521(false, 0, 0);
				Class113.method756(
						3,
						false,
						((Class11_Sub17) (Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847)).aClass108_Sub13_5726
								.method2654(false), -1, -1);
				Class94.method631(i ^ 0xfe, Class321_Sub2.aClass163_6648);
				Class55.method449(Class321_Sub2.aClass163_6648, (byte) 34);
				Class282.method1743(Class321_Sub2.aClass163_6648, false,
						Class108_Sub7.aClass146_5636);
				Class376_Sub7_Sub3_Sub2.method3926(
						(Class376_Sub7_Sub1_Sub1.aClass253Array10081), -120);
			}
			return Class216.method1388(26908);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vl.B(" + i + ')');
		}
	}

	static final void method2094(int i, int i_15_, int i_16_,
			Class376_Sub7_Sub2 class376_sub7_sub2) {
		Class364 class364 = Class221.method1414(i, i_15_, i_16_);
		if (class364 != null) {
			((Class364) class364).aClass376_Sub7_Sub2_4777 = class376_sub7_sub2;
			int i_17_ = ((Class315.aClass12Array4179 == Class234_Sub1_Sub1.aClass12Array9729) ? 1
					: 0);
			if (class376_sub7_sub2.method2863(-124)) {
				if (class376_sub7_sub2.method2870(false)) {
					((Class376_Sub7) class376_sub7_sub2).aClass376_Sub7_7032 = Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_17_];
					Class11_Sub2_Sub25.aClass376_Sub7Array9326[i_17_] = class376_sub7_sub2;
				} else {
					((Class376_Sub7) class376_sub7_sub2).aClass376_Sub7_7032 = Class382.aClass376_Sub7Array4971[i_17_];
					Class382.aClass376_Sub7Array4971[i_17_] = class376_sub7_sub2;
					Class333.aBool4411 = true;
				}
			} else {
				((Class376_Sub7) class376_sub7_sub2).aClass376_Sub7_7032 = Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_17_];
				Class11_Sub45_Sub4.aClass376_Sub7Array8534[i_17_] = class376_sub7_sub2;
			}
		}
	}

	public static void method2095(int i) {
		do {
			try {
				aClass253Array4600 = null;
				if (i == -12320)
					break;
				method2093(-64);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vl.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class347(String string, int i) {
		try {
			((Class347) this).anInt4597 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("vl.<init>("
					+ (string != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}

	public final String toString() {
		try {
			anInt4599++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vl.toString(" + ')');
		}
	}
}
