package java0418_basic.prob;
/*
 * ko, en, jp 평균을 구해서 60점 이상이면 "합격", 60점 미만이면 "불합격"을 
 * 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 1) 합격일때
 * 평균  65.0점, 합격입니다
 * 
 * 2)불합격일때
 * 평균  34.5점, 불합격입니다
 */

public class Prob07 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45;
		int jp = 60;
		int hap = ko + en + jp;
		String chk = "";
		double av = hap/3.0;
		chk=(av>60) || (av==60) ? "합격입니다" : "불합격입니다";
		
		//chk = hap/3 > 60 ? "평균" + hap/3 + ", 합격입니다" : "평균" + hap/3+",불합격입니다";
		
		
		//System.out.printf("평균 %.1f점 ,합격일떄 \n", 65.0 );
		
		System.out.printf("평균 %.1f ,%s" ,av,chk);
		
	}// end main()

}// end class








