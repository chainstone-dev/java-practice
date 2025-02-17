package days07;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("[세로]");

		for (int m = 1; m <= 9; m++) {
			for (int n = 2; n <= 9; n++) {
				if (n==5) break;
				System.out.printf("%d*%d=%2d ", n, m, n * m);
			}
			System.out.println();
		}
	} // main
}
