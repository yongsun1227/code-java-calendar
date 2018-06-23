package honux.calendar;
import java.util.Scanner;
public class example3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		example2 ex2 = new example2();
		
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();
		
		for(int i = 0; i < repeat; i++) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다\n", month,ex2.getMaxDaysOfMonth(month));
			
		}
		System.out.println("Bye!");
		scanner.close();
	}
}
