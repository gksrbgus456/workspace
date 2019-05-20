package Java0426_class_part01;
/*
 * Song 클래의 show() 메소드를 아래와 같이 출력이 되도록 구현하세요.
 * 
 * [실행결과]
 * 노래 제목 : Dansing Queen
 * 가수 : ABBA
 * 앨범 : Arrival
 * 작곡가 :Benny Andersson,Bjorn Ulvaeus
 * 년도 : 1977
 * 틀랙 번호 : 2
 */
public class Java073_class {

	public static void main(String[] args) {
		Song s = new Song ("Dansing Queen" , "ABBA" , "Arrival",
				new String [] {"Benny Andersson", "Bjorn Ulvaeus"},
				1977,2);
		s.show();
	
	}//end main()

}//end class 
