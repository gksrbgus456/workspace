package ncs.test2;

public class String_Test {

	public static void main(String[] args) {
	
		String str = "1.22,4.12,5.93,8.71,9.34"; //double 
		
		double data[] = new double [5];
		double sum =0;
		
		//str 에서 데이터를 분리한다 String[]st;
		String[]st = str.split(",");
		
		for(int i = 0; i < st.length; i++) {
			data[i] = Double.valueOf(st[i]);
			sum += data[i];
			
			
			
		//배열에 실수 데이터를 넣는다.
			//배열 데이터의 합을 구한다
		}
		//결과값을 출력한다.
		System.out.printf("합은 :%.3f \n 평균 %.3f " ,sum , sum/5);
		
	}

}
