package java0507_api;
/*
 * sc.nextInt();메소드는  정수를 입력하면 개행문자 앞까지만 읽어오지만
 *에러가 발생하여 개행문자가 버퍼에 남아있어
 *다시 정수입력할떄 개행문자가 자동으로 입력되기 떄문에 무한반복이된다.
 */
import java.util.Scanner;

public class Java152_exception {

	public static void main(String[] args) {
		int[] data = new int[2];
		for (int i = 0; i < data.length; i++) {
			data[i] = inputData();
		}
		System.out.printf("두 수의 합은 :%d\n", data[0], data[1]);
	}

	public static int inputData() {
		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			int index;
			System.out.printf("%번째 정수를 입력하세요.\n",index+1);
			num = sc.nextInt();
			break;
		}catch(InputMismatchException ex) {
			System.out.println("정수만 입력하세요.");
			sc.nextLine();
		}
	
	return num;	
	}
}
