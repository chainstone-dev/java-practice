package days08;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 어떤 정수 입력 받고 약수 출력
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		
		System.out.printf("%d의 약수 - ", k);
		
		for(int i=1; i<=k/2; i++) {
			if(k%i==0) System.out.printf("%d ", i);
		}
		
		System.out.printf("%d",k);
		
	} // main
}
