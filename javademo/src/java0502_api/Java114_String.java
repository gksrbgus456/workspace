package java0502_api;
/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */
public class Java114_String {
	public static void main(String [ ]args) {
		
		String sn = "127.0.0.1:8080";
		//System.out.println("ip: " +sn.substring(0,9));
		//System.out.println("port:" + sn.substring(10,14));
		
		String [] arr = sn.split(":");
		System.out.println("ip:" + arr[0]);
		System.out.println("port:" + arr[1]);
	}
}
