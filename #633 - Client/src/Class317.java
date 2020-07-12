/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class317 {
	private Class43 aClass43_4190;
	private Class43 aClass43_4191;
	private int anInt4192 = 100;
	int anInt4193;
	private Class43 aClass43_4194;
	int anInt4195;
	private Class43 aClass43_4196;
	private static int[] anIntArray4197 = new int[32768];
	private int anInt4198 = 0;
	private Class43 aClass43_4199;
	private Class43 aClass43_4200;
	private Class43 aClass43_4201;
	private int[] anIntArray4202;
	private static int[] anIntArray4203;
	private Class371 aClass371_4204;
	private static int[] anIntArray4205;
	private int[] anIntArray4206;
	private int[] anIntArray4207;
	private Class43 aClass43_4208;
	private Class43 aClass43_4209;
	private static int[] anIntArray4210;
	private static int[] anIntArray4211;
	private static int[] anIntArray4212;
	private static int[] anIntArray4213;
	private static int[] anIntArray4214;

	private final int method1924(int i, int i_0_, int i_1_) {
		if (i_1_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_0_;
			return -i_0_;
		}
		if (i_1_ == 2)
			return anIntArray4203[i & 0x7fff] * i_0_ >> 14;
		if (i_1_ == 3)
			return ((i & 0x7fff) * i_0_ >> 14) - i_0_;
		if (i_1_ == 4)
			return anIntArray4197[i / 2607 & 0x7fff] * i_0_;
		return 0;
	}

	final int[] method1925(int i, int i_2_) {
		Class311.method1902(anIntArray4205, 0, i);
		if (i_2_ < 10)
			return anIntArray4205;
		double d = (double) i / ((double) i_2_ + 0.0);
		aClass43_4208.method390();
		aClass43_4200.method390();
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (aClass43_4209 != null) {
			aClass43_4209.method390();
			aClass43_4194.method390();
			i_3_ = (int) ((double) (((Class43) aClass43_4209).anInt699 - ((Class43) aClass43_4209).anInt697) * 32.768 / d);
			i_4_ = (int) ((double) ((Class43) aClass43_4209).anInt697 * 32.768 / d);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (aClass43_4190 != null) {
			aClass43_4190.method390();
			aClass43_4191.method390();
			i_6_ = (int) ((double) (((Class43) aClass43_4190).anInt699 - ((Class43) aClass43_4190).anInt697) * 32.768 / d);
			i_7_ = (int) ((double) ((Class43) aClass43_4190).anInt697 * 32.768 / d);
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			if (anIntArray4207[i_9_] != 0) {
				anIntArray4211[i_9_] = 0;
				anIntArray4214[i_9_] = (int) ((double) anIntArray4206[i_9_] * d);
				anIntArray4213[i_9_] = (anIntArray4207[i_9_] << 14) / 100;
				anIntArray4210[i_9_] = (int) ((double) (((Class43) aClass43_4208).anInt699 - ((Class43) aClass43_4208).anInt697)
						* 32.768
						* Math.pow(1.0057929410678534,
								(double) anIntArray4202[i_9_]) / d);
				anIntArray4212[i_9_] = (int) ((double) ((Class43) aClass43_4208).anInt697 * 32.768 / d);
			}
		}
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = aClass43_4208.method392(i);
			int i_12_ = aClass43_4200.method392(i);
			if (aClass43_4209 != null) {
				int i_13_ = aClass43_4209.method392(i);
				int i_14_ = aClass43_4194.method392(i);
				i_11_ += method1924(i_5_, i_14_,
						((Class43) aClass43_4209).anInt696) >> 1;
				i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
			}
			if (aClass43_4190 != null) {
				int i_15_ = aClass43_4190.method392(i);
				int i_16_ = aClass43_4191.method392(i);
				i_12_ = i_12_
						* ((method1924(i_8_, i_16_,
								((Class43) aClass43_4190).anInt696) >> 1) + 32768) >> 15;
				i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				if (anIntArray4207[i_17_] != 0) {
					int i_18_ = i_10_ + anIntArray4214[i_17_];
					if (i_18_ < i) {
						anIntArray4205[i_18_] += method1924(
								anIntArray4211[i_17_], i_12_
										* anIntArray4213[i_17_] >> 15,
								((Class43) aClass43_4208).anInt696);
						anIntArray4211[i_17_] += ((i_11_
								* anIntArray4210[i_17_] >> 16) + anIntArray4212[i_17_]);
					}
				}
			}
		}
		if (aClass43_4199 != null) {
			aClass43_4199.method390();
			aClass43_4201.method390();
			int i_19_ = 0;
			boolean bool = false;
			boolean bool_20_ = true;
			for (int i_21_ = 0; i_21_ < i; i_21_++) {
				int i_22_ = aClass43_4199.method392(i);
				int i_23_ = aClass43_4201.method392(i);
				int i_24_;
				if (bool_20_)
					i_24_ = (((Class43) aClass43_4199).anInt697 + ((((Class43) aClass43_4199).anInt699 - ((Class43) aClass43_4199).anInt697)
							* i_22_ >> 8));
				else
					i_24_ = (((Class43) aClass43_4199).anInt697 + ((((Class43) aClass43_4199).anInt699 - ((Class43) aClass43_4199).anInt697)
							* i_23_ >> 8));
				i_19_ += 256;
				if (i_19_ >= i_24_) {
					i_19_ = 0;
					bool_20_ = !bool_20_;
				}
				if (bool_20_)
					anIntArray4205[i_21_] = 0;
			}
		}
		if (anInt4198 > 0 && anInt4192 > 0) {
			int i_25_ = (int) ((double) anInt4198 * d);
			for (int i_26_ = i_25_; i_26_ < i; i_26_++)
				anIntArray4205[i_26_] += anIntArray4205[i_26_ - i_25_]
						* anInt4192 / 100;
		}
		if (((Class371) aClass371_4204).anIntArray4864[0] > 0
				|| ((Class371) aClass371_4204).anIntArray4864[1] > 0) {
			aClass43_4196.method390();
			int i_27_ = aClass43_4196.method392(i + 1);
			int i_28_ = aClass371_4204.method2187(0, (float) i_27_ / 65536.0F);
			int i_29_ = aClass371_4204.method2187(1, (float) i_27_ / 65536.0F);
			if (i >= i_28_ + i_29_) {
				int i_30_ = 0;
				int i_31_ = i_29_;
				if (i_31_ > i - i_28_)
					i_31_ = i - i_28_;
				for (/**/; i_30_ < i_31_; i_30_++) {
					int i_32_ = (int) (((long) anIntArray4205[i_30_ + i_28_] * (long) Class371.anInt4863) >> 16);
					for (int i_33_ = 0; i_33_ < i_28_; i_33_++)
						i_32_ += (int) (((long) (anIntArray4205[i_30_ + i_28_
								- 1 - i_33_]) * (long) (Class371.anIntArrayArray4868[0][i_33_])) >> 16);
					for (int i_34_ = 0; i_34_ < i_30_; i_34_++)
						i_32_ -= (int) (((long) anIntArray4205[i_30_ - 1
								- i_34_] * (long) (Class371.anIntArrayArray4868[1][i_34_])) >> 16);
					anIntArray4205[i_30_] = i_32_;
					i_27_ = aClass43_4196.method392(i + 1);
				}
				i_31_ = 128;
				for (;;) {
					if (i_31_ > i - i_28_)
						i_31_ = i - i_28_;
					for (/**/; i_30_ < i_31_; i_30_++) {
						int i_35_ = (int) (((long) anIntArray4205[i_30_ + i_28_] * (long) Class371.anInt4863) >> 16);
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++)
							i_35_ += (int) (((long) (anIntArray4205[i_30_
									+ i_28_ - 1 - i_36_]) * (long) (Class371.anIntArrayArray4868[0][i_36_])) >> 16);
						for (int i_37_ = 0; i_37_ < i_29_; i_37_++)
							i_35_ -= (int) (((long) (anIntArray4205[i_30_ - 1
									- i_37_]) * (long) (Class371.anIntArrayArray4868[1][i_37_])) >> 16);
						anIntArray4205[i_30_] = i_35_;
						i_27_ = aClass43_4196.method392(i + 1);
					}
					if (i_30_ >= i - i_28_)
						break;
					i_28_ = aClass371_4204.method2187(0,
							(float) i_27_ / 65536.0F);
					i_29_ = aClass371_4204.method2187(1,
							(float) i_27_ / 65536.0F);
					i_31_ += 128;
				}
				for (/**/; i_30_ < i; i_30_++) {
					int i_38_ = 0;
					for (int i_39_ = i_30_ + i_28_ - i; i_39_ < i_28_; i_39_++)
						i_38_ += (int) (((long) (anIntArray4205[i_30_ + i_28_
								- 1 - i_39_]) * (long) (Class371.anIntArrayArray4868[0][i_39_])) >> 16);
					for (int i_40_ = 0; i_40_ < i_29_; i_40_++)
						i_38_ -= (int) (((long) anIntArray4205[i_30_ - 1
								- i_40_] * (long) (Class371.anIntArrayArray4868[1][i_40_])) >> 16);
					anIntArray4205[i_30_] = i_38_;
					i_27_ = aClass43_4196.method392(i + 1);
				}
			}
		}
		for (int i_41_ = 0; i_41_ < i; i_41_++) {
			if (anIntArray4205[i_41_] < -32768)
				anIntArray4205[i_41_] = -32768;
			if (anIntArray4205[i_41_] > 32767)
				anIntArray4205[i_41_] = 32767;
		}
		return anIntArray4205;
	}

	public static void method1926() {
		anIntArray4205 = null;
		anIntArray4197 = null;
		anIntArray4203 = null;
		anIntArray4211 = null;
		anIntArray4214 = null;
		anIntArray4213 = null;
		anIntArray4210 = null;
		anIntArray4212 = null;
	}

	final void method1927(Stream stream) {
		aClass43_4208 = new Class43();
		aClass43_4208.method391(stream);
		aClass43_4200 = new Class43();
		aClass43_4200.method391(stream);
		int i = stream.readUnsignedByte((byte) 35);
		if (i != 0) {
			((Stream) stream).position--;
			aClass43_4209 = new Class43();
			aClass43_4209.method391(stream);
			aClass43_4194 = new Class43();
			aClass43_4194.method391(stream);
		}
		i = stream.readUnsignedByte((byte) 35);
		if (i != 0) {
			((Stream) stream).position--;
			aClass43_4190 = new Class43();
			aClass43_4190.method391(stream);
			aClass43_4191 = new Class43();
			aClass43_4191.method391(stream);
		}
		i = stream.readUnsignedByte((byte) 35);
		if (i != 0) {
			((Stream) stream).position--;
			aClass43_4199 = new Class43();
			aClass43_4199.method391(stream);
			aClass43_4201 = new Class43();
			aClass43_4201.method391(stream);
		}
		for (int i_42_ = 0; i_42_ < 10; i_42_++) {
			int i_43_ = stream.readSmart(-51);
			if (i_43_ == 0)
				break;
			anIntArray4207[i_42_] = i_43_;
			anIntArray4202[i_42_] = stream.method2532(-5929);
			anIntArray4206[i_42_] = stream.readSmart(15);
		}
		anInt4198 = stream.readSmart(-122);
		anInt4192 = stream.readSmart(-46);
		((Class317) this).anInt4193 = stream.readUnsignedShort((byte) -65);
		((Class317) this).anInt4195 = stream.readUnsignedShort((byte) -65);
		aClass371_4204 = new Class371();
		aClass43_4196 = new Class43();
		aClass371_4204.method2190(stream, aClass43_4196);
	}

	public Class317() {
		((Class317) this).anInt4195 = 0;
		((Class317) this).anInt4193 = 500;
		anIntArray4206 = new int[5];
		anIntArray4202 = new int[5];
		anIntArray4207 = new int[5];
	}

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray4197[i] = (random.nextInt() & 0x2) - 1;
		anIntArray4203 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray4203[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray4205 = new int[220500];
		anIntArray4210 = new int[5];
		anIntArray4211 = new int[5];
		anIntArray4212 = new int[5];
		anIntArray4213 = new int[5];
		anIntArray4214 = new int[5];
	}
}
