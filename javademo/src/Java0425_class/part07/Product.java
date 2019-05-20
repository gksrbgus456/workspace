package Java0425_class.part07;

public class Product {

	String code;
	String pname;
	int cnt;

	public Product() {

	}

	public Product(String code, String pnmae, int cnt) {
		//멤버변수와 매개변수 이름이 같을 떄 멤버변수에 this 키워드를 명시한다.
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}

	public void prn() {
		System.out.printf("%s %s %d \n", code, pname, cnt);

	}
}
