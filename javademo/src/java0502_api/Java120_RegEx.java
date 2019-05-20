package java0502_api;
/*
 * 정규식  ( Regular Expression)
 * 1 정규식이란 텍스트 데이터 중에서 원하는 조건 (패턴) 과 일치하는 문자열을 찾기내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 */
public class Java120_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		String st = "java     korea";
		
		
		/*for(int i = 0; i < sn.length(); i ++) {
			if(sn.charAt(i)=='a' ||sn.charAt(i)=='r' ) {
				sg+= "_";
			}else {
				sg += sn.charAt(i);
			}
		}
		
		System.out.println(sg);*/
		
		
		System.out.println("regular expression은 이용한 문자변경");
		
		//[]대괄호는 or를 의미한다.
		//sn변수에 저장된 문자열에서 a이거나 r이면 "_"로 변경한다. 9
		System.out.println(sn.replaceAll("[ar]", "_"));

		//sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true 아니면 false 을 리턴한다.
		sn ="a";
		System.out.println(sn.matches("[ar].*"));
		
		
		System.out.println(st.replaceAll("\\s {2,3}","@"));
	}//end main()

}//end class
