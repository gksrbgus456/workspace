package java0430.ingeritance.part01;

public class Father {
	int a = 3;
	void prn() {
		System.out.println("a=" + a);
	}
}

//Child는 Father을 상속받는다(Child는 Father이다)
class Child extends Father{
	int b = 5;
}
