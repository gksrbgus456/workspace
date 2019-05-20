
package java0422;

/*
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 * 		1 2 3 4 5
 *  
 */

//행4 열 5 
// 행 초기값 1 종료값 5 증가값 1  
public class Java036_for {

	public static void main(String[] args) {
		
		
		//내가 한거.
		
		/*for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.printf("%d ", j);
			}
			if (i % 5 == 0) {
			}
			System.out.println();
		}*/
		
		//선생님이 한거.
		
		int cnt ;
		for(int row = 1; row <= 4; row ++) {
			cnt = 1;
			for(int col = 1; col <= 5; col++) {
				System.out.printf("%4d" , cnt);
				
				if(col >= 5) {
					System.out.println();
				}
				cnt++;
			}
		}

	}// end main()
}// end class
