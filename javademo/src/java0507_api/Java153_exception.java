package java0507_api;

import java.io.File;
import java.io.FileNotFoundException;

public class Java153_exception {

	public static void main(String[] args) {
		
		File file = new file("sample.txt");
		try {
			//fileNotFoundException은 checked exception이다.
			//반드시 try~catch~finally(예외처리)를 한다.
			fileReade fr = new fileReader(file);

		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}
