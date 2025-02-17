package days08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int x, y, result;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> x, y 입력: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		result = sum(x,y);
		// 두 정수의 합을 반환하는 sum() 메소드 -> 호출
		System.out.println(result);
	} // main
	
	public static int sum(int a, int b) {
		return a+b;
	}
}
