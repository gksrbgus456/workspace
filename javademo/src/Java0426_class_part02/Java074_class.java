package Java0426_class_part02;

/*
 * [실행결과]를 참조하여 main()메소드를 추가하는 로직을 구현하세요.
 */
public class Java074_class {

	public static void main(String[] args) {
		Goods[] goodArray = new Goods[3];

		goodArray[0] = new Goods("Nikon", 400000, 30, 50);
		goodArray[1] = new Goods("Sony", 450000, 25, 35);
		goodArray[2] = new Goods("FujiFilm", 350000, 10, 25);
//		goodArray[0].prn();
//		goodArray[1].prn();
//		goodArray[2].prn();

		// for(int i = 0; i< goodArray.length; i++) {
		// goodArray[i].prn();
		// }
		display(goodArray);
	}// end main()

	public static void display(Goods[] goodArray) {

		for (int i = 0; i < goodArray.length; i++) {
			goodArray[i].prn();
		}
	}// display()
}// end class
