/* Class91_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import jaggl.OpenGL;

final class Class91_Sub3_Sub1 extends Class91_Sub3 {
	static int anInt9335 = 0;
	static int anInt9336;
	static byte[][] aByteArrayArray9337;
	static int anInt9338;
	static int anInt9339;
	static int[] anIntArray9340;
	static int anInt9341;
	static int anInt9342;
	static int anInt9343;

	public static void method3647(boolean bool) {
		do {
			try {
				anIntArray9340 = null;
				aByteArrayArray9337 = null;
				if (bool == false)
					break;
				method3650((byte) -81);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "oha.I(" + bool
						+ ')');
			}
			break;
		} while (false);
	}

	static final int method3648(boolean bool, int i, int i_0_, int i_1_) {
		try {
			anInt9336++;
			Class11_Sub37 class11_sub37 = Class26.method218(bool, -9854, i);
			if (class11_sub37 == null)
				return 0;
			if (i_0_ == -1)
				return 0;
			int i_2_ = 0;
			int i_3_ = 0;
			if (i_1_ > -68)
				method3647(true);
			for (/**/; i_3_ < ((Class11_Sub37) class11_sub37).anIntArray7088.length; i_3_++) {
				if ((i_0_ ^ 0xffffffff) == (((Class11_Sub37) class11_sub37).anIntArray7082[i_3_] ^ 0xffffffff))
					i_2_ += (((Class11_Sub37) class11_sub37).anIntArray7088[i_3_]);
			}
			return i_2_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oha.H(" + bool + ','
					+ i + ',' + i_0_ + ',' + i_1_ + ')'));
		}
	}

	static final void method3649(int i, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_, byte[] is) {
		try {
			if (i_6_ >= 42) {
				anInt9342++;
				if (i_5_ > 0 && !Class261.method1669(i_5_, (byte) 66))
					throw new IllegalArgumentException("");
				if ((i ^ 0xffffffff) < -1
						&& !Class261.method1669(i, (byte) 112))
					throw new IllegalArgumentException("");
				int i_9_ = Class58_Sub1_Sub1.method3584(i_8_, true);
				int i_10_ = 0;
				int i_11_ = (i ^ 0xffffffff) < (i_5_ ^ 0xffffffff) ? i_5_ : i;
				int i_12_ = i_5_ >> 1;
				int i_13_ = i >> 1;
				byte[] is_14_ = is;
				byte[] is_15_ = new byte[i_9_ * i_12_ * i_13_];
				for (;;) {
					OpenGL.glTexImage2Dub(i_4_, i_10_, i_7_, i_5_, i, 0, i_8_,
							5121, is_14_, 0);
					if (i_11_ <= 1)
						break;
					int i_16_ = i_5_ * i_9_;
					byte[] is_17_ = is_15_;
					for (int i_18_ = 0; i_9_ > i_18_; i_18_++) {
						int i_19_ = i_18_;
						int i_20_ = i_18_;
						int i_21_ = i_16_ + i_20_;
						for (int i_22_ = 0; i_22_ < i_13_; i_22_++) {
							for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff); i_23_++) {
								int i_24_ = is_14_[i_20_];
								i_20_ += i_9_;
								i_24_ += is_14_[i_20_];
								i_24_ += is_14_[i_21_];
								i_20_ += i_9_;
								i_21_ += i_9_;
								i_24_ += is_14_[i_21_];
								is_15_[i_19_] = (byte) (i_24_ >> 2);
								i_21_ += i_9_;
								i_19_ += i_9_;
							}
							i_21_ += i_16_;
							i_20_ += i_16_;
						}
					}
					is_15_ = is_14_;
					i = i_13_;
					is_14_ = is_17_;
					i_5_ = i_12_;
					i_10_++;
					i_11_ >>= 1;
					i_12_ >>= 1;
					i_13_ >>= 1;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oha.L(" + i + ','
					+ i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_
					+ ',' + (is != null ? "{...}" : "null") + ')'));
		}
	}

	static final void method3650(byte i) {
		try {
			if (i < 101)
				aByteArrayArray9337 = null;
			anInt9341++;
			for (Class11_Sub45_Sub17 class11_sub45_sub17 = ((Class11_Sub45_Sub17) Class51.aClass84_796
					.method584(-12261)); class11_sub45_sub17 != null; class11_sub45_sub17 = ((Class11_Sub45_Sub17) Class51.aClass84_796
					.method578(-15361))) {
				Class376_Sub7_Sub5_Sub2 class376_sub7_sub5_sub2 = (((Class11_Sub45_Sub17) class11_sub45_sub17).aClass376_Sub7_Sub5_Sub2_9508);
				if (Class11_Sub25.anInt6279 > (((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt9980)) {
					class11_sub45_sub17.method122(-125);
					class376_sub7_sub5_sub2.method3901(16383);
				} else if ((((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt10017) <= Class11_Sub25.anInt6279) {
					class376_sub7_sub5_sub2.method3899((byte) 97);
					if (((((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt9982) ^ 0xffffffff) < -1) {
						Class11_Sub25 class11_sub25 = ((Class11_Sub25) (Class11_Sub2_Sub25.aClass213_9322
								.method1369(
										(byte) 26,
										(long) (-1 + (((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt9982)))));
						if (class11_sub25 != null) {
							Npc class376_sub7_sub5_sub5_sub2 = (((Class11_Sub25) class11_sub25).aNpc_2373);
							if ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 ^ 0xffffffff) <= -1
									&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045 ^ 0xffffffff) > (Class300.anInt4051 * 512 ^ 0xffffffff))
									&& (((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 ^ 0xffffffff) <= -1
									&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031 ^ 0xffffffff) > (512 * Class108_Sub12.anInt6228 ^ 0xffffffff)))
								class376_sub7_sub5_sub2
										.method3903(
												((Class318
														.method1931(
																69,
																(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031),
																((Class376_Sub7) class376_sub7_sub5_sub2).aByte7047,
																(((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045))) - ((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt10014),
												((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7045,
												0,
												((Class376_Sub7) class376_sub7_sub5_sub5_sub2).anInt7031,
												Class11_Sub25.anInt6279);
						}
					}
					if (((((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt9982) ^ 0xffffffff) > -1) {
						int i_25_ = (-((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt9982 - 1);
						Player class376_sub7_sub5_sub5_sub1;
						if ((Class11_Sub44.anInt7791 ^ 0xffffffff) != (i_25_ ^ 0xffffffff))
							class376_sub7_sub5_sub5_sub1 = (Class366.aClass376_Sub7_Sub5_Sub5_Sub1Array4814[i_25_]);
						else
							class376_sub7_sub5_sub5_sub1 = (Class11_Sub2_Sub8.myPlayer);
						if (class376_sub7_sub5_sub5_sub1 != null
								&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045) ^ 0xffffffff) <= -1
								&& ((((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045 ^ 0xffffffff) > (512 * Class300.anInt4051 ^ 0xffffffff))
								&& (((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031) >= 0
								&& (512 * Class108_Sub12.anInt6228 > ((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031))
							class376_sub7_sub5_sub2
									.method3903(
											((Class318
													.method1931(
															110,
															((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031,
															(((Class376_Sub7) class376_sub7_sub5_sub2).aByte7047),
															((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045)) + -((Class376_Sub7_Sub5_Sub2) class376_sub7_sub5_sub2).anInt10014),
											((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7045,
											0,
											((Class376_Sub7) class376_sub7_sub5_sub5_sub1).anInt7031,
											Class11_Sub25.anInt6279);
					}
					class376_sub7_sub5_sub2.method3910(Class104.anInt1398,
							(byte) 104);
					Class98.method661(class376_sub7_sub5_sub2, true);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "oha.G(" + i + ')');
		}
	}

	static final String method3651(int i, Throwable throwable)
			throws IOException {
		try {
			anInt9339++;
			String string;
			if (!(throwable instanceof RuntimeException_Sub1))
				string = "";
			else {
				RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
				throwable = (((RuntimeException_Sub1) runtimeexception_sub1).aThrowable9962);
				string = (((RuntimeException_Sub1) runtimeexception_sub1).aString9963)
						+ " | ";
			}
			StringWriter stringwriter = new StringWriter();
			PrintWriter printwriter = new PrintWriter(stringwriter);
			throwable.printStackTrace(printwriter);
			printwriter.close();
			String string_26_ = stringwriter.toString();
			BufferedReader bufferedreader = new BufferedReader(
					new StringReader(string_26_));
			String string_27_ = bufferedreader.readLine();
			for (;;) {
				String string_28_ = bufferedreader.readLine();
				if (string_28_ == null)
					break;
				int i_29_ = string_28_.indexOf('(');
				int i_30_ = string_28_.indexOf(')', 1 + i_29_);
				String string_31_;
				if (i_29_ == -1)
					string_31_ = string_28_;
				else
					string_31_ = string_28_.substring(0, i_29_);
				string_31_ = string_31_.trim();
				string_31_ = string_31_
						.substring(string_31_.lastIndexOf(' ') + 1);
				string_31_ = string_31_
						.substring(string_31_.lastIndexOf('\t') + 1);
				string += string_31_;
				if ((i_29_ ^ 0xffffffff) != 0 && (i_30_ ^ 0xffffffff) != 0) {
					int i_32_ = string_28_.indexOf(".java:", i_29_);
					if ((i_32_ ^ 0xffffffff) <= -1)
						string += string_28_.substring(5 + i_32_, i_30_);
				}
				string += ' ';
			}
			if (i >= -111)
				anIntArray9340 = null;
			string += "| " + (String) string_27_;
			return string;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static final byte[] method3652(byte[] is, int i, int i_33_, int i_34_) {
		try {
			int i_35_ = 63 % ((i_33_ + 60) / 46);
			anInt9338++;
			byte[] is_36_;
			if ((i_34_ ^ 0xffffffff) >= -1)
				is_36_ = is;
			else {
				is_36_ = new byte[i];
				for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i ^ 0xffffffff); i_37_++)
					is_36_[i_37_] = is[i_34_ + i_37_];
			}
			Class359 class359 = new Class359();
			class359.method2139(-2);
			class359.method2135((byte) -64, (long) (i * 8), is_36_);
			byte[] is_38_ = new byte[64];
			class359.method2138(110, 0, is_38_);
			return is_38_;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("oha.K("
					+ (is != null ? "{...}" : "null") + ',' + i + ',' + i_33_
					+ ',' + i_34_ + ')'));
		}
	}
}
