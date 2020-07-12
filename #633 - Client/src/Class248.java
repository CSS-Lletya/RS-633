/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class248 {
	private int anInt3341;
	boolean aBool3342;
	static int anInt3343;
	short[] aShortArray3344;
	int anInt3345;
	static int anInt3346;
	static int anInt3347;
	private int anInt3348;
	static int[] anIntArray3349 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	boolean aBool3350;
	private int anInt3351;
	static int anInt3352;
	int anInt3353;
	static int anInt3354;
	static int anInt3355;
	private int anInt3356;
	Class11_Sub46 aClass11_Sub46_3357;
	private int anInt3358;

	public static void method1570(int i) {
		try {
			if (i != 16)
				method1570(60);
			anIntArray3349 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nj.D(" + i + ')');
		}
	}

	static final void method1571(Color color, int i, Color color_0_, int i_1_,
			String string, Color color_2_) {
		try {
			try {
				Graphics graphics = Class11_Sub45_Sub13.aCanvas9308
						.getGraphics();
				if (Class153.aFont2026 == null)
					Class153.aFont2026 = new Font("Helvetica", 1, 13);
				if (color_0_ == null)
					color_0_ = new Color(140, 17, 17);
				if (color == null)
					color = new Color(140, 17, 17);
				if (color_2_ == null)
					color_2_ = new Color(255, 255, 255);
				try {
					if (Class11_Sub45_Sub10.anImage8960 == null)
						Class11_Sub45_Sub10.anImage8960 = (Class11_Sub45_Sub13.aCanvas9308
								.createImage(Class11_Sub36.anInt7079,
										Class153.anInt2025));
					Graphics graphics_3_ = Class11_Sub45_Sub10.anImage8960
							.getGraphics();
					graphics_3_.setColor(Color.black);
					graphics_3_.fillRect(i_1_, 0, Class11_Sub36.anInt7079,
							Class153.anInt2025);
					int i_4_ = -152 + Class11_Sub36.anInt7079 / 2;
					int i_5_ = Class153.anInt2025 / 2 - 18;
					graphics_3_.setColor(color);
					graphics_3_.drawRect(i_4_, i_5_, 303, 33);
					graphics_3_.setColor(color_0_);
					graphics_3_.fillRect(2 + i_4_, i_5_ + 2, 3 * i, 30);
					graphics_3_.setColor(Color.black);
					graphics_3_.drawRect(1 + i_4_, i_5_ + 1, 301, 31);
					graphics_3_.fillRect(3 * i + i_4_ + 2, 2 + i_5_,
							300 - 3 * i, 30);
					graphics_3_.setFont(Class153.aFont2026);
					graphics_3_.setColor(color_2_);
					graphics_3_.drawString(string,
							i_4_ - -((304 + -(6 * string.length())) / 2),
							22 + i_5_);
					if (RuntimeException_Sub1.aString9965 != null) {
						graphics_3_.setFont(Class153.aFont2026);
						graphics_3_.setColor(color_2_);
						graphics_3_
								.drawString(
										(RuntimeException_Sub1.aString9965),
										(Class11_Sub36.anInt7079 / 2 + -(6 * RuntimeException_Sub1.aString9965
												.length() / 2)), -26
												+ Class153.anInt2025 / 2);
					}
					graphics.drawImage(Class11_Sub45_Sub10.anImage8960, 0, 0,
							null);
				} catch (Exception exception) {
					graphics.setColor(Color.black);
					graphics.fillRect(0, 0, Class11_Sub36.anInt7079,
							Class153.anInt2025);
					int i_6_ = -152 + Class11_Sub36.anInt7079 / 2;
					int i_7_ = -18 + Class153.anInt2025 / 2;
					graphics.setColor(color);
					graphics.drawRect(i_6_, i_7_, 303, 33);
					graphics.setColor(color_0_);
					graphics.fillRect(i_6_ + 2, 2 + i_7_, i * 3, 30);
					graphics.setColor(Color.black);
					graphics.drawRect(i_6_ + 1, 1 + i_7_, 301, 31);
					graphics.fillRect(2 + (i_6_ - -(i * 3)), 2 + i_7_,
							300 - 3 * i, 30);
					graphics.setFont(Class153.aFont2026);
					graphics.setColor(color_2_);
					if (RuntimeException_Sub1.aString9965 != null) {
						graphics.setFont(Class153.aFont2026);
						graphics.setColor(color_2_);
						graphics.drawString(
								RuntimeException_Sub1.aString9965,
								(Class11_Sub36.anInt7079 / 2 - (RuntimeException_Sub1.aString9965
										.length() * 6 / 2)),
								Class153.anInt2025 / 2 - 26);
					}
					graphics.drawString(string,
							((304 + -(6 * string.length())) / 2 + i_6_),
							i_7_ + 22);
				}
			} catch (Exception exception) {
				Class11_Sub45_Sub13.aCanvas9308.repaint();
			}
			anInt3355++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nj.E("
					+ (color != null ? "{...}" : "null") + ',' + i + ','
					+ (color_0_ != null ? "{...}" : "null") + ',' + i_1_ + ','
					+ (string != null ? "{...}" : "null") + ','
					+ (color_2_ != null ? "{...}" : "null") + ')'));
		}
	}

	final void method1572(byte i, int i_8_, int i_9_, int i_10_, int i_11_) {
		do {
			try {
				anInt3348 = i_11_;
				anInt3358 = i_8_;
				anInt3346++;
				anInt3356 = i_9_;
				anInt3341 = i_10_;
				if (i > 48)
					break;
				method1574(true, 78, -36);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("nj.C(" + i + ','
						+ i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
			}
			break;
		} while (false);
	}

	private final void method1573(int i, int i_12_, Class163 class163,
			byte i_13_, int i_14_, int i_15_, int i_16_) {
		do {
			try {
				((Class248) this).aClass11_Sub46_3357 = class163.method1073(i,
						i_14_, i_16_, i_12_, i_15_, 1.0F);
				anInt3343++;
				if (i_13_ > 55)
					break;
				((Class248) this).aBool3342 = false;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("nj.A(" + i + ',' + i_12_ + ','
								+ (class163 != null ? "{...}" : "null") + ','
								+ i_13_ + ',' + i_14_ + ',' + i_15_ + ','
								+ i_16_ + ')'));
			}
			break;
		} while (false);
	}

	final void method1574(boolean bool, int i, int i_17_) {
		try {
			anInt3352++;
			if (i != 18223)
				((Class248) this).aBool3350 = true;
			int i_18_;
			while_61_: do {
				if (!bool) {
					int i_19_ = 0x7ff & anInt3351 - -(i_17_ * anInt3356 / 50);
					int i_20_ = anInt3348;
					while_60_: do {
						while_59_: do {
							while_58_: do {
								do {
									if ((i_20_ ^ 0xffffffff) != -2) {
										if ((i_20_ ^ 0xffffffff) != -4) {
											if (i_20_ != 4) {
												if ((i_20_ ^ 0xffffffff) != -3) {
													if (i_20_ == 5)
														break while_59_;
													break while_60_;
												}
											} else
												break;
											break while_58_;
										}
									} else {
										i_18_ = ((Class335.anIntArray4436[i_19_ << 3]) >> 4) + 1024;
										break while_61_;
									}
									i_18_ = (Class376_Sub7_Sub2_Sub2.anIntArray10250[i_19_]) >> 1;
									break while_61_;
								} while (false);
								i_18_ = i_19_ >> 10 << 11;
								break while_61_;
							} while (false);
							i_18_ = i_19_;
							break while_61_;
						} while (false);
						i_18_ = ((i_19_ ^ 0xffffffff) > -1025 ? i_19_
								: 2048 + -i_19_) << 1;
						break while_61_;
					} while (false);
					i_18_ = 2048;
				} else
					i_18_ = 2048;
			} while (false);
			((Class248) this).aClass11_Sub46_3357.method3202(
					(float) ((anInt3341 * i_18_ >> 11) + anInt3358) / 2048.0F,
					65536);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nj.B(" + bool + ','
					+ i + ',' + i_17_ + ')'));
		}
	}

	private final void method1575(byte i) {
		try {
			int i_21_ = ((Class248) this).anInt3353;
			while_75_: do {
				while_74_: do {
					while_73_: do {
						while_72_: do {
							while_71_: do {
								while_70_: do {
									while_69_: do {
										while_68_: do {
											while_67_: do {
												while_66_: do {
													while_65_: do {
														while_64_: do {
															while_63_: do {
																while_62_: do {
																	do {
																		if (i_21_ != 2) {
																			if (i_21_ != 3) {
																				if ((i_21_ ^ 0xffffffff) != -5) {
																					if (i_21_ != 5) {
																						if (i_21_ != 12) {
																							if (i_21_ != 13) {
																								if ((i_21_ ^ 0xffffffff) != -11) {
																									if (i_21_ != 11) {
																										if ((i_21_ ^ 0xffffffff) != -7) {
																											if (i_21_ != 7) {
																												if (i_21_ != 8) {
																													if ((i_21_ ^ 0xffffffff) != -10) {
																														if ((i_21_ ^ 0xffffffff) != -15) {
																															if (i_21_ != 15) {
																																if (i_21_ == 16)
																																	break while_73_;
																																break while_74_;
																															}
																														} else
																															break while_71_;
																														break while_72_;
																													}
																												} else
																													break while_69_;
																												break while_70_;
																											}
																										} else
																											break while_67_;
																										break while_68_;
																									}
																								} else
																									break while_65_;
																								break while_66_;
																							}
																						} else
																							break while_63_;
																						break while_64_;
																					}
																				} else
																					break;
																				break while_62_;
																			}
																		} else {
																			anInt3348 = 1;
																			anInt3341 = 2048;
																			anInt3358 = 0;
																			anInt3356 = 2048;
																			break while_75_;
																		}
																		anInt3348 = 1;
																		anInt3358 = 0;
																		anInt3341 = 2048;
																		anInt3356 = 4096;
																		break while_75_;
																	} while (false);
																	anInt3341 = 2048;
																	anInt3356 = 2048;
																	anInt3348 = 4;
																	anInt3358 = 0;
																	break while_75_;
																} while (false);
																anInt3341 = 2048;
																anInt3356 = 8192;
																anInt3348 = 4;
																anInt3358 = 0;
																break while_75_;
															} while (false);
															anInt3356 = 2048;
															anInt3348 = 2;
															anInt3341 = 2048;
															anInt3358 = 0;
															break while_75_;
														} while (false);
														anInt3341 = 2048;
														anInt3358 = 0;
														anInt3348 = 2;
														anInt3356 = 8192;
														break while_75_;
													} while (false);
													anInt3348 = 3;
													anInt3358 = 1536;
													anInt3356 = 2048;
													anInt3341 = 512;
													break while_75_;
												} while (false);
												anInt3356 = 4096;
												anInt3358 = 1536;
												anInt3348 = 3;
												anInt3341 = 512;
												break while_75_;
											} while (false);
											anInt3356 = 2048;
											anInt3341 = 768;
											anInt3358 = 1280;
											anInt3348 = 3;
											break while_75_;
										} while (false);
										anInt3356 = 4096;
										anInt3341 = 768;
										anInt3358 = 1280;
										anInt3348 = 3;
										break while_75_;
									} while (false);
									anInt3341 = 1024;
									anInt3348 = 3;
									anInt3356 = 2048;
									anInt3358 = 1024;
									break while_75_;
								} while (false);
								anInt3356 = 4096;
								anInt3341 = 1024;
								anInt3348 = 3;
								anInt3358 = 1024;
								break while_75_;
							} while (false);
							anInt3341 = 768;
							anInt3358 = 1280;
							anInt3348 = 1;
							anInt3356 = 2048;
							break while_75_;
						} while (false);
						anInt3341 = 512;
						anInt3356 = 4096;
						anInt3348 = 1;
						anInt3358 = 1536;
						break while_75_;
					} while (false);
					anInt3341 = 256;
					anInt3356 = 8192;
					anInt3358 = 1792;
					anInt3348 = 1;
					break while_75_;
				} while (false);
				anInt3341 = 2048;
				anInt3356 = 2048;
				anInt3348 = 0;
				anInt3358 = 0;
			} while (false);
			if (i == -80)
				anInt3347++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nj.F(" + i + ')');
		}
	}

	protected Class248() {
		try {
			if (Class376_Sub7_Sub2_Sub2.anIntArray10250 == null)
				Class11_Sub15.method2424(false);
			method1575((byte) -80);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "nj.<init>(" + ')');
		}
	}

	Class248(Class163 class163, Stream stream, int i) {
		try {
			if (Class376_Sub7_Sub2_Sub2.anIntArray10250 == null)
				Class11_Sub15.method2424(false);
			((Class248) this).anInt3345 = stream.readUnsignedByte((byte) 35);
			((Class248) this).aBool3350 = (0x10 & ((Class248) this).anInt3345 ^ 0xffffffff) != -1;
			((Class248) this).aBool3342 = (0x8 & ((Class248) this).anInt3345) != 0;
			((Class248) this).anInt3345 = 0x7 & ((Class248) this).anInt3345;
			int i_22_ = stream.readUnsignedShort((byte) -65) << i;
			int i_23_ = stream.readUnsignedShort((byte) -65) << i;
			int i_24_ = stream.readUnsignedShort((byte) -65) << i;
			int i_25_ = stream.readUnsignedByte((byte) 35);
			int i_26_ = 1 + i_25_ * 2;
			((Class248) this).aShortArray3344 = new short[i_26_];
			for (int i_27_ = 0; ((((Class248) this).aShortArray3344.length ^ 0xffffffff) < (i_27_ ^ 0xffffffff)); i_27_++) {
				int i_28_ = (short) stream.readUnsignedShort((byte) -65);
				int i_29_ = i_28_ >>> 8;
				int i_30_ = 0xff & i_28_;
				if ((i_26_ ^ 0xffffffff) >= (i_29_ ^ 0xffffffff))
					i_29_ = -1 + i_26_;
				if ((-i_29_ + i_26_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff))
					i_30_ = -i_29_ + i_26_;
				((Class248) this).aShortArray3344[i_27_] = (short) Class173
						.method1134(i_30_, i_29_ << 8);
			}
			i_25_ = (i_25_ << Class11_Sub2_Sub8.anInt8751) + Class19.anInt152;
			int i_31_ = (Class27.anIntArray359 != null ? Class27.anIntArray359[stream
					.readUnsignedShort((byte) -65)]
					: (Class219_Sub1.anIntArray7248[(Class147.method942(0,
							stream.readUnsignedShort((byte) -65)) & 0xffff)]));
			int i_32_ = stream.readUnsignedByte((byte) 35);
			((Class248) this).anInt3353 = i_32_ & 0x1f;
			anInt3351 = (i_32_ & 0xe0) << 3;
			if (((Class248) this).anInt3353 != 31)
				method1575((byte) -80);
			method1573(i_22_, i_25_, class163, (byte) 119, i_24_, i_31_, i_23_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("nj.<init>("
					+ (class163 != null ? "{...}" : "null") + ','
					+ (stream != null ? "{...}" : "null") + ',' + i + ')'));
		}
	}
}
