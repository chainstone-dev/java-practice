package days09;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		// 830412-1700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
		// 생년월일
		String birthday = getBirthday(rrn);
		System.out.println(birthday);
		
	} // main
	
	
	public static String getBirthday(String rrn) {
		int century = getCentury(rrn);
		
		int year = Integer.parseInt(rrn.substring(0,2)) + century;
		String month = rrn.substring(2, 4);
		String day = rrn.substring(4, 6);
		
		return String.format("%d년 %s월 %s일", year, month, day);
	}


	// 외국인 false 내국인 true
	public static boolean getNationality(String rrn) {
		String strGender = rrn.substring(7,8);
		int gender = Integer.parseInt(strGender);
		
		switch(gender) {
		case 5: case 6: case 7: case 8:
			return false;
		default:
			return true;
		}
	}

	public static int getCentury(String rrn) {
		String strGender = rrn.substring(7,8);
		int gender = Integer.parseInt(strGender);
		
		switch(gender) {
		case 9: case 0:
			return 1800;
		case 1: case 2: case 5: case 6:
			return 1900;
		default:
			return 2000;
		}
		
	}

	// 남자 : true, 여자 : false
	public static boolean getGender(String rrn) {
		String strGender = rrn.substring(7, 8);
		int gender = Integer.parseInt(strGender);
		
		return gender%2==1 ? true : false;
		
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
