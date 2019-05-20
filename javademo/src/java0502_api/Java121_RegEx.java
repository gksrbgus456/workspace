package java0502_api;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Java121_RegEx {

	public static void main(String[] args) {

		/*String sn = "12345";
		String sb = "bsbae";
		String st = "aetwefcc";

		// a-zA-Z_*$가 sn변수에 포함이 되여 있으면 true, 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));
		
		//sn변수에 0-9가 포함되여 있으면 true 아니면 flase을 리턴한다.
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*\\d.*"));
		
		//sb변수에 저장된 값이 2로 시작되면 true 아니면 flase을 리턴한다
		System.out.println(sb.matches("2.*"));
		
		
		//sb변수에 저장된 값이 2로 시작해서 5로 끝나면 true 아니면 flase 을 리턴한다
		System.out.println(sb.matches("2.*5"));
		
		//sb 변수에 저장된 값이 a이거나 b로시작하고 5자리 문자열이면 true 아니면 false 을 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));
		//st변수에 저장된 문자열이 a또는 b로 시작하고 cc로 끝나면서 
		// 사이에는 임의문자 최소 1개에세 5개를 포한다.
		System.out.println(st.matches("[ab].{1,5}cc"));*/
		
		
		String input1="24242";
		String input2="maaaaa";
		String input3="252352";
		
		/*
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
		 *          있는지를 확인한다.
		 * Pattern.comile(): 여러개의 텍스트를 재사용 가능한 Pattern 
		 *          인스턴스로 컴파일 한다.
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 find 
		 * start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환
		 * end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 */
		
		//\\w _ : 영문, 숫자
		//System.out.println(input1.matches("[\\w]{5,10}"));
		/*Pattern pn = Pattern.compile("[\\d]");
		Matcher mc = pn.matcher(input1);
		System.out.println(mc.find());
		System.out.println(Pattern.compile("[\\d]").matcher(input1).find());*/
		System.out.println(Pattern.compile("[a-zA-Z]").matcher(input1).find());
		
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find());
		
		System.out.println(input2.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input2).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input2).find());
		
		System.out.println(input3.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input3).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input3).find());
	
	}// end main()
}// end class
