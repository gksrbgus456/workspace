package java0422;
/*
 * for (초기식 ; 조건식 ; 증감식){
 * 	수행할 문장;
 * }
 * 
 * 
 * 1 조건식이 true 일떄까지만 반복문을 실행 한다.
 * 2 for문 실행순서 
 * 초기식 -> 조건식(ture) - > 수행할 문장 -> 증감식
 * 		-> 조건식(ture) - > 수행할 문장 -> 증감식
 * 		-> 조건식(flase) -> for문을 빠져나옴 
 * 3  초기식은 한번만 수행한다.
 * 4  초기식, 조건식 , 증감식은 생략할 수 있찌만 for( ; ;) 세미콜론 필수
 * 5  초기식, 증감식은 생략하거나 여래개 사용할 수 있다
 *    조건식은 생략하거나 한개만 사용한다.
 *    for (int a = 3, b = 4; ; sum += a, gap +=b){
 *    }
 *    6 조건식을 생략하면 언제나 true로 인식한다. (무한루프)
 *    for문의 죵료 시점을 정확히 파악할 수 없을떄 for문을 무한루프 설정한다.
 *    
 */
public class Java028_for {

	public static void main(String[] args) {
		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
*/		
		for(int i = 1; i <=5; i++ ) {
			System.out.println(i);
		}
	}//end main()
}// end class
