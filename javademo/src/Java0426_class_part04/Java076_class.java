package Java0426_class_part04;
/*
 * 출력결과를 참조하여 main() process()메소드를 구현하시오.
 * 
 * [출력결과]
 * 10 + 5 = 15
 *  3 * 2  = 6
 */
public class Java076_class {
	
	public static void main(String [] args) {
	/*
	 * nfo = new Calc[2];
	 * nfo[0] = Calc (10,5m'+');
	 * nof[1] = new Calc(3,2,'*');
	 * 
	 * 
	 */
	//여기를 구현하세요////////////////
	Calc [] nfo = new Calc[0];
	Calc s1 = new Calc(10,5,'+');
	s1.prn();
	Calc s2 = new Calc(3,2,'*');
	s2.prn();
	
	display(nfo);
	}//end main()
	
	public static void display(Calc[] nfo) {
		for(int i =0; i < nfo.length; i++) {
			
		}
	}
}//end class
