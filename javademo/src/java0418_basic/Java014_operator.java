package java0418_basic;

public class Java014_operator {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int res;
		
		res = a+b;
		System.out.println(res);//res = 7
		
		
		//res = res + a ;
		res = res += a;
		
		/*
		 * ++x;
		 * x = x + 1 ;
		 */
		
		System.out.println(res);
	}// end main()
}//end class
