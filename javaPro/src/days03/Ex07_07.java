package days03;

public class Ex07_07 {
	public static void main(String[] args) {
		// 증감연산자
		// [문제] 어떤 기억공간의 값을 1 증가 시키는 코딩
		int x = 10;
		// x=11;
		// 1) x = x + 1;
		// 2) x += 1;
		
		int y = ++x;
		y = x++;
		System.out.println(y);
	}
}
