/* Class333_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class Class333_Sub1 extends Class333 {
	private ProxySelector aProxySelector6308;
	static Class aClass6309;
	static Class aClass6310;

	final Socket method2006(int i) throws IOException {
		Socket socket;
		try {
			boolean bool = (Boolean.parseBoolean(System
					.getProperty("java.net.useSystemProxies")));
			if (!bool)
				System.setProperty("java.net.useSystemProxies", "true");
			if (i >= -109)
				return null;
			boolean bool_0_ = (((Class333_Sub1) this).anInt4416 ^ 0xffffffff) == -444;
			List list;
			List list_1_;
			try {
				list = aProxySelector6308
						.select(new URI((bool_0_ ? "https" : "http") + "://"
								+ ((Class333_Sub1) this).aString4418));
				list_1_ = aProxySelector6308
						.select(new URI((!bool_0_ ? "https" : "http") + "://"
								+ ((Class333_Sub1) this).aString4418));
			} catch (URISyntaxException urisyntaxexception) {
				return method2007((byte) 67);
			}
			list.addAll(list_1_);
			Object[] objects = list.toArray();
			IOException_Sub1 ioexception_sub1 = null;
			Object[] objects_2_ = objects;
			for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > (objects_2_.length ^ 0xffffffff); i_3_++) {
				Object object = objects_2_[i_3_];
				Proxy proxy = (Proxy) object;
				Socket socket_4_;
				try {
					Socket socket_5_ = method2672((byte) 1, proxy);
					if (socket_5_ == null)
						continue;
					socket_4_ = socket_5_;
				} catch (IOException_Sub1 ioexception_sub1_6_) {
					ioexception_sub1 = ioexception_sub1_6_;
					continue;
				} catch (IOException ioexception) {
					continue;
				}
				return socket_4_;
			}
			if (ioexception_sub1 != null)
				throw ioexception_sub1;
			socket = method2007((byte) 64);
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	private final Socket httpProxyConnect(String string, int i, String string_7_)
			throws IOException {
		Socket socket;
		try {
			Socket socket_8_ = new Socket(string, i);
			socket_8_.setSoTimeout(10000);
			OutputStream outputstream = socket_8_.getOutputStream();
			if (null == string_7_)
				outputstream.write(("CONNECT "
						+ ((Class333_Sub1) this).aString4418 + ":"
						+ ((Class333_Sub1) this).anInt4416 + " HTTP/1.0\n\n")
						.getBytes(Charset.forName("ISO-8859-1")));
			else
				outputstream.write(("CONNECT "
						+ ((Class333_Sub1) this).aString4418 + ":"
						+ ((Class333_Sub1) this).anInt4416 + " HTTP/1.0\n"
						+ string_7_ + "\n\n").getBytes(Charset
						.forName("ISO-8859-1")));
			outputstream.flush();
			BufferedReader bufferedreader = (new BufferedReader(
					new InputStreamReader(socket_8_.getInputStream())));
			String string_9_ = bufferedreader.readLine();
			if (string_9_ != null) {
				if (string_9_.startsWith("HTTP/1.0 200")
						|| string_9_.startsWith("HTTP/1.1 200"))
					return socket_8_;
				if (string_9_.startsWith("HTTP/1.0 407")
						|| string_9_.startsWith("HTTP/1.1 407")) {
					int i_10_ = 0;
					String string_11_ = "proxy-authenticate: ";
					for (string_9_ = bufferedreader.readLine(); null != string_9_
							&& 50 > i_10_; string_9_ = bufferedreader
							.readLine()) {
						if (string_9_.toLowerCase().startsWith(string_11_)) {
							string_9_ = string_9_
									.substring(string_11_.length()).trim();
							int i_12_ = string_9_.indexOf(' ');
							if ((i_12_ ^ 0xffffffff) != 0)
								string_9_ = string_9_.substring(0, i_12_);
							throw new IOException_Sub1(string_9_);
						}
						i_10_++;
					}
					throw new IOException_Sub1("");
				}
			}
			outputstream.close();
			bufferedreader.close();
			socket_8_.close();
			socket = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	private final Socket method2672(byte i, Proxy proxy) throws IOException {
		Socket socket;
		try {
			if (proxy.type() == Proxy.Type.DIRECT)
				return method2007((byte) 22);
			java.net.SocketAddress socketaddress = proxy.address();
			if (i < 0)
				return null;
			if (!(socketaddress instanceof InetSocketAddress))
				return null;
			InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
			if (proxy.type() == Proxy.Type.HTTP) {
				String string = null;
				try {
					Class var_class = (Class
							.forName("sun.net.www.protocol.http.AuthenticationInfo"));
					Method method = (var_class
							.getDeclaredMethod(
									"getProxyAuth",
									(new Class[] {
											(aClass6309 == null ? (aClass6309 = getClassByName("java.lang.String"))
													: aClass6309), Integer.TYPE })));
					method.setAccessible(true);
					Object object = method.invoke(null, (new Object[] {
							inetsocketaddress.getHostName(),
							new Integer(inetsocketaddress.getPort()) }));
					if (object != null) {
						Method method_13_ = (var_class
								.getDeclaredMethod(
										"supportsPreemptiveAuthorization",
										new Class[0]));
						method_13_.setAccessible(true);
						if (((Boolean) method_13_.invoke(object, new Object[0]))
								.booleanValue()) {
							Method method_14_ = var_class.getDeclaredMethod(
									"getHeaderName", new Class[0]);
							method_14_.setAccessible(true);
							Method method_15_ = (var_class
									.getDeclaredMethod(
											"getHeaderValue",
											(new Class[] {
													(aClass6310 == null ? (aClass6310 = getClassByName("java.net.URL"))
															: aClass6310),
													(aClass6309 == null ? aClass6309 = (getClassByName("java.lang.String"))
															: aClass6309) })));
							method_15_.setAccessible(true);
							String string_16_ = ((String) method_14_.invoke(
									object, new Object[0]));
							String string_17_ = ((String) (method_15_
									.invoke(object,
											(new Object[] {
													new URL(
															"https://"
																	+ (((Class333_Sub1) this).aString4418)
																	+ "/"),
													"https" }))));
							string = string_16_ + ": " + string_17_;
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				return httpProxyConnect(inetsocketaddress.getHostName(),
						inetsocketaddress.getPort(), string);
			}
			if (proxy.type() == Proxy.Type.SOCKS) {
				Socket socket_18_ = new Socket(proxy);
				socket_18_.connect(new InetSocketAddress(
						((Class333_Sub1) this).aString4418,
						((Class333_Sub1) this).anInt4416));
				return socket_18_;
			}
			socket = null;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
		return socket;
	}

	public Class333_Sub1() {
		try {
			aProxySelector6308 = ProxySelector.getDefault();
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		}
	}

	static Class getClassByName(String string) {
		try {
			System.out.println(string);
			return Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw new NoClassDefFoundError(classnotfoundexception.getMessage());
		}
	}
}
