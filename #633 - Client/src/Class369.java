/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class369 {
	static Class11_Sub25[] aClass11_Sub25Array4842 = new Class11_Sub25[1024];
	static int anInt4843;
	private Class146 aClass146_4844;
	static int anInt4845;
	static int anInt4846;
	static Class96 aClass96_4847;
	static int anInt4848;
	static int anInt4849;
	private Class22 aClass22_4850 = new Class22(64);
	static int anInt4851;
	static int anInt4852;
	/* synthetic */static Class aClass4853;

	static final void method2175(Class11_Sub15 class11_sub15, boolean bool) {
		try {
			anInt4845++;
			if (bool == true && Class181.aClass364ArrayArrayArray2336 != null) {
				Interface13 interface13 = null;
				if ((((Class11_Sub15) class11_sub15).anInt5603 ^ 0xffffffff) == -1)
					interface13 = ((Interface13) Class209.method1342(
							(((Class11_Sub15) class11_sub15).anInt5609),
							(((Class11_Sub15) class11_sub15).anInt5596),
							(((Class11_Sub15) class11_sub15).anInt5595)));
				if ((((Class11_Sub15) class11_sub15).anInt5603 ^ 0xffffffff) == -2)
					interface13 = ((Interface13) (Class108_Sub9.method2608(
							((Class11_Sub15) class11_sub15).anInt5609,
							((Class11_Sub15) class11_sub15).anInt5596,
							((Class11_Sub15) class11_sub15).anInt5595)));
				if (((Class11_Sub15) class11_sub15).anInt5603 == 2)
					interface13 = ((Interface13) (Class180
							.method1185(
									((Class11_Sub15) class11_sub15).anInt5609,
									((Class11_Sub15) class11_sub15).anInt5596,
									((Class11_Sub15) class11_sub15).anInt5595,
									(aClass4853 != null ? aClass4853
											: (aClass4853 = getClassByName("Interface13"))))));
				if ((((Class11_Sub15) class11_sub15).anInt5603 ^ 0xffffffff) == -4)
					interface13 = ((Interface13) Class159.method988(
							(((Class11_Sub15) class11_sub15).anInt5609),
							(((Class11_Sub15) class11_sub15).anInt5596),
							(((Class11_Sub15) class11_sub15).anInt5595)));
				if (interface13 == null) {
					((Class11_Sub15) class11_sub15).anInt5601 = -1;
					((Class11_Sub15) class11_sub15).anInt5597 = 0;
					((Class11_Sub15) class11_sub15).anInt5604 = 0;
				} else {
					((Class11_Sub15) class11_sub15).anInt5601 = interface13
							.method42((byte) -17);
					((Class11_Sub15) class11_sub15).anInt5604 = interface13
							.method29((byte) -10);
					((Class11_Sub15) class11_sub15).anInt5597 = interface13
							.method30(30374);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception,
					("iha.C(" + (class11_sub15 != null ? "{...}" : "null")
							+ ',' + bool + ')'));
		}
	}

	final void method2176(int i, byte i_0_) {
		try {
			synchronized (aClass22_4850) {
				aClass22_4850.method182(i, (byte) -73);
				if (i_0_ != 17)
					aClass146_4844 = null;
			}
			anInt4852++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.A(" + i + ','
					+ i_0_ + ')');
		}
	}

	final Class102 method2177(int i, byte i_1_) {
		try {
			anInt4843++;
			Class102 class102;
			synchronized (aClass22_4850) {
				class102 = (Class102) aClass22_4850.method188((long) i,
						(byte) -112);
			}
			if (class102 != null)
				return class102;
			byte[] is;
			synchronized (aClass146_4844) {
				is = aClass146_4844.method930(Class205.method1300(37, i),
						(byte) 112, Class11_Sub7.method2321(i, true));
			}
			int i_2_ = 113 / ((74 - i_1_) / 39);
			class102 = new Class102();
			if (is != null)
				class102.method680(new Stream(is), 22071);
			synchronized (aClass22_4850) {
				aClass22_4850.method184((byte) 124, class102, (long) i);
			}
			return class102;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.H(" + i + ','
					+ i_1_ + ')');
		}
	}

	final void method2178(int i) {
		try {
			anInt4849++;
			synchronized (aClass22_4850) {
				if (i > -29) {
					/* empty */
				} else
					aClass22_4850.method189((byte) 7);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.F(" + i + ')');
		}
	}

	public static void method2179(int i) {
		try {
			if (i != -1)
				aClass11_Sub25Array4842 = null;
			aClass11_Sub25Array4842 = null;
			aClass96_4847 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.B(" + i + ')');
		}
	}

	final void method2180(int i) {
		try {
			synchronized (aClass22_4850) {
				aClass22_4850.method190(i ^ i);
			}
			anInt4848++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.D(" + i + ')');
		}
	}

	final void method2181(int i, int i_3_) {
		try {
			anInt4846++;
			if (i != -1)
				aClass96_4847 = null;
			synchronized (aClass22_4850) {
				aClass22_4850.method189((byte) 7);
				aClass22_4850 = new Class22(i_3_);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "iha.G(" + i + ','
					+ i_3_ + ')');
		}
	}

	static final void method2182(int i, Stream stream) {
		try {
			if (i < 56)
				method2175(null, false);
			anInt4851++;
			if ((((Stream) stream).buffer.length + -((Stream) stream).position) >= 1) {
				int i_4_ = stream.readUnsignedByte((byte) 35);
				if ((i_4_ ^ 0xffffffff) <= -1
						&& i_4_ <= 1
						&& (-((Stream) stream).position + ((Stream) stream).buffer.length) >= 2) {
					int i_5_ = stream.readUnsignedShort((byte) -65);
					if (i_5_ * 6 <= (-((Stream) stream).position + ((Stream) stream).buffer.length)) {
						for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
							int i_7_ = stream.readUnsignedShort((byte) -65);
							int i_8_ = stream.readInt(122);
							if (((i_7_ ^ 0xffffffff) > (Class11_Sub2_Sub20.anIntArray9148.length ^ 0xffffffff))
									&& Class299.aBoolArray4037[i_7_]
									&& ((((Class161) Class234_Sub2_Sub1.aClass306_8443
											.method1877(i_7_, false)).aChar2092) != '1' || (i_8_ >= -1 && (i_8_ ^ 0xffffffff) >= -2)))
								Class11_Sub2_Sub20.anIntArray9148[i_7_] = i_8_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("iha.E(" + i + ','
					+ (stream != null ? "{...}" : "null") + ')'));
		}
	}

	Class369(Class66 class66, int i, Class146 class146) {
		do {
			try {
				aClass146_4844 = class146;
				if (aClass146_4844 == null)
					break;
				int i_9_ = -1 + aClass146_4844.method928((byte) 20);
				aClass146_4844.method914(i_9_, 0);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("iha.<init>("
						+ (class66 != null ? "{...}" : "null") + ',' + i + ','
						+ (class146 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
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
