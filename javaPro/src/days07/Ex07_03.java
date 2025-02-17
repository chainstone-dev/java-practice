package days07;

import java.util.Scanner;

public class Ex07_03 {
	public static void main(String[] args) {
		// 사용자의 가위 바위 보 입력값에 대한 유효성 검사...
		// 1 ~ 3
		int user;
		Scanner scanner = new Scanner(System.in);

		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		user = scanner.nextInt();

		System.out.printf("> user=%d\n", user);

	} // main

}
