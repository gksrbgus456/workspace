package Java0423_prob;
/*
 * num배열의 합계와 평균을 구하는 프로그램을 구현하시오.
 *  출력결과
 *  합계: 243
 *  평균:  81
 */

public class Prob_03 {

	public static void main(String[] args) {
		int num[] = new int[] { 60, 95, 88 };	
		int sum = 0;
		// 여기를 구현하시오.

		for(int row = 0; row < num.length; row++) {
			
			
				sum += num[row];	

			
			
		}System.out.printf("합계 %d \n: 평균 : %d" ,  sum , sum/3);
		
	}// end main()

}// end class
