package Java0423_prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15    		
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] numX = new int[4][4];
		int cnt = 1;

		// 여기를 구현하시오.
		int sum = 0;
		int col = 0;
		for (int i = 0; i < 3; i++) {
			sum = 0;
			for (int j = 0; j < 3; j++) {
				numX[i][j] =
						cnt;
				sum += cnt;
				cnt++;
				numX[i][j + 1] = sum;
			}
		}
		for (int i = 0; i < 4; i++) {
			col = 0;
			for (int j = 0; j < 4; j++) {
				col += numX[j][i];
			}
			numX [3] [i] = col;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%4d", numX[i][j]);
			}
			System.out.println();
		}

	}// end main()

}// end class
