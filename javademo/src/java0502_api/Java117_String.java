package java0502_api;
/*
 * [출력결과]
 *  java jsp spring
 */
public class Java117_String {

	public static void main(String[] args) {
		String stn=new String("java_jsp_spring");		
		System.out.println(process(stn.toCharArray()));
	}//end main()

	public static char[] process(char arr[]){
		//'_'를 ' '으로 변환후 리턴하는 프로그램을 구현하세요.
		
		char temp = ' ';
		char [] data = new char [arr.length];
		for(int i = 0; i <data.length; i++)
			if(arr[i] == '_') {
				arr[i] = temp;
			}
		
		
		
		return arr;
	}//end process()
}//end class
