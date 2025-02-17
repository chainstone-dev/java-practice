package days08;

import java.io.IOException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws IOException {
		String name;
		byte kor;
		byte eng;
		byte math;
		short total;
		
		double avg;

		Scanner scanner = new Scanner(System.in);
		
		name = getName(scanner);
		kor = getScore(scanner, "국어");
		eng = getScore(scanner, "영어");
		math = getScore(scanner, "수학");
		
		
		total = getTotal(kor,eng,math);
		
		avg = getAvg(total);
		
		printScore(name, kor, eng, math, total, avg);

	} // main
	
	public static void printScore(String name, byte kor, byte eng, byte math, short total, double avg) {
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f", name,
				 kor, eng, math, total, avg);
	}

	public static double getAvg(short total) {
		return (double)total / 3;
	}

	public static short getTotal(byte kor, byte eng, byte math) {
		return (short) (kor+eng+math);
	}

	public static byte getScore(Scanner scanner, String subject) {
		
		byte score;
		String scoreString;
		// String regex = "[0-9]{1,3}";
		String regex = "^(100|[1-9]?\\d)$";
		boolean isFirst = false;
		do {
			if (isFirst) {
				System.out.print("[다시] ");
			}
			System.out.printf(">%s 점수 입력: ", subject);
			scoreString = scanner.next();	
			isFirst = true;
		} while(!scoreString.matches(regex));

		score = Byte.parseByte(scoreString);

		return score;
	}
	
	public static String getName(Scanner scanner) {
		System.out.print("> 이름 입력: ");
		String name = scanner.next();
		return name;
	}
}
