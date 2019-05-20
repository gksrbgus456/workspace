package java0418_basic;

//논리연산자 : &&(and) , ||(or). !(not)

/*
 * true && true => true 
 * ture && false => false
 * false && true => false
 * false && flase => flase
 * 
 * ture || true = > true 
 * true || false => true
 * false || true => true
 * false || alse => false
 * 
 * !true => false
 * !false => true
 */
public class Java011_operator {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		res = x < y && x ==z;
		/*
		 * x < y => ture 
		 * x == z => true 
		 * true && true \> true 
		 * res 변수에 식의 결과(true)저장
		 */
		System.out.println(res);
	}//end main()

}//end class
