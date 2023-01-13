import java.net.*;
import java.io.*;

public class URLParse {

	public static void main(String[] args) throws Exception {
		URL u = new URL(args[0]);
		System.out.println("URL Address");
		System.out.println(args[0] + "\n");
		System.out.println("protocol = " + u.getProtocol());
		System.out.println("host = " + u.getHost());
		System.out.println("filename = " + u.getFile());
		System.out.println("port = " + u.getPort());
		System.out.println("ref = " + u.getRef());
		System.out.println("Aut = " + u.getAuthority());
		System.out.println("Query = " + u.getQuery());
		System.out.println("Path = " + u.getPath());
		System.out.println("UserInfo = " + u.getUserInfo());
	}

}