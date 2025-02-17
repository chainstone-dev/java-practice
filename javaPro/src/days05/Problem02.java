package days05;

import java.util.Scanner;

public class Problem02 {
	   public static void main(String[] args) {
		      
		      @SuppressWarnings("resource")
		      Scanner sc = new Scanner(System.in);
		      
		      int[] player = { 0, 0, 0 };
		      int player_start = 0;
		      
		      int now = (int)(Math.random()*2)==1 ? 0 : 1;
		      int player_how_many = 1;

		      
		      while (true) {
		         if (now == 0) { // 플레이어 순서일 때
		            System.out.printf("플레이어는 숫자 개수를 입력하세요 (1~3): ");
		            player_how_many = sc.nextInt();
		            
		            System.out.printf("플레이어: ");
		            for(int i=0; i<player_how_many; i++) {
		               player[i] = sc.nextInt();
		               
		               if (player[i] == 31) {
		                  System.out.println("\n31도달, 컴퓨터의 승리");
		                  return;
		               }
		            }

		         } else { // com 순서일 때
		            int start = player[player_how_many-1]; // 컴퓨터가 어디서 부터 숫자를 세야하는지 정하기
		            int com_how_many = (int)(Math.random()*3) + 1; // 컴퓨터가 몇 개 입력할 지 정하기
		            
		            System.out.printf("컴퓨터: ");
		            for(int i=0; i<com_how_many; i++) {
		               System.out.printf("%d ", start+i+1);
		               if (i == com_how_many-1) {
		                  player_start = start+i+1;
		               }
		               
		               if (start+i+1 == 31) {
		                  System.out.println("\n31도달, 플레이어의 승리");
		                  return;
		               }
		               
		            }
		            System.out.println("\n");
		         }
		         now = (now+1)%2; // 순서 바꾸기
		      }
		      
		   } // main
}
