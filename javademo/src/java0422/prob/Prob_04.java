package java0422.prob;

/*  
 * 1 10=2x+3y의 해를 구하시오.
 *   x와y의 범위 : 0<=x<=10,  0<=y<=10
 *   
 * 2 출력결과
 *  x=2, y=2
 *  x=5, y=0
 */
public class Prob_04 {

	public static void main(String[] args) {
		for(int X = 0; X<=10; X++) {
			for(int Y = 0; Y <= 10; Y++) {
				if(10 ==2*X+3*Y) {
					System.out.printf("x=%d,y=%d\n" , X , Y);
				}
			}
		}

	}// end main()

}// end class
