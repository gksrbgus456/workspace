package java0502_api;

public class Java113_String {

	public static void main(String[] args) {

		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이 : " + str.length());
		System.out.println("대문자 :" + str.toUpperCase());
		System.out.println("소문자:" + str.toLowerCase());
		System.out.println("문지:" + str.charAt(1));
		System.out.println("인덱스:" + str.indexOf('a'));
		System.out.println("인덱스:" + str.indexOf(97));
		// 5덱스부터 마지막까지 문자열 리턴
		System.out.println("범위:" + str.substring(5)); // ,jsp,java

		// 5인덱스부터 8미만까지 문자열 리턴
		System.out.println("범위:" + str.substring(2, 8)); // 2~7까지 뒤는 미만으로 뜻 index // REa,js

		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%s\n", i, arr[i]);

		int x = 10;
		int y = 20;
		System.out.printf("%d+%d=%d\n", x, y, x + y);

		// int -> String
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("%s+%s=%s \n", s1, s2, s1 + s2);
		
		char[] data = {'1','2','3'};
		String s3 = String.valueOf(data);
		System.out.println(s3);
		

	}// end main()
}// end class
