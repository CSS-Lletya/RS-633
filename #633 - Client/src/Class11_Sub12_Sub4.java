/* Class11_Sub12_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

final class Class11_Sub12_Sub4 extends Class11_Sub12 {
	static int anInt9435;
	private SetupInfo aSetupInfo9436;
	static int anInt9437;
	static int anInt9438;
	static int anInt9439;
	private Class253 aClass253_9440;
	static int anInt9441;
	private boolean aBool9442;
	static int anInt9443;
	static int anInt9444;
	private int anInt9445;
	private DecoderContext aDecoderContext9446;
	private Frame aFrame9447;
	private boolean aBool9448;
	private TheoraComment aTheoraComment9449;
	static int anInt9450;
	static int anInt9451;
	static boolean aBool9452;
	private GranulePos aGranulePos9453;
	static int anInt9454;
	private double aDouble9455;
	private TheoraInfo aTheoraInfo9456;
	static int anInt9457;
	private boolean aBool9458;
	private boolean aBool9459;
	static int anInt9460;
	static int anInt9461;
	private int anInt9462;
	static int anInt9463;
	static int anInt9464 = 0;
	private long aLong9465;
	static Class273 aClass273_9466;

	static final int method3719(String string, int i) {
		try {
			if (i < 84)
				method3720(true);
			anInt9463++;
			if (!((Class341) Class236_Sub6.aClass341_6966).aBool4520)
				return -1;
			if (Class19.aHashtable150.containsKey(string))
				return 100;
			String string_0_ = Class11_Sub2_Sub10.method3475(4096, string);
			if (string_0_ == null)
				return -1;
			String string_1_ = Class206_Sub2.aString6438 + string_0_;
			if (!Class2_Sub8.aClass146_6858.method924(26, string_1_, ""))
				return -1;
			if (!Class2_Sub8.aClass146_6858.method921(string_1_, -2))
				return Class2_Sub8.aClass146_6858.method908(string_1_,
						(byte) 103);
			byte[] is = Class2_Sub8.aClass146_6858.method932(string_1_, "", 0);
			Object object = null;
			File file;
			try {
				file = Class348.method2098(string_0_, -1);
			} catch (RuntimeException runtimeexception) {
				return -1;
			}
			if (is != null && file != null) {
				boolean bool = true;
				byte[] is_2_ = Class11_Sub35_Sub1.method3567(file, 26308);
				if (is_2_ != null && is.length == is_2_.length) {
					for (int i_3_ = 0; is_2_.length > i_3_; i_3_++) {
						if ((is[i_3_] ^ 0xffffffff) != (is_2_[i_3_] ^ 0xffffffff)) {
							bool = false;
							break;
						}
					}
				} else
					bool = false;
				try {
					if (!bool)
						Class236_Sub6.aClass341_6966.method2067(0, file, is);
				} catch (Throwable throwable) {
					return -1;
				}
				Class33_Sub3.method2922(file, string, (byte) -77);
				return 100;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.A("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method3720(boolean bool) {
		try {
			Class161.method998((byte) -101);
			anInt9435++;
			if (bool != true)
				anInt9464 = 73;
			Class11_Sub2_Sub19.aBool9087 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.L(" + bool + ')');
		}
	}

	static final boolean method3721(int i, int i_4_, int i_5_) {
		try {
			if (i > -49)
				return true;
			anInt9451++;
			if (!Class155.method972(9, i_5_, i_4_)
					&& !Class376_Sub7_Sub4_Sub2.method3911(4285, i_5_, i_4_))
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pv.I(" + i + ','
					+ i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final boolean method3722(int i) {
		try {
			anInt9457++;
			if ((Class318.anInt4230 ^ 0xffffffff) != -1)
				return true;
			if (i != -21552)
				return true;
			return Class364.aClass11_Sub6_Sub2_4773.method3500((byte) 114);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.O(" + i + ')');
		}
	}

	Class11_Sub12_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		try {
			aSetupInfo9436 = new SetupInfo();
			aTheoraInfo9456 = new TheoraInfo();
			aTheoraComment9449 = new TheoraComment();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.<init>("
					+ (oggstreamstate != null ? "{...}" : "null") + ')');
		}
	}

	public static void method3723(int i) {
		try {
			if (i != -1)
				aBool9452 = false;
			aClass273_9466 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.C(" + i + ')');
		}
	}

	final float method3724(byte i) {
		try {
			anInt9443++;
			if (!aBool9442 || aTheoraInfo9456.method870())
				return 0.0F;
			if (i != -43)
				return 0.9404063F;
			return ((float) aTheoraInfo9456.fpsNumerator / (float) aTheoraInfo9456.fpsDenominator);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.B(" + i + ')');
		}
	}

	final void method2385(int i, OggPacket oggpacket) {
		try {
			anInt9461++;
			if (i == -19767) {
				if (aBool9442) {
					aLong9465 = Class137.method878((byte) -126);
					int i_6_ = aDecoderContext9446.decodePacketIn(oggpacket,
							aGranulePos9453);
					if (i_6_ < 0)
						throw new IllegalStateException(String.valueOf(i_6_));
					aDecoderContext9446.granuleFrame(aGranulePos9453);
					aDouble9455 = aDecoderContext9446
							.granuleTime(aGranulePos9453);
					if (aBool9458) {
						boolean bool = (oggpacket.isKeyFrame() ^ 0xffffffff) == -2;
						if (!bool)
							return;
						aBool9458 = false;
					}
					if (!aBool9448 || oggpacket.isKeyFrame() == 1) {
						if ((aDecoderContext9446.decodeFrame(aFrame9447) ^ 0xffffffff) != -1)
							throw new IllegalStateException(
									String.valueOf(i_6_));
						aBool9459 = true;
					}
				} else {
					int i_7_ = aSetupInfo9436.decodeHeader(aTheoraInfo9456,
							aTheoraComment9449, oggpacket);
					if (i_7_ == 0) {
						aBool9442 = true;
						if (aTheoraInfo9456.frameWidth > 2048
								|| ((aTheoraInfo9456.frameHeight ^ 0xffffffff) < -1025))
							throw new IllegalStateException();
						aDecoderContext9446 = new DecoderContext(
								aTheoraInfo9456, aSetupInfo9436);
						aGranulePos9453 = new GranulePos();
						aFrame9447 = new Frame(aTheoraInfo9456.frameWidth,
								aTheoraInfo9456.frameHeight);
						anInt9462 = aDecoderContext9446
								.getMaxPostProcessingLevel();
						method3730(anInt9445, -1);
					} else if (i_7_ < 0)
						throw new IllegalStateException(String.valueOf(i_7_));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pv.H(" + i + ','
					+ (oggpacket != null ? "{...}" : "null") + ')'));
		}
	}

	final boolean method3725(int i) {
		try {
			anInt9439++;
			if (i != -1)
				aDecoderContext9446 = null;
			return aBool9442;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.N(" + i + ')');
		}
	}

	final long method3726(int i) {
		try {
			anInt9444++;
			if (i != 0)
				method3719(null, 50);
			return aLong9465;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.D(" + i + ')');
		}
	}

	static final void method3727(int i) {
		try {
			Class98.method665();
			anInt9460++;
			for (int i_8_ = 0; i_8_ < 4; i_8_++)
				Class235.aClass338Array3217[i_8_].method2044((byte) 127);
			Class11_Sub45_Sub16_Sub2.method3928(16598);
			Class11_Sub2_Sub2.method3337((byte) -73);
			Packet.method3414(-5685);
			System.gc();
			if (i != -1)
				anInt9464 = -47;
			Class321_Sub2.aClass163_6648.ya();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.F(" + i + ')');
		}
	}

	final Class253 method3728(int i, Class163 class163) {
		try {
			anInt9454++;
			if (aFrame9447 == null)
				return null;
			if (i != -1)
				aSetupInfo9436 = null;
			if (!aBool9459 && aClass253_9440 != null)
				return aClass253_9440;
			aClass253_9440 = class163.method1038(aFrame9447.pixels, 0,
					aFrame9447.anInt5369, aFrame9447.anInt5369,
					aFrame9447.anInt5370, false);
			aBool9459 = false;
			return aClass253_9440;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("pv.K(" + i + ','
					+ (class163 != null ? "{...}" : "null") + ')'));
		}
	}

	final void method2387(int i) {
		try {
			anInt9441++;
			if (i <= -8) {
				if (aFrame9447 != null)
					aFrame9447.method871();
				if (aDecoderContext9446 != null) {
					aDecoderContext9446.method871();
					aDecoderContext9446 = null;
				}
				if (aGranulePos9453 != null) {
					aGranulePos9453.method871();
					aGranulePos9453 = null;
				}
				aTheoraInfo9456.method871();
				aTheoraComment9449.method871();
				aSetupInfo9436.method871();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.E(" + i + ')');
		}
	}

	final double method3729(int i) {
		try {
			anInt9450++;
			if (i != 2048)
				aClass273_9466 = null;
			return aDouble9455;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.G(" + i + ')');
		}
	}

	private final void method3730(int i, int i_9_) {
		do {
			try {
				if (i_9_ == -1) {
					anInt9437++;
					anInt9445 = i;
					if (!aBool9442)
						break;
					if (anInt9445 > anInt9462)
						anInt9445 = anInt9462;
					if ((anInt9445 ^ 0xffffffff) > -1)
						anInt9445 = 0;
					aDecoderContext9446.setPostProcessingLevel(anInt9445);
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "pv.M(" + i + ','
						+ i_9_ + ')');
			}
			break;
		} while (false);
	}

	static final IncomingPacket[] method3731(int i) {
		try {
			if (i != -4638)
				aClass273_9466 = null;
			anInt9438++;
			return (new IncomingPacket[] { Class234_Sub2.aClass160_5985,
					Class5.aClass160_34, Class140.aClass160_1899,
					Class11_Sub45_Sub14.aClass160_9311,
					Class11_Sub2_Sub28.aClass160_9434,
					Class28_Sub1.aClass160_6605, Class11_Sub4.aClass160_5232,
					Class11_Sub2_Sub27.SEND_VARP_SMALL_IN_PACKET,
					Class271.SEND_VARP_BIG, Class312.aClass160_4150,
					Class206_Sub3.aClass160_6836,
					Class108_Sub21.aClass160_7305, Class6.aClass160_36,
					Class254_Sub3.aClass160_8042, Class59.aClass160_882,
					Class11_Sub45_Sub9_Sub2.aClass160_10261,
					Class108_Sub13.LOCAL_NPC_UPDATE_IN_PACKET,
					Class11_Sub2_Sub31.aClass160_9645,
					Class321_Sub2.aClass160_6635,
					Class376_Sub5.ITEM_CONTAINER_UPDATE_IN_PACKET,
					Class356.aClass160_4663, Class35.aClass160_469,
					Class11_Sub2_Sub19.aClass160_9093, Class37.aClass160_483,
					Class83.aClass160_1140, Class94_Sub3.aClass160_6906,
					Class11_Sub2_Sub31.LOGOUT_IN_PACKET,
					Class234.aClass160_3206, Class227.aClass160_3134,
					Class11_Sub2_Sub30.aClass160_9616,
					Class11_Sub22.aClass160_5971, Class376_Sub3.aClass160_6114,
					Class123.aClass160_1665, Class118.PLAYER_UPDATE_IN_PACKET,
					Class239_Sub1.aClass160_7266, Class96.aClass160_1282,
					Class11_Sub12_Sub1.aClass160_8823, Class290.aClass160_3919,
					Class52.UPDATE_ITEMS_IN_PACKET,
					Class11_Sub45_Sub10.aClass160_8954,
					Class364.aClass160_4775, Class123.aClass160_1667,
					Applet_Sub1.aClass160_10466, Class378.aClass160_4921,
					Class376_Sub1.aClass160_5093, Class11_Sub8.aClass160_5302,
					Class94_Sub4.aClass160_7724, Class85.aClass160_1163,
					Class11_Sub15.aClass160_5599, Class236_Sub4.aClass160_6719,
					Class11_Sub4.aClass160_5236, Class209.aClass160_2845,
					Class59.aClass160_885, Class2_Sub6.RUN_SCRIPT_IN_PACKET,
					Class11_Sub2_Sub19.aClass160_9094, Class278.aClass160_3755,
					Class321_Sub3_Sub1.aClass160_9261,
					Class11_Sub2_Sub35.aClass160_9749, Class264.aClass160_3602,
					Class11_Sub2_Sub28.aClass160_9422,
					Class57_Sub1.aClass160_5882, Class108_Sub11.aClass160_6146,
					Class11_Sub46_Sub1.MUSIC_IN_PACKET,
					IComponentDefinitions.MUSIC_EFFECT_IN_PACKET,
					Class234_Sub1_Sub1.ICOMPONENT_TEXT_IN_PACKET, Class165.aClass160_2134,
					Class10.INDEX_14_SOUND_IN_PACKET, Class280.INDEX_15_SOUND_IN_PACKET,
					Class290.aClass160_3908, Class112.aClass160_1532,
					Class58_Sub1_Sub1.RESET_SOUNDS_IN_PACKET, Class55.aClass160_832,
					Class198.aClass160_2683, Class235.SEND_VAR_BIT_BIG,
					Class279.aClass160_3768, Class15.ICOMPONENTSETTINGS_IN_PACKET,
					Class295.aClass160_3980, Class236_Sub8.aClass160_7076,
					Class300.aClass160_4044, Class11_Sub2_Sub10.aClass160_8847,
					Class11_Sub2_Sub31.aClass160_9643,
					Class11_Sub45_Sub9.SEND_VAR_BIT_SMALL,
					Class11_Sub2_Sub8.aClass160_8747,
					Class11_Sub5.RUN_ENERGY_IN_PACKET,
					Class108_Sub2.aClass160_5079, Class193.HIDE_INTERFACE_COMPONENT_IN_PACKET,
					Class11_Sub2_Sub26.aClass160_9352, Class123.aClass160_1664,
					Class22.aClass160_190, Class3.aClass160_23,
					Class127.aClass160_1719,
					Class376_Sub2.SKILL_LEVEL_IN_PACKET,
					Class227.aClass160_3131,
					Class236_Sub8.SEND_MINIMAP_FLAG_IN_PACKET,
					Class91_Sub3.aClass160_8425, Class124.aClass160_1680,
					Applet_Sub1.aClass160_10462,
					IComponentDefinitions.aClass160_2621,
					Class11_Sub43.aClass160_7338, Class108.aClass160_1460,
					Class179.aClass160_2274,
					Class11_Sub21.GAME_MESSAGE_IN_PACKET,
					Class11_Sub6_Sub5.aClass160_9604,
					Class195_Sub1.BLACKOUT_IN_PACKET,
					Class108_Sub13.aClass160_6259,
					Class11_Sub45_Sub12.aClass160_9191,
					Class11_Sub2_Sub24.aClass160_9283,
					Class11_Sub30_Sub1.aClass160_8965, Class121.aClass160_1642,
					Class108_Sub2.aClass160_5076, Class253_Sub2.aClass160_6511,
					Class11_Sub2_Sub14.aClass160_9005, Class29.aClass160_392,
					Class360.aClass160_4693, Class31.aClass160_411,
					Class109.aClass160_1474, Class315.aClass160_4175,
					Class217_Sub1.aClass160_5540,
					Class91_Sub1_Sub1.aClass160_8981, Class71.aClass160_991,
					Class219.aClass160_3014 });
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pv.J(" + i + ')');
		}
	}
}
