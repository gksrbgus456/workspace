package Java;
/*package Java024_method;
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Java060 {

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
