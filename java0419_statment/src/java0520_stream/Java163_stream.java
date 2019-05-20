package java0520_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java163_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		FileReader fr = null;
		int data;
		try {
			fr = new FileReader("sample.txt");
			while ((data=fr.read())!= -1)
			System.out.println((char)fr.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
