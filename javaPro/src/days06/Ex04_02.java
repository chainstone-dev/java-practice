package days06;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		// [for] 두 정수(n, m)을 입력 받아서 두 정수 사이의 합을 출력
//		int n,m,sum=0;
//		Scanner sc = new Scanner(System.in);
//		int min = n > m ? : m : n;
//		int max = Math.max(n, m)
//		System.out.printf("n 입력: ");
//		n = sc.nextInt();
//		
//		System.out.printf("m 입력: ");
//		m = sc.nextInt();
//		
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		for (int i=n; i<=m; i++) {
//			if(i%2==1) {
//				System.out.printf("%d+", i);
//				sum += i;
//			}
//		}
//		
//		System.out.printf("\b=%d",sum);
//		sc.close();
		// [while]
		int n,m,sum=0,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("n 입력: ");
		n = sc.nextInt();
		
		System.out.printf("m 입력: ");
		m = sc.nextInt();
		
		if(n>m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		
		k = n-1;
		
		while(++k<=m) {
			System.out.printf("%d+", k);
			sum += k;
		}
		System.out.printf("\b=%d",sum);
		sc.close();
		
		
	} // main
}
