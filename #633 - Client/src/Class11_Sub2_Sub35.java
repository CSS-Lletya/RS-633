/* Class11_Sub2_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class11_Sub2_Sub35 extends Class11_Sub2 {
	static int anInt9745;
	static int anInt9746;
	private int anInt9747 = 6;
	static int anInt9748;
	static IncomingPacket aClass160_9749 = new IncomingPacket(57, -2);
	static int anInt9750;

	public static void method3836(int i) {
		try {
			if (i != 4096)
				method3837(73, -125, -1, -51, null, 65);
			aClass160_9749 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wv.E(" + i + ')');
		}
	}

	final int[][] method2255(int i, int i_0_) {
		try {
			if (i_0_ != 1)
				aClass160_9749 = null;
			anInt9748++;
			int[][] is = ((Class11_Sub2) this).aClass291_5038.method1799(0, i);
			while_173_: do {
				if (((Class291) ((Class11_Sub2) this).aClass291_5038).aBool3943) {
					int[][] is_1_ = this.method2262(i, 126, 0);
					int[][] is_2_ = this.method2262(i, i_0_ + 124, 1);
					int[] is_3_ = is[0];
					int[] is_4_ = is[1];
					int[] is_5_ = is[2];
					int[] is_6_ = is_1_[0];
					int[] is_7_ = is_1_[1];
					int[] is_8_ = is_1_[2];
					int[] is_9_ = is_2_[0];
					int[] is_10_ = is_2_[1];
					int[] is_11_ = is_2_[2];
					int i_12_ = anInt9747;
					while_172_: do {
						while_171_: do {
							while_170_: do {
								while_169_: do {
									while_168_: do {
										while_167_: do {
											while_166_: do {
												while_165_: do {
													while_164_: do {
														do {
															if (i_12_ != 1) {
																if (i_12_ != 2) {
																	if (i_12_ != 3) {
																		if (i_12_ != 4) {
																			if ((i_12_ ^ 0xffffffff) != -6) {
																				if (i_12_ != 6) {
																					if ((i_12_ ^ 0xffffffff) != -8) {
																						if (i_12_ != 8) {
																							if (i_12_ != 9) {
																								if (i_12_ != 10) {
																									if (i_12_ != 11) {
																										if ((i_12_ ^ 0xffffffff) != -13)
																											break while_173_;
																									} else
																										break while_171_;
																									break while_172_;
																								}
																							} else
																								break while_169_;
																							break while_170_;
																						}
																					} else
																						break while_167_;
																					break while_168_;
																				}
																			} else
																				break while_165_;
																			break while_166_;
																		}
																	} else
																		break;
																	break while_164_;
																}
															} else {
																for (i_12_ = 0; (i_12_ < (Class33_Sub2.anInt6696)); i_12_++) {
																	is_3_[i_12_] = ((is_6_[i_12_]) - -is_9_[i_12_]);
																	is_4_[i_12_] = ((is_10_[i_12_]) + is_7_[i_12_]);
																	is_5_[i_12_] = ((is_8_[i_12_]) - -is_11_[i_12_]);
																}
																break while_173_;
															}
															for (i_12_ = 0; (i_12_ < (Class33_Sub2.anInt6696)); i_12_++) {
																is_3_[i_12_] = (-(is_9_[i_12_]) + (is_6_[i_12_]));
																is_4_[i_12_] = ((is_7_[i_12_]) + -(is_10_[i_12_]));
																is_5_[i_12_] = ((is_8_[i_12_]) - (is_11_[i_12_]));
															}
															break while_173_;
														} while (false);
														for (i_12_ = 0; (i_12_ < (Class33_Sub2.anInt6696)); i_12_++) {
															is_3_[i_12_] = (((is_9_[i_12_]) * (is_6_[i_12_])) >> 12);
															is_4_[i_12_] = (((is_10_[i_12_]) * (is_7_[i_12_])) >> 12);
															is_5_[i_12_] = (((is_11_[i_12_]) * (is_8_[i_12_])) >> 12);
														}
														break while_173_;
													} while (false);
													for (i_12_ = 0; i_12_ < (Class33_Sub2.anInt6696); i_12_++) {
														int i_13_ = is_9_[i_12_];
														int i_14_ = is_11_[i_12_];
														int i_15_ = is_10_[i_12_];
														is_3_[i_12_] = (i_13_ != 0 ? ((is_6_[i_12_] << 12) / i_13_)
																: 4096);
														is_4_[i_12_] = (((i_15_ ^ 0xffffffff) == -1) ? 4096
																: ((is_7_[i_12_] << 12) / i_15_));
														is_5_[i_12_] = (((i_14_ ^ 0xffffffff) == -1) ? 4096
																: ((is_8_[i_12_] << 12) / i_14_));
													}
													break while_173_;
												} while (false);
												for (i_12_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
													is_3_[i_12_] = -(((4096 + -is_6_[i_12_]) * (4096 + -(is_9_[i_12_]))) >> 12) + 4096;
													is_4_[i_12_] = -(((4096 - is_10_[i_12_]) * (-is_7_[i_12_] + 4096)) >> 12) + 4096;
													is_5_[i_12_] = -(((-is_11_[i_12_] + 4096) * (4096 - (is_8_[i_12_]))) >> 12) + 4096;
												}
												break while_173_;
											} while (false);
											for (i_12_ = 0; ((i_12_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_12_++) {
												int i_16_ = is_9_[i_12_];
												int i_17_ = is_10_[i_12_];
												int i_18_ = is_11_[i_12_];
												is_3_[i_12_] = (((i_16_ ^ 0xffffffff) <= -2049) ? -(((-is_6_[i_12_] + 4096) * (-i_16_ + 4096)) >> 11) + 4096
														: (i_16_ * is_6_[i_12_] >> 11));
												is_4_[i_12_] = (i_17_ < 2048 ? (is_7_[i_12_]
														* i_17_ >> 11)
														: (4096 - (((4096 + -is_7_[i_12_]) * (4096 - i_17_)) >> 11)));
												is_5_[i_12_] = (i_18_ >= 2048 ? -(((4096 - is_8_[i_12_]) * (-i_18_ + 4096)) >> 11) + 4096
														: (i_18_ * is_8_[i_12_] >> 11));
											}
											break while_173_;
										} while (false);
										for (i_12_ = 0; Class33_Sub2.anInt6696 > i_12_; i_12_++) {
											int i_19_ = is_8_[i_12_];
											int i_20_ = is_6_[i_12_];
											int i_21_ = is_7_[i_12_];
											is_3_[i_12_] = (((i_20_ ^ 0xffffffff) == -4097) ? 4096
													: ((is_9_[i_12_] << 12) / (4096 + -i_20_)));
											is_4_[i_12_] = (i_21_ == 4096 ? 4096
													: ((is_10_[i_12_] << 12) / (-i_21_ + 4096)));
											is_5_[i_12_] = (i_19_ != 4096 ? ((is_11_[i_12_] << 12) / (-i_19_ + 4096))
													: 4096);
										}
										break while_173_;
									} while (false);
									for (i_12_ = 0; i_12_ < Class33_Sub2.anInt6696; i_12_++) {
										int i_22_ = is_8_[i_12_];
										int i_23_ = is_7_[i_12_];
										int i_24_ = is_6_[i_12_];
										is_3_[i_12_] = (i_24_ == 0 ? 0 : 4096
												- (-is_9_[i_12_] + 4096 << 12)
												/ i_24_);
										is_4_[i_12_] = (i_23_ == 0 ? 0
												: -((-is_10_[i_12_] + 4096 << 12) / i_23_) + 4096);
										is_5_[i_12_] = ((i_22_ ^ 0xffffffff) == -1 ? 0
												: 4096 + -((4096 - is_11_[i_12_] << 12) / i_22_));
									}
									break while_173_;
								} while (false);
								for (i_12_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
									int i_25_ = is_7_[i_12_];
									int i_26_ = is_10_[i_12_];
									int i_27_ = is_8_[i_12_];
									int i_28_ = is_9_[i_12_];
									int i_29_ = is_6_[i_12_];
									int i_30_ = is_11_[i_12_];
									is_3_[i_12_] = i_28_ > i_29_ ? i_29_
											: i_28_;
									is_4_[i_12_] = (((i_25_ ^ 0xffffffff) <= (i_26_ ^ 0xffffffff)) ? i_26_
											: i_25_);
									is_5_[i_12_] = (((i_27_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff)) ? i_27_
											: i_30_);
								}
								break while_173_;
							} while (false);
							for (i_12_ = 0; i_12_ < Class33_Sub2.anInt6696; i_12_++) {
								int i_31_ = is_6_[i_12_];
								int i_32_ = is_8_[i_12_];
								int i_33_ = is_10_[i_12_];
								int i_34_ = is_11_[i_12_];
								int i_35_ = is_7_[i_12_];
								int i_36_ = is_9_[i_12_];
								is_3_[i_12_] = i_31_ > i_36_ ? i_31_ : i_36_;
								is_4_[i_12_] = ((i_33_ ^ 0xffffffff) <= (i_35_ ^ 0xffffffff) ? i_33_
										: i_35_);
								is_5_[i_12_] = i_32_ > i_34_ ? i_32_ : i_34_;
							}
							break while_173_;
						} while (false);
						for (i_12_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_12_ ^ 0xffffffff)); i_12_++) {
							int i_37_ = is_9_[i_12_];
							int i_38_ = is_6_[i_12_];
							int i_39_ = is_11_[i_12_];
							int i_40_ = is_10_[i_12_];
							int i_41_ = is_8_[i_12_];
							int i_42_ = is_7_[i_12_];
							is_3_[i_12_] = ((i_38_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff) ? i_38_
									+ -i_37_
									: -i_38_ + i_37_);
							is_4_[i_12_] = (i_42_ > i_40_ ? -i_40_ + i_42_
									: i_40_ + -i_42_);
							is_5_[i_12_] = ((i_39_ ^ 0xffffffff) <= (i_41_ ^ 0xffffffff) ? -i_41_
									+ i_39_
									: i_41_ - i_39_);
						}
						break while_173_;
					} while (false);
					for (i_12_ = 0; Class33_Sub2.anInt6696 > i_12_; i_12_++) {
						int i_43_ = is_7_[i_12_];
						int i_44_ = is_9_[i_12_];
						int i_45_ = is_11_[i_12_];
						int i_46_ = is_10_[i_12_];
						int i_47_ = is_6_[i_12_];
						int i_48_ = is_8_[i_12_];
						is_3_[i_12_] = -(i_44_ * i_47_ >> 11) + i_44_ + i_47_;
						is_4_[i_12_] = i_43_ + i_46_ - (i_46_ * i_43_ >> 11);
						is_5_[i_12_] = i_45_ + i_48_ - (i_48_ * i_45_ >> 11);
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wv.I(" + i + ','
					+ i_0_ + ')');
		}
	}

	final void method2263(int i, Stream stream, int i_49_) {
		while_174_: do {
			try {
				if (i == 3731) {
					anInt9746++;
					int i_50_ = i_49_;
					do {
						if ((i_50_ ^ 0xffffffff) != -1) {
							if (i_50_ != 1)
								break while_174_;
							if (!client.aBool10531)
								break;
						}
						anInt9747 = stream.readUnsignedByte((byte) 35);
						return;
					} while (false);
					((Class11_Sub2) this).aBool5044 = stream
							.readUnsignedByte((byte) 35) == 1;
					break;
				}
				break;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception,
						("wv.B(" + i + ','
								+ (stream != null ? "{...}" : "null") + ','
								+ i_49_ + ')'));
			}
		} while (false);
	}

	final int[] method2254(int i, boolean bool) {
		try {
			anInt9745++;
			int[] is = ((Class11_Sub2) this).aClass105_5043.method693(i,
					(byte) -42);
			if (bool != true)
				return null;
			while_184_: do {
				if (((Class105) ((Class11_Sub2) this).aClass105_5043).aBool1421) {
					int[] is_51_ = this.method2260(4463, 0, i);
					int[] is_52_ = this.method2260(4463, 1, i);
					int i_53_ = anInt9747;
					while_183_: do {
						while_182_: do {
							while_181_: do {
								while_180_: do {
									while_179_: do {
										while_178_: do {
											while_177_: do {
												while_176_: do {
													while_175_: do {
														do {
															if ((i_53_ ^ 0xffffffff) != -2) {
																if (i_53_ != 2) {
																	if (i_53_ != 3) {
																		if (i_53_ != 4) {
																			if ((i_53_ ^ 0xffffffff) != -6) {
																				if (i_53_ != 6) {
																					if ((i_53_ ^ 0xffffffff) != -8) {
																						if ((i_53_ ^ 0xffffffff) != -9) {
																							if ((i_53_ ^ 0xffffffff) != -10) {
																								if ((i_53_ ^ 0xffffffff) != -11) {
																									if ((i_53_ ^ 0xffffffff) != -12) {
																										if ((i_53_ ^ 0xffffffff) != -13)
																											break while_184_;
																									} else
																										break while_182_;
																									break while_183_;
																								}
																							} else
																								break while_180_;
																							break while_181_;
																						}
																					} else
																						break while_178_;
																					break while_179_;
																				}
																			} else
																				break while_176_;
																			break while_177_;
																		}
																	} else
																		break;
																	break while_175_;
																}
															} else {
																for (i_53_ = 0; (((Class33_Sub2.anInt6696) ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++)
																	is[i_53_] = ((is_52_[i_53_]) + is_51_[i_53_]);
																break while_184_;
															}
															for (i_53_ = 0; ((i_53_ ^ 0xffffffff) > ((Class33_Sub2.anInt6696) ^ 0xffffffff)); i_53_++)
																is[i_53_] = ((is_51_[i_53_]) + -(is_52_[i_53_]));
															break while_184_;
														} while (false);
														for (i_53_ = 0; ((Class33_Sub2.anInt6696) > i_53_); i_53_++)
															is[i_53_] = (((is_51_[i_53_]) * (is_52_[i_53_])) >> 12);
														break while_184_;
													} while (false);
													for (i_53_ = 0; ((Class33_Sub2.anInt6696) > i_53_); i_53_++) {
														int i_54_ = is_52_[i_53_];
														is[i_53_] = (((i_54_ ^ 0xffffffff) != -1) ? (((is_51_[i_53_]) << 12) / i_54_)
																: 4096);
													}
													break while_184_;
												} while (false);
												for (i_53_ = 0; ((i_53_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_53_++)
													is[i_53_] = -(((-is_51_[i_53_] + 4096) * (-is_52_[i_53_] + 4096)) >> 12) + 4096;
												break while_184_;
											} while (false);
											for (i_53_ = 0; ((i_53_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_53_++) {
												int i_55_ = is_52_[i_53_];
												is[i_53_] = (i_55_ >= 2048 ? -(((4096 + -is_51_[i_53_]) * (4096 + -i_55_)) >> 11) + 4096
														: (is_51_[i_53_]
																* i_55_ >> 11));
											}
											break while_184_;
										} while (false);
										for (i_53_ = 0; i_53_ < Class33_Sub2.anInt6696; i_53_++) {
											int i_56_ = is_51_[i_53_];
											is[i_53_] = (((i_56_ ^ 0xffffffff) == -4097) ? 4096
													: ((is_52_[i_53_] << 12) / (-i_56_ + 4096)));
										}
										break while_184_;
									} while (false);
									for (i_53_ = 0; i_53_ < Class33_Sub2.anInt6696; i_53_++) {
										int i_57_ = is_51_[i_53_];
										is[i_53_] = (i_57_ != 0 ? -((4096 + -is_52_[i_53_] << 12) / i_57_) + 4096
												: 0);
									}
									break while_184_;
								} while (false);
								for (i_53_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
									int i_58_ = is_51_[i_53_];
									int i_59_ = is_52_[i_53_];
									is[i_53_] = (((i_58_ ^ 0xffffffff) > (i_59_ ^ 0xffffffff)) ? i_58_
											: i_59_);
								}
								break while_184_;
							} while (false);
							for (i_53_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
								int i_60_ = is_52_[i_53_];
								int i_61_ = is_51_[i_53_];
								is[i_53_] = i_60_ >= i_61_ ? i_60_ : i_61_;
							}
							break while_184_;
						} while (false);
						for (i_53_ = 0; ((Class33_Sub2.anInt6696 ^ 0xffffffff) < (i_53_ ^ 0xffffffff)); i_53_++) {
							int i_62_ = is_52_[i_53_];
							int i_63_ = is_51_[i_53_];
							is[i_53_] = ((i_63_ ^ 0xffffffff) >= (i_62_ ^ 0xffffffff) ? -i_63_
									+ i_62_
									: i_63_ - i_62_);
						}
						break while_184_;
					} while (false);
					for (i_53_ = 0; ((i_53_ ^ 0xffffffff) > (Class33_Sub2.anInt6696 ^ 0xffffffff)); i_53_++) {
						int i_64_ = is_52_[i_53_];
						int i_65_ = is_51_[i_53_];
						is[i_53_] = -(i_65_ * i_64_ >> 11) + (i_65_ + i_64_);
					}
				}
			} while (false);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "wv.A(" + i + ','
					+ bool + ')');
		}
	}

	public Class11_Sub2_Sub35() {
		super(2, false);
	}

	static final void method3837(int i, int i_66_, int i_67_, int i_68_,
			byte[] is, int i_69_) {
		try {
			anInt9750++;
			if (i < i_66_) {
				i_68_ += i;
				i_67_ = i_66_ + -i >> 2;
				while (--i_67_ >= 0) {
					is[i_68_++] = (byte) 1;
					is[i_68_++] = (byte) 1;
					is[i_68_++] = (byte) 1;
					is[i_68_++] = (byte) 1;
				}
				if (i_69_ != -1212415540)
					method3836(81);
				i_67_ = -i + i_66_ & 0x3;
				while ((--i_67_ ^ 0xffffffff) <= -1)
					is[i_68_++] = (byte) 1;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("wv.C(" + i + ','
					+ i_66_ + ',' + i_67_ + ',' + i_68_ + ','
					+ (is != null ? "{...}" : "null") + ',' + i_69_ + ')'));
		}
	}
}
