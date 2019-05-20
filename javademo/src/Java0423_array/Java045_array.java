package Java0423_array;


public class Java045_array {

	public static void main(String[] args) {
		
		int[] data1 = new int [3];    // 기본 값 
		long [] data2 = new long [3]; // 0L
		float[] data3 = new float [3]; // 0.0f
		double [] data4 = new double [3]; // 0.0
		char [] data5 = new char [3]; // \u0000
		boolean [] data6 = new boolean [3]; // false
		String [] data7 = new String [3]; // 
		
		for(int i = 0; i < data7.length;  i++) {
			System.out.printf("data[%d] =%s \n" , i , data7[i]);
		
		}
		
		System.out.println("===========================");
		
		char a = ' ';   // 초기화 
		char b = '\u0020';
		char c = '\u0000';
		System.out.println(a==b);
		System.out.println(a==c);
	}// end main()

}// end class
