package Java0426_class_part05;

public class Insurance {
	String code; //상품코드
	String name; // 상품명
	String type; //상품종류
	int payment; // 납입보험료
	
	public Insurance() {
		
	}

	public Insurance(String code, String name, String type, int payment) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.payment = payment;
	}
	public void prn() {
		System.out.printf("%s %s %s %d \n " ,code,name,code,type,payment);
	}
}
