package java0419_statment;
/*
 * switch(식){
 *	case 값1: 문장1; break;
 *	case 값2: 문장2; break;
 *	case 값3: 문장 4; break;
 *	default:  문장4: 
 * }
 * 
 * 식의 결과 타입 : byte,short,char,int,
 * 				enum(jbk7버전), String(jpk7버전)
 * 
 * switch~case에서 break을 만나면 현재 수행중인 조건문을 완전히 빠져나와 다음 문장을 수행한다.
 */
public class Java025_switch {

	public static void main(String[] args) {  
		int jumsu = 85;
		char res;
		//jumsu >=90 'A' jumsu >=80 'B' jumsu >= 70 'C'
		//jumsu >= 60 'D' jumsu <60 'F'
		
		/*
		 * if (jumsu >= 90) { res = 'A'; }else if (jumsu >= 80) { res = 'B'; }else if
		 * (jumsu >= 70) { res = 'C'; }else if (jumsu >=60) { res= 'D'; }else { res =
		 * 'F'; } System.out.printf("%d점수는 %c 학점입니다. \n" , jumsu , res);
		 */
		
		
		
		
		switch (jumsu/10) {
		case 10 : res = 'A'; break;
		case 9 : res = 'A'; break;
		case 8 : res = 'b'; break;
		case 7 : res = 'C'; break;
		case 6 : res = 'D'; break;
		default: res = 'F'; break;
		}
		System.out.printf("%d점수는 %c 학점입니다. \n" , jumsu , res);
		 
	}//end main()
}//end class
