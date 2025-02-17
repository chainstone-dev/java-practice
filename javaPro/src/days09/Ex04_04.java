package days09;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class Ex04_04 {
	public static void main(String[] args) {
		// 830412-1700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);

		/**
		 * ‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다. ㅍ =
		 * 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
		 *      0    1    2    3    4    5    6    7     8   9   10    11
		 * 즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로
		 * 표기한다.)
		 */
		
		int sum = 0;

		rrn = rrn.replace("-", "");

		for(int i=0; i<=11; i++) {
			char a = rrn.charAt(i);
			int k = a-'0';
			sum += k*(2+i%8);
		}

		int result = (11 - (sum % 11))%10;
		
		if (Integer.parseInt(rrn.charAt(12)+"") == result) System.out.println("유효");

	} // main

	private static int getAmericanAge(String rrn) {
		// 만나이 = 올해년도 - 생일년도 ( 생일지나지않은 경에만 -1 )
		int americanAge = getCountingAge(rrn) - 1;
		// 생일의 월/일 - 0412
		// 올해의 월/일 - 3 13
		/*
		 * if (!(올해월>=생일월 && 올해일>=생일일)) age--;
		 */
		// 0412
		int birthMD = Integer.parseInt(rrn.substring(2, 6));
		// 올해 월일
		Date d = new Date();
		int currMD = (d.getMonth() + 1) * 100 + d.getDate();
		if (birthMD > currMD)
			americanAge--;
		return americanAge;

	}

	private static int getCountingAge(String rrn) {
		// 자바에서 날짜/시간 다루는 기능이 구현된 클래스 : Date, Calendar
		// LocalDate, LocalTime, LocalDateTime
		/*
		 * [1] Date d = new Date(); System.out.println( d.getYear() + 1900 );
		 */

		/*
		 * [2] Calendar c = Calendar.getInstance(); System.out.println(
		 * c.get(Calendar.YEAR) );
		 */

		LocalDate d = LocalDate.now();
		int currentYear = d.getYear(); // 올해년도

		// int birthYear = Integer.parseInt(getBirthday(rrn).substring(0, 4));
		int birthYear = getYear(rrn);

		return currentYear - birthYear + 1;
	}

	public static int getYear(String rrn) {
		int century = getCentury(rrn);
		return Integer.parseInt(rrn.substring(0, 2)) + century;
	}

	public static int getMonth(String rrn) {
		return Integer.parseInt(rrn.substring(2, 4));
	}

	public static int getDay(String rrn) {
		return Integer.parseInt(rrn.substring(4, 6));
	}

	public static String getBirthday(String rrn) {

		int century = getCentury(rrn);
		int year = Integer.parseInt(rrn.substring(0, 2)) + century;
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));

		return String.format("%d년 %d월 %d일", year, month, day);
	}

	// 외국인 false 내국인 true
	public static boolean getNationality(String rrn) {
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);

		switch (gender) {
		case 5:
		case 6:
		case 7:
		case 8:
			return false;
		default:
			return true;
		}
	}

	public static int getCentury(String rrn) {
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);

		switch (gender) {
		case 9:
		case 0:
			return 1800;
		case 1:
		case 2:
		case 5:
		case 6:
			return 1900;
		default:
			return 2000;
		}

	}

	// 남자 : true, 여자 : false
	public static boolean getGender(String rrn) {
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);

		return gender % 2 == 1 ? true : false;

//		int gender = rrn.charAt(7) - '0';
//		
//		switch(gender) {
//		case 9: case 1: case 3: case 5: case 7:
//			return true;
//		default:
//			return false;
//		}
	}

	public static String getRrn(Scanner scanner) {
		String regex = "[0-9]{6}-[0-9]{7}";
		String rrn;

		do {
			System.out.print("> 주민등록번호 14자리 입력(예:000000-0000000): ");
			rrn = scanner.next();
		} while (!rrn.matches(regex));
		return rrn;
	}
}
