package days06;

import java.util.Scanner;

public class Ex07_02 {
	public static void main(String[] args) {
		// [문제] 한 라인에 10개의 ASCII
		Scanner sc = new Scanner(System.in);

		for (int i = 0, lineNumber = 1; i < 256; i++) {

			int line = i / 10 + 1;

			if (i % 10 == 0)
				System.out.printf("%d:", lineNumber++);

			System.out.printf("[%c]", (char) i);

			if (i % 10 == 9) {
				System.out.println();
				if (lineNumber++ % 5 == 0) {
					System.out.println("계속하려면 엔터");
					sc.nextLine();
				}
			}

		} // for i

		// 마지막 라인 : 6 [][][][][][]
		// 개행 코딩
	} // main
}
