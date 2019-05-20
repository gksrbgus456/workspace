package Java024_method;
/*
 * [출력결과]
 * 10는 (은) 짝수입니다
 */
public class Java059_method {

	public static void main(String[] args) {
		int data = 10;
		//process () 호출하면서 data 변수의 값을 넘겨준후
		//[출력결과]을 참조하여 구현하시오.
		
		//조건연산자(삼항연산자)
		
		
//		String a = process (data) ? "짝수입니다" : "홀수입니다";
//		System.out.printf("%d는(은) \n" , "짝수입니다");
//		System.out.printf("%d는(은) \n" , "홀수입니다");
		
		String res = process(data) ? "짝수" :"홀수";
		System.out.printf("%d는(은)%s입니다. \n" , data,res);
		
	}
	public static boolean process(int data){	
		// data 매개변수의 값이 짝수이면 ture ,
	
		//홀수이면 flase를 리턴하는 프로그램을 구현하세요.
		
		if(data%2==0) {
				
			return true;
		}else {
					}
		return false;
	}

}
