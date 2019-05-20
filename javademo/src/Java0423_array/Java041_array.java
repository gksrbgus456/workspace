package Java0423_array;

// 변수 : 하낙의 값을 저장하기 위한 메모리 공간
public class Java041_array {

	public static void main(String[] args) {
		/*
		 * int ko = 90; int en = 80; int jp = 40;
		 */

		// 배열 선언
		int[] jumsu; // int jumsu[];

		// 배열 생성 = 메모리생성 (확보)
		// nuw 키워드를 이용해서 배열을 생성한다.
		// 배열의 크기 3이다.
		// 각 요소마다 인덱스가 0부터 생성된다.
		jumsu = new int[3];
		//int [] jumsu = nuw int [3]
  
		System.out.printf("jumsu[0] = %d \n", jumsu[0]);
		System.out.printf("jumsu[1] = %d \n", jumsu[1]);
		System.out.printf("jumsu[2] = %d \n", jumsu[2]);
		System.out.println("======================");

		jumsu[0] = 90; // 90을 jumsu 배열 0 인덱스(index)에 저장 // [] < 인덱스
		jumsu[1] = 80; // 90을 jumsu 배열 1 인덱스 (index)에 저장
		jumsu[2] = 40; // 90을 jumsu 배열 2 인덱스 (index)에 저장

		// length : 배열의 크기 => 배열명.length
		for (int index = 0; index < jumsu.length; index++) {
			System.out.printf("jumsu[%d] = %d \n", index, jumsu[index]);
		}

	}// end main()
}// end class
