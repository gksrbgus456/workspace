package java0419_statment;
/*
 * 제어문(contro1 statment) : 문장의 흐름을 제어해주는 기능이다.
 * 1.종류
 * 조건문 : if ~else, switch~case
 * 반복문 : for,while,do while
 * 기타 : break,continue(조건식으로 이동), (label)
 * 
 * if (조건식){
 * 참일떄 수행할 문장;
 * }else{
 * 거짓일떄 수행할 문장;
 */
public class Java017_if {

	public static void main(String[] args) { //1 a 
		//int num = 3; //2
		
		int num = 6;
		if(num%2==0) { //3
			
		System.out.printf("%d는(은) %s입니다. \n" , num , "짝수" );
		}
		
		else {
		System.out.printf("%d는(은) %s입니다. \n" , num , "홀수"  );//4
		}
	}//end mian() //5

}//end class
