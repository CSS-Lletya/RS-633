/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class Class117 {
	static int anInt1585;
	static int anInt1586;
	static Class117 aClass117_1587 = new Class117();
	static int anInt1588;
	static int anInt1589;
	static int anInt1590;
	static Class117 aClass117_1591 = new Class117();
	static Class117 aClass117_1592 = new Class117();
	static Class117 aClass117_1593 = new Class117();
	static Class9 aClass9_1594;
	static int anInt1595 = 7000;
	static Class40 aClass40_1596;
	static int anInt1597 = anInt1595;
	static boolean aBool1598 = false;

	static final void method765(int i, int i_0_, int i_1_, boolean bool,
			int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if ((bool ? ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5720
					.method2462(false)
					: ((Class11_Sub17) Class376_Sub7_Sub3_Sub1.aClass11_Sub17_9847).aClass108_Sub8_5702
							.method2462(false)) != 0
					&& (i_1_ ^ 0xffffffff) != -1
					&& (Class376_Sub7_Sub3_Sub1.anInt9863 ^ 0xffffffff) > -51
					&& i_4_ != -1)
				Class343.aClass56Array4543[Class376_Sub7_Sub3_Sub1.anInt9863++] = new Class56(
						!bool ? (byte) 2 : (byte) 3, i_4_, i_1_, i, i_3_, i_2_,
						i_5_, null);
			if (i_0_ != -18)
				method766(-87, -19, 49, -96, (byte) 97);
			anInt1585++;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dn.B(" + i + ','
					+ i_0_ + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + i_3_
					+ ',' + i_4_ + ',' + i_5_ + ')'));
		}
	}

	static final int method766(int i, int i_6_, int i_7_, int i_8_, byte i_9_) {
		try {
			anInt1589++;
			int i_10_ = 0xf & i_6_;
			int i_11_ = (i_10_ ^ 0xffffffff) > -9 ? i_8_ : i_7_;
			int i_12_ = ((i_10_ ^ 0xffffffff) <= -5 ? i_10_ != 12
					&& (i_10_ ^ 0xffffffff) != -15 ? i : i_8_ : i_7_);
			if (i_9_ >= -46)
				method766(-85, 78, -11, -41, (byte) -29);
			return (((0x1 & i_10_ ^ 0xffffffff) != -1 ? -i_11_ : i_11_) + ((i_10_ & 0x2) == 0 ? i_12_
					: -i_12_));
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dn.A(" + i + ','
					+ i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
		}
	}

	static final boolean method767(int i, int i_13_, int i_14_) {
		try {
			anInt1590++;
			Class42 class42 = Class11_Sub4.aClass290_5237.method1793((byte) 13,
					i_13_);
			if (i == i_14_)
				i = 10;
			if ((i ^ 0xffffffff) <= -6 && (i ^ 0xffffffff) >= -9)
				i = 4;
			return class42.method373(true, i);
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dn.D(" + i + ','
					+ i_13_ + ',' + i_14_ + ')'));
		}
	}

	static final void method768(boolean bool, Packet class11_sub20_sub1) {
		try {
			anInt1586++;
			Class11_Sub41 class11_sub41 = ((Class11_Sub41) Class11_Sub45_Sub20_Sub1.aClass84_9948
					.method584(-12261));
			if (class11_sub41 != null) {
				boolean bool_15_ = false;
				if (bool != true)
					anInt1595 = -52;
				for (int i = 0; ((i ^ 0xffffffff) > (((Class11_Sub41) class11_sub41).anInt7251 ^ 0xffffffff)); i++) {
					if (((Class11_Sub41) class11_sub41).aClass368Array7250[i] != null) {
						if ((((Class11_Sub41) class11_sub41).aClass368Array7250[i].anInt4837) == 2)
							((Class11_Sub41) class11_sub41).anIntArray7252[i] = -5;
						if (((((Class11_Sub41) class11_sub41).aClass368Array7250[i].anInt4837) ^ 0xffffffff) == -1)
							bool_15_ = true;
					}
					if (((Class11_Sub41) class11_sub41).aClass368Array7253[i] != null) {
						if (((((Class11_Sub41) class11_sub41).aClass368Array7253[i].anInt4837) ^ 0xffffffff) == -3)
							((Class11_Sub41) class11_sub41).anIntArray7252[i] = -6;
						if (((((Class11_Sub41) class11_sub41).aClass368Array7253[i].anInt4837) ^ 0xffffffff) == -1)
							bool_15_ = true;
					}
				}
				if (!bool_15_) {
					int i = ((Stream) class11_sub20_sub1).position;
					class11_sub20_sub1.writeInt(-49,
							((Class11_Sub41) class11_sub41).anInt7256);
					for (int i_16_ = 0; ((Class11_Sub41) class11_sub41).anInt7251 > i_16_; i_16_++) {
						if (((((Class11_Sub41) class11_sub41).anIntArray7252[i_16_]) ^ 0xffffffff) != -1)
							class11_sub20_sub1
									.writeByte(
											(((Class11_Sub41) class11_sub41).anIntArray7252[i_16_]),
											-1528071456);
						else {
							try {
								int i_17_ = (((Class11_Sub41) class11_sub41).anIntArray7249[i_16_]);
								if ((i_17_ ^ 0xffffffff) != -1) {
									if (i_17_ == 1) {
										Field field = ((Field) (((Class11_Sub41) class11_sub41).aClass368Array7250[i_16_].anObject4838));
										field.setInt(
												null,
												(((Class11_Sub41) class11_sub41).anIntArray7258[i_16_]));
										class11_sub20_sub1.writeByte(0,
												-1528071456);
									} else if (i_17_ == 2) {
										Field field = ((Field) (((Class11_Sub41) class11_sub41).aClass368Array7250[i_16_].anObject4838));
										int i_18_ = field.getModifiers();
										class11_sub20_sub1.writeByte(0,
												-1528071456);
										class11_sub20_sub1.writeInt(-49, i_18_);
									}
								} else {
									Field field = ((Field) (((Class11_Sub41) class11_sub41).aClass368Array7250[i_16_].anObject4838));
									int i_19_ = field.getInt(null);
									class11_sub20_sub1
											.writeByte(0, -1528071456);
									class11_sub20_sub1.writeInt(-49, i_19_);
								}
								if ((i_17_ ^ 0xffffffff) == -4) {
									Method method = ((Method) (((Class11_Sub41) class11_sub41).aClass368Array7253[i_16_].anObject4838));
									byte[][] is = (((Class11_Sub41) class11_sub41).aByteArrayArrayArray7257[i_16_]);
									Object[] objects = new Object[is.length];
									for (int i_20_ = 0; is.length > i_20_; i_20_++) {
										ObjectInputStream objectinputstream = (new ObjectInputStream(
												new ByteArrayInputStream(
														is[i_20_])));
										objects[i_20_] = objectinputstream
												.readObject();
									}
									Object object = method
											.invoke(null, objects);
									if (object == null)
										class11_sub20_sub1.writeByte(0,
												-1528071456);
									else if (!(object instanceof Number)) {
										if (!(object instanceof String))
											class11_sub20_sub1.writeByte(4,
													-1528071456);
										else {
											class11_sub20_sub1.writeByte(2,
													-1528071456);
											class11_sub20_sub1.writeString(
													(byte) 27, (String) object);
										}
									} else {
										class11_sub20_sub1.writeByte(1,
												-1528071456);
										class11_sub20_sub1.writeLong(
												(byte) -103,
												((Number) object).longValue());
									}
								} else if (i_17_ == 4) {
									Method method = ((Method) (((Class11_Sub41) class11_sub41).aClass368Array7253[i_16_].anObject4838));
									int i_21_ = method.getModifiers();
									class11_sub20_sub1
											.writeByte(0, -1528071456);
									class11_sub20_sub1.writeInt(-49, i_21_);
								}
							} catch (ClassNotFoundException classnotfoundexception) {
								class11_sub20_sub1.writeByte(-10, -1528071456);
							} catch (java.io.InvalidClassException invalidclassexception) {
								class11_sub20_sub1.writeByte(-11, -1528071456);
							} catch (java.io.StreamCorruptedException streamcorruptedexception) {
								class11_sub20_sub1.writeByte(-12, -1528071456);
							} catch (java.io.OptionalDataException optionaldataexception) {
								class11_sub20_sub1.writeByte(-13, -1528071456);
							} catch (IllegalAccessException illegalaccessexception) {
								class11_sub20_sub1.writeByte(-14, -1528071456);
							} catch (IllegalArgumentException illegalargumentexception) {
								class11_sub20_sub1.writeByte(-15, -1528071456);
							} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
								class11_sub20_sub1.writeByte(-16, -1528071456);
							} catch (SecurityException securityexception) {
								class11_sub20_sub1.writeByte(-17, -1528071456);
							} catch (java.io.IOException ioexception) {
								class11_sub20_sub1.writeByte(-18, -1528071456);
							} catch (NullPointerException nullpointerexception) {
								class11_sub20_sub1.writeByte(-19, -1528071456);
							} catch (Exception exception) {
								class11_sub20_sub1.writeByte(-20, -1528071456);
							} catch (Throwable throwable) {
								class11_sub20_sub1.writeByte(-21, -1528071456);
							}
						}
					}
					class11_sub20_sub1.method2548(i, (byte) -104);
					class11_sub41.method122(-113);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, ("dn.C(" + bool + ','
					+ (class11_sub20_sub1 != null ? "{...}" : "null") + ')'));
		}
	}

	public static void method769(byte i) {
		try {
			aClass117_1593 = null;
			aClass40_1596 = null;
			aClass117_1591 = null;
			aClass117_1592 = null;
			aClass117_1587 = null;
			if (i < 121)
				aClass117_1593 = null;
			aClass9_1594 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dn.E(" + i + ')');
		}
	}

	public final String toString() {
		try {
			anInt1588++;
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "dn.toString(" + ')');
		}
	}

	public Class117() {
		/* empty */
	}

	static {
		aClass9_1594 = new Class9(6, 1);
	}
}
