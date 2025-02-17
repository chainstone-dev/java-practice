package days05;

public class Ex07 {
	public static void main(String[] args) {
		// 자바에서 임의의 수를 발생시키는 코딩
		// 1. Math.random()
		// 2. Random 클래스
		
		// System.out.println(Math.abs(-10));
		
		// 0.0 <= double < 1.0
		
		// 중복문제
//		for (int i = 0; i < 6; i++) {
//			System.out.printf("%d ", (int)(Math.random()*45)+1);
//		} // for i
//		
//		System.out.println((int)(Math.random()*101));
		
		// 3~19
		System.out.println((int)(Math.random()*17)+3);

	} // main
}
