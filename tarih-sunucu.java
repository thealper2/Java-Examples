import java.net.*;
import java.io.*;
import java.util.Date;

public class DayTimeServer {
	public static void main(String[] args) {
		try {
			int port = 13;
			ServerSocket serverSocket = new ServerSocket(port);
		} catch(IOException e) {
			System.err.println(e);
			System.exit(0);
		}

		while(true) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress() + " baglandi.");
				OutputStream outputStream = socket.getOutputStream();
				Date date = new Date();
				String tarih = date.toString() + "\r\n";
				outputstream.write(tarih.getBytes());
				outputstream.close();
				socket.close();
			} catch(IOException e) {
				System.err.println(e);
			}
		}
	}
}