package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT="cal>";
	
	public void runPrompt() {
		
	}

	public static void main(String[] args) {
		
		String PROMPT = "cal>";
		Scanner scanner = new Scanner(System.in);
		example2 ex2 = new example2();
		
		int month = 1;
		
		while(true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
		}

	}

}
