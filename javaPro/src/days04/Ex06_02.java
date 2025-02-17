package days04;

import java.util.Scanner;

public class Ex06_02 {
	public static void main(String[] args) {
		int n;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		n = sc.nextInt();
		
//		if (n%2==0) {
//			System.out.println("짝수");
//		}
//		
//		if (n%2!=0) {
//			System.out.println("홀수");
//		}
		
		if (n%2 ==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	} // main
}
