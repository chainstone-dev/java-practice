package days04;

import java.util.Scanner;

public class Ex07_02 {
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
		char grade = 'b';
		
		// 수 우 미 양 가 출력 switch문 사용
		switch (kor/10) {
		case 10:case 9:
			grade = '수';
			//break;
		case 8:
			grade = '우';
			//break;
		case 7:
			grade = '미';
			//break;
		case 6:
			grade = '양';
			//break;
		case 5:case 4:case 3:case 2:case 1:case 0:
			grade ='가';
			//break;
		} // switch
		
		System.out.println((kor>=0) ? (grade!='b' ? grade : "0~100까지만 허용") : "0~100까지 허용" );
	} // main
}
