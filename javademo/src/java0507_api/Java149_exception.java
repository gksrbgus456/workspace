package java0507_api;

public class Java149_exception {

	public static void main(String[] args) {
		int [] num = new int[3];
		try {
			num[1] = 10;
			System.out.println(num[1]);
			return;
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("program end");
		}//finally 무조건 수행 앞에 리턴이잇어도  
	
		
	}
}
