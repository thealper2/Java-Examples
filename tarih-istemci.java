import java.net.*;
import java.io.*;

public class DayTimeClient {
	public static void main(String[] args) {
		try {
			InetAddress host = InetAddress.getByName(args[0]);
		} catch(UnknownHostException e) {
			System.err.println(e);
			System.exit(0);
		}

		try {
			Socket socket = new Socket(host, 13);
			InputStream inputStream = theSocket.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String data = bufferedReader.readLine();

			while(data != null) {
				System.out.println(data);
				data = bufferedReader.readLine();
			}

			socket.close();
		} catch(IOException e) {
			System.err.println(e);
		}
	}
}