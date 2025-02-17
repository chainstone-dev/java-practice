package days06;

public class Ex07 {
	public static void main(String[] args) {
		// 순서도 1~100 홀수합 (for, while)
		// ASCII + for문 출력..
		// 256가지 문자
		// 0~31 제어문자
		// 32~127 일반 문자
		
		for (int i = 0; i < 256; i++) {
			System.out.printf("[%d] %c\n",i,i);
		} // for i
	} // main
}
