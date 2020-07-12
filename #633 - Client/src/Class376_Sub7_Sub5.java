/* Class376_Sub7_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

abstract class Class376_Sub7_Sub5 extends Class376_Sub7 {
	static int anInt9619;
	short aShort9620;
	static int anInt9621;
	static int anInt9622;
	static int anInt9623;
	short aShort9624;
	boolean aBool9625;
	short aShort9626;
	byte aByte9627;
	static int anInt9628;
	short aShort9629;
	static int anInt9630;
	static int anInt9631;
	/* synthetic */static Class aClass9632;

	static final void method3796(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			byte i_4_, int i_5_) {
		try {
			if (i_4_ <= -81) {
				Class275[] class275s = IncomingPacket.aClass275Array2082;
				for (int i_6_ = 0; i_6_ < class275s.length; i_6_++) {
					Class275 class275 = class275s[i_6_];
					if (class275 != null
							&& ((Class275) class275).anInt3697 == 2) {
						Class303.method1866(((Class275) class275).anInt3704,
								2 * (((Class275) class275).anInt3701),
								((Class275) class275).anInt3700, (byte) -77, i,
								i_3_ >> 1, i_0_ >> 1, i_5_,
								((Class275) class275).anInt3699);
						if ((Class12.anIntArray104[0] ^ 0xffffffff) < 0
								&& ((Class11_Sub25.anInt6279 % 20 ^ 0xffffffff) > -11)) {
							Class253 class253 = (Class268.aClass253Array3635[((Class275) class275).anInt3695]);
							int i_7_ = -12 + (i_1_ - -Class12.anIntArray104[0]);
							int i_8_ = Class12.anIntArray104[1] + i_2_ - 28;
							class253.method1610(i_7_, i_8_);
							Class11.method123(class253.method1622() + i_8_,
									class253.method1608() + i_7_, (byte) -63,
									i_7_, i_8_);
						}
					}
				}
				anInt9623++;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("um.NB(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_
					+ ',' + i_5_ + ')'));
		}
	}

	final int method2859(Class11_Sub46[] class11_sub46s, int i) {
		try {
			anInt9621++;
			int i_9_ = 0;
			while_247_: for (int i_10_ = ((Class376_Sub7_Sub5) this).aShort9626; i_10_ <= ((Class376_Sub7_Sub5) this).aShort9624; i_10_++) {
				for (int i_11_ = ((Class376_Sub7_Sub5) this).aShort9629; i_11_ <= ((Class376_Sub7_Sub5) this).aShort9620; i_11_++) {
					long l = (Class216.aLongArrayArrayArray2995[((Class376_Sub7) this).aByte7047][i_10_][i_11_]);
					long l_12_ = 0L;
					while_246_: while (l_12_ <= 48L) {
						int i_13_ = (int) (l >>> (int) l_12_ & 0xffffL);
						if ((i_13_ ^ 0xffffffff) >= -1)
							break;
						Class248 class248 = Class309.aClass248Array4132[i_13_ - 1];
						for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_14_++) {
							if (class11_sub46s[i_14_] == ((Class248) class248).aClass11_Sub46_3357) {
								l_12_ += 16L;
								continue while_246_;
							}
						}
						class11_sub46s[i_9_++] = ((Class248) class248).aClass11_Sub46_3357;
						if (i_9_ == 4)
							break while_247_;
						l_12_ += 16L;
					}
				}
			}
			for (int i_15_ = i_9_; i_15_ < 4; i_15_++)
				class11_sub46s[i_15_] = null;
			if ((((Class376_Sub7_Sub5) this).aByte9627 ^ 0xffffffff) != i) {
				int i_16_ = (((Class376_Sub7_Sub5) this).aShort9626 + -Class11_Sub45_Sub7.anInt8807);
				int i_17_ = (((Class376_Sub7_Sub5) this).aShort9629 + -Class15.anInt134);
				short i_18_;
				short i_19_;
				int i_20_;
				int i_21_;
				if ((((Class376_Sub7_Sub5) this).aByte9627 ^ 0xffffffff) != -2) {
					if (i_17_ <= -i_16_) {
						i_20_ = 1 + ((Class376_Sub7_Sub5) this).aShort9629;
						i_21_ = ((Class376_Sub7_Sub5) this).aShort9626 + 1;
						i_19_ = ((Class376_Sub7_Sub5) this).aShort9626;
						i_18_ = ((Class376_Sub7_Sub5) this).aShort9629;
					} else {
						i_20_ = ((Class376_Sub7_Sub5) this).aShort9629 - 1;
						i_19_ = ((Class376_Sub7_Sub5) this).aShort9626;
						i_21_ = ((Class376_Sub7_Sub5) this).aShort9626 - 1;
						i_18_ = ((Class376_Sub7_Sub5) this).aShort9629;
					}
				} else if (i_17_ <= i_16_) {
					i_18_ = ((Class376_Sub7_Sub5) this).aShort9629;
					i_19_ = ((Class376_Sub7_Sub5) this).aShort9626;
					i_20_ = ((Class376_Sub7_Sub5) this).aShort9629 + 1;
					i_21_ = -1 + ((Class376_Sub7_Sub5) this).aShort9626;
				} else {
					i_19_ = ((Class376_Sub7_Sub5) this).aShort9626;
					i_18_ = ((Class376_Sub7_Sub5) this).aShort9629;
					i_21_ = 1 + ((Class376_Sub7_Sub5) this).aShort9626;
					i_20_ = -1 + ((Class376_Sub7_Sub5) this).aShort9629;
				}
				int i_22_ = 0;
				while_249_: for (/**/; (i_9_ ^ 0xffffffff) < (i_22_ ^ 0xffffffff); i_22_++) {
					long l = (Class216.aLongArrayArrayArray2995[((Class376_Sub7) this).aByte7047][i_19_][i_20_]);
					while (l != 0L) {
						Class248 class248 = (Class309.aClass248Array4132[(int) ((l & 0xffffL) + -1L)]);
						l >>>= 16;
						if (((Class248) class248).aClass11_Sub46_3357 == class11_sub46s[i_22_])
							continue while_249_;
					}
					l = (Class216.aLongArrayArrayArray2995[((Class376_Sub7) this).aByte7047][i_21_][i_18_]);
					while (l != 0L) {
						Class248 class248 = (Class309.aClass248Array4132[(int) (-1L + (0xffffL & l))]);
						l >>>= 16;
						if (class11_sub46s[i_22_] == ((Class248) class248).aClass11_Sub46_3357)
							continue while_249_;
					}
					for (int i_23_ = i_22_; (i_23_ ^ 0xffffffff) > (-1 + i_9_ ^ 0xffffffff); i_23_++)
						class11_sub46s[i_23_] = class11_sub46s[i_23_ + 1];
					i_9_--;
				}
			}
			return i_9_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "um.OA("
					+ (class11_sub46s != null ? "{...}" : "null") + ',' + i
					+ ')');
		}
	}

	void method3797(boolean bool) {
		try {
			if (bool != true)
				method2865(71);
			anInt9628++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "um.MA(" + bool + ')');
		}
	}

	@SuppressWarnings("unchecked")
	static final boolean method3798(int i, Class var_class, String string) {
		try {
			anInt9631++;
			Class var_class_24_ = (Class) Class11_Sub3.aHashtable5114
					.get(string);
			if (var_class_24_ != null) {
				if (var_class_24_.getClassLoader() != var_class
						.getClassLoader())
					return false;
				return true;
			}
			int i_25_ = -123 / ((i + 85) / 40);
			File file = null;
			if (file == null)
				file = (File) Class19.aHashtable150.get(string);
			if (file != null) {
				try {
					file = new File(file.getCanonicalPath());
					Class var_class_26_ = Class.forName("java.lang.Runtime");
					Class var_class_27_ = Class
							.forName("java.lang.reflect.AccessibleObject");
					Method method = var_class_27_.getDeclaredMethod(
							"setAccessible", (new Class[] { Boolean.TYPE }));
					Method method_28_ = (var_class_26_.getDeclaredMethod(
							"load0",
							(new Class[] { Class.forName("java.lang.Class"),
									Class.forName("java.lang.String") })));
					method.invoke(method_28_, new Object[] { Boolean.TRUE });
					method_28_.invoke(Runtime.getRuntime(), new Object[] {
							var_class, file.getPath() });
					method.invoke(method_28_, new Object[] { Boolean.FALSE });
					Class11_Sub3.aHashtable5114.put(string, var_class);
					return true;
				} catch (NoSuchMethodException nosuchmethodexception) {
					System.load(file.getPath());
					Class11_Sub3.aHashtable5114
							.put(string, (aClass9632 != null ? aClass9632
									: (aClass9632 = getClassByName("Class49"))));
					return true;
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("um.MB(" + i + ','
					+ (var_class != null ? "{...}" : "null") + ','
					+ (string != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3799(int i, int i_29_, int i_30_, int i_31_,
			int i_32_, int i_33_, byte i_34_) {
		try {
			if ((i_32_ ^ 0xffffffff) != -9 && i_32_ != 16) {
				Class364 class364 = Class181.aClass364ArrayArrayArray2336[i_29_][i_30_][i];
				if (class364 == null)
					class364 = new Class364(i_29_);
				if (i_32_ != 1) {
					if ((i_32_ ^ 0xffffffff) == -3) {
						((Class364) class364).aShort4787 = (short) i_33_;
						((Class364) class364).aShort4788 = (short) i_31_;
					}
				} else {
					((Class364) class364).aShort4784 = (short) i_33_;
					((Class364) class364).aShort4786 = (short) i_31_;
				}
				if (Class57.aBool856)
					Class236_Sub3.method2648(0);
			} else if (i_32_ != 8) {
				int i_35_ = ((i_30_ << Class11_Sub2_Sub8.anInt8751) + Class376_Sub7_Sub3_Sub2.anInt10141);
				int i_36_ = i_35_ - Class376_Sub7_Sub3_Sub2.anInt10141;
				int i_37_ = i << Class11_Sub2_Sub8.anInt8751;
				int i_38_ = i_37_ + Class376_Sub7_Sub3_Sub2.anInt10141;
				int i_39_ = Class11_Sub2_Sub38.aClass12Array9796[i_29_]
						.method131((byte) -48, i, i_30_ + 1);
				int i_40_ = Class11_Sub2_Sub38.aClass12Array9796[i_29_]
						.method131((byte) 45, i + 1, i_30_);
				Class58_Sub1_Sub1.aClass203Array9173[Class265.anInt3614++] = new Class203(
						i_32_, i_29_, i_35_, i_36_, i_36_, i_35_, i_39_, i_40_,
						-i_33_ + i_40_, i_39_ - i_33_, i_37_, i_38_, i_38_,
						i_37_);
			} else {
				int i_41_ = i_30_ << Class11_Sub2_Sub8.anInt8751;
				int i_42_ = i_41_ + Class376_Sub7_Sub3_Sub2.anInt10141;
				int i_43_ = i << Class11_Sub2_Sub8.anInt8751;
				int i_44_ = i_43_ - -Class376_Sub7_Sub3_Sub2.anInt10141;
				int i_45_ = Class11_Sub2_Sub38.aClass12Array9796[i_29_]
						.method131((byte) 0, i, i_30_);
				int i_46_ = Class11_Sub2_Sub38.aClass12Array9796[i_29_]
						.method131((byte) -4, i + 1, i_30_ + 1);
				Class58_Sub1_Sub1.aClass203Array9173[Class265.anInt3614++] = new Class203(
						i_32_, i_29_, i_41_, i_42_, i_42_, i_41_, i_45_, i_46_,
						i_46_ + -i_33_, i_45_ + -i_33_, i_43_, i_44_, i_44_,
						i_43_);
			}
			anInt9622++;
			int i_47_ = -7 % ((i_34_ - 61) / 60);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("um.OB(" + i + ','
					+ i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ','
					+ i_33_ + ',' + i_34_ + ')'));
		}
	}

	final boolean method2869(int i) {
		try {
			anInt9619++;
			for (int i_48_ = ((Class376_Sub7_Sub5) this).aShort9626; ((((Class376_Sub7_Sub5) this).aShort9624 ^ 0xffffffff) <= (i_48_ ^ 0xffffffff)); i_48_++) {
				for (int i_49_ = ((Class376_Sub7_Sub5) this).aShort9629; ((Class376_Sub7_Sub5) this).aShort9620 >= i_49_; i_49_++) {
					int i_50_ = (Class94_Sub4.anInt7730 + i_48_ + -Class11_Sub45_Sub7.anInt8807);
					if ((i_50_ ^ 0xffffffff) <= -1
							&& (Class11_Sub2_Sub19.aBoolArrayArray9091.length ^ 0xffffffff) < (i_50_ ^ 0xffffffff)) {
						int i_51_ = (Class94_Sub4.anInt7730 + (i_49_ + -Class15.anInt134));
						if (i_51_ >= 0
								&& (Class11_Sub2_Sub19.aBoolArrayArray9091.length > i_51_)
								&& (Class11_Sub2_Sub19.aBoolArrayArray9091[i_50_][i_51_]))
							return true;
					}
				}
			}
			if (i != -21499)
				((Class376_Sub7_Sub5) this).aShort9629 = (short) 53;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "um.LA(" + i + ')');
		}
	}

	final boolean method2865(int i) {
		try {
			anInt9630++;
			if (i > -85)
				return false;
			return Class129.method837(((Class376_Sub7_Sub5) this).aShort9624,
					((Class376_Sub7_Sub5) this).aShort9629,
					((Class376_Sub7) this).aByte7039, this.method2867(32767),
					(byte) 81, ((Class376_Sub7_Sub5) this).aShort9620,
					((Class376_Sub7_Sub5) this).aShort9626);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "um.JA(" + i + ')');
		}
	}

	Class376_Sub7_Sub5(int i, int i_52_, int i_53_, int i_54_, int i_55_,
			int i_56_, int i_57_, int i_58_, int i_59_, boolean bool, byte i_60_) {
		try {
			((Class376_Sub7_Sub5) this).aByte9627 = i_60_;
			((Class376_Sub7) this).anInt7031 = i_55_;
			((Class376_Sub7_Sub5) this).aShort9626 = (short) i_56_;
			((Class376_Sub7_Sub5) this).aShort9620 = (short) i_59_;
			((Class376_Sub7) this).anInt7036 = i_54_;
			((Class376_Sub7_Sub5) this).aBool9625 = bool;
			((Class376_Sub7_Sub5) this).aShort9624 = (short) i_57_;
			((Class376_Sub7) this).aByte7047 = (byte) i;
			((Class376_Sub7) this).anInt7045 = i_53_;
			((Class376_Sub7_Sub5) this).aShort9629 = (short) i_58_;
			((Class376_Sub7) this).aByte7039 = (byte) i_52_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("um.<init>(" + i + ','
					+ i_52_ + ',' + i_53_ + ',' + i_54_ + ',' + i_55_ + ','
					+ i_56_ + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ','
					+ bool + ',' + i_60_ + ')'));
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
