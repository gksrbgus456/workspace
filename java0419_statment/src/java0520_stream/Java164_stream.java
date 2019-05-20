package java0520_stream;

import java.io.FileNotFoundException;
/*
 * kim:56/78/12
hong:46/100/97
park:96/56/88

Eric Benet - Still With You
Frankie J - Don'y Wanna Try
Jason Mraz - I'm Yours, I Won't Give Up, Lucky
Maron 5 - Daylight, Sunday Moring



 */
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Java164_stream {

	public static void main(String[] args) {
		FileReader fr = null;
		// 라인번호를 출력 할 수 있는 메소드를 제공하는 스트림이다.
		LineNumberReader nr = null;
		try {
			fr = new FileReader("src/java0520_stream/score.txt");
			nr = new LineNumberReader(fr);
			String line = "";
			//1. nr.readLine()가 리턴문자열을 line변수에 대입
			//2. line변수의 문자열과 null을 비교
			while ((line =nr.readLine())!=null) {
				System.out.printf("%d:%s\n",nr.getLineNumber(),line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				nr.close();
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}