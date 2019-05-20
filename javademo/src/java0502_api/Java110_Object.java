package java0502_api;

/*
 * Java API (Application programming Interface)
 * OBject
 * 1 클래스 중에서 최상의 클래스이다.
 * 2 Object을 제외한 모든 클래들은 Object을 상속받고 있따.
 * 3 java.lang 패키지에서 제공하는 클래스이다.
 */

/*
 *컴파일 시 자동으로 생성되는 코드
 * import java.lang.*;
 * default constructor,
 * return;
 * .toString()
 * this.
 * super()
 * 자동 upcasting
 * 인터페이스 메소드 public abstract
 * 인터페이스 필드 public static final
 */
public class Java110_Object {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj.toString());

		int x = 5;
		int y = 5;
		// == 값비교 (기본데이터)
		System.out.printf("x=%d y=%d x==y : %b \n", x, y, x == y);

		Object ojt = new Object();

		// ==주소비교 (참조데이터)
		System.out.printf("obj==ojt : %b \n", obj == ojt);
		
		//equals() : 주소비교 - 객체비교만 가능하다.
		System.out.printf("obj.equals(ojt)=%b \n" ,obj.equals(obj));
		
		// class java.lang.Object
		System.out.println(obj.getClass());
		
		System.out.println(obj.getClass().getName());
		
		//java.lang.Object@15db9742 << 값
		System.out.println(obj);
		System.out.println(obj.toString());
	}// end main()

}// end class
