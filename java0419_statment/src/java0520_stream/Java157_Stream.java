package java0520_stream;

import java.io.IOException;
import java.io.InputStream;
/*
 * carriage return : 줄의 처음으로 이동(13)
 * line feed : 다음 줄로 이동 (10)
 */
public class Java157_Stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		int data;

		try {
			while ((data=is.read()) != 13) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//stream 연결죵료 (자원 반납)
				is.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}
}