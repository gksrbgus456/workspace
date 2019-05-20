package java0419_statment;
/*
 * 1.  	data변수에 저장된 값이 영문자 대문자이면 "?는대문자입니다"
 * 		소문자이면 "?는 소문자입니다"
 * 		그외는 "?는 기타입니다"로 출력하는 프로그램을 구현하시오
 * 2.	[출력결과]
 * 		data = 'D'  	=> D는 대문자입니다.
 * 		data = 'd' 		=> d는 소문자입니다.
 * 		data = '1' 		=> 1는 기타입니다
 */
public class Java021_if {

	public static void main(String[] args) {
		char data = 'd';
		
		//'A'  <= data <= 'Z'         'Z'    => 유니코드  90 
		//'A'  => 유니코드 65
		//'a'  => 유니코드 97
		//'0'  => 유니코드48
		
		if(data >= 'A' && data <= 'Z') {
			System.out.printf("%c는 대문자입니다." , data);
		}else if (data >= 'a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다." , data);
		}else {
			System.out.printf("%c는 기타입니다." , data);
		}
	}//end main()
}//end class
