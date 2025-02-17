package days09;

public class DailyTest {
	public static void main(String[] args) {
		int sum = 0;
		boolean[] prime = new boolean[101];
		
		eratostenes(prime);
		
		for(int i=1; i<=100; i++) {
			if (!primeCheck(i, prime)) {
				System.out.printf("%d+", i);
				sum += i;
			}
		}
		
		int[] answer = {};
		
		System.out.printf("\b=%d", sum);
	} // main
	
	public static boolean primeCheck(int n, boolean[] arr) {
		return arr[n];
	}

	public static void eratostenes(boolean[] arr) {
		arr[1] = true;

		for (int i = 2; i<Math.sqrt(arr.length); i++) {
			if (arr[i] == false) {
				for(int j=i*i; j<arr.length; j+=i) {
					arr[j] = true;
				}
			}
		}
	}
	
	
}
