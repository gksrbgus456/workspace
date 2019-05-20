package Java0425_class.part06;
/*
 * 생성자(constructor)
 * 1. 객체가 생성될 떄 자동으로 호출되는 메소드로 클래스명과 이름이 같으며,
 * 		일반적으로 객체가 제대로 동작 할 수 있게 기본값을 입력하는 역활을한다.
 * 
 * 2. 생성자는 리턴타입이 없다.
 * 3. 클래스에 생성자가 정의되여 있찌 않으면 JVM에서 기본 생성자를 제공한다.
 * 4. 기본생성자는 클래스의 접근제어자를 그대로 사용한다.
 * 5. 클래스는 한개 이상의 생성자는 갖는다.
 * 
 * 
 */
public class Java070_constructor {

	public static void main(String[] args) {
		/*
		 * 1. stack영역에 4바이트 생성
		 * (객체변수 선언 : HandPhone ph)
		 * 2.heap 영역에 HandPhone 크기만큼 메모리 생성
		 * (new)
		 * 3. 멤버변수에 초기값 할당
		 * (생성자 호출 :HandPhone())
		 * 4. heap의 주소를 stack에 저장
		 * (=)
		 * 
		 * 
		 */
		HandPhone ph=new HandPhone();
		
		ph.name = "홍길동";
		ph.number = "010-2563-9029";
		ph.prn();
		
		
		HandPhone ne =new HandPhone ("이영희 ", "010-9725-8253");
		ne.prn();
	}//end main()

}//end class
