package java0520_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java165_stream {

	public static void main(String[] args) {
		File file = new File("src/java052_stream/score.txt");
		RandomAccessFile raf =null;
		
		try {
			//"r" : 읽기(read)만 가능하다.
			//"rw" : 읽기(read)쓰기 (write)가 가능하다.
			raf = new RandomAccessFile(file,"r");
			System.out.println(raf.getFilePointer());
			System.out.println((char)raf.readChar());
			System.out.println(raf.getFilePointer());
			System.out.println(raf.readLine());
			System.out.println(raf.getFilePointer());
			String line = raf.readLine();
			System.out.printf("%s %d\n",line,line.length());
			System.out.println(raf.getFilePointer());
			raf.seek(4);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
