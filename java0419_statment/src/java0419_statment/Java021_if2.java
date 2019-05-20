package java0419_statment;

public class Java021_if2 {

	public static void main(String[] args) {
		char data = 'd';
		
		if(data == 'D') {
			System.out.println(data +"는 대문자입니다");
		}else if (data == 'd') {
			System.out.println(data + "는 소문자입니다");
		}else {
			System.out.println(1 + "기타입니다");
		}
	}
}
