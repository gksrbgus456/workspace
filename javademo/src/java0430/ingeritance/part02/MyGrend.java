package java0430.ingeritance.part02;

class MyGrend {
	System.out.println("MyGrand");

}

	class MyFather extends MyGrand{
		//자식생성자에서는 반드시 부모생성자를 호출해야한다.
		// 부모생성자 호출이 생략되어 있으면 JVM에서 super()로 호출한다.
		public MyFather() {
			System.out.println("MyFather");
		
	}
}

class MyChild {
	public MyChild extends MyFather() {
		System.out.println("MyChild");
	}

}
