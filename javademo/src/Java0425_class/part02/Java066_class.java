package Java0425_class.part02;

public class Java066_class {

	public static void main(String[] args) {
		
		Book bk = new Book();
		bk.title = "칼의 노래";
		bk.state = false;
		
		Book bs = new Book();
		bs.title = "어둠의 노래";
		bs.state = true;
		
		System.out.printf("%s, %s \n" , bk. title, bk.process());
		System.out.printf("%s %s \n",bs.title,bs.process());
	}//end main()

}//end class
