package java0422;
/*
 * i=1
 * i=2
 * i=3
 * i=4
 * i=5
 * 
 */
public class Java031_for {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		for(i = 1;i < 6 ; i++) {
			sum = sum + i;
			System.out.printf("i = %d  \n" , i );
			if(sum >= 15) {
				break;
			}
		}
		System.out.println("sum = " + sum);
		
		

	}//end main()
}//end class
