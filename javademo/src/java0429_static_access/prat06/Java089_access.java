package java0429_static_access.prat06;

import java0429_static_access.prat05.Java087_access;//improt는 여러번 쓰기가 가능함.


public class Java089_access extends Java087_access{ // 상속관계에 있기에 가능하다.

	public static void main(String[] args) {
		
		Java089_access p = new Java089_access();
		//System.out.printf("var_private=%d \n" , p.var_private);
		//System.out.printf("var_default=%d\n",p.var_default);
		System.out.printf("var_protected=%d\n" , p.var_protected);
		System.out.printf("var_public=%d\n" , p.var_public);
	}//end main()
}//end class
