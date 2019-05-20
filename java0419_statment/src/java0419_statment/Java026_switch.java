package java0419_statment;

public class Java026_switch {
	public static void main(String[] args) {
		int month = 4;

		int lastDay = -1;

		if (month < 1 || month > 12) {
			System.out.println("1월~12월만 가능합니다.");
			return;
		}

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
		case 12:
			lastDay = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;

		case 2:
			lastDay = 28;
		}
		System.out.printf("%d월의 마지막 일은 %d입니다. \n", month, lastDay);
	}// end main()
}// end class
