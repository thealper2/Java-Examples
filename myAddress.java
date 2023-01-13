import java.net.*;

public class myAddress {

	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println("Merhaba. Adim " + address.getHostName());
		} catch(UnknownHostException e) {
			System.out.println("Bu makinenin adini bulamadim !");
		}
	}

}