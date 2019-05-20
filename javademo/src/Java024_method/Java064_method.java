package Java024_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data = new char[] {'a','b','c'};
		
		System.out.println(data);//abc
		
		System.out.printf("%s\n" , data); //[C@4aa298b7

		
		System.out.println("data=" + data); //data=[C@4aa298b7
		
		int [ ] num = new int[] {1,2,3};
		System.out.println(num);//[I@7d4991ad
	}//end main()
}//end class
