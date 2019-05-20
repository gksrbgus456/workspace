package Java0423_array;
/*
 * [출력결과]
 * 짝수 : 42
 * 홀수 : 3
 */
public class Java044_arrat {

	public static void main(String[] args) {
		
		int[] num = new int [] {22,3,8,12};
		int even = 0; //짝수
		int odd = 0; // 홀수
		
		for(int index = 0; index < num.length; index++) {
			if(num[index] %2 == 0) {
				// 42 
				even += num[index];
			}else {
				//3
				odd += num[index];
			}
			
		}
		System.out.println("짝수 : " + even);
		System.out.println("홀수 : " + odd);
		
 		
	}//end main

}//end class
