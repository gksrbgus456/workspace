package java0507_api; // 날짜 관련 클래스

import java.util.Calendar;

abstract class Test {
	public static Test getInstance() {
		return new TestExam();
	}

	abstract public void prn();
}

class TestExam extends Test {
	// public static Test getInstance() {

	public void prn() {
		System.out.println("prn");

	}
}

public class Java145_Calendar {

	public static void main(String[] args) {
		// Test tt = Test.getInstance();
		// System.out.println(tt);
		// tt.prn();
		
		//Calendar은 추상클래스이므로 객체생성을 할 수 가 없다 .
		Calendar cal = Calendar.getInstance();
		//Calendar cal2 = Calendar.getInstance();
		//System.out.println(cal==cal2);
		System.out.println(cal.toString());
		int year = cal.get(Calendar.YEAR);   // final,static
		//MONTH은 1월일떄 0을 리턴한다
		int month = cal.get(Calendar.MONTH)+1;
		  // 기본 시스템에서 제공하는 날짜보다  - 한달되서 나타남
		
		int data = cal.get(Calendar.DATE);
		
		//int hour = cal.get(Calendar.HOUR); // 12시간
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 24시간 
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.printf("%d-%d-%d  %d:%d:%d\n"
				,year,month,data,hour,minute,second);  // 기본 시스템에서 제공하는 날짜보다  - 한달되서 나타남

		//이번달의 마지막 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));// 마지막 일
		//오늘의 요일 리턴 (일요일 -> 1)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//오늘을 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE,-5);
		System.out.println(cal.toString());
		
		cal.set(2017,2,1); // 2017-3-1
		System.out.println(cal.toString());
	}
}
