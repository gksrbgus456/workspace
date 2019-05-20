package java0429_static_access.prat08;

public class Java091_encapsulation {

	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(14);
		time.setMinute(49);
		time.setSecond(30);
		
		System.out.printf("%d:%d:%d\n",time.getHour(),time.getMinute(),time.getSecond());
		
		
	}//end main()
}//end class
