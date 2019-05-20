package Java024_method;

public class Java054_method {

	public static void main(String[] args) { //1		
		int year = 2012; //2
		if (isLeapYear(year)/* 3 */) { //8
			System.out.printf("%d년도는 윤년입니다.\n", year); //9
		}else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}		
	}//end main() //10
	
	public static boolean isLeapYear(int year) { //4
		// 어떤 년도가 윤년이면 true, 평년이면 false을 리턴하는 프로그램 구현
		//boolean chk;
		if(year%4==0 && year%100!=0 || year%400==0) { //5
			//chk=true;
			return true; //6
		}else {
		   //chk=false;	
			return false;
		}	
		//return chk;
	}//end isLeapYear() //7

}//end class
