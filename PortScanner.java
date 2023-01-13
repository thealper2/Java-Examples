import java.net.*;
import java.io.*;

public class PortScanner {
	public static void main(String[] args) {
		try {
			InetAddress host = InetAddress.getByName(args[0]);
		} catch(UnknownHostException e) {
			System.err.println(e);
			System.exit(0);
		}

		for(int i=0; i<1024; i++) {
			try {
				System.out.println(i + " ");
				InetSocketAddress socketAddress = new InetSocketAddress(host, i);
				Socket socket = new Socket();
				socket.connect(socketAddress, 500);
				System.out.println("\nPort " + i + " calismaktadir.");
				socket.close();
			} catch(IOException e) {
				System.err.println(e);
			}
		}
	}
} 