package java0520_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java162_stream {
	public static void main(String[] args) {
		
		File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("sample.txt",false);
			//mode의 값이 true 이면 append이고
			//mode의 값이 false이면 update이다.
			//mode의 값을 생략하면 기본값이 false이다
			fw.write("java\n");
			fw.flush();
			fw.write("jsp\n");
			fw.flush();
			fw.write(97+"\n");
			fw.close();
			//fw.write("spring");
			//fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
