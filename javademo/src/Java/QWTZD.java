package Java;
/*문제 1. Math.random()을 사용해서 1~100까지 랜덤 정수를 발생시키세요. 
 * 2. i가 짝수라면 “짝수”,  홀수라면 “홀수” 를 출력하는 3항 연산식 을 세우세요.
 */
public class QWTZD {
	public static void main (String [] args) {
		int i = (int )(Math.random()*100) +1;
		System.out.println("램덤수는" + i);
		System.out.println("3항 연산의 결과는 " + (i % 2 == 0 ? "짝수" : "홀수"));
	}
}
