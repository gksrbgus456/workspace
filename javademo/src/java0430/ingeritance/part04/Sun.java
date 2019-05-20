package java0430.ingeritance.part04;



class Sun extends Parent {
	String dept;

	public Sun() {

	}

	public Sun(String name, int age, String dept) {// 3
		super(name, age);// 4
		this.dept = dept;//9
	}//10

	public void prn() {//12
		System.out.printf("%s %d %s \n", name, age, dept);//13
	}
}
	


