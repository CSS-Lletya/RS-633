/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129 {
	int anInt1729;
	int anInt1730;
	int anInt1731;
	int anInt1732;
	int anInt1733;
	int[] anIntArray1734;
	private int anInt1735;
	boolean aBool1736 = false;
	int anInt1737;
	int anInt1738;
	static int anInt1739;
	int[] anIntArray1740;
	int anInt1741;
	static int anInt1742;
	private int anInt1743;
	int anInt1744;
	int anInt1745;
	boolean aBool1746;
	short aShort1747;
	int anInt1748;
	int anInt1749;
	private int anInt1750;
	int anInt1751;
	int anInt1752;
	static Interface1 anInterface1_1753;
	private int anInt1754;
	private int anInt1755;
	int anInt1756;
	int anInt1757;
	int anInt1758;
	boolean aBool1759;
	boolean aBool1760;
	boolean aBool1761;
	int[] anIntArray1762;
	short aShort1763;
	int anInt1764;
	short aShort1765;
	int anInt1766;
	int anInt1767;
	int anInt1768;
	static int anInt1769;
	int anInt1770;
	int anInt1771;
	int anInt1772;
	int anInt1773;
	int anInt1774;
	short aShort1775;
	private int anInt1776;
	private int anInt1777;
	int anInt1778;
	private int anInt1779;
	int anInt1780;
	boolean aBool1781;
	int anInt1782;
	int[] anIntArray1783;
	int anInt1784;
	int anInt1785;
	int anInt1786;
	int anInt1787;
	int anInt1788;
	int anInt1789;
	int anInt1790;
	static int anInt1791;
	int anInt1792;
	int anInt1793;
	boolean aBool1794;
	private int anInt1795;
	boolean aBool1796;
	private int anInt1797;
	boolean aBool1798;
	int anInt1799;

	static final boolean method837(int i, int i_0_, int i_1_, int i_2_,
			byte i_3_, int i_4_, int i_5_) {
		try {
			anInt1742++;
			if (!Class108_Sub10.aBool6130 || !Class236_Sub5.aBool6848)
				return false;
			if ((Class217.anInt3003 ^ 0xffffffff) > -101)
				return false;
			if (i_5_ == i && (i_0_ ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) {
				if (!Class11_Sub2_Sub30.method3792(i_1_, 843095752, i_0_, i_5_))
					return false;
				int i_6_ = i_5_ << Class11_Sub2_Sub8.anInt8751;
				int i_7_ = i_0_ << Class11_Sub2_Sub8.anInt8751;
				if (Class243.method1536(i_2_,
						Class376_Sub7_Sub3_Sub2.anInt10141,
						Class376_Sub7_Sub3_Sub2.anInt10141, i_7_, (byte) 102,
						Class315.aClass12Array4179[i_1_].method131((byte) 122,
								i_0_, i_5_), i_6_)) {
					Class112.anInt1540++;
					return true;
				}
				return false;
			}
			int i_8_ = i_5_;
			if (i_3_ < 52)
				anInterface1_1753 = null;
			for (/**/; (i_8_ ^ 0xffffffff) >= (i ^ 0xffffffff); i_8_++) {
				for (int i_9_ = i_0_; (i_9_ ^ 0xffffffff) >= (i_4_ ^ 0xffffffff); i_9_++) {
					if (-Class11_Sub2_Sub11.anInt8861 == (Class321_Sub3.anIntArrayArrayArray7024[i_1_][i_8_][i_9_]))
						return false;
				}
			}
			int i_10_ = 1 + (i_5_ << Class11_Sub2_Sub8.anInt8751);
			int i_11_ = 2 + (i_0_ << Class11_Sub2_Sub8.anInt8751);
			if (!Class243
					.method1536(
							i_2_,
							((1 + (-i_0_ + i_4_)) * Class376_Sub7_Sub3_Sub2.anInt10141),
							(Class376_Sub7_Sub3_Sub2.anInt10141 * (1 + (-i_5_ + i))),
							i_11_, (byte) 126, Class315.aClass12Array4179[i_1_]
									.method131((byte) 7, i_0_, i_5_), i_10_))
				return false;
			Class112.anInt1540++;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ef.E(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	public static void method838(int i) {
		do {
			try {
				anInterface1_1753 = null;
				if (i == 255)
					break;
				anInterface1_1753 = null;
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ef.A(" + i + ')');
			}
			break;
		} while (false);
	}

	final void method839(byte i) {
		do {
			try {
				((Class129) this).anInt1729 = anInt1776 >> 16 & 0xff;
				anInt1769++;
				if ((((Class129) this).anInt1737 ^ 0xffffffff) < 1
						|| ((Class129) this).anInt1774 > -2)
					((Class129) this).aBool1736 = true;
				anInt1797 = 0xff & anInt1735 >> 16;
				((Class129) this).anInt1758 = (0xffb5 & anInt1776) >> 8;
				anInt1743 = anInt1735 >> 8 & 0xff;
				((Class129) this).anInt1778 = -((Class129) this).anInt1729
						+ anInt1797;
				anInt1755 = anInt1735 & 0xff;
				((Class129) this).anInt1793 = -((Class129) this).anInt1758
						+ anInt1743;
				((Class129) this).anInt1770 = 0xff & anInt1776;
				((Class129) this).anInt1749 = -((Class129) this).anInt1770
						+ anInt1755;
				anInt1779 = anInt1735 >> 24 & 0xff;
				((Class129) this).anInt1799 = anInt1776 >> 24 & 0xff;
				if (i != 86)
					((Class129) this).aBool1781 = false;
				((Class129) this).anInt1745 = -((Class129) this).anInt1799
						+ anInt1779;
				if (((Class129) this).anInt1756 != 0) {
					((Class129) this).anInt1782 = anInt1754
							* ((Class129) this).anInt1748 / 100;
					((Class129) this).anInt1789 = ((Class129) this).anInt1748
							* anInt1795 / 100;
					if ((((Class129) this).anInt1789 ^ 0xffffffff) == -1)
						((Class129) this).anInt1789 = 1;
					((Class129) this).anInt1732 = ((-((Class129) this).anInt1770
							- ((Class129) this).anInt1749 / 2 + (((Class129) this).anInt1756 & 0xff)) << 8)
							/ ((Class129) this).anInt1789;
					if ((((Class129) this).anInt1782 ^ 0xffffffff) == -1)
						((Class129) this).anInt1782 = 1;
					((Class129) this).anInt1784 = ((((((Class129) this).anInt1756 & 0xff51f2) >> 16)
							- ((Class129) this).anInt1778 / 2 - ((Class129) this).anInt1729) << 8)
							/ ((Class129) this).anInt1789;
					((Class129) this).anInt1790 = ((((((Class129) this).anInt1756 & 0xff68) >> 8)
							- ((Class129) this).anInt1758 + -(((Class129) this).anInt1793 / 2)) << 8)
							/ ((Class129) this).anInt1789;
					Class129 class129_12_ = this;
					((Class129) class129_12_).anInt1732 = (((Class129) class129_12_).anInt1732 - ((((Class129) this).anInt1732 ^ 0xffffffff) >= -1 ? 4
							: 4));
					Class129 class129_13_ = this;
					((Class129) class129_13_).anInt1784 = (((Class129) class129_13_).anInt1784 + ((((Class129) this).anInt1784 ^ 0xffffffff) < -1 ? -4
							: 4));
					Class129 class129_14_ = this;
					((Class129) class129_14_).anInt1790 = (((Class129) class129_14_).anInt1790 + ((((Class129) this).anInt1790 ^ 0xffffffff) < -1 ? -4
							: 4));
					((Class129) this).anInt1744 = ((-(((Class129) this).anInt1745 / 2)
							- ((Class129) this).anInt1799 + (((Class129) this).anInt1756 >> 24 & 0xff)) << 8)
							/ ((Class129) this).anInt1782;
					Class129 class129_15_ = this;
					((Class129) class129_15_).anInt1744 = (((Class129) class129_15_).anInt1744 - (((Class129) this).anInt1744 <= 0 ? 4
							: 4));
				}
				if ((((Class129) this).anInt1792 ^ 0xffffffff) != 0) {
					((Class129) this).anInt1785 = ((Class129) this).anInt1748
							* anInt1750 / 100;
					if ((((Class129) this).anInt1785 ^ 0xffffffff) == -1)
						((Class129) this).anInt1785 = 1;
					((Class129) this).anInt1733 = (((Class129) this).anInt1792 + (-((Class129) this).anInt1771 + -((-((Class129) this).anInt1771 + ((Class129) this).anInt1766) / 2)))
							/ ((Class129) this).anInt1785;
				}
				if ((((Class129) this).anInt1757 ^ 0xffffffff) == 0)
					break;
				((Class129) this).anInt1767 = anInt1777
						* ((Class129) this).anInt1748 / 100;
				if ((((Class129) this).anInt1767 ^ 0xffffffff) == -1)
					((Class129) this).anInt1767 = 1;
				((Class129) this).anInt1751 = ((-((Class129) this).anInt1752 - ((-((Class129) this).anInt1752 + ((Class129) this).anInt1731) / 2 - ((Class129) this).anInt1757)) / ((Class129) this).anInt1767);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ef.B(" + i + ')');
			}
			break;
		} while (false);
	}

	private final void method840(Stream stream, int i, int i_16_) {
		try {
			if (i != -1467551944)
				((Class129) this).anInt1786 = 125;
			anInt1791++;
			if ((i_16_ ^ 0xffffffff) != -2) {
				if (i_16_ != 2) {
					if (i_16_ == 3) {
						((Class129) this).anInt1752 = stream.readInt(123);
						((Class129) this).anInt1731 = stream.readInt(108);
					} else if (i_16_ != 4) {
						if (i_16_ == 5)
							((Class129) this).anInt1771 = ((Class129) this).anInt1766 = stream
									.readUnsignedShort((byte) -65) << 12 << 2;
						else if (i_16_ == 6) {
							anInt1776 = stream.readInt(126);
							anInt1735 = stream.readInt(i ^ ~0x5779109e);
						} else if ((i_16_ ^ 0xffffffff) != -8) {
							if ((i_16_ ^ 0xffffffff) != -9) {
								if ((i_16_ ^ 0xffffffff) == -10) {
									int i_17_ = stream
											.readUnsignedByte((byte) 35);
									((Class129) this).anIntArray1783 = new int[i_17_];
									for (int i_18_ = 0; ((i_18_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff)); i_18_++)
										((Class129) this).anIntArray1783[i_18_] = stream
												.readUnsignedShort((byte) -65);
								} else if ((i_16_ ^ 0xffffffff) == -11) {
									int i_19_ = stream
											.readUnsignedByte((byte) 35);
									((Class129) this).anIntArray1762 = new int[i_19_];
									for (int i_20_ = 0; ((i_19_ ^ 0xffffffff) < (i_20_ ^ 0xffffffff)); i_20_++)
										((Class129) this).anIntArray1762[i_20_] = stream
												.readUnsignedShort((byte) -65);
								} else if (i_16_ != 12) {
									if ((i_16_ ^ 0xffffffff) == -14)
										((Class129) this).anInt1774 = stream
												.readByte(1854307120);
									else if (i_16_ != 14) {
										if ((i_16_ ^ 0xffffffff) != -16) {
											if ((i_16_ ^ 0xffffffff) == -17) {
												((Class129) this).aBool1781 = ((stream
														.readUnsignedByte((byte) 35)) ^ 0xffffffff) == -2;
												((Class129) this).anInt1786 = (stream
														.readUnsignedShort((byte) -65));
												((Class129) this).anInt1780 = (stream
														.readUnsignedShort((byte) -65));
												((Class129) this).aBool1760 = ((stream
														.readUnsignedByte((byte) 35)) ^ 0xffffffff) == -2;
											} else if (i_16_ != 17) {
												if ((i_16_ ^ 0xffffffff) != -19) {
													if (i_16_ == 19)
														((Class129) this).anInt1730 = (stream
																.readUnsignedByte((byte) 35));
													else if ((i_16_ ^ 0xffffffff) != -21) {
														if ((i_16_ ^ 0xffffffff) == -22)
															anInt1754 = (stream
																	.readUnsignedByte((byte) 35));
														else if (i_16_ != 22) {
															if ((i_16_ ^ 0xffffffff) == -24)
																anInt1777 = (stream
																		.readUnsignedByte((byte) 35));
															else if (i_16_ != 24) {
																if ((i_16_ ^ 0xffffffff) != -26) {
																	if (i_16_ == 26)
																		((Class129) this).aBool1759 = false;
																	else if (i_16_ == 27)
																		((Class129) this).anInt1792 = stream
																				.readUnsignedShort((byte) -65) << 12 << 2;
																	else if ((i_16_ ^ 0xffffffff) == -29)
																		anInt1750 = stream
																				.readUnsignedByte((byte) 35);
																	else if ((i_16_ ^ 0xffffffff) != -30) {
																		if ((i_16_ ^ 0xffffffff) == -31)
																			((Class129) this).aBool1796 = true;
																		else if ((i_16_ ^ 0xffffffff) == -32) {
																			((Class129) this).anInt1771 = stream
																					.readUnsignedShort((byte) -65) << 12 << 2;
																			((Class129) this).anInt1766 = stream
																					.readUnsignedShort((byte) -65) << 12 << 2;
																		} else if (i_16_ != 32) {
																			if (i_16_ != 33) {
																				if ((i_16_ ^ 0xffffffff) == -35)
																					((Class129) this).aBool1798 = false;
																			} else
																				((Class129) this).aBool1794 = true;
																		} else
																			((Class129) this).aBool1746 = false;
																	} else
																		stream.method2508((byte) -88);
																} else {
																	int i_21_ = (stream
																			.readUnsignedByte((byte) 35));
																	((Class129) this).anIntArray1740 = (new int[i_21_]);
																	for (int i_22_ = 0; (i_22_ < i_21_); i_22_++)
																		((Class129) this).anIntArray1740[i_22_] = stream
																				.readUnsignedShort((byte) -65);
																}
															} else
																((Class129) this).aBool1761 = false;
														} else
															((Class129) this).anInt1757 = (stream
																	.readInt(123));
													} else
														anInt1795 = (stream
																.readUnsignedByte((byte) 35));
												} else
													((Class129) this).anInt1756 = stream
															.readInt(100);
											} else
												((Class129) this).anInt1772 = (stream
														.readUnsignedShort((byte) -65));
										} else
											((Class129) this).anInt1738 = stream
													.readUnsignedShort((byte) -65);
									} else
										((Class129) this).anInt1764 = stream
												.readUnsignedShort((byte) -65);
								} else
									((Class129) this).anInt1737 = stream
											.readByte(1854307120);
							} else {
								((Class129) this).anInt1741 = stream
										.readUnsignedShort((byte) -65);
								((Class129) this).anInt1768 = stream
										.readUnsignedShort((byte) -65);
							}
						} else {
							((Class129) this).anInt1773 = stream
									.readUnsignedShort((byte) -65);
							((Class129) this).anInt1748 = stream
									.readUnsignedShort((byte) -65);
						}
					} else {
						((Class129) this).anInt1788 = stream
								.readUnsignedByte((byte) 35);
						((Class129) this).anInt1787 = stream.readByte(i
								^ ~0x39ff6bf7);
					}
				} else
					stream.readUnsignedByte((byte) 35);
			} else {
				((Class129) this).aShort1747 = (short) stream
						.readUnsignedShort((byte) -65);
				((Class129) this).aShort1765 = (short) stream
						.readUnsignedShort((byte) -65);
				((Class129) this).aShort1775 = (short) stream
						.readUnsignedShort((byte) -65);
				((Class129) this).aShort1763 = (short) stream
						.readUnsignedShort((byte) -65);
				int i_23_ = 3;
				((Class129) this).aShort1765 <<= i_23_;
				((Class129) this).aShort1763 <<= i_23_;
				((Class129) this).aShort1747 <<= i_23_;
				((Class129) this).aShort1775 <<= i_23_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("ef.D("
					+ (stream != null ? "{...}" : "null") + ',' + i + ','
					+ i_16_ + ')'));
		}
	}

	final void method841(int i, Stream stream) {
		do {
			try {
				for (;;) {
					int i_24_ = stream.readUnsignedByte((byte) 35);
					if ((i_24_ ^ 0xffffffff) == -1)
						break;
					method840(stream, i ^ 0x577910d9, i_24_);
				}
				anInt1739++;
				if (i == -31)
					break;
				method841(57, null);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ef.C(" + i + ','
						+ (stream != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public Class129() {
		((Class129) this).anInt1730 = 0;
		((Class129) this).anInt1737 = -2;
		((Class129) this).anInt1738 = -1;
		((Class129) this).aBool1746 = true;
		((Class129) this).anInt1757 = -1;
		anInt1754 = 100;
		((Class129) this).aBool1760 = true;
		((Class129) this).anInt1772 = -1;
		((Class129) this).anInt1764 = 0;
		anInt1750 = 100;
		((Class129) this).anInt1774 = -2;
		anInt1777 = 100;
		((Class129) this).aBool1781 = true;
		((Class129) this).aBool1759 = true;
		((Class129) this).anInt1780 = -1;
		((Class129) this).anInt1786 = -1;
		((Class129) this).anInt1792 = -1;
		((Class129) this).aBool1761 = true;
		((Class129) this).anInt1788 = 0;
		anInt1795 = 100;
		((Class129) this).aBool1796 = false;
		((Class129) this).aBool1798 = true;
		((Class129) this).aBool1794 = false;
	}
}
