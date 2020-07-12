/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
	int anInt696;
	int anInt697;
	private int[] anIntArray698;
	int anInt699;
	private int anInt700 = 2;
	private int[] anIntArray701 = new int[2];
	private int anInt702;
	private int anInt703;
	private int anInt704;
	private int anInt705;
	private int anInt706;

	final void method390() {
		anInt706 = 0;
		anInt705 = 0;
		anInt702 = 0;
		anInt704 = 0;
		anInt703 = 0;
	}

	final void method391(Stream stream) {
		((Class43) this).anInt696 = stream.readUnsignedByte((byte) 35);
		((Class43) this).anInt697 = stream.readInt(92);
		((Class43) this).anInt699 = stream.readInt(127);
		method393(stream);
	}

	final int method392(int i) {
		if (anInt703 >= anInt706) {
			anInt704 = anIntArray698[anInt705++] << 15;
			if (anInt705 >= anInt700)
				anInt705 = anInt700 - 1;
			anInt706 = (int) ((double) anIntArray701[anInt705] / 65536.0 * (double) i);
			if (anInt706 > anInt703)
				anInt702 = (((anIntArray698[anInt705] << 15) - anInt704) / (anInt706 - anInt703));
		}
		anInt704 += anInt702;
		anInt703++;
		return anInt704 - anInt702 >> 15;
	}

	final void method393(Stream stream) {
		anInt700 = stream.readUnsignedByte((byte) 35);
		anIntArray701 = new int[anInt700];
		anIntArray698 = new int[anInt700];
		for (int i = 0; i < anInt700; i++) {
			anIntArray701[i] = stream.readUnsignedShort((byte) -65);
			anIntArray698[i] = stream.readUnsignedShort((byte) -65);
		}
	}

	public Class43() {
		anIntArray698 = new int[2];
		anIntArray701[0] = 0;
		anIntArray701[1] = 65535;
		anIntArray698[0] = 0;
		anIntArray698[1] = 65535;
	}
}
