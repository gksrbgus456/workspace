package java0429_static_access.prat07;

public class Java090_singleton {

	public static void main(String[] args) {

		MemberDAO dp = MemberDAO.getInstance();
		dp.display();

		MemberDAO ds = MemberDAO.getInstance();
		ds.display();
		
		System.out.println(dp==ds); // true
		
		StudenDAO sa = new StudenDAO();
		StudenDAO st = new StudenDAO();
		System.out.println(sa==st);//false

	}// end main()
}// end class
