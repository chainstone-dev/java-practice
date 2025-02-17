package days10;

import java.util.Scanner;

public class Ex03_06 {
	public static void main(String[] args) {
		// 별 찍기 - 6 (이등변 삼각형)
		//    *
		// 
		// 
		// 
		// 행의 개수를 입력받아서 이등변 삼각형
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		
		System.out.printf("> 행 갯수: ");
		int row = scanner.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<(row-1)-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}

	} // main
}
