/* Class11_Sub45_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

abstract class Class11_Sub45_Sub20 extends Class11_Sub45 {
	boolean aBool9735;
	boolean aBool9736;
	volatile boolean aBool9737 = true;
	static boolean[][] aBoolArrayArray9738 = { new boolean[4], new boolean[4],
			{ false, false, true, false }, { false, false, true, false },
			{ false, false, true, false }, { false, false, true, false },
			{ true, false, true, false }, { true, false, false, true },
			{ true, false, false, true }, new boolean[4], new boolean[4],
			new boolean[4], new boolean[4] };
	static int anInt9739;
	static int anInt9740;

	abstract int method3830(int i);

	public static void method3831(int i) {
		try {
			if (i < 7)
				method3834(-100);
			aBoolArrayArray9738 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vt.H(" + i + ')');
		}
	}

	static final void method3832(int i) {
		do {
			try {
				if (i == -1) {
					anInt9740++;
					Class236_Sub1.method2605((byte) 113, false);
					if (Class321.anInt4295 < 0
							|| (Class321.anInt4295 ^ 0xffffffff) == -1)
						break;
					Class239.method1521(false, 0, Class321.anInt4295);
					Class321.anInt4295 = -1;
				}
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "vt.J(" + i + ')');
			}
			break;
		} while (false);
	}

	abstract byte[] method3833(byte i);

	static final void method3834(int i) {
		try {
			if (i > 82) {
				anInt9739++;
				if ((Class11_Sub26.anInt6294 ^ 0xffffffff) > -103)
					Class11_Sub26.anInt6294 += 6;
				if ((Class108_Sub19.anInt7109 ^ 0xffffffff) != 0
						&& (Class108_Sub14.aLong6272 < Class137
								.method878((byte) -98))) {
					for (int i_0_ = Class108_Sub19.anInt7109; Class171.aStringArray2198.length > i_0_; i_0_++) {
						if (!Class171.aStringArray2198[i_0_]
								.startsWith("pause")) {
							Class267.aString3625 = Class171.aStringArray2198[i_0_];
							Class293.method1816(false, (byte) 100);
						} else {
							int i_1_ = 5;
							try {
								i_1_ = Integer
										.parseInt(Class171.aStringArray2198[i_0_]
												.substring(6));
							} catch (Exception exception) {
								/* empty */
							}
							Class314.method1912(
									("Pausing for " + i_1_ + " seconds..."),
									(byte) -100);
							Class108_Sub19.anInt7109 = i_0_ + 1;
							Class108_Sub14.aLong6272 = (Class137
									.method878((byte) -63) - -(long) (i_1_ * 1000));
							return;
						}
					}
					Class108_Sub19.anInt7109 = -1;
				}
				if (Class154.anInt2032 != 0) {
					
					Class11_Sub36.anInt7080 -= 5 * Class154.anInt2032;
					if (Class11_Sub2_Sub39.anInt9807 <= Class11_Sub36.anInt7080)
						Class11_Sub36.anInt7080 = -1
								+ Class11_Sub2_Sub39.anInt9807;
					if ((Class11_Sub36.anInt7080 ^ 0xffffffff) > -1)
						Class11_Sub36.anInt7080 = 0;
					Class154.anInt2032 = 0;
				}
				for (int i_2_ = 0; Class11_Sub26.anInt6301 > i_2_; i_2_++) {
					Interface25 interface25 = Class289.anInterface25Array3900[i_2_];
					int i_3_ = interface25.method30(123);
					char c = interface25.method56(4152);
					int i_4_ = interface25.method58(2674);
					if (i_3_ == 84)
						Class293.method1816(false, (byte) 45);
					if ((i_3_ ^ 0xffffffff) != -81) {
						if (i_3_ == 66 && (0x4 & i_4_ ^ 0xffffffff) != -1) {
							if (Class108_Sub20.aClipboard7231 != null) {
								String string = "";
								for (int i_5_ = -1
										+ (Class11_Sub2_Sub6.aStringArray8706).length; (i_5_ ^ 0xffffffff) <= -1; i_5_--) {
									if ((Class11_Sub2_Sub6.aStringArray8706[i_5_]) != null
											&& (Class11_Sub2_Sub6.aStringArray8706[i_5_]
													.length() ^ 0xffffffff) < -1)
										string += ((Class11_Sub2_Sub6.aStringArray8706[i_5_]) + '\n');
								}
								Class108_Sub20.aClipboard7231.setContents(
										new StringSelection(string), null);
							}
						} else if (i_3_ == 67 && (0x4 & i_4_) != 0) {
							if (Class108_Sub20.aClipboard7231 != null) {
								Transferable transferable = Class108_Sub20.aClipboard7231
										.getContents(null);
								if (transferable != null) {
									try {
										String string = ((String) (transferable
												.getTransferData(DataFlavor.stringFlavor)));
										if (string != null) {
											String[] strings = Class121
													.method788(11027, '\n',
															string);
											Class163_Sub2.method2980(-13841,
													strings);
										}
									} catch (Exception exception) {
										/* empty */
									}
								}
							}
						} else if ((i_3_ ^ 0xffffffff) != -86
								|| ((Class108_Sub4.anInt5385 ^ 0xffffffff) >= -1)) {
							if ((i_3_ ^ 0xffffffff) == -102
									&& (Class108_Sub4.anInt5385 < Class267.aString3625
											.length()))
								Class267.aString3625 = ((Class267.aString3625
										.substring(0, Class108_Sub4.anInt5385)) + (Class267.aString3625
										.substring(1 + Class108_Sub4.anInt5385)));
							else if (i_3_ == 96
									&& (Class108_Sub4.anInt5385 ^ 0xffffffff) < -1)
								Class108_Sub4.anInt5385--;
							else if (i_3_ != 97
									|| ((Class108_Sub4.anInt5385 ^ 0xffffffff) <= (Class267.aString3625
											.length() ^ 0xffffffff))) {
								if (i_3_ != 102) {
									if ((i_3_ ^ 0xffffffff) != -104) {
										if ((i_3_ ^ 0xffffffff) != -105
												|| ((Class11_Sub2_Sub5.anInt8559 ^ 0xffffffff) <= ((Class11_Sub2_Sub6.aStringArray8706).length ^ 0xffffffff))) {
											if (i_3_ != 105
													|| (Class11_Sub2_Sub5.anInt8559 ^ 0xffffffff) >= -1) {
												if (Class236_Sub6.method2823(c,
														-98)
														|| c == 92
														|| c == 47
														|| (c ^ 0xffffffff) == -47
														|| c == 58
														|| (c ^ 0xffffffff) == -45
														|| c == 32
														|| (c ^ 0xffffffff) == -96
														|| c == 45
														|| (c ^ 0xffffffff) == -44
														|| (c ^ 0xffffffff) == -92
														|| c == 93) {
													Class267.aString3625 = ((Class267.aString3625
															.substring(
																	0,
																	(Class108_Sub4.anInt5385)))
															+ Class289.anInterface25Array3900[i_2_]
																	.method56(4152) + (Class267.aString3625
															.substring(Class108_Sub4.anInt5385)));
													Class108_Sub4.anInt5385++;
												}
											} else {
												Class11_Sub2_Sub5.anInt8559--;
												Class234.method1497(46);
												Class108_Sub4.anInt5385 = Class267.aString3625
														.length();
											}
										} else {
											Class11_Sub2_Sub5.anInt8559++;
											Class234.method1497(-122);
											Class108_Sub4.anInt5385 = Class267.aString3625
													.length();
										}
									} else
										Class108_Sub4.anInt5385 = Class267.aString3625
												.length();
								} else
									Class108_Sub4.anInt5385 = 0;
							} else
								Class108_Sub4.anInt5385++;
						} else {
							Class267.aString3625 = ((Class267.aString3625
									.substring(0, -1 + Class108_Sub4.anInt5385)) + Class267.aString3625
									.substring(Class108_Sub4.anInt5385));
							Class108_Sub4.anInt5385--;
						}
					} else
						Class293.method1816(true, (byte) 62);
				}
				Class304.anInt4091 = 0;
				Class11_Sub26.anInt6301 = 0;
				Class307.method1879(-101);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "vt.I(" + i + ')');
		}
	}

	public Class11_Sub45_Sub20() {
		/* empty */
	}
}
