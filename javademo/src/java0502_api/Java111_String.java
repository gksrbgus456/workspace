package java0502_api;

class StringTest extends Object {
	private char[] arr;


	public StringTest(char[] arr) {
		this.arr = arr;
	}

	public int length() {
		return arr.length;
	}

	public char charAt(int index) {
		return arr[index];
	}

	public boolean isUpperCase(int index) {
		if (arr[index] >= 'A' && arr[index] <= 'Z') {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		String sn = "";
		for (int i = 0; i < arr.length; i++)
			sn += arr[i];
		return sn;
	}

}

public class Java111_String {

	public static void main(String[] args) {
		
		char[] data = new char[] { 'j','a','v','a'};
		StringTest st = new StringTest(data);
		System.out.println(st.length());
		System.out.println(st.charAt(2));
		System.out.println(st.isUpperCase(2));
		System.out.println(st.toString());
		
		char[] sub = new char[] {'k','o','R','e','A'};
		StringTest ss = new StringTest(sub);
		System.out.println(ss.length());
		
	}

}
