/* Class270 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class270 {
	static Class11_Sub45_Sub5 aClass11_Sub45_Sub5_3648;
	static int anInt3649;
	static int anInt3650;
	static int anInt3651;

	static final Class11_Sub45_Sub6 method1694(byte[] is, int i) {
		try {
			anInt3651++;
			Class11_Sub45_Sub6 class11_sub45_sub6 = new Class11_Sub45_Sub6();
			Stream stream = new Stream(is);
			((Stream) stream).position = ((Stream) stream).buffer.length - 2;
			int i_0_ = stream.readUnsignedShort((byte) -65);
			int i_1_ = -i_0_ + ((Stream) stream).buffer.length - 14;
			((Stream) stream).position = i_1_;
			int i_2_ = stream.readInt(i + 89);
			((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8784 = stream
					.readUnsignedShort((byte) -65);
			((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8785 = stream
					.readUnsignedShort((byte) -65);
			((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8778 = stream
					.readUnsignedShort((byte) -65);
			((Class11_Sub45_Sub6) class11_sub45_sub6).anInt8776 = stream
					.readUnsignedShort((byte) -65);
			int i_3_ = stream.readUnsignedByte((byte) 35);
			if (i_3_ > i) {
				((Class11_Sub45_Sub6) class11_sub45_sub6).aClass213Array8779 = new Class213[i_3_];
				for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
					int i_5_ = stream.readUnsignedShort((byte) -65);
					Class213 class213 = new Class213(
							Class11_Sub2_Sub33.method3808(i ^ 0x73, i_5_));
					((Class11_Sub45_Sub6) class11_sub45_sub6).aClass213Array8779[i_4_] = class213;
					while ((i_5_-- ^ 0xffffffff) < -1) {
						int i_6_ = stream.readInt(i + 115);
						int i_7_ = stream.readInt(i ^ 0x79);
						class213.method1368((long) i_6_,
								new Class11_Sub51(i_7_), (byte) -26);
					}
				}
			}
			((Stream) stream).position = 0;
			((Class11_Sub45_Sub6) class11_sub45_sub6).aString8780 = stream
					.method2556(59);
			((Class11_Sub45_Sub6) class11_sub45_sub6).aStringArray8775 = new String[i_2_];
			((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781 = new int[i_2_];
			((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8783 = new int[i_2_];
			int i_8_ = 0;
			while (((Stream) stream).position < i_1_) {
				int i_9_ = stream.readUnsignedShort((byte) -65);
				if ((i_9_ ^ 0xffffffff) != -4) {
					if (i_9_ < 100 && (i_9_ ^ 0xffffffff) != -22 && i_9_ != 38
							&& (i_9_ ^ 0xffffffff) != -40)
						((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781[i_8_] = stream
								.readInt(123);
					else
						((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8781[i_8_] = stream
								.readUnsignedByte((byte) 35);
				} else
					((Class11_Sub45_Sub6) class11_sub45_sub6).aStringArray8775[i_8_] = stream
							.readString(-1).intern();
				((Class11_Sub45_Sub6) class11_sub45_sub6).anIntArray8783[i_8_++] = i_9_;
			}
			return class11_sub45_sub6;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pf.A("
					+ (is != null ? "{...}" : "null") + ',' + i + ')');
		}
	}

	static final void method1695(boolean bool,
			Actor class376_sub7_sub5_sub5) {
		try {
			anInt3649++;
			do {
				if (((((Actor) class376_sub7_sub5_sub5).anInt10291) ^ 0xffffffff) != 0) {
					Class281 class281 = (Class108_Sub23.aClass198_7760
							.method1284(
									((Actor) class376_sub7_sub5_sub5).anInt10291,
									(byte) -28));
					if (class281 != null
							&& ((Class281) class281).anIntArray3794 != null) {
						((Actor) class376_sub7_sub5_sub5).anInt10343++;
						if (((((Class281) class281).anIntArray3794.length ^ 0xffffffff) < (((Actor) class376_sub7_sub5_sub5).anInt10267 ^ 0xffffffff))
								&& ((((Class281) class281).anIntArray3817[((Actor) class376_sub7_sub5_sub5).anInt10267]) < ((Actor) class376_sub7_sub5_sub5).anInt10343)) {
							((Actor) class376_sub7_sub5_sub5).anInt10343 = 1;
							((Actor) class376_sub7_sub5_sub5).anInt10288++;
							((Actor) class376_sub7_sub5_sub5).anInt10267++;
							if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
								Class268.method1690(
										-701644944,
										(((Actor) class376_sub7_sub5_sub5).anInt10267),
										class376_sub7_sub5_sub5, class281);
						}
						if (((Class281) class281).anIntArray3794.length <= ((Actor) class376_sub7_sub5_sub5).anInt10267) {
							((Actor) class376_sub7_sub5_sub5).anInt10343 = 0;
							((Actor) class376_sub7_sub5_sub5).anInt10267 = 0;
							if (((Actor) class376_sub7_sub5_sub5).aBool10329) {
								((Actor) class376_sub7_sub5_sub5).anInt10291 = class376_sub7_sub5_sub5
										.method3960(21816).method337(-1);
								if ((((Actor) class376_sub7_sub5_sub5).anInt10291 ^ 0xffffffff) == 0) {
									((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
									break;
								}
								class281 = (Class108_Sub23.aClass198_7760
										.method1284(
												((Actor) class376_sub7_sub5_sub5).anInt10291,
												(byte) 105));
							}
							if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
								Class268.method1690(
										-701644944,
										(((Actor) class376_sub7_sub5_sub5).anInt10267),
										class376_sub7_sub5_sub5, class281);
						}
						((Actor) class376_sub7_sub5_sub5).anInt10288 = ((Actor) class376_sub7_sub5_sub5).anInt10267 + 1;
						if (((Class281) class281).anIntArray3794 == null) {
							((Actor) class376_sub7_sub5_sub5).anInt10291 = -1;
							((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
						} else if (((Class281) class281).anIntArray3794.length <= ((Actor) class376_sub7_sub5_sub5).anInt10288)
							((Actor) class376_sub7_sub5_sub5).anInt10288 = 0;
					} else {
						((Actor) class376_sub7_sub5_sub5).aBool10329 = false;
						((Actor) class376_sub7_sub5_sub5).anInt10291 = -1;
					}
				}
			} while (false);
			do {
				if ((((Actor) class376_sub7_sub5_sub5).anInt10289) != -1
						&& (Class11_Sub25.anInt6279 >= (((Actor) class376_sub7_sub5_sub5).anInt10301))) {
					Class224 class224 = (Class254.aClass227_3495
							.method1465(
									((Actor) class376_sub7_sub5_sub5).anInt10289,
									(byte) -79));
					int i = ((Class224) class224).anInt3079;
					if ((i ^ 0xffffffff) != 0) {
						Class281 class281 = Class108_Sub23.aClass198_7760
								.method1284(i, (byte) -121);
						if (((Class224) class224).aBool3073) {
							if (((Class281) class281).anInt3791 != 3) {
								if ((((Class281) class281).anInt3791 ^ 0xffffffff) == -2
										&& (((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
										&& (Class11_Sub25.anInt6279 >= (((Actor) class376_sub7_sub5_sub5).anInt10315))
										&& (((Actor) class376_sub7_sub5_sub5).anInt10330 < Class11_Sub25.anInt6279)) {
									((Actor) class376_sub7_sub5_sub5).anInt10301 = 1 + Class11_Sub25.anInt6279;
									break;
								}
							} else if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
									&& (Class11_Sub25.anInt6279 >= (((Actor) class376_sub7_sub5_sub5).anInt10315))
									&& (((((Actor) class376_sub7_sub5_sub5).anInt10330) ^ 0xffffffff) > (Class11_Sub25.anInt6279 ^ 0xffffffff))) {
								((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
								break;
							}
						}
						if (class281 == null
								|| ((Class281) class281).anIntArray3794 == null)
							((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
						else {
							if (((Actor) class376_sub7_sub5_sub5).anInt10327 < 0) {
								((Actor) class376_sub7_sub5_sub5).anInt10327 = 0;
								if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
									Class268.method1690(-701644944, 0,
											class376_sub7_sub5_sub5, class281);
							}
							((Actor) class376_sub7_sub5_sub5).anInt10284++;
							if (((((Actor) class376_sub7_sub5_sub5).anInt10327 ^ 0xffffffff) > (((Class281) class281).anIntArray3794.length ^ 0xffffffff))
									&& (((Actor) class376_sub7_sub5_sub5).anInt10284 > (((Class281) class281).anIntArray3817[(((Actor) class376_sub7_sub5_sub5).anInt10327)]))) {
								((Actor) class376_sub7_sub5_sub5).anInt10284 = 1;
								((Actor) class376_sub7_sub5_sub5).anInt10327++;
								if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
									Class268.method1690(
											-701644944,
											((Actor) class376_sub7_sub5_sub5).anInt10327,
											class376_sub7_sub5_sub5, class281);
							}
							if ((((Class281) class281).anIntArray3794.length ^ 0xffffffff) >= (((Actor) class376_sub7_sub5_sub5).anInt10327 ^ 0xffffffff)) {
								if (((Class224) class224).aBool3073) {
									((Actor) class376_sub7_sub5_sub5).anInt10327 -= ((Class281) class281).anInt3808;
									((Actor) class376_sub7_sub5_sub5).anInt10340++;
									if ((((Actor) class376_sub7_sub5_sub5).anInt10340 ^ 0xffffffff) > (((Class281) class281).anInt3809 ^ 0xffffffff)) {
										if (((((Actor) class376_sub7_sub5_sub5).anInt10327) ^ 0xffffffff) > -1
												|| (((((Class281) class281).anIntArray3794).length ^ 0xffffffff) >= ((((Actor) class376_sub7_sub5_sub5).anInt10327) ^ 0xffffffff)))
											((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
										else if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
											Class268.method1690(
													-701644944,
													(((Actor) class376_sub7_sub5_sub5).anInt10327),
													class376_sub7_sub5_sub5,
													class281);
									} else
										((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
								} else
									((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
							}
							((Actor) class376_sub7_sub5_sub5).anInt10281 = 1 + ((Actor) class376_sub7_sub5_sub5).anInt10327;
							if ((((Actor) class376_sub7_sub5_sub5).anInt10281 ^ 0xffffffff) <= (((Class281) class281).anIntArray3794.length ^ 0xffffffff)) {
								if (((Class224) class224).aBool3073) {
									((Actor) class376_sub7_sub5_sub5).anInt10281 -= ((Class281) class281).anInt3808;
									if (((Class281) class281).anInt3809 <= 1 + (((Actor) class376_sub7_sub5_sub5).anInt10340))
										((Actor) class376_sub7_sub5_sub5).anInt10281 = -1;
									else if ((((Actor) class376_sub7_sub5_sub5).anInt10281) < 0
											|| (((((Class281) class281).anIntArray3794).length ^ 0xffffffff) >= ((((Actor) class376_sub7_sub5_sub5).anInt10281) ^ 0xffffffff)))
										((Actor) class376_sub7_sub5_sub5).anInt10281 = -1;
								} else
									((Actor) class376_sub7_sub5_sub5).anInt10281 = -1;
							}
						}
					} else
						((Actor) class376_sub7_sub5_sub5).anInt10289 = -1;
				}
			} while (false);
			do {
				if (((((Actor) class376_sub7_sub5_sub5).anInt10338) ^ 0xffffffff) != 0
						&& (Class11_Sub25.anInt6279 >= (((Actor) class376_sub7_sub5_sub5).anInt10280))) {
					Class224 class224 = (Class254.aClass227_3495
							.method1465(
									((Actor) class376_sub7_sub5_sub5).anInt10338,
									(byte) -70));
					int i = ((Class224) class224).anInt3079;
					if (i == -1)
						((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
					else {
						Class281 class281 = Class108_Sub23.aClass198_7760
								.method1284(i, (byte) -88);
						if (((Class224) class224).aBool3073) {
							if (((Class281) class281).anInt3791 != 3) {
								if (((Class281) class281).anInt3791 == 1
										&& ((Actor) class376_sub7_sub5_sub5).anInt10368 > 0
										&& ((Class11_Sub25.anInt6279 ^ 0xffffffff) <= ((((Actor) class376_sub7_sub5_sub5).anInt10315) ^ 0xffffffff))
										&& ((((Actor) class376_sub7_sub5_sub5).anInt10330 ^ 0xffffffff) > (Class11_Sub25.anInt6279 ^ 0xffffffff))) {
									((Actor) class376_sub7_sub5_sub5).anInt10280 = 1 + Class11_Sub25.anInt6279;
									break;
								}
							} else if ((((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
									&& ((Class11_Sub25.anInt6279 ^ 0xffffffff) <= ((((Actor) class376_sub7_sub5_sub5).anInt10315) ^ 0xffffffff))
									&& (((((Actor) class376_sub7_sub5_sub5).anInt10330) ^ 0xffffffff) > (Class11_Sub25.anInt6279 ^ 0xffffffff))) {
								((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
								break;
							}
						}
						if (class281 == null
								|| ((Class281) class281).anIntArray3794 == null)
							((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
						else {
							if ((((Actor) class376_sub7_sub5_sub5).anInt10314 ^ 0xffffffff) > -1) {
								((Actor) class376_sub7_sub5_sub5).anInt10314 = 0;
								if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
									Class268.method1690(-701644944, 0,
											class376_sub7_sub5_sub5, class281);
							}
							((Actor) class376_sub7_sub5_sub5).anInt10273++;
							if ((((Actor) class376_sub7_sub5_sub5).anInt10314 < ((Class281) class281).anIntArray3794.length)
									&& ((((Class281) class281).anIntArray3817[((Actor) class376_sub7_sub5_sub5).anInt10314]) < ((Actor) class376_sub7_sub5_sub5).anInt10273)) {
								((Actor) class376_sub7_sub5_sub5).anInt10314++;
								((Actor) class376_sub7_sub5_sub5).anInt10273 = 1;
								if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
									Class268.method1690(
											-701644944,
											((Actor) class376_sub7_sub5_sub5).anInt10314,
											class376_sub7_sub5_sub5, class281);
							}
							if (((Class281) class281).anIntArray3794.length <= ((Actor) class376_sub7_sub5_sub5).anInt10314) {
								if (!((Class224) class224).aBool3073)
									((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
								else {
									((Actor) class376_sub7_sub5_sub5).anInt10270++;
									((Actor) class376_sub7_sub5_sub5).anInt10314 -= ((Class281) class281).anInt3808;
									if ((((Class281) class281).anInt3809 ^ 0xffffffff) < (((Actor) class376_sub7_sub5_sub5).anInt10270 ^ 0xffffffff)) {
										if ((((Actor) class376_sub7_sub5_sub5).anInt10314) < 0
												|| ((((Actor) class376_sub7_sub5_sub5).anInt10314) >= (((Class281) class281).anIntArray3794).length))
											((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
										else if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
											Class268.method1690(
													-701644944,
													(((Actor) class376_sub7_sub5_sub5).anInt10314),
													class376_sub7_sub5_sub5,
													class281);
									} else
										((Actor) class376_sub7_sub5_sub5).anInt10338 = -1;
								}
							}
							((Actor) class376_sub7_sub5_sub5).anInt10313 = ((Actor) class376_sub7_sub5_sub5).anInt10314 + 1;
							if (((Actor) class376_sub7_sub5_sub5).anInt10313 >= (((Class281) class281).anIntArray3794).length) {
								if (!((Class224) class224).aBool3073)
									((Actor) class376_sub7_sub5_sub5).anInt10313 = -1;
								else {
									((Actor) class376_sub7_sub5_sub5).anInt10313 -= ((Class281) class281).anInt3808;
									if ((1 + (((Actor) class376_sub7_sub5_sub5).anInt10270) ^ 0xffffffff) <= (((Class281) class281).anInt3809 ^ 0xffffffff))
										((Actor) class376_sub7_sub5_sub5).anInt10313 = -1;
									else if (((((Actor) class376_sub7_sub5_sub5).anInt10313) ^ 0xffffffff) > -1
											|| ((((Actor) class376_sub7_sub5_sub5).anInt10313) >= (((Class281) class281).anIntArray3794).length))
										((Actor) class376_sub7_sub5_sub5).anInt10313 = -1;
								}
							}
						}
					}
				}
			} while (false);
			if ((((Actor) class376_sub7_sub5_sub5).anInt10352 != -1)
					&& (((Actor) class376_sub7_sub5_sub5).anInt10286) <= 1) {
				Class281 class281 = (Class108_Sub23.aClass198_7760
						.method1284(
								(((Actor) class376_sub7_sub5_sub5).anInt10352),
								(byte) 91));
				if ((((Class281) class281).anInt3791 ^ 0xffffffff) == -4) {
					if (((((Actor) class376_sub7_sub5_sub5).anInt10368) ^ 0xffffffff) < -1
							&& (Class11_Sub25.anInt6279 >= ((Actor) class376_sub7_sub5_sub5).anInt10315)
							&& ((Class11_Sub25.anInt6279 ^ 0xffffffff) < (((Actor) class376_sub7_sub5_sub5).anInt10330 ^ 0xffffffff))) {
						((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
						((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
					}
				} else if ((((Class281) class281).anInt3791 ^ 0xffffffff) == -2
						&& (((Actor) class376_sub7_sub5_sub5).anInt10368 ^ 0xffffffff) < -1
						&& ((((Actor) class376_sub7_sub5_sub5).anInt10315 ^ 0xffffffff) >= (Class11_Sub25.anInt6279 ^ 0xffffffff))
						&& ((Class11_Sub25.anInt6279 ^ 0xffffffff) < (((Actor) class376_sub7_sub5_sub5).anInt10330 ^ 0xffffffff)))
					((Actor) class376_sub7_sub5_sub5).anInt10286 = 2;
			}
			if ((((Actor) class376_sub7_sub5_sub5).anInt10352 ^ 0xffffffff) != 0
					&& (((Actor) class376_sub7_sub5_sub5).anInt10286) == 0) {
				Class281 class281 = (Class108_Sub23.aClass198_7760
						.method1284(
								(((Actor) class376_sub7_sub5_sub5).anInt10352),
								(byte) 105));
				if (class281 == null
						|| ((Class281) class281).anIntArray3794 == null) {
					((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
					((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
				} else {
					((Actor) class376_sub7_sub5_sub5).anInt10282++;
					if ((((((Actor) class376_sub7_sub5_sub5).anInt10326) ^ 0xffffffff) > (((Class281) class281).anIntArray3794.length ^ 0xffffffff))
							&& (((((Class281) class281).anIntArray3817[((Actor) class376_sub7_sub5_sub5).anInt10326]) ^ 0xffffffff) > (((Actor) class376_sub7_sub5_sub5).anInt10282 ^ 0xffffffff))) {
						((Actor) class376_sub7_sub5_sub5).anInt10282 = 1;
						((Actor) class376_sub7_sub5_sub5).anInt10326++;
						if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
							Class268.method1690(
									-701644944,
									(((Actor) class376_sub7_sub5_sub5).anInt10326),
									class376_sub7_sub5_sub5, class281);
					}
					if (((((Actor) class376_sub7_sub5_sub5).anInt10326) ^ 0xffffffff) <= (((Class281) class281).anIntArray3794.length ^ 0xffffffff)) {
						((Actor) class376_sub7_sub5_sub5).anInt10326 -= ((Class281) class281).anInt3808;
						((Actor) class376_sub7_sub5_sub5).anInt10305++;
						if ((((Class281) class281).anInt3809 ^ 0xffffffff) < (((Actor) class376_sub7_sub5_sub5).anInt10305 ^ 0xffffffff)) {
							if (((Actor) class376_sub7_sub5_sub5).anInt10326 >= 0
									&& (((Actor) class376_sub7_sub5_sub5).anInt10326 < (((Class281) class281).anIntArray3794).length)) {
								if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
									Class268.method1690(
											-701644944,
											((Actor) class376_sub7_sub5_sub5).anInt10326,
											class376_sub7_sub5_sub5, class281);
							} else {
								((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
								((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
							}
						} else {
							((Actor) class376_sub7_sub5_sub5).anInt10352 = -1;
							((Actor) class376_sub7_sub5_sub5).anIntArray10272 = null;
						}
					}
					((Actor) class376_sub7_sub5_sub5).anInt10283 = (((Actor) class376_sub7_sub5_sub5).anInt10326) + 1;
					if ((((Class281) class281).anIntArray3794.length ^ 0xffffffff) >= (((Actor) class376_sub7_sub5_sub5).anInt10283 ^ 0xffffffff)) {
						((Actor) class376_sub7_sub5_sub5).anInt10283 -= ((Class281) class281).anInt3808;
						if ((((Class281) class281).anInt3809 ^ 0xffffffff) < (1 + ((Actor) class376_sub7_sub5_sub5).anInt10305 ^ 0xffffffff)) {
							if ((((Actor) class376_sub7_sub5_sub5).anInt10283 ^ 0xffffffff) > -1
									|| (((Class281) class281).anIntArray3794.length <= ((Actor) class376_sub7_sub5_sub5).anInt10283))
								((Actor) class376_sub7_sub5_sub5).anInt10283 = -1;
						} else
							((Actor) class376_sub7_sub5_sub5).anInt10283 = -1;
					}
				}
			}
			if (((Actor) class376_sub7_sub5_sub5).anInt10286 > 0)
				((Actor) class376_sub7_sub5_sub5).anInt10286--;
			if (bool == false) {
				for (int i = 0; ((i ^ 0xffffffff) > ((((Actor) class376_sub7_sub5_sub5).aClass208Array10342).length ^ 0xffffffff)); i++) {
					Class208 class208 = (((Actor) class376_sub7_sub5_sub5).aClass208Array10342[i]);
					if (class208 != null) {
						if (((Class208) class208).anInt2809 > 0)
							((Class208) class208).anInt2809--;
						else {
							Class281 class281 = (Class108_Sub23.aClass198_7760
									.method1284(
											((Class208) class208).anInt2807,
											(byte) -33));
							if (class281 != null
									&& (((Class281) class281).anIntArray3794 != null)) {
								((Class208) class208).anInt2810++;
								if ((((Class208) class208).anInt2805 < (((Class281) class281).anIntArray3794).length)
										&& (((Class208) class208).anInt2810 > (((Class281) class281).anIntArray3817[(((Class208) class208).anInt2805)]))) {
									((Class208) class208).anInt2810 = 1;
									((Class208) class208).anInt2805++;
									if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
										Class268.method1690(
												-701644944,
												((Class208) class208).anInt2805,
												class376_sub7_sub5_sub5,
												class281);
								}
								if (((Class208) class208).anInt2805 >= (((Class281) class281).anIntArray3794).length) {
									((Class208) class208).anInt2805 -= ((Class281) class281).anInt3808;
									((Class208) class208).anInt2804++;
									if ((((Class281) class281).anInt3809 ^ 0xffffffff) >= (((Class208) class208).anInt2804 ^ 0xffffffff))
										((Actor) class376_sub7_sub5_sub5).aClass208Array10342[i] = null;
									else if ((((Class208) class208).anInt2805 < 0)
											|| (((((Class281) class281).anIntArray3794).length ^ 0xffffffff) >= ((((Class208) class208).anInt2805) ^ 0xffffffff)))
										((Actor) class376_sub7_sub5_sub5).aClass208Array10342[i] = null;
									else if (!((Actor) class376_sub7_sub5_sub5).aBool10331)
										Class268.method1690(
												-701644944,
												((Class208) class208).anInt2805,
												class376_sub7_sub5_sub5,
												class281);
								}
								((Class208) class208).anInt2803 = ((Class208) class208).anInt2805 + 1;
								if (((((Class281) class281).anIntArray3794).length ^ 0xffffffff) >= (((Class208) class208).anInt2803 ^ 0xffffffff)) {
									((Class208) class208).anInt2803 -= ((Class281) class281).anInt3808;
									if (1 + ((Class208) class208).anInt2804 >= ((Class281) class281).anInt3809)
										((Class208) class208).anInt2803 = -1;
									else if ((((Class208) class208).anInt2803 ^ 0xffffffff) > -1
											|| (((((Class208) class208).anInt2803) ^ 0xffffffff) <= ((((Class281) class281).anIntArray3794).length ^ 0xffffffff)))
										((Class208) class208).anInt2803 = -1;
								}
							} else
								((Actor) class376_sub7_sub5_sub5).aClass208Array10342[i] = null;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("pf.C("
							+ bool
							+ ','
							+ (class376_sub7_sub5_sub5 != null ? "{...}"
									: "null") + ')'));
		}
	}

	public static void method1696(int i) {
		try {
			if (i <= -107)
				aClass11_Sub45_Sub5_3648 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "pf.B(" + i + ')');
		}
	}
}
