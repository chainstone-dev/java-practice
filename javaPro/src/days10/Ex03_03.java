package days10;

public class Ex03_03 {
	public static void main(String[] args) {
		// 별 찍기 - 3
		// ****
		// ***
		// **
		// *

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	} // main
}
