package java0507_api;

import java.util.Scanner;

public class Java151_exception {
	
	public static void main(String[] args) {
		//String data1 = "12";
		//String data2 = "0";
		
		Scanner sc = new Scanner (System.in);
		
		try {
		//int x = Integer.parseInt(data1);
		//int y = Integer.parseInt(data2);
			int x = sc.nextInt();//개행문자 앞까지만 읽어옴  /r/n
			int y = sc.nextInt();
			int res = x/y;
		System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println("분모는 0보다 큰값을 입력하세요");
		}catch(NumberFormatException ex ) {
			System.out.println("숫자를 입력하세요.");
		}catch(InstantiationException ex) {
			System.out.println(ex.toString());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
