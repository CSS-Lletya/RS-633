package com.rs.cache.loaders;

import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.io.InputStream;
import com.rs.utils.Utils;

public class IComponentScripts {

	private static IComponentScripts[][] interScripts;

	// OPCODE 12 - Interface Scripts

	int D;
	int H;
	int G;
	String F;
	int I;
	// / eja s;
	int[] B;
	String[] r;
	int u;
	long[] y;
	int E;
	int[] t;

	// static int w;
	// static int x;

	static {
		try {
			Cache.init(); // testing purposes
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		interScripts = new IComponentScripts[Utils.getInterfaceDefinitionsSize()][];
	}

	
// i ^ ~0x5f
		
	
	
	public static void main(String[] args) throws IOException {

		sd();
	}
	
	public static void sd() {
	byte[] data = Cache.STORE.getIndexes()[12].getFile(978);
	IComponentScripts def = new IComponentScripts();
	def.decode(new InputStream(data));
	}
	
/**
 * 	int i_4_ = stream.getShort((byte) 126);
			int i_5_ = -i_4_ + (-2 + (((Stream) stream).buffer.length - 16));
			((Stream) stream).writerIndex = i_5_;
			int i_6_ = stream.getInt(true);
			((ClientScript) var_eca).u = stream.getShort((byte) 126);
			((ClientScript) var_eca).H = stream.getShort((byte) 126);
			((ClientScript) var_eca).G = stream.getShort((byte) 126);
			((ClientScript) var_eca).I = stream.getShort((byte) 126);
			((ClientScript) var_eca).E = stream.getShort((byte) 126);
			((ClientScript) var_eca).D = stream.getShort((byte) 126);
			int i_7_ = stream.getUnsignedByte(-55);
			if (i != 17)
				decode(new byte[] {}, (byte) -37);
			if (i_7_ > 0) {
				((ClientScript) var_eca).v = new oo[i_7_];
				for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
					int i_9_ = stream.getShort((byte) 126);
					oo var_oo = new oo(aga.a(i_9_, -125));
					((ClientScript) var_eca).v[i_8_] = var_oo;
					while (i_9_-- > 0) {
						int i_10_ = stream.getInt(true);
						int i_11_ = stream.getInt(true);
						var_oo.a((long) i_10_, (byte) -37, new ega(i_11_));
					}
				}
			}
			((Stream) stream).writerIndex = 0;
			((ClientScript) var_eca).F = stream.f(-23147);
			((ClientScript) var_eca).t = new int[i_6_];
			int i_12_ = 0;
			while ((i_5_ ^ 0xffffffff) < (((Stream) stream).writerIndex ^ 0xffffffff)) {
				int i_13_ = stream.getShort((byte) 126);
				if ((i_13_ ^ 0xffffffff) == -4) {
					if (((ClientScript) var_eca).r == null)
						((ClientScript) var_eca).r = new String[i_6_];
					((ClientScript) var_eca).r[i_12_] = stream.getString((int) -124)
							.intern();
				} else if (i_13_ != 54) {
					if (((ClientScript) var_eca).B == null)
						((ClientScript) var_eca).B = new int[i_6_];
					if (i_13_ >= 150 || i_13_ == 21 || i_13_ == 38
							|| i_13_ == 39)
						((ClientScript) var_eca).B[i_12_] = stream.getUnsignedByte(-48);
					else
						((ClientScript) var_eca).B[i_12_] = stream.getInt(true);
				} else {
					if (((ClientScript) var_eca).y == null)
						((ClientScript) var_eca).y = new long[i_6_];
					((ClientScript) var_eca).y[i_12_] = stream.e((byte) -59);
				}
				((ClientScript) var_eca).t[i_12_++] = i_13_;
 * @param stream
 */
	
	final void decode(InputStream stream) {
		int i_4_ = stream.readUnsignedShort();
		int i_5_ = -i_4_ + (-2 + stream.getBuffer().length - 16);
		stream.setOffset(i_5_);
		int i_6_ = stream.readInt();
		u = stream.readShort();
		H = stream.readShort();
		G = stream.readShort();
		I = stream.readShort();
		E = stream.readShort();
		D = stream.readShort();
		int i_7_ = stream.readUnsignedByte();
		stream.setOffset(0);
		
		F = stream.readString(); // i think so
		t = new int[i_6_];
		System.out.println("OFFSET: " + stream.getOffset()  + " i_5: " + i_5_);
		while ((i_5_ ^ 0xffffffff) < (stream.getOffset() ^ 0xffffffff)) {
		int i_12_ = 0;
		int i_13_ = stream.readUnsignedShort();
		if ((i_13_ ^ 0xffffffff) == -4) {
			if (r == null)
				r = new String[i_6_];
			r[i_12_] = stream.readString();
		} else if (i_13_ != 54) {
			if (B == null)
			B = new int[i_6_];
			if (i_13_ >= 150 || i_13_ == 21 || i_13_ == 38
					|| i_13_ == 39)
				B[i_12_] = stream.readUnsignedByte();
			else
				B[i_12_] = stream.readInt();
		} else {
			if (y == null)
				y = new long[i_6_];
			y[i_12_] = stream.readLong();// I tink so
			
		}
		t[i_12_++] = i_13_;
		
		System.out.println("i_4 " + i_4_);
		System.out.println("i_5 " + i_5_);
		
		System.out.println("u " + u);
		System.out.println("H " + H);
		System.out.println("G " + G);
		System.out.println("I " + I);
		System.out.println("E " + E);
		System.out.println("D " + D);
		
		System.out.println("i_6_ " + i_6_);
		System.out.println("i_7 " + i_7_);
		System.out.println("f " + F);
		System.out.println("i_13_ " + i_13_);

		System.out.println("r " + r);
			
		
		System.out.println("B " + B);
		System.out.println("y " + y);
		
		System.out.println();
		}
	
	}

	
	private static int getScriptSize() {
		return Cache.STORE.getIndexes()[12]
				.getLastArchiveId();
	}
}
