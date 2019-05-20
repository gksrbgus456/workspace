package Java0425_class.part04;

import Java0425_class.part03.Rect;

/*
 * 메뉴명 	가격		갯수
 * 떡볶이 	2000	3
 * 김말이 	500		2
 * 오뎅	300		4
 */
public class MenuShop {
	String menu; // 메뉴명
	int price; // 가격
	int cnt; // 갯수
	
	//주문메뉴 계산
	int count() {
		return price * cnt;
	}
	
	public void prn() {
		System.out.printf("메뉴명 : %s \n" , menu);
		System.out.printf("가격: %d \n" , price);
		System.out.printf("갯수:%d \n" , cnt);
		System.out.printf("메뉴금액 : %d \n\n" , count() );
		
	}
}//end class
