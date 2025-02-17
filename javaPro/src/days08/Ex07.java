package days08;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		fillLotto(lotto);
		displayLotto(lotto);

//		int index = 0, n;
//		lotto[index++] = (int) (Math.random() * 45) + 1;
//		// 1
//		while (index <= 5) {
//			n = (int) (Math.random() * 45) + 1;

//			if (!flag)
//				lotto[index++] = n;
//		} // while

	}

	private static void fillLotto(int[] lotto) {
		int index = 0, n;
		lotto[index++] = getRandomInteger(1, 45);
		
		while (index<=5) {
			n = getRandomInteger(1, 45);
			
			if(!isDuplicateLotto(lotto,n,index)) 
				lotto[index++] = n;
		}
	}

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {
		boolean flag = false;
		
		for (int i = 0; i < index; i++) {
			if (lotto[i] == n) {
				flag = true;
				break;
			}
		} // for i
			// flag == false !flag
		return flag;
	}

	public static int getRandomInteger(int min, int max) {
		return  (int) (Math.random() * (max-min)+1) + min;
	}

	private static void displayLotto(int[] lotto) {
		System.out.print("1게임: ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d]",lotto[i]);
		} // for i
		System.out.println();
		
	}
}
