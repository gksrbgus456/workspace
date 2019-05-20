package Java0425_class.part03;

/*
 * [출력결과]
 * [가로5,세로3의사각형]
 * 넒이 : 15
 * 둘레 : 16
 * 
 * =======================
 * [가로 7, 세로 4의 사각형]
 * 넒이 : 28
 * 둘레 : 22
 */
public class Java067_class {

	public static void main(String[] args) {
		Rect rc = new Rect();
		rc.width = 5;
		rc.height = 3;

		 //Rect rc2 = new Rect();
		 //rc2.width = 7;
		// rc2.height = 4;

//		System.out.printf("[가로%d  세로%d사각형]\n" , rc.width,rc.height );
//		System.out.printf("넒이:%d \n" ,rc.area());
//		System.out.printf("둘레 :%d \n" ,rc.grith());
//		System.out.printf("[가로%d 세로 %d사격형 ] \n", rc2.width,rc2.height);
//		System.out.printf("넒이 : %d \n",rc2.area());
//		System.out.printf("둘레: %d" ,rc2.grith());
		rc.prn();
		Rect rc2 = new Rect();
		rc.width = 5;
		rc.height = 3;
		
		rc.prn();
		System.out.println("===============================");
		Rect rc3 = new Rect();
		rc2.width = 7;
		rc2.height = 4;

		rc2.prn();
	}// end main()

}// end class
