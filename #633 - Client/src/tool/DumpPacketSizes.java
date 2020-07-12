package tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DumpPacketSizes {
	public static void main(String[] args) {
		for (String s : new File("bin").list()) {
			if (s.contains(".class")) {
				try {
					Class.forName(s.substring(0, s.indexOf(".")));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("Finished!");

	}

	public static void writeToFile(String fileName, int packetID, int packetSize) {

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(fileName, true)));

			out.write("PACKET_SIZES[" + packetID + "] = " + packetSize + ";");
			out.write("\n");
			out.flush();
			out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
}
