package Java0425_class.part01;
//사용자가 정의한 데이터 타입 - 사람 객체

public class Java065_class {

	public static void main(String[] args) {

		Person ps; // 객체선언 - 메모리 생성 안되
		ps = new Person(); // 객체생성 - 메모리 생성이 됨
		// 객체참조변수.멤버변수
		ps.name = "홍길동";
		ps.age = 30;
		ps.gen = 'M';
		System.out.printf("%s %d %c \n", ps.name, ps.age, ps.gen);
		// 객체 참조변수.메소드
		ps.eat();
		ps.run();
		//객체 선언 및 생성
		Person pn = new Person();
		
		pn.name = "이영희";
		pn.age = 25;
		pn.gen = 'F';
		System.out.printf("%s %d %c \n", ps.name, ps.age, ps.gen);
		pn.eat();
		pn.run();

	}// end main()
}// end calss
