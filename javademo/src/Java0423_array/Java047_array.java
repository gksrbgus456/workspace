package Java0423_array;

public class Java047_array {

	public static void main(String[] args) {
		// 3행 2열의 2차원배열

		int[][] num = new int[3][2];

		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d \n", num[0][1]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d \n", num[1][1]);
		System.out.printf("%4d", num[2][0]);
		System.out.printf("%4d \n", num[2][1]);

		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;
		// num.length : 2차원배열에서 행의 크기를 리턴
		// num.[row].length :2차원에서 크기를 리턴
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col <= 1; col++) {

				System.out.printf("%4d ", num[row][col]);

			}
			System.out.println();
		}
		System.out.println("//////////////////////////////");

		/*
		 * 1 3 5 
		 * 2 4 6
		 */

		// num[0] [0] num[1] [0] num[2] [0]
		// num[0] [1] num[1] [1] num[2] [1]

		/*for (int row = 0; row < 2; row++) {
			for (int col = 0; col <= 2; col++) {
				if (num[col][row ] % 2 == 0) {
					System.out.printf("%4d ", num[col][row]);
				} else {
					System.out.printf("%4d ", num[col][row]);
				}
				
			}
			System.out.println();
		}*/
		
		
		
		int row =0;
		
		for(int col = 0; col < 2; col++) {
			for(row = 0; row<num.length; row++) {
				System.out.printf("%4d" , num[row][col]);
			}
			System.out.println();
		}

	}// end main()
}// end class