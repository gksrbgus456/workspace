package Java0425_class.part06;

public class HandPhone {
	// 멤버변수
	String name;
	String number;

	// 생성자(생성자의 목적은 초기값을 할당하기 위함)
	HandPhone() {

	}

	HandPhone(String ne, String nb) {
		name = ne;
		number = nb;
	}

	// 메소드
	void prn() {
		System.out.printf("%s %s\n", name, number);
	}

}// end class
