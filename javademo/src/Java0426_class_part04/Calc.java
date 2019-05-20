package Java0426_class_part04;

public class Calc {
	int first;
	int second;
	char ope; // 배열에 저장한 연산자는 +,-,*,/만 저장함

	public Calc() {

	}

	public Calc(int first, int second, char ope) {
		this.first = first;
		this.second = second;
		this.ope = ope;
	}

	public int process() {
		int a = 0;
		
		if(ope == '+') {
			return first+second;
		}else if (ope == '-') {
			return first-second;
		}else if (ope == '*') {
			return first*second;
		}else {
			return first/second;
		}
		
		
	}
	
	/*
	 * switch(ope){
	 * case'+' : return first + second;
	 * case'-' : return first - second;
	 * case'*' : return first * second;
	 * dufalt : first / second;
	 */
	

	public void prn() {
		System.out.printf("%2d %c %2d = %d \n", first, ope, second, process());

	}

}// end class
