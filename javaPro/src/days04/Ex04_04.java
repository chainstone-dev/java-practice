package days04;

import java.util.Scanner;

public class Ex04_04 {
	// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
    // (출력형식)
    // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		byte age = sc.nextByte();
//		double height = sc.nextDouble();
//		boolean gender = sc.nextBoolean();
//		
//		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender ? "남자":"여자");
		
		String name;
		byte age;
		
		double height;
		boolean gender;
		

		System.out.print("이름 나이 키 성별 입력: ");
		Scanner sc = new Scanner(System.in).useDelimiter(",|(\r\n)");
		name = sc.next().trim();
		age = sc.nextByte();
		height = sc.nextDouble();
		gender = sc.nextBoolean();
		
		sc.close();
		
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender ? "남자" : "여자");
		
		// 콤마로 구분자
	}

}
