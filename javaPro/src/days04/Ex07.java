package days04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		int n;
		String result = null;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력: ");
		n = sc.nextInt();
		
		switch (n%2) {
		case 0:
			result = "짝수";
			break;
			
		case 1:
			result = "홀수";
			break;
		} // switch
		
		System.out.println(result);
		

	} // main
}



//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		} // switch