package java0430.ingeritance.part08;
/*
 * [출력결과]
 * 1000량의 물을 뿌린다.
 * 8인승 차량입니다.
 */
public class Java099_inheritance {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.waterSpread();
		
		QwnerEngine qw = new QwnerEngine();
		qw.setSeat(8);
		qw.information();
		
		
		
	}//end main()
}//end class
