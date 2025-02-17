package days04;

import java.util.Scanner;

public class Ex06_03 {
	public static void main(String[] args) {
		// [문제] if
		// 국어 점수를 입력 받아
		// 수/우/미/양/가 출력
		// 90~100, 80~89, 70~79, 60~69, 50~59

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int kor;
		
		System.out.print("국어 점수 입력: ");

//		
//		if (sc.hasNextInt()) {
//			kor = sc.nextInt();
//		} else {
//			System.out.println("입력은 정수만 허용합니다.");
//			return;
//		}

		if (!sc.hasNextInt()) {
			System.out.println("입력은 정수만 허용합니다.");
			return;
		}
		
		kor = sc.nextInt();
		
		if (kor<=100 && kor >= 90) {
			System.out.println("수");
		} else if (kor < 90 && kor >= 80) {
			System.out.println("우");
		} else if (kor < 80 && kor >= 70) {
			System.out.println("미");
		} else if (kor < 70 && kor >= 60) {
			System.out.println("양");
		} else if (kor <60 && kor>=0){
			System.out.println("가");
		} else {
			System.out.println("0점 이상 100점 이하 범위의 값만 허용됩니다.");
		}
	} // main
}
