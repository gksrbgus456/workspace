package Java0425_class.prat08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
		this("홍길동","보류",3000);
	}
	
	public Employees(String name, String dept,int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
		
		}
		public void prn() {
			System.out.printf("%s %s %d \n ", name,dept,salary);
	}
}

