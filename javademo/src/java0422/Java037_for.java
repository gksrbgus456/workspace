package java0422;

/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올떄 (break)
 * 반복문은 label을 선언하고 호출하면 된다.
 */
public class Java037_for {
	public static void main (String [] args) {
		move :
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 2; j++) {
				//break move;
				continue move;
			}
			System.out.printf("i=%d \n" , i);
		}
		System.out.println("program end");
		
		
		
		
	}// end main()
}// class
