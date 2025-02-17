package days07;

public class Ex04 {
	public static void main(String[] args) {
		// 구구단 출력
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d*%d=%2d ", i,j,i*j);
			} // for j
			System.out.println();
		} // for i
	} // main
}
