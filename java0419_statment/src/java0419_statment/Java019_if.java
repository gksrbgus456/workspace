package java0419_statment;
/*
 * if안에 if
 * 	if(조건식1){
 *   if(조건식2){
 *   수행할 문장; // 조건식 1과 저건식2을 모두 만족할떄 수행
 *   }else{
 *   수행할 문장 ; // 조건식1은 만족하고 조건식2 만족하지 않을떄 수행
 *  }
 * }
 * else{
 * 수행할 문장; // 조건식1을 만족하지 않을떄 수행
 * }
 * 	   
 */
public class Java019_if {

	public static void main(String[] args) {
		//boolean member = true;  //회원 or 비회원
		boolean member = false;
		String grade = "일반"; // 회원등급 : vip , 일반
		// 회원이고 vip고객이면 30%적립 , 회원이고 vip고객이 아닐떄는 10%적립
		// 비회원이면 적립이 없음 
		
		if(member) {//회원이면...
			if(grade == "vip"){ //회원이면서 vip 이면
				System.out.println("30%적립");
			}else {//회원이지만 vip 아닐떄
				System.out.println("10%적립");
			}
		}else{//비회원이면...
			System.out.println("비회원");
		}
		System.out.println("고객님 감사합니다.");
		
	}//end main()
}//end class
