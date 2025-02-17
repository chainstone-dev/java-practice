package days10;

public class Ex03_02 {
	public static void main(String[] args) {
		// 별 찍기 - 2
		// *
		// **
		// ***
		// ****

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	} // main
}
