package days06;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		int sum = 0,n;
		Scanner sc = new Scanner(System.in);
//		System.out.print("> 양의 정수(n) 입력 ? ");
		
//		
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.printf("%d+", i);
//			sum += i;
//		} // for i
//		
//		System.out.printf("\b=%d\n", sum);
//		
		
		int sum = 0, i = 0, n;
		n = sc.nextInt();
		while(++i<=n) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("\b=%d\n", sum);
	} // main
}
