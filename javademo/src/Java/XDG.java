package Java;
/*문제 1.  Math.random() 을 이용하여 -5 ~ 5 의 랜덤 수를 발생시키세요. 
 * 2.  3항 연산 식을 사용 해서, 절대값을 구하는 식을 세우세요.
 */

public class XDG {
	public static void main(String [ ]args ) {
		int i = (int)(Math.random() * 11 );
		
		System.out.println("랜덤값 : " + i);
		
		int j = (i > 0) ? i : -1;
		System.out.println(i + " 의 절대값은 : " + j);
				
	}
}
