package honux.calendar;
import java.util.*;


public class example1 {

	public static void main(String[] args) {
		int a;
		
		System.out.println("달을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		a = Integer.parseInt(s1);

		if (a == 2) {
			System.out.println("2월은 28일까지 있습니다.");
		} else if (a % 2 == 0) {
			System.out.println(a + "월은 30일까지 있습니다.");
		} else {
			System.out.println(a + "월은 31일까지 있습니다.");
		}
		scanner.close();

	}
	
//int month = scanner.nextInt();
//	int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
//	System.out.printf("%월은 %일까지 있습니다.\n", month, maxDays[month - 1]);
//	scanner.close();
	
	

}
