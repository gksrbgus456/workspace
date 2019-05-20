package Java024_method;

public class Java060_method {

	public static void main(String[] args) {
		char[] data = new char [] {'j','A','v','a'};
		int searchIndex = 2;
		System.out.printf("문자열의 길이는 : %d\n" , length(data));
		System.out.printf("%d인덱스의 요소값을 가져오기 :%c\n", searchIndex , charAt(data,searchIndex) );
	}// end main()

	public static int length(char[] data) {

		return data.length;
	}

	public static char charAt(char[] data, int index) {
		return  data[index];
	}
}// end class
