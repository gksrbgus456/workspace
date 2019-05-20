package Java0425_class.part04;
/*
 * [출력결과]
 * 메뉴명 : 떡볶이
 * 가격 : 2000
 * 갯수 : 3 
 * 메뉴금액 : 6000
 * 
 * 메뉴명  :김말이
 * 가격: 500
 * 갯수 : 2
 * 메뉴금액 : 1000
 * 
 * 메뉴명 :오뎅
 * 가격 : 300
 * 갯수 : 4
 * 메뉴금액 1200
 * 
 * 총금액 : 8200
 */
public class Java068_class {

	public static void main(String[] args) {
		MenuShop rc = new MenuShop();
		rc.menu = "떡볶이";
		rc.price = 2000;
		rc.cnt = 3;
		rc.prn();
		MenuShop rc2 = new MenuShop();
		rc2.menu = "김말이";
		rc2.price = 500;
		rc2.cnt = 2;
		rc2.prn();
		MenuShop rc3 = new MenuShop();
		rc3.menu = "오뎅";
		rc3.price = 300;
		rc3.cnt = 4;
		rc3.prn();
		
		System.out.println("=========================");
		int sum = rc.count()+rc2.count()+rc3.count();
		System.out.println("총금액 : " + sum);
		
	}//end main()
}//end class
