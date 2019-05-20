package java0429_static_access.prat07;

public class MemberDAO {
	
	public static MemberDAO dao = new MemberDAO();
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		return dao;
	}
	
	public void display() {
		System.out.println("display");
	}  
}
 