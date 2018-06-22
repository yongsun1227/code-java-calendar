package honux.calendar;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String inputValue = sc.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int sum1 = first + second;

		System.out.println("두 수의 합은 "+sum1+"입니다");
		
		
	}

}
