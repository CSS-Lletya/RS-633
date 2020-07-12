/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class348 {
	private static boolean aBool4601 = false;
	private static Hashtable aHashtable4602 = new Hashtable(16);
	private static String aString4603;
	private static String aString4604;
	private static int anInt4605;

	public static File method2096(String string, String string_0_, int i,
			byte i_1_) {
		try {
			if (!aBool4601)
				throw new RuntimeException("");
			File file = (File) aHashtable4602.get(string);
			if (file != null)
				return file;
			String[] strings = { "c:/rscache/", "/rscache/", "c:/windows/",
					"c:/winnt/", "c:/", aString4604, "/tmp/", "" };
			String[] strings_2_ = { ".jagex_cache_" + i, ".file_store_" + i };
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -3; i_3_++) {
				for (int i_4_ = 0; strings_2_.length > i_4_; i_4_++) {
					for (int i_5_ = 0; strings.length > i_5_; i_5_++) {
						String string_6_ = (strings[i_5_] + strings_2_[i_4_]
								+ "/"
								+ (string_0_ == null ? "" : string_0_ + "/") + string);
						RandomAccessFile randomaccessfile = null;
						try {
							File file_7_ = new File(string_6_);
							if (i_3_ != 0 || file_7_.exists()) {
								String string_8_ = strings[i_5_];
								if ((i_3_ ^ 0xffffffff) != -2
										|| (string_8_.length() ^ 0xffffffff) >= -1
										|| new File(string_8_).exists()) {
									new File(strings[i_5_] + strings_2_[i_4_])
											.mkdir();
									if (string_0_ != null)
										new File(strings[i_5_]
												+ strings_2_[i_4_] + "/"
												+ string_0_).mkdir();
									randomaccessfile = new RandomAccessFile(
											file_7_, "rw");
									int i_9_ = randomaccessfile.read();
									randomaccessfile.seek(0L);
									randomaccessfile.write(i_9_);
									randomaccessfile.seek(0L);
									randomaccessfile.close();
									aHashtable4602.put(string, file_7_);
									return file_7_;
								}
							}
						} catch (Exception exception) {
							try {
								if (randomaccessfile != null) {
									randomaccessfile.close();
									Object object = null;
								}
							} catch (Exception exception_10_) {
								/* empty */
							}
						}
					}
				}
			}
			if (i_1_ <= 46)
				method2098(null, 90);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	public static void method2097(String string, int i, boolean bool) {
		do {
			try {
				if (bool == false) {
					anInt4605 = i;
					aString4603 = string;
					try {
						aString4604 = System.getProperty("user.home");
						if (aString4604 != null)
							aString4604 += "/";
					} catch (Exception exception) {
						/* empty */
					}
					aBool4601 = true;
					if (aString4604 != null)
						break;
					aString4604 = "~/";
				}
			} catch (RuntimeException runtimeexception) {
				throw runtimeexception;
			}
			break;
		} while (false);
	}

	public static File method2098(String string, int i) {
		try {
			if (i != -1)
				method2098(null, -85);
			return method2096(string, aString4603, anInt4605, (byte) 114);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}
}
