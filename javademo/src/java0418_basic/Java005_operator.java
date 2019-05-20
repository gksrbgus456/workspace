package java0418_basic;
/*
 * 연산자 (operator)
 * : 어떤한 기능을 수행하는 기호 ( +,-,*,/,%, >,<,==같다, !=다르자...)
 * 
 * 피연산자(operand)
 * 	:연산자의 작업 대상 (변수,상수,리터널,수식)
 * 
 * 	연산자 종류
 * 1.산술연산자 : + , - , * , / , %
 * 2.비교연산자 :  > , < , >= , <=, ==, !=
 * 3.논리연산자 : &&(and), ||(or), !(not)
 * 4.삼항연산자(조건연산자) : 조건식 ? 참 : 거짓
 * 5.대입연산자 : = , +=, *=, /=...
 * 6.단항연산자 : ++(1씩증가) , --(1씩 감소)
 */
public class Java005_operator {
	
	public static void main (String [ ] args) {
		//numx 변수에 10값을 저장한다 
		int numX = 10;
		
		//numY변수에 5값을 저장한다.
		int numY = 5;
		
		//int = int+int
		int res= numX+numY;
		System.out.println(res);
		
		double avg = 4.5;
		//double = int + double
		double ko = numX+avg;
		/*
		 * float = int + float
		 * int = byte+int
		 * float = long + float
		 */
		
		short a = 3;
		short b = 4;
		
		//int 데이터 타입 이하끼리 연산이 되면 결과값의 데이터 타입은 무조건 int이다.
		//int = byte + short
		//int = char + short
		//int = byte + int
		//int = byte +byte
		
		
		//int = short+ short		
		int c=a+b;
		System.out.println(c);
		
	}//end main()
}//end class


