package days07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		// 게임 계속 여부? y
		int com, user;
		Scanner scanner = new Scanner(System.in);
		char a;
		int comWin = 0, userWin = 0;
		int count = 0;
		boolean isFirst = false;
		String tmp;
		
		String[] numToString = {"", "가위", "바위", "보" };

		do {
			com = (int) (Math.random() * 3) + 1;
			isFirst = false;
			do {
				// [알림] 1~3 정수를 다시 입력!!!
				if (isFirst && count<3) {
					
					count++;
					
					if(count==3) {
						System.out.printf("[알림] 실패횟수:%d \n 프로그램 종료!!!\n", count);
						// break;
						return;
					}
					System.out.printf("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!\n", count);            
				} // if

				isFirst = true;
					
				System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
				tmp = scanner.next();
				// } while (  user != 1 && user !=2 && user != 3 ); 
			} while (  !(tmp.matches("[1-3]")) );

			
			user = Integer.parseInt(tmp);
			
			System.out.printf("> com=%s, user=%s\n", numToString[com], numToString[user]);

			// 승자 판단해서 출력...
			switch (user - com) {
			case 0:
				System.out.println("무승부");
				break;
			case 1:
			case -2:
				System.out.println("사용자 승리");
				userWin++;
				break;
			case -1:
			case 2:
				System.out.println("컴퓨터 승리");
				comWin++;
				break;
			} // switch

			System.out.printf("com: %d, user: %d\n", comWin, userWin);

			if (comWin == 3) {
				System.out.println("컴퓨터 승리, 종료합니다");
				break;
			} else if (userWin == 3) {
				System.out.println("유저 승리, 종료합니다");
				break;
			}

			System.out.print("\n게임 계속합니까? ");

			a = (char) System.in.read();
		} while (a == 'y' || a == 'Y');

	} // main
}
