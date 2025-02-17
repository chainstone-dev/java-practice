package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06_02 {
	public static void main(String[] args) throws IOException {
		// type convert (형 변환)
		// 1) 자동 형 변환
		// 2) 강제 형 변환
		
		// [문제] 이름, 국어, 영어, 수학 점수 입력..
		// 총점
		// 평균
		// <출력>
		// // 이름="홍길동", 국어=90, 영어=89, 수학=77, 총점=256, 평균=85.33
		
		String name;
		byte kor;
		byte eng;
		byte math;
		short total;
		
		double avg;
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.print("이름 입력: "); name = br.readLine();
		 * 
		 * System.out.print("국어 점수 입력: "); kor = Byte.parseByte(br.readLine());
		 * 
		 * System.out.print("영어 점수 입력: "); eng = Byte.parseByte(br.readLine());
		 * 
		 * System.out.print("수학 점수 입력: "); math = Byte.parseByte(br.readLine());
		 * 
		 * total = (short)(kor+eng+math);
		 * 
		 * avg = (double)total / 3;
		 * 
		 * System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%.2f", name,
		 * kor, eng, math, total, avg);
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력: ");
		name = br.readLine();
		
		System.out.print("국어 점수 입력: ");
		kor = Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수 입력: ");
		eng = Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수 입력: ");
		math = Byte.parseByte(br.readLine());
		
		total = (short) (kor+eng+math);
		
		avg = (double)total / 3;
		
		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f", name,
				 kor, eng, math, total, avg);
		
		
	}
}
