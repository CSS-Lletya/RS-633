/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class292 {
	static int anInt3945;
	static int anInt3946;
	int anInt3947;
	static int anInt3948;
	static int anInt3949;
	static int anInt3950;
	int anInt3951;
	private byte[] aByteArray3952;
	static int anInt3953;
	static int anInt3954;
	static int anInt3955;
	static int anInt3956;
	static int anInt3957;
	static int anInt3958;
	int anInt3959;
	private byte[][] aByteArrayArray3960;
	static int anInt3961;
	static int anInt3962 = 0;

	final int method1804(Class253[] class253s, int i, String string) {
		try {
			anInt3950++;
			if (string == null)
				return 0;
			int i_0_ = -1;
			int i_1_ = -1;
			int i_2_ = 0;
			int i_3_ = string.length();
			if (i < 7)
				method1809(-3, null, 90, -27, null);
			for (int i_4_ = 0; (i_3_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
				char c = string.charAt(i_4_);
				if ((c ^ 0xffffffff) == -61)
					i_0_ = i_4_;
				else {
					if ((c ^ 0xffffffff) == -63 && i_0_ != -1) {
						String string_5_ = string.substring(i_0_ + 1, i_4_);
						i_0_ = -1;
						if (string_5_.equals("lt"))
							c = '<';
						else if (!string_5_.equals("gt")) {
							if (!string_5_.equals("nbsp")) {
								if (!string_5_.equals("shy")) {
									if (!string_5_.equals("times")) {
										if (!string_5_.equals("euro")) {
											if (string_5_.equals("copy"))
												c = '\u00a9';
											else {
												if (!string_5_.equals("reg")) {
													if (string_5_
															.startsWith("img=")
															&& class253s != null) {
														try {
															int i_6_ = (Class173
																	.method1139(
																			(string_5_
																					.substring(4)),
																			-23213));
															i_1_ = -1;
															i_2_ += (class253s[i_6_]
																	.method1608());
														} catch (Exception exception) {
															/* empty */
														}
													}
													continue;
												}
												c = '\u00ae';
											}
										} else
											c = '\u20ac';
									} else
										c = '\u00d7';
								} else
									c = '\u00ad';
							} else
								c = '\u00a0';
						} else
							c = '>';
					}
					if (i_0_ == -1) {
						i_2_ += 0xff & (aByteArray3952[Class355.method2125(c,
								-8910) & 0xff]);
						if (aByteArrayArray3960 != null
								&& (i_1_ ^ 0xffffffff) != 0)
							i_2_ += aByteArrayArray3960[i_1_][c];
						i_1_ = c;
					}
				}
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.E("
					+ (class253s != null ? "{...}" : "null") + ',' + i + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1805(String string, byte i) {
		try {
			anInt3954++;
			if (i >= -1)
				((Class292) this).anInt3947 = 0;
			return method1804(null, 106, string);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qm.C("
					+ (string != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1806(String string, String[] strings, int[] is, int i,
			Class253[] class253s) {
		try {
			anInt3945++;
			if (i != 60)
				return 101;
			if (string == null)
				return 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = -1;
			int i_10_ = 0;
			int i_11_ = 0;
			int i_12_ = -1;
			int i_13_ = -1;
			int i_14_ = 0;
			int i_15_ = string.length();
			for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff); i_16_++) {
				int i_17_ = 0xff & Class355.method2125(string.charAt(i_16_),
						-8910);
				int i_18_ = 0;
				if ((i_17_ ^ 0xffffffff) == -61)
					i_12_ = i_16_;
				else {
					int i_19_;
					if ((i_12_ ^ 0xffffffff) == 0) {
						i_19_ = i_16_;
						i_18_ += method1810(i_17_, i ^ 0x1be9);
						if (aByteArrayArray3960 != null && i_13_ != -1)
							i_18_ += aByteArrayArray3960[i_13_][i_17_];
						i_13_ = i_17_;
					} else {
						if (i_17_ != 62)
							continue;
						i_19_ = i_12_;
						String string_20_ = string.substring(1 + i_12_, i_16_);
						i_12_ = -1;
						if (!string_20_.equals("br")) {
							if (string_20_.equals("lt")) {
								i_18_ += method1810(60, 7125);
								if (aByteArrayArray3960 != null && i_13_ != -1)
									i_18_ += aByteArrayArray3960[i_13_][60];
								i_13_ = 60;
							} else if (!string_20_.equals("gt")) {
								if (!string_20_.equals("nbsp")) {
									if (string_20_.equals("shy")) {
										i_18_ += method1810(173, 7125);
										if (aByteArrayArray3960 != null
												&& i_13_ != -1)
											i_18_ += (aByteArrayArray3960[i_13_][173]);
										i_13_ = 173;
									} else if (string_20_.equals("times")) {
										i_18_ += method1810(215, 7125);
										if (aByteArrayArray3960 != null
												&& i_13_ != -1)
											i_18_ += (aByteArrayArray3960[i_13_][215]);
										i_13_ = 215;
									} else if (!string_20_.equals("euro")) {
										if (string_20_.equals("copy")) {
											i_18_ += method1810(169, 7125);
											if (aByteArrayArray3960 != null
													&& (i_13_ ^ 0xffffffff) != 0)
												i_18_ += (aByteArrayArray3960[i_13_][169]);
											i_13_ = 169;
										} else if (!string_20_.equals("reg")) {
											if (string_20_.startsWith("img=")
													&& class253s != null) {
												try {
													int i_21_ = (Class173
															.method1139(
																	string_20_
																			.substring(4),
																	i ^ ~0x5a90));
													i_18_ += class253s[i_21_]
															.method1608();
													i_13_ = -1;
												} catch (Exception exception) {
													/* empty */
												}
											}
										} else {
											i_18_ += method1810(174, 7125);
											if (aByteArrayArray3960 != null
													&& (i_13_ ^ 0xffffffff) != 0)
												i_18_ += (aByteArrayArray3960[i_13_][174]);
											i_13_ = 174;
										}
									} else {
										i_18_ += method1810(8364, 7125);
										if (aByteArrayArray3960 != null
												&& (i_13_ ^ 0xffffffff) != 0)
											i_18_ += (aByteArrayArray3960[i_13_][8364]);
										i_13_ = 8364;
									}
								} else {
									i_18_ += method1810(160, 7125);
									if (aByteArrayArray3960 != null
											&& (i_13_ ^ 0xffffffff) != 0)
										i_18_ += aByteArrayArray3960[i_13_][160];
									i_13_ = 160;
								}
							} else {
								i_18_ += method1810(62, 7125);
								if (aByteArrayArray3960 != null
										&& (i_13_ ^ 0xffffffff) != 0)
									i_18_ += aByteArrayArray3960[i_13_][62];
								i_13_ = 62;
							}
						} else {
							strings[i_14_] = string.substring(i_8_, i_16_ + 1);
							if ((++i_14_ ^ 0xffffffff) <= (strings.length ^ 0xffffffff))
								return 0;
							i_9_ = -1;
							i_7_ = 0;
							i_8_ = i_16_ + 1;
							i_13_ = -1;
							continue;
						}
						i_17_ = -1;
					}
					if (i_18_ > 0) {
						i_7_ += i_18_;
						if (is != null) {
							if ((i_17_ ^ 0xffffffff) == -33) {
								i_11_ = 1;
								i_10_ = i_7_;
								i_9_ = i_16_;
							}
							if (i_7_ > is[((i_14_ ^ 0xffffffff) > (is.length ^ 0xffffffff) ? i_14_
									: -1 + is.length)]) {
								if ((i_9_ ^ 0xffffffff) <= -1) {
									strings[i_14_] = string.substring(i_8_,
											-i_11_ + (1 + i_9_));
									if (++i_14_ >= strings.length)
										return 0;
									i_8_ = 1 + i_9_;
									i_13_ = -1;
									i_7_ -= i_10_;
									i_9_ = -1;
								} else {
									strings[i_14_] = string.substring(i_8_,
											i_19_);
									i_14_++;
									if (strings.length <= i_14_)
										return 0;
									i_9_ = -1;
									i_7_ = i_18_;
									i_13_ = -1;
									i_8_ = i_19_;
								}
							}
							if (i_17_ == 45) {
								i_10_ = i_7_;
								i_11_ = 0;
								i_9_ = i_16_;
							}
						}
					}
				}
			}
			if (string.length() > i_8_) {
				strings[i_14_] = string.substring(i_8_, string.length());
				i_14_++;
			}
			return i_14_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.D("
					+ (string != null ? "{...}" : "null") + ','
					+ (strings != null ? "{...}" : "null") + ','
					+ (is != null ? "{...}" : "null") + ',' + i + ','
					+ (class253s != null ? "{...}" : "null") + ')'));
		}
	}

	static final Class1 method1807(Component component, int i) {
		try {
			anInt3958++;
			if (i != 13764)
				anInt3962 = -80;
			return new Class1_Sub1(component);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qm.K("
					+ (component != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	final int method1808(int i, boolean bool, char c) {
		try {
			anInt3961++;
			if (bool != false)
				return 20;
			if (aByteArrayArray3960 != null)
				return aByteArrayArray3960[i][c];
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.B(" + i + ','
					+ bool + ',' + c + ')'));
		}
	}

	final int method1809(int i, String string, int i_22_, int i_23_,
			Class253[] class253s) {
		try {
			anInt3946++;
			if (i == i_23_)
				i_23_ = ((Class292) this).anInt3947;
			int i_24_ = method1806(string, Class11_Sub48.aStringArray8005,
					new int[] { i_22_ }, 60, class253s);
			int i_25_ = (i_24_ - 1) * i_23_;
			return (((Class292) this).anInt3959 + ((Class292) this).anInt3951 - -i_25_);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qm.G(" + i + ',' + (string != null ? "{...}" : "null")
							+ ',' + i_22_ + ',' + i_23_ + ','
							+ (class253s != null ? "{...}" : "null") + ')'));
		}
	}

	final int method1810(int i, int i_26_) {
		try {
			anInt3949++;
			if (i_26_ != 7125)
				return 94;
			return 0xff & aByteArray3952[i];
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qm.A(" + i + ','
					+ i_26_ + ')');
		}
	}

	final int method1811(int i, int i_27_, String string, Class253[] class253s) {
		try {
			anInt3948++;
			if (i != 174)
				method1806(null, null, null, -120, null);
			int i_28_ = method1806(string, Class11_Sub48.aStringArray8005,
					new int[] { i_27_ }, 60, class253s);
			int i_29_ = 0;
			for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
				int i_31_ = method1804(class253s, 84,
						Class11_Sub48.aStringArray8005[i_30_]);
				if (i_31_ > i_29_)
					i_29_ = i_31_;
			}
			return i_29_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.I(" + i + ','
					+ i_27_ + ',' + (string != null ? "{...}" : "null") + ','
					+ (class253s != null ? "{...}" : "null") + ')'));
		}
	}

	final String method1812(int i, String string, int i_32_,
			Class253[] class253s) {
		try {
			anInt3957++;
			if (method1804(class253s, 37, string) <= i_32_)
				return string;
			i_32_ -= method1804(null, 105, "...");
			int i_33_ = -1;
			int i_34_ = -1;
			int i_35_ = 0;
			int i_36_ = -29 / ((-65 - i) / 33);
			int i_37_ = string.length();
			String string_38_ = "";
			for (int i_39_ = 0; i_37_ > i_39_; i_39_++) {
				char c = string.charAt(i_39_);
				if ((c ^ 0xffffffff) == -61)
					i_33_ = i_39_;
				else {
					if ((c ^ 0xffffffff) == -63 && (i_33_ ^ 0xffffffff) != 0) {
						String string_40_ = string.substring(1 + i_33_, i_39_);
						i_33_ = -1;
						if (string_40_.equals("lt"))
							c = '<';
						else if (!string_40_.equals("gt")) {
							if (string_40_.equals("nbsp"))
								c = '\u00a0';
							else if (!string_40_.equals("shy")) {
								if (!string_40_.equals("times")) {
									if (string_40_.equals("euro"))
										c = '\u20ac';
									else if (!string_40_.equals("copy")) {
										if (!string_40_.equals("reg")) {
											if (string_40_.startsWith("img=")
													&& class253s != null) {
												try {
													int i_41_ = (Class173
															.method1139(
																	string_40_
																			.substring(4),
																	-23213));
													i_34_ = -1;
													i_35_ += class253s[i_41_]
															.method1608();
													if ((i_35_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff))
														return (string_38_ + "...");
													string_38_ = (string
															.substring(0,
																	1 + i_39_));
												} catch (Exception exception) {
													/* empty */
												}
											}
											continue;
										}
										c = '\u00ae';
									} else
										c = '\u00a9';
								} else
									c = '\u00d7';
							} else
								c = '\u00ad';
						} else
							c = '>';
					}
					if (i_33_ == -1) {
						i_35_ += aByteArray3952[(Class355.method2125(c, -8910) & 0xff)] & 0xff;
						if (aByteArrayArray3960 != null && i_34_ != -1)
							i_35_ += aByteArrayArray3960[i_34_][c];
						i_34_ = c;
						int i_42_ = i_35_;
						if (aByteArrayArray3960 != null)
							i_42_ += aByteArrayArray3960[c][46];
						if ((i_32_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff))
							return string_38_ + "...";
						string_38_ = string.substring(0, i_39_ + 1);
					}
				}
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.F(" + i + ','
					+ (string != null ? "{...}" : "null") + ',' + i_32_ + ','
					+ (class253s != null ? "{...}" : "null") + ')'));
		}
	}

	Class292(byte[] is) {
		try {
			Stream stream = new Stream(is);
			int i = stream.readUnsignedByte((byte) 35);
			if (i != 0)
				throw new RuntimeException("");
			boolean bool = stream.readUnsignedByte((byte) 35) == 1;
			aByteArray3952 = new byte[256];
			stream.readBytes(aByteArray3952, 4, 256, 0);
			if (!bool)
				((Class292) this).anInt3947 = stream
						.readUnsignedByte((byte) 35);
			else {
				int[] is_43_ = new int[256];
				int[] is_44_ = new int[256];
				for (int i_45_ = 0; i_45_ < 256; i_45_++)
					is_43_[i_45_] = stream.readUnsignedByte((byte) 35);
				for (int i_46_ = 0; (i_46_ ^ 0xffffffff) > -257; i_46_++)
					is_44_[i_46_] = stream.readUnsignedByte((byte) 35);
				byte[][] is_47_ = new byte[256][];
				for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > -257; i_48_++) {
					is_47_[i_48_] = new byte[is_43_[i_48_]];
					byte i_49_ = 0;
					for (int i_50_ = 0; i_50_ < is_47_[i_48_].length; i_50_++) {
						i_49_ += stream.readByte(1854307120);
						is_47_[i_48_][i_50_] = i_49_;
					}
				}
				byte[][] is_51_ = new byte[256][];
				for (int i_52_ = 0; i_52_ < 256; i_52_++) {
					is_51_[i_52_] = new byte[is_43_[i_52_]];
					byte i_53_ = 0;
					for (int i_54_ = 0; ((i_54_ ^ 0xffffffff) > (is_51_[i_52_].length ^ 0xffffffff)); i_54_++) {
						i_53_ += stream.readByte(1854307120);
						is_51_[i_52_][i_54_] = i_53_;
					}
				}
				aByteArrayArray3960 = new byte[256][256];
				for (int i_55_ = 0; i_55_ < 256; i_55_++) {
					if ((i_55_ ^ 0xffffffff) != -33
							&& (i_55_ ^ 0xffffffff) != -161) {
						for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > -257; i_56_++) {
							if ((i_56_ ^ 0xffffffff) != -33
									&& (i_56_ ^ 0xffffffff) != -161)
								aByteArrayArray3960[i_55_][i_56_] = (byte) (Class254_Sub2
										.method2830(is_47_, aByteArray3952,
												is_44_, 255, i_55_, is_51_,
												i_56_, is_43_));
						}
					}
				}
				((Class292) this).anInt3947 = is_44_[32] + is_43_[32];
			}
			stream.readUnsignedByte((byte) 35);
			stream.readUnsignedByte((byte) 35);
			((Class292) this).anInt3951 = stream.readUnsignedByte((byte) 35);
			((Class292) this).anInt3959 = stream.readUnsignedByte((byte) 35);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "qm.<init>("
					+ (is != null ? "{...}" : "null") + ')');
		}
	}

	final int method1813(byte i, String string, Class253[] class253s, int i_57_) {
		try {
			int i_58_ = 113 % ((8 - i) / 50);
			anInt3956++;
			return method1806(string, Class11_Sub48.aStringArray8005,
					new int[] { i_57_ }, 60, class253s);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("qm.H(" + i + ',' + (string != null ? "{...}" : "null")
							+ ',' + (class253s != null ? "{...}" : "null")
							+ ',' + i_57_ + ')'));
		}
	}

	static final int[] method1814(int i, Class11_Sub10 class11_sub10) {
		try {
			anInt3953++;
			Stream stream = new Stream(518);
			int[] is = new int[4];
			for (int i_59_ = 0; i_59_ < 4; i_59_++)
				is[i_59_] = (int) (Math.random() * 9.9999999E7);
			stream.writeByte(10, i + -1528080564);
			stream.writeInt(-49, is[0]);
			stream.writeInt(-49, is[1]);
			stream.writeInt(-49, is[2]);
			stream.writeInt(-49, is[3]);
			if (i != 9108)
				method1807(null, 107);
			for (int i_60_ = 0; i_60_ < 10; i_60_++)
				stream.writeInt(-49, (int) (9.9999999E7 * Math.random()));
			stream.writeShort(-120, (int) (9.9999999E7 * Math.random()));
			stream.encodeRSA(Class11_Sub2_Sub5.loginExponentRSA, 22832,
					Class11_Sub46.loginModulusRSA);
			((Class11_Sub10) class11_sub10).aClass11_Sub20_Sub1_5397
					.writeBytes(true, ((Stream) stream).buffer,
							((Stream) stream).position, 0);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("qm.J(" + i + ','
					+ (class11_sub10 != null ? "{...}" : "null") + ')'));
		}
	}
}
