package java0419_statment;
/*
 * 다중 if ~else
 * if (조건식1){
 * 수행할 문장1;
 * }else if (조건식2){
 * 수행할 문장2;
 * }else if (조건식3){
 * 수행할 문장3;
 * }else {
 * 수행할 문장;
 * }
 */
public class Java020_if {

	public static void main(String[] args) {
		//char code = 'B';
		char code = 'F';
		if(code == 'A') {
			System.out.println("식품류");
		}else if (code == 'B') {
			System.out.println("야채류");
		}else if (code == 'c') {
			System.out.println("육류");
		}else {
			System.out.println("기타");
		}
		System.out.println("코드별 제품종류 체크");
		
	}//end main()
}//end class
