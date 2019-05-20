package java0507_api;

public class Java150_exception {

	public static void main(String[] args) {//1
		StringBuffer sb = null;//2
		try {//3
		sb.reverse();//4
		}catch(NullPointerException ex) {//5
			sb = new StringBuffer("java");//6
			System.out.println(sb);//7
		}finally {//8
			System.out.println("program end");//9
		}//10
	}//11

}
