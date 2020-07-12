/* Class11_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class11_Sub21 extends Class11 {
	boolean aBool5961 = false;
	static int anInt5962;
	static int anInt5963;
	int anInt5964 = -1;
	int anInt5965;
	static IncomingPacket GAME_MESSAGE_IN_PACKET = new IncomingPacket(101, -1);
	int anInt5967;
	int anInt5968;
	int anInt5969;
	int anInt5970;

	static final boolean method2560(byte i) {
		try {
			anInt5962++;
			Hashtable hashtable = new Hashtable();
			Enumeration enumeration = Class11_Sub3.aHashtable5114.keys();
			while (enumeration.hasMoreElements()) {
				Object object = enumeration.nextElement();
				hashtable.put(object, Class11_Sub3.aHashtable5114.get(object));
			}
			try {
				Class var_class = Class
						.forName("java.lang.reflect.AccessibleObject");
				Class var_class_0_ = Class.forName("java.lang.ClassLoader");
				Field field = var_class_0_.getDeclaredField("nativeLibraries");
				Method method = var_class.getDeclaredMethod("setAccessible",
						(new Class[] { Boolean.TYPE }));
				method.invoke(field, new Object[] { Boolean.TRUE });
				try {
					enumeration = Class11_Sub3.aHashtable5114.keys();
					while (enumeration.hasMoreElements()) {
						String string = (String) enumeration.nextElement();
						try {
							File file = (File) Class19.aHashtable150
									.get(string);
							Class var_class_1_ = ((Class) Class11_Sub3.aHashtable5114
									.get(string));
							Vector vector = ((Vector) field.get(var_class_1_
									.getClassLoader()));
							for (int i_2_ = 0; ((vector.size() ^ 0xffffffff) < (i_2_ ^ 0xffffffff)); i_2_++) {
								try {
									Object object = vector.elementAt(i_2_);
									Field field_3_ = object.getClass()
											.getDeclaredField("name");
									method.invoke(field_3_,
											(new Object[] { Boolean.TRUE }));
									try {
										String string_4_ = (String) field_3_
												.get(object);
										if (string_4_ != null
												&& (string_4_
														.equalsIgnoreCase(file
																.getCanonicalPath()))) {
											Field field_5_ = (object.getClass()
													.getDeclaredField("handle"));
											Method method_6_ = (object
													.getClass()
													.getDeclaredMethod(
															"finalize",
															new Class[0]));
											method.invoke(
													field_5_,
													(new Object[] { Boolean.TRUE }));
											method.invoke(
													method_6_,
													(new Object[] { Boolean.TRUE }));
											try {
												method_6_.invoke(object,
														(new Object[0]));
												field_5_.set(object,
														new Integer(0));
												hashtable.remove(string);
											} catch (Throwable throwable) {
												/* empty */
											}
											method.invoke(
													method_6_,
													(new Object[] { Boolean.FALSE }));
											method.invoke(
													field_5_,
													(new Object[] { Boolean.FALSE }));
										}
									} catch (Throwable throwable) {
										/* empty */
									}
									method.invoke(field_3_,
											(new Object[] { Boolean.FALSE }));
								} catch (Throwable throwable) {
									/* empty */
								}
							}
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
				method.invoke(field, new Object[] { Boolean.FALSE });
				if (i >= -66)
					method2562(81);
			} catch (Throwable throwable) {
				/* empty */
			}
			Class11_Sub3.aHashtable5114 = hashtable;
			return Class11_Sub3.aHashtable5114.isEmpty();
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ek.B(" + i + ')');
		}
	}

	static final void method2561(byte i, Class163_Sub3 class163_sub3) {
		do {
			try {
				if (Class41.anObject594 == null) {
					Class58_Sub2_Sub1 class58_sub2_sub1 = new Class58_Sub2_Sub1();
					byte[] is = class58_sub2_sub1.method3612(128, 128, 16,
							false);
					Class41.anObject594 = Class254_Sub3.method3238(104, false,
							is);
				}
				if (i != -82)
					method2561((byte) 79, null);
				anInt5963++;
				if (Class236_Sub7.anObject6977 == null) {
					Class58_Sub1_Sub2 class58_sub1_sub2 = new Class58_Sub1_Sub2();
					byte[] is = class58_sub1_sub2.method3740(128, (byte) -56,
							16, 128);
					Class236_Sub7.anObject6977 = Class254_Sub3.method3238(110,
							false, is);
				}
				Class334 class334 = ((Class163_Sub3) class163_sub3).aClass334_8272;
				if (!class334.method2010(true) || Class273.anObject3685 != null)
					break;
				byte[] is = Class108_Sub11.method2624(0.5F, 16, 128,
						new Class328_Sub1(419684), 128, 8, 16.0F, 4.0F, 0,
						0.6F, 4.0F);
				Class273.anObject3685 = Class254_Sub3
						.method3238(123, false, is);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, ("ek.A(" + i + ','
						+ (class163_sub3 != null ? "{...}" : "null") + ')'));
			}
			break;
		} while (false);
	}

	public static void method2562(int i) {
		do {
			try {
				GAME_MESSAGE_IN_PACKET = null;
				if (i == 128)
					break;
				method2562(8);
			} catch (RuntimeException runtimeexception) {
				throw Class205.method1298(runtimeexception, "ek.C(" + i + ')');
			}
			break;
		} while (false);
	}

	Class11_Sub21(int i) {
		try {
			((Class11_Sub21) this).anInt5964 = i;
		} catch (RuntimeException runtimeexception) {
			throw Class205.method1298(runtimeexception, "ek.<init>(" + i + ')');
		}
	}
}
