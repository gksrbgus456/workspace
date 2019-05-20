package Java0425_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}
	
	public void print() {
		System.out.printf("자바%s의 면적은 %.2f입니다.\n",name, getArea());
	}
}// end class////////////////////////

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////
		Circle cr = new Circle();
		cr.name = "피자";
		cr.radius = 10;
		cr.print();
		
		Circle cl = new Circle();
		cl.name = "도넛";
		cl.radius = 2;
		cl.print();
		

	}//end main()

}//end class
