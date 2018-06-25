package honux.calendar;

import java.util.*;

public class example2 {
	private final int[] MAX_DAYS = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar1() {
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("--------------- ");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	public void printSampleCalendar2() {
		System.out.println("29 30 31 ");
	}
	public void printSampleCalendar3() {
		System.out.println("29 30 ");
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		example2 ex2 = new example2();
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.\n", month, ex2.getMaxDaysOfMonth(month));

		ex2.printSampleCalendar1();
		scanner.close();

	}

}