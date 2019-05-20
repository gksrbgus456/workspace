package Java0423_array;
/*
 * num 배열에 저장된 요소의 합겨를 구하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 합계:45
 */
public class Java043_array {

	public static void main(String[] args) {
		int[] num = new int [] {22,3,8,12};
		int sum = 0;
		
		/*sum = sum+num[0]; // 22=0+22
		sum = sum+num[1]; //22+3
		sum = sum+num[2]; //25+8
		sum = sum+num[3]; // 33+12*/
		
		for (int index = 0; index < num.length; index++) {
			sum += num[index];
			
		}
		System.out.println("합계:" + sum);
		
	
	}// end main()
}// end class
