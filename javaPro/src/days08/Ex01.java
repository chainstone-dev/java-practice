package days08;

public class Ex01 {
	public static void main(String[] args) {
//		int answer = 0;
//		int a = 1;
//		int k = 1;
//		
//		while(a<=100) {
//			System.out.printf("%d+", a);
//			answer += a;
//			
//			a=a+k;
//			k++;
//		}
//		System.out.printf("\b=%d", answer);
		
		int sum = 0;
		int term = 1;
		int inc = 1;
		
		while(term<=100) {
			System.out.printf("%d+",term);
			sum += term;
			term += inc++;
		}
		
		System.out.printf("\b=%d", sum);
	} // main
}
