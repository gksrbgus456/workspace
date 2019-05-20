package Java0423_array;

public class Java042_array {

	public static void main(String[] args) {
		// 배열을 생성할떄 초기값을 할당하면 배열의 크기를 지정 할 수 없다.
		int[] jumsu = new int[] { 90, 80, 40 };
		/*
		 * jumsu [0] = 90; jumsu [1] = 80; jumsu [2] = 40;
		 */

		for (int index = 0; index < jumsu.length; index++) {
			System.out.printf("jumsu [%d] = %d \n", index, jumsu[index]);
		}

		System.out.println("===============================");

		/*System.out.printf("jumsu [%d] =%d \n ", 2, jumsu[2]);
		System.out.printf("jumsu [%d] =%d \n", 1, jumsu[1]);
		System.out.printf("jumsu [%d] =%d \n", 0, jumsu[0]);*/
		
		
		
		for(int index = jumsu.length-1; index >= 0; index--) {
			System.out.printf("jumsu [%d] = %d \n", index, jumsu[index]);
		}

	}// end main()
}// end class
