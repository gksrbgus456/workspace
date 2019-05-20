package java0430.ingeritance.part03;

public class SuperConst {
	int x;
	int y;
	
	public SuperConst(int x, int y) {
		this.x = x;
		this.y = y;
	}
}// end class

class SubConst extends SuperConst {
	SubConst(){
		
		//SuperConst클래스에 1개의 생성자가 정의되여 있으므로
		//JVM에서 기본 생성자를 제공하지 않으므로 super()로 호출할 수 없다.
		// super();
		super(10,40);
	}
}// end class