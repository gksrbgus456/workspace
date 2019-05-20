package java0418_basic;

public class Java016_print {
	
	public static void main (String [] args) {
		System.out.println("java");
		System.out.println("jsp");
		System.out.print("spring\n");
		System.out.print("oracle\n");
		/*
		 * printf ("추력형식", 값1,값2...)
		 * 
		 * 출력기호
		 * %s :  문자열
		 * %d : 정수 
		 * %f : 실수
		 * %c : 문자
		 * %b : 논리
		 * %% : %
		 * \ : 특수문자를 처리하는 기호
		 */
		System.out.printf("%s\n" ,"mybatis");
		System.out.printf("%d \n" , 50l); // byte,short,int,long 
		System.out.printf("%f \n", 4.5f); // foa,double
		System.out.printf("%c %b %d \n", 'a' , true , 10);
		
		
		//소수점 첫번쨰 까지 출력을 한다.  (반올림)
		System.out.printf("%.1f \n", 4.56); 
		//5은 총자릿수 (소수점 포함)     . 1은 소수점 자릿수
		System.out.printf("%5.1f \n", 34.56);
		System.out.printf("%5.1f \n", 124.56);
		System.out.printf("%5.1f \n", 5124.56);
		
		System.out.printf("%5.2f \n", 4.56); // 4.56
		System.out.printf("%5.2f \n", 4.5); // 4.50
		System.out.printf("%5.2f \n", 24.567); // 24.57
		System.out.printf("%5.2f \n", 124.5); //124.50
		
		System.out.printf("%-5.1f \n",4.56); // 4.6
		System.out.printf("%-10s \n" , "korea"); //korea
		
		//홍길동님의 평균 95.0 이므로 a학점입니다.
		
		System.out.printf("%s님의 평균은 %5.1f이므로 %c 학점입니다 \n","홍길동",95.0,'A');
		
		//3 + 2 = 5 
		System.out.printf("%d + %d = %d \n",3,2,3+2);
		
		//3 % 2 = 1 
		System.out.printf("%d %% %d = %d \n" ,3,2,3%2);
		
		//당신의 색깔은 "파랑"입니다.
		System.out.printf("당신의 색깔은 \"%s\"입니다 \n","파랑");
		
	}//end main()
}//end class
