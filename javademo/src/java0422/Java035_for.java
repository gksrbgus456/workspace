package java0422;
/*
 * 3행 x 4열
 * 1 2 3 4 
 * 5 6 7 8 
 * 9 10 11 12
 */

//1.초기값 1 종료값 12 증가값 1 
//2. 4의 배수에서 줄바꿈
public class Java035_for {

	public static void main(String[] args) {

		/*for (int i = 1; i <= 12; i++) {
			System.out.printf("%4d " , i);
			
			if(i%4 == 0) {
				System.out.println();
			}
		} */
		
		int data = 1;
		//행
		for(int row =1; row <= 3;  row++ ) {
			//열
			for(int col = 1; col <= 4; col++) {
				System.out.printf("%4d" , data);
				
				if (data %4 == 0) {
					System.out.println();
				}
				data ++;
			}
		}
	}// end main()
}// end class
