package java0429_static_access.prat03;

public class Java085_static {
	public static void display() {
		
		System.out.println("display");
	}

	public void process() {
		System.out.println("process");
	}

	public static void main(String[] args) {
		display();
		Java085_static js = new Java085_static();
		js.process();
	}
}
