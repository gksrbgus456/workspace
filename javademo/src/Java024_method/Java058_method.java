package Java024_method;
/*
 * [출력결과]
 * e의 대문자는 E입니다.
 */
public class Java058_method {

	public static void main(String[] args) {
		//조건 : data변수에는 소문자만 입력
		
		char data = 'e';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다. \n "  ,data,code);

	}//end main()
	
	//data 매게 변수의 값을 대문자로 변경해서 리턴
	public static char process (char data) {
		//1 대문자 A , 소문자 a 유니코드
		//2 대문자, 소문자차이
		//3 int 이하 자료형끼리 연산이되면 결과는 int 리턴
		
		
		return (char)(data-32);
	}
}//end calss
