package days08;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// [문제] 년도를 입력받아서 윤년/평년 출력
		int year;
		Scanner scanner = new Scanner(System.in);
		year = getYear(scanner);
		
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
			
		}
	} // main

	private static int getYear(Scanner scanner) {
		String regex = "\\d*";
		String strYear;
		
		do {
			System.out.print("> 년도 입력: ");
			strYear = scanner.next();
		} while(!strYear.matches(regex));
		

		return Integer.parseInt(strYear);
	}
}

