package ncs.test3;

import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();  
		
		int year = 1987;
		
		int month = 5;
		
		int year2 = 27;
	
		
		int data = cal.getActualMaximum(Calendar.DATE);
		
		cal.set(Calendar.DATE,data);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String week = "";
	
		System.out.printf("%d년%d월%d요일   \n", year, month, year2);

	}

}
