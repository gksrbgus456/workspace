package java0507_api;

import java.text.SimpleDateFormat;

public class Java144_System {

	public static void main(String[] args) {
		// currenTimeMillis():1970.1.1부터 초단위로
		// 누적한 값을 밀리세컨드로 리턴한다.
		// 하루는 86400초이다 1초는 1000밀리 세컨트이다.

		long curr = System.currentTimeMillis();

		System.out.println(curr);
		
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE"; // 월은 대문자MM  분은 소문자 mm
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// 			auto boxing		upcasting
		//long(stack) -> Long(heap) -> Object
		String date = sdf.format(curr);
		System.out.println(date);
	}// end main()
}// end class
