package Java0423_array;

/*
 * 1  2 3 4 5
 * 6  7 8 9 10 
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 
 * num 배열에서 아래와 같이 출력이 되도록 프로그램을 구현하시오.
 * [출력결과]
 * 
 * 1 2 * 4 5
 * * 7 8 * 10
 * 11 * 13 14 *
 * 16 17 * 19 20
 */
public class Java050_array {

	public static void main(String[] args) {
		int[][] num = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 3 == 0) {
					System.out.printf("   *");
				} else {
					System.out.printf("%4d" , num [i][j]);
				}

			}System.out.println();	

		}
	}// end main()

}// end class
