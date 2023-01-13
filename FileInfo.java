import java.io.*;

public class FileInfo {

	public static void main(String[] args) {
		File infoFile = new File(args[0]);
		if(infoFile.exists()) {
			System.out.println("Dosya : " + infoFile.getName());
			System.out.println("Tam Adres : " + infoFile.getAbsolutePath());

			if(infoFile.isFile()) {
				System.out.println(infoFile.getName() + " bir dosyadir.");
			} else if(infoFile.isDirectory()) {
				System.out.println(infoFile.getName() + " bir dizindir.");
			}
		} else {
			System.out.println(args[0] + " gecerli bir adres degildir.");
		}
	}

}