package days05;

public class Ex04 {
	public static void main(String[] args) {
		//int sum = 0;
		
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//		} // for i
		
		// 조건 반복문 : condition 이 참일 동안 {} 블럭을 실행하는 반복문
		/*
		 * while () {
		 * 
		 * } // while
		 * 
		 * do {
		 * 
		 * } while ();
		 */
		
		
		int sum = 0, i = 0;
		
		while(++i <=10) {
			System.out.printf("%d+", i);
			sum += i; // 2+3=5
			// i++;
		}
		
		System.out.printf("=%d",sum);
	} // main
}
