package days04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// BufferedReader br 키보드로부터 입력...
		// Scanner
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("정수 n 입력: ");
		 * 
		 * int n = sc.nextInt();
		 * 
		 * System.out.println(n);
		 */
		
		String name;
		byte kor;
		byte eng;
		byte math;
		short total;
		
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 국어 영어 수학 입력: ");
		
//		name = sc.next();
//		kor = sc.nextByte();
//		eng = sc.nextByte();
//		math = sc.nextByte();
//		
//		total = (short) (kor+eng+math);
//		
//		avg = (double)total / 3;
//		
//		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f", name,
//				 kor, eng, math, total, avg);
		
		name = sc.nextLine();
		
		System.out.println(name);
	}
}
