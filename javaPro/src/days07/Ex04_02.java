package days07;

public class Ex04_02 {
	public static void main(String[] args) {
//
//		System.out.println("[가로]");
//
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d*%d=%2d ", i, j, i * j);
//			} // for j
//			System.out.println();
//		} // for i
//
//		System.out.println();
//		System.out.println("[세로]");
//
//		for (int m = 1; m <= 9; m++) {
//			for (int n = 2; n <= 9; n++) {
//				System.out.printf("%d*%d=%2d ", n, m, n * m);
//			}
//			System.out.println();
//		}

		for (int k = 1; k <= 3; k++) {
			for (int m = 1; m <= 9; m++) {
				for (int n = 3*k-1; n <= 3*k-1+2 && n < 10; n++) {
					System.out.printf("%d*%d=%02d ", n, m, n * m);
				}
				System.out.println();
			}
			System.out.println();
		}

	} // main
}
