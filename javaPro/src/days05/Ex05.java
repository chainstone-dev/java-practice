package days05;

public class Ex05 {
	public static void main(String[] args) {
		// for 1+2+3...+10=55
		/*
		 * int sum = 0;
		 * 
		 * for (int i = 1; i <= 10; i++) { sum = sum + i; // if (i == 10) { //
		 * System.out.printf("%d", i); // } else { // System.out.printf("%d+", i); // }
		 * System.out.printf(i==10?"%d":"%d+", i); } // for i
		 * 
		 * System.out.printf("=%d", sum); // \b 사용
		 */
		int sum = 0;

//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.printf(i==10?"%d":"%d+", i);
//		} // for i

		// 상황에 따라 공백 가능
		int i = 10;
		for (;;) {
			if (i == 0)
				break;
			System.out.printf(i == 1 ? "%d" : "%d+", i);
			sum += i;
			i--;
		} // for i

		System.out.printf("=%d", sum);

	} // main
}
