package java0520_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java158_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		// 바이트 스트림
		InputStream is = System.in;
		// 바이트스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		// 문자 스티림
		BufferedReader br = new BufferedReader(ir);

		try {
			// 입력 데이타를 한 라인씩 읽어와서 리턴
			String data = br.readLine();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			ir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
