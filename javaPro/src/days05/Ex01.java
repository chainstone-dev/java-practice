package days05;

public class Ex01 {
	public static void main(String[] args) {
		// 배열은 초기화하지 않으면 그 자료형의 기본값으로 초기화 되어져 있다.
		// int -> 0, double -> 0/0, String -> null, boolean -> false, char -> 널문자 \u0000
		
		int[] kors = new int[3];
		// 배열 초기화 = int[] kors = { a, a, a };
		kors[0] = 89;
		kors[1] = 34;
		kors[2] = 66;
		
		int upperBound = kors.length-1;
		
		for (int i = 0; i <= upperBound; i++) {
			System.out.printf("kors[%d]=%d\n", i, kors[i]);
		} // for i
	} // main
}
