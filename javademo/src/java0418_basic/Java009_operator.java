package java0418_basic;

public class Java009_operator {
	public static void main (String [] args ) {
		int i = 5;
		int j = 0;
		int k = 0;
		// 전위형 : 값이 참조되기 전에 증가시킨다.
		j= ++i; 
		System.out.println("i=" +i +",j=" + j);
		
		//후위형 " 값이 참조된 후에 증가시킨다.
		k = i++;
		System.out.println("i=" + i + ",k=" + k);
		
	}//end main()
}//end class
