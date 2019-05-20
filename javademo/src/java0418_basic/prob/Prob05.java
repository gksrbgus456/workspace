package java0418_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob05 {

	public static void main(String[] args) {
	int money = 7777;
		int mok=money/500;	
		
		//여기에 작성하시오.
		money = 7777 / 500 ;
		System.out.println("500원 :"+ money + "개");
		
		money = 200 / 100;
		System.out.println("100원 : " + money +"개");
		
		money = 50 / 50;
		System.out.println("50원 :" +money + "개");
		
		money = 10 / 5;
		System.out.println("10원 : " + money + "개");
		
		money = 7 / 1 ;
		System.out.println("1원 :" + money + "개");
		
		
		
		

	}//end main()

}//end class


