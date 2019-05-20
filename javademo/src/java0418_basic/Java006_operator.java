package java0418_basic;

public class Java006_operator {

	public static void main(String[] args) {
		
		int a = 10; 
		int b = 3;
		System.out.println(a/b); //int/int => 3
		
		System.out.println((double)(a/b));// (double) (int/int) => 3.0
		
		System.out.println((double)a/b); //double /int => 3.3333...
	}//end main()
}//end class
