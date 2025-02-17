package days05;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		//가위(1) 바위(2) 보(3) 본인의 직접 입력, cpu는 랜덤 [출력] com = ?, cpu = ? \n xx 승리
		Scanner sc = new Scanner(System.in);
		int user;
		int com;
		int resultIndex = 2;
		String[] result = {"user 승리", "com 승리", "무승부"};
		
		System.out.printf("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		
		if (sc.hasNextInt()) {
			user = sc.nextInt();
			if (!(user>=1 && user<=3)) {
				System.out.println("1, 2, 3 중 하나만 입력하세요");
				return;
			}
		} else {
			System.out.println("1, 2, 3 중 하나만 입력하세요");
			return;
		}
		

		com = (int)(Math.random()*3)+1;
		
		if (user == 1) {
			if (com == 2) resultIndex = 1;
			else if (com == 3) resultIndex = 0;
		} else if (user == 2) {
			if (com == 3) resultIndex = 1;
			else if (com == 1) resultIndex = 0;
		} else {
			if (com == 1) resultIndex = 1;
			else if(com == 2) resultIndex = 0;
		}
		
		System.out.printf("> com=%d, user=%d\n", com, user);
		System.out.println(result[resultIndex]);
		
	} // main
}
