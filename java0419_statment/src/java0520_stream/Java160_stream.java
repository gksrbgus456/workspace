package java0520_stream;

import java.util.Scanner;

public class Java160_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		System.out.print("y:");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
		sc.close();
	}

}
