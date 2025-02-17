package days06;

import java.util.Scanner;

public class Ex04_05 {
	public static void main(String[] args) {
		// 세정수를 입력 받아서 세정수 중에 가장 큰값 작은값 구해서 출력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min, max;
		
		min = Math.min(Math.min(a, b), c);
		max = Math.max(Math.max(a, b), c);

		System.out.printf("min : %d, max : %d", min, max);
		sc.close();
	} // main
}
