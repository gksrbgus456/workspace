package java0418_basic.answ;

/*
 * num변수의 값이 10의 배수이면 1을 아니면 0을 
 * res변수에 리턴하는 프로그램을 구현하시오.
 * [실행결과]
 * res=0
 */

public class Prob01 {

	public static void main(String[] args) {		
		int num = 15;
		int res;
		//여기에 작성하시오.
		res=num%10==0 ? 1 : 0 ;
		System.out.printf("res=%d" , res);
	}//end main()

}//end class




