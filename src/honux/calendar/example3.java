package honux.calendar;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {

		String PROMPT = ">";
		Scanner scanner = new Scanner(System.in);
		example2 ex2 = new example2();

		
		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
		
			
			if(month == 2) {
				ex2.printSampleCalendar1();
			}else if(month%2 == 0 && month<13 ) {
				ex2.printSampleCalendar1();
				ex2.printSampleCalendar2();
			}else if(month%2 == 1 && month<13){
				ex2.printSampleCalendar1();
				ex2.printSampleCalendar3();
			}else if(month > 12) {
				continue;
			}else if(month == -1) {
				break;
			}
			System.out.printf("%d월은 %d일까지 있습니다\n", month, ex2.getMaxDaysOfMonth(month));

		}
		System.out.println("Bye!");
		scanner.close();
	}
}
