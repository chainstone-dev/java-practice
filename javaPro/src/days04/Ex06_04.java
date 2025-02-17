package days04;

import java.util.Scanner;

public class Ex06_04 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int kor;
		
		System.out.print("국어 점수 입력: ");
		
		if (!sc.hasNextInt()) {
			System.out.println("입력은 정수만 허용합니다.");
			return;
		}
		
		kor = sc.nextInt();
		char grade = '수';
		if (kor<=100 && kor >= 90) {
			grade = '수';
		} else if (kor < 90 && kor >= 80) {
			grade = '우';
		} else if (kor < 80 && kor >= 70) {
			grade = '미';
		} else if (kor < 70 && kor >= 60) {
			grade = '양';
		} else if (kor <60 && kor>=0){
			grade = '가';
		} else {
			System.out.println("0점 이상 100점 이하 범위의 값만 허용됩니다.");
		}
		
		System.out.println(grade);
	} // main
}
