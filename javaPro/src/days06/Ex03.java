package days06;

public class Ex03 {
	public static void main(String[] args) {
		// [for] 1~10=55

//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		} // for i
//		
//		System.out.println(sum);

		// [continue]

		// [while] 1~10=55

		int sum = 0;
		int k = 0;

		while (++k <= 10) {
			if (k % 2 == 0)
				continue;
			sum += k;
			System.out.printf("%d+", k);
		}

		System.out.printf("\b=%d", sum);
	} // main
}
